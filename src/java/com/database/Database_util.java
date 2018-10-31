/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ektasharma
 */
public class Database_util {
    private static Connection connection;
    
    private Database_util(){
    }
    
    public static Connection getConnection() throws Exception {
        if(connection != null){
            return connection;
        } else {
            try {
                String url = "jdbc:oracle:thin:@calvin.humber.ca:1521:grok";
                String userName = "N01231869";
                String password = "oracle";
                Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection(url, userName, password);
                connection.setAutoCommit(false);
                return connection;
            }
            
            catch(ClassNotFoundException cnfe) {
                throw new Exception(cnfe);
            } catch (SQLException sqle){
                throw new Exception(sqle);
            }
        }
    }
}
