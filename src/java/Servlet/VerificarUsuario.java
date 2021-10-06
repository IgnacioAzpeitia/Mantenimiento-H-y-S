/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Modelo.login_usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class VerificarUsuario extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String Usuario_usuario = request.getParameter("Usuario_usuario");
            String Pass_usuario = request.getParameter("Pass_usuario");
            
            login_usuarios u = new login_usuarios();
            
            u = u.VerificarUsuario(Usuario_usuario, Pass_usuario);
            
            if(u != null){
                HttpSession sesionusu = request.getSession(true);
                sesionusu.setAttribute("Usuario_usuario", u);
                
                HttpSession sesionparametro = request.getSession();
                sesionparametro.setAttribute("Usuario_usuario", Usuario_usuario);
                
                if(u.getPrivilegio_usuario() == 1){
                    response.sendRedirect("InicioAdministrador.jsp");
                }

                
                if(u.getPrivilegio_usuario() == 2){
                    response.sendRedirect("error.jsp");
                }
                //Los puse en comentario por el motivo que de aun no estan disponibles las paginas
                
                //if(u.getPrivilegio() == 2){
                    //response.sendRedirect("");
                //}
                //if(u.getPrivilegio() == 3){
                    //response.sendRedirect("");
                //}
                //else{
                    //response.sendRedirect("./error.jsp");
                //}
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VerificarUsuario.class.getName()).log(Level.SEVERE,null,ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VerificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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