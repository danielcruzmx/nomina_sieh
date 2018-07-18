package _web_2d_inf._jsp._plaza._estructura._plazaestructura;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _intercambioDatosPresupuestales extends com.orionserver.http.OrionHttpJspPage {


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
    _intercambioDatosPresupuestales page = this;
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
        __jsp_taghandler_1.setModelAttribute("modificaDatosPresupuestalesDTO");
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
                __jsp_taghandler_5.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo");
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
                __jsp_taghandler_6.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo.datosPlazaOrigen");
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
                __jsp_taghandler_7.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.plazaOrigen");
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
                __jsp_taghandler_8.setBeanName("modDatPrePlazaPopUp");
                __jsp_taghandler_8.setPath("plazaOrigen");
                __jsp_taghandler_8.setFieldMapping("idPlaza, idSitPlaza, descSitPlaza, idUnidadPre, descUnidad, idPuestoPre, descPuesto, idEdo, descEstado, idNivelPto, idZonaEcon, descZonaEcon");
                __jsp_taghandler_8.setFieldMappingDTO("plazaOrigen, situacionOrigen, situacionOrigenDesc, unidadOrigen, unidadOrigenDesc, puestoOrigen, puestoOrigenDesc, estadoOrigen, estadoOrigenDesc, nivelOrigen, zonaOrigen, zonaOrigenDesc");
                __jsp_taghandler_8.setWidth("800");
                __jsp_taghandler_8.setLeftPosition("17");
                __jsp_taghandler_8.setHeight("400");
                __jsp_taghandler_8.setTopPosition("20");
                __jsp_taghandler_8.setMaxlength("20");
                __jsp_taghandler_8.setDisabled("true");
                __jsp_taghandler_8.setSize("20");
                __jsp_taghandler_8.setTitle("Seleccione la Plaza Origen");
                __jsp_taghandler_8.setMaxRows("200");
                __jsp_taghandler_8.setOrderedColumns("Plaza, Situación, Unidad, Puesto, Estado, Nivel, Zona");
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
                __jsp_taghandler_10.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.situacion");
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
                __jsp_taghandler_13.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo.datosPresupuestales");
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
                __jsp_taghandler_14.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.unidad");
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
                __jsp_taghandler_15.setPath("unidadOrigen");
                __jsp_taghandler_15.setReadonly("true");
                __jsp_taghandler_15.setSize("5");
                __jsp_taghandler_15.setUppercase("true");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_16=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setPath("unidadOrigenDesc");
                __jsp_taghandler_16.setReadonly("true");
                __jsp_taghandler_16.setSize("55");
                __jsp_taghandler_16.setUppercase("true");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.puesto");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_18=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("puestoOrigen");
                __jsp_taghandler_18.setReadonly("true");
                __jsp_taghandler_18.setSize("5");
                __jsp_taghandler_18.setUppercase("true");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_19=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setPath("puestoOrigenDesc");
                __jsp_taghandler_19.setReadonly("true");
                __jsp_taghandler_19.setSize("55");
                __jsp_taghandler_19.setUppercase("true");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.edo");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_21=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setPath("estadoOrigen");
                __jsp_taghandler_21.setReadonly("true");
                __jsp_taghandler_21.setSize("5");
                __jsp_taghandler_21.setUppercase("true");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_22=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setPath("estadoOrigenDesc");
                __jsp_taghandler_22.setReadonly("true");
                __jsp_taghandler_22.setSize("55");
                __jsp_taghandler_22.setUppercase("true");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.nivelFisico");
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
              out.write(__oracle_jsp_text[26]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_24=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setPath("nivelOrigen");
                __jsp_taghandler_24.setReadonly("true");
                __jsp_taghandler_24.setSize("65");
                __jsp_taghandler_24.setUppercase("true");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.zonaEco");
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
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_26=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setPath("zonaOrigen");
                __jsp_taghandler_26.setReadonly("true");
                __jsp_taghandler_26.setSize("5");
                __jsp_taghandler_26.setUppercase("true");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_27=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setPath("zonaOrigenDesc");
                __jsp_taghandler_27.setReadonly("true");
                __jsp_taghandler_27.setSize("55");
                __jsp_taghandler_27.setUppercase("true");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setCode("intercambio.gif");
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
              out.write(__oracle_jsp_text[31]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo.datosPlazaDestino");
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
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.plazaDestino");
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
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_31=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setBeanName("modDatPrePlazaPopUp");
                __jsp_taghandler_31.setPath("plazaDestino");
                __jsp_taghandler_31.setFieldMapping("idPlaza, idSitPlaza, descSitPlaza, idUnidadPre, descUnidad, idPuestoPre, descPuesto, idEdo, descEstado, idNivelPto, idZonaEcon, descZonaEcon");
                __jsp_taghandler_31.setFieldMappingDTO("plazaDestino, situacionDestino, situacionDestinoDesc, unidadDestino, unidadDestinoDesc, puestoDestino, puestoDestinoDesc, estadoDestino, estadoDestinoDesc, nivelDestino, zonaDestino, zonaDestinoDesc");
                __jsp_taghandler_31.setWidth("800");
                __jsp_taghandler_31.setLeftPosition("17");
                __jsp_taghandler_31.setHeight("400");
                __jsp_taghandler_31.setTopPosition("20");
                __jsp_taghandler_31.setMaxlength("20");
                __jsp_taghandler_31.setDisabled("true");
                __jsp_taghandler_31.setSize("20");
                __jsp_taghandler_31.setTitle("Seleccione la Plaza Destino");
                __jsp_taghandler_31.setMaxRows("200");
                __jsp_taghandler_31.setOrderedColumns("Plaza, Situación, Unidad, Puesto, Estado, Nivel, Zona");
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._detalleCalculoNomina_tag __jsp_taghandler_32=(_oracle._jsp._tag._detalleCalculoNomina_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._detalleCalculoNomina_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setPlaza("true");
                __jsp_taghandler_32.setName("plazaDes");
                __jsp_taghandler_32.setImage("detail.gif");
                __jsp_taghandler_32.setParentPath("plazaDestino");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.situacion");
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
              out.write(__oracle_jsp_text[36]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_34=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setPath("situacionDestino");
                __jsp_taghandler_34.setReadonly("true");
                __jsp_taghandler_34.setSize("5");
                __jsp_taghandler_34.setUppercase("true");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_35=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setPath("situacionDestinoDesc");
                __jsp_taghandler_35.setReadonly("true");
                __jsp_taghandler_35.setSize("60");
                __jsp_taghandler_35.setUppercase("true");
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_36=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo.datosPresupuestales");
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
              out.write(__oracle_jsp_text[39]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.unidad");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_38=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setPath("unidadDestino");
                __jsp_taghandler_38.setReadonly("true");
                __jsp_taghandler_38.setSize("5");
                __jsp_taghandler_38.setUppercase("true");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_39=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setJspContext(pageContext);
                __jsp_taghandler_39.setPath("unidadDestinoDesc");
                __jsp_taghandler_39.setReadonly("true");
                __jsp_taghandler_39.setSize("55");
                __jsp_taghandler_39.setUppercase("true");
                __jsp_taghandler_39.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_40=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.puesto");
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
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_41=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setPath("puestoDestino");
                __jsp_taghandler_41.setReadonly("true");
                __jsp_taghandler_41.setSize("5");
                __jsp_taghandler_41.setUppercase("true");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_42=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setPath("puestoDestinoDesc");
                __jsp_taghandler_42.setReadonly("true");
                __jsp_taghandler_42.setSize("55");
                __jsp_taghandler_42.setUppercase("true");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.edo");
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
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_44=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setJspContext(pageContext);
                __jsp_taghandler_44.setPath("estadoDestino");
                __jsp_taghandler_44.setReadonly("true");
                __jsp_taghandler_44.setSize("5");
                __jsp_taghandler_44.setUppercase("true");
                __jsp_taghandler_44.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_45=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setJspContext(pageContext);
                __jsp_taghandler_45.setPath("estadoDestinoDesc");
                __jsp_taghandler_45.setReadonly("true");
                __jsp_taghandler_45.setSize("55");
                __jsp_taghandler_45.setUppercase("true");
                __jsp_taghandler_45.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
              }
              out.write(__oracle_jsp_text[48]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.nivelFisico");
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
                __jsp_taghandler_47.setPath("nivelDestino");
                __jsp_taghandler_47.setReadonly("true");
                __jsp_taghandler_47.setSize("65");
                __jsp_taghandler_47.setUppercase("true");
                __jsp_taghandler_47.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
              }
              out.write(__oracle_jsp_text[50]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setCode("sireh.label.plaza.estructura.modificaDatosPresupuestales.zonaEco");
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
                __jsp_taghandler_49.setPath("zonaDestino");
                __jsp_taghandler_49.setReadonly("true");
                __jsp_taghandler_49.setSize("5");
                __jsp_taghandler_49.setUppercase("true");
                __jsp_taghandler_49.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
              }
              out.write(__oracle_jsp_text[52]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_50=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setJspContext(pageContext);
                __jsp_taghandler_50.setPath("zonaDestinoDesc");
                __jsp_taghandler_50.setReadonly("true");
                __jsp_taghandler_50.setSize("55");
                __jsp_taghandler_50.setUppercase("true");
                __jsp_taghandler_50.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_51=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[54]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_52=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setJspContext(pageContext);
                __jsp_taghandler_52.setAction("plazaEstructura/updateIntercambioDatosPresupuestales.do");
                __jsp_taghandler_52.setValue("submit.accept");
                __jsp_taghandler_52.setOnclick("validateFormData();");
                __jsp_taghandler_52.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
              }
              out.write(__oracle_jsp_text[55]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_53=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setJspContext(pageContext);
                __jsp_taghandler_53.setAction("plazaEstructura/intercamDatosPresupuestales.do");
                __jsp_taghandler_53.setValue("submit.cancel");
                __jsp_taghandler_53.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
              }
              out.write(__oracle_jsp_text[56]);
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
  private static final char __oracle_jsp_text[][]=new char[57][];
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
    "\r\n    \r\n    <h1>\r\n        ".toCharArray();
    __oracle_jsp_text[5] = 
    " -\r\n        ".toCharArray();
    __oracle_jsp_text[6] = 
    " -\r\n        ".toCharArray();
    __oracle_jsp_text[7] = 
    " -\r\n        ".toCharArray();
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
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n            <td colspan=\"2\">\r\n                <img src=\"".toCharArray();
    __oracle_jsp_text[31] = 
    "\" border=\"0\" width=\"20\"/>\r\n            </td>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[32] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\">\r\n                        <colgroup>\r\n                            <col width=\"20%\"/>\r\n                            <col width=\"80%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[33] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n                <br/>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[39] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\">\r\n                        <colgroup>\r\n                            <col width=\"30%\"/>\r\n                            <col width=\"70%\"/>\r\n                        </colgroup>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">\r\n                                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[54] = 
    "</td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"right\">\r\n                ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n            </td>\r\n            <td colspan=\"2\" align=\"left\">\r\n                ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j.event.special.inputchange = {\r\n            setup: function() {\r\n                var self = this, val;\r\n                $j.data(this, 'timer', window.setInterval(function() {\r\n                    val = self.value;\r\n                    if ( $j.data( self, 'cache') != val ) {\r\n                        $j.data( self, 'cache', val );\r\n                        $j( self ).trigger( 'inputchange' );\r\n                    }\r\n                }, 20));\r\n            },\r\n            teardown: function() {\r\n                window.clearInterval( $j.data(this, 'timer') );\r\n            },\r\n            add: function() {\r\n                $j.data(this, 'cache', this.value);\r\n            }\r\n        };\r\n        //$j('input').on('inputchange', function() { console.log(this.value) });\r\n\r\n        $j('#plazaOrigen').on('inputchange',function(e){\r\n            //console.log('Plaza Origen Changed!')\r\n            validateFormData();\r\n        });\r\n        \r\n        $j('#plazaDestino').on('inputchange',function(e){\r\n            //console.log('Plaza Destino Changed!')\r\n            validateFormData();\r\n        });\r\n        \r\n        function validateFormData() {\r\n            var plazaOrigen = $j('#plazaOrigen').val();\r\n            var plazaDestino = $j('#plazaDestino').val();\r\n            //console.log (plazaOrigen + \" - \" + plazaDestino);\r\n            if (plazaOrigen !=\"\" && plazaDestino !=\"\") {\r\n                if (plazaOrigen == plazaDestino) {\r\n                    alert(\"La Plaza Origen no puede ser la misma que la Plaza Destino\");\r\n                    clearFormData();\r\n                    return false;\r\n                }\r\n                return false;\r\n            }\r\n            return true;\r\n        }\r\n        \r\n        function clearFormData() {\r\n            if ( !Array.prototype.forEach ) {\r\n                Array.prototype.forEach = function(fn, scope) {\r\n                    for(var i = 0, len = this.length; i < len; ++i) {\r\n                        fn.call(scope, this[i], i, this);\r\n                    }   \r\n                }\r\n            }\r\n            \r\n            var sufix = [\"Origen\", \"Destino\"];\r\n            sufix.forEach(function(suf) {\r\n                //console.log(suf);\r\n                $j('#plaza' + suf).val('');\r\n                $j('#situacion' + suf).val('');\r\n                $j('#situacion' + suf + 'Desc').val('');\r\n                $j('#unidad' + suf).val('');\r\n                $j('#unidad' + suf + 'Desc').val('');\r\n                $j('#puesto' + suf).val('');\r\n                $j('#puesto' + suf + 'Desc').val('');\r\n                $j('#estado' + suf).val('');\r\n                $j('#estado' + suf + 'Desc').val('');\r\n                $j('#nivel' + suf).val('');\r\n                $j('#zona' + suf).val('');\r\n                $j('#zona' + suf + 'Desc').val('');\r\n            });\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
