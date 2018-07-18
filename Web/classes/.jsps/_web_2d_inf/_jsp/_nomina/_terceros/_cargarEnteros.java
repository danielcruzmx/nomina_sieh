package _web_2d_inf._jsp._nomina._terceros;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _cargarEnteros extends com.orionserver.http.OrionHttpJspPage {


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
    _cargarEnteros page = this;
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
        __jsp_taghandler_1.setModelAttribute("generarEnteroDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.nomina.tercero.generarEntero.titulo");
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
                __jsp_taghandler_3.setCode("sireh.label.nomina.tercero.generarEntero.opcion");
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
                __jsp_taghandler_4.setCode("sireh.label.nomina.tercero.generarEntero.selectQna");
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
                __jsp_taghandler_6.setBeanName("catalogoQnaPagoEnteros");
                __jsp_taghandler_6.setPath("qnaPago");
                __jsp_taghandler_6.setOnchange("cargaComplemento()");
                __jsp_taghandler_6.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setCode("sireh.label.nomina.tercero.cargaArchivos.textbox");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_8=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setKey("0");
                __jsp_taghandler_8.setValue("selectList.nonValue");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_9=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setBeanName("catalogoTercerosEnteros");
                __jsp_taghandler_9.setPath("tercero");
                __jsp_taghandler_9.setOnchange("cargaComplemento()");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.nomina.tercero.generarEntero.tipoNomina");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_11=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setKey("0");
                __jsp_taghandler_11.setValue("selectList.nonValue");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_12=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setBeanName("tiposNominaEnteros");
                __jsp_taghandler_12.setPath("tipoNomina");
                __jsp_taghandler_12.setOnchange("cargaComplemento()");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generarEnteroDTO.listaComplemento ne null}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[17]);
                    {
                      org.displaytag.tags.TableTag __jsp_taghandler_14=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class id sort");
                      __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                      __jsp_taghandler_14.setName("generarEnteroDTO.listaComplemento");
                      __jsp_taghandler_14.setPagesize(5);
                      __jsp_taghandler_14.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_14.setClass("displaytag");
                      __jsp_taghandler_14.setUid("row");
                      __jsp_taghandler_14.setSort("list");
                      java.lang.Object row = null;
                      java.lang.Integer row_rowNum = null;
                      __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        try {
                          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                          do {
                            row = (java.lang.Object) pageContext.findAttribute("row");
                            row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
                            out.write(__oracle_jsp_text[18]);
                            {
                              org.displaytag.tags.ColumnTag __jsp_taghandler_15=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag style");
                              __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                              __jsp_taghandler_15.setStyle("width: 5");
                              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                              {
                                try {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_15,__jsp_tag_starteval,out);
                                  do {
                                    out.write(__oracle_jsp_text[19]);
                                    {
                                      org.springframework.web.servlet.tags.form.CheckboxTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.form.CheckboxTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.CheckboxTag.class,"org.springframework.web.servlet.tags.form.CheckboxTag path onclick value");
                                      __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                                      __jsp_taghandler_16.setPath("checkComplemento");
                                      __jsp_taghandler_16.setOnclick("muestraOculta('generar')");
                                      __jsp_taghandler_16.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.hpNumComplem}",java.lang.Object.class, __ojsp_varRes,null));
                                      try {
                                        __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                                        if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                      } catch (Throwable th) {
                                        __jsp_taghandler_16.doCatch(th);
                                      } finally {
                                        __jsp_taghandler_16.doFinally();
                                      }
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,5);
                                    }
                                    out.write(__oracle_jsp_text[20]);
                                  } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                finally {
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                              }
                              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
                            }
                            out.write(__oracle_jsp_text[21]);
                            {
                              org.displaytag.tags.ColumnTag __jsp_taghandler_17=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag title value");
                              __jsp_taghandler_17.setParent(__jsp_taghandler_14);
                              __jsp_taghandler_17.setTitle("Tipo nomina");
                              __jsp_taghandler_17.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idTipoNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,4);
                            }
                            out.write(__oracle_jsp_text[22]);
                            {
                              org.displaytag.tags.ColumnTag __jsp_taghandler_18=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag title value");
                              __jsp_taghandler_18.setParent(__jsp_taghandler_14);
                              __jsp_taghandler_18.setTitle("Complemento");
                              __jsp_taghandler_18.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.hpNumComplem}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
                            }
                            out.write(__oracle_jsp_text[23]);
                            {
                              org.displaytag.tags.SetPropertyTag __jsp_taghandler_19=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                              __jsp_taghandler_19.setParent(__jsp_taghandler_14);
                              __jsp_taghandler_19.setName("paging.banner.placement");
                              __jsp_taghandler_19.setValue("bottom");
                              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,4);
                            }
                            out.write(__oracle_jsp_text[24]);
                            {
                              org.displaytag.tags.SetPropertyTag __jsp_taghandler_20=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                              __jsp_taghandler_20.setParent(__jsp_taghandler_14);
                              __jsp_taghandler_20.setName("basic.msg.empty_list");
                              __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                              {
                                try {
                                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_20,__jsp_tag_starteval,out);
                                  do {
                                    out.write(__oracle_jsp_text[25]);
                                    {
                                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                                      __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                      __jsp_taghandler_21.setCode("pagedList.empty.content");
                                      try {
                                        __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                        if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                      } catch (Throwable th) {
                                        __jsp_taghandler_21.doCatch(th);
                                      } finally {
                                        __jsp_taghandler_21.doFinally();
                                      }
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,5);
                                    }
                                    out.write(__oracle_jsp_text[26]);
                                  } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                finally {
                                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                }
                              }
                              if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,4);
                            }
                            out.write(__oracle_jsp_text[27]);
                          } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        finally {
                          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                        }
                      }
                      if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                    }
                    out.write(__oracle_jsp_text[28]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_22=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_22.setParent(__jsp_taghandler_13);
                      __jsp_taghandler_22.setJspContext(pageContext);
                      __jsp_taghandler_22.setPath("muestraReporte");
                      __jsp_taghandler_22.setAction("enterosNomina/iniciaProceso.do");
                      __jsp_taghandler_22.setValue("submit.iniciaProceso");
                      __jsp_taghandler_22.setProgressBar("true");
                      __jsp_taghandler_22.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                    }
                    out.write(__oracle_jsp_text[29]);
                  } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generarEnteroDTO.listaProceso ne null}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[31]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_24.setPath("listaProceso");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                        if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_24.doCatch(th);
                      } finally {
                        __jsp_taghandler_24.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,3);
                    }
                    out.write(__oracle_jsp_text[32]);
                    {
                      org.displaytag.tags.TableTag __jsp_taghandler_25=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name class");
                      __jsp_taghandler_25.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_25.setName("generarEnteroDTO.listaProceso");
                      __jsp_taghandler_25.setClass("displaytag");
                      __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        try {
                          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_25,__jsp_tag_starteval,out);
                          do {
                            out.write(__oracle_jsp_text[33]);
                            {
                              org.displaytag.tags.ColumnTag __jsp_taghandler_26=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title value");
                              __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                              __jsp_taghandler_26.setProperty("nombre");
                              __jsp_taghandler_26.setTitle("Nombre ");
                              __jsp_taghandler_26.setValue("nomina");
                              __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                              if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,4);
                            }
                            out.write(__oracle_jsp_text[34]);
                            {
                              org.displaytag.tags.ColumnTag __jsp_taghandler_27=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title value");
                              __jsp_taghandler_27.setParent(__jsp_taghandler_25);
                              __jsp_taghandler_27.setProperty("rfc");
                              __jsp_taghandler_27.setTitle("RFC");
                              __jsp_taghandler_27.setValue("rfc");
                              __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                              if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,4);
                            }
                            out.write(__oracle_jsp_text[35]);
                            {
                              org.displaytag.tags.ColumnTag __jsp_taghandler_28=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title value");
                              __jsp_taghandler_28.setParent(__jsp_taghandler_25);
                              __jsp_taghandler_28.setProperty("concepto");
                              __jsp_taghandler_28.setTitle("Concepto");
                              __jsp_taghandler_28.setValue("concepto");
                              __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                              if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,4);
                            }
                            out.write(__oracle_jsp_text[36]);
                            {
                              org.displaytag.tags.ColumnTag __jsp_taghandler_29=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title value");
                              __jsp_taghandler_29.setParent(__jsp_taghandler_25);
                              __jsp_taghandler_29.setProperty("deduccion");
                              __jsp_taghandler_29.setTitle("Importe deduccion");
                              __jsp_taghandler_29.setValue("deduccion");
                              __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                              if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,4);
                            }
                            out.write(__oracle_jsp_text[37]);
                            {
                              org.displaytag.tags.ColumnTag __jsp_taghandler_30=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title value");
                              __jsp_taghandler_30.setParent(__jsp_taghandler_25);
                              __jsp_taghandler_30.setProperty("recuperacion");
                              __jsp_taghandler_30.setTitle("Importe recuperacion");
                              __jsp_taghandler_30.setValue("recuperacion");
                              __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                              if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,4);
                            }
                            out.write(__oracle_jsp_text[38]);
                          } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        finally {
                          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                        }
                      }
                      if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,3);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      _oracle._jsp._tag._input_tag __jsp_taghandler_31=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                      __jsp_taghandler_31.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_31.setJspContext(pageContext);
                      __jsp_taghandler_31.setPath("totalEntero");
                      __jsp_taghandler_31.setMaxlength("12");
                      __jsp_taghandler_31.setReadonly("true");
                      __jsp_taghandler_31.setSize("15");
                      __jsp_taghandler_31.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      _oracle._jsp._tag._input_tag __jsp_taghandler_32=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                      __jsp_taghandler_32.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_32.setJspContext(pageContext);
                      __jsp_taghandler_32.setPath("ImporteEntero");
                      __jsp_taghandler_32.setMaxlength("12");
                      __jsp_taghandler_32.setReadonly("true");
                      __jsp_taghandler_32.setSize("15");
                      __jsp_taghandler_32.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                    }
                    out.write(__oracle_jsp_text[41]);
                    {
                      _oracle._jsp._tag._input_tag __jsp_taghandler_33=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                      __jsp_taghandler_33.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_33.setJspContext(pageContext);
                      __jsp_taghandler_33.setPath("totalRecuperacion");
                      __jsp_taghandler_33.setMaxlength("12");
                      __jsp_taghandler_33.setReadonly("true");
                      __jsp_taghandler_33.setSize("15");
                      __jsp_taghandler_33.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                    }
                    out.write(__oracle_jsp_text[42]);
                    {
                      _oracle._jsp._tag._input_tag __jsp_taghandler_34=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                      __jsp_taghandler_34.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_34.setJspContext(pageContext);
                      __jsp_taghandler_34.setPath("importeRecuperacion");
                      __jsp_taghandler_34.setMaxlength("12");
                      __jsp_taghandler_34.setReadonly("true");
                      __jsp_taghandler_34.setSize("15");
                      __jsp_taghandler_34.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
                    }
                    out.write(__oracle_jsp_text[43]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_35=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_35.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_35.setJspContext(pageContext);
                      __jsp_taghandler_35.setPath("muestraReporte");
                      __jsp_taghandler_35.setAction("enterosNomina/generaArchivoTexto.do");
                      __jsp_taghandler_35.setValue("submit.generaArchivo");
                      __jsp_taghandler_35.setProgressIcon("false");
                      __jsp_taghandler_35.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
                    }
                    out.write(__oracle_jsp_text[44]);
                  } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
              }
              out.write(__oracle_jsp_text[45]);
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
  private static final char __oracle_jsp_text[][]=new char[46][];
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
    "\r\n<script>\r\nfunction cargaComplemento(){\r\n    if(document.getElementById(\"tipoNomina\").value != \"0\" && document.getElementById(\"qnaPago\").value != \"0\"){\r\n        document.forms[0].action=\"cargarComplementos.do\";\r\n        document.forms[0].submit();\r\n    }\r\n    return false;\r\n    \r\n}\r\nfunction muestraOculta(id){\r\n     var el = document.getElementById(id);\r\n    el.style.display =  'none' ;\r\n}\r\n\r\n\r\n</script>\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    <h1>\r\n        <strong>\r\n                ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n               ".toCharArray();
    __oracle_jsp_text[7] = 
    " \r\n        </strong>\r\n    </h1>\r\n\r\n<p>&nbsp;</p>\r\n<div align=\"center\">\r\n    <table  border=\"0\">\r\n            <tr>\r\n                <td  align=\"right\" class=\"label\"> \r\n                    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                </td> \r\n                <td align=\"left\">  \r\n                    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                </td>   \r\n            </tr>\r\n\t\t\t<tr>\r\n                <td  align=\"right\" class=\"label\">\r\n                     ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                </td>\r\n                <td  align=\"left\">\r\n                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td  align=\"right\" class=\"label\"> \r\n                    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                </td> \r\n                <td align=\"left\">  \r\n                        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                </td> \r\n\t\t\t</tr>\r\n          \r\n".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n            <tr>\r\n                <td colspan=\"2\" >\r\n       \r\n           ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                        <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[26] = 
    "<br><br></span>\r\n                    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                     \r\n                </td>\r\n            </tr>   \r\n  \r\n             \r\n            <tr>\r\n                <td align=\"center\" colspan=\"5\">\r\n                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                </td>\r\n            </tr> \r\n        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n        </table>\r\n         ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n         ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n        <table>\r\n            <tr>\r\n                <td colspan=\"2\" >\r\n                    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                                     ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                \r\n                </td>\r\n                <td>\r\n                        <table>\r\n                            <tr>\r\n                                    <td>Enteros<br>\r\n                                    Total de casos<br>\r\n                                        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                                    </td>\r\n                            <//tr>\r\n                            <tr>\r\n                                    <td>\r\n                                     importe total<br>\r\n                                        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                    </td>\r\n                            <//tr>\r\n                            <tr>\r\n                                    <td> Recuperacion<br>\r\n                                    Total de casos<br>\r\n                                        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                                    </td>\r\n                            <//tr>\r\n                            <tr>\r\n                                    <td> importe total<br>\r\n                                        ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                                    </td>\r\n                            <//tr>\r\n                        </table>\r\n                </td>\r\n            </tr>      \r\n            \r\n            <tr>\r\n                <td align=\"center\" colspan=\"5\">\r\n                <div id=\"generar\">\r\n                    ".toCharArray();
    __oracle_jsp_text[44] = 
    " \r\n                </div>\r\n                </td>\r\n            </tr>\r\n           \r\n        </table>\r\n          ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n        \r\n</div>\r\n<p>&nbsp;</p>\r\n<div align=\"center\">\r\n  \r\n</div>\r\n<p>&nbsp;</p>\r\n<div align=\"center\">\r\n  \r\n</div>\r\n<p>&nbsp;</p>\r\n<div align=\"center\">\r\n  \r\n</div>\r\n<script type=\"text/javascript\">\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n        $j(\"#checkComplemento\").keypress(function(event) {\r\n            if (event.which == 13) {\r\n                doSubmit(10001);\r\n            }\r\n        });\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
