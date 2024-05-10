package Actions;

import Game_components.Player;
import java.util.ArrayList;

public class Location {

    public int currentLocation;
    public int currentEnemyNumber;
    ArrayList<Player> currentEnemiesList = new ArrayList<>();

    public void setEnemiesAtLocation(int i, Player[] fullEnemiesList) {
        Player enemy = null;
        for (int j = 0; j < 1 + (int) (Math.random() * i); j++) {
            int k = (int) (Math.random() * 4);
            switch (k) {
                case 0 -> {
                    enemy = fullEnemiesList[0];
                    enemy.setPhoto("B.jpg");
                }
                case 1 -> {
                    enemy = fullEnemiesList[1];
                    enemy.setPhoto("SZ.jpg");
                }
                case 2 -> {
                    enemy = fullEnemiesList[2];
                    enemy.setPhoto("LK.jpg");
                }
                case 3 -> {
                    enemy = fullEnemiesList[3];
                    enemy.setPhoto("SB.jpg");
                }
            }
            currentEnemiesList.add(enemy);
        }
    }

    public void passNewEnemy() {
        currentEnemyNumber += 1;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public Player getCurrentEnemy() {
        return currentEnemiesList.get(currentEnemyNumber);
    }
}
