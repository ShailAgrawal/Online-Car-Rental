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
 * @author OEM
 */
public class database {
       
        //creating my database connection
        Connection con; 
        public Connection getCon()
    {
    try {  
        //loading driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //establishing connection
        DriverManager.getConnection("jdbc:mysql://localhost:3307/cars","root","root"); 
   
    
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
    }

    return con;
}

}
    