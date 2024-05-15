package Actions;

import Game_components.Human;
import Game_components.Player;
import Game_components.Items;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;

public class ChangeTexts {
    
    public void NewRoundTexts(Player human, Player enemy, JLabel PlayerActionLabel, JLabel EnemyActionLabel,
            JProgressBar pr1, JProgressBar pr2, JLabel points, JLabel humanExperience, JLabel humanLevel,
            JLabel enemyLevel, JLabel humanHealth, JLabel enemyHealth, JLabel humanDamage, JLabel label9,
            int i, Items[] items, JRadioButton item1, JRadioButton item2, JRadioButton item3) {
        PlayerActionLabel.setText("");
        EnemyActionLabel.setText("");
        points.setText(Integer.toString(((Human) human).getPoints()));
        humanExperience.setText(Integer.toString(((Human) human).getExperience()) + "/" + ((Human) human).getNextExperience());
        humanLevel.setText(Integer.toString((human.getLevel())+1) + " level");
        enemyLevel.setText(Integer.toString(enemy.getLevel()) + " level");
        humanHealth.setText(Integer.toString(human.getMaxHealth()) + "/" + Integer.toString(human.getMaxHealth()));
        enemyHealth.setText(Integer.toString(enemy.getMaxHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        humanDamage.setText(Integer.toString(human.getDamage()));
        BagText(items, item1, item2, item3);
    }

    public void RoundTexts(Player human, Player enemy, JLabel enemyHealth, JLabel humanHealth) {
        if (enemy.getHealth() >= 0) {
            enemyHealth.setText(Integer.toString(enemy.getHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        } else {
            enemyHealth.setText("0/" + Integer.toString(enemy.getMaxHealth()));
        }
        if (human.getHealth() >= 0) {
            humanHealth.setText(Integer.toString(human.getHealth()) + "/" + Integer.toString(human.getMaxHealth()));
        } else {
            humanHealth.setText("0/" + Integer.toString(human.getMaxHealth()));
        }
    }
    
    public void BagText( Items[] items, JRadioButton item1, JRadioButton item2, JRadioButton item3){
        item1.setText(items[0].getName()+", "+items[0].getCount()+" шт");
        item2.setText(items[1].getName()+", "+items[1].getCount()+" шт");
        item3.setText(items[2].getName()+", "+items[2].getCount()+" шт");
    }

}
