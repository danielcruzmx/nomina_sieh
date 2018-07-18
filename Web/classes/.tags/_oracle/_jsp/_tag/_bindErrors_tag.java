package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import java.util.Enumeration;
import org.springframework.validation.BindingResult;
import org.springframework.beans.PropertyAccessor;


public class _bindErrors_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String path;

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

  public void setPath(java.lang.String path)
  {
    this.path = path;
  }

  public java.lang.String getPath()
  {
    return this.path;
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
        pageContext.setAttribute("path", getPath());


        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n\n");
        
        try {
            if(path != null && path.startsWith("*")) {
                String attrName = null;
                String beanName = null;
                String resolvedPath = null;
                for(Enumeration e = request.getAttributeNames(); e.hasMoreElements(); ) {
                    attrName = (String)e.nextElement();
                    if(attrName.startsWith(BindingResult.MODEL_KEY_PREFIX)) {
                        beanName = attrName.substring(BindingResult.MODEL_KEY_PREFIX.length(), attrName.length());
                        resolvedPath = path.substring("*".length());
                        if(!"".equals(resolvedPath) && !resolvedPath.startsWith(PropertyAccessor.NESTED_PROPERTY_SEPARATOR)) {
                            resolvedPath = PropertyAccessor.NESTED_PROPERTY_SEPARATOR + resolvedPath;
                        }
                        resolvedPath = beanName + resolvedPath;
                        pageContext.setAttribute("resolvedPath", resolvedPath, PageContext.REQUEST_SCOPE);
        
        out.write("\n                ");
        ((oracle.jsp.runtime.OracleJspContextWrapper) this.jspContext).syncVariableBeforeFragment();
        _jspFragWriter = null;
        if (getJspBody() != null) 
          getJspBody().invoke(_jspFragWriter);
        out.write("\n");
        
                        //request.removeAttribute(attrName);
                    }
                }
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
        new TagAttributeInfo("path",true,"java.lang.String",true,false)};

      tagInfo = new TagInfo("bindErrors","_oracle._jsp._tag._bindErrors_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
