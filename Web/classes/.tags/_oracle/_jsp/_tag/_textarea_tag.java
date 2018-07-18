package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.binder.ControllerWebBindingInitializer;


public class _textarea_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String path;
  private java.lang.String cols;
  private java.lang.String disabled;
  private java.lang.String htmlEscape;
  private java.lang.String readonly;
  private java.lang.String rows;
  private java.lang.String title;
  private java.lang.String uppercase;
  private java.lang.String css;

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

  public void setCols(java.lang.String cols)
  {
    this.cols = cols;
  }

  public java.lang.String getCols()
  {
    return this.cols;
  }

  public void setDisabled(java.lang.String disabled)
  {
    this.disabled = disabled;
  }

  public java.lang.String getDisabled()
  {
    return this.disabled;
  }

  public void setHtmlEscape(java.lang.String htmlEscape)
  {
    this.htmlEscape = htmlEscape;
  }

  public java.lang.String getHtmlEscape()
  {
    return this.htmlEscape;
  }

  public void setReadonly(java.lang.String readonly)
  {
    this.readonly = readonly;
  }

  public java.lang.String getReadonly()
  {
    return this.readonly;
  }

  public void setRows(java.lang.String rows)
  {
    this.rows = rows;
  }

  public java.lang.String getRows()
  {
    return this.rows;
  }

  public void setTitle(java.lang.String title)
  {
    this.title = title;
  }

  public java.lang.String getTitle()
  {
    return this.title;
  }

  public void setUppercase(java.lang.String uppercase)
  {
    this.uppercase = uppercase;
  }

  public java.lang.String getUppercase()
  {
    return this.uppercase;
  }

  public void setCss(java.lang.String css)
  {
    this.css = css;
  }

  public java.lang.String getCss()
  {
    return this.css;
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
        pageContext.setAttribute("cols", getCols());
        pageContext.setAttribute("disabled", getDisabled());
        pageContext.setAttribute("htmlEscape", getHtmlEscape());
        pageContext.setAttribute("readonly", getReadonly());
        pageContext.setAttribute("rows", getRows());
        pageContext.setAttribute("title", getTitle());
        pageContext.setAttribute("uppercase", getUppercase());
        pageContext.setAttribute("css", getCss());


        out.write(" \n\n");
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
        out.write("\n\n\n");
        
            try{
        
        out.write("\n\n");
        {
          org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty htmlEscape}",java.lang.Boolean.class, __ojsp_varRes,null)));
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n    ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setVar("htmlEscape");
                __jsp_taghandler_2.setValue("false");
                __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write("\n");
            } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\n");
        
            boolean upperCased = true;
            if(uppercase != null && !"".equals(uppercase)) {
                upperCased = Boolean.valueOf(uppercase);
            }
            String cssClass = upperCased ? "uppercase" : "";
            cols = cols==null? "" : cols;
            disabled = Boolean.valueOf(disabled).toString();
            readonly = Boolean.valueOf(readonly).toString();
            rows = rows==null ? "" : rows;
            title = title==null ? "" : title;
            css = css==null ? "" : css;
            
            if(upperCased) {
        
        out.write("\n        <input type=\"hidden\" name=\"");
        out.print(ControllerWebBindingInitializer.UPPER_CASE_PREFIX);
        out.print(path);
        out.write("\" value=\"true\" class=\"");
        out.print(css);
        out.write("\"/>\n");
        
            }
        
        out.write("\n\n");
        {
          org.springframework.web.servlet.tags.form.TextareaTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.TextareaTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.TextareaTag.class,"org.springframework.web.servlet.tags.form.TextareaTag path cssClass title disabled rows cols readonly");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setPath(OracleJspRuntime.toStr( path));
          __jsp_taghandler_3.setCssClass(OracleJspRuntime.toStr( css));
          __jsp_taghandler_3.setTitle(OracleJspRuntime.toStr( title));
          __jsp_taghandler_3.setDisabled(OracleJspRuntime.toStr( disabled));
          __jsp_taghandler_3.setRows(OracleJspRuntime.toStr( rows));
          __jsp_taghandler_3.setCols(OracleJspRuntime.toStr( cols));
          __jsp_taghandler_3.setReadonly(OracleJspRuntime.toStr( readonly));
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
        out.write("\n\n");
        
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
        new TagAttributeInfo("path",true,"java.lang.String",true,false),
        new TagAttributeInfo("cols",false,"java.lang.String",true,false),
        new TagAttributeInfo("disabled",false,"java.lang.String",true,false),
        new TagAttributeInfo("htmlEscape",false,"java.lang.String",true,false),
        new TagAttributeInfo("readonly",false,"java.lang.String",true,false),
        new TagAttributeInfo("rows",false,"java.lang.String",true,false),
        new TagAttributeInfo("title",false,"java.lang.String",true,false),
        new TagAttributeInfo("uppercase",false,"java.lang.String",true,false),
        new TagAttributeInfo("css",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("textarea","_oracle._jsp._tag._textarea_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
