package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import gob.shcp.fsn.model.support.FilterDTO;
import gob.shcp.fsn.model.support.SelectListDTO;
import gob.shcp.fsn.service.support.DynaContentService;
import gob.shcp.fsn.control.binder.ControllerWebBindingInitializer;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _selectList_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String beanName;
  private java.util.List items;
  private java.lang.String name;
  private java.lang.String path;
  private java.lang.String parentPath;
  private java.lang.String progress;
  private java.lang.String multiple;
  private java.lang.String size;
  private java.lang.String filterPaths;
  private java.lang.String patternValue;
  private java.lang.String uppercase;
  private java.lang.String disabled;
  private java.lang.String onchange;
  private java.lang.String appendFilters;
  private java.lang.String style;
  private java.lang.String width;
  private java.lang.String filterId;
  private java.lang.String onload;

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

  public void setBeanName(java.lang.String beanName)
  {
    this.beanName = beanName;
  }

  public java.lang.String getBeanName()
  {
    return this.beanName;
  }

  public void setItems(java.util.List items)
  {
    this.items = items;
  }

  public java.util.List getItems()
  {
    return this.items;
  }

  public void setName(java.lang.String name)
  {
    this.name = name;
  }

  public java.lang.String getName()
  {
    return this.name;
  }

  public void setPath(java.lang.String path)
  {
    this.path = path;
  }

  public java.lang.String getPath()
  {
    return this.path;
  }

  public void setParentPath(java.lang.String parentPath)
  {
    this.parentPath = parentPath;
  }

  public java.lang.String getParentPath()
  {
    return this.parentPath;
  }

  public void setProgress(java.lang.String progress)
  {
    this.progress = progress;
  }

  public java.lang.String getProgress()
  {
    return this.progress;
  }

  public void setMultiple(java.lang.String multiple)
  {
    this.multiple = multiple;
  }

  public java.lang.String getMultiple()
  {
    return this.multiple;
  }

  public void setSize(java.lang.String size)
  {
    this.size = size;
  }

  public java.lang.String getSize()
  {
    return this.size;
  }

  public void setFilterPaths(java.lang.String filterPaths)
  {
    this.filterPaths = filterPaths;
  }

  public java.lang.String getFilterPaths()
  {
    return this.filterPaths;
  }

  public void setPatternValue(java.lang.String patternValue)
  {
    this.patternValue = patternValue;
  }

  public java.lang.String getPatternValue()
  {
    return this.patternValue;
  }

  public void setUppercase(java.lang.String uppercase)
  {
    this.uppercase = uppercase;
  }

  public java.lang.String getUppercase()
  {
    return this.uppercase;
  }

  public void setDisabled(java.lang.String disabled)
  {
    this.disabled = disabled;
  }

  public java.lang.String getDisabled()
  {
    return this.disabled;
  }

  public void setOnchange(java.lang.String onchange)
  {
    this.onchange = onchange;
  }

  public java.lang.String getOnchange()
  {
    return this.onchange;
  }

  public void setAppendFilters(java.lang.String appendFilters)
  {
    this.appendFilters = appendFilters;
  }

  public java.lang.String getAppendFilters()
  {
    return this.appendFilters;
  }

  public void setStyle(java.lang.String style)
  {
    this.style = style;
  }

  public java.lang.String getStyle()
  {
    return this.style;
  }

  public void setWidth(java.lang.String width)
  {
    this.width = width;
  }

  public java.lang.String getWidth()
  {
    return this.width;
  }

  public void setFilterId(java.lang.String filterId)
  {
    this.filterId = filterId;
  }

  public java.lang.String getFilterId()
  {
    return this.filterId;
  }

  public void setOnload(java.lang.String onload)
  {
    this.onload = onload;
  }

  public java.lang.String getOnload()
  {
    return this.onload;
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
        pageContext.setAttribute("beanName", getBeanName());
        pageContext.setAttribute("items", getItems());
        pageContext.setAttribute("name", getName());
        pageContext.setAttribute("path", getPath());
        pageContext.setAttribute("parentPath", getParentPath());
        pageContext.setAttribute("progress", getProgress());
        pageContext.setAttribute("multiple", getMultiple());
        pageContext.setAttribute("size", getSize());
        pageContext.setAttribute("filterPaths", getFilterPaths());
        pageContext.setAttribute("patternValue", getPatternValue());
        pageContext.setAttribute("uppercase", getUppercase());
        pageContext.setAttribute("disabled", getDisabled());
        pageContext.setAttribute("onchange", getOnchange());
        pageContext.setAttribute("appendFilters", getAppendFilters());
        pageContext.setAttribute("style", getStyle());
        pageContext.setAttribute("width", getWidth());
        pageContext.setAttribute("filterId", getFilterId());
        pageContext.setAttribute("onload", getOnload());


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write(" \n");
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
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        
        try{
            if((beanName == null || "".equals(beanName)) && (items == null)) {
                return;
            }
            if (filterId==null || "".equals(filterId) ){
                    filterId = DynaContentService.PAGED_LIST_FILTER;
            }
        
            boolean dynaQuery = true;
            if(appendFilters != null && !"".equals(appendFilters)) {
                dynaQuery = Boolean.valueOf(appendFilters);
            }
        
            String[] additionalPaths = null;
            if(filterPaths != null && !"".equals(filterPaths)) {
                filterPaths = filterPaths.trim();
                additionalPaths = filterPaths.split(",");
            }
        
            boolean upperCased = true;
            if(uppercase != null && !"".equals(uppercase)) {
                upperCased = Boolean.valueOf(uppercase);
            }
            String cssClass = upperCased ? "uppercase" : "";
            size = size==null ? "" : size;
            disabled = disabled==null ? "" : disabled;
            onchange = onchange==null ? "" : onchange;
            multiple = multiple==null ? "" : multiple;
            style = style==null ? "" : style;
        
            if(width != null){
              if(style.length() > 0) {
                 style = style + "; ";
              }
              style = style + "width: " + width + "px";
            }
            
            boolean execOnLoad = true;
            if(onload != null && !"".equals(onload)) {
                execOnLoad = Boolean.valueOf(onload);
            }
            
            
            
            
            if(patternValue!=null) {
        
        out.write("\n        ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setCode(OracleJspRuntime.toStr( patternValue));
          __jsp_taghandler_1.setVar("pattern");
          try {
            __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
            if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_1.doCatch(th);
          } finally {
            __jsp_taghandler_1.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\n");
        
            }
            String pattern = (String)pageContext.getAttribute("pattern");
            pattern = pattern == null ? "" : pattern;
            
            final FilterDTO filters = (FilterDTO)pageContext.getAttribute(filterId, PageContext.REQUEST_SCOPE);
            List data = new ArrayList();
            if((parentPath==null || "".equals(parentPath)) && (beanName != null && !"".equals(beanName))) {
                if(dynaQuery) {
                    data = TagUtils.getService(pageContext, DynaContentService.class).getListElements(beanName, TagUtils.getConditions(filters), null, null, pattern);
                } else {
                    data = TagUtils.getService(pageContext, DynaContentService.class).getListElements(beanName, TagUtils.getConditions(filters), null, pattern);
                }    
            }
            if(items != null) {
                data = items;
            }
        
            StringBuffer options = new StringBuffer();
            final HashMap addOptions = (HashMap)pageContext.getAttribute(DynaContentService.ADD_OPTIONS, PageContext.REQUEST_SCOPE);
            if(path != null) {
                if(upperCased) {
        
        out.write("\n            <input type=\"hidden\" name=\"");
        out.print(ControllerWebBindingInitializer.UPPER_CASE_PREFIX);
        out.print(path);
        out.write("\" value=\"true\"/>\n");
        
                }
        
        out.write("\n        ");
        {
          org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path cssClass cssStyle disabled onchange size multiple");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setPath(OracleJspRuntime.toStr( path));
          __jsp_taghandler_2.setCssClass(OracleJspRuntime.toStr( cssClass));
          __jsp_taghandler_2.setCssStyle(OracleJspRuntime.toStr( style));
          __jsp_taghandler_2.setDisabled(OracleJspRuntime.toStr( Boolean.valueOf(disabled)));
          __jsp_taghandler_2.setOnchange(OracleJspRuntime.toStr( onchange));
          __jsp_taghandler_2.setSize(OracleJspRuntime.toStr( size));
          __jsp_taghandler_2.setMultiple(Boolean.valueOf(multiple));
          try {
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                out.write("\n");
                    
                            if(addOptions!=null && !addOptions.isEmpty()) {
                                String key =  null;
                                String text = null;
                                for(Iterator it = addOptions.keySet().iterator(); it.hasNext();) {
                                    key =  (String)it.next();
                                    text = (String)addOptions.get(key);
                                    options.append(key).append("::").append(text).append(";");
                
                out.write("\n                    ");
                {
                  org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                  __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_3.setValue(key);
                  java.lang.Object value = null;
                  java.lang.String displayValue = null;
                  try {
                    __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      try {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                        do {
                          value = (java.lang.Object) pageContext.findAttribute("value");
                          displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                            __jsp_taghandler_4.setCode(OracleJspRuntime.toStr( text));
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                            } catch (Throwable th) {
                              __jsp_taghandler_4.doCatch(th);
                            } finally {
                              __jsp_taghandler_4.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                          }
                        } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      finally {
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                    }
                    if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                       throw new javax.servlet.jsp.SkipPageException();
                  } catch (Throwable th) {
                    __jsp_taghandler_3.doCatch(th);
                  } finally {
                    __jsp_taghandler_3.doFinally();
                  }
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
                }
                out.write("\n");
                
                                }
                            }
                
                out.write("\n            ");
                {
                  org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                  __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_5.setItems(data);
                  __jsp_taghandler_5.setItemValue("key");
                  __jsp_taghandler_5.setItemLabel("value");
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
                out.write("\n        ");
              } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_2.doCatch(th);
          } finally {
            __jsp_taghandler_2.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n");
        
            } else if(name != null) {
                if(upperCased) {
        
        out.write("\n            <input type=\"hidden\" name=\"");
        out.print(ControllerWebBindingInitializer.UPPER_CASE_PREFIX);
        out.print(name);
        out.write("\" value=\"true\"/>\n");
        
                }
        
                String htmlDisabled = Boolean.valueOf(disabled) ? "disabled=\"disabled\"" : "";
                String htmlMultiple = Boolean.valueOf(multiple) ? "multiple=\"multiple\"" : "";
        
        out.write("\n        <select id=\"");
        out.print(name);
        out.write("\" name=\"");
        out.print(name);
        out.write("\" size=\"");
        out.print(size);
        out.write("\" cssClass=\"");
        out.print(cssClass);
        out.write("\" onchange=\"");
        out.print(onchange);
        out.write("\" ");
        out.print(htmlDisabled);
        out.write(" ");
        out.print(htmlMultiple);
        out.write(" style=\"");
        out.print(style);
        out.write("\">\n");
        
                    if(addOptions!=null && !addOptions.isEmpty()) {
                        String key =  null;
                        String text = null;
                        for(Iterator it = addOptions.keySet().iterator(); it.hasNext();) {
                            key =  (String)it.next();
                            text = (String)addOptions.get(key);
                            options.append(key).append("::").append(text).append(";");
        
        out.write("\n                    <option value=\"");
        out.print(key);
        out.write("\">");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
          __jsp_taghandler_6.setParent(null);
          __jsp_taghandler_6.setCode(OracleJspRuntime.toStr( text));
          try {
            __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
            if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_6.doCatch(th);
          } finally {
            __jsp_taghandler_6.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
        }
        out.write("</option>\n");
        
                        }
                    }
                    for(final Iterator iter = data.iterator(); iter.hasNext();) {
                        SelectListDTO selectList = (SelectListDTO)iter.next();
        
        out.write("\n                <option value=\"");
        out.print(selectList.getKey());
        out.write("\">");
        out.print(selectList.getValue());
        out.write("</option>\n");
        
                    }
        
        out.write("\n        </select>\n");
        
                path = name;
            }
        
            if((parentPath!=null && !parentPath.equals("")) && (beanName != null && !"".equals(beanName))) {
                StringBuffer filterStr = new StringBuffer();     
                Object params[] = new Object[]{};
                if(filters!=null && filters.get() != null) {
                    for(final Iterator iter = filters.get().iterator(); iter.hasNext();) {
                        params = (Object[]) iter.next();            
                        filterStr.append("filter_value_").append(params[0]).append("=").append(params[2]).append(", ");
                        filterStr.append("filter_condition_").append(params[0]).append("=").append(params[1]).append(", ");                                
                    }
                }
                String addPathParams = "";
                if(additionalPaths != null) {            
                    for(String addPath : additionalPaths) {
                        addPathParams += "padre={" + addPath.trim() + "}, ";
                    }
                }
                String parameters   = "padre={"+parentPath+"}, " + addPathParams + "beanName="+beanName+", "+filterStr.toString()+", patternValue="+pattern+", options="+options.toString()+", dynaQuery="+dynaQuery ;
                String preFunction  = "initProgress"+path;
                String postFunction = "resetProgress"+path;        
                String baseUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/util/getListElements.do";        
                if(progress!=null && progress.equals("true")) {
        
        out.write("\n            ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var value");
          __jsp_taghandler_7.setParent(null);
          __jsp_taghandler_7.setVar("contextPath");
          __jsp_taghandler_7.setValue("/");
          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
        }
        out.write("\n            <span id=\"progressMsg");
        out.print(path);
        out.write("\" style=\"display:none;\"><img alt=\"indicator\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_8.setParent(null);
          __jsp_taghandler_8.setCode("indicator.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
            if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_8.doCatch(th);
          } finally {
            __jsp_taghandler_8.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
        }
        out.write("\" /></span>\n");
        
                }
        
        out.write("\n        ");
        {
          org.springframework.web.servlet.tags.BindTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
          __jsp_taghandler_9.setParent(null);
          __jsp_taghandler_9.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${path}",java.lang.String.class, __ojsp_varRes,null));
          org.springframework.web.servlet.support.BindStatus status = null;
          try {
            __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
                out.write("\n            ");
                {
                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                  __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                  __jsp_taghandler_10.setVar("requestValue");
                  __jsp_taghandler_10.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.value}",java.lang.Object.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
                }
                out.write("\n        ");
              } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_9.doCatch(th);
          } finally {
            __jsp_taghandler_9.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
        }
        out.write("\n");
        
                Object values = pageContext.getAttribute("requestValue");
                StringBuffer arrValue = new StringBuffer(",");
                if(values instanceof Collection) {
                    arrValue.append(",");
                    for(final Iterator itValues = ((Collection) values).iterator(); itValues.hasNext();) {
                        arrValue.append( itValues.next() ).append(",");            
                    }
                } else if(values instanceof Object[]) {
                    Object[] arrayValue = (Object[])values;
                    for(int idxValue =0; idxValue < arrayValue.length; idxValue++) {
                        arrValue.append( arrayValue[idxValue] ).append(",");
                    }
                } else {
                    arrValue.append(values).append(",");
                }
        
        out.write("  \n        <script type=\"text/javascript\">\n            \n            function initProgress");
        out.print(path);
        out.write("() {\n            this.cancelExecution=false;\n             //console.log('combo: '+'");
        out.print(path);
        out.write("');\n             //console.log('parameters: '+'");
        out.print(parameters);
        out.write("');\n             //console.log('filterPaths: '+'");
        out.print(filterPaths);
        out.write("');\n        ");
        if(parentPath!=null && !parentPath.equals("")){
        out.write("\n             //console.log('parentPath: '+'");
        out.print(parentPath);
        out.write("' +':'+document.getElementById('");
        out.print(parentPath);
        out.write("').value);\n            if(!document.getElementById('");
        out.print(parentPath);
        out.write("').value){\n             //console.log('cancel ajax request execution.. ');\n              this.cancelExecution=true;\n              return;\n            }\n        ");
        }
        out.write("\n        ");
        if(additionalPaths != null && additionalPaths.length>0) {
                         for(String tempPath:additionalPaths){
        out.write("\n             //console.log('");
        out.print(tempPath);
        out.write("' +':'+document.getElementById('");
        out.print(tempPath);
        out.write("').value);\n             if(!document.getElementById('");
        out.print(tempPath);
        out.write("').value){\n                //console.log('cancel ajax request execution.. ');\n                this.cancelExecution=true;\n                return;\n             }\n         ");
        }
                 }
        out.write("\n            \n            \n                document.getElementById('");
        out.print(path);
        out.write("').options.length = 0;\n                Element.show('progressMsg");
        out.print(path);
        out.write("');\n            }\n            \n            function resetProgress");
        out.print(path);
        out.write("() {\n                setTimeout(\"delayResetProgress");
        out.print(path);
        out.write("()\", 500);\n            }\n    \n            function delayResetProgress");
        out.print(path);
        out.write("() {\n                //Select previous selected option\n                var options");
        out.print(path);
        out.write(" = document.getElementById('");
        out.print(path);
        out.write("').getElementsByTagName('option'); \n                options");
        out.print(path);
        out.write("[0].selected = true;        \n                for(i=0; i< options");
        out.print(path);
        out.write(".length; i++) {\n                    if(\"");
        out.print(arrValue);
        out.write("\".indexOf(\",\"+options");
        out.print(path);
        out.write("[i].value+\",\")>-1 ) {\n                        options");
        out.print(path);
        out.write("[0].selected = false;\n                        options");
        out.print(path);
        out.write("[i].selected = true;\n                    }\n                }\n                //Execute onchange event\n                var select");
        out.print(path);
        out.write(" = document.getElementById('");
        out.print(path);
        out.write("');\n                if(document.all) { // IE Way\n                    select");
        out.print(path);
        out.write(".fireEvent('onchange');\n                } else  { // Firefox Way\n                    var evt");
        out.print(path);
        out.write(" = document.createEvent('HTMLEvents');\n                    evt");
        out.print(path);
        out.write(".initEvent('change', true, true);\n                    select");
        out.print(path);
        out.write(".dispatchEvent(evt");
        out.print(path);
        out.write(");\n                }\n");
        
                        if(Boolean.valueOf(disabled)) {
        
        out.write("\n                    select");
        out.print(path);
        out.write(".disabled=\"disabled\";\n");
        
                        }
        
        out.write("\n                Effect.Fade('progressMsg");
        out.print(path);
        out.write("');\n            }\n            //El tag de ajax elimina el atributo onchange del select padre, por lo tanto se obtiene el valor del atributo antes de definir el tag ajax\n            //y se vuelve a setear al finalizar la definicion del tag de ajax.\n            var parentObj = document.getElementById('");
        out.print(parentPath);
        out.write("');\n            var parentOnchange = parentObj.onchange;\n        </script> \n    \n        ");
        {
          org.ajaxtags.tags.AjaxSelectTag __jsp_taghandler_11=(org.ajaxtags.tags.AjaxSelectTag)OracleJspRuntime.getTagHandler(pageContext,org.ajaxtags.tags.AjaxSelectTag.class,"org.ajaxtags.tags.AjaxSelectTag baseUrl source target parameters executeOnLoad preFunction postFunction");
          __jsp_taghandler_11.setParent(null);
          __jsp_taghandler_11.setBaseUrl(OracleJspRuntime.toStr( baseUrl));
          __jsp_taghandler_11.setSource(OracleJspRuntime.toStr( parentPath));
          __jsp_taghandler_11.setTarget(OracleJspRuntime.toStr( path));
          __jsp_taghandler_11.setParameters(OracleJspRuntime.toStr( parameters));
          __jsp_taghandler_11.setExecuteOnLoad(OracleJspRuntime.toStr( execOnLoad));
          __jsp_taghandler_11.setPreFunction(OracleJspRuntime.toStr( preFunction));
          __jsp_taghandler_11.setPostFunction(OracleJspRuntime.toStr( postFunction));
          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
        }
        out.write("\n          \n        <script type=\"text/javascript\">\n            parentObj.onchange = parentOnchange;\n        </script>\n");
        
                if(additionalPaths != null && additionalPaths.length>0) {
        
        out.write("\n            ");
        {
          org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
          __jsp_taghandler_12.setParent(null);
          __jsp_taghandler_12.setItems(additionalPaths);
          __jsp_taghandler_12.setVar("adittionalSource");
          try {
            __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                out.write("                        \n                ");
                {
                  org.ajaxtags.tags.AjaxSelectTag __jsp_taghandler_13=(org.ajaxtags.tags.AjaxSelectTag)OracleJspRuntime.getTagHandler(pageContext,org.ajaxtags.tags.AjaxSelectTag.class,"org.ajaxtags.tags.AjaxSelectTag baseUrl source target parameters executeOnLoad preFunction postFunction");
                  __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                  __jsp_taghandler_13.setBaseUrl(OracleJspRuntime.toStr( baseUrl));
                  __jsp_taghandler_13.setSource((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${adittionalSource}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_taghandler_13.setTarget(OracleJspRuntime.toStr( path));
                  __jsp_taghandler_13.setParameters(OracleJspRuntime.toStr( parameters));
                  __jsp_taghandler_13.setExecuteOnLoad(OracleJspRuntime.toStr( execOnLoad));
                  __jsp_taghandler_13.setPreFunction(OracleJspRuntime.toStr( preFunction));
                  __jsp_taghandler_13.setPostFunction(OracleJspRuntime.toStr( postFunction));
                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                  if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
                }
                out.write("\n            ");
              } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_12.doCatch(th);
          } finally {
            __jsp_taghandler_12.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
        }
        out.write("\n");
                  
                }
            }
        
            
        
            if(path != null && Boolean.valueOf(disabled) && !Boolean.valueOf(multiple)) {
        
        out.write("\n        ");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
          __jsp_taghandler_14.setParent(null);
          __jsp_taghandler_14.setPath(OracleJspRuntime.toStr( path));
          try {
            __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
            if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_14.doCatch(th);
          } finally {
            __jsp_taghandler_14.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
        }
        out.write("\n");
        
            }
        } catch(Exception e) {
            e.printStackTrace();
        }finally{
            pageContext.removeAttribute(filterId, PageContext.REQUEST_SCOPE);
            pageContext.removeAttribute(DynaContentService.ADD_OPTIONS, PageContext.REQUEST_SCOPE);
        }
        
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
        new TagAttributeInfo("beanName",false,"java.lang.String",true,false),
        new TagAttributeInfo("items",false,"java.util.List",true,false),
        new TagAttributeInfo("name",false,"java.lang.String",true,false),
        new TagAttributeInfo("path",false,"java.lang.String",true,false),
        new TagAttributeInfo("parentPath",false,"java.lang.String",true,false),
        new TagAttributeInfo("progress",false,"java.lang.String",true,false),
        new TagAttributeInfo("multiple",false,"java.lang.String",true,false),
        new TagAttributeInfo("size",false,"java.lang.String",true,false),
        new TagAttributeInfo("filterPaths",false,"java.lang.String",true,false),
        new TagAttributeInfo("patternValue",false,"java.lang.String",true,false),
        new TagAttributeInfo("uppercase",false,"java.lang.String",true,false),
        new TagAttributeInfo("disabled",false,"java.lang.String",true,false),
        new TagAttributeInfo("onchange",false,"java.lang.String",true,false),
        new TagAttributeInfo("appendFilters",false,"java.lang.String",true,false),
        new TagAttributeInfo("style",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false),
        new TagAttributeInfo("filterId",false,"java.lang.String",true,false),
        new TagAttributeInfo("onload",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("selectList","_oracle._jsp._tag._selectList_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
