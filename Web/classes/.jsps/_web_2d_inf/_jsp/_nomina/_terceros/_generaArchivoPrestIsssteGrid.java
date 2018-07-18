package _web_2d_inf._jsp._nomina._terceros;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _generaArchivoPrestIsssteGrid extends com.orionserver.http.OrionHttpJspPage {


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
    _generaArchivoPrestIsssteGrid page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        _oracle._jsp._tag._filter_tag __jsp_taghandler_1=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
        __jsp_taghandler_1.setJspContext(pageContext);
        __jsp_taghandler_1.setProperty("h.hp_qna_pago");
        __jsp_taghandler_1.setCondition("=");
        __jsp_taghandler_1.setPath("hpQnaPago");
        __jsp_taghandler_1.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_1, pageContext);
      }
      out.write(__oracle_jsp_text[4]);
      {
        _oracle._jsp._tag._filter_tag __jsp_taghandler_2=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
        __jsp_taghandler_2.setJspContext(pageContext);
        __jsp_taghandler_2.setProperty("c.cpc_qna_aplica");
        __jsp_taghandler_2.setCondition("=");
        __jsp_taghandler_2.setPath("hpQnaPago");
        __jsp_taghandler_2.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_2, pageContext);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.tipoQna eq '0'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[6]);
            {
              _oracle._jsp._tag._filter_tag __jsp_taghandler_4=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
              __jsp_taghandler_4.setParent(__jsp_taghandler_3);
              __jsp_taghandler_4.setJspContext(pageContext);
              __jsp_taghandler_4.setProperty("hp_ini_pago");
              __jsp_taghandler_4.setCondition("=");
              __jsp_taghandler_4.setPath("hpIniPago");
              __jsp_taghandler_4.doTag();
              OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
            }
            out.write(__oracle_jsp_text[7]);
          } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.tipoQna eq '1'}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[9]);
            {
              _oracle._jsp._tag._filter_tag __jsp_taghandler_6=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
              __jsp_taghandler_6.setParent(__jsp_taghandler_5);
              __jsp_taghandler_6.setJspContext(pageContext);
              __jsp_taghandler_6.setProperty("hp_ini_pago");
              __jsp_taghandler_6.setCondition("<>");
              __jsp_taghandler_6.setPath("hpIniPago");
              __jsp_taghandler_6.doTag();
              OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
            }
            out.write(__oracle_jsp_text[10]);
          } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[11]);
      {
        _oracle._jsp._tag._pagedList_tag __jsp_taghandler_7=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
        __jsp_taghandler_7.setJspContext(pageContext);
        __jsp_taghandler_7.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.beanlista}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_7.setBaseUrl("tercerosNomina/generaTerceroPrestIssste.do");
        __jsp_taghandler_7.setAppendFilters("false");
        __jsp_taghandler_7.setCheckbox("true");
        __jsp_taghandler_7.setChkProperty("seleccionConsecNomina");
        __jsp_taghandler_7.setJspBody(new _generaArchivoPrestIsssteGrid_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_7, __ojsp_varRes));
        __jsp_taghandler_7.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
      }
      out.write(__oracle_jsp_text[12]);

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

  private class _generaArchivoPrestIsssteGrid_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _generaArchivoPrestIsssteGrid_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_7       = parent;
      out.write("\r\n                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_8=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort form");
        __jsp_taghandler_8.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_7));
        __jsp_taghandler_8.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.beanlista}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_8.setPagesize(100);
        __jsp_taghandler_8.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_8.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_8.setClass("displaytag");
        __jsp_taghandler_8.setExport(true);
        __jsp_taghandler_8.setUid("row");
        __jsp_taghandler_8.setSort("list");
        __jsp_taghandler_8.setForm("checkBoxTest");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
          do {
            row = (java.lang.Object) pageContext.findAttribute("row");
            row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
            out.write("\r\n                           ");
            {
              org.displaytag.tags.ColumnTag __jsp_taghandler_9=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey media style");
              __jsp_taghandler_9.setParent(__jsp_taghandler_8);
              __jsp_taghandler_9.setProperty("checkbox");
              __jsp_taghandler_9.setTitleKey("sireh.label.nomina.creaArchivoTerceros.selecciona");
              __jsp_taghandler_9.setMedia("html");
              __jsp_taghandler_9.setStyle("text-align: center");
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                 throw new javax.servlet.jsp.SkipPageException();
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
            }
            out.write("                            \r\n                            ");
            {
              org.displaytag.tags.ColumnTag __jsp_taghandler_10=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
              __jsp_taghandler_10.setParent(__jsp_taghandler_8);
              __jsp_taghandler_10.setProperty("qnaPago");
              __jsp_taghandler_10.setTitleKey("sireh.label.nomina.creaArchivoTerceros.quincenaPago");
              __jsp_taghandler_10.setSortable(false);
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                 throw new javax.servlet.jsp.SkipPageException();
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
            }
            out.write("\r\n                            ");
            {
              org.displaytag.tags.ColumnTag __jsp_taghandler_11=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
              __jsp_taghandler_11.setParent(__jsp_taghandler_8);
              __jsp_taghandler_11.setProperty("tipoNomina");
              __jsp_taghandler_11.setTitleKey("sireh.label.nomina.creaArchivoTerceros.tipoNomina");
              __jsp_taghandler_11.setSortable(false);
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                 throw new javax.servlet.jsp.SkipPageException();
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
            }
            out.write("             \r\n                            ");
            {
              org.displaytag.tags.ColumnTag __jsp_taghandler_12=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
              __jsp_taghandler_12.setParent(__jsp_taghandler_8);
              __jsp_taghandler_12.setProperty("consecNomina");
              __jsp_taghandler_12.setTitleKey("sireh.label.nomina.creaArchivoTerceros.consecutivoNomina");
              __jsp_taghandler_12.setSortable(false);
              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                 throw new javax.servlet.jsp.SkipPageException();
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
            }
            out.write("\r\n                            ");
            {
              org.displaytag.tags.ColumnTag __jsp_taghandler_13=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
              __jsp_taghandler_13.setParent(__jsp_taghandler_8);
              __jsp_taghandler_13.setProperty("numComplem");
              __jsp_taghandler_13.setTitleKey("sireh.label.nomina.creaArchivoTerceros.complemento");
              __jsp_taghandler_13.setSortable(false);
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                 throw new javax.servlet.jsp.SkipPageException();
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
            }
            out.write(" \r\n                            ");
            {
              org.displaytag.tags.ColumnTag __jsp_taghandler_14=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
              __jsp_taghandler_14.setParent(__jsp_taghandler_8);
              __jsp_taghandler_14.setProperty("gpoPago");
              __jsp_taghandler_14.setTitleKey("sireh.label.nomina.creaArchivoTerceros.grupoPago");
              __jsp_taghandler_14.setSortable(false);
              __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
              if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                 throw new javax.servlet.jsp.SkipPageException();
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
            }
            out.write("\r\n\r\n                            ");
            {
              org.displaytag.tags.SetPropertyTag __jsp_taghandler_15=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
              __jsp_taghandler_15.setParent(__jsp_taghandler_8);
              __jsp_taghandler_15.setName("paging.banner.placement");
              __jsp_taghandler_15.setValue("bottom");
              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                 throw new javax.servlet.jsp.SkipPageException();
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,3);
            }
            out.write("\r\n                            ");
            {
              org.displaytag.tags.SetPropertyTag __jsp_taghandler_16=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
              __jsp_taghandler_16.setParent(__jsp_taghandler_8);
              __jsp_taghandler_16.setName("export.pdf");
              __jsp_taghandler_16.setValue("true");
              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                 throw new javax.servlet.jsp.SkipPageException();
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,3);
            }
            out.write("\r\n                            ");
            {
              org.displaytag.tags.SetPropertyTag __jsp_taghandler_17=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
              __jsp_taghandler_17.setParent(__jsp_taghandler_8);
              __jsp_taghandler_17.setName("basic.msg.empty_list");
              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                do {
                  out.write("\r\n                                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                  {
                    org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                    __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                    __jsp_taghandler_18.setCode("pagedList.empty.content");
                    try {
                      __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                      if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                    } catch (Throwable th) {
                      __jsp_taghandler_18.doCatch(th);
                    } finally {
                      __jsp_taghandler_18.doFinally();
                    }
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
                  }
                  out.write("<br><br></span>\r\n                            ");
                } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                 throw new javax.servlet.jsp.SkipPageException();
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,3);
            }
            out.write("\r\n                        ");
          } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
      }
      out.write("\r\n                    ");
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

  private static final char __oracle_jsp_text[][]=new char[13][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n\r\n\r\n\r\n                <div id=\"dataTable\" align=\"center\" style=\"width: 1000px; overflow: auto;\">\r\n                    ".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[7] = 
    "    \r\n                    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                </div>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
