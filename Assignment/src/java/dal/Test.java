/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sio8
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      protected Connection connection;

    public DBContext() {
        try {
            String user = "tuyen";
            String pass = "t1u2y3e4n5tuyen";
            String url = "jdbc:sqlserver://NGO-TUNG-SON\\SQLEXPRESS:1433;databaseName=PRJ301-Assignment";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
