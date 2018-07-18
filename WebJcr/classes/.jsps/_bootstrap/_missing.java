package _bootstrap;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import org.apache.jackrabbit.util.Text;


public class _missing extends com.orionserver.http.OrionHttpJspPage {


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
    _missing page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      
      request.setAttribute("title", "Content Repository Setup");
      
      {
        String __url=OracleJspRuntime.toStr("../header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[0]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[1]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[2]);
      {
        String __url=OracleJspRuntime.toStr("../footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[3]);

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
  private static final char __oracle_jsp_text[][]=new char[4][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n<p>\n  Your content repository is not properly configured yet. Please use\n  the forms below to setup the content repository.\n</p>\n<p>\n  Alternatively, you can directly modify the settings in the\n  <code>WEB-INF/web.xml</code> deployment descriptor and redeploy this\n  web application.\n</p>\n\n<h3>Create a new content repository</h3>\n<form action=\"".toCharArray();
    __oracle_jsp_text[1] = 
    "/admin\" method=\"POST\">\n  <input type=\"hidden\" name=\"mode\" value=\"new\"/>\n  <p>\n    Use this form to create a new content repository in the given directory.\n    The directory is created by this web application and should not already\n    exist. The repository is created using a default configuration file.\n  </p>\n  <p>\n    <label>\n      Repository home directory:\n      <input size=\"40\" type=\"text\" name=\"repository_home\" value=\"jackrabbit\">\n    </label>\n  </p>\n  <p><input type=\"submit\" value=\"Create Content Repository\"></p>\n</form>\n\n<h3>Use an existing content repository</h3>\n<form action=\"".toCharArray();
    __oracle_jsp_text[2] = 
    "/admin\" method=\"POST\">\n  <input type=\"hidden\" name=\"mode\" value=\"existing\"/>\n  <p>\n    Use this form to access an existing content repository in the given\n    directory. The repository configuration file should be available as\n    <code>repository.xml</code> within the given directory.\n  </p>\n  <p>\n    Note that the repository can not be concurrently accessed by multiple\n    applications. You must use WebDAV or RMI through this web application\n    if you want to access the repository remotely. Other web applications\n    running in the same servlet container can access the repository locally\n    using JNDI.\n  </p>\n  <p>\n    <label>\n      Repository home directory:\n      <input size=\"40\" type=\"text\" name=\"repository_home\" value=\"jackrabbit\">\n    </label>\n  </p>\n  <p><input type=\"submit\" value=\"Access Content Repository\"></p>\n</form>\n\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
