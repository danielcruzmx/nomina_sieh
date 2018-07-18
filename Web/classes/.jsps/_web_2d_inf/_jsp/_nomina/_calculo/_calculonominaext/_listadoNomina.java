package _web_2d_inf._jsp._nomina._calculo._calculonominaext;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _listadoNomina extends com.orionserver.http.OrionHttpJspPage {


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
    _listadoNomina page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setCode("selectList.nonValue");
        __jsp_taghandler_1.setVar("nonValue");
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
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag id modelAttribute");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setId("formQna");
        __jsp_taghandler_2.setModelAttribute("pagoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setPath("idGrupoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_3.doCatch(th);
                } finally {
                  __jsp_taghandler_3.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_taghandler_4.setPath("descGrupoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                  if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_4.doCatch(th);
                } finally {
                  __jsp_taghandler_4.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                __jsp_taghandler_5.setPath("idQna");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                  if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_5.doCatch(th);
                } finally {
                  __jsp_taghandler_5.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                __jsp_taghandler_6.setPath("status");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                  if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_6.doCatch(th);
                } finally {
                  __jsp_taghandler_6.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                __jsp_taghandler_7.setPath("viewName");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                  if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_7.doCatch(th);
                } finally {
                  __jsp_taghandler_7.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_8.setParent(__jsp_taghandler_2);
                __jsp_taghandler_8.setPath("idTipoNomina");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_8.doCatch(th);
                } finally {
                  __jsp_taghandler_8.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                __jsp_taghandler_9.setPath("agVigente");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                  if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_9.doCatch(th);
                } finally {
                  __jsp_taghandler_9.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_10.setParent(__jsp_taghandler_2);
                __jsp_taghandler_10.setPath("tipoExtraordinaria");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_10.doCatch(th);
                } finally {
                  __jsp_taghandler_10.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_11.setParent(__jsp_taghandler_2);
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[15]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_12.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'LA'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[16]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_13.setVar("args");
                            __jsp_taghandler_13.setValue("Laudos");
                            __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                            if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,4);
                          }
                          out.write(__oracle_jsp_text[17]);
                        } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                    }
                    out.write(__oracle_jsp_text[18]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_14.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_14.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'OB'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[19]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                            __jsp_taghandler_15.setVar("args");
                            __jsp_taghandler_15.setValue("Personal de bajas");
                            __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                            if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
                          }
                          out.write(__oracle_jsp_text[20]);
                        } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                    }
                    out.write(__oracle_jsp_text[21]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_16.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_16.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'IN'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[22]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                            __jsp_taghandler_17.setVar("args");
                            __jsp_taghandler_17.setValue("Incentivo mensual");
                            __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                            if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,4);
                          }
                          out.write(__oracle_jsp_text[23]);
                        } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,3);
                    }
                    out.write(__oracle_jsp_text[24]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_18.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_18.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'VE'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[25]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                            __jsp_taghandler_19.setVar("args");
                            __jsp_taghandler_19.setValue("Vivienda");
                            __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                            if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,4);
                          }
                          out.write(__oracle_jsp_text[26]);
                        } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,3);
                    }
                    out.write(__oracle_jsp_text[27]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_20.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_20.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'CJ'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[28]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                            __jsp_taghandler_21.setVar("args");
                            __jsp_taghandler_21.setValue("Diferencias");
                            __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                            if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,4);
                          }
                          out.write(__oracle_jsp_text[29]);
                        } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,3);
                    }
                    out.write(__oracle_jsp_text[30]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_22.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_22.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'DJ'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[31]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_23.setVar("args");
                            __jsp_taghandler_23.setValue("Devoluciones");
                            __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                            if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,4);
                          }
                          out.write(__oracle_jsp_text[32]);
                        } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,3);
                    }
                    out.write(__oracle_jsp_text[33]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_24.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_24.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'AC'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[34]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                            __jsp_taghandler_25.setVar("args");
                            __jsp_taghandler_25.setValue("Aguinaldo de consejerias");
                            __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                            if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,4);
                          }
                          out.write(__oracle_jsp_text[35]);
                        } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,3);
                    }
                    out.write(__oracle_jsp_text[36]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_26.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_26.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'VA'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[37]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_27.setVar("args");
                            __jsp_taghandler_27.setValue("Vales de despensa");
                            __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                            if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,4);
                          }
                          out.write(__oracle_jsp_text[38]);
                        } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_28.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_28.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'OD'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[40]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_29.setVar("args");
                            __jsp_taghandler_29.setValue("Ordinaria diferencias");
                            __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                            if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,4);
                          }
                          out.write(__oracle_jsp_text[41]);
                        } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,3);
                    }
                    out.write(__oracle_jsp_text[42]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_30.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_30.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'DB'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[43]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                            __jsp_taghandler_31.setVar("args");
                            __jsp_taghandler_31.setValue("Diferencias baja");
                            __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                            if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,4);
                          }
                          out.write(__oracle_jsp_text[44]);
                        } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,3);
                    }
                    out.write(__oracle_jsp_text[45]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_32.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_32.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'EX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[46]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                            __jsp_taghandler_33.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.tipoExtraordinaria eq 'S'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[47]);
                                {
                                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                                  __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                                  __jsp_taghandler_34.setVar("args");
                                  __jsp_taghandler_34.setValue("Sueldos");
                                  __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                                  if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,5);
                                }
                                out.write(__oracle_jsp_text[48]);
                              } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,4);
                          }
                          out.write(__oracle_jsp_text[49]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_35.setParent(__jsp_taghandler_32);
                            __jsp_taghandler_35.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.tipoExtraordinaria eq 'P'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[50]);
                                {
                                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                                  __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                                  __jsp_taghandler_36.setVar("args");
                                  __jsp_taghandler_36.setValue("Perseverancia y Lealtad");
                                  __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                                  if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,5);
                                }
                                out.write(__oracle_jsp_text[51]);
                              } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,4);
                          }
                          out.write(__oracle_jsp_text[52]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_37.setParent(__jsp_taghandler_32);
                            __jsp_taghandler_37.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.tipoExtraordinaria eq 'R'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[53]);
                                {
                                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                                  __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                                  __jsp_taghandler_38.setVar("args");
                                  __jsp_taghandler_38.setValue("Con Reglas");
                                  __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                  if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,5);
                                }
                                out.write(__oracle_jsp_text[54]);
                              } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,4);
                          }
                          out.write(__oracle_jsp_text[55]);
                        } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,3);
                    }
                    out.write(__oracle_jsp_text[56]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_39.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_39.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'AG'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[57]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                            __jsp_taghandler_40.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.agVigente eq 'V'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[58]);
                                {
                                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                                  __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                                  __jsp_taghandler_41.setVar("args");
                                  __jsp_taghandler_41.setValue("Aguinaldo - Vigentes");
                                  __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                                  if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,5);
                                }
                                out.write(__oracle_jsp_text[59]);
                              } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,4);
                          }
                          out.write(__oracle_jsp_text[60]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_42.setParent(__jsp_taghandler_39);
                            __jsp_taghandler_42.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.agVigente eq 'N'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[61]);
                                {
                                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                                  __jsp_taghandler_43.setParent(__jsp_taghandler_42);
                                  __jsp_taghandler_43.setVar("args");
                                  __jsp_taghandler_43.setValue("Aguinaldo - Bajas");
                                  __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                                  if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,5);
                                }
                                out.write(__oracle_jsp_text[62]);
                              } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,4);
                          }
                          out.write(__oracle_jsp_text[63]);
                        } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,3);
                    }
                    out.write(__oracle_jsp_text[64]);
                  } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[65]);
              out.write(__oracle_jsp_text[66]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_44.setParent(__jsp_taghandler_2);
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[67]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                      __jsp_taghandler_45.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'SA'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[68]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                            __jsp_taghandler_46.setCode("sireh.label.nomina.tercero.aportacion.calculo.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                              if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_46.doCatch(th);
                            } finally {
                              __jsp_taghandler_46.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,4);
                          }
                          out.write(__oracle_jsp_text[69]);
                        } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,3);
                    }
                    out.write(__oracle_jsp_text[70]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_47=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_47.setParent(__jsp_taghandler_44);
                      __jsp_taghandler_47.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'FO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[71]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_48.setParent(__jsp_taghandler_47);
                            __jsp_taghandler_48.setCode("sireh.label.nomina.fonac.liquidacionFonac.finDeCiclo.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                              if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_48.doCatch(th);
                            } finally {
                              __jsp_taghandler_48.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,4);
                          }
                          out.write(__oracle_jsp_text[72]);
                        } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,3);
                    }
                    out.write(__oracle_jsp_text[73]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_49.setParent(__jsp_taghandler_44);
                      __jsp_taghandler_49.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'FE'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[74]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                            __jsp_taghandler_50.setCode("sireh.label.nomina.fonac.liquidacionFonac.liquidacionAnticipada.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                              if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_50.doCatch(th);
                            } finally {
                              __jsp_taghandler_50.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,4);
                          }
                          out.write(__oracle_jsp_text[75]);
                        } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,3);
                    }
                    out.write(__oracle_jsp_text[76]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_51=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_51.setParent(__jsp_taghandler_44);
                      __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[77]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments");
                            __jsp_taghandler_52.setParent(__jsp_taghandler_51);
                            __jsp_taghandler_52.setCode("sireh.label.nomina.calculo.extraordinaria.titulo");
                            __jsp_taghandler_52.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${args}",java.lang.Object.class, __ojsp_varRes,null));
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                              if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_52.doCatch(th);
                            } finally {
                              __jsp_taghandler_52.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,4);
                          }
                          out.write(__oracle_jsp_text[78]);
                        } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,3);
                    }
                    out.write(__oracle_jsp_text[79]);
                  } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,2);
              }
              out.write(__oracle_jsp_text[80]);
              out.write(__oracle_jsp_text[81]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_53=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_53.setParent(__jsp_taghandler_2);
                __jsp_taghandler_53.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'AG'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[82]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_54=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_54.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_54.setCode("sireh.label.nomina.gestion.label.aguinaldo.dias");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                        if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_54.doCatch(th);
                      } finally {
                        __jsp_taghandler_54.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,3);
                    }
                    out.write(__oracle_jsp_text[83]);
                    {
                      org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_55=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path cssClass cssStyle");
                      __jsp_taghandler_55.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_55.setPath("nomDiasPagar");
                      __jsp_taghandler_55.setCssClass("uppercase");
                      __jsp_taghandler_55.setCssStyle("width: 200px;");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write(__oracle_jsp_text[84]);
                            {
                              org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                              __jsp_taghandler_56.setParent(__jsp_taghandler_55);
                              __jsp_taghandler_56.setValue("");
                              __jsp_taghandler_56.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${nonValue}",java.lang.String.class, __ojsp_varRes,null));
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                              } catch (Throwable th) {
                                __jsp_taghandler_56.doCatch(th);
                              } finally {
                                __jsp_taghandler_56.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,4);
                            }
                            out.write(__oracle_jsp_text[85]);
                            {
                              org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_57=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                              __jsp_taghandler_57.setParent(__jsp_taghandler_55);
                              __jsp_taghandler_57.setValue("20");
                              __jsp_taghandler_57.setLabel("20 - 1ra parte");
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                              } catch (Throwable th) {
                                __jsp_taghandler_57.doCatch(th);
                              } finally {
                                __jsp_taghandler_57.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,4);
                            }
                            out.write(__oracle_jsp_text[86]);
                            {
                              org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                              __jsp_taghandler_58.setParent(__jsp_taghandler_55);
                              __jsp_taghandler_58.setValue("40");
                              __jsp_taghandler_58.setLabel("40 - 2da parte");
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                              } catch (Throwable th) {
                                __jsp_taghandler_58.doCatch(th);
                              } finally {
                                __jsp_taghandler_58.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,4);
                            }
                            out.write(__oracle_jsp_text[87]);
                          } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_55.doCatch(th);
                      } finally {
                        __jsp_taghandler_55.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,3);
                    }
                    out.write(__oracle_jsp_text[88]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_59=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_59.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_59.setCode("sireh.label.nomina.gestion.label.aguinaldo.exentos");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                        if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_59.doCatch(th);
                      } finally {
                        __jsp_taghandler_59.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,3);
                    }
                    out.write(__oracle_jsp_text[89]);
                    {
                      org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_60=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                      __jsp_taghandler_60.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_60.setPath("nomAplicarExentos");
                      __jsp_taghandler_60.setValue("S");
                      __jsp_taghandler_60.setLabel(" SI");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                        if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_60.doCatch(th);
                      } finally {
                        __jsp_taghandler_60.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,3);
                    }
                    out.write(__oracle_jsp_text[90]);
                    {
                      org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_61=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                      __jsp_taghandler_61.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_61.setPath("nomAplicarExentos");
                      __jsp_taghandler_61.setValue("N");
                      __jsp_taghandler_61.setLabel(" NO");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                        if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_61.doCatch(th);
                      } finally {
                        __jsp_taghandler_61.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,3);
                    }
                    out.write(__oracle_jsp_text[91]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_62.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_62.setCode("sireh.label.nomina.gestion.label.aguinaldo.gratificacion");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                        if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_62.doCatch(th);
                      } finally {
                        __jsp_taghandler_62.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,3);
                    }
                    out.write(__oracle_jsp_text[92]);
                    {
                      org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_63=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path cssClass cssStyle");
                      __jsp_taghandler_63.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_63.setPath("nomGratifAgui");
                      __jsp_taghandler_63.setCssClass("uppercase");
                      __jsp_taghandler_63.setCssStyle("width: 200px;");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write(__oracle_jsp_text[93]);
                            {
                              org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_64=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                              __jsp_taghandler_64.setParent(__jsp_taghandler_63);
                              __jsp_taghandler_64.setValue("");
                              __jsp_taghandler_64.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${nonValue}",java.lang.String.class, __ojsp_varRes,null));
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                              } catch (Throwable th) {
                                __jsp_taghandler_64.doCatch(th);
                              } finally {
                                __jsp_taghandler_64.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,4);
                            }
                            out.write(__oracle_jsp_text[94]);
                            {
                              org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_65=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                              __jsp_taghandler_65.setParent(__jsp_taghandler_63);
                              __jsp_taghandler_65.setValue("A");
                              __jsp_taghandler_65.setLabel("Nomina de aguinaldo");
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                              } catch (Throwable th) {
                                __jsp_taghandler_65.doCatch(th);
                              } finally {
                                __jsp_taghandler_65.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,4);
                            }
                            out.write(__oracle_jsp_text[95]);
                            {
                              org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_66=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                              __jsp_taghandler_66.setParent(__jsp_taghandler_63);
                              __jsp_taghandler_66.setValue("G");
                              __jsp_taghandler_66.setLabel("Nomina de gratificacion");
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                              } catch (Throwable th) {
                                __jsp_taghandler_66.doCatch(th);
                              } finally {
                                __jsp_taghandler_66.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,4);
                            }
                            out.write(__oracle_jsp_text[96]);
                            {
                              org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_67=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                              __jsp_taghandler_67.setParent(__jsp_taghandler_63);
                              __jsp_taghandler_67.setValue("B");
                              __jsp_taghandler_67.setLabel("Ambos");
                              java.lang.Object value = null;
                              java.lang.String displayValue = null;
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                              } catch (Throwable th) {
                                __jsp_taghandler_67.doCatch(th);
                              } finally {
                                __jsp_taghandler_67.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,4);
                            }
                            out.write(__oracle_jsp_text[97]);
                          } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_63.doCatch(th);
                      } finally {
                        __jsp_taghandler_63.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,3);
                    }
                    out.write(__oracle_jsp_text[98]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_68=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_68.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_68.setCode("sireh.label.nomina.gestion.label.aguinaldo.periodo");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                        if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_68.doCatch(th);
                      } finally {
                        __jsp_taghandler_68.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,3);
                    }
                    out.write(__oracle_jsp_text[99]);
                    {
                      org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_69=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                      __jsp_taghandler_69.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_69.setPath("nomCompletarPeriodo");
                      __jsp_taghandler_69.setValue("S");
                      __jsp_taghandler_69.setLabel(" SI");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                        if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_69.doCatch(th);
                      } finally {
                        __jsp_taghandler_69.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,3);
                    }
                    out.write(__oracle_jsp_text[100]);
                    {
                      org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_70=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                      __jsp_taghandler_70.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_70.setPath("nomCompletarPeriodo");
                      __jsp_taghandler_70.setValue("N");
                      __jsp_taghandler_70.setLabel(" NO");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                        if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_70.doCatch(th);
                      } finally {
                        __jsp_taghandler_70.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,3);
                    }
                    out.write(__oracle_jsp_text[101]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_71=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_71.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_71.setCode("sireh.label.nomina.gestion.label.status");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                        if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_71.doCatch(th);
                      } finally {
                        __jsp_taghandler_71.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,3);
                    }
                    out.write(__oracle_jsp_text[102]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_72=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_72.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_72.setJspContext(pageContext);
                      __jsp_taghandler_72.setKey("");
                      __jsp_taghandler_72.setValue("selectList.nonValue");
                      __jsp_taghandler_72.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_72, pageContext);
                    }
                    out.write(__oracle_jsp_text[103]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_73=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_73.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_73.setJspContext(pageContext);
                      __jsp_taghandler_73.setBeanName("listaEstadosNominaAg");
                      __jsp_taghandler_73.setPath("idEdoNom");
                      __jsp_taghandler_73.setStyle("width: 200px;");
                      __jsp_taghandler_73.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_73, pageContext);
                    }
                    out.write(__oracle_jsp_text[104]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_74=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_74.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_74.setJspContext(pageContext);
                      __jsp_taghandler_74.setAction("calculoNominaExt/consultaNominasAguinaldo.do");
                      __jsp_taghandler_74.setValue("submit.search");
                      __jsp_taghandler_74.setProgressBar("true");
                      __jsp_taghandler_74.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_74, pageContext);
                    }
                    out.write(__oracle_jsp_text[105]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_75=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_75.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_75.setJspContext(pageContext);
                      __jsp_taghandler_75.setPath("cancel");
                      __jsp_taghandler_75.setAction("calculoNominaExt/consultaNominasAguinaldo.do");
                      __jsp_taghandler_75.setValue("submit.clean");
                      __jsp_taghandler_75.setProgressBar("true");
                      __jsp_taghandler_75.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_75, pageContext);
                    }
                    out.write(__oracle_jsp_text[106]);
                  } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,2);
              }
              out.write(__oracle_jsp_text[107]);
              out.write(__oracle_jsp_text[108]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_76=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_76.setParent(__jsp_taghandler_2);
                __jsp_taghandler_76.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'AG'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[109]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_77=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_77.setParent(__jsp_taghandler_76);
                      __jsp_taghandler_77.setJspContext(pageContext);
                      __jsp_taghandler_77.setProperty("TN_NOMINA.NOM_DIAS_PAGAR");
                      __jsp_taghandler_77.setCondition("=");
                      __jsp_taghandler_77.setPath("nomDiasPagar");
                      __jsp_taghandler_77.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_77, pageContext);
                    }
                    out.write(__oracle_jsp_text[110]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_78=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_78.setParent(__jsp_taghandler_76);
                      __jsp_taghandler_78.setJspContext(pageContext);
                      __jsp_taghandler_78.setProperty("TN_NOMINA.NOM_APLICAR_EXENTOS");
                      __jsp_taghandler_78.setCondition("=");
                      __jsp_taghandler_78.setPath("nomAplicarExentos");
                      __jsp_taghandler_78.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_78, pageContext);
                    }
                    out.write(__oracle_jsp_text[111]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_79=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_79.setParent(__jsp_taghandler_76);
                      __jsp_taghandler_79.setJspContext(pageContext);
                      __jsp_taghandler_79.setProperty("TN_NOMINA.NOM_GRATIF_AGUI");
                      __jsp_taghandler_79.setCondition("=");
                      __jsp_taghandler_79.setPath("nomGratifAgui");
                      __jsp_taghandler_79.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_79, pageContext);
                    }
                    out.write(__oracle_jsp_text[112]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_80=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_80.setParent(__jsp_taghandler_76);
                      __jsp_taghandler_80.setJspContext(pageContext);
                      __jsp_taghandler_80.setProperty("TN_NOMINA.NOM_COMPLETAR_PERIODO");
                      __jsp_taghandler_80.setCondition("=");
                      __jsp_taghandler_80.setPath("nomCompletarPeriodo");
                      __jsp_taghandler_80.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_80, pageContext);
                    }
                    out.write(__oracle_jsp_text[113]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_81=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_81.setParent(__jsp_taghandler_76);
                      __jsp_taghandler_81.setJspContext(pageContext);
                      __jsp_taghandler_81.setProperty("TN_NOMINA.ID_EDO_NOM");
                      __jsp_taghandler_81.setCondition("=");
                      __jsp_taghandler_81.setPath("idEdoNom");
                      __jsp_taghandler_81.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_81, pageContext);
                    }
                    out.write(__oracle_jsp_text[114]);
                  } while (__jsp_taghandler_76.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,2);
              }
              out.write(__oracle_jsp_text[115]);
              out.write(__oracle_jsp_text[116]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_82=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_82.setParent(__jsp_taghandler_2);
                __jsp_taghandler_82.setJspContext(pageContext);
                __jsp_taghandler_82.setProperty("TN_NOMINA.ID_TIPO_NOMINA");
                __jsp_taghandler_82.setCondition("IN");
                __jsp_taghandler_82.setPath("listIdTipoNomina");
                __jsp_taghandler_82.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_82, pageContext);
              }
              out.write(__oracle_jsp_text[117]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_83=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_83.setParent(__jsp_taghandler_2);
                __jsp_taghandler_83.setJspContext(pageContext);
                __jsp_taghandler_83.setProperty("TN_NOMINA.NOM_QNA_CAPTURA");
                __jsp_taghandler_83.setCondition(">=");
                __jsp_taghandler_83.setPath("quincenaProceso");
                __jsp_taghandler_83.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_83, pageContext);
              }
              out.write(__oracle_jsp_text[118]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_84=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_84.setParent(__jsp_taghandler_2);
                __jsp_taghandler_84.setJspContext(pageContext);
                __jsp_taghandler_84.setProperty("TN_NOMINA.ID_GRUPO_PAGO_NOM");
                __jsp_taghandler_84.setCondition("=");
                __jsp_taghandler_84.setPath("idGrupoPago");
                __jsp_taghandler_84.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_84, pageContext);
              }
              out.write(__oracle_jsp_text[119]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_85=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_85.setParent(__jsp_taghandler_2);
                __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[120]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_86=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_86.setParent(__jsp_taghandler_85);
                      __jsp_taghandler_86.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'SA'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[121]);
                          out.write(__oracle_jsp_text[122]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_87=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_87.setParent(__jsp_taghandler_86);
                            __jsp_taghandler_87.setJspContext(pageContext);
                            __jsp_taghandler_87.setProperty("TN_NOMINA.NOM_QNA_CAPTURA");
                            __jsp_taghandler_87.setCondition(">=");
                            __jsp_taghandler_87.setPath("quincenaAnterior");
                            __jsp_taghandler_87.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_87, pageContext);
                          }
                          out.write(__oracle_jsp_text[123]);
                        } while (__jsp_taghandler_86.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,3);
                    }
                    out.write(__oracle_jsp_text[124]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_88=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_88.setParent(__jsp_taghandler_85);
                      __jsp_tag_starteval=__jsp_taghandler_88.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[125]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_89=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_89.setParent(__jsp_taghandler_88);
                            __jsp_taghandler_89.setJspContext(pageContext);
                            __jsp_taghandler_89.setProperty("TN_NOMINA.NOM_QNA_CAPTURA");
                            __jsp_taghandler_89.setCondition(">=");
                            __jsp_taghandler_89.setPath("quincenaAnterior");
                            __jsp_taghandler_89.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_89, pageContext);
                          }
                          out.write(__oracle_jsp_text[126]);
                        } while (__jsp_taghandler_88.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_88.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_88,3);
                    }
                    out.write(__oracle_jsp_text[127]);
                  } while (__jsp_taghandler_85.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85,2);
              }
              out.write(__oracle_jsp_text[128]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_90=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_90.setParent(__jsp_taghandler_2);
                __jsp_taghandler_90.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'AG'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_90.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[129]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_91=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_91.setParent(__jsp_taghandler_90);
                      __jsp_taghandler_91.setJspContext(pageContext);
                      __jsp_taghandler_91.setProperty("TN_NOMINA.NOM_VIGENTE");
                      __jsp_taghandler_91.setCondition("=");
                      __jsp_taghandler_91.setPath("agVigente");
                      __jsp_taghandler_91.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_91, pageContext);
                    }
                    out.write(__oracle_jsp_text[130]);
                  } while (__jsp_taghandler_90.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_90.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_90,2);
              }
              out.write(__oracle_jsp_text[131]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_92=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_92.setParent(__jsp_taghandler_2);
                __jsp_taghandler_92.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'EX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[132]);
                    {
                      org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_93=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                      __jsp_taghandler_93.setParent(__jsp_taghandler_92);
                      __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[133]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_94=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                            __jsp_taghandler_94.setParent(__jsp_taghandler_93);
                            __jsp_taghandler_94.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.tipoExtraordinaria eq 'P'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_94.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[134]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_95=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_95.setParent(__jsp_taghandler_94);
                                  __jsp_taghandler_95.setJspContext(pageContext);
                                  __jsp_taghandler_95.setProperty("TN_NOMINA.DESC_NOMINA");
                                  __jsp_taghandler_95.setCondition("=");
                                  __jsp_taghandler_95.setPath("descPerseverancia");
                                  __jsp_taghandler_95.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_95, pageContext);
                                }
                                out.write(__oracle_jsp_text[135]);
                              } while (__jsp_taghandler_94.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_94.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_94,4);
                          }
                          out.write(__oracle_jsp_text[136]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_96=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                            __jsp_taghandler_96.setParent(__jsp_taghandler_93);
                            __jsp_taghandler_96.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.tipoExtraordinaria eq 'R'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_96.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[137]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_97=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_97.setParent(__jsp_taghandler_96);
                                  __jsp_taghandler_97.setJspContext(pageContext);
                                  __jsp_taghandler_97.setProperty("TN_NOMINA.NOM_REGLA_CALCULO");
                                  __jsp_taghandler_97.setCondition("starts");
                                  __jsp_taghandler_97.setValue("PKG");
                                  __jsp_taghandler_97.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_97, pageContext);
                                }
                                out.write(__oracle_jsp_text[138]);
                              } while (__jsp_taghandler_96.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_96.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_96,4);
                          }
                          out.write(__oracle_jsp_text[139]);
                          {
                            org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_98=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                            __jsp_taghandler_98.setParent(__jsp_taghandler_93);
                            __jsp_tag_starteval=__jsp_taghandler_98.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[140]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_99=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_99.setParent(__jsp_taghandler_98);
                                  __jsp_taghandler_99.setJspContext(pageContext);
                                  __jsp_taghandler_99.setProperty("TN_NOMINA.DESC_NOMINA");
                                  __jsp_taghandler_99.setCondition("<>");
                                  __jsp_taghandler_99.setPath("descPerseverancia");
                                  __jsp_taghandler_99.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_99, pageContext);
                                }
                                out.write(__oracle_jsp_text[141]);
                              } while (__jsp_taghandler_98.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_98.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_98,4);
                          }
                          out.write(__oracle_jsp_text[142]);
                        } while (__jsp_taghandler_93.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93,3);
                    }
                    out.write(__oracle_jsp_text[143]);
                  } while (__jsp_taghandler_92.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92,2);
              }
              out.write(__oracle_jsp_text[144]);
              out.write(__oracle_jsp_text[145]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_100=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_100.setParent(__jsp_taghandler_2);
                __jsp_taghandler_100.setJspContext(pageContext);
                __jsp_taghandler_100.setBeanName("listaNominasPorTipoNomina");
                __jsp_taghandler_100.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.viewName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_100.setAppendFilters("false");
                __jsp_taghandler_100.setMaxRows("200");
                __jsp_taghandler_100.setJspBody(new _listadoNomina_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_100, __ojsp_varRes));
                __jsp_taghandler_100.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_100, pageContext);
              }
              out.write(__oracle_jsp_text[146]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_150=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_150.setParent(__jsp_taghandler_2);
                __jsp_taghandler_150.setJspContext(pageContext);
                __jsp_taghandler_150.setAction((java.lang.String) ("calculoNominaExt/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.viewName}",java.lang.String.class, __ojsp_varRes, null)+".do"));
                __jsp_taghandler_150.setValue("submit.update");
                __jsp_taghandler_150.setProgressBar("true");
                __jsp_taghandler_150.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_150, pageContext);
              }
              out.write(__oracle_jsp_text[147]);
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
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

  private class _listadoNomina_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _listadoNomina_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_100       = parent;
      out.write("\r\n        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_101=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort defaultsort defaultorder");
        __jsp_taghandler_101.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_100));
        __jsp_taghandler_101.setName("listaNominasPorTipoNomina");
        __jsp_taghandler_101.setPagesize(10);
        __jsp_taghandler_101.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_101.setClass("displaytag");
        __jsp_taghandler_101.setExport(false);
        __jsp_taghandler_101.setUid("qna");
        __jsp_taghandler_101.setSort("list");
        __jsp_taghandler_101.setDefaultsort(2);
        __jsp_taghandler_101.setDefaultorder("descending");
        java.lang.Object qna = null;
        java.lang.Integer qna_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_101.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_101,__jsp_tag_starteval,out);
            do {
              qna = (java.lang.Object) pageContext.findAttribute("qna");
              qna_rowNum = (java.lang.Integer) pageContext.findAttribute("qna_rowNum");
              out.write("\r\n            ");
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_102=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_102.setParent(__jsp_taghandler_101);
                __jsp_tag_starteval=__jsp_taghandler_102.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_103=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_103.setParent(__jsp_taghandler_102);
                      __jsp_taghandler_103.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina eq 'AG' or pagoDTO.idTipoNomina eq 'IN' or pagoDTO.idTipoNomina eq 'FO' or pagoDTO.idTipoNomina eq 'FE' or pagoDTO.tipoExtraordinaria eq 'R'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_103.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_104=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                            __jsp_taghandler_104.setParent(__jsp_taghandler_103);
                            __jsp_taghandler_104.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.calcular");
                            __jsp_taghandler_104.setSortable(true);
                            __jsp_taghandler_104.setStyle("text-align: center;");
                            __jsp_tag_starteval=__jsp_taghandler_104.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_104,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                        ");
                                  {
                                    org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_105=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                                    __jsp_taghandler_105.setParent(__jsp_taghandler_104);
                                    __jsp_tag_starteval=__jsp_taghandler_105.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      do {
                                        out.write("\r\n                            ");
                                        {
                                          org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_106=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                                          __jsp_taghandler_106.setParent(__jsp_taghandler_105);
                                          __jsp_taghandler_106.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.descEstadoNom ne 'Sin proceso'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                                          __jsp_tag_starteval=__jsp_taghandler_106.doStartTag();
                                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                          {
                                            do {
                                              out.write("\r\n                                ");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_107=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_107.setParent(__jsp_taghandler_106);
                                                __jsp_taghandler_107.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.descEstadoNom}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_107.doStartTag();
                                                if (__jsp_taghandler_107.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_107,9);
                                              }
                                              out.write("\r\n                            ");
                                            } while (__jsp_taghandler_106.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                          }
                                          if (__jsp_taghandler_106.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                             throw new javax.servlet.jsp.SkipPageException();
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_106,8);
                                        }
                                        out.write("\r\n                            ");
                                        {
                                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_108=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                                          __jsp_taghandler_108.setParent(__jsp_taghandler_105);
                                          __jsp_tag_starteval=__jsp_taghandler_108.doStartTag();
                                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                          {
                                            do {
                                              out.write("\r\n                                <a onclick='return confirm(\"Desea procesar la n\\u00f3mina? \\n\\nSi presiona ACEPTAR se borrar\\u00e1n los registros previamente procesados!\");' href=\"listaRFCsPorGrupoPagoReproceso.do?idGrupoPago=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_109=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_109.setParent(__jsp_taghandler_108);
                                                __jsp_taghandler_109.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idgrupopagonom}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_109.doStartTag();
                                                if (__jsp_taghandler_109.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_109,9);
                                              }
                                              out.write("&amp;idQna=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_110=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_110.setParent(__jsp_taghandler_108);
                                                __jsp_taghandler_110.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idNomina}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_110.doStartTag();
                                                if (__jsp_taghandler_110.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_110,9);
                                              }
                                              out.write("&amp;status=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_111=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_111.setParent(__jsp_taghandler_108);
                                                __jsp_taghandler_111.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idEdoNom}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_111.doStartTag();
                                                if (__jsp_taghandler_111.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_111,9);
                                              }
                                              out.write("&amp;idTipoNomina=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_112=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_112.setParent(__jsp_taghandler_108);
                                                __jsp_taghandler_112.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idTipoNomina}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_112.doStartTag();
                                                if (__jsp_taghandler_112.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_112,9);
                                              }
                                              out.write("&amp;nomFuenteDatos=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_113=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_113.setParent(__jsp_taghandler_108);
                                                __jsp_taghandler_113.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.nomFuenteDatos}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_113.doStartTag();
                                                if (__jsp_taghandler_113.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_113,9);
                                              }
                                              out.write("'\" title=\"Recalculo\">\r\n                                    <img src=\"");
                                              {
                                                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_114=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                                                __jsp_taghandler_114.setParent(__jsp_taghandler_108);
                                                __jsp_taghandler_114.setCode("procesar.png");
                                                try {
                                                  __jsp_tag_starteval=__jsp_taghandler_114.doStartTag();
                                                  if (__jsp_taghandler_114.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                     throw new javax.servlet.jsp.SkipPageException();
                                                } catch (Throwable th) {
                                                  __jsp_taghandler_114.doCatch(th);
                                                } finally {
                                                  __jsp_taghandler_114.doFinally();
                                                }
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_114,9);
                                              }
                                              out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                            ");
                                            } while (__jsp_taghandler_108.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                          }
                                          if (__jsp_taghandler_108.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                             throw new javax.servlet.jsp.SkipPageException();
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_108,8);
                                        }
                                        out.write("\r\n                        ");
                                      } while (__jsp_taghandler_105.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__jsp_taghandler_105.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_105,7);
                                  }
                                  out.write("\r\n                    ");
                                } while (__jsp_taghandler_104.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_104.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_104,6);
                          }
                          out.write("\r\n                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_115=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                            __jsp_taghandler_115.setParent(__jsp_taghandler_103);
                            __jsp_taghandler_115.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.idQna");
                            __jsp_taghandler_115.setSortable(true);
                            __jsp_taghandler_115.setStyle("text-align: center;");
                            __jsp_tag_starteval=__jsp_taghandler_115.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_115,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                        ");
                                  {
                                    org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_116=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                                    __jsp_taghandler_116.setParent(__jsp_taghandler_115);
                                    __jsp_tag_starteval=__jsp_taghandler_116.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      do {
                                        out.write("\r\n                            ");
                                        {
                                          org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_117=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                                          __jsp_taghandler_117.setParent(__jsp_taghandler_116);
                                          __jsp_taghandler_117.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.descEstadoNom eq 'Procesando'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                                          __jsp_tag_starteval=__jsp_taghandler_117.doStartTag();
                                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                          {
                                            do {
                                              out.write("\r\n                                ");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_118=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_118.setParent(__jsp_taghandler_117);
                                                __jsp_taghandler_118.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idNomina}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_118.doStartTag();
                                                if (__jsp_taghandler_118.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_118,9);
                                              }
                                              out.write("\r\n                            ");
                                            } while (__jsp_taghandler_117.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                          }
                                          if (__jsp_taghandler_117.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                             throw new javax.servlet.jsp.SkipPageException();
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_117,8);
                                        }
                                        out.write("\r\n                            ");
                                        {
                                          org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_119=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                                          __jsp_taghandler_119.setParent(__jsp_taghandler_116);
                                          __jsp_tag_starteval=__jsp_taghandler_119.doStartTag();
                                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                          {
                                            do {
                                              out.write("\r\n                                <a href=\"listaRFCsPorGrupoPago.do?idGrupoPago=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_120=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_120.setParent(__jsp_taghandler_119);
                                                __jsp_taghandler_120.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idgrupopagonom}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_120.doStartTag();
                                                if (__jsp_taghandler_120.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_120,9);
                                              }
                                              out.write("&amp;idQna=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_121=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_121.setParent(__jsp_taghandler_119);
                                                __jsp_taghandler_121.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idNomina}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_121.doStartTag();
                                                if (__jsp_taghandler_121.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_121,9);
                                              }
                                              out.write("&amp;status=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_122=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_122.setParent(__jsp_taghandler_119);
                                                __jsp_taghandler_122.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idEdoNom}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_122.doStartTag();
                                                if (__jsp_taghandler_122.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_122,9);
                                              }
                                              out.write("&amp;idTipoNomina=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_123=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_123.setParent(__jsp_taghandler_119);
                                                __jsp_taghandler_123.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idTipoNomina}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_123.doStartTag();
                                                if (__jsp_taghandler_123.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_123,9);
                                              }
                                              out.write("&amp;nomFuenteDatos=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_124=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_124.setParent(__jsp_taghandler_119);
                                                __jsp_taghandler_124.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.nomFuenteDatos}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_124.doStartTag();
                                                if (__jsp_taghandler_124.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_124,9);
                                              }
                                              out.write("'\">\r\n                                    ");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_125=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_125.setParent(__jsp_taghandler_119);
                                                __jsp_taghandler_125.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idNomina}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_125.doStartTag();
                                                if (__jsp_taghandler_125.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_125,9);
                                              }
                                              out.write("\r\n                                </a>\r\n                            ");
                                            } while (__jsp_taghandler_119.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                          }
                                          if (__jsp_taghandler_119.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                             throw new javax.servlet.jsp.SkipPageException();
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_119,8);
                                        }
                                        out.write("\r\n                        ");
                                      } while (__jsp_taghandler_116.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__jsp_taghandler_116.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_116,7);
                                  }
                                  out.write("\r\n                    ");
                                } while (__jsp_taghandler_115.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_115.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_115,6);
                          }
                          out.write("\r\n                ");
                        } while (__jsp_taghandler_103.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_103.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_103,5);
                    }
                    out.write("\r\n                ");
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_126=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_126.setParent(__jsp_taghandler_102);
                      __jsp_tag_starteval=__jsp_taghandler_126.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_127=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                            __jsp_taghandler_127.setParent(__jsp_taghandler_126);
                            __jsp_taghandler_127.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.idQna");
                            __jsp_taghandler_127.setSortable(true);
                            __jsp_taghandler_127.setStyle("text-align: center;");
                            __jsp_tag_starteval=__jsp_taghandler_127.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_127,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                        <a href=\"listaRFCsPorGrupoPago.do?idGrupoPago=");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_128=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_128.setParent(__jsp_taghandler_127);
                                    __jsp_taghandler_128.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idgrupopagonom}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_128.doStartTag();
                                    if (__jsp_taghandler_128.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_128,7);
                                  }
                                  out.write("&idQna=");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_129=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_129.setParent(__jsp_taghandler_127);
                                    __jsp_taghandler_129.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idNomina}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_129.doStartTag();
                                    if (__jsp_taghandler_129.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_129,7);
                                  }
                                  out.write("&status=");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_130=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_130.setParent(__jsp_taghandler_127);
                                    __jsp_taghandler_130.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idEdoNom}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_130.doStartTag();
                                    if (__jsp_taghandler_130.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_130,7);
                                  }
                                  out.write("&idTipoNomina=");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_131=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_131.setParent(__jsp_taghandler_127);
                                    __jsp_taghandler_131.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idTipoNomina}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_131.doStartTag();
                                    if (__jsp_taghandler_131.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_131,7);
                                  }
                                  out.write("\">\r\n                            ");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_132=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_132.setParent(__jsp_taghandler_127);
                                    __jsp_taghandler_132.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idNomina}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_132.doStartTag();
                                    if (__jsp_taghandler_132.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_132,7);
                                  }
                                  out.write("\r\n                        </a>\r\n                    ");
                                } while (__jsp_taghandler_127.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_127.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_127,6);
                          }
                          out.write("\r\n                ");
                        } while (__jsp_taghandler_126.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_126.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_126,5);
                    }
                    out.write("\r\n            ");
                  } while (__jsp_taghandler_102.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_102.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_102,4);
              }
              out.write("\r\n            \r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_133=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_133.setParent(__jsp_taghandler_101);
                __jsp_taghandler_133.setProperty("nomQnaCaptura");
                __jsp_taghandler_133.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.qnaCaptura");
                __jsp_taghandler_133.setSortable(true);
                __jsp_taghandler_133.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_133.doStartTag();
                if (__jsp_taghandler_133.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_133,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_134=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_134.setParent(__jsp_taghandler_101);
                __jsp_taghandler_134.setProperty("nomNumComplem");
                __jsp_taghandler_134.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.numComplem");
                __jsp_taghandler_134.setSortable(true);
                __jsp_taghandler_134.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_134.doStartTag();
                if (__jsp_taghandler_134.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_134,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_135=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_135.setParent(__jsp_taghandler_101);
                __jsp_taghandler_135.setProperty("nomDescripcion");
                __jsp_taghandler_135.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.desc");
                __jsp_taghandler_135.setSortable(true);
                __jsp_taghandler_135.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_135.doStartTag();
                if (__jsp_taghandler_135.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_135,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_136=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_136.setParent(__jsp_taghandler_101);
                __jsp_taghandler_136.setProperty("nomDescTipoNomina");
                __jsp_taghandler_136.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.tipoNomina");
                __jsp_taghandler_136.setSortable(true);
                __jsp_taghandler_136.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_136.doStartTag();
                if (__jsp_taghandler_136.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_136,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_137=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_137.setParent(__jsp_taghandler_101);
                __jsp_taghandler_137.setProperty("nomDescGrupoPago");
                __jsp_taghandler_137.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.grupoPago");
                __jsp_taghandler_137.setSortable(true);
                __jsp_taghandler_137.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_137.doStartTag();
                if (__jsp_taghandler_137.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_137,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_138=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_138.setParent(__jsp_taghandler_101);
                __jsp_taghandler_138.setProperty("periodoPago");
                __jsp_taghandler_138.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.periodoPago");
                __jsp_taghandler_138.setSortable(true);
                __jsp_taghandler_138.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_138.doStartTag();
                if (__jsp_taghandler_138.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_138,4);
              }
              out.write("                            \r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_139=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_139.setParent(__jsp_taghandler_101);
                __jsp_taghandler_139.setProperty("descEstadoNom");
                __jsp_taghandler_139.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.status");
                __jsp_taghandler_139.setSortable(true);
                __jsp_taghandler_139.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_139.doStartTag();
                if (__jsp_taghandler_139.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_139,4);
              }
              out.write("\r\n                            \r\n            ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_140=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_140.setParent(__jsp_taghandler_101);
                __jsp_taghandler_140.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${qna.idTipoNomina eq 'AG'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_140.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_141=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_141.setParent(__jsp_taghandler_140);
                      __jsp_taghandler_141.setProperty("nomVigente");
                      __jsp_taghandler_141.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomvigente");
                      __jsp_taghandler_141.setSortable(true);
                      __jsp_taghandler_141.setStyle("text-align: center;");
                      __jsp_tag_starteval=__jsp_taghandler_141.doStartTag();
                      if (__jsp_taghandler_141.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_141,5);
                    }
                    out.write("                            \r\n                ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_142=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_142.setParent(__jsp_taghandler_140);
                      __jsp_taghandler_142.setProperty("nomDiasPagar");
                      __jsp_taghandler_142.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.diaspagar");
                      __jsp_taghandler_142.setSortable(true);
                      __jsp_taghandler_142.setStyle("text-align: center;");
                      __jsp_tag_starteval=__jsp_taghandler_142.doStartTag();
                      if (__jsp_taghandler_142.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_142,5);
                    }
                    out.write("\r\n                ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_143=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_143.setParent(__jsp_taghandler_140);
                      __jsp_taghandler_143.setProperty("nomAplicarExentos");
                      __jsp_taghandler_143.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomAplicarExentos");
                      __jsp_taghandler_143.setSortable(true);
                      __jsp_taghandler_143.setStyle("text-align: center;");
                      __jsp_tag_starteval=__jsp_taghandler_143.doStartTag();
                      if (__jsp_taghandler_143.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_143,5);
                    }
                    out.write("                            \r\n                ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_144=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_144.setParent(__jsp_taghandler_140);
                      __jsp_taghandler_144.setProperty("nomGratifAgui");
                      __jsp_taghandler_144.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomGratifAgui");
                      __jsp_taghandler_144.setSortable(true);
                      __jsp_taghandler_144.setStyle("text-align: center;");
                      __jsp_tag_starteval=__jsp_taghandler_144.doStartTag();
                      if (__jsp_taghandler_144.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_144,5);
                    }
                    out.write("                            \r\n                ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_145=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_145.setParent(__jsp_taghandler_140);
                      __jsp_taghandler_145.setProperty("nomCompletarperiodo");
                      __jsp_taghandler_145.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomCompletarperiodo");
                      __jsp_taghandler_145.setSortable(true);
                      __jsp_taghandler_145.setStyle("text-align: center;");
                      __jsp_tag_starteval=__jsp_taghandler_145.doStartTag();
                      if (__jsp_taghandler_145.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_145,5);
                    }
                    out.write("                            \r\n            ");
                  } while (__jsp_taghandler_140.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_140.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_140,4);
              }
              out.write("\r\n            \r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_146=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_146.setParent(__jsp_taghandler_101);
                __jsp_taghandler_146.setName("paging.banner.placement");
                __jsp_taghandler_146.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_146.doStartTag();
                if (__jsp_taghandler_146.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_146,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_147=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_147.setParent(__jsp_taghandler_101);
                __jsp_taghandler_147.setName("export.pdf");
                __jsp_taghandler_147.setValue("false");
                __jsp_tag_starteval=__jsp_taghandler_147.doStartTag();
                if (__jsp_taghandler_147.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_147,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_148=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_148.setParent(__jsp_taghandler_101);
                __jsp_taghandler_148.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_148.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_148,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_149=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_149.setParent(__jsp_taghandler_148);
                        __jsp_taghandler_149.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_149.doStartTag();
                          if (__jsp_taghandler_149.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_149.doCatch(th);
                        } finally {
                          __jsp_taghandler_149.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_149,5);
                      }
                      out.write("<br><br></span>\r\n            ");
                    } while (__jsp_taghandler_148.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_148.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_148,4);
              }
              out.write("\r\n         ");
            } while (__jsp_taghandler_101.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_101.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_101,3);
      }
      out.write("\r\n    ");
      return;
    }

    public void invoke(java.io.Writer writer )
     throws javax.servlet.jsp.JspException 
    {
      JspWriter out = null;
      if (writer != null ) {
        out = this.jspContext.pushBody(writer);
      }
      else
      {
         out = this.jspContext.getOut();
      }
      try {
        switch( this.fragId ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch (Throwable e) {
        if (e instanceof javax.servlet.jsp.SkipPageException) 
           throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException(e);
      }
      finally {
        if (writer != null) {
          this.jspContext.popBody();
        }
      }
    }

  }

  private static final char __oracle_jsp_text[][]=new char[148][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .pagelinks {\r\n        display:none;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    \r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[69] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[71] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[72] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[74] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[75] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[76] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[77] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[78] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[79] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[80] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[81] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[82] = 
    "\r\n        <table align=\"center\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    <fieldset>\r\n                        <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                        <table width=\"90%\">\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[83] = 
    "</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[84] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[85] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[86] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[87] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[88] = 
    "\r\n                                </td>\r\n                             </tr>\r\n                             <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[89] = 
    "</td>\r\n                                <td>\r\n                                    <table align=\"left\" width=\"50%\">\r\n                                        <tr>                        \r\n                                            <td align=\"left\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[90] = 
    "\r\n                                            </td>\r\n                                            <td align=\"left\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[91] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                </table>\r\n                                </td>\r\n                             </tr>\r\n                             <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[92] = 
    "</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[93] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[94] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[95] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[96] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[97] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[98] = 
    "\r\n                                </td>\r\n                             </tr>\r\n                             <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[99] = 
    "</td>\r\n                                <td>\r\n                                    <table align=\"left\" width=\"50%\">\r\n                                        <tr>                        \r\n                                            <td align=\"left\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[100] = 
    "\r\n                                            </td>\r\n                                            <td align=\"left\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[101] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                             </tr>\r\n                             <tr align=\"left\">\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[102] = 
    "</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[103] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[104] = 
    "\r\n                                </td>\r\n                             </tr>\r\n                        </table>\r\n                        <table width=\"100%\">\r\n                            <tr align=\"center\">\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[105] = 
    "&nbsp; \r\n                                    ".toCharArray();
    __oracle_jsp_text[106] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </fieldset>\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[107] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[108] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[109] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[110] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[111] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[112] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[113] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[114] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[115] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[116] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[117] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[118] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[119] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[120] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[121] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[122] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[123] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[124] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[125] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[126] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[127] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[128] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[129] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[130] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[131] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[132] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[133] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[134] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[135] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[136] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[137] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[138] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[139] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[140] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[141] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[142] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[143] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[144] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[145] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[146] = 
    "\r\n    \r\n    <table width=\"100%\">\r\n        <tr align=\"center\">\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[147] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        function confirmaReproceso(url) {\r\n            var txt;\r\n            var r = confirm(\"Desea procesar la n\\u00f3mina? \\n\\nSi presiona ACEPTAR se borrar\\u00e1n los registros previamente procesados. \\nCANCELAR conserva los registros capturados.\");\r\n            if (r == true) {\r\n                window.location.href = 'listaRFCsPorGrupoPagoReproceso.do?' + url;\r\n            } else {\r\n                window.location.href = 'listaRFCsPorGrupoPago.do?' + url;\r\n            }\r\n        }\r\n        \r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
