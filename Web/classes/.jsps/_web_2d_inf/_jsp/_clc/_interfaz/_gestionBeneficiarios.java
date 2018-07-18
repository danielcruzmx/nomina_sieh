package _web_2d_inf._jsp._clc._interfaz;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _gestionBeneficiarios extends com.orionserver.http.OrionHttpJspPage {


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
    _gestionBeneficiarios page = this;
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
        __jsp_taghandler_1.setModelAttribute("gestionBeneficiariosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.nomina.movimiento.gestionbenef.path.header");
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
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_3=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setJspContext(pageContext);
                __jsp_taghandler_3.setBeanName("listaBeneficiariosSICOP");
                __jsp_taghandler_3.setBaseUrl("gestionBeneficiarios");
                __jsp_taghandler_3.setAppendFilters("false");
                __jsp_taghandler_3.setJspBody(new _gestionBeneficiarios_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_3, __ojsp_varRes));
                __jsp_taghandler_3.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_3, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
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
      out.write(__oracle_jsp_text[10]);

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

  private class _gestionBeneficiarios_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _gestionBeneficiarios_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_3       = parent;
      out.write("\r\n        <div id=\"dataTable\" style=\"width: 1025px; overflow: auto;\">\r\n            ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_4=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_4.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_3));
        __jsp_taghandler_4.setName("listaBeneficiariosSICOP");
        __jsp_taghandler_4.setPagesize(10);
        __jsp_taghandler_4.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_4.setClass("displaytag");
        __jsp_taghandler_4.setExport(true);
        __jsp_taghandler_4.setUid("row");
        __jsp_taghandler_4.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("          \r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_5=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable");
                __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                __jsp_taghandler_5.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.llave");
                __jsp_taghandler_5.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                    do {
                      out.write(" <a href=\"detalleBeneficiario.do?bsCtaBancaria=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                        __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.bsCtaBancaria}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,5);
                      }
                      out.write("&bsLeyenda=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                        __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.bsLeyenda}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                      }
                      out.write("&bsTipoPago=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                        __jsp_taghandler_8.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.bsTipoPago}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,5);
                      }
                      out.write("&idBeneSicop=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                        __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idBeneSicop}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,5);
                      }
                      out.write("\"> ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                        __jsp_taghandler_10.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idBeneSicop}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,5);
                      }
                      out.write("</a>\r\n            ");
                    } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_11=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_11.setParent(__jsp_taghandler_4);
                __jsp_taghandler_11.setProperty("bsCtaBancaria");
                __jsp_taghandler_11.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.bsCtaBancaria");
                __jsp_taghandler_11.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_12=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_12.setParent(__jsp_taghandler_4);
                __jsp_taghandler_12.setProperty("descrip");
                __jsp_taghandler_12.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.descrip");
                __jsp_taghandler_12.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_13=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_13.setParent(__jsp_taghandler_4);
                __jsp_taghandler_13.setProperty("moneda");
                __jsp_taghandler_13.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.moneda");
                __jsp_taghandler_13.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_14=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_14.setParent(__jsp_taghandler_4);
                __jsp_taghandler_14.setProperty("bsTipoPago");
                __jsp_taghandler_14.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.bsTipoPago");
                __jsp_taghandler_14.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_15=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_15.setParent(__jsp_taghandler_4);
                __jsp_taghandler_15.setProperty("bsLeyenda");
                __jsp_taghandler_15.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.bsLeyenda");
                __jsp_taghandler_15.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_16=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_16.setParent(__jsp_taghandler_4);
                __jsp_taghandler_16.setProperty("ref1");
                __jsp_taghandler_16.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.ref1");
                __jsp_taghandler_16.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_17=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_17.setParent(__jsp_taghandler_4);
                __jsp_taghandler_17.setProperty("ref2");
                __jsp_taghandler_17.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.ref2");
                __jsp_taghandler_17.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_18=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_18.setParent(__jsp_taghandler_4);
                __jsp_taghandler_18.setProperty("tiponom");
                __jsp_taghandler_18.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.tiponom");
                __jsp_taghandler_18.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_19=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_19.setParent(__jsp_taghandler_4);
                __jsp_taghandler_19.setProperty("rfc");
                __jsp_taghandler_19.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.rfc");
                __jsp_taghandler_19.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_20=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_20.setParent(__jsp_taghandler_4);
                __jsp_taghandler_20.setProperty("origen");
                __jsp_taghandler_20.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.origen");
                __jsp_taghandler_20.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_21=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_21.setParent(__jsp_taghandler_4);
                __jsp_taghandler_21.setProperty("eroga");
                __jsp_taghandler_21.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.eroga");
                __jsp_taghandler_21.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_22=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_22.setParent(__jsp_taghandler_4);
                __jsp_taghandler_22.setProperty("opera");
                __jsp_taghandler_22.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.opera");
                __jsp_taghandler_22.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_23=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_23.setParent(__jsp_taghandler_4);
                __jsp_taghandler_23.setProperty("usuario");
                __jsp_taghandler_23.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.usuario");
                __jsp_taghandler_23.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_24=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_24.setParent(__jsp_taghandler_4);
                __jsp_taghandler_24.setProperty("fechamod");
                __jsp_taghandler_24.setTitleKey("sireh.label.nomina.movimiento.gestionbenef.fechamod");
                __jsp_taghandler_24.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_25=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_25.setParent(__jsp_taghandler_4);
                __jsp_taghandler_25.setName("paging.banner.placement");
                __jsp_taghandler_25.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_26=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_26.setParent(__jsp_taghandler_4);
                __jsp_taghandler_26.setName("export.pdf");
                __jsp_taghandler_26.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_27=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_27.setParent(__jsp_taghandler_4);
                __jsp_taghandler_27.setName("export.excel");
                __jsp_taghandler_27.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_28=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_28.setParent(__jsp_taghandler_4);
                __jsp_taghandler_28.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_28,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                    <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                        __jsp_taghandler_29.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                          if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_29.doCatch(th);
                        } finally {
                          __jsp_taghandler_29.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,5);
                      }
                      out.write("<br><br></span>\r\n                ");
                    } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,4);
              }
              out.write("\r\n            ");
            } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
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

  private static final char __oracle_jsp_text[][]=new char[11][];
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
    "\r\n\r\n    <h1>".toCharArray();
    __oracle_jsp_text[7] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    " \r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    \r\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
