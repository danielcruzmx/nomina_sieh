package _web_2d_inf._jsp._reportes._movimientosnomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _contratoHonorarios extends com.orionserver.http.OrionHttpJspPage {


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
    _contratoHonorarios page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("reportesMovtoNominaDTO");
        __jsp_taghandler_1.setAction("contratoHonorarios.do");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("rfcRequired");
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
                __jsp_taghandler_3.setCode("sireh.label.movimiento.nomina.reportes.titulo.link");
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
                __jsp_taghandler_4.setCode("sireh.label.movimiento.nomina.reportes.seccion.titulo.link");
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
                __jsp_taghandler_5.setCode("sireh.label.movimiento.nomina.reportes.honorarios.detalle.titulo.link");
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
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setVar("content0");
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[9]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_7.setCode("sireh.label.contratoHonorarios.reportes.rfc");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_7.doCatch(th);
                        } finally {
                          __jsp_taghandler_7.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                      }
                      out.write(__oracle_jsp_text[10]);
                      {
                        _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_8=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                        __jsp_taghandler_8.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_8.setJspContext(pageContext);
                        __jsp_taghandler_8.setBeanName("HonorariosDetalle");
                        __jsp_taghandler_8.setPath("rfcEmpleado");
                        __jsp_taghandler_8.setFieldMapping("rfcEmpleado, chNumDictamen, chNumOficio, chNombreResp, chDescCargo, chConocim, chEstudios, chServsProf");
                        __jsp_taghandler_8.setFieldMappingDTO("rfcEmpleado, chNumDictamen, chNumOficio, chNombreResp, chDescCargo, chConocim, chEstudios, chServsProf");
                        __jsp_taghandler_8.setWidth("1000");
                        __jsp_taghandler_8.setLeftPosition("17");
                        __jsp_taghandler_8.setHeight("400");
                        __jsp_taghandler_8.setTopPosition("20");
                        __jsp_taghandler_8.setMaxlength("16");
                        __jsp_taghandler_8.setDisabled("true");
                        __jsp_taghandler_8.setSize("16");
                        __jsp_taghandler_8.setTitle("Seleccione el RFC");
                        __jsp_taghandler_8.setMaxRows("200");
                        __jsp_taghandler_8.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
                      }
                      out.write(__oracle_jsp_text[11]);
                    } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setVar("content1");
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[13]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_10.setCode("sireh.label.contratoHonorarios.reportes.dictamen");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_10.doCatch(th);
                        } finally {
                          __jsp_taghandler_10.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
                      }
                      out.write(__oracle_jsp_text[14]);
                      {
                        _oracle._jsp._tag._input_tag __jsp_taghandler_11=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                        __jsp_taghandler_11.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_11.setJspContext(pageContext);
                        __jsp_taghandler_11.setPath("chNumDictamen");
                        __jsp_taghandler_11.setSize("18");
                        __jsp_taghandler_11.setUppercase("true");
                        __jsp_taghandler_11.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
                      }
                      out.write(__oracle_jsp_text[15]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_12.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_12.setCode("sireh.label.contratoHonorarios.reportes.contrato");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_12.doCatch(th);
                        } finally {
                          __jsp_taghandler_12.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                      }
                      out.write(__oracle_jsp_text[16]);
                      {
                        _oracle._jsp._tag._input_tag __jsp_taghandler_13=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                        __jsp_taghandler_13.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_13.setJspContext(pageContext);
                        __jsp_taghandler_13.setPath("chNumOficio");
                        __jsp_taghandler_13.setSize("18");
                        __jsp_taghandler_13.setUppercase("true");
                        __jsp_taghandler_13.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
                      }
                      out.write(__oracle_jsp_text[17]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_14.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_14.setCode("sireh.label.contratoHonorarios.reportes.informe");
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
                      out.write(__oracle_jsp_text[18]);
                      {
                        _oracle._jsp._tag._textarea_tag __jsp_taghandler_15=(_oracle._jsp._tag._textarea_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._textarea_tag.class, pageContext);
                        __jsp_taghandler_15.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_15.setJspContext(pageContext);
                        __jsp_taghandler_15.setPath("chNombreResp");
                        __jsp_taghandler_15.setCols("90");
                        __jsp_taghandler_15.setRows("2");
                        __jsp_taghandler_15.setUppercase("false");
                        __jsp_taghandler_15.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
                      }
                      out.write(__oracle_jsp_text[19]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_16.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_16.setCode("sireh.label.contratoHonorarios.reportes.cargo");
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
                      out.write(__oracle_jsp_text[20]);
                      {
                        _oracle._jsp._tag._textarea_tag __jsp_taghandler_17=(_oracle._jsp._tag._textarea_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._textarea_tag.class, pageContext);
                        __jsp_taghandler_17.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_17.setJspContext(pageContext);
                        __jsp_taghandler_17.setPath("chDescCargo");
                        __jsp_taghandler_17.setCols("90");
                        __jsp_taghandler_17.setRows("2");
                        __jsp_taghandler_17.setUppercase("false");
                        __jsp_taghandler_17.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
                      }
                      out.write(__oracle_jsp_text[21]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_18.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_18.setCode("sireh.label.contratoHonorarios.reportes.conocimientos");
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
                      out.write(__oracle_jsp_text[22]);
                      {
                        _oracle._jsp._tag._textarea_tag __jsp_taghandler_19=(_oracle._jsp._tag._textarea_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._textarea_tag.class, pageContext);
                        __jsp_taghandler_19.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_19.setJspContext(pageContext);
                        __jsp_taghandler_19.setPath("chConocim");
                        __jsp_taghandler_19.setCols("90");
                        __jsp_taghandler_19.setRows("7");
                        __jsp_taghandler_19.setUppercase("false");
                        __jsp_taghandler_19.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
                      }
                      out.write(__oracle_jsp_text[23]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_20.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_20.setCode("sireh.label.contratoHonorarios.reportes.estudios");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                          if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_20.doCatch(th);
                        } finally {
                          __jsp_taghandler_20.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,3);
                      }
                      out.write(__oracle_jsp_text[24]);
                      {
                        _oracle._jsp._tag._textarea_tag __jsp_taghandler_21=(_oracle._jsp._tag._textarea_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._textarea_tag.class, pageContext);
                        __jsp_taghandler_21.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_21.setJspContext(pageContext);
                        __jsp_taghandler_21.setPath("chEstudios");
                        __jsp_taghandler_21.setCols("90");
                        __jsp_taghandler_21.setRows("2");
                        __jsp_taghandler_21.setUppercase("false");
                        __jsp_taghandler_21.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                      }
                      out.write(__oracle_jsp_text[25]);
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_22.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_22.setCode("sireh.label.contratoHonorarios.reportes.servicios");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                          if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_22.doCatch(th);
                        } finally {
                          __jsp_taghandler_22.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,3);
                      }
                      out.write(__oracle_jsp_text[26]);
                      {
                        _oracle._jsp._tag._textarea_tag __jsp_taghandler_23=(_oracle._jsp._tag._textarea_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._textarea_tag.class, pageContext);
                        __jsp_taghandler_23.setParent(__jsp_taghandler_9);
                        __jsp_taghandler_23.setJspContext(pageContext);
                        __jsp_taghandler_23.setPath("chServsProf");
                        __jsp_taghandler_23.setCols("90");
                        __jsp_taghandler_23.setRows("7");
                        __jsp_taghandler_23.setUppercase("false");
                        __jsp_taghandler_23.doTag();
                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                      }
                      out.write(__oracle_jsp_text[27]);
                    } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_24=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setSection("init");
                __jsp_taghandler_24.setType("tab");
                __jsp_taghandler_24.setTabHeight("25");
                __jsp_taghandler_24.setDisplayTime("3");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_25=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setTitle("Datos Requeridos");
                __jsp_taghandler_25.setName("divContent0");
                __jsp_taghandler_25.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content0}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_25.setSelected("true");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_26=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setTitle("Datos Adicionales");
                __jsp_taghandler_26.setName("divContent1");
                __jsp_taghandler_26.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content1}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_27=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setSection("final");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[33]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_29=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setPath("muestraReporte");
                __jsp_taghandler_29.setAction("reporteMoviminentos/contratoHonorarios.do");
                __jsp_taghandler_29.setValue("submit.accept");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_30=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setPath("cancel");
                __jsp_taghandler_30.setAction("reporteMoviminentos/contratoHonorarios.do");
                __jsp_taghandler_30.setValue("submit.cancel");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesMovtoNominaDTO.rfcEmpleado != null)}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[36]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_32=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_32.setJspContext(pageContext);
                      __jsp_taghandler_32.setName("PAR_RFC");
                      __jsp_taghandler_32.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_32.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                    }
                    out.write(__oracle_jsp_text[37]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_33=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_33.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_33.setJspContext(pageContext);
                      __jsp_taghandler_33.setName("PAR_DICTAMEN");
                      __jsp_taghandler_33.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.chNumDictamen}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_33.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                    }
                    out.write(__oracle_jsp_text[38]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_34=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_34.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_34.setJspContext(pageContext);
                      __jsp_taghandler_34.setName("PAR_CONTRATO");
                      __jsp_taghandler_34.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.chNumOficio}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_34.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_35=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_35.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_35.setJspContext(pageContext);
                      __jsp_taghandler_35.setName("PAR_INFORME");
                      __jsp_taghandler_35.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.chNombreResp}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_35.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_36=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_36.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_36.setJspContext(pageContext);
                      __jsp_taghandler_36.setName("PAR_CARGO");
                      __jsp_taghandler_36.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.chDescCargo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_36.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
                    }
                    out.write(__oracle_jsp_text[41]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_37=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_37.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_37.setJspContext(pageContext);
                      __jsp_taghandler_37.setName("PAR_CONOCIMIENTOS");
                      __jsp_taghandler_37.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.chConocim}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_37.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
                    }
                    out.write(__oracle_jsp_text[42]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_38=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_38.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_38.setJspContext(pageContext);
                      __jsp_taghandler_38.setName("PAR_ESTUDIOS");
                      __jsp_taghandler_38.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.chEstudios}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_38.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
                    }
                    out.write(__oracle_jsp_text[43]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_39=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_39.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_39.setJspContext(pageContext);
                      __jsp_taghandler_39.setName("PAR_SERVICIOS");
                      __jsp_taghandler_39.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.chServsProf}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_39.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
                    }
                    out.write(__oracle_jsp_text[44]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_40=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_40.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_40.setJspContext(pageContext);
                      __jsp_taghandler_40.setProvider("jasper");
                      __jsp_taghandler_40.setViewUri("/movimientosNomina/contratoHonorarios");
                      __jsp_taghandler_40.setImagesUri("/images/reports");
                      __jsp_taghandler_40.setFormat("pdf");
                      __jsp_taghandler_40.setFileName("contratoHonorarios");
                      __jsp_taghandler_40.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_40.setWidth("1060");
                      __jsp_taghandler_40.setHeight("350");
                      __jsp_taghandler_40.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
                    }
                    out.write(__oracle_jsp_text[45]);
                  } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,2);
              }
              out.write(__oracle_jsp_text[46]);
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
  private static final char __oracle_jsp_text[][]=new char[47][];
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
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    \r\n    <h1>\r\n        <strong>\r\n            ".toCharArray();
    __oracle_jsp_text[6] = 
    " &#45; \r\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    " &#45; \r\n            ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n        </strong>\r\n    </h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <div align=\"center\">\r\n        <table width=\"100%\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                        <table width=\"50%\">\r\n                            <tr>\r\n                                <td  align=\"right\" class=\"label\"> * ".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                                <td align=\"left\" colspan=\"5\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    \r\n                    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                        <table width=\"71%\">\r\n                            <tr>\r\n                                <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                                </td>\r\n                                <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan=\"4\" align=\"left\" height=\"15px\" valign=\"middle\">&nbsp;</td>\r\n                            </tr>\r\n                            \r\n                            <tr>\r\n                                <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                                <td align=\"left\" colspan=\"3\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                                <td align=\"left\" colspan=\"3\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan=\"4\" align=\"left\" height=\"15px\" valign=\"middle\">&nbsp;</td>\r\n                            </tr>\r\n                        \r\n                            <tr>\r\n                                <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                                <td align=\"left\" colspan=\"3\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                                <td align=\"left\" colspan=\"3\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td  align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                                <td align=\"left\" colspan=\"3\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n        \r\n                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>\r\n                    <table width=\"100%\">\r\n                        <tr>\r\n                            <td colspan=\"2\" align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[33] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\">\r\n                                ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"2\" height=\"20px\">&nbsp;</td>\r\n                        </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    \r\n        ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n            <table>\r\n                <tr>\r\n                    <th align=\"left\">\r\n                        &nbsp;\r\n                    </th>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"left\" style=\"z-index: 1;\">\r\n                        ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n    </div>\r\n    \r\n    <p>&nbsp;</p>\r\n    <div align=\"center\"></div>\r\n    \r\n    <p>&nbsp;</p>\r\n    <div align=\"center\"></div>\r\n    \r\n    <p>&nbsp;</p>\r\n    <div align=\"center\"></div>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
