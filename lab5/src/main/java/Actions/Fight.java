package Actions;

import Game_components.Result;
import Game_components.Human;
import Game_components.Player;
import Game_components.Items;
import java.util.ArrayList;
import Particular_Actions.Action;
import Particular_Actions.Block;
import Particular_Actions.Debuff;
import Particular_Actions.Heal;
import Particular_Actions.Hit;

public class Fight {
    Mediator mediator;
    Human human;
    Player enemy;
    public Location location = new Location();
    public ArrayList<Action> actionsList = new ArrayList<>() {
        {
            add(new Hit());
            add(new Block());
            add(new Debuff());
            add(new Heal());
        }
    };

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    
    public void setHuman(Human human) {
        this.human = human;
    }

    public void setEnemy(Player enemy) {
        this.enemy = enemy;
    }

    public Human getHuman() {
        return this.human;
    }

    public Player getEnemy() {
        return this.enemy;
    }

    public void playerMove(Action enemyAction, Action playerAction) {
        mediator.setActionLabels(enemy, human, enemyAction, playerAction);
        playerAction.realisation(human, enemy, enemyAction.getType());
    }

    public void enemyMove(Action enemyAction, Action playerAction) {
        mediator.setActionLabels(human, enemy, enemyAction, playerAction);
        playerAction.realisation(enemy, human, enemyAction.getType());
    }

    public void checkDebuff(Player human, Player enemy) {
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

    public void hit(int a, ArrayList<Result> results, Items[] items,
            Location location, int locationsNumber, Player[] enemiesList) {
        MidGameActions action = new MidGameActions();
        Action enemyAction = action.chooseEnemyAction(enemy, new ArrayList<>(actionsList));
        switch (a) {
            case 0 -> {
                playerMove(enemyAction,
                        actionsList.get(1));
                if (enemy.getHealth() > 0) {
                    enemyMove(actionsList.get(1), enemyAction);
                }
            }
            case 1 -> {
                playerMove(enemyAction, actionsList.get(0));
                if (enemy.getHealth() > 0) {
                    enemyMove(actionsList.get(0),
                            enemyAction);
                }
            }
            case 2 -> {
                playerMove(enemyAction, actionsList.get(2));
                if (enemy.getHealth() > 0) {
                    enemyMove(actionsList.get(2),
                            enemyAction);
                }
            }
        }
        mediator.setRoundTexts(human, enemy);
        checkDebuff(human, enemy);
        mediator.setHealthBar(human);
        mediator.setHealthBar(enemy);
        checkDeath(results, items, location, locationsNumber, enemiesList);
    }

    public void checkDeath(ArrayList<Result> results,
            Items[] items, Location location, int locationsNumber, Player[] enemiesList) {
        if (human.getHealth() <= 0 & items[2].getCount() > 0) {
            human.setHealth((int) (human.getMaxHealth() * 0.05));
            items[2].setCount(-1);
            mediator.setHealthBar(human);
            mediator.revive(human, items);
        }
        if (human.getHealth() <= 0 | enemy.getHealth() <= 0) {
            if (location.getCurrentLocation() == locationsNumber & "Shao Kahn".equals(enemy.getName())) {
                location.resetLocation(false, 1);
                endFinalRound(results, enemiesList);
            } else {
                endRound(items, location, enemiesList);
            }
        }
    }

    public void endRound(Items[] items, Location location, Player[] enemiesList) {
        MidGameActions action = new MidGameActions();
        mediator.setEndFightDialog();
        if (human.getHealth() > 0) {
            mediator.setRoundEndText("You win");
            if ("Shao Kahn".equals(enemy.getName())) {
                action.addItems(38, 23, 8, items);
                action.addPointsBoss(human);
                location.resetLocation(true, human.getLevel());
            } else {
                action.addItems(25, 15, 5, items);
                action.addPoints(human);
            }
        } else {
            reset(location, enemiesList);
            mediator.setRoundEndText(enemy.getName() + " win");

        }
    }

    public void reset(Location location, Player[] enemiesList) {
        MidGameActions action = new MidGameActions();
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

    public void endFinalRound(ArrayList<Result> results, Player[] enemiesList ) {
        MidGameActions action = new MidGameActions();
        action.resetEnemies(enemiesList);
        String text = "Победа не на вашей стороне";
        if (human.getHealth() > 0) {
            action.addPoints(human);
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

    public void newRound() {
        mediator.setPlayerMaxHealthBar(human);
        mediator.setEnemyMaxHealthBar(enemy);
        human.setHealth(human.getMaxHealth());
        enemy.setHealth(enemy.getMaxHealth());
        mediator.setHealthBar(human);
        mediator.setHealthBar(enemy);
    }

}
