package Actions;

import Game_components.Human;
import Game_components.Player;
import Game_components.Items;
import Particular_Actions.*;
import java.util.ArrayList;

public class MidGameActions {

    private final int experience_for_next_level[] = {40, 90, 180, 260, 410, 1000};

    public Action chooseEnemyAction(Player enemy, ArrayList<Action> list) {
        switch (enemy.getName()) {
            case "Sub-Zero" -> {
                return list.get((int) (Math.random() * 3));
            }
            case "Shao Kahn" -> {
                list.remove(2);
                return list.get((int) (Math.random() * 3));
            }
            default -> {
                return list.get((int) (Math.random() * 2));
            }
        }
    }

    public void addPoints(Human human) {
        human.setExperience(20+5*human.getLevel());
        human.setPoints(20+5*human.getLevel()+human.getHealth()/4);
    }

    public boolean checkExperience(Human human) {
        return human.getExperience() >= human.getNextExperience();
    }

    public void levelUp(Human human, Player[] enemies) {
        human.addLevel();
        int i = 0;
        while (human.getNextExperience() >= experience_for_next_level[i]) {
            i = i + 1;
        }
        human.setNextExperience(experience_for_next_level[i]);
        for (int j = 0; j < 5; j++) {
            newHealthEnemy(enemies[j], human);
        }
    }

    public void addPointsBoss(Human human) {
        human.setExperience(50);
        human.setPoints(65 + human.getHealth() / 2);
    }

    public void addItems(int k1, int k2, int k3, Items[] items) {
        double i = Math.random();
        if (i < k1 * 0.01) {
            items[0].setCount(1);
        }
        if (i >= k1 * 0.01 & i < (k1 + k2) * 0.01) {
            items[1].setCount(1);
        }
        if (i >= (k1 + k2) * 0.01 & i < (k1 + k2 + k3) * 0.01) {
            items[2].setCount(1);
        }
    }

    public void addHealthHuman(Human human) {
        human.addMaxHealth(20+5*human.getLevel());
    }

    public void addDamageHuman(Human human) {
        human.addDamage(2+human.getLevel());
    }

    public void newHealthEnemy(Player enemy, Human human) {
        enemy.addMaxHealth((int) enemy.getMaxHealth() * (35-3*human.getLevel()) / 100);
        enemy.addDamage((int) enemy.getDamage() *(20+human.getLevel()) / 100);
        enemy.addLevel();
    }

    public void useItem(Player human, Items[] items, String name, Mediator mediator) {
        boolean a = false;
        switch (name) {
            case "First item" -> {
                if (items[0].getCount() > 0) {
                    human.addHealth((int) (human.getMaxHealth() * 0.25));
                    items[0].setCount(-1);
                } else {
                    a = true;
                    mediator.openCantUseItemDialog();
                }
            }
            case "Second item" -> {
                if (items[1].getCount() > 0) {
                    human.addHealth((int) (human.getMaxHealth() * 0.5));
                    items[1].setCount(-1);
                } else {
                    a = true;
                    mediator.openCantUseItemDialog();
                }
            }
            case "Third item" -> {
                a = true;
                mediator.openCantUseItemDialog();
            }
        }
    }

    public void resetEnemies(Player[] enemiesList) {
        for (Player enemy : enemiesList) {
            enemy.setLevel(1);
            switch (enemy.getName()) {
                case "Sub-Zero" -> {
                    enemy.setLevel(1);
                    enemy.setDamage(16);
                    enemy.setMaxHealth(60);
                }
                case "Sonya Blade" -> {
                    enemy.setLevel(1);
                    enemy.setDamage(16);
                    enemy.setMaxHealth(80);
                }
                case "Shao Kahn" -> {
                    enemy.setLevel(1);
                    enemy.setDamage(30);
                    enemy.setMaxHealth(100);
                }
                case "Liu Kang" -> {
                    enemy.setLevel(1);
                    enemy.setDamage(20);
                    enemy.setMaxHealth(70);
                }
                case "Baraka" -> {
                    enemy.setLevel(1);
                    enemy.setDamage(12);
                    enemy.setMaxHealth(100);
                }
            }
        }
    }
}
