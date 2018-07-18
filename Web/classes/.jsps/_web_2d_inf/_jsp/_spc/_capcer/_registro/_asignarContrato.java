package _web_2d_inf._jsp._spc._capcer._registro;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _asignarContrato extends com.orionserver.http.OrionHttpJspPage {


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
    _asignarContrato page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag name modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("checkBoxTest");
        __jsp_taghandler_1.setModelAttribute("asignarContratoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("anioOperacion");
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
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setPath("beanName");
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
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setPath("urlOrigen");
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
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("urlDestino");
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
              out.write(__oracle_jsp_text[11]);
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
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("rolAdministradorCapacitacion");
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
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("rolAdministradorCertificacion");
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
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setPath("rolCoordinacionAdministrativa");
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
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setPath("idCurso");
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
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setPath("idCursoEditar");
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
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.spc.capcer.registro.asignarContrato.title");
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
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.spc.capcer.registro.asignarContrato.tipoCurso");
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
              out.write(__oracle_jsp_text[19]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.tipoCursoDescripcion}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("sireh.label.spc.capcer.registro.asignarContrato.claveCurso");
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
              out.write(__oracle_jsp_text[21]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.cursoClave}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.spc.capcer.registro.asignarContrato.nombreCurso");
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
              out.write(__oracle_jsp_text[23]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.descCursoPrincipal}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.spc.capcer.registro.asignarContrato.subPrograma");
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
              out.write(__oracle_jsp_text[25]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.descSubprograma}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.spc.capcer.registro.asignarContrato.ejeTematico");
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
              out.write(__oracle_jsp_text[27]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.descEjeTematico}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
              }
              out.write(__oracle_jsp_text[28]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.label.spc.capcer.registro.asignarContrato.modalidad");
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
              out.write(__oracle_jsp_text[29]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.descModalidad}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setCode("sireh.label.spc.capcer.registro.asignarContrato.finalidad");
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
              out.write(__oracle_jsp_text[31]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.descFinalidad}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_27=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setCode("sireh.label.spc.capcer.registro.asignarContrato.duracion");
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
              out.write(__oracle_jsp_text[33]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.cursoDuracion}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
              }
              out.write(__oracle_jsp_text[34]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setCode("sireh.label.spc.capcer.registro.asignarContrato.proveedor");
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
              out.write(__oracle_jsp_text[35]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.descProveedor}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,2);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setCode("sireh.label.spc.capcer.registro.asignarContrato.fechaInicio");
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
              out.write(__oracle_jsp_text[37]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.cursoFecIniFormat}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,2);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setCode("sireh.label.spc.capcer.registro.asignarContrato.fechaTermino");
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
              out.write(__oracle_jsp_text[39]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.cursoFecFinFormat}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,2);
              }
              out.write(__oracle_jsp_text[40]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setCode("sireh.label.spc.capcer.registro.asignarContrato.sede");
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
              out.write(__oracle_jsp_text[41]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.descSede}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,2);
              }
              out.write(__oracle_jsp_text[42]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("sireh.label.spc.capcer.registro.asignarContrato.aula");
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
              out.write(__oracle_jsp_text[43]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.descAula}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,2);
              }
              out.write(__oracle_jsp_text[44]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setCode("sireh.label.spc.capcer.registro.asignarContrato.horario");
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
              out.write(__oracle_jsp_text[45]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.descHorarioCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,2);
              }
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_41=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setProperty("CC.ID_PROVEEDOR");
                __jsp_taghandler_41.setCondition("=");
                __jsp_taghandler_41.setPath("idProveedor");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_42=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setProperty("CC.ID_SITUACION_CONTRATO");
                __jsp_taghandler_42.setCondition("=");
                __jsp_taghandler_42.setPath("idSituacionContrato");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[48]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_43=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setJspContext(pageContext);
                __jsp_taghandler_43.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_43.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_43.setAppendFilters("false");
                __jsp_taghandler_43.setCheckbox("true");
                __jsp_taghandler_43.setChkProperty("idContratos");
                __jsp_taghandler_43.setJspBody(new _asignarContrato_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_43, __ojsp_varRes));
                __jsp_taghandler_43.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
              }
              out.write(__oracle_jsp_text[49]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_63=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setCode("sireh.label.spc.capcer.registro.asignarContrato.facturaFolio");
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
              out.write(__oracle_jsp_text[50]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_64=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setJspContext(pageContext);
                __jsp_taghandler_64.setPath("facturaFolio");
                __jsp_taghandler_64.setMaxlength("60");
                __jsp_taghandler_64.setSize("60");
                __jsp_taghandler_64.setCss("anchoInputSmall facturaFolio");
                __jsp_taghandler_64.setUppercase("true");
                __jsp_taghandler_64.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_64, pageContext);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_65=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setCode("sireh.label.spc.capcer.registro.asignarContrato.facturaMonto");
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
              out.write(__oracle_jsp_text[52]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_66=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_66.setParent(__jsp_taghandler_1);
                __jsp_taghandler_66.setJspContext(pageContext);
                __jsp_taghandler_66.setPath("facturaMonto");
                __jsp_taghandler_66.setMaxlength("11");
                __jsp_taghandler_66.setSize("60");
                __jsp_taghandler_66.setCss("anchoInputSmall");
                __jsp_taghandler_66.setUppercase("true");
                __jsp_taghandler_66.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_66, pageContext);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_67=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_67.setParent(__jsp_taghandler_1);
                __jsp_taghandler_67.setCode("sireh.label.spc.capcer.registro.asignarContrato.facturaFechaPago");
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
              out.write(__oracle_jsp_text[54]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_68=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_68.setParent(__jsp_taghandler_1);
                __jsp_taghandler_68.setJspContext(pageContext);
                __jsp_taghandler_68.setPath("facturaFechaPago");
                __jsp_taghandler_68.setReadonly("true");
                __jsp_taghandler_68.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_68, pageContext);
              }
              out.write(__oracle_jsp_text[55]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_69=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_69.setParent(__jsp_taghandler_1);
                __jsp_taghandler_69.setCode("sireh.label.spc.capcer.registro.asignarContrato.situacionFactura");
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
              out.write(__oracle_jsp_text[56]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_70=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_70.setParent(__jsp_taghandler_1);
                __jsp_taghandler_70.setJspContext(pageContext);
                __jsp_taghandler_70.setKey("");
                __jsp_taghandler_70.setValue("selectList.nonValue");
                __jsp_taghandler_70.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_70, pageContext);
              }
              out.write(__oracle_jsp_text[57]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_71=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_71.setParent(__jsp_taghandler_1);
                __jsp_taghandler_71.setJspContext(pageContext);
                __jsp_taghandler_71.setBeanName("tcCapSituacionFactura-asignarContrato");
                __jsp_taghandler_71.setPath("idSituacionFactura");
                __jsp_taghandler_71.setDisabled((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.editar}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_71.setStyle("width:200px;");
                __jsp_taghandler_71.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_71, pageContext);
              }
              out.write(__oracle_jsp_text[58]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_72=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_72.setParent(__jsp_taghandler_1);
                __jsp_taghandler_72.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.rolAdministradorCapacitacion || asignarContratoDTO.rolEjecutivoContratacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[59]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_73=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_73.setParent(__jsp_taghandler_72);
                      __jsp_taghandler_73.setJspContext(pageContext);
                      __jsp_taghandler_73.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.path}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_73.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.viewName}",java.lang.String.class, __ojsp_varRes, null)+".do"));
                      __jsp_taghandler_73.setValue("submit.save");
                      __jsp_taghandler_73.setProgressBar("true");
                      __jsp_taghandler_73.setAlertCode("confirm.spc.capcer.registro.registrarCurso");
                      __jsp_taghandler_73.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_73, pageContext);
                    }
                    out.write(__oracle_jsp_text[60]);
                  } while (__jsp_taghandler_72.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,2);
              }
              out.write(__oracle_jsp_text[61]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_74=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_74.setParent(__jsp_taghandler_1);
                __jsp_taghandler_74.setJspContext(pageContext);
                __jsp_taghandler_74.setAction("registroCursoSPC/consultaAsignarContrato.do");
                __jsp_taghandler_74.setValue("submit.cancel");
                __jsp_taghandler_74.setProgressBar("true");
                __jsp_taghandler_74.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_74, pageContext);
              }
              out.write(__oracle_jsp_text[62]);
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

  private class _asignarContrato_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _asignarContrato_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_43       = parent;
      out.write("\r\n                        <div id=\"displayTagDiv\" style=\"width:1000px; min-height:200px;overflow:auto;text-align:center;\"> \r\n                            ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_44=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_44.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_43));
        __jsp_taghandler_44.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarContratoDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_44.setPagesize(100);
        __jsp_taghandler_44.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_44.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_44.setClass("displaytag");
        __jsp_taghandler_44.setExport(true);
        __jsp_taghandler_44.setUid("row");
        __jsp_taghandler_44.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_44,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                           \r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_45=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                __jsp_taghandler_45.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.idContratos");
                __jsp_taghandler_45.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_45,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                    <input name=\"idContratos\" \r\n                                           class=\"checkbox\"\r\n                                           type=\"checkbox\" \r\n                                           value=\"");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                        __jsp_taghandler_46.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idContratos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                        if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,5);
                      }
                      out.write("|");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_47=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_47.setParent(__jsp_taghandler_45);
                        __jsp_taghandler_47.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idProveedor}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                        if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,5);
                      }
                      out.write("\"/>\r\n                                ");
                    } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_48.setParent(__jsp_taghandler_44);
                __jsp_taghandler_48.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.idContrato");
                __jsp_taghandler_48.setSortable(true);
                __jsp_taghandler_48.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_48,__jsp_tag_starteval,out);
                    do {
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                        __jsp_taghandler_49.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.contratoCursoNumero}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                        if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,5);
                      }
                    } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_50=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable maxLength style");
                __jsp_taghandler_50.setParent(__jsp_taghandler_44);
                __jsp_taghandler_50.setProperty("proveedor");
                __jsp_taghandler_50.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.idProveedor");
                __jsp_taghandler_50.setSortable(true);
                __jsp_taghandler_50.setMaxLength(35);
                __jsp_taghandler_50.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_51=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_51.setParent(__jsp_taghandler_44);
                __jsp_taghandler_51.setProperty("contratoCursoCiclo");
                __jsp_taghandler_51.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.ciclo");
                __jsp_taghandler_51.setSortable(true);
                __jsp_taghandler_51.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_52=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_52.setParent(__jsp_taghandler_44);
                __jsp_taghandler_52.setProperty("contratoCursoRepresentante");
                __jsp_taghandler_52.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.representante");
                __jsp_taghandler_52.setSortable(true);
                __jsp_taghandler_52.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_53=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_53.setParent(__jsp_taghandler_44);
                __jsp_taghandler_53.setProperty("contratoCursoAdministrador");
                __jsp_taghandler_53.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.administrador");
                __jsp_taghandler_53.setSortable(true);
                __jsp_taghandler_53.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_54=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_54.setParent(__jsp_taghandler_44);
                __jsp_taghandler_54.setProperty("contratoCursoMonto");
                __jsp_taghandler_54.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.monto");
                __jsp_taghandler_54.setSortable(true);
                __jsp_taghandler_54.setFormat("$ {0,number,#,##0.00}");
                __jsp_taghandler_54.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_55=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_55.setParent(__jsp_taghandler_44);
                __jsp_taghandler_55.setProperty("fechaPago");
                __jsp_taghandler_55.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.fechaPago");
                __jsp_taghandler_55.setSortable(true);
                __jsp_taghandler_55.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_56=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_56.setParent(__jsp_taghandler_44);
                __jsp_taghandler_56.setProperty("usuario");
                __jsp_taghandler_56.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.usuario");
                __jsp_taghandler_56.setSortable(true);
                __jsp_taghandler_56.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_57=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_57.setParent(__jsp_taghandler_44);
                __jsp_taghandler_57.setProperty("fecModifico");
                __jsp_taghandler_57.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.fechaModificacion");
                __jsp_taghandler_57.setSortable(true);
                __jsp_taghandler_57.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,4);
              }
              out.write("      \r\n                                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_58=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_58.setParent(__jsp_taghandler_44);
                __jsp_taghandler_58.setProperty("situacion");
                __jsp_taghandler_58.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.situacion");
                __jsp_taghandler_58.setSortable(true);
                __jsp_taghandler_58.setStyle("text-align: left;");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,4);
              }
              out.write("\r\n                                                \r\n                                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_59=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_59.setParent(__jsp_taghandler_44);
                __jsp_taghandler_59.setName("paging.banner.placement");
                __jsp_taghandler_59.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_60=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_60.setParent(__jsp_taghandler_44);
                __jsp_taghandler_60.setName("export.pdf");
                __jsp_taghandler_60.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,4);
              }
              out.write("\r\n                                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_61=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_61.setParent(__jsp_taghandler_44);
                __jsp_taghandler_61.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_61,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                    <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_62.setParent(__jsp_taghandler_61);
                        __jsp_taghandler_62.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                          if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_62.doCatch(th);
                        } finally {
                          __jsp_taghandler_62.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,5);
                      }
                      out.write("<br/><br/></span>\r\n                                ");
                    } while (__jsp_taghandler_61.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,4);
              }
              out.write("\r\n                            ");
            } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,3);
      }
      out.write("\r\n                        </div>\r\n                    ");
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

  private static final char __oracle_jsp_text[][]=new char[63][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n    .anchoInputSmall {\r\n        width: 100px;\r\n    }\r\n</style>\r\n                                \r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[18] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"800\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Datos del Curso</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <colgroup>\r\n                            <col width=\"25%\"/>\r\n                            <col width=\"25%\"/>\r\n                            <col width=\"25%\"/>\r\n                            <col width=\"25%\"/>\r\n                        </colgroup>\r\n                        <tbody>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[19] = 
    ":</td>\r\n                                <td><b>".toCharArray();
    __oracle_jsp_text[20] = 
    "</b></td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[21] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[23] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[25] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[27] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[29] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[31] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[33] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[35] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[37] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[38] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[39] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[40] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[41] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[42] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[43] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[45] = 
    ":</td>\r\n                                <td colspan=\"3\">".toCharArray();
    __oracle_jsp_text[46] = 
    "</td>\r\n                            </tr>\r\n                        </tbody>\r\n                    </table>\r\n                </fieldset><br/><br/>\r\n\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Contrato</strong></legend>\r\n                    \r\n                    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                        \r\n                    ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                </fieldset><br/><br/>\r\n                \r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Factura</strong></legend>\r\n                    <table width=\"50%\">\r\n                        <colgroup>\r\n                            <col width=\"50%\"/>\r\n                            <col width=\"50%\"/>\r\n                        </colgroup>\r\n                        <tbody>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[50] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[52] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[54] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[56] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </tbody>\r\n                    </table>\r\n                </fieldset><br/><br/>\r\n\r\n                <!--BOTONES-->\r\n                <table width=\"100%\">\r\n                    <colgroup>\r\n                        <col width=\"50%\"/>\r\n                        <col width=\"50%\"/>\r\n                    </colgroup>\r\n                    <tbody>\r\n                        <tr>\r\n                            <td valign=\"middle\" height=\"20px\" align=\"left\">\r\n                                <b>* Campos requeridos</b>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"center\">\r\n                                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[60] = 
    " &nbsp;\r\n                                ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </tbody>\r\n                </table>\r\n                <!--BOTONES-->\r\n                </fieldset><br/><br/>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Validaciones\r\n        $j(document).ready(function(){            \r\n            $j('.alpha').alpha();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.facturaFolio').alphanumeric({allow:\" -/\\_\"});\r\n            $j('.numeric').numeric();\r\n            $j(\"#facturaMonto\").mask(\"999999999.99\");\r\n        });\r\n        \r\n        // PagedList asincrono\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n        \r\n        // Checkbox unico\r\n        $j(':checkbox').on('change',function(){\r\n            var th = $j(this), name = th.prop('name'); \r\n            if(th.is(':checked')){\r\n                $j(':checkbox[name=\"'  + name + '\"]').not($(this)).prop('checked',false);   \r\n            } else {\r\n                cleanForm();\r\n                enableFormButtons();\r\n                if(registrar){\r\n                    enableRegistrarButtons();\r\n                }\r\n            }\r\n        });\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
