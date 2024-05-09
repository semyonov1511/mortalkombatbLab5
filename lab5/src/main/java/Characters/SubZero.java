package Characters;

import Game_components.Player;

public class SubZero extends Player{
    
    public SubZero(int level, int health, int damage , int attack){
        super (level, health, damage, attack);
    }
    
    @Override
    public String getName(){
        return "Sub-Zero";
    }
}
