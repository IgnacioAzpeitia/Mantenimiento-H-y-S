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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <body>\n");
      out.write("        <h2>NUEVO REGISTRO</h2> \n");
      out.write("                     <br />         <br /> \n");
      out.write("                     <form action=\"Inventario\" method=\"POST\" autocomplete=\"off\">\n");
      out.write("                         \n");
      out.write("                    <p> \n");
      out.write("                           Numero de Control:\n");
      out.write("                           <input id=\"Numero_Control_Bienes\" name=\"Numero_Control_Bienes\" type=\"text\"/>\n");
      out.write("                      </p>  \n");
      out.write("                      \n");
      out.write("                      <p> \n");
      out.write("                           Descripcion del bien:\n");
      out.write("                           <input id=\"Descripcion_Bienes\" name=\"Numero del Dispositivo\" type=\"text\"/>\n");
      out.write("                      </p>\n");
      out.write("                      \n");
      out.write("                      <p> \n");
      out.write("                           Cantidad:\n");
      out.write("                           <input id=\"Cantidad_Bienes\" name=\"Cantidad_Bienes\" type=\"text\"/>\n");
      out.write("                      </p>\n");
      out.write("\n");
      out.write("                      <p> \n");
      out.write("                           Modelo y Numero de Serie:\n");
      out.write("                           <input id=\"Modelo__Serie_Bienes\" name=\"Modelo__Serie_Bienes\" type=\"text\"/>\n");
      out.write("                      </p>\n");
      out.write("                      \n");
      out.write("                      <p> \n");
      out.write("                           Numero Aula o laboratorio:\n");
      out.write("                           <input id=\"TipoAL_Escuela\" name=\"TipoAL_Escuela\" type=\"text\"/>\n");
      out.write("                      </p>\n");
      out.write("                      \n");
      out.write("                      <p> \n");
      out.write("                           Fecha de Ingreso:\n");
      out.write("                           <input id=\"Fecha_Ingreso_Bienes\" name=\"Fecha_Ingreso_Bienes\" type=\"text\"/>\n");
      out.write("                      </p>\n");
      out.write("                      \n");
      out.write("                      <p> \n");
      out.write("                           Estado:\n");
      out.write("                           <input id=\"Estado_Bienes\" name=\"Tipo de Bien\" type=\"text\"/>\n");
      out.write("                      </p>\n");
      out.write("                      \n");
      out.write("                      <p> \n");
      out.write("                           Bienes no localizados Fisicamente:\n");
      out.write("                           <input id=\"Bienes_No_Localizados_Bienes\" name=\"Bienes_No_Localizados_Bienes\" type=\"text\"/>\n");
      out.write("                      </p>\n");
      out.write("                      \n");
      out.write("                      <p> \n");
      out.write("                           Observaciones:\n");
      out.write("                           <input id=\"Observaciones_Bienes\" name=\"Observaciones_Bienes\" type=\"text\"/>\n");
      out.write("                      </p>\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                      <button id=\"Guardar\" name=\"Guardar\" type=\"submit\">Guardar</button>\n");
      out.write("                         \n");
      out.write("                     </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
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
