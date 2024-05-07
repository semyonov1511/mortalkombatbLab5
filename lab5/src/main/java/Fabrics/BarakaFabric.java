package Fabrics;

import Characters.Baraka;
import Game_components.Player;

public class BarakaFabric implements EnemyFabricInterface {
    
    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new Baraka(1, 100, 12, 1);
        return enemy;
    }
}
