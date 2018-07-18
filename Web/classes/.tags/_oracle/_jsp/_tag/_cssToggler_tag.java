package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;


public class _cssToggler_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String id;
  private java.lang.String cssOdd;
  private java.lang.String cssEven;

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

  public void setId(java.lang.String id)
  {
    this.id = id;
  }

  public java.lang.String getId()
  {
    return this.id;
  }

  public void setCssOdd(java.lang.String cssOdd)
  {
    this.cssOdd = cssOdd;
  }

  public java.lang.String getCssOdd()
  {
    return this.cssOdd;
  }

  public void setCssEven(java.lang.String cssEven)
  {
    this.cssEven = cssEven;
  }

  public java.lang.String getCssEven()
  {
    return this.cssEven;
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
        pageContext.setAttribute("id", getId());
        pageContext.setAttribute("cssOdd", getCssOdd());
        pageContext.setAttribute("cssEven", getCssEven());


        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n\n");
        
            try{
                String strIndex = (String)pageContext.getAttribute("gob.shcp.fsn.control.tag." + id + "TogglerIndex", PageContext.REQUEST_SCOPE);
                int index = strIndex == null ? 1 : Integer.valueOf(strIndex);
                if(index % 2 == 0) {
                    if(cssEven == null) {
                        cssEven = "even";
                    }
        
        out.write("\n            class=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setValue(cssEven);
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\"\n");
        
                } else {
                    if(cssOdd == null) {
                        cssOdd = "odd";
                    }
        
        out.write("\n            class=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setValue(cssOdd);
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\"\n");
        
                }
                pageContext.setAttribute("gob.shcp.fsn.control.tag." + id + "TogglerIndex", Integer.toString(index + 1), PageContext.REQUEST_SCOPE);
            
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
        new TagAttributeInfo("id",true,"java.lang.String",true,false),
        new TagAttributeInfo("cssOdd",false,"java.lang.String",true,false),
        new TagAttributeInfo("cssEven",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("cssToggler","_oracle._jsp._tag._cssToggler_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
