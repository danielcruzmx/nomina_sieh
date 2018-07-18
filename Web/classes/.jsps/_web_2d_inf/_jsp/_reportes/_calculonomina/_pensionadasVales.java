package _web_2d_inf._jsp._reportes._calculonomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _pensionadasVales extends com.orionserver.http.OrionHttpJspPage {


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
    _pensionadasVales page = this;
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("beanName");
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
                __jsp_taghandler_3.setCode("sireh.label.calculo.reportes.titulo.link");
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
                __jsp_taghandler_4.setCode("sireh.label.calculo.reportes.seccion.titulo.link");
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
                __jsp_taghandler_5.setCode("reporte.calculo.nomina.pensionadasvales");
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
                __jsp_taghandler_6.setCode("sireh.label.nomina.creaArchivoTerceros.titulo5");
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
                __jsp_taghandler_7.setCode("sireh.label.reportes.calculo.resumenVales.leyenda");
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
                org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("descTercero");
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
                __jsp_taghandler_9.setCode("sireh.label.reportes.quincena");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_10=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setKey("0");
                __jsp_taghandler_10.setValue("selectList.nonValue");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_11=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setBeanName("listaQuincenasAnteriores");
                __jsp_taghandler_11.setPath("qnaIni");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.form.required.fields");
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
                _oracle._jsp._tag._submit_tag __jsp_taghandler_13=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setAction("reporteCalculo/pensionadasVales.do");
                __jsp_taghandler_13.setValue("submit.accept");
                __jsp_taghandler_13.setProgressIcon("false");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_14=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPath("cancel");
                __jsp_taghandler_14.setAction("reporteCalculo/pensionadasVales.do");
                __jsp_taghandler_14.setValue("submit.clean");
                __jsp_taghandler_14.setProgressIcon("false");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[19]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_16=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                      __jsp_taghandler_16.setJspContext(pageContext);
                      __jsp_taghandler_16.setProperty("h.hp_qna_pago");
                      __jsp_taghandler_16.setCondition("=");
                      __jsp_taghandler_16.setPath("qnaIni");
                      __jsp_taghandler_16.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
                    }
                    out.write(__oracle_jsp_text[20]);
                    {
                      _oracle._jsp._tag._pagedList_tag __jsp_taghandler_17=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                      __jsp_taghandler_17.setParent(__jsp_taghandler_15);
                      __jsp_taghandler_17.setJspContext(pageContext);
                      __jsp_taghandler_17.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_17.setBaseUrl("pensionadasVales");
                      __jsp_taghandler_17.setAppendFilters("false");
                      __jsp_taghandler_17.setCheckbox("true");
                      __jsp_taghandler_17.setChkProperty("seleccionConsecNomina");
                      __jsp_taghandler_17.setMaxRows("200");
                      __jsp_taghandler_17.setJspBody(new _pensionadasVales_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_17, __ojsp_varRes));
                      __jsp_taghandler_17.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
                    }
                    out.write(__oracle_jsp_text[21]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_29=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_29.setParent(__jsp_taghandler_15);
                      __jsp_taghandler_29.setJspContext(pageContext);
                      __jsp_taghandler_29.setPath("muestraReporte");
                      __jsp_taghandler_29.setAction("reporteCalculo/pensionadasVales.do");
                      __jsp_taghandler_29.setValue("submit.mostrarReporte");
                      __jsp_taghandler_29.setProgressIcon("false");
                      __jsp_taghandler_29.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                    }
                    out.write(__oracle_jsp_text[22]);
                  } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.muestraReporte}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[24]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_31=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                      __jsp_taghandler_31.setJspContext(pageContext);
                      __jsp_taghandler_31.setName("P_NOMINA");
                      __jsp_taghandler_31.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.hpConsecNomina}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_31.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
                    }
                    out.write(__oracle_jsp_text[25]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_32=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_32.setParent(__jsp_taghandler_30);
                      __jsp_taghandler_32.setJspContext(pageContext);
                      __jsp_taghandler_32.setName("P_TITULO");
                      __jsp_taghandler_32.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.descTercero}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_32.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                    }
                    out.write(__oracle_jsp_text[26]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_33=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_33.setParent(__jsp_taghandler_30);
                      __jsp_taghandler_33.setJspContext(pageContext);
                      __jsp_taghandler_33.setProvider("jasper");
                      __jsp_taghandler_33.setViewUri("/calculoNomina/pensionesVales");
                      __jsp_taghandler_33.setImagesUri("/images/reports");
                      __jsp_taghandler_33.setFormat("pdf");
                      __jsp_taghandler_33.setFileName("pensionesVales");
                      __jsp_taghandler_33.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_33.setWidth("1060");
                      __jsp_taghandler_33.setHeight("350");
                      __jsp_taghandler_33.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                    }
                    out.write(__oracle_jsp_text[27]);
                  } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,2);
              }
              out.write(__oracle_jsp_text[28]);
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
      out.write(__oracle_jsp_text[29]);

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

  private class _pensionadasVales_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _pensionadasVales_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_17       = parent;
      out.write("\r\n                           \r\n                ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_18=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_18.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_17));
        __jsp_taghandler_18.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_18.setPagesize(10);
        __jsp_taghandler_18.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_18.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_18.setClass("displaytag");
        __jsp_taghandler_18.setExport(true);
        __jsp_taghandler_18.setUid("row");
        __jsp_taghandler_18.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                   ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_19=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey media style");
                __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                __jsp_taghandler_19.setProperty("checkbox");
                __jsp_taghandler_19.setTitleKey("sireh.label.nomina.creaArchivoTerceros.selecciona.asteriso");
                __jsp_taghandler_19.setMedia("html");
                __jsp_taghandler_19.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,5);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_20=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_20.setParent(__jsp_taghandler_18);
                __jsp_taghandler_20.setProperty("qnaPago");
                __jsp_taghandler_20.setTitleKey("sireh.label.nomina.creaArchivoTerceros.quincenaPago");
                __jsp_taghandler_20.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,5);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_21=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_21.setParent(__jsp_taghandler_18);
                __jsp_taghandler_21.setProperty("tipoNomina");
                __jsp_taghandler_21.setTitleKey("sireh.label.nomina.creaArchivoTerceros.tipoNomina");
                __jsp_taghandler_21.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,5);
              }
              out.write("             \r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_22=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_22.setParent(__jsp_taghandler_18);
                __jsp_taghandler_22.setProperty("consecNomina");
                __jsp_taghandler_22.setTitleKey("sireh.label.nomina.creaArchivoTerceros.consecutivoNomina");
                __jsp_taghandler_22.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,5);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_23=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_23.setParent(__jsp_taghandler_18);
                __jsp_taghandler_23.setProperty("numComplem");
                __jsp_taghandler_23.setTitleKey("sireh.label.nomina.creaArchivoTerceros.complemento");
                __jsp_taghandler_23.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,5);
              }
              out.write(" \r\n                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_24=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_24.setParent(__jsp_taghandler_18);
                __jsp_taghandler_24.setProperty("gpoPago");
                __jsp_taghandler_24.setTitleKey("sireh.label.nomina.creaArchivoTerceros.grupoPago");
                __jsp_taghandler_24.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,5);
              }
              out.write("\r\n                                   \r\n                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_25=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_25.setParent(__jsp_taghandler_18);
                __jsp_taghandler_25.setName("paging.banner.placement");
                __jsp_taghandler_25.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,5);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_26=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_26.setParent(__jsp_taghandler_18);
                __jsp_taghandler_26.setName("export.pdf");
                __jsp_taghandler_26.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,5);
              }
              out.write("\r\n                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_27=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_27.setParent(__jsp_taghandler_18);
                __jsp_taghandler_27.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_27,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                        <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                        __jsp_taghandler_28.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                          if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_28.doCatch(th);
                        } finally {
                          __jsp_taghandler_28.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,6);
                      }
                      out.write("<br><br></span>\r\n                    ");
                    } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,5);
              }
              out.write("\r\n                ");
            } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
      }
      out.write("\r\n            ");
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
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    \r\n    <h1><strong>\r\n        ".toCharArray();
    __oracle_jsp_text[7] = 
    " &#45; \r\n        ".toCharArray();
    __oracle_jsp_text[8] = 
    " &#45; \r\n        ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    </strong></h1>\r\n\r\n    <table width=\"100%\" align=\"center\">\r\n        <tr>\r\n            <td>\r\n                <fieldset id=\"quincenasFieldSet\">\r\n                    <legend style='font-size:1.1em'>\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[10] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\" align=\"center\">\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">*".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">*".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\r\n                            <td align=\"left\">\r\n                            ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                        </td>\r\n                        </tr>\r\n                    </table>\r\n                        <table width=\"100%\" align=\"center\">\r\n                            <tr><td colspan=\"3\"><strong>".toCharArray();
    __oracle_jsp_text[16] = 
    "</strong></td></tr>\r\n                            <tr>\r\n                                <td align=\"right\" width=\"45%\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                </td>\r\n                                <td width=\"10%\">&nbsp;</td>\r\n                                <td align=\"left\" width=\"45%\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <table align=\"center\" width=\"100%\" border=\"0\">\r\n        <tr><td>\r\n            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                \r\n                <table align=\"center\" width=\"25%\" border=\"0\">\r\n                    <tr><td align=\"center\">\r\n                        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                    </td></tr>\r\n                </table>\r\n            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n        </td></tr>\r\n    </table>\r\n    \r\n    <table align=\"center\" width=\"100%\" border=\"0\">\r\n        <tr><td>\r\n            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n        </td></tr>\r\n    </table>\r\n\r\n".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
