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
import java.util.HashMap;
import gob.shcp.fsn.model.support.FilterDTO;
import gob.shcp.fsn.service.support.DynaContentService;
import gob.shcp.fsn.service.support.PagedListService;
import gob.shcp.fsn.control.view.util.TagUtils;
import gob.shcp.fsn.control.view.decorator.CheckboxTableDecorator;
import org.springframework.util.ClassUtils;


public class _pagedList_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String beanName;
  private java.lang.String service;
  private java.lang.String baseUrl;
  private java.lang.String name;
  private java.util.List items;
  private java.lang.String parentValues;
  private java.lang.String appendFilters;
  private java.lang.String checkbox;
  private java.lang.String chkProperty;
  private java.lang.String maxRows;
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

  public void setService(java.lang.String service)
  {
    this.service = service;
  }

  public java.lang.String getService()
  {
    return this.service;
  }

  public void setBaseUrl(java.lang.String baseUrl)
  {
    this.baseUrl = baseUrl;
  }

  public java.lang.String getBaseUrl()
  {
    return this.baseUrl;
  }

  public void setName(java.lang.String name)
  {
    this.name = name;
  }

  public java.lang.String getName()
  {
    return this.name;
  }

  public void setItems(java.util.List items)
  {
    this.items = items;
  }

  public java.util.List getItems()
  {
    return this.items;
  }

  public void setParentValues(java.lang.String parentValues)
  {
    this.parentValues = parentValues;
  }

  public java.lang.String getParentValues()
  {
    return this.parentValues;
  }

  public void setAppendFilters(java.lang.String appendFilters)
  {
    this.appendFilters = appendFilters;
  }

  public java.lang.String getAppendFilters()
  {
    return this.appendFilters;
  }

  public void setCheckbox(java.lang.String checkbox)
  {
    this.checkbox = checkbox;
  }

  public java.lang.String getCheckbox()
  {
    return this.checkbox;
  }

  public void setChkProperty(java.lang.String chkProperty)
  {
    this.chkProperty = chkProperty;
  }

  public java.lang.String getChkProperty()
  {
    return this.chkProperty;
  }

  public void setMaxRows(java.lang.String maxRows)
  {
    this.maxRows = maxRows;
  }

  public java.lang.String getMaxRows()
  {
    return this.maxRows;
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
        pageContext.setAttribute("service", getService());
        pageContext.setAttribute("baseUrl", getBaseUrl());
        pageContext.setAttribute("name", getName());
        pageContext.setAttribute("items", getItems());
        pageContext.setAttribute("parentValues", getParentValues());
        pageContext.setAttribute("appendFilters", getAppendFilters());
        pageContext.setAttribute("checkbox", getCheckbox());
        pageContext.setAttribute("chkProperty", getChkProperty());
        pageContext.setAttribute("maxRows", getMaxRows());
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
        out.write("\n\n");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write("    ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n\n");
        
        try {
            if((beanName == null || "".equals(beanName)) && (service == null || "".equals(service)) && (items == null)) {
                return;
            }
        
            if (filterId==null || "".equals(filterId) ){
                    filterId = DynaContentService.PAGED_LIST_FILTER;
            }
        
        
            maxRows = maxRows==null ? "-1" : maxRows;
            final int intMaxRows = Integer.parseInt(maxRows);
        
            boolean dynaQuery = true;
            if(appendFilters != null && !"".equals(appendFilters)) {
                dynaQuery = Boolean.valueOf(appendFilters);
            }
            boolean useCheckbox = false;
            if(checkbox != null && !"".equals(checkbox)) {
                useCheckbox = Boolean.valueOf(checkbox);
            }
        
            if(!useCheckbox && (baseUrl == null || "".equals(baseUrl))) {
                baseUrl = "/home";
            }
        
            final FilterDTO pgf = (FilterDTO)pageContext.getAttribute(filterId, PageContext.REQUEST_SCOPE);
        
            String pagedListID = "";
            final List<String> parentVals = new ArrayList<String>();
            if(parentValues != null && !"".equals(parentValues)) {
                String[] array =  parentValues.split(",");
                for(String value: array) {
                    parentVals.add(value.trim());
                }
                //parentValues.add(parentValue);
            }
            int totalRows = 0;
            if(service != null && !"".equals(service)) {
                List data = ((PagedListService)TagUtils.getService(pageContext, (Class)ClassUtils.forName(service))).getDataGrid(TagUtils.getConditions(pgf), parentVals, intMaxRows);
                if(intMaxRows > -1) {
                    totalRows = ((PagedListService)TagUtils.getService(pageContext, (Class)ClassUtils.forName(service))).getDataGridSize(TagUtils.getConditions(pgf), parentVals);
                }
                if(data == null) {
                    data = new ArrayList();
                }
                pagedListID = service;
                request.setAttribute(service.substring(service.lastIndexOf(".")+1), data); 
            }
            if(beanName != null && !"".equals(beanName)) {
        //        if(sessionAttributeStore.retrieveAttribute(webRequest, beanName)==null) {
                    List<String> initParams = new ArrayList<String>();
                    if(parentVals.size()>0) {
                        initParams.addAll(parentVals);
                    }
                    List data = null;
                    if(dynaQuery) {
                        data = TagUtils.getService(pageContext, DynaContentService.class).getDataGrid(beanName, TagUtils.getConditions(pgf), null, initParams, intMaxRows);
                        if(intMaxRows > -1) {
                            totalRows = TagUtils.getService(pageContext, DynaContentService.class).getDataGridSize(beanName, TagUtils.getConditions(pgf), null, initParams);
                        }
                    } else {
                        data = TagUtils.getService(pageContext, DynaContentService.class).getDataGrid(beanName, TagUtils.getConditions(pgf), initParams, intMaxRows);
                        if(intMaxRows > -1) {
                            totalRows = TagUtils.getService(pageContext, DynaContentService.class).getDataGridSize(beanName, TagUtils.getConditions(pgf), initParams);
                        }
                    }
                    if(data == null) {
                        data = new ArrayList();
                    }
                pagedListID = beanName;
                request.setAttribute(beanName, data);
            }
        
            if(totalRows > 0 && intMaxRows > -1 && totalRows > intMaxRows) {
                TagUtils.saveWarning(pageContext, "warn.maxRows.exceeded", null);
            }
        
            if(items != null) {
                if(name == null || "".equals(name)) {
                    name = "items";
                }
                pagedListID = name;
                request.setAttribute(name, items);
            }
            pageContext.removeAttribute(filterId, PageContext.REQUEST_SCOPE);
        
            if(useCheckbox) {
                CheckboxTableDecorator chkTableDecorator = new CheckboxTableDecorator();
                if(chkProperty != null && !"".equals(chkProperty)) {
                    chkTableDecorator.setFieldName(chkProperty);
                    chkTableDecorator.setFieldValueProperty(chkProperty);
                }
                request.setAttribute("checkboxTableDecorator", chkTableDecorator);
        
        out.write("\n        <script type=\"text/javascript\">\n            function displaytagform(formname, fields) {\n                var objfrm = document.forms[formname];\n                objfrm.method = \"get\";\n                for(j=fields.length-1; j>=0 ;j--) {\n                    var f = objfrm.elements[fields[j].f];\n                    if(f) {\n                        if(f.value && fields[j].v instanceof Array && (fields[j].v).length > 1){\n                            for(i=0;i<(fields[j].v).length;i++){\n                                f.value[i] = (fields[j].v)[i];\n                            }\n                        }\n                        else {\n                            f.value = fields[j].v;\n                        }\n                    }\n                }\n                objfrm.submit();\n            }\n        </script>\n        <input type=\"hidden\" name=\"d-16544-p\" value=\"1\"/>\n        <input type=\"hidden\" name=\"d-16544-s\" value=\"\"/>\n        <input type=\"hidden\" name=\"d-16544-o\" value=\"\"/>\n        <div id=\"contentPag\">\n            ");
        {
          String __url=OracleJspRuntime.toStr("/WEB-INF/jsp/layout/message.jsp");
          // Include 
          pageContext.include( __url,false);
          if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
        }

        out.write("\n            <br/>\n            ");
        ((oracle.jsp.runtime.OracleJspContextWrapper) this.jspContext).syncVariableBeforeFragment();
        _jspFragWriter = null;
        if (getJspBody() != null) 
          getJspBody().invoke(_jspFragWriter);
        out.write("\n        </div>\n");
        
            } else {
        
        out.write("\n        ");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setVar("requestURI");
          __jsp_taghandler_1.setValue(baseUrl+".do");
          __jsp_taghandler_1.setScope("request");
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\n        <div id=\"contentPag\">\n            ");
        {
          String __url=OracleJspRuntime.toStr("/WEB-INF/jsp/layout/message.jsp");
          // Include 
          pageContext.include( __url,false);
          if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
        }

        out.write("\n            <br/>\n            ");
        {
          org.ajaxtags.tags.AjaxDisplayTag __jsp_taghandler_2=(org.ajaxtags.tags.AjaxDisplayTag)OracleJspRuntime.getTagHandler(pageContext,org.ajaxtags.tags.AjaxDisplayTag.class,"org.ajaxtags.tags.AjaxDisplayTag id ajaxFlag baseUrl");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setId(OracleJspRuntime.toStr( pagedListID));
          __jsp_taghandler_2.setAjaxFlag("displayAjax");
          __jsp_taghandler_2.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
            do {
              out.write("\n                ");
              ((oracle.jsp.runtime.OracleJspContextWrapper) this.jspContext).syncVariableBeforeFragment();
              _jspFragWriter = null;
              if (getJspBody() != null) 
                getJspBody().invoke(_jspFragWriter);
              out.write("\n            ");
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n        </div>\n");
        
            }
        } catch(javax.servlet.jsp.SkipPageException ignore) {
            //Throws ignore exception to avoid duplicated content in jsp, due "displayAjax" request parameter equals true when this tag includes body (AjaxDisplayTag.java)
            throw ignore;
        } catch(gob.shcp.fsn.service.ServiceException se) {
            TagUtils.saveError(pageContext, se);
        
        out.write("\n    ");
        {
          String __url=OracleJspRuntime.toStr("/WEB-INF/jsp/layout/message.jsp");
          // Include 
          pageContext.include( __url,false);
          if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
        }

        out.write("\n");
        
        } catch(Exception e) {
            e.printStackTrace();
        }finally{
            pageContext.removeAttribute(filterId, PageContext.REQUEST_SCOPE);
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
        new TagAttributeInfo("service",false,"java.lang.String",true,false),
        new TagAttributeInfo("baseUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("name",false,"java.lang.String",true,false),
        new TagAttributeInfo("items",false,"java.util.List",true,false),
        new TagAttributeInfo("parentValues",false,"java.lang.String",true,false),
        new TagAttributeInfo("appendFilters",false,"java.lang.String",true,false),
        new TagAttributeInfo("checkbox",false,"java.lang.String",true,false),
        new TagAttributeInfo("chkProperty",false,"java.lang.String",true,false),
        new TagAttributeInfo("maxRows",false,"java.lang.String",true,false),
        new TagAttributeInfo("filterId",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("pagedList","_oracle._jsp._tag._pagedList_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
