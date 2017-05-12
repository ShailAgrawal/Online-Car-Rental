/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author OEM
 */
public class Register extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
   //returning the value of the parameter, now I can get the information needed from the HTML page
        String n=request.getParameter("firstname");  
        String p=request.getParameter("lastName");  
        String e=request.getParameter("email");  
        String c=request.getParameter("password"); 
        
        //calling object of method
        database db = new database();
        //call method for connection
        Connection con = db.getCon();
       try {
          
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "12345678");
           
            //creating PreparedStatement, establish session - it gives SQL statement when created and sent ro DBMS right away
            PreparedStatement ps = con.prepareStatement(
                    "insert into register values(?,?,?,?)");

            //setting parameter String value that is compatible with the defined SQL input parameter
            ps.setString(1, n);
            ps.setString(2, p);
            ps.setString(3, e);
            ps.setString(4, c);

            
            int i = ps.executeUpdate();
            
            //conditional If statement, when value more than 0, it should show successful registration
            if (i > 0) {
                out.println("Successful Registration, Welcome! ");
                response.sendRedirect("/RegistrationForm/profile.jsp");
            }
            
            //exception for try block 2
        } catch (Exception e2) {
            System.out.println(e2);
            if (e2.toString().contains("Duplicate")) {
                out.println("Failed to Register. Please contact us for support...");
            }
        }

        out.close();
    }
    }}