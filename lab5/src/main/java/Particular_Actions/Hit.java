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
    public void realisation(Player human, Player enemy, boolean a) {
        if (a) {
            enemy.setHealth(-human.getDamage());
        } else {
             if (Math.random() < 0.5){
                  enemy.setHealth(-human.getDamage()/2);
             }
        }
    }
}
