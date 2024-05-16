package Actions;

import Game_components.Result;
import Game_components.Human;
import Game_components.Player;
import Game_components.Items;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import Particular_Actions.Action;
import Particular_Actions.Block;
import Particular_Actions.Debuff;
import Particular_Actions.Heal;
import Particular_Actions.Hit;

public class Fight {

    ChangeTexts change = new ChangeTexts();
    public ArrayList<Action> actionsList = new ArrayList<>() {
        {
            add(new Hit());
            add(new Block());
            add(new Debuff());
            add(new Heal());
        }
    };
    public int i = 1;

    public void Move(Player enemy, Player human, JLabel PlayerActionLabel, JLabel EnemyActionLabel, Action enemyAction, Action playerAction, Mediator mediator) {
        mediator.setActionLabels(enemy, human, enemyAction, playerAction);
        playerAction.realisation(human, enemy, enemyAction.getType());
    }

    public void checkDebuff(Player human, Player enemy, Mediator mediator) {
        if (!enemy.isDebuffed()) {
            mediator.setDebuffLabel(enemy, false);
        }
        if (enemy.isDebuffed()) {
            mediator.setDebuffLabel(enemy, true);
            enemy.loseDebuffTurn();
        }
        if (!human.isDebuffed()) {
            mediator.setDebuffLabel(human, false);
        }
        if (human.isDebuffed()) {
            mediator.setDebuffLabel(enemy, true);
            human.loseDebuffTurn();
        }

    }

    public void Hit(Human human, Player enemy, int a, JLabel label,
            JLabel label2, JDialog dialog, JLabel label3,
            JProgressBar pr1, JProgressBar pr2, JDialog dialog1,
            JDialog dialog2, JFrame frame, ArrayList<Result> results, JLabel EnemyDebuffLabel,
            JLabel victoryLabel, JLabel EndGameWithoutLadderTitlleLabel, JLabel PlayerActionLabel, JLabel PlayerDebuffLabel,
            JLabel EnemyActionLabel, Items[] items, JRadioButton rb, Location location, int locationsNumber, Player[] enemiesList, Mediator mediator) {
        CharacterAction action = new CharacterAction();
        Action enemyAction = action.ChooseEnemyAction(enemy, new ArrayList<>(actionsList));
        switch (a) {
            case 0 -> {
                Move(enemy, human, PlayerActionLabel, EnemyActionLabel, enemyAction,
                        actionsList.get(1), mediator);
                if (enemy.getHealth() > 0) {
                    Move(human, enemy, EnemyActionLabel, PlayerActionLabel, actionsList.get(1), enemyAction, mediator);
                }
            }
            case 1 -> {
                Move(enemy, human, PlayerActionLabel, EnemyActionLabel, enemyAction, actionsList.get(0), mediator);
                if (enemy.getHealth() > 0) {
                    Move(human, enemy, PlayerActionLabel, EnemyActionLabel, actionsList.get(0),
                            enemyAction, mediator);
                }
            }
            case 2 -> {
                Move(enemy, human, PlayerActionLabel, EnemyActionLabel, enemyAction, actionsList.get(2), mediator);
                if (enemy.getHealth() > 0) {
                    Move(human, enemy, PlayerActionLabel, EnemyActionLabel,actionsList.get(2),
                            enemyAction, mediator);
                }
            }
        }
        mediator.roundTexts(human, enemy);
        checkDebuff(human, enemy, mediator);
        action.HP(human, pr1);
        action.HP(enemy, pr2);
        checkDeath(human, enemy, label2, dialog, label3, pr1, dialog1, dialog2, frame, results, victoryLabel, EndGameWithoutLadderTitlleLabel,
                PlayerActionLabel, items, rb, location, locationsNumber, enemiesList);
    }

    public void checkDeath(Human human, Player enemy, JLabel label2, JDialog dialog, JLabel label3,
            JProgressBar pr1, JDialog dialog1, JDialog dialog2, JFrame frame, ArrayList<Result> results,
            JLabel label4, JLabel label5, JLabel label7, Items[] items, JRadioButton rb, Location location, int locationsNumber, Player[] enemiesList) {
        CharacterAction action = new CharacterAction();
        if (human.getHealth() <= 0 & items[2].getCount() > 0) {
            human.setHealth((int) (human.getMaxHealth() * 0.05));
            items[2].setCount(-1);
            action.HP(human, pr1);
            label2.setText(human.getHealth() + "/" + human.getMaxHealth());
            rb.setText(items[2].getName() + ", " + items[2].getCount() + " шт");
            label7.setText("Вы воскресли");
        }
        if (human.getHealth() <= 0 | enemy.getHealth() <= 0) {
            if (location.getCurrentLocation() == locationsNumber & "Shao Kahn".equals(enemy.getName())) {
                location.resetLocation(false, i);
                EndFinalRound(((Human) human), enemy, action, results, dialog1, dialog2,
                        frame, label4, label5,enemiesList);
            } else {
                EndRound(human, enemy, dialog, label3, items, location, enemiesList);
            }
        }
    }

    public void EndRound(Human human, Player enemy, JDialog dialog, JLabel label, Items[] items, Location location, Player[] enemiesList) {
        CharacterAction action = new CharacterAction();
        dialog.setVisible(true);
        dialog.setBounds(300, 150, 700, 600);
        if (human.getHealth() > 0) {
            label.setText("You win");
            if ("Shao Kahn".equals(enemy.getName())) {
                action.AddItems(38, 23, 8, items);
                action.AddPointsBoss(human);
                location.resetLocation(true, human.getLevel());
            } else {
                action.AddItems(25, 15, 5, items);
                action.AddPoints(human);
            }
        } else {
            reset(human, enemy, location, enemiesList);
            label.setText(enemy.getName() + " win");

        }
    }

    public void reset(Human human, Player enemy, Location location, Player[] enemiesList) {
        CharacterAction action = new CharacterAction();
        human.setDamage(16);
        human.setHealth(80);
        human.setMaxHealth(80);
        action.resetEnemies(enemiesList);
        human.setLevel(0);
        human.resetPoints();
        human.resetExperience();
        human.setNextExperience(40);
        location.setFullEnemiesList(enemiesList);
        location.resetLocation(false, human.getLevel());
    }

    public void EndFinalRound(Human human, Player enemy, CharacterAction action,
            ArrayList<Result> results, JDialog dialog1, JDialog dialog2, JFrame frame,
            JLabel label1, JLabel label2, Player[] enemiesList) {
        action.resetEnemies(enemiesList);
        String text = "Победа не на вашей стороне";
        if (human.getHealth() > 0) {
            action.AddPoints(human);
            text = "Победа на вашей стороне";
        }
        boolean top = false;
        if (results == null) {
            top = true;
        } else {
            int a = 0;
            for (int j = 0; j < results.size(); j++) {
                if (human.getPoints() < results.get(j).getPoints()) {
                    a++;
                }
            }
            if (a < 10) {
                top = true;
            }
        }
        if (top) {
            dialog1.setVisible(true);
            dialog1.setBounds(150, 150, 600, 500);
            label1.setText(text);
        } else {
            dialog2.setVisible(true);
            dialog2.setBounds(150, 150, 470, 360);
            label2.setText(text);
        }
        frame.dispose();
    }

    public void NewRound(Player human, Player enemy, JProgressBar pr1,
            JProgressBar pr2) {
        pr1.setMaximum(human.getMaxHealth());
        pr2.setMaximum(enemy.getMaxHealth());
        human.setHealth(human.getMaxHealth());
        enemy.setHealth(enemy.getMaxHealth());
        CharacterAction action = new CharacterAction();
        action.HP(human, pr1);
        action.HP(enemy, pr2);
    }

}
