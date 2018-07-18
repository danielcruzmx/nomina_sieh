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
import java.util.Map;


public class _RegListaRegistros extends com.orionserver.http.OrionHttpJspPage {


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
    _RegListaRegistros page = this;
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
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_2=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag definition");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setDefinition("title");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[8]);
            {
              org.apache.struts.taglib.tiles.PutTag __jsp_taghandler_3=(org.apache.struts.taglib.tiles.PutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.PutTag.class,"org.apache.struts.taglib.tiles.PutTag name value");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_taghandler_3.setName("link");
              __jsp_taghandler_3.setValue("<b>Cat&aacute;logos</b>&nbsp;");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[9]);
            {
              org.apache.struts.taglib.tiles.PutTag __jsp_taghandler_4=(org.apache.struts.taglib.tiles.PutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.PutTag.class,"org.apache.struts.taglib.tiles.PutTag name value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_2);
              __jsp_taghandler_4.setName("value");
              __jsp_taghandler_4.setValue("&gt;&nbsp;Elementos del Cat&aacute;logo&nbsp;");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
            }
            out.write(__oracle_jsp_text[10]);
            {
              org.apache.struts.taglib.tiles.PutTag __jsp_taghandler_5=(org.apache.struts.taglib.tiles.PutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.PutTag.class,"org.apache.struts.taglib.tiles.PutTag name value");
              __jsp_taghandler_5.setParent(__jsp_taghandler_2);
              __jsp_taghandler_5.setName("name");
              __jsp_taghandler_5.setValue(CatalogUtil.formatTableName(catName,request));
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
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
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_6=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setAction("/administracion/RegListaRegistros");
        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[13]);
            {
              org.apache.struts.taglib.bean.DefineTag __jsp_taghandler_7=(org.apache.struts.taglib.bean.DefineTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.DefineTag.class,"org.apache.struts.taglib.bean.DefineTag id name type");
              __jsp_taghandler_7.setParent(__jsp_taghandler_6);
              __jsp_taghandler_7.setId("DESC_TABLA");
              __jsp_taghandler_7.setName(OracleJspRuntime.toStr( CatConstants.DESC_TABLA));
              __jsp_taghandler_7.setType("gob.shcp.catalog.core.common.dto.TablaVO");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
            }
            gob.shcp.catalog.core.common.dto.TablaVO DESC_TABLA = null;
            DESC_TABLA = (gob.shcp.catalog.core.common.dto.TablaVO) pageContext.findAttribute("DESC_TABLA");
            out.write(__oracle_jsp_text[14]);
            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_8=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id indexId name property");
              __jsp_taghandler_8.setParent(__jsp_taghandler_6);
              __jsp_taghandler_8.setId("filtro");
              __jsp_taghandler_8.setIndexId("i");
              __jsp_taghandler_8.setName("RegListaRegistrosForm");
              __jsp_taghandler_8.setProperty("filtros");
              java.lang.Object filtro = null;
              java.lang.Integer i = null;
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                do {
                  filtro = (java.lang.Object) pageContext.findAttribute("filtro");
                  i = (java.lang.Integer) pageContext.findAttribute("i");
                  out.write(__oracle_jsp_text[15]);
                  out.print(CatalogUtil.formatColumnName(catName+"."+(( gob.shcp.catalog.core.common.dto.FiltroVO)filtro).getFieldName(),request));
                  out.write(__oracle_jsp_text[16]);
                  {
                    org.apache.struts.taglib.html.TextTag __jsp_taghandler_9=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag indexed name property");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                    __jsp_taghandler_9.setIndexed(true);
                    __jsp_taghandler_9.setName("filtro");
                    __jsp_taghandler_9.setProperty("originalValue");
                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                  }
                  out.write(__oracle_jsp_text[17]);
                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
            }
            out.write(__oracle_jsp_text[18]);
            out.print(request.getContextPath() + "/administracion/RegListaRegistros.do?limpiar=true");
            out.write(__oracle_jsp_text[19]);
            {
              org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_10=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name property value");
              __jsp_taghandler_10.setParent(__jsp_taghandler_6);
              __jsp_taghandler_10.setName(OracleJspRuntime.toStr( CatConstants.RIGHTS));
              __jsp_taghandler_10.setProperty("insert");
              __jsp_taghandler_10.setValue("true");
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[20]);
                  out.print(request.getContextPath() + "/administracion/RegIniciarInsertarRegistros.do?insert=true");
                  out.write(__oracle_jsp_text[21]);
                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
            }
            out.write(__oracle_jsp_text[22]);
            {
              org.apache.struts.taglib.logic.NotEmptyTag __jsp_taghandler_11=(org.apache.struts.taglib.logic.NotEmptyTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEmptyTag.class,"org.apache.struts.taglib.logic.NotEmptyTag name");
              __jsp_taghandler_11.setParent(__jsp_taghandler_6);
              __jsp_taghandler_11.setName("registros");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[23]);
                  //SE MODIFICA LA PROPIEDAD sort="list" PARA QUE EL ORDENAMIENTO CONSIDERE LA LISTA COMPLETA DE DATOS.
                  out.write(__oracle_jsp_text[24]);
                  {
                    org.displaytag.tags.el.ELTableTag __jsp_taghandler_12=(org.displaytag.tags.el.ELTableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELTableTag.class,"org.displaytag.tags.el.ELTableTag name pagesize requestURI class export id sort defaultsort");
                    __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                    __jsp_taghandler_12.setName("sessionScope.registros");
                    __jsp_taghandler_12.setPagesize("20");
                    __jsp_taghandler_12.setRequestURI("/administracion/RegIniciarListaRegistros.do");
                    __jsp_taghandler_12.setClass("displaytag");
                    __jsp_taghandler_12.setExport("true");
                    __jsp_taghandler_12.setUid("rows");
                    __jsp_taghandler_12.setSort("list");
                    __jsp_taghandler_12.setDefaultsort("1");
                    __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_12,__jsp_tag_starteval,out);
                      do {
                        out.write(__oracle_jsp_text[25]);
                        {
                          org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_13=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id indexId name property type");
                          __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_13.setId("column");
                          __jsp_taghandler_13.setIndexId("idx");
                          __jsp_taghandler_13.setName("DESC_TABLA");
                          __jsp_taghandler_13.setProperty("propiedadesConsulta");
                          __jsp_taghandler_13.setType("gob.shcp.catalog.core.common.dto.PropiedadVO");
                          gob.shcp.catalog.core.common.dto.PropiedadVO column = null;
                          java.lang.Integer idx = null;
                          __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
                            do {
                              column = (gob.shcp.catalog.core.common.dto.PropiedadVO) pageContext.findAttribute("column");
                              idx = (java.lang.Integer) pageContext.findAttribute("idx");
                              out.write(__oracle_jsp_text[26]);
                              String title = CatalogUtil.formatColumnName(catName+"."+column.getNombre(),request);
                              out.write(__oracle_jsp_text[27]);
                              {
                                org.apache.struts.taglib.logic.EqualTag __jsp_taghandler_14=(org.apache.struts.taglib.logic.EqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EqualTag.class,"org.apache.struts.taglib.logic.EqualTag name value");
                                __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                                __jsp_taghandler_14.setName("idx");
                                __jsp_taghandler_14.setValue("0");
                                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[28]);
                                    
                                                            //Se tiene que agregar la columna "rowNum" con el numero del registro (que ocupa en la lista del displaytag)
                                                            //para que se pueda utilizar para definir el html link por medio de los atributos del tag y permita que el parametro index
                                                            //tenga un valor dinamico, y que ademas permita el ordenamiento de la columna. Aparentemente existe un bug
                                                            //en el tag al definir el atributo paramName (ya que no esta obteniendo el bean en cada iteracion 
                                                            //y no permite que el valor del parametro index del link sea dinamico)
                                                            ((Map)pageContext.getAttribute("rows")).put("rowNum", String.valueOf(pageContext.getAttribute("rows_rowNum")));
                                                        
                                                            if(column.getTipoPropiedad()==CatalogConstants.JAVA_UTIL_DATE) {
                                    out.write(__oracle_jsp_text[29]);
                                    {
                                      org.displaytag.tags.el.ELColumnTag __jsp_taghandler_15=(org.displaytag.tags.el.ELColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELColumnTag.class,"org.displaytag.tags.el.ELColumnTag property title sortable format url paramId paramProperty");
                                      __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                                      __jsp_taghandler_15.setProperty(OracleJspRuntime.toStr( column.getNombre()));
                                      __jsp_taghandler_15.setTitle(OracleJspRuntime.toStr( title));
                                      __jsp_taghandler_15.setSortable("true");
                                      __jsp_taghandler_15.setFormat(OracleJspRuntime.toStr( column.getDateFormat()));
                                      __jsp_taghandler_15.setUrl("/administracion/RegIniciarDetalleRegistros.do");
                                      __jsp_taghandler_15.setParamId("index");
                                      __jsp_taghandler_15.setParamProperty("rowNum");
                                      __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                                      if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,6);
                                    }
                                    out.write(__oracle_jsp_text[30]);
                                    } else {
                                    out.write(__oracle_jsp_text[31]);
                                    {
                                      org.apache.struts.taglib.logic.PresentTag __jsp_taghandler_16=(org.apache.struts.taglib.logic.PresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.PresentTag.class,"org.apache.struts.taglib.logic.PresentTag name property");
                                      __jsp_taghandler_16.setParent(__jsp_taghandler_14);
                                      __jsp_taghandler_16.setName("column");
                                      __jsp_taghandler_16.setProperty("campoComplejoVO.campoDespliegue");
                                      __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                          out.write(__oracle_jsp_text[32]);
                                          {
                                            org.displaytag.tags.el.ELColumnTag __jsp_taghandler_17=(org.displaytag.tags.el.ELColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELColumnTag.class,"org.displaytag.tags.el.ELColumnTag title sortable url paramId paramProperty");
                                            __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                                            __jsp_taghandler_17.setTitle(OracleJspRuntime.toStr( title));
                                            __jsp_taghandler_17.setSortable("true");
                                            __jsp_taghandler_17.setUrl("/administracion/RegIniciarDetalleRegistros.do");
                                            __jsp_taghandler_17.setParamId("index");
                                            __jsp_taghandler_17.setParamProperty("rowNum");
                                            __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                            {
                                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                                              do {
                                                out.write(__oracle_jsp_text[33]);
                                                {
                                                  org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_18=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                                  __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                                                  __jsp_taghandler_18.setName("rows");
                                                  __jsp_taghandler_18.setProperty(OracleJspRuntime.toStr( CatalogConstants.FK_PREFIX+column.getNombre()));
                                                  __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                                                  if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                    return;
                                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,8);
                                                }
                                                out.write(__oracle_jsp_text[34]);
                                                {
                                                  org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                                                  __jsp_taghandler_19.setParent(__jsp_taghandler_17);
                                                  __jsp_taghandler_19.setTest(OracleJspRuntime.toBoolean( column.getCampoComplejoVO().isMostrarId()));
                                                  __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                                  {
                                                    do {
                                                      out.write(__oracle_jsp_text[35]);
                                                      {
                                                        org.apache.struts.taglib.logic.NotEmptyTag __jsp_taghandler_20=(org.apache.struts.taglib.logic.NotEmptyTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEmptyTag.class,"org.apache.struts.taglib.logic.NotEmptyTag name property");
                                                        __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                                                        __jsp_taghandler_20.setName("rows");
                                                        __jsp_taghandler_20.setProperty(OracleJspRuntime.toStr( column.getNombre()));
                                                        __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                                                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                                        {
                                                          do {
                                                            out.write(__oracle_jsp_text[36]);
                                                            {
                                                              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_21=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                                              __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                                              __jsp_taghandler_21.setName("rows");
                                                              __jsp_taghandler_21.setProperty(OracleJspRuntime.toStr( column.getNombre()));
                                                              __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                                              if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                                return;
                                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,10);
                                                            }
                                                            out.write(__oracle_jsp_text[37]);
                                                          } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                                        }
                                                        if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                          return;
                                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,9);
                                                      }
                                                      out.write(__oracle_jsp_text[38]);
                                                    } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                                  }
                                                  if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                    return;
                                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,8);
                                                }
                                                out.write(__oracle_jsp_text[39]);
                                              } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                            }
                                            if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,7);
                                          }
                                          out.write(__oracle_jsp_text[40]);
                                        } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,6);
                                    }
                                    out.write(__oracle_jsp_text[41]);
                                    {
                                      org.apache.struts.taglib.logic.NotPresentTag __jsp_taghandler_22=(org.apache.struts.taglib.logic.NotPresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotPresentTag.class,"org.apache.struts.taglib.logic.NotPresentTag name property");
                                      __jsp_taghandler_22.setParent(__jsp_taghandler_14);
                                      __jsp_taghandler_22.setName("column");
                                      __jsp_taghandler_22.setProperty("campoComplejoVO.campoDespliegue");
                                      __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                          out.write(__oracle_jsp_text[42]);
                                          {
                                            org.displaytag.tags.el.ELColumnTag __jsp_taghandler_23=(org.displaytag.tags.el.ELColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELColumnTag.class,"org.displaytag.tags.el.ELColumnTag property title sortable url paramId paramProperty");
                                            __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                                            __jsp_taghandler_23.setProperty(OracleJspRuntime.toStr( column.getNombre()));
                                            __jsp_taghandler_23.setTitle(OracleJspRuntime.toStr( title));
                                            __jsp_taghandler_23.setSortable("true");
                                            __jsp_taghandler_23.setUrl("/administracion/RegIniciarDetalleRegistros.do");
                                            __jsp_taghandler_23.setParamId("index");
                                            __jsp_taghandler_23.setParamProperty("rowNum");
                                            __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                                            if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,7);
                                          }
                                          out.write(__oracle_jsp_text[43]);
                                        } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,6);
                                    }
                                    out.write(__oracle_jsp_text[44]);
                                    }
                                    out.write(__oracle_jsp_text[45]);
                                  } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,5);
                              }
                              out.write(__oracle_jsp_text[46]);
                              {
                                org.apache.struts.taglib.logic.NotEqualTag __jsp_taghandler_24=(org.apache.struts.taglib.logic.NotEqualTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEqualTag.class,"org.apache.struts.taglib.logic.NotEqualTag name value");
                                __jsp_taghandler_24.setParent(__jsp_taghandler_13);
                                __jsp_taghandler_24.setName("idx");
                                __jsp_taghandler_24.setValue("0");
                                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                {
                                  do {
                                    out.write(__oracle_jsp_text[47]);
                                    if(column.getTipoPropiedad()==CatalogConstants.JAVA_UTIL_DATE) {
                                    out.write(__oracle_jsp_text[48]);
                                    {
                                      org.displaytag.tags.el.ELColumnTag __jsp_taghandler_25=(org.displaytag.tags.el.ELColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELColumnTag.class,"org.displaytag.tags.el.ELColumnTag property title sortable");
                                      __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_25.setProperty(OracleJspRuntime.toStr( column.getNombre()));
                                      __jsp_taghandler_25.setTitle(OracleJspRuntime.toStr( title));
                                      __jsp_taghandler_25.setSortable("true");
                                      __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                                      if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,6);
                                    }
                                    out.write(__oracle_jsp_text[49]);
                                    } else {
                                    out.write(__oracle_jsp_text[50]);
                                    {
                                      org.apache.struts.taglib.logic.PresentTag __jsp_taghandler_26=(org.apache.struts.taglib.logic.PresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.PresentTag.class,"org.apache.struts.taglib.logic.PresentTag name property");
                                      __jsp_taghandler_26.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_26.setName("column");
                                      __jsp_taghandler_26.setProperty("campoComplejoVO.campoDespliegue");
                                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                          out.write(__oracle_jsp_text[51]);
                                          {
                                            org.displaytag.tags.el.ELColumnTag __jsp_taghandler_27=(org.displaytag.tags.el.ELColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELColumnTag.class,"org.displaytag.tags.el.ELColumnTag title sortable");
                                            __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                                            __jsp_taghandler_27.setTitle(OracleJspRuntime.toStr( title));
                                            __jsp_taghandler_27.setSortable("true");
                                            __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                            {
                                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_27,__jsp_tag_starteval,out);
                                              do {
                                                out.write(__oracle_jsp_text[52]);
                                                {
                                                  org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_28=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                                  __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                                                  __jsp_taghandler_28.setName("rows");
                                                  __jsp_taghandler_28.setProperty(OracleJspRuntime.toStr( CatalogConstants.FK_PREFIX+column.getNombre()));
                                                  __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                                                  if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                    return;
                                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,8);
                                                }
                                                out.write(__oracle_jsp_text[53]);
                                                {
                                                  org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                                                  __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                                                  __jsp_taghandler_29.setTest(OracleJspRuntime.toBoolean( column.getCampoComplejoVO().isMostrarId()));
                                                  __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                                  {
                                                    do {
                                                      out.write(__oracle_jsp_text[54]);
                                                      {
                                                        org.apache.struts.taglib.logic.NotEmptyTag __jsp_taghandler_30=(org.apache.struts.taglib.logic.NotEmptyTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotEmptyTag.class,"org.apache.struts.taglib.logic.NotEmptyTag name property");
                                                        __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                                                        __jsp_taghandler_30.setName("rows");
                                                        __jsp_taghandler_30.setProperty(OracleJspRuntime.toStr( column.getNombre()));
                                                        __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                                                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                                        {
                                                          do {
                                                            out.write(__oracle_jsp_text[55]);
                                                            {
                                                              org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_31=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                                                              __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                                                              __jsp_taghandler_31.setName("rows");
                                                              __jsp_taghandler_31.setProperty(OracleJspRuntime.toStr( column.getNombre()));
                                                              __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                                                              if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                                return;
                                                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,10);
                                                            }
                                                            out.write(__oracle_jsp_text[56]);
                                                          } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                                        }
                                                        if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                          return;
                                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,9);
                                                      }
                                                      out.write(__oracle_jsp_text[57]);
                                                    } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                                  }
                                                  if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                    return;
                                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,8);
                                                }
                                                out.write(__oracle_jsp_text[58]);
                                              } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                            }
                                            if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,7);
                                          }
                                          out.write(__oracle_jsp_text[59]);
                                        } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,6);
                                    }
                                    out.write(__oracle_jsp_text[60]);
                                    {
                                      org.apache.struts.taglib.logic.NotPresentTag __jsp_taghandler_32=(org.apache.struts.taglib.logic.NotPresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotPresentTag.class,"org.apache.struts.taglib.logic.NotPresentTag name property");
                                      __jsp_taghandler_32.setParent(__jsp_taghandler_24);
                                      __jsp_taghandler_32.setName("column");
                                      __jsp_taghandler_32.setProperty("campoComplejoVO.campoDespliegue");
                                      __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                      {
                                        do {
                                          out.write(__oracle_jsp_text[61]);
                                          {
                                            org.displaytag.tags.el.ELColumnTag __jsp_taghandler_33=(org.displaytag.tags.el.ELColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELColumnTag.class,"org.displaytag.tags.el.ELColumnTag property title sortable maxLength");
                                            __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                                            __jsp_taghandler_33.setProperty(OracleJspRuntime.toStr( column.getNombre()));
                                            __jsp_taghandler_33.setTitle(OracleJspRuntime.toStr( title));
                                            __jsp_taghandler_33.setSortable("true");
                                            __jsp_taghandler_33.setMaxLength(CatalogUtil.MAX_SIZE_FIELD_JSP);
                                            __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                                            if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,7);
                                          }
                                          out.write(__oracle_jsp_text[62]);
                                        } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,6);
                                    }
                                    out.write(__oracle_jsp_text[63]);
                                    }
                                    out.write(__oracle_jsp_text[64]);
                                  } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                }
                                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,5);
                              }
                              out.write(__oracle_jsp_text[65]);
                            } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,4);
                        }
                        out.write(__oracle_jsp_text[66]);
                        {
                          org.displaytag.tags.el.ELSetPropertyTag __jsp_taghandler_34=(org.displaytag.tags.el.ELSetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELSetPropertyTag.class,"org.displaytag.tags.el.ELSetPropertyTag name value");
                          __jsp_taghandler_34.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_34.setName("paging.banner.placement");
                          __jsp_taghandler_34.setValue("bottom");
                          __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                          if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,4);
                        }
                        out.write(__oracle_jsp_text[67]);
                        {
                          org.displaytag.tags.el.ELSetPropertyTag __jsp_taghandler_35=(org.displaytag.tags.el.ELSetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELSetPropertyTag.class,"org.displaytag.tags.el.ELSetPropertyTag name value");
                          __jsp_taghandler_35.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_35.setName("export.pdf");
                          __jsp_taghandler_35.setValue("true");
                          __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                          if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,4);
                        }
                        out.write(__oracle_jsp_text[68]);
                        {
                          org.displaytag.tags.el.ELSetPropertyTag __jsp_taghandler_36=(org.displaytag.tags.el.ELSetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELSetPropertyTag.class,"org.displaytag.tags.el.ELSetPropertyTag name value");
                          __jsp_taghandler_36.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_36.setName("export.excel");
                          __jsp_taghandler_36.setValue("true");
                          __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                          if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,4);
                        }
                        out.write(__oracle_jsp_text[69]);
                        {
                          org.displaytag.tags.el.ELSetPropertyTag __jsp_taghandler_37=(org.displaytag.tags.el.ELSetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.el.ELSetPropertyTag.class,"org.displaytag.tags.el.ELSetPropertyTag name");
                          __jsp_taghandler_37.setParent(__jsp_taghandler_12);
                          __jsp_taghandler_37.setName("basic.msg.empty_list");
                          __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_37,__jsp_tag_starteval,out);
                            do {
                              out.write(__oracle_jsp_text[70]);
                              {
                                org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_38=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                                __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                                __jsp_taghandler_38.setKey("registros.empty.list");
                                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                  return;
                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,5);
                              }
                              out.write(__oracle_jsp_text[71]);
                            } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                          }
                          if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,4);
                        }
                        out.write(__oracle_jsp_text[72]);
                      } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                  }
                  out.write(__oracle_jsp_text[73]);
                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
            }
            out.write(__oracle_jsp_text[74]);
            {
              org.apache.struts.taglib.logic.EmptyTag __jsp_taghandler_39=(org.apache.struts.taglib.logic.EmptyTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.EmptyTag.class,"org.apache.struts.taglib.logic.EmptyTag name");
              __jsp_taghandler_39.setParent(__jsp_taghandler_6);
              __jsp_taghandler_39.setName("registros");
              __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[75]);
                  {
                    org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_40=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
                    __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                    __jsp_taghandler_40.setKey("rows.empty.list");
                    __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                    if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,3);
                  }
                  out.write(__oracle_jsp_text[76]);
                } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,2);
            }
            out.write(__oracle_jsp_text[77]);
          } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[78]);

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
  private static final char __oracle_jsp_text[][]=new char[79][];
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
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n        <tr>\r\n            <td>\r\n                <table>\r\n                    <tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                            <td width=\"6%\" class=\"\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                            <td width=\"21%\" class=\"\">\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td align=\"right\" valign=\"middle\">\r\n                <input type=\"submit\" value=\"Buscar\" class=\"uppercase\"/>&nbsp;\r\n                <input type=\"button\" value=\"Limpiar\" class=\"uppercase\" onclick='javascript:window.location=\"".toCharArray();
    __oracle_jsp_text[19] = 
    "\"'/>&nbsp;\r\n                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                    <input type=\"button\" value=\"Agregar\" class=\"uppercase\" onclick='javascript:window.location=\"".toCharArray();
    __oracle_jsp_text[21] = 
    "\"'/>\r\n                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <br>\r\n    <div id=\"scroll\">\r\n        ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                                            (".toCharArray();
    __oracle_jsp_text[37] = 
    ")\r\n                                        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                    \r\n                    ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                \r\n                        ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                                            (".toCharArray();
    __oracle_jsp_text[56] = 
    ")\r\n                                        ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[71] = 
    "<br><br></span>\r\n                ".toCharArray();
    __oracle_jsp_text[72] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[74] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[76] = 
    "<br><br></span>\r\n        ".toCharArray();
    __oracle_jsp_text[77] = 
    "\r\n    </div>\r\n".toCharArray();
    __oracle_jsp_text[78] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
