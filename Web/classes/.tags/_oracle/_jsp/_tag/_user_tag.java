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
import gob.shcp.fsn.service.security.SecurityService;
import gob.shcp.fsn.service.security.auth.BasicUserData;


public class _user_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String var;
  private java.lang.String scope;

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


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n\n");
            
            try{
            scope = (scope!=null && !"".equals(scope)) ? scope : "request";
        
            // Expose as variable, if demanded.
            String resolvedVar = ExpressionEvaluationUtils.evaluateString("var", this.var, pageContext);
            String resolvedScope = null;
            if (resolvedVar != null) {        
                resolvedScope = ExpressionEvaluationUtils.evaluateString("scope", this.scope, pageContext);
                pageContext.setAttribute(resolvedVar,  new BasicUserData(), TagUtils.getScope(resolvedScope));
            }
        
            final BasicUserData user = (BasicUserData)pageContext.getAttribute(resolvedVar, TagUtils.getScope(resolvedScope) );
            SecurityService securityService = gob.shcp.fsn.control.view.util.TagUtils.security(pageContext);
            user.setUserName(securityService.getUserName());
            user.setApplicationName(securityService.getApplicationName());
            user.setOperationYear(securityService.getOperationYear());
            
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
        new TagAttributeInfo("scope",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("user","_oracle._jsp._tag._user_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
