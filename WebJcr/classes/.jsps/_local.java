
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import org.apache.jackrabbit.util.Text;


public class _local extends com.orionserver.http.OrionHttpJspPage {


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
    _local page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      
      request.setAttribute("title", "Local Repository Access");
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[0]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
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
    "\r\n<p>\r\n  The content repository within this web application can be accessed\r\n  locally by other web applications within the same servlet container.\r\n  Local access is much faster than <a href=\"remote.jsp\">remote access</a>.\r\n</p>\r\n<p>\r\n  The content repository is made available both through JNDI and the\r\n  web application context.\r\n</p>\r\n\r\n<h3>Accessing the repository through JNDI</h3>\r\n<p>\r\n  By default the repository is only made available in a dummy JNDI directory\r\n  local to this web application. However, you can make the repository globally\r\n  available if your servlet container allows a web application to modify the\r\n  global JNDI directory or you are using some other JNDI directory that can\r\n  manage unserializable Java objects.\r\n</p>\r\n<p>\r\n  To bind the the repository to such a JNDI directory, you need to modify\r\n  the <code>java.naming</code> parameters in either the /WEB-INF/web.xml\r\n  deployment descriptor or the jackrabbit/bootstrap.properties file. You need\r\n  to redeploy this web application to activate the changes.\r\n</p>\r\n<p>\r\n  Use the following code to access a repository bound in a JNDI directory:\r\n</p>\r\n<pre>\r\n<b>import</b> javax.jcr.Repository;\r\n<b>import</b> javax.naming.Context;\r\n<b>import</b> javax.naming.InitialContext;\r\n\r\nContext context = <b>new</b> InitialContext(...);\r\nRepository repository = (Repository) context.lookup(...);\r\n</pre>\r\n\r\n<h3>Accessing the repository through servlet context</h3>\r\n<p>\r\n  This web application makes the repository available as the\r\n  <code>javax.jcr.Repository</code> attribute in the application context.\r\n  If your servlet container supports cross-context access, you can\r\n  access the repository directly using that attribute.\r\n</p>\r\n<p>\r\n  For example in <a href=\"http://tomcat.apache.org/\">Apache Tomcat</a>\r\n  you can enable cross-context access by setting the <code>crossContext</code>\r\n  attribute to true in the &lt;Context/&gt; configuration.\r\n</p>\r\n<p>\r\n  Use the following code to access a repository through the servlet context:\r\n</p>\r\n<pre>\r\n<b>import</b> javax.jcr.Repository;\r\n<b>import</b> javax.servlet.ServletContext;\r\n\r\nServletContext context = ...; // <em>context of your servlet</em>\r\nServletContext jackrabbit =\r\n    context.getContext(\"<em>".toCharArray();
    __oracle_jsp_text[1] = 
    "</em>\");\r\nRepository repository = (Repository)\r\n    context.getAttribute(Repository.<b>class</b>.getName()).\r\n</pre>\r\n\r\n<h3>Using the jackrabbit-jcr-servlet component</h3>\r\n<p>\r\n  The <em>jackrabbit-jcr-servlet</em> component contains utility classes\r\n  for use within JCR web applications. With that component you can hide\r\n  both the above and the <a href=\"remote.jsp\">remote access</a> options\r\n  from your code, and use just the following to access a repository:\r\n</p>\r\n<pre>\r\n<b>import</b> javax.jcr.Repository;\r\n<b>import</b> org.apache.jackrabbit.servlet.ServletRepository;\r\n\r\n<b>public class</b> MyServlet <b>extends</b> HttpServlet {\r\n\r\n    <b>private final</b> Repository repository = <b>new</b> ServletRepository(<b>this</b>);\r\n\r\n    // ...\r\n\r\n}\r\n</pre>\r\n<p>\r\n  See the jackrabbit-jcr-servlet documentation for more details.\r\n</p>\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
