/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Modelo.Bienes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class NuevoBien extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String Numero_Control_Bienes, Nombre_Bienes, Descripcion_Bienes, Modelo_Bienes, Num_Serie_Bienes, Cantidad_Bienes, Fecha_Ingreso_Bienes, Estado_Bienes, Observaciones_Bienes;
           
            
            Numero_Control_Bienes = request.getParameter("Numero_Control_Bienes");
            Nombre_Bienes = request.getParameter("Nombre_Bienes");
            Descripcion_Bienes = request.getParameter("Descripcion_Bienes");
            Modelo_Bienes = request.getParameter("Modelo_Bienes");
            Num_Serie_Bienes = request.getParameter("Num_Serie_Bienes");
            Cantidad_Bienes = request.getParameter("Cantidad_Bienes");
            Fecha_Ingreso_Bienes = request.getParameter("Fecha_Ingreso_Bienes");
            Estado_Bienes = request.getParameter("Estado_Bienes");
            Observaciones_Bienes = request.getParameter("Observaciones_Bienes");
            
            Bienes b = new Bienes();
            int Escuela_Id_Escuela = Integer.parseInt(request.getParameter("Escuela_Id_Escuela"));
            
            b.setNumero_Control_Bienes(Numero_Control_Bienes);
            b.setNombre_Bienes(Nombre_Bienes);
            b.setDescripcion_Bienes(Descripcion_Bienes);
            b.setModelo_Bienes(Modelo_Bienes);
            b.setNum_Serie_Bienes(Num_Serie_Bienes);
            b.setCantidad_Bienes(Cantidad_Bienes);
            b.setEscuela_Id_Escuela(Escuela_Id_Escuela);
            b.setFecha_Ingreso_Bienes(Fecha_Ingreso_Bienes);
            b.setEstado_Bienes(Estado_Bienes);
            b.setObservaciones_Bienes(Observaciones_Bienes);
            
            int estatus = Bienes.registrarInvetario(b);
            
            if(estatus > 0){
                response.sendRedirect("./Inventario.jsp");
            }else{
                response.sendRedirect("./error.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
