/*
 * Copyright (C) 2014 omar
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
import java.util.regex.*;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tn.mariages.dao.PaquetDAO;
import tn.mariages.dao.ProduitPaquetDAO;
import tn.mariages.entities.Paquet;
import com.alee.laf.WebLookAndFeel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import tn.mariages.entities.ProduitPaquet;

/**
 *
 * @author omar
 */
public class ListePaquets extends javax.swing.JFrame {

    /**
     * Creates new form ListePaquets
     */
    int shown = 0;
    int index=-1;
    
    public ListePaquets() {
        initComponents();
        tablelisteProduit.setVisible(false);
        btnAnnuler.setVisible(false);
        btnProduitsPaquets.setVisible(false);
        jPanel4.setVisible(false);
        jPanel3.setVisible(false);
        btnAjouterProduit.setVisible(false);
        btnSupprimerProduit.setVisible(false);
        Dimension d = new Dimension(688, 350);
        this.setSize(d);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablelistepaquet = new javax.swing.JTable();
        btnAjouter = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnlisterprod = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablelisteproduitpaquet = new javax.swing.JTable();
        labelpaquet = new javax.swing.JLabel();
        btnSupprimerProduit = new javax.swing.JButton();
        btnAjouterProduit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablelisteProduit = new javax.swing.JTable();
        btnProduitsPaquets = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablelistepaquet.setModel(new TableListPaquetModel());
        jScrollPane1.setViewportView(tablelistepaquet);

        btnAjouter.setText("Ajouter Paquet");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnModifier.setText("Modifier Paquet");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setText("Supprimer Paquet");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Liste de Paquets");

        btnlisterprod.setText("Lister Produits");
        btnlisterprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlisterprodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnlisterprod, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer)
                    .addComponent(btnlisterprod))
                .addGap(99, 99, 99))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablelisteproduitpaquet.setModel(new TableProduitPaquetModel());
        jScrollPane2.setViewportView(tablelisteproduitpaquet);

        labelpaquet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelpaquet.setText("Liste des produits du paquet : ");

        btnSupprimerProduit.setText("Supprimer Produit");
        btnSupprimerProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerProduitActionPerformed(evt);
            }
        });

        btnAjouterProduit.setText("Ajouter Produit");
        btnAjouterProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterProduitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelpaquet)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAjouterProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSupprimerProduit)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelpaquet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSupprimerProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAjouterProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablelisteProduit.setModel(new TableListeAjoutProduitPaquet());
        jScrollPane3.setViewportView(tablelisteProduit);

        btnProduitsPaquets.setText("Ajouter Produits");
        btnProduitsPaquets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduitsPaquetsActionPerformed(evt);
            }
        });

        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Liste des Produits");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnProduitsPaquets, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProduitsPaquets)
                    .addComponent(btnAnnuler))
                .addGap(183, 183, 183))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "Voulez vous supprimer tous les paquets selectionnés?", "Warning", dialogButton);

        if (dialogButton == JOptionPane.YES_OPTION) { //The ISSUE is here

            PaquetDAO pDAO = new PaquetDAO();
            int ids[] = new int[50];
            int j = -1;
            for (int i = 0; i < tablelistepaquet.getRowCount(); i++) {
                Boolean b = (Boolean) tablelistepaquet.getValueAt(i, 6);
                if (b) {
                    j++;
                    ids[j] = (int) tablelistepaquet.getValueAt(i, 0);
                }

            }
            while (j != -1) {
                pDAO.deletePaquet(ids[j]);
                j--;
            }
            TableListPaquetModel model = new TableListPaquetModel();
            tablelistepaquet.setModel(model);
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed


    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        // TODO add your handling code here:
        AjoutPaquet Ajout = new AjoutPaquet();
        Ajout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Ajout.setVisible(true);
        


    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        if (tablelistepaquet.getSelectedRow() != -1) {
            Paquet p = new Paquet();
            PaquetDAO pDAO = new PaquetDAO();
            p = pDAO.FindPaquetById((int) tablelistepaquet.getValueAt(tablelistepaquet.getSelectedRow(), 0));
            AjoutPaquet Modif = new AjoutPaquet(p);
            Modif.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Modif.setVisible(true);
        } else {
            int dialogButton = JOptionPane.CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, "Vous n'avez selectionné aucun paquet", "Warning", dialogButton);
        }


    }//GEN-LAST:event_btnModifierActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        TableListPaquetModel model = new TableListPaquetModel();
        tablelistepaquet.setModel(model);
        model.fireTableDataChanged();

    }//GEN-LAST:event_formWindowGainedFocus

    private void btnSupprimerProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerProduitActionPerformed
        // TODO add your handling code here:

        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "Voulez vous supprimer tous les produits selectionnés?", "Warning", dialogButton);

        if (dialogButton == JOptionPane.YES_OPTION) { //The ISSUE is here
            int id_paq = (Integer) tablelistepaquet.getValueAt(tablelistepaquet.getSelectedRow(), 0);
            ProduitPaquetDAO pDAO = new ProduitPaquetDAO();
            int ids[] = new int[50];
            int j = -1;
            for (int i = 0; i < tablelisteproduitpaquet.getRowCount(); i++) {
                Boolean b = (Boolean) tablelisteproduitpaquet.getValueAt(i, 5);
                if (b) {
                    j++;
                    
                    ids[j] = (int) tablelisteproduitpaquet.getValueAt(i, 0);
                }

            }
            while (j != -1) {
                //System.out.println(id_paq+"  "+ids[j]);
                pDAO.deleteProduitPaquet(ids[j],id_paq);
                j--;
            }
            TableProduitPaquetModel model = new TableProduitPaquetModel(id_paq);
            tablelisteproduitpaquet.setModel(model);
        }

    }//GEN-LAST:event_btnSupprimerProduitActionPerformed

    private void btnAjouterProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterProduitActionPerformed
        tablelisteProduit.setVisible(true);
        btnAnnuler.setVisible(true);
        btnProduitsPaquets.setVisible(true);
        jPanel4.setVisible(true);
        Dimension d = new Dimension(1320, 600);
            this.setSize(d);
            
    }//GEN-LAST:event_btnAjouterProduitActionPerformed

    private void btnlisterprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlisterprodActionPerformed
       
        
        if(shown==0 && index!=tablelistepaquet.getSelectedRow()){
            index=tablelistepaquet.getSelectedRow();
        if (tablelistepaquet.getSelectedRow() != -1) {
            PaquetDAO pdao = new PaquetDAO();
            int id = (Integer) tablelistepaquet.getValueAt(tablelistepaquet.getSelectedRow(), 0);
            String nom =(String) pdao.FindPaquetById(id).getNomPaquet();
            labelpaquet.setText("Liste des produits du paquet : "+nom);
            TableProduitPaquetModel Mod = new TableProduitPaquetModel(id);
            tablelisteproduitpaquet.setModel(Mod);
            Mod.fireTableDataChanged();
            Dimension d = new Dimension(688, 600);
            this.setSize(d);
            jPanel3.setVisible(true);
            btnAjouterProduit.setVisible(true);
            btnSupprimerProduit.setVisible(true);
            shown=1;

        } else {
            int dialogButton = JOptionPane.CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, "Vous n'avez selectionné aucun paquet", "Warning", dialogButton);
        }
     
        }
        else
        {
            if(index==tablelistepaquet.getSelectedRow())
            {
                index=-1;
                jPanel3.setVisible(false);   
                btnAjouterProduit.setVisible(false);
                btnSupprimerProduit.setVisible(false);
                Dimension d = new Dimension(688, 350);
                this.setSize(d);
                shown=0;
            }
        }
    }//GEN-LAST:event_btnlisterprodActionPerformed

    private void btnProduitsPaquetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduitsPaquetsActionPerformed
        int id_paq = (Integer)tablelistepaquet.getValueAt(tablelistepaquet.getSelectedRow(), 0);
        ProduitPaquetDAO pDAO = new ProduitPaquetDAO();
            int ids[] = new int[50];
            int j = -1;
            for (int i = 0; i < tablelisteProduit.getRowCount(); i++) {
                Boolean b = (Boolean) tablelisteProduit.getValueAt(i, 0);
                if (b) {
                    j++;
                    
                    ids[j] = (int) tablelisteProduit.getValueAt(i, 1);
                }

            }
            ProduitPaquet prodpaq = new ProduitPaquet();
             prodpaq.setIdPaquet(id_paq);
             String date_format="yyyy-MM-dd";
            Calendar cal=Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat(date_format);
            String dt = sdf.format(cal.getTime());
             prodpaq.setDateAjout(dt);
            while (j != -1) {
                
                prodpaq.setIdProd(ids[j]);               
                pDAO.insertProduitPaquet(prodpaq);              
                j--;
            }
            TableProduitPaquetModel Mod = new TableProduitPaquetModel(id_paq);
            tablelisteproduitpaquet.setModel(Mod);
            Mod.fireTableDataChanged();
    }//GEN-LAST:event_btnProduitsPaquetsActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // TODO add your handling code here:
        tablelisteProduit.setVisible(false);
        btnAnnuler.setVisible(false);
        btnProduitsPaquets.setVisible(false);
        jPanel4.setVisible(false);
         Dimension d = new Dimension(688, 600);
                this.setSize(d);
        
    }//GEN-LAST:event_btnAnnulerActionPerformed

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
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                 javax.swing.UIManager.setLookAndFeel(WebLookAndFeel.class.getCanonicalName());
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListePaquets_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListePaquets_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListePaquets_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListePaquets_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListePaquets().setVisible(true);
                WebLookAndFeel.install();
                WebLookAndFeel.setDecorateAllWindows(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnAjouterProduit;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnProduitsPaquets;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnSupprimerProduit;
    private javax.swing.JButton btnlisterprod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelpaquet;
    private javax.swing.JTable tablelisteProduit;
    private javax.swing.JTable tablelistepaquet;
    private javax.swing.JTable tablelisteproduitpaquet;
    // End of variables declaration//GEN-END:variables
}
