package Fabrics;

import Game_components.Player;

public class EnemyFabric {

    public Player create(int i, int j) {
        EnemyFabricInterface fabric = null;

        switch (i) {
            case 0 -> fabric = new BarakaFabric();
            case 1 -> fabric = new SubZeroFabric();
            case 2 -> fabric = new LiuKangFabric();
            case 3 -> fabric = new SonyaBladeFabric();
            case 4 -> fabric = new ShaoKahnFabric();
        }
        Player enemy = fabric.create(j);
        return enemy;
    }
}
