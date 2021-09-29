/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Conexion.Conexion;
import java.sql.*;

public class login_usuarios {
    

    
    private int Id_login_usuarios, Privilegio_usuario;
    private String Usuario_usuario, Pass_usuario;
    
    public login_usuarios(){
    
    }
    
    //CRUD usuario
    
    //un metodo para verificar el tipo de usuario segun el privilegio
    
    public login_usuarios VerificarUsuario(String Usuario_usuario, String Pass_usuario) throws ClassNotFoundException{
        login_usuarios u = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = Conexion.getConnection();
            String q = "select * from login_usuarios where Usuario_usuario = ? AND Pass_usuario = ?";
            ps = con.prepareStatement(q);
            ps.setString(1, Usuario_usuario);
            ps.setString(2, Pass_usuario);
            System.out.println(Usuario_usuario);
            System.out.println(Pass_usuario);
            rs = ps.executeQuery();
            while(rs.next()){
                u = new login_usuarios();
                u.setUsuario_usuario(rs.getString("Usuario_usuario"));
                u.setPass_usuario(rs.getString("Pass_usuario"));
                u.setPrivilegio_usuario(rs.getInt("Privilegio_usuario"));
                break;
            }
         }catch(SQLException sq){
            System.out.println("Error al verificar al usuario");
            System.out.println(sq.getMessage());
            u = null;
        }finally{
            try{
                rs.close();
                ps.close();
                con.close();
            
            }catch(Exception e){
                System.out.println("No encontro la clase");
                System.out.println(e.getMessage());
            
            }
        }
        return u;
    }

    public int getId_login_usuarios() {
        return Id_login_usuarios;
    }

    public void setId_login_usuarios(int Id_login_usuarios) {
        this.Id_login_usuarios = Id_login_usuarios;
    }

    public int getPrivilegio_usuario() {
        return Privilegio_usuario;
    }

    public void setPrivilegio_usuario(int Privilegio_usuario) {
        this.Privilegio_usuario = Privilegio_usuario;
    }

    public String getUsuario_usuario() {
        return Usuario_usuario;
    }

    public void setUsuario_usuario(String Usuario_usuario) {
        this.Usuario_usuario = Usuario_usuario;
    }

    public String getPass_usuario() {
        return Pass_usuario;
    }

    public void setPass_usuario(String Pass_usuario) {
        this.Pass_usuario = Pass_usuario;
    }

   

    
    
} 