/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_prakbasdat;

import java.sql.*;
/**
 *
 * @author kevin
 */
public class penyewaanmobil {


    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/rent";
        String user = "root";
        String pass = "2524";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            
            System.out.println("Driver load successfully");
            
        }catch (Exception e) {System.out.println(e);}
    }
    
}
