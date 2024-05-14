package Actions;

//ADD IMAGE!!!
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
import Fabrics.*;
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
    int experiences[] = {40, 90, 180, 260, 410};
    EnemyFabric fabric = new EnemyFabric();
    public int i = 1;
    int k = -1;
    int stun = 0;
    double v = 0.0;

    public void Move(Player human, Player enemy, JLabel l1, JLabel l2, Action playerAction, Action enemyAction) {
        playerAction.realisation(human, enemy, enemyAction.getType());
    }

    public void Hit(Player human, Player enemy, int a, JLabel label,
            JLabel label2, JDialog dialog, JLabel label3,
            JProgressBar pr1, JProgressBar pr2, JDialog dialog1,
            JDialog dialog2, JFrame frame, ArrayList<Result> results,
            JLabel label4, JLabel label5, JLabel label6, JLabel label7,
            JLabel label8, Items[] items, JRadioButton rb, Location location, int locationsNumber) {
        label7.setText("");
        CharacterAction action = new CharacterAction();
        switch (a) {
            case 0 -> {
                Move(human, enemy, label7, label8, actionsList.get(1), action.ChooseEnemyAction(enemy, new ArrayList<>(actionsList)));
                if (enemy.getHealth()>0){
                    Move(enemy, human, label7, label8, action.ChooseEnemyAction(enemy, new ArrayList<>(actionsList)),actionsList.get(1));
                }
            }
            case 1 -> {
                Move(human, enemy, label7, label8, new Hit(), action.ChooseEnemyAction(enemy, new ArrayList<>(actionsList)));
                if (enemy.getHealth()>0){
                    Move(enemy, human, label7, label8, action.ChooseEnemyAction(enemy, new ArrayList<>(actionsList)), new Hit());
                }
            }
        }
        change.RoundTexts(human, enemy, label, label2, i, label6);
        action.HP(human, pr1);
        action.HP(enemy, pr2);
        if (human.getHealth() <= 0 & items[2].getCount() > 0) {
            human.setNewHealth((int) (human.getMaxHealth() * 0.05));
            items[2].setCount(-1);
            action.HP(human, pr1);
            label2.setText(human.getHealth() + "/" + human.getMaxHealth());
            rb.setText(items[2].getName() + ", " + items[2].getCount() + " шт");
            label7.setText("Вы воскресли");
        }
        if (human.getHealth() <= 0 | enemy.getHealth() <= 0) {
            if (location.getCurrentLocation() == locationsNumber & "Shao Kahn".equals(enemy.getName())) {
                EndFinalRound(((Human) human), enemy, action, results, dialog1, dialog2,
                        frame, label4, label5);
            } else {
                EndRound(human, enemy, dialog, label3, items, location);
            }
        }
    }

    public void EndRound(Player human, Player enemy, JDialog dialog, JLabel label, Items[] items, Location location) {
        CharacterAction action = new CharacterAction();
        dialog.setVisible(true);
        dialog.setBounds(300, 150, 700, 600);
        if (human.getHealth() > 0) {
            label.setText("You win");
            ((Human) human).setWin();

            if ("Shao Kahn".equals(enemy.getName())) {
                action.AddItems(38, 23, 8, items);
                action.AddPointsBoss(((Human) human));
                location.resetLocation(true, human.getLevel());
            } else {
                action.AddItems(25, 15, 5, items);
                action.AddPoints(((Human) human));
            }
        } else {
            human.resetDamage();
            human.setDamage(16);
            human.setNewHealth(80);
            human.resetMaxHealth(80);
            action.setEnemies();
            human.resetLevel();
            ((Human) human).resetPoints();
            ((Human) human).resetExperience();
            ((Human) human).setNextExperience(40);
            location.resetLocation(false, human.getLevel());
            label.setText(enemy.getName() + " win");
        }

        i = 1;
        k = -1;
    }

    public void EndFinalRound(Human human, Player enemy, CharacterAction action,
            ArrayList<Result> results, JDialog dialog1, JDialog dialog2, JFrame frame,
            JLabel label1, JLabel label2) {
        action.setEnemies();
        String text = "Победа не на вашей стороне";
        if (human.getHealth() > 0) {
            human.setWin();
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

    public int[] ResetAttack() {
        int a[] = {0};
        return a;
    }

    public void NewRound(Player human, Player enemy, JProgressBar pr1,
            JProgressBar pr2) {
        pr1.setMaximum(human.getMaxHealth());
        pr2.setMaximum(enemy.getMaxHealth());
        human.setNewHealth(human.getMaxHealth());
        enemy.setNewHealth(enemy.getMaxHealth());
        CharacterAction action = new CharacterAction();
        action.HP(human, pr1);
        action.HP(enemy, pr2);
    }

}
