/*
 *   Project     : AccountAdmin
 *   Filename    : AccountAdmin.java
 *   Author      : Camarly Thomas <camarly@stu.ucc.edu.jm>
 *   Id.No.      : 20204241
 *   Course      : ITT
 *   Version     : 0.1
 *   Copyright   : All rights reserved 23 Nov 2021 18:41:32
 *   Description : 

 *   Function Name : 
 *   Purpose       : 
 *   Description   :

 */
package project;

import java.awt.Component;
import java.awt.Container;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static project.ResetPassword.pwdErrorMessage;
import static project.ResetPassword.success;

/**
 *
 * @author Camarly Thomas <camarly@stu.ucc.edu.jm>
 */
public class AccountAdmin extends javax.swing.JFrame {

    /**
     * Creates new form AccountAdmin
     */
    static String usr = "";

    public AccountAdmin(String usr01) throws SQLException {
        initComponents();
        setDefaultCloseOperation(InventoryManager.DISPOSE_ON_CLOSE);
        usr = usr01;
        if (SQLscripts.getUserType(usr).equals("Cashier")) {
            hidePane();
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

        otherUserPWDPane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        otherUserSubmitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        otherUserTextField = new javax.swing.JTextField();
        currentUserPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        currentUserSubmitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pwdField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        oldPwdField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        pwdField2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        currentUserTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        otherUserPWDPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Reset Other User Password"));
        otherUserPWDPane.setEnabled(false);

        jLabel2.setText("Reset other user password");

        otherUserSubmitButton.setText("SUBMIT");
        otherUserSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherUserSubmitButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("UserID");

        otherUserTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherUserTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout otherUserPWDPaneLayout = new javax.swing.GroupLayout(otherUserPWDPane);
        otherUserPWDPane.setLayout(otherUserPWDPaneLayout);
        otherUserPWDPaneLayout.setHorizontalGroup(
            otherUserPWDPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherUserPWDPaneLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(otherUserPWDPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(otherUserPWDPaneLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(otherUserPWDPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(otherUserSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(otherUserTextField))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        otherUserPWDPaneLayout.setVerticalGroup(
            otherUserPWDPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherUserPWDPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(otherUserPWDPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(otherUserSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        currentUserPanel.setBackground(new java.awt.Color(204, 255, 204));
        currentUserPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Reset My Password"));

        jLabel3.setText("Reset Own Password");

        currentUserSubmitButton.setText("SUBMIT");
        currentUserSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentUserSubmitButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Old Password");

        jLabel6.setText("New Password");

        oldPwdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPwdFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Re-enter Password");

        jLabel8.setText("userID");

        javax.swing.GroupLayout currentUserPanelLayout = new javax.swing.GroupLayout(currentUserPanel);
        currentUserPanel.setLayout(currentUserPanelLayout);
        currentUserPanelLayout.setHorizontalGroup(
            currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentUserPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(135, 135, 135))
            .addGroup(currentUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentUserPanelLayout.createSequentialGroup()
                        .addGroup(currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(currentUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(currentUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addGroup(currentUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdField1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdField2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentUserSubmitButton))
                        .addGap(74, 74, 74))))
        );
        currentUserPanelLayout.setVerticalGroup(
            currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentUserPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(currentUserSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(otherUserPWDPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(currentUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(otherUserPWDPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(currentUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void otherUserTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherUserTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherUserTextFieldActionPerformed

    private void oldPwdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPwdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPwdFieldActionPerformed

    private void otherUserSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherUserSubmitButtonActionPerformed
        if (otherUserTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "User Input details required", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // TODO add your handling code here:
                String userID = otherUserTextField.getText();
                SQLscripts.resetUserPWD(userID);
                JOptionPane.showMessageDialog(null, "Password changed to 'password', please advise user to create new password on next login", "Successful", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(AccountAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_otherUserSubmitButtonActionPerformed


    private void currentUserSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentUserSubmitButtonActionPerformed
        // TODO add your handling code here:
        String usr = currentUserTextField.getText();
        String oldPass = oldPwdField.getText();
        String pass = pwdField1.getText();
        String pass2 = pwdField2.getText();
        String pwd = "";
        
        if(pass.equals(pass2) && !pass.isEmpty()) {
            pwd = pass;
        }
        
        if(!pass.equals(pass2)) {
            pwdErrorMessage();
        }
        
        
        if(!pass.isEmpty() && !usr.isEmpty() && !oldPass.isEmpty() && !pass2.isEmpty()) {
            try {
                if(SQLscripts.changeMyPWD(usr, oldPass, pwd)) {
                    success();
                    this.dispose();
                    new Login().setVisible(true);
                }
                else {
                  JOptionPane.showMessageDialog(this, "Username and Password Incorrect", "User Error", JOptionPane.ERROR_MESSAGE);  
                }
            } catch (SQLException ex) {
                Logger.getLogger(ResetPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else {
            JOptionPane.showMessageDialog(this, "Inputs required", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_currentUserSubmitButtonActionPerformed

    //disabling admin password pane.
    public void hidePane() {
        for (Component component : otherUserPWDPane.getComponents()) {
            component.setEnabled(false);
        }
    }

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
            java.util.logging.Logger.getLogger(AccountAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountAdmin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AccountAdmin(usr).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AccountAdmin.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel currentUserPanel;
    private javax.swing.JButton currentUserSubmitButton;
    private javax.swing.JTextField currentUserTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField oldPwdField;
    private javax.swing.JPanel otherUserPWDPane;
    private javax.swing.JButton otherUserSubmitButton;
    private javax.swing.JTextField otherUserTextField;
    private javax.swing.JPasswordField pwdField1;
    private javax.swing.JPasswordField pwdField2;
    // End of variables declaration//GEN-END:variables

}
