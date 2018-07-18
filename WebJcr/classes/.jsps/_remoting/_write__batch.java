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


public class _write__batch extends com.orionserver.http.OrionHttpJspPage {


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
    _write__batch page = this;
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
  private static final char __oracle_jsp_text[][]=new char[5][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<script src=\"json.js\"></script>\n<script language=\"javascript\">\n    function batchWrite() {\n        var path = document.getElementById(\"path\").value;\n        var diff = document.getElementById(\":diff\").value;\n\n        if (!diff) {\n            alert(\"Please enter the Diff.\");\n            return false;\n        }\n\n        var headers = new Object();\n        headers[\"Content-type\"] = \"application/x-www-form-urlencoded\";\n        headers[\"Authorization\"] =  \"Basic YWRtaW46YWRtaW4=\";\n\n        var params = encodeURIComponent(\":diff\") + \"=\" + encodeURIComponent(diff);\n\n        var url = \"".toCharArray();
    __oracle_jsp_text[4] = 
    "\" + path;\n        var req = getXMLHttpRequest(url, \"POST\", headers, params);\n        var result = document.getElementById(\"result\");\n\n        if (req && (req.status == 200 || req.status == 201)) {\n            result.innerHTML = \"Success<br><a href=\\\"\" + url + \"\\\" target=\\\"_blank\\\">View Result</a>\";\n        } else {\n            var error = \"ERROR: \" + ((req) ? (req.status + \" : \"+ req.responseText) : \"Failed to create XMLHttpRequest.\");\n            result.innerHTML = error;\n        }\n        return true;\n    }\n\n</script>\n<div id=\"content\">\n    <h2>Examples: Batch Write</h2>\n    <p>\n    Enter the path of an existing node or property (depending on the desired\n    actions) and enter the <i>:diff</i> value.\n    </p>\n    <p>See the introduction to batched <a href=\"write.jsp#batch_write\">writing</a>\n        for examples.\n    </p>\n    <table>\n        <tr>\n            <td>Item Path</td>\n            <td><input type=\"text\" id=\"path\" value=\"\"></td>\n        </tr>\n        <tr>\n            <td valign=\"top\">Diff</td>\n            <td><textarea rows=\"10\" cols=\"40\" id=\":diff\"></textarea></td>\n        </tr>\n        <tr><td><input type=\"button\" value=\"Submit\" onclick=\"batchWrite()\"></td></tr>\n    </table>\n    <p>\n    <pre id =\"result\" class=\"code\"></pre>\n</div>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
