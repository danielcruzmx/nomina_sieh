package _web_2d_inf._jsp._nomina._terceros;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _generaArchivo extends com.orionserver.http.OrionHttpJspPage {


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
    _generaArchivo page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag name modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("checkBoxTest");
        __jsp_taghandler_1.setModelAttribute("generaArchivosTercerosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.nomina.creaArchivoTerceros.titulo");
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
                __jsp_taghandler_3.setCode("sireh.label.nomina.creaArchivoTerceros.titulo2");
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
                __jsp_taghandler_4.setCode("sireh.label.nomina.creaArchivoTerceros.tercero");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_5=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setJspContext(pageContext);
                __jsp_taghandler_5.setKey("0");
                __jsp_taghandler_5.setValue("selectList.nonValue");
                __jsp_taghandler_5.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_5, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_6=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setJspContext(pageContext);
                __jsp_taghandler_6.setBeanName("catalogoGenArchTerceros");
                __jsp_taghandler_6.setPath("llaveTercero");
                __jsp_taghandler_6.setStyle("width: 400px;");
                __jsp_taghandler_6.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setCode("sireh.label.nomina.creaArchivoTerceros.agrupaVerEmp");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("agrupaVerEmp");
                __jsp_taghandler_8.setValue("S");
                __jsp_taghandler_8.setLabel("SI");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setPath("agrupaVerEmp");
                __jsp_taghandler_9.setValue("N");
                __jsp_taghandler_9.setLabel("NO");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.nomina.creaArchivoTerceros.tituloRango");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.nomina.creaArchivoTerceros.quincena.inicial");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_12=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setKey("");
                __jsp_taghandler_12.setValue("selectList.nonValue");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_13=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setBeanName("listaSoloQnasHistorico");
                __jsp_taghandler_13.setPath("hpQnaPago");
                __jsp_taghandler_13.setProgress("true");
                __jsp_taghandler_13.setStyle("width: 100px;");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.label.nomina.creaArchivoTerceros.quincena.final");
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
              out.write(__oracle_jsp_text[18]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_15=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setKey("");
                __jsp_taghandler_15.setValue("selectList.nonValue");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_16=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setBeanName("listaSoloQnasHistoricoFinal");
                __jsp_taghandler_16.setPath("hpQnaPagoFin");
                __jsp_taghandler_16.setProgress("true");
                __jsp_taghandler_16.setStyle("width: 100px;");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.nomina.creaArchivoTerceros.agrupaVerEmp");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setPath("estadoPago");
                __jsp_taghandler_18.setValue("T");
                __jsp_taghandler_18.setLabel("Entero");
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
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setPath("estadoPago");
                __jsp_taghandler_19.setValue("C");
                __jsp_taghandler_19.setLabel("Cancelado");
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
              out.write(__oracle_jsp_text[23]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[24]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_21.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[25]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_22=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_22.setJspContext(pageContext);
                            __jsp_taghandler_22.setPath("muestraRegistros");
                            __jsp_taghandler_22.setAction("tercerosNomina/generacionArchivoTerceros.do");
                            __jsp_taghandler_22.setValue("submit.search");
                            __jsp_taghandler_22.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                          }
                          out.write(__oracle_jsp_text[26]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_23=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_23.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_23.setJspContext(pageContext);
                            __jsp_taghandler_23.setPath("cancel");
                            __jsp_taghandler_23.setAction("tercerosNomina/initGeneraArchivoTerceros.do");
                            __jsp_taghandler_23.setValue("submit.clean");
                            __jsp_taghandler_23.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                          }
                          out.write(__oracle_jsp_text[27]);
                          {
                            String __url=OracleJspRuntime.toStr("generaArchivoGrid.jsp");
                            // Include 
                            pageContext.include( __url,false);
                            if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                          }

                          out.write(__oracle_jsp_text[28]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_24=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_24.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_24.setJspContext(pageContext);
                            __jsp_taghandler_24.setPath("generaArchivo");
                            __jsp_taghandler_24.setAction("tercerosNomina/initGeneraTercero.do");
                            __jsp_taghandler_24.setValue("submit.generate");
                            __jsp_taghandler_24.setProgressIcon("false");
                            __jsp_taghandler_24.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                          }
                          out.write(__oracle_jsp_text[29]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                            __jsp_taghandler_25.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_25.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.leyenda}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                            if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,4);
                          }
                          out.write(__oracle_jsp_text[30]);
                        } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,3);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_26.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_26.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.generaArchivo}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[32]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_27=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_27.setJspContext(pageContext);
                            __jsp_taghandler_27.setPath("cancel");
                            __jsp_taghandler_27.setAction("tercerosNomina/initGeneraArchivoTerceros.do");
                            __jsp_taghandler_27.setValue("submit.clean");
                            __jsp_taghandler_27.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                          }
                          out.write(__oracle_jsp_text[33]);
                          {
                            String __url=OracleJspRuntime.toStr("generaArchivoGrid.jsp");
                            // Include 
                            pageContext.include( __url,false);
                            if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                          }

                          out.write(__oracle_jsp_text[34]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                            __jsp_taghandler_28.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_28.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.leyendag}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                            if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,4);
                          }
                          out.write(__oracle_jsp_text[35]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
                            __jsp_taghandler_29.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_29.setVar("_action");
                            __jsp_taghandler_29.setScope("page");
                            __jsp_taghandler_29.setValue("/tercerosNomina/generaTercero.do");
                            __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                            if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,4);
                          }
                          out.write(__oracle_jsp_text[36]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                            __jsp_taghandler_30.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_30.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${_action}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                            if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,4);
                          }
                          out.write(__oracle_jsp_text[37]);
                        } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                    }
                    out.write(__oracle_jsp_text[38]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_31.setParent(__jsp_taghandler_20);
                      __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[39]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_32=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                            __jsp_taghandler_32.setJspContext(pageContext);
                            __jsp_taghandler_32.setPath("muestraRegistros");
                            __jsp_taghandler_32.setAction("tercerosNomina/generacionArchivoTerceros.do");
                            __jsp_taghandler_32.setValue("submit.search");
                            __jsp_taghandler_32.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                          }
                          out.write(__oracle_jsp_text[40]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_33=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_33.setParent(__jsp_taghandler_31);
                            __jsp_taghandler_33.setJspContext(pageContext);
                            __jsp_taghandler_33.setPath("cancel");
                            __jsp_taghandler_33.setAction("tercerosNomina/initGeneraArchivoTerceros.do");
                            __jsp_taghandler_33.setValue("submit.clean");
                            __jsp_taghandler_33.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                          }
                          out.write(__oracle_jsp_text[41]);
                        } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,3);
                    }
                    out.write(__oracle_jsp_text[42]);
                  } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[43]);
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
      out.write(__oracle_jsp_text[44]);

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
  private static final char __oracle_jsp_text[][]=new char[45][];
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
    "\r\n\r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <h1> <strong> ".toCharArray();
    __oracle_jsp_text[6] = 
    " </strong> </h1> \r\n                <p>&nbsp;</p>\r\n            </td>   \r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset id=\"tercerosFieldSet\">\r\n                    <legend style='font-size:1.2em'/>\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[7] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr> <td>  </td> </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[8] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                            </td>         \r\n                            \r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                            <td align=\"center\" colspan=\"2\">\r\n                               ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                               ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                            </td>\r\n                            \r\n                            <td>  </td>\r\n                         </tr>\r\n                        <tr> <td> </td> </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n            <td>  </td>\r\n        </tr>\r\n        <tr> <td> </td> </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset id=\"quincenasFieldSet 2 \">\r\n                    <legend style='font-size:1.2em'/>\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[14] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr> <td>  </td> </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    " ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>      \r\n\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    " ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>      \r\n\r\n\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            <td align=\"center\" colspan=\"4\">\r\n                               ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                               ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>                            \r\n                            \r\n                            <td>  </td>\r\n                        </tr>\r\n                         <tr> <td> </td> </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n            <td>  </td>\r\n        </tr>\r\n        <tr><td>\r\n    \r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n            <table width=\"100%\" align=\"center\" border=\"0\">\r\n                <tr>\r\n                    <td align=\"right\">\r\n                        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                    </td>\r\n                </tr>\r\n            \r\n            </table>\r\n\r\n                ".toCharArray();
    __oracle_jsp_text[28] = 
    "  \r\n\r\n                <table width=\"100%\">\r\n                    <tr align=\"center\">\r\n                        <td>\r\n                            ".toCharArray();
    __oracle_jsp_text[29] = 
    " \r\n                            <h1> ".toCharArray();
    __oracle_jsp_text[30] = 
    "  </h1>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n                \r\n            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n             ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n             <table width=\"100%\" align=\"center\" border=\"0\">\r\n                <tr>\r\n                    <td align=\"right\">\r\n                        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n               \r\n                ".toCharArray();
    __oracle_jsp_text[34] = 
    "  \r\n\r\n                <tr> <td align=\"center\">\r\n                    <h1> ".toCharArray();
    __oracle_jsp_text[35] = 
    "  </h1>\r\n                </td> </tr>\r\n\r\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                \r\n                <script type=\"text/javascript\" >\r\n                document.forms[0].action=\"".toCharArray();
    __oracle_jsp_text[37] = 
    "\";\r\n                document.forms[0].submit();\r\n                </script>\r\n             ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n            <table width=\"100%\" align=\"center\" border=\"0\">\r\n                <tr>\r\n                    <td align=\"right\">\r\n                        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                    \r\n        \r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n     </td> </tr>\r\n    </table>\r\n".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
