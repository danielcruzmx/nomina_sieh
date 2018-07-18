package _web_2d_inf._jsp._nomina._terceros._timbradosat;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _cancelPagosNoCancelados extends com.orionserver.http.OrionHttpJspPage {


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
    _cancelPagosNoCancelados page = this;
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
        __jsp_taghandler_1.setModelAttribute("cancelPagosNoCanDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.header");
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
                __jsp_taghandler_3.setCode("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.folio");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_4=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setPath("hpFolio");
                __jsp_taghandler_4.setMaxlength("10");
                __jsp_taghandler_4.setSize("20");
                __jsp_taghandler_4.setUppercase("true");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_6=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setJspContext(pageContext);
                __jsp_taghandler_6.setPath("buscar");
                __jsp_taghandler_6.setAction("timbradoSat/cancelPagosNo.do");
                __jsp_taghandler_6.setValue("submit.search");
                __jsp_taghandler_6.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_7=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setPath("limpiar");
                __jsp_taghandler_7.setAction("timbradoSat/cancelPagosNo.do");
                __jsp_taghandler_7.setValue("submit.clean");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[13]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_9.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cancelPagosNoCanDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[14]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_10=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                            __jsp_taghandler_10.setJspContext(pageContext);
                            __jsp_taghandler_10.setProperty("T.CN_FOLIO");
                            __jsp_taghandler_10.setCondition("=");
                            __jsp_taghandler_10.setPath("hpFolio");
                            __jsp_taghandler_10.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
                          }
                          out.write(__oracle_jsp_text[15]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_11=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_11.setParent(__jsp_taghandler_9);
                            __jsp_taghandler_11.setJspContext(pageContext);
                            __jsp_taghandler_11.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cancelPagosNoCanDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_11.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cancelPagosNoCanDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_11.setAppendFilters("false");
                            __jsp_taghandler_11.setCheckbox("true");
                            __jsp_taghandler_11.setChkProperty("idGrupo");
                            __jsp_taghandler_11.setJspBody(new _cancelPagosNoCancelados_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_11, __ojsp_varRes));
                            __jsp_taghandler_11.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
                          }
                          out.write(__oracle_jsp_text[16]);
                        } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                    }
                    out.write(__oracle_jsp_text[17]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_60=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_60.setParent(__jsp_taghandler_8);
                      __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[18]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_61=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_61.setParent(__jsp_taghandler_60);
                            __jsp_taghandler_61.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                              if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_61.doCatch(th);
                            } finally {
                              __jsp_taghandler_61.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,4);
                          }
                          out.write(__oracle_jsp_text[19]);
                        } while (__jsp_taghandler_60.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,3);
                    }
                    out.write(__oracle_jsp_text[20]);
                  } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[21]);
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
      out.write(__oracle_jsp_text[22]);

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

  private class _cancelPagosNoCancelados_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _cancelPagosNoCancelados_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_11       = parent;
      out.write("\r\n                <div id=\"displayTagDiv\" style=\"text-align:center;width:1000px;height:500px;overflow:auto;\">\r\n                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_12=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_12.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_11));
        __jsp_taghandler_12.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cancelPagosNoCanDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_12.setPagesize(500);
        __jsp_taghandler_12.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_12.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_12.setClass("displaytag");
        __jsp_taghandler_12.setExport(true);
        __jsp_taghandler_12.setUid("row");
        __jsp_taghandler_12.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_12,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_13=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                __jsp_taghandler_13.setTitleKey("sireh.label.terceros.timbradosat.porNomina.acciones");
                __jsp_taghandler_13.setSortable(true);
                __jsp_taghandler_13.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_14.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty row.cnRefTimbrado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("                                                    \r\n                                <a href=\"generarCadenaByFolio.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                              __jsp_taghandler_15.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnConsecNomina}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,8);
                            }
                            out.write("&cnFolio=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_16.setParent(__jsp_taghandler_14);
                              __jsp_taghandler_16.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_17.setParent(__jsp_taghandler_14);
                              __jsp_taghandler_17.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,8);
                            }
                            out.write("\" title=\"Cadena original\">\r\n                                        <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_18.setParent(__jsp_taghandler_14);
                              __jsp_taghandler_18.setCode("cadena.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_18.doCatch(th);
                              } finally {
                                __jsp_taghandler_18.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                             ");
                          } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,7);
                      }
                      out.write("\r\n                             ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_19.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_19.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'E'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                 <a href=\"firmarCadenaByFolio.do?idNomina=");
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
                            out.write("\" title=\"Firmar\" onClick=\"hideElement(this);\">\r\n                                        <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_23.setParent(__jsp_taghandler_19);
                              __jsp_taghandler_23.setCode("firma.png");
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
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                 </a>\r\n                             ");
                          } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,7);
                      }
                      out.write("\r\n                             ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_24.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_24.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'F'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                <a href=\"integrarXmlFirma.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                              __jsp_taghandler_25.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                              if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,8);
                            }
                            out.write("\" title=\"Procesar\" onClick=\"hideElement(this);\">\r\n                                    <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_26.setParent(__jsp_taghandler_24);
                              __jsp_taghandler_26.setCode("procesar.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_26.doCatch(th);
                              } finally {
                                __jsp_taghandler_26.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                            ");
                          } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,7);
                      }
                      out.write("\r\n                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_27.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_27.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.nomRefTimbrado eq 'V'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                <a href=\"enviarSat.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                              __jsp_taghandler_28.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                              if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,8);
                            }
                            out.write("\" title=\"Sat\" onClick=\"hideElement(this);\">\r\n                                    <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                              __jsp_taghandler_29.setCode("sat.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                                if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_29.doCatch(th);
                              } finally {
                                __jsp_taghandler_29.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                            ");
                          } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,7);
                      }
                      out.write("\r\n                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_30.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_30.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'R'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                <a href=\"consultarEnviadoSat.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                              __jsp_taghandler_31.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                              if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,8);
                            }
                            out.write("\" title=\"Consultar\">\r\n                                    <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_32.setParent(__jsp_taghandler_30);
                              __jsp_taghandler_32.setCode("refresh.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_32.doCatch(th);
                              } finally {
                                __jsp_taghandler_32.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                            ");
                          } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,7);
                      }
                      out.write("\r\n                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_33.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_33.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'P'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                <a href=\"descargarInforme.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                              __jsp_taghandler_34.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                              if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,8);
                            }
                            out.write("\" title=\"Informe\" onClick=\"hideElement(this);\">\r\n                                    <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_35.setParent(__jsp_taghandler_33);
                              __jsp_taghandler_35.setCode("informe.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_35.doCatch(th);
                              } finally {
                                __jsp_taghandler_35.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                </a>\r\n                            ");
                          } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,7);
                      }
                      out.write("                                    \r\n                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_36.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_36.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnRefTimbrado eq 'T'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                <a href=\"enviarComprobantes.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                              __jsp_taghandler_37.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnFolio}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,8);
                            }
                            out.write("\" title=\"Enviar\">\r\n                                    <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_38.setParent(__jsp_taghandler_36);
                              __jsp_taghandler_38.setCode("correo.png");
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
                          } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,7);
                      }
                      out.write("\r\n                        ");
                    } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_39=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_39.setParent(__jsp_taghandler_12);
                __jsp_taghandler_39.setProperty("descEstatus");
                __jsp_taghandler_39.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnSituacion");
                __jsp_taghandler_39.setSortable(true);
                __jsp_taghandler_39.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_40=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_40.setParent(__jsp_taghandler_12);
                __jsp_taghandler_40.setProperty("cnFolio");
                __jsp_taghandler_40.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.folio");
                __jsp_taghandler_40.setSortable(true);
                __jsp_taghandler_40.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_41=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_41.setParent(__jsp_taghandler_12);
                __jsp_taghandler_41.setProperty("cnRfc");
                __jsp_taghandler_41.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.rfc");
                __jsp_taghandler_41.setSortable(true);
                __jsp_taghandler_41.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_42=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_42.setParent(__jsp_taghandler_12);
                __jsp_taghandler_42.setProperty("nombreEmpleado");
                __jsp_taghandler_42.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.nombreEmpleado");
                __jsp_taghandler_42.setSortable(true);
                __jsp_taghandler_42.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_43=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_43.setParent(__jsp_taghandler_12);
                __jsp_taghandler_43.setProperty("primerApellido");
                __jsp_taghandler_43.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.primerApellido");
                __jsp_taghandler_43.setSortable(true);
                __jsp_taghandler_43.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_44=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_44.setParent(__jsp_taghandler_12);
                __jsp_taghandler_44.setProperty("segundoApellido");
                __jsp_taghandler_44.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.segundoApellido");
                __jsp_taghandler_44.setSortable(true);
                __jsp_taghandler_44.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_45=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_45.setParent(__jsp_taghandler_12);
                __jsp_taghandler_45.setProperty("hpIniPago");
                __jsp_taghandler_45.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.hpIniPago");
                __jsp_taghandler_45.setSortable(true);
                __jsp_taghandler_45.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_46=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_46.setParent(__jsp_taghandler_12);
                __jsp_taghandler_46.setProperty("hpFinPago");
                __jsp_taghandler_46.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.hpFinPago");
                __jsp_taghandler_46.setSortable(true);
                __jsp_taghandler_46.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_47.setParent(__jsp_taghandler_12);
                __jsp_taghandler_47.setProperty("idPuestoNom");
                __jsp_taghandler_47.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.idPuestoNom");
                __jsp_taghandler_47.setSortable(true);
                __jsp_taghandler_47.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_48.setParent(__jsp_taghandler_12);
                __jsp_taghandler_48.setProperty("idGrupoPago");
                __jsp_taghandler_48.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.idGrupoPago");
                __jsp_taghandler_48.setSortable(true);
                __jsp_taghandler_48.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_49=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_49.setParent(__jsp_taghandler_12);
                __jsp_taghandler_49.setProperty("idUnidadNom");
                __jsp_taghandler_49.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.idUnidadNom");
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
                __jsp_taghandler_50.setParent(__jsp_taghandler_12);
                __jsp_taghandler_50.setProperty("idPlaza");
                __jsp_taghandler_50.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.idPlaza");
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
                __jsp_taghandler_51.setParent(__jsp_taghandler_12);
                __jsp_taghandler_51.setProperty("hpNetoPago");
                __jsp_taghandler_51.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.hpNetoPago");
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
                __jsp_taghandler_52.setParent(__jsp_taghandler_12);
                __jsp_taghandler_52.setProperty("cnArchCreacion");
                __jsp_taghandler_52.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnArchCreacion");
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
                __jsp_taghandler_53.setParent(__jsp_taghandler_12);
                __jsp_taghandler_53.setProperty("cnArchAnexo20");
                __jsp_taghandler_53.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnArchAnexo20");
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
                __jsp_taghandler_54.setParent(__jsp_taghandler_12);
                __jsp_taghandler_54.setProperty("cnArchTimbrado");
                __jsp_taghandler_54.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnArchTimbrado");
                __jsp_taghandler_54.setSortable(true);
                __jsp_taghandler_54.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_55=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_55.setParent(__jsp_taghandler_12);
                __jsp_taghandler_55.setProperty("cnArchACancelar");
                __jsp_taghandler_55.setTitleKey("sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnArchACancelar");
                __jsp_taghandler_55.setSortable(true);
                __jsp_taghandler_55.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_56=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_56.setParent(__jsp_taghandler_12);
                __jsp_taghandler_56.setName("paging.banner.placement");
                __jsp_taghandler_56.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_57=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_57.setParent(__jsp_taghandler_12);
                __jsp_taghandler_57.setName("export.pdf");
                __jsp_taghandler_57.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_58=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_58.setParent(__jsp_taghandler_12);
                __jsp_taghandler_58.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_58,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_59=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_59.setParent(__jsp_taghandler_58);
                        __jsp_taghandler_59.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                          if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_59.doCatch(th);
                        } finally {
                          __jsp_taghandler_59.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,7);
                      }
                      out.write("<br/></span>\r\n                        ");
                    } while (__jsp_taghandler_58.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,6);
              }
              out.write("\r\n                    ");
            } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,5);
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

  private static final char __oracle_jsp_text[][]=new char[23][];
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
    " </strong> </h1> \r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"100%\"  align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        \r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[8] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                            </td>\r\n                        </tr>                        \r\n\r\n                        <tr>\r\n                            <td colspan=\"4\">\r\n                                <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                    <tr>\r\n                                        <td align=\"left\" colspan=\"2\"><strong>".toCharArray();
    __oracle_jsp_text[10] = 
    "</strong></td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"right\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                        </td>\r\n                                        <td align=\"left\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n            \r\n            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n            <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[19] = 
    "<br/><br/></span>\r\n        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(\"#10003\").prop(\"disabled\",true);\r\n        \r\n        function checkAll() {\r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('idGrupo');\r\n            for (var i = 0; i < checkboxes.length; i++) {\r\n                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {\r\n                    checkboxes[i].setAttribute('checked', true);\r\n                    $j(\"#10003\").prop(\"disabled\",false);\r\n                }\r\n            }\r\n            $j(\"#10003\").prop(\"disabled\",false);\r\n        }\r\n        \r\n        function uncheckAll() {\r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('idGrupo');\r\n            for (var i = 0; i < checkboxes.length; i++) {\r\n                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {\r\n                    checkboxes[i].removeAttribute('checked');\r\n                }\r\n            }\r\n            $j(\"#10003\").prop(\"disabled\",true);\r\n        }\r\n        \r\n        function searCheckeds(){\r\n            var cont = 0; \r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('idGrupo');\r\n            \r\n            for (var x=0; x < checkboxes.length; x++) {\r\n                if (checkboxes[x].checked) {\r\n                    cont = cont + 1;\r\n                }\r\n            }\r\n            if(cont > 0){\r\n                $j(\"#10003\").prop(\"disabled\",false);\r\n            } else { $j(\"#10003\").prop(\"disabled\",true); }\r\n        }\r\n        \r\n    </script>\r\n    \r\n".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
