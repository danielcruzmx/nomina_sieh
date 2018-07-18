package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.bpm.model.support.BpmProcessDTO;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _resumeProcess_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String alertCode;
  private java.lang.String resumeUrl;

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

  public void setAlertCode(java.lang.String alertCode)
  {
    this.alertCode = alertCode;
  }

  public java.lang.String getAlertCode()
  {
    return this.alertCode;
  }

  public void setResumeUrl(java.lang.String resumeUrl)
  {
    this.resumeUrl = resumeUrl;
  }

  public java.lang.String getResumeUrl()
  {
    return this.resumeUrl;
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
        pageContext.setAttribute("alertCode", getAlertCode());
        pageContext.setAttribute("resumeUrl", getResumeUrl());


        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n\n");
        
            try{
        
        out.write("\n\n<table>\n    <tr>\n");
        
                if(alertCode != null && !"".equals(alertCode)) {
        
        out.write("\n            ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text var scope");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setCode(OracleJspRuntime.toStr( alertCode));
          __jsp_taghandler_1.setText(OracleJspRuntime.toStr( alertCode));
          __jsp_taghandler_1.setVar("_alertCode");
          __jsp_taghandler_1.setScope("page");
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
        out.write("\n");
        
                    alertCode = (String)pageContext.getAttribute("_alertCode", PageContext.PAGE_SCOPE);
                }
                    alertCode = alertCode != null ? alertCode : "";
                    BpmProcessDTO bpmProcess = (BpmProcessDTO)request.getAttribute("bpmProcess");
                    long idProcess = bpmProcess.getIdProcessInstance();
                    String controller = TagUtils.formatUrl(resumeUrl);
                    String action = controller+ "?idProcessInstance=" + idProcess;
        
        out.write("\n            ");
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
        out.write("\n");
        
                    action = (String)pageContext.getAttribute("_action", PageContext.PAGE_SCOPE);
                    Integer htmlElementUniqueID = TagUtils.getHtmlUniqueId(pageContext);
                    String onclick = "return doSubmit("+ htmlElementUniqueID +");";
                    String progressType = "icon";
                    String cssClass = "uppercase";
                    String value = "submit.resumeProcess";
                
        
        
        out.write("\n        <td align=\"center\">\n            ");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text var");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setCode(OracleJspRuntime.toStr( value));
          __jsp_taghandler_3.setText(OracleJspRuntime.toStr( value));
          __jsp_taghandler_3.setVar("value");
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
        out.write("\n            <input id=\"");
        out.print(htmlElementUniqueID);
        out.write("\" type=\"submit\" value=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_4.setParent(null);
          __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${value}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
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
        out.print(alertCode);
        out.write("\"/>\n        </td>\n    </tr>\n</table>\n\n");
        
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
        new TagAttributeInfo("alertCode",false,"java.lang.String",true,false),
        new TagAttributeInfo("resumeUrl",true,"java.lang.String",true,false)};

      tagInfo = new TagInfo("resumeProcess","_oracle._jsp._tag._resumeProcess_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
