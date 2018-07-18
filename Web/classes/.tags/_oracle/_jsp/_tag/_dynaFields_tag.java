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
import gob.shcp.fsn.model.support.FieldDTO;
import gob.shcp.fsn.model.support.FieldType;
import gob.shcp.fsn.model.support.DynaFieldContainerDTO;
import gob.shcp.fsn.model.support.FilterDTO;
import gob.shcp.fsn.model.support.SelectListDTO;
import gob.shcp.fsn.service.support.DynaContentService;
import gob.shcp.fsn.control.binder.ControllerWebBindingInitializer;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _dynaFields_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String container;
  private java.lang.String columns;
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

  public void setContainer(java.lang.String container)
  {
    this.container = container;
  }

  public java.lang.String getContainer()
  {
    return this.container;
  }

  public void setColumns(java.lang.String columns)
  {
    this.columns = columns;
  }

  public java.lang.String getColumns()
  {
    return this.columns;
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
        pageContext.setAttribute("container", getContainer());
        pageContext.setAttribute("columns", getColumns());
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
        out.write(" \n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        
            try{
                DynaFieldContainerDTO containerDTO = (DynaFieldContainerDTO)pageContext.getAttribute(container, PageContext.REQUEST_SCOPE);
                String fieldPath = "";
                String fieldID = "";
               
                 if (filterId==null || "".equals(filterId) ){
                     filterId = DynaContentService.PAGED_LIST_FILTER;
                 }
        
        
                if(containerDTO != null && containerDTO.getFields().size() > 0 ){
                    int cols = columns==null ? 1 : Integer.parseInt(columns);
                    int i = 0;
                    for(FieldDTO field : containerDTO.getFields()){
                        fieldPath = "fields[" + i + "]";
                        fieldID = "field_" + i;
                        String readonly = field.getAttribute("readonly");
                        String size = field.getAttribute("size");
                        String maxlength = field.getAttribute("maxlength");
        
        out.write("\n                <tr>\n                    <td align=\"right\" class=\"label\">");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setValue(field.getLabel());
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("</td>\n                    <td align=\"left\">\n                        ");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setPath(OracleJspRuntime.toStr( fieldPath + ".type"));
          try {
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_2.doCatch(th);
          } finally {
            __jsp_taghandler_2.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n                        ");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setPath(OracleJspRuntime.toStr( fieldPath + ".name"));
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
        out.write("\n                        ");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setPath(OracleJspRuntime.toStr( fieldPath + ".label"));
          try {
            __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
            if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_4.doCatch(th);
          } finally {
            __jsp_taghandler_4.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
        }
        out.write("\n                        ");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
          __jsp_taghandler_5.setParent(null);
          __jsp_taghandler_5.setPath(OracleJspRuntime.toStr( fieldPath + ".attributes"));
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
        out.write("\n");
        
                        if(field.getType().equals(FieldType.TEXT)){
                            String disabled = field.getAttribute("disabled");
                            String htmlEscape = field.getAttribute("htmlEscape");
                            String title = field.getAttribute("title");
                            String uppercase = field.getAttribute("uppercase");
                            String onblur = field.getAttribute("onblur");
                            String onkeyup = field.getAttribute("onkeyup");
                            String onkeypress = field.getAttribute("onkeypress");                    
                            
                            boolean upperCased = (uppercase != null && !"".equals(uppercase))?Boolean.valueOf(uppercase):true;
                            String cssClass = upperCased ? "uppercase" : "";
                            disabled = Boolean.valueOf(disabled).toString();
                            maxlength = maxlength==null? "" : maxlength;
                            readonly = Boolean.valueOf(readonly).toString();
                            size = size==null ? "" : size;
                            title = title==null ? "" : title;
                            onblur = onblur==null ? "" : onblur;
                            onkeyup = onkeyup==null ? "" : onkeyup;
                            onkeypress = onkeypress==null ? "" : onkeypress;
        
                            if(upperCased) {
        
        out.write("\n                        <input type=\"hidden\" name='");
        out.print(ControllerWebBindingInitializer.UPPER_CASE_PREFIX);
        out.print(fieldPath + ".value");
        out.write("' value=\"true\"/>\n");
        
                            }                    
        
        out.write("\n                    ");
        {
          org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
          __jsp_taghandler_6.setParent(null);
          __jsp_taghandler_6.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty htmlEscape}",java.lang.Boolean.class, __ojsp_varRes,null)));
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n                        ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                __jsp_taghandler_7.setVar("htmlEscape");
                __jsp_taghandler_7.setValue("false");
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write("\n                    ");
            } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
        }
        out.write("\n                    ");
        {
          org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path cssClass title disabled onkeypress onkeyup onblur size maxlength readonly");
          __jsp_taghandler_8.setParent(null);
          __jsp_taghandler_8.setPath(OracleJspRuntime.toStr( fieldPath + ".value"));
          __jsp_taghandler_8.setCssClass(OracleJspRuntime.toStr( cssClass));
          __jsp_taghandler_8.setTitle(OracleJspRuntime.toStr( title));
          __jsp_taghandler_8.setDisabled(OracleJspRuntime.toStr( disabled));
          __jsp_taghandler_8.setOnkeypress(OracleJspRuntime.toStr( onkeypress));
          __jsp_taghandler_8.setOnkeyup(OracleJspRuntime.toStr( onkeyup));
          __jsp_taghandler_8.setOnblur(OracleJspRuntime.toStr( onblur));
          __jsp_taghandler_8.setSize(OracleJspRuntime.toStr( size));
          __jsp_taghandler_8.setMaxlength(OracleJspRuntime.toStr( maxlength));
          __jsp_taghandler_8.setReadonly(OracleJspRuntime.toStr( readonly));
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
        out.write("\n");
        
                        }else if(field.getType().equals(FieldType.CALENDAR)){
                            String dateFormat = field.getAttribute("dateFormat");
                            String javaDateFormat = field.getAttribute("javaDateFormat");
                            if(readonly == null || readonly.equals("")){
                                readonly = "true";
                            }
                            if(size == null || size.equals("")){
                                size = "12";
                            }
                            if(dateFormat == null || dateFormat.equals("")){
                                dateFormat = "%d/%m/%Y";
                            }
                            if(maxlength == null || maxlength.equals("")){
                                maxlength = "10";
                            }
        
        out.write("                        \n                    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var value");
          __jsp_taghandler_9.setParent(null);
          __jsp_taghandler_9.setVar("contextPath");
          __jsp_taghandler_9.setValue("/");
          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
        }
        out.write("\n                    ");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
          __jsp_taghandler_10.setParent(null);
          __jsp_taghandler_10.setPath(OracleJspRuntime.toStr( fieldPath + ".value"));
          __jsp_taghandler_10.setId(OracleJspRuntime.toStr( fieldID));
          try {
            __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
            if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_10.doCatch(th);
          } finally {
            __jsp_taghandler_10.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
        }
        out.write("\n");
        
                            if(javaDateFormat != null && !javaDateFormat.equals("")){
        
        out.write("\n                        <input type=\"hidden\" name=\"");
        out.print(ControllerWebBindingInitializer.DATE_FORMAT_PREFIX);
        out.print(fieldID);
        out.write("\" value=\"");
        out.print(javaDateFormat);
        out.write("\"/>\n");
        
                            }
                            if(Boolean.valueOf(readonly)){
        
        out.write("\n                        <input type=\"text\" maxlength=\"");
        out.print(maxlength);
        out.write("\"  readonly=\"readonly\" name=\"text_");
        out.print(fieldID);
        out.write("\" id=\"text_");
        out.print(fieldID);
        out.write("\" size=\"");
        out.print(size);
        out.write("\" onblur=\"changeValue_");
        out.print(fieldID);
        out.write("()\"/>\n");
        
                            } else {
        
        out.write("\n                        <input type=\"text\" maxlength=\"");
        out.print(maxlength);
        out.write("\" name=\"text_");
        out.print(fieldID);
        out.write("\" id=\"text_");
        out.print(fieldID);
        out.write("\" size=\"");
        out.print(size);
        out.write("\" onblur=\"changeValue_");
        out.print(fieldID);
        out.write("()\"/>\n");
        
                            }
        
        out.write("              \n                    <span class=\"calendar\">\n                    <a href=\"javascript:void(0)\" id=\"button_");
        out.print(fieldID);
        out.write("\" onblur=\"changeValue_");
        out.print(fieldID);
        out.write("()\">\n                        <img src='");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_11.setParent(null);
          __jsp_taghandler_11.setCode("background.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
            if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_11.doCatch(th);
          } finally {
            __jsp_taghandler_11.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
        }
        out.write("' alt=\"calendar\" width=\"20\" height=\"20\"/>\n                    </a>\n                    </span>\n                    <script type=\"text/javascript\">\n                        Calendar.setup({\n                            inputField     :    \"text_");
        out.print(fieldID);
        out.write("\",      \n                            ifFormat       :    \"");
        out.print(dateFormat);
        out.write("\",                \n                            showsTime      :    false,\n                            button         :    \"button_");
        out.print(fieldID);
        out.write("\",   \n                            step           :    1        \n                        }); \n                        \n                        document.getElementById(\"text_");
        out.print(fieldID);
        out.write("\").value = document.getElementById('");
        out.print(fieldID);
        out.write("').value;        \n                        \n                        function changeValue_");
        out.print(fieldID);
        out.write("(){\n                            document.getElementById('");
        out.print(fieldID);
        out.write("').value = document.getElementById(\"text_");
        out.print(fieldID);
        out.write("\").value;        \n                        };\n                    </script>\n                        \n");
        
                        }else if(field.getType().equals(FieldType.SELECT_LIST)){
                            String beanName = field.getAttribute("beanName");
                            if(beanName == null || "".equals(beanName)) {
                                return;
                            }
                            
                            String parentPath = field.getAttribute("parentPath");
                            String progress = field.getAttribute("progress");
                            String multiple = field.getAttribute("multiple");
                            String patternValue = field.getAttribute("patternValue");
                            String uppercase = field.getAttribute("uppercase");
                            String disabled = field.getAttribute("disabled");                    
                            String onchange = field.getAttribute("onchange");                    
                            String style = field.getAttribute("style");                    
                            String filterPaths = field.getAttribute("filterPaths");                    
                            String appendFilters = field.getAttribute("appendFilters");                    
                            
                            boolean dynaQuery = (appendFilters != null && !"".equals(appendFilters))?Boolean.valueOf(appendFilters):true;
                            boolean upperCased = (uppercase != null && !"".equals(uppercase))?Boolean.valueOf(uppercase):true;                    
                            String cssClass = upperCased ? "uppercase" : "";
                            size = size==null ? "" : size;
                            disabled = disabled==null ? "" : disabled;
                            onchange = onchange==null ? "" : onchange;
                            multiple = multiple==null ? "" : multiple;
                            style = style==null ? "" : style;
                            
                            String[] additionalPaths = null;
                            if(filterPaths != null && !"".equals(filterPaths)) {
                                filterPaths = filterPaths.trim();
                                additionalPaths = filterPaths.split(",");
                            }
        
                            if(patternValue!=null) {
        
        out.write("\n                        ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
          __jsp_taghandler_12.setParent(null);
          __jsp_taghandler_12.setCode(OracleJspRuntime.toStr( patternValue));
          __jsp_taghandler_12.setVar("pattern");
          try {
            __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
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
        
                            StringBuffer options = new StringBuffer();
                            //final HashMap addOptions = (HashMap)pageContext.getAttribute(DynaContentService.ADD_OPTIONS, PageContext.REQUEST_SCOPE);
                            final HashMap addOptions = new HashMap();
                            addOptions.put("0","selectList.nonValue");
                            if(upperCased) {
        
        out.write("\n                        <input type=\"hidden\" name='");
        out.print(ControllerWebBindingInitializer.UPPER_CASE_PREFIX);
        out.print(fieldPath + ".value");
        out.write("' value=\"true\"/>\n");
        
                            }
                            
                            String path = fieldPath + ".value";
                            if(parentPath!=null && !parentPath.equals("")){
                                int j = 0;
                                for(FieldDTO ff : containerDTO.getFields()){
                                    if(ff.getName().equals(parentPath)){
                                        parentPath = "fields[" + j + "].value";                                    
                                        break;
                                    }
                                    j++;
                                }
                            }
        
        out.write("\n                    ");
        {
          org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path cssClass cssStyle disabled onchange size multiple");
          __jsp_taghandler_13.setParent(null);
          __jsp_taghandler_13.setPath(OracleJspRuntime.toStr( path));
          __jsp_taghandler_13.setCssClass(OracleJspRuntime.toStr( cssClass));
          __jsp_taghandler_13.setCssStyle(OracleJspRuntime.toStr( style));
          __jsp_taghandler_13.setDisabled(OracleJspRuntime.toStr( Boolean.valueOf(disabled)));
          __jsp_taghandler_13.setOnchange(OracleJspRuntime.toStr( onchange));
          __jsp_taghandler_13.setSize(OracleJspRuntime.toStr( size));
          __jsp_taghandler_13.setMultiple(Boolean.valueOf(multiple));
          try {
            __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
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
                
                out.write("\n                            ");
                {
                  org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                  __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_14.setValue(key);
                  java.lang.Object value = null;
                  java.lang.String displayValue = null;
                  try {
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      try {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                        do {
                          value = (java.lang.Object) pageContext.findAttribute("value");
                          displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                            __jsp_taghandler_15.setCode(OracleJspRuntime.toStr( text));
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                            } catch (Throwable th) {
                              __jsp_taghandler_15.doCatch(th);
                            } finally {
                              __jsp_taghandler_15.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,3);
                          }
                        } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      finally {
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                    }
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                       throw new javax.servlet.jsp.SkipPageException();
                  } catch (Throwable th) {
                    __jsp_taghandler_14.doCatch(th);
                  } finally {
                    __jsp_taghandler_14.doFinally();
                  }
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
                }
                out.write("\n");
                
                                        }
                                    }
                
                out.write("\n                        ");
                {
                  org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                  __jsp_taghandler_16.setParent(__jsp_taghandler_13);
                  __jsp_taghandler_16.setItems(data);
                  __jsp_taghandler_16.setItemValue("key");
                  __jsp_taghandler_16.setItemLabel("value");
                  try {
                    __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                    if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                       throw new javax.servlet.jsp.SkipPageException();
                  } catch (Throwable th) {
                    __jsp_taghandler_16.doCatch(th);
                  } finally {
                    __jsp_taghandler_16.doFinally();
                  }
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
                }
                out.write("\n                    ");
              } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_13.doCatch(th);
          } finally {
            __jsp_taghandler_13.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,1);
        }
        out.write("\n                    ");
        {
          org.springframework.web.servlet.tags.BindTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
          __jsp_taghandler_17.setParent(null);
          __jsp_taghandler_17.setPath(OracleJspRuntime.toStr( path));
          org.springframework.web.servlet.support.BindStatus status = null;
          try {
            __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
                out.write("\n                        ");
                {
                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                  __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                  __jsp_taghandler_18.setVar("requestValue");
                  __jsp_taghandler_18.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.value}",java.lang.Object.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                  if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
                }
                out.write("\n                    ");
              } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_17.doCatch(th);
          } finally {
            __jsp_taghandler_17.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,1);
        }
        out.write("\n");
        
        
                            if((parentPath!=null && !parentPath.equals("")) && (beanName != null && !"".equals(beanName))) {
                                //En la siguiente seccion se manipularan via scripts los objetos.
                                //Por lo que, se eliminan los corchetes pues los IDs no los incluyen.
                                path = path.replaceAll("[\\[\\]]","");
                                parentPath = parentPath.replaceAll("[\\[\\]]","");                    
                            
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
                                        //Es necesario recorrer la lista de campos dinamicos, que es el unico lugar donde puede haber parents.
                                        String parent = "";
                                        int j = 0;
                                        for(FieldDTO ff : containerDTO.getFields()){
                                            if(ff.getName().equals(addPath.trim())){
                                                parent = "fields" + j + ".value";                                    
                                                break;
                                            }
                                            j++;
                                        }
                                        addPathParams += "padre={" + parent + "}, ";
                                    }
                                }
                                
                                String parameters   = "padre={"+parentPath+"}, " + addPathParams + "beanName="+beanName+", "+filterStr.toString()+", patternValue="+pattern+", options="+options.toString()+", dynaQuery="+dynaQuery ;
                                String preFunction  = "initProgress"+fieldID;
                                String postFunction = "resetProgress"+fieldID;        
                                String baseUrl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/util/getListElements.do";        
                                if(progress!=null && progress.equals("true")) {
        
        out.write("\n                            ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var value");
          __jsp_taghandler_19.setParent(null);
          __jsp_taghandler_19.setVar("contextPath");
          __jsp_taghandler_19.setValue("/");
          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,1);
        }
        out.write("\n                            <span id=\"progressMsg");
        out.print(fieldID);
        out.write("\" style=\"display:none;\"><img alt=\"indicator\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_20.setParent(null);
          __jsp_taghandler_20.setCode("indicator.gif");
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
        out.write("\" /></span>\n");
        
                                }
                                
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
        
        out.write("                       \n                        <script type=\"text/javascript\">\n                            \n                            function initProgress");
        out.print(fieldID);
        out.write("() {\n                                document.getElementById('");
        out.print(path);
        out.write("').options.length = 0;\n                                Element.show('progressMsg");
        out.print(fieldID);
        out.write("');\n                            }\n                            \n                            function resetProgress");
        out.print(fieldID);
        out.write("() {\n                                setTimeout(\"delayResetProgress");
        out.print(fieldID);
        out.write("()\", 500);\n                            }\n                    \n                            function delayResetProgress");
        out.print(fieldID);
        out.write("() {\n                                //Select previous selected option\n                                var options");
        out.print(fieldID);
        out.write(" = document.getElementById('");
        out.print(path);
        out.write("').getElementsByTagName('option'); \n                                options");
        out.print(fieldID);
        out.write("[0].selected = true;        \n                                for(i=0; i< options");
        out.print(fieldID);
        out.write(".length; i++) {\n                                    if(\"");
        out.print(arrValue);
        out.write("\".indexOf(\",\"+options");
        out.print(fieldID);
        out.write("[i].value+\",\")>-1 ) {\n                                        options");
        out.print(fieldID);
        out.write("[0].selected = false;\n                                        options");
        out.print(fieldID);
        out.write("[i].selected = true;\n                                    }\n                                }\n                                //Execute onchange event\n                                var select");
        out.print(fieldID);
        out.write(" = document.getElementById('");
        out.print(path);
        out.write("');\n                                if(document.all) { // IE Way\n                                    select");
        out.print(fieldID);
        out.write(".fireEvent('onchange');\n                                } else  { // Firefox Way\n                                    var evt");
        out.print(fieldID);
        out.write(" = document.createEvent('HTMLEvents');\n                                    evt");
        out.print(fieldID);
        out.write(".initEvent('change', true, true);\n                                    select");
        out.print(fieldID);
        out.write(".dispatchEvent(evt");
        out.print(fieldID);
        out.write(");\n                                }\n");
        
                                    if(Boolean.valueOf(disabled)) {
        
        out.write("\n                                select");
        out.print(fieldID);
        out.write(".disabled=\"disabled\";\n");
        
                                    }
        
        out.write("\n                                Effect.Fade('progressMsg");
        out.print(fieldID);
        out.write("');\n                            }\n                            //El tag de ajax elimina el atributo onchange del select padre, por lo tanto se obtiene el valor del atributo antes de definir el tag ajax\n                            //y se vuelve a setear al finalizar la definicion del tag de ajax.\n                            var parentObj = document.getElementById('");
        out.print(parentPath);
        out.write("');\n                            var parentOnchange = parentObj.onchange;\n                        </script> \n\n                        ");
        {
          org.ajaxtags.tags.AjaxSelectTag __jsp_taghandler_21=(org.ajaxtags.tags.AjaxSelectTag)OracleJspRuntime.getTagHandler(pageContext,org.ajaxtags.tags.AjaxSelectTag.class,"org.ajaxtags.tags.AjaxSelectTag baseUrl source target parameters executeOnLoad preFunction postFunction");
          __jsp_taghandler_21.setParent(null);
          __jsp_taghandler_21.setBaseUrl(OracleJspRuntime.toStr( baseUrl));
          __jsp_taghandler_21.setSource(OracleJspRuntime.toStr( parentPath));
          __jsp_taghandler_21.setTarget(OracleJspRuntime.toStr( path));
          __jsp_taghandler_21.setParameters(OracleJspRuntime.toStr( parameters));
          __jsp_taghandler_21.setExecuteOnLoad("true");
          __jsp_taghandler_21.setPreFunction(OracleJspRuntime.toStr( preFunction));
          __jsp_taghandler_21.setPostFunction(OracleJspRuntime.toStr( postFunction));
          __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
          if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,1);
        }
        out.write("\n                          \n                        <script type=\"text/javascript\">\n                            parentObj.onchange = parentOnchange;\n                        </script>\n");
        
                                if(additionalPaths != null && additionalPaths.length>0) {
        
        out.write("\n                            ");
        {
          org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
          __jsp_taghandler_22.setParent(null);
          __jsp_taghandler_22.setItems(additionalPaths);
          __jsp_taghandler_22.setVar("adittionalSource");
          try {
            __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                out.write("                        \n                                ");
                {
                  org.ajaxtags.tags.AjaxSelectTag __jsp_taghandler_23=(org.ajaxtags.tags.AjaxSelectTag)OracleJspRuntime.getTagHandler(pageContext,org.ajaxtags.tags.AjaxSelectTag.class,"org.ajaxtags.tags.AjaxSelectTag baseUrl source target parameters preFunction postFunction");
                  __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                  __jsp_taghandler_23.setBaseUrl(OracleJspRuntime.toStr( baseUrl));
                  __jsp_taghandler_23.setSource((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${adittionalSource}",java.lang.String.class, __ojsp_varRes,null));
                  __jsp_taghandler_23.setTarget(OracleJspRuntime.toStr( path));
                  __jsp_taghandler_23.setParameters(OracleJspRuntime.toStr( parameters));
                  __jsp_taghandler_23.setPreFunction(OracleJspRuntime.toStr( preFunction));
                  __jsp_taghandler_23.setPostFunction(OracleJspRuntime.toStr( postFunction));
                  __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                  if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
                }
                out.write("\n                            ");
              } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
            if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_22.doCatch(th);
          } finally {
            __jsp_taghandler_22.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,1);
        }
        out.write("\n");
                  
                                }
                            }
        
                            if(path != null && Boolean.valueOf(disabled) && !Boolean.valueOf(multiple)) {
        
        out.write("\n                        ");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
          __jsp_taghandler_24.setParent(null);
          __jsp_taghandler_24.setPath(OracleJspRuntime.toStr( path));
          try {
            __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
            if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_24.doCatch(th);
          } finally {
            __jsp_taghandler_24.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,1);
        }
        out.write("\n");
        
                            }
                        }
        
        out.write("\n                    </td>\n                </tr>\n");
        
                        i++;
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                pageContext.removeAttribute(filterId, PageContext.REQUEST_SCOPE);
                pageContext.removeAttribute(DynaContentService.ADD_OPTIONS, PageContext.REQUEST_SCOPE);
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
        new TagAttributeInfo("container",false,"java.lang.String",true,false),
        new TagAttributeInfo("columns",false,"java.lang.String",true,false),
        new TagAttributeInfo("filterId",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("dynaFields","_oracle._jsp._tag._dynaFields_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
