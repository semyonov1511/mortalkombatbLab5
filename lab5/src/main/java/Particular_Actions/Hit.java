package Particular_Actions;

import Game_components.Player;

public class Hit extends Action {

    @Override
    public String getType() {
        return "Hit";
    }

    @Override
    public void realisation(Player human, Player enemy, String enemyActionType) {
        switch (enemyActionType) {
            case "Hit" -> {
                if (enemy.isDebuffed() & human.isDebuffed()){
                    enemy.addHealth((int) (-human.getDamage()*1.25/2));
                }
                if (enemy.isDebuffed() & !human.isDebuffed()){
                    enemy.addHealth((int) (-human.getDamage()*1.25));
                }
                if (!enemy.isDebuffed() & human.isDebuffed()){
                    enemy.addHealth((int) (-human.getDamage()/2));
                }
                if (!enemy.isDebuffed() & !human.isDebuffed()){
                    enemy.addHealth((int) (-human.getDamage()));
                }
            }
            case "Block" -> {
                if (Math.random() < 0.5) {
                    enemy.addHealth(-human.getDamage() / 2);
                }
            }
            case "Debuff" -> {
                enemy.addHealth((int) (-human.getDamage()*1.15));
            }
            case "Heal" -> {
                enemy.addHealth(-human.getDamage()*2);
            }
        }
    }
}
