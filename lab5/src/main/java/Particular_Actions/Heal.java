package Particular_Actions;

import Game_components.Player;

public class Heal extends Action {

    @Override
    public String getType() {
        return "Heal";
    }

    @Override
    public void realisation(Player human, Player enemy, String enemyActionType) {
        switch (enemyActionType) {
            case "Hit" -> {
            }
            case "Block" -> {
                human.setHealth((human.getMaxHealth() - human.getHealth()) / 2);
            }
            case "Debuff" -> {
            }
            case "Heal" -> {
            }
        }
    }
}
