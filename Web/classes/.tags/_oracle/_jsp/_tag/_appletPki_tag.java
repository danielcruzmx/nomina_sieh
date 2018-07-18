package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;


public class _appletPki_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String opcType;
  private java.lang.String isFile;
  private java.lang.String showRfc;
  private java.lang.String showCurp;
  private java.lang.String skipAlert;
  private java.lang.String forSubjectRcpt;
  private java.lang.String saveToFile;
  private java.lang.String appletUrl;
  private java.lang.String isMultipleContent;
  private java.lang.String javaArgs;

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

  public void setOpcType(java.lang.String opcType)
  {
    this.opcType = opcType;
  }

  public java.lang.String getOpcType()
  {
    return this.opcType;
  }

  public void setIsFile(java.lang.String isFile)
  {
    this.isFile = isFile;
  }

  public java.lang.String getIsFile()
  {
    return this.isFile;
  }

  public void setShowRfc(java.lang.String showRfc)
  {
    this.showRfc = showRfc;
  }

  public java.lang.String getShowRfc()
  {
    return this.showRfc;
  }

  public void setShowCurp(java.lang.String showCurp)
  {
    this.showCurp = showCurp;
  }

  public java.lang.String getShowCurp()
  {
    return this.showCurp;
  }

  public void setSkipAlert(java.lang.String skipAlert)
  {
    this.skipAlert = skipAlert;
  }

  public java.lang.String getSkipAlert()
  {
    return this.skipAlert;
  }

  public void setForSubjectRcpt(java.lang.String forSubjectRcpt)
  {
    this.forSubjectRcpt = forSubjectRcpt;
  }

  public java.lang.String getForSubjectRcpt()
  {
    return this.forSubjectRcpt;
  }

  public void setSaveToFile(java.lang.String saveToFile)
  {
    this.saveToFile = saveToFile;
  }

  public java.lang.String getSaveToFile()
  {
    return this.saveToFile;
  }

  public void setAppletUrl(java.lang.String appletUrl)
  {
    this.appletUrl = appletUrl;
  }

  public java.lang.String getAppletUrl()
  {
    return this.appletUrl;
  }

  public void setIsMultipleContent(java.lang.String isMultipleContent)
  {
    this.isMultipleContent = isMultipleContent;
  }

  public java.lang.String getIsMultipleContent()
  {
    return this.isMultipleContent;
  }

  public void setJavaArgs(java.lang.String javaArgs)
  {
    this.javaArgs = javaArgs;
  }

  public java.lang.String getJavaArgs()
  {
    return this.javaArgs;
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
        pageContext.setAttribute("opcType", getOpcType());
        pageContext.setAttribute("isFile", getIsFile());
        pageContext.setAttribute("showRfc", getShowRfc());
        pageContext.setAttribute("showCurp", getShowCurp());
        pageContext.setAttribute("skipAlert", getSkipAlert());
        pageContext.setAttribute("forSubjectRcpt", getForSubjectRcpt());
        pageContext.setAttribute("saveToFile", getSaveToFile());
        pageContext.setAttribute("appletUrl", getAppletUrl());
        pageContext.setAttribute("isMultipleContent", getIsMultipleContent());
        pageContext.setAttribute("javaArgs", getJavaArgs());


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
        
            opcType = opcType != null ? opcType : "0";
            isFile = isFile != null ? isFile : "false";
            showRfc = showRfc != null ? showRfc : "false";
            showCurp = showCurp != null ? showCurp : "false";
            skipAlert = skipAlert != null ? skipAlert : "false";
            forSubjectRcpt = forSubjectRcpt != null ? forSubjectRcpt : "false";
            saveToFile = saveToFile != null ? saveToFile : "false";
            isMultipleContent = isMultipleContent != null ? isMultipleContent : "false";
        
        out.write("\n<script type=\"text/javascript\" src=\"");
        out.print(appletUrl);
        out.write("/js/pki/pki-applet.js\"></script>\n\n<table align=\"center\">\n    <tr>\n        <td>\n<script type=\"text/javascript\"> \n\n    var params = new Array(8);\n            params[0] = \"opcType\";\n            params[1] = \"isFile\";\n            params[2] = \"showRfc\";\n            params[3] = \"skipAlert\";\n            params[4] = \"forSubjectRcpt\";\n            params[5] = \"saveToFile\";\n            params[6] = \"showCurp\";\n            params[7] = \"isMultipleContent\";\n    var values = new Array(8);\n            values[0] = \"");
        out.print(opcType);
        out.write("\";\n            values[1] = \"");
        out.print(isFile);
        out.write("\";\n            values[2] = \"");
        out.print(showRfc);
        out.write("\";\n            values[3] = \"");
        out.print(skipAlert);
        out.write("\";\n            values[4] = \"");
        out.print(forSubjectRcpt);
        out.write("\";\n            values[5] = \"");
        out.print(saveToFile);
        out.write("\";\n            values[6] = \"");
        out.print(showCurp);
        out.write("\";\n            values[7] = \"");
        out.print(isMultipleContent);
        out.write("\";\n\n    var appletTags = getDefaultAppletTag(\"PKI\", \"");
        out.print(appletUrl);
        out.write("\", 620, 500, params, values, \"");
        out.print(javaArgs);
        out.write("\");\n    document.writeln(\"<br/>\" + appletTags);    \n    \n</script>\n        </td>\n    </tr>\n</table>\n");
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
        new TagAttributeInfo("opcType",false,"java.lang.String",true,false),
        new TagAttributeInfo("isFile",false,"java.lang.String",true,false),
        new TagAttributeInfo("showRfc",false,"java.lang.String",true,false),
        new TagAttributeInfo("showCurp",false,"java.lang.String",true,false),
        new TagAttributeInfo("skipAlert",false,"java.lang.String",true,false),
        new TagAttributeInfo("forSubjectRcpt",false,"java.lang.String",true,false),
        new TagAttributeInfo("saveToFile",false,"java.lang.String",true,false),
        new TagAttributeInfo("appletUrl",true,"java.lang.String",true,false),
        new TagAttributeInfo("isMultipleContent",false,"java.lang.String",true,false),
        new TagAttributeInfo("javaArgs",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("appletPki","_oracle._jsp._tag._appletPki_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
