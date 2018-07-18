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
import gob.shcp.fsn.model.support.FilterDTO;
import gob.shcp.fsn.model.support.SelectListDTO;
import gob.shcp.fsn.service.support.DynaContentService;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _autocomplete_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String beanName;
  private java.lang.String name;
  private java.lang.String path;
  private java.lang.String parentPath;
  private java.lang.String valuePath;
  private java.lang.String size;
  private java.lang.String minChars;
  private java.lang.String uppercase;
  private java.lang.String appendFilters;
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

  public void setValuePath(java.lang.String valuePath)
  {
    this.valuePath = valuePath;
  }

  public java.lang.String getValuePath()
  {
    return this.valuePath;
  }

  public void setSize(java.lang.String size)
  {
    this.size = size;
  }

  public java.lang.String getSize()
  {
    return this.size;
  }

  public void setMinChars(java.lang.String minChars)
  {
    this.minChars = minChars;
  }

  public java.lang.String getMinChars()
  {
    return this.minChars;
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
        pageContext.setAttribute("name", getName());
        pageContext.setAttribute("path", getPath());
        pageContext.setAttribute("parentPath", getParentPath());
        pageContext.setAttribute("valuePath", getValuePath());
        pageContext.setAttribute("size", getSize());
        pageContext.setAttribute("minChars", getMinChars());
        pageContext.setAttribute("uppercase", getUppercase());
        pageContext.setAttribute("appendFilters", getAppendFilters());
        pageContext.setAttribute("filterId", getFilterId());


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
        out.write("\n\n");
        
            try{
                boolean dynaQuery = true;
                if (filterId==null || "".equals(filterId) ){
                    filterId = DynaContentService.PAGED_LIST_FILTER;
                }
                if(appendFilters != null && !"".equals(appendFilters)) {
                    dynaQuery = Boolean.valueOf(appendFilters);
                }
            
                boolean upperCased = true;
                if(uppercase != null && !"".equals(uppercase)) {
                    upperCased = Boolean.valueOf(uppercase);
                }
                String cssClass = upperCased ? "uppercase" : "";
                size = size==null ? "" : size;
                minChars = minChars==null ? "2" : minChars;
            
                String source = valuePath==null ? "" : valuePath;
                if("".equals(source) && path!=null && !"".equals(path)) {
                    source = path+"_";
                }
                if("".equals(source) && name!=null && !"".equals(name)) {
                    source = name+"_";
                }
                if("".equals(source)) {
                    return;
                }
        
        out.write("    \n        <input id=\"");
        out.print(source);
        out.write("\" name=\"");
        out.print(source);
        out.write("\" type=\"text\" size=\"");
        out.print(size);
        out.write("\" class=\"");
        out.print(cssClass);
        out.write("\" />\n");
        
                if(path!=null) {
        
        out.write("        \n            ");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setPath(OracleJspRuntime.toStr( path));
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
        out.write("\n            ");
        {
          org.springframework.web.servlet.tags.BindTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${path}",java.lang.String.class, __ojsp_varRes,null));
          org.springframework.web.servlet.support.BindStatus status = null;
          try {
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
                out.write("\n                ");
                {
                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                  __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_3.setVar("requestValue");
                  __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.value}",java.lang.Object.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
                }
                out.write("\n            ");
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
        out.write("    \n");
        
                } else if(name!=null) {
        
        out.write("\n            <input id=\"");
        out.print(name);
        out.write("\" name=\"");
        out.print(name);
        out.write("\" type=\"hidden\"/>\n");
            
                    path = name;
                } else {
                    return;
                }
                FilterDTO filters = (FilterDTO) pageContext.getAttribute(filterId, PageContext.REQUEST_SCOPE);    
                StringBuffer filterStr = new StringBuffer() ;
                Object[] params = new Object[]{};
                if(filters!=null && filters.get()!=null) {
                    for(final Iterator iter = filters.get().iterator(); iter.hasNext();) {
                        params = (Object[]) iter.next();            
                        filterStr.append("filter_value_").append(params[0]).append("=").append(params[2]).append(", ");
                        filterStr.append("filter_condition_").append(params[0]).append("=").append(params[1]).append(", ");
                    }    
                }
                String indicator = "indicator"+path;
                String parameters = new String();
                if(parentPath!=null) {
                    parameters = "padre={"+parentPath+"},";
                }
                if(upperCased) {
                    parameters += "uppercase=true,";
                }
                if(dynaQuery) {
                    parameters += "dynaQuery=true,";
                }
                
                parameters += "sourceName="+source+", beanName="+beanName+", "+filterStr.toString();
        
        out.write("    \n        ");
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
        out.write("\n        <span id=\"indicator");
        out.print(path);
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
        out.write("\" /></span>\n        ");
        {
          org.ajaxtags.tags.AjaxAutocompleteTag __jsp_taghandler_6=(org.ajaxtags.tags.AjaxAutocompleteTag)OracleJspRuntime.getTagHandler(pageContext,org.ajaxtags.tags.AjaxAutocompleteTag.class,"org.ajaxtags.tags.AjaxAutocompleteTag baseUrl source target parameters className minimumCharacters indicator");
          __jsp_taghandler_6.setParent(null);
          __jsp_taghandler_6.setBaseUrl((java.lang.String) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contextPath}",java.lang.String.class, __ojsp_varRes, null)+"util/getAutoCompleteElements.do"));
          __jsp_taghandler_6.setSource(OracleJspRuntime.toStr( source));
          __jsp_taghandler_6.setTarget(OracleJspRuntime.toStr( path));
          __jsp_taghandler_6.setParameters(OracleJspRuntime.toStr( parameters));
          __jsp_taghandler_6.setClassName("autocomplete");
          __jsp_taghandler_6.setMinimumCharacters(OracleJspRuntime.toStr( minChars));
          __jsp_taghandler_6.setIndicator(OracleJspRuntime.toStr( indicator));
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
        }
        out.write("\n");
            
                Object obj = pageContext.getAttribute("requestValue");
                if(obj!=null && !obj.equals("")) {
                    String key = obj.toString();
                    if (filters==null){
                        filters = new FilterDTO();
                    }
                    filters.addFilter(path, "=", key);
                    String parent = null;
                    if(parentPath!=null) {
        
        out.write("\n                ");
        {
          org.springframework.web.servlet.tags.BindTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
          __jsp_taghandler_7.setParent(null);
          __jsp_taghandler_7.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${parentPath}",java.lang.String.class, __ojsp_varRes,null));
          org.springframework.web.servlet.support.BindStatus status = null;
          try {
            __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
                out.write("\n                    ");
                {
                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                  __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                  __jsp_taghandler_8.setVar("parentValue");
                  __jsp_taghandler_8.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.value}",java.lang.Object.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
                }
                out.write("\n                ");
              } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_7.doCatch(th);
          } finally {
            __jsp_taghandler_7.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
        }
        out.write("    \n");
        
                        Object parentObj =pageContext.getAttribute("parentValue");
                        if(parentObj!=null) {
                            parent = parentObj.toString();
                        }
                    }
                    
                    String valor = null;
                    if(dynaQuery) {
                        valor = TagUtils.getService(pageContext, DynaContentService.class).getAutoCompleteValue(beanName, TagUtils.getConditions(filters), null, parent);
                    } else {
                        valor = TagUtils.getService(pageContext, DynaContentService.class).getAutoCompleteValue(beanName, TagUtils.getConditions(filters), parent);
                    }
                    if(valor==null || valor.equals("")) {
                        key = "";
                    }
        
        out.write("\n            <script type=\"text/javascript\">\n                document.forms[0].");
        out.print(source);
        out.write(".value = \"");
        out.print(valor);
        out.write("\";\n                document.forms[0].");
        out.print(path);
        out.write(".value = \"");
        out.print(key);
        out.write("\";\n            </script>\n");
        
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                pageContext.removeAttribute(filterId, PageContext.REQUEST_SCOPE);
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
        new TagAttributeInfo("beanName",true,"java.lang.String",true,false),
        new TagAttributeInfo("name",false,"java.lang.String",true,false),
        new TagAttributeInfo("path",false,"java.lang.String",true,false),
        new TagAttributeInfo("parentPath",false,"java.lang.String",true,false),
        new TagAttributeInfo("valuePath",false,"java.lang.String",true,false),
        new TagAttributeInfo("size",false,"java.lang.String",true,false),
        new TagAttributeInfo("minChars",false,"java.lang.String",true,false),
        new TagAttributeInfo("uppercase",false,"java.lang.String",true,false),
        new TagAttributeInfo("appendFilters",false,"java.lang.String",true,false),
        new TagAttributeInfo("filterId",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("autocomplete","_oracle._jsp._tag._autocomplete_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
