package Particular_Actions;

import Game_components.Player;

public class Hit extends Action {

    @Override
    public String getType() {
        return "Hit";
    }

    @Override
    public String isAttack() {
        return "1";
    }

    @Override
    public void realisation(Player human, Player enemy, String enemyActionType) {
        switch (enemyActionType) {
            case "Hit" -> {
                enemy.setHealth(-human.getDamage());
            }
            case "Block" -> {
                if (Math.random() < 0.5) {
                    enemy.setHealth(-human.getDamage() / 2);
                }
            }
            case "Debuff" -> {
                enemy.setHealth((int) (-human.getDamage()*1.15));
            }
            case "Heal" -> {
                enemy.setHealth(-human.getDamage()*2);
            }
        }
    }
}
