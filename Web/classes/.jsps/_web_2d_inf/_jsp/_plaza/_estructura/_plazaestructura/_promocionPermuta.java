package _web_2d_inf._jsp._plaza._estructura._plazaestructura;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _promocionPermuta extends com.orionserver.http.OrionHttpJspPage {


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
    _promocionPermuta page = this;
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
        __jsp_taghandler_1.setModelAttribute("promocionPermutaDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.plaza.gestion.titulo.link");
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
                __jsp_taghandler_3.setCode("sireh.label.plaza.estructura.titulo.link");
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
                __jsp_taghandler_4.setCode("sireh.label.plaza.movimientosNomina.titulo.link");
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
                __jsp_taghandler_5.setCode("sireh.label.plaza.estructura.promocionPermuta.titulo");
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
                __jsp_taghandler_6.setCode("sireh.label.plaza.estructura.promocionPermuta.titulo.datosPlazaOrigen");
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
                __jsp_taghandler_7.setCode("sireh.label.plaza.estructura.promocionPermuta.plazaOrigen");
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
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_8=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setBeanName("promocionPermutaPopUp");
                __jsp_taghandler_8.setPath("plazaOrigen");
                __jsp_taghandler_8.setFieldMapping("idPlaza, rfcEmpleado, nombreEmpleado, primerApellido, segundoApellido, idSitPlaza, descSitPlaza, idUnidadNom, descUnidad, idPuestoNom, descPuesto, idEdo, descEstado, idNivelPto, idZonaEcon, descZonaEcon, idZonaDistNom");
                __jsp_taghandler_8.setFieldMappingDTO("plazaOrigen, rfcOrigen, empleadoOrigen, primerApellidoOrigen, segundoApellidoOrigen, situacionOrigen, situacionOrigenDesc, unidadOrigen, unidadOrigenDesc, puestoOrigen, puestoOrigenDesc, estadoOrigen, estadoOrigenDesc, nivelOrigen, zonaOrigen, zonaOrigenDesc, distribucionOrigen");
                __jsp_taghandler_8.setWidth("800");
                __jsp_taghandler_8.setLeftPosition("17");
                __jsp_taghandler_8.setHeight("400");
                __jsp_taghandler_8.setTopPosition("20");
                __jsp_taghandler_8.setMaxlength("20");
                __jsp_taghandler_8.setDisabled("true");
                __jsp_taghandler_8.setSize("20");
                __jsp_taghandler_8.setTitle("Seleccione la Plaza Origen");
                __jsp_taghandler_8.setMaxRows("200");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._detalleCalculoNomina_tag __jsp_taghandler_9=(_oracle._jsp._tag._detalleCalculoNomina_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._detalleCalculoNomina_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setPlaza("true");
                __jsp_taghandler_9.setName("plazaOri");
                __jsp_taghandler_9.setImage("detail.gif");
                __jsp_taghandler_9.setParentPath("plazaOrigen");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.plaza.estructura.promocionPermuta.situacion");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_11=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setPath("situacionOrigen");
                __jsp_taghandler_11.setReadonly("true");
                __jsp_taghandler_11.setSize("5");
                __jsp_taghandler_11.setUppercase("true");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_12=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setPath("situacionOrigenDesc");
                __jsp_taghandler_12.setReadonly("true");
                __jsp_taghandler_12.setSize("60");
                __jsp_taghandler_12.setUppercase("true");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.plaza.estructura.promocionPermuta.titulo.datosEmpleado");
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
                __jsp_taghandler_14.setCode("sireh.label.plaza.estructura.promocionPermuta.rfc");
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
                __jsp_taghandler_15.setPath("rfcOrigen");
                __jsp_taghandler_15.setReadonly("true");
                __jsp_taghandler_15.setSize("60");
                __jsp_taghandler_15.setUppercase("true");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setCode("sireh.label.plaza.estructura.promocionPermuta.empleado");
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
                __jsp_taghandler_17.setPath("empleadoOrigen");
                __jsp_taghandler_17.setReadonly("true");
                __jsp_taghandler_17.setSize("20");
                __jsp_taghandler_17.setUppercase("true");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_18=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("primerApellidoOrigen");
                __jsp_taghandler_18.setReadonly("true");
                __jsp_taghandler_18.setSize("15");
                __jsp_taghandler_18.setUppercase("true");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_19=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setPath("segundoApellidoOrigen");
                __jsp_taghandler_19.setReadonly("true");
                __jsp_taghandler_19.setSize("15");
                __jsp_taghandler_19.setUppercase("true");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.plaza.estructura.promocionPermuta.titulo.datosFisicos");
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
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.plaza.estructura.promocionPermuta.unidad");
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
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_22=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setPath("unidadOrigen");
                __jsp_taghandler_22.setReadonly("true");
                __jsp_taghandler_22.setSize("5");
                __jsp_taghandler_22.setUppercase("true");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_23=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setPath("unidadOrigenDesc");
                __jsp_taghandler_23.setReadonly("true");
                __jsp_taghandler_23.setSize("50");
                __jsp_taghandler_23.setUppercase("true");
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setCode("sireh.label.plaza.estructura.promocionPermuta.puesto");
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
              out.write(__oracle_jsp_text[27]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_25=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setPath("puestoOrigen");
                __jsp_taghandler_25.setReadonly("true");
                __jsp_taghandler_25.setSize("5");
                __jsp_taghandler_25.setUppercase("true");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_26=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setPath("puestoOrigenDesc");
                __jsp_taghandler_26.setReadonly("true");
                __jsp_taghandler_26.setSize("50");
                __jsp_taghandler_26.setUppercase("true");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_27=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setCode("sireh.label.plaza.estructura.promocionPermuta.edo");
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
              out.write(__oracle_jsp_text[30]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_28=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setJspContext(pageContext);
                __jsp_taghandler_28.setPath("estadoOrigen");
                __jsp_taghandler_28.setReadonly("true");
                __jsp_taghandler_28.setSize("5");
                __jsp_taghandler_28.setUppercase("true");
                __jsp_taghandler_28.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_29=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setPath("estadoOrigenDesc");
                __jsp_taghandler_29.setReadonly("true");
                __jsp_taghandler_29.setSize("50");
                __jsp_taghandler_29.setUppercase("true");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.plaza.estructura.promocionPermuta.nivelFisico");
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
              out.write(__oracle_jsp_text[33]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_31=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setPath("nivelOrigen");
                __jsp_taghandler_31.setReadonly("true");
                __jsp_taghandler_31.setSize("60");
                __jsp_taghandler_31.setUppercase("true");
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setCode("sireh.label.plaza.estructura.promocionPermuta.zonaEco");
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
              out.write(__oracle_jsp_text[35]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_33=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setJspContext(pageContext);
                __jsp_taghandler_33.setPath("zonaOrigen");
                __jsp_taghandler_33.setReadonly("true");
                __jsp_taghandler_33.setSize("5");
                __jsp_taghandler_33.setUppercase("true");
                __jsp_taghandler_33.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
              }
              out.write(__oracle_jsp_text[36]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_34=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setPath("zonaOrigenDesc");
                __jsp_taghandler_34.setReadonly("true");
                __jsp_taghandler_34.setSize("50");
                __jsp_taghandler_34.setUppercase("true");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setCode("sireh.label.plaza.estructura.promocionPermuta.zonaDist");
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
              out.write(__oracle_jsp_text[38]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_36=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setPath("distribucionOrigen");
                __jsp_taghandler_36.setReadonly("true");
                __jsp_taghandler_36.setSize("60");
                __jsp_taghandler_36.setUppercase("true");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("intercambio.gif");
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
              out.write(__oracle_jsp_text[40]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setCode("sireh.label.plaza.estructura.promocionPermuta.titulo.datosPlazaDestino");
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
              out.write(__oracle_jsp_text[41]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setCode("sireh.label.plaza.estructura.promocionPermuta.plazaDestino");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                  if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_39.doCatch(th);
                } finally {
                  __jsp_taghandler_39.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,2);
              }
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_40=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setJspContext(pageContext);
                __jsp_taghandler_40.setBeanName("promocionPermutaPopUp");
                __jsp_taghandler_40.setPath("plazaDestino");
                __jsp_taghandler_40.setFieldMapping("idPlaza, rfcEmpleado, nombreEmpleado, primerApellido, segundoApellido, idSitPlaza, descSitPlaza, idUnidadNom, descUnidad, idPuestoNom, descPuesto, idEdo, descEstado, idNivelPto, idZonaEcon, descZonaEcon, idZonaDistNom");
                __jsp_taghandler_40.setFieldMappingDTO("plazaDestino, rfcDestino, empleadoDestino, primerApellidoDestino, segundoApellidoDestino, situacionDestino, situacionDestinoDesc, unidadDestino, unidadDestinoDesc, puestoDestino, puestoDestinoDesc, estadoDestino, estadoDestinoDesc, nivelDestino, zonaDestino, zonaDestinoDesc, distribucionDestino");
                __jsp_taghandler_40.setWidth("800");
                __jsp_taghandler_40.setLeftPosition("17");
                __jsp_taghandler_40.setHeight("400");
                __jsp_taghandler_40.setTopPosition("20");
                __jsp_taghandler_40.setMaxlength("20");
                __jsp_taghandler_40.setDisabled("true");
                __jsp_taghandler_40.setSize("20");
                __jsp_taghandler_40.setTitle("Seleccione la Plaza Destino");
                __jsp_taghandler_40.setMaxRows("200");
                __jsp_taghandler_40.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._detalleCalculoNomina_tag __jsp_taghandler_41=(_oracle._jsp._tag._detalleCalculoNomina_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._detalleCalculoNomina_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setPlaza("true");
                __jsp_taghandler_41.setName("plazaDes");
                __jsp_taghandler_41.setImage("detail.gif");
                __jsp_taghandler_41.setParentPath("plazaDestino");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setCode("sireh.label.plaza.estructura.promocionPermuta.situacion");
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
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_43=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setJspContext(pageContext);
                __jsp_taghandler_43.setPath("situacionDestino");
                __jsp_taghandler_43.setReadonly("true");
                __jsp_taghandler_43.setSize("5");
                __jsp_taghandler_43.setUppercase("true");
                __jsp_taghandler_43.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_44=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setJspContext(pageContext);
                __jsp_taghandler_44.setPath("situacionDestinoDesc");
                __jsp_taghandler_44.setReadonly("true");
                __jsp_taghandler_44.setSize("60");
                __jsp_taghandler_44.setUppercase("true");
                __jsp_taghandler_44.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_45=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setCode("sireh.label.plaza.estructura.promocionPermuta.titulo.datosEmpleado");
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
              out.write(__oracle_jsp_text[48]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setCode("sireh.label.plaza.estructura.promocionPermuta.rfc");
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
              out.write(__oracle_jsp_text[49]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_47=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setJspContext(pageContext);
                __jsp_taghandler_47.setPath("rfcDestino");
                __jsp_taghandler_47.setReadonly("true");
                __jsp_taghandler_47.setSize("60");
                __jsp_taghandler_47.setUppercase("true");
                __jsp_taghandler_47.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
              }
              out.write(__oracle_jsp_text[50]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setCode("sireh.label.plaza.estructura.promocionPermuta.empleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                  if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_48.doCatch(th);
                } finally {
                  __jsp_taghandler_48.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_49=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setJspContext(pageContext);
                __jsp_taghandler_49.setPath("empleadoDestino");
                __jsp_taghandler_49.setReadonly("true");
                __jsp_taghandler_49.setSize("20");
                __jsp_taghandler_49.setUppercase("true");
                __jsp_taghandler_49.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
              }
              out.write(__oracle_jsp_text[52]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_50=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setJspContext(pageContext);
                __jsp_taghandler_50.setPath("primerApellidoDestino");
                __jsp_taghandler_50.setReadonly("true");
                __jsp_taghandler_50.setSize("15");
                __jsp_taghandler_50.setUppercase("true");
                __jsp_taghandler_50.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
              }
              out.write(__oracle_jsp_text[53]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_51=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setPath("segundoApellidoDestino");
                __jsp_taghandler_51.setReadonly("true");
                __jsp_taghandler_51.setSize("15");
                __jsp_taghandler_51.setUppercase("true");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[54]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setCode("sireh.label.plaza.estructura.promocionPermuta.titulo.datosFisicos");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                  if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_52.doCatch(th);
                } finally {
                  __jsp_taghandler_52.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,2);
              }
              out.write(__oracle_jsp_text[55]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_53=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setCode("sireh.label.plaza.estructura.promocionPermuta.unidad");
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
              out.write(__oracle_jsp_text[56]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_54=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setJspContext(pageContext);
                __jsp_taghandler_54.setPath("unidadDestino");
                __jsp_taghandler_54.setReadonly("true");
                __jsp_taghandler_54.setSize("5");
                __jsp_taghandler_54.setUppercase("true");
                __jsp_taghandler_54.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
              }
              out.write(__oracle_jsp_text[57]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_55=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setJspContext(pageContext);
                __jsp_taghandler_55.setPath("unidadDestinoDesc");
                __jsp_taghandler_55.setReadonly("true");
                __jsp_taghandler_55.setSize("50");
                __jsp_taghandler_55.setUppercase("true");
                __jsp_taghandler_55.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
              }
              out.write(__oracle_jsp_text[58]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setCode("sireh.label.plaza.estructura.promocionPermuta.puesto");
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
              out.write(__oracle_jsp_text[59]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_57=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setJspContext(pageContext);
                __jsp_taghandler_57.setPath("puestoDestino");
                __jsp_taghandler_57.setReadonly("true");
                __jsp_taghandler_57.setSize("5");
                __jsp_taghandler_57.setUppercase("true");
                __jsp_taghandler_57.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_57, pageContext);
              }
              out.write(__oracle_jsp_text[60]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_58=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setJspContext(pageContext);
                __jsp_taghandler_58.setPath("puestoDestinoDesc");
                __jsp_taghandler_58.setReadonly("true");
                __jsp_taghandler_58.setSize("50");
                __jsp_taghandler_58.setUppercase("true");
                __jsp_taghandler_58.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_58, pageContext);
              }
              out.write(__oracle_jsp_text[61]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_59=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setCode("sireh.label.plaza.estructura.promocionPermuta.edo");
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
              out.write(__oracle_jsp_text[62]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_60=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setJspContext(pageContext);
                __jsp_taghandler_60.setPath("estadoDestino");
                __jsp_taghandler_60.setReadonly("true");
                __jsp_taghandler_60.setSize("5");
                __jsp_taghandler_60.setUppercase("true");
                __jsp_taghandler_60.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_60, pageContext);
              }
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_61=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setJspContext(pageContext);
                __jsp_taghandler_61.setPath("estadoDestinoDesc");
                __jsp_taghandler_61.setReadonly("true");
                __jsp_taghandler_61.setSize("50");
                __jsp_taghandler_61.setUppercase("true");
                __jsp_taghandler_61.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_61, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_taghandler_62.setCode("sireh.label.plaza.estructura.promocionPermuta.nivelFisico");
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
              out.write(__oracle_jsp_text[65]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_63=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setJspContext(pageContext);
                __jsp_taghandler_63.setPath("nivelDestino");
                __jsp_taghandler_63.setReadonly("true");
                __jsp_taghandler_63.setSize("60");
                __jsp_taghandler_63.setUppercase("true");
                __jsp_taghandler_63.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_63, pageContext);
              }
              out.write(__oracle_jsp_text[66]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_64=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setCode("sireh.label.plaza.estructura.promocionPermuta.zonaEco");
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
              out.write(__oracle_jsp_text[67]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_65=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setJspContext(pageContext);
                __jsp_taghandler_65.setPath("zonaDestino");
                __jsp_taghandler_65.setReadonly("true");
                __jsp_taghandler_65.setSize("5");
                __jsp_taghandler_65.setUppercase("true");
                __jsp_taghandler_65.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_65, pageContext);
              }
              out.write(__oracle_jsp_text[68]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_66=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_66.setParent(__jsp_taghandler_1);
                __jsp_taghandler_66.setJspContext(pageContext);
                __jsp_taghandler_66.setPath("zonaDestinoDesc");
                __jsp_taghandler_66.setReadonly("true");
                __jsp_taghandler_66.setSize("50");
                __jsp_taghandler_66.setUppercase("true");
                __jsp_taghandler_66.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_66, pageContext);
              }
              out.write(__oracle_jsp_text[69]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_67=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_67.setParent(__jsp_taghandler_1);
                __jsp_taghandler_67.setCode("sireh.label.plaza.estructura.promocionPermuta.zonaDist");
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
              out.write(__oracle_jsp_text[70]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_68=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_68.setParent(__jsp_taghandler_1);
                __jsp_taghandler_68.setJspContext(pageContext);
                __jsp_taghandler_68.setPath("distribucionDestino");
                __jsp_taghandler_68.setReadonly("true");
                __jsp_taghandler_68.setSize("60");
                __jsp_taghandler_68.setUppercase("true");
                __jsp_taghandler_68.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_68, pageContext);
              }
              out.write(__oracle_jsp_text[71]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_69=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_69.setParent(__jsp_taghandler_1);
                __jsp_taghandler_69.setCode("sireh.label.plaza.estructura.liberaPlaza.plazaIniCont");
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
              out.write(__oracle_jsp_text[72]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_70=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_70.setParent(__jsp_taghandler_1);
                __jsp_taghandler_70.setJspContext(pageContext);
                __jsp_taghandler_70.setPath("plazaIniCont");
                __jsp_taghandler_70.setSize("10");
                __jsp_taghandler_70.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_70, pageContext);
              }
              out.write(__oracle_jsp_text[73]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_71=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_71.setParent(__jsp_taghandler_1);
                __jsp_taghandler_71.setCode("sireh.label.plaza.estructura.liberaPlaza.plazaFinCont");
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
              out.write(__oracle_jsp_text[74]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_72=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_72.setParent(__jsp_taghandler_1);
                __jsp_taghandler_72.setJspContext(pageContext);
                __jsp_taghandler_72.setPath("plazaFinCont");
                __jsp_taghandler_72.setSize("10");
                __jsp_taghandler_72.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_72, pageContext);
              }
              out.write(__oracle_jsp_text[75]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_73=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_73.setParent(__jsp_taghandler_1);
                __jsp_taghandler_73.setCode("sireh.label.plaza.estructura.liberaPlaza.checkFechaTermino.seleccionado");
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
              out.write(__oracle_jsp_text[76]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_74=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_74.setParent(__jsp_taghandler_1);
                __jsp_taghandler_74.setCode("sireh.label.plaza.estructura.liberaPlaza.checkFechaTermino");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                  if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_74.doCatch(th);
                } finally {
                  __jsp_taghandler_74.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,2);
              }
              out.write(__oracle_jsp_text[77]);
              {
                org.springframework.web.servlet.tags.form.CheckboxTag __jsp_taghandler_75=(org.springframework.web.servlet.tags.form.CheckboxTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.CheckboxTag.class,"org.springframework.web.servlet.tags.form.CheckboxTag path onclick value");
                __jsp_taghandler_75.setParent(__jsp_taghandler_1);
                __jsp_taghandler_75.setPath("checkFechaTermino");
                __jsp_taghandler_75.setOnclick("renderFechaTermino();");
                __jsp_taghandler_75.setValue("1");
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
              out.write(__oracle_jsp_text[78]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_76=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_76.setParent(__jsp_taghandler_1);
                __jsp_taghandler_76.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[79]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_77=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_77.setParent(__jsp_taghandler_1);
                __jsp_taghandler_77.setJspContext(pageContext);
                __jsp_taghandler_77.setAction("plazaEstructura/updatePromocionPermuta.do");
                __jsp_taghandler_77.setValue("submit.accept");
                __jsp_taghandler_77.setOnclick("validateFormData();");
                __jsp_taghandler_77.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_77, pageContext);
              }
              out.write(__oracle_jsp_text[80]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_78=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_78.setParent(__jsp_taghandler_1);
                __jsp_taghandler_78.setJspContext(pageContext);
                __jsp_taghandler_78.setAction("plazaEstructura/promocionPermuta.do");
                __jsp_taghandler_78.setValue("submit.cancel");
                __jsp_taghandler_78.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_78, pageContext);
              }
              out.write(__oracle_jsp_text[81]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_79=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_79.setParent(__jsp_taghandler_1);
                __jsp_taghandler_79.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${promocionPermutaDTO.checkFechaTermino}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,2);
              }
              out.write(__oracle_jsp_text[82]);
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
  private static final char __oracle_jsp_text[][]=new char[83][];
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
    "\r\n    \r\n    <h1>\r\n        ".toCharArray();
    __oracle_jsp_text[5] = 
    "  -  \r\n        ".toCharArray();
    __oracle_jsp_text[6] = 
    " -  \r\n        ".toCharArray();
    __oracle_jsp_text[7] = 
    " -  \r\n        ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    </h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" width=\"100%\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[9] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\">\r\n                        <colgroup>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"80%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n                <br/>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[16] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\">\r\n                        <colgroup>\r\n                            <col width=\"30%\"/>\r\n                            <col width=\"70%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n                <br/>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[23] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\">\r\n                        <colgroup>\r\n                            <col width=\"30%\"/>\r\n                            <col width=\"70%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n            <td colspan=\"2\">\r\n                <img src=\"".toCharArray();
    __oracle_jsp_text[40] = 
    "\" border=\"0\" width=\"20\"/>\r\n            </td>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[41] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\">\r\n                        <colgroup>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"80%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[42] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n                <br/>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[48] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\">\r\n                        <colgroup>\r\n                            <col width=\"30%\"/>\r\n                            <col width=\"70%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n                <br/>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[55] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\">\r\n                        <colgroup>\r\n                            <col width=\"30%\"/>\r\n                            <col width=\"70%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[71] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"4\" align=\"left\">\r\n                <table border=\"0\">\r\n                    <tr>\r\n                        <td width=\"155px;\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[72] = 
    "</td>\r\n                        <td width=\"322px;\" align=\"left\">".toCharArray();
    __oracle_jsp_text[73] = 
    "</td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"4\" align=\"left\">\r\n                <table border=\"0\">\r\n                    <tr>\r\n                        <td width=\"155px;\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[74] = 
    "</td>\r\n                        <td width=\"322px;\" align=\"left\">\r\n                            <table width=\"100%\" border=\"0\" >\r\n                                <tr>\r\n                                    <td width=\"100px\">\r\n                                        <span id=\"spanFechaTermino\" style=\"width:100px\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n                                        </span>\r\n                                        <span id=\"spanFechaInfinita\" style=\"width:100px\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[76] = 
    "\r\n                                        </span>\r\n                                    </td>\r\n                                    <td>\r\n                                        <span style=\"width:100px\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[77] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[78] = 
    "\r\n                                        </span>\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        \r\n        <tr>\r\n            <td colspan=\"2\" align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[79] = 
    "</td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"right\">\r\n                ".toCharArray();
    __oracle_jsp_text[80] = 
    "\r\n            </td>\r\n            <td colspan=\"2\" align=\"left\">\r\n                ".toCharArray();
    __oracle_jsp_text[81] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j.event.special.inputchange = {\r\n            setup: function() {\r\n                var self = this, val;\r\n                $j.data(this, 'timer', window.setInterval(function() {\r\n                    val = self.value;\r\n                    if ( $j.data( self, 'cache') != val ) {\r\n                        $j.data( self, 'cache', val );\r\n                        $j( self ).trigger( 'inputchange' );\r\n                    }\r\n                }, 20));\r\n            },\r\n            teardown: function() {\r\n                window.clearInterval( $j.data(this, 'timer') );\r\n            },\r\n            add: function() {\r\n                $j.data(this, 'cache', this.value);\r\n            }\r\n        };\r\n        //$j('input').on('inputchange', function() { console.log(this.value) });\r\n\r\n        $j('#plazaOrigen').on('inputchange',function(e){\r\n            //console.log('Plaza Origen Changed!')\r\n            validateFormData();\r\n        });\r\n        \r\n        $j('#plazaDestino').on('inputchange',function(e){\r\n            //console.log('Plaza Destino Changed!')\r\n            validateFormData();\r\n        });\r\n        \r\n        function validateFormData() {\r\n            var plazaOrigen = $j('#plazaOrigen').val();\r\n            var plazaDestino = $j('#plazaDestino').val();\r\n            //console.log (plazaOrigen + \" - \" + plazaDestino);\r\n            if (plazaOrigen !=\"\" && plazaDestino !=\"\") {\r\n                if (plazaOrigen == plazaDestino) {\r\n                    alert(\"La Plaza Origen no puede ser la misma que la Plaza Destino\");\r\n                    clearFormData();\r\n                    return false;\r\n                }\r\n                return false;\r\n            }\r\n            return true;\r\n        }\r\n        \r\n        function clearFormData() {\r\n            if ( !Array.prototype.forEach ) {\r\n                Array.prototype.forEach = function(fn, scope) {\r\n                    for(var i = 0, len = this.length; i < len; ++i) {\r\n                        fn.call(scope, this[i], i, this);\r\n                    }   \r\n                }\r\n            }\r\n            \r\n            var sufix = [\"Origen\", \"Destino\"];\r\n            sufix.forEach(function(suf) {\r\n                //console.log(suf);\r\n                $j('#plaza' + suf).val('');\r\n                $j('#rfc' + suf).val('');\r\n                $j('#empleado' + suf).val('');\r\n                $j('#primerApellido' + suf).val('');\r\n                $j('#segundoApellido' + suf).val('');\r\n                $j('#situacion' + suf).val('');\r\n                $j('#situacion' + suf + 'Desc').val('');\r\n                $j('#unidad' + suf).val('');\r\n                $j('#unidad' + suf + 'Desc').val('');\r\n                $j('#puesto' + suf).val('');\r\n                $j('#puesto' + suf + 'Desc').val('');\r\n                $j('#estado' + suf).val('');\r\n                $j('#estado' + suf + 'Desc').val('');\r\n                $j('#nivel' + suf).val('');\r\n                $j('#zona' + suf).val('');\r\n                $j('#zona' + suf + 'Desc').val('');\r\n                $j('#distribucion' + suf).val('');\r\n            });\r\n        }\r\n    </script>\r\n    \r\n    <script type=\"text/javascript\">\r\n        var seleccionInicial = ".toCharArray();
    __oracle_jsp_text[82] = 
    ";\r\n        if (seleccionInicial) {\r\n            document.getElementById(\"spanFechaTermino\").style.display = 'none';\r\n            document.getElementById(\"spanFechaInfinita\").style.display = 'block';\r\n        } else {\r\n            document.getElementById(\"spanFechaTermino\").style.display = 'block';\r\n            document.getElementById(\"spanFechaInfinita\").style.display = 'none';\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
