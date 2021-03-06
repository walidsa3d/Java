/*
 * Copyright (C) 2014 Karim
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

import javax.swing.JOptionPane;
import tn.mariages.dao.ToDoDAO;
import tn.mariages.entities.ToDo;
import tn.mariages.gui.TableListeToDoClientModel;
/**
 *
 * @author Karim
 */
public class ListeToDoClient extends javax.swing.JFrame {

    /**
     * Creates new form ListeToDoClient
     */
    public ListeToDoClient() {
        initComponents();
   tabelListeToDoClient.getColumnModel().getColumn(0).setMinWidth(0);
        tabelListeToDoClient.getColumnModel().getColumn(0).setMaxWidth(0);
  }
    int id;
     public ListeToDoClient(int id) {
        initComponents();
        tabelListeToDoClient.getColumnModel().getColumn(0).setMinWidth(0);
        tabelListeToDoClient.getColumnModel().getColumn(0).setMaxWidth(0);
        idclinet.setText(id+"");
        idclinet.setVisible(false);
        this.id=id;
   
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelListeToDoClient = new javax.swing.JTable();
        btnAjouter = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        rechercheTitre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idclinet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Taches a faire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tabelListeToDoClient.setModel(new TableListeToDoClientModel(id)
        );
        jScrollPane1.setViewportView(tabelListeToDoClient);

        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/circle_plus.png"))); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Modify-icon.png"))); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/circle_minus.png"))); // NOI18N
        btnSupprimer.setText("supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        rechercheTitre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercheTitreKeyReleased(evt);
            }
        });

        jLabel1.setText("recherche par titre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAjouter)
                        .addGap(35, 35, 35)
                        .addComponent(btnModifier)
                        .addGap(41, 41, 41)
                        .addComponent(btnSupprimer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rechercheTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechercheTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer))
                .addContainerGap())
        );

        idclinet.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(idclinet)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(idclinet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        if(tabelListeToDoClient.getSelectedRow()!=-1){
        ToDo t = new ToDo();
        ToDoDAO todoDAO=new ToDoDAO();
        t=todoDAO.findToDoById((int)tabelListeToDoClient.getValueAt(tabelListeToDoClient.getSelectedRow(), 0));
       
        AjouterToDoClient modifierToDo = new AjouterToDoClient(t);
        modifierToDo.setVisible(true);
        }
        else
        {
            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
                JOptionPane.showConfirmDialog (null, "Vous n'avez selectionné aucune todo","Warning",dialogButton);
        }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
                JOptionPane.showConfirmDialog (null, "Voulez vous supprimer tous les todo selectionnés?","Warning",dialogButton);

                if(dialogButton == JOptionPane.YES_OPTION){ //The ISSUE is here
                    
                    ToDoDAO todoDAO=new ToDoDAO();
                    int id[]=new int[50];
                    int j=-1;
                   
                    for(int i=0;i<tabelListeToDoClient.getRowCount();i++){
                    Boolean test =(Boolean)tabelListeToDoClient.getValueAt(i,5);
                        System.out.println(test);
                    if(test)
                    {
                        j++;
                        id[j]=(int)tabelListeToDoClient.getValueAt(i, 0);
                    }
                      
                      
                    }
                    while(j!=-1)
                    {
                        todoDAO.deleteToDo(id[j]);
                        j--;
                    }
                    TableListeToDoClientModel model = new TableListeToDoClientModel(Integer.parseInt(idclinet.getText()));
                    tabelListeToDoClient.setModel(model);
                }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
            this.setVisible(true);
         AjouterToDoClient ajouttodocl =new AjouterToDoClient(Integer.parseInt(idclinet.getText()));
                ajouttodocl.setVisible(true);

    }//GEN-LAST:event_btnAjouterActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
                
              TableListeToDoClientModel model = new TableListeToDoClientModel(Integer.parseInt(idclinet.getText()));
                    tabelListeToDoClient.setModel(model);
    }//GEN-LAST:event_formWindowGainedFocus

    private void rechercheTitreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercheTitreKeyReleased
         // TODO add your handling code here:
        String titre = rechercheTitre.getText();
        if(!titre.equals("")){
        TableListeToDoClientModel modeleToDO = new TableListeToDoClientModel(titre,Integer.parseInt(idclinet.getText()));
       tabelListeToDoClient.setModel(modeleToDO);
        
        }
        else
        {
        
          TableListeToDoClientModel model = new TableListeToDoClientModel(Integer.parseInt(idclinet.getText()));
                    tabelListeToDoClient.setModel(model);
        }
    }//GEN-LAST:event_rechercheTitreKeyReleased

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
            java.util.logging.Logger.getLogger(ListeToDoClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeToDoClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeToDoClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeToDoClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListeToDoClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JLabel idclinet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rechercheTitre;
    private javax.swing.JTable tabelListeToDoClient;
    // End of variables declaration//GEN-END:variables
}
