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

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import tn.mariages.util.facebook.GraphReaderExample;

/**
 *
 * @author RAED
 */
@SuppressWarnings("serial")
public class FacebookLoginTEST extends javax.swing.JFrame {

    
     public static String API_KEY = "1422860571264717";
  public static String SECRET = "263401ccd735a71496a83d4c8b9e8425";

  public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
  + "client_id="
  + API_KEY
  + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
  + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";
  
  public static String secondRequest="https://graph.facebook.com/oauth/access_token?"
  + "client_id="
  + API_KEY
  + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
  + "client_secret=" + SECRET + "&code=";

  public static String access_token = "CAAUOFYrqRs0BAPNdYRxuXVrZBNQ7gIM5iNnAJw92pVglOlSCUd25DRdhQ1AZAwRKPZAZCpUIKIxZCYIhD8CIZCgGhqrlYdyJujOyrhRPitOMp3SG1DmkchoDZABXN7QtUTK9BDCDqpcBzcPqxdqhE4WEX6qGYOoGzY0F2GVtyybJtt6529EF3ny";
  public static boolean firstRequestDone = false;
  public static boolean secondRequestDone = false; 
    
   private void auth()
    {
         
        final JFrame authFrame = new JFrame();
                      // Create the JWebBrowser and add the WebBrowserAdapter
                      JPanel webBrowserPanel = new JPanel(new BorderLayout());
                      final JWebBrowser webBrowser = new JWebBrowser();
                      webBrowser.navigate(firstRequest);
                      webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
                        @Override
                        public void locationChanged(WebBrowserNavigationEvent e) {
                          super.locationChanged(e);
                          // Check if first request was not done
                          if (!firstRequestDone) {
                            // Check if you left the location and were redirected to the next 
                            // location
                            if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")){
                              // If it successfully redirects you, get the verification code
                              // and go for a second request
                              String[] splits = e.getNewResourceLocation().split("=");
                              String stage2temp = secondRequest + splits[1];
                                System.out.println("First ="+splits[1]);
                              webBrowser.navigate(stage2temp);
                              firstRequestDone = true;
                            }
                          } 
                          else {
                            // If secondRequest is not done yet, you perform this and get the 
                            // access_token
                            if (!secondRequestDone) {
                              System.out.println(webBrowser.getHTMLContent());
                              // Create reader with the html content
                              StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
                              // Create a callback for html parser
                              HTMLEditorKit.ParserCallback callback = 
                              new HTMLEditorKit.ParserCallback() {
                                  @Override
                                public void handleText(char[] data,int pos) {
                                  System.out.println(data);
                                  // because there is only one line with the access_token 
                                  // in the html content you can parse it.
                                  String string = new String(data);
                                  String[] temp1 = string.split("&");
                                  String[] temp2 = temp1[0].split("=");
                                      System.out.println("access tocken="+temp2);
                                  access_token = temp2[1];
                                }
                              };
                              try {
                                // Call the parse method 
                                new ParserDelegator().parse(readerSTR,callback,false);
                              } catch (IOException e1) {
                                e1.printStackTrace();
                              }
                               Timer timer = new Timer(2000, new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent arg0) {
                                            authFrame.dispose();
                                        }
                                    });
                                    timer.start();
        
                                 
                            }
                          }
                        }
                      });
                      webBrowserPanel.add(webBrowser,BorderLayout.CENTER);
                      authFrame.add(webBrowserPanel);
                      authFrame.setSize(500, 500);
                      authFrame.setVisible(true);
           
                     
        
        
    }
    
    
    /**
     * Creates new form FacebookLoginTEST
     */
    public FacebookLoginTEST() {
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

        btnfb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnfb.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionBackground"));
        btnfb.setText("Login w/ Facebook");
        btnfb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnfb)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnfb)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfbActionPerformed


 final JFrame loginFrame = new JFrame();
                        JPanel webBrowserPanel = new JPanel(new BorderLayout());
                        // this is the JWebBrowser i mentioned earlier
                        final JWebBrowser webBrowser = new JWebBrowser();
                        // You can set this fields to false, or even let them activated
                        webBrowser.setMenuBarVisible(false);
                        webBrowser.setButtonBarVisible(false);
                        webBrowser.setLocationBarVisible(false);
                        final String fb_url = "http://www.facebook.com/";
                        webBrowser.navigate(fb_url);

                        // Here we add to our JWebBrowser an Adapter and override the 
                        // locationChanging() method. Here we can check, if we are 
                        // changing the location
                        // in our case the String fb_url, then this JWebBrowser can be 
                        // disposed.
                        // The Timer is set for 2 seconds, so we can still see if the 
                        // login was successfull or not.
                            webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
                            @Override
                       public void locationChanging(WebBrowserNavigationEvent e) {
                                super.locationChanging(e);
                                System.out.println(e.getNewResourceLocation());

                                if (!e.getNewResourceLocation().equals(fb_url)) {
                                    Timer timer = new Timer(2000, new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent arg0) {
                                            loginFrame.dispose();
                                        }
                                    });
                                    timer.start();
                                }
                            }
                            
                            
                        });
                                
                        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
                        loginFrame.add(webBrowserPanel);
                        loginFrame.setSize(500, 500);
                        loginFrame.setVisible(true);
                        
                      
btnfb.setVisible(false);
  this.auth();
//his.authActionPerformed(ActionEvent.mo);

GraphReaderExample gre = new GraphReaderExample(access_token);
         List<String> user = gre.getUSER();
         for (int i = 0; i < user.size(); i++) {
             System.out.println(user.get(i)+"\n");
        }
    }//GEN-LAST:event_btnfbActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                
                NativeInterface.open();
                NativeInterface.initialize();
    
  
    }//GEN-LAST:event_formWindowOpened

   
    
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
            java.util.logging.Logger.getLogger(FacebookLoginTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacebookLoginTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacebookLoginTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacebookLoginTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacebookLoginTEST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfb;
    // End of variables declaration//GEN-END:variables
}