package ipproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rishika
 */
public class mySqlDBConnection {
    
    public static Connection getConnection(){
        
        Connection conn = null;
        try {
            Class.forName("java.sql.DriverManager");
            
            conn = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/Tours", "root", "sql");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mySqlDBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex2){
            Logger.getLogger(mySqlDBConnection.class.getName()).log(Level.SEVERE, null, ex2);
        }
        return conn;
    }
    
}
