package _web_2d_inf._jsp._nomina._movimientos._movimientonomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _cancelaPago extends com.orionserver.http.OrionHttpJspPage {


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
    _cancelaPago page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("cancelaPagoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.nomina.movimiento.cancelaPago.titulo");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.nomina.movimiento.cancelaPago.numeroFolio");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_4=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setPath("hpFolio");
                __jsp_taghandler_4.setMaxlength("10");
                __jsp_taghandler_4.setSize("13");
                __jsp_taghandler_4.setCss("numeric");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[7]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty cancelaPagoDTO.nombreEmpleado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[8]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_6.setCode("sireh.label.nomina.movimiento.cancelaPago.tipoNomina");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_6.doCatch(th);
                      } finally {
                        __jsp_taghandler_6.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                    }
                    out.write(__oracle_jsp_text[9]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_7=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_7.setJspContext(pageContext);
                      __jsp_taghandler_7.setPath("descTipoNomina");
                      __jsp_taghandler_7.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
                    }
                    out.write(__oracle_jsp_text[10]);
                  } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.nomina.movimiento.cancelaPago.rfc");
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
                org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path size maxlength");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setPath("hpRfc");
                __jsp_taghandler_9.setSize("19");
                __jsp_taghandler_9.setMaxlength("13");
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
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty cancelaPagoDTO.nombreEmpleado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[14]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_11=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_11.setJspContext(pageContext);
                      __jsp_taghandler_11.setPath("primerApellido");
                      __jsp_taghandler_11.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
                    }
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_12=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_12.setJspContext(pageContext);
                      __jsp_taghandler_12.setPath("segundoApellido");
                      __jsp_taghandler_12.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
                    }
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_13=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_13.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_13.setJspContext(pageContext);
                      __jsp_taghandler_13.setPath("nombreEmpleado");
                      __jsp_taghandler_13.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
                    }
                    out.write(__oracle_jsp_text[15]);
                  } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.label.nomina.movimiento.cancelaPago.claveDiferenciadora");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_15=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setPath("hpDifFolio");
                __jsp_taghandler_15.setMaxlength("3");
                __jsp_taghandler_15.setSize("6");
                __jsp_taghandler_15.setCss("numeric");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setCode("sireh.label.nomina.movimiento.cancelaPago.liquido");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_17=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setPath("hpNetoPago");
                __jsp_taghandler_17.setMaxlength("38");
                __jsp_taghandler_17.setSize("41");
                __jsp_taghandler_17.setCss("numericpunto");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty cancelaPagoDTO.nombreEmpleado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[21]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                      __jsp_taghandler_19.setCode("sireh.form.required.fields");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                        if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_19.doCatch(th);
                      } finally {
                        __jsp_taghandler_19.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,3);
                    }
                    out.write(__oracle_jsp_text[22]);
                  } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty cancelaPagoDTO.nombreEmpleado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[24]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_21.setCode("sireh.label.nomina.movimiento.cancelaPago.qnaPago");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                        if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_21.doCatch(th);
                      } finally {
                        __jsp_taghandler_21.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,3);
                    }
                    out.write(__oracle_jsp_text[25]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_22=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_22.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_22.setJspContext(pageContext);
                      __jsp_taghandler_22.setPath("hpQnaPago");
                      __jsp_taghandler_22.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                    }
                    out.write(__oracle_jsp_text[26]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_23.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_23.setCode("sireh.label.nomina.movimiento.cancelaPago.situacionCheque");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                        if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_23.doCatch(th);
                      } finally {
                        __jsp_taghandler_23.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,3);
                    }
                    out.write(__oracle_jsp_text[27]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_24=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_24.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_24.setJspContext(pageContext);
                      __jsp_taghandler_24.setPath("descSitPago");
                      __jsp_taghandler_24.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                    }
                    out.write(__oracle_jsp_text[28]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_25.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_25.setCode("sireh.label.nomina.movimiento.cancelaPago.motivoCancelacion");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                        if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_25.doCatch(th);
                      } finally {
                        __jsp_taghandler_25.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,3);
                    }
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_26=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_26.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_26.setJspContext(pageContext);
                      __jsp_taghandler_26.setKey("0");
                      __jsp_taghandler_26.setValue("selectList.nonValue");
                      __jsp_taghandler_26.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                    }
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_27=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_27.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_27.setJspContext(pageContext);
                      __jsp_taghandler_27.setBeanName("tcMotivoCancela");
                      __jsp_taghandler_27.setPath("idMotivoCancela");
                      __jsp_taghandler_27.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_28.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_28.setCode("sireh.label.nomina.movimiento.cancelaPago.cpcQnaAplica");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                        if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_28.doCatch(th);
                      } finally {
                        __jsp_taghandler_28.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,3);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_29=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_29.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_29.setJspContext(pageContext);
                      __jsp_taghandler_29.setKey("0");
                      __jsp_taghandler_29.setValue("selectList.nonValue");
                      __jsp_taghandler_29.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                    }
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_30=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_30.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_30.setJspContext(pageContext);
                      __jsp_taghandler_30.setBeanName("QRegControl");
                      __jsp_taghandler_30.setPath("cpcQnaAplica");
                      __jsp_taghandler_30.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                    }
                    out.write(__oracle_jsp_text[32]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_31.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_31.setCode("sireh.label.nomina.movimiento.cancelaPago.referencia");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                        if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_31.doCatch(th);
                      } finally {
                        __jsp_taghandler_31.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,3);
                    }
                    out.write(__oracle_jsp_text[33]);
                    {
                      org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path id size maxlength");
                      __jsp_taghandler_32.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_32.setPath("cpcReferencia");
                      __jsp_taghandler_32.setId("cpcReferencia");
                      __jsp_taghandler_32.setSize("29");
                      __jsp_taghandler_32.setMaxlength("18");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                        if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_32.doCatch(th);
                      } finally {
                        __jsp_taghandler_32.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,3);
                    }
                    out.write(__oracle_jsp_text[34]);
                  } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty cancelaPagoDTO.nombreEmpleado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[36]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                      __jsp_taghandler_34.setCode("sireh.form.required.fields");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                        if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_34.doCatch(th);
                      } finally {
                        __jsp_taghandler_34.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,3);
                    }
                    out.write(__oracle_jsp_text[37]);
                  } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
              }
              out.write(__oracle_jsp_text[38]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_35=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setPath("cancelaPago");
                __jsp_taghandler_35.setAction("movimientoNomina/validaCancelaPago.do");
                __jsp_taghandler_35.setValue("submit.validar");
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_36=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setPath("cancel");
                __jsp_taghandler_36.setAction("movimientoNomina/corrigeCancelaPago.do");
                __jsp_taghandler_36.setValue("submit.corregir");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[40]);
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
  private static final char __oracle_jsp_text[][]=new char[41][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n    <p>\r\n        <h1>".toCharArray();
    __oracle_jsp_text[5] = 
    "</h1>\r\n    </p>\r\n    <p>&nbsp;</p>\r\n    <table align=\"center\" width=\"70%\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>&nbsp;&nbsp;Empleado&nbsp;&nbsp; </strong></legend>\r\n                    <table align=\"center\" width=\"90%\">\r\n                        <tr><td>&nbsp;</td></tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[6] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[7] = 
    "</td>\r\n                            ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                            ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\r\n                            ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                                <td align=\"right\" class=\"label\" colspan=\"2\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[17] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td colspan=\"4\">&nbsp;</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[19] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"2\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                                    <strong>".toCharArray();
    __oracle_jsp_text[22] = 
    "</strong>\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr><td>&nbsp;</td></tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table><br/>\r\n    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n        <table align=\"center\" width=\"100%\">\r\n            <tr>\r\n                <td>\r\n                    <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>&nbsp;&nbsp;Datos para cancelar el pago &nbsp;&nbsp;</strong></legend>\r\n                        <table align=\"center\" width=\"90%\" border=\"0\">\r\n                            <tr><td colspan=\"4\">&nbsp;</td></tr>\r\n                            <tr>\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[27] = 
    "</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[29] = 
    "</td>\r\n                                <td align=\"left\" colspan=\"3\">".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[31] = 
    "</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n                                <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[33] = 
    "</td>\r\n                                <td align=\"left\" class=\"label\">".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                            </tr>\r\n                            <tr><td colspan=\"4\">&nbsp;</td></tr>\r\n                        </table>\r\n                    </fieldset>\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n    <table align=\"center\" width=\"100%\" border=\"0\">\r\n        <tr>\r\n            <td colspan=\"2\" align=\"left\" height=\"20px\" valign=\"middle\">\r\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                    <strong>".toCharArray();
    __oracle_jsp_text[37] = 
    "</strong>\r\n                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[40] = 
    "                \r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(document).ready(function(){\r\n        \r\n            $j('.numeric').numeric();\r\n            $j('.numericpunto').numeric({allow:\".\"});\r\n            \r\n            $j(\"#10002\").attr('disabled','true');\r\n            \r\n            $j(\"#cpcReferencia\").click(function(){\r\n                $j(\"#10001\").attr('disabled','true');\r\n                $j(\"#10002\").removeAttr('disabled');\r\n            });\r\n            \r\n        });\r\n    </script>\r\n    \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
