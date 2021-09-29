package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("        *{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            font-family: sans-serif;\n");
      out.write("            \n");
      out.write("        }   \n");
      out.write("        \n");
      out.write("        body{\n");
      out.write("            background: #1a84d3;\n");
      out.write("            width:100%;\n");
      out.write("            height: 100vh;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .container-404{\n");
      out.write("            text-align: center;\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 400px;\n");
      out.write("            background: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            box-shadow: 0px 1px 10px\n");
      out.write("                rgba(0,0,0,0.3);\n");
      out.write("            border-radius: 5px;\n");
      out.write("            line-height: 1.7;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .boton{\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 15px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            background: #1a84d3;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("         \n");
      out.write("           \n");
      out.write("        } \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>       \n");
      out.write("        <div class=\"container-404\">\n");
      out.write("         <h1>Eror 404</h1>\n");
      out.write("         <p>Esta pagina no se encuentra disponible\n");
      out.write("         en estos momentos . Disculpa la molestia</p>\n");
      out.write("         <a href=\"./InicioPa.jsp\" class=\"boton\">\n");
      out.write("             Pagina Principal\n");
      out.write("             </a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
