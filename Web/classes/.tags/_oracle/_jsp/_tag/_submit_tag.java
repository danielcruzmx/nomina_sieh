package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _submit_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String path;
  private java.lang.String action;
  private java.lang.String htmlEscape;
  private java.lang.String value;
  private java.lang.String onclick;
  private java.lang.String progressBar;
  private java.lang.String progressIcon;
  private java.lang.String alertCode;
  private java.lang.String uppercase;
  private java.lang.String image;

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

  public void setAction(java.lang.String action)
  {
    this.action = action;
  }

  public java.lang.String getAction()
  {
    return this.action;
  }

  public void setHtmlEscape(java.lang.String htmlEscape)
  {
    this.htmlEscape = htmlEscape;
  }

  public java.lang.String getHtmlEscape()
  {
    return this.htmlEscape;
  }

  public void setValue(java.lang.String value)
  {
    this.value = value;
  }

  public java.lang.String getValue()
  {
    return this.value;
  }

  public void setOnclick(java.lang.String onclick)
  {
    this.onclick = onclick;
  }

  public java.lang.String getOnclick()
  {
    return this.onclick;
  }

  public void setProgressBar(java.lang.String progressBar)
  {
    this.progressBar = progressBar;
  }

  public java.lang.String getProgressBar()
  {
    return this.progressBar;
  }

  public void setProgressIcon(java.lang.String progressIcon)
  {
    this.progressIcon = progressIcon;
  }

  public java.lang.String getProgressIcon()
  {
    return this.progressIcon;
  }

  public void setAlertCode(java.lang.String alertCode)
  {
    this.alertCode = alertCode;
  }

  public java.lang.String getAlertCode()
  {
    return this.alertCode;
  }

  public void setUppercase(java.lang.String uppercase)
  {
    this.uppercase = uppercase;
  }

  public java.lang.String getUppercase()
  {
    return this.uppercase;
  }

  public void setImage(java.lang.String image)
  {
    this.image = image;
  }

  public java.lang.String getImage()
  {
    return this.image;
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
        pageContext.setAttribute("action", getAction());
        pageContext.setAttribute("htmlEscape", getHtmlEscape());
        pageContext.setAttribute("value", getValue());
        pageContext.setAttribute("onclick", getOnclick());
        pageContext.setAttribute("progressBar", getProgressBar());
        pageContext.setAttribute("progressIcon", getProgressIcon());
        pageContext.setAttribute("alertCode", getAlertCode());
        pageContext.setAttribute("uppercase", getUppercase());
        pageContext.setAttribute("image", getImage());


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
        out.write("\n");
        out.write("\n\n\n");
        
            try{
        
        out.write("\n");
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
        
            String progressType = "icon";
            if(Boolean.valueOf(progressBar)) {
                progressType = "bar";
            }
            if(progressIcon != null && !Boolean.valueOf(progressIcon)) {
                progressType = "";
            }
            
            boolean upperCased = true;
            if(uppercase != null && !"".equals(uppercase)) {
                upperCased = Boolean.valueOf(uppercase);
            }
            String cssClass = upperCased ? "uppercase" : "";
            boolean showImg = false;
            if(image != null && !"".equals(image)) {
                showImg = Boolean.valueOf(image);
            }
            if(path != null && !"".equals(path)) {
        
        out.write("\n        <input type=\"hidden\" id=\"");
        out.print(path);
        out.write("\" name=\"");
        out.print(path);
        out.write("\" value=\"false\"/>\n");
        
            }
            if(action != null && !"".equals(action)) {
                action = TagUtils.formatUrl(action);        
        
        out.write("\n        ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setVar("_action");
          __jsp_taghandler_3.setScope("page");
          __jsp_taghandler_3.setValue(OracleJspRuntime.toStr( action));
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
        }
        out.write("\n");
        
                action = (String)pageContext.getAttribute("_action", PageContext.PAGE_SCOPE);
            }
            if(alertCode != null && !"".equals(alertCode)) {
        
        out.write("\n        ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text var scope");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setCode(OracleJspRuntime.toStr( alertCode));
          __jsp_taghandler_4.setText(OracleJspRuntime.toStr( alertCode));
          __jsp_taghandler_4.setVar("_alertCode");
          __jsp_taghandler_4.setScope("page");
          try {
            __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
            if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_4.doCatch(th);
          } finally {
            __jsp_taghandler_4.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
        }
        out.write("\n");
        
                alertCode = (String)pageContext.getAttribute("_alertCode", PageContext.PAGE_SCOPE);
            }
        
            Integer htmlElementUniqueID = TagUtils.getHtmlUniqueId(pageContext);
        
            if(onclick != null && !"".equals(onclick)) {
                onclick = onclick + ";return doSubmit("+ htmlElementUniqueID +");";
            } else {
                onclick = "return doSubmit("+ htmlElementUniqueID +");";
            }
        
            progressBar = progressBar != null ? progressBar : "false";
            action = action != null ? action : "";
            path = path != null ? path : "";
            alertCode = alertCode != null ? alertCode : "";
        
            if(!showImg) {
        
        out.write("\n        ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text var");
          __jsp_taghandler_5.setParent(null);
          __jsp_taghandler_5.setCode((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_taghandler_5.setText((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_taghandler_5.setVar("value");
          try {
            __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
            if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_5.doCatch(th);
          } finally {
            __jsp_taghandler_5.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
        }
        out.write("\n        <input id=\"");
        out.print(htmlElementUniqueID);
        out.write("\" type=\"submit\" value=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_6.setParent(null);
          __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
        }
        out.write("\" class=\"");
        out.print(cssClass);
        out.write("\" onclick=\"");
        out.print(onclick);
        out.write("\" progressType=\"");
        out.print(progressType);
        out.write("\" action=\"");
        out.print(action);
        out.write("\" path=\"");
        out.print(path);
        out.write("\" alertCode=\"");
        out.print(alertCode);
        out.write("\"/>        \n");
        
            } else {
        
        out.write("\n        <input id=\"");
        out.print(htmlElementUniqueID);
        out.write("\" type=\"image\" alt=\"");
        out.print(value);
        out.write("\" onclick=\"");
        out.print(onclick);
        out.write("\" progressType=\"");
        out.print(progressType);
        out.write("\" action=\"");
        out.print(action);
        out.write("\" path=\"");
        out.print(path);
        out.write("\" alertCode=\"");
        out.print(alertCode);
        out.write("\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_7.setParent(null);
          __jsp_taghandler_7.setCode("submit.tag.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
            if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_7.doCatch(th);
          } finally {
            __jsp_taghandler_7.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
        }
        out.write("/");
        out.print(value);
        out.write(".gif\"/>\n");
        
            }
        
            if(progressType.equals("icon")) {
        
        out.write("\n        <img src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_8.setParent(null);
          __jsp_taghandler_8.setCode("loader.gif");
          try {
            __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
            if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_8.doCatch(th);
          } finally {
            __jsp_taghandler_8.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
        }
        out.write("\" id=\"progressIcon");
        out.print(htmlElementUniqueID);
        out.write("\" style=\"visibility:hidden;\"/>\n");
        
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
        new TagAttributeInfo("path",false,"java.lang.String",true,false),
        new TagAttributeInfo("action",false,"java.lang.String",true,false),
        new TagAttributeInfo("htmlEscape",false,"java.lang.String",true,false),
        new TagAttributeInfo("value",true,"java.lang.String",true,false),
        new TagAttributeInfo("onclick",false,"java.lang.String",true,false),
        new TagAttributeInfo("progressBar",false,"java.lang.String",true,false),
        new TagAttributeInfo("progressIcon",false,"java.lang.String",true,false),
        new TagAttributeInfo("alertCode",false,"java.lang.String",true,false),
        new TagAttributeInfo("uppercase",false,"java.lang.String",true,false),
        new TagAttributeInfo("image",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("submit","_oracle._jsp._tag._submit_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
