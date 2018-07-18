
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import org.apache.jackrabbit.j2ee.RepositoryAccessServlet;
import javax.jcr.Repository;


public class _welcome extends com.orionserver.http.OrionHttpJspPage {


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
    _welcome page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      
      
      Repository rep;
      try {
          rep = RepositoryAccessServlet.getRepository(pageContext.getServletContext());
      } catch (Throwable e) {
          
      if (true) {
        String __url=OracleJspRuntime.toStr("bootstrap/missing.jsp");
        // Forward 
        pageContext.forward( __url);
        return;
      }

      
      }
      
      request.setAttribute("title", "Apache Jackrabbit JCR Server");
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[0]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[1]);

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
  private static final char __oracle_jsp_text[][]=new char[2][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n<p>\n  Welcome to the Apache Jackrabbit JCR Server. This web application\n  contains a JCR content repository and makes it available to clients\n  through WebDAV and other means.\n</p>\n<p>\n  The following WebDAV view is provided for accessing the\n  content in the JCR content repository.\n</p>\n<ul>\n  <li><a href=\"webdav-simple.jsp\">Standard WebDAV</a></li>\n</ul>\n<p>\n  In addition the JCR Server project provides means for JCR remoting over HTTP:\n</p>\n<ul>\n  <li><a href=\"webdav-jcr.jsp\">JCR remoting over WebDAV</a></li>\n  <li><a href=\"webdav-remoting.jsp\">JCR remoting over WebDAV (including Batch Read/Write)</a></li>\n</ul>\n<p>\n  Clients can also access the repository using the JCR API. Both local\n  and remote access is supported.\n</p>\n<ul>\n  <li><a href=\"remote.jsp\">Remote repository access</a></li>\n  <li><a href=\"local.jsp\">Local repository access</a></li>\n</ul>\n<p>\n  For more information, including copyright and licensing details, visit the\n  <a href=\"about.jsp\">About Apache Jackrabbit</a> page.\n</p>\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
