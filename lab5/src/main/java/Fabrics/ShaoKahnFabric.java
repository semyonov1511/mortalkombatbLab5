package Fabrics;

import Characters.ShaoKahn;
import Game_components.Player;

public class ShaoKahnFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        return new ShaoKahn(3, 100, 30, 1);
    }
}
