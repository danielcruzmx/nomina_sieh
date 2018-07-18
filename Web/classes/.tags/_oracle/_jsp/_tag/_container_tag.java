package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;


public class _container_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String title;
  private java.lang.String name;
  private java.lang.String content;
  private java.lang.String selected;
  private java.lang.String section;
  private java.lang.String type;
  private java.lang.String tabHeight;
  private java.lang.String displayTime;

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

  public void setTitle(java.lang.String title)
  {
    this.title = title;
  }

  public java.lang.String getTitle()
  {
    return this.title;
  }

  public void setName(java.lang.String name)
  {
    this.name = name;
  }

  public java.lang.String getName()
  {
    return this.name;
  }

  public void setContent(java.lang.String content)
  {
    this.content = content;
  }

  public java.lang.String getContent()
  {
    return this.content;
  }

  public void setSelected(java.lang.String selected)
  {
    this.selected = selected;
  }

  public java.lang.String getSelected()
  {
    return this.selected;
  }

  public void setSection(java.lang.String section)
  {
    this.section = section;
  }

  public java.lang.String getSection()
  {
    return this.section;
  }

  public void setType(java.lang.String type)
  {
    this.type = type;
  }

  public java.lang.String getType()
  {
    return this.type;
  }

  public void setTabHeight(java.lang.String tabHeight)
  {
    this.tabHeight = tabHeight;
  }

  public java.lang.String getTabHeight()
  {
    return this.tabHeight;
  }

  public void setDisplayTime(java.lang.String displayTime)
  {
    this.displayTime = displayTime;
  }

  public java.lang.String getDisplayTime()
  {
    return this.displayTime;
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
        pageContext.setAttribute("title", getTitle());
        pageContext.setAttribute("name", getName());
        pageContext.setAttribute("content", getContent());
        pageContext.setAttribute("selected", getSelected());
        pageContext.setAttribute("section", getSection());
        pageContext.setAttribute("type", getType());
        pageContext.setAttribute("tabHeight", getTabHeight());
        pageContext.setAttribute("displayTime", getDisplayTime());


        out.write("\n\n\n");
        out.write("        <!-- Titulo que aparecera en alguno de los contenedores. -->\n");
        out.write("         <!-- Nombre que se le va a asociar a alguno de los contenedores. -->\n");
        out.write("      <!-- Variable definida en el jsp con el contenido que se va a desplegar en alguno de los contenedores. -->\n");
        out.write("     <!-- Indica cual de los contenedores es el que aparecera desplegado -->\n");
        out.write("      <!-- Atributo que indica en que momento inicia el contenedor (\"init\") y en donde finaliza (\"final\") para poder armar correctamente el contenedor. -->\n");
        out.write("         <!-- Especifica como se mostrara el contenedor si en forma de tabs(\"tab\") o en acordeon (\"accordion\") el valor por default es accordion. -->\n");
        out.write("    <!-- La altura en pixeles de los tabs, el valor por default es 25. -->\n");
        out.write("  <!-- Especifica cuantos segundos debe tardar en abrir los contenidos, el valor por default es 3 segundos. -->\n\n");
        
        try{
            
            title = title != null ? title : "<-- " + name + " -->";
            selected = selected == "true" ? "header_highlight" : "";
            tabHeight = tabHeight != null ? tabHeight : "25";
            type = type != null ? type : "accordion";
            
            if(section != null && section =="init" && type != null){
                request.setAttribute("CONTAINER_TYPE", type);
            }
        
        out.write("\n    \n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${section != null && section =='init'}",java.lang.Boolean.class, __ojsp_varRes,null)));
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n        <style type=\"text/css\">\n            .tab_container *{\n                float:left;\n                width:100px;\n                height:");
              out.print(tabHeight);
              out.write("px;\n            }\n        </style>\n");
              
                      displayTime = displayTime != null ? displayTime : "3";
                      request.setAttribute("CONTAINER_DISPLAY_TIME", displayTime);
              
              out.write("\n        <div id=\"fsn-container\">\n    ");
            } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\n    \n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${section == null && name != null}",java.lang.Boolean.class, __ojsp_varRes,null)));
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n");
              
                      if(request.getAttribute("CONTAINER_TYPE") != null && request.getAttribute("CONTAINER_TYPE") == "tab"){
              
              out.write("\n        ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var scope");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setVar("TABS_HEADER_DIV");
                __jsp_taghandler_3.setScope("request");
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                  do {
                    out.write("\n            ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                      __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                      __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${TABS_HEADER_DIV}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_4.setEscapeXml(false);
                      __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                      if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                    }
                    out.write("\n            <div id=\"");
                    out.print(name);
                    out.write("-header\" class=\"container_headings ");
                    out.print(selected);
                    out.write("\" ><a href=\"javascript:currentTab('");
                    out.print(name);
                    out.write("')\">");
                    out.print(title);
                    out.write("</a></div>\n        ");
                  } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                }
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write("        \n        ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var scope");
                __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                __jsp_taghandler_5.setVar("TABS_CONTENT_DIV");
                __jsp_taghandler_5.setScope("request");
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                  do {
                    out.write("\n            ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${TABS_CONTENT_DIV}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_6.setEscapeXml(false);
                      __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                      if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                    }
                    out.write("\n            <div id=\"");
                    out.print(name);
                    out.write("-content\">\n                <div class=\"container_child\">\n                    ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                      __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_7.setEscapeXml(false);
                      __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                      if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                    }
                    out.write("\n                    ");
                    ((oracle.jsp.runtime.OracleJspContextWrapper) this.jspContext).syncVariableBeforeFragment();
                    _jspFragWriter = null;
                    if (getJspBody() != null) 
                      getJspBody().invoke(_jspFragWriter);
                    out.write("\n                </div>\n            </div>\n        ");
                  } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                }
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write("\n");
              
                      }else if(request.getAttribute("CONTAINER_TYPE") != null && request.getAttribute("CONTAINER_TYPE") == "accordion"){
              
              out.write("                \n            <div id=\"");
              out.print(name);
              out.write("-header\" class=\"container_headings ");
              out.print(selected);
              out.write("\" ><a href=\"javascript:currentTab('");
              out.print(name);
              out.write("')\">");
              out.print(title);
              out.write("</a></div>\n            <div id=\"");
              out.print(name);
              out.write("-content\">\n                <div class=\"container_child\">\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                __jsp_taghandler_8.setParent(__jsp_taghandler_2);
                __jsp_taghandler_8.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_8.setEscapeXml(false);
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write("\n                    ");
              ((oracle.jsp.runtime.OracleJspContextWrapper) this.jspContext).syncVariableBeforeFragment();
              _jspFragWriter = null;
              if (getJspBody() != null) 
                getJspBody().invoke(_jspFragWriter);
              out.write("\n                </div>\n            </div>\n");
              
                      }
              
              out.write("\n    ");
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
          __jsp_taghandler_9.setParent(null);
          __jsp_taghandler_9.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${section != null && section =='final'}",java.lang.Boolean.class, __ojsp_varRes,null)));
          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n");
              
                      displayTime = (String)request.getAttribute("CONTAINER_DISPLAY_TIME");
                      if(request.getAttribute("CONTAINER_TYPE") != null && request.getAttribute("CONTAINER_TYPE") == "tab"){
              
              out.write("        \n            <div class=\"tab_container\">\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                __jsp_taghandler_10.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${TABS_HEADER_DIV}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_10.setEscapeXml(false);
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write("\n            </div>\n            <div style=\"float:left;width:100%\">\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
                __jsp_taghandler_11.setParent(__jsp_taghandler_9);
                __jsp_taghandler_11.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${TABS_CONTENT_DIV}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_11.setEscapeXml(false);
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write("\n            </div>      \n");
              
                      }
                      request.removeAttribute("CONTAINER_TYPE");
                      request.removeAttribute("CONTAINER_DISPLAY_TIME");
              
              out.write("    \n        </div>\n        \n        <script type=\"text/javascript\">\t\n            var containerDisplayTime = \"");
              out.print(displayTime);
              out.write("\";\n            window.onload=new Accordian('fsn-container',containerDisplayTime,'header_highlight');\t\n        </script>\n    ");
            } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
        }
        out.write("\n    \n");
        
        } catch(Exception e) {
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
        new TagAttributeInfo("title",false,"java.lang.String",true,false),
        new TagAttributeInfo("name",false,"java.lang.String",true,false),
        new TagAttributeInfo("content",false,"java.lang.String",true,false),
        new TagAttributeInfo("selected",false,"java.lang.String",true,false),
        new TagAttributeInfo("section",false,"java.lang.String",true,false),
        new TagAttributeInfo("type",false,"java.lang.String",true,false),
        new TagAttributeInfo("tabHeight",false,"java.lang.String",true,false),
        new TagAttributeInfo("displayTime",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("container","_oracle._jsp._tag._container_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
