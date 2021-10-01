package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Conexion.Inventario;
import Modelo.Bienes;
import java.util.List;

public final class Inventario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <title> Inventario </title>\r\n");
      out.write("    <link rel=\"stylesheet\" href =\"css/EstiloBienesF.css\">\r\n");
      out.write("    <body>\r\n");
      out.write("        <header class =\"header\">\r\n");
      out.write("            <div class =\"container logo-nav-container\">\r\n");
      out.write("                <a href=\"./InicioPa.jsp\" class =\"logo\">Mantenimiento H y S</a>\r\n");
      out.write("                <nav class =\"menuSuperior\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                       <li><a href=\"./Bajas.jsp\">Historial de Bajas</a></li>\r\n");
      out.write("                        <li><a href=\"./Inventario.jsp\">Inventario</a></li>\r\n");
      out.write("                        <li><a href=\"./Contraturno.jsp\">Contraturno</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class =\"containe\">\r\n");
      out.write("            <br><br><br><br><br>\r\n");
      out.write("            </br>\r\n");
      out.write("                <div style=\"text-align: center;\"><h2><p style=\"color:#1f1f7a\" >Inventario</p></h2></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <a href=\"./NuevoRe.jsp\" >Nuevo Registro </a>\r\n");
      out.write("        \r\n");
      out.write("                <br /><br />\r\n");
      out.write("                \r\n");
      out.write("        <table border=\"1\" width=\"80%\">\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("            <thead> \r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                   \r\n");
      out.write("                    <th>Num Control</th>\r\n");
      out.write("                    <th>Nombre</th>\r\n");
      out.write("                    <th>Descripcion</th>\r\n");
      out.write("                    <th>Modelo</th>\r\n");
      out.write("                    <th>Num Serie</th>\r\n");
      out.write("                    <th>Cantidad</th>\r\n");
      out.write("                    <th>Ubicado</th>\r\n");
      out.write("                    <th>Fecha de Ingreso</th>\r\n");
      out.write("                    <th>Estado</th>\r\n");
      out.write("                    <th>Observaciones</th>\r\n");
      out.write("                    \r\n");
      out.write("                </tr>\r\n");
      out.write("                  </thead>\r\n");
      out.write("              <tbody>\r\n");
      out.write("                ");

                List<Bienes> lista = Inventario.consultarbienes();
                for(Bienes a : lista){
                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td>");
      out.print(a.getNumero_Control_Bienes());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(a.getNombre_Bienes());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(a.getDescripcion_Bienes());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(a.getModelo_Bienes());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(a.getNum_Serie_Bienes());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(a.getCantidad_Bienes());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(a.getTipo_Escuela());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(a.getFecha_Ingreso_Bienes());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(a.getEstado_Bienes());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(a.getObservaciones_Bienes());
      out.write("</td>\r\n");
      out.write("                    \r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                }
                
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body> \r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
