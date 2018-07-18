package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import java.util.Properties;
import gob.shcp.fsn.model.support.FilterDTO;
import gob.shcp.fsn.control.view.util.TagUtils;
import gob.shcp.fsn.service.support.DynaContentService;


public class _filter_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String property;
  private java.lang.String condition;
  private java.lang.String path;
  private java.lang.Object value;
  private java.lang.String type;
  private java.lang.String id;

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

  public void setProperty(java.lang.String property)
  {
    this.property = property;
  }

  public java.lang.String getProperty()
  {
    return this.property;
  }

  public void setCondition(java.lang.String condition)
  {
    this.condition = condition;
  }

  public java.lang.String getCondition()
  {
    return this.condition;
  }

  public void setPath(java.lang.String path)
  {
    this.path = path;
  }

  public java.lang.String getPath()
  {
    return this.path;
  }

  public void setValue(java.lang.Object value)
  {
    this.value = value;
  }

  public java.lang.Object getValue()
  {
    return this.value;
  }

  public void setType(java.lang.String type)
  {
    this.type = type;
  }

  public java.lang.String getType()
  {
    return this.type;
  }

  public void setId(java.lang.String id)
  {
    this.id = id;
  }

  public java.lang.String getId()
  {
    return this.id;
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
        pageContext.setAttribute("property", getProperty());
        pageContext.setAttribute("condition", getCondition());
        pageContext.setAttribute("path", getPath());
        pageContext.setAttribute("value", getValue());
        pageContext.setAttribute("type", getType());
        pageContext.setAttribute("id", getId());


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n\n");
        
            try{
                if (id==null || "".equals(id) ){
                    id = DynaContentService.PAGED_LIST_FILTER;
                }
                /* Se genera la instancia del contenedor de filtros y se coloca en el pageContext */
                if (pageContext.getAttribute(id, PageContext.REQUEST_SCOPE )==null ){
                    pageContext.setAttribute(id , new FilterDTO(), PageContext.REQUEST_SCOPE );
                }    
                
                /* Se genera la instancia del contenedor de columnas de negocio y se coloca en el pageContext*/
                if (pageContext.getAttribute(TagUtils.BUSINESS_COLUMNS_TYPES, PageContext.REQUEST_SCOPE )==null ){
                    pageContext.setAttribute(TagUtils.BUSINESS_COLUMNS_TYPES , new Properties(), PageContext.REQUEST_SCOPE );
                } 
                
                if(value==null){
                    if(path==null) {path = property; }
                    pageContext.setAttribute("path", path, PageContext.PAGE_SCOPE);
        
        out.write("\n            ");
        {
          org.springframework.web.servlet.tags.BindTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${path}",java.lang.String.class, __ojsp_varRes,null));
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
        
                    Object obj =pageContext.getAttribute("requestValue");
                    if (obj!=null){
                        value = obj;
                    }
                }
                if (value!=null && !value.equals("")){
                    ((FilterDTO)pageContext.getAttribute(id, PageContext.REQUEST_SCOPE )).addFilter(property, condition, value);
                }
                
                if (type!=null && !type.equals("")){
                    ((Properties)pageContext.getAttribute(TagUtils.BUSINESS_COLUMNS_TYPES, PageContext.REQUEST_SCOPE )).put(property, type);
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
        new TagAttributeInfo("property",true,"java.lang.String",true,false),
        new TagAttributeInfo("condition",false,"java.lang.String",true,false),
        new TagAttributeInfo("path",false,"java.lang.String",true,false),
        new TagAttributeInfo("value",false,"java.lang.Object",true,false),
        new TagAttributeInfo("type",false,"java.lang.String",true,false),
        new TagAttributeInfo("id",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("filter","_oracle._jsp._tag._filter_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
