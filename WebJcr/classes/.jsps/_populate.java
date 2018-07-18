
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.swing.text.AttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import org.apache.jackrabbit.j2ee.RepositoryAccessServlet;
import org.apache.jackrabbit.util.Text;


public class _populate extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations



    public static final List DEFAULT_TYPES = Arrays.asList(
            new String[]{"pdf", "rtf", "doc", "ppt", "xls"});

    public static class Search {

        private final String filetype;

        private final String term;

        private final int start;

        public Search(String filetype, String term, int start) {
            this.filetype = filetype;
            this.term = term;
            this.start = start;
        }

        public URL[] getURLs() throws Exception {
            List urls = new ArrayList();
            String query = term + " filetype:" + filetype;
            URL google = new URL("http://www.google.com/search?q=" +
                    URLEncoder.encode(query, "UTF-8") + "&start=" + start);
            URLConnection con = google.openConnection();
            con.setRequestProperty("User-Agent", "");
            InputStream in = con.getInputStream();
            try {
                HTMLEditorKit kit = new HTMLEditorKit();
                HTMLDocument doc = new HTMLDocument();
                doc.putProperty("IgnoreCharsetDirective", Boolean.TRUE);
                kit.read(new InputStreamReader(in, "UTF-8"), doc, 0);
                HTMLDocument.Iterator it = doc.getIterator(HTML.Tag.A);
                while (it.isValid()) {
                    AttributeSet attr = it.getAttributes();
                    if (attr != null) {
                        String href = (String) attr.getAttribute(HTML.Attribute.HREF);
                        if (href != null && href.endsWith("." + filetype)) {
                            URL url = new URL(new URL("http", "www.google.com", "dummy"), href);
                            if (url.getHost().indexOf("google") == -1) {
                                urls.add(url);
                            }
                        }
                    }
                    it.next();
                }
            } finally {
                in.close();
            }
            return (URL[]) urls.toArray(new URL[urls.size()]);
        }
    }

    public static class ProgressInputStream extends FilterInputStream {

        private final int length;

        private final String fileName;

        private final String varName;

        private final JspWriter out;

        private long read;

        private long nextReport = (16 * 1024);

        public ProgressInputStream(InputStream in, int length, String fileName,
                                   String varName, JspWriter out) {
            super(in);
            this.length = length;
            this.fileName = fileName;
            this.varName = varName;
            this.out = out;
        }

        public int read() throws IOException {
            int r = super.read();
            reportProgress(r);
            return r;
        }

        public int read(byte b[]) throws IOException {
            int r = super.read(b);
            reportProgress(r);
            return r;
        }

        public int read(byte b[], int off, int len) throws IOException {
            int r = super.read(b, off, len);
            reportProgress(r);
            return r;
        }

        private void reportProgress(int r) throws IOException {
            if (r != -1) {
                read += r;
                if (read > nextReport || read == length) {
                    // report every 16k
                    synchronized (out) {
                        double s = 1000d * (double) read / (double) length;
                        out.println("<script>" + varName + ".inform(" +
                                Math.min((int) Math.ceil(s), 1000) +
                                ", '" + Text.encodeIllegalXMLCharacters(fileName) + "')</script>");
                        out.flush();
                    }
                    nextReport += (16 * 1024);
                }
            }
        }
    }

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
    _populate page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      
          Repository rep;
          Session jcrSession;
          String wspName;
          try {
              rep = RepositoryAccessServlet.getRepository(pageContext.getServletContext());
              jcrSession = rep.login(new SimpleCredentials("user", "".toCharArray()));
              wspName = jcrSession.getWorkspace().getName();
          } catch (Throwable e) {
              
      out.write(__oracle_jsp_text[0]);
      out.print( Text.encodeIllegalXMLCharacters(e.getMessage()) );
      out.write(__oracle_jsp_text[1]);
      
              
      out.write(__oracle_jsp_text[2]);
      
              return;
          }
          try {
              String seedWord = request.getParameter("seed");
              if (seedWord != null) {
                  seedWord = new String(seedWord.getBytes("ISO-8859-1"), "UTF-8");
              }
              int numDocs = 0;
              List filetypes = new ArrayList();
              if (request.getParameter("num") != null) {
                  try {
                      numDocs = Integer.parseInt(request.getParameter("num"));
                  } catch (NumberFormatException e) {
                      // ignore
                  }
              }
              String[] types = request.getParameterValues("filetype");
              if (types != null) {
                  filetypes.addAll(Arrays.asList(types));
              } else {
                  filetypes = DEFAULT_TYPES;
              }
      
      if (seedWord != null && numDocs > 0 && filetypes.size() > 0) { 
      out.write(__oracle_jsp_text[3]);
      out.print( Text.encodeIllegalXMLCharacters(wspName) );
      out.write(__oracle_jsp_text[4]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[5]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[6]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[7]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[8]);
      out.print( Text.encodeIllegalXMLCharacters(request.getContextPath()) );
      out.write(__oracle_jsp_text[9]);
      out.print( Text.encodeIllegalXMLCharacters(wspName) );
      out.write(__oracle_jsp_text[10]);
      out.print( numDocs );
      out.write(__oracle_jsp_text[11]);
      
                  Node root = jcrSession.getRootNode();
                  int n = 0;
                  for (int typeIdx = 0; typeIdx < filetypes.size(); typeIdx++) {
                      String type = (String) filetypes.get(typeIdx);
                      int offset = 0;
                      while (n < numDocs * (typeIdx + 1) / filetypes.size()) {
                          final URL[] urls = new Search(type, seedWord, offset).getURLs();
                          if (urls.length == 0) {
                              break;
                          }
                          for (int i = 0; i < urls.length; i++) {
                              final URL currentURL = urls[i];
                              String path = urls[i].getPath();
                              if (path.startsWith("/")) {
                                  path = path.substring(1);
                              }
                              final String host = urls[i].getHost();
                              List folderNames = new ArrayList();
                              folderNames.addAll(Arrays.asList(host.split("\\.")));
                              Collections.reverse(folderNames);
                              folderNames.addAll(Arrays.asList(path.split("/", 0)));
                              final String fileName = URLDecoder.decode((String) folderNames.remove(folderNames.size() - 1), "UTF-8").replaceAll(":", "_");
                              
                              Node node = root;
                              if (!node.hasNode("testweb")) {
                                  node.addNode("testweb", "nt:folder");
                              }
                              node = node.getNode("testweb");
                              
                              for (Iterator fn = folderNames.iterator(); fn.hasNext(); ) {
                                  String name = URLDecoder.decode((String) fn.next(), "UTF-8");
                                  name = name.replaceAll(":", "_");
                                  if (name.length() == 0) {
                                      continue;
                                  }
                                  if (!node.hasNode(name)) {
                                      node.addNode(name, "nt:folder");
                                  }
                                  node = node.getNode(name);
                              }
                              if (!node.hasNode(fileName)) {
                                  final JspWriter fOut = out;
                                  Node file = node.addNode(fileName, "nt:file");
                                  String mimeType = URLConnection.guessContentTypeFromName(fileName);
                                  if (mimeType == null) {
                                      if (fileName.endsWith(".doc")) {
                                          mimeType = "application/msword";
                                      } else if (fileName.endsWith(".xls")) {
                                          mimeType = "application/vnd.ms-excel";
                                      } else if (fileName.endsWith(".ppt")) {
                                          mimeType = "application/mspowerpoint";
                                      } else {
                                          mimeType = "application/octet-stream";
                                      }
                                  }
                                  Calendar lastModified = Calendar.getInstance();
                                  final Node resource = file.addNode("jcr:content", "fsn:resource");
                                  resource.setProperty("jcr:mimeType", mimeType);
                                  resource.addMixin("mix:title");
                                  resource.addMixin("mix:lastModified");//lastModified lastModifiedBy
                                  resource.addMixin("mix:mimeType");// mimeType and Encoding
                                  resource.addMixin("mix:referenceable");
                                  resource.addMixin("mix:versionable");
                                  resource.setProperty("jcr:lastModified", lastModified);
                                  
                                  final Exception[] ex = new Exception[1];
                                  Thread t = new Thread(new Runnable() {
                                      public void run() {
                                          try {
                                              String info = fileName + " (" + host + ")";
                                              URLConnection con = currentURL.openConnection();
                                              InputStream in = con.getInputStream();
                                              try {
                                                  synchronized (fOut) {
                                                      fOut.println("<script>dp.inform(0, '" + Text.encodeIllegalXMLCharacters(info) + "')</script>");
                                                      fOut.flush();
                                                  }
                                                  int length = con.getContentLength();
                                                  if (length != -1) {
                                                      in = new ProgressInputStream(in, length, info, "dp", fOut);
                                                  }
                                                  resource.setProperty("jcr:data", in);
                                              } finally {
                                                  in.close();
                                              }
                                          } catch (Exception e) {
                                              ex[0] = e;
                                          }
                                      }
                                  });
                                  t.start();
                                  for (int s = 0; t.isAlive(); s++) {
                                      Thread.sleep(100);
                                      if (s % 10 == 0) {
                                          synchronized (fOut) {
                                              fOut.println("<script>pb.inform(" + n + ", '')</script>");
                                              fOut.flush();
                                          }
                                      }
                                  }
                                  if (ex[0] == null) {
                                      jcrSession.save();
                                      n++;
                                      synchronized (fOut) {
                                          fOut.println("<script>pb.inform(" + n + ", '')</script>");
                                          fOut.flush();
                                      }
                                      if (n >= numDocs * (typeIdx + 1) / filetypes.size()) {
                                          break;
                                      }
                                  } else {
                                      jcrSession.refresh(false);
                                  }
                              }
                          }
                          offset += 10;
                      }
                  }
      
      out.write(__oracle_jsp_text[12]);
       } else {
      request.setAttribute("title", "Populate workspace " + wspName);
      
      {
        String __url=OracleJspRuntime.toStr("header.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[13]);
      out.print( seedWord == null ? "" : Text.encodeIllegalXMLCharacters(seedWord) );
      out.write(__oracle_jsp_text[14]);
      out.print( numDocs == 0 ? 100 : numDocs );
      out.write(__oracle_jsp_text[15]);
      out.print( filetypes.contains("pdf") ? "checked" : "" );
      out.write(__oracle_jsp_text[16]);
      out.print( filetypes.contains("rtf") ? "checked" : "" );
      out.write(__oracle_jsp_text[17]);
      out.print( filetypes.contains("doc") ? "checked" : "" );
      out.write(__oracle_jsp_text[18]);
      out.print( filetypes.contains("ppt") ? "checked" : "" );
      out.write(__oracle_jsp_text[19]);
      out.print( filetypes.contains("xls") ? "checked" : "" );
      out.write(__oracle_jsp_text[20]);
      {
        String __url=OracleJspRuntime.toStr("footer.jsp");
        // Include 
        pageContext.include( __url,false);
        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
      }

      out.write(__oracle_jsp_text[21]);
          }
          } finally {
              if (jcrSession != null) {
                  jcrSession.logout();
              }
          }
      
      out.write(__oracle_jsp_text[22]);

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
  private static final char __oracle_jsp_text[][]=new char[23][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "Error while accessing the repository: <font color=\"red\">".toCharArray();
    __oracle_jsp_text[1] = 
    "</font><br>".toCharArray();
    __oracle_jsp_text[2] = 
    "Check the configuration or use the <a href=\"admin/\">easy setup</a> wizard.".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<html>\n<head>\n<title>Welcome to Apache Jackrabbit - Populate workspace: ".toCharArray();
    __oracle_jsp_text[4] = 
    "</title>\n<link rel=\"shortcut icon\" href=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "/images/favicon.ico\" type=\"image/vnd.microsoft.icon\">\n<style type=\"text/css\" media=\"all\">\n      @import url(\"".toCharArray();
    __oracle_jsp_text[6] = 
    "/css/default.css\");\n</style>\n<script><!--\nfunction draw() {\n\t// draw the bar\n        document.write('<table cellspacing=\"0\" cellpadding=\"0\" style=\"border-color:' + this.borderColor + '; border-width:' + this.borderWidth + '; border-style:' + this.borderStyle + '\">');\n        document.write('<tr><td>');\n        document.write('<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"\">');\n        document.write('<tr><td style=\"background-color:' + this.barColor +'\"><img src=\"".toCharArray();
    __oracle_jsp_text[7] = 
    "/images/0.gif\" id=\"' + this.id + 'barFG\" width=\"0\" height=\"' + this.height + '\"/></td>');\n        document.write('<td><img src=\"".toCharArray();
    __oracle_jsp_text[8] = 
    "/images/0.gif\" id=\"' + this.id + 'barBG\" width=\"' + this.width + '\" height=\"' + this.height + '\"/></td></tr>');\n        document.write('</table>');\n        document.write('</tr></td>');\n        document.write('</table>');\n        document.write('<table>');\n        document.write('<tr><td><img src=\"".toCharArray();
    __oracle_jsp_text[9] = 
    "/images/0.gif\" width=\"' + this.width + '\" height=\"0\"/></td></tr>');\n        document.write('<tr><td align=\"center\"><span id=\"' + this.id + 'barValue\">0%</span></td></tr>');\n        document.write('<tr><td align=\"center\"><span id=\"' + this.id + 'barInfo\">&nbsp;</span></td></tr>');\n        document.write('</table>');\n\n\tthis.barFG = document.getElementById(this.id + 'barFG');\n\tthis.barBG = document.getElementById(this.id + 'barBG');\n\tthis.barValue = document.getElementById(this.id + 'barValue').firstChild;\n\tthis.barInfo = document.getElementById(this.id + 'barInfo').firstChild;\n}\n\n// informs the progress bar about the current value\nfunction inform(value, info) {\n\tvar barWidth = Math.floor(this.width * value / this.maxValue);\n\tvar spaceWidth = this.width - barWidth;\n\tvar perCent = Math.floor(100 * value / this.maxValue);\n\tthis.barFG.width = barWidth;\n\tthis.barBG.width = spaceWidth;\n\tthis.barValue.nodeValue = perCent + '%';\n\tthis.barInfo.nodeValue = info;\n}\n\n// constructor\nfunction ProgressBar(maxValue, width, height) {\n\tthis.maxValue = maxValue;\n\tthis.width = width;\n\tthis.height = height;\n\tthis.id = '' + Math.round(Math.random() * 10000);\n\tthis.inform = inform;\n\tthis.draw = draw;\n}\n\n// default values\nProgressBar.prototype.barColor = \"green\";\nProgressBar.prototype.borderColor = \"grey\";\nProgressBar.prototype.borderStyle = \"groove\";\nProgressBar.prototype.borderWidth = \"2px\";\n\n// -->\n</script>\n</head>\n  <body>\n  <div style=\"background: white; border: 1px solid black; padding: 50px; width: 510px; margin: 50px auto;\">\n  <h2>Populate workspace: \"".toCharArray();
    __oracle_jsp_text[10] = 
    "\"</h2><br>\n    <p>Overall progress</p>\n    <script>var pb = new ProgressBar(".toCharArray();
    __oracle_jsp_text[11] = 
    ", 500, 30);pb.draw();</script>\n    \n    <p>Downloading document</p>\n    <script>var dp = new ProgressBar(1000, 500, 30);dp.draw();</script>\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "  </div>\n  </body>\n</html>\n".toCharArray();
    __oracle_jsp_text[13] = 
    "\n<p>\n  This page allows you to populate the workspace with documents downloaded\n  from the Internet.\n</p>\n    <form method=\"POST\">\n      <table>\n      <tr><td>Seed word (optional):</td><td><input name=\"seed\" type=\"text\" size=\"30\" value=\"".toCharArray();
    __oracle_jsp_text[14] = 
    "\"/></td></tr>\n      <tr><td>Number of documents:</td><td><input name=\"num\" type=\"text\" size=\"30\" value=\"".toCharArray();
    __oracle_jsp_text[15] = 
    "\"/></td></tr>\n      <tr valign=\"top\"><td>Document types:</td><td><input name=\"filetype\" type=\"checkbox\" value=\"pdf\" ".toCharArray();
    __oracle_jsp_text[16] = 
    "/> Adobe Acrobat PDF<br/><input name=\"filetype\" type=\"checkbox\" value=\"rtf\" ".toCharArray();
    __oracle_jsp_text[17] = 
    "/> Rich Text Format<br/><input name=\"filetype\" type=\"checkbox\" value=\"doc\" ".toCharArray();
    __oracle_jsp_text[18] = 
    "/> Microsoft Word<br/><input name=\"filetype\" type=\"checkbox\" value=\"ppt\" ".toCharArray();
    __oracle_jsp_text[19] = 
    "/> Microsoft PowerPoint<br/><input name=\"filetype\" type=\"checkbox\" value=\"xls\" ".toCharArray();
    __oracle_jsp_text[20] = 
    "/> Microsoft Excel<br/></td></tr>\n      <tr><td>&nbsp;</td><td><input type=\"submit\" value=\"Populate!\"/></td></tr>\n      </table>\n    </form>\n".toCharArray();
    __oracle_jsp_text[21] = 
    "\n".toCharArray();
    __oracle_jsp_text[22] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
