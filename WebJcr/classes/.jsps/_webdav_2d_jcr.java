
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import org.apache.jackrabbit.j2ee.JCRWebdavServerServlet;
import java.net.URI;
import org.apache.jackrabbit.util.Text;


public class _webdav_2d_jcr extends com.orionserver.http.OrionHttpJspPage {


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
    _webdav_2d_jcr page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      
      request.setAttribute("title", "JCR Remoting Server");
      
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

      out.write(__oracle_jsp_text[0]);
      out.print( href );
      out.write(__oracle_jsp_text[1]);
      out.print( href );
      out.write(__oracle_jsp_text[2]);
      out.print( shref );
      out.write(__oracle_jsp_text[3]);
      out.print( shref );
      out.write(__oracle_jsp_text[4]);
      out.print(System.getProperty("jcr.workspaceName"));
      out.write(__oracle_jsp_text[5]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[6]);
      out.print( Text.encodeIllegalXMLCharacters(JCRWebdavServerServlet.getPathPrefix(pageContext.getServletContext())) );
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
    "\r\n<p>\r\n  The JCR Remoting Server provides an item-based WebDAV view to the\r\n  JCR repository, mapping the functionality provided by JSR 170 to the\r\n  WebDAV protocol in order to allow remote content repository access\r\n  via WebDAV.\r\n</p>\r\n<p>\r\n  See the draft document\r\n  <a href=\"http://jackrabbit.apache.org/JCR_Webdav_Protocol.doc\">JCR_Webdav_Protocol.zip</a>\r\n  for more details regarding this remoting protocol.\r\n</p>\r\n<p>\r\n  Batch read and write as well as the missing functionality (cross workspace\r\n  copy and clone) has been addressed with a <a href=\"webdav-remoting.jsp\">extension</a>\r\n  to the remoting server.\r\n</p>\r\n\r\n<h3>Access the content repository</h3>\r\n<p>\r\n  Use the following URLs to access the content repository in your remoting client:\r\n</p>\r\n<dl>\r\n<dt><a href=\"".toCharArray();
    __oracle_jsp_text[1] = 
    "\">".toCharArray();
    __oracle_jsp_text[2] = 
    "</a></dt>\r\n<dd>to access all workspaces of your JCR repository</dd>\r\n<dt><a href=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "\">".toCharArray();
    __oracle_jsp_text[4] = 
    "</a></dt>\r\n<dd>to access a single workspace (example with workspace named '".toCharArray();
    __oracle_jsp_text[5] = 
    "')</dd>\r\n</dl>\r\n\r\n<h3>Supported WebDAV functionality</h3>\r\n<p>\r\n  This implementation focuses on replicating all JCR features for remote\r\n  access instead of providing standard WebDAV functionality or compatibility\r\n  with existing WebDAV clients.\r\n</p>\r\n<p>\r\n  The following RFCs are used to implement the remoting functionality:\r\n</p>\r\n<ul>\r\n  <li><a href=\"http://www.ietf.org/rfc/rfc2518.txt\">RFC 2518</a> (WebDAV 1,2)</li>\r\n  <li><a href=\"http://www.ietf.org/rfc/rfc3253.txt\">RFC 3253</a> (DeltaV)</li>\r\n  <li><a href=\"http://www.ietf.org/rfc/rfc3648.txt\">RFC 3648</a> (Ordering)</li>\r\n  <li><a href=\"http://greenbytes.de/tech/webdav/draft-reschke-webdav-search-latest.html\">Internet Draft WebDAV Search</a></li>\r\n</ul>\r\n\r\n<h3>JCR Remoting Client</h3>\r\n<p>\r\n  For the client counterpart of this WebDAV servlet please take a look at the\r\n  <a href=\"http://svn.apache.org/repos/asf/jackrabbit/trunk/jackrabbit-spi2dav\">Jackrabbit SPI2DAV</a>\r\n  module.\r\n</p>\r\n\r\n<h3>Configuration</h3>\r\n<ul>\r\n  <li>Context Path: ".toCharArray();
    __oracle_jsp_text[6] = 
    "</li>\r\n  <li>Resource Path Prefix: ".toCharArray();
    __oracle_jsp_text[7] = 
    "</li>\r\n  <li>Workspace Name: <i>optional</i> (available workspaces are mapped as resources)</li>\r\n  <li>Additional servlet configuration: see <i>/WEB-INF/web.xml</i></li>\r\n</ul>\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
