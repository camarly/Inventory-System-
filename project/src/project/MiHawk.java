/*
 *   Project     : MiHawk
 *   Filename    : MiHawk.java
 *   Author      : Camarly Thomas <camarly@stu.ucc.edu.jm>
 *   Id.No.      : 20204241
 *   Course      : ITT
 *   Version     : 0.1
 *   Copyright   : All rights reserved 22 Nov 2021 22:34:42
 *   Description : 

 *   Function Name : 
 *   Purpose       : 
 *   Description   :

 */
package project;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Camarly Thomas <camarly@stu.ucc.edu.jm>
 */
public class MiHawk {
        static Connection con = null;
        static Statement statement = null;
        static ResultSet result = null;
        

    /**
     * @param args the command line arguments
     *
     *
     */
    public static void start() {
//        HashMap<String, String> usrCredentials = new HashMap();
        try {
           SplashScreen.Run();
        } catch (Exception e) {
            JFrame errorWindow = new JFrame();
            JOptionPane.showMessageDialog(errorWindow, "Resources Missing - Please ensure that all files are in the project folder");
        }
//        return usrCredentials;
    }

//    public static void updatePWD(String password) {
//
//    }
    
    public static boolean validatePassword(String usr, String pwd, String dbusr, String dbpwd) {
        boolean success = false;
        
        if (usr.equals(dbusr) && pwd.equals(dbpwd)) {
            System.out.println("User logged in.");
            success = true;
        }
        else if (!usr.equals(dbusr) && pwd.equals(dbpwd)) {
            System.out.println("UserID incorrect.");
            success = false;
        }
        else if (usr.equals(dbusr) && !pwd.equals(dbpwd)) {
            System.out.println("User password incorrect.");
            success = false;
        }
        return success;
    }
    
//    public static void loginUser(String user, String passWord) throws SQLException {
//        Connection con = null;
//        Statement statement = null;
//        ResultSet result = null;
//        
//        String DBUrl = "jdbc:mysql://localhost:3306/ThomasHardware";
//        String DBuser = "root";
//        String DBpassword = "root";
//        
//        String SQL = "{CALL getUserInfo(?, ?)}";
//        String usr = user;
//        String userpwd = passWord;
//        
//        con = Database.getConnection(DBUrl, DBuser, DBpassword);
//        try (CallableStatement cstmt = con.prepareCall(SQL);CallableStatement pstmt = con.prepareCall(SQL);Scanner input = new Scanner(System.in)) {
//            cstmt.setString(1, usr);
//            cstmt.setString(2, userpwd);
////            ResultSet results = cstmt.executeQuery();
////            results.next();
////            while(results.next()) {
////                if(results.toString() == "TRUE") {
////                    MainFrame.runMain();
////                    JFrame errorWindow = new JFrame();
////                    JOptionPane.showMessageDialog(errorWindow, "User Logged In");
////                }
////                else {
////                    JFrame errorWindow = new JFrame();
////                    JOptionPane.showMessageDialog(errorWindow, "Invalid User Credentials");
////                }
////            }
////              
////                String Id = rest.getString("UserID");
////                String pwd = rest.getString("Pwd");
////                  boolean attempt = validatePassword(uname, upass, Id, pwd);
////                  if(attempt) {
////                      System.out.println("Logged in");
////                  }
////                  else {
////                      System.out.println("Invalid");
////                  }
////            }
//            
//            String uname = input.nextLine();
//            System.out.println("Enter password: ");
//            String upass = input.nextLine();
//            cstmt.setString(1, uname);
//            ResultSet rest = cstmt.executeQuery();
//            while(rest.next()) {
//                String Id = rest.getString("UserID");
//                String pwd = rest.getString("Pwd");
//                  boolean attempt = validatePassword(uname, upass, Id, pwd);
//                  if(attempt) {
//                      System.out.println("Logged in");
//                  }
//                  else {
//                      System.out.println("Invalid");
//                  }
//            }
//        } 
//        catch( SQLException e){
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws SQLException {
        
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        
        String DBUrl = "jdbc:mysql://localhost:3306/ThomasHardware";
        String DBuser = "root";
        String DBpassword = "root";
//
//        
        try {
            connection = Database.getConnection(DBUrl, DBuser, DBpassword);
            System.out.println("Thomas' Hardware Database connection successful");
//            
////            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
////            String sql = "SELECT * FROM Users WHERE TypeOfUser = Manager";
//////            String sql = "SELECT password FROM passwords WHERE UserID = ";
////            
////            result = statement.executeQuery(sql);
//////        statement = connection.createStatement();
//////        statement.executeUpdate("INSERT INTO `users`(`userID`, `Fname`, `Lname`) VALUES ('0002','myName2','yourName2')");
//////        statement.executeUpdate("CREATE TABLE `testSales`(`saleID` INT(7) NOT NULL, `ProductName` VARCHAR(30), `SalePrice` real, PRIMARY KEY(saleID)");
////
//////        statement.executeQuery("INSERT INTO `users`(`userID`, `Fname`, `Lname`) VALUES ('0001','myName','yourName')");
////            while(result.next()) {
////                System.out.println(result.getString(1));
////            }
//        start();
        } catch (SQLException exception) {
        } finally {
            Database.closeResultSet(result);
            Database.closeStatement(statement);
            Database.closeConnection(connection);
        }
//start();
            try {
                new SplashScreen().Run();
            } catch (InterruptedException ex) {
                Logger.getLogger(MiHawk.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    static void callSalesWindow() throws SQLException {
        SaleWindow sales = new SaleWindow();
        sales.setVisible(true);
    }

    static void callInventoryManager() {
            try {
                InventoryManager invWin = new InventoryManager();
                invWin.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(MiHawk.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    static void callAccountAdmin(String usr) throws SQLException {
//        setDefaultCloseOperation(InventoryManager.DISPOSE_ON_CLOSE);
        if(SQLscripts.getUserType(usr).equals("Cashier")) {
//            hidePane();
            ResetPassword accManCashier = new ResetPassword();
            accManCashier.setVisible(true);
        }
        else {
            AccountAdmin accMan = new AccountAdmin(usr);
            accMan.setVisible(true);
        }
    }

    static void callBalancing() {
        Balancing balWin = new Balancing();
        balWin.setVisible(true);
    }

    static void tableDelMsg() {
        JFrame errorWindow = new JFrame();
        JOptionPane.showMessageDialog(errorWindow, "Item Deleted");

    }


    static void tableDeleteErrorMsg() {
        JFrame errorWindow = new JFrame();
        JOptionPane.showMessageDialog(errorWindow, "Error, Nothing to Delete");

    }

    static void upDateError() {
        JFrame errorWindow = new JFrame();
        JOptionPane.showMessageDialog(errorWindow, "Error, Nothing to Update");
    }
    
    
//     /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MiHawk().setVisible(true);
//            }
//        });
        
}
