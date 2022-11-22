/*
 *   Project     : SQLscripts
 *   Filename    : SQLscripts.java
 *   Author      : Camarly Thomas <camarly@stu.ucc.edu.jm>
 *   Id.No.      : 20204241
 *   Course      : ITT
 *   Version     : 0.1
 *   Copyright   : All rights reserved 27 Nov 2021 14:20:58
 *   Description : 

 *   Function Name : 
 *   Purpose       : 
 *   Description   :

 */
package project;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Camarly Thomas <camarly@stu.ucc.edu.jm>
 */
public class SQLscripts {

    static Connection con = null;
    static Statement statement = null;
    static ResultSet result = null;

    static String DBUrl = "jdbc:mysql://localhost:3306/ThomasHardware";
    static String DBuser = "root";
    static String DBpassword = "root";

    public static boolean login(String usr, String pass) throws SQLException {

        Boolean loggedIn = false;
        String SQL = "{CALL getUserInfo(?, ?)}";

        String user = usr;
        String pwd = pass;

        con = Database.getConnection(DBUrl, DBuser, DBpassword);
        try (CallableStatement cstmt = con.prepareCall(SQL); CallableStatement pstmt = con.prepareCall(SQL); Scanner input = new Scanner(System.in)) {
            cstmt.setString(1, usr);
            cstmt.setString(2, pass);
            ResultSet rest = cstmt.executeQuery();
            while (rest.next()) {
                if ("TRUE".equals(rest.getString(1))) {
                    loggedIn = true;

                } else {
                    loggedIn = false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loggedIn;

    }

    public static boolean updatePWD(String usr, String pass, String answer) throws SQLException {
        Boolean pwdChanged = false;

        String DBUrl = "jdbc:mysql://localhost:3306/ThomasHardware";
        String DBuser = "root";
        String DBpassword = "root";

        String SQL = "{CALL changePWD(?, ?, ?)}";
        String validateInfo = "{CALL userExists(?)}";

        String user = usr;
        String pwd = pass;
        String ans = answer;

        con = Database.getConnection(DBUrl, DBuser, DBpassword);
        try (CallableStatement changePwd = con.prepareCall(SQL); CallableStatement pstmt = con.prepareCall(SQL); CallableStatement findUser = con.prepareCall(validateInfo); CallableStatement pstmt2 = con.prepareCall(validateInfo);) {
            findUser.setString(1, usr);
            changePwd.setString(1, usr);
            changePwd.setString(2, pwd);
            changePwd.setString(3, ans);
            result = findUser.executeQuery();
            while (result.next()) {
                if (result.getString("UserID").equals(usr)) {
                    ResultSet rest = changePwd.executeQuery();
                    pwdChanged = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pwdChanged;
    }

    public static boolean resetUserPWD(String usr) throws SQLException {
        Connection con = null;
        Statement statement = null;
        ResultSet result = null;
        Boolean pwdChanged = false;

        String DBUrl = "jdbc:mysql://localhost:3306/ThomasHardware";
        String DBuser = "root";
        String DBpassword = "root";

        String sql = "UPDATE Passwords SET pwd = 'yellow' WHERE UserID = '" + usr + "'";
        String validateInfo = "{CALL userExists(?)}";

        String user = usr;

        con = Database.getConnection(DBUrl, DBuser, DBpassword);
        try (CallableStatement findUser = con.prepareCall(validateInfo); CallableStatement pstmt2 = con.prepareCall(validateInfo);) {
            statement = con.createStatement();
            findUser.setString(1, usr);
            result = findUser.executeQuery();
            while (result.next()) {
                if (result.getString("UserID").equals(usr)) {
                    System.out.println(result.getString("UserID").equals(usr));
                    statement.executeUpdate(sql);
                    pwdChanged = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pwdChanged;
    }
 
    
    public static double getAppAMNT(String date) throws SQLException {
        Connection con = null;
        Statement statement = null;
        ResultSet result = null;
        Boolean pwdChanged = false;

        String DBUrl = "jdbc:mysql://localhost:3306/ThomasHardware";
        String DBuser = "root";
        String DBpassword = "root";
        
        String mydate = date;

        double total = 0.00;
        
        String sql =   "SELECT SUM(TotalSalePrice) AS TotalSalePrice FROM OrderItems WHERE purchaseDate = '" + mydate + "'";
  
        con = Database.getConnection(DBUrl, DBuser, DBpassword);
        try {
            statement = con.createStatement();
            result = statement.executeQuery(sql);
            while (result.next()) {
                total = result.getDouble("TotalSalePrice");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
    
    

    public static String[] getUserName(String usr) throws SQLException {
//        String SQL = "{CALL getUserInfo()}";
//        String[] userInfo = new String[2];
//        String lName = "";
//        String fName = "";
//
//        con = Database.getConnection(DBUrl, DBuser, DBpassword);
//        try (CallableStatement cstmt = con.prepareCall(SQL); CallableStatement pstmt = con.prepareCall(SQL); Scanner input = new Scanner(System.in)) {
//            ResultSet rest = cstmt.executeQuery();
//            while (rest.next()) {
//                lName = rest.getString("Lname");
//                fName = rest.getString("Fname"); 
//            }
//                userInfo[0] = fName;
//                userInfo[1] = lName;
//                System.out.println(userInfo[0] + "" + userInfo[1]);
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return userInfo;

        String SQL = "{CALL userExists2(?)}";
        String userInfo[] = new String[2];
        String lname = "";
        String fname = "";

        con = Database.getConnection(DBUrl, DBuser, DBpassword);
        try (CallableStatement cstmt = con.prepareCall(SQL); CallableStatement pstmt = con.prepareCall(SQL); Scanner input = new Scanner(System.in)) {
            cstmt.setString(1, usr);
            result = cstmt.executeQuery();
            while (result.next()) {
                lname = result.getString("LName");
                fname = result.getString("FName");
            }
            userInfo[0] = lname;
            userInfo[1] = fname;
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userInfo;

    }

    public static boolean changeMyPWD(String usr, String oldPass, String pwd) throws SQLException {
        Connection con = null;
        Statement statement = null;
        ResultSet result = null;
        Boolean pwdChanged = false;

        String DBUrl = "jdbc:mysql://localhost:3306/ThomasHardware";
        String DBuser = "root";
        String DBpassword = "root";
        
        String password1 = pwd;
        

        String sql = "UPDATE Passwords SET pwd = '" + password1 + "' WHERE UserID = '" + usr + "'";
        String validateInfo = "{CALL userExists(?)}";

        String user = usr;

        con = Database.getConnection(DBUrl, DBuser, DBpassword);
        try (CallableStatement findUser = con.prepareCall(validateInfo);) {
            statement = con.createStatement();
            findUser.setString(1, usr);
            result = findUser.executeQuery();
            while (result.next()) {
                if(!result.getString("UserID").equals(user)) {
                    JOptionPane.showMessageDialog(null, "User does not exist", "User Error", JOptionPane.ERROR_MESSAGE);
                } else if (result.getString("Pwd").equals(oldPass)) {
                    System.out.println(result.getString("UserID").equals(user));
                    statement.executeUpdate(sql);
                    pwdChanged = true;
                } else {
                    JFrame parent = new JFrame();
                    JOptionPane.showMessageDialog(parent, "Old password does not match", "Key Match Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return pwdChanged;

    }

    public static String getUserType(String usr) throws SQLException {
        String SQL = "{CALL userExists2(?)}";
        String role = "";

        con = Database.getConnection(DBUrl, DBuser, DBpassword);
        try (CallableStatement cstmt = con.prepareCall(SQL); CallableStatement pstmt = con.prepareCall(SQL); Scanner input = new Scanner(System.in)) {
            cstmt.setString(1, usr);
            result = cstmt.executeQuery();
            while (result.next()) {
                role = result.getString("TypeOfUser");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return role;
    }

}
