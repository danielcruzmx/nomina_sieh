package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _window_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String name;
  private java.lang.String uri;
  private java.lang.String params;
  private java.lang.String linkValue;
  private java.lang.String spanClass;
  private java.lang.String width;
  private java.lang.String leftPosition;
  private java.lang.String height;
  private java.lang.String topPosition;
  private java.lang.String title;
  private java.lang.String image;
  private java.lang.String onClose;

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

  public void setName(java.lang.String name)
  {
    this.name = name;
  }

  public java.lang.String getName()
  {
    return this.name;
  }

  public void setUri(java.lang.String uri)
  {
    this.uri = uri;
  }

  public java.lang.String getUri()
  {
    return this.uri;
  }

  public void setParams(java.lang.String params)
  {
    this.params = params;
  }

  public java.lang.String getParams()
  {
    return this.params;
  }

  public void setLinkValue(java.lang.String linkValue)
  {
    this.linkValue = linkValue;
  }

  public java.lang.String getLinkValue()
  {
    return this.linkValue;
  }

  public void setSpanClass(java.lang.String spanClass)
  {
    this.spanClass = spanClass;
  }

  public java.lang.String getSpanClass()
  {
    return this.spanClass;
  }

  public void setWidth(java.lang.String width)
  {
    this.width = width;
  }

  public java.lang.String getWidth()
  {
    return this.width;
  }

  public void setLeftPosition(java.lang.String leftPosition)
  {
    this.leftPosition = leftPosition;
  }

  public java.lang.String getLeftPosition()
  {
    return this.leftPosition;
  }

  public void setHeight(java.lang.String height)
  {
    this.height = height;
  }

  public java.lang.String getHeight()
  {
    return this.height;
  }

  public void setTopPosition(java.lang.String topPosition)
  {
    this.topPosition = topPosition;
  }

  public java.lang.String getTopPosition()
  {
    return this.topPosition;
  }

  public void setTitle(java.lang.String title)
  {
    this.title = title;
  }

  public java.lang.String getTitle()
  {
    return this.title;
  }

  public void setImage(java.lang.String image)
  {
    this.image = image;
  }

  public java.lang.String getImage()
  {
    return this.image;
  }

  public void setOnClose(java.lang.String onClose)
  {
    this.onClose = onClose;
  }

  public java.lang.String getOnClose()
  {
    return this.onClose;
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
        pageContext.setAttribute("name", getName());
        pageContext.setAttribute("uri", getUri());
        pageContext.setAttribute("params", getParams());
        pageContext.setAttribute("linkValue", getLinkValue());
        pageContext.setAttribute("spanClass", getSpanClass());
        pageContext.setAttribute("width", getWidth());
        pageContext.setAttribute("leftPosition", getLeftPosition());
        pageContext.setAttribute("height", getHeight());
        pageContext.setAttribute("topPosition", getTopPosition());
        pageContext.setAttribute("title", getTitle());
        pageContext.setAttribute("image", getImage());
        pageContext.setAttribute("onClose", getOnClose());


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        
        try {
            String viewTracking = TagUtils.getInputViewParamName()+"=iframe:/layout/empty";
            spanClass     = spanClass==null     ? "" : spanClass;
            params        = params==null        ? "?"+viewTracking : "?"+viewTracking+"&"+params.replace(",","&"); 
            title         = title==null         ? "window.title" : title;
            width         = width==null         ? "450" : width;
            height        = height==null        ? "320" : height;    
            leftPosition  = leftPosition==null  ? "30" : leftPosition;
            topPosition   = topPosition==null   ? "25" : topPosition;
            image         = image==null         ? "background.gif" : image;
            linkValue     = linkValue==null     ? "" : linkValue;
            onClose       = onClose==null       ? "" : onClose;
            uri = uri.endsWith(".do") ? uri : uri+".do";
            uri = uri.startsWith("/") ? uri : "/"+uri;
        
        out.write("\n<span class=\"");
        out.print(spanClass);
        out.write("\">\n");
        
            if(linkValue.length()>0) {
        
        out.write("\n      <a href=\"javascript:showDiv");
        out.print(name);
        out.write("();\">\n        ");
        out.print(linkValue);
        out.write("\n      </a>\n");
        
            } else {
        
        out.write("\n      <a href=\"javascript:showDiv");
        out.print(name);
        out.write("();\">\n        <img alt=\"help\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setCode((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${image}",java.lang.String.class, __ojsp_varRes,null));
          try {
            __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
            if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_1.doCatch(th);
          } finally {
            __jsp_taghandler_1.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\" height=\"20\" width=\"20\"/>\n      </a>\n");
        
            }
        
        out.write("\n</span>\n<div id=\"div");
        out.print(name);
        out.write("\" class=\"popup\">\n    <table border=\"0\" width=\"250\" bgcolor=\"#3C3C3C\" cellspacing=\"0\" cellpadding=\"5\">\n        <tr>\n            <td width=\"100%\">\n                <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" height=\"36\">\n                    <tr>\n                        <td style=\"cursor:move\" width=\"100%\" onmousedown=\"javascript:comienzoMovimiento(event, 'div");
        out.print(name);
        out.write("');\">\n                            <font color=#ffffff size=2 face=arial  style=\"text-decoration:none\" >");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setCode(OracleJspRuntime.toStr( title));
          __jsp_taghandler_2.setText(OracleJspRuntime.toStr( title));
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
        out.write("</font>\n                        </td>\n                        <td style=\"cursor:hand\" valign=\"top\" align=\"right\">\n                            <a href=\"#\" onClick=\"closeDiv");
        out.print(name);
        out.write("();return false\"><font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">X</font></a>\n                        </td>\n                    </tr>\n                    <tr>\n                        <td width=\"100%\" bgcolor=\"#FFFFFF\" style=\"padding:4px\" colspan=\"2\">\n                            <iframe style=\"height:");
        out.print(height);
        out.write("px;width:");
        out.print(width);
        out.write("px;border-style:none;\" src=\"\" name=\"frame");
        out.print(name);
        out.write("\" id=\"frame");
        out.print(name);
        out.write("\">\n                            </iframe>\n                        </td>\n                    </tr>\n                </table> \n            </td>\n        </tr>\n    </table>\n</div>\n<script type=\"text/javascript\" >\n    function showDiv");
        out.print(name);
        out.write("() {\n        if (document.getElementById(\"div");
        out.print(name);
        out.write("\").style.visibility == \"visible\"){\n            document.getElementById('div");
        out.print(name);
        out.write("').style.visibility=\"hidden\";\n        } else {\n            centerInScreen(document.getElementById(\"div");
        out.print(name);
        out.write("\"), '");
        out.print(leftPosition);
        out.write("', '");
        out.print(topPosition);
        out.write("');\n            var frame = document.getElementById(\"frame");
        out.print(name);
        out.write("\");\n            \n            frame.src=\"");
        out.print(request.getContextPath()+uri+params);
        out.write("\";\n            document.getElementById('div");
        out.print(name);
        out.write("').style.visibility = \"visible\";\n        }\n    }\n    \n    function closeDiv");
        out.print(name);
        out.write("() {                                \n        var onCloseFunction = \"");
        out.print(onClose);
        out.write("\";\n        if(onCloseFunction.length>0) {            \n            window.parent.eval(onCloseFunction);            \n        }\n        document.getElementById('div");
        out.print(name);
        out.write("').style.visibility=\"hidden\";\n        document.getElementById('frame");
        out.print(name);
        out.write("').src=\"\";\n    }\n    carga();\n</script>\n");
        
        } catch(gob.shcp.fsn.service.ServiceException se) {
            TagUtils.saveError(pageContext, se);
        
        out.write("\n    ");
        {
          String __url=OracleJspRuntime.toStr("../layout/message.jsp");
          // Include 
          pageContext.include( __url,false);
          if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
        }

        out.write("\n");
        
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
        new TagAttributeInfo("name",true,"java.lang.String",true,false),
        new TagAttributeInfo("uri",true,"java.lang.String",true,false),
        new TagAttributeInfo("params",false,"java.lang.String",true,false),
        new TagAttributeInfo("linkValue",false,"java.lang.String",true,false),
        new TagAttributeInfo("spanClass",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false),
        new TagAttributeInfo("leftPosition",false,"java.lang.String",true,false),
        new TagAttributeInfo("height",false,"java.lang.String",true,false),
        new TagAttributeInfo("topPosition",false,"java.lang.String",true,false),
        new TagAttributeInfo("title",false,"java.lang.String",true,false),
        new TagAttributeInfo("image",false,"java.lang.String",true,false),
        new TagAttributeInfo("onClose",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("window","_oracle._jsp._tag._window_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
