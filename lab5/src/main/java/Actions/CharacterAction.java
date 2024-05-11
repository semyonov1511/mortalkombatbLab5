package Actions;

import Fabrics.EnemyFabric;
import Game_components.Human;
import Game_components.Player;
import Game_components.Items;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

public class CharacterAction {

    private final int experience_for_next_level[] = {40, 90, 180, 260, 410, 1000};

    private final int kind_fight[][] = {{1, 0}, {1, 1, 0}, {0, 1, 0}, {1, 1, 1, 1}};

    private final Player enemies[] = new Player[6];

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
    
    public int[] EnemyBehavior(int k1, int k2, int k3, int k4, double i) {
        int arr[] = null;
        if (i < k1 * 0.01) {
            arr = kind_fight[0];
        }
        if (i >= k1 * 0.01 & i < (k1 + k2) * 0.01) {
            arr = kind_fight[1];
        }
        if (i >= (k1 + k2) * 0.01 & i < (k1 + k2 + k3) * 0.01) {
            arr = kind_fight[2];
        }
        if (i >= (k1 + k2 + k3) * 0.01 & i < 1) {
            arr = kind_fight[3];
        }
        return arr;
    }

    public int[] ChooseBehavior(Player enemy, CharacterAction action) {
        int arr[] = null;
        double i = Math.random();
        if (null != enemy.getName()) {
            switch (enemy.getName()) {
                case "Baraka" ->
                    arr = action.EnemyBehavior(15, 15, 60, 10, i);
                case "Sub-Zero" ->
                    arr = action.EnemyBehavior(25, 25, 0, 50, i);
                case "Liu Kang" ->
                    arr = action.EnemyBehavior(13, 13, 10, 64, i);
                case "Sonya Blade" ->
                    arr = action.EnemyBehavior(25, 25, 50, 0, i);
                case "Shao Kahn" ->
                    arr = action.EnemyBehavior(10, 45, 0, 45, i);
                default -> {
                }
            }
        }
        return arr;
    }

    public void HP(Player player, JProgressBar progress) {

        if (player.getHealth() >= 0) {
            progress.setValue(player.getHealth());
        } else {
            progress.setValue(0);
        }
    }

    public void AddPoints(Human human, Player[] enemyes) {
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
        int i=0;
        if (human.getExperience() >= human.getNextExperience()) {
            human.setLevel();
            while (human.getNextExperience() >= experience_for_next_level[i]){
                i=i+1;
            } 
            human.setNextExperience(experience_for_next_level[i]);
            AddHealthHuman(human);
            AddDamageHuman(human);
            for (int j = 0; j < 5; j++) {
                NewHealthEnemy(enemyes[j], human);
            }
        }
    }

    public void AddPointsBoss(Human human, Player[] enemyes) {
        human.setExperience(50);
        human.setPoints(65 + human.getHealth() / 2);
        int i=0;
        if (human.getExperience() >= human.getNextExperience()) {
            human.setLevel();
            while (human.getNextExperience() >= experience_for_next_level[i]){
                i=i+1;
            } 
            human.setNextExperience(experience_for_next_level[i]);
            AddHealthHuman(human);
            for (int j = 0; j < 5; j++) {
                NewHealthEnemy(enemyes[j], human);
            }
        }
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
        human.setMaxHealth(hp);
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
        human.setDamage(damage);
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
        enemy.setMaxHealth((int) enemy.getMaxHealth() * hp / 100);
        enemy.setDamage((int) enemy.getDamage() * damage / 100);
        enemy.setLevel();
    }

    public void UseItem(Player human, Items[] items, String name, JDialog dialog, JDialog dialog1) {
        switch (name) {
            case "First item" -> {
                if (items[0].getCount() > 0) {
                    human.setHealth((int) (human.getMaxHealth() * 0.25));
                    items[0].setCount(-1);
                } else {
                    dialog.setVisible(true);
                    dialog.setBounds(300, 200, 400, 300);
                }
            }
            case "Second item" -> {
                if (items[1].getCount() > 0) {
                    human.setHealth((int) (human.getMaxHealth() * 0.5));
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
}
