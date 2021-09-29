/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author Ignacio
 */
public class Conexion {
    
    public static Connection getConnection(){
        String url, userName, password;
        
        url = "jdbc:mysql:3306//localhost/sistema_bd";
        userName = "root";
        password = "Camaron890.";
        
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://localhost/sistema_bd";
            con = DriverManager.getConnection(url, userName, password);
            
            System.out.println("Conexion Exitosa");
        
        }catch(Exception e){
            
            System.out.println("Conexion no Exitosa");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            
        }
        return con;
    }

    public static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
