package Actions;

import Fabrics.EnemyFabric;
import Game_components.Human;
import Game_components.Player;
import Game_components.Items;
import Particular_Actions.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

public class CharacterAction {

    private final int experience_for_next_level[] = {40, 90, 180, 260, 410, 1000};

    private final Player enemies[] = new Player[5];

    EnemyFabric fabric = new EnemyFabric();

    public void setEnemies() {
        enemies[0] = fabric.create(0, 0);
        enemies[1] = fabric.create(1, 0);
        enemies[2] = fabric.create(2, 0);
        enemies[3] = fabric.create(3, 0);
        enemies[4] = fabric.create(4, 0);
    }

    public Player[] getEnemies() {
        return this.enemies;
    }

    public Action ChooseEnemyAction(Player enemy, ArrayList<Action> list) {
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

    public void HP(Player player, JProgressBar progress) {
        if (player.getHealth() >= 0) {
            progress.setValue(player.getHealth());
        } else {
            progress.setValue(0);
        }
    }

    public void AddPoints(Human human) {
        switch (human.getLevel()) {
            case 0 -> {
                human.setExperience(20);
                human.setPoints(25 + human.getHealth() / 4);
            }
            case 1 -> {
                human.setExperience(25);
                human.setPoints(30 + human.getHealth() / 4);
            }
            case 2 -> {
                human.setExperience(30);
                human.setPoints(35 + human.getHealth() / 4);
            }
            case 3 -> {
                human.setExperience(40);
                human.setPoints(45 + human.getHealth() / 4);
            }
            case 4 -> {
                human.setExperience(50);
                human.setPoints(55 + human.getHealth() / 4);
            }
        }
    }

    public boolean checkExperience(Human human) {
        return human.getExperience() >= human.getNextExperience();
    }

    public void LevelUp(Human human, Player[] enemies) {
        human.addLevel();
        int i = 0;
        while (human.getNextExperience() >= experience_for_next_level[i]) {
            i = i + 1;
        }
        human.setNextExperience(experience_for_next_level[i]);
        for (int j = 0; j < 5; j++) {
            NewHealthEnemy(enemies[j], human);
        }
        System.out.println(" ");
    }

    public void AddPointsBoss(Human human) {
        human.setExperience(50);
        human.setPoints(65 + human.getHealth() / 2);
    }

    public void AddItems(int k1, int k2, int k3, Items[] items) {
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

    public void AddHealthHuman(Human human) {
        int hp = 0;
        switch (human.getLevel()) {
            case 1 -> {
                hp = 25;
            }
            case 2 -> {
                hp = 30;
            }
            case 3 -> {
                hp = 30;
            }
            case 4 -> {
                hp = 40;
            }
        }
        human.addMaxHealth(hp);
    }

    public void AddDamageHuman(Human human) {
        int damage = 0;
        switch (human.getLevel()) {
            case 1 -> {
                damage = 3;
            }
            case 2 -> {
                damage = 3;
            }
            case 3 -> {
                damage = 4;
            }
            case 4 -> {
                damage = 6;
            }
        }
        human.addDamage(damage);
    }

    public void NewHealthEnemy(Player enemy, Human human) {
        int hp = 0;
        int damage = 0;
        switch (human.getLevel()) {
            case 1 -> {
                hp = 32;
                damage = 25;
            }
            case 2 -> {
                hp = 30;
                damage = 20;
            }
            case 3 -> {
                hp = 23;
                damage = 24;
            }
            case 4 -> {
                hp = 25;
                damage = 26;
            }
        }
        enemy.addMaxHealth((int) enemy.getMaxHealth() * hp / 100);
        enemy.addDamage((int) enemy.getDamage() * damage / 100);
        enemy.addLevel();
    }

    public void UseItem(Player human, Items[] items, String name, JDialog dialog, JDialog dialog1) {
        switch (name) {
            case "First item" -> {
                if (items[0].getCount() > 0) {
                    human.addHealth((int) (human.getMaxHealth() * 0.25));
                    items[0].setCount(-1);
                } else {
                    dialog.setVisible(true);
                    dialog.setBounds(300, 200, 400, 300);
                }
            }
            case "Second item" -> {
                if (items[1].getCount() > 0) {
                    human.addHealth((int) (human.getMaxHealth() * 0.5));
                    items[1].setCount(-1);
                } else {
                    dialog.setVisible(true);
                    dialog.setBounds(300, 200, 400, 300);
                }
            }
            case "Third item" -> {
                dialog.setVisible(true);
                dialog.setBounds(300, 200, 400, 300);
            }
        }

        if (dialog.isVisible() == false) {
            dialog1.dispose();
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

