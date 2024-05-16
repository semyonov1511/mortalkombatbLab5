package Actions;

import Game_components.Player;
import Particular_Actions.Action;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Mediator {

    private JLabel enemyHealthLabel;
    private JLabel playerHealthLabel;
    private JLabel pointsValueLabel;
    private JLabel experienceValueLabel;
    private JLabel playerLevelLabel;
    private JLabel enemyLevelLabel;
    private JLabel playerDamageValueLabel;
    private JLabel endRoundLabel;
    private JLabel enemyDebuffLabel;
    private JLabel victoryLabel;
    private JLabel endGameWithoutLadderTitlleLabel;
    private JLabel playerActionLabel;
    private JLabel playerDebuffLabel;
    private JLabel enemyActionLabel;

    private JProgressBar playerHealthBar;
    private JProgressBar enemyHealthBar;

    private JDialog endFightDialog;
    private JDialog endGameDialog;
    private JDialog endGameWithoutLadderDialog;
    private JDialog cantUseItemDialog;
    private JDialog itemsBagDialog;

    private JFrame fightFrame;

    private JRadioButton firstItemButton;
    private JRadioButton secondItemButton;
    private JRadioButton thirdItemButton;

    private JTextField enterNameField;

    private JTable recordsTable;

    public Mediator(JLabel enemyHealthLabel, JLabel playerHealthLabel, JDialog endFightDialog, JLabel pointsValueLabel, JLabel experienceValueLabel,
            JLabel playerLevelLabel, JLabel enemyLevelLabel, JLabel playerDamageValueLabel, JLabel endRoundLabel, JProgressBar playerHealthBar,
            JProgressBar enemyHealthBar, JDialog endGameDialog, JDialog endGameWithoutLadderDialog, JFrame fightFrame, JLabel enemyDebuffLabel,
            JLabel victoryLabel, JLabel endGameWithoutLadderTitlleLabel, JLabel playerActionLabel, JLabel playerDebuffLabel, JLabel enemyActionLabel,
            JRadioButton firstItemButton, JRadioButton secondItemButton, JRadioButton thirdItemButton, JTextField enterNameField, JTable recordsTable,
            JDialog cantUseItemDialog, JDialog itemsBagDialog) {

        // Set-functions using this. keyword
        this.enemyHealthLabel = enemyHealthLabel;
        this.playerHealthLabel = playerHealthLabel;
        this.endFightDialog = endFightDialog;
        this.pointsValueLabel = pointsValueLabel;
        this.experienceValueLabel = experienceValueLabel;
        this.playerLevelLabel = playerLevelLabel;
        this.enemyLevelLabel = enemyLevelLabel;
        this.playerDamageValueLabel = playerDamageValueLabel;
        this.endRoundLabel = endRoundLabel;
        this.playerHealthBar = playerHealthBar;
        this.enemyHealthBar = enemyHealthBar;
        this.endGameDialog = endGameDialog;
        this.endGameWithoutLadderDialog = endGameWithoutLadderDialog;
        this.fightFrame = fightFrame;
        this.enemyDebuffLabel = enemyDebuffLabel;
        this.victoryLabel = victoryLabel;
        this.endGameWithoutLadderTitlleLabel = endGameWithoutLadderTitlleLabel;
        this.playerActionLabel = playerActionLabel;
        this.playerDebuffLabel = playerDebuffLabel;
        this.enemyActionLabel = enemyActionLabel;
        this.firstItemButton = firstItemButton;
        this.secondItemButton = secondItemButton;
        this.thirdItemButton = thirdItemButton;
        this.enterNameField = enterNameField;
        this.recordsTable = recordsTable;
        this.cantUseItemDialog = cantUseItemDialog;
        this.itemsBagDialog = itemsBagDialog;
    }

    public void setActionLabels(Player enemy, Player human, Action enemyAction, Action playerAction) {
        playerActionLabel.setText(human.getName() + " uses " + playerAction.getType());
        enemyActionLabel.setText(enemy.getName() + " use " + enemyAction.getType());
    }
}
