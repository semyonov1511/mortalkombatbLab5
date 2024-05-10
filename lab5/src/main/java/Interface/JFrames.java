package Interface;

import Actions.Game;
import Game_components.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class JFrames extends javax.swing.JFrame {

    Game game = new Game();
    Human human = null;
    Player enemy = null;
    ArrayList<Player> enemiesList = null;
    Items[] items = new Items[3];
    String nameButton = "";
    int locationsNumber = 0;
    public JFrames() {
        initComponents();
        game.WriteToTable(jTable1);
        game.action.setEnemies();
        game.location.setFullEnemiesList(game.action.getEnemies());
        PlayerIconLabel.setIcon(new ImageIcon("краб.jpg"));
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);

        items[0] = new Items("Малое зелье лечение", 0);
        items[1] = new Items("Большое зелье лечение", 0);
        items[2] = new Items("Крест возрождения", 0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FightFrame = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        PlayerIconLabel = new javax.swing.JLabel();
        AttackButton = new javax.swing.JButton();
        BlockButton = new javax.swing.JButton();
        PlayerHealthBar = new javax.swing.JProgressBar();
        EnemyIconLabel = new javax.swing.JLabel();
        EnemtyHealthBar = new javax.swing.JProgressBar();
        EnemyHeroLabel = new javax.swing.JLabel();
        EnemyDamageLabel = new javax.swing.JLabel();
        PlayerDamageLabel = new javax.swing.JLabel();
        PlayerDamageValueLabel = new javax.swing.JLabel();
        EnemyDamageValueLabel = new javax.swing.JLabel();
        PlayerLevelLabel = new javax.swing.JLabel();
        FightLabel = new javax.swing.JLabel();
        PlayerHealthLabel = new javax.swing.JLabel();
        EnemyHealthLabel = new javax.swing.JLabel();
        ExperinceTitleLabel = new javax.swing.JLabel();
        PointsTitleLabel = new javax.swing.JLabel();
        ExperienceValueLabel = new javax.swing.JLabel();
        PointsValueLabel = new javax.swing.JLabel();
        EnemyLevelLabel = new javax.swing.JLabel();
        TurnLabel = new javax.swing.JLabel();
        ActionMadeLabel = new javax.swing.JLabel();
        PlayerHeroLabel = new javax.swing.JLabel();
        StunLabel = new javax.swing.JLabel();
        ItemsButton = new javax.swing.JButton();
        LocationLabel = new javax.swing.JLabel();
        EnemyNumberLabel = new javax.swing.JLabel();
        EndFightDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        EndRoundLabel = new javax.swing.JLabel();
        NextRoundButton = new javax.swing.JButton();
        EndGameDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        RecordsTableDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        EndGameWithout = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        ItemsBagDialog = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton9 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        CantUseItemDialog = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        SetLocationsFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        SetLocationsLabel = new javax.swing.JLabel();
        SetLocationsField = new javax.swing.JTextField();
        StartWithLocationsButton = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        MKLabel = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        SeeResultsButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        AttackButton.setBackground(new java.awt.Color(255, 0, 0));
        AttackButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        AttackButton.setText("Атаковать");
        AttackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttackButtonActionPerformed(evt);
            }
        });

        BlockButton.setBackground(new java.awt.Color(255, 204, 0));
        BlockButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BlockButton.setText("Защититься");
        BlockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockButtonActionPerformed(evt);
            }
        });

        PlayerHealthBar.setBackground(new java.awt.Color(204, 204, 204));
        PlayerHealthBar.setForeground(new java.awt.Color(51, 255, 51));
        PlayerHealthBar.setMaximum(80);
        PlayerHealthBar.setMinimum(-1);

        EnemtyHealthBar.setBackground(new java.awt.Color(204, 204, 204));
        EnemtyHealthBar.setForeground(new java.awt.Color(0, 255, 0));
        EnemtyHealthBar.setMinimum(-1);

        EnemyHeroLabel.setBackground(new java.awt.Color(0, 0, 0));
        EnemyHeroLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        EnemyDamageLabel.setBackground(new java.awt.Color(255, 255, 255));
        EnemyDamageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        EnemyDamageLabel.setText("Damage");

        PlayerDamageLabel.setBackground(new java.awt.Color(255, 255, 255));
        PlayerDamageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        PlayerDamageLabel.setText("Damage");

        PlayerDamageValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        PlayerDamageValueLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        PlayerDamageValueLabel.setForeground(new java.awt.Color(255, 0, 0));
        PlayerDamageValueLabel.setText("16");

        EnemyDamageValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        EnemyDamageValueLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        EnemyDamageValueLabel.setForeground(new java.awt.Color(255, 0, 0));
        EnemyDamageValueLabel.setText("16");

        PlayerLevelLabel.setBackground(new java.awt.Color(255, 255, 255));
        PlayerLevelLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        PlayerLevelLabel.setText("0 уровень");

        FightLabel.setBackground(new java.awt.Color(255, 255, 255));
        FightLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        FightLabel.setForeground(new java.awt.Color(0, 0, 153));
        FightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FightLabel.setText("FIGHT");
        FightLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PlayerHealthLabel.setBackground(new java.awt.Color(255, 255, 255));
        PlayerHealthLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        PlayerHealthLabel.setForeground(new java.awt.Color(102, 102, 102));
        PlayerHealthLabel.setText("80/80");

        EnemyHealthLabel.setBackground(new java.awt.Color(255, 255, 255));
        EnemyHealthLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        EnemyHealthLabel.setForeground(new java.awt.Color(102, 102, 102));
        EnemyHealthLabel.setText("80/80");

        ExperinceTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        ExperinceTitleLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ExperinceTitleLabel.setForeground(new java.awt.Color(128, 92, 31));
        ExperinceTitleLabel.setText("experience");

        PointsTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        PointsTitleLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        PointsTitleLabel.setForeground(new java.awt.Color(128, 92, 31));
        PointsTitleLabel.setText("points");

        ExperienceValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        ExperienceValueLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ExperienceValueLabel.setForeground(new java.awt.Color(113, 90, 16));
        ExperienceValueLabel.setText("0/40");

        PointsValueLabel.setBackground(new java.awt.Color(255, 255, 255));
        PointsValueLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        PointsValueLabel.setForeground(new java.awt.Color(113, 90, 16));
        PointsValueLabel.setText("00");

        EnemyLevelLabel.setBackground(new java.awt.Color(255, 255, 255));
        EnemyLevelLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        EnemyLevelLabel.setText("1 уровень");

        TurnLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        TurnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ActionMadeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ActionMadeLabel.setForeground(new java.awt.Color(204, 0, 0));
        ActionMadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        PlayerHeroLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        PlayerHeroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerHeroLabel.setText("Crab");

        StunLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        StunLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ItemsButton.setBackground(new java.awt.Color(174, 183, 106));
        ItemsButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ItemsButton.setText("Предметы");
        ItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemsButtonActionPerformed(evt);
            }
        });

        LocationLabel.setText("Текущая локация:");

        EnemyNumberLabel.setText("Номер противника:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(EnemtyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(PointsTitleLabel))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EnemyHealthLabel)
                                                .addGap(62, 62, 62)
                                                .addComponent(PointsValueLabel)
                                                .addGap(108, 108, 108)
                                                .addComponent(ExperienceValueLabel))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(EnemyDamageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EnemyDamageValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(EnemyHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(EnemyIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(TurnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ActionMadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(StunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EnemyNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PlayerLevelLabel)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(PlayerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(PlayerHealthLabel))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(PlayerDamageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PlayerDamageValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PlayerIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PlayerHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(AttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(BlockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExperinceTitleLabel))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(EnemyLevelLabel)
                    .addContainerGap(854, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(FightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PlayerHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(EnemtyHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(PlayerHealthLabel))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExperinceTitleLabel)
                            .addComponent(PointsTitleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExperienceValueLabel)
                            .addComponent(PointsValueLabel)
                            .addComponent(EnemyHealthLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerDamageLabel)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EnemyDamageLabel)
                        .addComponent(EnemyDamageValueLabel)
                        .addComponent(PlayerDamageValueLabel)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(EnemyIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EnemyHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnemyNumberLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(PlayerLevelLabel)
                                .addGap(7, 7, 7)
                                .addComponent(PlayerIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(ActionMadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TurnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(StunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(PlayerHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AttackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(BlockButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(EnemyLevelLabel)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FightFrameLayout = new javax.swing.GroupLayout(FightFrame.getContentPane());
        FightFrame.getContentPane().setLayout(FightFrameLayout);
        FightFrameLayout.setHorizontalGroup(
            FightFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FightFrameLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FightFrameLayout.setVerticalGroup(
            FightFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(179, 226, 217));

        EndRoundLabel.setBackground(new java.awt.Color(204, 204, 204));
        EndRoundLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 42)); // NOI18N
        EndRoundLabel.setForeground(new java.awt.Color(204, 0, 0));
        EndRoundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EndRoundLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        NextRoundButton.setBackground(new java.awt.Color(114, 218, 142));
        NextRoundButton.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        NextRoundButton.setText("Дальше");
        NextRoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextRoundButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(NextRoundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(EndRoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(EndRoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(NextRoundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout EndFightDialogLayout = new javax.swing.GroupLayout(EndFightDialog.getContentPane());
        EndFightDialog.getContentPane().setLayout(EndFightDialogLayout);
        EndFightDialogLayout.setHorizontalGroup(
            EndFightDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndFightDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EndFightDialogLayout.setVerticalGroup(
            EndFightDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndFightDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Победа на вашей стороне");

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Введите имя своего персонажа для добавления");

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("результата в таблицу рекордов");

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("Закончить игру");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(14, 14, 14))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel22))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout EndGameDialogLayout = new javax.swing.GroupLayout(EndGameDialog.getContentPane());
        EndGameDialog.getContentPane().setLayout(EndGameDialogLayout);
        EndGameDialogLayout.setHorizontalGroup(
            EndGameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndGameDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EndGameDialogLayout.setVerticalGroup(
            EndGameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndGameDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Таблица рекордов");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton7.setBackground(new java.awt.Color(255, 255, 153));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setText("Закрыть");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout RecordsTableDialogLayout = new javax.swing.GroupLayout(RecordsTableDialog.getContentPane());
        RecordsTableDialog.getContentPane().setLayout(RecordsTableDialogLayout);
        RecordsTableDialogLayout.setHorizontalGroup(
            RecordsTableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RecordsTableDialogLayout.setVerticalGroup(
            RecordsTableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Победа на вашей стороне");

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("К сожалению, Ваш результат не попал в топ 10");

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 51));
        jButton8.setText("Закончить игру");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EndGameWithoutLayout = new javax.swing.GroupLayout(EndGameWithout.getContentPane());
        EndGameWithout.getContentPane().setLayout(EndGameWithoutLayout);
        EndGameWithoutLayout.setHorizontalGroup(
            EndGameWithoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EndGameWithoutLayout.setVerticalGroup(
            EndGameWithoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(190, 182, 135));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Мешок предметов");

        jRadioButton1.setBackground(new java.awt.Color(190, 182, 135));
        jRadioButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jRadioButton1.setText("Малое зелье лечение, 0 шт");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(190, 182, 135));
        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jRadioButton2.setText("Большое зелье лечение, 0 шт");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(190, 182, 135));
        jRadioButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jRadioButton3.setText("Крест возрождения, 0 шт");

        jButton9.setBackground(new java.awt.Color(239, 237, 14));
        jButton9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton9.setText("Использовать");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton9)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addGap(50, 50, 50)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ItemsBagDialogLayout = new javax.swing.GroupLayout(ItemsBagDialog.getContentPane());
        ItemsBagDialog.getContentPane().setLayout(ItemsBagDialogLayout);
        ItemsBagDialogLayout.setHorizontalGroup(
            ItemsBagDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ItemsBagDialogLayout.setVerticalGroup(
            ItemsBagDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(243, 120, 120));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Вы не можете использовать ");

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("этот предмет");

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 51, 51));
        jButton11.setText("ОК");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout CantUseItemDialogLayout = new javax.swing.GroupLayout(CantUseItemDialog.getContentPane());
        CantUseItemDialog.getContentPane().setLayout(CantUseItemDialogLayout);
        CantUseItemDialogLayout.setHorizontalGroup(
            CantUseItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CantUseItemDialogLayout.setVerticalGroup(
            CantUseItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SetLocationsLabel.setText("Введите количество локаций, которое хотите пройти");

        StartWithLocationsButton.setText("Начать игру");
        StartWithLocationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartWithLocationsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(SetLocationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(SetLocationsField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StartWithLocationsButton)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(SetLocationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetLocationsField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartWithLocationsButton))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout SetLocationsFrameLayout = new javax.swing.GroupLayout(SetLocationsFrame.getContentPane());
        SetLocationsFrame.getContentPane().setLayout(SetLocationsFrameLayout);
        SetLocationsFrameLayout.setHorizontalGroup(
            SetLocationsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetLocationsFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SetLocationsFrameLayout.setVerticalGroup(
            SetLocationsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetLocationsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        MKLabel.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        MKLabel.setForeground(new java.awt.Color(204, 204, 0));
        MKLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MKLabel.setText("Mortal Kombat");

        StartButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        StartButton.setText("Начать новую игру");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        SeeResultsButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        SeeResultsButton.setText("Посмотреть таблицу \nрезультатов");
        SeeResultsButton.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SeeResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeResultsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(SeeResultsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(MKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(MKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeeResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        SetLocationsFrame.setVisible(rootPaneCheckingEnabled);
        SetLocationsFrame.setSize(1000, 700);
    }//GEN-LAST:event_StartButtonActionPerformed

    private void AttackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttackButtonActionPerformed
        game.fight.Hit(human, enemy, 1, EnemyHealthLabel, PlayerHealthLabel, EndFightDialog,
                EndRoundLabel, game.action, PlayerHealthBar, EnemtyHealthBar, EndGameDialog,
                EndGameWithout, FightFrame, game.getResults(), jLabel20, jLabel24,
                TurnLabel, StunLabel, ActionMadeLabel, items, jRadioButton3, game.location);

    }//GEN-LAST:event_AttackButtonActionPerformed

    private void BlockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockButtonActionPerformed
        game.fight.Hit(human, enemy, 0, EnemyHealthLabel, PlayerHealthLabel, EndFightDialog,
                EndRoundLabel, game.action, PlayerHealthBar, EnemtyHealthBar, EndGameDialog,
                EndGameWithout, FightFrame, game.getResults(), jLabel20, jLabel24,
                TurnLabel, StunLabel, ActionMadeLabel, items, jRadioButton3, game.location);
    }//GEN-LAST:event_BlockButtonActionPerformed

    private void NextRoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextRoundButtonActionPerformed
        game.location.setEnemiesAtLocation(human.getLevel());
        LocationLabel.setText("Текущая локация: " + game.location.getCurrentLocation());
    }//GEN-LAST:event_NextRoundButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            game.EndGameTop(human, jTextField1, jTable1);
        } catch (IOException ex) {
            Logger.getLogger(JFrames.class.getName()).log(Level.SEVERE, null, ex);
        }
        EndGameDialog.dispose();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        RecordsTableDialog.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void SeeResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeResultsButtonActionPerformed
        RecordsTableDialog.setVisible(true);
        RecordsTableDialog.setBounds(100, 100, 580, 450);
    }//GEN-LAST:event_SeeResultsButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        EndGameWithout.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jRadioButton1.isSelected()) {
            nameButton = "jRadioButton1";
        }
        if (jRadioButton2.isSelected()) {
            nameButton = "jRadioButton2";
        }
        if (jRadioButton3.isSelected()) {
            nameButton = "jRadioButton3";
        }
        game.action.UseItem(human, items, nameButton, CantUseItemDialog, ItemsBagDialog);
        game.action.HP(human, PlayerHealthBar);
        PlayerHealthLabel.setText(human.getHealth() + "/" + human.getMaxHealth());
        game.change.BagText(items, jRadioButton1, jRadioButton2, jRadioButton3);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void ItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemsButtonActionPerformed
        ItemsBagDialog.setVisible(true);
        ItemsBagDialog.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_ItemsButtonActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        CantUseItemDialog.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void StartWithLocationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartWithLocationsButtonActionPerformed
        human = game.NewHuman(PlayerHealthBar);
        game.location.setEnemiesAtLocation(0);
        FightFrame.setVisible(rootPaneCheckingEnabled);
        FightFrame.setSize(1000, 700);
        if ((game.location.getCurrentEnemyNumber() + 1) <= game.location.getEnemiesAtLocation().size()) {
            EnemyNumberLabel.setText("Номер противника: " + (game.location.getCurrentEnemyNumber() + 1) + "/" + game.location.getEnemiesAtLocation().size());
        }
        else {
            EnemyNumberLabel.setText("Финальный босс локации!");
        }
        enemy = game.location.getCurrentEnemy();
        EnemyIconLabel.setIcon(enemy.getPhoto());
        EnemyDamageValueLabel.setText(Integer.toString(enemy.getDamage()));
        EnemyHealthLabel.setText(Integer.toString(enemy.getHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        EnemyHeroLabel.setText(enemy.getName());
        game.action.HP(enemy, EnemtyHealthBar);
        EnemtyHealthBar.setMaximum(enemy.getMaxHealth());

        game.fight.NewRound(human, enemy, PlayerHealthBar, EnemtyHealthBar, game.action);

        game.change.NewRoundTexts(human, enemy, PlayerHealthBar, EnemtyHealthBar,
                PointsValueLabel, ExperienceValueLabel, PlayerLevelLabel, EnemyLevelLabel, PlayerHealthLabel, EnemyHealthLabel, PlayerDamageValueLabel,
                TurnLabel, ActionMadeLabel, game.fight.i, items, jRadioButton1, jRadioButton2, jRadioButton3);

        EndFightDialog.dispose();
    }//GEN-LAST:event_StartWithLocationsButtonActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActionMadeLabel;
    private javax.swing.JButton AttackButton;
    private javax.swing.JButton BlockButton;
    private javax.swing.JDialog CantUseItemDialog;
    private javax.swing.JDialog EndFightDialog;
    private javax.swing.JDialog EndGameDialog;
    private javax.swing.JDialog EndGameWithout;
    private javax.swing.JLabel EndRoundLabel;
    private javax.swing.JProgressBar EnemtyHealthBar;
    private javax.swing.JLabel EnemyDamageLabel;
    private javax.swing.JLabel EnemyDamageValueLabel;
    private javax.swing.JLabel EnemyHealthLabel;
    private javax.swing.JLabel EnemyHeroLabel;
    private javax.swing.JLabel EnemyIconLabel;
    private javax.swing.JLabel EnemyLevelLabel;
    private javax.swing.JLabel EnemyNumberLabel;
    private javax.swing.JLabel ExperienceValueLabel;
    private javax.swing.JLabel ExperinceTitleLabel;
    private javax.swing.JFrame FightFrame;
    private javax.swing.JLabel FightLabel;
    private javax.swing.JDialog ItemsBagDialog;
    private javax.swing.JButton ItemsButton;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JLabel MKLabel;
    private javax.swing.JButton NextRoundButton;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel PlayerDamageLabel;
    private javax.swing.JLabel PlayerDamageValueLabel;
    private javax.swing.JProgressBar PlayerHealthBar;
    private javax.swing.JLabel PlayerHealthLabel;
    private javax.swing.JLabel PlayerHeroLabel;
    private javax.swing.JLabel PlayerIconLabel;
    private javax.swing.JLabel PlayerLevelLabel;
    private javax.swing.JLabel PointsTitleLabel;
    private javax.swing.JLabel PointsValueLabel;
    private javax.swing.JDialog RecordsTableDialog;
    private javax.swing.JButton SeeResultsButton;
    private javax.swing.JTextField SetLocationsField;
    private javax.swing.JFrame SetLocationsFrame;
    private javax.swing.JLabel SetLocationsLabel;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton StartWithLocationsButton;
    private javax.swing.JLabel StunLabel;
    private javax.swing.JLabel TurnLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
