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
import gob.shcp.fsn.service.support.DynaContentService;
import gob.shcp.fsn.model.support.FilterDTO;
import gob.shcp.fsn.model.support.SelectListDTO;
import gob.shcp.fsn.control.binder.ControllerWebBindingInitializer;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _doubleSelectList_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String beanName;
  private java.util.List items;
  private java.lang.String path;
  private java.lang.String parentPath;
  private java.lang.String filterPaths;
  private java.lang.String progress;
  private java.lang.String name;
  private java.lang.String size;
  private java.lang.String uppercase;
  private java.lang.String appendFilters;
  private java.lang.String titleOrgn;
  private java.lang.String titleDest;
  private java.lang.String disabled;
  private java.lang.String width;
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

  public void setFilterPaths(java.lang.String filterPaths)
  {
    this.filterPaths = filterPaths;
  }

  public java.lang.String getFilterPaths()
  {
    return this.filterPaths;
  }

  public void setProgress(java.lang.String progress)
  {
    this.progress = progress;
  }

  public java.lang.String getProgress()
  {
    return this.progress;
  }

  public void setName(java.lang.String name)
  {
    this.name = name;
  }

  public java.lang.String getName()
  {
    return this.name;
  }

  public void setSize(java.lang.String size)
  {
    this.size = size;
  }

  public java.lang.String getSize()
  {
    return this.size;
  }

  public void setUppercase(java.lang.String uppercase)
  {
    this.uppercase = uppercase;
  }

  public java.lang.String getUppercase()
  {
    return this.uppercase;
  }

  public void setAppendFilters(java.lang.String appendFilters)
  {
    this.appendFilters = appendFilters;
  }

  public java.lang.String getAppendFilters()
  {
    return this.appendFilters;
  }

  public void setTitleOrgn(java.lang.String titleOrgn)
  {
    this.titleOrgn = titleOrgn;
  }

  public java.lang.String getTitleOrgn()
  {
    return this.titleOrgn;
  }

  public void setTitleDest(java.lang.String titleDest)
  {
    this.titleDest = titleDest;
  }

  public java.lang.String getTitleDest()
  {
    return this.titleDest;
  }

  public void setDisabled(java.lang.String disabled)
  {
    this.disabled = disabled;
  }

  public java.lang.String getDisabled()
  {
    return this.disabled;
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
        pageContext.setAttribute("path", getPath());
        pageContext.setAttribute("parentPath", getParentPath());
        pageContext.setAttribute("filterPaths", getFilterPaths());
        pageContext.setAttribute("progress", getProgress());
        pageContext.setAttribute("name", getName());
        pageContext.setAttribute("size", getSize());
        pageContext.setAttribute("uppercase", getUppercase());
        pageContext.setAttribute("appendFilters", getAppendFilters());
        pageContext.setAttribute("titleOrgn", getTitleOrgn());
        pageContext.setAttribute("titleDest", getTitleDest());
        pageContext.setAttribute("disabled", getDisabled());
        pageContext.setAttribute("width", getWidth());
        pageContext.setAttribute("filterId", getFilterId());


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
        out.write("\n\n");
        
            try{
                if((beanName == null || "".equals(beanName)) && (items == null)){
                    return;
                }
                
                boolean isReadonly = Boolean.valueOf(disabled);
                
                boolean dynaQuery = true;
                
                if (filterId==null || "".equals(filterId) ){
                    filterId = DynaContentService.PAGED_LIST_FILTER;
                }
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
            
                if (path==null && name==null){
                    return;
                }
                if (path==null || path.equals("")){
                    path=name;    
                }else{
        
        out.write("\n            ");
        {
          org.springframework.web.servlet.tags.BindTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${path}",java.lang.String.class, __ojsp_varRes,null));
          org.springframework.web.servlet.support.BindStatus status = null;
          try {
            __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
                out.write("\n                ");
                {
                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                  __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                  __jsp_taghandler_2.setVar("requestValue");
                  __jsp_taghandler_2.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.value}",java.lang.Object.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                  if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
                }
                out.write("\n            ");
              } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_1.doCatch(th);
          } finally {
            __jsp_taghandler_1.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("   \n");
        
                }
                final String sourceName = path + "_source";
                final String targetName = path + "_target";
            
                List data = new ArrayList();
                final FilterDTO filters = (FilterDTO)pageContext.getAttribute(filterId, PageContext.REQUEST_SCOPE);
                if((parentPath==null || "".equals(parentPath)) && (beanName != null && !"".equals(beanName))) {
                    if(dynaQuery){
                        data = TagUtils.getService(pageContext, DynaContentService.class).getListElements(beanName, TagUtils.getConditions(filters), null, null, null);
                    }else{
                        data = TagUtils.getService(pageContext, DynaContentService.class).getListElements(beanName, TagUtils.getConditions(filters), null, null);
                    }
                }
                if(items != null){
                    data = items;            
                }
                StringBuffer options = new StringBuffer();
        
        out.write("      \n    <div id=\"divDoubleSelect\" onmouseout=\"if (isMouseOut(event, this)) selectAllOptions('");
        out.print(targetName);
        out.write("');\">\n    <table id=\"tableDoubleSelect\" >\n        <tr valign=\"middle\">\n            <td>                \n                ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setCode((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${titleOrgn}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_taghandler_3.setText((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${titleOrgn}",java.lang.String.class, __ojsp_varRes,null));
          try {
            __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
            if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_3.doCatch(th);
          } finally {
            __jsp_taghandler_3.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
        }
        out.write("\n            </td>\n            <td align=\"center\" >\n");
        
                        if(progress!=null && progress.equals("true")) {
        
        out.write("\n                    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var value");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setVar("contextPath");
          __jsp_taghandler_4.setValue("/");
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
        }
        out.write("\n                    <span id=\"progressMsg");
        out.print(sourceName);
        out.write("\" style=\"display:none;\"><img alt=\"indicator\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_5.setParent(null);
          __jsp_taghandler_5.setCode("indicator.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
            if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_5.doCatch(th);
          } finally {
            __jsp_taghandler_5.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
        }
        out.write("\" /></span>\n");
        
                        }
        
        out.write("\n            </td>\n            <td>                \n                ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text");
          __jsp_taghandler_6.setParent(null);
          __jsp_taghandler_6.setCode((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${titleDest}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_taghandler_6.setText((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${titleDest}",java.lang.String.class, __ojsp_varRes,null));
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
        out.write("\n            </td>\n        </tr>\n        <tr valign=\"middle\">\n            <td >\n");
        
                        if(upperCased) {
        
        out.write("\n                    <input  type=\"hidden\" name=\"");
        out.print(ControllerWebBindingInitializer.UPPER_CASE_PREFIX);
        out.print(path);
        out.write("\" value=\"true\"  />\n");
        
                        }
                        
                        if(isReadonly) {
        
        out.write("\n                ");
        {
          org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
          __jsp_taghandler_7.setParent(null);
          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                __jsp_taghandler_8.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${width != null}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n                        <select name=\"");
                    out.print(sourceName);
                    out.write("\" id=\"");
                    out.print(sourceName);
                    out.write("\" cssClass=\"");
                    out.print(cssClass);
                    out.write("\" multiple=\"true\" size=\"");
                    out.print(size);
                    out.write("\" style=\"width: ");
                    out.print(width);
                    out.write("px\">\n                    ");
                  } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write("                        \n                    ");
              {
                org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                __jsp_taghandler_9.setParent(__jsp_taghandler_7);
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n                        <select name=\"");
                    out.print(sourceName);
                    out.write("\" id=\"");
                    out.print(sourceName);
                    out.write("\" cssClass=\"");
                    out.print(cssClass);
                    out.write("\" multiple=\"true\" size=\"");
                    out.print(size);
                    out.write("\">\n                    ");
                  } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write("\n                ");
            } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
        }
        out.write("\n");
        
                        }else{
        
        out.write("                \n                ");
        {
          org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
          __jsp_taghandler_10.setParent(null);
          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                __jsp_taghandler_11.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${width != null}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n                        <select name=\"");
                    out.print(sourceName);
                    out.write("\" id=\"");
                    out.print(sourceName);
                    out.write("\" cssClass=\"");
                    out.print(cssClass);
                    out.write("\" multiple=\"true\" size=\"");
                    out.print(size);
                    out.write("\" ondblclick=\"moveOptions");
                    out.print(sourceName);
                    out.write("('");
                    out.print(sourceName);
                    out.write("','");
                    out.print(targetName);
                    out.write("');\" style=\"width: ");
                    out.print(width);
                    out.write("px\">\n                    ");
                  } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write("                        \n                    ");
              {
                org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n                        <select name=\"");
                    out.print(sourceName);
                    out.write("\" id=\"");
                    out.print(sourceName);
                    out.write("\" cssClass=\"");
                    out.print(cssClass);
                    out.write("\" multiple=\"true\" size=\"");
                    out.print(size);
                    out.write("\" ondblclick=\"moveOptions");
                    out.print(sourceName);
                    out.write("('");
                    out.print(sourceName);
                    out.write("','");
                    out.print(targetName);
                    out.write("');\">\n                    ");
                  } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write("\n                ");
            } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
        }
        out.write("\n");
        
                        }
                            for (final Iterator iter = data.iterator(); iter.hasNext();){
                                SelectListDTO selectList = (SelectListDTO)iter.next();
                                Object values =  pageContext.getAttribute("requestValue");
                                String selected = "";
                                if (values instanceof Collection){
                                    for(final Iterator itValues = ((Collection) values).iterator(); itValues.hasNext();){
                                        if (selectList.getKey().equals(itValues.next())){
                                            selected="selected=\"selected\"";
                                        }
                                        options.append(selectList.getKey()).append("::").append(selectList.getValue()).append(";");
                                    }
                                }
        
        out.write("\n                        <option value=\"");
        out.print(selectList.getKey());
        out.write("\" ");
        out.print(selected);
        out.write(" >");
        out.print(selectList.getValue());
        out.write("</option>\n");
        
                            }
        
        out.write("\n                </select>        \n            </td>\n            <td class=\"buttons\">\n                <table id=\"tbBotones\" width=\"100%\" >\n");
        
                        if(isReadonly) {
        
        out.write("\n                    <tr>\n                        <td align=\"center\" >\n                            <img alt=\"Agregar Todos\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_13.setParent(null);
          __jsp_taghandler_13.setCode("last.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
            if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_13.doCatch(th);
          } finally {
            __jsp_taghandler_13.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,1);
        }
        out.write("\" width=\"20\" height=\"20\"/>\n                        </td>\n                    </tr>\n                    <tr>\n                        <td align=\"center\" >\n                            <img alt=\"Agregar\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_14.setParent(null);
          __jsp_taghandler_14.setCode("next.gif");
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
        out.write("\" width=\"20\" height=\"20\" />\n                        </td>\n                    </tr>\n                    <tr>\n                        <td align=\"center\" >\n                            <img alt=\"Eliminar\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_15.setParent(null);
          __jsp_taghandler_15.setCode("prev.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
            if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_15.doCatch(th);
          } finally {
            __jsp_taghandler_15.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,1);
        }
        out.write("\" width=\"20\" height=\"20\"/>\n                        </td>\n                    </tr>\n                    <tr >\n                        <td align=\"center\" >\n                            <img alt=\"Eliminar Todos\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_16.setParent(null);
          __jsp_taghandler_16.setCode("first.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
            if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_16.doCatch(th);
          } finally {
            __jsp_taghandler_16.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,1);
        }
        out.write("\" width=\"20\" height=\"20\"/>\n                        </td>\n                    </tr>\n");
        
                        }else{
        
        out.write("                \n                    <tr>\n                        <td align=\"center\" >\n                            <a href=\"javascript:moveAllOptions");
        out.print(sourceName);
        out.write("('");
        out.print(sourceName);
        out.write("','");
        out.print(targetName);
        out.write("');\">\n                                <img alt=\"Agregar Todos\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_17.setParent(null);
          __jsp_taghandler_17.setCode("last.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
            if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_17.doCatch(th);
          } finally {
            __jsp_taghandler_17.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,1);
        }
        out.write("\" width=\"20\" height=\"20\"/>\n                            </a>\n                        </td>\n                    </tr>\n                    <tr>\n                        <td align=\"center\" >\n                            <a href=\"javascript:moveOptions");
        out.print(sourceName);
        out.write("('");
        out.print(sourceName);
        out.write("','");
        out.print(targetName);
        out.write("');\">\n                                <img alt=\"Agregar\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_18.setParent(null);
          __jsp_taghandler_18.setCode("next.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
            if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_18.doCatch(th);
          } finally {
            __jsp_taghandler_18.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,1);
        }
        out.write("\" width=\"20\" height=\"20\" />\n                            </a>\n                        </td>\n                    </tr>\n                    <tr>\n                        <td align=\"center\" >\n                            <a href=\"javascript:moveOptions");
        out.print(sourceName);
        out.write("('");
        out.print(targetName);
        out.write("','");
        out.print(sourceName);
        out.write("');\">\n                                <img alt=\"Eliminar\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_19.setParent(null);
          __jsp_taghandler_19.setCode("prev.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
            if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_19.doCatch(th);
          } finally {
            __jsp_taghandler_19.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,1);
        }
        out.write("\" width=\"20\" height=\"20\"/>\n                            </a>\n                        </td>\n                    </tr>\n                    <tr >\n                        <td align=\"center\" >\n                            <a href=\"javascript:moveAllOptions");
        out.print(sourceName);
        out.write("('");
        out.print(targetName);
        out.write("','");
        out.print(sourceName);
        out.write("');\">\n                                <img alt=\"Eliminar Todos\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_20.setParent(null);
          __jsp_taghandler_20.setCode("first.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
            if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_20.doCatch(th);
          } finally {
            __jsp_taghandler_20.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,1);
        }
        out.write("\" width=\"20\" height=\"20\"/>\n                            </a>\n                        </td>\n                    </tr>\n");
        
                        }
        
        out.write("     \n                </table>\n            </td>\n            <td>\n");
        
                        if(upperCased) {
        
        out.write("\n                    <input type=\"hidden\" name=\"");
        out.print(ControllerWebBindingInitializer.UPPER_CASE_PREFIX);
        out.print(path);
        out.write("\" value=\"true\"/>\n");
        
                        }
                        
                        if(isReadonly){
        
        out.write("\n                ");
        {
          org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
          __jsp_taghandler_21.setParent(null);
          __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                __jsp_taghandler_22.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${width != null}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n                        <select name=\"");
                    out.print(path);
                    out.write("\" id=\"");
                    out.print(targetName);
                    out.write("\" cssClass=\"");
                    out.print(cssClass);
                    out.write("\" multiple=\"true\" size=\"");
                    out.print(size);
                    out.write("\" style=\"width: ");
                    out.print(width);
                    out.write("px\">\n                    ");
                  } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
              }
              out.write("                        \n                    ");
              {
                org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                __jsp_taghandler_23.setParent(__jsp_taghandler_21);
                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n                        <select name=\"");
                    out.print(path);
                    out.write("\" id=\"");
                    out.print(targetName);
                    out.write("\" cssClass=\"");
                    out.print(cssClass);
                    out.write("\" multiple=\"true\" size=\"");
                    out.print(size);
                    out.write("\">\n                    ");
                  } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
              }
              out.write("\n                ");
            } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,1);
        }
        out.write("\n");
        
                        }else{
        
        out.write("\n                ");
        {
          org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
          __jsp_taghandler_24.setParent(null);
          __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                __jsp_taghandler_25.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${width != null}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n                        <select name=\"");
                    out.print(path);
                    out.write("\" id=\"");
                    out.print(targetName);
                    out.write("\" cssClass=\"");
                    out.print(cssClass);
                    out.write("\" multiple=\"true\" size=\"");
                    out.print(size);
                    out.write("\" ondblclick=\"moveOptions");
                    out.print(sourceName);
                    out.write("('");
                    out.print(targetName);
                    out.write("','");
                    out.print(sourceName);
                    out.write("');\" style=\"width: ");
                    out.print(width);
                    out.write("px\">\n                    ");
                  } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
              }
              out.write("                        \n                    ");
              {
                org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                __jsp_taghandler_26.setParent(__jsp_taghandler_24);
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n                        <select name=\"");
                    out.print(path);
                    out.write("\" id=\"");
                    out.print(targetName);
                    out.write("\" cssClass=\"");
                    out.print(cssClass);
                    out.write("\" multiple=\"true\" size=\"");
                    out.print(size);
                    out.write("\" ondblclick=\"moveOptions");
                    out.print(sourceName);
                    out.write("('");
                    out.print(targetName);
                    out.write("','");
                    out.print(sourceName);
                    out.write("');\" >\n                    ");
                  } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
              }
              out.write("\n                ");
            } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,1);
        }
        out.write("\n");
        
                        }
        
        out.write("\n                </select>\n                <input id=\"_");
        out.print(path);
        out.write("\" type=\"hidden\" name=\"_");
        out.print(path);
        out.write("\" value=\"1\"/>\n            </td>\n        </tr>\n    </table>\n</div>\n<script language=\"javascript\" type=\"text/javascript\">\n    var orderOptions");
        out.print(sourceName);
        out.write(" = new Array();\n    var orderOptionsIds");
        out.print(sourceName);
        out.write(" = new Array();\n    setOptionsOrder");
        out.print(sourceName);
        out.write("('");
        out.print(sourceName);
        out.write("');\n    initDoubleSelect('");
        out.print(sourceName);
        out.write("','");
        out.print(targetName);
        out.write("',orderOptionsIds");
        out.print(sourceName);
        out.write(");        \n    \n    \n    //Guarda el orden original de las opciones del selectSource dentro de la variable orderOptions[].\n    function setOptionsOrder");
        out.print(sourceName);
        out.write("(_selectId){\n        var _selSource = document.getElementById(_selectId);\n        var options = _selSource.options;        \n        for (i=0;i<options.length;i++){\n            orderOptions");
        out.print(sourceName);
        out.write("[i] = new Array();            \n            orderOptions");
        out.print(sourceName);
        out.write("[i][0] = options[i].text;\n            orderOptions");
        out.print(sourceName);
        out.write("[i][1] = options[i].value;\n            orderOptionsIds");
        out.print(sourceName);
        out.write("[i] = options[i].value;\n        }        \n    }\n    \n    function moveOptions");
        out.print(sourceName);
        out.write("(source, target){\n        moveOptions(source, target, orderOptionsIds");
        out.print(sourceName);
        out.write(");        \n    }\n    \n    function moveAllOptions");
        out.print(sourceName);
        out.write("(source, target){\n        moveAllOptions(source, target, orderOptions");
        out.print(sourceName);
        out.write(");        \n    }\n\n</script>\n\n");
        
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
                String parameters   = "padre={"+parentPath+"}, " + addPathParams + "beanName="+beanName+", "+filterStr.toString()+", options="+options.toString()+", dynaQuery="+dynaQuery ;
                String preFunction  = "initProgress"+sourceName;
                String postFunction = "resetProgress"+sourceName;
                String baseUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/util/getListElements.do";
        
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
                
                String stringArrValue = arrValue.toString();
        
        out.write("  \n        <script type=\"text/javascript\">\n            function initProgress");
        out.print(sourceName);
        out.write("() {\n                document.getElementById('");
        out.print(sourceName);
        out.write("').options.length = 0;\n                document.getElementById('");
        out.print(targetName);
        out.write("').options.length = 0;\n                Element.show('progressMsg");
        out.print(sourceName);
        out.write("');\n            }\n            \n            function resetProgress");
        out.print(sourceName);
        out.write("() {                \n                setTimeout(\"delayResetProgress");
        out.print(sourceName);
        out.write("()\", 500);                                \n            }\n    \n            function delayResetProgress");
        out.print(sourceName);
        out.write("() {\n                if(document.getElementById('");
        out.print(sourceName);
        out.write("').options.length > 0){\n                    setOptionsOrder");
        out.print(sourceName);
        out.write("('");
        out.print(sourceName);
        out.write("');\n                    updateOptions('");
        out.print(sourceName);
        out.write("','");
        out.print(targetName);
        out.write("','");
        out.print(stringArrValue);
        out.write("', orderOptionsIds");
        out.print(sourceName);
        out.write(");\n                    selectAllOptions('");
        out.print(targetName);
        out.write("')\n                }\n                Effect.Fade('progressMsg");
        out.print(sourceName);
        out.write("');\n            }\n        </script> \n    \n        ");
        {
          org.ajaxtags.tags.AjaxSelectTag __jsp_taghandler_27=(org.ajaxtags.tags.AjaxSelectTag)OracleJspRuntime.getTagHandler(pageContext,org.ajaxtags.tags.AjaxSelectTag.class,"org.ajaxtags.tags.AjaxSelectTag baseUrl source target parameters executeOnLoad preFunction postFunction");
          __jsp_taghandler_27.setParent(null);
          __jsp_taghandler_27.setBaseUrl(OracleJspRuntime.toStr( baseUrl));
          __jsp_taghandler_27.setSource(OracleJspRuntime.toStr( parentPath));
          __jsp_taghandler_27.setTarget(OracleJspRuntime.toStr( sourceName));
          __jsp_taghandler_27.setParameters(OracleJspRuntime.toStr( parameters));
          __jsp_taghandler_27.setExecuteOnLoad("true");
          __jsp_taghandler_27.setPreFunction(OracleJspRuntime.toStr( preFunction));
          __jsp_taghandler_27.setPostFunction(OracleJspRuntime.toStr( postFunction));
          __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
          if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,1);
        }
        out.write(" \n");
        
                if(additionalPaths != null && additionalPaths.length > 0){
        
        out.write("\n            ");
        {
          org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
          __jsp_taghandler_28.setParent(null);
          __jsp_taghandler_28.setItems(additionalPaths);
          __jsp_taghandler_28.setVar("adittionalSource");
          try {
            __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                out.write("                        \n                ");
                {
                  org.ajaxtags.tags.AjaxSelectTag __jsp_taghandler_29=(org.ajaxtags.tags.AjaxSelectTag)OracleJspRuntime.getTagHandler(pageContext,org.ajaxtags.tags.AjaxSelectTag.class,"org.ajaxtags.tags.AjaxSelectTag baseUrl source target parameters preFunction postFunction");
                  __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                  __jsp_taghandler_29.setBaseUrl(OracleJspRuntime.toStr( baseUrl));
                  __jsp_taghandler_29.setSource((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${adittionalSource}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_taghandler_29.setTarget(OracleJspRuntime.toStr( sourceName));
                  __jsp_taghandler_29.setParameters(OracleJspRuntime.toStr( parameters));
                  __jsp_taghandler_29.setPreFunction(OracleJspRuntime.toStr( preFunction));
                  __jsp_taghandler_29.setPostFunction(OracleJspRuntime.toStr( postFunction));
                  __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                  if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,2);
                }
                out.write("\n            ");
              } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_28.doCatch(th);
          } finally {
            __jsp_taghandler_28.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,1);
        }
        out.write("\n");
                  
                }
        
            }
            
            }catch(Exception e){
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
        new TagAttributeInfo("beanName",false,"java.lang.String",true,false),
        new TagAttributeInfo("items",false,"java.util.List",true,false),
        new TagAttributeInfo("path",false,"java.lang.String",true,false),
        new TagAttributeInfo("parentPath",false,"java.lang.String",true,false),
        new TagAttributeInfo("filterPaths",false,"java.lang.String",true,false),
        new TagAttributeInfo("progress",false,"java.lang.String",true,false),
        new TagAttributeInfo("name",false,"java.lang.String",true,false),
        new TagAttributeInfo("size",false,"java.lang.String",true,false),
        new TagAttributeInfo("uppercase",false,"java.lang.String",true,false),
        new TagAttributeInfo("appendFilters",false,"java.lang.String",true,false),
        new TagAttributeInfo("titleOrgn",false,"java.lang.String",true,false),
        new TagAttributeInfo("titleDest",false,"java.lang.String",true,false),
        new TagAttributeInfo("disabled",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false),
        new TagAttributeInfo("filterId",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("doubleSelectList","_oracle._jsp._tag._doubleSelectList_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
