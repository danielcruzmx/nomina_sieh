package _web_2d_inf._jsp._plaza._estructura._plazaestructura;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _cambioSitPlaza extends com.orionserver.http.OrionHttpJspPage {


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
    _cambioSitPlaza page = this;
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
        __jsp_taghandler_1.setModelAttribute("cambioSitPlazaDTO");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setCode("sireh.label.plaza.gestion.titulo.link");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.plaza.estructura.titulo.link");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.plaza.movimientosNomina.titulo.link");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setCode("sireh.label.plaza.estructura.cambioSitPlaza.titulo");
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
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cambioSitPlazaDTO.datosFisicos}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[11]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_9.setCode("sireh.label.plaza.estructura.cambioSitPlaza.titulo.datosFisicos");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_9.doCatch(th);
                      } finally {
                        __jsp_taghandler_9.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                    }
                    out.write(__oracle_jsp_text[12]);
                  } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cambioSitPlazaDTO.datosPresupuestales}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[14]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_11.setCode("sireh.label.plaza.estructura.cambioSitPlaza.titulo.datosPresupuestales");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_11.doCatch(th);
                      } finally {
                        __jsp_taghandler_11.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idPlaza");
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
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_13=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setPath("idPlaza");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                _oracle._jsp._tag._detalleCalculoNomina_tag __jsp_taghandler_14=(_oracle._jsp._tag._detalleCalculoNomina_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._detalleCalculoNomina_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPlaza((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cambioSitPlazaDTO.idPlaza}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_14.setImage("detail.gif");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idSitPlaza");
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
              out.write(__oracle_jsp_text[20]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_16=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setPath("idSitPlaza");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idUnidad");
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
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_18=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("idUnidadLabel");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idPuesto");
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
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_20=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setPath("idPuestoLabel");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idEdo");
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
              out.write(__oracle_jsp_text[26]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_22=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setPath("idEdoLabel");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cambioSitPlazaDTO.datosFisicos}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[28]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_24.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idMuni");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                        if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_24.doCatch(th);
                      } finally {
                        __jsp_taghandler_24.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,3);
                    }
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_25=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_25.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_25.setJspContext(pageContext);
                      __jsp_taghandler_25.setPath("idMuniLabel");
                      __jsp_taghandler_25.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                  } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
              }
              out.write(__oracle_jsp_text[31]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cambioSitPlazaDTO.datosPresupuestales}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[32]);
                  } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
              }
              out.write(__oracle_jsp_text[33]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_27=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idNivelFisico");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                  if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_27.doCatch(th);
                } finally {
                  __jsp_taghandler_27.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
              }
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_28=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setJspContext(pageContext);
                __jsp_taghandler_28.setPath("nivelFisicoLabel");
                __jsp_taghandler_28.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setCode("sireh.label.plaza.estructura.cambioSitPlaza.nombramiento");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                  if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_29.doCatch(th);
                } finally {
                  __jsp_taghandler_29.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,2);
              }
              out.write(__oracle_jsp_text[36]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_30=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setPath("nombramientoLabel");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idZonaEco");
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
              out.write(__oracle_jsp_text[38]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_32=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setPath("idZonaEcoLabel");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idRango");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                  if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_33.doCatch(th);
                } finally {
                  __jsp_taghandler_33.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
              }
              out.write(__oracle_jsp_text[40]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_34=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setPath("idRangoLabel");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[41]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setCode("sireh.label.plaza.estructura.cambioSitPlaza.sueldo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                  if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_35.doCatch(th);
                } finally {
                  __jsp_taghandler_35.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,2);
              }
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_36=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setPath("sueldoLabel");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("sireh.label.plaza.estructura.cambioSitPlaza.compensacion");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                  if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_37.doCatch(th);
                } finally {
                  __jsp_taghandler_37.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,2);
              }
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_38=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setPath("compensacionLabel");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cambioSitPlazaDTO.datosPresupuestales}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[46]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_40=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_40.setCode("sireh.label.plaza.estructura.cambioSitPlaza.proyecto");
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
                    out.write(__oracle_jsp_text[47]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_41=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_41.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_41.setJspContext(pageContext);
                      __jsp_taghandler_41.setPath("idProyAmpliaPre");
                      __jsp_taghandler_41.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
                    }
                    out.write(__oracle_jsp_text[48]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_42.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_42.setCode("sireh.label.plaza.estructura.cambioSitPlaza.proyectoReduccion");
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
                    out.write(__oracle_jsp_text[49]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_43=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_43.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_43.setJspContext(pageContext);
                      __jsp_taghandler_43.setPath("idProyReducePre");
                      __jsp_taghandler_43.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
                    }
                    out.write(__oracle_jsp_text[50]);
                  } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setCode("sireh.label.plaza.estructura.cambioSitPlaza.titulo");
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
              out.write(__oracle_jsp_text[52]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_45=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idSitPlazaOrigen");
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
              out.write(__oracle_jsp_text[53]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_46=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setJspContext(pageContext);
                __jsp_taghandler_46.setPath("descSitPlaza");
                __jsp_taghandler_46.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_46, pageContext);
              }
              out.write(__oracle_jsp_text[54]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setCode("sireh.label.plaza.estructura.cambioSitPlaza.idSitPlazaDestino");
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
              out.write(__oracle_jsp_text[55]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_48=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setJspContext(pageContext);
                __jsp_taghandler_48.setProperty("idSitPlazaOrigen");
                __jsp_taghandler_48.setCondition("=");
                __jsp_taghandler_48.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_48, pageContext);
              }
              out.write(__oracle_jsp_text[56]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_49=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setJspContext(pageContext);
                __jsp_taghandler_49.setKey("");
                __jsp_taghandler_49.setValue("selectList.nonValue");
                __jsp_taghandler_49.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
              }
              out.write(__oracle_jsp_text[57]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_50=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setJspContext(pageContext);
                __jsp_taghandler_50.setBeanName("tcSituacionOk");
                __jsp_taghandler_50.setPath("idSitPlazaDestino");
                __jsp_taghandler_50.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
              }
              out.write(__oracle_jsp_text[58]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_51=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setCode("sireh.label.plaza.estructura.cambioSitPlaza.ultimoMovto");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                  if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_51.doCatch(th);
                } finally {
                  __jsp_taghandler_51.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,2);
              }
              out.write(__oracle_jsp_text[59]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_52=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setJspContext(pageContext);
                __jsp_taghandler_52.setPath("ultimoMovto");
                __jsp_taghandler_52.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
              }
              out.write(__oracle_jsp_text[60]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_53=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setCode("sireh.label.plaza.estructura.cambioSitPlaza.plazaIniCont");
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
              out.write(__oracle_jsp_text[61]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_54=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setJspContext(pageContext);
                __jsp_taghandler_54.setPath("plazaIniCont");
                __jsp_taghandler_54.setSize("10");
                __jsp_taghandler_54.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_55=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_56=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setJspContext(pageContext);
                __jsp_taghandler_56.setAction("plazaEstructura/updateCambioSitPlaza.do");
                __jsp_taghandler_56.setValue("submit.accept");
                __jsp_taghandler_56.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_56, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_57=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setJspContext(pageContext);
                __jsp_taghandler_57.setPath("cancel");
                __jsp_taghandler_57.setAction("plazaEstructura/consultaCambioSitPlaza.do");
                __jsp_taghandler_57.setValue("submit.cancel");
                __jsp_taghandler_57.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_57, pageContext);
              }
              out.write(__oracle_jsp_text[65]);
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
  private static final char __oracle_jsp_text[][]=new char[66][];
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
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[7] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" width=\"100%\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                            <strong>&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[12] = 
    "&nbsp;&nbsp;</strong>\r\n                        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            <strong>&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[15] = 
    "&nbsp;&nbsp;</strong>\r\n                        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                    </legend>\r\n                    <table align=\"center\" width=\"100%\" border=\"0\">\r\n                        <colgroup>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"30%\"/>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"30%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[17] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[18] = 
    "&nbsp;".toCharArray();
    __oracle_jsp_text[19] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[27] = 
    "</td>\r\n                            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[29] = 
    "</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n                            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                <td align=\"left\" colspan=\"2\"></td>\r\n                            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[35] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[37] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[38] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[39] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[40] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[41] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[42] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[43] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[45] = 
    "</td>\r\n                        </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                            <tr>\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[47] = 
    "</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[48] = 
    "</td>\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[49] = 
    "</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[50] = 
    "</td>\r\n                            </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td height=\"10px\"></td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[52] = 
    "&nbsp;&nbsp; </strong>\r\n                    </legend>\r\n                    <table align=\"center\" width=\"100%\" border=\"0\">\r\n                        <colgroup>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"30%\"/>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"30%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[53] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[54] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[55] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[59] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[60] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[61] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[62] = 
    "</td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[63] = 
    "</td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table align=\"center\" width=\"100%\" border=\"0\">\r\n                    <tr>\r\n                        <td align=\"right\">\r\n                            ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                        </td>\r\n                        <td align=\"left\">\r\n                            ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
