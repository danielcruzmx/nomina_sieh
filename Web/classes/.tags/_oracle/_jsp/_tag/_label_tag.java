package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;


public class _label_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String path;
  private java.lang.String htmlEscape;
  private java.lang.String cssClass;
  private java.lang.String cssStyle;
  private java.lang.String dir;
  private java.lang.String id;
  private java.lang.String lang;
  private java.lang.String onclick;
  private java.lang.String ondblclick;
  private java.lang.String onmousedown;
  private java.lang.String onmousemove;
  private java.lang.String onmouseout;
  private java.lang.String onmouseover;
  private java.lang.String onmouseup;
  private java.lang.String tabindex;
  private java.lang.String title;

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

  public void setHtmlEscape(java.lang.String htmlEscape)
  {
    this.htmlEscape = htmlEscape;
  }

  public java.lang.String getHtmlEscape()
  {
    return this.htmlEscape;
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
        pageContext.setAttribute("htmlEscape", getHtmlEscape());
        pageContext.setAttribute("cssClass", getCssClass());
        pageContext.setAttribute("cssStyle", getCssStyle());
        pageContext.setAttribute("dir", getDir());
        pageContext.setAttribute("id", getId());
        pageContext.setAttribute("lang", getLang());
        pageContext.setAttribute("onclick", getOnclick());
        pageContext.setAttribute("ondblclick", getOndblclick());
        pageContext.setAttribute("onmousedown", getOnmousedown());
        pageContext.setAttribute("onmousemove", getOnmousemove());
        pageContext.setAttribute("onmouseout", getOnmouseout());
        pageContext.setAttribute("onmouseover", getOnmouseover());
        pageContext.setAttribute("onmouseup", getOnmouseup());
        pageContext.setAttribute("tabindex", getTabindex());
        pageContext.setAttribute("title", getTitle());


        out.write("\n\n");
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
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
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
        out.write("\n\n");
        {
          org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id htmlEscape");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${path}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_taghandler_3.setId((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${id}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_taghandler_3.setHtmlEscape((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${htmlEscape}",java.lang.String.class, __ojsp_varRes,null));
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
        out.write("\n");
        {
          org.springframework.web.servlet.tags.form.LabelTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.LabelTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.LabelTag.class,"org.springframework.web.servlet.tags.form.LabelTag path id htmlEscape cssClass");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${path}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_taghandler_4.setId((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${id}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_taghandler_4.setHtmlEscape((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${htmlEscape}",java.lang.String.class, __ojsp_varRes,null));
          __jsp_taghandler_4.setCssClass("content");
          try {
            __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                out.write("\n    ");
                {
                  org.springframework.web.servlet.tags.BindTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
                  __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                  __jsp_taghandler_5.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${path}",java.lang.String.class, __ojsp_varRes,null));
                  org.springframework.web.servlet.support.BindStatus status = null;
                  try {
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
                        out.write("\n        ");
                        {
                          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.value}",java.lang.Object.class, __ojsp_varRes,null));
                          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                        }
                        out.write("\n    ");
                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                       throw new javax.servlet.jsp.SkipPageException();
                  } catch (Throwable th) {
                    __jsp_taghandler_5.doCatch(th);
                  } finally {
                    __jsp_taghandler_5.doFinally();
                  }
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
                }
                out.write("\n");
              } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
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
        new TagAttributeInfo("htmlEscape",false,"java.lang.String",true,false),
        new TagAttributeInfo("cssClass",false,"java.lang.String",true,false),
        new TagAttributeInfo("cssStyle",false,"java.lang.String",true,false),
        new TagAttributeInfo("dir",false,"java.lang.String",true,false),
        new TagAttributeInfo("id",false,"java.lang.String",true,false),
        new TagAttributeInfo("lang",false,"java.lang.String",true,false),
        new TagAttributeInfo("onclick",false,"java.lang.String",true,false),
        new TagAttributeInfo("ondblclick",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmousedown",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmousemove",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmouseout",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmouseover",false,"java.lang.String",true,false),
        new TagAttributeInfo("onmouseup",false,"java.lang.String",true,false),
        new TagAttributeInfo("tabindex",false,"java.lang.String",true,false),
        new TagAttributeInfo("title",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("label","_oracle._jsp._tag._label_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
