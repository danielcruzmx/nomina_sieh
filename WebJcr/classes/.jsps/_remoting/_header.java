package _remoting;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import org.apache.jackrabbit.util.Text;


public class _header extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _header page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      
      String context = Text.encodeIllegalXMLCharacters(request.getContextPath());
      
      out.write(__oracle_jsp_text[2]);
      out.print( context );
      out.write(__oracle_jsp_text[3]);
      out.print( context );
      out.write(__oracle_jsp_text[4]);
      out.print( context );
      out.write(__oracle_jsp_text[5]);
      out.print( context );
      out.write(__oracle_jsp_text[6]);
      out.print( context );
      out.write(__oracle_jsp_text[7]);
      out.print( context );
      out.write(__oracle_jsp_text[8]);
      out.print( context );
      out.write(__oracle_jsp_text[9]);
      out.print( context );
      out.write(__oracle_jsp_text[10]);
      out.print( context );
      out.write(__oracle_jsp_text[11]);
      out.print( context );
      out.write(__oracle_jsp_text[12]);
      out.print( context );
      out.write(__oracle_jsp_text[13]);

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[14][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n          \"http://www.w3.org/TR/html4/loose.dtd\">\n<html>\n  <head>\n    <title>JCR Remoting Server</title>\n    <link rel=\"stylesheet\"\n          href=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "/css/default.css\"\n          type=\"text/css\"/>\n    <link rel=\"shortcut icon\"\n          href=\"".toCharArray();
    __oracle_jsp_text[4] = 
    "/images/favicon.ico\"\n          type=\"image/vnd.microsoft.icon\" />\n  </head>\n  <body>\n    <div id=\"page\">\n      <div id=\"banner\">\n        <p id=\"jcr\">\n          <a href=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "/\">\n            <img src=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "/images/jlogo.gif\" alt=\"Apache Jackrabbit\"/>\n          </a>\n        </p>\n        <p id=\"asf\">\n          <a href=\"http://www.apache.org/\">\n            <img src=\"".toCharArray();
    __oracle_jsp_text[7] = 
    "/images/asf-logo.png\" alt=\"Apache Software Foundation\"/>\n          </a>\n        </p>\n      </div>\n      <div id=\"navigation\">\n        <ul>\n          <li>JCR Remoting Server\n            <ul>\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[8] = 
    "/remoting/index.jsp\">Introduction</a></li>\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[9] = 
    "/remoting/read.jsp\">Read</a></li>\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[10] = 
    "/remoting/write.jsp\">Write</a></li>\n            </ul>\n          </li>\n          <li>Examples\n            <ul>\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[11] = 
    "/remoting/read_batch.jsp\">Batch Read</a></li>\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[12] = 
    "/remoting/write_batch.jsp\">Batch Write</a></li>\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[13] = 
    "/remoting/write_simple.jsp\">Simple Write</a></li>\n            </ul>\n          </li>\n        </ul>\n      </div>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
