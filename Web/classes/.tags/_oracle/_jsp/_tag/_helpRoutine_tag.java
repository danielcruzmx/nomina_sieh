package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _helpRoutine_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String beanName;
  private java.lang.String service;
  private java.lang.String path;
  private java.lang.String fieldMapping;
  private java.lang.String fieldMappingDTO;
  private java.lang.String width;
  private java.lang.String leftPosition;
  private java.lang.String height;
  private java.lang.String topPosition;
  private java.lang.String maxlength;
  private java.lang.String disabled;
  private java.lang.String readonly;
  private java.lang.String size;
  private java.lang.String title;
  private java.lang.String uppercase;
  private java.lang.String multiple;
  private java.lang.String parentValues;
  private java.lang.String onClose;
  private java.lang.String decorator;
  private java.lang.String maxRows;
  private java.lang.String orderedColumns;

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

  public void setBeanName(java.lang.String beanName)
  {
    this.beanName = beanName;
  }

  public java.lang.String getBeanName()
  {
    return this.beanName;
  }

  public void setService(java.lang.String service)
  {
    this.service = service;
  }

  public java.lang.String getService()
  {
    return this.service;
  }

  public void setPath(java.lang.String path)
  {
    this.path = path;
  }

  public java.lang.String getPath()
  {
    return this.path;
  }

  public void setFieldMapping(java.lang.String fieldMapping)
  {
    this.fieldMapping = fieldMapping;
  }

  public java.lang.String getFieldMapping()
  {
    return this.fieldMapping;
  }

  public void setFieldMappingDTO(java.lang.String fieldMappingDTO)
  {
    this.fieldMappingDTO = fieldMappingDTO;
  }

  public java.lang.String getFieldMappingDTO()
  {
    return this.fieldMappingDTO;
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

  public void setMaxlength(java.lang.String maxlength)
  {
    this.maxlength = maxlength;
  }

  public java.lang.String getMaxlength()
  {
    return this.maxlength;
  }

  public void setDisabled(java.lang.String disabled)
  {
    this.disabled = disabled;
  }

  public java.lang.String getDisabled()
  {
    return this.disabled;
  }

  public void setReadonly(java.lang.String readonly)
  {
    this.readonly = readonly;
  }

  public java.lang.String getReadonly()
  {
    return this.readonly;
  }

  public void setSize(java.lang.String size)
  {
    this.size = size;
  }

  public java.lang.String getSize()
  {
    return this.size;
  }

  public void setTitle(java.lang.String title)
  {
    this.title = title;
  }

  public java.lang.String getTitle()
  {
    return this.title;
  }

  public void setUppercase(java.lang.String uppercase)
  {
    this.uppercase = uppercase;
  }

  public java.lang.String getUppercase()
  {
    return this.uppercase;
  }

  public void setMultiple(java.lang.String multiple)
  {
    this.multiple = multiple;
  }

  public java.lang.String getMultiple()
  {
    return this.multiple;
  }

  public void setParentValues(java.lang.String parentValues)
  {
    this.parentValues = parentValues;
  }

  public java.lang.String getParentValues()
  {
    return this.parentValues;
  }

  public void setOnClose(java.lang.String onClose)
  {
    this.onClose = onClose;
  }

  public java.lang.String getOnClose()
  {
    return this.onClose;
  }

  public void setDecorator(java.lang.String decorator)
  {
    this.decorator = decorator;
  }

  public java.lang.String getDecorator()
  {
    return this.decorator;
  }

  public void setMaxRows(java.lang.String maxRows)
  {
    this.maxRows = maxRows;
  }

  public java.lang.String getMaxRows()
  {
    return this.maxRows;
  }

  public void setOrderedColumns(java.lang.String orderedColumns)
  {
    this.orderedColumns = orderedColumns;
  }

  public java.lang.String getOrderedColumns()
  {
    return this.orderedColumns;
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
        pageContext.setAttribute("beanName", getBeanName());
        pageContext.setAttribute("service", getService());
        pageContext.setAttribute("path", getPath());
        pageContext.setAttribute("fieldMapping", getFieldMapping());
        pageContext.setAttribute("fieldMappingDTO", getFieldMappingDTO());
        pageContext.setAttribute("width", getWidth());
        pageContext.setAttribute("leftPosition", getLeftPosition());
        pageContext.setAttribute("height", getHeight());
        pageContext.setAttribute("topPosition", getTopPosition());
        pageContext.setAttribute("maxlength", getMaxlength());
        pageContext.setAttribute("disabled", getDisabled());
        pageContext.setAttribute("readonly", getReadonly());
        pageContext.setAttribute("size", getSize());
        pageContext.setAttribute("title", getTitle());
        pageContext.setAttribute("uppercase", getUppercase());
        pageContext.setAttribute("multiple", getMultiple());
        pageContext.setAttribute("parentValues", getParentValues());
        pageContext.setAttribute("onClose", getOnClose());
        pageContext.setAttribute("decorator", getDecorator());
        pageContext.setAttribute("maxRows", getMaxRows());
        pageContext.setAttribute("orderedColumns", getOrderedColumns());


        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("            <!-- Propiedad del objeto de modelo que mantiene el identificador del registro seleccionado de la helpRoutine -->\n");
        out.write("    <!-- Nombre de las columnas de la helpRoutine cuyos valores se pasaran a los campos (del mismo nombre) en la pagina principal -->\n");
        out.write("\n");
        out.write("                           ");
        out.write("\n");
        out.write("                     ");
        out.write("\n");
        out.write("                           ");
        out.write("\n");
        out.write("                      ");
        out.write("\n");
        out.write("\n");
        out.write("                        <!-- Muestra el campo de texto de solo lectura y la imagen del componente de helpRoutine con la opcion de modificar su valor -->\n");
        out.write("                        <!-- Muestra el campo de texto de solo lectura y la imagen del componente de helpRoutine sin la opcion de modificar su valor -->\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                         <!-- Limita el numero de registros de la consulta, con -1 obtiene todos los registros encontrados -->\n");
        out.write("                  <!-- Nombre de las columnas de la helpRoutine que se mostraran y en que orden -->\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        
        try {
            if((beanName == null || "".equals(beanName)) && (service == null || "".equals(service))) {
                return;
            }
            
            boolean upperCased = true;
            if(uppercase != null && !"".equals(uppercase)) {
                upperCased = Boolean.valueOf(uppercase);
            }
            boolean multipleSelection = false;
            if(multiple != null && !"".equals(multiple)) {
                multipleSelection = Boolean.valueOf(multiple);
            }
            if(fieldMappingDTO == null || "".equals(fieldMappingDTO)) {
                fieldMappingDTO = fieldMapping;
            }
            if(orderedColumns == null || "".equals(orderedColumns)) {
                orderedColumns = fieldMapping;
            }
            maxlength = maxlength==null ? "" : maxlength;
            readonly = Boolean.valueOf(readonly).toString();
            String inputReadonly = String.valueOf(Boolean.valueOf(readonly) || Boolean.valueOf(disabled));
            size = size==null ? "" : size;
            String cssClass = upperCased ? "uppercase" : "";
            title = title==null ? "helpRoutine.title" : title;
            width = width==null ? "450" : width;
            height = height==null ? "320" : height;
            leftPosition  = leftPosition==null  ? "30" : leftPosition;
            topPosition = topPosition==null ? "25" : topPosition;
            String dataSourceName = "";
            String dataSourceType = "";
            if(beanName!= null && !"".equals(beanName)) {
                dataSourceName = beanName;
                dataSourceType = "beanName";
            } else if(service!= null && !"".equals(service)) {
                dataSourceName = service;
                dataSourceType = "service";
            }
            decorator = decorator==null ? "gob.shcp.fsn.control.view.decorator.HelpTableDecorator" : decorator;
            maxRows = maxRows==null ? "-1" : maxRows;
        
            String pathName = path.replace("[", "").replace("]", "");
            String closeFunction = "closeDiv" + pathName + "()";
        
        out.write("\n\n");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var value");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setVar("contextPath");
          __jsp_taghandler_1.setValue("/");
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\n<!-- Muestra el campo (texto o hidden) donde se recibe uno de los valores de la columna de la helpRoutine para el registro seleccionado -->\n");
        {
          org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
          __jsp_taghandler_2.setParent(null);
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n    ");
              {
                org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${multiple == true}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n        ");
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                      __jsp_taghandler_4.setPath(OracleJspRuntime.toStr( path));
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                      } catch (Throwable th) {
                        __jsp_taghandler_4.doCatch(th);
                      } finally {
                        __jsp_taghandler_4.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                    }
                    out.write("\n    ");
                  } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write("\n    ");
              {
                org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n        ");
                    {
                      org.springframework.web.servlet.tags.form.InputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.InputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.InputTag.class,"org.springframework.web.servlet.tags.form.InputTag path cssClass title size maxlength readonly");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_6.setPath(OracleJspRuntime.toStr( path));
                      __jsp_taghandler_6.setCssClass(OracleJspRuntime.toStr( cssClass));
                      __jsp_taghandler_6.setTitle(OracleJspRuntime.toStr( title));
                      __jsp_taghandler_6.setSize(OracleJspRuntime.toStr( size));
                      __jsp_taghandler_6.setMaxlength(OracleJspRuntime.toStr( maxlength));
                      __jsp_taghandler_6.setReadonly(OracleJspRuntime.toStr( inputReadonly));
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                      } catch (Throwable th) {
                        __jsp_taghandler_6.doCatch(th);
                      } finally {
                        __jsp_taghandler_6.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                    }
                    out.write("\n    ");
                  } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write("\n");
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n\n<!-- Muestra la imagen con la accion que despliega la helpRoutine -->\n<span class=\"helproutine\">\n");
        
            if(Boolean.valueOf(readonly)) {
        
        out.write("\n      <a href=\"javascript://nop/\">\n        <img alt=\"help\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_7.setParent(null);
          __jsp_taghandler_7.setCode("help_disabled.gif");
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
        out.write("\" height=\"20\" width=\"20\"/>\n      </a>\n");
        
            } else {
        
        out.write("\n      <a href=\"javascript:showDiv");
        out.print(pathName);
        out.write("();\">\n        <img alt=\"help\" src=\"");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_8.setParent(null);
          __jsp_taghandler_8.setCode("background.gif");
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
        out.write("\" height=\"20\" width=\"20\"/>\n      </a>\n");
        
            }
        
        out.write("\n</span>\n\n<!-- Contiene el area en donde se muestra la helpRoutine -->\n<div id=\"div");
        out.print(pathName);
        out.write("\" class=\"popup\">\n    <table border=\"0\" width=\"250\" bgcolor=\"#3C3C3C\" cellspacing=\"0\" cellpadding=\"5\">\n        <tr>\n            <td width=\"100%\">\n                <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" height=\"36\">\n                    <tr>\n                        <td style=\"cursor:move\" width=\"100%\" onmousedown=\"javascript:comienzoMovimiento(event, 'div");
        out.print(pathName);
        out.write("');\">\n                            <font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">");
        {
          org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code text");
          __jsp_taghandler_9.setParent(null);
          __jsp_taghandler_9.setCode(OracleJspRuntime.toStr( title));
          __jsp_taghandler_9.setText(OracleJspRuntime.toStr( title));
          try {
            __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
            if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
               throw new javax.servlet.jsp.SkipPageException();
          } catch (Throwable th) {
            __jsp_taghandler_9.doCatch(th);
          } finally {
            __jsp_taghandler_9.doFinally();
          }
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
        }
        out.write("</font>\n                        </td>\n                        <td style=\"cursor:hand\" valign=\"top\" align=\"right\">\n                            <a href=\"#\" onClick=\"closeDiv");
        out.print(pathName);
        out.write("();return false\"><font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">X</font></a>\n                        </td>\n                    </tr>\n                    <tr>\n                        <td width=\"100%\" bgcolor=\"#FFFFFF\" style=\"padding:4px\" colspan=\"2\">\n                            <iframe style=\"height:");
        out.print(height);
        out.write("px;width:");
        out.print(width);
        out.write("px;border-style:none;\" src=\"\" name=\"fra");
        out.print(pathName);
        out.write("\" id=\"fra");
        out.print(pathName);
        out.write("\">\n                            </iframe>\n                        </td>\n                    </tr>\n                </table> \n            </td>\n        </tr>\n    </table>\n</div>\n\n\n<script type=\"text/javascript\" >\n    function showDiv");
        out.print(pathName);
        out.write("() {\n        if (document.getElementById(\"div");
        out.print(pathName);
        out.write("\").style.visibility == \"visible\"){\n            document.getElementById('div");
        out.print(pathName);
        out.write("').style.visibility=\"hidden\";\n        } else {\n            centerInScreen(document.getElementById(\"div");
        out.print(pathName);
        out.write("\"), '");
        out.print(leftPosition);
        out.write("', '");
        out.print(topPosition);
        out.write("');\n            var frame = document.getElementById(\"fra");
        out.print(pathName);
        out.write("\");\n            ");
        {
          org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var value");
          __jsp_taghandler_10.setParent(null);
          __jsp_taghandler_10.setVar("contextPath");
          __jsp_taghandler_10.setValue("/util/displayHelp.do");
          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
            do {
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                __jsp_taghandler_11.setName("dataSourceName");
                __jsp_taghandler_11.setValue(OracleJspRuntime.toStr( dataSourceName));
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                __jsp_taghandler_12.setName("dataSourceType");
                __jsp_taghandler_12.setValue(OracleJspRuntime.toStr( dataSourceType));
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_13.setParent(__jsp_taghandler_10);
                __jsp_taghandler_13.setName("path");
                __jsp_taghandler_13.setValue(OracleJspRuntime.toStr( path));
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_14.setParent(__jsp_taghandler_10);
                __jsp_taghandler_14.setName("parentValues");
                __jsp_taghandler_14.setValue(OracleJspRuntime.toStr( parentValues));
                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_15.setParent(__jsp_taghandler_10);
                __jsp_taghandler_15.setName("fieldMapping");
                __jsp_taghandler_15.setValue(OracleJspRuntime.toStr( fieldMapping));
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_16.setParent(__jsp_taghandler_10);
                __jsp_taghandler_16.setName("fieldMappingDTO");
                __jsp_taghandler_16.setValue(OracleJspRuntime.toStr( fieldMappingDTO));
                __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_17.setParent(__jsp_taghandler_10);
                __jsp_taghandler_17.setName("multipleSelection");
                __jsp_taghandler_17.setValue(OracleJspRuntime.toStr( multipleSelection));
                __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_18.setParent(__jsp_taghandler_10);
                __jsp_taghandler_18.setName("closeFunction");
                __jsp_taghandler_18.setValue(OracleJspRuntime.toStr( closeFunction));
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_19.setParent(__jsp_taghandler_10);
                __jsp_taghandler_19.setName("decorator");
                __jsp_taghandler_19.setValue(OracleJspRuntime.toStr( decorator));
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_20.setParent(__jsp_taghandler_10);
                __jsp_taghandler_20.setName("maxRows");
                __jsp_taghandler_20.setValue(OracleJspRuntime.toStr( maxRows));
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ParamTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.ParamTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ParamTag.class,"org.apache.taglibs.standard.tag.rt.core.ParamTag name value");
                __jsp_taghandler_21.setParent(__jsp_taghandler_10);
                __jsp_taghandler_21.setName("orderedColumns");
                __jsp_taghandler_21.setValue(OracleJspRuntime.toStr( orderedColumns));
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write("\n            ");
            } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
        }
        out.write("\n            frame.src=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
          __jsp_taghandler_22.setParent(null);
          __jsp_taghandler_22.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contextPath}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_taghandler_22.setEscapeXml(false);
          __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
          if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,1);
        }
        out.write("\";\n            document.getElementById('div");
        out.print(pathName);
        out.write("').style.visibility = \"visible\";\n        }\n    }\n    \n    function closeDiv");
        out.print(pathName);
        out.write("() {                                \n        var onCloseFunction = \"");
        out.print(onClose);
        out.write("\";\n        if(onCloseFunction!= \"null\" && onCloseFunction.length>0) {            \n            window.parent.eval(onCloseFunction);            \n        }\n        document.getElementById('div");
        out.print(pathName);
        out.write("').style.visibility=\"hidden\";\n        document.getElementById('fra");
        out.print(pathName);
        out.write("').src=\"\";\n    }\n    carga();\n</script>\n");
        
        } catch(gob.shcp.fsn.service.ServiceException se) {
            TagUtils.saveError(pageContext, se);
        
        out.write("\n    ");
        {
          String __url=OracleJspRuntime.toStr("/WEB-INF/jsp/layout/message.jsp");
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
        new TagAttributeInfo("beanName",false,"java.lang.String",true,false),
        new TagAttributeInfo("service",false,"java.lang.String",true,false),
        new TagAttributeInfo("path",true,"java.lang.String",true,false),
        new TagAttributeInfo("fieldMapping",true,"java.lang.String",true,false),
        new TagAttributeInfo("fieldMappingDTO",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false),
        new TagAttributeInfo("leftPosition",false,"java.lang.String",true,false),
        new TagAttributeInfo("height",false,"java.lang.String",true,false),
        new TagAttributeInfo("topPosition",false,"java.lang.String",true,false),
        new TagAttributeInfo("maxlength",false,"java.lang.String",true,false),
        new TagAttributeInfo("disabled",false,"java.lang.String",true,false),
        new TagAttributeInfo("readonly",false,"java.lang.String",true,false),
        new TagAttributeInfo("size",false,"java.lang.String",true,false),
        new TagAttributeInfo("title",false,"java.lang.String",true,false),
        new TagAttributeInfo("uppercase",false,"java.lang.String",true,false),
        new TagAttributeInfo("multiple",false,"java.lang.String",true,false),
        new TagAttributeInfo("parentValues",false,"java.lang.String",true,false),
        new TagAttributeInfo("onClose",false,"java.lang.String",true,false),
        new TagAttributeInfo("decorator",false,"java.lang.String",true,false),
        new TagAttributeInfo("maxRows",false,"java.lang.String",true,false),
        new TagAttributeInfo("orderedColumns",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("helpRoutine","_oracle._jsp._tag._helpRoutine_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
