package Characters;

import Game_components.Player;

/**
 *
 * @author Мария
 */
public class SonyaBlade extends Player{
    
    public SonyaBlade (int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
    }
    
    @Override
    public String getName(){
        return "Sonya Blade";
    }
}
