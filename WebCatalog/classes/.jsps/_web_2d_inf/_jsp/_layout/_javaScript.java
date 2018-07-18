package _web_2d_inf._jsp._layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _javaScript extends com.orionserver.http.OrionHttpJspPage {


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
    _javaScript page = this;
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
        __jsp_taghandler_2.setCode("functions.js");
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
        __jsp_taghandler_3.setCode("dragndrop.js");
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
        __jsp_taghandler_4.setCode("doubleSelect.js");
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
      out.print(request.getContextPath());
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setCode("overlib_mini.js");
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
      out.print(request.getContextPath());
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setCode("function.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_6.doCatch(th);
        } finally {
          __jsp_taghandler_6.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[7]);
      out.print(request.getContextPath());
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setCode("gralFunctions.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_7.doCatch(th);
        } finally {
          __jsp_taghandler_7.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[8]);
      out.print(request.getContextPath());
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setCode("typeValidate.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
          if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_8.doCatch(th);
        } finally {
          __jsp_taghandler_8.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
      }
      out.write(__oracle_jsp_text[9]);
      out.print(request.getContextPath());
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setCode("helpRutine.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_9.doCatch(th);
        } finally {
          __jsp_taghandler_9.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
      }
      out.write(__oracle_jsp_text[10]);
      out.print(request.getContextPath());
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_10.setParent(null);
        __jsp_taghandler_10.setCode("tools.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_10.doCatch(th);
        } finally {
          __jsp_taghandler_10.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
      }
      out.write(__oracle_jsp_text[11]);
      out.print(request.getContextPath());
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setCode("commons.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_11.doCatch(th);
        } finally {
          __jsp_taghandler_11.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
      }
      out.write(__oracle_jsp_text[12]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_12.setParent(null);
        __jsp_taghandler_12.setCode("navmenu.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_12.doCatch(th);
        } finally {
          __jsp_taghandler_12.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
      }
      out.write(__oracle_jsp_text[13]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setCode("calendar.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
          if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_13.doCatch(th);
        } finally {
          __jsp_taghandler_13.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,1);
      }
      out.write(__oracle_jsp_text[14]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_14.setParent(null);
        __jsp_taghandler_14.setCode("callang.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
          if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_14.doCatch(th);
        } finally {
          __jsp_taghandler_14.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
      }
      out.write(__oracle_jsp_text[15]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_15.setParent(null);
        __jsp_taghandler_15.setCode("calsetup.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_15.doCatch(th);
        } finally {
          __jsp_taghandler_15.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,1);
      }
      out.write(__oracle_jsp_text[16]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_16.setParent(null);
        __jsp_taghandler_16.setCode("progress.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_16.doCatch(th);
        } finally {
          __jsp_taghandler_16.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,1);
      }
      out.write(__oracle_jsp_text[17]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_17.setParent(null);
        __jsp_taghandler_17.setCode("xtree.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_17.doCatch(th);
        } finally {
          __jsp_taghandler_17.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,1);
      }
      out.write(__oracle_jsp_text[18]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_18.setParent(null);
        __jsp_taghandler_18.setCode("rightcontext.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
          if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_18.doCatch(th);
        } finally {
          __jsp_taghandler_18.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,1);
      }
      out.write(__oracle_jsp_text[19]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_19.setParent(null);
        __jsp_taghandler_19.setCode("ajxproto.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_19.doCatch(th);
        } finally {
          __jsp_taghandler_19.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,1);
      }
      out.write(__oracle_jsp_text[20]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_20.setParent(null);
        __jsp_taghandler_20.setCode("ajxscript.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
          if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_20.doCatch(th);
        } finally {
          __jsp_taghandler_20.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,1);
      }
      out.write(__oracle_jsp_text[21]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_21.setParent(null);
        __jsp_taghandler_21.setCode("ajxeffects.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
          if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_21.doCatch(th);
        } finally {
          __jsp_taghandler_21.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,1);
      }
      out.write(__oracle_jsp_text[22]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_22.setParent(null);
        __jsp_taghandler_22.setCode("ajxovlib.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
          if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_22.doCatch(th);
        } finally {
          __jsp_taghandler_22.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,1);
      }
      out.write(__oracle_jsp_text[23]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_23.setParent(null);
        __jsp_taghandler_23.setCode("ajxovlibcf.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
          if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_23.doCatch(th);
        } finally {
          __jsp_taghandler_23.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,1);
      }
      out.write(__oracle_jsp_text[24]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_24.setParent(null);
        __jsp_taghandler_24.setCode("ajxovlibif.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
          if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_24.doCatch(th);
        } finally {
          __jsp_taghandler_24.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,1);
      }
      out.write(__oracle_jsp_text[25]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_25.setParent(null);
        __jsp_taghandler_25.setCode("ajxovlibhd.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
          if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_25.doCatch(th);
        } finally {
          __jsp_taghandler_25.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,1);
      }
      out.write(__oracle_jsp_text[26]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_26.setParent(null);
        __jsp_taghandler_26.setCode("ajxovlibsw.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
          if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_26.doCatch(th);
        } finally {
          __jsp_taghandler_26.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,1);
      }
      out.write(__oracle_jsp_text[27]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_27=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_27.setParent(null);
        __jsp_taghandler_27.setCode("ajaxtags.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
          if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_27.doCatch(th);
        } finally {
          __jsp_taghandler_27.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,1);
      }
      out.write(__oracle_jsp_text[28]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_28.setParent(null);
        __jsp_taghandler_28.setCode("ajaxtagsctl.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
          if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_28.doCatch(th);
        } finally {
          __jsp_taghandler_28.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,1);
      }
      out.write(__oracle_jsp_text[29]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_29.setParent(null);
        __jsp_taghandler_29.setCode("ajaxtagspsr.js");
        try {
          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
          if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_29.doCatch(th);
        } finally {
          __jsp_taghandler_29.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,1);
      }
      out.write(__oracle_jsp_text[30]);

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
  private static final char __oracle_jsp_text[][]=new char[31][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n<!-- Debe ir antes de cargar el xtree.js y el progess.js para obtener el contexto de la aplicacion web de recursos estaticos -->\r\n<script type=\"text/javascript\">\r\n  function getThemeBaseUrl() {\r\n     return ('".toCharArray();
    __oracle_jsp_text[2] = 
    "');\r\n  }\r\n</script>\r\n\r\n<!-- GENERAL -->\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[4] = 
    "\"> </script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "\"></script>\r\n\r\n<!-- CATALOG -->\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "\"> </script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[7] = 
    "\"> </script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[8] = 
    "\"> </script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[9] = 
    "\"> </script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[10] = 
    "\"> </script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[11] = 
    "\"> </script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[12] = 
    "\"> </script>\r\n\r\n<!-- MENU -->\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[13] = 
    "\"></script>\r\n\r\n<!-- CALENDAR -->\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[14] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[15] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[16] = 
    "\"></script>\r\n\r\n<!-- PROGRESS -->\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[17] = 
    "\"></script>\r\n\r\n<!-- XTREE -->\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[18] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[19] = 
    "\"></script>\r\n\r\n<!-- AJAX TAGS -->\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[20] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[21] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[22] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[23] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[24] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[25] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[26] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[27] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[28] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[29] = 
    "\"></script>\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[30] = 
    "\"></script>\r\n\r\n<!-- CUSTOM -->\r\n    <script type=\"text/javascript\">\r\n      function doSubmit(submitId) {\r\n        var anchor = document.getElementById(submitId);\r\n        if(anchor) {\r\n            var action = anchor.getAttribute(\"action\");\r\n            var path = anchor.getAttribute(\"path\");\r\n            var message = anchor.getAttribute(\"alertCode\");\r\n            return doSubmitInternal(action, path, message, submitId);\r\n        }\r\n        return doSubmitInternal();\r\n      }\r\n\r\n      function doSubmitInternal(action, path, message, submitId) {\r\n        if(path && '' != path) {\r\n          document.getElementsByName(path)[0].value = \"true\";\r\n        }\r\n        if(message && '' != message) {\r\n            if(confirm(message)) {\r\n                hideMessageDiv();\r\n                showLightbox(submitId);\r\n                for (var i=0; i<document.forms.length; i++ ){\r\n                  if(document.forms[i].contains(document.getElementById(submitId))){\r\n                     document.forms[i].action = action;\r\n                     break;\r\n                  }\r\n                }\r\n                return true;\r\n            } else {\r\n                return false;\r\n            }\r\n        }\r\n        hideMessageDiv();\r\n        showLightbox(submitId);\r\n        if(action && '' != action) {\r\n            for (var i=0; i<document.forms.length; i++ ){\r\n               if(document.forms[i].contains(document.getElementById(submitId))){\r\n                  document.forms[i].action = action;\r\n                  break;\r\n               }\r\n            }\r\n        }\r\n        return true;\r\n      }\r\n\r\n      //Deshabilita el boton que haya sido presionado\r\n      function disableButton() {\r\n            var objectSrc = window.event.srcElement;\r\n            if(objectSrc.type == 'submit' || objectSrc.type == 'reset') {\r\n                if(document.forms[0] != null) {\r\n                    var onSubmitFunction = document.forms[0].onsubmit;\r\n                    document.forms[0].onsubmit = function() {\r\n                        for(var i=0; i<document.forms[0].elements.length; i++) {\r\n                              var object = document.forms[0].elements[i];\r\n                              if(object.type == 'submit' || object.type == 'reset') {\r\n//                                if( objectSrc.name == object.name && objectSrc.name == '<!--%=Constants.CANCEL_PROPERTY%-->' ){\r\n//                                    var newHidden = document.createElement(\"input\");\r\n//                                    newHidden.type = \"hidden\";\r\n//                                    newHidden.name=\"<!--%=Constants.CANCEL_PROPERTY%-->\";\r\n//                                    newHidden.value=objectSrc.value;\r\n//                                    document.forms[0].appendChild( newHidden );\r\n//                                }\r\n                                  object.disabled = true;\r\n                              }\r\n                        }\r\n                        if(onSubmitFunction) {\r\n                          onSubmitFunction();\r\n                        }\r\n                        //return true;\r\n                    }\r\n                }\r\n            }\r\n      }\r\n\r\n      //Abre una ventana que ocupa toda la pantalla, sin menus ni barra de estado\r\n      function popup(url) {\r\n         params  = 'width='+screen.width;\r\n         params += ', height='+screen.height;\r\n         params += ', top=0, left=0'\r\n         params += ', status=no, menubar=no'\r\n         params += ', directories=no, location=no'\r\n         params += ', fullscreen=yes, scrollbars=yes';\r\n         \r\n         newwin=window.open(url,'Main', params);\r\n         if (window.focus) {\r\n            newwin.focus()\r\n         }\r\n         return false;\r\n      }      \r\n\r\n      function delegateOpener(url) {\r\n         if(window.opener != undefined && !window.opener.closed) {\r\n            window.opener.document.location = url;\r\n            window.opener.focus();\r\n            window.close();\r\n         } else {\r\n            document.location = url;\r\n         }\r\n      }\r\n    </script>\r\n\r\n<!-- FireBug Lite -->\r\n  <!--  <script type='text/javascript' src='http://getfirebug.com/releases/lite/1.2/firebug-lite-compressed.js'></script> -->\r\n\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
