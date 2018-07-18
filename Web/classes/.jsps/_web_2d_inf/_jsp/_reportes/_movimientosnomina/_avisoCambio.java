package _web_2d_inf._jsp._reportes._movimientosnomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _avisoCambio extends com.orionserver.http.OrionHttpJspPage {


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
    _avisoCambio page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("reportesMovtoNominaDTO");
        __jsp_taghandler_1.setAction("avisoCambio.do");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
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
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setPath("idMovtoEmpPla");
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
                __jsp_taghandler_4.setCode("sireh.label.movimiento.nomina.reportes.titulo.link");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.movimiento.nomina.reportes.seccion.titulo.link");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.movimiento.nomina.reportes.aviso.detalle.titulo.link");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setCode("sireh.label.merito.label.rfc");
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
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_8=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setBeanName("empleadosAvisoCambio");
                __jsp_taghandler_8.setPath("rfcEmpleado");
                __jsp_taghandler_8.setFieldMapping("rfcEmpleado, idPlaza, curpEmpleado, primerApellido, segundoApellido, nombreEmpleado");
                __jsp_taghandler_8.setWidth("1000");
                __jsp_taghandler_8.setLeftPosition("17");
                __jsp_taghandler_8.setHeight("400");
                __jsp_taghandler_8.setTopPosition("20");
                __jsp_taghandler_8.setMaxlength("16");
                __jsp_taghandler_8.setDisabled("true");
                __jsp_taghandler_8.setSize("16");
                __jsp_taghandler_8.setTitle("Seleccione el RFC");
                __jsp_taghandler_8.setMaxRows("100");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.form.required.fields");
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
                _oracle._jsp._tag._submit_tag __jsp_taghandler_10=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setAction("reporteMoviminentos/avisoCambio.do");
                __jsp_taghandler_10.setValue("submit.search");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ reportesMovtoNominaDTO.rfcEmpleado!=null && reportesMovtoNominaDTO.rfcEmpleado!='' }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[15]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_12=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_12.setJspContext(pageContext);
                      __jsp_taghandler_12.setProperty("E.RFC_EMPLEADO");
                      __jsp_taghandler_12.setCondition("=");
                      __jsp_taghandler_12.setPath("rfcEmpleado");
                      __jsp_taghandler_12.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
                    }
                    out.write(__oracle_jsp_text[16]);
                    {
                      _oracle._jsp._tag._pagedList_tag __jsp_taghandler_13=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                      __jsp_taghandler_13.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_13.setJspContext(pageContext);
                      __jsp_taghandler_13.setBeanName("listadoMovimientosAviso");
                      __jsp_taghandler_13.setBaseUrl("constanciaNombramiento");
                      __jsp_taghandler_13.setAppendFilters("false");
                      __jsp_taghandler_13.setJspBody(new _avisoCambio_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_13, __ojsp_varRes));
                      __jsp_taghandler_13.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
                    }
                    out.write(__oracle_jsp_text[17]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_26.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_26.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ reportesMovtoNominaDTO.idMovtoEmpPla != null }",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[18]);
                          {
                            _oracle._jsp._tag._textarea_tag __jsp_taghandler_27=(_oracle._jsp._tag._textarea_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._textarea_tag.class, pageContext);
                            __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_27.setJspContext(pageContext);
                            __jsp_taghandler_27.setPath("mepObserva");
                            __jsp_taghandler_27.setCols("123");
                            __jsp_taghandler_27.setRows("3");
                            __jsp_taghandler_27.setUppercase("false");
                            __jsp_taghandler_27.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                          }
                          out.write(__oracle_jsp_text[19]);
                        } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                    }
                    out.write(__oracle_jsp_text[20]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_28.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_28.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ reportesMovtoNominaDTO.idMovtoEmpPla != null }",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[21]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_29=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_29.setJspContext(pageContext);
                            __jsp_taghandler_29.setPath("muestraReporte");
                            __jsp_taghandler_29.setAction("reporteMoviminentos/avisoCambioReporte.do");
                            __jsp_taghandler_29.setValue("submit.accept");
                            __jsp_taghandler_29.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                          }
                          out.write(__oracle_jsp_text[22]);
                        } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,3);
                    }
                    out.write(__oracle_jsp_text[23]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_30=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_30.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_30.setJspContext(pageContext);
                      __jsp_taghandler_30.setPath("cancel");
                      __jsp_taghandler_30.setAction("reporteMoviminentos/avisoCambio.do");
                      __jsp_taghandler_30.setValue("submit.cancel");
                      __jsp_taghandler_30.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                    }
                    out.write(__oracle_jsp_text[24]);
                  } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ reportesMovtoNominaDTO.muestraReporte }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[26]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_32=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_32.setJspContext(pageContext);
                      __jsp_taghandler_32.setName("P_ID_MOVTO");
                      __jsp_taghandler_32.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.idMovtoEmpPla}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_32.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                    }
                    out.write(__oracle_jsp_text[27]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_33=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_33.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_33.setJspContext(pageContext);
                      __jsp_taghandler_33.setProvider("jasper");
                      __jsp_taghandler_33.setViewUri("/movimientosNomina/avisoCambioh");
                      __jsp_taghandler_33.setImagesUri("/images/reports");
                      __jsp_taghandler_33.setFormat("pdf");
                      __jsp_taghandler_33.setFileName("avisoCambioh");
                      __jsp_taghandler_33.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_33.setWidth("1060");
                      __jsp_taghandler_33.setHeight("350");
                      __jsp_taghandler_33.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                    }
                    out.write(__oracle_jsp_text[28]);
                  } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,2);
              }
              out.write(__oracle_jsp_text[29]);
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

  private class _avisoCambio_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _avisoCambio_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_13       = parent;
      out.write("\n                                   \n                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_14=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_14.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_13));
        __jsp_taghandler_14.setName("listadoMovimientosAviso");
        __jsp_taghandler_14.setPagesize(10);
        __jsp_taghandler_14.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_14.setClass("displaytag");
        __jsp_taghandler_14.setExport(false);
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
              out.write("\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_15=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                __jsp_taghandler_15.setTitleKey("sireh.label.movimiento.nomina.reportes.constancia.headers.idMovtoEmpPla");
                __jsp_taghandler_15.setSortable(true);
                __jsp_taghandler_15.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_15,__jsp_tag_starteval,out);
                    do {
                      out.write("\n                                <a href=\"avisoCambioObservaciones.do?idMovtoEmpPla=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                        __jsp_taghandler_16.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idMovtoEmpPla}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                        if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,6);
                      }
                      out.write("&rfcEmpleado=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_17.setParent(__jsp_taghandler_15);
                        __jsp_taghandler_17.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesMovtoNominaDTO.rfcEmpleado}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                        if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,6);
                      }
                      out.write("\">\n                                    ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_18.setParent(__jsp_taghandler_15);
                        __jsp_taghandler_18.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idMovtoEmpPla}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                        if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,6);
                      }
                      out.write("\n                                </a>\n                            ");
                    } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,5);
              }
              out.write("\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_19=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_19.setParent(__jsp_taghandler_14);
                __jsp_taghandler_19.setProperty("qnaCaptura");
                __jsp_taghandler_19.setTitleKey("sireh.label.movimiento.nomina.reportes.constancia.headers.qnaCaptura");
                __jsp_taghandler_19.setSortable(true);
                __jsp_taghandler_19.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,5);
              }
              out.write("\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_20=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_20.setParent(__jsp_taghandler_14);
                __jsp_taghandler_20.setProperty("idPlaza");
                __jsp_taghandler_20.setTitleKey("sireh.label.movimiento.nomina.reportes.constancia.headers.idPlaza");
                __jsp_taghandler_20.setSortable(true);
                __jsp_taghandler_20.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,5);
              }
              out.write("\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_21=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_21.setParent(__jsp_taghandler_14);
                __jsp_taghandler_21.setProperty("idUnidad");
                __jsp_taghandler_21.setTitleKey("sireh.label.movimiento.nomina.reportes.constancia.headers.idUnidad");
                __jsp_taghandler_21.setSortable(true);
                __jsp_taghandler_21.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,5);
              }
              out.write("\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_22=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_22.setParent(__jsp_taghandler_14);
                __jsp_taghandler_22.setProperty("idMovto");
                __jsp_taghandler_22.setTitleKey("sireh.label.movimiento.nomina.reportes.constancia.headers.idMovto");
                __jsp_taghandler_22.setSortable(true);
                __jsp_taghandler_22.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,5);
              }
              out.write("\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_23=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_23.setParent(__jsp_taghandler_14);
                __jsp_taghandler_23.setProperty("descMovto");
                __jsp_taghandler_23.setTitleKey("sireh.label.movimiento.nomina.reportes.constancia.headers.descMovto");
                __jsp_taghandler_23.setSortable(true);
                __jsp_taghandler_23.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,5);
              }
              out.write("\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_24=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_24.setParent(__jsp_taghandler_14);
                __jsp_taghandler_24.setProperty("fechaCaptura");
                __jsp_taghandler_24.setTitleKey("sireh.label.movimiento.nomina.reportes.constancia.headers.fechaCaptura");
                __jsp_taghandler_24.setSortable(true);
                __jsp_taghandler_24.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,5);
              }
              out.write("\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_25=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_25.setParent(__jsp_taghandler_14);
                __jsp_taghandler_25.setProperty("usuario");
                __jsp_taghandler_25.setTitleKey("sireh.label.movimiento.nomina.reportes.constancia.headers.usuario");
                __jsp_taghandler_25.setSortable(true);
                __jsp_taghandler_25.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,5);
              }
              out.write("\n                        ");
            } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,4);
      }
      out.write("\n                    ");
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

  private static final char __oracle_jsp_text[][]=new char[30][];
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
    "\n\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    \n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    \n    <h1>\n        <strong>\n            ".toCharArray();
    __oracle_jsp_text[8] = 
    " &#45; \n            ".toCharArray();
    __oracle_jsp_text[9] = 
    " &#45; \n            ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n        </strong>\n    </h1>\n    \n    <p>&nbsp;</p>\n    <div align=\"center\">\n        <table width=\"50%\">\n            <tr>\n                <td  align=\"right\" class=\"label\"> * ".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\n                <td align=\"left\">\n                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                </td>\n            </tr>\n            <tr>\n                <td colspan=\"2\" align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\n            </tr>\n            <tr>\n                <td colspan=\"2\" align=\"left\">\n                    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n                </td>\n            </tr>\n            <tr>\n                <td colspan=\"2\" height=\"20px\">&nbsp;</td>\n            </tr>\n            \n            ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n            <tr>\n                <td colspan=\"2\" align=\"left\">\n                \n                    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n                </td>\n            </tr>\n            \n            ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n            <tr>\n                <td colspan=\"2\">".toCharArray();
    __oracle_jsp_text[19] = 
    "</td>\n            </tr>\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n            \n            <tr>\n                <td align=\"right\">\n                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n                    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n                </td>\n                <td align=\"left\">\n                    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n                </td>\n            </tr>\n            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n        </table>\n        \n        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n            <table>\n                <tr>\n                    <th align=\"left\"></th>\n                </tr>\n                <tr>\n                    <td align=\"left\">\n                        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n                        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n                    </td>\n                </tr>\n            </table>\n        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n    </div>\n    \n    <p>&nbsp;</p>\n    <div align=\"center\"></div>\n    \n    <p>&nbsp;</p>\n    <div align=\"center\"></div>\n    \n    <p>&nbsp;</p>\n    <div align=\"center\"></div>\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
