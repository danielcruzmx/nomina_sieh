package _web_2d_inf._jsp._configuracion._mantenimiento._plantillas;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _listaPlantillaClc extends com.orionserver.http.OrionHttpJspPage {


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
    _listaPlantillaClc page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute method");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("plantillaDTO");
        __jsp_taghandler_1.setMethod("post");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.configuracion.manto.plantilla.clc.titulo");
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
                __jsp_taghandler_3.setCode("sireh.label.configuracion.manto.plantillas.clc.opcion");
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
                org.displaytag.tags.TableTag __jsp_taghandler_4=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class id sort");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setName("plantillaDTO.listaFile");
                __jsp_taghandler_4.setPagesize(10);
                __jsp_taghandler_4.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_4.setClass("displaytag");
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
                      out.write(__oracle_jsp_text[8]);
                      {
                        org.displaytag.tags.ColumnTag __jsp_taghandler_5=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey href paramId");
                        __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                        __jsp_taghandler_5.setProperty("valor");
                        __jsp_taghandler_5.setTitleKey("sireh.label.configuracion.manto.plantillas.clc.plantilla");
                        __jsp_taghandler_5.setHref("/sireh/mantenimientoPlantillaClc/getFilePlantillaClc.do");
                        __jsp_taghandler_5.setParamId("nameFile");
                        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                        {
                          try {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                            do {
                              out.write(__oracle_jsp_text[9]);
                              {
                                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                                __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                                __jsp_taghandler_6.setCode("edit.gif");
                                try {
                                  __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                                  if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                } catch (Throwable th) {
                                  __jsp_taghandler_6.doCatch(th);
                                } finally {
                                  __jsp_taghandler_6.doFinally();
                                }
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                              }
                              out.write(__oracle_jsp_text[10]);
                              {
                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                                __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.valor}",java.lang.Object.class, __ojsp_varRes,null));
                                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,4);
                              }
                              out.write(__oracle_jsp_text[11]);
                            } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          finally {
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                        }
                        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                      }
                      out.write(__oracle_jsp_text[12]);
                      {
                        org.displaytag.tags.ColumnTag __jsp_taghandler_8=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey");
                        __jsp_taghandler_8.setParent(__jsp_taghandler_4);
                        __jsp_taghandler_8.setTitleKey("sireh.label.configuracion.manto.plantillas.clc.plantilla.eliminar");
                        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                        {
                          try {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                            do {
                              out.write(__oracle_jsp_text[13]);
                              {
                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                                __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.valor}",java.lang.Object.class, __ojsp_varRes,null));
                                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,4);
                              }
                              out.write(__oracle_jsp_text[14]);
                              {
                                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                                __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                                __jsp_taghandler_10.setCode("delete.gif");
                                try {
                                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                } catch (Throwable th) {
                                  __jsp_taghandler_10.doCatch(th);
                                } finally {
                                  __jsp_taghandler_10.doFinally();
                                }
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,4);
                              }
                              out.write(__oracle_jsp_text[15]);
                            } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          finally {
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                        }
                        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
                      }
                      out.write(__oracle_jsp_text[16]);
                      {
                        org.displaytag.tags.SetPropertyTag __jsp_taghandler_11=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                        __jsp_taghandler_11.setParent(__jsp_taghandler_4);
                        __jsp_taghandler_11.setName("paging.banner.placement");
                        __jsp_taghandler_11.setValue("bottom");
                        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                      }
                      out.write(__oracle_jsp_text[17]);
                      {
                        org.displaytag.tags.SetPropertyTag __jsp_taghandler_12=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                        __jsp_taghandler_12.setParent(__jsp_taghandler_4);
                        __jsp_taghandler_12.setName("export.pdf");
                        __jsp_taghandler_12.setValue("true");
                        __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                        if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                      }
                      out.write(__oracle_jsp_text[18]);
                      {
                        org.displaytag.tags.SetPropertyTag __jsp_taghandler_13=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                        __jsp_taghandler_13.setParent(__jsp_taghandler_4);
                        __jsp_taghandler_13.setName("basic.msg.empty_list");
                        __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                        {
                          try {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
                            do {
                              out.write(__oracle_jsp_text[19]);
                              {
                                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                                __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                                __jsp_taghandler_14.setCode("pagedList.empty.content");
                                try {
                                  __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                                  if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                } catch (Throwable th) {
                                  __jsp_taghandler_14.doCatch(th);
                                } finally {
                                  __jsp_taghandler_14.doFinally();
                                }
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,4);
                              }
                              out.write(__oracle_jsp_text[20]);
                            } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          finally {
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                        }
                        if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                      }
                      out.write(__oracle_jsp_text[21]);
                    } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_15=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setAction("mantenimientoPlantillaClc/altaPlantilla");
                __jsp_taghandler_15.setValue("submit.create");
                __jsp_taghandler_15.setProgressBar("true");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
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
  private static final char __oracle_jsp_text[][]=new char[24][];
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
    "\r\n<script type=\"text/javascript\">\r\n    function eliminar(valor) {\r\n        var action =\"/sireh/mantenimientoPlantillaClc/eliminarPlantilla.do?nameFile=\"+valor;\r\n        document.forms[0].action = action;\r\n        var r = confirm(\"Esta seguro de eliminar la plantilla \" + valor);\r\n        \r\n        if (r == true) {\r\n            document.forms[0].submit();\r\n        } else {\r\n            return false;\r\n        }\r\n    }\r\n</script>\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    <h1>\r\n        <strong>\r\n            ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    " \r\n        </strong>\r\n    </h1>\r\n    <p>&nbsp;</p>\r\n    <table align=\"center\">\r\n        <tr>\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                        <img align=\"center\" src=\"".toCharArray();
    __oracle_jsp_text[10] = 
    "\" alt=\"Editar\" width=\"18\" height=\"18\"/>".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "                              \r\n                    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                        <a href=\"#\" onclick=\"javascript:eliminar('".toCharArray();
    __oracle_jsp_text[14] = 
    "')\">\r\n                            <img align=\"center\" src=\"".toCharArray();
    __oracle_jsp_text[15] = 
    "\" alt=\"Delete\" width=\"18\" height=\"18\"/>\r\n                        </a>\r\n                    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                    \r\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                        <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[20] = 
    "<br><br></span>\r\n                    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table> \r\n    <table width=\"100%\">\r\n        <tr align=\"right\">\r\n            <td>".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n        </tr>\r\n    </table>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
