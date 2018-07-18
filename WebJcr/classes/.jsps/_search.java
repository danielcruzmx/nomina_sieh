
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import javax.jcr.Repository;
import org.apache.jackrabbit.j2ee.RepositoryAccessServlet;
import org.apache.jackrabbit.util.Text;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.query.Query;
import javax.jcr.query.RowIterator;
import java.text.NumberFormat;
import javax.jcr.query.Row;
import javax.jcr.Node;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import javax.jcr.Value;
import javax.jcr.RepositoryException;


public class _search extends com.orionserver.http.OrionHttpJspPage {


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
    _search page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      
          Repository rep;
          Session jcrSession;
          try {
              rep = RepositoryAccessServlet.getRepository(pageContext.getServletContext());
              jcrSession = rep.login(new SimpleCredentials("anonymous", "".toCharArray()));
          } catch (Throwable e) {
              
      out.write(__oracle_jsp_text[1]);
      out.print( Text.encodeIllegalXMLCharacters(e.getMessage()) );
      out.write(__oracle_jsp_text[2]);
      
              
      out.write(__oracle_jsp_text[3]);
      
              return;
          }
          try {
              String wspName = jcrSession.getWorkspace().getName();
              String q = request.getParameter("q");
              if (q == null) {
                  q = "";
              } else {
                  q = new String(q.getBytes("ISO-8859-1"), "UTF-8");
              }
              if (request.getParameter("as_q") != null) {
                  q += " " + new String(request.getParameter("as_q").getBytes("ISO-8859-1"), "UTF-8");
              }
              String executedIn = "";
              String queryTerms = "";
              String totalResults = "";
              long from = 0;
              long to = 10;
              long total = 0;
              long maxPage = 0;
              long minPage = 0;
              long currentPageIndex = 0;
              List indexes = new ArrayList();
              RowIterator rows = null;
              String suggestedQuery = null;
              if (q != null && q.length() > 0) {
                  String stmt;
                  if (q.startsWith("related:")) {
                      String path = q.substring("related:".length());
                      path = path.replaceAll("'", "''");
                      stmt = "//element(*, nt:file)[rep:similar(jcr:content, '" + path + "/jcr:content')]/rep:excerpt(.) order by @jcr:score descending";
                      queryTerms = "similar to <b>" + Text.encodeIllegalXMLCharacters(path) + "</b>";
                  } else {
                      queryTerms = "for <b>" + Text.encodeIllegalXMLCharacters(q) + "</b>";
                      q = q.replaceAll("'", "''");
                      stmt = "//element(*, nt:file)[jcr:contains(jcr:content, '" + q + "')]/rep:excerpt(.) order by @jcr:score descending";
                  }
                  Query query = jcrSession.getWorkspace().getQueryManager().createQuery(stmt, Query.XPATH);
                  long time = System.currentTimeMillis();
                  rows = query.execute().getRows();
                  time = System.currentTimeMillis() - time;
                  NumberFormat nf = NumberFormat.getNumberInstance();
                  nf.setMaximumFractionDigits(2);
                  nf.setMinimumFractionDigits(2);
                  executedIn = nf.format(((double) time) / 1000d);
                  nf.setMaximumFractionDigits(0);
                  totalResults = nf.format(rows.getSize());
                  if (request.getParameter("start") != null) {
                      from = Long.parseLong(request.getParameter("start"));
                      try {
                          rows.skip(from);
                      } catch (Exception e) {
                          // make sure rows are consumed
                          while (rows.hasNext()) {
                              rows.nextRow();
                          }
                      }
                  }
                  to = Math.min(from + 10, rows.getSize());
      
                  total = rows.getSize();
                  maxPage = total / 10L;
                  if (total % 10L > 0) {
                      maxPage++;
                  }
                  currentPageIndex = from / 10L;
                  maxPage = Math.min(maxPage, currentPageIndex + 10);
                  minPage = Math.max(0, currentPageIndex - 10);
                  for (long i = minPage; i < maxPage; i++) {
                      indexes.add(new Long(i));
                  }
      
                  if (total < 10 && !q.startsWith("related:")) {
                      try {
                          Value v = jcrSession.getWorkspace().getQueryManager().createQuery(
                                  "/jcr:root[rep:spellcheck('" + q + "')]/(rep:spellcheck())",
                                  Query.XPATH).execute().getRows().nextRow().getValue("rep:spellcheck()");
                          if (v != null) {
                              suggestedQuery = v.getString();
                          }
                      } catch (RepositoryException e) {
                          // ignore
                      }
                  }
              }
      request.setAttribute("title", "Search workspace " + wspName);
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[4]);
      out.print( Text.encodeIllegalXMLCharacters(q) );
      out.write(__oracle_jsp_text[5]);
       if (rows != null && rows.getSize() == 0) { 
      out.write(__oracle_jsp_text[6]);
           if (suggestedQuery != null) { 
      out.write(__oracle_jsp_text[7]);
      out.print( Text.encodeIllegalXMLCharacters(suggestedQuery) );
      out.write(__oracle_jsp_text[8]);
      out.print( Text.encodeIllegalXMLCharacters(suggestedQuery) );
      out.write(__oracle_jsp_text[9]);
           } 
      out.write(__oracle_jsp_text[10]);
      out.print( Text.encodeIllegalXMLCharacters(q) );
      out.write(__oracle_jsp_text[11]);
      
          } else if (rows != null) {
        
      out.write(__oracle_jsp_text[12]);
      out.print( from + 1 );
      out.write(__oracle_jsp_text[13]);
      out.print( to );
      out.write(__oracle_jsp_text[14]);
      out.print( totalResults );
      out.write(__oracle_jsp_text[15]);
      out.print( queryTerms );
      out.write(__oracle_jsp_text[16]);
      out.print( executedIn );
      out.write(__oracle_jsp_text[17]);
       if (suggestedQuery != null) { 
      out.write(__oracle_jsp_text[18]);
      out.print( Text.encodeIllegalXMLCharacters(suggestedQuery) );
      out.write(__oracle_jsp_text[19]);
      out.print( Text.encodeIllegalXMLCharacters(suggestedQuery) );
      out.write(__oracle_jsp_text[20]);
       } 
      out.write(__oracle_jsp_text[21]);
      
            while (rows.hasNext() && rows.getPosition() < to) {
                Row r = rows.nextRow();
                Node file = (Node) jcrSession.getItem(r.getValue("jcr:path").getString());
                Node resource = file.getNode("jcr:content");
                String size = "";
                if (resource.hasProperty("jcr:data")) {
                    double length = resource.getProperty("jcr:data").getLength();
                    size = String.valueOf(Math.round(Math.ceil(length / 1000d))) + "k";
                }
                DateFormat df = SimpleDateFormat.getDateInstance(SimpleDateFormat.LONG);
                String lastModified = df.format(resource.getProperty("jcr:lastModified").getDate().getTime());
          
      out.write(__oracle_jsp_text[22]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath() + "/repository/" + wspName + file.getPath()) );
      out.write(__oracle_jsp_text[23]);
      out.print( Text.encodeIllegalXMLCharacters(file.getName()) );
      out.write(__oracle_jsp_text[24]);
      out.print( r.getValue("rep:excerpt(jcr:content)").getString() );
      out.write(__oracle_jsp_text[25]);
      out.print( Text.encodeIllegalXMLCharacters(file.getPath()) );
      out.write(__oracle_jsp_text[26]);
      out.print( size );
      out.write(__oracle_jsp_text[27]);
      out.print( lastModified );
      out.write(__oracle_jsp_text[28]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[29]);
      out.print( Text.encodeIllegalXMLCharacters(URLEncoder.encode(file.getPath(), "UTF-8")) );
      out.write(__oracle_jsp_text[30]);
      
            } // while
          
      out.write(__oracle_jsp_text[31]);
      
          if (indexes.size() > 1) {
        
      out.write(__oracle_jsp_text[32]);
      
              if (currentPageIndex != ((Long) indexes.get(0)).longValue()) {
                  
      out.write(__oracle_jsp_text[33]);
      out.print( Text.encodeIllegalXMLCharacters(q) );
      out.write(__oracle_jsp_text[34]);
      out.print( (currentPageIndex - 1) * 10 );
      out.write(__oracle_jsp_text[35]);
      
              } else {
                  
      out.write(__oracle_jsp_text[36]);
      
              }
              for (Iterator it = indexes.iterator(); it.hasNext(); ) {
                  long pageIdx = ((Long) it.next()).longValue();
                  if (pageIdx == currentPageIndex) {
                      
      out.write(__oracle_jsp_text[37]);
      out.print( pageIdx + 1 );
      
                  } else {
                      
      out.write(__oracle_jsp_text[38]);
      out.print( Text.encodeIllegalXMLCharacters(q) );
      out.write(__oracle_jsp_text[39]);
      out.print( pageIdx * 10 );
      out.write(__oracle_jsp_text[40]);
      out.print( pageIdx + 1 );
      out.write(__oracle_jsp_text[41]);
      
                  }
              }
              if (currentPageIndex < (maxPage - 1)) {
                  
      out.write(__oracle_jsp_text[42]);
      out.print( Text.encodeIllegalXMLCharacters(q) );
      out.write(__oracle_jsp_text[43]);
      out.print( (currentPageIndex + 1) * 10 );
      out.write(__oracle_jsp_text[44]);
      
              } else {
                  
      out.write(__oracle_jsp_text[45]);
      
              }
              
      out.write(__oracle_jsp_text[46]);
      
          }
        
      out.write(__oracle_jsp_text[47]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[48]);
      out.print( Text.encodeIllegalXMLCharacters(q) );
      out.write(__oracle_jsp_text[49]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[50]);
      out.print( Text.encodeIllegalXMLCharacters(q) );
      out.write(__oracle_jsp_text[51]);
      out.print( rows.getSize() );
      out.write(__oracle_jsp_text[52]);
      
          } // if (rows != null)
      
          String tableClass = "";
          if (rows != null && rows.getSize() == 0) {
              tableClass = " class=\"t n bt\"";
          }
        
      out.write(__oracle_jsp_text[53]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[54]);
      
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
  private static final char __oracle_jsp_text[][]=new char[55][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "Error while accessing the repository: <font color=\"red\">".toCharArray();
    __oracle_jsp_text[2] = 
    "</font><br>".toCharArray();
    __oracle_jsp_text[3] = 
    "Check the configuration or use the <a href=\"admin/\">easy setup</a> wizard.".toCharArray();
    __oracle_jsp_text[4] = 
    "\n\n<form name=\"gs\" method=\"GET\">\n  <p>\n    <input type=\"text\" name=\"q\" size=\"41\" maxlength=\"2048\" value=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "\" title=\"Search\">\n    <input type=submit value=\"Search\"><br><br>\n  </p>\n</form>\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\n<p><font class=\"p\" color=\"#cc0000\">Did you mean:</font>\n  <a href=\"search.jsp?q=".toCharArray();
    __oracle_jsp_text[8] = 
    "\" class=\"p\">\n    <b><i>".toCharArray();
    __oracle_jsp_text[9] = 
    "</i></b>\n  </a><br>\n</p>\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\n  <p/>Your search - <b>".toCharArray();
    __oracle_jsp_text[11] = 
    "</b> - did not match any documents.\n  <br/><br/>Suggestions:\n  <ul>\n    <li>Make sure all words are spelled correctly.</li>\n    <li>Try different keywords.</li>\n    <li>Try more general keywords.</li>\n    <li>Try fewer keywords.</li>\n  </ul>\n  ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n  <table border=0 cellpadding=0 cellspacing=0 width=100% class=\"t bt\">\n    <tr>\n      <td><font size=-1>Results <b>".toCharArray();
    __oracle_jsp_text[13] = 
    "</b> - <b>".toCharArray();
    __oracle_jsp_text[14] = 
    "</b> of about <b>".toCharArray();
    __oracle_jsp_text[15] = 
    "</b> ".toCharArray();
    __oracle_jsp_text[16] = 
    ". (<b>".toCharArray();
    __oracle_jsp_text[17] = 
    "</b> seconds)&nbsp;</font></td></tr>\n  </table>\n".toCharArray();
    __oracle_jsp_text[18] = 
    "\n  <p>\n    <font class=\"p\" color=\"#cc0000\">Did you mean:</font>\n    <a href=\"search.jsp?q=".toCharArray();
    __oracle_jsp_text[19] = 
    "\" class=\"p\">\n      <b><i>".toCharArray();
    __oracle_jsp_text[20] = 
    "</i></b>\n    </a><br>\n  </p>\n".toCharArray();
    __oracle_jsp_text[21] = 
    "\n  <div>\n    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n    <h6><a href=\"".toCharArray();
    __oracle_jsp_text[23] = 
    "\" class=l>".toCharArray();
    __oracle_jsp_text[24] = 
    "</a></h6>\n      <table border=0 cellpadding=0 cellspacing=0>\n        <tr><td><font>".toCharArray();
    __oracle_jsp_text[25] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[26] = 
    " - ".toCharArray();
    __oracle_jsp_text[27] = 
    " - ".toCharArray();
    __oracle_jsp_text[28] = 
    " - <nobr><a href=\"".toCharArray();
    __oracle_jsp_text[29] = 
    "/search.jsp?q=related:".toCharArray();
    __oracle_jsp_text[30] = 
    "\">Similar pages</a></nobr></font></td>\n        </tr>\n      </table>\n    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n  </div>\n\n  <br clear=all>\n  ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n  <div>\n    <table border=0 cellpadding=0 cellspacing=0 align=center>\n      <tr>\n        <td><font size=-1>Result&nbsp;Page:&nbsp;\n        ".toCharArray();
    __oracle_jsp_text[33] = 
    "<td nowrap align=right><a href=search.jsp?q=".toCharArray();
    __oracle_jsp_text[34] = 
    "&start=".toCharArray();
    __oracle_jsp_text[35] = 
    ">Previous</a>".toCharArray();
    __oracle_jsp_text[36] = 
    "<td nowrap ><font size=-1>".toCharArray();
    __oracle_jsp_text[37] = 
    "<td nowrap><font size=-1>".toCharArray();
    __oracle_jsp_text[38] = 
    "<td nowrap><font size=-1><a href=search.jsp?q=".toCharArray();
    __oracle_jsp_text[39] = 
    "&start=".toCharArray();
    __oracle_jsp_text[40] = 
    ">".toCharArray();
    __oracle_jsp_text[41] = 
    "</a>".toCharArray();
    __oracle_jsp_text[42] = 
    "<td nowrap><font size=-1><a href=search.jsp?q=".toCharArray();
    __oracle_jsp_text[43] = 
    "&start=".toCharArray();
    __oracle_jsp_text[44] = 
    ">Next</a>".toCharArray();
    __oracle_jsp_text[45] = 
    "<td nowrap >".toCharArray();
    __oracle_jsp_text[46] = 
    "\n    </table>\n  </div>\n  ".toCharArray();
    __oracle_jsp_text[47] = 
    "\n\n\n    <br clear=all><br>\n    <table>\n      <tr><td><br><form method=GET action=".toCharArray();
    __oracle_jsp_text[48] = 
    "/search.jsp>\n          <font size=-1><input type=text name=q size=31 maxlength=2048 value=\"".toCharArray();
    __oracle_jsp_text[49] = 
    "\" title=\"Search\"> <input type=submit value=\"Search\">\n          </font></form>\n        <br><font size=-1>\n        <a href=\"".toCharArray();
    __oracle_jsp_text[50] = 
    "/swr.jsp?q=".toCharArray();
    __oracle_jsp_text[51] = 
    "&swrnum=".toCharArray();
    __oracle_jsp_text[52] = 
    "\">Search&nbsp;within&nbsp;results</a> | <a href=\"http://issues.apache.org/jira/browse/JCR\" target=_blank>Dissatisfied? Help us improve</a></font><br>\n        <br>\n      </td></tr>\n    </table>\n\n  ".toCharArray();
    __oracle_jsp_text[53] = 
    "\n".toCharArray();
    __oracle_jsp_text[54] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
