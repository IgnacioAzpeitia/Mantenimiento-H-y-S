/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Modelo.Bienes;
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
    public static List<Bienes> consultarbienes(){
        List<Bienes> lista = new ArrayList<Bienes>();
        
        try{
            Connection con = Conexion.getConnection();
             String q = "select Numero_Control_Bienes, Nombre_Bienes, Descripcion_Bienes, Modelo_Bienes," 
                +"Num_Serie_Bienes, Cantidad_Bienes, Tipo_Escuela, Fecha_Ingreso_Bienes," 
                +"Estado_Bienes, Observaciones_Bienes FROM Bienes, Escuela "
                +"where Bienes.Escuela_Id_Escuela = Escuela.Id_Escuela";
            
            PreparedStatement ac = con.prepareStatement(q);
            
            
            ResultSet rs = ac.executeQuery();
            while(rs.next()){
                Bienes a = new Bienes();
                a.setNumero_Control_Bienes(rs.getString(1));
                a.setNombre_Bienes(rs.getString(2));
                a.setDescripcion_Bienes(rs.getString(3));
                a.setModelo_Bienes(rs.getString(4));
                a.setNum_Serie_Bienes(rs.getString(5));
                a.setCantidad_Bienes(rs.getString(6));
                a.setTipo_Escuela(rs.getString(7));
                a.setFecha_Ingreso_Bienes(rs.getString(8));
                a.setEstado_Bienes(rs.getString(9));
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
