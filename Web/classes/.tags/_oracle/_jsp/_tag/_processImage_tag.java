package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import java.util.List;
import gob.shcp.bpm.model.DiagramInfoDTO;
import gob.shcp.bpm.model.DiagramNodeInfoDTO;
import gob.shcp.bpm.model.TokenDTO;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _processImage_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String url;
  private java.lang.String parentWidth;
  private java.lang.String parentHeight;
  private java.lang.String leftPosition;
  private java.lang.String topPosition;

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

  public void setUrl(java.lang.String url)
  {
    this.url = url;
  }

  public java.lang.String getUrl()
  {
    return this.url;
  }

  public void setParentWidth(java.lang.String parentWidth)
  {
    this.parentWidth = parentWidth;
  }

  public java.lang.String getParentWidth()
  {
    return this.parentWidth;
  }

  public void setParentHeight(java.lang.String parentHeight)
  {
    this.parentHeight = parentHeight;
  }

  public java.lang.String getParentHeight()
  {
    return this.parentHeight;
  }

  public void setLeftPosition(java.lang.String leftPosition)
  {
    this.leftPosition = leftPosition;
  }

  public java.lang.String getLeftPosition()
  {
    return this.leftPosition;
  }

  public void setTopPosition(java.lang.String topPosition)
  {
    this.topPosition = topPosition;
  }

  public java.lang.String getTopPosition()
  {
    return this.topPosition;
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
        pageContext.setAttribute("url", getUrl());
        pageContext.setAttribute("parentWidth", getParentWidth());
        pageContext.setAttribute("parentHeight", getParentHeight());
        pageContext.setAttribute("leftPosition", getLeftPosition());
        pageContext.setAttribute("topPosition", getTopPosition());


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n<!-- BPM -->       \n<link type=\"text/css\" rel=\"stylesheet\" href=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setCode("bpm.css");
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
        out.write("\"/>\n \n");
        out.write("\n\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        
        try {
            String action = (url != null && !"".equals(url.trim())) ? url : "/fsnjbpm/service/bpmImage";
            final String reloadController = (String)request.getAttribute("reloadController");
            final String uri = reloadController.substring(0, reloadController.lastIndexOf("/")) + "/showParentProcessImage.do";
            String params = null;
            parentWidth = parentWidth == null ? "800" : parentWidth;
            parentHeight = parentHeight == null ? "600" : parentHeight;
            leftPosition  = leftPosition == null  ? "15" : leftPosition;
            topPosition = topPosition == null ? "15" : topPosition;
            Integer htmlElementUniqueID = TagUtils.getHtmlUniqueId(pageContext);
        
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setVar("_action");
          __jsp_taghandler_2.setScope("page");
          __jsp_taghandler_2.setValue(OracleJspRuntime.toStr( action));
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setVar("idProcessInstance");
          __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['idProcessInstance']}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_taghandler_3.setScope("page");
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
        }
        out.write("\n");
            
            action = (String)pageContext.getAttribute("_action", PageContext.PAGE_SCOPE);
            final String idProcessInstance = (String)pageContext.getAttribute("idProcessInstance", PageContext.PAGE_SCOPE);
            final long processInstanceId = idProcessInstance != null ? Long.valueOf(idProcessInstance) : 0;
            final DiagramInfoDTO diagramInfo = (DiagramInfoDTO)request.getAttribute("processDiagramInfoDTO");
            if(diagramInfo != null) {
        	String style="position:relative;height:"+diagramInfo.getHeight()+"px;width:"+diagramInfo.getWidth()+"px;";
                if (diagramInfo.getIdParentProcessInstance() > 0)  {
        
        out.write("\n        <input id=\"");
        out.print(htmlElementUniqueID);
        out.write("\" type=\"button\" value=\"Ver proceso padre\" class=\"uppercase\" path=\"\" onclick=\"javascript:showDiv");
        out.print(htmlElementUniqueID);
        out.write("();\"/>\n        <br><br/>\n");
        
                }
        
        out.write("\n        \n\t<div style=\"");
        out.print(style);
        out.write("\">\n\t    <img alt=\"Process Diagram\" src=\"");
        out.print(action);
        out.write("?idProcessInstance=");
        out.print(processInstanceId);
        out.write("\" style=\"position:absolute;top:0;left:0\"/>\n");
        
                    TokenDTO token = null;
                    DiagramNodeInfoDTO node = null;
                    final List tokenList = diagramInfo.getTokens();
        	    for(int x = 0; x < tokenList.size(); x++) {
        	        token = (TokenDTO)tokenList.get(x);
             		node = (DiagramNodeInfoDTO)diagramInfo.getNodeMap().get(token.getNode().getName());
             		style="top:"+(node.getY()-12)+"px;left:"+(node.getX()+2)+"px;width:"+(node.getWidth()-3)+"px;height:"+(node.getHeight()+11)+"px";
                        String styleClass = "pboxs";
                        if(token.getEnd() != null) {
                            styleClass = "pboxs_e";
                        }
                        if(token.isSuspended()) {
                            styleClass = "pboxs_s";
                        }
        
        out.write("\n                <div style=\"");
        out.print(style);
        out.write("\" class=\"");
        out.print(styleClass);
        out.write("\">\n                </div>\n");
        
                        style = "top:"+node.getY()+"px;left:"+node.getX()+"px;width:"+(node.getWidth()-3)+"px;height:"+(node.getHeight()-3)+"px";
                        styleClass = "pbox";
                        if(token.getEnd() != null) {
                            styleClass = "pbox_e";
                        }
                        if(token.isSuspended()) {
                            styleClass = "pbox_s";
                        }
        
        out.write("\n                <div style=\"");
        out.print(style);
        out.write("\" class=\"");
        out.print(styleClass);
        out.write("\">\n                </div>\n");
        
                        style = "top:"+(node.getY()-14)+"px;left:"+node.getX()+"px;width:"+(node.getWidth()-1)+"px";
                 	styleClass = "pboxc";
                 	if(token.getEnd() != null) {
            		    styleClass = "pboxc_e";
                        }
            		if (token.isSuspended()) {
                            styleClass = "pboxc_s";
                        }
        
        out.write("\n                <div style=\"");
        out.print(style);
        out.write("\" class=\"pboxce\">\n                    <div class=\"");
        out.print(styleClass);
        out.write("\">\n");
        
                                String status = "";
                                if(token.getEnd() == null && !token.isSuspended()) {
                                    status = "En Ejecucion";
                                }
                                if(token.getEnd() == null && token.isSuspended()) {
                                    status = "Suspendido";
                                }
                                if(token.getEnd() != null) {
                                    status = "Terminado";
                                }
                                if(token.getName() != null) {
                                    status += " \""+token.getName()+"\"" ;
                                }
        
        out.write("\n                        <a href=\"#?id=");
        out.print((token.getId()+""));
        out.write("\">\n                            ");
        out.print(status);
        out.write("\n                        </a>\n                    </div>\n                </div>\n");
        
                    }
        
        out.write("\n        </div>\n");
        
        
                if (diagramInfo.getIdParentProcessInstance() > 0)  {
                    params = "?idProcessInstance=" + diagramInfo.getIdParentProcessInstance();
        
        out.write("\n            <br/>\n            <input id=\"");
        out.print(htmlElementUniqueID);
        out.write("\" type=\"button\" value=\"Ver proceso padre\" class=\"uppercase\" path=\"\" onclick=\"javascript:showDiv");
        out.print(htmlElementUniqueID);
        out.write("();\"/>\n            <div id=\"div");
        out.print(htmlElementUniqueID);
        out.write("\" class=\"popup\">\n                <table border=\"0\" width=\"250\" bgcolor=\"#3C3C3C\" cellspacing=\"0\" cellpadding=\"5\">\n                    <tr>\n                        <td width=\"100%\">\n                            <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" height=\"36\">\n                                <tr>\n                                    <td style=\"cursor:move\" width=\"100%\" onmousedown=\"javascript:comienzoMovimiento(event, 'div");
        out.print(htmlElementUniqueID);
        out.write("');\">\n                                        <font color=#ffffff size=2 face=arial  style=\"text-decoration:none\" >");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setCode("Imagen del proceso");
          __jsp_taghandler_4.setText("Imagen del proceso");
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
        out.write("</font>\n                                    </td>\n                                    <td style=\"cursor:hand\" valign=\"top\" align=\"right\">\n                                        <a href=\"#\" onClick=\"closeDiv");
        out.print(htmlElementUniqueID);
        out.write("();return false\"><font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">X</font></a>\n                                    </td>\n                                </tr>\n                                <tr>\n                                    <td width=\"100%\" bgcolor=\"#FFFFFF\" style=\"padding:4px\" colspan=\"2\">\n                                        <iframe style=\"height:");
        out.print(parentHeight);
        out.write("px;width:");
        out.print(parentWidth);
        out.write("px;border-style:none;\" src=\"\" name=\"frame");
        out.print(htmlElementUniqueID);
        out.write("\" id=\"frame");
        out.print(htmlElementUniqueID);
        out.write("\">\n                                        </iframe>\n                                    </td>\n                                </tr>\n                            </table> \n                        </td>\n                    </tr>\n                </table>\n            </div>\n");
        
                }
                
            } else {
        
        out.write("\n        No diagram info has been found. Please ensure you call proper bpm service method from controller that dispatched this page.\n");
        
            }
        
        out.write("\n<script type=\"text/javascript\" >\n    function showDiv");
        out.print(htmlElementUniqueID);
        out.write("() {\n        if (document.getElementById(\"div");
        out.print(htmlElementUniqueID);
        out.write("\").style.visibility == \"visible\"){\n            document.getElementById('div");
        out.print(htmlElementUniqueID);
        out.write("').style.visibility=\"hidden\";\n        } else {\n            centerInScreen(document.getElementById(\"div");
        out.print(htmlElementUniqueID);
        out.write("\"), '");
        out.print(leftPosition);
        out.write("', '");
        out.print(topPosition);
        out.write("');\n            var frame = document.getElementById(\"frame");
        out.print(htmlElementUniqueID);
        out.write("\");\n            \n            frame.src=\"");
        out.print(uri+params);
        out.write("\";\n            document.getElementById('div");
        out.print(htmlElementUniqueID);
        out.write("').style.visibility = \"visible\";\n        }\n    }\n    \n    function closeDiv");
        out.print(htmlElementUniqueID);
        out.write("() {                                \n        var onCloseFunction = \"\";\n        if(onCloseFunction.length>0) {            \n            window.parent.eval(onCloseFunction);            \n        }\n        document.getElementById('div");
        out.print(htmlElementUniqueID);
        out.write("').style.visibility=\"hidden\";\n        document.getElementById('frame");
        out.print(htmlElementUniqueID);
        out.write("').src=\"\";\n    }\n    carga();\n</script>\n");
        
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
        new TagAttributeInfo("url",false,"java.lang.String",true,false),
        new TagAttributeInfo("parentWidth",false,"java.lang.String",true,false),
        new TagAttributeInfo("parentHeight",false,"java.lang.String",true,false),
        new TagAttributeInfo("leftPosition",false,"java.lang.String",true,false),
        new TagAttributeInfo("topPosition",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("processImage","_oracle._jsp._tag._processImage_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
