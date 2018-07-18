package _web_2d_inf._jsp._rusp._proceso;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _pInformacionBasica extends com.orionserver.http.OrionHttpJspPage {


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
    _pInformacionBasica page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("context");
        __jsp_taghandler_1.setValue(request.getContextPath());
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setModelAttribute("ruspDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setPath("numRegistros");
                __jsp_taghandler_3.setId("numRegistros");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_taghandler_4.setPath("procesar");
                __jsp_taghandler_4.setId("procesar");
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
                __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                __jsp_taghandler_5.setCode("gestion.rusp");
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
                __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                __jsp_taghandler_6.setCode("gestion.proceso");
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
                __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                __jsp_taghandler_7.setCode("gestion.informacionBasicaRusp");
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
                __jsp_taghandler_8.setParent(__jsp_taghandler_2);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setKey("0");
                __jsp_taghandler_8.setValue("selectList.nonValue");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_9=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setBeanName("tcUnidadCicloReportes");
                __jsp_taghandler_9.setPath("ciclo");
                __jsp_taghandler_9.setStyle("width: 150px;");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_10=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_2);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setKey("0");
                __jsp_taghandler_10.setValue("selectList.nonValue");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_11=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_2);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setBeanName("listaQuincenasCicloPBajas");
                __jsp_taghandler_11.setPath("quincena");
                __jsp_taghandler_11.setParentPath("ciclo");
                __jsp_taghandler_11.setProgress("true");
                __jsp_taghandler_11.setOnchange("geNumRegs();");
                __jsp_taghandler_11.setStyle("width: 150px;");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path id size maxlength");
                __jsp_taghandler_12.setParent(__jsp_taghandler_2);
                __jsp_taghandler_12.setPath("email");
                __jsp_taghandler_12.setId("email");
                __jsp_taghandler_12.setSize("37");
                __jsp_taghandler_12.setMaxlength("60");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_13=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_2);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setKey("0");
                __jsp_taghandler_13.setValue("selectList.nonValue");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_14=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_2);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setBeanName("ruspInformacionBasica-escenario");
                __jsp_taghandler_14.setPath("escenario");
                __jsp_taghandler_14.setOnchange("geNumRegs();");
                __jsp_taghandler_14.setStyle("width: 150px;");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_2);
                __jsp_taghandler_15.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_16=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_2);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setPath("muestraNominas");
                __jsp_taghandler_16.setAction("gestionRusp/pInformacionBasica.do");
                __jsp_taghandler_16.setValue("submit.search");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_17=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_2);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setPath("limpiar");
                __jsp_taghandler_17.setAction("gestionRusp/pInformacionBasica.do");
                __jsp_taghandler_17.setValue("submit.clean");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_18.setParent(__jsp_taghandler_2);
                __jsp_taghandler_18.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ruspDTO.muestraNominas}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[22]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_19=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                      __jsp_taghandler_19.setJspContext(pageContext);
                      __jsp_taghandler_19.setPath("generaArchivo");
                      __jsp_taghandler_19.setAction("gestionRusp/pInformacionBasica.do");
                      __jsp_taghandler_19.setValue("submit.generate");
                      __jsp_taghandler_19.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
                    }
                    out.write(__oracle_jsp_text[23]);
                  } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_20.setParent(__jsp_taghandler_2);
                __jsp_taghandler_20.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ruspDTO.muestraNominas}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[25]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_21=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_21.setJspContext(pageContext);
                      __jsp_taghandler_21.setProperty("h.hp_qna_pago");
                      __jsp_taghandler_21.setCondition("=");
                      __jsp_taghandler_21.setPath("quincena");
                      __jsp_taghandler_21.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                    }
                    out.write(__oracle_jsp_text[26]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_22=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_22.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_22.setJspContext(pageContext);
                      __jsp_taghandler_22.setProperty("h1.hp_qna_pago");
                      __jsp_taghandler_22.setCondition("=");
                      __jsp_taghandler_22.setPath("quincenaAnterior");
                      __jsp_taghandler_22.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                    }
                    out.write(__oracle_jsp_text[27]);
                    {
                      _oracle._jsp._tag._pagedList_tag __jsp_taghandler_23=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                      __jsp_taghandler_23.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_23.setJspContext(pageContext);
                      __jsp_taghandler_23.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ruspDTO.beanlista}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_23.setBaseUrl("tercerosNomina/pInformacionBasica.do");
                      __jsp_taghandler_23.setAppendFilters("false");
                      __jsp_taghandler_23.setCheckbox("true");
                      __jsp_taghandler_23.setChkProperty("seleccionConsecNomina");
                      __jsp_taghandler_23.setJspBody(new _pInformacionBasica_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_23, __ojsp_varRes));
                      __jsp_taghandler_23.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                    }
                    out.write(__oracle_jsp_text[28]);
                  } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[29]);
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[30]);

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

  private class _pInformacionBasica_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _pInformacionBasica_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_23       = parent;
      out.write("\r\n                       \r\n            ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_24=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort form");
        __jsp_taghandler_24.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_23));
        __jsp_taghandler_24.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ruspDTO.beanlista}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_24.setPagesize(10);
        __jsp_taghandler_24.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_24.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_24.setClass("displaytag");
        __jsp_taghandler_24.setExport(true);
        __jsp_taghandler_24.setUid("row");
        __jsp_taghandler_24.setSort("list");
        __jsp_taghandler_24.setForm("checkBoxTest");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_24,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n               ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_25=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey media style");
                __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                __jsp_taghandler_25.setProperty("checkbox");
                __jsp_taghandler_25.setTitleKey("sireh.label.nomina.creaArchivoTerceros.selecciona");
                __jsp_taghandler_25.setMedia("html");
                __jsp_taghandler_25.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,5);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_26=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_26.setParent(__jsp_taghandler_24);
                __jsp_taghandler_26.setProperty("qnaPago");
                __jsp_taghandler_26.setTitleKey("sireh.label.nomina.creaArchivoTerceros.quincenaPago");
                __jsp_taghandler_26.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,5);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_27=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_27.setParent(__jsp_taghandler_24);
                __jsp_taghandler_27.setProperty("tipoNomina");
                __jsp_taghandler_27.setTitleKey("sireh.label.nomina.creaArchivoTerceros.tipoNomina");
                __jsp_taghandler_27.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,5);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_28=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_28.setParent(__jsp_taghandler_24);
                __jsp_taghandler_28.setProperty("consecNomina");
                __jsp_taghandler_28.setTitleKey("sireh.label.nomina.creaArchivoTerceros.consecutivoNomina");
                __jsp_taghandler_28.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,5);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_29=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_29.setParent(__jsp_taghandler_24);
                __jsp_taghandler_29.setProperty("numComplem");
                __jsp_taghandler_29.setTitleKey("sireh.label.nomina.creaArchivoTerceros.complemento");
                __jsp_taghandler_29.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,5);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_30=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_30.setParent(__jsp_taghandler_24);
                __jsp_taghandler_30.setProperty("gpoPago");
                __jsp_taghandler_30.setTitleKey("sireh.label.nomina.creaArchivoTerceros.grupoPago");
                __jsp_taghandler_30.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,5);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_31=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_31.setParent(__jsp_taghandler_24);
                __jsp_taghandler_31.setName("paging.banner.placement");
                __jsp_taghandler_31.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,5);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_32=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_32.setParent(__jsp_taghandler_24);
                __jsp_taghandler_32.setName("export.pdf");
                __jsp_taghandler_32.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,5);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_33=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_33.setParent(__jsp_taghandler_24);
                __jsp_taghandler_33.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_33,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                    <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                        __jsp_taghandler_34.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                          if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_34.doCatch(th);
                        } finally {
                          __jsp_taghandler_34.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,6);
                      }
                      out.write("<br><br></span>\r\n                ");
                    } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,5);
              }
              out.write("\r\n            ");
            } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,4);
      }
      out.write("\r\n        ");
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

  private static final char __oracle_jsp_text[][]=new char[31][];
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
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    \r\n    <h1><strong>\r\n            ".toCharArray();
    __oracle_jsp_text[9] = 
    " &#45;\r\n            ".toCharArray();
    __oracle_jsp_text[10] = 
    " &#45; \r\n            ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    </strong></h1>\r\n\r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.1em\"><strong>&nbsp;&nbsp;Parametros de consulta&nbsp;&nbsp; </strong></legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr> <td colspan=\"2\">&nbsp;</td> </tr>\r\n                        <tr> \r\n                            <td align=\"right\" class=\"label\" width=\"20%\">* Ciclo</td>\r\n                            <td align=\"left\" colspan=\"2\">\r\n                                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr> \r\n                            <td align=\"right\" class=\"label\" width=\"20%\">* Quincena</td>\r\n                            <td align=\"left\" colspan=\"2\">\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* Email</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"rigth\" class=\"label\">* Escenario</td>\r\n                            <td align=\"left\"> ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td align=\"center\">\r\n                <table align=\"center\" width=\"100%\" border=\"0\">\r\n                    <tr>\r\n                        <td align=\"left\" width=\"45%\">\r\n                            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                        </td>\r\n                        <td align=\"right\" width=\"30%\">\r\n                            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                        </td>\r\n                        <td >&nbsp;</td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                \r\n        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n    \r\n    <script  type=\"text/javascript\">\r\n        $j(document).ready(function(){\r\n            $j(\"#email\").blur(function(){\r\n                // Expresion regular para validar el correo\r\n                var regex = /[\\w-\\.]{2,}@([\\w-]{2,}\\.)*([\\w-]{2,}\\.)[\\w-]{2,4}/;\r\n                \r\n                // Se utiliza la funcion test() nativa de JavaScript\r\n                if (!regex.test($j('#email').val())) {\r\n                    alert('La direccion de correo electronico no es valida');\r\n                    $j('#email').val('');\r\n                }\r\n            });\r\n        });\r\n        \r\n        $j(document).ready(function(){\r\n            $j('#10003').click(function(){\r\n                if($j('#ciclo').val() != '0' && $j('#quincena').val() != '0'){\r\n                    //http://www.etnassoft.com/2010/12/28/cadenas-de-escape-como-poner-tildes-en-javascript/\r\n                    var mesaje = $j('#numRegistros').val() + '  registros seran afectados en este proceso, \\u00BF Desea continuar ?';\r\n                    var r = window.confirm(mesaje);\r\n                    $j('#generaArchivo').val(r);\r\n                }\r\n            });\r\n        });\r\n        \r\n        function geNumRegs(){\r\n            var qna = $j('#quincena').val();\r\n            if($j('#ciclo').val() != '0' && $j('#quincena').val() != '0'){\r\n                $j.ajax({\r\n                    url: 'geNumRegsInfoBasicCallback.do',\r\n                    type: 'GET',\r\n                    data: 'qna=' + qna,\r\n                    //async: false,\r\n                    success: function(data) {\r\n                        $j('#numRegistros').val(data);\r\n                    }\r\n                });\r\n            }\r\n        }\r\n    </script>\r\n    \r\n ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
