
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import javax.jcr.Repository;
import javax.jcr.Session;
import org.apache.jackrabbit.j2ee.RepositoryAccessServlet;
import org.apache.jackrabbit.util.Text;
import javax.jcr.SimpleCredentials;
import java.text.NumberFormat;


public class _swr extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=UTF-8");
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
    _swr page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      
          Repository rep;
          Session jcrSession;
          try {
              rep = RepositoryAccessServlet.getRepository(pageContext.getServletContext());
              jcrSession = rep.login(new SimpleCredentials("anonymous", "".toCharArray()));
          } catch (Throwable e) {
              
      out.write(__oracle_jsp_text[0]);
      out.print( Text.encodeIllegalXMLCharacters(e.getMessage()) );
      out.write(__oracle_jsp_text[1]);
      
              
      out.write(__oracle_jsp_text[2]);
      
              return;
          }
          try {
              String q = new String(request.getParameter("q").getBytes("ISO-8859-1"), "UTF-8");
              String swrnum = request.getParameter("swrnum");
              String numResults = null;
              try {
                  numResults = NumberFormat.getNumberInstance().format(Long.parseLong(swrnum));
              } catch (NumberFormatException e) {
                  // ignore
              }
              if (q == null || numResults == null) {
                  return;
              }
      
              request.setAttribute("title", "Search within results");
              
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[3]);
      out.print( numResults );
      out.write(__oracle_jsp_text[4]);
      out.print( Text.encodeIllegalXMLCharacters(q) );
      out.write(__oracle_jsp_text[5]);
      out.print( Text.encodeIllegalXMLCharacters(q) );
      out.write(__oracle_jsp_text[6]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[7]);
      
          } finally {
              if (jcrSession != null) {
                  jcrSession.logout();
              }
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
  private static final char __oracle_jsp_text[][]=new char[8][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "Error while accessing the repository: <font color=\"red\">".toCharArray();
    __oracle_jsp_text[1] = 
    "</font><br>".toCharArray();
    __oracle_jsp_text[2] = 
    "Check the configuration or use the <a href=\"admin/\">easy setup</a> wizard.".toCharArray();
    __oracle_jsp_text[3] = 
    "\n    <form name=f action=\"search.jsp\">\n      <table border=0 cellpadding=0 cellspacing=0 width=100%>\n        <tr><td><table border=0 width=100%><tr><td><br>There were about <b>".toCharArray();
    __oracle_jsp_text[4] = 
    "</b> results for <b>".toCharArray();
    __oracle_jsp_text[5] = 
    "</b>.<br>\n        Use the search box below to search within these results.<br><br></td></tr></table>\n        </td></tr>\n        <tr><td valign=middle>\n        <table border=0 width=100%><tr><td>\n        <INPUT type=hidden name=q value=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "\">\n        <INPUT type=text name=as_q size=31 maxlength=256 value=\"\">\n        <INPUT type=submit VALUE=\"Search&nbsp;within&nbsp;results\">\n        </td></tr></table>\n        </td></tr>\n      </table>\n    </form>\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
