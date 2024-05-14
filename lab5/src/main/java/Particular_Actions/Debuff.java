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
    public void realisation(Player human, Player enemy, boolean a) {
        if (a) {
            enemy.setHealth((int) -(1.15 * human.getDamage()));
        } else {
            if (Math.random() <= 0.75) {

            }
        }
    }
}
