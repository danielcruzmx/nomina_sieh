package _web_2d_inf._jsp._nomina._terceros._tercerosnomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _satListadoNominas extends com.orionserver.http.OrionHttpJspPage {


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
    _satListadoNominas page = this;
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
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag id modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("formQna");
        __jsp_taghandler_1.setModelAttribute("consultaNominaDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
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
              out.write(__oracle_jsp_text[8]);
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
              out.write(__oracle_jsp_text[9]);
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
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.nomina.terceros.satListadoNominas.header");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.nomina.gestion.label.numQuincena");
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
                __jsp_taghandler_8.setBeanName("tnNominaQuincena");
                __jsp_taghandler_8.setPath("quincena");
                __jsp_taghandler_8.setStyle("width: 200px;");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.nomina.gestion.label.tipoNomina");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_10=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setKey("");
                __jsp_taghandler_10.setValue("selectList.nonValue");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_11=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setBeanName("listaTiposNomina");
                __jsp_taghandler_11.setPath("tipoNomina");
                __jsp_taghandler_11.setStyle("width: 200px;");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.nomina.gestion.label.gpoPago");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_13=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setKey("");
                __jsp_taghandler_13.setValue("selectList.nonValue");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_14=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setBeanName("listaGruposPago");
                __jsp_taghandler_14.setPath("grupoPago");
                __jsp_taghandler_14.setStyle("width: 200px;");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("sireh.label.nomina.gestion.label.status");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_16=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setKey("");
                __jsp_taghandler_16.setValue("selectList.nonValue");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_17=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setBeanName("listaEstadosNomina");
                __jsp_taghandler_17.setPath("idEdoNom");
                __jsp_taghandler_17.setStyle("width: 200px;");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_18=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("muestraRegistros");
                __jsp_taghandler_18.setAction((java.lang.String) ("tercerosNomina/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaNominaDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_18.setValue("submit.search");
                __jsp_taghandler_18.setProgressBar("true");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_19=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setPath("cancel");
                __jsp_taghandler_19.setAction((java.lang.String) ("tercerosNomina/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaNominaDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_19.setValue("submit.clean");
                __jsp_taghandler_19.setProgressBar("true");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_20=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setProperty("TN_NOMINA.NOM_QNA_CAPTURA");
                __jsp_taghandler_20.setCondition("=");
                __jsp_taghandler_20.setPath("quincena");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_21=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setProperty("TN_NOMINA.ID_TIPO_NOMINA");
                __jsp_taghandler_21.setCondition("=");
                __jsp_taghandler_21.setPath("tipoNomina");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[27]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_22=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setProperty("TN_NOMINA.ID_GRUPO_PAGO_NOM");
                __jsp_taghandler_22.setCondition("=");
                __jsp_taghandler_22.setPath("grupoPago");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_23=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setProperty("TN_NOMINA.ID_EDO_NOM");
                __jsp_taghandler_23.setCondition("=");
                __jsp_taghandler_23.setPath("idEdoNom");
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_24=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaNominaDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_24.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaNominaDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_24.setAppendFilters("false");
                __jsp_taghandler_24.setCheckbox("true");
                __jsp_taghandler_24.setChkProperty("idGrupo");
                __jsp_taghandler_24.setMaxRows("200");
                __jsp_taghandler_24.setJspBody(new _satListadoNominas_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_24, __ojsp_varRes));
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_55=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setJspContext(pageContext);
                __jsp_taghandler_55.setAction("gestionNomina/altaNomina");
                __jsp_taghandler_55.setValue("submit.add");
                __jsp_taghandler_55.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
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

  private class _satListadoNominas_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _satListadoNominas_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_24       = parent;
      out.write("\r\n        <div id=\"displayTagDiv\">        \r\n            ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_25=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_25.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_24));
        __jsp_taghandler_25.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaNominaDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_25.setPagesize(15);
        __jsp_taghandler_25.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_25.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_25.setClass("displaytag");
        __jsp_taghandler_25.setExport(true);
        __jsp_taghandler_25.setUid("row");
        __jsp_taghandler_25.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_25,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                \r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_26=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                __jsp_taghandler_26.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.idQna");
                __jsp_taghandler_26.setSortable(true);
                __jsp_taghandler_26.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_26,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                    ");
                      out.write("\r\n                    <a href=\"satModificacionNomina.do?idQna=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                        __jsp_taghandler_27.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                        if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,5);
                      }
                      out.write("\">");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_28.setParent(__jsp_taghandler_26);
                        __jsp_taghandler_28.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                        if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,5);
                      }
                      out.write("</a>\r\n                ");
                    } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_29=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_29.setParent(__jsp_taghandler_25);
                __jsp_taghandler_29.setProperty("qnaCaptura");
                __jsp_taghandler_29.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.qnaCaptura");
                __jsp_taghandler_29.setSortable(true);
                __jsp_taghandler_29.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_30=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_30.setParent(__jsp_taghandler_25);
                __jsp_taghandler_30.setProperty("numComplem");
                __jsp_taghandler_30.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.numComplem");
                __jsp_taghandler_30.setSortable(true);
                __jsp_taghandler_30.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_31=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_31.setParent(__jsp_taghandler_25);
                __jsp_taghandler_31.setProperty("descripcion");
                __jsp_taghandler_31.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.desc");
                __jsp_taghandler_31.setSortable(true);
                __jsp_taghandler_31.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_32=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_32.setParent(__jsp_taghandler_25);
                __jsp_taghandler_32.setProperty("tipoNomina");
                __jsp_taghandler_32.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.tipoNomina");
                __jsp_taghandler_32.setSortable(true);
                __jsp_taghandler_32.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_33=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_33.setParent(__jsp_taghandler_25);
                __jsp_taghandler_33.setProperty("grupoPago");
                __jsp_taghandler_33.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.grupoPago");
                __jsp_taghandler_33.setSortable(true);
                __jsp_taghandler_33.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_34=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_34.setParent(__jsp_taghandler_25);
                __jsp_taghandler_34.setProperty("descEstadoNom");
                __jsp_taghandler_34.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.status");
                __jsp_taghandler_34.setSortable(true);
                __jsp_taghandler_34.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_35.setParent(__jsp_taghandler_25);
                __jsp_taghandler_35.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomArchCreacion");
                __jsp_taghandler_35.setSortable(true);
                __jsp_taghandler_35.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_35,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                        __jsp_taghandler_36.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.nomArchCreacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                    <a href=\"downloadFile.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                              __jsp_taghandler_37.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
                            }
                            out.write("&file=nomArchCreacion\">\r\n                                        <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_38.setParent(__jsp_taghandler_36);
                              __jsp_taghandler_38.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_38.doCatch(th);
                              } finally {
                                __jsp_taghandler_38.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,6);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                    </a>\r\n                                ");
                          } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,5);
                      }
                      out.write("\r\n                ");
                    } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_39=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_39.setParent(__jsp_taghandler_25);
                __jsp_taghandler_39.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomArchAnexo20");
                __jsp_taghandler_39.setSortable(true);
                __jsp_taghandler_39.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_39,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                        __jsp_taghandler_40.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.nomArchAnexo20}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                    <a href=\"downloadFile.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                              __jsp_taghandler_41.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                              if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,6);
                            }
                            out.write("&file=nomArchAnexo20\">\r\n                                        <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_42.setParent(__jsp_taghandler_40);
                              __jsp_taghandler_42.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_42.doCatch(th);
                              } finally {
                                __jsp_taghandler_42.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                    </a>\r\n                                ");
                          } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,5);
                      }
                      out.write("\r\n                ");
                    } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_43=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_43.setParent(__jsp_taghandler_25);
                __jsp_taghandler_43.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomArchTimbrado");
                __jsp_taghandler_43.setSortable(true);
                __jsp_taghandler_43.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_43,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_44.setParent(__jsp_taghandler_43);
                        __jsp_taghandler_44.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.nomArchTimbrado}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                    <a href=\"downloadFile.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                              __jsp_taghandler_45.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                              if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
                            }
                            out.write("&file=nomArchTimbrado\">\r\n                                        <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_46.setParent(__jsp_taghandler_44);
                              __jsp_taghandler_46.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_46.doCatch(th);
                              } finally {
                                __jsp_taghandler_46.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,6);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                    </a>\r\n                                ");
                          } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,5);
                      }
                      out.write("\r\n                ");
                    } while (__jsp_taghandler_43.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_47.setParent(__jsp_taghandler_25);
                __jsp_taghandler_47.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.nomArchCanc");
                __jsp_taghandler_47.setSortable(true);
                __jsp_taghandler_47.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_47,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_48=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_48.setParent(__jsp_taghandler_47);
                        __jsp_taghandler_48.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.nomArchCanc}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                    <a href=\"downloadFile.do?idNomina=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                              __jsp_taghandler_49.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                              if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
                            }
                            out.write("&file=nomArchCanc\">\r\n                                        <img src=\"");
                            {
                              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                              __jsp_taghandler_50.setParent(__jsp_taghandler_48);
                              __jsp_taghandler_50.setCode("rar-download.png");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_50.doCatch(th);
                              } finally {
                                __jsp_taghandler_50.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,6);
                            }
                            out.write("\" border=\"0\" width=\"20\"/>\r\n                                    </a>\r\n                                ");
                          } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,5);
                      }
                      out.write("\r\n                ");
                    } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_51=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_51.setParent(__jsp_taghandler_25);
                __jsp_taghandler_51.setName("paging.banner.placement");
                __jsp_taghandler_51.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_52=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_52.setParent(__jsp_taghandler_25);
                __jsp_taghandler_52.setName("export.pdf");
                __jsp_taghandler_52.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_53=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_53.setParent(__jsp_taghandler_25);
                __jsp_taghandler_53.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_53,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                    <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_54=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_54.setParent(__jsp_taghandler_53);
                        __jsp_taghandler_54.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                          if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_54.doCatch(th);
                        } finally {
                          __jsp_taghandler_54.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,5);
                      }
                      out.write("<br/><br/></span>\r\n                ");
                    } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,4);
              }
              out.write("\r\n            ");
            } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,3);
      }
      out.write("\r\n        </div>\r\n    ");
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

  private static final char __oracle_jsp_text[][]=new char[32][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .pagelinks {\r\n        display:none;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[11] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"90%\">\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>\r\n                         </tr>\r\n                         <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                         </tr>\r\n                         <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>\r\n                         </tr>\r\n                         <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>\r\n                         </tr>\r\n                    </table>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"center\">\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[24] = 
    "&nbsp; \r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n    \r\n    <!--<table width=\"100%\">\r\n        <tr align=\"center\">\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>-->\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
