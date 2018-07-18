package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;
import gob.shcp.fsn.model.support.FilterDTO;
import gob.shcp.bpm.model.TaskListItemDTO;
import gob.shcp.fsn.service.support.DynaContentService;
import gob.shcp.fsn.model.support.DynaDTO;
import gob.shcp.fsn.control.view.util.TagUtils;
import org.springframework.web.servlet.support.RequestContext;
import gob.shcp.fsn.control.binder.ControllerWebBindingInitializer;
import gob.shcp.fsn.control.view.decorator.CheckboxTableDecorator;


public class _tasksList_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
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


    private String getTitle(PageContext pageContext, String[] tableHeaders, String[] keys, int idx) {
        String title;
        if(idx < tableHeaders.length) {
            title = tableHeaders[idx];
        } else {
            title = keys[idx];
        }
        return TagUtils.getPropertyResourcesValue(pageContext, title);
    }

  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String pagedUrl;
  private java.lang.String imageUrl;
  private java.lang.String headers;
  private java.lang.String columns;
  private java.lang.String dateFormat;
  private java.lang.String height;
  private java.lang.String width;
  private java.lang.String maxLength;
  private java.lang.String showActionFirst;
  private java.lang.String checkbox;
  private java.lang.String checkProperty;
  private java.lang.String dispatchToolTip;
  private java.lang.String dispatchUrl;
  private java.lang.String assignUrl;
  private java.lang.String assignToolTip;
  private java.lang.String filterId;

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

  public void setPagedUrl(java.lang.String pagedUrl)
  {
    this.pagedUrl = pagedUrl;
  }

  public java.lang.String getPagedUrl()
  {
    return this.pagedUrl;
  }

  public void setImageUrl(java.lang.String imageUrl)
  {
    this.imageUrl = imageUrl;
  }

  public java.lang.String getImageUrl()
  {
    return this.imageUrl;
  }

  public void setHeaders(java.lang.String headers)
  {
    this.headers = headers;
  }

  public java.lang.String getHeaders()
  {
    return this.headers;
  }

  public void setColumns(java.lang.String columns)
  {
    this.columns = columns;
  }

  public java.lang.String getColumns()
  {
    return this.columns;
  }

  public void setDateFormat(java.lang.String dateFormat)
  {
    this.dateFormat = dateFormat;
  }

  public java.lang.String getDateFormat()
  {
    return this.dateFormat;
  }

  public void setHeight(java.lang.String height)
  {
    this.height = height;
  }

  public java.lang.String getHeight()
  {
    return this.height;
  }

  public void setWidth(java.lang.String width)
  {
    this.width = width;
  }

  public java.lang.String getWidth()
  {
    return this.width;
  }

  public void setMaxLength(java.lang.String maxLength)
  {
    this.maxLength = maxLength;
  }

  public java.lang.String getMaxLength()
  {
    return this.maxLength;
  }

  public void setShowActionFirst(java.lang.String showActionFirst)
  {
    this.showActionFirst = showActionFirst;
  }

  public java.lang.String getShowActionFirst()
  {
    return this.showActionFirst;
  }

  public void setCheckbox(java.lang.String checkbox)
  {
    this.checkbox = checkbox;
  }

  public java.lang.String getCheckbox()
  {
    return this.checkbox;
  }

  public void setCheckProperty(java.lang.String checkProperty)
  {
    this.checkProperty = checkProperty;
  }

  public java.lang.String getCheckProperty()
  {
    return this.checkProperty;
  }

  public void setDispatchToolTip(java.lang.String dispatchToolTip)
  {
    this.dispatchToolTip = dispatchToolTip;
  }

  public java.lang.String getDispatchToolTip()
  {
    return this.dispatchToolTip;
  }

  public void setDispatchUrl(java.lang.String dispatchUrl)
  {
    this.dispatchUrl = dispatchUrl;
  }

  public java.lang.String getDispatchUrl()
  {
    return this.dispatchUrl;
  }

  public void setAssignUrl(java.lang.String assignUrl)
  {
    this.assignUrl = assignUrl;
  }

  public java.lang.String getAssignUrl()
  {
    return this.assignUrl;
  }

  public void setAssignToolTip(java.lang.String assignToolTip)
  {
    this.assignToolTip = assignToolTip;
  }

  public java.lang.String getAssignToolTip()
  {
    return this.assignToolTip;
  }

  public void setFilterId(java.lang.String filterId)
  {
    this.filterId = filterId;
  }

  public java.lang.String getFilterId()
  {
    return this.filterId;
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
        pageContext.setAttribute("pagedUrl", getPagedUrl());
        pageContext.setAttribute("imageUrl", getImageUrl());
        pageContext.setAttribute("headers", getHeaders());
        pageContext.setAttribute("columns", getColumns());
        pageContext.setAttribute("dateFormat", getDateFormat());
        pageContext.setAttribute("height", getHeight());
        pageContext.setAttribute("width", getWidth());
        pageContext.setAttribute("maxLength", getMaxLength());
        pageContext.setAttribute("showActionFirst", getShowActionFirst());
        pageContext.setAttribute("checkbox", getCheckbox());
        pageContext.setAttribute("checkProperty", getCheckProperty());
        pageContext.setAttribute("dispatchToolTip", getDispatchToolTip());
        pageContext.setAttribute("dispatchUrl", getDispatchUrl());
        pageContext.setAttribute("assignUrl", getAssignUrl());
        pageContext.setAttribute("assignToolTip", getAssignToolTip());
        pageContext.setAttribute("filterId", getFilterId());


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
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
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        
        try {
            /*  
            *  Posibles valores para las propiedades a mostrar:
            *        "processKey", "folio", "taskName", "taskCreate",
            *        "taskStart", "taskDueDate", "processName", "processStart"   
            */
            String[] tableColumns = {"processKey", "folio", "taskName", "taskCreate", "taskStart", "taskDueDate", "processName", "processStart"};
            String[] tableHeaders = tableColumns;
            Map parentValuesMap = new HashMap();
            String parentValues = null;
            String tableDecorator = "";
            boolean isMultiple = false;
            boolean isMultipleDispatch = false;
            boolean isMultipleAssign = false;
        
            if (filterId==null || "".equals(filterId) ){
                filterId = DynaContentService.PAGED_LIST_FILTER;
            }
            if(checkbox != null && !"".equals(checkbox)) {
                isMultiple = Boolean.valueOf(checkbox);
                //Para 'Dispatch Multiple' es necesario especificar un valor en el atributo 'checkProperty' la cual debera ser una propiedad en el dto de negocio. 
                //Para reasignación de tareas se toma como default la propiedad 'idsAssign' que se encuentra en el dto 'BpmTaskDTO'.
                checkProperty = checkProperty != null ? checkProperty : "idsAssign"; 
                dispatchToolTip = dispatchToolTip != null ? dispatchToolTip : "dispatch";
                assignToolTip = assignToolTip != null ? assignToolTip : "assign";
                isMultipleDispatch = (dispatchUrl != null && !"".equals(dispatchUrl)) ? true : false;
                isMultipleAssign = (assignUrl != null && !"".equals(assignUrl)) ? true : false;
            }
        
            if(columns != null) {
                Map tableColumnsMap = new HashMap();
                for (int i = 0; i < tableColumns.length; i++) {
                    tableColumnsMap.put(tableColumns[i], tableColumns[i]);
                }
                tableColumns = columns.split(",");
        
                final String defaultType = "stringvalue_";
                final Map supportedDataTypes = new HashMap();
                supportedDataTypes.put("STRING", "stringvalue_");
                supportedDataTypes.put("SHORT", "longvalue_");
                supportedDataTypes.put("INTEGER", "longvalue_");
                supportedDataTypes.put("LONG", "longvalue_");
                supportedDataTypes.put("FLOAT", "doublevalue_");
                supportedDataTypes.put("DOUBLE", "doublevalue_");
                supportedDataTypes.put("DATE", "datevalue_");
        
                StringBuffer buffer = new StringBuffer();
                final Properties businessColumns = (Properties)pageContext.getAttribute(TagUtils.BUSINESS_COLUMNS_TYPES, PageContext.REQUEST_SCOPE);
                if(businessColumns != null) {
                    for(Iterator iterator = businessColumns.keySet().iterator(); iterator.hasNext();) {
                        String businessColumn = (String) iterator.next();
                        if(!tableColumnsMap.containsKey(businessColumn)) {
                            final String columnType = String.valueOf(businessColumns.get(businessColumn));
                            StringBuffer sb = new StringBuffer();
                            sb.append(businessColumn).append("_.");
        
                            //Si la columna NO es de alguno de los tipos permitidos se asigna el default 'string'
                            if(supportedDataTypes.containsKey(columnType.toUpperCase())) {
                                sb.append(String.valueOf(supportedDataTypes.get(columnType.toUpperCase())));
                            } else {
                                sb.append(defaultType);
                            }
        
                            businessColumns.put(businessColumn, sb.toString());
                            buffer.append(sb.toString()).append(",");
                        }
                    }
                }
        
                if (buffer.length() > 0)  {
                    parentValues = buffer.deleteCharAt(buffer.lastIndexOf(",")).toString();
                }
        
                FilterDTO filterDTO = (FilterDTO)request.getAttribute(filterId);
                if(filterDTO != null){
                List<Object[]> filters = filterDTO.get();
                    if (filters != null && !filters.isEmpty()) {
                        for (Object[] filter : filters) {
                            if (businessColumns.containsKey(String.valueOf(filter[0]))) {
                                filter[0]=businessColumns.get(filter[0]);
                            }
                        }        	
                    }                
                }
        
                tableHeaders = columns.split(",");
            }
        
            if(headers != null) {
                tableHeaders = headers.split(",");
            }
        
            dateFormat = (dateFormat!=null && !"".equals(dateFormat)) ? dateFormat : "dd/MM/yyyy HH:mm";
            width = width != null ? width + "px" : "1000px";
            height = height != null ? height + "px" : "auto";
            maxLength = maxLength != null ? maxLength : "50";
            boolean isActionFirst = Boolean.valueOf(showActionFirst);
            Integer taskUniqueSearchID = TagUtils.getHtmlUniqueId(pageContext);
        
            boolean showImageLink = imageUrl != null ? true : false;
            String detailLink = null;
            if(showImageLink) {
                detailLink = TagUtils.formatUrl(imageUrl);
        
        out.write("\n        ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setVar("_hrefDetail");
          __jsp_taghandler_1.setScope("page");
          __jsp_taghandler_1.setValue(OracleJspRuntime.toStr( detailLink));
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("        \n");
        
                detailLink = (String)pageContext.getAttribute("_hrefDetail", PageContext.PAGE_SCOPE);
            }
        
            Integer taskDispatchMultipleID = 0;
            Integer taskAssignMultipleID = 0;
            if(isMultiple) {
                if (isMultipleDispatch)  {
                dispatchUrl = TagUtils.formatUrl(dispatchUrl);
                taskDispatchMultipleID = TagUtils.getHtmlUniqueId(pageContext);
        
        out.write("\n        ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setVar("_hrefDispatch");
          __jsp_taghandler_2.setScope("page");
          __jsp_taghandler_2.setValue(OracleJspRuntime.toStr( dispatchUrl));
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n");
        
                dispatchUrl = (String)pageContext.getAttribute("_hrefDispatch", PageContext.PAGE_SCOPE);                
                }
                
                if (isMultipleAssign)  {
                assignUrl = TagUtils.formatUrl(assignUrl);
                taskAssignMultipleID = TagUtils.getHtmlUniqueId(pageContext);
        
        out.write("\n        ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setVar("_hrefAssign");
          __jsp_taghandler_3.setScope("page");
          __jsp_taghandler_3.setValue(OracleJspRuntime.toStr( assignUrl));
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
        }
        out.write("\n");
        
                assignUrl = (String)pageContext.getAttribute("_hrefAssign", PageContext.PAGE_SCOPE);
                }
            }
        
            pagedUrl = TagUtils.formatUrl(pagedUrl);
        
            List<String> dateKeys = new ArrayList<String>();
            dateKeys.add("taskCreate");
            dateKeys.add("taskStart");
            dateKeys.add("taskDueDate");
            dateKeys.add("processStart");
        
        out.write("\n    <!--  Urls de las acciones del tag -->\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setVar("_pagedUrl");
          __jsp_taghandler_4.setScope("page");
          __jsp_taghandler_4.setValue(OracleJspRuntime.toStr( pagedUrl));
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
        }
        out.write("\n");
        
            pagedUrl = (String)pageContext.getAttribute("_pagedUrl", PageContext.PAGE_SCOPE);
        
        out.write("\n\n<!-- Componentes de captura para el encabezado -->\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
          __jsp_taghandler_5.setParent(null);
          __jsp_taghandler_5.setVar("ACTIONS_BUTTONS");
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
            do {
              out.write("\n    <td nowrap=\"nowrap\">\n        <input id=\"");
              out.print(taskUniqueSearchID);
              out.write("\" title=\"Buscar\" type=\"image\" alt=\"buscar\" path=\"\" action=\"");
              out.print(pagedUrl);
              out.write("\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                __jsp_taghandler_6.setCode("help.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                  if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_6.doCatch(th);
                } finally {
                  __jsp_taghandler_6.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write("\"  onclick=\"return doSubmit(");
              out.print(taskUniqueSearchID);
              out.write(");\"/>\n        &nbsp;\n        <input type=\"image\" title=\"Limpiar\" alt=\"limpiar\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                __jsp_taghandler_7.setCode("clear.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                  if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_7.doCatch(th);
                } finally {
                  __jsp_taghandler_7.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write("\" onclick=\"clearTaskFields(); return false;\"/>\n    </td>\n");
            } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
        }
        out.write("\n\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
          __jsp_taghandler_8.setParent(null);
          __jsp_taghandler_8.setVar("START_ROW_CONTENT");
          __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
            do {
              out.write("\n  <tr>\n");
              
                  if(isActionFirst) {
              
              out.write("\n        ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ACTIONS_BUTTONS}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_9.setEscapeXml(false);
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write("\n");
              
                  }
                  
                  if(isMultiple) {
              
              out.write("\n    <td nowrap=\"nowrap\">\n");
              
                  if(isMultipleDispatch){
              
              out.write("\n        <input id=\"");
              out.print(taskDispatchMultipleID);
              out.write("\" title=\"");
              out.print(dispatchToolTip);
              out.write("\" type=\"image\" alt=\"dispatch\" action=\"");
              out.print(dispatchUrl);
              out.write("\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                __jsp_taghandler_10.setCode("auth.gif");
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
              out.write("\"  onclick=\"return doSubmit(");
              out.print(taskDispatchMultipleID);
              out.write(");\"/>\n");
                  
                  }
                  
                  if(isMultipleAssign){
              
              out.write("\n        <input id=\"");
              out.print(taskAssignMultipleID);
              out.write("\" title=\"");
              out.print(assignToolTip);
              out.write("\" type=\"image\" alt=\"assign\" action=\"");
              out.print(assignUrl);
              out.write("\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_8);
                __jsp_taghandler_11.setCode("auth.gif");
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
              out.write("\"  onclick=\"return doSubmit(");
              out.print(taskAssignMultipleID);
              out.write(");\"/>\n");
                   
                  }
              
              out.write("\n    </td>\n");
              
                  }
                  for(String atrName: tableColumns) {
                      String businessfield = (String)pageContext.getAttribute("BUSINESS_FIELD_" + atrName, PageContext.REQUEST_SCOPE);
              
              out.write("\n        ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_12.setParent(__jsp_taghandler_8);
                __jsp_taghandler_12.setVar("bField");
                __jsp_taghandler_12.setValue(businessfield);
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write("\n");
              
                      if(atrName != null && !"".equals(atrName.trim()) && dateKeys.contains(atrName.trim())) {
              
              out.write("\n            <td nowrap=\"nowrap\">\n                <input type=\"text\" maxlength=\"10\" name=\"");
              out.print(atrName);
              out.write("\" id=\"");
              out.print(atrName);
              out.write("\" size=\"11\"/>\n                <span class=\"calendar\">\n                    <a href=\"javascript:void(0)\" id=\"button");
              out.print(atrName);
              out.write("\">\n                        <img src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_8);
                __jsp_taghandler_13.setCode("background.gif");
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
              out.write("\" alt=\"calendar\" width=\"20\" height=\"20\"/>\n                    </a>\n                </span>\n                a\n                <input type=\"text\" maxlength=\"10\" name=\"");
              out.print(atrName);
              out.write("End\" id=\"");
              out.print(atrName);
              out.write("End\" size=\"11\"/>\n                <span class=\"calendar\">\n                    <a href=\"javascript:void(0)\" id=\"button");
              out.print(atrName);
              out.write("End\">\n                        <img src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_8);
                __jsp_taghandler_14.setCode("background.gif");
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
              out.write("\" alt=\"calendar\" width=\"20\" height=\"20\"/>\n                    </a>\n                </span>\n            </td>\n            <script type=\"text/javascript\">\n                Calendar.setup({\n                    inputField     :    \"");
              out.print(atrName);
              out.write("\",\n                    ifFormat       :    \"%d/%m/%Y\",\n                    showsTime      :    false,\n                    button         :    \"button");
              out.print(atrName);
              out.write("\",\n                    step           :    1\n                });\n                Calendar.setup({\n                    inputField     :    \"");
              out.print(atrName);
              out.write("End\",\n                    ifFormat       :    \"%d/%m/%Y\",\n                    showsTime      :    false,\n                    button         :    \"button");
              out.print(atrName);
              out.write("End\",\n                    step           :    1\n                });\n            </script>\n");
              
                      } else {
              
              out.write("\n            ");
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_15.setParent(__jsp_taghandler_8);
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n                ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                      __jsp_taghandler_16.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${bField != null && bField != ''}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\n                    ");
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                            __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                            __jsp_taghandler_17.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${bField}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_taghandler_17.setEscapeXml(false);
                            __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                            if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,4);
                          }
                          out.write("\n                ");
                        } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,3);
                    }
                    out.write("\n                ");
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_18.setParent(__jsp_taghandler_15);
                      __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\n                    <td nowrap=\"nowrap\">\n                        <input type=\"text\" id=\"");
                          out.print(atrName);
                          out.write("\" name=\"");
                          out.print(atrName);
                          out.write("\"/>\n                    </td>\n                ");
                        } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,3);
                    }
                    out.write("\n            ");
                  } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write("\n");
              
                      }
                  }
                  if(isActionFirst == false) {
              
              out.write("\n        ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                __jsp_taghandler_19.setParent(__jsp_taghandler_8);
                __jsp_taghandler_19.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ACTIONS_BUTTONS}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_19.setEscapeXml(false);
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write("\n");
              
                  }
              
              out.write("\n  </tr>\n");
            } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
          if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
        }
        out.write("\n\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
          __jsp_taghandler_20.setParent(null);
          __jsp_taghandler_20.setVar("EMPTY_TASK_LIST");
          __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_20,__jsp_tag_starteval,out);
            do {
              out.write("\n    <!-- Creacion de tabla vacia solo con campos de captura cuando no se encuentran tareas -->\n    <div id=\"taskListDiv\" align=\"center\" style=\"height:");
              out.print(height);
              out.write(";width:");
              out.print(width);
              out.write(";overflow:auto;\">\n        <table align=\"center\" class=\"displaytag\">\n            <tr>\n");
              
                              if(isActionFirst) {
              
              out.write("\n                   <th align=\"center\"></th>\n");
              
                              }
                              if(isMultiple) {
              
              out.write("\n                   <th align=\"center\"></th>\n");
              
                              }
                              String propertyHeader = null;
                              for(int i=0; i<tableColumns.length; i++) {
                                  propertyHeader = getTitle(pageContext, tableHeaders, tableColumns, i);
              
              out.write("\n                   <th>");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                __jsp_taghandler_21.setValue(propertyHeader);
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write("</th>\n");
              
                              }
                              if(isActionFirst == false) {
              
              out.write("\n                   <th align=\"center\"></th>\n");
              
                              }
              
              out.write("\n            </tr>\n            ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                __jsp_taghandler_22.setParent(__jsp_taghandler_20);
                __jsp_taghandler_22.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${START_ROW_CONTENT}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_22.setEscapeXml(false);
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
              }
              out.write("\n        </table>\n    </div>\n");
            } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
          if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,1);
        }
        out.write("\n\n<!-- Llamado al servicio para la creacion de la lista de tareas -->\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
          __jsp_taghandler_23.setParent(null);
          __jsp_taghandler_23.setVar("applyFilters");
          __jsp_taghandler_23.setValue("true");
          __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
          if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,1);
        }
        out.write("\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
          __jsp_taghandler_24.setParent(null);
          __jsp_taghandler_24.setVar("applyEqualFilter");
          __jsp_taghandler_24.setValue("true");
          __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
          if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,1);
        }
        out.write("\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
          __jsp_taghandler_25.setParent(null);
          __jsp_taghandler_25.setVar("parentValues");
          __jsp_taghandler_25.setValue(parentValues);
          __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
          if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,1);
        }
        out.write("\n");
        {
          org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
          __jsp_taghandler_26.setParent(null);
          __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n    ");
              {
                org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                __jsp_taghandler_27.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tagutils:createPagedList(pageContext,'gob.shcp.bpm.service.TaskInstanceService','service','', parentValues)}",java.lang.Boolean.class, __ojsp_varRes, __ojsp_fnmappers[0])));
                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n");
                    
                            List data = (List)pageContext.getRequest().getAttribute(pageContext.getAttribute("displaySource").toString());
                            if(!data.isEmpty()) {
                                TaskListItemDTO currentRow = null;
                                String format = null;
                                String propertyHeader = null;
                                String propertyName = null;
                                String processLink = null;
                    
                    out.write("\n          <!-- Creacion de la lista de tareas asignadas -->\n          <div id=\"taskListDiv\" align=\"center\" style=\"height:");
                    out.print(height);
                    out.write("px;width:");
                    out.print(width);
                    out.write("px;overflow:auto;\">\n            ");
                    {
                      org.displaytag.tags.TableTag __jsp_taghandler_28=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class id sort");
                      __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                      __jsp_taghandler_28.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${displaySource}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_28.setPagesize(10);
                      __jsp_taghandler_28.setDecorator("gob.shcp.fsn.control.view.decorator.PagedListTableDecorator");
                      __jsp_taghandler_28.setRequestURI(OracleJspRuntime.toStr( pagedUrl));
                      __jsp_taghandler_28.setClass("displaytag");
                      __jsp_taghandler_28.setUid("row");
                      __jsp_taghandler_28.setSort("list");
                      java.lang.Object row = null;
                      java.lang.Integer row_rowNum = null;
                      __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_28,__jsp_tag_starteval,out);
                        do {
                          row = (java.lang.Object) pageContext.findAttribute("row");
                          row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
                          out.write("\n");
                          
                                          for(int i=0; i<tableColumns.length; i++) {
                                              propertyName = tableColumns[i];
                                              if(propertyName!=null && !"".equals(propertyName.trim())) {
                                                  currentRow = (TaskListItemDTO)pageContext.getAttribute("row");
                          
                                                  if(i==0 && isActionFirst) {
                          
                          out.write("\n                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_29=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag");
                            __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                            __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
                              do {
                                out.write("\n");
                                
                                                                processLink = TagUtils.formatUrl(currentRow.getActionUrl());
                                
                                out.write("\n                                ");
                                {
                                  org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
                                  __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                                  __jsp_taghandler_30.setVar("_hrefProcess");
                                  __jsp_taghandler_30.setScope("page");
                                  __jsp_taghandler_30.setValue(OracleJspRuntime.toStr( processLink));
                                  __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                                  if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                     throw new javax.servlet.jsp.SkipPageException();
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,5);
                                }
                                out.write("\n");
                                
                                                                processLink = (String)pageContext.getAttribute("_hrefProcess", PageContext.PAGE_SCOPE);
                                                                processLink = TagUtils.appendUrlParam(processLink, "idTaskInstance", currentRow.getIdTaskInstance()+"");
                                                                processLink = TagUtils.appendUrlParam(processLink, "idProcessInstance", currentRow.getIdProcessInstance()+"");
                                                                processLink = TagUtils.appendUrlParam(processLink, "taskController", currentRow.getTaskController());
                                
                                out.write("\n                                <a href=\"");
                                out.print(processLink);
                                out.write("\"><img  title=\"Ver Detalle\" alt=\"procesar\" src=\"");
                                {
                                  org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                                  __jsp_taghandler_31.setParent(__jsp_taghandler_29);
                                  __jsp_taghandler_31.setCode("auth.gif");
                                  try {
                                    __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                                    if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                  } catch (Throwable th) {
                                    __jsp_taghandler_31.doCatch(th);
                                  } finally {
                                    __jsp_taghandler_31.doFinally();
                                  }
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,5);
                                }
                                out.write("\" height=\"20\" width=\"20\" /></a>\n                            ");
                              } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                            if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,4);
                          }
                          out.write("\n");
                          
                                                  }
                          
                                                  propertyHeader = getTitle(pageContext, tableHeaders, tableColumns, i);
                                                  format = "";
                                                  if(dateKeys.contains(propertyName.trim())) {
                                                      format = "{0,date," + dateFormat + "}";
                                                  }
                                                  if(i==0) {
                                                      if(isMultiple) {
                                                          String idValue = "idTaskInstance="+currentRow.getIdTaskInstance()+",taskName="+currentRow.getTaskName()+",idProcessInstance="+currentRow.getIdProcessInstance();
                          
                          out.write("\n                                ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_32=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag");
                            __jsp_taghandler_32.setParent(__jsp_taghandler_28);
                            __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_32,__jsp_tag_starteval,out);
                              do {
                                out.write("\n                                    <input type=\"checkbox\" name=\"");
                                out.print(checkProperty);
                                out.write("\" value=\"");
                                out.print(idValue);
                                out.write("\"/>\n                                ");
                              } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                            if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,4);
                          }
                          out.write("\n");
                          
                                                      }
                                                      if(showImageLink) {
                          
                          out.write("\n                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_33=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title sortable format href paramId paramProperty maxLength");
                            __jsp_taghandler_33.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_33.setProperty(OracleJspRuntime.toStr( propertyName));
                            __jsp_taghandler_33.setTitle(OracleJspRuntime.toStr( propertyHeader));
                            __jsp_taghandler_33.setSortable(true);
                            __jsp_taghandler_33.setFormat(OracleJspRuntime.toStr( format));
                            __jsp_taghandler_33.setHref(OracleJspRuntime.toStr( detailLink));
                            __jsp_taghandler_33.setParamId("idProcessInstance");
                            __jsp_taghandler_33.setParamProperty("idProcessInstance");
                            __jsp_taghandler_33.setMaxLength(OracleJspRuntime.toInt( maxLength));
                            __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                            if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,4);
                          }
                          out.write("\n");
                          
                                                      } else {
                          
                          out.write("\n                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_34=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title sortable format paramId paramProperty maxLength");
                            __jsp_taghandler_34.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_34.setProperty(OracleJspRuntime.toStr( propertyName));
                            __jsp_taghandler_34.setTitle(OracleJspRuntime.toStr( propertyHeader));
                            __jsp_taghandler_34.setSortable(true);
                            __jsp_taghandler_34.setFormat(OracleJspRuntime.toStr( format));
                            __jsp_taghandler_34.setParamId("idProcessInstance");
                            __jsp_taghandler_34.setParamProperty("idProcessInstance");
                            __jsp_taghandler_34.setMaxLength(OracleJspRuntime.toInt( maxLength));
                            __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                            if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,4);
                          }
                          out.write("\n");
                          
                                                      }
                                                  } else {
                          
                          out.write("\n                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title sortable format maxLength");
                            __jsp_taghandler_35.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_35.setProperty(OracleJspRuntime.toStr( propertyName));
                            __jsp_taghandler_35.setTitle(OracleJspRuntime.toStr( propertyHeader));
                            __jsp_taghandler_35.setSortable(true);
                            __jsp_taghandler_35.setFormat(OracleJspRuntime.toStr( format));
                            __jsp_taghandler_35.setMaxLength(OracleJspRuntime.toInt( maxLength));
                            __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                            if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,4);
                          }
                          out.write("\n");
                          
                                                  }
                                              }
                                          }
                                          if(isActionFirst == false) {
                          
                          out.write("\n                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_36=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag title");
                            __jsp_taghandler_36.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_36.setTitle("");
                            __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_36,__jsp_tag_starteval,out);
                              do {
                                out.write("\n");
                                
                                                                processLink = TagUtils.formatUrl(currentRow.getActionUrl());
                                
                                out.write("\n                                ");
                                {
                                  org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
                                  __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                                  __jsp_taghandler_37.setVar("_hrefProcess");
                                  __jsp_taghandler_37.setScope("page");
                                  __jsp_taghandler_37.setValue(OracleJspRuntime.toStr( processLink));
                                  __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                                  if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                     throw new javax.servlet.jsp.SkipPageException();
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,5);
                                }
                                out.write("\n");
                                
                                                                processLink = (String)pageContext.getAttribute("_hrefProcess", PageContext.PAGE_SCOPE);
                                                                processLink = TagUtils.appendUrlParam(processLink, "idTaskInstance", currentRow.getIdTaskInstance()+"");
                                                                processLink = TagUtils.appendUrlParam(processLink, "idProcessInstance", currentRow.getIdProcessInstance()+"");
                                                                processLink = TagUtils.appendUrlParam(processLink, "taskController", currentRow.getTaskController());
                                
                                out.write("\n                                <a href=\"");
                                out.print(processLink);
                                out.write("\"><img title=\"Ver Detalle\" alt=\"procesar\" src=\"");
                                {
                                  org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                                  __jsp_taghandler_38.setParent(__jsp_taghandler_36);
                                  __jsp_taghandler_38.setCode("auth.gif");
                                  try {
                                    __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                    if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                  } catch (Throwable th) {
                                    __jsp_taghandler_38.doCatch(th);
                                  } finally {
                                    __jsp_taghandler_38.doFinally();
                                  }
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,5);
                                }
                                out.write("\" height=\"20\" width=\"20\" /></a>\n                            ");
                              } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                            if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,4);
                          }
                          out.write("\n");
                          
                                          }
                          
                          out.write("\n                ");
                          {
                            org.displaytag.tags.SetPropertyTag __jsp_taghandler_39=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                            __jsp_taghandler_39.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_39.setName("paging.banner.placement");
                            __jsp_taghandler_39.setValue("bottom");
                            __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                            if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,4);
                          }
                          out.write("\n                ");
                          {
                            org.displaytag.tags.SetPropertyTag __jsp_taghandler_40=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                            __jsp_taghandler_40.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_40.setName("basic.msg.empty_list");
                            __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_40,__jsp_tag_starteval,out);
                              do {
                                out.write("\n                    <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                                {
                                  org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_41=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                                  __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                                  __jsp_taghandler_41.setText("Lista Vacia");
                                  try {
                                    __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                                    if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                  } catch (Throwable th) {
                                    __jsp_taghandler_41.doCatch(th);
                                  } finally {
                                    __jsp_taghandler_41.doFinally();
                                  }
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,5);
                                }
                                out.write("<br><br></span>\n                ");
                              } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                            if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,4);
                          }
                          out.write("\n            ");
                        } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,3);
                    }
                    out.write("\n          </div>\n");
                    
                            } else {
                    
                    out.write("\n            ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                      __jsp_taghandler_42.setParent(__jsp_taghandler_27);
                      __jsp_taghandler_42.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${EMPTY_TASK_LIST}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_42.setEscapeXml(false);
                      __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                      if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,3);
                    }
                    out.write("\n");
                    
                            }
                    
                    out.write("\n    ");
                  } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
              }
              out.write("\n    ");
              {
                org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                __jsp_taghandler_43.setParent(__jsp_taghandler_26);
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n        <table width=\"100%\">\n            <tr align=\"center\">\n              <td>\n                <table class=\"message\">\n                  <tr>\n                    <td class=\"error\"><img src=\"");
                    {
                      org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                      __jsp_taghandler_44.setParent(__jsp_taghandler_43);
                      __jsp_taghandler_44.setCode("error.gif");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                        if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                      } catch (Throwable th) {
                        __jsp_taghandler_44.doCatch(th);
                      } finally {
                        __jsp_taghandler_44.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,3);
                    }
                    out.write("\" alt=\"error\" width=\"30\" height=\"30\"></td>\n                    <td>\n                     <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n                      ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
                      __jsp_taghandler_45.setParent(__jsp_taghandler_43);
                      __jsp_taghandler_45.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${errors}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_45.setVar("errorItem");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\n                        <tr><td>\n                        ");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                              __jsp_taghandler_46.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${errorItem}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                              if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,4);
                            }
                            out.write("</br>\n                        </td></tr>\n                      ");
                          } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                      } catch (Throwable th) {
                        __jsp_taghandler_45.doCatch(th);
                      } finally {
                        __jsp_taghandler_45.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,3);
                    }
                    out.write("\n                     </table>\n                    </td>\n                  </tr>\n                </table>\n              </td>\n            </tr>\n          </table>\n\n          ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_47=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                      __jsp_taghandler_47.setParent(__jsp_taghandler_43);
                      __jsp_taghandler_47.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${EMPTY_TASK_LIST}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_47.setEscapeXml(false);
                      __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                      if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,3);
                    }
                    out.write("\n    ");
                  } while (__jsp_taghandler_43.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,2);
              }
              out.write("\n");
            } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,1);
        }
        out.write("\n\n<script type=\"text/javascript\">\n    function clearTaskFields() {\n        var elements = document.getElementsByTagName(\"input\");\n        var i;\n        var element;\n        for(i=0;i<elements.length;i++) {\n            element = elements[i];\n            if(element.type==\"text\") {\n                element.value=\"\";\n            }\n        }\n    }\n</script>\n\n");
        out.write("\n\n");
        
        } catch(Exception e) {
            e.printStackTrace();
        }
        
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
        new TagAttributeInfo("pagedUrl",true,"java.lang.String",true,false),
        new TagAttributeInfo("imageUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("headers",false,"java.lang.String",true,false),
        new TagAttributeInfo("columns",false,"java.lang.String",true,false),
        new TagAttributeInfo("dateFormat",false,"java.lang.String",true,false),
        new TagAttributeInfo("height",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false),
        new TagAttributeInfo("maxLength",false,"java.lang.String",true,false),
        new TagAttributeInfo("showActionFirst",false,"java.lang.String",true,false),
        new TagAttributeInfo("checkbox",false,"java.lang.String",true,false),
        new TagAttributeInfo("checkProperty",false,"java.lang.String",true,false),
        new TagAttributeInfo("dispatchToolTip",false,"java.lang.String",true,false),
        new TagAttributeInfo("dispatchUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("assignUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("assignToolTip",false,"java.lang.String",true,false),
        new TagAttributeInfo("filterId",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("tasksList","_oracle._jsp._tag._tasksList_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
