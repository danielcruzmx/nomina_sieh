package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import gob.shcp.fsn.model.support.DynaDTO;
import gob.shcp.fsn.control.view.util.TagUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.support.RequestContext;


public class _quickCapture_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // Begin global declarations

  private static OracleFunctionMapperImpl [] __ojsp_fnmappers = OracleJspRuntime.__init_ojsp_fMappers(1);
  // End global declarations

  // begin functions
  static {
    __ojsp_fnmappers[0].mapFunction("tagutils","createPagedList",gob.shcp.fsn.control.view.util.TagUtils.class,"createPagedList",new Class[] {javax.servlet.jsp.PageContext.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class});
  }
  // end functions

  // ** Begin Declarations


    private String getParamProperty(String paramProperty, List<String> keys) {
        if(paramProperty != null && !"".equals(paramProperty)) {
            return paramProperty;
        }
        return keys.get(0);    
    }

    private String getTitle(PageContext pageContext, String[] tableHeaders, List<String> keys, int idx) {
        String title;
        if(idx < tableHeaders.length) {
            title = tableHeaders[idx];
        } else {
            title = keys.get(idx);
        }
        return TagUtils.getPropertyResourcesValue(pageContext, title);
    }

  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String headerList;
  private java.lang.String startRow;
  private java.lang.String pagedUrl;
  private java.lang.String beanName;
  private java.lang.String service;
  private java.lang.String searchUrl;
  private java.lang.String deleteUrl;
  private java.lang.String updateUrl;
  private java.lang.String saveUrl;
  private java.lang.String selectUrl;
  private java.lang.String searchPath;
  private java.lang.String updatePath;
  private java.lang.String savePath;
  private java.lang.String paramProperty;
  private java.lang.String paramId;
  private java.lang.String showParamProperty;
  private java.lang.String editParamProperty;
  private java.lang.String onClear;
  private java.lang.String dateFormat;
  private java.lang.String exportTypes;
  private java.lang.String emptyContentMessage;

  public void setJspContext(JspContext ctx) 
  {
    super.setJspContext(ctx);
    java.util.ArrayList _nestedVars;
    java.util.ArrayList _atBeginVars;
    java.util.ArrayList _atEndVars;
    _atBeginVars = null;
    _atEndVars = null;
    _nestedVars = null;
    this.jspContext = new oracle.jsp.runtime.OracleJspContextWrapper(ctx, _atBeginVars, _atEndVars, _nestedVars, null);
  }

  public JspContext getJspContext() 
  {
    return this.jspContext;
  }

  public void setHeaderList(java.lang.String headerList)
  {
    this.headerList = headerList;
  }

  public java.lang.String getHeaderList()
  {
    return this.headerList;
  }

  public void setStartRow(java.lang.String startRow)
  {
    this.startRow = startRow;
  }

  public java.lang.String getStartRow()
  {
    return this.startRow;
  }

  public void setPagedUrl(java.lang.String pagedUrl)
  {
    this.pagedUrl = pagedUrl;
  }

  public java.lang.String getPagedUrl()
  {
    return this.pagedUrl;
  }

  public void setBeanName(java.lang.String beanName)
  {
    this.beanName = beanName;
  }

  public java.lang.String getBeanName()
  {
    return this.beanName;
  }

  public void setService(java.lang.String service)
  {
    this.service = service;
  }

  public java.lang.String getService()
  {
    return this.service;
  }

  public void setSearchUrl(java.lang.String searchUrl)
  {
    this.searchUrl = searchUrl;
  }

  public java.lang.String getSearchUrl()
  {
    return this.searchUrl;
  }

  public void setDeleteUrl(java.lang.String deleteUrl)
  {
    this.deleteUrl = deleteUrl;
  }

  public java.lang.String getDeleteUrl()
  {
    return this.deleteUrl;
  }

  public void setUpdateUrl(java.lang.String updateUrl)
  {
    this.updateUrl = updateUrl;
  }

  public java.lang.String getUpdateUrl()
  {
    return this.updateUrl;
  }

  public void setSaveUrl(java.lang.String saveUrl)
  {
    this.saveUrl = saveUrl;
  }

  public java.lang.String getSaveUrl()
  {
    return this.saveUrl;
  }

  public void setSelectUrl(java.lang.String selectUrl)
  {
    this.selectUrl = selectUrl;
  }

  public java.lang.String getSelectUrl()
  {
    return this.selectUrl;
  }

  public void setSearchPath(java.lang.String searchPath)
  {
    this.searchPath = searchPath;
  }

  public java.lang.String getSearchPath()
  {
    return this.searchPath;
  }

  public void setUpdatePath(java.lang.String updatePath)
  {
    this.updatePath = updatePath;
  }

  public java.lang.String getUpdatePath()
  {
    return this.updatePath;
  }

  public void setSavePath(java.lang.String savePath)
  {
    this.savePath = savePath;
  }

  public java.lang.String getSavePath()
  {
    return this.savePath;
  }

  public void setParamProperty(java.lang.String paramProperty)
  {
    this.paramProperty = paramProperty;
  }

  public java.lang.String getParamProperty()
  {
    return this.paramProperty;
  }

  public void setParamId(java.lang.String paramId)
  {
    this.paramId = paramId;
  }

  public java.lang.String getParamId()
  {
    return this.paramId;
  }

  public void setShowParamProperty(java.lang.String showParamProperty)
  {
    this.showParamProperty = showParamProperty;
  }

  public java.lang.String getShowParamProperty()
  {
    return this.showParamProperty;
  }

  public void setEditParamProperty(java.lang.String editParamProperty)
  {
    this.editParamProperty = editParamProperty;
  }

  public java.lang.String getEditParamProperty()
  {
    return this.editParamProperty;
  }

  public void setOnClear(java.lang.String onClear)
  {
    this.onClear = onClear;
  }

  public java.lang.String getOnClear()
  {
    return this.onClear;
  }

  public void setDateFormat(java.lang.String dateFormat)
  {
    this.dateFormat = dateFormat;
  }

  public java.lang.String getDateFormat()
  {
    return this.dateFormat;
  }

  public void setExportTypes(java.lang.String exportTypes)
  {
    this.exportTypes = exportTypes;
  }

  public java.lang.String getExportTypes()
  {
    return this.exportTypes;
  }

  public void setEmptyContentMessage(java.lang.String emptyContentMessage)
  {
    this.emptyContentMessage = emptyContentMessage;
  }

  public java.lang.String getEmptyContentMessage()
  {
    return this.emptyContentMessage;
  }


  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException { 
    PageContext pageContext = (PageContext) jspContext;
    try { 
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
        HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();
        HttpSession session = pageContext.getSession();
        ServletContext application = pageContext.getServletContext();
        JspWriter out = jspContext.getOut();
        ServletConfig config = pageContext.getServletConfig();
        int __jsp_tag_starteval;
        javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);
        pageContext.setAttribute("headerList", getHeaderList());
        pageContext.setAttribute("startRow", getStartRow());
        pageContext.setAttribute("pagedUrl", getPagedUrl());
        pageContext.setAttribute("beanName", getBeanName());
        pageContext.setAttribute("service", getService());
        pageContext.setAttribute("searchUrl", getSearchUrl());
        pageContext.setAttribute("deleteUrl", getDeleteUrl());
        pageContext.setAttribute("updateUrl", getUpdateUrl());
        pageContext.setAttribute("saveUrl", getSaveUrl());
        pageContext.setAttribute("selectUrl", getSelectUrl());
        pageContext.setAttribute("searchPath", getSearchPath());
        pageContext.setAttribute("updatePath", getUpdatePath());
        pageContext.setAttribute("savePath", getSavePath());
        pageContext.setAttribute("paramProperty", getParamProperty());
        pageContext.setAttribute("paramId", getParamId());
        pageContext.setAttribute("showParamProperty", getShowParamProperty());
        pageContext.setAttribute("editParamProperty", getEditParamProperty());
        pageContext.setAttribute("onClear", getOnClear());
        pageContext.setAttribute("dateFormat", getDateFormat());
        pageContext.setAttribute("exportTypes", getExportTypes());
        pageContext.setAttribute("emptyContentMessage", getEmptyContentMessage());


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("   ");
        out.write("\n");
        out.write("     ");
        out.write("\n");
        out.write("     ");
        out.write("\n\n");
        out.write("                     ");
        out.write("\n");
        out.write("                     ");
        out.write("\n");
        out.write("                    ");
        out.write("\n");
        out.write("                    ");
        out.write("\n");
        out.write("                    ");
        out.write("\n");
        out.write("                      ");
        out.write("\n");
        out.write("                    ");
        out.write("\n\n");
        out.write("                   ");
        out.write("\n");
        out.write("                   ");
        out.write("\n");
        out.write("                     ");
        out.write("\n\n");
        out.write("                ");
        out.write("\n");
        out.write("                      ");
        out.write("\n");
        out.write("            ");
        out.write("\n");
        out.write("            ");
        out.write("\n");
        out.write("                      ");
        out.write("\n");
        out.write("                   ");
        out.write("\n");
        out.write("                  ");
        out.write("\n");
        out.write("          ");
        out.write("\n\n");
        
        try {
            String sourceName = "";
            String sourceType = "";
            if((beanName == null || "".equals(beanName)) && (service == null || "".equals(service))) {
                return;
            } else if(beanName != null && !"".equals(beanName)) {
                sourceName = beanName;
                sourceType = "beanName";
            } else if(service != null && !"".equals(service)) {
                sourceName = service;
                sourceType = "service";
            }
            pageContext.setAttribute("sourceName", sourceName);
            pageContext.setAttribute("sourceType", sourceType);
        
            headerList = headerList != null ? headerList.trim() : "";
            String[] tableHeaders = headerList.split(",");
            String export = exportTypes != null ? "true" : "false";
            exportTypes = exportTypes != null ? exportTypes.trim() : "";
            List<String> exportProps = Arrays.asList(exportTypes.split(","));
            paramId = (paramId!=null && !"".equals(paramId)) ? paramId : "id";
            dateFormat = (dateFormat!=null && !"".equals(dateFormat)) ? dateFormat : "dd/MM/yyyy";
            emptyContentMessage = (emptyContentMessage!=null && !"".equals(emptyContentMessage)) ? emptyContentMessage : "pagedList.empty.content";
            
            pagedUrl  = TagUtils.formatUrl(pagedUrl);
            searchUrl = TagUtils.formatUrl(searchUrl);
            deleteUrl = TagUtils.formatUrl(deleteUrl);
            updateUrl = TagUtils.formatUrl(updateUrl);
            saveUrl   = TagUtils.formatUrl(saveUrl);
            selectUrl = TagUtils.formatUrl(selectUrl);
            
            searchPath = searchPath != null ? searchPath : "searchSubmit";
            updatePath = updatePath != null ? updatePath : "updateSubmit";
            savePath = savePath != null ? savePath : "";
            String selectPath = "selectSubmit";
        
            if(!"".equals(searchPath)) { 
        out.write(" <input type=\"hidden\" id=\"");
        out.print(searchPath);
        out.write("\" name=\"");
        out.print(searchPath);
        out.write("\" value=\"false\"/> ");
         }
            if(!"".equals(updatePath)) { 
        out.write(" <input type=\"hidden\" id=\"");
        out.print(updatePath);
        out.write("\" name=\"");
        out.print(updatePath);
        out.write("\" value=\"false\"/> ");
         }
            if(!"".equals(savePath))   { 
        out.write(" <input type=\"hidden\" id=\"");
        out.print(savePath);
        out.write("\"   name=\"");
        out.print(savePath);
        out.write("\"   value=\"false\"/> ");
         }
        
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setVar("_pagedUrl");
          __jsp_taghandler_1.setScope("page");
          __jsp_taghandler_1.setValue(OracleJspRuntime.toStr( pagedUrl));
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setVar("_searchUrl");
          __jsp_taghandler_2.setScope("page");
          __jsp_taghandler_2.setValue(OracleJspRuntime.toStr( searchUrl));
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setVar("_deleteUrl");
          __jsp_taghandler_3.setScope("page");
          __jsp_taghandler_3.setValue(OracleJspRuntime.toStr( deleteUrl));
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
        }
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setVar("_updateUrl");
          __jsp_taghandler_4.setScope("page");
          __jsp_taghandler_4.setValue(OracleJspRuntime.toStr( updateUrl));
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
        }
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_5.setParent(null);
          __jsp_taghandler_5.setVar("_saveUrl");
          __jsp_taghandler_5.setScope("page");
          __jsp_taghandler_5.setValue(OracleJspRuntime.toStr( saveUrl));
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
        }
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_6.setParent(null);
          __jsp_taghandler_6.setVar("_selectUrl");
          __jsp_taghandler_6.setScope("page");
          __jsp_taghandler_6.setValue(OracleJspRuntime.toStr( selectUrl));
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
        }
        out.write("\n");
        
            pagedUrl  = StringUtils.hasText(pagedUrl)  ? (String)pageContext.getAttribute("_pagedUrl", PageContext.PAGE_SCOPE)  : pagedUrl;
            searchUrl = StringUtils.hasText(searchUrl) ? (String)pageContext.getAttribute("_searchUrl", PageContext.PAGE_SCOPE) : searchUrl;
            deleteUrl = StringUtils.hasText(deleteUrl) ? (String)pageContext.getAttribute("_deleteUrl", PageContext.PAGE_SCOPE) : deleteUrl;
            updateUrl = StringUtils.hasText(updateUrl) ? (String)pageContext.getAttribute("_updateUrl", PageContext.PAGE_SCOPE) : updateUrl;
            saveUrl   = StringUtils.hasText(saveUrl)   ? (String)pageContext.getAttribute("_saveUrl", PageContext.PAGE_SCOPE)   : saveUrl;
            selectUrl = StringUtils.hasText(selectUrl) ? (String)pageContext.getAttribute("_selectUrl", PageContext.PAGE_SCOPE) : selectUrl;
            
            Integer htmlUniqueSaveID   = TagUtils.getHtmlUniqueId(pageContext);
            Integer htmlUniqueSearchID = TagUtils.getHtmlUniqueId(pageContext);            
            Integer htmlUniqueUpdateID = TagUtils.getHtmlUniqueId(pageContext);
        
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
          __jsp_taghandler_7.setParent(null);
          __jsp_taghandler_7.setVar("START_ROW_CONTENT");
          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
            do {
              out.write("\n      <tr>\n        ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                __jsp_taghandler_8.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${startRow}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_8.setEscapeXml(false);
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write("\n        <td nowrap>\n");
              
                      //Muestra el boton de busqueda.
                      if(StringUtils.hasText(searchUrl)) {
              
              out.write("\n            <input id=\"");
              out.print(htmlUniqueSearchID);
              out.write("\" type=\"image\" alt=\"buscar\" path=\"");
              out.print(searchPath);
              out.write("\" action=\"");
              out.print(searchUrl);
              out.write("\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_7);
                __jsp_taghandler_9.setCode("help.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                  if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_9.doCatch(th);
                } finally {
                  __jsp_taghandler_9.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write("\" onclick=\"return doSubmit(");
              out.print(htmlUniqueSearchID);
              out.write(");\"/>\n");
              
                      }
                      //Muestra icono para limpiar los campos de captura, se debe configurar una funcion javaScript que limpie los campos de captura del lado del JSP en donde se utilice el tag.
                      if(StringUtils.hasText(onClear)) {
              
              out.write("\n            <input type=\"image\" alt=\"limpiar\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_7);
                __jsp_taghandler_10.setCode("clear.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_10.doCatch(th);
                } finally {
                  __jsp_taghandler_10.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write("\" onclick=\"makeAddVisible();paramPropertyEditable();");
              out.print(onClear);
              out.write("; return false;\"/>\n");
              
                      } else {
              
              out.write("\n            <input type=\"image\" alt=\"limpiar\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_7);
                __jsp_taghandler_11.setCode("clear.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                  if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_11.doCatch(th);
                } finally {
                  __jsp_taghandler_11.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write("\" onclick=\"makeAddVisible();paramPropertyEditable(); return false;\"/>      \n");
              
                      }
                      // Muestra la accion de actualizar o agregar dependiendo de si se ha seleccionado un renglon de la lista paginada
                      if((StringUtils.hasText(updateUrl) && Boolean.valueOf(request.getParameter(selectPath)))
                          || (Boolean.valueOf(request.getParameter(updatePath)) && TagUtils.hasErrors(pageContext))) {
                          if(StringUtils.hasText(saveUrl)) {
              
              out.write("\n                <input id=\"");
              out.print(htmlUniqueSaveID);
              out.write("\" type=\"image\" alt=\"agregar\" style=\"display:none;\" path=\"");
              out.print(savePath);
              out.write("\" action=\"");
              out.print(saveUrl);
              out.write("\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_7);
                __jsp_taghandler_12.setCode("add.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_12.doCatch(th);
                } finally {
                  __jsp_taghandler_12.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write("\" onclick=\"return doSubmit(");
              out.print(htmlUniqueSaveID);
              out.write(");\" />    \n");
              
                          }
              
              out.write("\n            <input type=\"hidden\" id=\"");
              out.print(paramId);
              out.write("\" name=\"");
              out.print(paramId);
              out.write("\" value=\"");
              out.print(request.getParameter(paramId));
              out.write("\"/>\n            <input id=\"");
              out.print(htmlUniqueUpdateID);
              out.write("\" type=\"image\" alt=\"aceptar\" path=\"");
              out.print(updatePath);
              out.write("\" action=\"");
              out.print(updateUrl);
              out.write("\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_7);
                __jsp_taghandler_13.setCode("acept.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                  if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_13.doCatch(th);
                } finally {
                  __jsp_taghandler_13.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write("\"  onclick=\"return doSubmit(");
              out.print(htmlUniqueUpdateID);
              out.write(");\"/>\n");
              
                      } else {
                          if(StringUtils.hasText(saveUrl)) {
              
              out.write("\n                <input id=\"");
              out.print(htmlUniqueSaveID);
              out.write("\" type=\"image\" alt=\"agregar\" path=\"");
              out.print(savePath);
              out.write("\" action=\"");
              out.print(saveUrl);
              out.write("\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_7);
                __jsp_taghandler_14.setCode("add.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                  if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_14.doCatch(th);
                } finally {
                  __jsp_taghandler_14.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
              }
              out.write("\" onclick=\"return doSubmit(");
              out.print(htmlUniqueSaveID);
              out.write(");\" />    \n");
              
                          }
                          if(StringUtils.hasText(updateUrl)) {
              
              out.write("\n                <input id=\"");
              out.print(htmlUniqueUpdateID);
              out.write("\" type=\"image\" alt=\"aceptar\" style=\"display:none;\" path=\"");
              out.print(updatePath);
              out.write("\" action=\"");
              out.print(updateUrl);
              out.write("\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_7);
                __jsp_taghandler_15.setCode("acept.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                  if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_15.doCatch(th);
                } finally {
                  __jsp_taghandler_15.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write("\"  onclick=\"return doSubmit(");
              out.print(htmlUniqueUpdateID);
              out.write(");\"/>\n");
              
                          }
                      }
              
              out.write("\n        </td>\n      </tr>\n    ");
            } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
        }
        out.write("\n");
        
            if(Boolean.valueOf((String)request.getParameter(searchPath)) && !TagUtils.hasErrors(pageContext)) {
                pageContext.setAttribute("applyFilters", "true");
            }
        
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
          __jsp_taghandler_16.setParent(null);
          __jsp_taghandler_16.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tagutils:createPagedList(pageContext,sourceName,sourceType,'','')}",java.lang.Boolean.class, __ojsp_varRes, __ojsp_fnmappers[0])));
          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n");
              
                  List data = (List)pageContext.getRequest().getAttribute(pageContext.getAttribute("displaySource").toString());
                  if(!data.isEmpty()) {
                      List<String> orderedKeys = ((DynaDTO)data.get(0)).getKeys();
              
                      Map currentRow = null;
                      String title = null;
                      String property = null;
                      String format = "";
                      paramProperty = getParamProperty(paramProperty, orderedKeys);
              
                      if(!Boolean.valueOf(showParamProperty)) {
                          orderedKeys.remove(0);
                      }
              
              out.write("\n        <!-- Define la lista paginada, incluyendo una columna al final de los renglones con la accion de eliminar el renglon seleccionado -->  \n        <!-- Utiliza el decorator: gob.shcp.fsn.control.view.decorator.PagedListTableDecorator que incluye al inicio de la tabla el primer renglon definido anteriormente en la variable: START_ROW_CONTENT -->\n        ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
                __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                __jsp_taghandler_17.setCode("confirm.delete");
                __jsp_taghandler_17.setVar("removeMessage");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                  if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_17.doCatch(th);
                } finally {
                  __jsp_taghandler_17.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
              }
              out.write("\n        ");
              {
                org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
                __jsp_taghandler_18.setParent(__jsp_taghandler_16);
                __jsp_taghandler_18.setVar("_url");
                __jsp_taghandler_18.setScope("page");
                __jsp_taghandler_18.setValue("/..");
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write("\n");
              
                      String url = (String)pageContext.getAttribute("_url", PageContext.PAGE_SCOPE);
              
              out.write("\n        ");
              {
                org.displaytag.tags.TableTag __jsp_taghandler_19=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
                __jsp_taghandler_19.setParent(__jsp_taghandler_16);
                __jsp_taghandler_19.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${displaySource}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_19.setPagesize(10);
                __jsp_taghandler_19.setDecorator("gob.shcp.fsn.control.view.decorator.PagedListTableDecorator");
                __jsp_taghandler_19.setRequestURI(OracleJspRuntime.toStr( pagedUrl));
                __jsp_taghandler_19.setClass("displaytag");
                __jsp_taghandler_19.setExport(OracleJspRuntime.toBoolean( export));
                __jsp_taghandler_19.setUid("rows");
                __jsp_taghandler_19.setSort("list");
                java.lang.Object rows = null;
                java.lang.Integer rows_rowNum = null;
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
                  do {
                    rows = (java.lang.Object) pageContext.findAttribute("rows");
                    rows_rowNum = (java.lang.Integer) pageContext.findAttribute("rows_rowNum");
                    out.write("\n");
                    
                                currentRow = (Map)pageContext.getAttribute("rows");
                                for(int i=0; i<orderedKeys.size(); i++) {
                                    title = getTitle(pageContext, tableHeaders, orderedKeys, i);
                                    property = orderedKeys.get(i);
                    
                                    if(currentRow.get(property) instanceof java.util.Date) {
                                        format = "{0,date,"+dateFormat+"}";
                                    }
                    
                                    if(i==0) {
                                        if(StringUtils.hasText(selectUrl)) {
                                            selectUrl = TagUtils.appendUrlParam(selectUrl,selectPath,"true");
                    
                    out.write("\n                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_20=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title sortable format href paramId paramProperty");
                      __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_20.setProperty(OracleJspRuntime.toStr( property));
                      __jsp_taghandler_20.setTitle(OracleJspRuntime.toStr( title));
                      __jsp_taghandler_20.setSortable(true);
                      __jsp_taghandler_20.setFormat(OracleJspRuntime.toStr( format));
                      __jsp_taghandler_20.setHref(OracleJspRuntime.toStr( selectUrl));
                      __jsp_taghandler_20.setParamId(OracleJspRuntime.toStr( paramId));
                      __jsp_taghandler_20.setParamProperty(OracleJspRuntime.toStr( paramProperty));
                      __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                      if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,3);
                    }
                    out.write("\n");
                    
                                        } else {
                    
                    out.write("\n                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_21=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title sortable format");
                      __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_21.setProperty(OracleJspRuntime.toStr( property));
                      __jsp_taghandler_21.setTitle(OracleJspRuntime.toStr( title));
                      __jsp_taghandler_21.setSortable(true);
                      __jsp_taghandler_21.setFormat(OracleJspRuntime.toStr( format));
                      __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                      if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,3);
                    }
                    out.write("\n");
                    
                                        }
                                    } else {
                    
                    out.write("\n                    ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_22=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title format");
                      __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_22.setProperty(OracleJspRuntime.toStr( property));
                      __jsp_taghandler_22.setTitle(OracleJspRuntime.toStr( title));
                      __jsp_taghandler_22.setFormat(OracleJspRuntime.toStr( format));
                      __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                      if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,3);
                    }
                    out.write("\n");
                    
                                    }
                                }
                    
                    out.write("\n            ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_23=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag media href paramId paramProperty");
                      __jsp_taghandler_23.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_23.setMedia("html");
                      __jsp_taghandler_23.setHref(OracleJspRuntime.toStr( deleteUrl));
                      __jsp_taghandler_23.setParamId(OracleJspRuntime.toStr( paramId));
                      __jsp_taghandler_23.setParamProperty(OracleJspRuntime.toStr( paramProperty));
                      __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_23,__jsp_tag_starteval,out);
                        do {
                          out.write("\n");
                          
                                          if(StringUtils.hasText(deleteUrl)) {
                          
                          out.write("\n                    <img alt=\"eliminar\" src=\"");
                          {
                            org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                            __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_24.setCode("delete.gif");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                              if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                            } catch (Throwable th) {
                              __jsp_taghandler_24.doCatch(th);
                            } finally {
                              __jsp_taghandler_24.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,4);
                          }
                          out.write("\" height=\"20\" width=\"20\" onclick=\"return confirm('");
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                            __jsp_taghandler_25.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_25.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${removeMessage}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                            if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,4);
                          }
                          out.write("');\"/>\n");
                          
                                          }
                          
                          out.write("\n            ");
                        } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,3);
                    }
                    out.write("\n            ");
                    {
                      org.displaytag.tags.SetPropertyTag __jsp_taghandler_26=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                      __jsp_taghandler_26.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_26.setName("paging.banner.placement");
                      __jsp_taghandler_26.setValue("bottom");
                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                    }
                    out.write("\n            ");
                    {
                      org.displaytag.tags.SetPropertyTag __jsp_taghandler_27=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                      __jsp_taghandler_27.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_27.setName("url.context_path");
                      __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_27,__jsp_tag_starteval,out);
                        do {
                          out.print(request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+url);
                        } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,3);
                    }
                    out.write("\n            ");
                    {
                      org.displaytag.tags.SetPropertyTag __jsp_taghandler_28=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                      __jsp_taghandler_28.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_28.setName("export.csv");
                      __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_28,__jsp_tag_starteval,out);
                        do {
                          out.print(exportProps.contains("csv"));
                        } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,3);
                    }
                    out.write("\n            ");
                    {
                      org.displaytag.tags.SetPropertyTag __jsp_taghandler_29=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                      __jsp_taghandler_29.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_29.setName("export.excel");
                      __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
                        do {
                          out.print(exportProps.contains("excel"));
                        } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,3);
                    }
                    out.write("\n            ");
                    {
                      org.displaytag.tags.SetPropertyTag __jsp_taghandler_30=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                      __jsp_taghandler_30.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_30.setName("export.xml");
                      __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_30,__jsp_tag_starteval,out);
                        do {
                          out.print(exportProps.contains("xml"));
                        } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,3);
                    }
                    out.write("\n            ");
                    {
                      org.displaytag.tags.SetPropertyTag __jsp_taghandler_31=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                      __jsp_taghandler_31.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_31.setName("export.pdf");
                      __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_31,__jsp_tag_starteval,out);
                        do {
                          out.print(exportProps.contains("pdf"));
                        } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,3);
                    }
                    out.write("\n        ");
                  } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                }
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write("\n");
              
                      if(Boolean.valueOf(request.getParameter(selectPath)) && StringUtils.hasText(updateUrl) && !Boolean.valueOf(editParamProperty)
                          || (Boolean.valueOf(request.getParameter(updatePath)) && TagUtils.hasErrors(pageContext)) && !Boolean.valueOf(editParamProperty)) {
              
              out.write("\n            <script type=\"text/javascript\">\n                var inputElement = document.getElementById(\"");
              out.print(paramProperty);
              out.write("\");\n                if(inputElement) {\n                    inputElement.disabled=true;\n                }\n            </script>\n");
              
                      }
                  } else {
              
              out.write("\n        <table align=\"center\" class=\"displaytag\">\n            <tr>\n");
               
                              for(String header: tableHeaders) {
                                  header = TagUtils.getPropertyResourcesValue(pageContext, header);
              
              out.write("\n                   <th width=\"23%\">");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_32.setParent(__jsp_taghandler_16);
                __jsp_taghandler_32.setValue(header);
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,2);
              }
              out.write("</th>\n");
              
                              }
              
              out.write("\n                <th align=\"center\">&nbsp;</th>        \n            </tr>\n            ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                __jsp_taghandler_33.setParent(__jsp_taghandler_16);
                __jsp_taghandler_33.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${START_ROW_CONTENT}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_33.setEscapeXml(false);
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
              }
              out.write("\n        </table>\n        <table width=\"100%\">\n            <tr>\n                <td colspan=\"\">\n                    <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_34.setParent(__jsp_taghandler_16);
                __jsp_taghandler_34.setCode(OracleJspRuntime.toStr( emptyContentMessage));
                try {
                  __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                  if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_34.doCatch(th);
                } finally {
                  __jsp_taghandler_34.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,2);
              }
              out.write("<br><br></span>\n                </td>\n            </tr>\n        </table>\n");
              
                  }
              
              out.write("\n    <script type=\"text/javascript\">\n        function makeAddVisible() {\n            var saveAction = document.getElementById(\"");
              out.print(htmlUniqueSaveID);
              out.write("\");\n            var updateAction = document.getElementById(\"");
              out.print(htmlUniqueUpdateID);
              out.write("\");\n            if(saveAction != null && updateAction != null) {\n                saveAction.style.display = 'inline';\n                updateAction.style.display = 'none';\n            }\n        }\n        function paramPropertyEditable() {\n            var inputElement = document.getElementById(\"");
              out.print(paramProperty);
              out.write("\");\n            if(inputElement) {\n                inputElement.disabled=false;\n            }\n        }\n    </script>\n    ");
            } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,1);
        }
        out.write("\n");
        
        } catch(javax.servlet.jsp.SkipPageException ignore) {
        	//Ignore exception due "displayAjax" request parameter equals true when this tag includes body (AjaxDisplayTag.java)
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        out.write("\n\n");
        out.write("\n");
      } catch( Throwable t ) {
        if (t instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) t;
        if (t instanceof IllegalStateException)
            throw (IllegalStateException) t;
        if (t instanceof java.io.IOException)
            throw (java.io.IOException) t;
        if (t instanceof javax.servlet.jsp.JspException)
            throw (javax.servlet.jsp.JspException) t;
        throw new javax.servlet.jsp.JspException(t);
      }
      finally {
        ((oracle.jsp.runtime.OracleJspContextWrapper) jspContext).syncVariableEndTagFile();
        OracleJspRuntime.releaseTagHandlers(pageContext);
      }
    }

    public TagInfo getTagInfo(TagLibraryInfo tlib)
    {
      if (tagInfo != null)
        return tagInfo;

      TagVariableInfo[] tagVariableInfos = new TagVariableInfo[0];
      TagAttributeInfo[] tagAttributeInfo = {
        new TagAttributeInfo("headerList",true,"java.lang.String",true,false),
        new TagAttributeInfo("startRow",true,"java.lang.String",true,false),
        new TagAttributeInfo("pagedUrl",true,"java.lang.String",true,false),
        new TagAttributeInfo("beanName",false,"java.lang.String",true,false),
        new TagAttributeInfo("service",false,"java.lang.String",true,false),
        new TagAttributeInfo("searchUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("deleteUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("updateUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("saveUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("selectUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("searchPath",false,"java.lang.String",true,false),
        new TagAttributeInfo("updatePath",false,"java.lang.String",true,false),
        new TagAttributeInfo("savePath",false,"java.lang.String",true,false),
        new TagAttributeInfo("paramProperty",false,"java.lang.String",true,false),
        new TagAttributeInfo("paramId",false,"java.lang.String",true,false),
        new TagAttributeInfo("showParamProperty",false,"java.lang.String",true,false),
        new TagAttributeInfo("editParamProperty",false,"java.lang.String",true,false),
        new TagAttributeInfo("onClear",false,"java.lang.String",true,false),
        new TagAttributeInfo("dateFormat",false,"java.lang.String",true,false),
        new TagAttributeInfo("exportTypes",false,"java.lang.String",true,false),
        new TagAttributeInfo("emptyContentMessage",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("quickCapture","_oracle._jsp._tag._quickCapture_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
