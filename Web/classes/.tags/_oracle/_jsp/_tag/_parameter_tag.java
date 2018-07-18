package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import org.springframework.web.util.TagUtils;
import gob.shcp.fsn.service.parameter.ParameterService;
import org.springframework.web.util.ExpressionEvaluationUtils;


public class _parameter_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String parameter;
  private java.lang.String parameterType;
  private java.lang.String contextApp;
  private java.lang.String scope;
  private java.lang.String var;
  private java.lang.String htmlEscape;
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

  public void setParameter(java.lang.String parameter)
  {
    this.parameter = parameter;
  }

  public java.lang.String getParameter()
  {
    return this.parameter;
  }

  public void setParameterType(java.lang.String parameterType)
  {
    this.parameterType = parameterType;
  }

  public java.lang.String getParameterType()
  {
    return this.parameterType;
  }

  public void setContextApp(java.lang.String contextApp)
  {
    this.contextApp = contextApp;
  }

  public java.lang.String getContextApp()
  {
    return this.contextApp;
  }

  public void setScope(java.lang.String scope)
  {
    this.scope = scope;
  }

  public java.lang.String getScope()
  {
    return this.scope;
  }

  public void setVar(java.lang.String var)
  {
    this.var = var;
  }

  public java.lang.String getVar()
  {
    return this.var;
  }

  public void setHtmlEscape(java.lang.String htmlEscape)
  {
    this.htmlEscape = htmlEscape;
  }

  public java.lang.String getHtmlEscape()
  {
    return this.htmlEscape;
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
        pageContext.setAttribute("parameter", getParameter());
        pageContext.setAttribute("parameterType", getParameterType());
        pageContext.setAttribute("contextApp", getContextApp());
        pageContext.setAttribute("scope", getScope());
        pageContext.setAttribute("var", getVar());
        pageContext.setAttribute("htmlEscape", getHtmlEscape());
        pageContext.setAttribute("alt", getAlt());
        pageContext.setAttribute("cssImage", getCssImage());
        pageContext.setAttribute("height", getHeight());
        pageContext.setAttribute("width", getWidth());


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
                scope = (scope!=null && !"".equals(scope)) ? scope : "request";
                alt = alt != null && !"".equals(alt) ? alt : "image";
                cssImage = cssImage != null && !"".equals(cssImage) ? cssImage : "";
                contextApp = (contextApp!=null && !"".equals(contextApp)) ? contextApp : request.getContextPath();
                width = (width != null && !"".equals(width)) ? width : "139";
                height = (height != null && !"".equals(height)) ? height : "67";
        
                if("string".equalsIgnoreCase(parameterType) || "bean".equalsIgnoreCase(parameterType)) {
                    final ParameterService parameterService = gob.shcp.fsn.control.view.util.TagUtils.parameter(pageContext);
                    final String value = parameterService.getString(parameter);
                    final String resolvedVar = ExpressionEvaluationUtils.evaluateString("var", this.var, pageContext);
                    if(resolvedVar != null) {        
                        String resolvedScope = ExpressionEvaluationUtils.evaluateString("scope", this.scope, pageContext);
                        pageContext.setAttribute(resolvedVar, value, TagUtils.getScope(resolvedScope));
                    }
        
                } else if("file".equalsIgnoreCase(parameterType)) {
                    String path=request.getRequestURL().toString();
                    path = path.substring(0, path.indexOf(request.getContextPath()) + request.getContextPath().length());
        
        out.write("\n            <img class=\"");
        out.print(cssImage);
        out.write("\" src=\"");
        out.print(path);
        out.write("/resourceServlet?file=");
        out.print(parameter);
        out.write("&contexto=");
        out.print(contextApp);
        out.write("\" alt=\"");
        out.print(alt);
        out.write("\" width=\"");
        out.print(width);
        out.write("\" height=\"");
        out.print(height);
        out.write("\">\n");
              }     
            } catch(Exception e) {
                e.printStackTrace();
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
        new TagAttributeInfo("parameter",true,"java.lang.String",true,false),
        new TagAttributeInfo("parameterType",true,"java.lang.String",true,false),
        new TagAttributeInfo("contextApp",false,"java.lang.String",true,false),
        new TagAttributeInfo("scope",false,"java.lang.String",true,false),
        new TagAttributeInfo("var",false,"java.lang.String",true,false),
        new TagAttributeInfo("htmlEscape",false,"java.lang.String",true,false),
        new TagAttributeInfo("alt",false,"java.lang.String",true,false),
        new TagAttributeInfo("cssImage",false,"java.lang.String",true,false),
        new TagAttributeInfo("height",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("parameter","_oracle._jsp._tag._parameter_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
