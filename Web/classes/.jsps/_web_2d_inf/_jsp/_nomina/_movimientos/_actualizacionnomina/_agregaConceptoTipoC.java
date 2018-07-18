package _web_2d_inf._jsp._nomina._movimientos._actualizacionnomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _agregaConceptoTipoC extends com.orionserver.http.OrionHttpJspPage {


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
    _agregaConceptoTipoC page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag id name modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("agrCptsO");
        __jsp_taghandler_1.setName("agrCptsO");
        __jsp_taghandler_1.setModelAttribute("datosEmpleadoCptoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("conceptos.js");
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
                __jsp_taghandler_3.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.altaConcepto.titulo");
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
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_4=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setPath("cpcSubTipoDesc");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.rfc");
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
              out.write(__oracle_jsp_text[7]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_6=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setJspContext(pageContext);
                __jsp_taghandler_6.setPath("rfcEmpleado");
                __jsp_taghandler_6.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
              }
              out.write(__oracle_jsp_text[8]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_7=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setPath("primerApellido");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_8=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setPath("segundoApellido");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_9=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setPath("nombreEmpleado");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.descripcion");
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
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_11=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setPath("descConPag");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.concepto");
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
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_13=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setPath("idTipoCpto");
                __jsp_taghandler_13.setId("idTipoCpto");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_14=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPath("idConcepto");
                __jsp_taghandler_14.setId("idConcepto");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_15=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setPath("cpcTipoCaptura");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_16=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setPath("cpcTipoCalculo");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_17=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setPath("cpcPermanente");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_18=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("cpcSubTipo");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.sueldo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                  if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_19.doCatch(th);
                } finally {
                  __jsp_taghandler_19.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_20=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setPath("tabSueldo");
                __jsp_taghandler_20.setId("tabSueldo");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.compensacion");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                  if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_21.doCatch(th);
                } finally {
                  __jsp_taghandler_21.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_22=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setPath("tabCompensacion");
                __jsp_taghandler_22.setId("tabCompensacion");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                  if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_23.doCatch(th);
                } finally {
                  __jsp_taghandler_23.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_24=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setPath("idNivelPto");
                __jsp_taghandler_24.setId("idNivelPto");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.monto");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                  if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_25.doCatch(th);
                } finally {
                  __jsp_taghandler_25.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.cpcTipoCalculo == 'P'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[22]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_27=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_27.setJspContext(pageContext);
                      __jsp_taghandler_27.setPath("mcpMontoLabel");
                      __jsp_taghandler_27.setId("mcpMontoLabel");
                      __jsp_taghandler_27.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                    }
                    out.write(__oracle_jsp_text[23]);
                  } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.cpcTipoCalculo != 'P'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[25]);
                    {
                      org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path id readonly");
                      __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                      __jsp_taghandler_29.setPath("mcpMontoLabel");
                      __jsp_taghandler_29.setId("mcpMontoLabel");
                      __jsp_taghandler_29.setReadonly((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.montoReadOnly}",java.lang.String.class, __ojsp_varRes,null));
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                        if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_29.doCatch(th);
                      } finally {
                        __jsp_taghandler_29.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,3);
                    }
                    out.write(__oracle_jsp_text[26]);
                  } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                  if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_30.doCatch(th);
                } finally {
                  __jsp_taghandler_30.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,2);
              }
              out.write(__oracle_jsp_text[28]);
              {
                org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path size maxlength");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setPath("mcpRefCaptura");
                __jsp_taghandler_31.setSize("47");
                __jsp_taghandler_31.setMaxlength("60");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                  if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_31.doCatch(th);
                } finally {
                  __jsp_taghandler_31.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,2);
              }
              out.write(__oracle_jsp_text[29]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.idConcepto == '83'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[30]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                      __jsp_taghandler_33.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.porcentaje");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                        if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_33.doCatch(th);
                      } finally {
                        __jsp_taghandler_33.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,3);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path id");
                      __jsp_taghandler_34.setParent(__jsp_taghandler_32);
                      __jsp_taghandler_34.setPath("mcpPorcentajeLabel");
                      __jsp_taghandler_34.setId("mcpPorcentajeLabel");
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
                    out.write(__oracle_jsp_text[32]);
                  } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,2);
              }
              out.write(__oracle_jsp_text[33]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(datosEmpleadoCptoDTO.idConcepto == '29') || \r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'LP') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'NM') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'PE') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'PF') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'PI') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'NP') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'PC') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[34]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_36=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                      __jsp_taghandler_36.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.dias");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                        if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_36.doCatch(th);
                      } finally {
                        __jsp_taghandler_36.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,3);
                    }
                    out.write(__oracle_jsp_text[35]);
                    {
                      org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path id");
                      __jsp_taghandler_37.setParent(__jsp_taghandler_35);
                      __jsp_taghandler_37.setPath("mcpHorasDiasLabel");
                      __jsp_taghandler_37.setId("mcpHorasDiasLabel");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                        if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_37.doCatch(th);
                      } finally {
                        __jsp_taghandler_37.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,3);
                    }
                    out.write(__oracle_jsp_text[36]);
                  } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,2);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(datosEmpleadoCptoDTO.idConcepto == 'T0') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'T1') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'T2') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'T3') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'T4') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'T5') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'T6') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'T7') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'T8') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'T9') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'TA') ||\r\n                                              (datosEmpleadoCptoDTO.idConcepto == 'TD') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[38]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_39.setParent(__jsp_taghandler_38);
                      __jsp_taghandler_39.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.horas");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                        if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_39.doCatch(th);
                      } finally {
                        __jsp_taghandler_39.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,3);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_40=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path id");
                      __jsp_taghandler_40.setParent(__jsp_taghandler_38);
                      __jsp_taghandler_40.setPath("mcpHorasDiasLabel");
                      __jsp_taghandler_40.setId("mcpHorasDiasLabel");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                        if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_40.doCatch(th);
                      } finally {
                        __jsp_taghandler_40.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,3);
                    }
                    out.write(__oracle_jsp_text[40]);
                  } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,2);
              }
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.idTipoCpto == 'P' && datosEmpleadoCptoDTO.idConcepto == 'PD'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[41]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_42.setParent(__jsp_taghandler_41);
                      __jsp_taghandler_42.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.dias");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                        if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_42.doCatch(th);
                      } finally {
                        __jsp_taghandler_42.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,3);
                    }
                    out.write(__oracle_jsp_text[42]);
                    {
                      org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path id");
                      __jsp_taghandler_43.setParent(__jsp_taghandler_41);
                      __jsp_taghandler_43.setPath("mcpHorasDiasLabel");
                      __jsp_taghandler_43.setId("mcpHorasDiasLabel");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                        if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_43.doCatch(th);
                      } finally {
                        __jsp_taghandler_43.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,3);
                    }
                    out.write(__oracle_jsp_text[43]);
                  } while (__jsp_taghandler_41.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,2);
              }
              out.write(__oracle_jsp_text[44]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.desde");
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
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_45=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setJspContext(pageContext);
                __jsp_taghandler_45.setPath("mcpQnaIniLabel");
                __jsp_taghandler_45.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.cpcPermanente == 'NX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[47]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_47.setParent(__jsp_taghandler_46);
                      __jsp_taghandler_47.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.qnas");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                        if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_47.doCatch(th);
                      } finally {
                        __jsp_taghandler_47.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,3);
                    }
                    out.write(__oracle_jsp_text[48]);
                    {
                      org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path id size maxlength readonly");
                      __jsp_taghandler_48.setParent(__jsp_taghandler_46);
                      __jsp_taghandler_48.setPath("mcpQnaADescontar");
                      __jsp_taghandler_48.setId("mcpQnaADescontar");
                      __jsp_taghandler_48.setSize("6");
                      __jsp_taghandler_48.setMaxlength("6");
                      __jsp_taghandler_48.setReadonly("true");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                        if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_48.doCatch(th);
                      } finally {
                        __jsp_taghandler_48.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,3);
                    }
                    out.write(__oracle_jsp_text[49]);
                  } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,2);
              }
              out.write(__oracle_jsp_text[50]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.cpcPermanente == 'NX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[51]);
                  } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,2);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.hasta");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                  if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_50.doCatch(th);
                } finally {
                  __jsp_taghandler_50.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,2);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_51=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.cpcPermanente == 'NX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[54]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_52=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_52.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_52.setJspContext(pageContext);
                      __jsp_taghandler_52.setKey("");
                      __jsp_taghandler_52.setValue("selectList.nonValue");
                      __jsp_taghandler_52.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
                    }
                    out.write(__oracle_jsp_text[55]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_53=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_53.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_53.setJspContext(pageContext);
                      __jsp_taghandler_53.setBeanName("listaQuincenas");
                      __jsp_taghandler_53.setPath("mcpQnaFin");
                      __jsp_taghandler_53.setOnchange("calculaQuincenas();");
                      __jsp_taghandler_53.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
                    }
                    out.write(__oracle_jsp_text[56]);
                  } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,2);
              }
              out.write(__oracle_jsp_text[57]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_54=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.cpcPermanente != 'NX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[58]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_55=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                      __jsp_taghandler_55.setJspContext(pageContext);
                      __jsp_taghandler_55.setPath("mcpQnaFinLabel");
                      __jsp_taghandler_55.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
                    }
                    out.write(__oracle_jsp_text[59]);
                  } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,2);
              }
              out.write(__oracle_jsp_text[60]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_56=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.cpcPermanente == 'NX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[61]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_57=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
                      __jsp_taghandler_57.setParent(__jsp_taghandler_56);
                      __jsp_taghandler_57.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.mapaOpcionesRdButtons}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_57.setVar("radio");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write(__oracle_jsp_text[62]);
                            {
                              org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_58=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                              __jsp_taghandler_58.setParent(__jsp_taghandler_57);
                              __jsp_taghandler_58.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${radio.value != null}",java.lang.Boolean.class, __ojsp_varRes,null)));
                              __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[63]);
                                  {
                                    org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_59=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path id onclick value");
                                    __jsp_taghandler_59.setParent(__jsp_taghandler_58);
                                    __jsp_taghandler_59.setPath("opcionRdButton");
                                    __jsp_taghandler_59.setId("opcionRdButton");
                                    __jsp_taghandler_59.setOnclick("getRadioButtonSelectedValue(document.agrCptsO.opcionRdButton);");
                                    __jsp_taghandler_59.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${radio.value}",java.lang.Object.class, __ojsp_varRes,null));
                                    try {
                                      __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                                      if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                    } catch (Throwable th) {
                                      __jsp_taghandler_59.doCatch(th);
                                    } finally {
                                      __jsp_taghandler_59.doFinally();
                                    }
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,5);
                                  }
                                  out.write(__oracle_jsp_text[64]);
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_60=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_60.setParent(__jsp_taghandler_58);
                                    __jsp_taghandler_60.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${radio.key}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                                    if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,5);
                                  }
                                  out.write(__oracle_jsp_text[65]);
                                } while (__jsp_taghandler_58.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,4);
                            }
                            out.write(__oracle_jsp_text[66]);
                          } while (__jsp_taghandler_57.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_57.doCatch(th);
                      } finally {
                        __jsp_taghandler_57.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,3);
                    }
                    out.write(__oracle_jsp_text[67]);
                  } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,2);
              }
              out.write(__oracle_jsp_text[68]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_61=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setCode("sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.capturadoPor");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                  if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_61.doCatch(th);
                } finally {
                  __jsp_taghandler_61.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,2);
              }
              out.write(__oracle_jsp_text[69]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_62=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_taghandler_62.setJspContext(pageContext);
                __jsp_taghandler_62.setPath("usuario");
                __jsp_taghandler_62.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_62, pageContext);
              }
              out.write(__oracle_jsp_text[70]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_63=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setJspContext(pageContext);
                __jsp_taghandler_63.setPath("cpcMensaje");
                __jsp_taghandler_63.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_63, pageContext);
              }
              out.write(__oracle_jsp_text[71]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_64=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[72]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_65=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.idConcepto == '84'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[73]);
                  } while (__jsp_taghandler_65.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,2);
              }
              out.write(__oracle_jsp_text[74]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_66=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_66.setParent(__jsp_taghandler_1);
                __jsp_taghandler_66.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.idConcepto != '84'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[75]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_67=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_67.setParent(__jsp_taghandler_66);
                      __jsp_taghandler_67.setJspContext(pageContext);
                      __jsp_taghandler_67.setAction("actualizacionNomina/agregarConceptoEmpleado.do");
                      __jsp_taghandler_67.setValue("submit.accept");
                      __jsp_taghandler_67.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_67, pageContext);
                    }
                    out.write(__oracle_jsp_text[76]);
                  } while (__jsp_taghandler_66.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,2);
              }
              out.write(__oracle_jsp_text[77]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_68=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_68.setParent(__jsp_taghandler_1);
                __jsp_taghandler_68.setVar("opMenu");
                __jsp_taghandler_68.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.cpcSubTipo}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,2);
              }
              out.write(__oracle_jsp_text[78]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_69=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_69.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[79]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_70=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_70.setParent(__jsp_taghandler_69);
                      __jsp_taghandler_70.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${opMenu == 'G'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[80]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_71=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_71.setParent(__jsp_taghandler_70);
                            __jsp_taghandler_71.setVar("uri");
                            __jsp_taghandler_71.setValue("actualizacionNomina/datosEmpleadoCptoG.do");
                            __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                            if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,4);
                          }
                          out.write(__oracle_jsp_text[81]);
                        } while (__jsp_taghandler_70.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,3);
                    }
                    out.write(__oracle_jsp_text[82]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_72=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_72.setParent(__jsp_taghandler_69);
                      __jsp_taghandler_72.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${opMenu == 'T'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[83]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_73=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_73.setParent(__jsp_taghandler_72);
                            __jsp_taghandler_73.setVar("uri");
                            __jsp_taghandler_73.setValue("actualizacionNomina/datosEmpleadoCptoT.do");
                            __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                            if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,4);
                          }
                          out.write(__oracle_jsp_text[84]);
                        } while (__jsp_taghandler_72.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,3);
                    }
                    out.write(__oracle_jsp_text[85]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_74=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_74.setParent(__jsp_taghandler_69);
                      __jsp_taghandler_74.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${opMenu == 'D'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[86]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_75=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_75.setParent(__jsp_taghandler_74);
                            __jsp_taghandler_75.setVar("uri");
                            __jsp_taghandler_75.setValue("actualizacionNomina/datosEmpleadoCptoD.do");
                            __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                            if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,4);
                          }
                          out.write(__oracle_jsp_text[87]);
                        } while (__jsp_taghandler_74.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,3);
                    }
                    out.write(__oracle_jsp_text[88]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_76=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_76.setParent(__jsp_taghandler_69);
                      __jsp_taghandler_76.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${opMenu == 'R'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[89]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_77=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_77.setParent(__jsp_taghandler_76);
                            __jsp_taghandler_77.setVar("uri");
                            __jsp_taghandler_77.setValue("actualizacionNomina/datosEmpleadoCptoR.do");
                            __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                            if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,4);
                          }
                          out.write(__oracle_jsp_text[90]);
                        } while (__jsp_taghandler_76.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,3);
                    }
                    out.write(__oracle_jsp_text[91]);
                  } while (__jsp_taghandler_69.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,2);
              }
              out.write(__oracle_jsp_text[92]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_78=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_78.setParent(__jsp_taghandler_1);
                __jsp_taghandler_78.setJspContext(pageContext);
                __jsp_taghandler_78.setPath("cancel");
                __jsp_taghandler_78.setAction((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${uri}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_78.setValue("submit.cancel");
                __jsp_taghandler_78.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_78, pageContext);
              }
              out.write(__oracle_jsp_text[93]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_79=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_79.setParent(__jsp_taghandler_1);
                __jsp_taghandler_79.setPath("mcpMonto");
                __jsp_taghandler_79.setId("mcpMonto");
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
              out.write(__oracle_jsp_text[94]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_80=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_80.setParent(__jsp_taghandler_1);
                __jsp_taghandler_80.setPath("anioQnaInicial");
                __jsp_taghandler_80.setId("anioQnaInicial");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                  if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_80.doCatch(th);
                } finally {
                  __jsp_taghandler_80.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80,2);
              }
              out.write(__oracle_jsp_text[95]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_81=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_81.setParent(__jsp_taghandler_1);
                __jsp_taghandler_81.setPath("qnaQnaInicial");
                __jsp_taghandler_81.setId("qnaQnaInicial");
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
              out.write(__oracle_jsp_text[96]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_82=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_82.setParent(__jsp_taghandler_1);
                __jsp_taghandler_82.setPath("mcpQnaIni");
                __jsp_taghandler_82.setId("mcpQnaIni");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_82.doStartTag();
                  if (__jsp_taghandler_82.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_82.doCatch(th);
                } finally {
                  __jsp_taghandler_82.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_82,2);
              }
              out.write(__oracle_jsp_text[97]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_83=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_83.setParent(__jsp_taghandler_1);
                __jsp_taghandler_83.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosEmpleadoCptoDTO.cpcPermanente != 'NX'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[98]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_84=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                      __jsp_taghandler_84.setParent(__jsp_taghandler_83);
                      __jsp_taghandler_84.setPath("mcpQnaFin");
                      __jsp_taghandler_84.setId("mcpQnaFin");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                        if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_84.doCatch(th);
                      } finally {
                        __jsp_taghandler_84.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84,3);
                    }
                    out.write(__oracle_jsp_text[99]);
                  } while (__jsp_taghandler_83.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83,2);
              }
              out.write(__oracle_jsp_text[100]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_85=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_85.setParent(__jsp_taghandler_1);
                __jsp_taghandler_85.setPath("valida");
                __jsp_taghandler_85.setId("valida");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                  if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_85.doCatch(th);
                } finally {
                  __jsp_taghandler_85.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85,2);
              }
              out.write(__oracle_jsp_text[101]);
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
      out.write(__oracle_jsp_text[102]);

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
  private static final char __oracle_jsp_text[][]=new char[103][];
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
    "\r\n    <script type=\"text/javascript\" src=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "\"></script>\r\n    <h1>\r\n        <strong>\r\n            ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n        </strong>\r\n    </h1>\r\n    <p>&nbsp;</p>\r\n    <table align=\"center\" width=\"50%\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>&nbsp;&nbsp;Concepto&nbsp;&nbsp;</strong></legend>\r\n                    <table align=\"center\" width=\"90%\">\r\n                        <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[7] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[8] = 
    "&nbsp;&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[13] = 
    "&nbsp;-&nbsp;".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[17] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[19] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                        </tr>\r\n                        <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table><br/><br/>    \r\n    <table align=\"center\" width=\"80%\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>&nbsp;&nbsp;Captura&nbsp;&nbsp;</strong></legend>\r\n                    <table align=\"center\" width=\"90%\">\r\n                        <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n                        <tr>\r\n                            <td>\r\n                                <table align=\"center\" width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                                        <td align=\"left\" style=\"font-size:1.1em\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "$\r\n                                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[25] = 
    "$\r\n                                                    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                                        <td align=\"left\" width=\"37%\">".toCharArray();
    __oracle_jsp_text[29] = 
    "</td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                                <table align=\"center\" width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"right\" class=\"label\">&nbsp;".toCharArray();
    __oracle_jsp_text[31] = 
    "</td>\r\n                                        <td align=\"left\">".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n                                        <td align=\"center\" colspan=\"2\"><input type=\"button\" value=\"Calcular\" name=\"Calcula\" size=\"5\" maxlength=\"4\" id=\"calcula\" onclick=\"calculaMontoAC(document.agrCptsO.calcula);\"/></td>\r\n                                    </tr>\r\n                                </table>\r\n                                ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                <table align=\"center\" width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[35] = 
    "</td>\r\n                                        <td align=\"left\">".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n                                        <td align=\"center\" colspan=\"2\"><input type=\"button\" value=\"Calcular\" name=\"Calcular\" size=\"5\" maxlength=\"4\" id=\"calcula\" onclick=\"calculaMontoAC(document.agrCptsO.calcula);\"/></td>\r\n                                    </tr>\r\n                                </table>\r\n                                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                <table align=\"center\" width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[39] = 
    "</td>\r\n                                        <td align=\"left\">".toCharArray();
    __oracle_jsp_text[40] = 
    "</td>\r\n                                        <td align=\"center\" colspan=\"2\"><input type=\"button\" value=\"Calcular\" name=\"Calcular\" size=\"5\" maxlength=\"4\" id=\"calcula\" onclick=\"calculaMontoAC(document.agrCptsO.calcula);\"/></td>\r\n                                    </tr>\r\n                                </table>\r\n                                ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                <table align=\"center\" width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"right\" class=\"label\">*&nbsp;".toCharArray();
    __oracle_jsp_text[42] = 
    "</td>\r\n                                        <td align=\"left\">".toCharArray();
    __oracle_jsp_text[43] = 
    "</td>\r\n                                        <td align=\"center\" colspan=\"2\"><input type=\"button\" value=\"Calcular\" name=\"Calcular\" size=\"5\" maxlength=\"4\" id=\"calcula\" onclick=\"calculaMontoAC(document.agrCptsO.calcula);\"/></td>\r\n                                    </tr>\r\n                                </table>\r\n                                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr><td>&nbsp;</td></tr>\r\n                        <tr>\r\n                            <td width=\"50%\">\r\n                                <fieldset>\r\n                                <legend style=\"font-size:1.3em\"><strong>&nbsp;&nbsp;Per&iacuteodo de Aplicaci&oacuten&nbsp;&nbsp;</strong></legend>\r\n                                    <table align=\"center\" width=\"90%\">\r\n                                        <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n                                        <tr>\r\n                                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[45] = 
    "</td>\r\n                                            <td align=\"left\" width=\"70%\">".toCharArray();
    __oracle_jsp_text[46] = 
    "</td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[48] = 
    "</td>\r\n                                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[49] = 
    "</td>\r\n                                            ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td align=\"right\" class=\"label\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[51] = 
    "*&nbsp;".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[53] = 
    "</td>\r\n                                            <td align=\"left\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                                                <p style=\"font-size:1.2em\">\r\n                                                    ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                                                        <strong>".toCharArray();
    __oracle_jsp_text[59] = 
    "</strong>\r\n                                                    ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                                                </p>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n                                    </table>\r\n                                </fieldset>\r\n                            </td>\r\n                            \r\n                            <td>\r\n                                <table align=\"center\" width=\"80%\">\r\n                                    <tr>\r\n                                        <td width=\"40%\">&nbsp;</td>\r\n                                        <td>\r\n                                            <p align=\"left\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                                                        ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[65] = 
    "<br/>\r\n                                                        ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n                                            </p>\r\n                                        </td>\r\n                                        <td width=\"40%\">&nbsp;</td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td>\r\n                                <table align=\"center\" width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[69] = 
    "</td>\r\n                                        <td align=\"left\" width=\"67%\">".toCharArray();
    __oracle_jsp_text[70] = 
    "</td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                            <td align=\"center\"><p style=\"font-size:1.3em\"><strong>".toCharArray();
    __oracle_jsp_text[71] = 
    "</strong></p></td>\r\n                        </tr>\r\n                        \r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <table align=\"center\" width=\"80%\">\r\n        <tr><td colspan=\"3\" align=\"left\"><strong>".toCharArray();
    __oracle_jsp_text[72] = 
    "</strong></td></tr>\r\n        <tr>\r\n            <td align=\"right\">\r\n                ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                    <input type=\"submit\" onclick=\" return validaMontoAC(); \"  />\r\n                ".toCharArray();
    __oracle_jsp_text[74] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[76] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[77] = 
    "\r\n                \r\n            </td>\r\n            <td width=\"20%\">&nbsp;</td>\r\n            ".toCharArray();
    __oracle_jsp_text[78] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[79] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[80] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[81] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[82] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[83] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[84] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[85] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[86] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[87] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[88] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[89] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[90] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[91] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[92] = 
    "\r\n            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[93] = 
    "</td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <!--html:hidden path=\"tabSueldo\"       id=\"tabSueldo\"/-->\r\n    ".toCharArray();
    __oracle_jsp_text[94] = 
    "\r\n    <!--html:hidden path=\"tabCompensacion\"/-->\r\n    ".toCharArray();
    __oracle_jsp_text[95] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[96] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[97] = 
    "\r\n    <!--html:hidden path=\"idNivelPto\"      id=\"idNivelPto\"/-->\r\n    ".toCharArray();
    __oracle_jsp_text[98] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[99] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[100] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[101] = 
    "\r\n    \r\n    <!--no debe estar porque ya esta declarado como objeto     -->\r\n    <!--html:hidden path=\"mcpQnaADescontar\"  id=\"mcpQnaADescontar\"/-->\r\n    \r\n    <script type=\"text/javascript\">\r\n        window.document.forms[0].valida.value = true;\r\n        if(window.document.forms[0].idConcepto.value == '29' || \r\n           window.document.forms[0].idConcepto.value == 'LP' ||\r\n           window.document.forms[0].idConcepto.value == 'NM' ||\r\n           window.document.forms[0].idConcepto.value == 'PC' ){   \r\n           window.document.forms[0].mcpHorasDiasLabel.focus();   \r\n        }\r\n        else if(window.document.forms[0].idConcepto.value == '83' ){   \r\n           window.document.forms[0].mcpPorcentajeLabel.focus();   \r\n        }\r\n        else {\r\n            window.document.forms[0].mcpMontoLabel.focus();\r\n          }\r\n    </script>\r\n".toCharArray();
    __oracle_jsp_text[102] = 
    "\r\n\r\n ".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
