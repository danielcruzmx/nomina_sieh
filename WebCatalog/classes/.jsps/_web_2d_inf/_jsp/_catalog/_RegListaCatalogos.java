package _web_2d_inf._jsp._catalog;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import gob.shcp.catalog.core.common.util.CatConstants;
import gob.shcp.catalog.core.admin.util.CatalogUtil;


public class _RegListaCatalogos extends com.orionserver.http.OrionHttpJspPage {


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
    _RegListaCatalogos page = this;
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
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_1=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag definition");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setDefinition("title");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[6]);
            {
              org.apache.struts.taglib.tiles.PutTag __jsp_taghandler_2=(org.apache.struts.taglib.tiles.PutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.PutTag.class,"org.apache.struts.taglib.tiles.PutTag name value");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setName("value");
              __jsp_taghandler_2.setValue("Cat&aacute;logos");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[7]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_3=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setAction("/administracion/RegListaCatalogos");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[9]);
            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_4=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength property size");
              __jsp_taghandler_4.setParent(__jsp_taghandler_3);
              __jsp_taghandler_4.setMaxlength("30");
              __jsp_taghandler_4.setProperty("nombre");
              __jsp_taghandler_4.setSize("30");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
            }
            out.write(__oracle_jsp_text[10]);
            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_5=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag maxlength property size");
              __jsp_taghandler_5.setParent(__jsp_taghandler_3);
              __jsp_taghandler_5.setMaxlength("50");
              __jsp_taghandler_5.setProperty("descripcionFiltro");
              __jsp_taghandler_5.setSize("50");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[11]);
            out.print(request.getContextPath() + "/administracion/RegFiltraListaCatalogos.do");
            out.write(__oracle_jsp_text[12]);
            {
              org.apache.struts.taglib.logic.NotEmptyTag __jsp_taghandler_6=(org.apache.struts.taglib.logic.NotEmptyTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEmptyTag.class,"org.apache.struts.taglib.logic.NotEmptyTag name");
              __jsp_taghandler_6.setParent(__jsp_taghandler_3);
              __jsp_taghandler_6.setName("TABLAS");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[13]);
                   String scope= "sessionScope.";
                  out.write(__oracle_jsp_text[14]);
                  {
                    org.apache.struts.taglib.logic.PresentTag __jsp_taghandler_7=(org.apache.struts.taglib.logic.PresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.PresentTag.class,"org.apache.struts.taglib.logic.PresentTag name scope");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                    __jsp_taghandler_7.setName("TABLAS");
                    __jsp_taghandler_7.setScope("request");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[15]);
                          scope= "requestScope.";
                        out.write(__oracle_jsp_text[16]);
                      } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                  }
                  out.write(__oracle_jsp_text[17]);
                  {
                    org.displaytag.tags.el.ELTableTag __jsp_taghandler_8=(org.displaytag.tags.el.ELTableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELTableTag.class,"org.displaytag.tags.el.ELTableTag name pagesize requestURI class id sort defaultsort");
                    __jsp_taghandler_8.setParent(__jsp_taghandler_6);
                    __jsp_taghandler_8.setName(scope+CatConstants.TABLAS);
                    __jsp_taghandler_8.setPagesize("20");
                    __jsp_taghandler_8.setRequestURI("/administracion/home.do");
                    __jsp_taghandler_8.setClass("displaytag");
                    __jsp_taghandler_8.setUid("rows");
                    __jsp_taghandler_8.setSort("list");
                    __jsp_taghandler_8.setDefaultsort("1");
                    __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[18]);
                        {
                          org.apache.struts.taglib.bean.DefineTag __jsp_taghandler_9=(org.apache.struts.taglib.bean.DefineTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.DefineTag.class,"org.apache.struts.taglib.bean.DefineTag id name property");
                          __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                          __jsp_taghandler_9.setId("nombre");
                          __jsp_taghandler_9.setName("rows");
                          __jsp_taghandler_9.setProperty("nombre");
                          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,4);
                        }
                        java.lang.Object nombre = null;
                        nombre = (java.lang.Object) pageContext.findAttribute("nombre");
                        out.write(__oracle_jsp_text[19]);
                        {
                          org.displaytag.tags.el.ELColumnTag __jsp_taghandler_10=(org.displaytag.tags.el.ELColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELColumnTag.class,"org.displaytag.tags.el.ELColumnTag title sortable url paramId paramProperty");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                          __jsp_taghandler_10.setTitle("Nombre");
                          __jsp_taghandler_10.setSortable("true");
                          __jsp_taghandler_10.setUrl("/administracion/RegIniciarListaRegistros.do");
                          __jsp_taghandler_10.setParamId("name");
                          __jsp_taghandler_10.setParamProperty("nombre");
                          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                            do {
                              out.write(__oracle_jsp_text[20]);
                              out.print(CatalogUtil.formatTableName(nombre.toString(), request));
                              out.write(__oracle_jsp_text[21]);
                            } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,4);
                        }
                        out.write(__oracle_jsp_text[22]);
                        {
                          org.displaytag.tags.el.ELColumnTag __jsp_taghandler_11=(org.displaytag.tags.el.ELColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELColumnTag.class,"org.displaytag.tags.el.ELColumnTag title sortable");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_8);
                          __jsp_taghandler_11.setTitle("Descripci&oacute;n");
                          __jsp_taghandler_11.setSortable("true");
                          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                            do {
                              out.write(__oracle_jsp_text[23]);
                              out.print(CatalogUtil.formatTableDescription(nombre.toString(), request));
                              out.write(__oracle_jsp_text[24]);
                            } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,4);
                        }
                        out.write(__oracle_jsp_text[25]);
                        {
                          org.displaytag.tags.el.ELSetPropertyTag __jsp_taghandler_12=(org.displaytag.tags.el.ELSetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELSetPropertyTag.class,"org.displaytag.tags.el.ELSetPropertyTag name value");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_8);
                          __jsp_taghandler_12.setName("paging.banner.placement");
                          __jsp_taghandler_12.setValue("bottom");
                          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,4);
                        }
                        out.write(__oracle_jsp_text[26]);
                      } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
                  }
                  out.write(__oracle_jsp_text[27]);
                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
            }
            out.write(__oracle_jsp_text[28]);
            {
              org.apache.struts.taglib.logic.EmptyTag __jsp_taghandler_13=(org.apache.struts.taglib.logic.EmptyTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EmptyTag.class,"org.apache.struts.taglib.logic.EmptyTag name");
              __jsp_taghandler_13.setParent(__jsp_taghandler_3);
              __jsp_taghandler_13.setName("TABLAS");
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[29]);
                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_14=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                    __jsp_taghandler_14.setKey("catalogs.empty.list");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                  }
                  out.write(__oracle_jsp_text[30]);
                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
            }
            out.write(__oracle_jsp_text[31]);
          } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[32]);

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
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n\r\n    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n        <tr>\r\n            <td width=\"6%\" class=\"\">Nombre:</td>\r\n            <td width=\"21%\" class=\"\">\r\n                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n            </td>\r\n            <td width=\"6%\" class=\"\">Descripci&oacute;n:</td>\r\n            <td width=\"17%\" class=\"\">\r\n                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"4\" align=\"right\" valign=\"middle\">\r\n                <input type=\"submit\" value=\"Buscar\" class=\"uppercase\" onclick='document.forms[0].action=\"".toCharArray();
    __oracle_jsp_text[12] = 
    "\"'/>&nbsp;\r\n            </td>\r\n\t</tr>\r\n    </table>\r\n\r\n    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n        <tr>\r\n            <td class=\"\" align=\"center\"><strong>&nbsp;Listado Maestro de Cat&aacute;logos </strong></td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n\r\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[23] = 
    " \r\n                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n        <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[30] = 
    "<br><br></span>\r\n    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
