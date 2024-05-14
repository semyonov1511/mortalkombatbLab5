package Particular_Actions;

import Game_components.Player;

public class Heal extends Action {

    @Override
    public String getType() {
        return "Heal";
    }

    @Override
    public String isAttack() {
        return "0";
    }

    @Override
    public void realisation(Player human, Player enemy, boolean a) {
        if (a) {
            enemy.setHealth((enemy.getMaxHealth() - enemy.getHealth()) / 2);
        } else {
            enemy.setHealth(-human.getDamage() * 2);
            
        }
    }
}
