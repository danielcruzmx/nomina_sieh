package _web_2d_inf._jsp._plaza._estructura._plazaestructura;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _liberaPlaza extends com.orionserver.http.OrionHttpJspPage {


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
    _liberaPlaza page = this;
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
        __jsp_taghandler_1.setModelAttribute("liberaPlazaDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("datosFisicos");
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
                __jsp_taghandler_3.setPath("datosPresupuestales");
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
                __jsp_taghandler_4.setPath("inicioQuincenaCaptura");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("finQuincenaCaptura");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("beanNamePuesto");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("idPtoOrigen");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("idSitPlazaDestino");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setPath("idVacancia");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setPath("idVacanciaAux");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.plaza.gestion.titulo.link");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.plaza.estructura.titulo.link");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.plaza.movimientosNomina.titulo.link");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.label.plaza.estructura.liberaPlaza.titulo");
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
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${liberaPlazaDTO.datosPresupuestales}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[18]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                      __jsp_taghandler_16.setCode("sireh.label.plaza.estructura.liberaPlaza.titulo.datosPresupuestales");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                        if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_16.doCatch(th);
                      } finally {
                        __jsp_taghandler_16.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,3);
                    }
                    out.write(__oracle_jsp_text[19]);
                  } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.plaza.estructura.liberaPlaza.idPlaza");
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
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_18=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("idPlaza");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._detalleCalculoNomina_tag __jsp_taghandler_19=(_oracle._jsp._tag._detalleCalculoNomina_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._detalleCalculoNomina_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setPlaza((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${liberaPlazaDTO.idPlaza}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_19.setImage("detail.gif");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.plaza.estructura.liberaPlaza.idSitPlaza");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                  if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_20.doCatch(th);
                } finally {
                  __jsp_taghandler_20.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_21=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setPath("idSitPlaza");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setCode("sireh.label.plaza.estructura.liberaPlaza.idUnidad");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                  if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_22.doCatch(th);
                } finally {
                  __jsp_taghandler_22.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
              }
              out.write(__oracle_jsp_text[26]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_23=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setPath("idUnidadLabel");
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setCode("sireh.label.plaza.estructura.liberaPlaza.idPuesto");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                  if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_24.doCatch(th);
                } finally {
                  __jsp_taghandler_24.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_25=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setPath("idPuestoLabel");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setCode("sireh.label.plaza.estructura.liberaPlaza.idEdo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                  if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_26.doCatch(th);
                } finally {
                  __jsp_taghandler_26.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
              }
              out.write(__oracle_jsp_text[30]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_27=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setPath("idEdoLabel");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setCode("sireh.label.plaza.estructura.liberaPlaza.idNivelFisico");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                  if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_28.doCatch(th);
                } finally {
                  __jsp_taghandler_28.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
              }
              out.write(__oracle_jsp_text[32]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_29=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setPath("nivelFisicoLabel");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[33]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.plaza.estructura.liberaPlaza.nombramiento");
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
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_31=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setPath("nombramientoLabel");
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setCode("sireh.label.plaza.estructura.liberaPlaza.idZonaEco");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                  if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_32.doCatch(th);
                } finally {
                  __jsp_taghandler_32.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,2);
              }
              out.write(__oracle_jsp_text[36]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_33=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setJspContext(pageContext);
                __jsp_taghandler_33.setPath("idZonaEcoLabel");
                __jsp_taghandler_33.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setCode("sireh.label.plaza.estructura.liberaPlaza.idRango");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                  if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_34.doCatch(th);
                } finally {
                  __jsp_taghandler_34.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,2);
              }
              out.write(__oracle_jsp_text[38]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_35=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setPath("idRangoLabel");
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_36=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setCode("sireh.label.plaza.estructura.liberaPlaza.sueldo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                  if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_36.doCatch(th);
                } finally {
                  __jsp_taghandler_36.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,2);
              }
              out.write(__oracle_jsp_text[40]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_37=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setJspContext(pageContext);
                __jsp_taghandler_37.setPath("sueldoLabel");
                __jsp_taghandler_37.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
              }
              out.write(__oracle_jsp_text[41]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setCode("sireh.label.plaza.estructura.liberaPlaza.compensacion");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                  if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_38.doCatch(th);
                } finally {
                  __jsp_taghandler_38.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,2);
              }
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_39=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setJspContext(pageContext);
                __jsp_taghandler_39.setPath("compensacionLabel");
                __jsp_taghandler_39.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_40=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setCode("sireh.label.plaza.estructura.liberaPlaza.proyecto");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                  if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_40.doCatch(th);
                } finally {
                  __jsp_taghandler_40.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,2);
              }
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_41=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setPath("idProyAmpliaPre");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setCode("sireh.label.plaza.estructura.liberaPlaza.proyectoReduccion");
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
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_43=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setJspContext(pageContext);
                __jsp_taghandler_43.setPath("idProyReducePre");
                __jsp_taghandler_43.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setCode("sireh.label.plaza.estructura.liberaPlaza.titulo");
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
              out.write(__oracle_jsp_text[48]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${liberaPlazaDTO.beanNamePuesto eq 'tcPuestoLiberaVacancia' }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[49]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_46.setCode("sireh.label.plaza.estructura.liberaPlaza.autorizacion");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                        if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_46.doCatch(th);
                      } finally {
                        __jsp_taghandler_46.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,3);
                    }
                    out.write(__oracle_jsp_text[50]);
                    {
                      org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value");
                      __jsp_taghandler_47.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_47.setPath("radioAutorizacion");
                      __jsp_taghandler_47.setValue("0");
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
                    out.write(__oracle_jsp_text[51]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_48.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_48.setCode("sireh.label.plaza.estructura.liberaPlaza.normal");
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
                    out.write(__oracle_jsp_text[52]);
                    {
                      org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_49=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value");
                      __jsp_taghandler_49.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_49.setPath("radioAutorizacion");
                      __jsp_taghandler_49.setValue("1");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                        if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_49.doCatch(th);
                      } finally {
                        __jsp_taghandler_49.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,3);
                    }
                    out.write(__oracle_jsp_text[53]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_50.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_50.setCode("sireh.label.plaza.estructura.liberaPlaza.excepcion");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                        if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_50.doCatch(th);
                      } finally {
                        __jsp_taghandler_50.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,3);
                    }
                    out.write(__oracle_jsp_text[54]);
                    {
                      org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_51=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value");
                      __jsp_taghandler_51.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_51.setPath("radioAutorizacion");
                      __jsp_taghandler_51.setValue("2");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                        if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_51.doCatch(th);
                      } finally {
                        __jsp_taghandler_51.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,3);
                    }
                    out.write(__oracle_jsp_text[55]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_52.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_52.setCode("sireh.label.plaza.estructura.liberaPlaza.administrar");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                        if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_52.doCatch(th);
                      } finally {
                        __jsp_taghandler_52.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,3);
                    }
                    out.write(__oracle_jsp_text[56]);
                  } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,2);
              }
              out.write(__oracle_jsp_text[57]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_53=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setCode("sireh.label.plaza.estructura.liberaPlaza.idUnidad");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                  if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_53.doCatch(th);
                } finally {
                  __jsp_taghandler_53.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,2);
              }
              out.write(__oracle_jsp_text[58]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_54=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setJspContext(pageContext);
                __jsp_taghandler_54.setKey("0");
                __jsp_taghandler_54.setValue("selectList.nonValue");
                __jsp_taghandler_54.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
              }
              out.write(__oracle_jsp_text[59]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_55=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setJspContext(pageContext);
                __jsp_taghandler_55.setBeanName("tcUnidadLibera");
                __jsp_taghandler_55.setPath("idUnidad");
                __jsp_taghandler_55.setStyle("width: 250px;");
                __jsp_taghandler_55.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
              }
              out.write(__oracle_jsp_text[60]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setCode("sireh.label.plaza.estructura.liberaPlaza.idPuesto");
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
              out.write(__oracle_jsp_text[61]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_57=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setJspContext(pageContext);
                __jsp_taghandler_57.setProperty("PV.ID_PTO_ORIGEN");
                __jsp_taghandler_57.setCondition("=");
                __jsp_taghandler_57.setPath("idPtoOrigen");
                __jsp_taghandler_57.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_57, pageContext);
              }
              out.write(__oracle_jsp_text[62]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_58=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setJspContext(pageContext);
                __jsp_taghandler_58.setKey("0");
                __jsp_taghandler_58.setValue("selectList.nonValue");
                __jsp_taghandler_58.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_58, pageContext);
              }
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_59=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setJspContext(pageContext);
                __jsp_taghandler_59.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${liberaPlazaDTO.beanNamePuesto}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_59.setPath("idPuesto");
                __jsp_taghandler_59.setStyle("width: 220px;");
                __jsp_taghandler_59.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_59, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_60=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setCode("sireh.label.plaza.estructura.liberaPlaza.idEdo");
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
              out.write(__oracle_jsp_text[65]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_61=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setJspContext(pageContext);
                __jsp_taghandler_61.setKey("0");
                __jsp_taghandler_61.setValue("selectList.nonValue");
                __jsp_taghandler_61.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_61, pageContext);
              }
              out.write(__oracle_jsp_text[66]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_62=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_taghandler_62.setJspContext(pageContext);
                __jsp_taghandler_62.setBeanName("tcEstado");
                __jsp_taghandler_62.setPath("idEdo");
                __jsp_taghandler_62.setStyle("width: 250px;");
                __jsp_taghandler_62.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_62, pageContext);
              }
              out.write(__oracle_jsp_text[67]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_63=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setCode("sireh.label.plaza.estructura.liberaPlaza.idMuni");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                  if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_63.doCatch(th);
                } finally {
                  __jsp_taghandler_63.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,2);
              }
              out.write(__oracle_jsp_text[68]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_64=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setJspContext(pageContext);
                __jsp_taghandler_64.setBeanName("tcMunicipio");
                __jsp_taghandler_64.setPath("idMuni");
                __jsp_taghandler_64.setParentPath("idEdo");
                __jsp_taghandler_64.setProgress("true");
                __jsp_taghandler_64.setStyle("width: 250px;");
                __jsp_taghandler_64.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_64, pageContext);
              }
              out.write(__oracle_jsp_text[69]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_65=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setCode("sireh.label.plaza.estructura.liberaPlaza.plazaIniCont");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                  if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_65.doCatch(th);
                } finally {
                  __jsp_taghandler_65.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,2);
              }
              out.write(__oracle_jsp_text[70]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_66=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_66.setParent(__jsp_taghandler_1);
                __jsp_taghandler_66.setJspContext(pageContext);
                __jsp_taghandler_66.setPath("plazaIniCont");
                __jsp_taghandler_66.setSize("10");
                __jsp_taghandler_66.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_66, pageContext);
              }
              out.write(__oracle_jsp_text[71]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_67=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_67.setParent(__jsp_taghandler_1);
                __jsp_taghandler_67.setCode("sireh.label.plaza.estructura.liberaPlaza.plazaFinCont");
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
              out.write(__oracle_jsp_text[72]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_68=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_68.setParent(__jsp_taghandler_1);
                __jsp_taghandler_68.setJspContext(pageContext);
                __jsp_taghandler_68.setPath("plazaFinCont");
                __jsp_taghandler_68.setSize("10");
                __jsp_taghandler_68.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_68, pageContext);
              }
              out.write(__oracle_jsp_text[73]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_69=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_69.setParent(__jsp_taghandler_1);
                __jsp_taghandler_69.setCode("sireh.label.plaza.estructura.liberaPlaza.checkFechaTermino.seleccionado");
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
              out.write(__oracle_jsp_text[74]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_70=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_70.setParent(__jsp_taghandler_1);
                __jsp_taghandler_70.setCode("sireh.label.plaza.estructura.liberaPlaza.checkFechaTermino");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                  if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_70.doCatch(th);
                } finally {
                  __jsp_taghandler_70.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,2);
              }
              out.write(__oracle_jsp_text[75]);
              {
                org.springframework.web.servlet.tags.form.CheckboxTag __jsp_taghandler_71=(org.springframework.web.servlet.tags.form.CheckboxTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.CheckboxTag.class,"org.springframework.web.servlet.tags.form.CheckboxTag path onclick value");
                __jsp_taghandler_71.setParent(__jsp_taghandler_1);
                __jsp_taghandler_71.setPath("checkFechaTermino");
                __jsp_taghandler_71.setOnclick("renderFechaTermino();");
                __jsp_taghandler_71.setValue("1");
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
              out.write(__oracle_jsp_text[76]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_72=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_72.setParent(__jsp_taghandler_1);
                __jsp_taghandler_72.setCode("sireh.label.plaza.estructura.liberaPlaza.idZonaEco");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                  if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_72.doCatch(th);
                } finally {
                  __jsp_taghandler_72.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,2);
              }
              out.write(__oracle_jsp_text[77]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_73=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_73.setParent(__jsp_taghandler_1);
                __jsp_taghandler_73.setJspContext(pageContext);
                __jsp_taghandler_73.setProperty("TAB.ID_RANGO");
                __jsp_taghandler_73.setCondition("contains");
                __jsp_taghandler_73.setPath("idRango");
                __jsp_taghandler_73.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_73, pageContext);
              }
              out.write(__oracle_jsp_text[78]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_74=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_74.setParent(__jsp_taghandler_1);
                __jsp_taghandler_74.setJspContext(pageContext);
                __jsp_taghandler_74.setKey("0");
                __jsp_taghandler_74.setValue("selectList.nonValue");
                __jsp_taghandler_74.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_74, pageContext);
              }
              out.write(__oracle_jsp_text[79]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_75=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_75.setParent(__jsp_taghandler_1);
                __jsp_taghandler_75.setJspContext(pageContext);
                __jsp_taghandler_75.setBeanName("zonaEconomicaLiberaPlaza");
                __jsp_taghandler_75.setPath("idZonaEco");
                __jsp_taghandler_75.setParentPath("idPuesto");
                __jsp_taghandler_75.setProgress("true");
                __jsp_taghandler_75.setStyle("width: 250px;");
                __jsp_taghandler_75.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_75, pageContext);
              }
              out.write(__oracle_jsp_text[80]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_76=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_76.setParent(__jsp_taghandler_1);
                __jsp_taghandler_76.setCode("sireh.label.plaza.estructura.liberaPlaza.idRango");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                  if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_76.doCatch(th);
                } finally {
                  __jsp_taghandler_76.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,2);
              }
              out.write(__oracle_jsp_text[81]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_77=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_77.setParent(__jsp_taghandler_1);
                __jsp_taghandler_77.setJspContext(pageContext);
                __jsp_taghandler_77.setPath("idRango");
                __jsp_taghandler_77.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_77, pageContext);
              }
              out.write(__oracle_jsp_text[82]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_78=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_78.setParent(__jsp_taghandler_1);
                __jsp_taghandler_78.setCode("sireh.label.plaza.estructura.liberaPlaza.idTipoPlaza");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                  if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_78.doCatch(th);
                } finally {
                  __jsp_taghandler_78.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,2);
              }
              out.write(__oracle_jsp_text[83]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_79=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_79.setParent(__jsp_taghandler_1);
                __jsp_taghandler_79.setJspContext(pageContext);
                __jsp_taghandler_79.setKey("0");
                __jsp_taghandler_79.setValue("selectList.nonValue");
                __jsp_taghandler_79.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_79, pageContext);
              }
              out.write(__oracle_jsp_text[84]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_80=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_80.setParent(__jsp_taghandler_1);
                __jsp_taghandler_80.setJspContext(pageContext);
                __jsp_taghandler_80.setBeanName("tcTipoPlazaLibera");
                __jsp_taghandler_80.setPath("idTipoPlaza");
                __jsp_taghandler_80.setStyle("width: 250px;");
                __jsp_taghandler_80.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_80, pageContext);
              }
              out.write(__oracle_jsp_text[85]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_81=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_81.setParent(__jsp_taghandler_1);
                __jsp_taghandler_81.setCode("sireh.label.plaza.estructura.liberaPlaza.idServPub");
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
              out.write(__oracle_jsp_text[86]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_82=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_82.setParent(__jsp_taghandler_1);
                __jsp_taghandler_82.setJspContext(pageContext);
                __jsp_taghandler_82.setKey("0");
                __jsp_taghandler_82.setValue("selectList.nonValue");
                __jsp_taghandler_82.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_82, pageContext);
              }
              out.write(__oracle_jsp_text[87]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_83=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_83.setParent(__jsp_taghandler_1);
                __jsp_taghandler_83.setJspContext(pageContext);
                __jsp_taghandler_83.setBeanName("tcTipoServPubLibera");
                __jsp_taghandler_83.setPath("idServPub");
                __jsp_taghandler_83.setStyle("width: 250px;");
                __jsp_taghandler_83.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_83, pageContext);
              }
              out.write(__oracle_jsp_text[88]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_84=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_84.setParent(__jsp_taghandler_1);
                __jsp_taghandler_84.setCode("sireh.label.plaza.estructura.liberaPlaza.idNivelFisico");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                  if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_84.doCatch(th);
                } finally {
                  __jsp_taghandler_84.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84,2);
              }
              out.write(__oracle_jsp_text[89]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_85=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_85.setParent(__jsp_taghandler_1);
                __jsp_taghandler_85.setJspContext(pageContext);
                __jsp_taghandler_85.setBeanName("nivelLiberaPlaza");
                __jsp_taghandler_85.setPath("nivelFisico");
                __jsp_taghandler_85.setParentPath("idPuesto");
                __jsp_taghandler_85.setProgress("true");
                __jsp_taghandler_85.setDisabled("true");
                __jsp_taghandler_85.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_85, pageContext);
              }
              out.write(__oracle_jsp_text[90]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_86=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_86.setParent(__jsp_taghandler_1);
                __jsp_taghandler_86.setCode("sireh.label.plaza.estructura.liberaPlaza.idInmueble");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                  if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_86.doCatch(th);
                } finally {
                  __jsp_taghandler_86.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,2);
              }
              out.write(__oracle_jsp_text[91]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_87=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_87.setParent(__jsp_taghandler_1);
                __jsp_taghandler_87.setJspContext(pageContext);
                __jsp_taghandler_87.setKey("0");
                __jsp_taghandler_87.setValue("selectList.nonValue");
                __jsp_taghandler_87.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_87, pageContext);
              }
              out.write(__oracle_jsp_text[92]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_88=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_88.setParent(__jsp_taghandler_1);
                __jsp_taghandler_88.setJspContext(pageContext);
                __jsp_taghandler_88.setBeanName("tcInmueble");
                __jsp_taghandler_88.setPath("idInmueble");
                __jsp_taghandler_88.setStyle("width: 250px;");
                __jsp_taghandler_88.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_88, pageContext);
              }
              out.write(__oracle_jsp_text[93]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_89=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_89.setParent(__jsp_taghandler_1);
                __jsp_taghandler_89.setCode("sireh.label.plaza.estructura.liberaPlaza.sueldo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                  if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_89.doCatch(th);
                } finally {
                  __jsp_taghandler_89.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89,2);
              }
              out.write(__oracle_jsp_text[94]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_90=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_90.setParent(__jsp_taghandler_1);
                __jsp_taghandler_90.setJspContext(pageContext);
                __jsp_taghandler_90.setProperty("TAB.ID_ZONA_ECON");
                __jsp_taghandler_90.setCondition("contains");
                __jsp_taghandler_90.setPath("idZonaEco");
                __jsp_taghandler_90.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_90, pageContext);
              }
              out.write(__oracle_jsp_text[95]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_91=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_91.setParent(__jsp_taghandler_1);
                __jsp_taghandler_91.setJspContext(pageContext);
                __jsp_taghandler_91.setProperty("TAB.ID_RANGO");
                __jsp_taghandler_91.setCondition("contains");
                __jsp_taghandler_91.setPath("idRango");
                __jsp_taghandler_91.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_91, pageContext);
              }
              out.write(__oracle_jsp_text[96]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_92=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_92.setParent(__jsp_taghandler_1);
                __jsp_taghandler_92.setJspContext(pageContext);
                __jsp_taghandler_92.setBeanName("sueldoLiberaPlaza");
                __jsp_taghandler_92.setPath("sueldo");
                __jsp_taghandler_92.setParentPath("idPuesto");
                __jsp_taghandler_92.setProgress("true");
                __jsp_taghandler_92.setDisabled("true");
                __jsp_taghandler_92.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_92, pageContext);
              }
              out.write(__oracle_jsp_text[97]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_93=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_93.setParent(__jsp_taghandler_1);
                __jsp_taghandler_93.setCode("sireh.label.plaza.estructura.liberaPlaza.compensacion");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                  if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_93.doCatch(th);
                } finally {
                  __jsp_taghandler_93.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93,2);
              }
              out.write(__oracle_jsp_text[98]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_94=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_94.setParent(__jsp_taghandler_1);
                __jsp_taghandler_94.setJspContext(pageContext);
                __jsp_taghandler_94.setProperty("TAB.ID_ZONA_ECON");
                __jsp_taghandler_94.setCondition("contains");
                __jsp_taghandler_94.setPath("idZonaEco");
                __jsp_taghandler_94.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_94, pageContext);
              }
              out.write(__oracle_jsp_text[99]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_95=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_95.setParent(__jsp_taghandler_1);
                __jsp_taghandler_95.setJspContext(pageContext);
                __jsp_taghandler_95.setProperty("TAB.ID_RANGO");
                __jsp_taghandler_95.setCondition("contains");
                __jsp_taghandler_95.setPath("idRango");
                __jsp_taghandler_95.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_95, pageContext);
              }
              out.write(__oracle_jsp_text[100]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_96=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_96.setParent(__jsp_taghandler_1);
                __jsp_taghandler_96.setJspContext(pageContext);
                __jsp_taghandler_96.setBeanName("compensacionLiberaPlaza");
                __jsp_taghandler_96.setPath("compensacion");
                __jsp_taghandler_96.setParentPath("idPuesto");
                __jsp_taghandler_96.setProgress("true");
                __jsp_taghandler_96.setDisabled("true");
                __jsp_taghandler_96.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_96, pageContext);
              }
              out.write(__oracle_jsp_text[101]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_97=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_97.setParent(__jsp_taghandler_1);
                __jsp_taghandler_97.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${liberaPlazaDTO.idGrupoPago == 'H'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_97.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[102]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_98=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_98.setParent(__jsp_taghandler_97);
                      __jsp_taghandler_98.setCode("sireh.label.plaza.estructura.liberaPlaza.importeHonorario");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_98.doStartTag();
                        if (__jsp_taghandler_98.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_98.doCatch(th);
                      } finally {
                        __jsp_taghandler_98.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_98,3);
                    }
                    out.write(__oracle_jsp_text[103]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_99=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_99.setParent(__jsp_taghandler_97);
                      __jsp_taghandler_99.setValue("$");
                      __jsp_tag_starteval=__jsp_taghandler_99.doStartTag();
                      if (__jsp_taghandler_99.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_99,3);
                    }
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_100=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_100.setParent(__jsp_taghandler_97);
                      __jsp_taghandler_100.setJspContext(pageContext);
                      __jsp_taghandler_100.setPath("importeHonorario");
                      __jsp_taghandler_100.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_100, pageContext);
                    }
                    out.write(__oracle_jsp_text[104]);
                  } while (__jsp_taghandler_97.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_97.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_97,2);
              }
              out.write(__oracle_jsp_text[105]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_101=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_101.setParent(__jsp_taghandler_1);
                __jsp_taghandler_101.setCode("sireh.label.plaza.estructura.liberaPlaza.plazaReferencia");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_101.doStartTag();
                  if (__jsp_taghandler_101.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_101.doCatch(th);
                } finally {
                  __jsp_taghandler_101.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_101,2);
              }
              out.write(__oracle_jsp_text[106]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_102=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_102.setParent(__jsp_taghandler_1);
                __jsp_taghandler_102.setJspContext(pageContext);
                __jsp_taghandler_102.setPath("plazaReferencia");
                __jsp_taghandler_102.setMaxlength("60");
                __jsp_taghandler_102.setSize("70");
                __jsp_taghandler_102.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_102, pageContext);
              }
              out.write(__oracle_jsp_text[107]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_103=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_103.setParent(__jsp_taghandler_1);
                __jsp_taghandler_103.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty liberaPlazaDTO.idVacanciaLabel}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_103.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[108]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_104=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_104.setParent(__jsp_taghandler_103);
                      __jsp_taghandler_104.setCode("sireh.label.plaza.estructura.liberaPlaza.sitPlazaDestino");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_104.doStartTag();
                        if (__jsp_taghandler_104.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_104.doCatch(th);
                      } finally {
                        __jsp_taghandler_104.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_104,3);
                    }
                    out.write(__oracle_jsp_text[109]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_105=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_105.setParent(__jsp_taghandler_103);
                      __jsp_taghandler_105.setJspContext(pageContext);
                      __jsp_taghandler_105.setPath("idVacanciaLabel");
                      __jsp_taghandler_105.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_105, pageContext);
                    }
                    out.write(__oracle_jsp_text[110]);
                  } while (__jsp_taghandler_103.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_103.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_103,2);
              }
              out.write(__oracle_jsp_text[111]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_106=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_106.setParent(__jsp_taghandler_1);
                __jsp_taghandler_106.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_106.doStartTag();
                  if (__jsp_taghandler_106.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_106.doCatch(th);
                } finally {
                  __jsp_taghandler_106.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_106,2);
              }
              out.write(__oracle_jsp_text[112]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_107=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_107.setParent(__jsp_taghandler_1);
                __jsp_taghandler_107.setJspContext(pageContext);
                __jsp_taghandler_107.setAction("plazaEstructura/updateLiberaPlaza.do");
                __jsp_taghandler_107.setValue("submit.accept");
                __jsp_taghandler_107.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_107, pageContext);
              }
              out.write(__oracle_jsp_text[113]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_108=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_108.setParent(__jsp_taghandler_1);
                __jsp_taghandler_108.setJspContext(pageContext);
                __jsp_taghandler_108.setPath("cancel");
                __jsp_taghandler_108.setAction("plazaEstructura/consultaLiberaPlaza.do");
                __jsp_taghandler_108.setValue("submit.cancel");
                __jsp_taghandler_108.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_108, pageContext);
              }
              out.write(__oracle_jsp_text[114]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_109=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_109.setParent(__jsp_taghandler_1);
                __jsp_taghandler_109.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${liberaPlazaDTO.checkFechaTermino}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_109.doStartTag();
                if (__jsp_taghandler_109.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_109,2);
              }
              out.write(__oracle_jsp_text[115]);
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
  private static final char __oracle_jsp_text[][]=new char[116][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n<script type=\"text/javascript\">\r\n    function renderFechaTermino() {\r\n        var seleccion = document.getElementById(\"checkFechaTermino1\").checked;\r\n    \r\n        if (seleccion) {\r\n            document.getElementById(\"spanFechaTermino\").style.display = 'none';\r\n            document.getElementById(\"spanFechaInfinita\").style.display = 'block';\r\n        } else {\r\n            document.getElementById(\"spanFechaTermino\").style.display = 'block';\r\n            document.getElementById(\"spanFechaInfinita\").style.display = 'none';\r\n        }\r\n    }\r\n</script>\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    \r\n    ".toCharArray();
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
    "\r\n    \r\n    \r\n\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[14] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[17] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" width=\"100%\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                            <strong>&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[19] = 
    "&nbsp;&nbsp;</strong>\r\n                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                    </legend>\r\n                    <table align=\"center\" width=\"100%\" border=\"0\">\r\n                        <colgroup>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"30%\"/>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"30%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[22] = 
    "&nbsp;".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[27] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[29] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[31] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"2\"></td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[33] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[35] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[37] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[38] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[39] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[40] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[41] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[42] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[43] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[45] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[46] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[47] = 
    "</td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td height=\"10px\"></td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[48] = 
    "&nbsp;&nbsp; </strong>\r\n                    </legend>\r\n                    <table align=\"center\" width=\"100%\" border=\"0\">\r\n                        <colgroup>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"30%\"/>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"30%\"/>\r\n                        </colgroup>\r\n                        ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                            <tr>\r\n                                <td></td>\r\n                                <td></td>\r\n                                     <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[50] = 
    "</td>\r\n                                    <td>\r\n                                            ".toCharArray();
    __oracle_jsp_text[51] = 
    " ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[53] = 
    " ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[55] = 
    " ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                    </td>\r\n                            </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[58] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[61] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                \r\n                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                                \r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[65] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[68] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[70] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[71] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[72] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                <table border=\"0\" >\r\n                                    <tr>\r\n                                        <td width=\"100px\">\r\n                                            <span id=\"spanFechaTermino\" style=\"width:100px\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                                            </span>\r\n                                            <span id=\"spanFechaInfinita\" style=\"width:100px\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[74] = 
    "\r\n                                            </span>\r\n                                        </td>\r\n                                        <td>\r\n                                            <span style=\"width:100px\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[76] = 
    "\r\n                                            </span>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[77] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[78] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[79] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[80] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[81] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[82] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[83] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[84] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[85] = 
    "\r\n                                <!--fsn:helpRoutine path=\"idTipoPlaza\"  \r\n                                                 maxlength=\"20\" \r\n                                                 size=\"20\" \r\n                                                 disabled=\"true\" \r\n                                                 beanName=\"tcTipoPlazaLiberaPopup\"  \r\n                                                 width=\"800\" \r\n                                                 height=\"400\"\r\n                                                 fieldMapping=\"idTipoPlaza, descripcion\"\r\n                                                 fieldMappingDTO=\"idTipoPlaza\"\r\n                                                 title=\"Seleccione el Tipo de plaza\" \r\n                                                 maxRows=\"200\" \r\n                                                 leftPosition=\"17\"\r\n                                                 topPosition=\"20\"-->\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[86] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[87] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[88] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[89] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[90] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[91] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[92] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[93] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[94] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[95] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[96] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[97] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[98] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[99] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[100] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[101] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[102] = 
    "\r\n                            <tr>\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[103] = 
    "</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[104] = 
    "</td>\r\n                                <td align=\"left\" colspan=\"2\"></td>\r\n                            </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[105] = 
    "\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[106] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"3\">".toCharArray();
    __oracle_jsp_text[107] = 
    "</td>\r\n                        </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[108] = 
    "\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[109] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[110] = 
    "</td>\r\n                        </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[111] = 
    "\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[112] = 
    "</td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table align=\"center\" width=\"90%\" border=\"0\">\r\n                    <tr>\r\n                        <td align=\"right\">\r\n                            ".toCharArray();
    __oracle_jsp_text[113] = 
    "\r\n                        </td>\r\n                        <td align=\"left\">\r\n                            ".toCharArray();
    __oracle_jsp_text[114] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <script type=\"text/javascript\">\r\n        var seleccionInicial = ".toCharArray();
    __oracle_jsp_text[115] = 
    ";\r\n        if (seleccionInicial) {\r\n            document.getElementById(\"spanFechaTermino\").style.display = 'none';\r\n            document.getElementById(\"spanFechaInfinita\").style.display = 'block';\r\n        } else {\r\n            document.getElementById(\"spanFechaTermino\").style.display = 'block';\r\n            document.getElementById(\"spanFechaInfinita\").style.display = 'none';\r\n        }\r\n        \r\n        $j(document).ready(function(){\r\n            if($j(\"#beanNamePuesto\").val() == 'tcPuestoLiberaVacancia' ){\r\n                $j(\"input[name='radioAutorizacion']\").change(function(){\r\n                    getTcPuestoVacanciaCallback();\r\n                    getTcVacanciaCallBack();\r\n                });\r\n            getTcPuestoVacanciaCallback();\r\n            getTcVacanciaCallBack();\r\n            }\r\n/*            $j(\"#radioAutorizacion2\").change(function(){\r\n                getTcPuestoVacanciaCallback();\r\n            });\r\n            $j(\"#radioAutorizacion3\").change(function(){\r\n                getTcPuestoVacanciaCallback();\r\n            });\r\n            */\r\n        });\r\n        \r\n        function getTcPuestoVacanciaCallback() {\r\n            var ptoExcepcion = $j(\"input[name='radioAutorizacion']:checked\").val();\r\n            var idPtoOrigen = $j('#idPtoOrigen').val();\r\n\r\n            $j.ajax({\r\n                url: 'getTcPuestoVacanciaCallback.do',\r\n                type: 'GET',\r\n                data: 'ptoExcepcion=' + ptoExcepcion + '&idPtoOrigen=' + idPtoOrigen,\r\n                success: function(data) {\r\n                    $j('select[id=\"idPuesto\"]').find('option').remove().end();\r\n                    $j('select[id=\"idPuesto\"]').append(data);\r\n                }\r\n            });\r\n        }\r\n        function getTcVacanciaCallBack() {\r\n            var ptoExcepcion = $j(\"input[name='radioAutorizacion']:checked\").val();\r\n            var idVacancia;\r\n            if(ptoExcepcion == 0){\r\n                idVacancia = $j(\"#idVacanciaAux\").val();\r\n            } else if (ptoExcepcion == 1) {\r\n                idVacancia = 7;\r\n            } else if (ptoExcepcion == 2) {\r\n                idVacancia = 8;\r\n            }\r\n            $j.ajax({\r\n                url: 'getTcVacanciaCallback.do',\r\n                type: 'GET',\r\n                data: 'ptoExcepcion=' + idVacancia,\r\n                success: function(data) {\r\n                    $j(\"label[for='idVacanciaLabel']\").text(data);\r\n                    $j('#idVacancia').val(idVacancia);\r\n                }\r\n            });\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
