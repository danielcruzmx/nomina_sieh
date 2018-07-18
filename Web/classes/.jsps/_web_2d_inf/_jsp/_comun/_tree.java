package _web_2d_inf._jsp._comun;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _tree extends com.orionserver.http.OrionHttpJspPage {


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
    _tree page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code text");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setCode("themeBaseUrl");
        __jsp_taghandler_1.setText("../../resources");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[2]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setCode("xtree.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setCode("rightcontext.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_3.doCatch(th);
        } finally {
          __jsp_taghandler_3.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setCode("xtree.css");
        try {
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_4.doCatch(th);
        } finally {
          __jsp_taghandler_4.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setCode("rightcontext.css");
        try {
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_5.doCatch(th);
        } finally {
          __jsp_taghandler_5.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[6]);
      {
        _oracle._jsp._tag._browserCtrl_tag __jsp_taghandler_6=(_oracle._jsp._tag._browserCtrl_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._browserCtrl_tag.class, pageContext);
        __jsp_taghandler_6.setJspContext(pageContext);
        __jsp_taghandler_6.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
      }
      out.write(__oracle_jsp_text[7]);
      {
        _oracle._jsp._tag._tree_tag __jsp_taghandler_7=(_oracle._jsp._tag._tree_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._tree_tag.class, pageContext);
        __jsp_taghandler_7.setJspContext(pageContext);
        __jsp_taghandler_7.setName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['name']}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_7.setParentValues((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['parentValues']}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_7.setPattern((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['pattern']}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_7.setTitleArgs((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['titleArgs']}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_7.setWidth((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['width']}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_7.setHeight((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['height']}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_7.setFrameParams((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['frameParams']}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_7.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
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
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n<!-- Debe ir antes de cargar el xtree.js y el progess.js para obtener el contexto de la aplicacion web de recursos estaticos -->\r\n<script type=\"text/javascript\">\r\n  function getThemeBaseUrl() {\r\n     return ('".toCharArray();
    __oracle_jsp_text[2] = 
    "');\r\n  }\r\n</script>\r\n\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "\"></script>\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[4] = 
    "\"></script>\r\n\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "\"/>\r\n\r\n<!-- Tag que incluye las funciones js para manejo de GUI de navegador protegida, \r\n    se agrega explicitamente ya que este jsp se depliega como jstl: y no incluye la pagina javaScript.jsp -->\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
