/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import Conexion.Conexion;
import java.sql.*;


public class bienes {
    

    
    private int Numero_Inventario_Bienes, Cantidad_Bienes;
    private String Numero_Control_Bienes, Modelo__Serie_Bienes, Fecha_Ingreso_Bienes, Estado_Bienes, Bienes_No_Localizados_Bienes, Observaciones_Bienes, Fecha_Entrada_Bienes, Fecha_Salida_Bienes, TipoAL_Escuela, Descripcion_Bienes;
    
    public bienes(){
    
    }
    
    
     public bienes bienes_activos(String Numero_Control_Bienes, String TipoAL_Escuela, String Descripcion_Bienes, String Modelo__Serie_Bienes, String Fecha_Ingreso_Bienes, String Estado_Bienes, String Bienes_No_Localizados_Bienes, String Observaciones_Bienes, String Fecha_Entrada_Bienes, String Fecha_Salida_Bienes, int Numero_Inventario_Bienes, int Cantidad_Bienes) throws ClassNotFoundException{
        bienes b = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = Conexion.getConnection();
             String activo = "select Numero_Control_Bienes, Descripcion_Bienes, Cantidad_Bienes, Modelo__Serie_Bienes,"
                    + "Numero_Inventario_Bienes, TipoAL_Escuela, Fecha_Ingreso_Bienes, Estado_Bienes,"
                    + "Bienes_No_Localizados_Bienes, Observaciones_Bienes FROM Bienes, Escuela"; 
             
            ps = con.prepareStatement(activo);
            ps.setString(1, Numero_Control_Bienes);
            ps.setString(2, Descripcion_Bienes);
            ps.setInt(3, Cantidad_Bienes);
            ps.setString(4, Modelo__Serie_Bienes);
            ps.setInt(5, Numero_Inventario_Bienes );
            ps.setString(6, TipoAL_Escuela);
            ps.setString(7, Fecha_Ingreso_Bienes);
            ps.setString(8, Estado_Bienes);
            ps.setString(9, Bienes_No_Localizados_Bienes);
            ps.setString(10, Observaciones_Bienes);

            rs = ps.executeQuery();
            while(rs.next()){
                b = new bienes();
                
                b.setNumero_Control_Bienes(rs.getString("Numero_Control_Bienes"));
                b.setDescripcion_Bienes(rs.getString("Descripcion_Bienes"));
                b.setCantidad_Bienes(rs.getInt("Cantidad_Bienes"));
                b.setModelo__Serie_Bienes(rs.getString("Modelo__Serie_Bienes"));
                b.setNumero_Inventario_Bienes(rs.getInt("Numero_Inventario_Bienes"));
                b.setTipoAL_Escuela(rs.getString("TipoAL_Escuela"));
                b.setFecha_Ingreso_Bienes(rs.getString("Fecha_Ingreso_Bienes"));
                b.setEstado_Bienes(rs.getString("Estado_Bienes"));
                b.setBienes_No_Localizados_Bienes(rs.getString("Bienes_No_Localizados_Bienes"));
                b.setObservaciones_Bienes(rs.getString("Observaciones_Bienes"));

              
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

    public int getNumero_Inventario_Bienes() {
        return Numero_Inventario_Bienes;
    }

    public void setNumero_Inventario_Bienes(int Numero_Inventario_Bienes) {
        this.Numero_Inventario_Bienes = Numero_Inventario_Bienes;
    }

    public int getCantidad_Bienes() {
        return Cantidad_Bienes;
    }

    public void setCantidad_Bienes(int Cantidad_Bienes) {
        this.Cantidad_Bienes = Cantidad_Bienes;
    }

    public String getNumero_Control_Bienes() {
        return Numero_Control_Bienes;
    }

    public void setNumero_Control_Bienes(String Numero_Control_Bienes) {
        this.Numero_Control_Bienes = Numero_Control_Bienes;
    }

    public String getModelo__Serie_Bienes() {
        return Modelo__Serie_Bienes;
    }

    public void setModelo__Serie_Bienes(String Modelo__Serie_Bienes) {
        this.Modelo__Serie_Bienes = Modelo__Serie_Bienes;
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

    public String getBienes_No_Localizados_Bienes() {
        return Bienes_No_Localizados_Bienes;
    }

    public void setBienes_No_Localizados_Bienes(String Bienes_No_Localizados_Bienes) {
        this.Bienes_No_Localizados_Bienes = Bienes_No_Localizados_Bienes;
    }

    public String getObservaciones_Bienes() {
        return Observaciones_Bienes;
    }

    public void setObservaciones_Bienes(String Observaciones_Bienes) {
        this.Observaciones_Bienes = Observaciones_Bienes;
    }

    public String getFecha_Entrada_Bienes() {
        return Fecha_Entrada_Bienes;
    }

    public void setFecha_Entrada_Bienes(String Fecha_Entrada_Bienes) {
        this.Fecha_Entrada_Bienes = Fecha_Entrada_Bienes;
    }

    public String getFecha_Salida_Bienes() {
        return Fecha_Salida_Bienes;
    }

    public void setFecha_Salida_Bienes(String Fecha_Salida_Bienes) {
        this.Fecha_Salida_Bienes = Fecha_Salida_Bienes;
    }

    public String getTipoAL_Escuela() {
        return TipoAL_Escuela;
    }

    public void setTipoAL_Escuela(String TipoAL_Escuela) {
        this.TipoAL_Escuela = TipoAL_Escuela;
    }

    public String getDescripcion_Bienes() {
        return Descripcion_Bienes;
    }

    public void setDescripcion_Bienes(String Descripcion_Bienes) {
        this.Descripcion_Bienes = Descripcion_Bienes;
    }




     
}

