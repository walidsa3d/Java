package tn.mariages.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import tn.mariages.dao.AdminDAO;
import tn.mariages.dao.ClientDAO;
import tn.mariages.dao.PrestataireDAO;
import tn.mariages.entities.Client;
import tn.mariages.util.FTPFileUploader;

/**
 *
 * @author khaled
 */
public class AjoutClient extends javax.swing.JFrame {
    JFileChooser fc = new JFileChooser();

    /**
     * Creates new form AjoutClient
     */
    public AjoutClient() {
        initComponents();
    }
    String[] ville = {"Arriana", "Mannouba", "Carthage", "El ghazela"};

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
        tfPrenomMari = new javax.swing.JTextField();
        tfPrenomEpouse = new javax.swing.JTextField();
        tfNom = new javax.swing.JTextField();
        tfEmailClient = new javax.swing.JTextField();
        tfTelClient = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfPwdClient = new javax.swing.JPasswordField();
        btnValider = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        cmbVilleClient = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        tfImageclient = new javax.swing.JTextField();
        btParcourir = new javax.swing.JButton();
        spinBudget = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ajout client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel2.setText("Prenom du mari");

        jLabel3.setText("Prenom de l'épouse");

        jLabel4.setText("Nom de famille");

        jLabel5.setText("E-mail ");

        jLabel6.setText("Mot De Passe");

        tfPrenomMari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrenomMariActionPerformed(evt);
            }
        });

        jLabel7.setText("Telephone");

        jLabel8.setText("Ville");

        jLabel9.setText("Budget (DT)");

        jLabel10.setText("Date Du mariage");

        jLabel11.setText("Debut:");

        jLabel12.setText("Fin:");

        btnValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/circle_plus.png"))); // NOI18N
        btnValider.setText("Ajouter");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        btnAnnuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/close.png"))); // NOI18N
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        jLabel13.setText("Image:");

        btParcourir.setText("Parcourir");
        btParcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btParcourirActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPrenomMari, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(tfPrenomEpouse, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfNom, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfEmailClient)
                            .addComponent(tfPwdClient)
                            .addComponent(cmbVilleClient, 0, 143, Short.MAX_VALUE))))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnAnnuler))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)))
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfImageclient, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btParcourir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfTelClient)
                            .addComponent(spinBudget, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAnnuler, btnValider});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {spinBudget, tfTelClient});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPrenomMari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPrenomEpouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(spinBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(tfEmailClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfPwdClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tfImageclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParcourir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbVilleClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnnuler))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAnnuler, btnValider});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 699, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPrenomMariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrenomMariActionPerformed
        String chemin = "";

        JFileChooser fc = new JFileChooser();

        int retval = fc.showOpenDialog(null);

        if (retval == JFileChooser.APPROVE_OPTION) {

            chemin = fc.getSelectedFile().getAbsolutePath();

            chemin = chemin.replace("\\", "/");
        }

        tfImageclient.setText(chemin);

    }//GEN-LAST:event_tfPrenomMariActionPerformed

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        Pattern pattern2 = Pattern.compile("(?:\\w|[\\-_])+(?:\\.(?:\\w|[\\-_])+)*\\@(?:\\w|[\\-_])+(?:\\.(?:\\w|[\\-_])+)+");
        Pattern pattern = Pattern.compile("^\\d+$");
        Matcher matcher3 = pattern2.matcher(tfEmailClient.getText());
        Matcher matcher = pattern.matcher(tfTelClient.getText());
        Matcher matcher2 = pattern.matcher(spinBudget.getText());

        Client client = new Client();
        ClientDAO clientdao = new ClientDAO();
        AdminDAO adminDAO = new AdminDAO();
        PrestataireDAO prestataireDAO = new PrestataireDAO();
        List<Client> mylist = new ArrayList<Client>();
        mylist = clientdao.DisplayAllClients();

        if (tfPrenomMari.getText().equals("") || tfPrenomEpouse.getText().equals("") || tfPwdClient.getText().length() < 6 || tfNom.getText().equals("") || jDateChooser1.getDateFormatString().equals("") || jDateChooser2.getDateFormatString().equals("") || tfImageclient.getText().equals("") || tfEmailClient.getText().equals("") || tfPwdClient.getText().equals("") || !matcher.matches() || !matcher2.matches() || !matcher3.matches() || clientdao.findClientByEmailBoolean(tfEmailClient.getText()) || prestataireDAO.findPrestByEmailBoolean(tfEmailClient.getText()) || adminDAO.findAdminByEmailBoolean(tfEmailClient.getText())) {

            String ch = "";
            if (tfPrenomMari.getText().equals("")) {
                ch += "Veuillez saisir le Prenom du mari \n";
            }

            if (tfPrenomEpouse.getText().equals("")) {
                ch += "Veuillez saisir le Prenom de l'epouse  \n";
            }
            if (tfNom.getText().equals("")) {
                ch += "Veuillez saisir le nom de famille  \n";
            }
            if (cmbVilleClient.getSelectedItem().toString().equals("")) {
                ch += "Veuillez donner la ville du client  \n";
            }
            if (jDateChooser1.getDateFormatString().equals("")) {
                ch += "Veuillez saisir la date début de la période de mariage  \n";
            }
            if (tfEmailClient.getText().equals("")) {
                ch += "Veuillez donner l'adresse email   du client  \n";
            } else if (!matcher3.matches()) {
                ch += "Veuillez donner l'adresse email du client \n";
            }

            if (spinBudget.getText().equals("")) {
                ch += "Veuillez donner le budget du client  \n";
            } else if (!matcher2.matches()) {
                ch += "Veuiller bien remplir le champ du budget du client  du client  \n";
            }
            if (tfTelClient.getText().equals("")) {
                ch += "Veuillez donner le numero de telephone   du client  \n";
            } else if (!matcher.matches()) {
                ch += "Veuiller bien remplir le champ du numero de telephone mobile  du prestataire  \n";
            }
            if (tfPwdClient.getText().equals("")) {
                ch += "Veuillez saisir votre mot de pasee  \n";
            }
            if (tfPwdClient.getText().length() < 6) {
                ch += "le mot de passe doit contenir au moins 6 caracteres";
            }
            if (clientdao.findClientByEmailBoolean(tfEmailClient.getText()) || prestataireDAO.findPrestByEmailBoolean(tfEmailClient.getText()) || adminDAO.findAdminByEmailBoolean(tfEmailClient.getText())) {
                ch += "l'email que vous avez saisi existe deja \n";

            }
            if (jDateChooser2.getDateFormatString().equals("")) {
                ch += "Veuillez saisir la date fin de la période de mariage  \n";
            }
            if (tfImageclient.getText().equals("")) {
                ch += "Veuillez donner un chemin correct de votre photo  \n";
            }

            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, ch, "Warning", dialogButton);

        } else {

            String prMari = tfPrenomMari.getText();

            String prEpouse = tfPrenomEpouse.getText();
            String nom = tfNom.getText();
            String email = tfEmailClient.getText();
            String pwd = tfPwdClient.getText();
            String tel = tfTelClient.getText();
            String vville = cmbVilleClient.getSelectedItem().toString();
            int budget = Integer.parseInt(spinBudget.getText());

            java.util.Date utilDate = jDateChooser1.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            java.util.Date utilDate2 = jDateChooser2.getDate();
            java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());

            String dateFin = jDateChooser2.toString();
            
            try {
                FTPFileUploader.getInstance().UploadPic(fc.getSelectedFile().getAbsolutePath(), "/client/");
            } catch (IOException ex) {
                Logger.getLogger(AjoutClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("date" + dateFin);
            String img = "http://mariages.tn/client/"+fc.getSelectedFile().getName();
            client.setPrenomMari(prMari);
            client.setPrenomEpouse(prEpouse);
            client.setNomDeFamille(nom);
            client.setEmailClient(email);
            client.setPwdClient(pwd);
            client.setTelClient(tel);;
            client.setVilleClient(vville);
            client.setBudget(budget);
            client.setDateDebut(sqlDate.toString());
            client.setDateFin(sqlDate2.toString());
            client.setImgClient(img);
            ClientDAO clientDao = new ClientDAO();
            clientDao.insertClient(client);
            this.setVisible(false);
            ListeClients lp = new ListeClients();
            lp.setVisible(true);

        }


    }//GEN-LAST:event_btnValiderActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (int i = 0; i < ville.length; i++) {
            cmbVilleClient.addItem(ville[i]);

        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btParcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btParcourirActionPerformed

        String chemin = "";

        

        int retval = fc.showOpenDialog(null);

        if (retval == JFileChooser.APPROVE_OPTION) {

            chemin = fc.getSelectedFile().getAbsolutePath();

            chemin = chemin.replace("\\", "/");
        }

        tfImageclient.setText(chemin);

    }//GEN-LAST:event_btParcourirActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            //TODO exception
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btParcourir;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnValider;
    private javax.swing.JComboBox cmbVilleClient;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JTextField spinBudget;
    private javax.swing.JTextField tfEmailClient;
    private javax.swing.JTextField tfImageclient;
    private javax.swing.JTextField tfNom;
    private javax.swing.JTextField tfPrenomEpouse;
    private javax.swing.JTextField tfPrenomMari;
    private javax.swing.JPasswordField tfPwdClient;
    private javax.swing.JTextField tfTelClient;
    // End of variables declaration//GEN-END:variables
}
