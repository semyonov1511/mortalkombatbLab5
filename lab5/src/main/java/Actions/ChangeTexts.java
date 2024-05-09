/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actions;

import Game_components.Human;
import Game_components.Player;
import Game_components.Items;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;

/**
 *
 * @author Мария
 */
public class ChangeTexts {
    
    public void NewRoundTexts(Player human, Player enemy, JProgressBar pr1,
            JProgressBar pr2, JLabel points, JLabel humanExperience, JLabel humanLevel,
            JLabel enemyLevel, JLabel humanHealth, JLabel enemyHealth, JLabel humanDamage, JLabel turnText, JLabel label9,
            int i, Items[] items, JRadioButton rb1, JRadioButton rb2, JRadioButton rb3) {
        points.setText(Integer.toString(((Human) human).getPoints()));
        humanExperience.setText(Integer.toString(((Human) human).getExperience()) + "/" + ((Human) human).getNextExperience());
        humanLevel.setText(Integer.toString(human.getLevel()) + " level");
        enemyLevel.setText(Integer.toString(enemy.getLevel()) + " level");
        humanHealth.setText(Integer.toString(human.getMaxHealth()) + "/" + Integer.toString(human.getMaxHealth()));
        enemyHealth.setText(Integer.toString(enemy.getMaxHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        humanDamage.setText(Integer.toString(human.getDamage()));
        if (i % 2 == 1) {
            turnText.setText("Your turn");
        }
        else{
            turnText.setText(enemy.getName()+"'s turn");
        }
        /*rb1.setText(items[0].getName()+", "+items[0].getCount()+" шт");
        rb2.setText(items[1].getName()+", "+items[1].getCount()+" шт");
        rb3.setText(items[2].getName()+", "+items[2].getCount()+" шт");*/
        BagText(items, rb1, rb2, rb3);
        label9.setText("");
    }

    public void RoundTexts(Player human, Player enemy, JLabel label, JLabel label2, int i, JLabel turnText) {
        if (enemy.getHealth() >= 0) {
            label.setText(Integer.toString(enemy.getHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        } else {
            label.setText("0/" + Integer.toString(enemy.getMaxHealth()));
        }
        if (human.getHealth() >= 0) {
            label2.setText(Integer.toString(human.getHealth()) + "/" + Integer.toString(human.getMaxHealth()));
        } else {
            label2.setText("0/" + Integer.toString(human.getMaxHealth()));
        }
        if (i % 2 == 1) {
            turnText.setText("Your turn");
        }
        else{
            turnText.setText(enemy.getName()+"'s turn");
        }
    }
    
    public void EndGameText(Human human, JLabel resultText){
        if(human.getWin()==12){
            resultText.setText("Победа на вашей стороне");
        }
        else {
            resultText.setText("Победа не на вашей стороне");
        }
    }
    
    public void BagText( Items[] items, JRadioButton rb1, JRadioButton rb2, JRadioButton rb3){
        rb1.setText(items[0].getName()+", "+items[0].getCount()+" шт");
        rb2.setText(items[1].getName()+", "+items[1].getCount()+" шт");
        rb3.setText(items[2].getName()+", "+items[2].getCount()+" шт");
    }

}
