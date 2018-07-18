package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import gob.shcp.fsn.control.view.util.TagUtils;
import gob.shcp.bpm.model.support.BpmTaskDTO;
import gob.shcp.bpm.service.TaskInstanceService;
import org.springframework.util.ClassUtils;
import gob.shcp.fsn.control.binder.ControllerWebBindingInitializer;


public class _completeTask_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String releaseAlertCode;
  private java.lang.String transitionsAlertCode;
  private java.lang.String showReleaseFirst;
  private java.lang.String onlyTrackParams;
  private java.lang.String uppercase;
  private java.lang.String commentLabel;
  private java.lang.String maxSizeLabel;

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

  public void setReleaseAlertCode(java.lang.String releaseAlertCode)
  {
    this.releaseAlertCode = releaseAlertCode;
  }

  public java.lang.String getReleaseAlertCode()
  {
    return this.releaseAlertCode;
  }

  public void setTransitionsAlertCode(java.lang.String transitionsAlertCode)
  {
    this.transitionsAlertCode = transitionsAlertCode;
  }

  public java.lang.String getTransitionsAlertCode()
  {
    return this.transitionsAlertCode;
  }

  public void setShowReleaseFirst(java.lang.String showReleaseFirst)
  {
    this.showReleaseFirst = showReleaseFirst;
  }

  public java.lang.String getShowReleaseFirst()
  {
    return this.showReleaseFirst;
  }

  public void setOnlyTrackParams(java.lang.String onlyTrackParams)
  {
    this.onlyTrackParams = onlyTrackParams;
  }

  public java.lang.String getOnlyTrackParams()
  {
    return this.onlyTrackParams;
  }

  public void setUppercase(java.lang.String uppercase)
  {
    this.uppercase = uppercase;
  }

  public java.lang.String getUppercase()
  {
    return this.uppercase;
  }

  public void setCommentLabel(java.lang.String commentLabel)
  {
    this.commentLabel = commentLabel;
  }

  public java.lang.String getCommentLabel()
  {
    return this.commentLabel;
  }

  public void setMaxSizeLabel(java.lang.String maxSizeLabel)
  {
    this.maxSizeLabel = maxSizeLabel;
  }

  public java.lang.String getMaxSizeLabel()
  {
    return this.maxSizeLabel;
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
        pageContext.setAttribute("releaseAlertCode", getReleaseAlertCode());
        pageContext.setAttribute("transitionsAlertCode", getTransitionsAlertCode());
        pageContext.setAttribute("showReleaseFirst", getShowReleaseFirst());
        pageContext.setAttribute("onlyTrackParams", getOnlyTrackParams());
        pageContext.setAttribute("uppercase", getUppercase());
        pageContext.setAttribute("commentLabel", getCommentLabel());
        pageContext.setAttribute("maxSizeLabel", getMaxSizeLabel());


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
        out.write(" \n\n");
        out.write("\n");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write("  ");
        out.write("\n");
        out.write("        ");
        out.write("\n");
        out.write("     ");
        out.write("\n");
        out.write("     ");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n<input type=\"hidden\" name=\"idTaskInstance\" value=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${bpmTask.idTaskInstance}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\"/>\n<input type=\"hidden\" name=\"idProcessInstance\" value=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${bpmTask.idProcessInstance}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\"/>\n<input type=\"hidden\" name=\"taskController\" value=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${bpmTask.taskController}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
        }
        out.write("\"/>\n\n\n");
        
        try {
            commentLabel = commentLabel==null ? "comment.label" : commentLabel;
            maxSizeLabel = maxSizeLabel==null ? "comment.size.label" : maxSizeLabel;
        
            boolean isTrackParams = Boolean.valueOf(onlyTrackParams);
            if(!isTrackParams) {
                boolean isReleaseFirst = Boolean.valueOf(showReleaseFirst);
                BpmTaskDTO taskDTO = (BpmTaskDTO)request.getAttribute("bpmTask");
                List transitions = ((TaskInstanceService)TagUtils.getService(pageContext, (Class)ClassUtils.forName("gob.shcp.bpm.service.TaskInstanceService"))).getTaskAvailableTransitions(taskDTO.getIdTaskInstance());
        
                boolean isUppercased = Boolean.valueOf(uppercase);
                String commentCssClass = isUppercased ? "uppercase" : "";
                if(isUppercased) {
        
        out.write("\n            <input type=\"hidden\" name=\"");
        out.print(ControllerWebBindingInitializer.UPPER_CASE_PREFIX);
        out.write("taskComment\" value=\"true\"/>\n");
        
                }
        
        out.write("\n        <table>\n            <tr>\n                <td valign=\"bottom\">");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setCode(OracleJspRuntime.toStr( commentLabel));
          __jsp_taghandler_4.setText(OracleJspRuntime.toStr( commentLabel));
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
        out.write("</td>\n                <td rowspan=\"2\"><textarea name=\"taskComment\" cols=\"60\" rows=\"5\" onkeyup=\"validateTextAreaLength(this, 4000);\" class=\"");
        out.print(commentCssClass);
        out.write("\"></textarea></td>\n            </tr>\n            <tr>\n                <td valign=\"top\" align=\"center\">");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text");
          __jsp_taghandler_5.setParent(null);
          __jsp_taghandler_5.setCode(OracleJspRuntime.toStr( maxSizeLabel));
          __jsp_taghandler_5.setText(OracleJspRuntime.toStr( maxSizeLabel));
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
        out.write("</td>                \n            </tr>\n        </table>\n        <table>\n            <tr>\n");
        
                    String controller = TagUtils.formatUrl(taskDTO.getTaskController());
        
                    //Release button first
                    if(transitions.size() > 0 && isReleaseFirst) {
                        String action = controller + "?transitionName=unlockTask";
        
        out.write("\n                ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_6.setParent(null);
          __jsp_taghandler_6.setVar("_action");
          __jsp_taghandler_6.setScope("page");
          __jsp_taghandler_6.setValue(OracleJspRuntime.toStr( action));
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
        }
        out.write("\n");
        
                        action = (String)pageContext.getAttribute("_action", PageContext.PAGE_SCOPE);
                        Integer htmlElementUniqueID = TagUtils.getHtmlUniqueId(pageContext);
                        String onclick = "return doSubmit("+ htmlElementUniqueID +");";
                        String progressType = "icon";
                        String cssClass = "uppercase";
                        String value = "submit.releaseTask";
        
        out.write("\n                <td>\n                    ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text var");
          __jsp_taghandler_7.setParent(null);
          __jsp_taghandler_7.setCode(OracleJspRuntime.toStr( value));
          __jsp_taghandler_7.setText(OracleJspRuntime.toStr( value));
          __jsp_taghandler_7.setVar("value");
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
        out.write("\n");
        
                        String alertReleaseFirstMsg = null;
                        if(releaseAlertCode != null && !"".equals(releaseAlertCode)) {
        
        out.write("\n                    ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments text var scope");
          __jsp_taghandler_8.setParent(null);
          __jsp_taghandler_8.setCode(OracleJspRuntime.toStr( releaseAlertCode));
          __jsp_taghandler_8.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_taghandler_8.setText(OracleJspRuntime.toStr( releaseAlertCode));
          __jsp_taghandler_8.setVar("_releaseAlertCode");
          __jsp_taghandler_8.setScope("page");
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
        out.write("\n");
        
                             alertReleaseFirstMsg = (String)pageContext.getAttribute("_releaseAlertCode", PageContext.PAGE_SCOPE);
                        }
                        alertReleaseFirstMsg = alertReleaseFirstMsg != null ? alertReleaseFirstMsg : "";
        
        out.write("                \n                    <input id=\"");
        out.print(htmlElementUniqueID);
        out.write("\" type=\"submit\" value=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_9.setParent(null);
          __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
        }
        out.write("\" class=\"");
        out.print(cssClass);
        out.write("\" onclick=\"");
        out.print(onclick);
        out.write("\" progressType=\"");
        out.print(progressType);
        out.write("\" action=\"");
        out.print(action);
        out.write("\" path=\"\" alertCode=\"");
        out.print(alertReleaseFirstMsg);
        out.write("\"/>\n                </td>\n");
        
                    }
        
                    //Transition buttons
                    for (final Iterator iter = transitions.iterator(); iter.hasNext();) {
                        String transition = (String)iter.next();
                        String action = controller + "?transitionName="+transition;
        
        out.write("\n                ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_10.setParent(null);
          __jsp_taghandler_10.setVar("_action");
          __jsp_taghandler_10.setScope("page");
          __jsp_taghandler_10.setValue(OracleJspRuntime.toStr( action));
          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
        }
        out.write("\n");
        
                        action = (String)pageContext.getAttribute("_action", PageContext.PAGE_SCOPE);
        
        out.write("\n                <td>\n");
        
                        Integer htmlElementUniqueID = TagUtils.getHtmlUniqueId(pageContext);
                        String onclick = "return doSubmit("+ htmlElementUniqueID +");";
                        String progressType = "icon";
                        String cssClass = "uppercase";
        
        out.write("\n                    ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text var");
          __jsp_taghandler_11.setParent(null);
          __jsp_taghandler_11.setCode(OracleJspRuntime.toStr( transition));
          __jsp_taghandler_11.setText(OracleJspRuntime.toStr( transition));
          __jsp_taghandler_11.setVar("value");
          try {
            __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
            if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_11.doCatch(th);
          } finally {
            __jsp_taghandler_11.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
        }
        out.write("\n");
        
                        String alertTransitionMsg = null;
                        if(transitionsAlertCode != null && !"".equals(transitionsAlertCode)) {
                            String[] alertsArray  = transitionsAlertCode.trim().split(",");
                            final Map alertsMap = new HashMap();
                            for(String alert:alertsArray){
                                final String[] alertArray = alert.split("-");
                                alertsMap.put(alertArray[0],alertArray[1]);
                            }
                            if(alertsMap.containsKey(transition)){
        
        out.write("                  \n                        ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments text var scope");
          __jsp_taghandler_12.setParent(null);
          __jsp_taghandler_12.setCode(OracleJspRuntime.toStr( alertsMap.get(transition)));
          __jsp_taghandler_12.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_taghandler_12.setText(OracleJspRuntime.toStr( alertsMap.get(transition)));
          __jsp_taghandler_12.setVar("_alertCode");
          __jsp_taghandler_12.setScope("page");
          try {
            __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
            if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_12.doCatch(th);
          } finally {
            __jsp_taghandler_12.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
        }
        out.write("\n");
        
                                alertTransitionMsg = (String)pageContext.getAttribute("_alertCode", PageContext.PAGE_SCOPE);
                            }
                        }
                        alertTransitionMsg = alertTransitionMsg != null ? alertTransitionMsg : "";
        
        out.write("                \n                    <input id=\"");
        out.print(htmlElementUniqueID);
        out.write("\" type=\"submit\" value=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_13.setParent(null);
          __jsp_taghandler_13.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
          if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,1);
        }
        out.write("\" class=\"");
        out.print(cssClass);
        out.write("\" onclick=\"");
        out.print(onclick);
        out.write("\" progressType=\"");
        out.print(progressType);
        out.write("\" action=\"");
        out.print(action);
        out.write("\" path=\"\" alertCode=\"");
        out.print(alertTransitionMsg);
        out.write("\"/>\n                </td>\n");
        
                    }
        
                    //Release button last
                    if(transitions.size() > 0 && !isReleaseFirst) {
                        String action = controller + "?transitionName=unlockTask";
        
        out.write("\n                ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
          __jsp_taghandler_14.setParent(null);
          __jsp_taghandler_14.setVar("_action");
          __jsp_taghandler_14.setScope("page");
          __jsp_taghandler_14.setValue(OracleJspRuntime.toStr( action));
          __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
          if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
        }
        out.write("\n");
        
                        action = (String)pageContext.getAttribute("_action", PageContext.PAGE_SCOPE);
                        Integer htmlElementUniqueID = TagUtils.getHtmlUniqueId(pageContext);
                        String onclick = "return doSubmit("+ htmlElementUniqueID +");";
                        String progressType = "icon";
                        String cssClass = "uppercase";
                        String value = "submit.releaseTask";
        
        out.write("\n                <td>\n                    ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text var");
          __jsp_taghandler_15.setParent(null);
          __jsp_taghandler_15.setCode(OracleJspRuntime.toStr( value));
          __jsp_taghandler_15.setText(OracleJspRuntime.toStr( value));
          __jsp_taghandler_15.setVar("value");
          try {
            __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
            if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_15.doCatch(th);
          } finally {
            __jsp_taghandler_15.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,1);
        }
        out.write("\n");
        
                        String alertReleaseMsg = null;
                        if(releaseAlertCode != null && !"".equals(releaseAlertCode)) {
        
        out.write("\n                    ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments text var scope");
          __jsp_taghandler_16.setParent(null);
          __jsp_taghandler_16.setCode(OracleJspRuntime.toStr( releaseAlertCode));
          __jsp_taghandler_16.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_taghandler_16.setText(OracleJspRuntime.toStr( releaseAlertCode));
          __jsp_taghandler_16.setVar("_releaseAlertCode");
          __jsp_taghandler_16.setScope("page");
          try {
            __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
            if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_16.doCatch(th);
          } finally {
            __jsp_taghandler_16.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,1);
        }
        out.write("\n");
        
                            alertReleaseMsg = (String)pageContext.getAttribute("_releaseAlertCode", PageContext.PAGE_SCOPE);
                        }
                        alertReleaseMsg = alertReleaseMsg != null ? alertReleaseMsg : "";
        
        out.write("                 \n                    <input id=\"");
        out.print(htmlElementUniqueID);
        out.write("\" type=\"submit\" value=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_17.setParent(null);
          __jsp_taghandler_17.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,1);
        }
        out.write("\" class=\"");
        out.print(cssClass);
        out.write("\" onclick=\"");
        out.print(onclick);
        out.write("\" progressType=\"");
        out.print(progressType);
        out.write("\" action=\"");
        out.print(action);
        out.write("\" path=\"\" alertCode=\"");
        out.print(alertReleaseMsg);
        out.write("\"/>\n                </td>\n");
        
                    }
        
        out.write("            \n            </tr>\n        </table>\n");
        
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
        new TagAttributeInfo("releaseAlertCode",false,"java.lang.String",true,false),
        new TagAttributeInfo("transitionsAlertCode",false,"java.lang.String",true,false),
        new TagAttributeInfo("showReleaseFirst",false,"java.lang.String",true,false),
        new TagAttributeInfo("onlyTrackParams",false,"java.lang.String",true,false),
        new TagAttributeInfo("uppercase",false,"java.lang.String",true,false),
        new TagAttributeInfo("commentLabel",false,"java.lang.String",true,false),
        new TagAttributeInfo("maxSizeLabel",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("completeTask","_oracle._jsp._tag._completeTask_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
