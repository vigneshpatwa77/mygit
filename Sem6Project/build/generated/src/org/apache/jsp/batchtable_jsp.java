package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bmodel.batch;
import java.util.List;
import bdaoimp.batchimp;

public final class batchtable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            batchimp bi = new batchimp();
            List<batch> bl = bi.getAllBatch();
            System.out.println(bl.size());
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("            <th>ID</th> \n");
      out.write("            <th>NAME</th>\n");
      out.write("            <TH>START TIME</TH>\n");
      out.write("            <TH>END TIME</TH>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");
 for (batch b : bl) {
                    System.out.println(bl);
            
      out.write("\n");
      out.write("            <Tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(b.getB_id());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(b.getS_id());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(b.getTime());
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print(b.getEntime());
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </TR>\n");
      out.write("            ");
 }
      out.write(" \n");
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <br><br><a href=\"Teacherupdate.jsp\"><input type=\"submit\" value=\"Update\" /></a>\n");
      out.write("    <a href=\"TeacherDelete.jsp\"><input type=\"submit\" value=\"Delete\"/></a>\n");
      out.write("</body>\n");
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
