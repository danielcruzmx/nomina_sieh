
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class _about extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations



    /**
     * Escapes and outputs the contents of a given (UTF-8) text resource.
     * TODO: There should be an easier way to do this!
     *
     * @param path path of the resource to output
     * @param out the JSP output writer
     * @throws Exception if something goes wrong
     */
    private void output(String path, JspWriter out) throws Exception {
        InputStream input = this.getServletConfig().getServletContext().getResourceAsStream(path);
        try {
            Reader reader = new InputStreamReader(input, "UTF-8");
            for (int ch = reader.read(); ch != -1; ch = reader.read()) {
                if (ch == '<') {
                    out.write("&lt;");
                } else if (ch == '>') {
                    out.write("&gt;");
                } else if (ch == '&') {
                    out.write("&amp;");
                } else {
                    out.write((char) ch);
                }
            }
        } finally {
            input.close();
        }
    }


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
    _about page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


       request.setAttribute("title", "About Apache Jackrabbit");
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[2]);

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
  private static final char __oracle_jsp_text[][]=new char[3][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n<p>\n  <a href=\"http://jackrabbit.apache.org/\">Apache Jackrabbit</a> is a fully\n  conforming implementation of the Content Repository for Java Technology API\n  (JCR). A content repository is a hierarchical content store with support for\n  structured and unstructured content, full text search, versioning,\n  transactions, observation, and more. Typical applications that use content\n  repositories include content management, document management, and records\n  management systems.\n</p>\n<p>\n  Version 1.0 of the JCR API was specified by the\n  <a href=\"http://jcp.org/en/jsr/detail?id=170\">Java Specification Request 170</a>\n  (JSR 170) and version 2.0 by the \n  <a href=\"http://jcp.org/en/jsr/detail?id=283\">Java Specification Request 283</a>.\n</p>\n<p>\n  Apache Jackrabbit is a project of the\n  <a href=\"http://www.apache.org/\">Apache Software Foundation</a>. \n</p>\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
