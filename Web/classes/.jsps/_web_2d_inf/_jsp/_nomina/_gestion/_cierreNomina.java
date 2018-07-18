package _web_2d_inf._jsp._nomina._gestion;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _cierreNomina extends com.orionserver.http.OrionHttpJspPage {


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
    _cierreNomina page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("cierreNominaDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.nomina.gestion.cierre.titulo");
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
              out.write(__oracle_jsp_text[5]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_3=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setJspContext(pageContext);
                __jsp_taghandler_3.setAction("gestionNomina/cierreNomina");
                __jsp_taghandler_3.setValue("submit.cerrarNomina");
                __jsp_taghandler_3.setProgressBar("true");
                __jsp_taghandler_3.setAlertCode("confirm.nomina.cierre");
                __jsp_taghandler_3.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_3, pageContext);
              }
              out.write(__oracle_jsp_text[6]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_4=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setBeanName("listaNominasCierre");
                __jsp_taghandler_4.setBaseUrl("consultaNominasCierre");
                __jsp_taghandler_4.setMaxRows("200");
                __jsp_taghandler_4.setJspBody(new _cierreNomina_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_4, __ojsp_varRes));
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[7]);
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

  private class _cierreNomina_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _cierreNomina_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_4       = parent;
      out.write("\r\n        <div id=\"displayTagDiv\">        \r\n            ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_5=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_5.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_4));
        __jsp_taghandler_5.setName("listaNominasCierre");
        __jsp_taghandler_5.setPagesize(15);
        __jsp_taghandler_5.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_5.setClass("displaytag");
        __jsp_taghandler_5.setExport(true);
        __jsp_taghandler_5.setUid("row");
        __jsp_taghandler_5.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                \r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_6=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                __jsp_taghandler_6.setProperty("idQna");
                __jsp_taghandler_6.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.idQna");
                __jsp_taghandler_6.setSortable(true);
                __jsp_taghandler_6.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
              }
              out.write(" \r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_7=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable paramProperty style");
                __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                __jsp_taghandler_7.setProperty("qnaCaptura");
                __jsp_taghandler_7.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.qnaCaptura");
                __jsp_taghandler_7.setSortable(true);
                __jsp_taghandler_7.setParamProperty("idQna");
                __jsp_taghandler_7.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_8=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                __jsp_taghandler_8.setProperty("numComplem");
                __jsp_taghandler_8.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.numComplem");
                __jsp_taghandler_8.setSortable(true);
                __jsp_taghandler_8.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_9=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                __jsp_taghandler_9.setProperty("descripcion");
                __jsp_taghandler_9.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.desc");
                __jsp_taghandler_9.setSortable(true);
                __jsp_taghandler_9.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_10=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                __jsp_taghandler_10.setProperty("tipoNomina");
                __jsp_taghandler_10.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.tipoNomina");
                __jsp_taghandler_10.setSortable(true);
                __jsp_taghandler_10.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_11=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                __jsp_taghandler_11.setProperty("grupoPago");
                __jsp_taghandler_11.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.grupoPago");
                __jsp_taghandler_11.setSortable(true);
                __jsp_taghandler_11.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_12=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_12.setParent(__jsp_taghandler_5);
                __jsp_taghandler_12.setProperty("descEstadoNom");
                __jsp_taghandler_12.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.status");
                __jsp_taghandler_12.setSortable(true);
                __jsp_taghandler_12.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_13=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_13.setParent(__jsp_taghandler_5);
                __jsp_taghandler_13.setName("paging.banner.placement");
                __jsp_taghandler_13.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_14=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_14.setParent(__jsp_taghandler_5);
                __jsp_taghandler_14.setName("export.pdf");
                __jsp_taghandler_14.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,4);
              }
              out.write("\r\n                ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_15=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_15.setParent(__jsp_taghandler_5);
                __jsp_taghandler_15.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_15,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                    <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                        __jsp_taghandler_16.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_16.doCatch(th);
                        } finally {
                          __jsp_taghandler_16.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,5);
                      }
                      out.write("<br><br></span>\r\n                ");
                    } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
              }
              out.write("\r\n            ");
            } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
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

  private static final char __oracle_jsp_text[][]=new char[8][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[5] = 
    "</h1><br/>\r\n    \r\n    <table width=\"100%\">\r\n        <tr align=\"center\">\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n        \r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n        \r\n        function getBrowser() {\r\n            var N=navigator.appName, ua=navigator.userAgent, tem;\r\n            var M=ua.match(/(opera|chrome|safari|firefox|msie)\\/?\\s*(\\.?\\d+(\\.\\d+)*)/i);\r\n            if(M && (tem= ua.match(/version\\/([\\.\\d]+)/i))!= null) M[2]= tem[1];\r\n            M=M? [M[1], M[2]]: [N, navigator.appVersion, '-?'];\r\n            return M[0];\r\n        }\r\n        \r\n        //this code handles the F5/Ctrl+F5/Ctrl+R\r\n        document.onkeydown = checkKeycode;\r\n        function checkKeycode(e) {\r\n            var keycode;\r\n            if (window.event)\r\n                keycode = window.event.keyCode;\r\n            else if (e)\r\n                keycode = e.which;\r\n                \r\n            if (getBrowser() == 'MSIE') {\r\n                if (keycode == 116 || (window.event.ctrlKey && keycode == 82)) {\r\n                    window.event.returnValue = false;\r\n                    window.event.keyCode = 0;\r\n                    window.status = \"Refresh is disabled\";\r\n                }\r\n            } else {\r\n                if (keycode == 116 ||(e.ctrlKey && keycode == 82)) {\r\n                    if (e.preventDefault) {\r\n                        e.preventDefault();\r\n                        e.stopPropagation();\r\n                    }\r\n                }\r\n            }\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
