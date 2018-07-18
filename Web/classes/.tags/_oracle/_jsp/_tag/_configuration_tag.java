package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import org.springframework.web.util.TagUtils;
import org.springframework.web.util.ExpressionEvaluationUtils;
import gob.shcp.fsn.service.config.ConfigurationService;


public class _configuration_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String var;
  private java.lang.String scope;
  private java.lang.String context;
  private java.lang.String key;
  private java.lang.String pattern;
  private java.lang.String type;

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

  public void setContext(java.lang.String context)
  {
    this.context = context;
  }

  public java.lang.String getContext()
  {
    return this.context;
  }

  public void setKey(java.lang.String key)
  {
    this.key = key;
  }

  public java.lang.String getKey()
  {
    return this.key;
  }

  public void setPattern(java.lang.String pattern)
  {
    this.pattern = pattern;
  }

  public java.lang.String getPattern()
  {
    return this.pattern;
  }

  public void setType(java.lang.String type)
  {
    this.type = type;
  }

  public java.lang.String getType()
  {
    return this.type;
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
        pageContext.setAttribute("var", getVar());
        pageContext.setAttribute("scope", getScope());
        pageContext.setAttribute("context", getContext());
        pageContext.setAttribute("key", getKey());
        pageContext.setAttribute("pattern", getPattern());
        pageContext.setAttribute("type", getType());


        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
         
            try{
                context = (context != null && !"".equals(context)) ? context : ConfigurationService.DEFAULT_CONFIG_CONTEXT_NAME;
                key = (key != null && !"".equals(key)) ? key : var;
                type = (type != null && !"".equals(type)) ? type : "string";
                
                Object value = null;
                ConfigurationService configurationService = gob.shcp.fsn.control.view.util.TagUtils.configuration(pageContext);
                if("string".equalsIgnoreCase(type)) {
                    value = configurationService.getString(context, key);
                } else if("long".equalsIgnoreCase(type)) {
                    value = new Long(configurationService.getNumber(context, key).longValue());
                } else if("int".equalsIgnoreCase(type) || "integer".equalsIgnoreCase(type)) {
                    value = new Integer(configurationService.getNumber(context, key).intValue());
                } else if("double".equalsIgnoreCase(type)) {
                    value = new Double(configurationService.getNumber(context, key).doubleValue());
                } else if("float".equalsIgnoreCase(type)) {
                    value = new Float(configurationService.getNumber(context, key).floatValue());
                } else if("short".equalsIgnoreCase(type)) {
                    value = new Short(configurationService.getNumber(context, key).shortValue());
                } else if("byte".equalsIgnoreCase(type)) {
                    value = new Byte(configurationService.getNumber(context, key).byteValue());
                } else if("date".equalsIgnoreCase(type)) {
                    value = configurationService.getDate(context, key, pattern);
                } else {
                    value = configurationService.getString(context, key);
                }
            
                // Expose as variable, if demanded.
                scope = (scope!=null && !"".equals(scope)) ? scope : "request";
                String resolvedVar = ExpressionEvaluationUtils.evaluateString("var", this.var, pageContext);
                String resolvedScope = null;
                if (resolvedVar != null) {        
                    resolvedScope = ExpressionEvaluationUtils.evaluateString("scope", this.scope, pageContext);
                    pageContext.setAttribute(resolvedVar, value, TagUtils.getScope(resolvedScope));
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
        new TagAttributeInfo("var",true,"java.lang.String",true,false),
        new TagAttributeInfo("scope",false,"java.lang.String",true,false),
        new TagAttributeInfo("context",false,"java.lang.String",true,false),
        new TagAttributeInfo("key",false,"java.lang.String",true,false),
        new TagAttributeInfo("pattern",false,"java.lang.String",true,false),
        new TagAttributeInfo("type",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("configuration","_oracle._jsp._tag._configuration_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
