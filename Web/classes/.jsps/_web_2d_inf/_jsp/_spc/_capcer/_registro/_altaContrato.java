package _web_2d_inf._jsp._spc._capcer._registro;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _altaContrato extends com.orionserver.http.OrionHttpJspPage {


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
    _altaContrato page = this;
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
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag onkeypress modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setOnkeypress("return anularEnter(event)");
        __jsp_taghandler_1.setModelAttribute("altaContratoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.editar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[8]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_3.setPath("idContratoCurso");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_3.doCatch(th);
                      } finally {
                        __jsp_taghandler_3.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                    }
                    out.write(__oracle_jsp_text[9]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_4.setPath("contratoCursoCiclo");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_4.doCatch(th);
                      } finally {
                        __jsp_taghandler_4.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                    }
                    out.write(__oracle_jsp_text[10]);
                  } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("viewName");
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
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("rolAdministradorCapacitacion");
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
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("rolEjecutivoContratacion");
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
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("postDataCursosContrato");
                __jsp_taghandler_8.setId("postDataCursosContrato");
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
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setPath("postDataFacturasContrato");
                __jsp_taghandler_9.setId("postDataFacturasContrato");
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
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.spc.capcer.registro.altaContrato.title");
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
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.spc.capcer.registro.altaContrato.contratoCursoNumero");
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
              out.write(__oracle_jsp_text[18]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_12=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setPath("contratoCursoNumero");
                __jsp_taghandler_12.setMaxlength("20");
                __jsp_taghandler_12.setReadonly((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.bloquearEdicionContrato}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_12.setSize("60");
                __jsp_taghandler_12.setCss("anchoInputSmall claveContrato");
                __jsp_taghandler_12.setUppercase("true");
                __jsp_taghandler_12.setOnkeyup("getValidaContratoDuplicado()");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.spc.capcer.registro.altaContrato.contratoCursoDesc");
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
              out.write(__oracle_jsp_text[20]);
              {
                _oracle._jsp._tag._textarea_tag __jsp_taghandler_14=(_oracle._jsp._tag._textarea_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._textarea_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPath("contratoCursoDesc");
                __jsp_taghandler_14.setCols("50");
                __jsp_taghandler_14.setReadonly((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.bloquearEdicionContrato}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_14.setRows("5");
                __jsp_taghandler_14.setCss("anchoTextarea, alphanumericEspacios");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("sireh.label.spc.capcer.registro.altaContrato.idTipoContratacion");
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
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_16=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setKey("");
                __jsp_taghandler_16.setValue("selectList.nonValue");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_17=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setBeanName("tcCapTipoContratacion-altaContrato");
                __jsp_taghandler_17.setPath("idTipoContratacion");
                __jsp_taghandler_17.setDisabled((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.bloquearEdicionContrato}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_17.setStyle("width:200px;");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setCode("sireh.label.spc.capcer.registro.altaContrato.contratoCursoRep1");
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
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_19=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setPath("contratoCursoRep1");
                __jsp_taghandler_19.setMaxlength("60");
                __jsp_taghandler_19.setReadonly((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.bloquearEdicionContrato}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_19.setSize("60");
                __jsp_taghandler_19.setCss("anchoInputSmall alphanumericEspacios");
                __jsp_taghandler_19.setUppercase("true");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.spc.capcer.registro.altaContrato.contratoCursoRep2");
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
              out.write(__oracle_jsp_text[27]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_21=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setPath("contratoCursoRep2");
                __jsp_taghandler_21.setMaxlength("60");
                __jsp_taghandler_21.setReadonly((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.bloquearEdicionContrato}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_21.setSize("60");
                __jsp_taghandler_21.setCss("anchoInputSmall alphanumericEspacios");
                __jsp_taghandler_21.setUppercase("true");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setCode("sireh.label.spc.capcer.registro.altaContrato.contratoCursoRep3");
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
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_23=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setPath("contratoCursoRep3");
                __jsp_taghandler_23.setMaxlength("60");
                __jsp_taghandler_23.setReadonly((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.bloquearEdicionContrato}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_23.setSize("60");
                __jsp_taghandler_23.setCss("anchoInputSmall alphanumericEspacios");
                __jsp_taghandler_23.setUppercase("true");
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setCode("sireh.label.spc.capcer.registro.altaContrato.contratoCursoAdministrador");
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
              out.write(__oracle_jsp_text[31]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_25=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setPath("contratoCursoAdministrador");
                __jsp_taghandler_25.setMaxlength("60");
                __jsp_taghandler_25.setReadonly((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.bloquearEdicionContrato}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_25.setSize("60");
                __jsp_taghandler_25.setCss("anchoInputSmall alphanumericEspacios");
                __jsp_taghandler_25.setUppercase("true");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setCode("sireh.label.spc.capcer.registro.altaContrato.contratoCursoMonto");
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
              out.write(__oracle_jsp_text[33]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_27=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setPath("contratoCursoMonto");
                __jsp_taghandler_27.setMaxlength("11");
                __jsp_taghandler_27.setReadonly((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.bloquearEdicionContrato}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_27.setSize("60");
                __jsp_taghandler_27.setCss("anchoInputSmall");
                __jsp_taghandler_27.setUppercase("true");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setCode("sireh.label.spc.capcer.registro.altaContrato.contratoCursoFechaAdjud");
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
              out.write(__oracle_jsp_text[35]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_29=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setPath("contratoCursoFechaAdjud");
                __jsp_taghandler_29.setReadonly("true");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.spc.capcer.registro.altaContrato.contratoCursoFechaContr");
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
              out.write(__oracle_jsp_text[37]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_31=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setPath("contratoCursoFechaContr");
                __jsp_taghandler_31.setReadonly("true");
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setCode("sireh.label.spc.capcer.registro.altaContrato.idSituacionContrato");
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
              out.write(__oracle_jsp_text[39]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_33=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setJspContext(pageContext);
                __jsp_taghandler_33.setProperty("ID_SITUACION_CONTRATO");
                __jsp_taghandler_33.setCondition("IN");
                __jsp_taghandler_33.setPath("estatusContratos");
                __jsp_taghandler_33.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
              }
              out.write(__oracle_jsp_text[40]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_34=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setKey("");
                __jsp_taghandler_34.setValue("selectList.nonValue");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_35=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setBeanName("tcCapSituacionContrato-altaContrato");
                __jsp_taghandler_35.setPath("idSituacionContrato");
                __jsp_taghandler_35.setStyle("width:200px;");
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[43]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_37=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                      __jsp_taghandler_37.setJspContext(pageContext);
                      __jsp_taghandler_37.setPath("registrar");
                      __jsp_taghandler_37.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.viewName}",java.lang.String.class, __ojsp_varRes, null)+".do"));
                      __jsp_taghandler_37.setValue("submit.save");
                      __jsp_taghandler_37.setProgressBar("true");
                      __jsp_taghandler_37.setAlertCode("confirm.spc.capcer.registro.registrarCurso");
                      __jsp_taghandler_37.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
                    }
                    out.write(__oracle_jsp_text[44]);
                  } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,2);
              }
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_38=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setAction("registroCursoSPC/consultaContrato.do");
                __jsp_taghandler_38.setValue("submit.cancel");
                __jsp_taghandler_38.setProgressBar("true");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.mostrarCursosFacturas}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[47]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_40.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.seccion}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                      if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,3);
                    }
                    out.write(__oracle_jsp_text[48]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_41.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_41.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.idContratoCurso}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                      if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,3);
                    }
                    out.write(__oracle_jsp_text[49]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_42.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_42.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.idSituacionContrato}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                      if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,3);
                    }
                    out.write(__oracle_jsp_text[50]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_43.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_43.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.rolAdministradorCapacitacion}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                      if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,3);
                    }
                    out.write(__oracle_jsp_text[51]);
                    out.write(__oracle_jsp_text[52]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_44.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_44.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.rolEjecutivoContratacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[53]);
                        } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,3);
                    }
                    out.write(__oracle_jsp_text[54]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_45.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_45.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.rolAdministradorCapacitacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[55]);
                        } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,3);
                    }
                    out.write(__oracle_jsp_text[56]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_46.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_46.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.idSituacionContrato > 5}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[57]);
                        } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,3);
                    }
                    out.write(__oracle_jsp_text[58]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_47=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_47.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_47.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion) && altaContratoDTO.registrarCursos}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[59]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_48=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_48.setParent(__jsp_taghandler_47);
                            __jsp_taghandler_48.setJspContext(pageContext);
                            __jsp_taghandler_48.setAction("registroCursoSPC/saveCursosContratos.do");
                            __jsp_taghandler_48.setValue("submit.contrato.saveCurso");
                            __jsp_taghandler_48.setOnclick("setJsonCursosContrato()");
                            __jsp_taghandler_48.setProgressBar("true");
                            __jsp_taghandler_48.setAlertCode("confirm.spc.capcer.registro.saveCursoFactura");
                            __jsp_taghandler_48.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_48, pageContext);
                          }
                          out.write(__oracle_jsp_text[60]);
                        } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,3);
                    }
                    out.write(__oracle_jsp_text[61]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_49.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_49.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion) && altaContratoDTO.registrarCursos}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[62]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_50=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                            __jsp_taghandler_50.setJspContext(pageContext);
                            __jsp_taghandler_50.setAction("registroCursoSPC/deleteCursosContratos.do");
                            __jsp_taghandler_50.setValue("submit.contrato.deleteCurso");
                            __jsp_taghandler_50.setOnclick("setJsonCursosContrato()");
                            __jsp_taghandler_50.setProgressBar("true");
                            __jsp_taghandler_50.setAlertCode("confirm.spc.capcer.registro.deleteCurso");
                            __jsp_taghandler_50.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
                          }
                          out.write(__oracle_jsp_text[63]);
                        } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,3);
                    }
                    out.write(__oracle_jsp_text[64]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_51=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_51.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_51.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion) && altaContratoDTO.registrarFacturas}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[65]);
                        } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,3);
                    }
                    out.write(__oracle_jsp_text[66]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_52=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_52.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_52.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion) && altaContratoDTO.registrarFacturas}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[67]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_53=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_53.setParent(__jsp_taghandler_52);
                            __jsp_taghandler_53.setJspContext(pageContext);
                            __jsp_taghandler_53.setAction("registroCursoSPC/deleteFacturasContratos.do");
                            __jsp_taghandler_53.setValue("submit.contrato.deleteFactura");
                            __jsp_taghandler_53.setOnclick("setJsonFacturasContrato()");
                            __jsp_taghandler_53.setProgressBar("true");
                            __jsp_taghandler_53.setAlertCode("confirm.spc.capcer.registro.deleteFactura");
                            __jsp_taghandler_53.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
                          }
                          out.write(__oracle_jsp_text[68]);
                        } while (__jsp_taghandler_52.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,3);
                    }
                    out.write(__oracle_jsp_text[69]);
                  } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,2);
              }
              out.write(__oracle_jsp_text[70]);
              {
                org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_54=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var varStatus");
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${altaContratoDTO.estatusContratos}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_54.setVar("estatusContratos");
                __jsp_taghandler_54.setVarStatus("status");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[71]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_55=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                        __jsp_taghandler_55.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.index}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                        if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,3);
                      }
                      out.write(__oracle_jsp_text[72]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_56=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_56.setParent(__jsp_taghandler_54);
                        __jsp_taghandler_56.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${estatusContratos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                        if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,3);
                      }
                      out.write(__oracle_jsp_text[73]);
                    } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_54.doCatch(th);
                } finally {
                  __jsp_taghandler_54.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,2);
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
  private static final char __oracle_jsp_text[][]=new char[75][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n    .anchoInputSmall {\r\n        width: 150px;\r\n    }\r\n    .anchoTextarea {\r\n        width: 300px;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[17] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"750\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Datos del contrato</strong></legend>\r\n                    <table align=\"center\" width=\"70%\" border=\"0\">\r\n                        <colgroup>\r\n                            <col width=\"50%\"/>\r\n                            <col width=\"50%\"/>\r\n                        </colgroup>\r\n                        <tbody>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[18] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                    <span id=\"contratoDuplicado\" style=\"color: red;\"><b>Este n&uacute;mero de contrato ya ha sido registrado.</b></span>\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[20] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[22] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[25] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[27] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[29] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[31] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[33] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[35] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[37] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[39] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </tbody>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td valign=\"middle\" height=\"20px\" align=\"left\">\r\n                <b>* Campos requeridos</b>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>\r\n                <table width=\"90%\" border=\"0\" align=\"center\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[44] = 
    " &nbsp;\r\n                            ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n            <tr>\r\n                <td valign=\"middle\" height=\"20px\" align=\"left\"> &nbsp; </td>\r\n            </tr>\r\n            <tr align=\"left\">\r\n                <td>\r\n                    <fieldset>\r\n                        <legend style=\"font-size:1.3em\"><strong>".toCharArray();
    __oracle_jsp_text[48] = 
    "</strong></legend>\r\n                        \r\n                        <!-- json -->\r\n                        <table width=\"100%\">\r\n                            <tr>\r\n                                <td align=\"center\" style=\"padding: 5px;\">\r\n                                    <br />\r\n                                    <div style=\"width:1000px;overflow:auto;\">\r\n                                        <table id=\"listCursosFacturas\"></table>\r\n                                        <div id=\"pagerCursosFacturas\"></div>\r\n                                    </div>\r\n                                    <br />\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                        \r\n                        <script type=\"text/javascript\">\r\n                            // Reversa Fechas\r\n                            function reverseContratoCursoFecha() {\r\n                                var onewayIni = $j('#text_contratoCursoFechaAdjud').val();\r\n                                var piecesIni = onewayIni.split('/');\r\n                                var reversedIni = piecesIni.reverse().join('/');\r\n                                return reversedIni;\r\n                            }\r\n                            \r\n                            // Grid principal\r\n                            var grid = $j('#listCursosFacturas');\r\n                            \r\n                            // Parametros\r\n                            var contrato = '".toCharArray();
    __oracle_jsp_text[49] = 
    "';\r\n                            var situacionContrato = ".toCharArray();
    __oracle_jsp_text[50] = 
    ";\r\n                            var rolAdministradorCapacitacion = '".toCharArray();
    __oracle_jsp_text[51] = 
    "';\r\n                            var fechaContrato = reverseContratoCursoFecha();\r\n                            \r\n                            // Validacion - Deshabilitar campo de fecha\r\n                            if (situacionContrato > 5) {\r\n                                $j(\"#text_contratoCursoFechaAdjud\").prop(\"disabled\", 'true');\r\n                                $j(\"#button_contratoCursoFechaAdjud\").prop(\"disabled\", 'true');\r\n                            }\r\n                            \r\n                            // Cursos\r\n                            if (situacionContrato == 2 || situacionContrato == 3 || situacionContrato == 4 || situacionContrato == 5) {\r\n                                grid.jqGrid({\r\n                                    url: 'jsonCallbackCursosFacturas.do?contrato=' + contrato + '&situacionContrato=' + situacionContrato + '&fechaContrato=' + fechaContrato, \r\n                                    datatype: 'json',\r\n                                    colNames: [\r\n                                        'Selecci&oacute;n',\r\n                                        'No.',\r\n                                        'ID Curso',\r\n                                        'Coordinaci&oacute;n',\r\n                                        'Curso',\r\n                                        'Contrato',\r\n                                        'Periodo',\r\n                                        'Eje Tem&aacute;tico',\r\n                                        'Subprograma',\r\n                                        'Duraci&oacute;n',\r\n                                        'Modalidad',\r\n                                        'Finalidad',\r\n                                        'Estatus Curso'\r\n                                    ],\r\n                                    colModel: [\r\n                                        {name: 'seleccion',     index: 'seleccion',     width: 60, align: \"center\", editable: true, edittype: 'checkbox', \r\n                                            editoptions: {value: \"True:False\"}, \r\n                                            formatter: \"checkbox\", \r\n                                            formatoptions: {disabled: false}, \r\n                                            search: false},\r\n                                            \r\n                                        {name: 'no',                index: 'no',                width: 70, align: \"right\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'idCurso',           index: 'idCurso',           width: 70, align: \"right\", sortable: true, sorttype: \"text\", search: true},\r\n                                        \r\n                                        {name: 'coordinacion',  index: 'coordinacion',  width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'curso',         index: 'curso',         width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'contrato',      index: 'contrato',      width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'periodo',       index: 'periodo',       width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'ejeTematico',   index: 'ejeTematico',   width: 170, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'subprograma',   index: 'subprograma',   width: 130, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'duracion',      index: 'duracion',      width: 150, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'modalidad',     index: 'modalidad',     width: 100, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'finalidad',     index: 'finalidad',     width: 150, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'estatusCurso',  index: 'estatusCurso',  width: 150, align: \"left\", sortable: true, sorttype: \"text\", search: true}\r\n                                    ],\r\n                                    rowNum: \"10\",\r\n                                    multiselect: false,\r\n                                    pager: '#pagerCursosFacturas',\r\n                                    viewrecords: true,\r\n                                    loadonce: true,\r\n                                    loadComplete: function() {\r\n                                        var $jthis = $j(this), ids = $jthis.jqGrid('getDataIDs'), i, l = ids.length;\r\n                                        for (i = 0; i < l; i++) {\r\n                                            $jthis.jqGrid('editRow', ids[i], true);\r\n                                            \r\n                                            var numeroContrato = grid.jqGrid('getCell',ids[i],'contrato');\r\n                                            var numeroContrato2 = numeroContrato.split(\" - \");\r\n                                            \r\n                                            // Validacion tipo de rol\r\n                                            if (rolAdministradorCapacitacion == \"true\") {\r\n                                                if (numeroContrato2[0] == contrato) {\r\n                                                    $j(\"#\" + ids[i] + \"_seleccion\").attr(\"disabled\", false);\r\n                                                }\r\n                                            } else {\r\n                                                if (numeroContrato2[0] == contrato) {\r\n                                                    $j(\"#\" + ids[i] + \"_seleccion\").attr(\"disabled\", true);\r\n                                                }\r\n                                            }\r\n                                        }\r\n                                    },\r\n                                    rowattr: function (item) {\r\n                                        if (rolAdministradorCapacitacion == \"false\") {\r\n                                            var numeroContrato = item.contrato.split(\" - \");\r\n                                            if (numeroContrato[0] == contrato) {\r\n                                                return {\"class\": \"ui-state-disabled ui-jqgrid-disablePointerEvents\"};\r\n                                            }\r\n                                        }\r\n                                    },\r\n                                    beforeSelectRow: function (rowid, e) {\r\n                                        if ($j(e.target).closest(\"tr.jqgrow\").hasClass(\"ui-state-disabled\")) {\r\n                                            return false;   // not allow select the row\r\n                                        }\r\n                                        return true;    // allow select the row\r\n                                    },\r\n                                    height: 200,\r\n                                    gridComplete: function() {\r\n                                        grid.setGridParam({datatype: 'local'});\r\n                                    }\r\n                                });\r\n                            \r\n                            } else {\r\n                                \r\n                                // Facturas\r\n                                grid.jqGrid({\r\n                                    url: 'jsonCallbackCursosFacturas.do?contrato=' + contrato + '&situacionContrato=' + situacionContrato + '&fechaContrato=' + fechaContrato, \r\n                                    datatype: 'json',\r\n                                    colNames: [\r\n                                        'Selecci&oacute;n',\r\n                                        'No.',\r\n                                        'ID Curso',\r\n                                        'Coordinaci&oacute;n',\r\n                                        'Curso',\r\n                                        'Contrato',\r\n                                        'Periodo',\r\n                                        'Eje Tem&aacute;tico',\r\n                                        'Subprograma',\r\n                                        'Duraci&oacute;n',\r\n                                        'Modalidad',\r\n                                        'Finalidad',\r\n                                        'Estatus Curso',\r\n                                        'Folio',\r\n                                        'Monto',\r\n                                        'Fecha',\r\n                                        'Atenta Nota N&uacute;mero',\r\n                                        'Atenta Nota Fecha',\r\n                                        'Estatus Factura actual',\r\n                                        'Estatus Factura'\r\n                                    ],\r\n                                    colModel: [\r\n                                        {name: 'seleccion',         index: 'seleccion',         width: 60, align: \"center\", editable: true, edittype: 'checkbox', \r\n                                            editoptions: {value: \"True:False\"}, \r\n                                            formatter: \"checkbox\", \r\n                                            formatoptions: {disabled: true}, \r\n                                            search: false\r\n                                        },\r\n                                        {name: 'no',                index: 'no',                width: 70, align: \"right\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'idCurso',           index: 'idCurso',           width: 70, align: \"right\", sortable: true, sorttype: \"text\", search: true},\r\n                                        \r\n                                        {name: 'coordinacion',      index: 'coordinacion',      width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'curso',             index: 'curso',             width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'contrato',          index: 'contrato',          width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'periodo',           index: 'periodo',           width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'ejeTematico',       index: 'ejeTematico',       width: 170, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'subprograma',       index: 'subprograma',       width: 130, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'duracion',          index: 'duracion',          width: 150, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'modalidad',         index: 'modalidad',         width: 100, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'finalidad',         index: 'finalidad',         width: 150, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'estatusCurso',      index: 'estatusCurso',      width: 150, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        \r\n                                        {name: 'facturaFolio',      index: 'facturaFolio',      width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true, \r\n                                            editable: true,\r\n                                            editoptions: { \r\n                                                dataInit: function (elem) {\r\n                                                    $j(elem).alphanumeric({allow:\"-/ \"});\r\n                                                }\r\n                                            }\r\n                                        },\r\n                                        {name: 'facturaMonto', index: 'facturaMonto', width: 110, align: \"right\", search: true, summaryType:'sum', sorttype:'int', \r\n                                            editable: true,\r\n                                            editoptions: { \r\n                                                dataInit: function (elem) {\r\n                                                    $j(elem).mask(\"999999999.99\");\r\n                                                }\r\n                                            },\r\n                                            formatter:'currency',   \r\n                                            formatoptions: {decimalSeparator:\".\", thousandsSeparator: \"\", decimalPlaces: 2, prefix: \"\", suffix:\"\", defaultValue: '0.00'}\r\n                                        },\r\n                                        {name: 'facturaFecha', index: 'facturaFecha', width: 90, align: \"left\", sortable: true, sorttype: \"date\", search: true, \r\n                                            editable: true, \r\n                                            editoptions: { \r\n                                                dataInit: function(el) { \r\n                                                    setTimeout(function() { \r\n                                                        $j(el).datepicker({dateFormat:\"dd/mm/yy\"}); \r\n                                                    }, 200);\r\n                                                }\r\n                                             }\r\n                                        },\r\n                                        {name: 'facturaAtentaNotaNumero', index: 'facturaAtentaNotaNumero', width: 150, align: \"left\", sortable: true, sorttype: \"text\", search: true, \r\n                                            editable: true,\r\n                                            editoptions: { \r\n                                                dataInit: function (elem) {\r\n                                                    $j(elem).alphanumeric({allow:\"-/ \"});\r\n                                                }\r\n                                            }\r\n                                        },\r\n                                        {name: 'facturaAtentaNotaFecha', index: 'facturaAtentaNotaFecha', width: 150, align: \"left\", sortable: true, sorttype: \"date\", search: true, \r\n                                            editable: true, \r\n                                            editoptions: { \r\n                                                dataInit: function(el) { \r\n                                                    setTimeout(function() { \r\n                                                        $j(el).datepicker({dateFormat:\"dd/mm/yy\"}); \r\n                                                    }, 200);\r\n                                                }\r\n                                             }\r\n                                        },\r\n                                        {name: 'facturaEstatus', index: 'facturaEstatus', width: 150, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                        {name: 'facturaEstatusDinamica', index: 'facturaEstatusDinamica', width: 200, align: \"left\", \r\n                                            editable: true,\r\n                                            edittype: 'select'\r\n                                        }\r\n                                    ],\r\n                                    rowNum: \"10\",\r\n                                    pager: '#pagerCursosFacturas',\r\n                                    sortname: 'no',\r\n                                    viewrecords: true,\r\n                                    sortorder: \"desc\",\r\n                                    loadonce: false,\r\n                                    onSelectRow: function (id) {\r\n                                        var idCursoSelected = grid.getRowData(id)['idCurso'];\r\n                        ".toCharArray();
    __oracle_jsp_text[52] = 
    "                var facturaFolioSelected = grid.getRowData(id)['facturaFolio'];\r\n                                        \r\n                                        grid.setColProp('facturaEstatusDinamica', { \r\n                                            editoptions: { \r\n                                                dataUrl:'jsonCallbackDynamicEstatusFacturas.do?idCurso=' + idCursoSelected + '&idContratoCurso=' + contrato + '&facturaFolio=' + facturaFolioSelected,\r\n                                                buildSelect: function (response) {\r\n                                                    //console.log(\"response -> \" + response);\r\n                                                    \r\n                                                    //var postData = JSON.stringify(response);\r\n                                                    //console.log(\"postData -> \" + postData);\r\n                                                    //var data = typeof response === \"string\" ? $j.parseJSON(response.responseText) : response, s = \"<select>\";\r\n                                                    //var data = typeof response === \"string\" ? response.responseText : response, s = \"<select>\";\r\n                                                    //var data = response.responseText;\r\n                                                    //var data = JSON.stringify(response.responseText);\r\n                                                    //var data = $j.parseJSON(response.responseText);\r\n                                                    var data = $j.parseJSON(response);\r\n                                                    //console.log(\"data -> \" + data);\r\n                                                    var s = \"<select>\";\r\n                                                    s += '<option value=\"0\">-- SELECCIONE --<\\/option>';\r\n                                                    \r\n                                                    $j.each(data, function () {\r\n                                                        s += '<option value=\\\"' + this.idSituacionFactura + '\\\">' + this.idSituacionFactura + ' - ' + this.descSituacionFactura + '<\\/option>';\r\n                                                    })\r\n                                                    return s + \"<\\/select>\";\r\n                                                }\r\n                                            }\r\n                                        });\r\n                                    }\r\n                                });\r\n                            }\r\n                            \r\n                            // Configuracion adicional del grid\r\n                            grid.jqGrid('navGrid', '#pagerCursosFacturas', {edit:false,add:false,del:false});\r\n                            grid.jqGrid('inlineNav', '#pagerCursosFacturas');\r\n                            grid.jqGrid('filterToolbar', {searchOnEnter: true, enableClear: false});\r\n                            \r\n                            // Deshabilitar boton aceptar\r\n                            $j(\"#listCursosFacturas_iladd\").hide();\r\n                            \r\n                            // Deshabilitar boton buscar\r\n                            $j(\"#search_listCursosFacturas\").hide();\r\n                            \r\n                            // Deshabilitar boton editar\r\n                            $j(\"#edit_listCursosFacturas\").hide();\r\n                            \r\n                            // Resize\r\n                            $j(window).resize(function() {\r\n                                grid.jqGrid('setGridHeight', \"200.0\");\r\n                            });\r\n                            \r\n                            // Headers\r\n                            grid.jqGrid('setGroupHeaders', {\r\n                                useColSpanStyle: false,\r\n                                groupHeaders: [\r\n                                    {startColumnName: 'facturaFolio', numberOfColumns: 4, titleText: 'Facturas'}\r\n                                ]\r\n                            });\r\n                            \r\n                            // Funcion para montos\r\n                            $j.fn.digits = function(){ \r\n                                return this.each(function(){ \r\n                                    $j(this).text($j(this).text().replace(/(\\d)(?=(\\d\\d\\d)+(?!\\d))/g, \"$1,\")); \r\n                                });\r\n                            }\r\n                            \r\n                            // Funcion para suma de facturas\r\n                            function sumaFacturas() {\r\n                                //console.log(\"sumaFacturas\");\r\n                                var montoNuevo = 0;\r\n                                var stringFacturas = [];\r\n                                var montoTotalContrato = $j(\"#contratoCursoMonto\").val();\r\n                                \r\n                                var rowData = grid.getRowData();\r\n                                var stringFacturasWithCommas = $j.map(rowData, function (item) { return item.facturaMonto; });\r\n                                //console.log(\"stringFacturasWithCommas -> \" + String(stringFacturasWithCommas));\r\n                                \r\n                                stringFacturas = String(stringFacturasWithCommas).split(',');\r\n                                //console.log(\"stringFacturas -> \" + stringFacturas);\r\n                                \r\n                                $j.each(stringFacturas, function(index, auxMonto) {\r\n                                    //console.log(\"auxMonto -> \" + auxMonto);\r\n                                    montoNuevo = parseFloat(montoNuevo) + parseFloat(auxMonto);\r\n                                });\r\n                                \r\n                                montoNuevo = (isNaN(montoNuevo) ? 0 : montoNuevo);\r\n                                \r\n                                if (montoNuevo >  montoTotalContrato) {\r\n                                    $j(\"#asignarFacturasButton\").prop(\"disabled\",true);\r\n                                    $j(\"#montoTotalFacturas\").text(\"Total facturas: $ \" + parseFloat(Math.round(montoNuevo * 100) / 100).toFixed(2)).digits();\r\n                                    alert(\"El monto total de Facturas ingresadas ha superado el monto del Contrato.\");\r\n                                    return false;\r\n                                } else {\r\n                                    $j(\"#asignarFacturasButton\").prop(\"disabled\",false);\r\n                                    $j(\"#montoTotalFacturas\").text(\"Total facturas: $ \" + parseFloat(Math.round(montoNuevo * 100) / 100).toFixed(2)).digits();\r\n                                    return verifyMonto();\r\n                                }\r\n                                return false;\r\n                            }\r\n                            \r\n                            // Funcion para verificar si el monto calculado es correcto\r\n                            function verifyMonto() {\r\n                                var txt;\r\n                                var r = confirm(\"Es correcta la informaci\\u00f3n propocionada?\");\r\n                                if (r == true) {\r\n                                    document.forms[0].action = '/sireh/registroCursoSPC/saveFacturasContratos.do';\r\n                                    return true;\r\n                                }\r\n                                return false;\r\n                            }\r\n                        </script>\r\n                        <!-- json -->\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                            <script type=\"text/javascript\">\r\n                                // Deshabilitar boton Asignar facturas\r\n                                $j(\"#asignarFacturasButton\").prop(\"disabled\",true);\r\n                                \r\n                                // Deshabilitar boton Eliminar facturas\r\n                                $j(\"#10003\").prop(\"disabled\",true);\r\n                                \r\n                                // Deshabilitar boton Cancelar\r\n                                $j(\".ui-icon-cancel\").hide();\r\n                            </script>\r\n                        ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                            <script type=\"text/javascript\">\r\n                                // Deshabilitar boton Asignar facturas\r\n                                $j(\"#asignarFacturasButton\").prop(\"disabled\",true);\r\n                                \r\n                                // Deshabilitar boton Eliminar facturas\r\n                                $j(\"#10003\").prop(\"disabled\",true);\r\n                                \r\n                                // Deshabilitar boton Cancelar\r\n                                $j(\".ui-icon-cancel\").hide();\r\n                            </script>\r\n                        ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                    </fieldset>\r\n                </td>\r\n            </tr>\r\n            \r\n            ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                <tr>\r\n                    <td valign=\"middle\" height=\"20px\" align=\"left\">\r\n                        <b>&nbsp;</b>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td valign=\"middle\" align=\"right\">\r\n                        <span id=\"montoTotalFacturas\" style=\"font-size:2em\">Total facturas: $ 0.00</span>\r\n                    </td>\r\n                </tr>\r\n            ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n            \r\n            <tr>\r\n                <td valign=\"middle\" height=\"20px\" align=\"left\">\r\n                    <b>&nbsp;</b>\r\n                </td>\r\n            </tr>\r\n            <tr align=\"center\">\r\n                <td>\r\n                    <table width=\"90%\" border=\"0\" align=\"center\">\r\n                        <tr>\r\n                            <td align=\"center\">\r\n                                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[60] = 
    " &nbsp;\r\n                                ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[63] = 
    " &nbsp;\r\n                                ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                                    <input id=\"asignarFacturasButton\" \r\n                                           class=\"uppercase\"\r\n                                           onclick=\"setJsonFacturasContrato();return sumaFacturas();\" \r\n                                           type=\"submit\" \r\n                                           alertCode=\"\" \r\n                                           path=\"\" \r\n                                           action=\"/sireh/registroCursoSPC/saveFacturasContratos.do\" \r\n                                           progressType=\"\" \r\n                                           value=\"Asignar Facturas\"/>&nbsp;\r\n                                ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[68] = 
    " &nbsp;\r\n                                ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n        ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[71] = 
    "\r\n        <input type=\"hidden\"  name=\"estatusContratos[".toCharArray();
    __oracle_jsp_text[72] = 
    "]\" value=\"".toCharArray();
    __oracle_jsp_text[73] = 
    "\" />\r\n    ".toCharArray();
    __oracle_jsp_text[74] = 
    "\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Anular enter\r\n        function anularEnter(e) {\r\n          tecla = (document.all) ? e.keyCode : e.which;\r\n          return (tecla != 13);\r\n        }\r\n        \r\n        // Validaciones de campos\r\n        $j(document).ready(function(){            \r\n            $j('.alpha').alpha();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.alphanumericEspacios').alphanumeric({allow:\" \"});\r\n            $j('.claveContrato').alphanumeric({allow:\"-/\"});\r\n            $j('.numeric').numeric();\r\n            $j(\"#contratoCursoMonto\").mask(\"999999999.99\");\r\n        });\r\n        \r\n        // Ocultar mensaje de contrato duplicado\r\n        $j(\"#contratoDuplicado\").hide();\r\n        \r\n        // Funcion para validar contrato duplicado\r\n        function getValidaContratoDuplicado() {\r\n            var idContrato = $j(\"#idContratoCurso\").length > 0 ? $j(\"#idContratoCurso\").val() : 0;\r\n            var numeroContrato = $j(\"#contratoCursoNumero\").val();\r\n            \r\n            $j.ajax({\r\n                url: 'getValidaContratoDuplicadoCallback.do',\r\n                type: 'GET',\r\n                data: 'numeroContrato=' + numeroContrato + '&idContrato=' + idContrato,\r\n                success: function(data) {\r\n                    var duplicado = data;\r\n                    if (duplicado == \"true\") {\r\n                        $j(\"#contratoDuplicado\").show();\r\n                        $j(\"#10001\").attr(\"disabled\",\"true\");\r\n                    } else {\r\n                        $j(\"#contratoDuplicado\").hide();\r\n                        $j(\"#10001\").removeAttr(\"disabled\");\r\n                    }\r\n                }\r\n            });\r\n        }\r\n        \r\n        // Funcion para setear el string json\r\n        function setJsonCursosContrato() {\r\n            var gridData = $j('#listCursosFacturas').getRowData();\r\n            var postData = JSON.stringify(gridData);\r\n            $j('#postDataCursosContrato').val(postData);\r\n        }\r\n        \r\n        // Funcion para setear el string json\r\n        function setJsonFacturasContrato() {\r\n            var gridData = $j('#listCursosFacturas').getRowData();\r\n            var postData = JSON.stringify(gridData);\r\n            $j('#postDataFacturasContrato').val(postData);\r\n        }\r\n        \r\n        // Funcion para validar total de caracteres en textarea\r\n        var characters = 150;\r\n        $j(\"#contratoCursoDesc\").keyup(function(){\r\n            if ($j(this).val().length > characters) {\r\n                $j(this).val($j(this).val().substr(0, characters));\r\n            }\r\n        });\r\n        \r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
