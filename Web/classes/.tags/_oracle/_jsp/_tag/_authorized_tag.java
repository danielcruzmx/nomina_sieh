package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.util.TagUtils;
import org.springframework.web.util.ExpressionEvaluationUtils;
import gob.shcp.fsn.service.security.SecurityService;


public class _authorized_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String roles;
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

  public void setRoles(java.lang.String roles)
  {
    this.roles = roles;
  }

  public java.lang.String getRoles()
  {
    return this.roles;
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
        pageContext.setAttribute("roles", getRoles());
        pageContext.setAttribute("var", getVar());
        pageContext.setAttribute("scope", getScope());


        out.write("\n");
        out.write("\n");
        out.write(" \n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write(" \n");
        out.write("\n\n");
        
            try{
                scope = (scope!=null && !"".equals(scope)) ? scope : "request";
                String resolvedVar = ExpressionEvaluationUtils.evaluateString("var", this.var, pageContext);
                String resolvedScope = ExpressionEvaluationUtils.evaluateString("scope", this.scope, pageContext);
                
                final StringTokenizer tokens = new StringTokenizer(roles, ",");
                final List<String> tokenList = new ArrayList<String>();
                while(tokens.hasMoreTokens()) {
                    tokenList.add(tokens.nextToken().trim());
                }
            
                final SecurityService securityService = gob.shcp.fsn.control.view.util.TagUtils.security(pageContext);
            
                boolean isAuthorized = false;
                for(String role : tokenList) {
                    if(securityService.isUserAuthorized(role)) {
                        isAuthorized = true;
                        break;
                    }
                }
            
                if(isAuthorized) {
                    if(var != null && !var.equals("")) {
                        // Expose as variable, if demanded.
                        if (resolvedVar != null) {        
                            pageContext.setAttribute(resolvedVar, "true", TagUtils.getScope(resolvedScope));
                        }
                    }
        
        out.write("\n            ");
        ((oracle.jsp.runtime.OracleJspContextWrapper) this.jspContext).syncVariableBeforeFragment();
        _jspFragWriter = null;
        if (getJspBody() != null) 
          getJspBody().invoke(_jspFragWriter);
        out.write("\n");
            
                } else {
                    if(var != null && !var.equals("")) {
                        // Expose as variable, if demanded.
                        if (resolvedVar != null) {        
                            pageContext.setAttribute(resolvedVar, "false", TagUtils.getScope(resolvedScope));
                        }
                    }
                }
            
            }catch(Exception e){
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
        new TagAttributeInfo("roles",true,"java.lang.String",true,false),
        new TagAttributeInfo("var",false,"java.lang.String",true,false),
        new TagAttributeInfo("scope",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("authorized","_oracle._jsp._tag._authorized_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
