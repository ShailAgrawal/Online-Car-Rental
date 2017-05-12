/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Bean;

public class LoginBean {

    
    /*using get to access to variable and set method to modify the variable*/
    
    private String email, password, firstname;

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.email = firstname;
    }

}
