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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <title> Inventario </title>\n");
      out.write("    <link rel=\"stylesheet\" href =\"css/EstiloBienesF.css\">\n");
      out.write("    <body>\n");
      out.write("        <header class =\"header\">\n");
      out.write("            <div class =\"container logo-nav-container\">\n");
      out.write("                <a href=\"./InicioPa.jsp\" class =\"logo\">Mantenimiento H y S</a>\n");
      out.write("                <nav class =\"menuSuperior\">\n");
      out.write("                    <ul>\n");
      out.write("                       <li><a href=\"./Bajas.jsp\">Historial de Bajas</a></li>\n");
      out.write("                        <li><a href=\"./Inventario.jsp\">Inventario</a></li>\n");
      out.write("                        <li><a href=\"./Contraturno.jsp\">Contraturno</a></li>\n");
      out.write("            </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class =\"containe\">\n");
      out.write("            <br><br><br><br><br>\n");
      out.write("            </br>\n");
      out.write("                <div style=\"text-align: center;\"><h2><p style=\"color:#1f1f7a\" >Inventario</p></h2></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <a href=\"./NuevoRe.jsp\" >Nuevo Registro </a>\n");
      out.write("        \n");
      out.write("                <br /><br />\n");
      out.write("                \n");
      out.write("        <table border=\"1\" width=\"80%\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("            <thead> \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                    <th>Num Control</th>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>Descripcion</th>\n");
      out.write("                    <th>Modelo</th>\n");
      out.write("                    <th>Num Serie</th>\n");
      out.write("                    <th>Cantidad</th>\n");
      out.write("                    <th>Ubicado</th>\n");
      out.write("                    <th>Fecha de Ingreso</th>\n");
      out.write("                    <th>Estado</th>\n");
      out.write("                    <th>Observaciones</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                  </thead>\n");
      out.write("              <tbody>\n");
      out.write("                ");

                List<Bienes> lista = Inventario.consultarbienes();
                for(Bienes a : lista){
                
      out.write("\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                    <td>");
      out.print(a.getNumero_Control_Bienes());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(a.getNombre_Bienes());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(a.getDescripcion_Bienes());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(a.getModelo_Bienes());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(a.getNum_Serie_Bienes());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(a.getCantidad_Bienes());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(a.getTipo_Escuela());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(a.getFecha_Ingreso_Bienes());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(a.getEstado_Bienes());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(a.getObservaciones_Bienes());
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body> \n");
      out.write("\n");
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
