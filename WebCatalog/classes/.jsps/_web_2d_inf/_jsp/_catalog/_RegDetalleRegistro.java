package _web_2d_inf._jsp._catalog;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;
import gob.shcp.catalog.core.common.util.CatConstants;
import gob.shcp.catalog.core.common.util.CatalogConstants;
import gob.shcp.catalog.core.admin.util.CatalogUtil;


public class _RegDetalleRegistro extends com.orionserver.http.OrionHttpJspPage {


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
    _RegDetalleRegistro page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.struts.taglib.bean.DefineTag __jsp_taghandler_1=(org.apache.struts.taglib.bean.DefineTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.DefineTag.class,"org.apache.struts.taglib.bean.DefineTag id name type");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("catName");
        __jsp_taghandler_1.setName(OracleJspRuntime.toStr( CatConstants.CATALOG_NAME));
        __jsp_taghandler_1.setType("String");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      String catName = null;
      catName = (String) pageContext.findAttribute("catName");
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_2=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag definition");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setDefinition("title");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[6]);
            {
              org.apache.struts.taglib.tiles.PutTag __jsp_taghandler_3=(org.apache.struts.taglib.tiles.PutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.PutTag.class,"org.apache.struts.taglib.tiles.PutTag name value");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_taghandler_3.setName("value");
              __jsp_taghandler_3.setValue("&nbsp;Detalle Elemento del Cat&aacute;logo&nbsp;");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[7]);
            {
              org.apache.struts.taglib.tiles.PutTag __jsp_taghandler_4=(org.apache.struts.taglib.tiles.PutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.PutTag.class,"org.apache.struts.taglib.tiles.PutTag name value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_2);
              __jsp_taghandler_4.setName("name");
              __jsp_taghandler_4.setValue(CatalogUtil.formatTableName(catName,request));
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
            }
            out.write(__oracle_jsp_text[8]);
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_5=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setAction("/administracion/RegEliminarRegistros");
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[10]);
            {
              org.apache.struts.taglib.bean.DefineTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.DefineTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.DefineTag.class,"org.apache.struts.taglib.bean.DefineTag id name type");
              __jsp_taghandler_6.setParent(__jsp_taghandler_5);
              __jsp_taghandler_6.setId("insertarRegistroform");
              __jsp_taghandler_6.setName("RegInsertarRegistroForm");
              __jsp_taghandler_6.setType("gob.shcp.catalog.core.admin.form.RegInsertarRegistroForm");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
            }
            gob.shcp.catalog.core.admin.form.RegInsertarRegistroForm insertarRegistroform = null;
            insertarRegistroform = (gob.shcp.catalog.core.admin.form.RegInsertarRegistroForm) pageContext.findAttribute("insertarRegistroform");
            out.write(__oracle_jsp_text[11]);
            {
              org.apache.struts.taglib.bean.DefineTag __jsp_taghandler_7=(org.apache.struts.taglib.bean.DefineTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.DefineTag.class,"org.apache.struts.taglib.bean.DefineTag id value");
              __jsp_taghandler_7.setParent(__jsp_taghandler_5);
              __jsp_taghandler_7.setId("styleClass");
              __jsp_taghandler_7.setValue("");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
            }
            java.lang.String styleClass = null;
            styleClass = (java.lang.String) pageContext.findAttribute("styleClass");
            out.write(__oracle_jsp_text[12]);
            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_8=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id indexId name property type");
              __jsp_taghandler_8.setParent(__jsp_taghandler_5);
              __jsp_taghandler_8.setId("fieldValue");
              __jsp_taghandler_8.setIndexId("i");
              __jsp_taghandler_8.setName("insertarRegistroform");
              __jsp_taghandler_8.setProperty("fieldValue");
              __jsp_taghandler_8.setType("gob.shcp.catalog.core.common.util.RegistroVO");
              gob.shcp.catalog.core.common.util.RegistroVO fieldValue = null;
              java.lang.Integer i = null;
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                do {
                  fieldValue = (gob.shcp.catalog.core.common.util.RegistroVO) pageContext.findAttribute("fieldValue");
                  i = (java.lang.Integer) pageContext.findAttribute("i");
                  out.write(__oracle_jsp_text[13]);
                  if(i.intValue()%2==0){
                                  styleClass = "";
                              }else{
                                  styleClass = "";
                              }
                  out.write(__oracle_jsp_text[14]);
                  out.print(styleClass);
                  out.write(__oracle_jsp_text[15]);
                  out.print(styleClass);
                  out.write(__oracle_jsp_text[16]);
                  out.print(CatalogUtil.formatColumnName(catName+"."+fieldValue.getNombre(),request));
                  out.write(__oracle_jsp_text[17]);
                  out.print(styleClass);
                  out.write(__oracle_jsp_text[18]);
                  if( CatalogUtil.isTextArea(fieldValue)){
                  out.write(__oracle_jsp_text[19]);
                  {
                    org.apache.struts.taglib.html.TextareaTag __jsp_taghandler_9=(org.apache.struts.taglib.html.TextareaTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextareaTag.class,"org.apache.struts.taglib.html.TextareaTag cols indexed name property readonly rows styleClass");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                    __jsp_taghandler_9.setCols(OracleJspRuntime.toStr( CatalogUtil.MAX_LENGTH_TEXTFIELD));
                    __jsp_taghandler_9.setIndexed(true);
                    __jsp_taghandler_9.setName("fieldValue");
                    __jsp_taghandler_9.setProperty("valor");
                    __jsp_taghandler_9.setReadonly(true);
                    __jsp_taghandler_9.setRows(OracleJspRuntime.toStr( CatalogUtil.getRowsTextArea(fieldValue)));
                    __jsp_taghandler_9.setStyleClass(OracleJspRuntime.toStr( styleClass));
                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                  }
                  out.write(__oracle_jsp_text[20]);
                  }else{
                  out.write(__oracle_jsp_text[21]);
                  if(fieldValue.getCampoComplejo() == null){
                  out.write(__oracle_jsp_text[22]);
                  out.print(fieldValue.getValor());
                  out.write(__oracle_jsp_text[23]);
                  }else{
                                              if(fieldValue.getCampoComplejo().isMostrarId()){
                  out.write(__oracle_jsp_text[24]);
                  out.print(fieldValue.getValor());
                  out.write(__oracle_jsp_text[25]);
                  out.print(fieldValue.getValorForaneo());
                  out.write(__oracle_jsp_text[26]);
                  }else{
                  out.write(__oracle_jsp_text[27]);
                  out.print(fieldValue.getValorForaneo());
                  out.write(__oracle_jsp_text[28]);
                  }
                                          }
                  out.write(__oracle_jsp_text[29]);
                  }
                  out.write(__oracle_jsp_text[30]);
                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
            }
            out.write(__oracle_jsp_text[31]);
            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_10=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_10.setParent(__jsp_taghandler_5);
              __jsp_taghandler_10.setName(OracleJspRuntime.toStr( CatConstants.RIGHTS));
              __jsp_taghandler_10.setProperty("update");
              __jsp_taghandler_10.setValue("true");
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[32]);
                  out.print(request.getContextPath() + "/administracion/RegIniciarEditarRegistros.do");
                  out.write(__oracle_jsp_text[33]);
                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
            }
            out.write(__oracle_jsp_text[34]);
            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_11=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_11.setParent(__jsp_taghandler_5);
              __jsp_taghandler_11.setName(OracleJspRuntime.toStr( CatConstants.RIGHTS));
              __jsp_taghandler_11.setProperty("delete");
              __jsp_taghandler_11.setValue("true");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[35]);
                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
            }
            out.write(__oracle_jsp_text[36]);
            out.print(request.getContextPath() + "/administracion/RegIniciarListaRegistros.do");
            out.write(__oracle_jsp_text[37]);
          } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[38]);

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
  private static final char __oracle_jsp_text[][]=new char[39][];
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
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    <table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"MarcoAzul\">\r\n        ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n            <tr class=\"".toCharArray();
    __oracle_jsp_text[15] = 
    "\" height=\"22\"> \r\n                <td height=\"20\" align=\"left\" width=\"20%\" class=\"".toCharArray();
    __oracle_jsp_text[16] = 
    "\">&nbsp;".toCharArray();
    __oracle_jsp_text[17] = 
    "&nbsp;</td>\r\n                <td align=\"left\" width=\"80%\" class=\"".toCharArray();
    __oracle_jsp_text[18] = 
    "\">&nbsp;\r\n    \r\n                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    " - ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                </td>        \r\n            </tr>\r\n        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n        <tr height=\"22\"> \r\n            <td colspan=\"4\">\r\n                ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                    <input type=\"button\" name=\"action\" value=\"Editar\" class=\"uppercase\" onclick='window.location=\"".toCharArray();
    __oracle_jsp_text[33] = 
    "\"' >&nbsp;\r\n                ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                    <input type=\"submit\" value=\"Eliminar\" name=\"action\" class=\"uppercase\" onclick=\"javascript:return confirm('Esta seguro que desea eliminar el registro?');\">&nbsp;\r\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                <input type=\"button\" name=\"btnListar\" value=\"Regresar\" onclick='window.location=\"".toCharArray();
    __oracle_jsp_text[37] = 
    "\"' class=\"uppercase\">\r\n            </td>\r\n        </tr>\r\n    </table>\r\n".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
