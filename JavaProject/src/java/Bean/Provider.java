/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Bean;

public class Provider {

        //contains constant detail - driver and connection
    public final static String DRIVER = "com.mysql.jdbc.Driver";
    public final static String CONNECTION_URL = "jdbc:mysql://localhost:3307/cars";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "root";

    public String getDriver() {
        return DRIVER;
    }

    public String getConUrl() {
        return CONNECTION_URL;
    }

    public String getDBUser() {
        return USERNAME;
    }

    public String getDBPass() {
        return PASSWORD;
    }

}
