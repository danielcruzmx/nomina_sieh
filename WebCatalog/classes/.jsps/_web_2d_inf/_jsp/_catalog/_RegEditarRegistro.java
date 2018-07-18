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
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;


public class _RegEditarRegistro extends com.orionserver.http.OrionHttpJspPage {


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
    _RegEditarRegistro page = this;
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
      ArrayList nombresCamposForaneos = new ArrayList();
      out.write(__oracle_jsp_text[7]);
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
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_2=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag definition");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setDefinition("title");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[9]);
            {
              org.apache.struts.taglib.tiles.PutTag __jsp_taghandler_3=(org.apache.struts.taglib.tiles.PutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.PutTag.class,"org.apache.struts.taglib.tiles.PutTag name value");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_taghandler_3.setName("value");
              __jsp_taghandler_3.setValue("&nbsp;Editar Elemento en Cat&aacute;logo&nbsp;");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[10]);
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
            out.write(__oracle_jsp_text[11]);
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[12]);
      {
        org.apache.struts.taglib.bean.DefineTag __jsp_taghandler_5=(org.apache.struts.taglib.bean.DefineTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.DefineTag.class,"org.apache.struts.taglib.bean.DefineTag id value");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setId("action");
        __jsp_taghandler_5.setValue(OracleJspRuntime.toStr( CatConstants.STR_UPDATE));
        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      java.lang.String action = null;
      action = (java.lang.String) pageContext.findAttribute("action");
      out.write(__oracle_jsp_text[13]);
      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_6=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setAction("/administracion/RegEditarRegistros");
        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[14]);
            {
              org.apache.struts.taglib.bean.DefineTag __jsp_taghandler_7=(org.apache.struts.taglib.bean.DefineTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.DefineTag.class,"org.apache.struts.taglib.bean.DefineTag id value");
              __jsp_taghandler_7.setParent(__jsp_taghandler_6);
              __jsp_taghandler_7.setId("styleClass");
              __jsp_taghandler_7.setValue("");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
            }
            java.lang.String styleClass = null;
            styleClass = (java.lang.String) pageContext.findAttribute("styleClass");
            out.write(__oracle_jsp_text[15]);
            {
              org.apache.struts.taglib.bean.DefineTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.DefineTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.DefineTag.class,"org.apache.struts.taglib.bean.DefineTag id value");
              __jsp_taghandler_8.setParent(__jsp_taghandler_6);
              __jsp_taghandler_8.setId("Class");
              __jsp_taghandler_8.setValue("");
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
            }
            java.lang.String Class = null;
            Class = (java.lang.String) pageContext.findAttribute("Class");
            out.write(__oracle_jsp_text[16]);
            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_9=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id indexId name property type");
              __jsp_taghandler_9.setParent(__jsp_taghandler_6);
              __jsp_taghandler_9.setId("fieldValue");
              __jsp_taghandler_9.setIndexId("i");
              __jsp_taghandler_9.setName("RegInsertarRegistroForm");
              __jsp_taghandler_9.setProperty("fieldValue");
              __jsp_taghandler_9.setType("gob.shcp.catalog.core.common.util.RegistroVO");
              gob.shcp.catalog.core.common.util.RegistroVO fieldValue = null;
              java.lang.Integer i = null;
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                do {
                  fieldValue = (gob.shcp.catalog.core.common.util.RegistroVO) pageContext.findAttribute("fieldValue");
                  i = (java.lang.Integer) pageContext.findAttribute("i");
                  out.write(__oracle_jsp_text[17]);
                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_10=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property scope value");
                    __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                    __jsp_taghandler_10.setName(OracleJspRuntime.toStr( CatConstants.DESC_TABLA));
                    __jsp_taghandler_10.setProperty("hasSequence");
                    __jsp_taghandler_10.setScope("session");
                    __jsp_taghandler_10.setValue("true");
                    __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[18]);
                        {
                          org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_11=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name property value");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                          __jsp_taghandler_11.setName("fieldValue");
                          __jsp_taghandler_11.setProperty("tipoLlave");
                          __jsp_taghandler_11.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.TP_ID_REGISTRO)));
                          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              out.write(__oracle_jsp_text[19]);
                              request.setAttribute("visible","true");
                              out.write(__oracle_jsp_text[20]);
                            } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,4);
                        }
                        out.write(__oracle_jsp_text[21]);
                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_12=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                          __jsp_taghandler_12.setName("fieldValue");
                          __jsp_taghandler_12.setProperty("tipoLlave");
                          __jsp_taghandler_12.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.TP_ID_REGISTRO)));
                          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              out.write(__oracle_jsp_text[22]);
                              request.setAttribute("visible","false");
                              out.write(__oracle_jsp_text[23]);
                            } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,4);
                        }
                        out.write(__oracle_jsp_text[24]);
                      } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
                  }
                  out.write(__oracle_jsp_text[25]);
                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_13=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property scope value");
                    __jsp_taghandler_13.setParent(__jsp_taghandler_9);
                    __jsp_taghandler_13.setName(OracleJspRuntime.toStr( CatConstants.DESC_TABLA));
                    __jsp_taghandler_13.setProperty("hasSequence");
                    __jsp_taghandler_13.setScope("session");
                    __jsp_taghandler_13.setValue("false");
                    __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[26]);
                        request.setAttribute("visible","true");
                        out.write(__oracle_jsp_text[27]);
                      } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                  }
                  out.write(__oracle_jsp_text[28]);
                  {
                    org.apache.struts.taglib.logic.NotEmptyTag __jsp_taghandler_14=(org.apache.struts.taglib.logic.NotEmptyTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEmptyTag.class,"org.apache.struts.taglib.logic.NotEmptyTag name property");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_9);
                    __jsp_taghandler_14.setName("fieldValue");
                    __jsp_taghandler_14.setProperty("campoComplejo");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[29]);
                        {
                          org.apache.struts.taglib.bean.DefineTag __jsp_taghandler_15=(org.apache.struts.taglib.bean.DefineTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.DefineTag.class,"org.apache.struts.taglib.bean.DefineTag id name property");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                          __jsp_taghandler_15.setId("campoComplejo");
                          __jsp_taghandler_15.setName("fieldValue");
                          __jsp_taghandler_15.setProperty("campoComplejo");
                          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
                        }
                        java.lang.Object campoComplejo = null;
                        campoComplejo = (java.lang.Object) pageContext.findAttribute("campoComplejo");
                        out.write(__oracle_jsp_text[30]);
                      } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                  }
                  out.write(__oracle_jsp_text[31]);
                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_16=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name value");
                    __jsp_taghandler_16.setParent(__jsp_taghandler_9);
                    __jsp_taghandler_16.setName("visible");
                    __jsp_taghandler_16.setValue("true");
                    __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[32]);
                        if(i.intValue()%2==0){
                                            styleClass = "";
                                            Class = "";
                                        }else{
                                            styleClass = "";
                                            Class = "";
                                        }
                        out.write(__oracle_jsp_text[33]);
                        out.print(Class);
                        out.write(__oracle_jsp_text[34]);
                        {
                          org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_17=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                          __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                          __jsp_taghandler_17.setName("fieldValue");
                          __jsp_taghandler_17.setProperty("esNotNull");
                          __jsp_taghandler_17.setValue("true");
                          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              out.write(__oracle_jsp_text[35]);
                            } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,4);
                        }
                        out.write(__oracle_jsp_text[36]);
                        out.print(CatalogUtil.formatColumnName(catName+"."+fieldValue.getNombre(),request));
                        out.write(__oracle_jsp_text[37]);
                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_18=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag indexed name property");
                          __jsp_taghandler_18.setParent(__jsp_taghandler_16);
                          __jsp_taghandler_18.setIndexed(true);
                          __jsp_taghandler_18.setName("fieldValue");
                          __jsp_taghandler_18.setProperty("nombre");
                          __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                          if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
                        }
                        out.write(__oracle_jsp_text[38]);
                        out.print(Class);
                        out.write(__oracle_jsp_text[39]);
                        {
                          org.apache.struts.taglib.logic.NotEmptyTag __jsp_taghandler_19=(org.apache.struts.taglib.logic.NotEmptyTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEmptyTag.class,"org.apache.struts.taglib.logic.NotEmptyTag name property");
                          __jsp_taghandler_19.setParent(__jsp_taghandler_16);
                          __jsp_taghandler_19.setName("fieldValue");
                          __jsp_taghandler_19.setProperty("campoComplejo");
                          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              out.write(__oracle_jsp_text[40]);
                              if(fieldValue.getCampoComplejo().isMostrarId()){
                              out.write(__oracle_jsp_text[41]);
                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_20=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag indexed maxlength name property readonly size styleClass");
                                __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                                __jsp_taghandler_20.setIndexed(true);
                                __jsp_taghandler_20.setMaxlength(OracleJspRuntime.toStr( fieldValue.getSize().toString()));
                                __jsp_taghandler_20.setName("fieldValue");
                                __jsp_taghandler_20.setProperty("valor");
                                __jsp_taghandler_20.setReadonly(true);
                                __jsp_taghandler_20.setSize(OracleJspRuntime.toStr( CatalogUtil.getSize(fieldValue)));
                                __jsp_taghandler_20.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,5);
                              }
                              out.write(__oracle_jsp_text[42]);
                              }else{
                              out.write(__oracle_jsp_text[43]);
                              {
                                org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_21=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag indexed name property");
                                __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                                __jsp_taghandler_21.setIndexed(true);
                                __jsp_taghandler_21.setName("fieldValue");
                                __jsp_taghandler_21.setProperty("valor");
                                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,5);
                              }
                              out.write(__oracle_jsp_text[44]);
                              }
                                                          
                                                          if(fieldValue.isEditable(action)) {
                                                              gob.shcp.catalog.core.common.dto.CampoComplejoVO cc = fieldValue.getCampoComplejo();
                                                              StringBuilder fields = new StringBuilder("");
                                                              int inverse = i.intValue();
                                                              for(int ind=0; ind<cc.getCampos().size(); ind++) {
                                                                  nombresCamposForaneos.add(cc.getNombreCampo(ind));                            
                                                                  fields.append(cc.getNombreCampoForaneo(ind)).append(":fieldValue[").append(inverse).append("].valor,");
                                                                  inverse--;
                                                              }
                                                              if(cc.getCampoDespliegue()!=null){
                                                                  for(int ind=0; ind<cc.getCamposDespliegue().size(); ind++) {                                
                                                                      if(ind == 0){
                                                                          fields.append(cc.getCamposDespliegue().get(ind)).append(":fieldValue[").append(i).append("].valorForaneo,");
                                                                      }else{
                                                                          fields.append(cc.getCamposDespliegue().get(ind)).append(",");
                                                                      }  
                                                                  }                        
                                                              }
                                                              
                                                              String fechaIniNombre = (String)request.getAttribute("fechaIniNombre");
                                                              String fechaFinNombre = (String)request.getAttribute("fechaFinNombre");
                                                              
                                                              String filters = "";
                                                              if(fechaIniNombre == null && fechaFinNombre == null){
                                                                  filters = cc.getFiltersHelpRoutine();
                                                              }else{
                                                                  String pkFieldName = (String)request.getAttribute("pkFieldName");
                                                                  String pkFieldValue = (String)request.getAttribute("pkFieldValue");                            
                                                                  
                                                                  Map fechas = CatalogUtil.getHelpRoutineDateValues(catName, pkFieldName, pkFieldValue, fechaIniNombre, fechaFinNombre, cc);
                                                                  filters = cc.getFiltersHelpRoutine(fechas);
                                                              }
                              out.write(__oracle_jsp_text[45]);
                              out.print(fieldValue.getNombre());
                              out.write(__oracle_jsp_text[46]);
                              out.print(fieldValue.getNombre());
                              out.write(__oracle_jsp_text[47]);
                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_22=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                                __jsp_taghandler_22.setName("campoComplejo");
                                __jsp_taghandler_22.setProperty("tablaForanea");
                                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,5);
                              }
                              out.write(__oracle_jsp_text[48]);
                              out.print(fields);
                              out.write(__oracle_jsp_text[49]);
                              out.print(filters);
                              out.write(__oracle_jsp_text[50]);
                              {
                                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                                __jsp_taghandler_23.setParent(__jsp_taghandler_19);
                                __jsp_taghandler_23.setCode("help.gif");
                                try {
                                  __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                                  if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                } catch (Throwable th) {
                                  __jsp_taghandler_23.doCatch(th);
                                } finally {
                                  __jsp_taghandler_23.doFinally();
                                }
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,5);
                              }
                              out.write(__oracle_jsp_text[51]);
                              out.print(fieldValue.getNombre());
                              out.write(__oracle_jsp_text[52]);
                              out.print(fieldValue.getNombre());
                              out.write(__oracle_jsp_text[53]);
                              {
                                org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_24=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                __jsp_taghandler_24.setParent(__jsp_taghandler_19);
                                __jsp_taghandler_24.setName("campoComplejo");
                                __jsp_taghandler_24.setProperty("tablaForanea");
                                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,5);
                              }
                              out.write(__oracle_jsp_text[54]);
                              out.print(fieldValue.getNombre());
                              out.write(__oracle_jsp_text[55]);
                              out.print(fieldValue.getNombre());
                              out.write(__oracle_jsp_text[56]);
                              out.print(fieldValue.getNombre());
                              out.write(__oracle_jsp_text[57]);
                              out.print(fieldValue.getNombre());
                              out.write(__oracle_jsp_text[58]);
                              out.print(fieldValue.getNombre());
                              out.write(__oracle_jsp_text[59]);
                               if(cc.getCampoDespliegue()!=null){
                              out.write(__oracle_jsp_text[60]);
                              {
                                org.apache.struts.taglib.html.TextTag __jsp_taghandler_25=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag indexed maxlength name property readonly size styleClass");
                                __jsp_taghandler_25.setParent(__jsp_taghandler_19);
                                __jsp_taghandler_25.setIndexed(true);
                                __jsp_taghandler_25.setMaxlength("40");
                                __jsp_taghandler_25.setName("fieldValue");
                                __jsp_taghandler_25.setProperty("valorForaneo");
                                __jsp_taghandler_25.setReadonly(true);
                                __jsp_taghandler_25.setSize("40");
                                __jsp_taghandler_25.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,5);
                              }
                              out.write(__oracle_jsp_text[61]);
                              } 
                                                          }
                              out.write(__oracle_jsp_text[62]);
                            } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,4);
                        }
                        out.write(__oracle_jsp_text[63]);
                        {
                          org.apache.struts.taglib.logic.EmptyTag __jsp_taghandler_26=(org.apache.struts.taglib.logic.EmptyTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EmptyTag.class,"org.apache.struts.taglib.logic.EmptyTag name property");
                          __jsp_taghandler_26.setParent(__jsp_taghandler_16);
                          __jsp_taghandler_26.setName("fieldValue");
                          __jsp_taghandler_26.setProperty("campoComplejo");
                          __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            do {
                              out.write(__oracle_jsp_text[64]);
                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_27=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                                __jsp_taghandler_27.setName("fieldValue");
                                __jsp_taghandler_27.setProperty("tipoPropiedad");
                                __jsp_taghandler_27.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.JAVA_LANG_STRING)));
                                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[65]);
                                    if( CatalogUtil.isTextArea(fieldValue)){
                                    out.write(__oracle_jsp_text[66]);
                                    String callFunction = "validateLength(this,"+fieldValue.getSize()+" )"; 
                                    out.write(__oracle_jsp_text[67]);
                                    {
                                      org.apache.struts.taglib.html.TextareaTag __jsp_taghandler_28=(org.apache.struts.taglib.html.TextareaTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextareaTag.class,"org.apache.struts.taglib.html.TextareaTag cols disabled indexed name onkeyup property rows styleClass");
                                      __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                                      __jsp_taghandler_28.setCols(OracleJspRuntime.toStr( CatalogUtil.MAX_LENGTH_TEXTFIELD));
                                      __jsp_taghandler_28.setDisabled(OracleJspRuntime.toBoolean( !fieldValue.isEditable(action)));
                                      __jsp_taghandler_28.setIndexed(true);
                                      __jsp_taghandler_28.setName("fieldValue");
                                      __jsp_taghandler_28.setOnkeyup(OracleJspRuntime.toStr( callFunction));
                                      __jsp_taghandler_28.setProperty("valor");
                                      __jsp_taghandler_28.setRows(OracleJspRuntime.toStr( CatalogUtil.getRowsTextArea(fieldValue)));
                                      __jsp_taghandler_28.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                      __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                                      if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,6);
                                    }
                                    out.write(__oracle_jsp_text[68]);
                                    }else{
                                    out.write(__oracle_jsp_text[69]);
                                    {
                                      org.apache.struts.taglib.html.TextTag __jsp_taghandler_29=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag disabled indexed maxlength name property size styleClass");
                                      __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                                      __jsp_taghandler_29.setDisabled(OracleJspRuntime.toBoolean( !fieldValue.isEditable(action)));
                                      __jsp_taghandler_29.setIndexed(true);
                                      __jsp_taghandler_29.setMaxlength(OracleJspRuntime.toStr( fieldValue.getSize().toString()));
                                      __jsp_taghandler_29.setName("fieldValue");
                                      __jsp_taghandler_29.setProperty("valor");
                                      __jsp_taghandler_29.setSize(OracleJspRuntime.toStr( CatalogUtil.getSize(fieldValue)));
                                      __jsp_taghandler_29.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                      __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                                      if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,6);
                                    }
                                    out.write(__oracle_jsp_text[70]);
                                    }
                                    out.write(__oracle_jsp_text[71]);
                                  } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,5);
                              }
                              out.write(__oracle_jsp_text[72]);
                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_30=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_30.setParent(__jsp_taghandler_26);
                                __jsp_taghandler_30.setName("fieldValue");
                                __jsp_taghandler_30.setProperty("tipoPropiedad");
                                __jsp_taghandler_30.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.JAVA_UTIL_DATE)));
                                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[73]);
                                    if(fieldValue.isEditable(action)){
                                    out.write(__oracle_jsp_text[74]);
                                    {
                                      org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_31=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag indexed name property");
                                      __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                                      __jsp_taghandler_31.setIndexed(true);
                                      __jsp_taghandler_31.setName("fieldValue");
                                      __jsp_taghandler_31.setProperty("valor");
                                      __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                                      if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,6);
                                    }
                                    out.write(__oracle_jsp_text[75]);
                                    out.print(fieldValue.getSize().toString());
                                    out.write(__oracle_jsp_text[76]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[77]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[78]);
                                    out.print(new Integer(fieldValue.getSize()+2).toString());
                                    out.write(__oracle_jsp_text[79]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[80]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[81]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[82]);
                                    {
                                      org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                                      __jsp_taghandler_32.setParent(__jsp_taghandler_30);
                                      __jsp_taghandler_32.setCode("background.gif");
                                      try {
                                        __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                                        if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                      } catch (Throwable th) {
                                        __jsp_taghandler_32.doCatch(th);
                                      } finally {
                                        __jsp_taghandler_32.doFinally();
                                      }
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,6);
                                    }
                                    out.write(__oracle_jsp_text[83]);
                                     if(fieldValue.getFormat().length() > 10 ){ 
                                    out.write(__oracle_jsp_text[84]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[85]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[86]);
                                    }else{
                                    out.write(__oracle_jsp_text[87]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[88]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[89]);
                                    }
                                    out.write(__oracle_jsp_text[90]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[91]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[92]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[93]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[94]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[95]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[96]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[97]);
                                    {
                                      org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                                      __jsp_taghandler_33.setParent(__jsp_taghandler_30);
                                      __jsp_taghandler_33.setCode("clear.gif");
                                      try {
                                        __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                                        if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                      } catch (Throwable th) {
                                        __jsp_taghandler_33.doCatch(th);
                                      } finally {
                                        __jsp_taghandler_33.doFinally();
                                      }
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,6);
                                    }
                                    out.write(__oracle_jsp_text[98]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[99]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[100]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[101]);
                                    } else {
                                    out.write(__oracle_jsp_text[102]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[103]);
                                    out.print(i);
                                    out.write(__oracle_jsp_text[104]);
                                    out.print(fieldValue.getValor());
                                    out.write(__oracle_jsp_text[105]);
                                    }
                                    out.write(__oracle_jsp_text[106]);
                                  } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,5);
                              }
                              out.write(__oracle_jsp_text[107]);
                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_34=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_34.setParent(__jsp_taghandler_26);
                                __jsp_taghandler_34.setName("fieldValue");
                                __jsp_taghandler_34.setProperty("tipoPropiedad");
                                __jsp_taghandler_34.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.JAVA_MATH_BIGDECIMAL)));
                                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[108]);
                                    {
                                      org.apache.struts.taglib.html.TextTag __jsp_taghandler_35=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag disabled indexed maxlength name property size styleClass");
                                      __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                                      __jsp_taghandler_35.setDisabled(OracleJspRuntime.toBoolean( !fieldValue.isEditable(action)));
                                      __jsp_taghandler_35.setIndexed(true);
                                      __jsp_taghandler_35.setMaxlength(OracleJspRuntime.toStr( fieldValue.getSize().toString()));
                                      __jsp_taghandler_35.setName("fieldValue");
                                      __jsp_taghandler_35.setProperty("valor");
                                      __jsp_taghandler_35.setSize(OracleJspRuntime.toStr( CatalogUtil.getSize(fieldValue)));
                                      __jsp_taghandler_35.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                      __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                                      if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
                                    }
                                    out.write(__oracle_jsp_text[109]);
                                  } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,5);
                              }
                              out.write(__oracle_jsp_text[110]);
                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_36=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_36.setParent(__jsp_taghandler_26);
                                __jsp_taghandler_36.setName("fieldValue");
                                __jsp_taghandler_36.setProperty("tipoPropiedad");
                                __jsp_taghandler_36.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.JAVA_LANG_CHARACTER)));
                                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[111]);
                                    {
                                      org.apache.struts.taglib.html.TextTag __jsp_taghandler_37=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag disabled indexed maxlength name property size styleClass");
                                      __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                                      __jsp_taghandler_37.setDisabled(OracleJspRuntime.toBoolean( !fieldValue.isEditable(action)));
                                      __jsp_taghandler_37.setIndexed(true);
                                      __jsp_taghandler_37.setMaxlength(OracleJspRuntime.toStr( fieldValue.getSize().toString()));
                                      __jsp_taghandler_37.setName("fieldValue");
                                      __jsp_taghandler_37.setProperty("valor");
                                      __jsp_taghandler_37.setSize(OracleJspRuntime.toStr( CatalogUtil.getSize(fieldValue)));
                                      __jsp_taghandler_37.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                      __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                                      if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
                                    }
                                    out.write(__oracle_jsp_text[112]);
                                  } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,5);
                              }
                              out.write(__oracle_jsp_text[113]);
                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_38=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_38.setParent(__jsp_taghandler_26);
                                __jsp_taghandler_38.setName("fieldValue");
                                __jsp_taghandler_38.setProperty("tipoPropiedad");
                                __jsp_taghandler_38.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.JAVA_LANG_NUMBER)));
                                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[114]);
                                    {
                                      org.apache.struts.taglib.html.TextTag __jsp_taghandler_39=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag disabled indexed maxlength name property size styleClass");
                                      __jsp_taghandler_39.setParent(__jsp_taghandler_38);
                                      __jsp_taghandler_39.setDisabled(OracleJspRuntime.toBoolean( !fieldValue.isEditable(action)));
                                      __jsp_taghandler_39.setIndexed(true);
                                      __jsp_taghandler_39.setMaxlength(OracleJspRuntime.toStr( fieldValue.getSize().toString()));
                                      __jsp_taghandler_39.setName("fieldValue");
                                      __jsp_taghandler_39.setProperty("valor");
                                      __jsp_taghandler_39.setSize(OracleJspRuntime.toStr( CatalogUtil.getSize(fieldValue)));
                                      __jsp_taghandler_39.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                      __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                                      if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
                                    }
                                    out.write(__oracle_jsp_text[115]);
                                  } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,5);
                              }
                              out.write(__oracle_jsp_text[116]);
                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_40=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_40.setParent(__jsp_taghandler_26);
                                __jsp_taghandler_40.setName("fieldValue");
                                __jsp_taghandler_40.setProperty("tipoPropiedad");
                                __jsp_taghandler_40.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.CATALOG_TYPE)));
                                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[117]);
                                    {
                                      org.apache.struts.taglib.html.SelectTag __jsp_taghandler_41=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled indexed name property styleClass");
                                      __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                                      __jsp_taghandler_41.setDisabled(OracleJspRuntime.toBoolean( !fieldValue.isEditable(action)));
                                      __jsp_taghandler_41.setIndexed(true);
                                      __jsp_taghandler_41.setName("fieldValue");
                                      __jsp_taghandler_41.setProperty("valor");
                                      __jsp_taghandler_41.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                      __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                      {
                                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_41,__jsp_tag_starteval,out);
                                        do {
                                          out.write(__oracle_jsp_text[118]);
                                          {
                                            org.apache.struts.taglib.html.OptionTag __jsp_taghandler_42=(org.apache.struts.taglib.html.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionTag.class,"org.apache.struts.taglib.html.OptionTag value");
                                            __jsp_taghandler_42.setParent(__jsp_taghandler_41);
                                            __jsp_taghandler_42.setValue("");
                                            __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                            {
                                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_42,__jsp_tag_starteval,out);
                                              do {
                                                out.write(__oracle_jsp_text[119]);
                                              } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                            }
                                            if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,7);
                                          }
                                          out.write(__oracle_jsp_text[120]);
                                          {
                                            org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_43=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                            __jsp_taghandler_43.setParent(__jsp_taghandler_41);
                                            __jsp_taghandler_43.setCollection(OracleJspRuntime.toStr( catName+fieldValue.getNombre()+CatConstants.CATALOGS));
                                            __jsp_taghandler_43.setLabelProperty("nombre");
                                            __jsp_taghandler_43.setProperty("valor");
                                            __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                                            if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,7);
                                          }
                                          out.write(__oracle_jsp_text[121]);
                                        } while (__jsp_taghandler_41.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                      }
                                      if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,6);
                                    }
                                    out.write(__oracle_jsp_text[122]);
                                  } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,5);
                              }
                              out.write(__oracle_jsp_text[123]);
                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_44=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_44.setParent(__jsp_taghandler_26);
                                __jsp_taghandler_44.setName("fieldValue");
                                __jsp_taghandler_44.setProperty("tipoPropiedad");
                                __jsp_taghandler_44.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.CICLO_TYPE)));
                                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[124]);
                                    {
                                      org.apache.struts.taglib.html.SelectTag __jsp_taghandler_45=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag disabled indexed name property styleClass");
                                      __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                                      __jsp_taghandler_45.setDisabled(OracleJspRuntime.toBoolean( !fieldValue.isEditable(action)));
                                      __jsp_taghandler_45.setIndexed(true);
                                      __jsp_taghandler_45.setName("fieldValue");
                                      __jsp_taghandler_45.setProperty("valor");
                                      __jsp_taghandler_45.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                      __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                      {
                                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_45,__jsp_tag_starteval,out);
                                        do {
                                          out.write(__oracle_jsp_text[125]);
                                          {
                                            org.apache.struts.taglib.html.OptionTag __jsp_taghandler_46=(org.apache.struts.taglib.html.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionTag.class,"org.apache.struts.taglib.html.OptionTag value");
                                            __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                                            __jsp_taghandler_46.setValue("");
                                            __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                            {
                                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_46,__jsp_tag_starteval,out);
                                              do {
                                                out.write(__oracle_jsp_text[126]);
                                              } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                            }
                                            if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,7);
                                          }
                                          out.write(__oracle_jsp_text[127]);
                                          {
                                            org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_47=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                                            __jsp_taghandler_47.setParent(__jsp_taghandler_45);
                                            __jsp_taghandler_47.setCollection(OracleJspRuntime.toStr( catName+fieldValue.getNombre()+CatConstants.CATALOGS));
                                            __jsp_taghandler_47.setLabelProperty("nombre");
                                            __jsp_taghandler_47.setProperty("valor");
                                            __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                                            if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,7);
                                          }
                                          out.write(__oracle_jsp_text[128]);
                                        } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                      }
                                      if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
                                    }
                                    out.write(__oracle_jsp_text[129]);
                                  } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,5);
                              }
                              out.write(__oracle_jsp_text[130]);
                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_48=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
                                __jsp_taghandler_48.setParent(__jsp_taghandler_26);
                                __jsp_taghandler_48.setName("fieldValue");
                                __jsp_taghandler_48.setProperty("tipoPropiedad");
                                __jsp_taghandler_48.setValue(OracleJspRuntime.toStr( String.valueOf(CatalogConstants.ENCRYPTED_TYPE)));
                                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[131]);
                                    {
                                      org.apache.struts.taglib.html.PasswordTag __jsp_taghandler_49=(org.apache.struts.taglib.html.PasswordTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.PasswordTag.class,"org.apache.struts.taglib.html.PasswordTag disabled indexed maxlength name property styleClass size");
                                      __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                                      __jsp_taghandler_49.setDisabled(OracleJspRuntime.toBoolean( !fieldValue.isEditable(action)));
                                      __jsp_taghandler_49.setIndexed(true);
                                      __jsp_taghandler_49.setMaxlength(OracleJspRuntime.toStr( fieldValue.getSize().toString()));
                                      __jsp_taghandler_49.setName("fieldValue");
                                      __jsp_taghandler_49.setProperty("valor");
                                      __jsp_taghandler_49.setStyleClass(OracleJspRuntime.toStr( styleClass));
                                      __jsp_taghandler_49.setSize(OracleJspRuntime.toStr( CatalogUtil.getSize(fieldValue)));
                                      __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                                      if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
                                    }
                                    out.write(__oracle_jsp_text[132]);
                                  } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,5);
                              }
                              out.write(__oracle_jsp_text[133]);
                            } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                          }
                          if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,4);
                        }
                        out.write(__oracle_jsp_text[134]);
                      } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,3);
                  }
                  out.write(__oracle_jsp_text[135]);
                  {
                    org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_50=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name value");
                    __jsp_taghandler_50.setParent(__jsp_taghandler_9);
                    __jsp_taghandler_50.setName("visible");
                    __jsp_taghandler_50.setValue("false");
                    __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        out.write(__oracle_jsp_text[136]);
                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_51=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag indexed name property");
                          __jsp_taghandler_51.setParent(__jsp_taghandler_50);
                          __jsp_taghandler_51.setIndexed(true);
                          __jsp_taghandler_51.setName("fieldValue");
                          __jsp_taghandler_51.setProperty("nombre");
                          __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                          if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,4);
                        }
                        out.write(__oracle_jsp_text[137]);
                        {
                          org.apache.struts.taglib.html.HiddenTag __jsp_taghandler_52=(org.apache.struts.taglib.html.HiddenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.HiddenTag.class,"org.apache.struts.taglib.html.HiddenTag indexed name property");
                          __jsp_taghandler_52.setParent(__jsp_taghandler_50);
                          __jsp_taghandler_52.setIndexed(true);
                          __jsp_taghandler_52.setName("fieldValue");
                          __jsp_taghandler_52.setProperty("valor");
                          __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                          if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,4);
                        }
                        out.write(__oracle_jsp_text[138]);
                      } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,3);
                  }
                  out.write(__oracle_jsp_text[139]);
                } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
            }
            out.write(__oracle_jsp_text[140]);
            out.print(request.getContextPath() + "/administracion/RegIniciarListaRegistros.do" );
            out.write(__oracle_jsp_text[141]);
          } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[142]);
      out.write(__oracle_jsp_text[143]);
      int countForaneos= 0;
          Iterator foraneos = nombresCamposForaneos.iterator();
              while (foraneos.hasNext()){
              
      out.write(__oracle_jsp_text[144]);
      out.print(countForaneos++);
      out.write(__oracle_jsp_text[145]);
      out.print("\""+foraneos.next()+"\"");
      out.write(__oracle_jsp_text[146]);
      }
      out.write(__oracle_jsp_text[147]);

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
  private static final char __oracle_jsp_text[][]=new char[148][];
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
    "\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    <table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"MarcoAzul\" onclick=\"closeHelp()\">\r\n        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n\r\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n    \r\n            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n            \r\n                <tr height=\"22\"> \r\n                    <td height=\"20\" align=\"left\" width=\"20%\" class=\"".toCharArray();
    __oracle_jsp_text[34] = 
    "\">\r\n                        ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                            *&nbsp;\r\n                        ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[38] = 
    "&nbsp;\r\n                    </td>\r\n                    <td align=\"left\" width=\"80%\" class=\"".toCharArray();
    __oracle_jsp_text[39] = 
    "\">\r\n                        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                    \r\n                            ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[42] = 
    "&nbsp;\r\n                            ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                                \r\n                                <a href=\"javascript:launch('div".toCharArray();
    __oracle_jsp_text[46] = 
    "','fra".toCharArray();
    __oracle_jsp_text[47] = 
    "','".toCharArray();
    __oracle_jsp_text[48] = 
    "','".toCharArray();
    __oracle_jsp_text[49] = 
    "','".toCharArray();
    __oracle_jsp_text[50] = 
    "');\">\r\n                                    <img alt=\"help\" src=\"".toCharArray();
    __oracle_jsp_text[51] = 
    "\" align=\"absmiddle\" border=0/>\r\n                                </a>                    \r\n                                <div id=\"div".toCharArray();
    __oracle_jsp_text[52] = 
    "\" class=\"popup\">\r\n                                    <table border=\"0\" width=\"250\" bgcolor=\"#3C3C3C\" cellspacing=\"0\" cellpadding=\"5\">\r\n                                        <tr>\r\n                                            <td width=\"100%\">\r\n                                                <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" height=\"36\">\r\n                                                    <tr>\r\n                                                        <td style=\"cursor:move\" width=\"100%\"  id=\"td".toCharArray();
    __oracle_jsp_text[53] = 
    "\">\r\n                                                            <font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">".toCharArray();
    __oracle_jsp_text[54] = 
    "</font>\r\n                                                        </td>\r\n                                                        <td style=\"cursor:hand\" valign=\"top\" align=\"right\">\r\n                                                            <a href=\"#\" onClick=\"closeDiv('div".toCharArray();
    __oracle_jsp_text[55] = 
    "','fra".toCharArray();
    __oracle_jsp_text[56] = 
    "');return false\"><font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">X</font></a>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td width=\"100%\" bgcolor=\"#FFFFFF\" style=\"padding:4px\" colspan=\"2\">\r\n                                                            <iframe style=\"height:360px;width:630px;border-style:none;\" src=\"\" name=\"frameHelp\" id=\"fra".toCharArray();
    __oracle_jsp_text[57] = 
    "\">\r\n                                                            </iframe>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table> \r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </div>\r\n                                <script language=\"javascript\">\r\n                                    Drag.init(document.getElementById(\"td".toCharArray();
    __oracle_jsp_text[58] = 
    "\"),document.getElementById(\"div".toCharArray();
    __oracle_jsp_text[59] = 
    "\"));\r\n                                </script>\r\n                                \r\n                                ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[61] = 
    "&nbsp;                \r\n                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[71] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[72] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[74] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n                                        <input type=\"text\" maxlength=\"".toCharArray();
    __oracle_jsp_text[76] = 
    "\" name=\"text_fieldValue[".toCharArray();
    __oracle_jsp_text[77] = 
    "]\" id=\"text_fieldValue[".toCharArray();
    __oracle_jsp_text[78] = 
    "]\"  readonly=\"true\"   size=\"".toCharArray();
    __oracle_jsp_text[79] = 
    "\" onblur=\"changeValue_fieldValue".toCharArray();
    __oracle_jsp_text[80] = 
    "()\" />\r\n                                        <span class=\"calendar\">\r\n                                            <a href=\"javascript:void(0)\" id=\"button_fieldValue[".toCharArray();
    __oracle_jsp_text[81] = 
    "]\" onblur=\"changeValue_fieldValue".toCharArray();
    __oracle_jsp_text[82] = 
    "()\">\r\n                                                <img src=\"".toCharArray();
    __oracle_jsp_text[83] = 
    "\" alt=\"calendar\" width=\"20\" height=\"20\"/>\r\n                                            </a>\r\n                                        </span>\r\n                                        ".toCharArray();
    __oracle_jsp_text[84] = 
    "                                            \r\n                                            <script type=\"text/javascript\">\r\n                                                Calendar.setup({\r\n                                                    inputField     :    \"text_fieldValue[".toCharArray();
    __oracle_jsp_text[85] = 
    "]\",      \r\n                                                    ifFormat       :    \"%d/%m/%Y %H:%M:%S\",                \r\n                                                    button         :    \"button_fieldValue[".toCharArray();
    __oracle_jsp_text[86] = 
    "]\",   \r\n                                                    step           :    1,        \r\n                                                    showsTime      :    \"true\"\r\n                                                });\r\n                                            </script>\r\n                                        ".toCharArray();
    __oracle_jsp_text[87] = 
    "\r\n                                            <script type=\"text/javascript\">\r\n                                                Calendar.setup({\r\n                                                    inputField     :    \"text_fieldValue[".toCharArray();
    __oracle_jsp_text[88] = 
    "]\",      \r\n                                                    ifFormat       :    \"%d/%m/%Y\",                \r\n                                                    button         :    \"button_fieldValue[".toCharArray();
    __oracle_jsp_text[89] = 
    "]\",   \r\n                                                    step           :    1        \r\n                                                });\r\n                                            </script>\r\n                                        ".toCharArray();
    __oracle_jsp_text[90] = 
    "\r\n                                        <script type=\"text/javascript\">\r\n                                            var hiddenField = document.getElementsByName(\"fieldValue[".toCharArray();
    __oracle_jsp_text[91] = 
    "].valor\");\r\n                                            if(hiddenField.length > 0){\r\n                                                document.getElementById(\"text_fieldValue[".toCharArray();
    __oracle_jsp_text[92] = 
    "]\").value = hiddenField[0].value;\r\n                                            }\r\n                                            function changeValue_fieldValue".toCharArray();
    __oracle_jsp_text[93] = 
    "(){\r\n                                                var hiddenField = document.getElementsByName(\"fieldValue[".toCharArray();
    __oracle_jsp_text[94] = 
    "].valor\");\r\n                                                if(hiddenField.length > 0){                                            \r\n                                                    hiddenField[0].value = document.getElementById(\"text_fieldValue[".toCharArray();
    __oracle_jsp_text[95] = 
    "]\").value;        \r\n                                                }                                        \r\n                                            };\r\n                                        </script>\r\n                                        <a href=\"javascript:limpiaCampos('text_fieldValue[".toCharArray();
    __oracle_jsp_text[96] = 
    "]');javascript:changeLimpiaValor".toCharArray();
    __oracle_jsp_text[97] = 
    "();\"><img src=\"".toCharArray();
    __oracle_jsp_text[98] = 
    "\"  alt=\"limpiar\" border=0 align=\"absmiddle\" ></a>        \r\n                                        <script type=\"text/javascript\">\r\n                                            function changeLimpiaValor".toCharArray();
    __oracle_jsp_text[99] = 
    "(){\r\n                                                document.getElementById(\"fieldValue[".toCharArray();
    __oracle_jsp_text[100] = 
    "].valor\").value = document.getElementById(\"text_fieldValue[".toCharArray();
    __oracle_jsp_text[101] = 
    "]\").value;\r\n                                            }      \r\n                                        </script>\r\n                                    ".toCharArray();
    __oracle_jsp_text[102] = 
    "\r\n                                        <input type=\"text\" maxlength=\"10\" name=\"text_fieldValue[".toCharArray();
    __oracle_jsp_text[103] = 
    "]\" id=\"text_fieldValue[".toCharArray();
    __oracle_jsp_text[104] = 
    "]\"  value=\"".toCharArray();
    __oracle_jsp_text[105] = 
    "\" size=\"12\"  readonly=\"true\"/>\r\n                                    ".toCharArray();
    __oracle_jsp_text[106] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[107] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[108] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[109] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[110] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[111] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[112] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[113] = 
    "                    \r\n                                ".toCharArray();
    __oracle_jsp_text[114] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[115] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[116] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[117] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[118] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[119] = 
    "Seleccione una opci&oacute;n".toCharArray();
    __oracle_jsp_text[120] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[121] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[122] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[123] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[124] = 
    "                        \r\n                                        ".toCharArray();
    __oracle_jsp_text[125] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[126] = 
    "Seleccione una opci&oacute;n".toCharArray();
    __oracle_jsp_text[127] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[128] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[129] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[130] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[131] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[132] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[133] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[134] = 
    "\r\n                    </td>\r\n                </tr>\r\n            ".toCharArray();
    __oracle_jsp_text[135] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[136] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[137] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[138] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[139] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[140] = 
    "\r\n\r\n        <tr height=\"22\"> \r\n            <td colspan=\"4\">\r\n                <input type=\"submit\" name=\"btnGuardar\" value=\"Enviar\" class=\"uppercase\">\r\n                <input type=\"button\" name=\"btnCancelar\" value=\"Cancelar\" onclick='window.location=\"".toCharArray();
    __oracle_jsp_text[141] = 
    "\"' \r\n                    class=\"uppercase\">\r\n            </td>\r\n        </tr>\r\n    </table>\r\n".toCharArray();
    __oracle_jsp_text[142] = 
    "\r\n\r\n<script language=\"JavaScript\">                \r\n    function validateLength(obj, max_len){\r\n        if (obj.value.length>max_len) {\r\n            obj.value=obj.value.substring(0,max_len);\r\n        }\r\n    }\r\n    ".toCharArray();
    __oracle_jsp_text[143] = 
    "\r\n    var foraneos =new Array();\r\n    ".toCharArray();
    __oracle_jsp_text[144] = 
    "foraneos[".toCharArray();
    __oracle_jsp_text[145] = 
    "]=".toCharArray();
    __oracle_jsp_text[146] = 
    ";\r\n        ".toCharArray();
    __oracle_jsp_text[147] = 
    "\r\n    for(var i = 0; i<= foraneos.length; i++){\r\n        var j=0;\r\n        var found= 0;\r\n        while(found == 0 && document.forms[0].elements[\"fieldValue[\"+j+\"].nombre\"]!=null ){\r\n            var obj = document.forms[0].elements[\"fieldValue[\"+j+\"].nombre\"];\r\n            if (obj.value==foraneos[i]){\r\n                found=1;\r\n                document.forms[0].elements[\"fieldValue[\"+j+\"].valor\"].readOnly=true;\r\n            }\r\n            j++;\r\n        }\r\n    } \r\n    carga();\r\n</script>  ".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
