package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.binder.ControllerWebBindingInitializer;


public class _calendar_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String path;
  private java.lang.String readonly;
  private java.lang.String size;
  private java.lang.String dateFormat;
  private java.lang.String javaDateFormat;
  private java.lang.String maxlength;

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

  public void setReadonly(java.lang.String readonly)
  {
    this.readonly = readonly;
  }

  public java.lang.String getReadonly()
  {
    return this.readonly;
  }

  public void setSize(java.lang.String size)
  {
    this.size = size;
  }

  public java.lang.String getSize()
  {
    return this.size;
  }

  public void setDateFormat(java.lang.String dateFormat)
  {
    this.dateFormat = dateFormat;
  }

  public java.lang.String getDateFormat()
  {
    return this.dateFormat;
  }

  public void setJavaDateFormat(java.lang.String javaDateFormat)
  {
    this.javaDateFormat = javaDateFormat;
  }

  public java.lang.String getJavaDateFormat()
  {
    return this.javaDateFormat;
  }

  public void setMaxlength(java.lang.String maxlength)
  {
    this.maxlength = maxlength;
  }

  public java.lang.String getMaxlength()
  {
    return this.maxlength;
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
        pageContext.setAttribute("readonly", getReadonly());
        pageContext.setAttribute("size", getSize());
        pageContext.setAttribute("dateFormat", getDateFormat());
        pageContext.setAttribute("javaDateFormat", getJavaDateFormat());
        pageContext.setAttribute("maxlength", getMaxlength());


        out.write(" \n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var value");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setVar("contextPath");
          __jsp_taghandler_1.setValue("/");
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\n\n");
        
        try {
            if(readonly != null && readonly.equalsIgnoreCase("TRUE")){
                readonly = "readonly";
            }else{
                readonly="";
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
        
        out.write("\n    ");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setPath(OracleJspRuntime.toStr( path));
          __jsp_taghandler_2.setId(OracleJspRuntime.toStr( path));
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
        out.write("\n");
        
            if(javaDateFormat != null && !javaDateFormat.equals("")){
        
        out.write("\n        <input type=\"hidden\" name=\"");
        out.print(ControllerWebBindingInitializer.DATE_FORMAT_PREFIX);
        out.print(path);
        out.write("\" value=\"");
        out.print(javaDateFormat);
        out.write("\"/>\n");
        }
        out.write("\n        <input type=\"text\" maxlength=\"");
        out.print(maxlength);
        out.write("\"  ");
        out.print(readonly);
        out.write(" name=\"text_");
        out.print(path);
        out.write("\" id=\"text_");
        out.print(path);
        out.write("\" size=\"");
        out.print(size);
        out.write("\" onblur=\"changeValue_");
        out.print(path);
        out.write("()\"/>\n\n    <span class=\"calendar\">\n    <a href=\"javascript:void(0)\" id=\"button_");
        out.print(path);
        out.write("\" onblur=\"changeValue_");
        out.print(path);
        out.write("()\">\n        <img src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setCode("background.gif");
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
        out.write("\" alt=\"calendar\" width=\"20\" height=\"20\"/>\n    </a>\n    </span>\n    \n    <script type=\"text/javascript\">\n        Calendar.setup({\n            inputField     :    \"text_");
        out.print(path);
        out.write("\",      \n            ifFormat       :    \"");
        out.print(dateFormat);
        out.write("\",                \n            showsTime      :    false,\n            button         :    \"button_");
        out.print(path);
        out.write("\",   \n            step           :    1        \n        }); \n        \n        document.getElementById(\"text_");
        out.print(path);
        out.write("\").value = document.getElementById(\"");
        out.print(path);
        out.write("\").value;        \n        \n        function changeValue_");
        out.print(path);
        out.write("(){\n            document.getElementById(\"");
        out.print(path);
        out.write("\").value = document.getElementById(\"text_");
        out.print(path);
        out.write("\").value;        \n        };\n    </script>\n");
        
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
        new TagAttributeInfo("path",true,"java.lang.String",true,false),
        new TagAttributeInfo("readonly",false,"java.lang.String",true,false),
        new TagAttributeInfo("size",false,"java.lang.String",true,false),
        new TagAttributeInfo("dateFormat",false,"java.lang.String",true,false),
        new TagAttributeInfo("javaDateFormat",false,"java.lang.String",true,false),
        new TagAttributeInfo("maxlength",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("calendar","_oracle._jsp._tag._calendar_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
