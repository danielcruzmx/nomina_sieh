
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import org.apache.jackrabbit.j2ee.SimpleWebdavServlet;
import java.net.URI;
import org.apache.jackrabbit.util.Text;


public class _webdav_2d_simple extends com.orionserver.http.OrionHttpJspPage {


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
    _webdav_2d_simple page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      
      request.setAttribute("title", "Standard WebDAV Server");
      
      URI uri = new URI(request.getRequestURL().toString());
      String href =
          uri.getScheme() + "://" + uri.getHost() + ":" + uri.getPort()
          + request.getContextPath()
          + SimpleWebdavServlet.getPathPrefix(pageContext.getServletContext())
          + "/"+System.getProperty("jcr.workspaceName")+"/";
      href = Text.encodeIllegalXMLCharacters(href);
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[0]);
      out.print( href );
      out.write(__oracle_jsp_text[1]);
      out.print( href );
      out.write(__oracle_jsp_text[2]);
      out.print(System.getProperty("jcr.workspaceName"));
      out.write(__oracle_jsp_text[3]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[4]);
      out.print( Text.encodeIllegalXMLCharacters(SimpleWebdavServlet.getPathPrefix(pageContext.getServletContext())) );
      out.write(__oracle_jsp_text[5]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
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
    "\n\n<p>\n  The default WebDAV server (aka: Simple Server) is a\n  <a href=\"http://www.ietf.org/rfc/rfc2518.txt\">DAV 1,2</a> and\n  <a href=\"http://www.ietf.org/rfc/rfc3253.txt\">DeltaV</a>\n  compliant WebDAV  server implementation. It offers a file-based view to\n  the JCR repository, suitable  for everybody looking for standard WebDAV\n  functionality. Essentially, the contents of the underlying content\n  repository are exposed as a hierarchical collection of files and folders.\n<p>\n\n<h3>Access the content repository</h3>\n<p>\n  Use the following URL to access the content repository in your WebDAV client:\n</p>\n<ul>\n  <li><a href=\"".toCharArray();
    __oracle_jsp_text[1] = 
    "\">".toCharArray();
    __oracle_jsp_text[2] = 
    "</a></li>\n</ul>\n<p>\n  The server asks for authentication, but by default any username and password\n  is accepted. You can modify this security policy in the repository\n  configuration file.\n</p>\n<p>\n  To access other workspace than the default one, replace the last part of\n  the URL (<code>/".toCharArray();
    __oracle_jsp_text[3] = 
    "/</code>) with the name of another workspace.\n</p>\n<p>\n  You can also <a href=\"search.jsp\">search</a> the default workspace\n  <a href=\"populate.jsp\">populate</a> it with example content from the\n  Internet.\n</p>\n\n<h3>File system access</h3>\n<p>\n  Many operating systems, including Windows and Mac OS X, allow you to\n  \"mount\" a WebDAV server as a shared network disk. You can use the above\n  URL to make the default workspace available as such a network disk, after\n  which you can use normal file system tools to copy files and folders to\n  and from the content repository.\n</p>\n\n<h3>Supported WebDAV functionality</h3>\n<ul>\n<li><a href=\"http://www.ietf.org/rfc/rfc2518.txt\">RFC 2518</a> (WebDAV 1,2)</li>\n<li><a href=\"http://www.ietf.org/rfc/rfc3253.txt\">RFC 3253</a> (DeltaV)</li>\n<li>Experimental: <a href=\"http://www.ietf.org/rfc/rfc5842.txt\">RFC 5842</a> (WebDAV BIND)</li>\n</ul> \n\n<h3>Configuration</h3>\n<ul>\n    <li>Context path: ".toCharArray();
    __oracle_jsp_text[4] = 
    "</li>\n    <li>Resource path prefix: ".toCharArray();
    __oracle_jsp_text[5] = 
    "</li>\n    <li>Servlet configuration: see <i>/WEB-INF/web.xml</i></li>\n    <li>WebDAV specific resource configuration: see <i>/WEB-INF/config.xml</i></li>\n</ul>\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
