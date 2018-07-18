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


public class _write extends com.orionserver.http.OrionHttpJspPage {


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
    _write page = this;
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
      out.print(System.getProperty("jcr.workspaceName"));
      out.write(__oracle_jsp_text[4]);
      out.print( href );
      out.write(__oracle_jsp_text[5]);
      out.print( href );
      out.write(__oracle_jsp_text[6]);
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
  private static final char __oracle_jsp_text[][]=new char[7][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<div id=\"content\">\n    <h2>Write</h2>\n    <h3><a name=\"default_write\">Default Writing</a></h3>\n    <p>Writing remotely to the repository generally follows the rules described in\n    <a href=\"http://jackrabbit.apache.org/JCR_Webdav_Protocol.doc\">JCR_Webdav_Protocol.zip</a>.\n    </p>\n    <h3><a name=\"batch_write\">Batch Write</a></h3>\n    <p>A set of transient modifications can in addition be sent by using the\n    extended batch write: A single POST request that contains a custom\n    <strong>:diff</strong> parameter describing the changes to be applied.\n    The expected format is described in the\n    <a href =\"http://svn.apache.org/repos/asf/jackrabbit/trunk/jackrabbit-jcr-server/src/main/java/org/apache/jackrabbit/server/remoting/davex/JcrRemotingServlet.java\">JavaDoc</a>.\n    </p>\n    Some cases however can be easily demonstrated. The following examples can\n    be tested with the form provided at\n    <a href=\"write_batch.jsp\">Example: Batch Write</a>.\n    </p>\n    <h4>Examples</h4>\n    <p>The following examples illustrate the basics of the diff format. It does\n    not cover the special treatment of properties with type <i>Date</i>,\n    <i>Name</i>, <i>Path</i>, <i>Reference</i> and <i>Binary</i> (see below).</p>\n    <p style=\"font-size:smaller\">Set properties</p>\n    <pre class=\"code\">\n^prop1  : \"stringvalue\"\n^prop1  : \"changedvalue\"\n^prop2  : true\n^prop3  : 100.010\n^prop4  : 1234567890\n^prop5  : [\"multi\",\"valued\",\"string prop\"]\n^.      : \"change existing property at path.\"\n^/abs/path/to/the/new/prop : \"some value.\"</pre>\n    <p style=\"font-size:smaller\">Add new nodes (optionally including child items)</p>\n    <pre class=\"code\">\n+node   : {\"title\" : \"title property of the new node\"}\n+node2  : {\"childN\" : {}, \"childN2\" : {}}\n+/abs/path/to/the/new/node : {\"text\" : \"some text\"}</pre>\n    <p style=\"font-size:smaller\">Move or rename nodes</p>\n    <pre class=\"code\">\n>node   : rename\n>rename : /moved/to/another/destination</pre>\n    <p style=\"font-size:smaller\">Reorder nodes</p>\n    <pre class=\"code\">\n>childN : childN2#after\n>childN : #first\n>childN : #last\n>childN : childN2#before</pre>\n    <p style=\"font-size:smaller\">Remove items</p>\n    <pre class=\"code\">\n-prop4  :\n-node2  :\n-/moved/to/another/destination :</pre>\n    <h4>Dealing with Special Property Types</h4>\n    <p>Property types that can not be covered unambigously, need some special\n    handling (see JavaDoc). This affects JCR properties being of type\n    <ul>\n    <li>Date,</li>\n    <li>Name,</li>\n    <li>Path,</li>\n    <li>Reference,</li>\n    <li>Binary.</li>\n    </ul>\n    In order to set properties of any of the types listed, the value part in the\n    :diff param must  be left empty and a separate request parameter must be\n    included. Its name equals the corresponding key in the :diff, its value represents\n    the property value. In addition the desired property type must be specified\n    using the conversion defined with\n    <a href=\"http://svn.apache.org/repos/asf/jackrabbit/trunk/jackrabbit-jcr-server/src/main/java/org/apache/jackrabbit/webdav/jcr/JcrValueType.java\">JcrValueType#contentTypeFromType(int)</a>.\n    </p>\n    <p style=\"font-size:smaller\">Set a Date property</p>\n    <pre>\nPOST /jackrabbit/server/".toCharArray();
    __oracle_jsp_text[4] = 
    "/jcr%3aroot/testNode HTTP/1.1\nContent-Type: multipart/form-data; boundary=kTmAb2lkjCtxbMVFzHEplAJjHCUo5aQndaUu\n\n--kTmAb2lkjCtxbMVFzHEplAJjHCUo5aQndaUu\nContent-Disposition: form-data; <b>name=\"dateProp\"</b>\nContent-Type: <b>jcr-value/date</b>\n\n<b>2009-02-12T10:19:40.778+01:00</b>         \n--kTmAb2lkjCtxbMVFzHEplAJjHCUo5aQndaUu\nContent-Disposition: form-data; <b>name=\":diff\"</b>\nContent-Type: text/plain\n\n<b>^dateProp :  </b>\n--kTmAb2lkjCtxbMVFzHEplAJjHCUo5aQndaUu--\n    </pre>\n    <p>Setting <i>Binary</i>, <i>Name</i>, <i>Path</i> or <i>Reference</i>\n        properties works accordingly.\n    </p>\n\n    <h3><a name=\"simple_write\">Direct Content Editing</a></h3>\n    <p>The functionality present with batch reading also enables very simplified\n    content editing using common HTML forms.</p>\n    <p>The :diff parameter is omitted altogether and each request parameter is\n        treated as property\n    <ul>\n        <li>param name : property name</li>\n        <li>param value : property value</li>\n    </ul>\n    whereas the form action indicates the path of the parent node.\n    </p>\n    <p>If no node exists at the specified path an attempt is made to create the\n        missing intermediate nodes. The primary node type of the new node is\n        either retrieved from the corresponding <i>jcr:primaryType</i> param or\n        automatically determined by the implementation.</p>\n    <p>Setting a property can be tested at\n        <a href=\"write_simple.jsp\">Example: Simplified Writing</a>\n    </p>\n    <h4>Examples</h4>\n    <p>The following examples illustrate the simplified writing.</p>\n    <p style=\"font-size:smaller\">Set string property\n    <ul>\n        <li style=\"font-size:smaller\">Existing or non-existing node at /testnode</li>\n        <li style=\"font-size:smaller\">Set property 'propName' with value \"any string value\"</li>\n    </ul>\n    </p>\n    <pre class=\"code\">\n&lt;form method=\"POST\" action=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "/testnode\"&gt;\n    &lt;input type=\"text\" name=\"propName\" value=\"any string value\"/&gt;\n&lt;/form&gt;</pre>\n    <p style=\"font-size:smaller\">Add node with a defined node type and set a property</p>\n    <ul>\n        <li style=\"font-size:smaller\">Non-existing node at /testnode/nonexisting</li>\n        <li style=\"font-size:smaller\">Define its primary type to be \"nt:unstructured\"</li>\n        <li style=\"font-size:smaller\">Set property 'propName' with value \"any string value\"</li>\n    </ul>\n    <pre class=\"code\">\n&lt;form method=\"POST\" action=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "/nonexisting\"&gt;\n    &lt;input type=\"text\" name=\"jcr:primaryType\" value=\"nt:unstructured\"/&gt;\n    &lt;input type=\"text\" name=\"propName\" value=\"any string value\"/&gt;\n&lt;/form&gt;</pre>\n</div>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
