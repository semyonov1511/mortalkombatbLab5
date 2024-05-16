package Actions;

import Game_components.Result;
import Game_components.Human;
import Game_components.Player;
import Game_components.Items;
import java.util.ArrayList;
import javax.swing.JProgressBar;
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

    public void Move(Player enemy, Player human, Action enemyAction, Action playerAction, Mediator mediator) {
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

    public void Hit(Human human, Player enemy, int a, ArrayList<Result> results, Items[] items,
            Location location, int locationsNumber, Player[] enemiesList, Mediator mediator) {
        CharacterAction action = new CharacterAction();
        Action enemyAction = action.ChooseEnemyAction(enemy, new ArrayList<>(actionsList));
        switch (a) {
            case 0 -> {
                Move(enemy, human, enemyAction,
                        actionsList.get(1), mediator);
                if (enemy.getHealth() > 0) {
                    Move(human, enemy, actionsList.get(1), enemyAction, mediator);
                }
            }
            case 1 -> {
                Move(enemy, human, enemyAction, actionsList.get(0), mediator);
                if (enemy.getHealth() > 0) {
                    Move(human, enemy, actionsList.get(0),
                            enemyAction, mediator);
                }
            }
            case 2 -> {
                Move(enemy, human, enemyAction, actionsList.get(2), mediator);
                if (enemy.getHealth() > 0) {
                    Move(human, enemy, actionsList.get(2),
                            enemyAction, mediator);
                }
            }
        }
        mediator.roundTexts(human, enemy);
        checkDebuff(human, enemy, mediator);
        mediator.setHealthBar(human);
        mediator.setHealthBar(enemy);
        checkDeath(human, enemy, results, items, location, locationsNumber, enemiesList, mediator);
    }

    public void checkDeath(Human human, Player enemy, ArrayList<Result> results,
            Items[] items, Location location, int locationsNumber, Player[] enemiesList, Mediator mediator) {
        CharacterAction action = new CharacterAction();
        if (human.getHealth() <= 0 & items[2].getCount() > 0) {
            human.setHealth((int) (human.getMaxHealth() * 0.05));
            items[2].setCount(-1);
            mediator.setHealthBar(human);
            mediator.revive(human, items);
        }
        if (human.getHealth() <= 0 | enemy.getHealth() <= 0) {
            if (location.getCurrentLocation() == locationsNumber & "Shao Kahn".equals(enemy.getName())) {
                location.resetLocation(false, i);
                EndFinalRound(((Human) human), enemy, results, enemiesList, mediator);
            } else {
                EndRound(human, enemy, items, location, enemiesList, mediator);
            }
        }
    }

    public void EndRound(Human human, Player enemy, Items[] items, Location location, Player[] enemiesList, Mediator mediator) {
        CharacterAction action = new CharacterAction();
        mediator.setEndFightDialog();
        if (human.getHealth() > 0) {
            mediator.setRoundEndText("You win");
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
            mediator.setRoundEndText(enemy.getName() + " win");

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

    public void EndFinalRound(Human human, Player enemy, ArrayList<Result> results, Player[] enemiesList, Mediator mediator) {
        CharacterAction action = new CharacterAction();
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
        mediator.gameEnding(text, top);
    }

    public void NewRound(Player human, Player enemy, Mediator mediator) {
        mediator.setNewRoundHealthBars(human, enemy);
        human.setHealth(human.getMaxHealth());
        enemy.setHealth(enemy.getMaxHealth());
        mediator.setHealthBar(human);
        mediator.setHealthBar(enemy);
    }

}
