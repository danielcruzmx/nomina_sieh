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


public class _read__batch extends com.orionserver.http.OrionHttpJspPage {


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
    _read__batch page = this;
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
      out.print( href );
      out.write(__oracle_jsp_text[4]);
      out.print( href );
      out.write(__oracle_jsp_text[5]);
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
  private static final char __oracle_jsp_text[][]=new char[6][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<script src=\"json.js\"></script>\n<script language=\"javascript\">\n    function batchRead() {\n\n        var path = document.getElementById(\"path\").value;\n        var depth = document.getElementById(\"depth\").value;\n        var resultType = document.getElementById(\"resultType\");\n\n        // TODO retrieve url from servlet context\n        var action = \"".toCharArray();
    __oracle_jsp_text[4] = 
    "\";\n        if (path.length && path != \"/\") {\n            action += path;\n        }\n        if (depth) {\n            action += \".\" + depth;\n        }\n\n        var req = getXMLHttpRequest(action + \".json\");\n        var result = document.getElementById(\"result\");\n\n        if (req && req.status == 200) {\n            if (resultType[4].selected) {\n                // tree\n                var obj = eval(\"(\" + req.responseText + \")\");\n                var thref = \"".toCharArray();
    __oracle_jsp_text[5] = 
    "\" + ((path.length && path != \"/\") ? path : \"\");\n                result.innerHTML = JsonFormatter.tree(obj, thref);\n            } else if (resultType[3].selected) {\n                // cleaned from special props\n                var obj = eval(\"(\" + req.responseText + \")\");\n                result.innerHTML = JsonFormatter.format(obj, true);\n            } else if (resultType[2].selected) {\n                // indention (pretty printing)\n                var obj = eval(\"(\" + req.responseText + \")\");\n                result.innerHTML = JsonFormatter.format(obj, false);\n            } else {\n                // raw (default)\n                result.innerHTML = req.responseText;\n            }\n        } else {\n            var error = \"ERROR: \" + ((req) ? (req.status + \" : \"+ req.responseText) : \"Failed to create XMLHttpRequest.\");\n            result.innerHTML = error;\n        }\n        return true;\n    }\n</script> \n<div id=\"content\">\n    <h2>Examples: Batch Read</h2>\n    <p>\n    Enter the path of an existing node and the desired depth.\n    </p>\n    <table>\n        <tr>\n            <td>Node Path</td>\n            <td><input type=\"text\" name=\"path\" id=\"path\" value=\"/\"></td>\n        </tr>\n        <tr>\n            <td>Depth</td>\n            <td><input type=\"text\" name=\"depth\" id=\"depth\" value=\"0\"></td>\n        </tr>\n        <tr>\n            <td>Result type</td>\n            <td><select name=\"resultType\" id=\"resultType\">\n                <option value=\"\">--- select ---</option>\n                <option value=\"raw\">raw</option>\n                <option value=\"indented\">indented</option>\n                <option value=\"indented_clean\">indented (cleaned)</option>\n                <option value=\"tree\">tree</option>\n            </select></td>\n        </tr>\n        <tr><td><input type=\"button\" value=\"Submit\" onclick=\"batchRead()\"></td></tr>\n    </table>\n    <p>\n    <pre id =\"result\" class=\"code\"></pre>\n</div>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
