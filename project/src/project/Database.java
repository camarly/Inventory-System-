/*
 *   Project     : Database
 *   Filename    : Database.java
 *   Author      : Camarly Thomas <camarly@stu.ucc.edu.jm>
 *   Id.No.      : 20204241
 *   Course      : ITT
 *   Version     : 0.1
 *   Copyright   : All rights reserved 22 Nov 2021 22:35:39
 *   Description : 

 *   Function Name : 
 *   Purpose       : 
 *   Description   :

 */
package project;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

/**
 *
 * @author Camarly Thomas <camarly@stu.ucc.edu.jm>
 */
public class Database {
        
    public static Connection getConnection(String dbUrl, String user, String password) throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, user, password);
        return connection;
    }
    
    
    public static void closeConnection(Connection connection) {
        try {
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException exception) {
        }
    }
    
    
    public static void closeStatement(Statement statement) {
        try {
            if(statement != null) {
                statement.close();
            }
        } catch (SQLException exception) {
        }
    }
    
    
    public static void closeResultSet(ResultSet resultset) {
        try {
            if(resultset != null) {
                resultset.close();
            }
        } catch (SQLException exception) {
        }
    }
}
