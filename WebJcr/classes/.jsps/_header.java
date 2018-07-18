
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
      
      String title =
          Text.encodeIllegalXMLCharacters(request.getAttribute("title").toString());
      String context =
          Text.encodeIllegalXMLCharacters(request.getContextPath());
      
      out.write(__oracle_jsp_text[2]);
      out.print( title );
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
      out.print( context );
      out.write(__oracle_jsp_text[14]);
      out.print( context );
      out.write(__oracle_jsp_text[15]);
      out.print( context );
      out.write(__oracle_jsp_text[16]);
      out.print(System.getProperty("jcr.workspaceName"));
      out.write(__oracle_jsp_text[17]);
      out.print( context );
      out.write(__oracle_jsp_text[18]);
      out.print( context );
      out.write(__oracle_jsp_text[19]);
      out.print( title );
      out.write(__oracle_jsp_text[20]);

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
  private static final char __oracle_jsp_text[][]=new char[21][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n          \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n  <head>\r\n    <title>".toCharArray();
    __oracle_jsp_text[3] = 
    "</title>\r\n    <link rel=\"stylesheet\"\r\n          href=\"".toCharArray();
    __oracle_jsp_text[4] = 
    "/css/default.css\"\r\n          type=\"text/css\"/>\r\n    <link rel=\"shortcut icon\"\r\n          href=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "/images/favicon.ico\"\r\n          type=\"image/vnd.microsoft.icon\" />\r\n  </head>\r\n  <body>\r\n    <div id=\"page\">\r\n      <div id=\"banner\">\r\n        <p id=\"jcr\">\r\n          <a href=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "/\">\r\n            <img src=\"".toCharArray();
    __oracle_jsp_text[7] = 
    "/images/jlogo.gif\"\r\n                 alt=\"Apache Jackrabbit\" height=\"100\" width=\"336\"/>\r\n          </a>\r\n        </p>\r\n        <p id=\"asf\">\r\n          <a href=\"http://www.apache.org/\">\r\n            <img src=\"".toCharArray();
    __oracle_jsp_text[8] = 
    "/images/asf-logo.gif\"\r\n                 alt=\"Apache Software Foundation\" height=\"100\" width=\"387\"/>\r\n          </a>\r\n        </p>\r\n      </div>\r\n      <div id=\"navigation\">\r\n        <ul>\r\n          <li>Jackrabbit JCR Server\r\n            <ul>\r\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[9] = 
    "/\">Welcome</a></li>\r\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[10] = 
    "/webdav-simple.jsp\">Standard WebDAV</a></li>\r\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[11] = 
    "/webdav-jcr.jsp\">JCR Remoting</a></li>\r\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[12] = 
    "/remote.jsp\">Remote access</a></li>\r\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[13] = 
    "/local.jsp\">Local access</a></li>\r\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[14] = 
    "/troubleshooting.jsp\">Troubleshooting</a></li>\r\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[15] = 
    "/about.jsp\">About Jackrabbit</a></li>\r\n            </ul>\r\n          </li>\r\n          <li>Default workspace\r\n            <ul>\r\n              <li><a href='".toCharArray();
    __oracle_jsp_text[16] = 
    "/repository/".toCharArray();
    __oracle_jsp_text[17] = 
    "/'>Browse</a></li>\r\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[18] = 
    "/search.jsp\">Search</a></li>\r\n              <li><a href=\"".toCharArray();
    __oracle_jsp_text[19] = 
    "/populate.jsp\">Populate</a></li>\r\n            </ul>\r\n          </li>\r\n          <li>Apache Jackrabbit\r\n            <ul>\r\n              <li><a href=\"http://jackrabbit.apache.org/\">Apache Jackrabbit</a></li>\r\n              <li><a href=\"http://jackrabbit.apache.org/api/2.2/\">Jackrabbit API</a></li>\r\n              <li><a href=\"http://wiki.apache.org/jackrabbit/FrontPage\">Jackrabbit Wiki</a></li>\r\n            </ul>\r\n          </li>\r\n          <li>JCR\r\n            <ul>\r\n              <li><a href=\"http://jcp.org/en/jsr/detail?id=170\">JSR 170</a></li>\r\n              <li><a href=\"http://jcp.org/en/jsr/detail?id=283\">JSR 283</a></li>\r\n              <li><a href=\"http://www.day.com/maven/javax.jcr/javadocs/jcr-2.0/\">JCR 2.0 API</a></li>\r\n            </ul>\r\n          </li>\r\n        </ul>\r\n      </div>\r\n      <div id=\"content\">\r\n        <h2>".toCharArray();
    __oracle_jsp_text[20] = 
    "</h2>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
