package _web_2d_inf._jsp._spc._capcer._seguimiento;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _registrarCurso extends com.orionserver.http.OrionHttpJspPage {


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
    _registrarCurso page = this;
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
        __jsp_taghandler_1.setModelAttribute("registrarCursoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("rolAdministradorCapacitacion");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setPath("rolOperadorCapacitacion");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setPath("noParticipantes");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("anioOperacion");
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
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("viewName");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("idCursoEditar");
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
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.spc.capcer.registro.registrarCurso.title");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.spc.capcer.registro.registrarCurso.tipoCurso");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setPath("tipoCurso");
                __jsp_taghandler_10.setValue("CAP");
                __jsp_taghandler_10.setLabel(" Capacitacion");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setPath("tipoCurso");
                __jsp_taghandler_11.setValue("CER");
                __jsp_taghandler_11.setLabel(" Certificacion");
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
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.spc.capcer.registro.registrarCurso.coordinacion");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_13=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setKey("");
                __jsp_taghandler_13.setValue("selectList.nonValue");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_14=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setBeanName("tcCapCoordinacion-registrarCurso");
                __jsp_taghandler_14.setPath("idCoordinacion");
                __jsp_taghandler_14.setDisabled((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_14.setStyle("width:200px;");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("sireh.label.spc.capcer.registro.registrarCurso.ramo");
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
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setCode("sireh.label.spc.capcer.registro.registrarCurso.ejeTematico");
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
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.spc.capcer.registro.registrarCurso.subprograma");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_18=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setKey("");
                __jsp_taghandler_18.setValue("selectList.nonValue");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_19=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setBeanName("tcCapSubprograma-registrarCurso");
                __jsp_taghandler_19.setPath("idSubprograma");
                __jsp_taghandler_19.setDisabled((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_19.setOnchange("generaClaveCurso()");
                __jsp_taghandler_19.setStyle("width:200px;");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.spc.capcer.registro.registrarCurso.modalidad");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.spc.capcer.registro.registrarCurso.finalidad");
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
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setCode("sireh.label.spc.capcer.registro.registrarCurso.caracter");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.label.spc.capcer.registro.registrarCurso.curso");
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
              out.write(__oracle_jsp_text[27]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setCode("sireh.label.spc.capcer.registro.registrarCurso.claveCurso");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_25=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setPath("claveCurso");
                __jsp_taghandler_25.setMaxlength("12");
                __jsp_taghandler_25.setReadonly("true");
                __jsp_taghandler_25.setSize("60");
                __jsp_taghandler_25.setCss("anchoInputSmall claveCurso");
                __jsp_taghandler_25.setUppercase("true");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setCode("sireh.label.spc.capcer.registro.registrarCurso.duracion");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_27=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setPath("duracion");
                __jsp_taghandler_27.setMaxlength("14");
                __jsp_taghandler_27.setSize("60");
                __jsp_taghandler_27.setCss("anchoInput alphanumericEspacios");
                __jsp_taghandler_27.setUppercase("true");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setCode("sireh.label.spc.capcer.registro.registrarCurso.presupuesto");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_29=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setPath("presupuesto");
                __jsp_taghandler_29.setMaxlength("15");
                __jsp_taghandler_29.setSize("60");
                __jsp_taghandler_29.setCss("anchoInputSmall");
                __jsp_taghandler_29.setUppercase("true");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[33]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.spc.capcer.registro.registrarCurso.noParticipantes");
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
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.noParticipantes}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,2);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setCode("sireh.label.spc.capcer.registro.registrarCurso.claveCertificacion");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_33=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setJspContext(pageContext);
                __jsp_taghandler_33.setPath("claveCertificacion");
                __jsp_taghandler_33.setMaxlength("60");
                __jsp_taghandler_33.setSize("60");
                __jsp_taghandler_33.setCss("anchoInput alphanumericEspacios");
                __jsp_taghandler_33.setUppercase("true");
                __jsp_taghandler_33.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setCode("sireh.label.spc.capcer.registro.registrarCurso.tipoCapacidad");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_35=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setKey("");
                __jsp_taghandler_35.setValue("selectList.nonValue");
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_36=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setBeanName("tcCapTipoCapacidad-registrarCurso");
                __jsp_taghandler_36.setPath("tipoCapacidad");
                __jsp_taghandler_36.setStyle("width:200px;");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[40]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("sireh.label.spc.capcer.registro.registrarCurso.nivelCurso");
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
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_38=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setKey("");
                __jsp_taghandler_38.setValue("selectList.nonValue");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_39=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setJspContext(pageContext);
                __jsp_taghandler_39.setBeanName("tcCapNivelCurso-registrarCurso");
                __jsp_taghandler_39.setPath("nivelCurso");
                __jsp_taghandler_39.setStyle("width:200px;");
                __jsp_taghandler_39.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_40=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setCode("sireh.label.spc.capcer.registro.registrarCurso.supervisorSHCP");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_41=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setPath("supervisorSHCP");
                __jsp_taghandler_41.setMaxlength("20");
                __jsp_taghandler_41.setSize("60");
                __jsp_taghandler_41.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_41.setUppercase("true");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setCode("sireh.label.spc.capcer.registro.registrarCurso.supervisorInstEducat");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_43=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setJspContext(pageContext);
                __jsp_taghandler_43.setPath("supervisorInstEducat");
                __jsp_taghandler_43.setMaxlength("20");
                __jsp_taghandler_43.setSize("60");
                __jsp_taghandler_43.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_43.setUppercase("true");
                __jsp_taghandler_43.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setCode("sireh.label.spc.capcer.registro.registrarCurso.tipoInstEducat");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_45=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setJspContext(pageContext);
                __jsp_taghandler_45.setKey("");
                __jsp_taghandler_45.setValue("selectList.nonValue");
                __jsp_taghandler_45.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
              }
              out.write(__oracle_jsp_text[49]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_46=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setJspContext(pageContext);
                __jsp_taghandler_46.setBeanName("tcCapTipoInstEducat-registrarCurso");
                __jsp_taghandler_46.setPath("tipoInstEducat");
                __jsp_taghandler_46.setStyle("width:200px;");
                __jsp_taghandler_46.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_46, pageContext);
              }
              out.write(__oracle_jsp_text[50]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setCode("sireh.label.spc.capcer.registro.registrarCurso.proveedor");
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
              out.write(__oracle_jsp_text[51]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_48=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setJspContext(pageContext);
                __jsp_taghandler_48.setKey("");
                __jsp_taghandler_48.setValue("selectList.nonValue");
                __jsp_taghandler_48.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_48, pageContext);
              }
              out.write(__oracle_jsp_text[52]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_49=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setJspContext(pageContext);
                __jsp_taghandler_49.setBeanName("tcCapProveedor-registrarCurso");
                __jsp_taghandler_49.setPath("proveedor");
                __jsp_taghandler_49.setStyle("width:200px;");
                __jsp_taghandler_49.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setCode("sireh.label.spc.capcer.registro.registrarCurso.situacionProveedor");
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
              out.write(__oracle_jsp_text[54]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_51=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setKey("");
                __jsp_taghandler_51.setValue("selectList.nonValue");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[55]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_52=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setJspContext(pageContext);
                __jsp_taghandler_52.setBeanName("tcCapSituacionProveedor-registrarCurso");
                __jsp_taghandler_52.setPath("situacionProveedor");
                __jsp_taghandler_52.setStyle("width:200px;");
                __jsp_taghandler_52.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
              }
              out.write(__oracle_jsp_text[56]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_53=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.rolAdministradorCapacitacion || registrarCursoDTO.rolOperadorCapacitacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[57]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_54=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_54.setParent(__jsp_taghandler_53);
                      __jsp_taghandler_54.setJspContext(pageContext);
                      __jsp_taghandler_54.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.path}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_54.setAction((java.lang.String) ("seguimientoCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.viewName}",java.lang.String.class, __ojsp_varRes, null)+".do"));
                      __jsp_taghandler_54.setValue("submit.save");
                      __jsp_taghandler_54.setProgressBar("true");
                      __jsp_taghandler_54.setAlertCode("confirm.spc.capcer.registro.registrarCurso");
                      __jsp_taghandler_54.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
                    }
                    out.write(__oracle_jsp_text[58]);
                  } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,2);
              }
              out.write(__oracle_jsp_text[59]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_55=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setJspContext(pageContext);
                __jsp_taghandler_55.setAction("seguimientoCursoSPC/consultaCurso.do");
                __jsp_taghandler_55.setValue("submit.cancel");
                __jsp_taghandler_55.setProgressBar("true");
                __jsp_taghandler_55.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
              }
              out.write(__oracle_jsp_text[60]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_56=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idEjeTematico}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,2);
              }
              out.write(__oracle_jsp_text[61]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_57=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idModalidad}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,2);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_58=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idFinalidad}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,2);
              }
              out.write(__oracle_jsp_text[63]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_59=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idCaracter}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,2);
              }
              out.write(__oracle_jsp_text[64]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_60=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idCursoPrincipal}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,2);
              }
              out.write(__oracle_jsp_text[65]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_61=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.registrar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[66]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_62=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_62.setParent(__jsp_taghandler_61);
                      __jsp_taghandler_62.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.anioOperacion}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                      if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,3);
                    }
                    out.write(__oracle_jsp_text[67]);
                  } while (__jsp_taghandler_61.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,2);
              }
              out.write(__oracle_jsp_text[68]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_63=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[69]);
                  } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,2);
              }
              out.write(__oracle_jsp_text[70]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_64=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.registrar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[71]);
                  } while (__jsp_taghandler_64.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,2);
              }
              out.write(__oracle_jsp_text[72]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_65=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.Boolean.class, __ojsp_varRes,null)));
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
      out.write(__oracle_jsp_text[75]);

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
  private static final char __oracle_jsp_text[][]=new char[76][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n\n<style type=\"text/css\">\n    .anchoInput {\n        width: 200px;\n    }\n    .anchoInputSmall {\n        width: 100px;\n    }\n</style>\n\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    \n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n    \n    <h1>".toCharArray();
    __oracle_jsp_text[12] = 
    "</h1>\n    <p>&nbsp;</p>\n    \n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\n        <tr>    \n            <td>\n                <fieldset>\n                    <legend style=\"font-size:1.3em\"><strong>Datos del curso</strong></legend>\n                    <table width=\"100%\">\n                        <tbody>\n                            <tr align=\"left\">\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[13] = 
    ":</td>\n                                <td align=\"left\">\n                                    <table align=\"center\" width=\"100%\">\n                                        <tr>                        \n                                            <td align=\"center\">\n                                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n                                            </td>\n                                            <td align=\"center\">\n                                                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n                                            </td>\n                                        </tr>\n                                    </table>\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[16] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n                                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n                                </td>\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[19] = 
    ":</td>\n                                <td>06</td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[20] = 
    ":</td>\n                                <td>\n                                    <select name='idEjeTematico' id='idEjeTematico' style=\"width:200px;\" onchange=\"generaClaveCurso();getModalidadCallback(false)\">\n                                        <option value=''>SELECCIONE...</option>\n                                    </select>\n                                </td>\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[21] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n                                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n                                </td>  \n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[24] = 
    ":</td>\n                                <td>\n                                    <select name='idModalidad' id='idModalidad' style=\"width:200px;\" onchange=\"generaClaveCurso();getFinalidadCallback(false)\">\n                                        <option value=''>SELECCIONE...</option>\n                                    </select>\n                                </td>\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[25] = 
    ":</td>\n                                <td>\n                                    <select name='idFinalidad' id='idFinalidad' style=\"width:200px;\" onchange=\"generaClaveCurso();getCaracterCallback(false)\">\n                                        <option value=''>SELECCIONE...</option>\n                                    </select>\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[26] = 
    ":</td>\n                                <td>\n                                    <select name='idCaracter' id='idCaracter' style=\"width:200px;\" onchange=\"generaClaveCurso();getCursoPrincipalCallback(false)\">\n                                        <option value=''>SELECCIONE...</option>\n                                    </select>\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[27] = 
    ":</td>\n                                <td>\n                                    <select name='idCursoPrincipal' id='idCursoPrincipal' style=\"width:200px;\" onchange=\"generaClaveCurso()\">\n                                        <option value=''>SELECCIONE...</option>\n                                    </select>\n                                </td>\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[28] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[30] = 
    ":</td>\n                                <td>                                    \n                                    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n                                </td>\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[32] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[34] = 
    ":</td>\n                                <td>".toCharArray();
    __oracle_jsp_text[35] = 
    "</td>\n                            </tr>\n                        </tbody>\n                    </table>\n                </fieldset><br/><br/>\n                \n                <fieldset id=\"fieldsetCertificacion\">\n                    <legend style=\"font-size:1.3em\"><strong>Certificaci&oacute;n</strong></legend>\n                    <table width=\"100%\">\n                        <tbody>\n                            <tr align=\"left\">\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[36] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[38] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n                                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[41] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n                                    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[44] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[46] = 
    ":</td>\n                                <td>                                    \n                                    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\n                                </td>\n                            </tr>\n                        </tbody>\n                    </table>\n                </fieldset><br/><br/>\n\n                <fieldset>\n                    <legend style=\"font-size:1.3em\"><strong>Proveedor</strong></legend>\n                    <table width=\"100%\">\n                        <tbody>\n                            <tr align=\"left\">\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[48] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[49] = 
    "\n                                    ".toCharArray();
    __oracle_jsp_text[50] = 
    "\n                                </td>\n                            </tr>\n                            <tr align=\"left\">\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[51] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[52] = 
    "\n                                    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\n                                </td>\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[54] = 
    ":</td>\n                                <td>\n                                    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\n                                    ".toCharArray();
    __oracle_jsp_text[56] = 
    "\n                                </td>\n                            </tr>\n                        </tbody>\n                    </table>\n                </fieldset>\n            </td>\n        </tr>\n        <tr>\n            <td valign=\"middle\" height=\"20px\" align=\"left\">\n                <b>* Campos requeridos</b>\n            </td>\n        </tr>\n        <tr align=\"center\">\n            <td>\n                <table width=\"90%\" border=\"0\" align=\"center\">\n                    <tr>\n                        <td align=\"center\">\n                            ".toCharArray();
    __oracle_jsp_text[57] = 
    "\n                                ".toCharArray();
    __oracle_jsp_text[58] = 
    " &nbsp;\n                            ".toCharArray();
    __oracle_jsp_text[59] = 
    "\n                            ".toCharArray();
    __oracle_jsp_text[60] = 
    "\n                        </td>\n                    </tr>\n                </table>\n            </td>\n        </tr>\n    </table>\n    \n    <script type=\"text/javascript\">\n        function getEjeTematicoCallback(verify) {\n            var idTipoCurso1 = $j('#tipoCurso1:checked').val();\n            var idTipoCurso2 = $j('#tipoCurso2:checked').val();\n            var idTipoCurso = \"\";\n            if (idTipoCurso2 != null && idTipoCurso2 == 'CER') {\n                idTipoCurso = \"CER\";\n            } else {\n                idTipoCurso = \"CAP\";\n            }\n            $j.ajax({\n                url: 'getEjeTematicoCallback.do',\n                type: 'GET',\n                data: 'idTipoCurso=' + idTipoCurso,\n                success: function(data) {\n                    $j('select[id=\"idEjeTematico\"]').find('option').remove().end();\n                    $j('select[id=\"idEjeTematico\"]').append(data);\n                    \n                    if (verify) {\n                        verifyEjeTematico();\n                        getModalidadCallback(true);\n                    }\n                }\n            });\n        }\n        \n        function getModalidadCallback(verify) {\n            var idEjeTematico = $j('select[id=\"idEjeTematico\"]').val();\n            $j.ajax({\n                url: 'getModalidadCallback.do',\n                type: 'GET',\n                data: 'idEjeTematico=' + idEjeTematico,\n                success: function(data) {\n                    $j('select[id=\"idModalidad\"]').find('option').remove().end();\n                    $j('select[id=\"idModalidad\"]').append(data);\n                    if (verify) {\n                        verifyModalidad();\n                        getFinalidadCallback(true);\n                    }\n                }\n            });\n        }\n        \n        function getFinalidadCallback(verify) {\n            var idEjeTematico = $j('select[id=\"idEjeTematico\"]').val();\n            var idModalidad = $j('select[id=\"idModalidad\"]').val();\n            $j.ajax({\n                url: 'getFinalidadCallback.do',\n                type: 'GET',\n                data: 'idEjeTematico=' + idEjeTematico + '&idModalidad=' + idModalidad,\n                success: function(data) {\n                    $j('select[id=\"idFinalidad\"]').find('option').remove().end();\n                    $j('select[id=\"idFinalidad\"]').append(data);\n                    if (verify) {\n                        verifyFinalidad();\n                        getCaracterCallback(true);\n                    }\n                }\n            });\n        }\n        \n        function getCaracterCallback(verify) {\n            var idEjeTematico = $j('select[id=\"idEjeTematico\"]').val();\n            var idModalidad = $j('select[id=\"idModalidad\"]').val();\n            var idFinalidad = $j('select[id=\"idFinalidad\"]').val();\n            $j.ajax({\n                url: 'getCaracterCallback.do',\n                type: 'GET',\n                data: 'idEjeTematico=' + idEjeTematico + '&idModalidad=' + idModalidad + '&idFinalidad=' + idFinalidad,\n                success: function(data) {\n                    $j('select[id=\"idCaracter\"]').find('option').remove().end();\n                    $j('select[id=\"idCaracter\"]').append(data);\n                    \n                    if (verify) {\n                        verifyCaracter();\n                        getCursoPrincipalCallback(true);\n                    }\n                }\n            });\n        }\n        \n        function getCursoPrincipalCallback(verify) {\n            var idEjeTematico = $j('select[id=\"idEjeTematico\"]').val();\n            var idModalidad = $j('select[id=\"idModalidad\"]').val();\n            var idFinalidad = $j('select[id=\"idFinalidad\"]').val();\n            var idCaracter = $j('select[id=\"idCaracter\"]').val();\n            \n            $j.ajax({\n                url: 'getCursoPrincipalCallback.do',\n                type: 'GET',\n                data: 'idEjeTematico=' + idEjeTematico + '&idModalidad=' + idModalidad + '&idFinalidad=' + idFinalidad + '&idCaracter=' + idCaracter,\n                success: function(data) {\n                    $j('select[id=\"idCursoPrincipal\"]').find('option').remove().end();\n                    $j('select[id=\"idCursoPrincipal\"]').append(data);\n                    if (verify) {\n                        verifyCursoPrincipal();\n                    }\n                }\n            });\n        }\n        \n        function verifyEjeTematico() {\n            var idEjeTematico = '".toCharArray();
    __oracle_jsp_text[61] = 
    "';\n            if (idEjeTematico != null && idEjeTematico != \"\") {\n                $j(\"#idEjeTematico option[value=\" + idEjeTematico +\"]\").attr(\"selected\",\"selected\") ;\n            }\n        }\n        function verifyModalidad() {\n            var idModalidad = '".toCharArray();
    __oracle_jsp_text[62] = 
    "';\n            if (idModalidad != null && idModalidad != \"\") {\n                $j(\"#idModalidad option[value=\" + idModalidad +\"]\").attr(\"selected\",\"selected\") ;\n            }\n        }\n        function verifyFinalidad() {\n            var idFinalidad = '".toCharArray();
    __oracle_jsp_text[63] = 
    "';\n            if (idFinalidad != null && idFinalidad != \"\") {\n                $j(\"#idFinalidad option[value=\" + idFinalidad +\"]\").attr(\"selected\",\"selected\") ;\n            }\n        }\n        function verifyCaracter() {\n            var idCaracter = '".toCharArray();
    __oracle_jsp_text[64] = 
    "';\n            if (idCaracter != null && idCaracter != \"\") {\n                $j(\"#idCaracter option[value=\" + idCaracter +\"]\").attr(\"selected\",\"selected\") ;\n            }\n        }\n        function verifyCursoPrincipal() {\n            var idCursoPrincipal = '".toCharArray();
    __oracle_jsp_text[65] = 
    "';\n            if (idCursoPrincipal != null && idCursoPrincipal != \"\") {\n                $j(\"#idCursoPrincipal option[value=\" + idCursoPrincipal +\"]\").attr(\"selected\",\"selected\") ;\n            }\n        }\n    </script>\n    \n    ".toCharArray();
    __oracle_jsp_text[66] = 
    "\n        <script type=\"text/javascript\">\n            // Genera clave de curso\n            function generaClaveCurso() {\n                var idTipoCurso1 = $j('#tipoCurso1:checked').val();\n                var idTipoCurso2 = $j('#tipoCurso2:checked').val();\n                var idTipoCurso = \"\";\n                if (idTipoCurso2 != null && idTipoCurso2 != 'CER') {\n                    idTipoCurso = \"CER\";\n                } else {\n                    idTipoCurso = \"CAP\";\n                }\n                var consecutivo = \"\";\n                var codigoCurso = $j(\"#idCursoPrincipal\").val();\n                var idSubprograma = $j(\"#idSubprograma\").val();\n                var idEjeTematico = $j(\"#idEjeTematico\").val();\n                var anioOperacion = \"".toCharArray();
    __oracle_jsp_text[67] = 
    "\";\n                $j.ajax({\n                    url: 'getConsecutivoClaveCursoCallback.do',\n                    type: 'GET',\n                    data: 'idTipoCurso=' + idTipoCurso + '&idCursoPrincicpal=' + codigoCurso + '&idEjeTematico=' + idEjeTematico + '&cicloEjeTematico=' + anioOperacion + '&idSubprograma=' + idSubprograma,\n                    success: function(data) {\n                        var claveCursoGenerada = codigoCurso + data + anioOperacion.substring(2, 4) + \"-\" + idSubprograma;\n                        $j(\"#claveCurso\").val(claveCursoGenerada);\n                    }\n                });\n            }\n        </script>\n    ".toCharArray();
    __oracle_jsp_text[68] = 
    "\n    \n    ".toCharArray();
    __oracle_jsp_text[69] = 
    "\n        <script type=\"text/javascript\">\n            // Genera clave de curso\n            function generaClaveCurso() {\n            }\n        </script>\n    ".toCharArray();
    __oracle_jsp_text[70] = 
    "\n    \n    <script type=\"text/javascript\">\n        // Validaciones\n        $j(document).ready(function(){            \n            $j('.alpha').alpha();\n            $j('.alphaEspacios').alpha({allow:\" \"});\n            $j('.alphanumeric').alphanumeric();\n            $j('.alphanumericEspacios').alphanumeric({allow:\" \"});\n            $j('.claveCurso').alphanumeric({allow:\"-\"});\n            $j('.numeric').numeric();\n            $j(\"#presupuesto\").mask(\"9999999999.99\");\n        });\n        \n        function disableFieldsCurso(clear) {\n            if (clear) {\n                $j(\"#idCoordinacion\").val(\"\");\n                $j(\"#idEjeTematico\").val(\"\");\n                $j(\"#idSubprograma\").val(\"\");\n                $j(\"#idModalidad\").val(\"\");\n                $j(\"#idFinalidad\").val(\"\");\n                $j(\"#idCaracter\").val(\"\");\n                $j(\"#idCursoPrincipal\").val(\"\");\n                $j(\"#duracion\").val(\"\");\n            }\n            $j(\"#idCoordinacion\").attr(\"disabled\",\"true\");\n            $j(\"#idEjeTematico\").attr(\"disabled\",\"true\");\n            $j(\"#idSubprograma\").attr(\"disabled\",\"true\");\n            $j(\"#idModalidad\").attr(\"disabled\",\"true\");\n            $j(\"#idFinalidad\").attr(\"disabled\",\"true\");\n            $j(\"#idCaracter\").attr(\"disabled\",\"true\");\n            $j(\"#idCursoPrincipal\").attr(\"disabled\",\"true\");\n            $j(\"#duracion\").attr(\"disabled\",\"true\");\n            $j(\"#presupuesto\").attr(\"disabled\",\"true\");\n            $j(\"#noParticipantes\").attr(\"disabled\",\"true\");\n        }\n        function enableFieldsCurso(clear) {\n            if (clear) {\n                $j(\"#idCoordinacion\").val(\"\");\n                $j(\"#idEjeTematico\").val(\"\");\n                $j(\"#idSubprograma\").val(\"\");\n                $j(\"#idModalidad\").val(\"\");\n                $j(\"#idFinalidad\").val(\"\");\n                $j(\"#idCaracter\").val(\"\");\n                $j(\"#idCursoPrincipal\").val(\"\");\n                $j(\"#duracion\").val(\"\");\n            }\n            $j(\"#idCoordinacion\").removeAttr(\"disabled\");\n            $j(\"#idEjeTematico\").removeAttr(\"disabled\");\n            $j(\"#idSubprograma\").removeAttr(\"disabled\");\n            $j(\"#idModalidad\").removeAttr(\"disabled\");\n            $j(\"#idFinalidad\").removeAttr(\"disabled\");\n            $j(\"#idCaracter\").removeAttr(\"disabled\");\n            $j(\"#idCursoPrincipal\").removeAttr(\"disabled\");\n            $j(\"#duracion\").removeAttr(\"disabled\");\n            $j(\"#presupuesto\").removeAttr(\"disabled\");\n        }\n        \n        function disableClearFieldsCertificacion(clear) {\n            if (clear) {\n                $j(\"#claveCertificacion\").val(\"\");\n                $j(\"#tipoCapacidad\").val(\"\");\n                $j(\"#nivelCurso\").val(\"\");\n                $j(\"#supervisorSHCP\").val(\"\");\n                $j(\"#supervisorInstEducat\").val(\"\");\n            }\n            $j(\"#claveCertificacion\").attr(\"disabled\",\"true\");\n            $j(\"#tipoCapacidad\").attr(\"disabled\",\"true\");\n            $j(\"#nivelCurso\").attr(\"disabled\",\"true\");\n            $j(\"#supervisorSHCP\").attr(\"disabled\",\"true\");\n            $j(\"#supervisorInstEducat\").attr(\"disabled\",\"true\");\n        }\n        function enableFieldsCertificacion(clear) {\n            if (clear) {\n                $j(\"#claveCertificacion\").val(\"\");\n                $j(\"#tipoCapacidad\").val(\"\");\n                $j(\"#nivelCurso\").val(\"\");\n                $j(\"#supervisorSHCP\").val(\"\");\n                $j(\"#supervisorInstEducat\").val(\"\");\n            }\n            $j(\"#claveCertificacion\").removeAttr(\"disabled\");\n            $j(\"#tipoCapacidad\").removeAttr(\"disabled\");\n            $j(\"#nivelCurso\").removeAttr(\"disabled\");\n            $j(\"#supervisorSHCP\").removeAttr(\"disabled\");\n            $j(\"#supervisorInstEducat\").removeAttr(\"disabled\");\n        }\n        \n        function disableFieldsProveedor(clear) {\n            if (clear) {\n                $j(\"#tipoInstEducat\").val(\"\");\n                $j(\"#proveedor\").val(\"\");\n                $j(\"#situacionProveedor\").val(\"\");\n            }\n            $j(\"#tipoInstEducat\").attr(\"disabled\",\"true\");\n            $j(\"#proveedor\").attr(\"disabled\",\"true\");\n            $j(\"#situacionProveedor\").attr(\"disabled\",\"true\");\n        }\n        function enableFieldsProveedor(clear) {\n            if (clear) {\n                $j(\"#tipoInstEducat\").val(\"\");\n                $j(\"#proveedor\").val(\"\");\n                $j(\"#situacionProveedor\").val(\"\");\n            }\n            $j(\"#tipoInstEducat\").removeAttr(\"disabled\");\n            $j(\"#proveedor\").removeAttr(\"disabled\");\n            $j(\"#situacionProveedor\").removeAttr(\"disabled\");\n        }\n        \n        // Curso de capacitacion\n        $j(\"#tipoCurso1\").click(function(){\n            //console.log(\"Curso de capacitacion\");\n            enableFieldsCurso(true);\n            $j(\"#fieldsetCertificacion\").hide();\n            disableClearFieldsCertificacion(true);\n            enableFieldsProveedor(true);\n            getEjeTematicoCallback(false);\n        });\n        \n        // Curso de certificacion\n        $j(\"#tipoCurso2\").click(function(){\n            //console.log(\"Curso de certificacion\");    \n            enableFieldsCurso(true);\n            $j(\"#fieldsetCertificacion\").show();\n            enableFieldsCertificacion(true);\n            enableFieldsProveedor(true);\n            getEjeTematicoCallback(false);\n        });\n    </script>\n    \n    ".toCharArray();
    __oracle_jsp_text[71] = 
    "\n        <script type=\"text/javascript\">\n            // Inicializar forma\n            disableFieldsCurso(true);\n            disableClearFieldsCertificacion(true);\n            disableFieldsProveedor(true);\n            $j(\"#fieldsetCertificacion\").hide();\n            $j(\"#camposCertificacion\").hide();\n        </script>\n    ".toCharArray();
    __oracle_jsp_text[72] = 
    "\n    \n    ".toCharArray();
    __oracle_jsp_text[73] = 
    "\n        <script type=\"text/javascript\">\n            // Inicializar forma\n            $j(\"#tipoCurso1\").attr(\"disabled\",\"true\");\n            $j(\"#tipoCurso2\").attr(\"disabled\",\"true\");\n            disableFieldsCurso(false);\n            getEjeTematicoCallback(true);\n        </script>\n    ".toCharArray();
    __oracle_jsp_text[74] = 
    "\n".toCharArray();
    __oracle_jsp_text[75] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
