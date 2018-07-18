package _web_2d_inf._jsp._nomina._calculo._productosnomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _listaNegativos extends com.orionserver.http.OrionHttpJspPage {


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
    _listaNegativos page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("listaNegativosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.nomina.movimiento.liqneg.path.header");
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
              out.write(__oracle_jsp_text[7]);
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.nomina.movimiento.altasybajas.qnaIni");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_4=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setKey("");
                __jsp_taghandler_4.setValue("selectList.nonValue");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_5=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setJspContext(pageContext);
                __jsp_taghandler_5.setBeanName("sacaQnasPago1");
                __jsp_taghandler_5.setPath("qnaIni");
                __jsp_taghandler_5.setStyle("width: 200px;");
                __jsp_taghandler_5.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_5, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.nomina.movimiento.altasybajas.nomIni");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_7=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setKey("");
                __jsp_taghandler_7.setValue("selectList.nonValue");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_8=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setBeanName("muestraNominaQnasHistorico1");
                __jsp_taghandler_8.setPath("nomIni");
                __jsp_taghandler_8.setParentPath("qnaIni");
                __jsp_taghandler_8.setProgress("true");
                __jsp_taghandler_8.setStyle("width: 700px;");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_9=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setPath("muestraRegistros");
                __jsp_taghandler_9.setAction("calculoNomina/listaNegativos");
                __jsp_taghandler_9.setValue("submit.search");
                __jsp_taghandler_9.setProgressBar("true");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_10=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setPath("cancel");
                __jsp_taghandler_10.setAction("calculoNomina/listaNegativos");
                __jsp_taghandler_10.setValue("submit.clean");
                __jsp_taghandler_10.setProgressBar("true");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[19]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                      __jsp_taghandler_12.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${listaNegativosDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[20]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_13=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_13.setJspContext(pageContext);
                            __jsp_taghandler_13.setProperty("act_qna.hp_qna_pago");
                            __jsp_taghandler_13.setCondition("=");
                            __jsp_taghandler_13.setPath("qnaIni");
                            __jsp_taghandler_13.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
                          }
                          out.write(__oracle_jsp_text[21]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_14=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_14.setJspContext(pageContext);
                            __jsp_taghandler_14.setProperty("act_qna.id_tipo_nomina");
                            __jsp_taghandler_14.setCondition("=");
                            __jsp_taghandler_14.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${listaNegativosDTO.tipoNomIni}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_taghandler_14.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
                          }
                          out.write(__oracle_jsp_text[22]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_15=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_15.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_15.setJspContext(pageContext);
                            __jsp_taghandler_15.setProperty("act_qna.id_grupopago_nom");
                            __jsp_taghandler_15.setCondition("=");
                            __jsp_taghandler_15.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${listaNegativosDTO.gpoPagoIni}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_taghandler_15.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
                          }
                          out.write(__oracle_jsp_text[23]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_16=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_16.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_16.setJspContext(pageContext);
                            __jsp_taghandler_16.setProperty("act_qna.hp_num_complem");
                            __jsp_taghandler_16.setCondition("=");
                            __jsp_taghandler_16.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${listaNegativosDTO.numCompIni}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_taghandler_16.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
                          }
                          out.write(__oracle_jsp_text[24]);
                          out.write(__oracle_jsp_text[25]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_17=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_17.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_17.setJspContext(pageContext);
                            __jsp_taghandler_17.setBeanName("listaImpNegativos");
                            __jsp_taghandler_17.setBaseUrl("listaNegativos");
                            __jsp_taghandler_17.setAppendFilters("false");
                            __jsp_taghandler_17.setJspBody(new _listaNegativos_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_17, __ojsp_varRes));
                            __jsp_taghandler_17.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
                          }
                          out.write(__oracle_jsp_text[26]);
                        } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                    }
                    out.write(__oracle_jsp_text[27]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_44.setParent(__jsp_taghandler_11);
                      __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[28]);
                          out.write(__oracle_jsp_text[29]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_45=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                            __jsp_taghandler_45.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                              if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_45.doCatch(th);
                            } finally {
                              __jsp_taghandler_45.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,4);
                          }
                          out.write(__oracle_jsp_text[30]);
                        } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,3);
                    }
                    out.write(__oracle_jsp_text[31]);
                  } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[32]);
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

  private class _listaNegativos_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _listaNegativos_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_17       = parent;
      out.write("\r\n                           \r\n            <div id=\"dataTable\" style=\"width: 1025px; overflow: auto;\">\r\n\r\n                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_18=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_18.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_17));
        __jsp_taghandler_18.setName("listaImpNegativos");
        __jsp_taghandler_18.setPagesize(10);
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
              out.write("\r\n            \r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_19=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                __jsp_taghandler_19.setProperty("quincena");
                __jsp_taghandler_19.setTitleKey("sireh.label.nomina.movimiento.liqneg.quincena");
                __jsp_taghandler_19.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_20=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_20.setParent(__jsp_taghandler_18);
                __jsp_taghandler_20.setProperty("comprobante");
                __jsp_taghandler_20.setTitleKey("sireh.label.nomina.movimiento.liqneg.comprobante");
                __jsp_taghandler_20.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_21=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_21.setParent(__jsp_taghandler_18);
                __jsp_taghandler_21.setProperty("empleado");
                __jsp_taghandler_21.setTitleKey("sireh.label.nomina.movimiento.liqneg.empleado");
                __jsp_taghandler_21.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_22=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_22.setParent(__jsp_taghandler_18);
                __jsp_taghandler_22.setProperty("puestoFuncional");
                __jsp_taghandler_22.setTitleKey("sireh.label.nomina.movimiento.liqneg.puestoFuncional");
                __jsp_taghandler_22.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_23=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_23.setParent(__jsp_taghandler_18);
                __jsp_taghandler_23.setProperty("curp");
                __jsp_taghandler_23.setTitleKey("sireh.label.nomina.movimiento.liqneg.curp");
                __jsp_taghandler_23.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_24=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_24.setParent(__jsp_taghandler_18);
                __jsp_taghandler_24.setProperty("cveBanco");
                __jsp_taghandler_24.setTitleKey("sireh.label.nomina.movimiento.liqneg.cveBanco");
                __jsp_taghandler_24.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_25=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_25.setParent(__jsp_taghandler_18);
                __jsp_taghandler_25.setProperty("plaza");
                __jsp_taghandler_25.setTitleKey("sireh.label.nomina.movimiento.liqneg.plaza");
                __jsp_taghandler_25.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_26=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_26.setParent(__jsp_taghandler_18);
                __jsp_taghandler_26.setProperty("nivelHerramienta");
                __jsp_taghandler_26.setTitleKey("sireh.label.nomina.movimiento.liqneg.nivelHerramienta");
                __jsp_taghandler_26.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_27=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_27.setParent(__jsp_taghandler_18);
                __jsp_taghandler_27.setProperty("imssIssste");
                __jsp_taghandler_27.setTitleKey("sireh.label.nomina.movimiento.liqneg.imssIssste");
                __jsp_taghandler_27.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_28=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_28.setParent(__jsp_taghandler_18);
                __jsp_taghandler_28.setProperty("unidadFisica");
                __jsp_taghandler_28.setTitleKey("sireh.label.nomina.movimiento.liqneg.unidadFisica");
                __jsp_taghandler_28.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_29=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_29.setParent(__jsp_taghandler_18);
                __jsp_taghandler_29.setProperty("pcp");
                __jsp_taghandler_29.setTitleKey("sireh.label.nomina.movimiento.liqneg.pcp");
                __jsp_taghandler_29.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_30=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_30.setParent(__jsp_taghandler_18);
                __jsp_taghandler_30.setProperty("zonaPagadora");
                __jsp_taghandler_30.setTitleKey("sireh.label.nomina.movimiento.liqneg.zonaPagadora");
                __jsp_taghandler_30.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_31=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_31.setParent(__jsp_taghandler_18);
                __jsp_taghandler_31.setProperty("numPension");
                __jsp_taghandler_31.setTitleKey("sireh.label.nomina.movimiento.liqneg.numPension");
                __jsp_taghandler_31.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_32=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_32.setParent(__jsp_taghandler_18);
                __jsp_taghandler_32.setProperty("nomina");
                __jsp_taghandler_32.setTitleKey("sireh.label.nomina.movimiento.liqneg.nomina");
                __jsp_taghandler_32.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_33=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_33.setParent(__jsp_taghandler_18);
                __jsp_taghandler_33.setProperty("leyendaCancelado");
                __jsp_taghandler_33.setTitleKey("sireh.label.nomina.movimiento.liqneg.leyendaCancelado");
                __jsp_taghandler_33.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_34=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_34.setParent(__jsp_taghandler_18);
                __jsp_taghandler_34.setProperty("hpFolio");
                __jsp_taghandler_34.setTitleKey("sireh.label.nomina.movimiento.liqneg.hpFolio");
                __jsp_taghandler_34.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_35.setParent(__jsp_taghandler_18);
                __jsp_taghandler_35.setProperty("hpDifFolio");
                __jsp_taghandler_35.setTitleKey("sireh.label.nomina.movimiento.liqneg.hpDifFolio");
                __jsp_taghandler_35.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_36=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format");
                __jsp_taghandler_36.setParent(__jsp_taghandler_18);
                __jsp_taghandler_36.setProperty("hpNetoPago");
                __jsp_taghandler_36.setTitleKey("sireh.label.nomina.movimiento.liqneg.hpNetoPago");
                __jsp_taghandler_36.setSortable(true);
                __jsp_taghandler_36.setFormat("$ {0,number,#,##0.00}");
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_37=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format");
                __jsp_taghandler_37.setParent(__jsp_taghandler_18);
                __jsp_taghandler_37.setProperty("deducciones");
                __jsp_taghandler_37.setTitleKey("sireh.label.nomina.movimiento.liqneg.deducciones");
                __jsp_taghandler_37.setSortable(true);
                __jsp_taghandler_37.setFormat("$ {0,number,#,##0.00}");
                __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
              }
              out.write("\r\n\t\t    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_38=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format");
                __jsp_taghandler_38.setParent(__jsp_taghandler_18);
                __jsp_taghandler_38.setProperty("percepciones");
                __jsp_taghandler_38.setTitleKey("sireh.label.nomina.movimiento.liqneg.percepciones");
                __jsp_taghandler_38.setSortable(true);
                __jsp_taghandler_38.setFormat("$ {0,number,#,##0.00}");
                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,6);
              }
              out.write("\r\n                        \r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_39=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_39.setParent(__jsp_taghandler_18);
                __jsp_taghandler_39.setName("paging.banner.placement");
                __jsp_taghandler_39.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_40=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_40.setParent(__jsp_taghandler_18);
                __jsp_taghandler_40.setName("export.pdf");
                __jsp_taghandler_40.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_41=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_41.setParent(__jsp_taghandler_18);
                __jsp_taghandler_41.setName("export.excel");
                __jsp_taghandler_41.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_42=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_42.setParent(__jsp_taghandler_18);
                __jsp_taghandler_42.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_42,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                        <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_43.setParent(__jsp_taghandler_42);
                        __jsp_taghandler_43.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                          if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_43.doCatch(th);
                        } finally {
                          __jsp_taghandler_43.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,7);
                      }
                      out.write("<br><br></span>\r\n                        ");
                    } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
              }
              out.write("\r\n                        \r\n                    ");
            } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,5);
      }
      out.write("\r\n                </div>\r\n            ");
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

  private static final char __oracle_jsp_text[][]=new char[33][];
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
    " \r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n\r\n    <h1>".toCharArray();
    __oracle_jsp_text[7] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" width=\"100%\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"100%\">\r\n                        ".toCharArray();
    __oracle_jsp_text[8] = 
    " \r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>\r\n                        </tr>\r\n\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        ".toCharArray();
    __oracle_jsp_text[15] = 
    " \r\n        <tr align=\"center\">\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[16] = 
    " &nbsp; ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n\r\n            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n\r\n            ".toCharArray();
    __oracle_jsp_text[25] = 
    " \r\n            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n            \r\n            \r\n        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[29] = 
    " \r\n            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[30] = 
    "<br><br></span>\r\n        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n\r\n\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
