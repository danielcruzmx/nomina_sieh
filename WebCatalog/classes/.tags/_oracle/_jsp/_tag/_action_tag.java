package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import org.springframework.web.util.ExpressionEvaluationUtils;
import org.springframework.web.util.TagUtils;


public class _action_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String url;
  private java.lang.String var;
  private java.lang.String scope;
  private java.lang.String includeBaseURL;
  private java.lang.String excludePrefix;
  private java.lang.String excludeSuffix;

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

  public void setUrl(java.lang.String url)
  {
    this.url = url;
  }

  public java.lang.String getUrl()
  {
    return this.url;
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

  public void setIncludeBaseURL(java.lang.String includeBaseURL)
  {
    this.includeBaseURL = includeBaseURL;
  }

  public java.lang.String getIncludeBaseURL()
  {
    return this.includeBaseURL;
  }

  public void setExcludePrefix(java.lang.String excludePrefix)
  {
    this.excludePrefix = excludePrefix;
  }

  public java.lang.String getExcludePrefix()
  {
    return this.excludePrefix;
  }

  public void setExcludeSuffix(java.lang.String excludeSuffix)
  {
    this.excludeSuffix = excludeSuffix;
  }

  public java.lang.String getExcludeSuffix()
  {
    return this.excludeSuffix;
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
        pageContext.setAttribute("url", getUrl());
        pageContext.setAttribute("var", getVar());
        pageContext.setAttribute("scope", getScope());
        pageContext.setAttribute("includeBaseURL", getIncludeBaseURL());
        pageContext.setAttribute("excludePrefix", getExcludePrefix());
        pageContext.setAttribute("excludeSuffix", getExcludeSuffix());


        out.write("\r\n");
        out.write("\r\n\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n\r\n");
        out.write("\r\n\r\n");
        
        try{
            boolean isBaseURL = Boolean.valueOf(includeBaseURL);
            boolean isPrefix = !Boolean.valueOf(excludePrefix);
            boolean isSuffix = !Boolean.valueOf(excludeSuffix);
        
            if(isPrefix && !url.startsWith("/")) {
                url = "/" + url;
            }
            if(isSuffix &&!url.endsWith(".do")) {
                url = url + ".do";
            }
        
        out.write("\r\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setVar("_url");
          __jsp_taghandler_1.setScope("page");
          __jsp_taghandler_1.setValue(OracleJspRuntime.toStr( url));
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\r\n");
        
            var = (var!=null && !"".equals(var)) ? var : "action";
            scope = (scope!=null && !"".equals(scope)) ? scope : "request";
            
            url = (String)pageContext.getAttribute("_url", PageContext.PAGE_SCOPE);
            if(isBaseURL) {
                url = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+url;
            }
            
            // Expose as variable, if demanded.
            String resolvedVar = ExpressionEvaluationUtils.evaluateString("var", this.var, pageContext);
            if (resolvedVar != null) {
                String resolvedScope = ExpressionEvaluationUtils.evaluateString("scope", this.scope, pageContext);
                pageContext.setAttribute(resolvedVar, url, TagUtils.getScope(resolvedScope));
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
        new TagAttributeInfo("url",true,"java.lang.String",true,false),
        new TagAttributeInfo("var",false,"java.lang.String",true,false),
        new TagAttributeInfo("scope",false,"java.lang.String",true,false),
        new TagAttributeInfo("includeBaseURL",false,"java.lang.String",true,false),
        new TagAttributeInfo("excludePrefix",false,"java.lang.String",true,false),
        new TagAttributeInfo("excludeSuffix",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("action","_oracle._jsp._tag._action_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
