package Actions;

import Game_components.Player;
import java.util.ArrayList;

public class Location {

    public int currentLocation = 1;
    public int currentEnemyNumber = 0;
    ArrayList<Player> currentEnemiesList = new ArrayList<>();
    Player[] fullEnemiesList = null;
    public int locationSize;

    public void setFullEnemiesList(Player[] list) {
        fullEnemiesList = list;
    }

    public ArrayList<Player> getEnemiesAtLocation() {
        return currentEnemiesList;
    }

    public void setEnemiesAtLocation(int i) {
        currentEnemiesList = new ArrayList<>();
        Player enemy = null;
        locationSize = 1 + (int) (Math.random() * i);
        for (int j = 0; j < locationSize; j++) {
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

    public void resetLocation(boolean a, int i) {
        if (a) {
            currentLocation += 1 ;
            currentEnemyNumber = 0;
            setEnemiesAtLocation(i);
        }
        else {
            currentLocation = 1;
            currentEnemyNumber = 0;
            setEnemiesAtLocation(0);
        }
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public int getCurrentEnemyNumber() {
        return currentEnemyNumber;
    }

    public Player getCurrentEnemy() {
        Player enemy = null;
        if (currentEnemyNumber != locationSize) {
            currentEnemyNumber += 1;
            return currentEnemiesList.get(currentEnemyNumber - 1);
        } else {
            currentEnemyNumber = 0;
            enemy = fullEnemiesList[4];
            enemy.setPhoto("SK.jpg");
            return enemy;
        }
    }
}
