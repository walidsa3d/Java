/*
 * Copyright (C) 2014 RAED
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tn.mariages.gui;

import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;

/**
 *
 * @author RAED
 */
public class Modif_Prest extends javax.swing.JFrame {

    /**
     * Creates new form Modif_Prest
     */
    public Modif_Prest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlModifierPrest = new javax.swing.JPanel();
        tfNomPrest = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescPrest = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAdrPrest = new javax.swing.JTextArea();
        tfTelPrest = new javax.swing.JTextField();
        TfEmailPrest = new javax.swing.JTextField();
        TfPwdPrest = new javax.swing.JPasswordField();
        cmbVillePrest = new javax.swing.JComboBox();
        TfSpecPrest = new javax.swing.JTextField();
        cmbCategoriePrest = new javax.swing.JComboBox();
        chkCmptValidePrest = new javax.swing.JCheckBox();
        chkPremiumPrest = new javax.swing.JCheckBox();
        chkEmailValidePrest = new javax.swing.JCheckBox();
        tfDatePayementPrest = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnValiderModifPrest = new javax.swing.JButton();
        btnAnulModifPrest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelIdPrest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modifier Perstataire");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setName("ModifPrest"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        pnlModifierPrest.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        taDescPrest.setColumns(20);
        taDescPrest.setRows(5);
        jScrollPane1.setViewportView(taDescPrest);

        taAdrPrest.setColumns(3);
        taAdrPrest.setRows(5);
        jScrollPane2.setViewportView(taAdrPrest);

        tfTelPrest.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfTelPrest.setText("00 000 000");
        tfTelPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelPrestActionPerformed(evt);
            }
        });

        TfEmailPrest.setText("mail@sample.tn");

        TfPwdPrest.setText("jPasswordField1");

        cmbVillePrest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tunis", "Ariana", "Sousse" }));
        cmbVillePrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVillePrestActionPerformed(evt);
            }
        });

        TfSpecPrest.setText("Mariages");

        cmbCategoriePrest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Catégorie 1", "Catégorie 2", "Catégorie 3", "Catégorie 4", " " }));

        chkCmptValidePrest.setText("Compte Vérifié");

        chkPremiumPrest.setText("Premium");
        chkPremiumPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPremiumPrestActionPerformed(evt);
            }
        });

        chkEmailValidePrest.setText("E-mail Valide");
        chkEmailValidePrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEmailValidePrestActionPerformed(evt);
            }
        });

        tfDatePayementPrest.setText("1/1/1970");
        tfDatePayementPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDatePayementPrestActionPerformed(evt);
            }
        });

        jLabel2.setText("Nom");

        jLabel3.setText("Description");

        jLabel4.setText("Adresse");

        jLabel5.setText("Tél.");

        jLabel6.setText("E-mail");

        jLabel7.setText("Mot de passe");

        jLabel8.setText("Ville");

        jLabel9.setText("Catégorie");

        jLabel10.setText("Spécialité");

        btnValiderModifPrest.setBackground(new java.awt.Color(0, 153, 0));
        btnValiderModifPrest.setText("Valider");
        btnValiderModifPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderModifPrestActionPerformed(evt);
            }
        });

        btnAnulModifPrest.setBackground(new java.awt.Color(255, 102, 102));
        btnAnulModifPrest.setText("Anuller");

        javax.swing.GroupLayout pnlModifierPrestLayout = new javax.swing.GroupLayout(pnlModifierPrest);
        pnlModifierPrest.setLayout(pnlModifierPrestLayout);
        pnlModifierPrestLayout.setHorizontalGroup(
            pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModifierPrestLayout.createSequentialGroup()
                                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(94, 94, 94)
                                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TfPwdPrest, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TfEmailPrest, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfTelPrest)
                                    .addComponent(cmbCategoriePrest, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModifierPrestLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(TfSpecPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnAnulModifPrest)
                            .addComponent(btnValiderModifPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2)
                                    .addComponent(tfNomPrest)
                                    .addComponent(cmbVillePrest, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDatePayementPrest)
                                    .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                                        .addComponent(chkCmptValidePrest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkEmailValidePrest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chkPremiumPrest)))))))
                .addGap(24, 24, 24))
        );
        pnlModifierPrestLayout.setVerticalGroup(
            pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)))
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlModifierPrestLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cmbVillePrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TfEmailPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TfPwdPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cmbCategoriePrest, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(TfSpecPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValiderModifPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkEmailValidePrest)
                    .addComponent(chkPremiumPrest)
                    .addComponent(chkCmptValidePrest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifierPrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnulModifPrest)
                    .addComponent(tfDatePayementPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tfNomPrest.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Modifier Prestataire");

        labelIdPrest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelIdPrest.setForeground(new java.awt.Color(102, 102, 102));
        labelIdPrest.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlModifierPrest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(labelIdPrest)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(labelIdPrest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlModifierPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTelPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelPrestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelPrestActionPerformed

    private void cmbVillePrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVillePrestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVillePrestActionPerformed

    private void chkEmailValidePrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEmailValidePrestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEmailValidePrestActionPerformed

    private void chkPremiumPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPremiumPrestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPremiumPrestActionPerformed

    private void btnValiderModifPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderModifPrestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnValiderModifPrestActionPerformed

    private void tfDatePayementPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDatePayementPrestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDatePayementPrestActionPerformed

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
            java.util.logging.Logger.getLogger(Modif_Prest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modif_Prest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modif_Prest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modif_Prest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modif_Prest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TfEmailPrest;
    private javax.swing.JPasswordField TfPwdPrest;
    private javax.swing.JTextField TfSpecPrest;
    private javax.swing.JButton btnAnulModifPrest;
    private javax.swing.JButton btnValiderModifPrest;
    private javax.swing.JCheckBox chkCmptValidePrest;
    private javax.swing.JCheckBox chkEmailValidePrest;
    private javax.swing.JCheckBox chkPremiumPrest;
    private javax.swing.JComboBox cmbCategoriePrest;
    private javax.swing.JComboBox cmbVillePrest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelIdPrest;
    private javax.swing.JPanel pnlModifierPrest;
    private javax.swing.JTextArea taAdrPrest;
    private javax.swing.JTextArea taDescPrest;
    private javax.swing.JFormattedTextField tfDatePayementPrest;
    private javax.swing.JTextField tfNomPrest;
    private javax.swing.JTextField tfTelPrest;
    // End of variables declaration//GEN-END:variables
}