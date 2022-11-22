/*
 *   Project     : SplashScreen
 *   Filename    : SplashScreen.java
 *   Author      : Camarly Thomas <camarly@stu.ucc.edu.jm>
 *   Id.No.      : 20204241
 *   Course      : ITT
 *   Version     : 0.1
 *   Copyright   : All rights reserved 24 Nov 2021 19:12:26
 *   Description : 

 *   Function Name : 
 *   Purpose       : 
 *   Description   :

 */
package project;

/**
 *
 * @author Camarly Thomas <camarly@stu.ucc.edu.jm>
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SpashScreen
     */
    public SplashScreen() {
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

        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ampersand = new javax.swing.JLabel();
        progressBAr = new javax.swing.JProgressBar();
        bkImg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Iosevka", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("MIHAWK 1.0 ");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 210, 60));

        jLabel1.setFont(new java.awt.Font("Iosevka", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SALES INVENTORY MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 320, 30));

        ampersand.setForeground(new java.awt.Color(255, 255, 255));
        ampersand.setText("       %");
        getContentPane().add(ampersand, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));
        getContentPane().add(progressBAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 240, -1));

        bkImg.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.selectionBackground"));
        bkImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/hawk.jpeg"))); // NOI18N
        getContentPane().add(bkImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        jPanel1.setBackground(new java.awt.Color(164, 191, 223));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 710, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void Run() throws InterruptedException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        SplashScreen  start = new SplashScreen();
        
        start.setVisible(true);
        
        try {
            for(int i = 0; i<=100; i++) {
                Thread.sleep(30);
                start.progressBAr.setValue(i);
                start.ampersand.setText(Integer.toString(i) + "%");
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        
        start.dispose();
        start.setVisible(false);
        
        Login login = new Login();
        login.setVisible(true);
        
        
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ampersand;
    private javax.swing.JLabel bkImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progressBAr;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
