package _web_2d_inf._jsp._expediente._gestion._expedientes;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _edicionUsuarios extends com.orionserver.http.OrionHttpJspPage {


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
    _edicionUsuarios page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("usuariosAutorizadosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.oficinaVirtual.gestionExpedientes.edicionUsuarios");
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
                __jsp_taghandler_3.setCode("sireh.label.oficinaVirtual.gestionExpedientes.idUnidadNom");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_4=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setKey("");
                __jsp_taghandler_4.setValue("selectList.nonValue");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[8]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_5=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setJspContext(pageContext);
                __jsp_taghandler_5.setBeanName("tcUnidadSinCiclo");
                __jsp_taghandler_5.setPath("idUnidadNom");
                __jsp_taghandler_5.setStyle("width:200px;");
                __jsp_taghandler_5.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_5, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.oficinaVirtual.gestionExpedientes.rfcEmpleado");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_7=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setPath("rfcEmpleado");
                __jsp_taghandler_7.setMaxlength("13");
                __jsp_taghandler_7.setSize("60");
                __jsp_taghandler_7.setCss("anchoInput alphanumeric");
                __jsp_taghandler_7.setUppercase("true");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.oficinaVirtual.gestionExpedientes.nombreEmpleado");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_9=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setPath("nombreEmpleado");
                __jsp_taghandler_9.setMaxlength("40");
                __jsp_taghandler_9.setSize("60");
                __jsp_taghandler_9.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_9.setUppercase("true");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.oficinaVirtual.gestionExpedientes.primerApellido");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_11=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setPath("primerApellido");
                __jsp_taghandler_11.setMaxlength("40");
                __jsp_taghandler_11.setSize("60");
                __jsp_taghandler_11.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_11.setUppercase("true");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.oficinaVirtual.gestionExpedientes.segundoApellido");
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
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_13=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setPath("segundoApellido");
                __jsp_taghandler_13.setMaxlength("40");
                __jsp_taghandler_13.setSize("60");
                __jsp_taghandler_13.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_13.setUppercase("true");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_14=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPath("muestraRegistros");
                __jsp_taghandler_14.setAction((java.lang.String) ("gestionExpediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuariosAutorizadosDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_14.setValue("submit.search");
                __jsp_taghandler_14.setProgressBar("true");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_15=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setPath("cancel");
                __jsp_taghandler_15.setAction((java.lang.String) ("gestionExpediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuariosAutorizadosDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_15.setValue("submit.clean");
                __jsp_taghandler_15.setProgressBar("true");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[20]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                      __jsp_taghandler_17.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuariosAutorizadosDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[21]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_18=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_18.setJspContext(pageContext);
                            __jsp_taghandler_18.setProperty("e.RFC_EMPLEADO");
                            __jsp_taghandler_18.setCondition("contains");
                            __jsp_taghandler_18.setPath("rfcEmpleado");
                            __jsp_taghandler_18.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
                          }
                          out.write(__oracle_jsp_text[22]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_19=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_19.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_19.setJspContext(pageContext);
                            __jsp_taghandler_19.setProperty("e.NOMBRE_EMPLEADO");
                            __jsp_taghandler_19.setCondition("contains");
                            __jsp_taghandler_19.setPath("nombreEmpleado");
                            __jsp_taghandler_19.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
                          }
                          out.write(__oracle_jsp_text[23]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_20=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_20.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_20.setJspContext(pageContext);
                            __jsp_taghandler_20.setProperty("e.PRIMER_APELLIDO");
                            __jsp_taghandler_20.setCondition("contains");
                            __jsp_taghandler_20.setPath("primerApellido");
                            __jsp_taghandler_20.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
                          }
                          out.write(__oracle_jsp_text[24]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_21=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_21.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_21.setJspContext(pageContext);
                            __jsp_taghandler_21.setProperty("e.SEGUNDO_APELLIDO");
                            __jsp_taghandler_21.setCondition("contains");
                            __jsp_taghandler_21.setPath("segundoApellido");
                            __jsp_taghandler_21.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                          }
                          out.write(__oracle_jsp_text[25]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_22=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_22.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_22.setJspContext(pageContext);
                            __jsp_taghandler_22.setProperty("p.ID_UNIDAD_NOM");
                            __jsp_taghandler_22.setCondition("=");
                            __jsp_taghandler_22.setPath("idUnidadNom");
                            __jsp_taghandler_22.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                          }
                          out.write(__oracle_jsp_text[26]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_23=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_23.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_23.setJspContext(pageContext);
                            __jsp_taghandler_23.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuariosAutorizadosDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_23.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuariosAutorizadosDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_23.setAppendFilters("false");
                            __jsp_taghandler_23.setMaxRows("200");
                            __jsp_taghandler_23.setJspBody(new _edicionUsuarios_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_23, __ojsp_varRes));
                            __jsp_taghandler_23.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                          }
                          out.write(__oracle_jsp_text[27]);
                        } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,3);
                    }
                    out.write(__oracle_jsp_text[28]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_35.setParent(__jsp_taghandler_16);
                      __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[29]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_36=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                            __jsp_taghandler_36.setCode("pagedList.empty.content");
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
                          out.write(__oracle_jsp_text[30]);
                        } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,3);
                    }
                    out.write(__oracle_jsp_text[31]);
                  } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuariosAutorizadosDTO.consultar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[33]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_38.setCode("sireh.label.oficinaVirtual.gestionExpedientes.nombreEmpleado");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                        if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_38.doCatch(th);
                      } finally {
                        __jsp_taghandler_38.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,3);
                    }
                    out.write(__oracle_jsp_text[34]);
                    {
                      _oracle._jsp._tag._input_tag __jsp_taghandler_39=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                      __jsp_taghandler_39.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_39.setJspContext(pageContext);
                      __jsp_taghandler_39.setPath("usuNombreEmpleado");
                      __jsp_taghandler_39.setMaxlength("40");
                      __jsp_taghandler_39.setReadonly("true");
                      __jsp_taghandler_39.setSize("60");
                      __jsp_taghandler_39.setCss("anchoInput alphaEspacios");
                      __jsp_taghandler_39.setUppercase("true");
                      __jsp_taghandler_39.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
                    }
                    out.write(__oracle_jsp_text[35]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_40=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_40.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_40.setCode("sireh.label.oficinaVirtual.gestionExpedientes.primerApellido");
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
                    out.write(__oracle_jsp_text[36]);
                    {
                      _oracle._jsp._tag._input_tag __jsp_taghandler_41=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                      __jsp_taghandler_41.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_41.setJspContext(pageContext);
                      __jsp_taghandler_41.setPath("usuPrimerApellido");
                      __jsp_taghandler_41.setMaxlength("40");
                      __jsp_taghandler_41.setReadonly("true");
                      __jsp_taghandler_41.setSize("60");
                      __jsp_taghandler_41.setCss("anchoInput alphaEspacios");
                      __jsp_taghandler_41.setUppercase("true");
                      __jsp_taghandler_41.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
                    }
                    out.write(__oracle_jsp_text[37]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_42.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_42.setCode("sireh.label.oficinaVirtual.gestionExpedientes.segundoApellido");
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
                    out.write(__oracle_jsp_text[38]);
                    {
                      _oracle._jsp._tag._input_tag __jsp_taghandler_43=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                      __jsp_taghandler_43.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_43.setJspContext(pageContext);
                      __jsp_taghandler_43.setPath("usuSegundoApellido");
                      __jsp_taghandler_43.setMaxlength("40");
                      __jsp_taghandler_43.setReadonly("true");
                      __jsp_taghandler_43.setSize("60");
                      __jsp_taghandler_43.setCss("anchoInput alphaEspacios");
                      __jsp_taghandler_43.setUppercase("true");
                      __jsp_taghandler_43.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_44.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_44.setCode("sireh.label.oficinaVirtual.gestionExpedientes.usuDoctoAutorizacion");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                        if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_44.doCatch(th);
                      } finally {
                        __jsp_taghandler_44.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,3);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      _oracle._jsp._tag._input_tag __jsp_taghandler_45=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                      __jsp_taghandler_45.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_45.setJspContext(pageContext);
                      __jsp_taghandler_45.setPath("usuDoctoAutorizacion");
                      __jsp_taghandler_45.setMaxlength("100");
                      __jsp_taghandler_45.setSize("60");
                      __jsp_taghandler_45.setCss("anchoInput");
                      __jsp_taghandler_45.setUppercase("true");
                      __jsp_taghandler_45.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
                    }
                    out.write(__oracle_jsp_text[41]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_46.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_46.setCode("sireh.label.oficinaVirtual.gestionExpedientes.usuFechaAutorizacion");
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
                    out.write(__oracle_jsp_text[42]);
                    {
                      _oracle._jsp._tag._calendar_tag __jsp_taghandler_47=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                      __jsp_taghandler_47.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_47.setJspContext(pageContext);
                      __jsp_taghandler_47.setPath("usuFechaAutorizacion");
                      __jsp_taghandler_47.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
                    }
                    out.write(__oracle_jsp_text[43]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_48.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_48.setCode("sireh.label.oficinaVirtual.gestionExpedientes.usuTelefono");
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
                    out.write(__oracle_jsp_text[44]);
                    {
                      _oracle._jsp._tag._input_tag __jsp_taghandler_49=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                      __jsp_taghandler_49.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_49.setJspContext(pageContext);
                      __jsp_taghandler_49.setPath("usuTelefono");
                      __jsp_taghandler_49.setMaxlength("25");
                      __jsp_taghandler_49.setSize("60");
                      __jsp_taghandler_49.setCss("anchoInput");
                      __jsp_taghandler_49.setUppercase("true");
                      __jsp_taghandler_49.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
                    }
                    out.write(__oracle_jsp_text[45]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_50.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_50.setCode("sireh.label.oficinaVirtual.gestionExpedientes.usuStatusAutorizacion");
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
                    out.write(__oracle_jsp_text[46]);
                    {
                      org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_51=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                      __jsp_taghandler_51.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_51.setPath("idStatus");
                      __jsp_taghandler_51.setValue("ACT");
                      __jsp_taghandler_51.setLabel(" Activo");
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
                    out.write(__oracle_jsp_text[47]);
                    {
                      org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                      __jsp_taghandler_52.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_52.setPath("idStatus");
                      __jsp_taghandler_52.setValue("INA");
                      __jsp_taghandler_52.setLabel(" Inactivo");
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
                    out.write(__oracle_jsp_text[48]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_53=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_53.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_53.setCode("sireh.form.required.fields");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                        if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_53.doCatch(th);
                      } finally {
                        __jsp_taghandler_53.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,3);
                    }
                    out.write(__oracle_jsp_text[49]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_54=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_54.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_54.setJspContext(pageContext);
                      __jsp_taghandler_54.setPath("guardar");
                      __jsp_taghandler_54.setAction((java.lang.String) ("gestionExpediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuariosAutorizadosDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_54.setValue("submit.save");
                      __jsp_taghandler_54.setProgressBar("true");
                      __jsp_taghandler_54.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
                    }
                    out.write(__oracle_jsp_text[50]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_55=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_55.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_55.setJspContext(pageContext);
                      __jsp_taghandler_55.setPath("cancelar");
                      __jsp_taghandler_55.setAction((java.lang.String) ("gestionExpediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuariosAutorizadosDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_55.setValue("submit.cancel");
                      __jsp_taghandler_55.setProgressBar("true");
                      __jsp_taghandler_55.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
                    }
                    out.write(__oracle_jsp_text[51]);
                  } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,2);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setPath("consultar");
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
              out.write(__oracle_jsp_text[53]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_57=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setPath("urlOrigen");
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
              out.write(__oracle_jsp_text[54]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setPath("urlDestino");
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
              out.write(__oracle_jsp_text[55]);
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

  private class _edicionUsuarios_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _edicionUsuarios_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_23       = parent;
      out.write("\r\n                                <div id=\"displayTagDiv\" style=\"width:1000px;overflow:auto;\"> \r\n                                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_24=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_24.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_23));
        __jsp_taghandler_24.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuariosAutorizadosDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_24.setPagesize(10);
        __jsp_taghandler_24.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_24.setClass("displaytag");
        __jsp_taghandler_24.setExport(true);
        __jsp_taghandler_24.setUid("row");
        __jsp_taghandler_24.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_24,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_25=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                __jsp_taghandler_25.setProperty("descUnidad");
                __jsp_taghandler_25.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.unidad");
                __jsp_taghandler_25.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_26=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable href paramId");
                __jsp_taghandler_26.setParent(__jsp_taghandler_24);
                __jsp_taghandler_26.setProperty("rfcEmpleado");
                __jsp_taghandler_26.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.rfcEmpleado");
                __jsp_taghandler_26.setSortable(true);
                __jsp_taghandler_26.setHref("editarUsuariosRfc.do");
                __jsp_taghandler_26.setParamId("rfcEmpleado");
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_27=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_27.setParent(__jsp_taghandler_24);
                __jsp_taghandler_27.setProperty("nombreEmpleado");
                __jsp_taghandler_27.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.nombreEmpleado");
                __jsp_taghandler_27.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_28=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_28.setParent(__jsp_taghandler_24);
                __jsp_taghandler_28.setProperty("primerApellido");
                __jsp_taghandler_28.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.primerApellido");
                __jsp_taghandler_28.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_29=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_29.setParent(__jsp_taghandler_24);
                __jsp_taghandler_29.setProperty("segundoApellido");
                __jsp_taghandler_29.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.segundoApellido");
                __jsp_taghandler_29.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_30=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_30.setParent(__jsp_taghandler_24);
                __jsp_taghandler_30.setProperty("descPuesto");
                __jsp_taghandler_30.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.descPuesto");
                __jsp_taghandler_30.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_31=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_31.setParent(__jsp_taghandler_24);
                __jsp_taghandler_31.setName("paging.banner.placement");
                __jsp_taghandler_31.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,6);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_32=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_32.setParent(__jsp_taghandler_24);
                __jsp_taghandler_32.setName("export.pdf");
                __jsp_taghandler_32.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,6);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_33=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_33.setParent(__jsp_taghandler_24);
                __jsp_taghandler_33.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_33,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                        __jsp_taghandler_34.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                          if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_34.doCatch(th);
                        } finally {
                          __jsp_taghandler_34.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,7);
                      }
                      out.write("<br><br></span>\r\n                                            ");
                    } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,6);
              }
              out.write("\r\n                                     ");
            } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,5);
      }
      out.write("\r\n                                </div>\r\n                            ");
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

  private static final char __oracle_jsp_text[][]=new char[56][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n</style>\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[6] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[7] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"5\">\r\n                                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"5\">\r\n                                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"center\">\r\n                            <td>&nbsp;</td>\r\n                        </tr>\r\n                        <tr align=\"center\">\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[18] = 
    "&nbsp; \r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Empleados localizados</strong></legend>\r\n                    ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                            \r\n                            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[30] = 
    "<br><br></span>\r\n                        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Mantenimiento de usuarios</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[38] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[40] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[42] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[46] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                            </td>\r\n                            <td></td>\r\n                            <td></td>\r\n                        </tr>\r\n                    </table>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"center\">\r\n                            <td>&nbsp;</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                                <strong>\r\n                                    ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                                </strong>\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"center\">\r\n                            <td>&nbsp;</td>\r\n                        </tr>\r\n                        <tr align=\"center\">\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[50] = 
    "&nbsp; \r\n                                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <script type=\"text/javascript\">\r\n        $j(document).ready(function(){\r\n            $j(\"#text_usuFechaAutorizacion\").prop(\"disabled\", true);\r\n        });\r\n        \r\n        // Validaciones\r\n        $j(document).ready(function(){\r\n            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.numeric').numeric();\r\n        });\r\n        \r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n    </script>\r\n    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
