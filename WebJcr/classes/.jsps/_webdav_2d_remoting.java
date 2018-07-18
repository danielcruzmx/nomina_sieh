
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import org.apache.jackrabbit.j2ee.JCRWebdavServerServlet;
import java.net.URI;
import org.apache.jackrabbit.util.Text;
import org.apache.jackrabbit.j2ee.JcrRemotingServlet;


public class _webdav_2d_remoting extends com.orionserver.http.OrionHttpJspPage {


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
    _webdav_2d_remoting page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      
      request.setAttribute("title", "JCR Remoting Server with Batch Read/Write");
      
      URI uri = new URI(request.getRequestURL().toString());
      String href =
          uri.getScheme() + "://" + uri.getHost() + ":" + uri.getPort()
          + request.getContextPath()
          + JCRWebdavServerServlet.getPathPrefix(pageContext.getServletContext());
      href = Text.encodeIllegalXMLCharacters(href);
      String shref = href + "/"+System.getProperty("jcr.workspaceName")+"/jcr:root";
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[2]);
      out.print( href );
      out.write(__oracle_jsp_text[3]);
      out.print( href );
      out.write(__oracle_jsp_text[4]);
      out.print( shref );
      out.write(__oracle_jsp_text[5]);
      out.print( shref );
      out.write(__oracle_jsp_text[6]);
      out.print(System.getProperty("jcr.workspaceName"));
      out.write(__oracle_jsp_text[7]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[8]);
      out.print( Text.encodeIllegalXMLCharacters(JcrRemotingServlet.getPathPrefix(pageContext.getServletContext())) );
      out.write(__oracle_jsp_text[9]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[10]);

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
  private static final char __oracle_jsp_text[][]=new char[11][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n<p>\n  The JCR Remoting Server provides an item-based WebDAV view to the\n  JCR repository, mapping the functionality provided by JSR 170 to the\n  WebDAV protocol in order to allow remote content repository access\n  via WebDAV.\n</p>\n<p>\n  This implementation variant adds batch read and write functionality to the initial\n  <a href=\"webdav-jcr.jsp\">JCR Remoting Server</a>. In addition it supports\n  copy across workspaces and clone.\n</p>\n\n<h3>Access the content repository</h3>\n<p>\n  Use the following URLs to access the content repository in the remoting client:\n</p>\n<dl>\n<dt><a href=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "\">".toCharArray();
    __oracle_jsp_text[4] = 
    "</a></dt>\n<dd>to access all workspaces of your JCR repository</dd>\n<dt><a href=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "\">".toCharArray();
    __oracle_jsp_text[6] = 
    "</a></dt>\n<dd>to access a single workspace (example with workspace named '".toCharArray();
    __oracle_jsp_text[7] = 
    "')</dd>\n</dl>\n\n<h3>Supported WebDAV functionality</h3>\n<p>\n  See <a href=\"webdav-jcr.jsp\">JCR Remoting Server</a>.\n</p>\n\n<h3>Batch Read</h3>\n<p>\nComposes a JSON object for a node (and its child items) up to a explicitely\nspecified or configuration determined depth.\n<br>\nSee <a href =\"http://svn.apache.org/repos/asf/jackrabbit/trunk/jackrabbit-jcr-server/src/main/java/org/apache/jackrabbit/server/remoting/davex/JcrRemotingServlet.java\">JavaDoc</a> for details\nor try the <a href=\"remoting/index.jsp\">Examples</a>.\n</p>\n\n<h3>Batch Write</h3>\n<p>\nIn contrast to the default JCR remoting this extended version allows to send\na block of modifications (SPI Batch) within a single POST request containing a\ncustom \":diff\" parameter.\n<br>\nSee the <a href =\"http://svn.apache.org/repos/asf/jackrabbit/trunk/jackrabbit-jcr-server/src/main/java/org/apache/jackrabbit/server/remoting/davex/JcrRemotingServlet.java\">JavaDoc</a> for details\nor try the <a href=\"remoting/index.jsp\">Examples</a>.\n</p>\n\n<h3>JCR Remoting Client</h3>\n<p>\n  For the client counterpart of this WebDAV servlet please take a look at the <a href=\"http://svn.apache.org/repos/asf/jackrabbit/trunk/jackrabbit-spi2dav/src/main/java/org/apache/jackrabbit/spi2davex\">extended SPI2DAV</a>\n  project.\n</p>\n\n<h3>Configuration</h3>\n<ul>\n  <li>Context Path: ".toCharArray();
    __oracle_jsp_text[8] = 
    "</li>\n  <li>Resource Path Prefix: ".toCharArray();
    __oracle_jsp_text[9] = 
    "</li>\n  <li>Workspace Name: <i>optional</i> (available workspaces are mapped as resources)</li>\n  <li>Additional servlet configuration: see <i>/WEB-INF/web.xml</i></li>\n</ul>\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
