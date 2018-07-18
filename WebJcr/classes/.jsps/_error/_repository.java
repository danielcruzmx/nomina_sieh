package _error;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import org.apache.jackrabbit.util.Text;
import java.io.StringWriter;
import java.io.PrintWriter;


public class _repository extends com.orionserver.http.OrionHttpJspPage {


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
    _repository page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);
    Throwable exception = (Throwable) request.getAttribute(PageContext.EXCEPTION);

    try {


      
      request.setAttribute("title", "Repository Error");
      
      {
        String __url=OracleJspRuntime.toStr("../header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[0]);
      out.print( exception.getClass().getSimpleName() );
      out.write(__oracle_jsp_text[1]);
      out.print( Text.encodeIllegalXMLCharacters(exception.getMessage()) );
      out.write(__oracle_jsp_text[2]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[3]);
      
      StringWriter buffer = new StringWriter();
      exception.printStackTrace(new PrintWriter(buffer));
      
      out.write(__oracle_jsp_text[4]);
      out.print( Text.encodeIllegalXMLCharacters(buffer.toString()) );
      out.write(__oracle_jsp_text[5]);
      {
        String __url=OracleJspRuntime.toStr("../footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[6]);

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
  private static final char __oracle_jsp_text[][]=new char[7][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n<p>\r\n  The content repository operation failed with the following\r\n  ".toCharArray();
    __oracle_jsp_text[1] = 
    " error:\r\n</p>\r\n<blockquote>".toCharArray();
    __oracle_jsp_text[2] = 
    "</blockquote>\r\n<p>\r\n  See the\r\n  <a href=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "/troubleshooting.jsp\">troubleshooting page</a>\r\n  for ideas on how to resolve this issue.\r\n</p>\r\n\r\n<h2>Exception stack trace</h2>\r\n<p>\r\n  Below is the full exception stack trace associated with this error:\r\n</p>\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n<pre>".toCharArray();
    __oracle_jsp_text[5] = 
    "</pre>\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
