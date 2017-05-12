/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Bean;

import java.sql.*;

public class LoginDao {

    public static boolean loginValidate(LoginBean bean) {
        
        boolean status = false;
        PreparedStatement ps;
        try {

        //setting parameter String value that is compatible with the defined SQL input parameter
            ps = ConnectionProvider.dbConnection("select * from admin where `email`= ? and `password`= ?;");
            ps.setString(1, bean.getemail());
            ps.setString(2, bean.getpassword());
          
            
       
            //processing statement    
            ResultSet rs = ps.executeQuery();
            ///Validate the output
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;

    }
}
