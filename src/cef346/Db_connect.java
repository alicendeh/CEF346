package cef346;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author benndip
 */
public class Db_connect {
   
    static final String DB_URL ="jdbc:mysql://localhost/JavaMessagingApp";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        }catch(Exception ex){
            System.out.println("Could'nt connect to database");
            System.out.println(ex);
            return null;
        }
    }
}
