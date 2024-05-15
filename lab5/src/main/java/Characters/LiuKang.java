package Characters;

import Game_components.Player;

public class LiuKang extends Player{
    
    public LiuKang(int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
    }
    
    @Override
    public String getName(){
        return "Liu Kang";
    }
}
