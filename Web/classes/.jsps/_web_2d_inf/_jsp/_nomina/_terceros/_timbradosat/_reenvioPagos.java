package _web_2d_inf._jsp._nomina._terceros._timbradosat;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _reenvioPagos extends com.orionserver.http.OrionHttpJspPage {


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
    _reenvioPagos page = this;
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
        __jsp_taghandler_1.setModelAttribute("reenvioPagosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.terceros.timbradosat.reenvioPagos.header");
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
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.terceros.timbradosat.reenvioPagos.quincenaInical");
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
              out.write(__oracle_jsp_text[8]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_4=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setKey("");
                __jsp_taghandler_4.setValue("selectList.nonValue");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_5=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setJspContext(pageContext);
                __jsp_taghandler_5.setBeanName("quincenaInicialReenvio");
                __jsp_taghandler_5.setPath("quincenaInicial");
                __jsp_taghandler_5.setProgress("true");
                __jsp_taghandler_5.setStyle("width: 105px;");
                __jsp_taghandler_5.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_5, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.terceros.timbradosat.reenvioPagos.quincenaFinal");
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
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_7=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setKey("");
                __jsp_taghandler_7.setValue("selectList.nonValue");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_8=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setBeanName("quincenaFinalReenvio");
                __jsp_taghandler_8.setPath("quincenaFinal");
                __jsp_taghandler_8.setParentPath("quincenaInicial");
                __jsp_taghandler_8.setProgress("true");
                __jsp_taghandler_8.setStyle("width: 105px;");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
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
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_10=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setPath("buscar");
                __jsp_taghandler_10.setAction("timbradoSat/reenviarPago.do");
                __jsp_taghandler_10.setValue("submit.search");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_11=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setPath("limpiar");
                __jsp_taghandler_11.setAction("timbradoSat/reenviarPago.do");
                __jsp_taghandler_11.setValue("submit.clean");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[17]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_13.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reenvioPagosDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[18]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_14=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                            __jsp_taghandler_14.setJspContext(pageContext);
                            __jsp_taghandler_14.setProperty("N.NOM_QNA_CAPTURA");
                            __jsp_taghandler_14.setCondition(">=");
                            __jsp_taghandler_14.setPath("quincenaInicial");
                            __jsp_taghandler_14.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
                          }
                          out.write(__oracle_jsp_text[19]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_15=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_15.setParent(__jsp_taghandler_13);
                            __jsp_taghandler_15.setJspContext(pageContext);
                            __jsp_taghandler_15.setProperty("N.NOM_QNA_CAPTURA");
                            __jsp_taghandler_15.setCondition("<=");
                            __jsp_taghandler_15.setPath("quincenaFinal");
                            __jsp_taghandler_15.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
                          }
                          out.write(__oracle_jsp_text[20]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_16=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_16.setParent(__jsp_taghandler_13);
                            __jsp_taghandler_16.setJspContext(pageContext);
                            __jsp_taghandler_16.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reenvioPagosDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_16.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reenvioPagosDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_16.setAppendFilters("false");
                            __jsp_taghandler_16.setCheckbox("true");
                            __jsp_taghandler_16.setChkProperty("idGrupo");
                            __jsp_taghandler_16.setJspBody(new _reenvioPagos_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_16, __ojsp_varRes));
                            __jsp_taghandler_16.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
                          }
                          out.write(__oracle_jsp_text[21]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_90=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_90.setParent(__jsp_taghandler_13);
                            __jsp_taghandler_90.setJspContext(pageContext);
                            __jsp_taghandler_90.setPath("update");
                            __jsp_taghandler_90.setAction("timbradoSat/reenviarPago");
                            __jsp_taghandler_90.setValue("submit.update");
                            __jsp_taghandler_90.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_90, pageContext);
                          }
                          out.write(__oracle_jsp_text[22]);
                        } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                    }
                    out.write(__oracle_jsp_text[23]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_91=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_91.setParent(__jsp_taghandler_12);
                      __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[24]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_92=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_92.setParent(__jsp_taghandler_91);
                            __jsp_taghandler_92.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                              if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_92.doCatch(th);
                            } finally {
                              __jsp_taghandler_92.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92,4);
                          }
                          out.write(__oracle_jsp_text[25]);
                        } while (__jsp_taghandler_91.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91,3);
                    }
                    out.write(__oracle_jsp_text[26]);
                  } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[27]);
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
      out.write(__oracle_jsp_text[28]);

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

  private class _reenvioPagos_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _reenvioPagos_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_16       = parent;
      out.write("\r\n                <div id=\"displayTagDiv\" style=\"text-align:center;width:1000px;height:500px;overflow:auto;\">\r\n                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_17=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_17.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_16));
        __jsp_taghandler_17.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reenvioPagosDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_17.setPagesize(500);
        __jsp_taghandler_17.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_17.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_17.setClass("displaytag");
        __jsp_taghandler_17.setExport(true);
        __jsp_taghandler_17.setUid("row");
        __jsp_taghandler_17.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_18=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                __jsp_taghandler_18.setTitleKey("sireh.label.terceros.timbradosat.porNomina.acciones");
                __jsp_taghandler_18.setSortable(true);
                __jsp_taghandler_18.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_19.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty row.cnRefTimbrado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("                                                    \r\n                                <a href=\"generarCadenaByFolio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                              __jsp_taghandler_20.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                              if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                              __jsp_taghandler_21.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                              if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                              __jsp_taghandler_22.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,8);
                            }
                            out.write("\" title=\"Cadena original\">\r\n                                        <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_23.setParent(__jsp_taghandler_19);
                              __jsp_taghandler_23.setCode("cadena.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_23.doCatch(th);
                              } finally {
                                __jsp_taghandler_23.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                             ");
                          } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,7);
                      }
                      out.write("\r\n                             ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_24.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_24.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'E'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                 <a href=\"firmarCadenaByFolio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                              __jsp_taghandler_25.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                              if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_26.setParent(__jsp_taghandler_24);
                              __jsp_taghandler_26.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                              if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_27.setParent(__jsp_taghandler_24);
                              __jsp_taghandler_27.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                              if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,8);
                            }
                            out.write("\" title=\"Firmar\" onClick=\"hideElement(this);\">\r\n                                        <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_28.setParent(__jsp_taghandler_24);
                              __jsp_taghandler_28.setCode("firma.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_28.doCatch(th);
                              } finally {
                                __jsp_taghandler_28.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                 </a>\r\n                             ");
                          } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,7);
                      }
                      out.write("\r\n                             ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_29.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_29.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'F'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                <a href=\"integrarXmlFirmaFolio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                              __jsp_taghandler_30.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                              if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_31.setParent(__jsp_taghandler_29);
                              __jsp_taghandler_31.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                              if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_32.setParent(__jsp_taghandler_29);
                              __jsp_taghandler_32.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                              if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,8);
                            }
                            out.write("\" title=\"Procesar\" onClick=\"hideElement(this);\">\r\n                                    <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_33.setParent(__jsp_taghandler_29);
                              __jsp_taghandler_33.setCode("procesar.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_33.doCatch(th);
                              } finally {
                                __jsp_taghandler_33.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                            ");
                          } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,7);
                      }
                      out.write("\r\n                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_34.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_34.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'V'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                <a href=\"enviarSatByFolio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                              __jsp_taghandler_35.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                              if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_36.setParent(__jsp_taghandler_34);
                              __jsp_taghandler_36.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                              if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_37.setParent(__jsp_taghandler_34);
                              __jsp_taghandler_37.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,8);
                            }
                            out.write("\" title=\"Sat\" onClick=\"hideElement(this);\">\r\n                                    <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_38.setParent(__jsp_taghandler_34);
                              __jsp_taghandler_38.setCode("sat.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_38.doCatch(th);
                              } finally {
                                __jsp_taghandler_38.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                            ");
                          } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,7);
                      }
                      out.write("\r\n                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_39.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_39.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'R'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                <a href=\"consultarEnviadoSatByfolio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                              __jsp_taghandler_40.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                              if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_41.setParent(__jsp_taghandler_39);
                              __jsp_taghandler_41.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                              if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_42.setParent(__jsp_taghandler_39);
                              __jsp_taghandler_42.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                              if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,8);
                            }
                            out.write("\" title=\"Consultar\">\r\n                                    <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_43.setParent(__jsp_taghandler_39);
                              __jsp_taghandler_43.setCode("refresh.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_43.doCatch(th);
                              } finally {
                                __jsp_taghandler_43.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                            ");
                          } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,7);
                      }
                      out.write("\r\n                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_44.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_44.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'P'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                <a href=\"descargarInformeByFolio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                              __jsp_taghandler_45.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                              if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_46.setParent(__jsp_taghandler_44);
                              __jsp_taghandler_46.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                              if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_47=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_47.setParent(__jsp_taghandler_44);
                              __jsp_taghandler_47.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                              if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,8);
                            }
                            out.write("\" title=\"Informe\" onClick=\"hideElement(this);\">\r\n                                    <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_48.setParent(__jsp_taghandler_44);
                              __jsp_taghandler_48.setCode("informe.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_48.doCatch(th);
                              } finally {
                                __jsp_taghandler_48.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                            ");
                          } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,7);
                      }
                      out.write("                                    \r\n                        ");
                    } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_49=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_49.setParent(__jsp_taghandler_17);
                __jsp_taghandler_49.setProperty("descEstatus");
                __jsp_taghandler_49.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.cnSituacion");
                __jsp_taghandler_49.setSortable(true);
                __jsp_taghandler_49.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_50=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_50.setParent(__jsp_taghandler_17);
                __jsp_taghandler_50.setProperty("cnIncidencia");
                __jsp_taghandler_50.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.cnIncidencia");
                __jsp_taghandler_50.setSortable(true);
                __jsp_taghandler_50.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_51=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_51.setParent(__jsp_taghandler_17);
                __jsp_taghandler_51.setProperty("nomQnaCaptura");
                __jsp_taghandler_51.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.nomQnaCaptura");
                __jsp_taghandler_51.setSortable(true);
                __jsp_taghandler_51.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_52=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_52.setParent(__jsp_taghandler_17);
                __jsp_taghandler_52.setProperty("idNomina");
                __jsp_taghandler_52.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.idNomina");
                __jsp_taghandler_52.setSortable(true);
                __jsp_taghandler_52.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_53=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_53.setParent(__jsp_taghandler_17);
                __jsp_taghandler_53.setProperty("cnFolio");
                __jsp_taghandler_53.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.folio");
                __jsp_taghandler_53.setSortable(true);
                __jsp_taghandler_53.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_54=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_54.setParent(__jsp_taghandler_17);
                __jsp_taghandler_54.setProperty("nomNumComplem");
                __jsp_taghandler_54.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.nomNumComplem");
                __jsp_taghandler_54.setSortable(true);
                __jsp_taghandler_54.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,6);
              }
              out.write("                                        \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_55=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_55.setParent(__jsp_taghandler_17);
                __jsp_taghandler_55.setProperty("cnRfc");
                __jsp_taghandler_55.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.rfc");
                __jsp_taghandler_55.setSortable(true);
                __jsp_taghandler_55.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_56=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_56.setParent(__jsp_taghandler_17);
                __jsp_taghandler_56.setProperty("nombreEmpleado");
                __jsp_taghandler_56.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.nombreEmpleado");
                __jsp_taghandler_56.setSortable(true);
                __jsp_taghandler_56.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_57=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_57.setParent(__jsp_taghandler_17);
                __jsp_taghandler_57.setProperty("primerApellido");
                __jsp_taghandler_57.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.primerApellido");
                __jsp_taghandler_57.setSortable(true);
                __jsp_taghandler_57.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_58=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_58.setParent(__jsp_taghandler_17);
                __jsp_taghandler_58.setProperty("segundoApellido");
                __jsp_taghandler_58.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.segundoApellido");
                __jsp_taghandler_58.setSortable(true);
                __jsp_taghandler_58.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_59=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_59.setParent(__jsp_taghandler_17);
                __jsp_taghandler_59.setProperty("descTipoNomina");
                __jsp_taghandler_59.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.descTipoNomina");
                __jsp_taghandler_59.setSortable(true);
                __jsp_taghandler_59.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_60=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_60.setParent(__jsp_taghandler_17);
                __jsp_taghandler_60.setProperty("idGrupoPago");
                __jsp_taghandler_60.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.idGrupoPago");
                __jsp_taghandler_60.setSortable(true);
                __jsp_taghandler_60.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_61=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_61.setParent(__jsp_taghandler_17);
                __jsp_taghandler_61.setProperty("descRefTimbrado");
                __jsp_taghandler_61.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.cnRefTimbrado");
                __jsp_taghandler_61.setSortable(true);
                __jsp_taghandler_61.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_62=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_62.setParent(__jsp_taghandler_17);
                __jsp_taghandler_62.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.cnArchCreacion");
                __jsp_taghandler_62.setSortable(true);
                __jsp_taghandler_62.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_62,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_63=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_63.setParent(__jsp_taghandler_62);
                        __jsp_taghandler_63.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.cnArchCreacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                            <a href=\"downloadFileReenvio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_64=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_64.setParent(__jsp_taghandler_63);
                              __jsp_taghandler_64.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                              if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_65=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_65.setParent(__jsp_taghandler_63);
                              __jsp_taghandler_65.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                              if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_66=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_66.setParent(__jsp_taghandler_63);
                              __jsp_taghandler_66.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                              if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,8);
                            }
                            out.write("&file=cnArchCreacion\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_67=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_67.setParent(__jsp_taghandler_63);
                              __jsp_taghandler_67.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_67.doCatch(th);
                              } finally {
                                __jsp_taghandler_67.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                            </a>\r\n                                        ");
                          } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,7);
                      }
                      out.write("\r\n                        ");
                    } while (__jsp_taghandler_62.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_68=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_68.setParent(__jsp_taghandler_17);
                __jsp_taghandler_68.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.cnArchAnexo20");
                __jsp_taghandler_68.setSortable(true);
                __jsp_taghandler_68.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_68,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_69=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_69.setParent(__jsp_taghandler_68);
                        __jsp_taghandler_69.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.cnArchAnexo20}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                            <a href=\"downloadFileReenvio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_70=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_70.setParent(__jsp_taghandler_69);
                              __jsp_taghandler_70.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                              if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_71=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_71.setParent(__jsp_taghandler_69);
                              __jsp_taghandler_71.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                              if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_72=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_72.setParent(__jsp_taghandler_69);
                              __jsp_taghandler_72.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                              if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,8);
                            }
                            out.write("&file=cnArchAnexo20\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_73=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_73.setParent(__jsp_taghandler_69);
                              __jsp_taghandler_73.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                                if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_73.doCatch(th);
                              } finally {
                                __jsp_taghandler_73.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                            </a>\r\n                                        ");
                          } while (__jsp_taghandler_69.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,7);
                      }
                      out.write("\r\n                        ");
                    } while (__jsp_taghandler_68.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_74=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_74.setParent(__jsp_taghandler_17);
                __jsp_taghandler_74.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.cnArchTimbrado");
                __jsp_taghandler_74.setSortable(true);
                __jsp_taghandler_74.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_74,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_75=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_75.setParent(__jsp_taghandler_74);
                        __jsp_taghandler_75.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.cnArchTimbrado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                            <a href=\"downloadFileReenvio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_76=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_76.setParent(__jsp_taghandler_75);
                              __jsp_taghandler_76.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                              if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_77=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_77.setParent(__jsp_taghandler_75);
                              __jsp_taghandler_77.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                              if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_78=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_78.setParent(__jsp_taghandler_75);
                              __jsp_taghandler_78.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                              if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,8);
                            }
                            out.write("&file=cnArchTimbrado\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_79=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_79.setParent(__jsp_taghandler_75);
                              __jsp_taghandler_79.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                                if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_79.doCatch(th);
                              } finally {
                                __jsp_taghandler_79.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                            </a>\r\n                                        ");
                          } while (__jsp_taghandler_75.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,7);
                      }
                      out.write("\r\n                        ");
                    } while (__jsp_taghandler_74.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_80=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_80.setParent(__jsp_taghandler_17);
                __jsp_taghandler_80.setTitleKey("sireh.label.terceros.timbradosat.reenvioPagos.cnArchACancelar");
                __jsp_taghandler_80.setSortable(true);
                __jsp_taghandler_80.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_80,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_81=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_81.setParent(__jsp_taghandler_80);
                        __jsp_taghandler_81.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.cnArchACancelar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                            <a href=\"downloadFileReenvio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_82=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_82.setParent(__jsp_taghandler_81);
                              __jsp_taghandler_82.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_82.doStartTag();
                              if (__jsp_taghandler_82.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_82,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_83=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_83.setParent(__jsp_taghandler_81);
                              __jsp_taghandler_83.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                              if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_84=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_84.setParent(__jsp_taghandler_81);
                              __jsp_taghandler_84.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                              if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84,8);
                            }
                            out.write("&file=cnArchACancelar\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_85=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_85.setParent(__jsp_taghandler_81);
                              __jsp_taghandler_85.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                                if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_85.doCatch(th);
                              } finally {
                                __jsp_taghandler_85.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                            </a>\r\n                                        ");
                          } while (__jsp_taghandler_81.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81,7);
                      }
                      out.write("\r\n                        ");
                    } while (__jsp_taghandler_80.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_86=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_86.setParent(__jsp_taghandler_17);
                __jsp_taghandler_86.setName("paging.banner.placement");
                __jsp_taghandler_86.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_87=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_87.setParent(__jsp_taghandler_17);
                __jsp_taghandler_87.setName("export.pdf");
                __jsp_taghandler_87.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
                if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_88=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_88.setParent(__jsp_taghandler_17);
                __jsp_taghandler_88.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_88.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_88,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_89=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_89.setParent(__jsp_taghandler_88);
                        __jsp_taghandler_89.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                          if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_89.doCatch(th);
                        } finally {
                          __jsp_taghandler_89.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89,7);
                      }
                      out.write("<br/></span>\r\n                        ");
                    } while (__jsp_taghandler_88.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_88.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_88,6);
              }
              out.write("\r\n                    ");
            } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,5);
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

  private static final char __oracle_jsp_text[][]=new char[29][];
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
    "\r\n\r\n    <h1> <strong> ".toCharArray();
    __oracle_jsp_text[7] = 
    " </strong> </h1> \r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"100%\"  align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[8] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                            </td>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"4\">\r\n                                <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                    <tr>\r\n                                        <td align=\"left\" colspan=\"2\"><strong>".toCharArray();
    __oracle_jsp_text[14] = 
    "</strong></td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"right\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                                        </td>\r\n                                        <td align=\"left\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n            \r\n            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n            <table width=\"100%\">\r\n                <tr align=\"center\">\r\n                    <td>".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n            <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[25] = 
    "<br/><br/></span>\r\n        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n    \r\n    \r\n".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
