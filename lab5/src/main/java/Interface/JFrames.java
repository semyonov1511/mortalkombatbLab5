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
    Human human = null;
    Player enemy = null;
    ArrayList<Player> enemiesList = null;
    Items[] items = new Items[3];
    String nameButton = "";
    int locationsNumber = 0;

    public JFrames() {
        initComponents();
        game.WriteToTable(RecordsTable);
        game.setEnemies();
        game.location.setFullEnemiesList(game.getEnemies());
        PlayerIconLabel.setIcon(new ImageIcon("crab.jpg"));
        AttributesGroup.add(HealthButton);
        AttributesGroup.add(DamageButton);
        ItemsGroup.add(FirstItemButton);
        ItemsGroup.add(SecondItemButton);
        ItemsGroup.add(ThirdItemButton);
        items[0] = new Items("Малое зелье лечение", 0);
        items[1] = new Items("Большое зелье лечение", 0);
        items[2] = new Items("Крест возрождения", 0);
        mediator = new Mediator(EnemyHealthLabel, PlayerHealthLabel, EndFightDialog, PointsValueLabel, ExperienceValueLabel,
                PlayerLevelLabel, EnemyLevelLabel, PlayerDamageValueLabel, EndRoundLabel, PlayerHealthBar,
                EnemyHealthBar, EndGameDialog, EndGameWithoutLadderDialog, FightFrame, EnemyDebuffLabel,
                VictoryLabel, EndGameWithoutLadderTitlleLabel, PlayerActionLabel, PlayerDebuffLabel, EnemyActionLabel,
                FirstItemButton, SecondItemButton, ThirdItemButton, EnterNameField, RecordsTable,
                CantUseItemDialog, ItemsBagDialog);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FightFrame = new javax.swing.JFrame();
        FightPanel = new javax.swing.JPanel();
        PlayerIconLabel = new javax.swing.JLabel();
        AttackButton = new javax.swing.JButton();
        BlockButton = new javax.swing.JButton();
        PlayerHealthBar = new javax.swing.JProgressBar();
        EnemyIconLabel = new javax.swing.JLabel();
        EnemyHealthBar = new javax.swing.JProgressBar();
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
        EnemyActionLabel = new javax.swing.JLabel();
        PlayerHeroLabel = new javax.swing.JLabel();
        StunLabel = new javax.swing.JLabel();
        ItemsButton = new javax.swing.JButton();
        LocationLabel = new javax.swing.JLabel();
        EnemyNumberLabel = new javax.swing.JLabel();
        PlayerActionLabel = new javax.swing.JLabel();
        EnemyDebuffLabel = new javax.swing.JLabel();
        DebuffButton = new javax.swing.JButton();
        PlayerDebuffLabel = new javax.swing.JLabel();
        EndFightDialog = new javax.swing.JDialog();
        EndFightPanel = new javax.swing.JPanel();
        EndRoundLabel = new javax.swing.JLabel();
        NextRoundButton = new javax.swing.JButton();
        EndGameDialog = new javax.swing.JDialog();
        EndGamePanel = new javax.swing.JPanel();
        VictoryLabel = new javax.swing.JLabel();
        EnterNameField = new javax.swing.JTextField();
        EnterNameLabel = new javax.swing.JLabel();
        EnterNameLabelBottom = new javax.swing.JLabel();
        EndGameButton = new javax.swing.JButton();
        RecordsTableDialog = new javax.swing.JDialog();
        RecordsTablePanel = new javax.swing.JPanel();
        RecordsTableLabel = new javax.swing.JLabel();
        RecordsTableScrollPane = new javax.swing.JScrollPane();
        RecordsTable = new javax.swing.JTable();
        CloseRecordsTableButton = new javax.swing.JButton();
        EndGameWithoutLadderDialog = new javax.swing.JDialog();
        EndGameWithoutLadderPanel = new javax.swing.JPanel();
        EndGameWithoutLadderTitlleLabel = new javax.swing.JLabel();
        NotInLadderLabel = new javax.swing.JLabel();
        EndGameWithoutLadderButton = new javax.swing.JButton();
        ItemsBagDialog = new javax.swing.JDialog();
        ItemsBagPanel = new javax.swing.JPanel();
        ItemsBagLabel = new javax.swing.JLabel();
        FirstItemButton = new javax.swing.JRadioButton();
        SecondItemButton = new javax.swing.JRadioButton();
        ThirdItemButton = new javax.swing.JRadioButton();
        UseItemButton = new javax.swing.JButton();
        ItemsGroup = new javax.swing.ButtonGroup();
        CantUseItemDialog = new javax.swing.JDialog();
        CantUseItemPanel = new javax.swing.JPanel();
        CantUseItemLabel = new javax.swing.JLabel();
        UnavailableItemLabel = new javax.swing.JLabel();
        CloseCantUseItemButton = new javax.swing.JButton();
        SetLocationsFrame = new javax.swing.JFrame();
        SetLocationsPanel = new javax.swing.JPanel();
        SetLocationsLabel = new javax.swing.JLabel();
        SetLocationsField = new javax.swing.JTextField();
        StartWithLocationsButton = new javax.swing.JButton();
        LevelUp = new javax.swing.JFrame();
        AttributePanel = new javax.swing.JPanel();
        LevelUpLabel = new javax.swing.JLabel();
        HealthButton = new javax.swing.JRadioButton();
        DamageButton = new javax.swing.JRadioButton();
        ChooseAttributeButton = new javax.swing.JButton();
        AttributesGroup = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        MKLabel = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        SeeResultsButton = new javax.swing.JButton();

        FightPanel.setBackground(new java.awt.Color(255, 255, 255));

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

        EnemyHealthBar.setBackground(new java.awt.Color(204, 204, 204));
        EnemyHealthBar.setForeground(new java.awt.Color(0, 255, 0));
        EnemyHealthBar.setMinimum(-1);

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

        EnemyActionLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        EnemyActionLabel.setForeground(new java.awt.Color(204, 0, 0));
        EnemyActionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        PlayerActionLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        PlayerActionLabel.setForeground(new java.awt.Color(204, 0, 0));
        PlayerActionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        DebuffButton.setBackground(new java.awt.Color(51, 51, 255));
        DebuffButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        DebuffButton.setText("Дебаффнуть");
        DebuffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebuffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FightPanelLayout = new javax.swing.GroupLayout(FightPanel);
        FightPanel.setLayout(FightPanelLayout);
        FightPanelLayout.setHorizontalGroup(
            FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FightPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FightPanelLayout.createSequentialGroup()
                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FightPanelLayout.createSequentialGroup()
                                .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(FightPanelLayout.createSequentialGroup()
                                            .addComponent(EnemyDamageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(EnemyDamageValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(FightPanelLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(EnemyHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(FightPanelLayout.createSequentialGroup()
                                            .addComponent(EnemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(FightPanelLayout.createSequentialGroup()
                                                    .addGap(92, 92, 92)
                                                    .addComponent(PointsTitleLabel))
                                                .addGroup(FightPanelLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(EnemyHealthLabel)
                                                    .addGap(62, 62, 62)
                                                    .addComponent(PointsValueLabel)
                                                    .addGap(108, 108, 108)
                                                    .addComponent(ExperienceValueLabel))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FightPanelLayout.createSequentialGroup()
                                            .addComponent(EnemyDebuffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(129, 129, 129)))
                                    .addGroup(FightPanelLayout.createSequentialGroup()
                                        .addComponent(EnemyIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FightPanelLayout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(TurnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(FightPanelLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(EnemyActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(StunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(PlayerActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)))))
                                .addGap(28, 28, 28))
                            .addGroup(FightPanelLayout.createSequentialGroup()
                                .addComponent(LocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EnemyNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FightPanelLayout.createSequentialGroup()
                                .addComponent(PlayerDebuffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PlayerLevelLabel)
                                .addGap(26, 26, 26))
                            .addGroup(FightPanelLayout.createSequentialGroup()
                                .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FightPanelLayout.createSequentialGroup()
                                        .addComponent(PlayerHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(PlayerHealthLabel))
                                    .addGroup(FightPanelLayout.createSequentialGroup()
                                        .addComponent(PlayerDamageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PlayerDamageValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45))
                            .addGroup(FightPanelLayout.createSequentialGroup()
                                .addComponent(PlayerIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(FightPanelLayout.createSequentialGroup()
                                .addComponent(PlayerHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FightPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(BlockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(DebuffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(FightPanelLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExperinceTitleLabel))
                        .addContainerGap())))
            .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FightPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(EnemyLevelLabel)
                    .addContainerGap(854, Short.MAX_VALUE)))
        );
        FightPanelLayout.setVerticalGroup(
            FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FightPanelLayout.createSequentialGroup()
                .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FightPanelLayout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(FightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExperinceTitleLabel)
                            .addComponent(PointsTitleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExperienceValueLabel)
                            .addComponent(PointsValueLabel)
                            .addComponent(EnemyHealthLabel)))
                    .addGroup(FightPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PlayerHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(EnemyHealthBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(FightPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(PlayerHealthLabel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerDamageLabel)
                    .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EnemyDamageLabel)
                        .addComponent(EnemyDamageValueLabel)
                        .addComponent(PlayerDamageValueLabel)))
                .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FightPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(EnemyDebuffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnemyIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EnemyHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnemyNumberLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FightPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FightPanelLayout.createSequentialGroup()
                                .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PlayerLevelLabel)
                                    .addComponent(PlayerDebuffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(PlayerIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FightPanelLayout.createSequentialGroup()
                                .addComponent(EnemyActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PlayerActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(TurnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(StunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(PlayerHeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BlockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DebuffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
            .addGroup(FightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FightPanelLayout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(EnemyLevelLabel)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FightFrameLayout = new javax.swing.GroupLayout(FightFrame.getContentPane());
        FightFrame.getContentPane().setLayout(FightFrameLayout);
        FightFrameLayout.setHorizontalGroup(
            FightFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FightFrameLayout.createSequentialGroup()
                .addComponent(FightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        FightFrameLayout.setVerticalGroup(
            FightFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FightPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EndFightPanel.setBackground(new java.awt.Color(179, 226, 217));

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

        javax.swing.GroupLayout EndFightPanelLayout = new javax.swing.GroupLayout(EndFightPanel);
        EndFightPanel.setLayout(EndFightPanelLayout);
        EndFightPanelLayout.setHorizontalGroup(
            EndFightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndFightPanelLayout.createSequentialGroup()
                .addGroup(EndFightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EndFightPanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(NextRoundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EndFightPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(EndRoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        EndFightPanelLayout.setVerticalGroup(
            EndFightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndFightPanelLayout.createSequentialGroup()
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
                .addComponent(EndFightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EndFightDialogLayout.setVerticalGroup(
            EndFightDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndFightDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EndFightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        EndGamePanel.setBackground(new java.awt.Color(255, 204, 255));

        VictoryLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        VictoryLabel.setForeground(new java.awt.Color(255, 0, 0));
        VictoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VictoryLabel.setText("Победа на вашей стороне");

        EnterNameField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        EnterNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnterNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterNameFieldActionPerformed(evt);
            }
        });

        EnterNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        EnterNameLabel.setForeground(new java.awt.Color(102, 102, 102));
        EnterNameLabel.setText("Введите имя своего персонажа для добавления");

        EnterNameLabelBottom.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        EnterNameLabelBottom.setForeground(new java.awt.Color(102, 102, 102));
        EnterNameLabelBottom.setText("результата в таблицу рекордов");

        EndGameButton.setBackground(new java.awt.Color(153, 153, 255));
        EndGameButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        EndGameButton.setForeground(new java.awt.Color(51, 51, 51));
        EndGameButton.setText("Закончить игру");
        EndGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EndGamePanelLayout = new javax.swing.GroupLayout(EndGamePanel);
        EndGamePanel.setLayout(EndGamePanelLayout);
        EndGamePanelLayout.setHorizontalGroup(
            EndGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EndGamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EndGameButton)
                .addGap(14, 14, 14))
            .addGroup(EndGamePanelLayout.createSequentialGroup()
                .addGroup(EndGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EndGamePanelLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(EnterNameLabelBottom))
                    .addGroup(EndGamePanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(VictoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EndGamePanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(EndGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnterNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterNameLabel))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        EndGamePanelLayout.setVerticalGroup(
            EndGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndGamePanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(VictoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EnterNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterNameLabelBottom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(EnterNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EndGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout EndGameDialogLayout = new javax.swing.GroupLayout(EndGameDialog.getContentPane());
        EndGameDialog.getContentPane().setLayout(EndGameDialogLayout);
        EndGameDialogLayout.setHorizontalGroup(
            EndGameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndGameDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EndGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EndGameDialogLayout.setVerticalGroup(
            EndGameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndGameDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EndGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        RecordsTablePanel.setBackground(new java.awt.Color(204, 204, 255));

        RecordsTableLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        RecordsTableLabel.setForeground(new java.awt.Color(51, 51, 51));
        RecordsTableLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RecordsTableLabel.setText("Таблица рекордов");

        RecordsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        RecordsTableScrollPane.setViewportView(RecordsTable);

        CloseRecordsTableButton.setBackground(new java.awt.Color(255, 255, 153));
        CloseRecordsTableButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        CloseRecordsTableButton.setForeground(new java.awt.Color(51, 51, 51));
        CloseRecordsTableButton.setText("Закрыть");
        CloseRecordsTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseRecordsTableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RecordsTablePanelLayout = new javax.swing.GroupLayout(RecordsTablePanel);
        RecordsTablePanel.setLayout(RecordsTablePanelLayout);
        RecordsTablePanelLayout.setHorizontalGroup(
            RecordsTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecordsTablePanelLayout.createSequentialGroup()
                .addGroup(RecordsTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CloseRecordsTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RecordsTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RecordsTablePanelLayout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(RecordsTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(RecordsTablePanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(RecordsTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        RecordsTablePanelLayout.setVerticalGroup(
            RecordsTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecordsTablePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(RecordsTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RecordsTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CloseRecordsTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout RecordsTableDialogLayout = new javax.swing.GroupLayout(RecordsTableDialog.getContentPane());
        RecordsTableDialog.getContentPane().setLayout(RecordsTableDialogLayout);
        RecordsTableDialogLayout.setHorizontalGroup(
            RecordsTableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RecordsTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RecordsTableDialogLayout.setVerticalGroup(
            RecordsTableDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RecordsTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EndGameWithoutLadderPanel.setBackground(new java.awt.Color(255, 204, 255));

        EndGameWithoutLadderTitlleLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        EndGameWithoutLadderTitlleLabel.setForeground(new java.awt.Color(255, 0, 0));
        EndGameWithoutLadderTitlleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EndGameWithoutLadderTitlleLabel.setText("Победа на вашей стороне");

        NotInLadderLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NotInLadderLabel.setForeground(new java.awt.Color(102, 102, 102));
        NotInLadderLabel.setText("К сожалению, Ваш результат не попал в топ 10");

        EndGameWithoutLadderButton.setBackground(new java.awt.Color(153, 153, 255));
        EndGameWithoutLadderButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        EndGameWithoutLadderButton.setForeground(new java.awt.Color(51, 51, 51));
        EndGameWithoutLadderButton.setText("Закончить игру");
        EndGameWithoutLadderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndGameWithoutLadderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EndGameWithoutLadderPanelLayout = new javax.swing.GroupLayout(EndGameWithoutLadderPanel);
        EndGameWithoutLadderPanel.setLayout(EndGameWithoutLadderPanelLayout);
        EndGameWithoutLadderPanelLayout.setHorizontalGroup(
            EndGameWithoutLadderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndGameWithoutLadderPanelLayout.createSequentialGroup()
                .addGroup(EndGameWithoutLadderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EndGameWithoutLadderPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(EndGameWithoutLadderTitlleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EndGameWithoutLadderPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(NotInLadderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EndGameWithoutLadderPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(EndGameWithoutLadderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        EndGameWithoutLadderPanelLayout.setVerticalGroup(
            EndGameWithoutLadderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EndGameWithoutLadderPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(EndGameWithoutLadderTitlleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(NotInLadderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(EndGameWithoutLadderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EndGameWithoutLadderDialogLayout = new javax.swing.GroupLayout(EndGameWithoutLadderDialog.getContentPane());
        EndGameWithoutLadderDialog.getContentPane().setLayout(EndGameWithoutLadderDialogLayout);
        EndGameWithoutLadderDialogLayout.setHorizontalGroup(
            EndGameWithoutLadderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EndGameWithoutLadderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EndGameWithoutLadderDialogLayout.setVerticalGroup(
            EndGameWithoutLadderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EndGameWithoutLadderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ItemsBagPanel.setBackground(new java.awt.Color(190, 182, 135));

        ItemsBagLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        ItemsBagLabel.setForeground(new java.awt.Color(51, 51, 51));
        ItemsBagLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ItemsBagLabel.setText("Мешок предметов");

        FirstItemButton.setBackground(new java.awt.Color(190, 182, 135));
        FirstItemButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        FirstItemButton.setText("Малое зелье лечение, 0 шт");
        FirstItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstItemButtonActionPerformed(evt);
            }
        });

        SecondItemButton.setBackground(new java.awt.Color(190, 182, 135));
        SecondItemButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        SecondItemButton.setText("Большое зелье лечение, 0 шт");
        SecondItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondItemButtonActionPerformed(evt);
            }
        });

        ThirdItemButton.setBackground(new java.awt.Color(190, 182, 135));
        ThirdItemButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ThirdItemButton.setText("Крест возрождения, 0 шт");

        UseItemButton.setBackground(new java.awt.Color(239, 237, 14));
        UseItemButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        UseItemButton.setText("Использовать");
        UseItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ItemsBagPanelLayout = new javax.swing.GroupLayout(ItemsBagPanel);
        ItemsBagPanel.setLayout(ItemsBagPanelLayout);
        ItemsBagPanelLayout.setHorizontalGroup(
            ItemsBagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsBagPanelLayout.createSequentialGroup()
                .addGroup(ItemsBagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItemsBagPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(ItemsBagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SecondItemButton)
                            .addComponent(ThirdItemButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstItemButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemsBagLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ItemsBagPanelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(UseItemButton)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        ItemsBagPanelLayout.setVerticalGroup(
            ItemsBagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsBagPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ItemsBagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(FirstItemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecondItemButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThirdItemButton)
                .addGap(50, 50, 50)
                .addComponent(UseItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ItemsBagDialogLayout = new javax.swing.GroupLayout(ItemsBagDialog.getContentPane());
        ItemsBagDialog.getContentPane().setLayout(ItemsBagDialogLayout);
        ItemsBagDialogLayout.setHorizontalGroup(
            ItemsBagDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ItemsBagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ItemsBagDialogLayout.setVerticalGroup(
            ItemsBagDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ItemsBagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CantUseItemPanel.setBackground(new java.awt.Color(243, 120, 120));

        CantUseItemLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        CantUseItemLabel.setForeground(new java.awt.Color(51, 51, 51));
        CantUseItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CantUseItemLabel.setText("Вы не можете использовать ");

        UnavailableItemLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        UnavailableItemLabel.setForeground(new java.awt.Color(51, 51, 51));
        UnavailableItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UnavailableItemLabel.setText("этот предмет");

        CloseCantUseItemButton.setBackground(new java.awt.Color(204, 204, 204));
        CloseCantUseItemButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        CloseCantUseItemButton.setForeground(new java.awt.Color(51, 51, 51));
        CloseCantUseItemButton.setText("ОК");
        CloseCantUseItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseCantUseItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CantUseItemPanelLayout = new javax.swing.GroupLayout(CantUseItemPanel);
        CantUseItemPanel.setLayout(CantUseItemPanelLayout);
        CantUseItemPanelLayout.setHorizontalGroup(
            CantUseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CantUseItemPanelLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(CantUseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CantUseItemPanelLayout.createSequentialGroup()
                        .addComponent(CantUseItemLabel)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CantUseItemPanelLayout.createSequentialGroup()
                        .addComponent(UnavailableItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
            .addGroup(CantUseItemPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(CloseCantUseItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CantUseItemPanelLayout.setVerticalGroup(
            CantUseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CantUseItemPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(CantUseItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UnavailableItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(CloseCantUseItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout CantUseItemDialogLayout = new javax.swing.GroupLayout(CantUseItemDialog.getContentPane());
        CantUseItemDialog.getContentPane().setLayout(CantUseItemDialogLayout);
        CantUseItemDialogLayout.setHorizontalGroup(
            CantUseItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CantUseItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CantUseItemDialogLayout.setVerticalGroup(
            CantUseItemDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CantUseItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SetLocationsLabel.setText("Введите количество локаций, которое хотите пройти");

        SetLocationsField.setText("3");
        SetLocationsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetLocationsFieldActionPerformed(evt);
            }
        });

        StartWithLocationsButton.setText("Начать игру");
        StartWithLocationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartWithLocationsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SetLocationsPanelLayout = new javax.swing.GroupLayout(SetLocationsPanel);
        SetLocationsPanel.setLayout(SetLocationsPanelLayout);
        SetLocationsPanelLayout.setHorizontalGroup(
            SetLocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetLocationsPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(SetLocationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(SetLocationsPanelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(SetLocationsField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StartWithLocationsButton)
                .addGap(18, 18, 18))
        );
        SetLocationsPanelLayout.setVerticalGroup(
            SetLocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetLocationsPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(SetLocationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(SetLocationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(SetLocationsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SetLocationsFrameLayout.setVerticalGroup(
            SetLocationsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetLocationsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SetLocationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        LevelUpLabel.setText("Какой параметр улучшить?");

        HealthButton.setText("Здоровье");
        HealthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthButtonActionPerformed(evt);
            }
        });

        DamageButton.setSelected(true);
        DamageButton.setText("Урон");

        ChooseAttributeButton.setText("ОК");
        ChooseAttributeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseAttributeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AttributePanelLayout = new javax.swing.GroupLayout(AttributePanel);
        AttributePanel.setLayout(AttributePanelLayout);
        AttributePanelLayout.setHorizontalGroup(
            AttributePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttributePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(HealthButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DamageButton)
                .addGap(32, 32, 32))
            .addGroup(AttributePanelLayout.createSequentialGroup()
                .addGroup(AttributePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AttributePanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(LevelUpLabel))
                    .addGroup(AttributePanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(ChooseAttributeButton)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        AttributePanelLayout.setVerticalGroup(
            AttributePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttributePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(LevelUpLabel)
                .addGap(66, 66, 66)
                .addGroup(AttributePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HealthButton)
                    .addComponent(DamageButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(ChooseAttributeButton)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout LevelUpLayout = new javax.swing.GroupLayout(LevelUp.getContentPane());
        LevelUp.getContentPane().setLayout(LevelUpLayout);
        LevelUpLayout.setHorizontalGroup(
            LevelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LevelUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AttributePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LevelUpLayout.setVerticalGroup(
            LevelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LevelUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AttributePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(159, 159, 159)
                .addComponent(MKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(MKLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
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
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        SetLocationsFrame.setVisible(true);
        SetLocationsFrame.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_StartButtonActionPerformed

    private void AttackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttackButtonActionPerformed
        game.fight.Hit(human, enemy, 1, game.getResults(), items, game.location, locationsNumber, game.getEnemies(), mediator);
    }//GEN-LAST:event_AttackButtonActionPerformed

    private void BlockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockButtonActionPerformed
        game.fight.Hit(human, enemy, 0, game.getResults(), items, game.location, locationsNumber, game.getEnemies(), mediator);
    }//GEN-LAST:event_BlockButtonActionPerformed

    private void NextRoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextRoundButtonActionPerformed
        LocationLabel.setText("Текущая локация: " + game.location.getCurrentLocation() + "/" + locationsNumber);
        if ((game.location.getCurrentEnemyNumber() + 1) <= game.location.getEnemiesAtLocation().size()) {
            EnemyNumberLabel.setText("Номер противника: " + (game.location.getCurrentEnemyNumber() + 1) + "/" + game.location.getEnemiesAtLocation().size());
        } else {
            EnemyNumberLabel.setText("Финальный босс локации!");
        }
        if (game.action.checkExperience(human)) {
            game.action.LevelUp(human, game.getEnemies());
            game.location.setFullEnemiesList(game.getEnemies());
            LevelUp.setVisible(true);
            LevelUp.setBounds(300, 200, 430, 350);
        }
        enemy = game.location.getCurrentEnemy();
        EnemyIconLabel.setIcon(enemy.getPhoto());
        EnemyDamageValueLabel.setText(Integer.toString(enemy.getDamage()));
        EnemyHealthLabel.setText(Integer.toString(enemy.getHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        EnemyHeroLabel.setText(enemy.getName());
        mediator.setHealthBar(enemy);
        EnemyHealthBar.setMaximum(enemy.getMaxHealth());
        game.fight.NewRound(human, enemy, mediator);

        mediator.setNewRoundTexts(human, enemy, items);

        EndFightDialog.dispose();
    }//GEN-LAST:event_NextRoundButtonActionPerformed

    private void EnterNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterNameFieldActionPerformed

    private void EndGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndGameButtonActionPerformed
        try {
            game.EndGameTop(human, EnterNameField, RecordsTable);
        } catch (IOException ex) {
            Logger.getLogger(JFrames.class.getName()).log(Level.SEVERE, null, ex);
        }
        EndGameDialog.dispose();
        EnterNameField.setText("");
    }//GEN-LAST:event_EndGameButtonActionPerformed

    private void CloseRecordsTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseRecordsTableButtonActionPerformed
        RecordsTableDialog.dispose();
    }//GEN-LAST:event_CloseRecordsTableButtonActionPerformed

    private void SeeResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeResultsButtonActionPerformed
        RecordsTableDialog.setVisible(true);
        RecordsTableDialog.setBounds(100, 100, 580, 450);
    }//GEN-LAST:event_SeeResultsButtonActionPerformed

    private void EndGameWithoutLadderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndGameWithoutLadderButtonActionPerformed
        EndGameWithoutLadderDialog.dispose();
    }//GEN-LAST:event_EndGameWithoutLadderButtonActionPerformed

    private void FirstItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstItemButtonActionPerformed

    private void SecondItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecondItemButtonActionPerformed

    private void UseItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseItemButtonActionPerformed
        if (FirstItemButton.isSelected()) {
            nameButton = "First item";
        }
        if (SecondItemButton.isSelected()) {
            nameButton = "Second item";
        }
        if (ThirdItemButton.isSelected()) {
            nameButton = "Third item";
        }
        game.action.UseItem(human, items, nameButton, mediator);
        mediator.setHealthBar(human);
        PlayerHealthLabel.setText(human.getHealth() + "/" + human.getMaxHealth());
        mediator.setBagText(items);
    }//GEN-LAST:event_UseItemButtonActionPerformed

    private void ItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemsButtonActionPerformed
        ItemsBagDialog.setVisible(true);
        ItemsBagDialog.setBounds(300, 200, 430, 350);
    }//GEN-LAST:event_ItemsButtonActionPerformed

    private void CloseCantUseItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseCantUseItemButtonActionPerformed
        CantUseItemDialog.dispose();
    }//GEN-LAST:event_CloseCantUseItemButtonActionPerformed

    private void StartWithLocationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartWithLocationsButtonActionPerformed
        SetLocationsFrame.setVisible(false);
        locationsNumber = Integer.parseInt(SetLocationsField.getText());
        LocationLabel.setText("Текущая локация: " + game.location.getCurrentLocation() + "/" + locationsNumber);
        human = game.NewHuman(mediator);
        game.location.setEnemiesAtLocation(human.getLevel());
        FightFrame.setVisible(true);
        FightFrame.setSize(1000, 700);
        if ((game.location.getCurrentEnemyNumber() + 1) <= game.location.getEnemiesAtLocation().size()) {
            EnemyNumberLabel.setText("Номер противника: " + (game.location.getCurrentEnemyNumber() + 1) + "/" + game.location.getEnemiesAtLocation().size());
        } else {
            EnemyNumberLabel.setText("Финальный босс локации!");
        }
        enemy = game.location.getCurrentEnemy();
        EnemyIconLabel.setIcon(enemy.getPhoto());
        EnemyDamageValueLabel.setText(Integer.toString(enemy.getDamage()));
        EnemyHealthLabel.setText(Integer.toString(enemy.getHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        EnemyHeroLabel.setText(enemy.getName());
        mediator.setHealthBar(enemy);
        EnemyHealthBar.setMaximum(enemy.getMaxHealth());

        game.fight.NewRound(human, enemy, mediator);

        mediator.setNewRoundTexts(human, enemy, items);

        EndFightDialog.dispose();
    }//GEN-LAST:event_StartWithLocationsButtonActionPerformed

    private void SetLocationsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetLocationsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetLocationsFieldActionPerformed

    private void HealthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HealthButtonActionPerformed

    private void ChooseAttributeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseAttributeButtonActionPerformed
        if (HealthButton.isSelected()) {
            game.action.AddHealthHuman(human);
        } else {
            game.action.AddDamageHuman(human);
        }
        mediator.setNewRoundTexts(human, enemy, items);
        LevelUp.dispose();
    }//GEN-LAST:event_ChooseAttributeButtonActionPerformed

    private void DebuffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebuffButtonActionPerformed
        game.fight.Hit(human, enemy, 2, game.getResults(), items, game.location, locationsNumber, game.getEnemies(), mediator);
    }//GEN-LAST:event_DebuffButtonActionPerformed

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
    private javax.swing.JButton AttackButton;
    private javax.swing.JPanel AttributePanel;
    private javax.swing.ButtonGroup AttributesGroup;
    private javax.swing.JButton BlockButton;
    private javax.swing.JDialog CantUseItemDialog;
    private javax.swing.JLabel CantUseItemLabel;
    private javax.swing.JPanel CantUseItemPanel;
    private javax.swing.JButton ChooseAttributeButton;
    private javax.swing.JButton CloseCantUseItemButton;
    private javax.swing.JButton CloseRecordsTableButton;
    private javax.swing.JRadioButton DamageButton;
    private javax.swing.JButton DebuffButton;
    private javax.swing.JDialog EndFightDialog;
    private javax.swing.JPanel EndFightPanel;
    private javax.swing.JButton EndGameButton;
    private javax.swing.JDialog EndGameDialog;
    private javax.swing.JPanel EndGamePanel;
    private javax.swing.JButton EndGameWithoutLadderButton;
    private javax.swing.JDialog EndGameWithoutLadderDialog;
    private javax.swing.JPanel EndGameWithoutLadderPanel;
    private javax.swing.JLabel EndGameWithoutLadderTitlleLabel;
    private javax.swing.JLabel EndRoundLabel;
    private javax.swing.JLabel EnemyActionLabel;
    private javax.swing.JLabel EnemyDamageLabel;
    private javax.swing.JLabel EnemyDamageValueLabel;
    private javax.swing.JLabel EnemyDebuffLabel;
    private javax.swing.JProgressBar EnemyHealthBar;
    private javax.swing.JLabel EnemyHealthLabel;
    private javax.swing.JLabel EnemyHeroLabel;
    private javax.swing.JLabel EnemyIconLabel;
    private javax.swing.JLabel EnemyLevelLabel;
    private javax.swing.JLabel EnemyNumberLabel;
    private javax.swing.JTextField EnterNameField;
    private javax.swing.JLabel EnterNameLabel;
    private javax.swing.JLabel EnterNameLabelBottom;
    private javax.swing.JLabel ExperienceValueLabel;
    private javax.swing.JLabel ExperinceTitleLabel;
    private javax.swing.JFrame FightFrame;
    private javax.swing.JLabel FightLabel;
    private javax.swing.JPanel FightPanel;
    private javax.swing.JRadioButton FirstItemButton;
    private javax.swing.JRadioButton HealthButton;
    private javax.swing.JDialog ItemsBagDialog;
    private javax.swing.JLabel ItemsBagLabel;
    private javax.swing.JPanel ItemsBagPanel;
    private javax.swing.JButton ItemsButton;
    private javax.swing.ButtonGroup ItemsGroup;
    public static javax.swing.JFrame LevelUp;
    private javax.swing.JLabel LevelUpLabel;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JLabel MKLabel;
    private javax.swing.JButton NextRoundButton;
    private javax.swing.JLabel NotInLadderLabel;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel PlayerActionLabel;
    private javax.swing.JLabel PlayerDamageLabel;
    private javax.swing.JLabel PlayerDamageValueLabel;
    private javax.swing.JLabel PlayerDebuffLabel;
    private javax.swing.JProgressBar PlayerHealthBar;
    private javax.swing.JLabel PlayerHealthLabel;
    private javax.swing.JLabel PlayerHeroLabel;
    private javax.swing.JLabel PlayerIconLabel;
    private javax.swing.JLabel PlayerLevelLabel;
    private javax.swing.JLabel PointsTitleLabel;
    private javax.swing.JLabel PointsValueLabel;
    private javax.swing.JTable RecordsTable;
    private javax.swing.JDialog RecordsTableDialog;
    private javax.swing.JLabel RecordsTableLabel;
    private javax.swing.JPanel RecordsTablePanel;
    private javax.swing.JScrollPane RecordsTableScrollPane;
    private javax.swing.JRadioButton SecondItemButton;
    private javax.swing.JButton SeeResultsButton;
    private javax.swing.JTextField SetLocationsField;
    private javax.swing.JFrame SetLocationsFrame;
    private javax.swing.JLabel SetLocationsLabel;
    private javax.swing.JPanel SetLocationsPanel;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton StartWithLocationsButton;
    private javax.swing.JLabel StunLabel;
    private javax.swing.JRadioButton ThirdItemButton;
    private javax.swing.JLabel TurnLabel;
    private javax.swing.JLabel UnavailableItemLabel;
    private javax.swing.JButton UseItemButton;
    private javax.swing.JLabel VictoryLabel;
    // End of variables declaration//GEN-END:variables
}
