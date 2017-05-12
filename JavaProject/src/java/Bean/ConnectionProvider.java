/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Bean;

import java.sql.*;

public class ConnectionProvider {

    //establishes connection with the database
    public static PreparedStatement dbConnection(String sql) throws ClassNotFoundException, SQLException {
        //calls object of method 
        Provider prov = new Provider();
        PreparedStatement ps = null;
        
        //calls for the values from provider.java
        Class.forName(prov.getDriver());
        Connection con = DriverManager.getConnection(prov.getConUrl(), prov.getDBUser(), prov.getDBPass());
        ps = con.prepareStatement(sql);
        return ps;
    }
}
