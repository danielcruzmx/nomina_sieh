package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.jcr.query.JcrCondition;
import gob.shcp.fsn.service.ServiceException;
import java.util.ArrayList;


public class _jcrFilter_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String propertyName;
  private java.lang.Object value;
  private java.lang.String propertyPath;
  private java.lang.String valuePath;
  private java.lang.String operator;

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

  public void setPropertyName(java.lang.String propertyName)
  {
    this.propertyName = propertyName;
  }

  public java.lang.String getPropertyName()
  {
    return this.propertyName;
  }

  public void setValue(java.lang.Object value)
  {
    this.value = value;
  }

  public java.lang.Object getValue()
  {
    return this.value;
  }

  public void setPropertyPath(java.lang.String propertyPath)
  {
    this.propertyPath = propertyPath;
  }

  public java.lang.String getPropertyPath()
  {
    return this.propertyPath;
  }

  public void setValuePath(java.lang.String valuePath)
  {
    this.valuePath = valuePath;
  }

  public java.lang.String getValuePath()
  {
    return this.valuePath;
  }

  public void setOperator(java.lang.String operator)
  {
    this.operator = operator;
  }

  public java.lang.String getOperator()
  {
    return this.operator;
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
        pageContext.setAttribute("propertyName", getPropertyName());
        pageContext.setAttribute("value", getValue());
        pageContext.setAttribute("propertyPath", getPropertyPath());
        pageContext.setAttribute("valuePath", getValuePath());
        pageContext.setAttribute("operator", getOperator());


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
        
        
            try{
                operator = operator.toUpperCase();
                    if("=".equals(operator)){
                        operator= JcrCondition.OPERATOR_EQUALS;
                    }else if( "!=".equals(operator)){
                        operator= JcrCondition.OPERATOR_NOT_EQUALS;
                    }else if( "<".equals(operator)){
                        operator= JcrCondition.OPERATOR_LESS_THAN;
                    }else if( "<=".equals(operator)){
                        operator= JcrCondition.OPERATOR_LESS_THAN_OR_EQUALS;
                    }else if( ">".equals(operator)){
                        operator= JcrCondition.OPERATOR_GREATER_THAN;
                    }else if( ">=".equals(operator)){
                        operator= JcrCondition.OPERATOR_GREATER_THAN_OR_EQUALS;
                    }else if( "LIKE".equalsIgnoreCase(operator)){
                        operator= JcrCondition.OPERATOR_LIKE;
                    }else{
                        throw new ServiceException("Unsupported operator "+operator);
                    }
                if (pageContext.getAttribute("jcr-conditions", PageContext.REQUEST_SCOPE )==null ){
                    pageContext.setAttribute("jcr-conditions" , new ArrayList(), PageContext.REQUEST_SCOPE );
                }
                
                if(propertyName==null){
                    pageContext.setAttribute("propertyPath", propertyPath, PageContext.PAGE_SCOPE);
        
        out.write("\n            ");
        {
          org.springframework.web.servlet.tags.BindTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${propertyPath}",java.lang.String.class, __ojsp_varRes,null));
          org.springframework.web.servlet.support.BindStatus status = null;
          try {
            __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
                out.write("\n                ");
                {
                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                  __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                  __jsp_taghandler_2.setVar("requestValue");
                  __jsp_taghandler_2.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.value}",java.lang.Object.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                  if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
                }
                out.write("\n            ");
              } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
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
        
                    String obj =(String)pageContext.getAttribute("requestValue");
                    if (obj!=null){
                        propertyName = obj;
                    }
                }
        
                
                
                if(value==null){
                    pageContext.setAttribute("valuePath", valuePath, PageContext.PAGE_SCOPE);
        
        out.write("\n            ");
        {
          org.springframework.web.servlet.tags.BindTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${valuePath}",java.lang.String.class, __ojsp_varRes,null));
          org.springframework.web.servlet.support.BindStatus status = null;
          try {
            __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
                out.write("\n                ");
                {
                  org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                  __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                  __jsp_taghandler_4.setVar("requestValue");
                  __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.value}",java.lang.Object.class, __ojsp_varRes,null));
                  __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                  if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
                }
                out.write("\n            ");
              } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            }
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
        
                    Object obj =pageContext.getAttribute("requestValue");
                    if (obj!=null){
                        value = obj;
                    }
                }
                if (value!=null && !value.equals("")){
                    JcrCondition condition = new JcrCondition();
                    condition.field(propertyName).value(value).setOperator(operator);
                    ((ArrayList)pageContext.getAttribute("jcr-conditions", PageContext.REQUEST_SCOPE )).add(condition);
                }
            }catch(Exception e){
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
        new TagAttributeInfo("propertyName",false,"java.lang.String",true,false),
        new TagAttributeInfo("value",false,"java.lang.Object",true,false),
        new TagAttributeInfo("propertyPath",false,"java.lang.String",true,false),
        new TagAttributeInfo("valuePath",false,"java.lang.String",true,false),
        new TagAttributeInfo("operator",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("jcrFilter","_oracle._jsp._tag._jcrFilter_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
