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
public class StaffDao {
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
"insert into staff (Name, Email, Password, age) values(?,?,?,?)");  
        
        ps.setString(1,u.getName());
        ps.setString(2,u.getPassword());
        ps.setString(3,u.getEmail());
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
"update staff set `Name`=?,  `Email`=?, `Password`=? where `Staff_id`=?");  
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
        PreparedStatement ps=con.prepareStatement("delete from staff where Staff_id=?"); 
        ps.setInt(1,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<User> getAllRecords(){  
    List<User> list=new ArrayList<User>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from staff");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            User u=new User();  
         
            u.setId(rs.getInt("Staff_id"));
            u.setName(rs.getString("Name"));
             u.setEmail(rs.getString("Email"));
              u.setPassword(rs.getString("Password"));
          
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static User getRecordById(int id){  
    User u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from staff where Staff_id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new User(); 
            u.setId(rs.getInt("Staff_id"));
            
            u.setName(rs.getString("Name"));
           
            u.setEmail(rs.getString("Email"));
            u.setPassword(rs.getString("Password"));
            
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
"update staff set `Name`=?,  `Password`=?, `Email`=? where `Staff_id`=?");  
        ps.setString(1,u.getName());
        ps.setString(2,u.getPassword());
        ps.setString(3,u.getEmail());
        ps.setInt(4,u.getId());  
       
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
    
}
