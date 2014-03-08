/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.mariages.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import tn.mariages.dao.PrestataireDAO;
import tn.mariages.entities.Prestataire;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager;
import tn.mariages.dao.AdminDAO;
import tn.mariages.dao.ClientDAO;

/**
 *
 * @author cyrine
 */
public class AjoutPrestataire extends javax.swing.JFrame {

    Prestataire prest = new Prestataire();
    PrestataireDAO presDAO = new PrestataireDAO();
    String[] specialite = {"--Choisir Specialite--"};
    String[] categorie = {"--Choisir categorie--", "La mariée", "le mari", "Beauté", "La réception", "Gastronomie", "Annimation", "Voyages", "Photographe"};
    String[] ville = {"--Choisir ville--", "tunis", "arriana", "hammamet", "Sousse", "Carthage", "Mannouba"};
    String[] specialitMari = {"--Choisir Specialite--", "Costume", "Chaussure"};
    String[] specialitMariee = {"--Choisir Specialite--", "Robe marriée", "Haute couture", "Lingerie", "Bijoutier"};
    String[] specialitBeaute = {"--Choisir Specialite--", "Produit esthétique", "Maquillage Pro", "Sallon d'ethetique"};
    String[] specialitRecept = {"--Choisir Specialite--", "Forum", "Top happiness", "Le relais"};
    String[] specialitGastr = {"--Choisir Specialite--", "Traiteur", "Patisserie"};
    String[] specialitAnnim = {"--Choisir Specialite--", "Troupe musical", "Chanteurs", "Danseuse orientals"};
    String[] specialitVoyage = {"--Choisir Specialite--", "Agence de voyage"};
    String[] specialitPhotographe = {"--Choisir Specialite--", "Photographe paysagiste", "photographe classique"};

    public AjoutPrestataire() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtNomPrest = new javax.swing.JTextField();
        jtAdrPrest = new javax.swing.JTextField();
        jtNumMobilPrest = new javax.swing.JTextField();
        jtEmailPrest = new javax.swing.JTextField();
        cmbVillePrest = new javax.swing.JComboBox();
        btnAjouterPrest = new javax.swing.JButton();
        btnAnnulerPrest = new javax.swing.JButton();
        jtpwdPrest = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDescPrest = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jtNumFixePrest = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtImgPrest = new javax.swing.JTextField();
        btnParcourir = new javax.swing.JButton();
        cmbCategoriePrest = new javax.swing.JComboBox();
        cmbSpecialitePrest = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        chkCompteVerif = new javax.swing.JCheckBox();
        chkEmailVald = new javax.swing.JCheckBox();
        chkPremium = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jtDatePayement = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ajout prestataire", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nom:");

        jLabel3.setText("Description:");

        jLabel4.setText("Email:");

        jLabel5.setText("Mot de passe:");

        jLabel6.setText("Adresse:");

        jLabel7.setText("Num tel mobile:");

        jLabel8.setText("Catégorie:");

        jLabel9.setText("Spécialité:");

        jLabel10.setText("Ville:");

        btnAjouterPrest.setText("   Ajouter");
        btnAjouterPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterPrestActionPerformed(evt);
            }
        });

        btnAnnulerPrest.setText("   Annuler");
        btnAnnulerPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerPrestActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jtDescPrest);

        jLabel11.setText("Num tel fixe:");

        jLabel12.setText("Image:");

        btnParcourir.setText("Parcourir");
        btnParcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParcourirActionPerformed(evt);
            }
        });

        cmbCategoriePrest.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoriePrestItemStateChanged(evt);
            }
        });
        cmbCategoriePrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriePrestActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Abonnement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        chkCompteVerif.setText("Compte Verifier");

        chkEmailVald.setText("Email valide");

        chkPremium.setText("Premium");

        jLabel13.setText("Date payement:");

        jtDatePayement.setDateFormatString("yyyy MM dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkCompteVerif)
                    .addComponent(jLabel13))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(chkEmailVald)
                        .addGap(68, 68, 68)
                        .addComponent(chkPremium))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDatePayement, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCompteVerif)
                    .addComponent(chkEmailVald)
                    .addComponent(chkPremium))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jtDatePayement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtEmailPrest, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(62, 62, 62)
                                    .addComponent(jtNomPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtpwdPrest, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtAdrPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cmbVillePrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmbCategoriePrest, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbSpecialitePrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtNumMobilPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtNumFixePrest))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(269, 269, 269)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtImgPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnParcourir))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btnAjouterPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(btnAnnulerPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbCategoriePrest, cmbSpecialitePrest, cmbVillePrest, jtAdrPrest, jtEmailPrest, jtNomPrest, jtpwdPrest});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAjouterPrest, btnAnnulerPrest});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNomPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jtImgPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParcourir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtEmailPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtpwdPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtAdrPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jtNumMobilPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbVillePrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jtNumFixePrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbSpecialitePrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(cmbCategoriePrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel8)))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouterPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnulerPrest))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAjouterPrest, btnAnnulerPrest});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


        for (int i = 0; i < categorie.length; i++) {
            cmbCategoriePrest.addItem(categorie[i]);

        }

        for (int i = 0; i < ville.length; i++) {
            cmbVillePrest.addItem(ville[i]);
        }
        for (int i = 0; i < specialite.length; i++) {
            cmbSpecialitePrest.addItem(specialite[i]);

        }

    }//GEN-LAST:event_formWindowOpened

    private void cmbCategoriePrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriePrestActionPerformed

        if (cmbCategoriePrest.getSelectedItem().toString().equals("La mariée")) {
            cmbSpecialitePrest.removeAllItems();
            for (int i = 0; i < specialitMariee.length; i++) {
                cmbSpecialitePrest.addItem(specialitMariee[i]);
            }
        }

        if (cmbCategoriePrest.getSelectedItem().toString().equals("le mari")) {
            cmbSpecialitePrest.removeAllItems();
            for (int i = 0; i < specialitMari.length; i++) {
                cmbSpecialitePrest.addItem(specialitMari[i]);
            }
        }



        if (cmbCategoriePrest.getSelectedItem().toString() == "Beauté") {
            cmbSpecialitePrest.removeAllItems();
            for (int i = 0; i < specialitBeaute.length; i++) {
                cmbSpecialitePrest.addItem(specialitBeaute[i]);
            }
        }

        if (cmbCategoriePrest.getSelectedItem().toString() == "La réception") {
            cmbSpecialitePrest.removeAllItems();
            for (int i = 0; i < specialitRecept.length; i++) {
                cmbSpecialitePrest.addItem(specialitRecept[i]);
            }
        }
        if (cmbCategoriePrest.getSelectedItem().toString() == "Gastronomie") {
            cmbSpecialitePrest.removeAllItems();
            for (int i = 0; i < specialitGastr.length; i++) {
                cmbSpecialitePrest.addItem(specialitGastr[i]);
            }
        }

        if (cmbCategoriePrest.getSelectedItem().toString() == "Annimation") {
            cmbSpecialitePrest.removeAllItems();
            for (int i = 0; i < specialitAnnim.length; i++) {
                cmbSpecialitePrest.addItem(specialitAnnim[i]);
            }
        }
        if (cmbCategoriePrest.getSelectedItem().toString() == "Voyages") {
            cmbSpecialitePrest.removeAllItems();
            for (int i = 0; i < specialitVoyage.length; i++) {
                cmbSpecialitePrest.addItem(specialitVoyage[i]);
            }
        }

        if (cmbCategoriePrest.getSelectedItem().toString() == "Photographe") {
            cmbSpecialitePrest.removeAllItems();
            for (int i = 0; i < specialitPhotographe.length; i++) {
                cmbSpecialitePrest.addItem(specialitPhotographe[i]);
            }
        }




    }//GEN-LAST:event_cmbCategoriePrestActionPerformed

    private void cmbCategoriePrestItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriePrestItemStateChanged
    }//GEN-LAST:event_cmbCategoriePrestItemStateChanged

    private void btnAjouterPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterPrestActionPerformed

      Pattern pattern2 = Pattern.compile("(?:\\w|[\\-_])+(?:\\.(?:\\w|[\\-_])+)*\\@(?:\\w|[\\-_])+(?:\\.(?:\\w|[\\-_])+)+" );  
    Pattern pattern = Pattern.compile("^\\d+$");
    Matcher matcher3 = pattern2.matcher(jtEmailPrest.getText());
      Matcher matcher = pattern.matcher(jtNumFixePrest.getText());
         Matcher matcher2 = pattern.matcher(jtNumMobilPrest.getText());
         
         Prestataire prestataire=new Prestataire();
         PrestataireDAO prestataireDAO=new PrestataireDAO();
         ClientDAO clientDAO=new ClientDAO();
         AdminDAO adminDAO=new AdminDAO();
         List <Prestataire> mylist=new ArrayList<Prestataire>();
         mylist=prestataireDAO.DisplayAllPrestataire();
         
         
       if(jtNomPrest.getText().equals("")||jtpwdPrest.getText().length()<6|| jtDescPrest.getText().equals("")|| jtEmailPrest.getText().equals("") || jtpwdPrest.getText().equals("") || jtAdrPrest.getText().equals("") || cmbVillePrest.getSelectedItem().equals("--Choisir ville--")|| cmbSpecialitePrest.getSelectedItem().equals("--Choisir Specialite--")|| cmbCategoriePrest.getSelectedItem().equals("--Choisir catégorie--")||!matcher.matches()||!matcher2.matches()||!matcher3.matches()||clientDAO.findClientByEmailBoolean(jtEmailPrest.getText())|| prestataireDAO.findPrestByEmailBoolean(jtEmailPrest.getText())||adminDAO.findAdminByEmailBoolean(jtEmailPrest.getText()))
    {
           String ch="";
           if(jtNomPrest.getText().equals(""))
               ch+="Veuillez saisir le Nom du prestataire \n\n";
           
            if(jtDescPrest.getText().equals(""))
               ch+="Veuillez preciser la description du prestataire  \n";
            if(jtAdrPrest.getText().equals(""))
               ch+="Veuillez donner l'adresse du prestataire  \n";
            if(cmbVillePrest.getSelectedItem().toString().equals(""))
               ch+="Veuillez donner la ville du prestataire  \n";
            if(jtpwdPrest.getText().length()<6)
                 ch+="le mot de passe doit contenir au moins 6 caracteres";
            if(jtNumMobilPrest.getText().equals(""))
               ch+="Veuillez donner le numero de telephone mobile  du prestataire  \n";
             else if(!matcher2.matches())
                  ch+="Veuiller bien remplir le champ du numero de telephone mobile  du prestataire  \n";
             if(jtNumFixePrest.getText().equals(""))
               ch+="Veuillez donner le numero de telephone fixe du prestataire  \n";
             else if(!matcher.matches())
                  ch+="Veuiller bien remplir le champ du numero de telephone fixe du prestataire  \n";
              
              if(jtImgPrest.getText().equals(""))
               ch+="Veuillez donner le chemin de l'image du prestataire  \n";
              if(jtEmailPrest.getText().equals(""))
               ch+="Veuillez donner l'adresse email du prestataire  \n";
              else if(!matcher3.matches())
                  ch+="Veuiller bien donner une adresse mail correcte du prestataire  \n";
              if(jtNumMobilPrest.getText().equals(""))
               ch+="Veuillez donner le numero de telephone mobile du prestataire  \n";
             if(cmbCategoriePrest.getSelectedItem().toString().equals(""))
               ch+="Veuillez donner la catégorie  du prestataire  \n";
             
              if(clientDAO.findClientByEmailBoolean(jtEmailPrest.getText())|| prestataireDAO.findPrestByEmailBoolean(jtEmailPrest.getText())||adminDAO.findAdminByEmailBoolean(jtEmailPrest.getText()))
              {
                     ch+="l'email que vous avez saisi existe deja \n";
            
              }
             
              if(cmbSpecialitePrest.getSelectedItem().toString().equals(""))
               ch+="Veuillez donner la specialité  du prestataire  \n";
            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
                JOptionPane.showConfirmDialog (null,ch,"Warning",dialogButton);
            
        }else{
            
            
          
           
            prest.setNomPrest(jtNomPrest.getText());
           
             prest.setDescPrest(jtDescPrest.getText());
             
             
           prest.setAdrPrest(jtAdrPrest.getText());
           prest.setVillePrest(cmbVillePrest.getSelectedItem().toString());
           prest.setImgPrest(jtImgPrest.getText());
           prest.setEmailPrest(jtEmailPrest.getText());
           
           prest.setPwdPrest(jtpwdPrest.getText());
           prest.setCategorie(cmbCategoriePrest.getSelectedItem().toString());
           
           prest.setCompteValide(chkCompteVerif.isSelected());
           prest.setMailValide(chkEmailVald.isSelected());
           java.util.Date utilDate = jtDatePayement.getDate();
java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
           
           prest.setDatePayement(sqlDate.toString());
           prest.setPremium(chkPremium.isSelected());
           
                  prest.setSpecialite(cmbSpecialitePrest.getSelectedItem().toString());
                  
                  
           prest.setTelMobilePrest(jtNumMobilPrest.getText());
           prest.setTelFixePrest(jtNumMobilPrest.getText());
          presDAO.insertPrestataire(prest);
       
             this.dispose();
         } 





    }//GEN-LAST:event_btnAjouterPrestActionPerformed

    private void btnAnnulerPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerPrestActionPerformed
        dispose();
    }//GEN-LAST:event_btnAnnulerPrestActionPerformed

    private void btnParcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParcourirActionPerformed
       String chemin="";
        
       JFileChooser fc = new JFileChooser();
       
                int retval = fc.showOpenDialog(null);
                
                if (retval == JFileChooser.APPROVE_OPTION) {
                    
                    chemin = fc.getSelectedFile().getAbsolutePath();
                    
                    chemin = chemin.replace("\\", "/");    }//GEN-LAST:event_btnParcourirActionPerformed
    
                   jtImgPrest.setText(chemin);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AjoutPrestataire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AjoutPrestataire.class.getName()).log(Level.SEVERE, null, ex);;
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AjoutPrestataire.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AjoutPrestataire.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjoutPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutPrestataire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         try
    {
        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
    }
    catch(Exception e)
    {
        //TODO exception
    }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutPrestataire().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterPrest;
    private javax.swing.JButton btnAnnulerPrest;
    private javax.swing.JButton btnParcourir;
    private javax.swing.JCheckBox chkCompteVerif;
    private javax.swing.JCheckBox chkEmailVald;
    private javax.swing.JCheckBox chkPremium;
    private javax.swing.JComboBox cmbCategoriePrest;
    private javax.swing.JComboBox cmbSpecialitePrest;
    private javax.swing.JComboBox cmbVillePrest;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtAdrPrest;
    private com.toedter.calendar.JDateChooser jtDatePayement;
    private javax.swing.JTextPane jtDescPrest;
    private javax.swing.JTextField jtEmailPrest;
    private javax.swing.JTextField jtImgPrest;
    private javax.swing.JTextField jtNomPrest;
    private javax.swing.JTextField jtNumFixePrest;
    private javax.swing.JTextField jtNumMobilPrest;
    private javax.swing.JPasswordField jtpwdPrest;
    // End of variables declaration//GEN-END:variables
}
