package _web_2d_inf._jsp._comun;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _helpRoutine extends com.orionserver.http.OrionHttpJspPage {


  // Begin global declarations

  private static OracleFunctionMapperImpl [] __ojsp_fnmappers = OracleJspRuntime.__init_ojsp_fMappers(1);
  // End global declarations

  // begin functions
  static {
    __ojsp_fnmappers[0].mapFunction("admoncat","getHRHeaders",gob.shcp.catalog.helproutine.presentacion.util.GeneradorHelpRoutine.class,"getHRHeaders",new Class[] {gob.shcp.fsn.model.Model.class});
  }
  // end functions

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
    _helpRoutine page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("fieldMapping");
        __jsp_taghandler_1.setValue(request.getAttribute("fieldMapping"));
        __jsp_taghandler_1.setScope("page");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setVar("nombre");
        __jsp_taghandler_2.setValue(request.getAttribute("nombre"));
        __jsp_taghandler_2.setScope("page");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setVar("param");
        __jsp_taghandler_3.setValue(request.getAttribute("param"));
        __jsp_taghandler_3.setScope("page");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setVar("filtro");
        __jsp_taghandler_4.setValue(request.getAttribute("filtro"));
        __jsp_taghandler_4.setScope("page");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setVar("divId");
        __jsp_taghandler_5.setValue(request.getAttribute("divId"));
        __jsp_taghandler_5.setScope("page");
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setVar("frameId");
        __jsp_taghandler_6.setValue(request.getAttribute("frameId"));
        __jsp_taghandler_6.setScope("page");
        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[11]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setVar("requestURI");
        __jsp_taghandler_7.setValue("generaHelpRoutine.do");
        __jsp_taghandler_7.setScope("request");
        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[12]);
      out.print(request.getContextPath());
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setCode("function.js");
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
      out.write(__oracle_jsp_text[13]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setCode("functions.js");
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
      out.write(__oracle_jsp_text[14]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_10.setParent(null);
        __jsp_taghandler_10.setCode("common.css");
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
      out.write(__oracle_jsp_text[15]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setCode("screen.css");
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
      out.write(__oracle_jsp_text[16]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_12.setParent(null);
        __jsp_taghandler_12.setCode("ajaxtags.css");
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
      out.write(__oracle_jsp_text[17]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setCode("styledisplaytag.css");
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
      out.write(__oracle_jsp_text[18]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag");
        __jsp_taghandler_14.setParent(null);
        try {
          __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[19]);
              {
                org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_15=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
                __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                __jsp_taghandler_15.setAttribute("message");
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_16.setParent(__jsp_taghandler_14);
                __jsp_taghandler_16.setVar("pathImageFind");
                __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_16,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[21]);
                      {
                        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                        __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                        __jsp_taghandler_17.setCode("help.gif");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_17.doCatch(th);
                        } finally {
                          __jsp_taghandler_17.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,3);
                      }
                      out.write(__oracle_jsp_text[22]);
                    } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.displaytag.tags.TableTag __jsp_taghandler_18=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class id sort");
                __jsp_taghandler_18.setParent(__jsp_taghandler_14);
                __jsp_taghandler_18.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${displaySource}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_18.setPagesize(10);
                __jsp_taghandler_18.setDecorator("gob.shcp.catalog.helproutine.presentacion.decorator.HelpRoutineDecorator");
                __jsp_taghandler_18.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_18.setClass("displaytag");
                __jsp_taghandler_18.setUid("row");
                __jsp_taghandler_18.setSort("list");
                java.lang.Object row = null;
                java.lang.Integer row_rowNum = null;
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
                    do {
                      row = (java.lang.Object) pageContext.findAttribute("row");
                      row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
                      out.write(__oracle_jsp_text[24]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                        __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_19.setVar("columnNames");
                        __jsp_taghandler_19.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${admoncat:getHRHeaders(row)}",java.lang.Object.class, __ojsp_varRes, __ojsp_fnmappers[0]));
                        __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                        if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,3);
                      }
                      out.write(__oracle_jsp_text[25]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var varStatus");
                        __jsp_taghandler_20.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_20.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${columnNames}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_20.setVar("property");
                        __jsp_taghandler_20.setVarStatus("status");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              out.write(__oracle_jsp_text[26]);
                              {
                                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                                __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                __jsp_taghandler_21.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.index == 0}",java.lang.Boolean.class, __ojsp_varRes,null)));
                                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[27]);
                                    {
                                      org.displaytag.tags.ColumnTag __jsp_taghandler_22=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title sortable href");
                                      __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                                      __jsp_taghandler_22.setProperty((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${property}",java.lang.String.class, __ojsp_varRes,null));
                                      __jsp_taghandler_22.setTitle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${property}",java.lang.String.class, __ojsp_varRes,null));
                                      __jsp_taghandler_22.setSortable(true);
                                      __jsp_taghandler_22.setHref("javascript:\" onclick=\"selectItem(this)");
                                      __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                                      if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,5);
                                    }
                                    out.write(__oracle_jsp_text[28]);
                                  } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,4);
                              }
                              out.write(__oracle_jsp_text[29]);
                              {
                                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                                __jsp_taghandler_23.setParent(__jsp_taghandler_20);
                                __jsp_taghandler_23.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.index != 0}",java.lang.Boolean.class, __ojsp_varRes,null)));
                                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[30]);
                                    {
                                      org.displaytag.tags.ColumnTag __jsp_taghandler_24=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title sortable");
                                      __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                                      __jsp_taghandler_24.setProperty((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${property}",java.lang.String.class, __ojsp_varRes,null));
                                      __jsp_taghandler_24.setTitle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${property}",java.lang.String.class, __ojsp_varRes,null));
                                      __jsp_taghandler_24.setSortable(true);
                                      __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                                      if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,5);
                                    }
                                    out.write(__oracle_jsp_text[31]);
                                  } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,4);
                              }
                              out.write(__oracle_jsp_text[32]);
                            } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_20.doCatch(th);
                        } finally {
                          __jsp_taghandler_20.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,3);
                      }
                      out.write(__oracle_jsp_text[33]);
                      {
                        org.displaytag.tags.SetPropertyTag __jsp_taghandler_25=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                        __jsp_taghandler_25.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_25.setName("paging.banner.placement");
                        __jsp_taghandler_25.setValue("bottom");
                        __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                        if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,3);
                      }
                      out.write(__oracle_jsp_text[34]);
                      {
                        org.displaytag.tags.SetPropertyTag __jsp_taghandler_26=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                        __jsp_taghandler_26.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_26.setName("basic.msg.empty_list");
                        __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                        {
                          try {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_26,__jsp_tag_starteval,out);
                            do {
                              out.write(__oracle_jsp_text[35]);
                            } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          finally {
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                        }
                        if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                      }
                      out.write(__oracle_jsp_text[36]);
                    } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write(__oracle_jsp_text[37]);
            } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_14.doCatch(th);
        } finally {
          __jsp_taghandler_14.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
      }
      out.write(__oracle_jsp_text[38]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_27.setParent(null);
        __jsp_taghandler_27.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${fieldMapping}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
        if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,1);
      }
      out.write(__oracle_jsp_text[39]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_28.setParent(null);
        __jsp_taghandler_28.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${divId}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
        if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,1);
      }
      out.write(__oracle_jsp_text[40]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_29.setParent(null);
        __jsp_taghandler_29.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${frameId}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
        if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,1);
      }
      out.write(__oracle_jsp_text[41]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_30.setParent(null);
        __jsp_taghandler_30.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
        if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,1);
      }
      out.write(__oracle_jsp_text[42]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_31.setParent(null);
        __jsp_taghandler_31.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['nombre']}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
        if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,1);
      }
      out.write(__oracle_jsp_text[43]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_32.setParent(null);
        __jsp_taghandler_32.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['param']}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
        if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,1);
      }
      out.write(__oracle_jsp_text[44]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_33.setParent(null);
        __jsp_taghandler_33.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['filtro']}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
        if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,1);
      }
      out.write(__oracle_jsp_text[45]);

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
  private static final char __oracle_jsp_text[][]=new char[46][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n\r\n<!-- Paso de parametros para la clase HelpTableDecorator a traves del pageContext -->\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n\r\n<!-- COMUNES -->\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[13] = 
    "\"> </script>\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[14] = 
    "\"> </script>\r\n\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"".toCharArray();
    __oracle_jsp_text[15] = 
    "\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"".toCharArray();
    __oracle_jsp_text[16] = 
    "\"/>\r\n\r\n<!-- AJAX -->\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"".toCharArray();
    __oracle_jsp_text[17] = 
    "\"/>\r\n<link type=\"text/css\" rel=\"stylesheet\" href=\"".toCharArray();
    __oracle_jsp_text[18] = 
    "\"/>   \r\n\r\n".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n    <table align=\"center\">\r\n        <tr>\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table>\r\n                    <tr>\r\n                        <td>\r\n                            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                                <a href=\"javascript:executeFilter();\">\r\n                                    <img alt=\"help\" src=\"".toCharArray();
    __oracle_jsp_text[22] = 
    "\" height=\"20\" width=\"20\" style=\"vertical-align:middle;\"/>\r\n                                </a>\r\n                            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[27] = 
    "            \r\n                                            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[30] = 
    "            \r\n                                            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                                        <br><span class=\"pagebanner\"></span><span class=\"norecords\">No se encontraron elementos<br><br></span>\r\n                                        <span style=\"padding: 2px 4px 2px 4px;width: 90%;display: block;border-top: none;margin-bottom: 10px;margin-left: 30px;text-align: left;\">\r\n                                            <input type=\"button\" value=\"Aceptar\" name=\"btnAceptar\" class=\"uppercase\" onclick=\"javascript:executeFilter();\">\r\n                                        </span>\r\n                                    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n\r\n<script type=\"text/javascript\" >\r\n    var field = \"".toCharArray();
    __oracle_jsp_text[39] = 
    "\";\r\n    var fields = field.split(\",\");\r\n    var divId = \"".toCharArray();
    __oracle_jsp_text[40] = 
    "\";\r\n    var frameId = \"".toCharArray();
    __oracle_jsp_text[41] = 
    "\";\r\n    \r\n    function selectItem(link){\r\n        var choice = link.parentNode.parentNode.id;\r\n\tfor (x in fields) {\r\n            var parent = trim(fields[x]);\r\n            var formChoice = trim(fields[x]);\r\n            formChoice = formChoice.replace(\"[\",\"\").replace(\"]\",\"\");\r\n            parent = parent.substring(0,parent.indexOf(\"_\"));                        \r\n            if(window.parent.document.getElementsByName(parent)!=null){\r\n                window.parent.document.getElementsByName(parent)[0].value = document.getElementById(formChoice+choice).value;\r\n            }\r\n        }\r\n        window.parent.eval(\"closeDiv('\"+ divId +\"','\"+frameId+\"')\");\r\n    }      \r\n      \r\n    function closeHelp(){\r\n    }\r\n    \r\n    function executeFilter(){\r\n        document.forms[0].action = '".toCharArray();
    __oracle_jsp_text[42] = 
    "?nombre=".toCharArray();
    __oracle_jsp_text[43] = 
    "&param=".toCharArray();
    __oracle_jsp_text[44] = 
    "&filtro=".toCharArray();
    __oracle_jsp_text[45] = 
    "&divId='+divId+'&frameId='+frameId;\r\n        document.forms[0].submit();\r\n    }\r\n</script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
