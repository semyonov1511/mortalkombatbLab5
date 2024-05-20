package Interface;

import Actions.Game;
import Actions.Mediator;
import Game_components.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class JFrames extends javax.swing.JFrame {

    Mediator mediator;
    Game game = new Game();
    ArrayList<Player> enemiesList = null;
    Items[] items = new Items[3];
    String nameButton = "";
    int locationsNumber = 0;

    public JFrames() {
        initComponents();
        try {
            game.readFromExcel();
        } catch (IOException ex) {
            Logger.getLogger(JFrames.class.getName()).log(Level.SEVERE, null, ex);
        }
        game.writeToTable(recordsTable);
        game.setEnemies();
        game.location.setFullEnemiesList(game.getEnemies());
        playerIconLabel.setIcon(new ImageIcon("crab.jpg"));
        attributesGroup.add(healthButton);
        attributesGroup.add(damageButton);
        itemsGroup.add(firstItemButton);
        itemsGroup.add(secondItemButton);
        itemsGroup.add(thirdItemButton);
        items[0] = new Items("Малое зелье лечение", 0);
        items[1] = new Items("Большое зелье лечение", 0);
        items[2] = new Items("Крест возрождения", 0);
        mediator = new Mediator(enemyHealthLabel, playerHealthLabel, endFightDialog, pointsValueLabel, experienceValueLabel,
                playerLevelLabel, enemyLevelLabel, playerDamageValueLabel, endRoundLabel, playerHealthBar,
                enemyHealthBar, endGameDialog, endGameWithoutLadderDialog, fightFrame, enemyDebuffLabel,
                victoryLabel, endGameWithoutLadderTitlleLabel, playerActionLabel, playerDebuffLabel, enemyActionLabel,
                firstItemButton, secondItemButton, thirdItemButton, enterNameField, recordsTable,
                cantUseItemDialog, itemsBagDialog);
        game.fight.setMediator(mediator);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fightFrame = new javax.swing.JFrame();
        fightPanel = new javax.swing.JPanel();
        playerIconLabel = new javax.swing.JLabel();
        attackButton = new javax.swing.JButton();
        blockButton = new javax.swing.JButton();
        playerHealthBar = new javax.swing.JProgressBar();
        enemyIconLabel = new javax.swing.JLabel();
        enemyHealthBar = new javax.swing.JProgressBar();
        enemyHeroLabel = new javax.swing.JLabel();
        enemyDamageLabel = new javax.swing.JLabel();
        playerDamageLabel = new javax.swing.JLabel();
        playerDamageValueLabel = new javax.swing.JLabel();
        enemyDamageValueLabel = new javax.swing.JLabel();
        playerLevelLabel = new javax.swing.JLabel();
        fightLabel = new javax.swing.JLabel();
        playerHealthLabel = new javax.swing.JLabel();
        enemyHealthLabel = new javax.swing.JLabel();
        experinceTitleLabel = new javax.swing.JLabel();
        pointsTitleLabel = new javax.swing.JLabel();
        experienceValueLabel = new javax.swing.JLabel();
        pointsValueLabel = new javax.swing.JLabel();
        enemyLevelLabel = new javax.swing.JLabel();
        turnLabel = new javax.swing.JLabel();
        enemyActionLabel = new javax.swing.JLabel();
        playerHeroLabel = new javax.swing.JLabel();
        stunLabel = new javax.swing.JLabel();
        itemsButton = new javax.swing.JButton();
        locationLabel = new javax.swing.JLabel();
        enemyNumberLabel = new javax.swing.JLabel();
        playerActionLabel = new javax.swing.JLabel();
        enemyDebuffLabel = new javax.swing.JLabel();
        debuffButton = new javax.swing.JButton();
        playerDebuffLabel = new javax.swing.JLabel();
        endFightDialog = new javax.swing.JDialog();
        endFightPanel = new javax.swing.JPanel();
        endRoundLabel = new javax.swing.JLabel();
        nextRoundButton = new javax.swing.JButton();
        endGameDialog = new javax.swing.JDialog();
        endGamePanel = new javax.swing.JPanel();
        victoryLabel = new javax.swing.JLabel();
        enterNameField = new javax.swing.JTextField();
        enterNameLabel = new javax.swing.JLabel();
        enterNameLabelBottom = new javax.swing.JLabel();
        endGameButton = new javax.swing.JButton();
        recordsTableDialog = new javax.swing.JDialog();
        recordsTablePanel = new javax.swing.JPanel();
        recordsTableLabel = new javax.swing.JLabel();
        recordsTableScrollPane = new javax.swing.JScrollPane();
        recordsTable = new javax.swing.JTable();
        closeRecordsTableButton = new javax.swing.JButton();
        endGameWithoutLadderDialog = new javax.swing.JDialog();
        endGameWithoutLadderPanel = new javax.swing.JPanel();
        endGameWithoutLadderTitlleLabel = new javax.swing.JLabel();
        notInLadderLabel = new javax.swing.JLabel();
        endGameWithoutLadderButton = new javax.swing.JButton();
        itemsBagDialog = new javax.swing.JDialog();
        itemsBagPanel = new javax.swing.JPanel();
        itemsBagLabel = new javax.swing.JLabel();
        firstItemButton = new javax.swing.JRadioButton();
        secondItemButton = new javax.swing.JRadioButton();
        thirdItemButton = new javax.swing.JRadioButton();
        useItemButton = new javax.swing.JButton();
        itemsGroup = new javax.swing.ButtonGroup();
        cantUseItemDialog = new javax.swing.JDialog();
        cantUseItemPanel = new javax.swing.JPanel();
        cantUseItemLabel = new javax.swing.JLabel();
        unavailableItemLabel = new javax.swing.JLabel();
        closeCantUseItemButton = new javax.swing.JButton();
        setLocationsFrame = new javax.swing.JFrame();
        setLocationsPanel = new javax.swing.JPanel();
        setLocationsLabel = new javax.swing.JLabel();
        setLocationsField = new javax.swing.JTextField();
        startWithLocationsButton = new javax.swing.JButton();
        levelUp = new javax.swing.JFrame();
        attributePanel = new javax.swing.JPanel();
        levelUpLabel = new javax.swing.JLabel();
        healthButton = new javax.swing.JRadioButton();
        damageButton = new javax.swing.JRadioButton();
        chooseAttributeButton = new javax.swing.JButton();
        attributesGroup = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        mkLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        seeResultsButton = new javax.swing.JButton();

        fightPanel.setBackground(new java.awt.Color(255, 255, 255));

        attackButton.setBackground(new java.awt.Color(255, 0, 0));
        attackButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        attackButton.setText("Атаковать");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        blockButton.setBackground(new java.awt.Color(255, 204, 0));
        blockButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        blockButton.setText("Защититься");
        blockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockButtonActionPerformed(evt);
            }
        });

        playerHealthBar.setBackground(new java.awt.Color(204, 204, 204));
        playerHealthBar.setForeground(new java.awt.Color(51, 255, 51));
        playerHealthBar.setMaximum(80);
        playerHealthBar.setMinimum(-1);

        enemyHealthBar.setBackground(new java.awt.Color(204, 204, 204));
        enemyHealthBar.setForeground(new java.awt.Color(0, 255, 0));
        enemyHealthBar.setMinimum(-1);

        enemyHeroLabel.setBackground(new java.awt.Color(0, 0, 0));
        enemyHeroLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        enemyDamageLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyDamageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enemyDamageLabel.setText("Damage");

        playerDamageLabel.setBackground(new java.awt.Color(255, 255, 255));
        playerDamageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        playerDamageLabel.setText("Damage");

        playerDamageValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        playerDamageValueLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        playerDamageValueLabel.setForeground(new java.awt.Color(255, 0, 0));
        playerDamageValueLabel.setText("16");

        enemyDamageValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyDamageValueLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enemyDamageValueLabel.setForeground(new java.awt.Color(255, 0, 0));
        enemyDamageValueLabel.setText("16");

        playerLevelLabel.setBackground(new java.awt.Color(255, 255, 255));
        playerLevelLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        playerLevelLabel.setText("0 уровень");

        fightLabel.setBackground(new java.awt.Color(255, 255, 255));
        fightLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        fightLabel.setForeground(new java.awt.Color(0, 0, 153));
        fightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fightLabel.setText("FIGHT");
        fightLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        playerHealthLabel.setBackground(new java.awt.Color(255, 255, 255));
        playerHealthLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        playerHealthLabel.setForeground(new java.awt.Color(102, 102, 102));
        playerHealthLabel.setText("80/80");

        enemyHealthLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyHealthLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        enemyHealthLabel.setForeground(new java.awt.Color(102, 102, 102));
        enemyHealthLabel.setText("80/80");

        experinceTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        experinceTitleLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        experinceTitleLabel.setForeground(new java.awt.Color(128, 92, 31));
        experinceTitleLabel.setText("experience");

        pointsTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        pointsTitleLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        pointsTitleLabel.setForeground(new java.awt.Color(128, 92, 31));
        pointsTitleLabel.setText("points");

        experienceValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        experienceValueLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        experienceValueLabel.setForeground(new java.awt.Color(113, 90, 16));
        experienceValueLabel.setText("0/40");

        pointsValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        pointsValueLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        pointsValueLabel.setForeground(new java.awt.Color(113, 90, 16));
        pointsValueLabel.setText("00");

        enemyLevelLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyLevelLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        enemyLevelLabel.setText("1 уровень");

        turnLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        turnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        enemyActionLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        enemyActionLabel.setForeground(new java.awt.Color(204, 0, 0));
        enemyActionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        playerHeroLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        playerHeroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerHeroLabel.setText("Crab");

        stunLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        stunLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        itemsButton.setBackground(new java.awt.Color(174, 183, 106));
        itemsButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        itemsButton.setText("Предметы");
        itemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsButtonActionPerformed(evt);
            }
        });

        locationLabel.setText("Текущая локация:");

        enemyNumberLabel.setText("Номер противника:");

        playerActionLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        playerActionLabel.setForeground(new java.awt.Color(204, 0, 0));
        playerActionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        debuffButton.setBackground(new java.awt.Color(51, 51, 255));
        debuffButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        debuffButton.setText("Дебаффнуть");
        debuffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debuffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fightPanelLayout = new javax.swing.GroupLayout(fightPanel);
        fightPanel.setLayout(fightPanelLayout);
        fightPanelLayout.setHorizontalGroup(
            fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fightPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fightPanelLayout.createSequentialGroup()
                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fightPanelLayout.createSequentialGroup()
                                .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                            .addComponent(enemyDamageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(enemyDamageValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(enemyHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(fightPanelLayout.createSequentialGroup()
                                            .addComponent(enemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(fightPanelLayout.createSequentialGroup()
                                                    .addGap(92, 92, 92)
                                                    .addComponent(pointsTitleLabel))
                                                .addGroup(fightPanelLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(enemyHealthLabel)
                                                    .addGap(62, 62, 62)
                                                    .addComponent(pointsValueLabel)
                                                    .addGap(108, 108, 108)
                                                    .addComponent(experienceValueLabel))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fightPanelLayout.createSequentialGroup()
                                            .addComponent(enemyDebuffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(129, 129, 129)))
                                    .addGroup(fightPanelLayout.createSequentialGroup()
                                        .addComponent(enemyIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(fightPanelLayout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(turnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(fightPanelLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(enemyActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(stunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(playerActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)))))
                                .addGap(28, 28, 28))
                            .addGroup(fightPanelLayout.createSequentialGroup()
                                .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(enemyNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(itemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fightPanelLayout.createSequentialGroup()
                                .addComponent(playerDebuffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playerLevelLabel)
                                .addGap(26, 26, 26))
                            .addGroup(fightPanelLayout.createSequentialGroup()
                                .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fightPanelLayout.createSequentialGroup()
                                        .addComponent(playerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(playerHealthLabel))
                                    .addGroup(fightPanelLayout.createSequentialGroup()
                                        .addComponent(playerDamageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(playerDamageValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45))
                            .addGroup(fightPanelLayout.createSequentialGroup()
                                .addComponent(playerIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(fightPanelLayout.createSequentialGroup()
                                .addComponent(playerHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fightPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(blockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(debuffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(fightPanelLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(experinceTitleLabel))
                        .addContainerGap())))
            .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fightPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(enemyLevelLabel)
                    .addContainerGap(854, Short.MAX_VALUE)))
        );
        fightPanelLayout.setVerticalGroup(
            fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fightPanelLayout.createSequentialGroup()
                .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fightPanelLayout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(fightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(experinceTitleLabel)
                            .addComponent(pointsTitleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(experienceValueLabel)
                            .addComponent(pointsValueLabel)
                            .addComponent(enemyHealthLabel)))
                    .addGroup(fightPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playerHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(enemyHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(fightPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(playerHealthLabel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerDamageLabel)
                    .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enemyDamageLabel)
                        .addComponent(enemyDamageValueLabel)
                        .addComponent(playerDamageValueLabel)))
                .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fightPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(enemyDebuffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enemyHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enemyNumberLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fightPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fightPanelLayout.createSequentialGroup()
                                .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(playerLevelLabel)
                                    .addComponent(playerDebuffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(playerIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fightPanelLayout.createSequentialGroup()
                                .addComponent(enemyActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(playerActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(turnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(stunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(playerHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(attackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(debuffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
            .addGroup(fightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fightPanelLayout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(enemyLevelLabel)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout fightFrameLayout = new javax.swing.GroupLayout(fightFrame.getContentPane());
        fightFrame.getContentPane().setLayout(fightFrameLayout);
        fightFrameLayout.setHorizontalGroup(
            fightFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fightFrameLayout.createSequentialGroup()
                .addComponent(fightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fightFrameLayout.setVerticalGroup(
            fightFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fightPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        endFightPanel.setBackground(new java.awt.Color(179, 226, 217));

        endRoundLabel.setBackground(new java.awt.Color(204, 204, 204));
        endRoundLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 42)); // NOI18N
        endRoundLabel.setForeground(new java.awt.Color(204, 0, 0));
        endRoundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endRoundLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nextRoundButton.setBackground(new java.awt.Color(114, 218, 142));
        nextRoundButton.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        nextRoundButton.setText("Дальше");
        nextRoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRoundButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout endFightPanelLayout = new javax.swing.GroupLayout(endFightPanel);
        endFightPanel.setLayout(endFightPanelLayout);
        endFightPanelLayout.setHorizontalGroup(
            endFightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endFightPanelLayout.createSequentialGroup()
                .addGroup(endFightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endFightPanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(nextRoundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(endFightPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(endRoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        endFightPanelLayout.setVerticalGroup(
            endFightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endFightPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(endRoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(nextRoundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout endFightDialogLayout = new javax.swing.GroupLayout(endFightDialog.getContentPane());
        endFightDialog.getContentPane().setLayout(endFightDialogLayout);
        endFightDialogLayout.setHorizontalGroup(
            endFightDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endFightDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(endFightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        endFightDialogLayout.setVerticalGroup(
            endFightDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endFightDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(endFightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        endGamePanel.setBackground(new java.awt.Color(255, 204, 255));

        victoryLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        victoryLabel.setForeground(new java.awt.Color(255, 0, 0));
        victoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victoryLabel.setText("Победа на вашей стороне");

        enterNameField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        enterNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNameFieldActionPerformed(evt);
            }
        });

        enterNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        enterNameLabel.setForeground(new java.awt.Color(102, 102, 102));
        enterNameLabel.setText("Введите имя своего персонажа для добавления");

        enterNameLabelBottom.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        enterNameLabelBottom.setForeground(new java.awt.Color(102, 102, 102));
        enterNameLabelBottom.setText("результата в таблицу рекордов");

        endGameButton.setBackground(new java.awt.Color(153, 153, 255));
        endGameButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        endGameButton.setForeground(new java.awt.Color(51, 51, 51));
        endGameButton.setText("Закончить игру");
        endGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout endGamePanelLayout = new javax.swing.GroupLayout(endGamePanel);
        endGamePanel.setLayout(endGamePanelLayout);
        endGamePanelLayout.setHorizontalGroup(
            endGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endGamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(endGameButton)
                .addGap(14, 14, 14))
            .addGroup(endGamePanelLayout.createSequentialGroup()
                .addGroup(endGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endGamePanelLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(enterNameLabelBottom))
                    .addGroup(endGamePanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(victoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(endGamePanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(endGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterNameLabel))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        endGamePanelLayout.setVerticalGroup(
            endGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endGamePanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(victoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterNameLabelBottom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(enterNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout endGameDialogLayout = new javax.swing.GroupLayout(endGameDialog.getContentPane());
        endGameDialog.getContentPane().setLayout(endGameDialogLayout);
        endGameDialogLayout.setHorizontalGroup(
            endGameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endGameDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(endGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        endGameDialogLayout.setVerticalGroup(
            endGameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endGameDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(endGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        recordsTablePanel.setBackground(new java.awt.Color(204, 204, 255));

        recordsTableLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        recordsTableLabel.setForeground(new java.awt.Color(51, 51, 51));
        recordsTableLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordsTableLabel.setText("Таблица рекордов");

        recordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Имя", "Количество баллов"
            }
        )
        {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        });
        recordsTableScrollPane.setViewportView(recordsTable);

        closeRecordsTableButton.setBackground(new java.awt.Color(255, 255, 153));
        closeRecordsTableButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        closeRecordsTableButton.setForeground(new java.awt.Color(51, 51, 51));
        closeRecordsTableButton.setText("Закрыть");
        closeRecordsTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeRecordsTableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recordsTablePanelLayout = new javax.swing.GroupLayout(recordsTablePanel);
        recordsTablePanel.setLayout(recordsTablePanelLayout);
        recordsTablePanelLayout.setHorizontalGroup(
            recordsTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordsTablePanelLayout.createSequentialGroup()
                .addGroup(recordsTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeRecordsTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(recordsTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(recordsTablePanelLayout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(recordsTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(recordsTablePanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(recordsTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        recordsTablePanelLayout.setVerticalGroup(
            recordsTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordsTablePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(recordsTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recordsTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeRecordsTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout recordsTableDialogLayout = new javax.swing.GroupLayout(recordsTableDialog.getContentPane());
        recordsTableDialog.getContentPane().setLayout(recordsTableDialogLayout);
        recordsTableDialogLayout.setHorizontalGroup(
            recordsTableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recordsTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        recordsTableDialogLayout.setVerticalGroup(
            recordsTableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recordsTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        endGameWithoutLadderPanel.setBackground(new java.awt.Color(255, 204, 255));

        endGameWithoutLadderTitlleLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        endGameWithoutLadderTitlleLabel.setForeground(new java.awt.Color(255, 0, 0));
        endGameWithoutLadderTitlleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endGameWithoutLadderTitlleLabel.setText("Победа на вашей стороне");

        notInLadderLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        notInLadderLabel.setForeground(new java.awt.Color(102, 102, 102));
        notInLadderLabel.setText("К сожалению, Ваш результат не попал в топ 10");

        endGameWithoutLadderButton.setBackground(new java.awt.Color(153, 153, 255));
        endGameWithoutLadderButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        endGameWithoutLadderButton.setForeground(new java.awt.Color(51, 51, 51));
        endGameWithoutLadderButton.setText("Закончить игру");
        endGameWithoutLadderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endGameWithoutLadderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout endGameWithoutLadderPanelLayout = new javax.swing.GroupLayout(endGameWithoutLadderPanel);
        endGameWithoutLadderPanel.setLayout(endGameWithoutLadderPanelLayout);
        endGameWithoutLadderPanelLayout.setHorizontalGroup(
            endGameWithoutLadderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                .addGroup(endGameWithoutLadderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(endGameWithoutLadderTitlleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(notInLadderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(endGameWithoutLadderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        endGameWithoutLadderPanelLayout.setVerticalGroup(
            endGameWithoutLadderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endGameWithoutLadderPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(endGameWithoutLadderTitlleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(notInLadderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(endGameWithoutLadderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout endGameWithoutLadderDialogLayout = new javax.swing.GroupLayout(endGameWithoutLadderDialog.getContentPane());
        endGameWithoutLadderDialog.getContentPane().setLayout(endGameWithoutLadderDialogLayout);
        endGameWithoutLadderDialogLayout.setHorizontalGroup(
            endGameWithoutLadderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(endGameWithoutLadderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        endGameWithoutLadderDialogLayout.setVerticalGroup(
            endGameWithoutLadderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(endGameWithoutLadderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        itemsBagPanel.setBackground(new java.awt.Color(190, 182, 135));

        itemsBagLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        itemsBagLabel.setForeground(new java.awt.Color(51, 51, 51));
        itemsBagLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemsBagLabel.setText("Мешок предметов");

        firstItemButton.setBackground(new java.awt.Color(190, 182, 135));
        firstItemButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        firstItemButton.setText("Малое зелье лечение, 0 шт");
        firstItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstItemButtonActionPerformed(evt);
            }
        });

        secondItemButton.setBackground(new java.awt.Color(190, 182, 135));
        secondItemButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        secondItemButton.setText("Большое зелье лечение, 0 шт");
        secondItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondItemButtonActionPerformed(evt);
            }
        });

        thirdItemButton.setBackground(new java.awt.Color(190, 182, 135));
        thirdItemButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        thirdItemButton.setText("Крест возрождения, 0 шт");

        useItemButton.setBackground(new java.awt.Color(239, 237, 14));
        useItemButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        useItemButton.setText("Использовать");
        useItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemsBagPanelLayout = new javax.swing.GroupLayout(itemsBagPanel);
        itemsBagPanel.setLayout(itemsBagPanelLayout);
        itemsBagPanelLayout.setHorizontalGroup(
            itemsBagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsBagPanelLayout.createSequentialGroup()
                .addGroup(itemsBagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemsBagPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(itemsBagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(secondItemButton)
                            .addComponent(thirdItemButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstItemButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemsBagLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(itemsBagPanelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(useItemButton)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        itemsBagPanelLayout.setVerticalGroup(
            itemsBagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsBagPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(itemsBagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(firstItemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondItemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdItemButton)
                .addGap(50, 50, 50)
                .addComponent(useItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout itemsBagDialogLayout = new javax.swing.GroupLayout(itemsBagDialog.getContentPane());
        itemsBagDialog.getContentPane().setLayout(itemsBagDialogLayout);
        itemsBagDialogLayout.setHorizontalGroup(
            itemsBagDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemsBagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        itemsBagDialogLayout.setVerticalGroup(
            itemsBagDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemsBagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cantUseItemPanel.setBackground(new java.awt.Color(243, 120, 120));

        cantUseItemLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cantUseItemLabel.setForeground(new java.awt.Color(51, 51, 51));
        cantUseItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantUseItemLabel.setText("Вы не можете использовать ");

        unavailableItemLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        unavailableItemLabel.setForeground(new java.awt.Color(51, 51, 51));
        unavailableItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unavailableItemLabel.setText("этот предмет");

        closeCantUseItemButton.setBackground(new java.awt.Color(204, 204, 204));
        closeCantUseItemButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        closeCantUseItemButton.setForeground(new java.awt.Color(51, 51, 51));
        closeCantUseItemButton.setText("ОК");
        closeCantUseItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCantUseItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cantUseItemPanelLayout = new javax.swing.GroupLayout(cantUseItemPanel);
        cantUseItemPanel.setLayout(cantUseItemPanelLayout);
        cantUseItemPanelLayout.setHorizontalGroup(
            cantUseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cantUseItemPanelLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(cantUseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantUseItemPanelLayout.createSequentialGroup()
                        .addComponent(cantUseItemLabel)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantUseItemPanelLayout.createSequentialGroup()
                        .addComponent(unavailableItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
            .addGroup(cantUseItemPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(closeCantUseItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cantUseItemPanelLayout.setVerticalGroup(
            cantUseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cantUseItemPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(cantUseItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unavailableItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(closeCantUseItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout cantUseItemDialogLayout = new javax.swing.GroupLayout(cantUseItemDialog.getContentPane());
        cantUseItemDialog.getContentPane().setLayout(cantUseItemDialogLayout);
        cantUseItemDialogLayout.setHorizontalGroup(
            cantUseItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantUseItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cantUseItemDialogLayout.setVerticalGroup(
            cantUseItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantUseItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setLocationsLabel.setText("Введите количество локаций, которое хотите пройти");

        setLocationsField.setText("3");
        setLocationsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLocationsFieldActionPerformed(evt);
            }
        });

        startWithLocationsButton.setText("Начать игру");
        startWithLocationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startWithLocationsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setLocationsPanelLayout = new javax.swing.GroupLayout(setLocationsPanel);
        setLocationsPanel.setLayout(setLocationsPanelLayout);
        setLocationsPanelLayout.setHorizontalGroup(
            setLocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setLocationsPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(setLocationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(setLocationsPanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(setLocationsField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startWithLocationsButton)
                .addGap(18, 18, 18))
        );
        setLocationsPanelLayout.setVerticalGroup(
            setLocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setLocationsPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(setLocationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(setLocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setLocationsField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startWithLocationsButton))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout setLocationsFrameLayout = new javax.swing.GroupLayout(setLocationsFrame.getContentPane());
        setLocationsFrame.getContentPane().setLayout(setLocationsFrameLayout);
        setLocationsFrameLayout.setHorizontalGroup(
            setLocationsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setLocationsFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setLocationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setLocationsFrameLayout.setVerticalGroup(
            setLocationsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setLocationsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setLocationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        levelUpLabel.setText("Какой параметр улучшить?");

        healthButton.setText("Здоровье");
        healthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthButtonActionPerformed(evt);
            }
        });

        damageButton.setSelected(true);
        damageButton.setText("Урон");

        chooseAttributeButton.setText("ОК");
        chooseAttributeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseAttributeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout attributePanelLayout = new javax.swing.GroupLayout(attributePanel);
        attributePanel.setLayout(attributePanelLayout);
        attributePanelLayout.setHorizontalGroup(
            attributePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attributePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(healthButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(damageButton)
                .addGap(32, 32, 32))
            .addGroup(attributePanelLayout.createSequentialGroup()
                .addGroup(attributePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attributePanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(levelUpLabel))
                    .addGroup(attributePanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(chooseAttributeButton)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        attributePanelLayout.setVerticalGroup(
            attributePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attributePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(levelUpLabel)
                .addGap(66, 66, 66)
                .addGroup(attributePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthButton)
                    .addComponent(damageButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(chooseAttributeButton)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout levelUpLayout = new javax.swing.GroupLayout(levelUp.getContentPane());
        levelUp.getContentPane().setLayout(levelUpLayout);
        levelUpLayout.setHorizontalGroup(
            levelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(levelUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attributePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        levelUpLayout.setVerticalGroup(
            levelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(levelUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attributePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        mkLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        mkLabel.setForeground(new java.awt.Color(204, 204, 0));
        mkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mkLabel.setText("Mortal Kombat");

        startButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        startButton.setText("Начать новую игру");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        seeResultsButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        seeResultsButton.setText("Посмотреть таблицу \nрезультатов");
        seeResultsButton.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        seeResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeResultsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(seeResultsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(mkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(mkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seeResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        setLocationsFrame.setVisible(true);
        setLocationsFrame.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_startButtonActionPerformed

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        game.fight.hit(1, game.getResults(), game.fight.getHuman().getItems(), game.location, locationsNumber, game.getEnemies());
    }//GEN-LAST:event_attackButtonActionPerformed

    private void blockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockButtonActionPerformed
        game.fight.hit(0, game.getResults(), game.fight.getHuman().getItems(), game.location, locationsNumber, game.getEnemies());
    }//GEN-LAST:event_blockButtonActionPerformed

    private void nextRoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRoundButtonActionPerformed
        locationLabel.setText("Текущая локация: " + game.location.getCurrentLocation() + "/" + locationsNumber);
        if ((game.location.getCurrentEnemyNumber() + 1) <= game.location.getEnemiesAtLocation().size()) {
            enemyNumberLabel.setText("Номер противника: " + (game.location.getCurrentEnemyNumber() + 1) + "/" + game.location.getEnemiesAtLocation().size());
        } else {
            enemyNumberLabel.setText("Финальный босс локации!");
        }
        if (game.action.checkExperience(game.fight.getHuman())) {
            game.action.levelUp(game.fight.getHuman(), game.getEnemies());
            game.location.setFullEnemiesList(game.getEnemies());
            levelUp.setVisible(true);
            levelUp.setBounds(300, 200, 430, 350);
        }
        game.fight.setEnemy(game.location.getCurrentEnemy());
        enemyIconLabel.setIcon(game.fight.getEnemy().getPhoto());
        enemyDamageValueLabel.setText(Integer.toString(game.fight.getEnemy().getDamage()));
        enemyHealthLabel.setText(Integer.toString(game.fight.getEnemy().getHealth()) + "/" + Integer.toString(game.fight.getEnemy().getMaxHealth()));
        enemyHeroLabel.setText(game.fight.getEnemy().getName());
        mediator.setHealthBar(game.fight.getEnemy());
        enemyHealthBar.setMaximum(game.fight.getEnemy().getMaxHealth());
        game.fight.newRound();

        mediator.setNewRoundTexts(game.fight.getHuman(), game.fight.getEnemy(), game.fight.getHuman().getItems());

        endFightDialog.dispose();
    }//GEN-LAST:event_nextRoundButtonActionPerformed

    private void enterNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNameFieldActionPerformed

    private void endGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endGameButtonActionPerformed
        try {
            game.endGameTop(game.fight.getHuman(), enterNameField, recordsTable);
        } catch (IOException ex) {
            Logger.getLogger(JFrames.class.getName()).log(Level.SEVERE, null, ex);
        }
        endGameDialog.dispose();
        enterNameField.setText("");
    }//GEN-LAST:event_endGameButtonActionPerformed

    private void closeRecordsTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeRecordsTableButtonActionPerformed
        recordsTableDialog.dispose();
    }//GEN-LAST:event_closeRecordsTableButtonActionPerformed

    private void seeResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeResultsButtonActionPerformed
        recordsTableDialog.setVisible(true);
        recordsTableDialog.setBounds(100, 100, 580, 450);
    }//GEN-LAST:event_seeResultsButtonActionPerformed

    private void endGameWithoutLadderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endGameWithoutLadderButtonActionPerformed
        endGameWithoutLadderDialog.dispose();
    }//GEN-LAST:event_endGameWithoutLadderButtonActionPerformed

    private void firstItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstItemButtonActionPerformed

    private void secondItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondItemButtonActionPerformed

    private void useItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useItemButtonActionPerformed
        if (firstItemButton.isSelected()) {
            nameButton = "First item";
        }
        if (secondItemButton.isSelected()) {
            nameButton = "Second item";
        }
        if (thirdItemButton.isSelected()) {
            nameButton = "Third item";
        }
        Human human = game.fight.getHuman();
        game.action.useItem(human, human.getItems(), nameButton, mediator);
        mediator.setHealthBar(human);
        playerHealthLabel.setText(human.getHealth() + "/" + human.getMaxHealth());
        mediator.setBagText(human.getItems());
    }//GEN-LAST:event_useItemButtonActionPerformed

    private void itemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsButtonActionPerformed
        itemsBagDialog.setVisible(true);
        itemsBagDialog.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_itemsButtonActionPerformed

    private void closeCantUseItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCantUseItemButtonActionPerformed
        cantUseItemDialog.dispose();
    }//GEN-LAST:event_closeCantUseItemButtonActionPerformed

    private void startWithLocationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startWithLocationsButtonActionPerformed
        setLocationsFrame.setVisible(false);
        locationsNumber = Integer.parseInt(setLocationsField.getText());
        locationLabel.setText("Текущая локация: " + game.location.getCurrentLocation() + "/" + locationsNumber);
        game.fight.setHuman(game.newHuman(mediator,items));
        game.location.setEnemiesAtLocation(game.fight.getHuman().getLevel());
        fightFrame.setVisible(true);
        fightFrame.setSize(1000, 700);
        if ((game.location.getCurrentEnemyNumber() + 1) <= game.location.getEnemiesAtLocation().size()) {
            enemyNumberLabel.setText("Номер противника: " + (game.location.getCurrentEnemyNumber() + 1) + "/" + game.location.getEnemiesAtLocation().size());
        } else {
            enemyNumberLabel.setText("Финальный босс локации!");
        }
        game.fight.setEnemy(game.location.getCurrentEnemy());
        enemyIconLabel.setIcon(game.fight.getEnemy().getPhoto());
        enemyDamageValueLabel.setText(Integer.toString(game.fight.getEnemy().getDamage()));
        enemyHealthLabel.setText(Integer.toString(game.fight.getEnemy().getHealth()) + "/" + Integer.toString(game.fight.getEnemy().getMaxHealth()));
        enemyHeroLabel.setText(game.fight.getEnemy().getName());
        mediator.setHealthBar(game.fight.getEnemy());
        enemyHealthBar.setMaximum(game.fight.getEnemy().getMaxHealth());

        game.fight.newRound();

        mediator.setNewRoundTexts(game.fight.getHuman(), game.fight.getEnemy(), game.fight.getHuman().getItems());

        endFightDialog.dispose();
    }//GEN-LAST:event_startWithLocationsButtonActionPerformed

    private void setLocationsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLocationsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setLocationsFieldActionPerformed

    private void healthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthButtonActionPerformed

    private void chooseAttributeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseAttributeButtonActionPerformed
        if (healthButton.isSelected()) {
            game.action.addHealthHuman(game.fight.getHuman());
        } else {
            game.action.addDamageHuman(game.fight.getHuman());
        }
        mediator.setNewRoundTexts(game.fight.getHuman(), game.fight.getEnemy(), game.fight.getHuman().getItems());
        levelUp.dispose();
    }//GEN-LAST:event_chooseAttributeButtonActionPerformed

    private void debuffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debuffButtonActionPerformed
        game.fight.hit(2, game.getResults(), game.fight.getHuman().getItems(), game.location, locationsNumber, game.getEnemies());
    }//GEN-LAST:event_debuffButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new JFrames().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attackButton;
    private javax.swing.JPanel attributePanel;
    private javax.swing.ButtonGroup attributesGroup;
    private javax.swing.JButton blockButton;
    private javax.swing.JDialog cantUseItemDialog;
    private javax.swing.JLabel cantUseItemLabel;
    private javax.swing.JPanel cantUseItemPanel;
    private javax.swing.JButton chooseAttributeButton;
    private javax.swing.JButton closeCantUseItemButton;
    private javax.swing.JButton closeRecordsTableButton;
    private javax.swing.JRadioButton damageButton;
    private javax.swing.JButton debuffButton;
    private javax.swing.JDialog endFightDialog;
    private javax.swing.JPanel endFightPanel;
    private javax.swing.JButton endGameButton;
    private javax.swing.JDialog endGameDialog;
    private javax.swing.JPanel endGamePanel;
    private javax.swing.JButton endGameWithoutLadderButton;
    private javax.swing.JDialog endGameWithoutLadderDialog;
    private javax.swing.JPanel endGameWithoutLadderPanel;
    private javax.swing.JLabel endGameWithoutLadderTitlleLabel;
    private javax.swing.JLabel endRoundLabel;
    private javax.swing.JLabel enemyActionLabel;
    private javax.swing.JLabel enemyDamageLabel;
    private javax.swing.JLabel enemyDamageValueLabel;
    private javax.swing.JLabel enemyDebuffLabel;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel enemyHealthLabel;
    private javax.swing.JLabel enemyHeroLabel;
    private javax.swing.JLabel enemyIconLabel;
    private javax.swing.JLabel enemyLevelLabel;
    private javax.swing.JLabel enemyNumberLabel;
    private javax.swing.JTextField enterNameField;
    private javax.swing.JLabel enterNameLabel;
    private javax.swing.JLabel enterNameLabelBottom;
    private javax.swing.JLabel experienceValueLabel;
    private javax.swing.JLabel experinceTitleLabel;
    private javax.swing.JFrame fightFrame;
    private javax.swing.JLabel fightLabel;
    private javax.swing.JPanel fightPanel;
    private javax.swing.JRadioButton firstItemButton;
    private javax.swing.JRadioButton healthButton;
    private javax.swing.JDialog itemsBagDialog;
    private javax.swing.JLabel itemsBagLabel;
    private javax.swing.JPanel itemsBagPanel;
    private javax.swing.JButton itemsButton;
    private javax.swing.ButtonGroup itemsGroup;
    public static javax.swing.JFrame levelUp;
    private javax.swing.JLabel levelUpLabel;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel mkLabel;
    private javax.swing.JButton nextRoundButton;
    private javax.swing.JLabel notInLadderLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel playerActionLabel;
    private javax.swing.JLabel playerDamageLabel;
    private javax.swing.JLabel playerDamageValueLabel;
    private javax.swing.JLabel playerDebuffLabel;
    private javax.swing.JProgressBar playerHealthBar;
    private javax.swing.JLabel playerHealthLabel;
    private javax.swing.JLabel playerHeroLabel;
    private javax.swing.JLabel playerIconLabel;
    private javax.swing.JLabel playerLevelLabel;
    private javax.swing.JLabel pointsTitleLabel;
    private javax.swing.JLabel pointsValueLabel;
    private javax.swing.JTable recordsTable;
    private javax.swing.JDialog recordsTableDialog;
    private javax.swing.JLabel recordsTableLabel;
    private javax.swing.JPanel recordsTablePanel;
    private javax.swing.JScrollPane recordsTableScrollPane;
    private javax.swing.JRadioButton secondItemButton;
    private javax.swing.JButton seeResultsButton;
    private javax.swing.JTextField setLocationsField;
    private javax.swing.JFrame setLocationsFrame;
    private javax.swing.JLabel setLocationsLabel;
    private javax.swing.JPanel setLocationsPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton startWithLocationsButton;
    private javax.swing.JLabel stunLabel;
    private javax.swing.JRadioButton thirdItemButton;
    private javax.swing.JLabel turnLabel;
    private javax.swing.JLabel unavailableItemLabel;
    private javax.swing.JButton useItemButton;
    private javax.swing.JLabel victoryLabel;
    // End of variables declaration//GEN-END:variables
}
