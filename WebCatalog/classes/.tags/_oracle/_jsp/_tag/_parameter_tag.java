package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.service.parameter.ParameterService;
import org.springframework.util.ClassUtils;
import org.springframework.web.util.ExpressionEvaluationUtils;
import org.springframework.web.util.TagUtils;


public class _parameter_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String name;
  private java.lang.String type;
  private java.lang.String className;
  private java.lang.String contentType;
  private java.lang.String var;
  private java.lang.String scope;
  private java.lang.String defaultValue;
  private java.lang.String alt;
  private java.lang.String cssImage;
  private java.lang.String height;
  private java.lang.String width;

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

  public void setName(java.lang.String name)
  {
    this.name = name;
  }

  public java.lang.String getName()
  {
    return this.name;
  }

  public void setType(java.lang.String type)
  {
    this.type = type;
  }

  public java.lang.String getType()
  {
    return this.type;
  }

  public void setClassName(java.lang.String className)
  {
    this.className = className;
  }

  public java.lang.String getClassName()
  {
    return this.className;
  }

  public void setContentType(java.lang.String contentType)
  {
    this.contentType = contentType;
  }

  public java.lang.String getContentType()
  {
    return this.contentType;
  }

  public void setVar(java.lang.String var)
  {
    this.var = var;
  }

  public java.lang.String getVar()
  {
    return this.var;
  }

  public void setScope(java.lang.String scope)
  {
    this.scope = scope;
  }

  public java.lang.String getScope()
  {
    return this.scope;
  }

  public void setDefaultValue(java.lang.String defaultValue)
  {
    this.defaultValue = defaultValue;
  }

  public java.lang.String getDefaultValue()
  {
    return this.defaultValue;
  }

  public void setAlt(java.lang.String alt)
  {
    this.alt = alt;
  }

  public java.lang.String getAlt()
  {
    return this.alt;
  }

  public void setCssImage(java.lang.String cssImage)
  {
    this.cssImage = cssImage;
  }

  public java.lang.String getCssImage()
  {
    return this.cssImage;
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
        pageContext.setAttribute("name", getName());
        pageContext.setAttribute("type", getType());
        pageContext.setAttribute("className", getClassName());
        pageContext.setAttribute("contentType", getContentType());
        pageContext.setAttribute("var", getVar());
        pageContext.setAttribute("scope", getScope());
        pageContext.setAttribute("defaultValue", getDefaultValue());
        pageContext.setAttribute("alt", getAlt());
        pageContext.setAttribute("cssImage", getCssImage());
        pageContext.setAttribute("height", getHeight());
        pageContext.setAttribute("width", getWidth());


        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n\r\n");
        out.write("\r\n\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n\r\n");
        
            try {
                Class clazz = (className!=null && !"".equals(className)) ? ClassUtils.forName(className) : null;
                contentType = (contentType!=null && !"".equals(contentType)) ? contentType : "image/jpeg";
                scope = (scope!=null && !"".equals(scope)) ? scope : "request";
                alt = alt != null && !"".equals(alt) ? alt : "image";
                cssImage = cssImage != null && !"".equals(cssImage) ? cssImage : "";
                height = (height != null && !"".equals(height)) ? height : "67";
                width = (width != null && !"".equals(width)) ? width : "139";
        
                final ParameterService parameterService = gob.shcp.fsn.control.view.util.TagUtils.parameter(pageContext);
                if("string".equalsIgnoreCase(type)) {
                    String value = parameterService.getString(name);
                    value = (value!=null && !"".equals(value) && !value.equals(name)) ? value : defaultValue;
                    final String resolvedVar = ExpressionEvaluationUtils.evaluateString("var", this.var, pageContext);
                    if(resolvedVar != null) {
                        String resolvedScope = ExpressionEvaluationUtils.evaluateString("scope", this.scope, pageContext);
                        pageContext.setAttribute(resolvedVar, value, TagUtils.getScope(resolvedScope));
                    }
                } else if("bean".equalsIgnoreCase(type)) {
                    Object value = parameterService.getObject(name, clazz);
                    value = value!=null ? value : defaultValue;
                    final String resolvedVar = ExpressionEvaluationUtils.evaluateString("var", this.var, pageContext);
                    if(resolvedVar != null) {        
                        String resolvedScope = ExpressionEvaluationUtils.evaluateString("scope", this.scope, pageContext);
                        pageContext.setAttribute(resolvedVar, value, TagUtils.getScope(resolvedScope));
                    }
                } else if("image".equalsIgnoreCase(type)) {
                    byte[] value = parameterService.getBytes(name);
                    if(value!=null && value.length > 0 && !(new String(value).equals(name))) {
        
        out.write("\r\n                <img src='");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pageContext.request.contextPath}",java.lang.String.class, __ojsp_varRes, null)+"/"));
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("renderImage.do?parameterName=");
        out.print(name);
        out.write("&contentType=");
        out.print(contentType);
        out.write("' alt=\"");
        out.print(alt);
        out.write("\" width=\"");
        out.print(width);
        out.write("\" height=\"");
        out.print(height);
        out.write("\" class=\"");
        out.print(cssImage);
        out.write("\">\r\n");
                  } else {
        
        out.write("\r\n                <img src=\"");
        out.print(defaultValue);
        out.write("\" alt=\"");
        out.print(alt);
        out.write("\" width=\"");
        out.print(width);
        out.write("\" height=\"");
        out.print(height);
        out.write("\" class=\"");
        out.print(cssImage);
        out.write("\">\r\n");
                  }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        
        out.write("\r\n");
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
        new TagAttributeInfo("name",true,"java.lang.String",true,false),
        new TagAttributeInfo("type",true,"java.lang.String",true,false),
        new TagAttributeInfo("className",false,"java.lang.String",true,false),
        new TagAttributeInfo("contentType",false,"java.lang.String",true,false),
        new TagAttributeInfo("var",false,"java.lang.String",true,false),
        new TagAttributeInfo("scope",false,"java.lang.String",true,false),
        new TagAttributeInfo("defaultValue",false,"java.lang.String",true,false),
        new TagAttributeInfo("alt",false,"java.lang.String",true,false),
        new TagAttributeInfo("cssImage",false,"java.lang.String",true,false),
        new TagAttributeInfo("height",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("parameter","_oracle._jsp._tag._parameter_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
