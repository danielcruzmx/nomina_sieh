package _remoting;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.net.URI;
import org.apache.jackrabbit.j2ee.JcrRemotingServlet;
import org.apache.jackrabbit.util.Text;


public class _read extends com.orionserver.http.OrionHttpJspPage {


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
    _read page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      
      
      URI uri = new URI(request.getRequestURL().toString());
      String href =
          uri.getScheme() + "://" + uri.getHost() + ":" + uri.getPort()
          + request.getContextPath()
          + JcrRemotingServlet.getPathPrefix(pageContext.getServletContext());
      href = Text.encodeIllegalXMLCharacters(href);
      href += "/"+System.getProperty("jcr.workspaceName")+"/jcr:root";
          
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[3]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }


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
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<div id=\"content\">\n    <h2>Read</h2>\n    <h3><a name=\"default_read\">Default Reading</a></h3>\n    <p>Reading remotely from the repository generally follows the rules described in\n    <a href=\"http://jackrabbit.apache.org/JCR_Webdav_Protocol.doc\">JCR_Webdav_Protocol.zip</a>.\n    </p>\n    <h3><a name=\"batch_read\">Batch Read</a></h3>\n    <p>Batch read is triggered by adding a <b>'.json'</b> extension to the resource\n        href. Optionally the client may explicitely specify the desired batch\n        read depth by appending <b>'.depth.json'</b> extension. If no json extension\n        is present the GET request is processed by applied the default\n        remoting rules.\n    </p>\n    <p>The response to a batch read request contains a plain text representing\n       a JSON object. Its member either represent nodes or properties.\n    <ul>\n    <li>The name element of the Item path is added as key</li>\n    <li>The value of a Node entry is a JSON object.</li>\n    <li>The value of a Property entry is either a JSON array or a simple JSON value.</li>\n    </ul>\n    </p>\n    <p>In order to cope with property types that cannot be expressed with JSON\n    a couple of special rules are defined:\n    <ul>\n    <li>Binary properties: The key gets a leading \":\", the value represents the\n        length of the property. In order to retrieve the binary value, the\n        client must follow the default rules (see above).</li>\n    <li>Date, Name, Path and Reference properties: The type information is passed with a separate JSON pair.</li>\n    <li>The value of a Property entry is either a JSON array or a simple JSON value.</li>\n    </ul>\n    </p>\n    See <a href=\"read_batch.jsp\">Example: Batch Write</a> for a demostration of\n    the batch read functionality.\n    </p>\n</div>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
