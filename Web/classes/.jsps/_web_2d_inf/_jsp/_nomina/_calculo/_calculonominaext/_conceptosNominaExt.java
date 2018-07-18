package _web_2d_inf._jsp._nomina._calculo._calculonominaext;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _conceptosNominaExt extends com.orionserver.http.OrionHttpJspPage {


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
    _conceptosNominaExt page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag onkeypress modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setOnkeypress("return anularEnter(event)");
        __jsp_taghandler_1.setModelAttribute("conceptosPagNomExtraDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("descGrupoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                  if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_2.doCatch(th);
                } finally {
                  __jsp_taghandler_2.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setPath("idQna");
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
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setPath("idNomina");
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
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("postData");
                __jsp_taghandler_5.setId("postData");
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
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("cnqIniPago");
                __jsp_taghandler_6.setId("cnqIniPago");
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
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("cnqFinPago");
                __jsp_taghandler_7.setId("cnqFinPago");
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
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("status");
                __jsp_taghandler_8.setId("status");
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
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setPath("idGrupoPago");
                __jsp_taghandler_9.setId("idGrupoPago");
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
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setPath("nomQnaCaptura");
                __jsp_taghandler_10.setId("nomQnaCaptura");
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
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setPath("nomNumComplem");
                __jsp_taghandler_11.setId("nomNumComplem");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                  if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_11.doCatch(th);
                } finally {
                  __jsp_taghandler_11.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setPath("descNomina");
                __jsp_taghandler_12.setId("descNomina");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_12.doCatch(th);
                } finally {
                  __jsp_taghandler_12.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setPath("nomDescTipoNomina");
                __jsp_taghandler_13.setId("nomDescTipoNomina");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                  if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_13.doCatch(th);
                } finally {
                  __jsp_taghandler_13.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setPath("nomDescGrupoPago");
                __jsp_taghandler_14.setId("nomDescGrupoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                  if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_14.doCatch(th);
                } finally {
                  __jsp_taghandler_14.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setPath("periodoPago");
                __jsp_taghandler_15.setId("periodoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                  if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_15.doCatch(th);
                } finally {
                  __jsp_taghandler_15.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setPath("idEdoNom");
                __jsp_taghandler_16.setId("idEdoNom");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                  if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_16.doCatch(th);
                } finally {
                  __jsp_taghandler_16.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setPath("conceptos");
                __jsp_taghandler_17.setId("conceptos");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                  if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_17.doCatch(th);
                } finally {
                  __jsp_taghandler_17.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setPath("idTipoNomina");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                  if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_18.doCatch(th);
                } finally {
                  __jsp_taghandler_18.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write(__oracle_jsp_text[21]);
              out.write(__oracle_jsp_text[22]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[23]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_20.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.idTipoNomina eq 'SA'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[24]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                            __jsp_taghandler_21.setCode("sireh.label.nomina.tercero.aportacion.conceptosPagados.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                              if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_21.doCatch(th);
                            } finally {
                              __jsp_taghandler_21.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,4);
                          }
                          out.write(__oracle_jsp_text[25]);
                        } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,3);
                    }
                    out.write(__oracle_jsp_text[26]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_22.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.idTipoNomina eq 'AG'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[27]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_23.setCode("sireh.label.calculo.nomina.extraOrdinaria.aguinaldo.conceptosPagados.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                              if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_23.doCatch(th);
                            } finally {
                              __jsp_taghandler_23.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,4);
                          }
                          out.write(__oracle_jsp_text[28]);
                        } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,3);
                    }
                    out.write(__oracle_jsp_text[29]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_24.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_24.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.idTipoNomina eq 'EX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[30]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                            __jsp_taghandler_25.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.tipoExtraordinaria eq 'S'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[31]);
                                {
                                  org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                                  __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                                  __jsp_taghandler_26.setCode("sireh.label.calculo.nomina.extraOrdinaria.sueldos.conceptosPagados.titulo");
                                  try {
                                    __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                                    if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                  } catch (Throwable th) {
                                    __jsp_taghandler_26.doCatch(th);
                                  } finally {
                                    __jsp_taghandler_26.doFinally();
                                  }
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,5);
                                }
                                out.write(__oracle_jsp_text[32]);
                              } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,4);
                          }
                          out.write(__oracle_jsp_text[33]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_27.setParent(__jsp_taghandler_24);
                            __jsp_taghandler_27.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.tipoExtraordinaria eq 'P'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[34]);
                                {
                                  org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                                  __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                                  __jsp_taghandler_28.setCode("sireh.label.calculo.nomina.extraOrdinaria.perseverancia.conceptosPagados.titulo");
                                  try {
                                    __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                                    if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                  } catch (Throwable th) {
                                    __jsp_taghandler_28.doCatch(th);
                                  } finally {
                                    __jsp_taghandler_28.doFinally();
                                  }
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,5);
                                }
                                out.write(__oracle_jsp_text[35]);
                              } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,4);
                          }
                          out.write(__oracle_jsp_text[36]);
                        } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,3);
                    }
                    out.write(__oracle_jsp_text[37]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_29.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_29.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.idTipoNomina eq 'FO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[38]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                            __jsp_taghandler_30.setCode("sireh.label.calculo.nomina.fonac.finciclo.conceptosPagados.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                              if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_30.doCatch(th);
                            } finally {
                              __jsp_taghandler_30.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,4);
                          }
                          out.write(__oracle_jsp_text[39]);
                        } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,3);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_31.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.idTipoNomina eq 'FE'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[41]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                            __jsp_taghandler_32.setCode("sireh.label.calculo.nomina.fonac.anticipada.conceptosPagados.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                              if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_32.doCatch(th);
                            } finally {
                              __jsp_taghandler_32.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,4);
                          }
                          out.write(__oracle_jsp_text[42]);
                        } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,3);
                    }
                    out.write(__oracle_jsp_text[43]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_33.setParent(__jsp_taghandler_19);
                      __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[44]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                            __jsp_taghandler_34.setCode("sireh.label.calculo.nomina");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                              if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_34.doCatch(th);
                            } finally {
                              __jsp_taghandler_34.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,4);
                          }
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_35.setParent(__jsp_taghandler_33);
                            __jsp_taghandler_35.setCode("sireh.label.guion");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                              if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_35.doCatch(th);
                            } finally {
                              __jsp_taghandler_35.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,4);
                          }
                          out.write(__oracle_jsp_text[45]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_36=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_36.setParent(__jsp_taghandler_33);
                            __jsp_taghandler_36.setCode("sireh.label.extraOrdinaria");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                              if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_36.doCatch(th);
                            } finally {
                              __jsp_taghandler_36.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,4);
                          }
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_37.setParent(__jsp_taghandler_33);
                            __jsp_taghandler_37.setCode("sireh.label.guion");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_37.doCatch(th);
                            } finally {
                              __jsp_taghandler_37.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,4);
                          }
                          out.write(__oracle_jsp_text[46]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_38.setParent(__jsp_taghandler_33);
                            __jsp_taghandler_38.setCode("sireh.label.personal");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                              if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_38.doCatch(th);
                            } finally {
                              __jsp_taghandler_38.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,4);
                          }
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_39.setParent(__jsp_taghandler_33);
                            __jsp_taghandler_39.setCode("sireh.label.guion");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                              if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_39.doCatch(th);
                            } finally {
                              __jsp_taghandler_39.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,4);
                          }
                          out.write(__oracle_jsp_text[47]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_40=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_40.setParent(__jsp_taghandler_33);
                            __jsp_taghandler_40.setCode("sireh.label.conceptos.pagados");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                              if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_40.doCatch(th);
                            } finally {
                              __jsp_taghandler_40.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,4);
                          }
                          out.write(__oracle_jsp_text[48]);
                        } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,3);
                    }
                    out.write(__oracle_jsp_text[49]);
                  } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[50]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_41=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setCode("sireh.label.nomina.gestion.consulta.parametros.qnaCaptura");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                  if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_41.doCatch(th);
                } finally {
                  __jsp_taghandler_41.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setCode("sireh.label.nomina.gestion.consulta.parametros.numComplem");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                  if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_42.doCatch(th);
                } finally {
                  __jsp_taghandler_42.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,2);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setCode("sireh.label.nomina.gestion.consulta.parametros.desc");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                  if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_43.doCatch(th);
                } finally {
                  __jsp_taghandler_43.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,2);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setCode("sireh.label.nomina.gestion.consulta.parametros.tipoNomina");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                  if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_44.doCatch(th);
                } finally {
                  __jsp_taghandler_44.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,2);
              }
              out.write(__oracle_jsp_text[54]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_45=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setCode("sireh.label.nomina.gestion.consulta.parametros.grupoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                  if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_45.doCatch(th);
                } finally {
                  __jsp_taghandler_45.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,2);
              }
              out.write(__oracle_jsp_text[55]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setCode("sireh.label.nomina.gestion.consulta.parametros.periodoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                  if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_46.doCatch(th);
                } finally {
                  __jsp_taghandler_46.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,2);
              }
              out.write(__oracle_jsp_text[56]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setCode("sireh.label.nomina.gestion.consulta.parametros.status");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                  if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_47.doCatch(th);
                } finally {
                  __jsp_taghandler_47.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,2);
              }
              out.write(__oracle_jsp_text[57]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_48=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.nomQnaCaptura}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,2);
              }
              out.write(__oracle_jsp_text[58]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.nomNumComplem}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,2);
              }
              out.write(__oracle_jsp_text[59]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_50=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.descNomina}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,2);
              }
              out.write(__oracle_jsp_text[60]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_51=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.nomDescTipoNomina}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,2);
              }
              out.write(__oracle_jsp_text[61]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_52=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.nomDescGrupoPago}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,2);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_53=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.periodoPago}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,2);
              }
              out.write(__oracle_jsp_text[63]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_54=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.idEdoNom}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,2);
              }
              out.write(__oracle_jsp_text[64]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_55=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setCode("sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.datosDelEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                  if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_55.doCatch(th);
                } finally {
                  __jsp_taghandler_55.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,2);
              }
              out.write(__oracle_jsp_text[65]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombreEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                  if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_56.doCatch(th);
                } finally {
                  __jsp_taghandler_56.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,2);
              }
              out.write(__oracle_jsp_text[66]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_57=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setJspContext(pageContext);
                __jsp_taghandler_57.setPath("nombreEmpleado");
                __jsp_taghandler_57.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_57, pageContext);
              }
              out.write(__oracle_jsp_text[67]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.primerApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                  if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_58.doCatch(th);
                } finally {
                  __jsp_taghandler_58.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,2);
              }
              out.write(__oracle_jsp_text[68]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_59=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setJspContext(pageContext);
                __jsp_taghandler_59.setPath("primerApellido");
                __jsp_taghandler_59.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_59, pageContext);
              }
              out.write(__oracle_jsp_text[69]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_60=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.segundoApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                  if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_60.doCatch(th);
                } finally {
                  __jsp_taghandler_60.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,2);
              }
              out.write(__oracle_jsp_text[70]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_61=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setJspContext(pageContext);
                __jsp_taghandler_61.setPath("segundoApellido");
                __jsp_taghandler_61.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_61, pageContext);
              }
              out.write(__oracle_jsp_text[71]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_taghandler_62.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                  if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_62.doCatch(th);
                } finally {
                  __jsp_taghandler_62.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,2);
              }
              out.write(__oracle_jsp_text[72]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_63=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setJspContext(pageContext);
                __jsp_taghandler_63.setPath("rfcEmpleado");
                __jsp_taghandler_63.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_63, pageContext);
              }
              out.write(__oracle_jsp_text[73]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_64=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.descTipoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                  if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_64.doCatch(th);
                } finally {
                  __jsp_taghandler_64.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,2);
              }
              out.write(__oracle_jsp_text[74]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_65=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setJspContext(pageContext);
                __jsp_taghandler_65.setPath("descTipoPago");
                __jsp_taghandler_65.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_65, pageContext);
              }
              out.write(__oracle_jsp_text[75]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_66=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_66.setParent(__jsp_taghandler_1);
                __jsp_taghandler_66.setCode("sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.datosDeLaPlaza");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                  if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_66.doCatch(th);
                } finally {
                  __jsp_taghandler_66.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,2);
              }
              out.write(__oracle_jsp_text[76]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_67=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_67.setParent(__jsp_taghandler_1);
                __jsp_taghandler_67.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPlaza");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                  if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_67.doCatch(th);
                } finally {
                  __jsp_taghandler_67.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,2);
              }
              out.write(__oracle_jsp_text[77]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_68=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_68.setParent(__jsp_taghandler_1);
                __jsp_taghandler_68.setJspContext(pageContext);
                __jsp_taghandler_68.setPath("idPlaza");
                __jsp_taghandler_68.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_68, pageContext);
              }
              out.write(__oracle_jsp_text[78]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_69=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_69.setParent(__jsp_taghandler_1);
                __jsp_taghandler_69.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPuestoNom");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                  if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_69.doCatch(th);
                } finally {
                  __jsp_taghandler_69.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,2);
              }
              out.write(__oracle_jsp_text[79]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_70=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_70.setParent(__jsp_taghandler_1);
                __jsp_taghandler_70.setJspContext(pageContext);
                __jsp_taghandler_70.setPath("idPuestoNom");
                __jsp_taghandler_70.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_70, pageContext);
              }
              out.write(__oracle_jsp_text[80]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_71=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_71.setParent(__jsp_taghandler_1);
                __jsp_taghandler_71.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idZonaDistNom");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                  if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_71.doCatch(th);
                } finally {
                  __jsp_taghandler_71.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,2);
              }
              out.write(__oracle_jsp_text[81]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_72=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_72.setParent(__jsp_taghandler_1);
                __jsp_taghandler_72.setJspContext(pageContext);
                __jsp_taghandler_72.setPath("idZonaDistNom");
                __jsp_taghandler_72.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_72, pageContext);
              }
              out.write(__oracle_jsp_text[82]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_73=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_73.setParent(__jsp_taghandler_1);
                __jsp_taghandler_73.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.grupoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                  if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_73.doCatch(th);
                } finally {
                  __jsp_taghandler_73.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,2);
              }
              out.write(__oracle_jsp_text[83]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_74=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_74.setParent(__jsp_taghandler_1);
                __jsp_taghandler_74.setJspContext(pageContext);
                __jsp_taghandler_74.setPath("descGrupoPago");
                __jsp_taghandler_74.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_74, pageContext);
              }
              out.write(__oracle_jsp_text[84]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_75=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_75.setParent(__jsp_taghandler_1);
                __jsp_taghandler_75.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nivelPto");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                  if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_75.doCatch(th);
                } finally {
                  __jsp_taghandler_75.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,2);
              }
              out.write(__oracle_jsp_text[85]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_76=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_76.setParent(__jsp_taghandler_1);
                __jsp_taghandler_76.setJspContext(pageContext);
                __jsp_taghandler_76.setPath("idNivelPto");
                __jsp_taghandler_76.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_76, pageContext);
              }
              out.write(__oracle_jsp_text[86]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_77=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_77.setParent(__jsp_taghandler_1);
                __jsp_taghandler_77.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombramiento");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                  if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_77.doCatch(th);
                } finally {
                  __jsp_taghandler_77.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,2);
              }
              out.write(__oracle_jsp_text[87]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_78=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_78.setParent(__jsp_taghandler_1);
                __jsp_taghandler_78.setJspContext(pageContext);
                __jsp_taghandler_78.setPath("descNombramiento");
                __jsp_taghandler_78.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_78, pageContext);
              }
              out.write(__oracle_jsp_text[88]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_79=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_79.setParent(__jsp_taghandler_1);
                __jsp_taghandler_79.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.jerarquia");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                  if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_79.doCatch(th);
                } finally {
                  __jsp_taghandler_79.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,2);
              }
              out.write(__oracle_jsp_text[89]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_80=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_80.setParent(__jsp_taghandler_1);
                __jsp_taghandler_80.setJspContext(pageContext);
                __jsp_taghandler_80.setPath("descJerarquia");
                __jsp_taghandler_80.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_80, pageContext);
              }
              out.write(__oracle_jsp_text[90]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_81=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_81.setParent(__jsp_taghandler_1);
                __jsp_taghandler_81.setCode("sireh.label.nomina.calculo.extraordinaria.titulo.conceptos");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                  if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_81.doCatch(th);
                } finally {
                  __jsp_taghandler_81.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81,2);
              }
              out.write(__oracle_jsp_text[91]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_82=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_82.setParent(__jsp_taghandler_1);
                __jsp_taghandler_82.setJspContext(pageContext);
                __jsp_taghandler_82.setAction("calculoNominaExt/jsonRequestConceptos.do");
                __jsp_taghandler_82.setValue("submit.accept");
                __jsp_taghandler_82.setOnclick("setJson()");
                __jsp_taghandler_82.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_82, pageContext);
              }
              out.write(__oracle_jsp_text[92]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_83=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_83.setParent(__jsp_taghandler_1);
                __jsp_taghandler_83.setJspContext(pageContext);
                __jsp_taghandler_83.setAction("calculoNominaExt/regresarPantallaAnterior.do");
                __jsp_taghandler_83.setValue("submit.cancel");
                __jsp_taghandler_83.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_83, pageContext);
              }
              out.write(__oracle_jsp_text[93]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_84=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_84.setParent(__jsp_taghandler_1);
                __jsp_taghandler_84.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.idTipoNomina}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84,2);
              }
              out.write(__oracle_jsp_text[94]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_85=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_85.setParent(__jsp_taghandler_1);
                __jsp_taghandler_85.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.idNombramiento}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85,2);
              }
              out.write(__oracle_jsp_text[95]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_86=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_86.setParent(__jsp_taghandler_1);
                __jsp_taghandler_86.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${conceptosPagNomExtraDTO.jsonDataString}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,2);
              }
              out.write(__oracle_jsp_text[96]);
            } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
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
  private static final char __oracle_jsp_text[][]=new char[97][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n<style type=\"text/css\">\r\n    #listaNominasQnaPorQna .pagelinks {\r\n        display:none;\r\n    }\r\n    .columnHeader {\r\n        background-color: rgb(109, 109, 109);\r\n        color: rgb(255, 255, 255);\r\n        font-weight: bold;\r\n        text-align: center;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
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
    "\r\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[25] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[28] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                <h1>".toCharArray();
    __oracle_jsp_text[32] = 
    "</h1>\r\n            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                <h1>".toCharArray();
    __oracle_jsp_text[35] = 
    "</h1>\r\n            ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[39] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[42] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n            <h1>\r\n                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n            </h1>\r\n        ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n    <br>\r\n    \r\n    <table align=\"center\" width=\"100%\" border=\"0\">\r\n        <tr>\r\n            <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[51] = 
    "</td>\r\n            <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[52] = 
    "</td>\r\n            <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[53] = 
    "</td>\r\n            <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[54] = 
    "</td>\r\n            <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[55] = 
    "</td>\r\n            <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[56] = 
    "</td>\r\n            <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[57] = 
    "</td>\r\n        </tr>\r\n        <tr>\r\n            <td class=\"label\" style=\"text-align: center;\">".toCharArray();
    __oracle_jsp_text[58] = 
    "</td>\r\n            <td class=\"label\" style=\"text-align: center;\">".toCharArray();
    __oracle_jsp_text[59] = 
    "</td>\r\n            <td class=\"label\" style=\"text-align: center;\">".toCharArray();
    __oracle_jsp_text[60] = 
    "</td>\r\n            <td class=\"label\" style=\"text-align: center;\">".toCharArray();
    __oracle_jsp_text[61] = 
    "</td>\r\n            <td class=\"label\" style=\"text-align: center;\">".toCharArray();
    __oracle_jsp_text[62] = 
    "</td>\r\n            <td class=\"label\" style=\"text-align: center;\">".toCharArray();
    __oracle_jsp_text[63] = 
    "</td>\r\n            <td class=\"label\" style=\"text-align: center;\">".toCharArray();
    __oracle_jsp_text[64] = 
    "</td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <table align=\"center\" width=\"100%\" border=\"0\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend><strong>".toCharArray();
    __oracle_jsp_text[65] = 
    "</strong></legend>\r\n                    <table align=\"center\" width= \"100%\" border=\"0\">\r\n                        <tr>\r\n                            <td align=\"left\" class=\"label\" style=\"width:150px;\">".toCharArray();
    __oracle_jsp_text[66] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[67] = 
    "</td>\r\n                            <td style=\"width:150px;\" align=\"left\" class=\"label\">".toCharArray();
    __oracle_jsp_text[68] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[69] = 
    "</td>\r\n                            <td style=\"width:150px;\" align=\"left\" class=\"label\">".toCharArray();
    __oracle_jsp_text[70] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[71] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"left\" class=\"label\" style=\"width:150px;\">".toCharArray();
    __oracle_jsp_text[72] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[73] = 
    "</td>\r\n                            <td align=\"left\" class=\"label\" style=\"width:150px;\">".toCharArray();
    __oracle_jsp_text[74] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[75] = 
    "</td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend><strong>".toCharArray();
    __oracle_jsp_text[76] = 
    "</strong></legend>\r\n                    <table align=\"center\" width= \"100%\" border=\"0\">\r\n                        <tr>\r\n                            <td align=\"left\" class=\"label\" style=\"width:150px;\">".toCharArray();
    __oracle_jsp_text[77] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[78] = 
    "</td>\r\n                            <td style=\"width:150px;\" align=\"left\" class=\"label\">".toCharArray();
    __oracle_jsp_text[79] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[80] = 
    "</td>\r\n                            <td style=\"width:150px;\"align=\"left\" class=\"label\">".toCharArray();
    __oracle_jsp_text[81] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[82] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"left\" class=\"label\" style=\"width:150px;\">".toCharArray();
    __oracle_jsp_text[83] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[84] = 
    "</td>\r\n                            <td style=\"width:150px;\" align=\"left\" class=\"label\">".toCharArray();
    __oracle_jsp_text[85] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[86] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"left\" class=\"label\">".toCharArray();
    __oracle_jsp_text[87] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[88] = 
    "</td>\r\n                            <td align=\"left\" class=\"label\">".toCharArray();
    __oracle_jsp_text[89] = 
    "</td>\r\n                            <td style=\"width:200px;\">".toCharArray();
    __oracle_jsp_text[90] = 
    "</td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <table align=\"center\" width=\"100%\" border=\"0\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend><strong>".toCharArray();
    __oracle_jsp_text[91] = 
    "</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tr>\r\n                            <td align=\"center\">\r\n                                <br/>\r\n                                <div style=\"width:1000px;overflow:auto;\">\r\n                                    <table id=\"jqGridTable\"></table>\r\n                                    <div id=\"jqGridPagger\"></div>\r\n                                </div>\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <table align=\"center\" width=\"100%\">\r\n        <tr>\r\n            <td align=\"right\" width=\"45%\">".toCharArray();
    __oracle_jsp_text[92] = 
    "</td>\r\n            <td width=\"10%\">&nbsp;</td>\r\n            <td align=\"left\" width=\"45%\">".toCharArray();
    __oracle_jsp_text[93] = 
    "</td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        var idTipoNomina = '".toCharArray();
    __oracle_jsp_text[94] = 
    "';\r\n        var idNombramiento = '".toCharArray();
    __oracle_jsp_text[95] = 
    "';\r\n        \r\n        if(idTipoNomina == 'FO' || idTipoNomina == 'FE' ){\r\n            idTipoNomina = idTipoNomina + idNombramiento;\r\n        }\r\n        \r\n        // Anular enter\r\n        function anularEnter(e) {\r\n          tecla = (document.all) ? e.keyCode : e.which;\r\n          return (tecla != 13);\r\n        }\r\n        \r\n        // Objeto json\r\n        var jsonDataString = '".toCharArray();
    __oracle_jsp_text[96] = 
    "';\r\n        jsonDataString = jsonDataString.replace(/&#034;/g,'\"');\r\n        \r\n        // Opciones para eliminar\r\n        var lastSel, grid = $j('#jqGridTable'), delSettings = {\r\n            onclickSubmit: function(options) { //, rowid) {\r\n                var grid_id = grid[0].id,\r\n                    grid_p = grid[0].p,\r\n                    newPage = grid_p.page,\r\n                    rowids = grid_p.multiselect? grid_p.selarrrow: [grid_p.selrow];\r\n                options.processing = true;\r\n                \r\n                $j.each(rowids, function () {\r\n                    grid.delRowData(this);\r\n                });\r\n                \r\n                $j.jgrid.hideModal('#delmod' + grid_id,{gb:'#gbox_' + grid_id,jqm:options.jqModal, onClose:options.onClose});\r\n    \r\n                if (grid_p.lastpage > 1) {\r\n                    if (grid_p.reccount === 0 && newPage === grid_p.lastpage) {\r\n                        newPage--;\r\n                    }\r\n                    grid.trigger('reloadGrid', [{page:newPage}]);\r\n                }\r\n                return true;\r\n            },\r\n            processing:true\r\n        };\r\n                \r\n        // Inicializar componente\r\n        if (idTipoNomina == 'SA') {\r\n            grid.jqGrid({\r\n                height: '100%',\r\n                datatype: 'jsonstring',\r\n                datastr: jsonDataString,\r\n                colNames: ['Tipo', 'Concepto', 'Monto'],\r\n                colModel:[\r\n                    {\r\n                        name:'idTipoCpto', index:'idTipoCpto', width:150, editable:true, align:'center', edittype:'select', \r\n                        editoptions:{\r\n                            dataUrl: 'jsonCallbackTipoConcepto.do?idTipoNomina=' + idTipoNomina,\r\n                            dataEvents: [\r\n                                {\r\n                                    type: 'change', fn: function(e) {\r\n                                        $j.ajax({               \r\n                                            type : 'GET',\r\n                                            url : 'jsonCallbackConceptosByTipoConcepto.do',\r\n                                            traditional : true,\r\n                                            data: 'tipoConcepto=' + this.value + '&idTipoNomina=' + idTipoNomina,\r\n                                            success : function(data){\r\n                                                if (getBrowser() == 'MSIE') {\r\n                                                    $j('#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').find('option').remove().end();\r\n                                                    $j('#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').append(data);\r\n                                                } else {\r\n                                                    $j('select#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').find('option').remove().end();\r\n                                                    $j('select#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').append(data);\r\n                                                }\r\n                                            }\r\n                                        });\r\n                                    }\r\n                                }\r\n                            ]\r\n                        }\r\n                    },\r\n                    {\r\n                        name:'concepto', index:'concepto', width:370, editable:true, align:'center', edittype: 'select',\r\n                        editoptions:{\r\n                            dataUrl: 'jsonCallbackConceptosByTipoConcepto.do?tipoConcepto=' + '&idTipoNomina=' + idTipoNomina\r\n                        }\r\n                    },\r\n                    {name:'control', index:'control', width:150, editable:true, align:'right', summaryType:'sum', sorttype:'int', formatter:'currency', formatoptions:{ prefix:'', suffix:'', thousandsSeparator:','}}\r\n                ],\r\n                rowNum: 30,\r\n                pager: '#jqGridPagger',\r\n                gridview: true,\r\n                rownumbers: false,\r\n                autoencode: true,\r\n                ignoreCase: true,\r\n                sortname: 'tipo',\r\n                viewrecords: true,\r\n                sortorder: 'desc',\r\n                caption: 'Conceptos',\r\n                editurl: 'jsonRequestConceptos.do',\r\n                onSelectRow: function(id) {\r\n                    if (id && id !== lastSel) {\r\n                        if (typeof lastSel !== 'undefined') {\r\n                            grid.jqGrid('restoreRow', lastSel);\r\n                        }\r\n                        lastSel = id;\r\n                    }\r\n                },\r\n                footerrow: true,\r\n                userDataOnFooter: true,\r\n                gridComplete: function() {\r\n                    var colSumP = grid.jqGrid('getCol', 'control', true, 'sum');\r\n                    grid.jqGrid('footerData', 'set', {'control': colSumP});\r\n                }\r\n            });\r\n        } else {\r\n            // Construir combo\r\n            var buildSelect = function () {\r\n                var html = '';\r\n                for (var i = 0; i < 100; i++) {\r\n                    if (i == 99) {\r\n                        html += i + ':' + i;\r\n                    } else {\r\n                        html += i + ':' + i + ';';\r\n                    }\r\n                }\r\n                html += '';\r\n                return html;\r\n            };\r\n        \r\n            grid.jqGrid({\r\n                height: '100%',\r\n                datatype: 'jsonstring',\r\n                datastr: jsonDataString,\r\n                colNames: ['Tipo', 'Concepto', 'Beneficiario', 'Percepciones', 'Deducciones'],\r\n                colModel:[\r\n                    {\r\n                        name:'idTipoCpto', index:'idTipoCpto', width:150, editable:true, align:'center', edittype:'select', \r\n                        editoptions:{\r\n                            dataUrl: 'jsonCallbackTipoConcepto.do?idTipoNomina=' + idTipoNomina,\r\n                            dataEvents: [\r\n                                {\r\n                                    type: 'change', fn: function(e) {\r\n                                        $j.ajax({               \r\n                                            type : 'GET',\r\n                                            url : 'jsonCallbackConceptosByTipoConcepto.do',\r\n                                            traditional : true,\r\n                                            data: 'tipoConcepto=' + this.value + '&idTipoNomina=' + idTipoNomina,\r\n                                            success : function(data){\r\n                                                if (getBrowser() == 'MSIE') {\r\n                                                    $j('#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').find('option').remove().end();\r\n                                                    $j('#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').append(data);\r\n                                                } else {\r\n                                                    $j('select#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').find('option').remove().end();\r\n                                                    $j('select#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').append(data);\r\n                                                }\r\n                                            }\r\n                                        });\r\n                                    }\r\n                                }\r\n                            ]\r\n                        }\r\n                    },\r\n                    {\r\n                        name:'concepto', index:'concepto', width:370, editable:true, align:'center', edittype: 'select',\r\n                        editoptions:{\r\n                            dataUrl: 'jsonCallbackConceptosByTipoConcepto.do?tipoConcepto=' + '&idTipoNomina=' + idTipoNomina\r\n                        }\r\n                    },\r\n                    {name:'beneficiario', index:'beneficiario', width:150, editable:true, align:'center', edittype: 'select', editoptions: {value:buildSelect} },\r\n                    {name:'percepciones', index:'percepciones', width:150, editable:true, align:'right', summaryType:'sum', sorttype:'int', formatter:'currency', formatoptions:{ prefix:'', suffix:'', thousandsSeparator:','}},\r\n                    {name:'deducciones', index:'deducciones', width:150, editable:true, align:'right', summaryType:'sum', sorttype:'int', formatter:'currency', formatoptions:{ prefix:'', suffix:'', thousandsSeparator:','}}\r\n                ],\r\n                rowNum: 30,\r\n                pager: '#jqGridPagger',\r\n                gridview: true,\r\n                rownumbers: false,\r\n                autoencode: true,\r\n                ignoreCase: true,\r\n                sortname: 'tipo',\r\n                viewrecords: true,\r\n                sortorder: 'desc',\r\n                caption: 'Conceptos',\r\n                editurl: 'jsonRequestConceptos.do',\r\n                onSelectRow: function(id) {\r\n                    if (id && id !== lastSel) {\r\n                        if (typeof lastSel !== 'undefined') {\r\n                            grid.jqGrid('restoreRow', lastSel);\r\n                        }\r\n                        lastSel = id;\r\n                    }\r\n                },\r\n                footerrow: true,\r\n                userDataOnFooter: true,\r\n                gridComplete: function() {\r\n                    var colSumP = grid.jqGrid('getCol', 'percepciones', true, 'sum');\r\n                    var colSumD = grid.jqGrid('getCol', 'deducciones', true, 'sum');\r\n                    var resta = colSumP - colSumD;\r\n                    grid.jqGrid('footerData', 'set', {'deducciones': resta});\r\n                }\r\n            });\r\n        }\r\n        grid.jqGrid('navGrid', '#jqGridPagger', {edit:false,add:false,del:true}, delSettings);\r\n        grid.jqGrid('inlineNav', '#jqGridPagger');\r\n        \r\n        // Deshabilitar boton Aceptar\r\n        $j(\"#10001\").prop(\"disabled\",true);\r\n        \r\n        // Habilitar boton aceptar\r\n        $j('.ui-icon-disk').click(function(){\r\n            $j(\"#10001\").prop(\"disabled\",false);\r\n        });\r\n        \r\n        $j('.ui-icon-trash').click(function(){\r\n            $j(\"#10001\").prop(\"disabled\",false);\r\n        });\r\n        \r\n        // Deshabilitar boton editar\r\n        $j(\"#jqGridTable_iledit\").hide();\r\n        \r\n        // Obtener fila seleccionada\r\n        function getSeleccionado(id) {\r\n            var seleccionado;\r\n            if (getBrowser() == 'MSIE') {\r\n                seleccionado = $j('select[id=\"' + id + '_idTipoCpto\"]').val();\r\n            } else {\r\n                seleccionado = $j('select[id=\"' + id + '_idTipoCpto\"]').val();\r\n            }\r\n            //console.log(seleccionado);\r\n            return seleccionado;\r\n        }\r\n        \r\n        // Verificar browser\r\n        function getBrowser(){\r\n            var N=navigator.appName, ua=navigator.userAgent, tem;\r\n            var M=ua.match(/(opera|chrome|safari|firefox|msie)\\/?\\s*(\\.?\\d+(\\.\\d+)*)/i);\r\n            if(M && (tem= ua.match(/version\\/([\\.\\d]+)/i))!= null) M[2]= tem[1];\r\n            M=M? [M[1], M[2]]: [N, navigator.appVersion, '-?'];\r\n            return M[0];\r\n        }\r\n        \r\n        // Asignar json\r\n        function setJson() {\r\n            var gridData = $j('#jqGridTable').getRowData();\r\n            var postData = JSON.stringify(gridData);\r\n            $j('#postData').val(postData);\r\n        }\r\n        \r\n        // Boton enviar\r\n        $j(\"#sendButton\").click(function(){\r\n            var gridData = $j('#jqGridTable').getRowData();\r\n            var postData = JSON.stringify(gridData);\r\n            //console.log(\"JSON serialized jqGrid data:\\n\" + postData);\r\n            \r\n            $j.ajax({\r\n                url: 'jsonRequestConceptos.do',\r\n                type: 'GET',\r\n                data: 'postData=' + postData,\r\n                dataType:'local',\r\n                contentType: 'application/json; charset=utf-8',\r\n                success: function(response, textStatus, xhr) {\r\n                    //console.log(\"success\");\r\n                },\r\n                error: function(xhr, textStatus, errorThrown) {\r\n                    //console.log(\"error\");\r\n                }\r\n            });\r\n        });\r\n        \r\n        // Construir combo apartir de objeto json\r\n        var buildSelectFromJson = function (data) {\r\n            var html = '<select>', d = data.d, length = d.length, i = 0, item;\r\n            for (var i = 0; i < length; i++) {\r\n                item = d[i];\r\n                html += '<option value=\"' + item.id + '\">' + item.value + '</option>';\r\n            }\r\n            html += '</select>';\r\n            return html;\r\n        };\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
