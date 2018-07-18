
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import org.apache.jackrabbit.util.Text;
import java.io.StringWriter;
import java.io.PrintWriter;


public class _troubleshooting extends com.orionserver.http.OrionHttpJspPage {


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
    _troubleshooting page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      
      request.setAttribute("title", "Troubleshooting");
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[0]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[1]);
      out.print(System.getProperty("jcr.workspaceName"));
      out.write(__oracle_jsp_text[2]);
      out.print( Text.encodeIllegalXMLCharacters(application.getServerInfo()) );
      out.write(__oracle_jsp_text[3]);
      out.print( application.getMajorVersion() );
      out.write(__oracle_jsp_text[4]);
      out.print( application.getMinorVersion() );
      out.write(__oracle_jsp_text[5]);
      
      StringWriter buffer = new StringWriter();
      System.getProperties().list(new PrintWriter(buffer));
      
      out.write(__oracle_jsp_text[6]);
      out.print( Text.encodeIllegalXMLCharacters(buffer.toString()) );
      out.write(__oracle_jsp_text[7]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[8]);

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
  private static final char __oracle_jsp_text[][]=new char[9][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n<p>\r\n  If you experience problems with the Jackrabbit JCR server, please\r\n  check the following:\r\n</p>\r\n<ol>\r\n  <li>\r\n    Did you encounter an exception? Copy the exception stack trace somewhere\r\n    so you don't loose it. The stack trace contains valuable information\r\n    for the Jackrabbit developers if you need to file a bug report for the\r\n    problem you encountered.\r\n  </li>\r\n  <li>\r\n    Is the repository up and running? Try browsing the\r\n    <a href='".toCharArray();
    __oracle_jsp_text[1] = 
    "/repository/".toCharArray();
    __oracle_jsp_text[2] = 
    "/'>default workspace</a>\r\n    to check if you can still see any content in the repository. You will\r\n    see an error message if the repository is not available.\r\n  </li>\r\n  <li>\r\n    What were you trying to do? Try to verify that your client code or\r\n    other manner of repository use is correct. Did it work before or are\r\n    you trying to do something new?\r\n  </li>\r\n  <li>\r\n    Are there any notable log entries? Check the log files for any related\r\n    warnings or errors. By default the Jackrabbit JCR Server writes log\r\n    entries to the standard output of the servlet container. You can customize\r\n    logging by editing the <code>/WEB-INF/log4j.xml</code> file and\r\n    redeploying this web application.\r\n  </li>\r\n</ol>\r\n<p>\r\n  If none of the above steps help you identify or resolve the problem,\r\n  you can contact the Jackrabbit users mailing list or report the problem\r\n  in the Jackrabbit issue tracker to get support from the Jackrabbit community.\r\n  When contacting the community, please include any relevant details related\r\n  to the above questions and the environment information shown at the end\r\n  of this page.\r\n</p>\r\n\r\n<h2>Jackrabbit mailing list</h2>\r\n<p>\r\n  The Jackrabbit user mailing list, users@jackrabbit.apache.org, is the\r\n  place to discuss any problems or other issues regarding the use of\r\n  Apache Jackrabbit (or JCR content repositories in general).\r\n</p>\r\n<p>\r\n  Feel free to subscribe the mailing list or browse the archives listed as\r\n  described in the\r\n  <a href=\"http://jackrabbit.apache.org/mail-lists.html\">Jackrabbit mailing lists</a>\r\n  page.\r\n</p>\r\n\r\n<h2>Jackrabbit issue tracker</h2>\r\n<p>\r\n  If you think you've identified a defect in Jackrabbit, you're welcome\r\n  to file a bug report in the\r\n  <a href=\"https://issues.apache.org/jira/browse/JCR\">Jackrabbit issue tracker</a>.\r\n  You can also use the issue tracker to request new features and other\r\n  improvements.\r\n</p>\r\n<p>\r\n  You need an account in the issue tracker to report new issues or to comment\r\n  on existing. Use the\r\n  <a href=\"https://issues.apache.org/jira/secure/Signup!default.jspa\">registration form</a>\r\n  if you don't already have an account. No account is needed browsing\r\n  and searching existing issues.\r\n</p>\r\n\r\n<h2>Environment information</h2>\r\n<p>\r\n  This instance of the Jackrabbit JCR Server is running in\r\n  a <em>".toCharArray();
    __oracle_jsp_text[3] = 
    "</em> servlet container\r\n  that supports the Java Servlet API version\r\n  ".toCharArray();
    __oracle_jsp_text[4] = 
    ".".toCharArray();
    __oracle_jsp_text[5] = 
    ".\r\n</p>\r\n<p>\r\n  Details of the Java and operating system environment are included in\r\n  the system properties shown below:\r\n</p>\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n<pre>".toCharArray();
    __oracle_jsp_text[7] = 
    "</pre>\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
