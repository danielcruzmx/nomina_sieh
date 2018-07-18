
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.net.URI;
import org.apache.jackrabbit.util.Text;


public class _remote extends com.orionserver.http.OrionHttpJspPage {


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
    _remote page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      
      request.setAttribute("title", "Remote Repository Access");
      
      URI uri = new URI(request.getRequestURL().toString());
      String base =
          uri.getScheme() + "://" + uri.getHost() + ":" + uri.getPort()
          + request.getContextPath();
      base = Text.encodeIllegalXMLCharacters(base);
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[0]);
      out.print( base );
      out.write(__oracle_jsp_text[1]);
      out.print( base );
      out.write(__oracle_jsp_text[2]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
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
    "\r\n<p>\r\n  The content repository within this web application is made available\r\n  to remote clients through\r\n  <a href=\"http://java.sun.com/javase/technologies/core/basic/rmi/\">RMI</a>\r\n  and the <em>jackrabbit-jcr-rmi</em> component.\r\n<p>\r\n<p>\r\n  The remote repository stub is available both in the RMI registry\r\n  (one is started automatically by this web application if not already running)\r\n  and as a direct HTTP download. The default URLs for accessing the remote\r\n  repository are:\r\n</p>\r\n<ul>\r\n  <li>RMI registry: //localhost/jackrabbit.repository</li>\r\n  <li>HTTP download: ".toCharArray();
    __oracle_jsp_text[1] = 
    "/rmi</li>\r\n</ul>\r\n<p>\r\n  Note that the above URLs are the defaults. You can disable or change them\r\n  by modifying the /WEB-INF/web.xml deployment descriptor.\r\n</p>\r\n\r\n<h3>Accessing the remote repository</h3>\r\n<p>\r\n  To access the remote content repository you need to use the\r\n  <em>jackrabbit-jcr-rmi</em> component in your application. If you use\r\n  Maven 2, you can declare the JCR and jackrabbit-jcr-rmi dependencies\r\n  like this:\r\n</p>\r\n<pre>&lt;dependency&gt;\r\n  &lt;groupId&gt;javax.jcr&lt;/groupId&gt;\r\n  &lt;artifactId&gt;jcr&lt;/artifactId&gt;\r\n  &lt;version&gt;1.0&lt;/version&gt;\r\n&lt;/dependency&gt;\r\n&lt;dependency&gt;\r\n  &lt;groupId&gt;org.apache.jackrabbit&lt;/groupId&gt;\r\n  &lt;artifactId&gt;jackrabbit-jcr-rmi&lt;/artifactId&gt;\r\n  &lt;version&gt;1.4&lt;/version&gt;\r\n&lt;/dependency&gt;\r\n</pre>\r\n<p>\r\n  With that dependency in place, you can use either the RMI registry or\r\n  the direct HTTP download to access the repository.\r\n</p>\r\n<p>\r\n  The required code for accessing the repository using the RMI registry is:\r\n</p>\r\n<pre>\r\n<b>import</b> javax.jcr.Repository;\r\n<b>import</b> org.apache.jackrabbit.rmi.repository.RMIRemoteRepository;\r\n\r\nRepository repository =\r\n    <b>new</b> RMIRemoteRepository(\"<em>//localhost/jackrabbit.repository</em>\");\r\n</pre>\r\n<p>\r\n  The required code for accessing the repository using the RMI registry is:\r\n</p>\r\n<pre>\r\n<b>import</b> javax.jcr.Repository;\r\n<b>import</b> org.apache.jackrabbit.rmi.repository.URLRemoteRepository;\r\n\r\nRepository repository =\r\n    <b>new</b> URLRemoteRepository(\"<em>".toCharArray();
    __oracle_jsp_text[2] = 
    "/rmi</em>\");\r\n</pre>\r\n<p>\r\n  See the <a href=\"http://jcp.org/en/jsr/detail?id=170\">JCR specification</a>\r\n  and the\r\n  <a href=\"http://www.day.com/maven/jsr170/javadocs/jcr-1.0/javax/jcr/Repository.html\">Repository</a>\r\n  javadoc for details on what to do with the acquired Repository instance.\r\n</p>\r\n\r\n<h3>Remote access performance</h3>\r\n<p>\r\n  Note that the design goal of the current jackrabbit-jcr-rmi component\r\n  is correct and complete functionality instead of performance, so you should\r\n  not rely on remote access for performance-critical applications.\r\n</p>\r\n<p>\r\n  You may want to look at the Jackrabbit clustering feature for best\r\n  performance for concurrently accessing the repository on multiple separate\r\n  servers.\r\n</p>\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
