package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contraturno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>  \n");
      out.write("                <title> Contraturno </title>\n");
      out.write("    <link rel=\"stylesheet\" href =\"css/EstiloBienesF.css\">\n");
      out.write("    <body>\n");
      out.write("        <header class =\"header\">\n");
      out.write("            <div class =\"container logo-nav-container\">\n");
      out.write("                <a href=\"./InicioPa.jsp\" class =\"logo\">Mantenimiento H y S</a>\n");
      out.write("                <nav class =\"menuSuperior\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"./Bajas.jsp\">Historial de Bajas</a></li>\n");
      out.write("                        <li><a href=\"./Inventario.jsp\">Inventario</a></li>\n");
      out.write("                        <li><a href=\"./Contraturno.jsp\">Contraturno</a></li>\n");
      out.write("            </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class =\"container\">\n");
      out.write("            <br><br><br><br><br>\n");
      out.write("            </br>\n");
      out.write("                <div style=\"text-align: center;\"><h2><p style =\"color: #1f1f7a\">Contraturno</p></h2></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <a href=\"./NuevoRe.jsp\" >Nuevo Registro </a>\n");
      out.write("        \n");
      out.write("                <br /><br />\n");
      out.write("                \n");
      out.write("        <table border=\"1\" width=\"80%\">\n");
      out.write("        \n");
      out.write("            <thead> \n");
      out.write("                <tr>\n");
      out.write("                    <th>Boleta/Num Empleado<th/>\n");
      out.write("                    <th>Nombre Completo<th/>\n");
      out.write("                    <th>Descripcion<th/>\n");
      out.write("                    <th>Modelo y Num Serie<th/>\n");
      out.write("                    <th>Num Inventario<th/>\n");
      out.write("                    <th>Num Aula/laboratorio<th/>\n");
      out.write("                     <th>Fecha de Prestamo/Entrada<th/>\n");
      out.write("                    <th>Fecha de Prestamo/Salida<th/>\n");
      out.write("                    <th>Estado<th/>\n");
      out.write("                    <th>Bienes no localizados fisicamente<th/>\n");
      out.write("                    <th>Observaciones<th/>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                  </thead>\n");
      out.write("                  \n");
      out.write("        </table>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
