/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Conexion.Conexion;
import java.sql.*;


public class Bienes {
    
    private String Numero_Control_Bienes, Nombre_Bienes, Descripcion_Bienes, Modelo_Bienes, Num_Serie_Bienes, Cantidad_Bienes, Tipo_Escuela, Fecha_Ingreso_Bienes, Estado_Bienes, Observaciones_Bienes;
    private int Escuela_Id_Escuela;
    
    public Bienes(){
    
    }
    
    
     public Bienes Almacen(String Numero_Control_Bienes, String Nombre_Bienes, String Descripcion_Bienes, String Modelo_Bienes, String Num_Serie_Bienes, String Cantidad_Bienes, String Tipo_Escuela, String Fecha_Ingreso_Bienes, String Estado_Bienes, String Observaciones_Bienes) throws ClassNotFoundException{
        Bienes b = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = Conexion.getConnection();
             String activo = "select Numero_Control_Bienes, Nombre_Bienes, Descripcion_Bienes, Modelo_Bienes," 
                +"Num_Serie_Bienes, Cantidad_Bienes, Tipo_Escuela, Fecha_Ingreso_Bienes," 
                +"Estado_Bienes, Observaciones_Bienes FROM Bienes as b, Escuela as e"
                +"where b.Escuela_Id_Escuela = e.Id_Escuela"; 
             
            ps = con.prepareStatement(activo);
            ps.setString(1, Numero_Control_Bienes);
            ps.setString(2, Nombre_Bienes);
            ps.setString(3, Descripcion_Bienes);
            ps.setString(4, Modelo_Bienes);
            ps.setString(5, Num_Serie_Bienes );
            ps.setString(6, Cantidad_Bienes);
            ps.setString(7, Tipo_Escuela);
            ps.setString(8, Fecha_Ingreso_Bienes);
            ps.setString(9, Estado_Bienes);
            ps.setString(10, Observaciones_Bienes);

            rs = ps.executeQuery();
            while(rs.next()){
                b = new Bienes();
                
                b.setNumero_Control_Bienes(rs.getString("Numero de Control"));
                b.setNombre_Bienes(rs.getString("Nombre de los Bienes"));
                b.setDescripcion_Bienes(rs.getString("Descripcion de los Bienes"));
                b.setModelo_Bienes(rs.getString("Modelo de los Bienes"));
                b.setNum_Serie_Bienes(rs.getString("Numero de Serie de los Bienes"));
                b.setCantidad_Bienes(rs.getString("Cantidad de los Bienes"));
                b.setTipo_Escuela(rs.getString("Tipo de la Escuela"));
                b.setFecha_Ingreso_Bienes(rs.getString("Fecha de Ingreso de los Bienes"));
                b.setEstado_Bienes(rs.getString("Estado de los Bienes"));
                b.setObservaciones_Bienes(rs.getString("Observaciones de los Bienes"));

              
                break;
            }
        
        }catch(SQLException sq){
            System.out.println("Error al verificar al usuario");
            System.out.println(sq.getMessage());
            b = null;
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
        return b;
        
    }
     public static int registrarInvetario(Bienes b){
        int estatus = 0;
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = Conexion.getConnection();
            String q = "insert into Bienes(Numero_Control_Bienes, Nombre_Bienes, Descripcion_Bienes, Modelo_Bienes, Num_Serie_Bienes, Cantidad_Bienes, Escuela_Id_Escuela, Fecha_Ingreso_Bienes, Estado_Bienes, Observaciones_Bienes)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            
            ps = con.prepareStatement(q);
            
            ps.setString(1, b.getNumero_Control_Bienes());
            ps.setString(2, b.getNombre_Bienes());
            ps.setString(3, b.getDescripcion_Bienes());
            ps.setString(4, b.getModelo_Bienes());
            ps.setString(5, b.getNum_Serie_Bienes());
            ps.setString(6, b.getCantidad_Bienes());
            ps.setInt(7, b.getEscuela_Id_Escuela());
            ps.setString(8, b.getFecha_Ingreso_Bienes());
            ps.setString(9, b.getEstado_Bienes());
            ps.setString(10, b.getObservaciones_Bienes());
            
            estatus = ps.executeUpdate();
            System.out.println("Registro de cita exitoso");
            
        }catch(Exception e){
            System.out.println("Error al registrar la cta");
            System.out.println(e.getMessage());
            
        }
        return estatus;
    } 

    public String getNumero_Control_Bienes() {
        return Numero_Control_Bienes;
    }

    public void setNumero_Control_Bienes(String Numero_Control_Bienes) {
        this.Numero_Control_Bienes = Numero_Control_Bienes;
    }

    public String getNombre_Bienes() {
        return Nombre_Bienes;
    }

    public void setNombre_Bienes(String Nombre_Bienes) {
        this.Nombre_Bienes = Nombre_Bienes;
    }

    public String getDescripcion_Bienes() {
        return Descripcion_Bienes;
    }

    public void setDescripcion_Bienes(String Descripcion_Bienes) {
        this.Descripcion_Bienes = Descripcion_Bienes;
    }

    public String getModelo_Bienes() {
        return Modelo_Bienes;
    }

    public void setModelo_Bienes(String Modelo_Bienes) {
        this.Modelo_Bienes = Modelo_Bienes;
    }

    public String getNum_Serie_Bienes() {
        return Num_Serie_Bienes;
    }

    public void setNum_Serie_Bienes(String Num_Serie_Bienes) {
        this.Num_Serie_Bienes = Num_Serie_Bienes;
    }

    public String getCantidad_Bienes() {
        return Cantidad_Bienes;
    }

    public void setCantidad_Bienes(String Cantidad_Bienes) {
        this.Cantidad_Bienes = Cantidad_Bienes;
    }

    public String getTipo_Escuela() {
        return Tipo_Escuela;
    }

    public void setTipo_Escuela(String Tipo_Escuela) {
        this.Tipo_Escuela = Tipo_Escuela;
    }

    public String getFecha_Ingreso_Bienes() {
        return Fecha_Ingreso_Bienes;
    }

    public void setFecha_Ingreso_Bienes(String Fecha_Ingreso_Bienes) {
        this.Fecha_Ingreso_Bienes = Fecha_Ingreso_Bienes;
    }

    public String getEstado_Bienes() {
        return Estado_Bienes;
    }

    public void setEstado_Bienes(String Estado_Bienes) {
        this.Estado_Bienes = Estado_Bienes;
    }

    public String getObservaciones_Bienes() {
        return Observaciones_Bienes;
    }

    public void setObservaciones_Bienes(String Observaciones_Bienes) {
        this.Observaciones_Bienes = Observaciones_Bienes;
    }

    public int getEscuela_Id_Escuela() {
        return Escuela_Id_Escuela;
    }

    public void setEscuela_Id_Escuela(int Escuela_Id_Escuela) {
        this.Escuela_Id_Escuela = Escuela_Id_Escuela;
    }
    

     
}

