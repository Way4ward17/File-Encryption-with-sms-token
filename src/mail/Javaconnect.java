/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *  
 * @author WAY4WARD
 */
public class Javaconnect {
     Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    
    public static Connection ConnecrDB(){
        try{
          Class.forName("org.h2.Driver");
          Connection conn = DriverManager.getConnection("jdbc:h2:~/sms","sa","");
     System.out.println("Connected");
            
            return conn; 
         
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
    }
   
}
