package project;

import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 *   Project     : MainFrame
 *   Filename    : MainFrame.java
 *   Author      : Camarly Thomas <camarly@stu.ucc.edu.jm>
 *   Id.No.      : 20204241
 *   Course      : ITT
 *   Version     : 0.1
 *   Copyright   : All rights reserved 27 Nov 2021 07:01:02
 *   Description : 

 *   Function Name : 
 *   Purpose       : 
 *   Description   :

 */

/**
 *
 * @author Camarly Thomas <camarly@stu.ucc.edu.jm>
 */
public class MainFrame extends javax.swing.JFrame {
    static String sessionUsr = "";

    /**
     * Creates new form NewJFrame
     */
    public MainFrame(String usr) throws SQLException {
        sessionUsr = usr;
        initComponents();
        if(SQLscripts.getUserType(usr).equals("Cashier")) {
            hidePane();
        }
        updateLoginUser(usr);
//        return sessionUsr.toString();

    }
    
    public String getSessionUsr() {
        return sessionUsr;
    }
    
       //disabling admin password pane.
    public void hidePane() {
        for (Component component : iconsPanel.getComponents()) {
            if(component == reportButton) {
                component.setEnabled(false);
            }
            if(component == inventoryButton) {
                component.setEnabled(false);
            }
        } 
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
        usrProfButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        userLoggedIn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        iconsPanel = new javax.swing.JPanel();
        inventoryButton = new javax.swing.JButton();
        usrAccBtn = new javax.swing.JButton();
        balanceButton = new javax.swing.JButton();
        saleButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));

        usrProfButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/user-icon.png"))); // NOI18N
        usrProfButton.setToolTipText("User Account");
        usrProfButton.setBorder(null);
        usrProfButton.setBorderPainted(false);
        usrProfButton.setContentAreaFilled(false);

        logoutButton.setBackground(new java.awt.Color(255, 51, 0));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        userLoggedIn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        userLoggedIn.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usrProfButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(userLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(userLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usrProfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(logoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iosevka", 0, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Iosevka", 0, 18)); // NOI18N
        jLabel7.setText("MiHawk 1.0");

        jLabel8.setFont(new java.awt.Font("Iosevka", 0, 18)); // NOI18N
        jLabel8.setText("Sales Inventory Management System");

        jLabel9.setFont(new java.awt.Font("Iosevka", 0, 18)); // NOI18N
        jLabel9.setText("Camarly Thomas");

        jLabel10.setFont(new java.awt.Font("Iosevka", 0, 18)); // NOI18N
        jLabel10.setText("Student ID: 20204241");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(228, 228, 228))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(206, 206, 206))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        iconsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Iosevka", 0, 14))); // NOI18N

        inventoryButton.setBackground(new java.awt.Color(255, 255, 255));
        inventoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/dropbox-icon.png"))); // NOI18N
        inventoryButton.setBorderPainted(false);
        inventoryButton.setContentAreaFilled(false);
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        usrAccBtn.setBackground(new java.awt.Color(255, 255, 255));
        usrAccBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/preferences-icon.png"))); // NOI18N
        usrAccBtn.setBorder(null);
        usrAccBtn.setBorderPainted(false);
        usrAccBtn.setContentAreaFilled(false);
        usrAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrAccBtnActionPerformed(evt);
            }
        });

        balanceButton.setBackground(new java.awt.Color(255, 255, 255));
        balanceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/preferences-tweak-tool-icon.png"))); // NOI18N
        balanceButton.setBorder(null);
        balanceButton.setBorderPainted(false);
        balanceButton.setContentAreaFilled(false);
        balanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceButtonActionPerformed(evt);
            }
        });

        saleButton.setBackground(new java.awt.Color(255, 255, 255));
        saleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/checkbox-icon.png"))); // NOI18N
        saleButton.setBorderPainted(false);
        saleButton.setContentAreaFilled(false);
        saleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleButtonActionPerformed(evt);
            }
        });

        aboutButton.setBackground(new java.awt.Color(255, 255, 255));
        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/bulb-icon.png"))); // NOI18N
        aboutButton.setBorder(null);
        aboutButton.setBorderPainted(false);
        aboutButton.setContentAreaFilled(false);
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        reportButton.setBackground(new java.awt.Color(255, 255, 255));
        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logview-icon.png"))); // NOI18N
        reportButton.setBorder(null);
        reportButton.setBorderPainted(false);
        reportButton.setContentAreaFilled(false);
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Iosevka", 0, 14)); // NOI18N
        jLabel1.setText("Sales");

        jLabel2.setFont(new java.awt.Font("Iosevka", 0, 14)); // NOI18N
        jLabel2.setText("Reports");

        jLabel3.setFont(new java.awt.Font("Iosevka", 0, 14)); // NOI18N
        jLabel3.setText("Inventory Management");

        jLabel4.setFont(new java.awt.Font("Iosevka", 0, 14)); // NOI18N
        jLabel4.setText("About");

        jLabel5.setFont(new java.awt.Font("Iosevka", 0, 14)); // NOI18N
        jLabel5.setText("Balancing");

        jLabel6.setFont(new java.awt.Font("Iosevka", 0, 14)); // NOI18N
        jLabel6.setText("User Account Management");

        javax.swing.GroupLayout iconsPanelLayout = new javax.swing.GroupLayout(iconsPanel);
        iconsPanel.setLayout(iconsPanelLayout);
        iconsPanelLayout.setHorizontalGroup(
            iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconsPanelLayout.createSequentialGroup()
                .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iconsPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(saleButton)
                                .addGroup(iconsPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)))))
                    .addGroup(iconsPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(usrAccBtn)))
                .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iconsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2))
                    .addGroup(iconsPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(balanceButton)
                            .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(iconsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(16, 16, 16)))
                        .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(iconsPanelLayout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(reportButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconsPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4)
                                    .addGap(28, 28, 28)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconsPanelLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(aboutButton)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        iconsPanelLayout.setVerticalGroup(
            iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconsPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(iconsPanelLayout.createSequentialGroup()
                        .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(iconsPanelLayout.createSequentialGroup()
                        .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(iconsPanelLayout.createSequentialGroup()
                        .addComponent(saleButton)
                        .addGap(36, 36, 36)))
                .addGap(14, 14, 14)
                .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(iconsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aboutButton)
                    .addComponent(balanceButton)
                    .addComponent(usrAccBtn))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void saleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleButtonActionPerformed
        try {
            // TODO add your handling code here:
            MiHawk.callSalesWindow();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saleButtonActionPerformed

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
        // TODO add your handling code here:
        MiHawk.callInventoryManager();
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void usrAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrAccBtnActionPerformed
        try {
            // TODO add your handling code here:

            MiHawk.callAccountAdmin(sessionUsr);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_usrAccBtnActionPerformed

    private void balanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceButtonActionPerformed
        // TODO add your handling code here:
        MiHawk.callBalancing();
    }//GEN-LAST:event_balanceButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // TODO add your handling code here:
        new About().setVisible(true);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        new Reports().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_reportButtonActionPerformed

    public void updateLoginUser(String usr) throws SQLException {
        String name[] = SQLscripts.getUserName(usr);
        String fname = name[0].toString();
        String lname = name[1].toString();
        userLoggedIn.setText(lname + " " + fname);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame(sessionUsr).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton balanceButton;
    private javax.swing.JPanel iconsPanel;
    private javax.swing.JButton inventoryButton;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton saleButton;
    private javax.swing.JLabel userLoggedIn;
    private javax.swing.JButton usrAccBtn;
    private javax.swing.JButton usrProfButton;
    // End of variables declaration//GEN-END:variables
}
