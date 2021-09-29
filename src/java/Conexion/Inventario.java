/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Modelo.bienes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ignacio
 */
public class Inventario {
    public static List<bienes> consultarbienes(){
        List<bienes> lista = new ArrayList<bienes>();
        
        try{
            Connection con = Conexion.getConnection();
             String q = "select Numero_Control_Bienes, Descripcion_Bienes, Cantidad_Bienes, Modelo__Serie_Bienes,"
                    + "Numero_Inventario_Bienes, TipoAL_Escuela, Fecha_Ingreso_Bienes, Estado_Bienes,"
                    + "Bienes_No_Localizados_Bienes, Observaciones_Bienes FROM Bienes, Escuela"; 
            
            PreparedStatement ac = con.prepareStatement(q);
            
            
            ResultSet rs = ac.executeQuery();
            while(rs.next()){
                bienes a = new bienes();
                a.setNumero_Control_Bienes(rs.getString(1));
                a.setDescripcion_Bienes(rs.getString(2));
                a.setCantidad_Bienes(rs.getInt(3));
                a.setModelo__Serie_Bienes(rs.getString(4));
                a.setNumero_Inventario_Bienes(rs.getInt(5));
                a.setTipoAL_Escuela(rs.getString(6));
                a.setFecha_Ingreso_Bienes(rs.getString(7));
                a.setEstado_Bienes(rs.getString(8));
                a.setBienes_No_Localizados_Bienes(rs.getString(9));
                a.setObservaciones_Bienes(rs.getString(10));

                lista.add(a);
            }
            System.out.println("Se encontro su Informacion");
            con.close();
        }catch(Exception ed){
            System.out.println("Error al buscar su Informacion");
            System.out.println(ed.getMessage());
            
        }
        return lista;
    }
}
