package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _link_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String action;
  private java.lang.String parameters;
  private java.lang.String htmlEscape;
  private java.lang.String href;
  private java.lang.String target;
  private java.lang.String accesskey;
  private java.lang.String alt;
  private java.lang.String cssClass;
  private java.lang.String cssStyle;
  private java.lang.String dir;
  private java.lang.String disabled;
  private java.lang.String id;
  private java.lang.String lang;
  private java.lang.String onblur;
  private java.lang.String onfocus;
  private java.lang.String onclick;
  private java.lang.String ondblclick;
  private java.lang.String onmousedown;
  private java.lang.String onmousemove;
  private java.lang.String onmouseout;
  private java.lang.String onmouseover;
  private java.lang.String onmouseup;
  private java.lang.String tabindex;
  private java.lang.String title;
  private java.lang.String progressIcon;

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

  public void setAction(java.lang.String action)
  {
    this.action = action;
  }

  public java.lang.String getAction()
  {
    return this.action;
  }

  public void setParameters(java.lang.String parameters)
  {
    this.parameters = parameters;
  }

  public java.lang.String getParameters()
  {
    return this.parameters;
  }

  public void setHtmlEscape(java.lang.String htmlEscape)
  {
    this.htmlEscape = htmlEscape;
  }

  public java.lang.String getHtmlEscape()
  {
    return this.htmlEscape;
  }

  public void setHref(java.lang.String href)
  {
    this.href = href;
  }

  public java.lang.String getHref()
  {
    return this.href;
  }

  public void setTarget(java.lang.String target)
  {
    this.target = target;
  }

  public java.lang.String getTarget()
  {
    return this.target;
  }

  public void setAccesskey(java.lang.String accesskey)
  {
    this.accesskey = accesskey;
  }

  public java.lang.String getAccesskey()
  {
    return this.accesskey;
  }

  public void setAlt(java.lang.String alt)
  {
    this.alt = alt;
  }

  public java.lang.String getAlt()
  {
    return this.alt;
  }

  public void setCssClass(java.lang.String cssClass)
  {
    this.cssClass = cssClass;
  }

  public java.lang.String getCssClass()
  {
    return this.cssClass;
  }

  public void setCssStyle(java.lang.String cssStyle)
  {
    this.cssStyle = cssStyle;
  }

  public java.lang.String getCssStyle()
  {
    return this.cssStyle;
  }

  public void setDir(java.lang.String dir)
  {
    this.dir = dir;
  }

  public java.lang.String getDir()
  {
    return this.dir;
  }

  public void setDisabled(java.lang.String disabled)
  {
    this.disabled = disabled;
  }

  public java.lang.String getDisabled()
  {
    return this.disabled;
  }

  public void setId(java.lang.String id)
  {
    this.id = id;
  }

  public java.lang.String getId()
  {
    return this.id;
  }

  public void setLang(java.lang.String lang)
  {
    this.lang = lang;
  }

  public java.lang.String getLang()
  {
    return this.lang;
  }

  public void setOnblur(java.lang.String onblur)
  {
    this.onblur = onblur;
  }

  public java.lang.String getOnblur()
  {
    return this.onblur;
  }

  public void setOnfocus(java.lang.String onfocus)
  {
    this.onfocus = onfocus;
  }

  public java.lang.String getOnfocus()
  {
    return this.onfocus;
  }

  public void setOnclick(java.lang.String onclick)
  {
    this.onclick = onclick;
  }

  public java.lang.String getOnclick()
  {
    return this.onclick;
  }

  public void setOndblclick(java.lang.String ondblclick)
  {
    this.ondblclick = ondblclick;
  }

  public java.lang.String getOndblclick()
  {
    return this.ondblclick;
  }

  public void setOnmousedown(java.lang.String onmousedown)
  {
    this.onmousedown = onmousedown;
  }

  public java.lang.String getOnmousedown()
  {
    return this.onmousedown;
  }

  public void setOnmousemove(java.lang.String onmousemove)
  {
    this.onmousemove = onmousemove;
  }

  public java.lang.String getOnmousemove()
  {
    return this.onmousemove;
  }

  public void setOnmouseout(java.lang.String onmouseout)
  {
    this.onmouseout = onmouseout;
  }

  public java.lang.String getOnmouseout()
  {
    return this.onmouseout;
  }

  public void setOnmouseover(java.lang.String onmouseover)
  {
    this.onmouseover = onmouseover;
  }

  public java.lang.String getOnmouseover()
  {
    return this.onmouseover;
  }

  public void setOnmouseup(java.lang.String onmouseup)
  {
    this.onmouseup = onmouseup;
  }

  public java.lang.String getOnmouseup()
  {
    return this.onmouseup;
  }

  public void setTabindex(java.lang.String tabindex)
  {
    this.tabindex = tabindex;
  }

  public java.lang.String getTabindex()
  {
    return this.tabindex;
  }

  public void setTitle(java.lang.String title)
  {
    this.title = title;
  }

  public java.lang.String getTitle()
  {
    return this.title;
  }

  public void setProgressIcon(java.lang.String progressIcon)
  {
    this.progressIcon = progressIcon;
  }

  public java.lang.String getProgressIcon()
  {
    return this.progressIcon;
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
        pageContext.setAttribute("action", getAction());
        pageContext.setAttribute("parameters", getParameters());
        pageContext.setAttribute("htmlEscape", getHtmlEscape());
        pageContext.setAttribute("href", getHref());
        pageContext.setAttribute("target", getTarget());
        pageContext.setAttribute("accesskey", getAccesskey());
        pageContext.setAttribute("alt", getAlt());
        pageContext.setAttribute("cssClass", getCssClass());
        pageContext.setAttribute("cssStyle", getCssStyle());
        pageContext.setAttribute("dir", getDir());
        pageContext.setAttribute("disabled", getDisabled());
        pageContext.setAttribute("id", getId());
        pageContext.setAttribute("lang", getLang());
        pageContext.setAttribute("onblur", getOnblur());
        pageContext.setAttribute("onfocus", getOnfocus());
        pageContext.setAttribute("onclick", getOnclick());
        pageContext.setAttribute("ondblclick", getOndblclick());
        pageContext.setAttribute("onmousedown", getOnmousedown());
        pageContext.setAttribute("onmousemove", getOnmousemove());
        pageContext.setAttribute("onmouseout", getOnmouseout());
        pageContext.setAttribute("onmouseover", getOnmouseover());
        pageContext.setAttribute("onmouseup", getOnmouseup());
        pageContext.setAttribute("tabindex", getTabindex());
        pageContext.setAttribute("title", getTitle());
        pageContext.setAttribute("progressIcon", getProgressIcon());


        out.write("\n\n");
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
        out.write("\n");
        out.write("\n");
        out.write("\n");
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
        out.write("\n\n");
        
            try{
        
        out.write("\n        ");
        {
          org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty htmlEscape}",java.lang.Boolean.class, __ojsp_varRes,null)));
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n            ");
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
              out.write("\n        ");
            } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\n        ");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setVar("_href");
          __jsp_taghandler_3.setValue(href);
          __jsp_taghandler_3.setScope("page");
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
        }
        out.write("\n        ");
        
                Integer htmlElementUniqueID = TagUtils.getHtmlUniqueId(pageContext);
                
                String progressType = "icon";
                if(progressIcon != null && !Boolean.valueOf(progressIcon)){
                    progressType = "";
                }
                
                if(href == null || "".equals(href)) {
                    if(action != null && !"".equals(action)) {
                        if(!action.startsWith("/")) {
                            action = "/" + action;
                        }
                        if(!action.endsWith(".do")) {
                            action = action + ".do";
                        }
                        if(parameters != null && !"".equals(parameters)) {
                            if(!parameters.startsWith("?")) {
                                parameters = "?" + parameters;
                            }
                            action = action + parameters.replace(",", "&");
                        }
        
        out.write("\n                ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setVar("_href");
          __jsp_taghandler_4.setScope("page");
          __jsp_taghandler_4.setValue(OracleJspRuntime.toStr( action));
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
        }
        out.write("\n");
        
                    } else {
        
        out.write("\n                ");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
          __jsp_taghandler_5.setParent(null);
          __jsp_taghandler_5.setVar("_href");
          __jsp_taghandler_5.setValue("#");
          __jsp_taghandler_5.setScope("page");
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
        }
        out.write("\n");
        
                    }
                }
                
                if(onclick != null && !"".equals(onclick)) {
                    onclick = onclick + "showLightbox("+ htmlElementUniqueID +");";
                } else {
                    onclick = "showLightbox("+ htmlElementUniqueID +");";
                }
                
                if(disabled != null && "true".equals(disabled)) {
        
        out.write("\n            ");
        ((oracle.jsp.runtime.OracleJspContextWrapper) this.jspContext).syncVariableBeforeFragment();
        _jspFragWriter = null;
        if (getJspBody() != null) 
          getJspBody().invoke(_jspFragWriter);
        out.write("\n");
        
                } else {
        
        out.write("\n            <a id=\"");
        out.print(htmlElementUniqueID);
        out.write("\" progressType=\"");
        out.print(progressType);
        out.write("\" href=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_6.setParent(null);
          __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${_href}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
        }
        out.write("\" onclick=\"");
        out.print(onclick);
        out.write("\">\n                ");
        ((oracle.jsp.runtime.OracleJspContextWrapper) this.jspContext).syncVariableBeforeFragment();
        _jspFragWriter = null;
        if (getJspBody() != null) 
          getJspBody().invoke(_jspFragWriter);
        out.write("\n            </a>\n");
        
                }
                
                if(progressType.equals("icon")) {
        
        out.write("\n            <img src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_7.setParent(null);
          __jsp_taghandler_7.setCode("loader.gif");
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
        new TagAttributeInfo("action",false,"java.lang.String",true,false),
        new TagAttributeInfo("parameters",false,"java.lang.String",true,false),
        new TagAttributeInfo("htmlEscape",false,"java.lang.String",true,false),
        new TagAttributeInfo("href",false,"java.lang.String",true,false),
        new TagAttributeInfo("target",false,"java.lang.String",true,false),
        new TagAttributeInfo("accesskey",false,"java.lang.String",true,false),
        new TagAttributeInfo("alt",false,"java.lang.String",true,false),
        new TagAttributeInfo("cssClass",false,"java.lang.String",true,false),
        new TagAttributeInfo("cssStyle",false,"java.lang.String",true,false),
        new TagAttributeInfo("dir",false,"java.lang.String",true,false),
        new TagAttributeInfo("disabled",false,"java.lang.String",true,false),
        new TagAttributeInfo("id",false,"java.lang.String",true,false),
        new TagAttributeInfo("lang",false,"java.lang.String",true,false),
        new TagAttributeInfo("onblur",false,"java.lang.String",true,false),
        new TagAttributeInfo("onfocus",false,"java.lang.String",true,false),
        new TagAttributeInfo("onclick",false,"java.lang.String",true,false),
        new TagAttributeInfo("ondblclick",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmousedown",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmousemove",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmouseout",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmouseover",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmouseup",false,"java.lang.String",true,false),
        new TagAttributeInfo("tabindex",false,"java.lang.String",true,false),
        new TagAttributeInfo("title",false,"java.lang.String",true,false),
        new TagAttributeInfo("progressIcon",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("link","_oracle._jsp._tag._link_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
