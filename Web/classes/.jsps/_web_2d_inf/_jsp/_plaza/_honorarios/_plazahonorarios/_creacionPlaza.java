package _web_2d_inf._jsp._plaza._honorarios._plazahonorarios;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _creacionPlaza extends com.orionserver.http.OrionHttpJspPage {


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
    _creacionPlaza page = this;
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
        __jsp_taghandler_1.setModelAttribute("creacionPlazaDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("inicioQuincenaCaptura");
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
                __jsp_taghandler_3.setPath("finQuincenaCaptura");
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
                __jsp_taghandler_5.setCode("sireh.label.plaza.honorarios.titulo.link");
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
                __jsp_taghandler_6.setCode("sireh.label.plaza.movimientos.titulo.link");
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
                __jsp_taghandler_7.setCode("sireh.label.plaza.honorarios.creacionPlaza.titulo");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.plaza.honorarios.creacionPlaza.titulo.datosPlaza");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.plaza.honorarios.creacionPlaza.idUnidad");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_10=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setKey("0");
                __jsp_taghandler_10.setValue("selectList.nonValue");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_11=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setBeanName("tcUnidadCreacion");
                __jsp_taghandler_11.setPath("idUnidad");
                __jsp_taghandler_11.setStyle("width: 255px;");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.plaza.honorarios.creacionPlaza.idPuesto");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_13=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setKey("0");
                __jsp_taghandler_13.setValue("selectList.nonValue");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_14=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setBeanName("tcPuestoBusqueda");
                __jsp_taghandler_14.setPath("idPuesto");
                __jsp_taghandler_14.setStyle("width: 290px;");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("sireh.label.plaza.honorarios.creacionPlaza.idEdo");
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
                _oracle._jsp._tag._filter_tag __jsp_taghandler_16=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setProperty("uniEdoCiclo");
                __jsp_taghandler_16.setCondition("contains");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_17=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setBeanName("tcUnidadEdoCreacion");
                __jsp_taghandler_17.setPath("idEdo");
                __jsp_taghandler_17.setParentPath("idUnidad");
                __jsp_taghandler_17.setProgress("true");
                __jsp_taghandler_17.setStyle("width: 255px;");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setCode("sireh.label.plaza.honorarios.creacionPlaza.idMuni");
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
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_19=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setBeanName("tcMunicipio");
                __jsp_taghandler_19.setPath("idMuni");
                __jsp_taghandler_19.setParentPath("idEdo");
                __jsp_taghandler_19.setProgress("true");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.plaza.honorarios.creacionPlaza.plazaIniCont");
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
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_21=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setPath("plazaIniCont");
                __jsp_taghandler_21.setSize("10");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setCode("sireh.label.plaza.honorarios.creacionPlaza.plazaFinCont");
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
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_23=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setPath("plazaFinCont");
                __jsp_taghandler_23.setSize("10");
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setCode("sireh.label.plaza.honorarios.creacionPlaza.idZonaEco");
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
                _oracle._jsp._tag._filter_tag __jsp_taghandler_25=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setProperty("TAB.ID_RANGO");
                __jsp_taghandler_25.setCondition("contains");
                __jsp_taghandler_25.setPath("idRango");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_26=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setKey("0");
                __jsp_taghandler_26.setValue("selectList.nonValue");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_27=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setBeanName("zonaEconomicaCreacionPlaza");
                __jsp_taghandler_27.setPath("idZonaEco");
                __jsp_taghandler_27.setParentPath("idPuesto");
                __jsp_taghandler_27.setProgress("true");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setCode("sireh.label.plaza.honorarios.creacionPlaza.idRango");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_29=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setPath("idRango");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.plaza.honorarios.creacionPlaza.titulo.datosPresupuesto");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setCode("sireh.label.plaza.honorarios.creacionPlaza.idNivelFisico");
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
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_32=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setBeanName("nivelCreacionPlaza");
                __jsp_taghandler_32.setPath("nivelFisico");
                __jsp_taghandler_32.setParentPath("idPuesto");
                __jsp_taghandler_32.setProgress("true");
                __jsp_taghandler_32.setDisabled("true");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setCode("sireh.label.plaza.honorarios.creacionPlaza.nombramiento");
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
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_34=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setBeanName("nombramientoCreacionPlaza");
                __jsp_taghandler_34.setPath("nombramiento");
                __jsp_taghandler_34.setParentPath("idPuesto");
                __jsp_taghandler_34.setProgress("true");
                __jsp_taghandler_34.setDisabled("true");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setCode("sireh.label.plaza.honorarios.creacionPlaza.jerarquia");
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
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_36=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setBeanName("jerarquiaCreacionPlaza");
                __jsp_taghandler_36.setPath("jerarquia");
                __jsp_taghandler_36.setParentPath("idPuesto");
                __jsp_taghandler_36.setProgress("true");
                __jsp_taghandler_36.setDisabled("true");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("sireh.label.plaza.honorarios.creacionPlaza.sueldo");
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
                _oracle._jsp._tag._filter_tag __jsp_taghandler_38=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setProperty("TAB.ID_ZONA_ECON");
                __jsp_taghandler_38.setCondition("contains");
                __jsp_taghandler_38.setPath("idZonaEco");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_39=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setJspContext(pageContext);
                __jsp_taghandler_39.setProperty("TAB.ID_RANGO");
                __jsp_taghandler_39.setCondition("contains");
                __jsp_taghandler_39.setPath("idRango");
                __jsp_taghandler_39.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_40=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setJspContext(pageContext);
                __jsp_taghandler_40.setBeanName("sueldoCreacionPlaza");
                __jsp_taghandler_40.setPath("sueldo");
                __jsp_taghandler_40.setParentPath("idPuesto");
                __jsp_taghandler_40.setProgress("true");
                __jsp_taghandler_40.setFilterPaths("idZonaEco");
                __jsp_taghandler_40.setDisabled("true");
                __jsp_taghandler_40.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_41=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setCode("sireh.label.plaza.honorarios.creacionPlaza.compensacion");
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
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_42=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setProperty("TAB.ID_ZONA_ECON");
                __jsp_taghandler_42.setCondition("contains");
                __jsp_taghandler_42.setPath("idZonaEco");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_43=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setJspContext(pageContext);
                __jsp_taghandler_43.setProperty("TAB.ID_RANGO");
                __jsp_taghandler_43.setCondition("contains");
                __jsp_taghandler_43.setPath("idRango");
                __jsp_taghandler_43.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_44=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setJspContext(pageContext);
                __jsp_taghandler_44.setBeanName("compensacionCreacionPlaza");
                __jsp_taghandler_44.setPath("compensacion");
                __jsp_taghandler_44.setParentPath("idPuesto");
                __jsp_taghandler_44.setProgress("true");
                __jsp_taghandler_44.setFilterPaths("idZonaEco");
                __jsp_taghandler_44.setDisabled("true");
                __jsp_taghandler_44.setOnchange("importe()");
                __jsp_taghandler_44.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_45=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setCode("sireh.label.plaza.honorarios.creacionPlaza.importeHonorario");
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
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setValue("$");
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,2);
              }
              {
                org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path");
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setPath("importeHonorarioString");
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
              out.write(__oracle_jsp_text[49]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setCode("sireh.label.plaza.honorarios.creacionPlaza.plazaReferencia");
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
              out.write(__oracle_jsp_text[50]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_49=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setJspContext(pageContext);
                __jsp_taghandler_49.setPath("plazaReferencia");
                __jsp_taghandler_49.setMaxlength("60");
                __jsp_taghandler_49.setSize("60");
                __jsp_taghandler_49.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[52]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_51=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setAction("plazaHonorarios/saveCreacionPlaza.do");
                __jsp_taghandler_51.setValue("submit.accept");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[53]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_52=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setJspContext(pageContext);
                __jsp_taghandler_52.setAction("plazaHonorarios/creacionPlaza.do");
                __jsp_taghandler_52.setValue("submit.cancel");
                __jsp_taghandler_52.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
              }
              out.write(__oracle_jsp_text[54]);
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
  private static final char __oracle_jsp_text[][]=new char[55][];
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
    " -  \r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    " -  \r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" width=\"90%\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[11] = 
    "</strong>\r\n                    </legend>\r\n                    <table>\r\n                        <tr>\r\n                            <td width=\"155px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td width=\"255px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>\r\n                            <td width=\"155px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td width=\"290px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[27] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[31] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td height=\"10px\"></td>\r\n        </tr>\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[33] = 
    "</strong>\r\n                    </legend>\r\n                    <table>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                            </td>\r\n                            <td align=\"left\" colspan=\"2\"></td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"155px\" align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n                            <td width=\"255px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                            </td>\r\n                            <td width=\"155px\" align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[38] = 
    "</td>\r\n                            <td width=\"290px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[40] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"155px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[48] = 
    "</td>\r\n                            <td width=\"255px\" align=\"left\">".toCharArray();
    __oracle_jsp_text[49] = 
    "</td>\r\n                            <td width=\"445px\" colspan=\"2\"></td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[50] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"3\">".toCharArray();
    __oracle_jsp_text[51] = 
    "</td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table align=\"center\" width=\"100%\" border=\"0\">\r\n                    <tr>\r\n                        <td align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[52] = 
    "</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"right\">\r\n                            ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                        </td>\r\n                        <td align=\"left\">\r\n                            ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">        \r\n        function importe() {\r\n            $j(\"#importeHonorarioString\").val(\"\");\r\n            \r\n            var sueldo = 0;\r\n            var compensacion = 0;\r\n            var importeHonorarioValue = 0;\r\n            \r\n            sueldo = $j(\"#sueldo option:selected\" ).text();\r\n            if (sueldo != null) {\r\n                sueldo = sueldo.replace(\"$\", \"\");\r\n                sueldo = sueldo.replace(/\\,/g,\"\");\r\n            }\r\n            compensacion = $j(\"#compensacion option:selected\" ).text();\r\n            if (compensacion != null) {\r\n                compensacion = compensacion.replace(\"$\", \"\");\r\n                compensacion = compensacion.replace(/\\,/g,\"\");\r\n            }\r\n            if (sueldo != null && compensacion != null) {\r\n                importeHonorarioValue = parseFloat(sueldo) + parseFloat(compensacion);\r\n            }\r\n            var amount = parseFloat(Math.round(importeHonorarioValue * 100) / 100).toFixed(2);\r\n            $j(\"#importeHonorarioString\").val(amount).digits();\r\n        }\r\n        \r\n        $j.fn.digits = function(){ \r\n            return this.each(function(){ \r\n                $j(this).val($j(this).val().replace(/(\\d)(?=(\\d\\d\\d)+(?!\\d))/g, \"$1,\")); \r\n            });\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
