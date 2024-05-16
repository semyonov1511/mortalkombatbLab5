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

    private final JLabel enemyHealthLabel;
    private final JLabel playerHealthLabel;
    private final JLabel pointsValueLabel;
    private final JLabel experienceValueLabel;
    private final JLabel playerLevelLabel;
    private final JLabel enemyLevelLabel;
    private final JLabel playerDamageValueLabel;
    private final JLabel endRoundLabel;
    private final JLabel enemyDebuffLabel;
    private final JLabel victoryLabel;
    private final JLabel endGameWithoutLadderTitlleLabel;
    private final JLabel playerActionLabel;
    private final JLabel playerDebuffLabel;
    private final JLabel enemyActionLabel;

    private final JProgressBar playerHealthBar;
    private final JProgressBar enemyHealthBar;

    private final JDialog endFightDialog;
    private final JDialog endGameDialog;
    private final JDialog endGameWithoutLadderDialog;
    private final JDialog cantUseItemDialog;
    private final JDialog itemsBagDialog;

    private final JFrame fightFrame;

    private final JRadioButton firstItemButton;
    private final JRadioButton secondItemButton;
    private final JRadioButton thirdItemButton;

    private final JTextField enterNameField;

    private final JTable recordsTable;

    public Mediator(JLabel enemyHealthLabel, JLabel playerHealthLabel, JDialog endFightDialog, JLabel pointsValueLabel, JLabel experienceValueLabel,
            JLabel playerLevelLabel, JLabel enemyLevelLabel, JLabel playerDamageValueLabel, JLabel endRoundLabel, JProgressBar playerHealthBar,
            JProgressBar enemyHealthBar, JDialog endGameDialog, JDialog endGameWithoutLadderDialog, JFrame fightFrame, JLabel enemyDebuffLabel,
            JLabel victoryLabel, JLabel endGameWithoutLadderTitlleLabel, JLabel playerActionLabel, JLabel playerDebuffLabel, JLabel enemyActionLabel,
            JRadioButton firstItemButton, JRadioButton secondItemButton, JRadioButton thirdItemButton, JTextField enterNameField, JTable recordsTable,
            JDialog cantUseItemDialog, JDialog itemsBagDialog) {

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
