package Particular_Actions;

import Game_components.Player;

public class Debuff extends Action {

    @Override
    public String getType() {
        return "Debuff";
    }

    @Override
    public String isAttack() {
        return "1";
    }

    @Override
    public void realisation(Player human, Player enemy, String enemyActionType) {
        switch (enemyActionType) {
            case "Hit" -> {
            }
            case "Block" -> {
                if (Math.random()<0.75){
                    enemy.setDebuffTurns(enemy.getLevel()+1);
                }
            }
            case "Debuff" -> {
            }
            case "Heal" -> {
            }
        }
    }
}
