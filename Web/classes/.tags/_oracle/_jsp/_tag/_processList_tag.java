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
import java.util.Map;
import java.util.HashMap;
import gob.shcp.fsn.model.support.DynaDTO;
import gob.shcp.fsn.control.view.util.TagUtils;
import org.springframework.web.servlet.support.RequestContext;
import gob.shcp.fsn.control.binder.ControllerWebBindingInitializer;


public class _processList_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
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
  private java.lang.String detailUrl;
  private java.lang.String headers;
  private java.lang.String columns;
  private java.lang.String dateFormat;
  private java.lang.String height;
  private java.lang.String width;
  private java.lang.String showErrors;
  private java.lang.String useModel;
  private java.lang.String service;
  private java.lang.String maxLength;

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

  public void setDetailUrl(java.lang.String detailUrl)
  {
    this.detailUrl = detailUrl;
  }

  public java.lang.String getDetailUrl()
  {
    return this.detailUrl;
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

  public void setShowErrors(java.lang.String showErrors)
  {
    this.showErrors = showErrors;
  }

  public java.lang.String getShowErrors()
  {
    return this.showErrors;
  }

  public void setUseModel(java.lang.String useModel)
  {
    this.useModel = useModel;
  }

  public java.lang.String getUseModel()
  {
    return this.useModel;
  }

  public void setService(java.lang.String service)
  {
    this.service = service;
  }

  public java.lang.String getService()
  {
    return this.service;
  }

  public void setMaxLength(java.lang.String maxLength)
  {
    this.maxLength = maxLength;
  }

  public java.lang.String getMaxLength()
  {
    return this.maxLength;
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
        pageContext.setAttribute("detailUrl", getDetailUrl());
        pageContext.setAttribute("headers", getHeaders());
        pageContext.setAttribute("columns", getColumns());
        pageContext.setAttribute("dateFormat", getDateFormat());
        pageContext.setAttribute("height", getHeight());
        pageContext.setAttribute("width", getWidth());
        pageContext.setAttribute("showErrors", getShowErrors());
        pageContext.setAttribute("useModel", getUseModel());
        pageContext.setAttribute("service", getService());
        pageContext.setAttribute("maxLength", getMaxLength());


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
        out.write("\n\n");
        
        try{     
            /*  
            *  Posibles valores para las propiedades a mostrar:
            *        "processKey", "processName", "processStart", "processEnd"   
            */
            String[] tableColumns = {"processKey", "folio", "processName", "processStart", "processEnd"};
            String[] tableHeaders = tableColumns;
            
            if(columns != null){
                tableColumns = columns.split(",");
                tableHeaders = columns.split(",");
            }
            
            if(headers != null){
                tableHeaders = headers.split(",");
            }
            
            String processService = null;
            if (service != null && !"".equals(service)) {
                processService = service;
            } else{
                processService = "gob.shcp.bpm.service.ProcessInstanceService";
                if(Boolean.valueOf(showErrors)){
                    processService = "gob.shcp.bpm.service.SuspendedErrorProcessInstanceService";
                }
            }
            
            dateFormat = (dateFormat!=null && !"".equals(dateFormat)) ? dateFormat : "dd/MM/yyyy HH:mm";
            width = width != null ? width : "1000";
            height = height != null ? height : "500";
            maxLength = maxLength != null ? maxLength : "50";
            
            Integer taskUniqueSearchID = TagUtils.getHtmlUniqueId(pageContext);
            detailUrl = TagUtils.formatUrl(detailUrl);
            pagedUrl = TagUtils.formatUrl(pagedUrl);
            
            String maxlenght = "10";
            String maxsize = "11";
            
            List<String> dateKeys = new ArrayList<String>();    
            dateKeys.add("processEnd");
            dateKeys.add("processStart");
        
        out.write("    \n    <!--  Urls de las acciones del tag -->\n    ");
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
          __jsp_taghandler_2.setVar("_hrefDetail");
          __jsp_taghandler_2.setScope("page");
          __jsp_taghandler_2.setValue(OracleJspRuntime.toStr( detailUrl));
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setVar("processService");
          __jsp_taghandler_3.setValue(processService);
          __jsp_taghandler_3.setScope("page");
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
        }
        out.write("\n");
        
            pagedUrl = (String)pageContext.getAttribute("_pagedUrl", PageContext.PAGE_SCOPE);
            detailUrl = (String)pageContext.getAttribute("_hrefDetail", PageContext.PAGE_SCOPE);
        
        out.write("\n\n<!-- Componentes de captura para el encabezado -->\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setVar("START_ROW_CONTENT");
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
            do {
              out.write("\n  <tr>\n");
              
                  for(String atrName: tableColumns) {
                      if(atrName != null && !"".equals(atrName.trim()) && dateKeys.contains(atrName.trim())) { 
              out.write("\n            <td nowrap=\"nowrap\">\n                ");
              
                              if (Boolean.valueOf(useModel))  {
                              
              out.write("\n                    ");
              {
                org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path size maxlength");
                __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                __jsp_taghandler_5.setPath(OracleJspRuntime.toStr( atrName));
                __jsp_taghandler_5.setSize(OracleJspRuntime.toStr( maxsize));
                __jsp_taghandler_5.setMaxlength(OracleJspRuntime.toStr( maxlenght));
                try {
                  __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                  if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_5.doCatch(th);
                } finally {
                  __jsp_taghandler_5.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write("                        \n                ");
              
                              } else {
                              
              out.write("\n                    <input type=\"text\" maxlength=\"");
              out.print(maxlenght);
              out.write("\" name=\"");
              out.print(atrName);
              out.write("\" id=\"");
              out.print(atrName);
              out.write("\" size=\"");
              out.print(maxsize);
              out.write("\"/>                        \n                ");
                  
                              }
                              
              out.write("\n                <span class=\"calendar\">\n                    <a href=\"javascript:void(0)\" id=\"button");
              out.print(atrName);
              out.write("\" >\n                        <img src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_4);
                __jsp_taghandler_6.setCode("background.gif");
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
              out.write("\" alt=\"calendar\" width=\"20\" height=\"20\"/>\n                    </a>\n                </span>\n                a         \n                ");
              
                              if (Boolean.valueOf(useModel))  {
                                  String fieldName = atrName + "End";
                              
              out.write("\n                    ");
              {
                org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path size maxlength");
                __jsp_taghandler_7.setParent(__jsp_taghandler_4);
                __jsp_taghandler_7.setPath(OracleJspRuntime.toStr( fieldName));
                __jsp_taghandler_7.setSize(OracleJspRuntime.toStr( maxsize));
                __jsp_taghandler_7.setMaxlength(OracleJspRuntime.toStr( maxlenght));
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
              out.write("                        \n                ");
              
                              } else {
                              
              out.write("\n                    <input type=\"text\" maxlength=\"");
              out.print(maxlenght);
              out.write("\" name=\"");
              out.print(atrName);
              out.write("End\" id=\"");
              out.print(atrName);
              out.write("End\" size=\"");
              out.print(maxsize);
              out.write("\"/>                        \n                ");
                  
                              }
                              
              out.write("\n                <span class=\"calendar\">\n                    <a href=\"javascript:void(0)\" id=\"button");
              out.print(atrName);
              out.write("End\" >\n                        <img src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_4);
                __jsp_taghandler_8.setCode("background.gif");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_8.doCatch(th);
                } finally {
                  __jsp_taghandler_8.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write("\" alt=\"calendar\" width=\"20\" height=\"20\"/>\n                    </a>\n                </span>\n            </td>\n            <script type=\"text/javascript\">\n                Calendar.setup({\n                    inputField     :    \"");
              out.print(atrName);
              out.write("\",      \n                    ifFormat       :    \"%d/%m/%Y\",                \n                    showsTime      :    false,\n                    button         :    \"button");
              out.print(atrName);
              out.write("\",   \n                    step           :    1\n                });\n                Calendar.setup({\n                    inputField     :    \"");
              out.print(atrName);
              out.write("End\",      \n                    ifFormat       :    \"%d/%m/%Y\",                \n                    showsTime      :    false,\n                    button         :    \"button");
              out.print(atrName);
              out.write("End\",   \n                    step           :    1\n                });\n            </script>\n");
              
                      } else {
              
              out.write("\n            <td nowrap=\"nowrap\">\n                ");
              
                              if (Boolean.valueOf(useModel))  {
                              
              out.write("\n                    ");
              {
                org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path");
                __jsp_taghandler_9.setParent(__jsp_taghandler_4);
                __jsp_taghandler_9.setPath(OracleJspRuntime.toStr( atrName));
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
              out.write("    \n                ");
              
                              }else {
                              
              out.write("\n                    <input type=\"text\" id=\"");
              out.print(atrName);
              out.write("\" name=\"");
              out.print(atrName);
              out.write("\"/>\n                ");
              
                              }
                              
              out.write("\n            </td>    \n");
              
                      }
                  }
              
              out.write("\n    <td nowrap=\"nowrap\">\n        <input id=\"");
              out.print(taskUniqueSearchID);
              out.write("\" type=\"image\" alt=\"buscar\" path=\"\" action=\"");
              out.print(pagedUrl);
              out.write("\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_4);
                __jsp_taghandler_10.setCode("help.gif");
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
              out.print(taskUniqueSearchID);
              out.write(");\"/>\n        &nbsp;\n        <input type=\"image\" alt=\"limpiar\" src=\"");
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_4);
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
              out.write("\" onclick=\"clearTaskFields(); return false;\"/>\n    </td>\n  </tr>\n");
            } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
        }
        out.write("\n\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
          __jsp_taghandler_12.setParent(null);
          __jsp_taghandler_12.setVar("EMPTY_TASK_LIST");
          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_12,__jsp_tag_starteval,out);
            do {
              out.write("\n<!-- Creacion de tabla vacia solo con campos de captura cuando no se encuentran tareas -->\n    <div id=\"taskListDiv\" align=\"center\" style=\"height:");
              out.print(height);
              out.write("px;width:");
              out.print(width);
              out.write("px;overflow:auto;\">\n        <table align=\"center\" class=\"displaytag\">\n            <tr>\n");
               
                              String propertyHeader = null;
                              for(int i=0; i<tableColumns.length; i++) {
                                  propertyHeader = getTitle(pageContext, tableHeaders, tableColumns, i);                    
              
              out.write("\n                   <th>");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                __jsp_taghandler_13.setValue(propertyHeader);
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write("</th>\n");
              
                              }                
              
              out.write("                                \n                <th align=\"center\"></th>        \n            </tr>\n            ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                __jsp_taghandler_14.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${START_ROW_CONTENT}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_14.setEscapeXml(false);
                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
              }
              out.write("\n        </table>    \n    </div>\n");
            } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
        }
        out.write("\n\n<!-- Llamado al servicio para la creacion de la lista de tareas -->\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
          __jsp_taghandler_15.setParent(null);
          __jsp_taghandler_15.setVar("applyFilters");
          __jsp_taghandler_15.setValue("true");
          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,1);
        }
        out.write("\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
          __jsp_taghandler_16.setParent(null);
          __jsp_taghandler_16.setVar("applyEqualFilter");
          __jsp_taghandler_16.setValue("true");
          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,1);
        }
        out.write("\n");
        {
          org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
          __jsp_taghandler_17.setParent(null);
          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n    ");
              {
                org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                __jsp_taghandler_18.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tagutils:createPagedList(pageContext,processService,'service','','')}",java.lang.Boolean.class, __ojsp_varRes, __ojsp_fnmappers[0])));
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n");
                    
                            List data = (List)pageContext.getRequest().getAttribute(pageContext.getAttribute("displaySource").toString());    
                            if(!data.isEmpty()) {            
                                String format = null;
                                String propertyHeader = null;
                                String propertyName = null;
                                String processLink = null;
                    
                    out.write("    \n          <!-- Creacion de la lista de tareas asignadas -->\n          <div id=\"taskListDiv\" align=\"center\" style=\"height:");
                    out.print(height);
                    out.write("px;width:");
                    out.print(width);
                    out.write("px;overflow:auto;\">\n            ");
                    {
                      org.displaytag.tags.TableTag __jsp_taghandler_19=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class id sort");
                      __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                      __jsp_taghandler_19.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${displaySource}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_19.setPagesize(10);
                      __jsp_taghandler_19.setDecorator("gob.shcp.fsn.control.view.decorator.PagedListTableDecorator");
                      __jsp_taghandler_19.setRequestURI(OracleJspRuntime.toStr( pagedUrl));
                      __jsp_taghandler_19.setClass("displaytag");
                      __jsp_taghandler_19.setUid("row");
                      __jsp_taghandler_19.setSort("list");
                      java.lang.Object row = null;
                      java.lang.Integer row_rowNum = null;
                      __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
                        do {
                          row = (java.lang.Object) pageContext.findAttribute("row");
                          row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
                          out.write("\n");
                                  
                                          for(int i=0; i<tableColumns.length; i++) {
                                              propertyName = tableColumns[i];
                                              if(propertyName!=null && !"".equals(propertyName.trim())) {                        
                                                  propertyHeader = getTitle(pageContext, tableHeaders, tableColumns, i);
                                                  format = "";
                                                  if(dateKeys.contains(propertyName.trim())) {
                                                      format = "{0,date," + dateFormat + "}";
                                                  }
                                                  if(i==0) {
                          
                          out.write("\n                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_20=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title sortable format href paramId paramProperty maxLength");
                            __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                            __jsp_taghandler_20.setProperty(OracleJspRuntime.toStr( propertyName));
                            __jsp_taghandler_20.setTitle(OracleJspRuntime.toStr( propertyHeader));
                            __jsp_taghandler_20.setSortable(true);
                            __jsp_taghandler_20.setFormat(OracleJspRuntime.toStr( format));
                            __jsp_taghandler_20.setHref(OracleJspRuntime.toStr( detailUrl));
                            __jsp_taghandler_20.setParamId("idProcessInstance");
                            __jsp_taghandler_20.setParamProperty("idProcessInstance");
                            __jsp_taghandler_20.setMaxLength(OracleJspRuntime.toInt( maxLength));
                            __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                            if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,4);
                          }
                          out.write("\n");
                          
                                                  } else {
                          
                          out.write("\n                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_21=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title sortable format maxLength");
                            __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                            __jsp_taghandler_21.setProperty(OracleJspRuntime.toStr( propertyName));
                            __jsp_taghandler_21.setTitle(OracleJspRuntime.toStr( propertyHeader));
                            __jsp_taghandler_21.setSortable(true);
                            __jsp_taghandler_21.setFormat(OracleJspRuntime.toStr( format));
                            __jsp_taghandler_21.setMaxLength(OracleJspRuntime.toInt( maxLength));
                            __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                            if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,4);
                          }
                          out.write("\n");
                          
                                                  }
                                              }
                                          }        
                          
                          out.write("\n                ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_22=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag");
                            __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                            __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                            if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,4);
                          }
                          out.write("\n                ");
                          {
                            org.displaytag.tags.SetPropertyTag __jsp_taghandler_23=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                            __jsp_taghandler_23.setParent(__jsp_taghandler_19);
                            __jsp_taghandler_23.setName("paging.banner.placement");
                            __jsp_taghandler_23.setValue("bottom");
                            __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                            if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,4);
                          }
                          out.write("    \n                ");
                          {
                            org.displaytag.tags.SetPropertyTag __jsp_taghandler_24=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                            __jsp_taghandler_24.setParent(__jsp_taghandler_19);
                            __jsp_taghandler_24.setName("basic.msg.empty_list");
                            __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_24,__jsp_tag_starteval,out);
                              do {
                                out.write("\n                    <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                                {
                                  org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                                  __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                                  __jsp_taghandler_25.setText("Lista Vacia");
                                  try {
                                    __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                                    if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                  } catch (Throwable th) {
                                    __jsp_taghandler_25.doCatch(th);
                                  } finally {
                                    __jsp_taghandler_25.doFinally();
                                  }
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,5);
                                }
                                out.write("<br><br></span>\n                ");
                              } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                            if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,4);
                          }
                          out.write("\n            ");
                        } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,3);
                    }
                    out.write("\n          </div>\n");
                    
                            } else {
                    
                    out.write("  \n            ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                      __jsp_taghandler_26.setParent(__jsp_taghandler_18);
                      __jsp_taghandler_26.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${EMPTY_TASK_LIST}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_26.setEscapeXml(false);
                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                    }
                    out.write("\n");
                    
                            }
                    
                    out.write("\n    ");
                  } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write("\n    ");
              {
                org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                __jsp_taghandler_27.setParent(__jsp_taghandler_17);
                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n        <table width=\"100%\">\n            <tr align=\"center\">\n              <td>\n                <table class=\"message\">\n                  <tr>\n                    <td class=\"error\"><img src=\"");
                    {
                      org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                      __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                      __jsp_taghandler_28.setCode("error.gif");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                        if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                      } catch (Throwable th) {
                        __jsp_taghandler_28.doCatch(th);
                      } finally {
                        __jsp_taghandler_28.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,3);
                    }
                    out.write("\" alt=\"error\" width=\"30\" height=\"30\"></td>\n                    <td>\n                     <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n                      ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
                      __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                      __jsp_taghandler_29.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${errors}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_29.setVar("errorItem");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\n                        <tr><td>\n                        ");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                              __jsp_taghandler_30.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${errorItem}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                              if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,4);
                            }
                            out.write("</br>\n                        </td></tr>\n                      ");
                          } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                      } catch (Throwable th) {
                        __jsp_taghandler_29.doCatch(th);
                      } finally {
                        __jsp_taghandler_29.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,3);
                    }
                    out.write("\n                     </table>\n                    </td>\n                  </tr>\n                </table>\n              </td>\n            </tr>\n          </table>\n          \n          ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                      __jsp_taghandler_31.setParent(__jsp_taghandler_27);
                      __jsp_taghandler_31.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${EMPTY_TASK_LIST}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_31.setEscapeXml(false);
                      __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                      if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,3);
                    }
                    out.write("\n    ");
                  } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
              }
              out.write("\n");
            } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,1);
        }
        out.write("\n\n<script type=\"text/javascript\">\n    function clearTaskFields(){\n        var elements = document.getElementsByTagName(\"input\");\n        var i;\n        var element;\n        for(i=0;i<elements.length;i++){\n            element = elements[i];\n            if(element.type==\"text\"){\n                element.value=\"\";\n            }        \n        }        \n    }\n</script>\n\n\n");
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
        new TagAttributeInfo("detailUrl",true,"java.lang.String",true,false),
        new TagAttributeInfo("headers",false,"java.lang.String",true,false),
        new TagAttributeInfo("columns",false,"java.lang.String",true,false),
        new TagAttributeInfo("dateFormat",false,"java.lang.String",true,false),
        new TagAttributeInfo("height",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false),
        new TagAttributeInfo("showErrors",false,"java.lang.String",true,false),
        new TagAttributeInfo("useModel",false,"java.lang.String",true,false),
        new TagAttributeInfo("service",false,"java.lang.String",true,false),
        new TagAttributeInfo("maxLength",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("processList","_oracle._jsp._tag._processList_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
