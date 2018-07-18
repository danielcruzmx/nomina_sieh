package _web_2d_inf._jsp._plaza._eventual._plazaeventualmasivos;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _processBaja extends com.orionserver.http.OrionHttpJspPage {


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
    _processBaja page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag name modelAttribute action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("checkBoxTest");
        __jsp_taghandler_1.setModelAttribute("plazaEventualMasivaDTO");
        __jsp_taghandler_1.setAction("processBaja.do");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.plaza.masivas.eventuales.bajas.titulo");
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
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.plaza.masivas.eventuales.bajas.titulo.busqueda");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setCode("sireh.label.plaza.masivas.eventuales.bajas.fecha.termino.vigencia");
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
                _oracle._jsp._tag._filter_tag __jsp_taghandler_5=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setJspContext(pageContext);
                __jsp_taghandler_5.setProperty("TO_NUMBER(TO_CHAR(p.plaza_fin_cont,'yyyy'))");
                __jsp_taghandler_5.setCondition("<=");
                __jsp_taghandler_5.setPath("plazaFinContYearFilter");
                __jsp_taghandler_5.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_5, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_6=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setJspContext(pageContext);
                __jsp_taghandler_6.setKey("");
                __jsp_taghandler_6.setValue("selectList.nonValue");
                __jsp_taghandler_6.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_7=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setBeanName("tcBajasEventualesFechaFinCont");
                __jsp_taghandler_7.setPath("plazaFinContString");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.plaza.masivas.eventuales.bajas.unidad.filtro");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_9=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setKey("");
                __jsp_taghandler_9.setValue("selectList.nonValue");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_10=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setBeanName("tcBajasPlazasEventualesUnidad");
                __jsp_taghandler_10.setPath("idUnidadNom");
                __jsp_taghandler_10.setParentPath("plazaFinContString");
                __jsp_taghandler_10.setProgress("true");
                __jsp_taghandler_10.setMultiple("true");
                __jsp_taghandler_10.setWidth("560");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[15]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_12=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_12.setJspContext(pageContext);
                      __jsp_taghandler_12.setPath("buscar");
                      __jsp_taghandler_12.setAction((java.lang.String) ("plazaEventualMasiva/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_12.setValue("submit.search");
                      __jsp_taghandler_12.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
                    }
                    out.write(__oracle_jsp_text[16]);
                  } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not plazaEventualMasivaDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[18]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                      __jsp_taghandler_14.setCode("sireh.form.required.fields");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_14.doCatch(th);
                      } finally {
                        __jsp_taghandler_14.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                    }
                    out.write(__oracle_jsp_text[19]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_15=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_15.setParent(__jsp_taghandler_13);
                      __jsp_taghandler_15.setJspContext(pageContext);
                      __jsp_taghandler_15.setPath("buscar");
                      __jsp_taghandler_15.setAction((java.lang.String) ("plazaEventualMasiva/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_15.setValue("submit.search");
                      __jsp_taghandler_15.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
                    }
                    out.write(__oracle_jsp_text[20]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_16=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_16.setParent(__jsp_taghandler_13);
                      __jsp_taghandler_16.setJspContext(pageContext);
                      __jsp_taghandler_16.setPath("cancel");
                      __jsp_taghandler_16.setAction((java.lang.String) ("plazaEventualMasiva/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_16.setValue("submit.clean");
                      __jsp_taghandler_16.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
                    }
                    out.write(__oracle_jsp_text[21]);
                  } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[23]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                      __jsp_taghandler_18.setCode("sireh.label.plaza.masivas.eventuales.bajas.titulo.baja");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                        if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_18.doCatch(th);
                      } finally {
                        __jsp_taghandler_18.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,3);
                    }
                    out.write(__oracle_jsp_text[24]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_19.setParent(__jsp_taghandler_17);
                      __jsp_taghandler_19.setCode("sireh.label.plaza.masivas.eventuales.bajas.fecha.baja");
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
                    out.write(__oracle_jsp_text[25]);
                    {
                      _oracle._jsp._tag._calendar_tag __jsp_taghandler_20=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                      __jsp_taghandler_20.setParent(__jsp_taghandler_17);
                      __jsp_taghandler_20.setJspContext(pageContext);
                      __jsp_taghandler_20.setPath("fechaBaja");
                      __jsp_taghandler_20.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
                    }
                    out.write(__oracle_jsp_text[26]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_21.setParent(__jsp_taghandler_17);
                      __jsp_taghandler_21.setCode("sireh.label.plaza.masivas.eventuales.altas.observaciones");
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
                    out.write(__oracle_jsp_text[27]);
                    {
                      _oracle._jsp._tag._textarea_tag __jsp_taghandler_22=(_oracle._jsp._tag._textarea_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._textarea_tag.class, pageContext);
                      __jsp_taghandler_22.setParent(__jsp_taghandler_17);
                      __jsp_taghandler_22.setJspContext(pageContext);
                      __jsp_taghandler_22.setPath("mepObserva");
                      __jsp_taghandler_22.setCols("100");
                      __jsp_taghandler_22.setRows("5");
                      __jsp_taghandler_22.setUppercase("false");
                      __jsp_taghandler_22.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                    }
                    out.write(__oracle_jsp_text[28]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_23.setParent(__jsp_taghandler_17);
                      __jsp_taghandler_23.setCode("sireh.form.required.fields");
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
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_24=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_24.setParent(__jsp_taghandler_17);
                      __jsp_taghandler_24.setJspContext(pageContext);
                      __jsp_taghandler_24.setPath("baja");
                      __jsp_taghandler_24.setAction((java.lang.String) ("plazaEventualMasiva/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_24.setValue("submit.baja");
                      __jsp_taghandler_24.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_25=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_25.setParent(__jsp_taghandler_17);
                      __jsp_taghandler_25.setJspContext(pageContext);
                      __jsp_taghandler_25.setPath("cancel");
                      __jsp_taghandler_25.setAction((java.lang.String) ("plazaEventualMasiva/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_25.setValue("submit.clean");
                      __jsp_taghandler_25.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                    }
                    out.write(__oracle_jsp_text[31]);
                  } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[33]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_27.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[34]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_28=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_28.setJspContext(pageContext);
                            __jsp_taghandler_28.setProperty("to_char(p.plaza_fin_cont,'dd/MM/yyyy')");
                            __jsp_taghandler_28.setCondition("=");
                            __jsp_taghandler_28.setPath("plazaFinContString");
                            __jsp_taghandler_28.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                          }
                          out.write(__oracle_jsp_text[35]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_29=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_29.setJspContext(pageContext);
                            __jsp_taghandler_29.setProperty("p.idUnidadNom");
                            __jsp_taghandler_29.setCondition("in");
                            __jsp_taghandler_29.setPath("idUnidadNomFilter");
                            __jsp_taghandler_29.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                          }
                          out.write(__oracle_jsp_text[36]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_30=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_30.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_30.setJspContext(pageContext);
                            __jsp_taghandler_30.setBeanName("tcBajasPlazasEventuales");
                            __jsp_taghandler_30.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_30.setAppendFilters("true");
                            __jsp_taghandler_30.setCheckbox("true");
                            __jsp_taghandler_30.setChkProperty("idPlaza");
                            __jsp_taghandler_30.setMaxRows("1000");
                            __jsp_taghandler_30.setJspBody(new _processBaja_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_30, __ojsp_varRes));
                            __jsp_taghandler_30.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                          }
                          out.write(__oracle_jsp_text[37]);
                        } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,3);
                    }
                    out.write(__oracle_jsp_text[38]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_48=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_48.setParent(__jsp_taghandler_26);
                      __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[39]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_49=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                            __jsp_taghandler_49.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                              if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_49.doCatch(th);
                            } finally {
                              __jsp_taghandler_49.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,4);
                          }
                          out.write(__oracle_jsp_text[40]);
                        } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,3);
                    }
                    out.write(__oracle_jsp_text[41]);
                  } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
              }
              out.write(__oracle_jsp_text[42]);
              {
                org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_50=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var varStatus");
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.idUnidadNomFilter}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_50.setVar("listaIdUnidadNomFilter");
                __jsp_taghandler_50.setVarStatus("status");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[43]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_51=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_51.setParent(__jsp_taghandler_50);
                        __jsp_taghandler_51.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.index}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                        if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,3);
                      }
                      out.write(__oracle_jsp_text[44]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_52=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_52.setParent(__jsp_taghandler_50);
                        __jsp_taghandler_52.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${plazaEventualMasivaDTO.idUnidadNomFilter[status.index]}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                        if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,3);
                      }
                      out.write(__oracle_jsp_text[45]);
                    } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_50.doCatch(th);
                } finally {
                  __jsp_taghandler_50.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,2);
              }
              out.write(__oracle_jsp_text[46]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_53=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setPath("plazaFinContStringHidden");
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
              out.write(__oracle_jsp_text[47]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_54=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setPath("plazaFinContYearFilter");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                  if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_54.doCatch(th);
                } finally {
                  __jsp_taghandler_54.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,2);
              }
              out.write(__oracle_jsp_text[48]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_55=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setPath("urlOrigen");
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
              out.write(__oracle_jsp_text[49]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setPath("urlDestino");
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
              out.write(__oracle_jsp_text[50]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_57=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setPath("finQuincenaCaptura");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                  if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_57.doCatch(th);
                } finally {
                  __jsp_taghandler_57.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setPath("diasRetroactividad");
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
              out.write(__oracle_jsp_text[52]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_59=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setPath("anio");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                  if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_59.doCatch(th);
                } finally {
                  __jsp_taghandler_59.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,2);
              }
              out.write(__oracle_jsp_text[53]);
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

  private class _processBaja_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _processBaja_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_30       = parent;
      out.write("\r\n                ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_31=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort form");
        __jsp_taghandler_31.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_30));
        __jsp_taghandler_31.setName("tcBajasPlazasEventuales");
        __jsp_taghandler_31.setPagesize(1000);
        __jsp_taghandler_31.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_31.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_31.setClass("displaytag");
        __jsp_taghandler_31.setExport(true);
        __jsp_taghandler_31.setUid("row");
        __jsp_taghandler_31.setSort("list");
        __jsp_taghandler_31.setForm("checkBoxTest");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_31,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_32=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey media");
                __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                __jsp_taghandler_32.setProperty("checkbox");
                __jsp_taghandler_32.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.excluir");
                __jsp_taghandler_32.setMedia("html");
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_33=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_33.setParent(__jsp_taghandler_31);
                __jsp_taghandler_33.setProperty("idPlaza");
                __jsp_taghandler_33.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.plaza");
                __jsp_taghandler_33.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_34=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_34.setParent(__jsp_taghandler_31);
                __jsp_taghandler_34.setProperty("idPuestoNom");
                __jsp_taghandler_34.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.puesto");
                __jsp_taghandler_34.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_35.setParent(__jsp_taghandler_31);
                __jsp_taghandler_35.setProperty("idZonaEcoNom");
                __jsp_taghandler_35.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.zona");
                __jsp_taghandler_35.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_36=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_36.setParent(__jsp_taghandler_31);
                __jsp_taghandler_36.setProperty("idUnidadNom");
                __jsp_taghandler_36.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.unidad");
                __jsp_taghandler_36.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_37=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_37.setParent(__jsp_taghandler_31);
                __jsp_taghandler_37.setProperty("idNombramiento");
                __jsp_taghandler_37.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.nombramiento");
                __jsp_taghandler_37.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_38=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_38.setParent(__jsp_taghandler_31);
                __jsp_taghandler_38.setProperty("idJerarquia");
                __jsp_taghandler_38.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.jerarquia");
                __jsp_taghandler_38.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_39=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_39.setParent(__jsp_taghandler_31);
                __jsp_taghandler_39.setProperty("idNivelPto");
                __jsp_taghandler_39.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.nivel");
                __jsp_taghandler_39.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_40=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_40.setParent(__jsp_taghandler_31);
                __jsp_taghandler_40.setProperty("idSitPlaza");
                __jsp_taghandler_40.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.situacion.plaza");
                __jsp_taghandler_40.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_41=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format");
                __jsp_taghandler_41.setParent(__jsp_taghandler_31);
                __jsp_taghandler_41.setProperty("plazaIniCont");
                __jsp_taghandler_41.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.inicio");
                __jsp_taghandler_41.setSortable(true);
                __jsp_taghandler_41.setFormat("{0,date,dd-MM-yyyy}");
                __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_42=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format");
                __jsp_taghandler_42.setParent(__jsp_taghandler_31);
                __jsp_taghandler_42.setProperty("plazaFinCont");
                __jsp_taghandler_42.setTitleKey("sireh.label.plaza.masivas.eventuales.bajas.vigencia");
                __jsp_taghandler_42.setSortable(true);
                __jsp_taghandler_42.setFormat("{0,date,dd-MM-yyyy}");
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_43=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_43.setParent(__jsp_taghandler_31);
                __jsp_taghandler_43.setName("paging.banner.placement");
                __jsp_taghandler_43.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_44=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_44.setParent(__jsp_taghandler_31);
                __jsp_taghandler_44.setName("export.pdf");
                __jsp_taghandler_44.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_45=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_45.setParent(__jsp_taghandler_31);
                __jsp_taghandler_45.setName("export.excel");
                __jsp_taghandler_45.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_46=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_46.setParent(__jsp_taghandler_31);
                __jsp_taghandler_46.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_46,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_47.setParent(__jsp_taghandler_46);
                        __jsp_taghandler_47.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                          if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_47.doCatch(th);
                        } finally {
                          __jsp_taghandler_47.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,7);
                      }
                      out.write("<br/><br/></span>\r\n                        ");
                    } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,6);
              }
              out.write("\r\n                 ");
            } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,5);
      }
      out.write("\r\n             \r\n            ");
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

  private static final char __oracle_jsp_text[][]=new char[54][];
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
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n\r\n    <h1>".toCharArray();
    __oracle_jsp_text[6] = 
    "</h1>  \r\n    <p>&nbsp;</p>\r\n    <table width=\"75%\" align=\"center\">\r\n        <tr> \r\n            <td>\r\n                <fieldset>\r\n                    <legend>\r\n                        <strong>&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[7] = 
    "&nbsp;&nbsp;</strong>\r\n                    </legend>\r\n                    <table width=\"100%\" border=\"0\" align=\"center\">\r\n                        <tr>   \r\n                            <td class=\"label\"> * ".toCharArray();
    __oracle_jsp_text[8] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td >\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n                <table width=\"100%\" align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                    <tr>\r\n                        <td align=\"center\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                    </tr>\r\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                        <tr>\r\n                            <td colspan=\"2\" align=\"left\" height=\"20px\" valign=\"middle\">\r\n                                <strong>\r\n                                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                </strong>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                        </tr>\r\n                    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                </table>\r\n                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                    <fieldset>\r\n                        <legend>\r\n                            <strong>&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[24] = 
    "&nbsp;&nbsp;</strong>\r\n                        </legend>\r\n                        <table width=\"100%\" align=\"center\" border=\"0\">\r\n                            <tr>   \r\n                                <td class=\"label\"> * ".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>     \r\n                            </tr>\r\n                            <tr>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[27] = 
    "</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[28] = 
    " </td>\r\n                            </tr>\r\n                        </table>\r\n                    </fieldset>\r\n                    <table width=\"100%\" align=\"center\">\r\n                        <tr>\r\n                            <td colspan=\"2\" align=\"left\" height=\"20px\" valign=\"middle\">\r\n                                <strong>\r\n                                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                </strong>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\">".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[31] = 
    "</td>\r\n                        </tr>\r\n                    </table>\r\n                ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n            <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[40] = 
    "<br/><br/></span>\r\n        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n    \r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n        <input type=\"hidden\" name=\"idUnidadNomFilter[".toCharArray();
    __oracle_jsp_text[44] = 
    "]\" value=\"".toCharArray();
    __oracle_jsp_text[45] = 
    "\" />\r\n    ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n    \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
