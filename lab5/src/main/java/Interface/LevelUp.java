package Interface;

public class LevelUp extends javax.swing.JFrame {

    public LevelUp() {
        initComponents();
        AttributesGroup.add(HealthButton);
        AttributesGroup.add(DamageButton);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AttributesGroup = new javax.swing.ButtonGroup();
        ChoiceDialog = new javax.swing.JDialog();
        YourChoiceLabel = new javax.swing.JLabel();
        ChoiceLabel = new javax.swing.JLabel();
        ChoiceButton = new javax.swing.JButton();
        ChoiceGroup = new javax.swing.JPanel();
        LevelUpButton = new javax.swing.JButton();
        HealthButton = new javax.swing.JRadioButton();
        DamageButton = new javax.swing.JRadioButton();
        LevelUpLabel = new javax.swing.JLabel();

        YourChoiceLabel.setText("Параметр улучшен:");

        ChoiceButton.setText("ОК");
        ChoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoiceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChoiceDialogLayout = new javax.swing.GroupLayout(ChoiceDialog.getContentPane());
        ChoiceDialog.getContentPane().setLayout(ChoiceDialogLayout);
        ChoiceDialogLayout.setHorizontalGroup(
            ChoiceDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoiceDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(YourChoiceLabel)
                .addGap(62, 62, 62)
                .addComponent(ChoiceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(ChoiceButton)
                .addGap(21, 21, 21))
        );
        ChoiceDialogLayout.setVerticalGroup(
            ChoiceDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChoiceDialogLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(ChoiceDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YourChoiceLabel)
                    .addComponent(ChoiceLabel)
                    .addComponent(ChoiceButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LevelUpButton.setText("Подтвердить");
        LevelUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelUpButtonActionPerformed(evt);
            }
        });

        HealthButton.setText("Здоровье");

        DamageButton.setText("Урон");
        DamageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DamageButtonActionPerformed(evt);
            }
        });

        LevelUpLabel.setText("Выберите параметр, который хотите улучшить");

        javax.swing.GroupLayout ChoiceGroupLayout = new javax.swing.GroupLayout(ChoiceGroup);
        ChoiceGroup.setLayout(ChoiceGroupLayout);
        ChoiceGroupLayout.setHorizontalGroup(
            ChoiceGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChoiceGroupLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(HealthButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DamageButton)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChoiceGroupLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(ChoiceGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChoiceGroupLayout.createSequentialGroup()
                        .addComponent(LevelUpLabel)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChoiceGroupLayout.createSequentialGroup()
                        .addComponent(LevelUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        ChoiceGroupLayout.setVerticalGroup(
            ChoiceGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChoiceGroupLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(LevelUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(ChoiceGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HealthButton)
                    .addComponent(DamageButton))
                .addGap(35, 35, 35)
                .addComponent(LevelUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChoiceGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChoiceGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DamageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DamageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DamageButtonActionPerformed

    private void LevelUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelUpButtonActionPerformed
        ChoiceDialog.setVisible(true);
        if (HealthButton.isSelected()){
            ChoiceLabel.setText("Здоровье");
        }
        if (DamageButton.isSelected()){
            ChoiceLabel.setText("Урон");
        }
    }//GEN-LAST:event_LevelUpButtonActionPerformed

    private void ChoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoiceButtonActionPerformed
        ChoiceDialog.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_ChoiceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LevelUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AttributesGroup;
    private javax.swing.JButton ChoiceButton;
    private javax.swing.JDialog ChoiceDialog;
    private javax.swing.JPanel ChoiceGroup;
    public static javax.swing.JLabel ChoiceLabel;
    private javax.swing.JRadioButton DamageButton;
    private javax.swing.JRadioButton HealthButton;
    private javax.swing.JButton LevelUpButton;
    private javax.swing.JLabel LevelUpLabel;
    private javax.swing.JLabel YourChoiceLabel;
    // End of variables declaration//GEN-END:variables
}
