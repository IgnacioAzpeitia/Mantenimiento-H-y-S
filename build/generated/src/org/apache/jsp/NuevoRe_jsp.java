package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NuevoRe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<link href=\"css/ESTIREG.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("   <body>\r\n");
      out.write("        <h2></h2> \r\n");
      out.write("                     \r\n");
      out.write("                     <div id=\"cuadro\">\r\n");
      out.write("                     <form action=\"NuevoBien\" method=\"POST\" autocomplete=\"off\">\r\n");
      out.write("                      <p id=\"titulo\">Nuevo Registro</p>    \r\n");
      out.write("                    <hr>\r\n");
      out.write("              \r\n");
      out.write("                      <p> \r\n");
      out.write("                           Numero de Control:\r\n");
      out.write("                           <input id=\"Numero_Control_Bienes\" name=\"Numero_Control_Bienes\" type=\"text\"/>\r\n");
      out.write("                      </p>  \r\n");
      out.write("                      \r\n");
      out.write("                      <p> \r\n");
      out.write("                           Nombre:\r\n");
      out.write("                           <input id=\"Nombre_Bienes\" name=\"Nombre_Bienes\" type=\"text\"/>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      \r\n");
      out.write("                      <p> \r\n");
      out.write("                           Descripcion del Bien:\r\n");
      out.write("                           <input id=\"Descripcion_Bienes\" name=\"Descripcion_Bienes\" type=\"text\"/>\r\n");
      out.write("                      </p>\r\n");
      out.write("\r\n");
      out.write("                      <p> \r\n");
      out.write("                           Modelo:\r\n");
      out.write("                           <input id=\"Modelo_Bienes\" name=\"Modelo_Bienes\" type=\"text\"/>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      \r\n");
      out.write("                      <p> \r\n");
      out.write("                           Numero de Serie:\r\n");
      out.write("                           <input id=\"Num_Serie_Bienes\" name=\"Num_Serie_Bienes\" type=\"text\"/>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      \r\n");
      out.write("                      <p> \r\n");
      out.write("                           Cantidad:\r\n");
      out.write("                           <input id=\"Cantidad_Bienes\" name=\"Cantidad_Bienes\" type=\"text\"/>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      \r\n");
      out.write("                      <p> \r\n");
      out.write("                           Num Aula/Laboratorio:\r\n");
      out.write("                           <input id=\"Escuela_Id_Escuela\" name=\"Escuela_Id_Escuela\" type=\"text\"/>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      \r\n");
      out.write("                      <p> \r\n");
      out.write("                           Fecha de Ingreso:\r\n");
      out.write("                           <input id=\"Fecha_Ingreso_Bienes\" name=\"Fecha_Ingreso_Bienes\" type=\"text\"/>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      \r\n");
      out.write("                      <p> \r\n");
      out.write("                           Estado:\r\n");
      out.write("                           <input id=\"Estado_Bienes\" name=\"Estado_Bienes\" type=\"text\"/>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      \r\n");
      out.write("                      <p> \r\n");
      out.write("                           Observaciones:\r\n");
      out.write("                           <input id=\"Observaciones_Bienes\" name=\"Observaciones_Bienes\" type=\"text\"/>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("        \r\n");
      out.write("                      \r\n");
      out.write("                      <button id=\"Guardar\" name=\"Guardar\" type=\"submit\">Guardar</button>\r\n");
      out.write("                         \r\n");
      out.write("                     </form>\r\n");
      out.write("              <h1>AVISO</h1>\r\n");
      out.write("         <p>RECUERDE QUE PARA INGRESAR EL NUMERO DE AULA/LABORATORIO DEBE DE INGRESARLO DE LA SIGUIENTE FORMA:  \r\n");
      out.write("                  <p>1001 REPRESENA A \"LABORATORIO-01\"</p>  \r\n");
      out.write("                   <p>1002 REPRESENA A \"LABORATORIO-02\"</p>\r\n");
      out.write("                   <p>1003 REPRESENA A \"LABORATORIO-03\"</p>\r\n");
      out.write("                   <p>1004 REPRESENA A \"LABORATORIO-04\"</p>\r\n");
      out.write("                   <p>1005 REPRESENA A \"AULA-01\"</p>\r\n");
      out.write("                   <p>1006 REPRESENA A \"AULA-02\"</p>\r\n");
      out.write("                   <p>1007 REPRESENA A \"AULA-03\"</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
