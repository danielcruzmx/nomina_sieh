package _web_2d_inf._jsp._nomina._terceros._timbradosat;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _satTimbrado extends com.orionserver.http.OrionHttpJspPage {


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
    _satTimbrado page = this;
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
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag name modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("checkBoxTest");
        __jsp_taghandler_1.setModelAttribute("timbradoSatDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
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
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setPath("urlOrigen");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setPath("urlDestino");
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
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.nomina.terceros.sattimbrado.header");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.nomina.creaArchivoTerceros.titulo3");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setCode("sireh.label.nomina.creaArchivoTerceros.quincena");
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
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_8=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setKey("");
                __jsp_taghandler_8.setValue("selectList.nonValue");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_9=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setBeanName("tnNominaQuincena");
                __jsp_taghandler_9.setPath("nomQnaCaptura");
                __jsp_taghandler_9.setStyle("width: 200px;");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_10=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setPath("muestraRegistros");
                __jsp_taghandler_10.setAction((java.lang.String) ("timbradoSat/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${timbradoSatDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_10.setValue("submit.search");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_11=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setPath("cancel");
                __jsp_taghandler_11.setAction((java.lang.String) ("timbradoSat/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${timbradoSatDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
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
                      __jsp_taghandler_13.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${timbradoSatDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[18]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_14=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                            __jsp_taghandler_14.setJspContext(pageContext);
                            __jsp_taghandler_14.setProperty("TN_NOMINA.NOM_QNA_CAPTURA");
                            __jsp_taghandler_14.setCondition("=");
                            __jsp_taghandler_14.setPath("nomQnaCaptura");
                            __jsp_taghandler_14.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
                          }
                          out.write(__oracle_jsp_text[19]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_15=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_15.setParent(__jsp_taghandler_13);
                            __jsp_taghandler_15.setJspContext(pageContext);
                            __jsp_taghandler_15.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${timbradoSatDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_15.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${timbradoSatDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_15.setAppendFilters("false");
                            __jsp_taghandler_15.setCheckbox("true");
                            __jsp_taghandler_15.setChkProperty("idGrupo");
                            __jsp_taghandler_15.setMaxRows("200");
                            __jsp_taghandler_15.setJspBody(new _satTimbrado_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_15, __ojsp_varRes));
                            __jsp_taghandler_15.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
                          }
                          out.write(__oracle_jsp_text[20]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_69=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_69.setParent(__jsp_taghandler_13);
                            __jsp_taghandler_69.setJspContext(pageContext);
                            __jsp_taghandler_69.setPath("update");
                            __jsp_taghandler_69.setAction((java.lang.String) ("timbradoSat/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${timbradoSatDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                            __jsp_taghandler_69.setValue("submit.update");
                            __jsp_taghandler_69.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_69, pageContext);
                          }
                          out.write(__oracle_jsp_text[21]);
                        } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                    }
                    out.write(__oracle_jsp_text[22]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_70=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_70.setParent(__jsp_taghandler_12);
                      __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[23]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_71=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_71.setParent(__jsp_taghandler_70);
                            __jsp_taghandler_71.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                              if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_71.doCatch(th);
                            } finally {
                              __jsp_taghandler_71.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,4);
                          }
                          out.write(__oracle_jsp_text[24]);
                        } while (__jsp_taghandler_70.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,3);
                    }
                    out.write(__oracle_jsp_text[25]);
                  } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[26]);
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
      out.write(__oracle_jsp_text[27]);

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

  private class _satTimbrado_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _satTimbrado_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_15       = parent;
      out.write("\r\n                            <div id=\"displayTagDiv\">\r\n                                ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_16=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_16.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_15));
        __jsp_taghandler_16.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${timbradoSatDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_16.setPagesize(200);
        __jsp_taghandler_16.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_16.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_16.setClass("displaytag");
        __jsp_taghandler_16.setExport(true);
        __jsp_taghandler_16.setUid("row");
        __jsp_taghandler_16.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_16,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_17=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                __jsp_taghandler_17.setTitleKey("sireh.label.terceros.timbradosat.porNomina.acciones");
                __jsp_taghandler_17.setSortable(true);
                __jsp_taghandler_17.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                    ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_18.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty row.nomRefTimbrado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("                                                    \r\n                                        <a href=\"generarCadenaOriginal.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                              __jsp_taghandler_19.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,8);
                            }
                            out.write("\" title=\"Cadena original\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_20.setParent(__jsp_taghandler_18);
                              __jsp_taghandler_20.setCode("cadena.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_20.doCatch(th);
                              } finally {
                                __jsp_taghandler_20.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                        </a>\r\n                                     ");
                          } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,7);
                      }
                      out.write("\r\n                                     ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_21.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_21.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.nomRefTimbrado eq 'E'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                         <a href=\"firmarCadenas.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                              __jsp_taghandler_22.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,8);
                            }
                            out.write("\" title=\"Firmar\" onClick=\"hideElement(this);\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_23.setParent(__jsp_taghandler_21);
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
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                         </a>\r\n                                     ");
                          } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,7);
                      }
                      out.write("\r\n                                     ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_24.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_24.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.nomRefTimbrado eq 'F'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                        <a href=\"integrarXmlFirma.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                              __jsp_taghandler_25.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                              if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,8);
                            }
                            out.write("\" title=\"Procesar\" onClick=\"hideElement(this);\">\r\n                                            <img src=\"");
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
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                        </a>\r\n                                    ");
                          } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,7);
                      }
                      out.write("\r\n                                    ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_27.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_27.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.nomRefTimbrado eq 'V'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                        <a href=\"enviarSat.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                              __jsp_taghandler_28.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                              if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,8);
                            }
                            out.write("\" title=\"Sat\" onClick=\"hideElement(this);\">\r\n                                            <img src=\"");
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
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                        </a>\r\n                                    ");
                          } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,7);
                      }
                      out.write("\r\n                                    ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_30.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_30.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.nomRefTimbrado eq 'R'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                        <a href=\"consultarEnviadoSat.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                              __jsp_taghandler_31.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                              if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,8);
                            }
                            out.write("\" title=\"Consultar\">\r\n                                            <img src=\"");
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
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                        </a>\r\n                                    ");
                          } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,7);
                      }
                      out.write("\r\n                                    ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_33.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_33.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.nomRefTimbrado eq 'P'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                        <a href=\"descargarInforme.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                              __jsp_taghandler_34.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                              if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,8);
                            }
                            out.write("\" title=\"Informe\" onClick=\"hideElement(this);\">\r\n                                            <img src=\"");
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
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                        </a>\r\n                                    ");
                          } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,7);
                      }
                      out.write("                                    \r\n                                    <!--");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_36.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_36.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.nomRefTimbrado eq 'T'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                        <a href=\"generarArchivoCancelacion.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                              __jsp_taghandler_37.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,8);
                            }
                            out.write("&cnPaquete=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_38.setParent(__jsp_taghandler_36);
                              __jsp_taghandler_38.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cnPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                              if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,8);
                            }
                            out.write("\" title=\"Cancelar\" onClick=\"return confirm(' Este proceso env\\u00EDa a cancelar la n\\u00F3mina completa al SAT. \\n \\u00BFEst\\u00E1 completamente seguro de continuar?')\">\r\n                                            <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_39.setParent(__jsp_taghandler_36);
                              __jsp_taghandler_39.setCode("cancelar.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_39.doCatch(th);
                              } finally {
                                __jsp_taghandler_39.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                        </a>\r\n                                    ");
                          } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,7);
                      }
                      out.write("-->\r\n                                    ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_40.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_40.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.nomRefTimbrado eq 'T'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                    \t<a href=\"enviarComprobantes.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                              __jsp_taghandler_41.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                              if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,8);
                            }
                            out.write("\" title=\"Enviar\">\r\n                                            <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_42.setParent(__jsp_taghandler_40);
                              __jsp_taghandler_42.setCode("correo.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_42.doCatch(th);
                              } finally {
                                __jsp_taghandler_42.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                        </a>\r\n                                    ");
                          } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,7);
                      }
                      out.write("\r\n                                    ");
                    } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_43=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_43.setParent(__jsp_taghandler_16);
                __jsp_taghandler_43.setProperty("idQna");
                __jsp_taghandler_43.setTitleKey("sireh.label.terceros.timbradosat.porNomina.idNomina");
                __jsp_taghandler_43.setSortable(true);
                __jsp_taghandler_43.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_44=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_44.setParent(__jsp_taghandler_16);
                __jsp_taghandler_44.setProperty("numComplem");
                __jsp_taghandler_44.setTitleKey("sireh.label.terceros.timbradosat.porNomina.nomNumComplem");
                __jsp_taghandler_44.setSortable(true);
                __jsp_taghandler_44.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
              }
              out.write(" \r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_45=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_45.setParent(__jsp_taghandler_16);
                __jsp_taghandler_45.setProperty("descripcion");
                __jsp_taghandler_45.setTitleKey("sireh.label.terceros.timbradosat.porNomina.descNomina");
                __jsp_taghandler_45.setSortable(true);
                __jsp_taghandler_45.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_46=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_46.setParent(__jsp_taghandler_16);
                __jsp_taghandler_46.setProperty("tipoNomina");
                __jsp_taghandler_46.setTitleKey("sireh.label.terceros.timbradosat.porNomina.idtipoNomina");
                __jsp_taghandler_46.setSortable(true);
                __jsp_taghandler_46.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_47.setParent(__jsp_taghandler_16);
                __jsp_taghandler_47.setProperty("grupoPago");
                __jsp_taghandler_47.setTitleKey("sireh.label.terceros.timbradosat.porNomina.descGrupoPago");
                __jsp_taghandler_47.setSortable(true);
                __jsp_taghandler_47.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,6);
              }
              out.write("            \r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_48.setParent(__jsp_taghandler_16);
                __jsp_taghandler_48.setProperty("descNomRefTimbrado");
                __jsp_taghandler_48.setTitleKey("sireh.label.terceros.timbradosat.porNomina.nomRefTimbrado");
                __jsp_taghandler_48.setSortable(false);
                __jsp_taghandler_48.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_49=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_49.setParent(__jsp_taghandler_16);
                __jsp_taghandler_49.setTitleKey("sireh.label.terceros.timbradosat.porNomina.nomArchCreacion");
                __jsp_taghandler_49.setSortable(true);
                __jsp_taghandler_49.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_49,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_50=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                        __jsp_taghandler_50.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.nomArchCreacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                            <a href=\"downloadFile.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_51=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_51.setParent(__jsp_taghandler_50);
                              __jsp_taghandler_51.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                              if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,8);
                            }
                            out.write("&file=nomArchCreacion\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_52.setParent(__jsp_taghandler_50);
                              __jsp_taghandler_52.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_52.doCatch(th);
                              } finally {
                                __jsp_taghandler_52.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                            </a>\r\n                                        ");
                          } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,7);
                      }
                      out.write("\r\n                                    ");
                    } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_53=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_53.setParent(__jsp_taghandler_16);
                __jsp_taghandler_53.setTitleKey("sireh.label.terceros.timbradosat.porNomina.nomArchAnexo20");
                __jsp_taghandler_53.setSortable(true);
                __jsp_taghandler_53.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_53,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_54=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_54.setParent(__jsp_taghandler_53);
                        __jsp_taghandler_54.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.nomArchAnexo20}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                            <a href=\"downloadFile.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_55=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                              __jsp_taghandler_55.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                              if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,8);
                            }
                            out.write("&file=nomArchAnexo20\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_56.setParent(__jsp_taghandler_54);
                              __jsp_taghandler_56.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_56.doCatch(th);
                              } finally {
                                __jsp_taghandler_56.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                            </a>\r\n                                        ");
                          } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,7);
                      }
                      out.write("\r\n                                    ");
                    } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_57=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_57.setParent(__jsp_taghandler_16);
                __jsp_taghandler_57.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomArchTimbrado");
                __jsp_taghandler_57.setSortable(true);
                __jsp_taghandler_57.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_57,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_58=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_58.setParent(__jsp_taghandler_57);
                        __jsp_taghandler_58.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.nomArchTimbrado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                            <a href=\"downloadFile.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_59=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_59.setParent(__jsp_taghandler_58);
                              __jsp_taghandler_59.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                              if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,8);
                            }
                            out.write("&file=nomArchTimbrado\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_60=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_60.setParent(__jsp_taghandler_58);
                              __jsp_taghandler_60.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_60.doCatch(th);
                              } finally {
                                __jsp_taghandler_60.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                            </a>\r\n                                        ");
                          } while (__jsp_taghandler_58.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,7);
                      }
                      out.write("\r\n                                    ");
                    } while (__jsp_taghandler_57.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_61=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_61.setParent(__jsp_taghandler_16);
                __jsp_taghandler_61.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomArchCanc");
                __jsp_taghandler_61.setSortable(true);
                __jsp_taghandler_61.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_61,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_62=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_62.setParent(__jsp_taghandler_61);
                        __jsp_taghandler_62.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.nomArchCanc}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                            <a href=\"downloadFile.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_63=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_63.setParent(__jsp_taghandler_62);
                              __jsp_taghandler_63.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                              if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,8);
                            }
                            out.write("&file=nomArchCanc\">\r\n                                                <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_64=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_64.setParent(__jsp_taghandler_62);
                              __jsp_taghandler_64.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_64.doCatch(th);
                              } finally {
                                __jsp_taghandler_64.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,8);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                            </a>\r\n                                        ");
                          } while (__jsp_taghandler_62.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,7);
                      }
                      out.write("\r\n                                    ");
                    } while (__jsp_taghandler_61.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,6);
              }
              out.write("\r\n\r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_65=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_65.setParent(__jsp_taghandler_16);
                __jsp_taghandler_65.setName("paging.banner.placement");
                __jsp_taghandler_65.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_66=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_66.setParent(__jsp_taghandler_16);
                __jsp_taghandler_66.setName("export.pdf");
                __jsp_taghandler_66.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_67=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_67.setParent(__jsp_taghandler_16);
                __jsp_taghandler_67.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_67,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_68=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_68.setParent(__jsp_taghandler_67);
                        __jsp_taghandler_68.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                          if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_68.doCatch(th);
                        } finally {
                          __jsp_taghandler_68.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,7);
                      }
                      out.write("<br/><br/></span>\r\n                                    ");
                    } while (__jsp_taghandler_67.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,6);
              }
              out.write("\r\n                                ");
            } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,5);
      }
      out.write("\r\n                            </div>\r\n                        ");
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

  private static final char __oracle_jsp_text[][]=new char[28][];
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
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    \r\n    <h1> <strong> ".toCharArray();
    __oracle_jsp_text[10] = 
    " </strong> </h1> \r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"100%\"  align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset id=\"quincenasFieldSet\">\r\n                    <legend style='font-size:1.2em'/>\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[11] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr><td></td></tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>      \r\n                            <td></td>\r\n                        </tr>\r\n                    </table>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"center\">\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n            <td></td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n            \r\n                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                        <table width=\"100%\">\r\n                            <tr align=\"center\">\r\n                                <td>".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            </tr>\r\n                        </table>\r\n                    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                        <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[24] = 
    "<br/><br/></span>\r\n                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n        function hideElement(element){\r\n            $j(element).hide();\r\n        }\r\n    </script>\r\n".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
