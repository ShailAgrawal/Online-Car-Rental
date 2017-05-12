/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Bean.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OEM
 */
public class UserDao {
    public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/cars","root","root");  
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(User u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into customer (Cus_name , Cus_email, password, age) values(?,?,?,?)");  
        
        ps.setString(1,u.getName());
        ps.setString(2,u.getEmail());
        ps.setString(3,u.getPassword());
        ps.setInt(4,u.getAge());
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  

public static int update(User u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update customer set `Cus_name`=?,  `Cus_email`=?, `password`=? where `CustmorID`=?");  
        ps.setString(1,u.getName());        
        ps.setString(2,u.getEmail());
        ps.setString(3,u.getPassword());
        ps.setInt(4,u.getId());  
       
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(User u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from customer where CustmorID=?"); 
        ps.setInt(1,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<User> getAllRecords(){  
    List<User> list1=new ArrayList<User>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from customer");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            User u=new User();  
         
            u.setId(rs.getInt("CustmorID"));
            u.setName(rs.getString("Cus_name"));
             u.setEmail(rs.getString("Cus_email"));
              u.setPassword(rs.getString("password"));
          
            list1.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list1;  
} 
public static User getRecordById(int id){  
    User u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from customer where custmorID=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new User(); 
            u.setId(rs.getInt("CustmorID"));
            
            u.setName(rs.getString("Cus_name"));
           
            u.setEmail(rs.getString("Cus_email"));
            u.setPassword(rs.getString("password"));
            
          u.setId(rs.getInt("age"));
            
         
          
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
public static int updateprofile(User u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update customer set `Cus_name`=?, `Cus_email`=?, `password`=? where `CustmorID`=?");  
        ps.setString(1,u.getName());
        ps.setString(2,u.getEmail());
        ps.setString(3,u.getPassword());
        ps.setInt(4,u.getId());  
       
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
    
}
