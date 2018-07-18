package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.view.util.TagUtils;
import java.util.Properties;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;


public class _report_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String provider;
  private java.lang.String viewUri;
  private java.lang.String imagesUri;
  private java.lang.String beanName;
  private java.lang.String service;
  private java.lang.String baseUrl;
  private java.lang.String parentValues;
  private java.lang.String appendFilters;
  private java.lang.String maxRows;
  private java.lang.String format;
  private java.lang.String fileName;
  private java.lang.String export;
  private java.lang.String width;
  private java.lang.String height;

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

  public void setProvider(java.lang.String provider)
  {
    this.provider = provider;
  }

  public java.lang.String getProvider()
  {
    return this.provider;
  }

  public void setViewUri(java.lang.String viewUri)
  {
    this.viewUri = viewUri;
  }

  public java.lang.String getViewUri()
  {
    return this.viewUri;
  }

  public void setImagesUri(java.lang.String imagesUri)
  {
    this.imagesUri = imagesUri;
  }

  public java.lang.String getImagesUri()
  {
    return this.imagesUri;
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

  public void setBaseUrl(java.lang.String baseUrl)
  {
    this.baseUrl = baseUrl;
  }

  public java.lang.String getBaseUrl()
  {
    return this.baseUrl;
  }

  public void setParentValues(java.lang.String parentValues)
  {
    this.parentValues = parentValues;
  }

  public java.lang.String getParentValues()
  {
    return this.parentValues;
  }

  public void setAppendFilters(java.lang.String appendFilters)
  {
    this.appendFilters = appendFilters;
  }

  public java.lang.String getAppendFilters()
  {
    return this.appendFilters;
  }

  public void setMaxRows(java.lang.String maxRows)
  {
    this.maxRows = maxRows;
  }

  public java.lang.String getMaxRows()
  {
    return this.maxRows;
  }

  public void setFormat(java.lang.String format)
  {
    this.format = format;
  }

  public java.lang.String getFormat()
  {
    return this.format;
  }

  public void setFileName(java.lang.String fileName)
  {
    this.fileName = fileName;
  }

  public java.lang.String getFileName()
  {
    return this.fileName;
  }

  public void setExport(java.lang.String export)
  {
    this.export = export;
  }

  public java.lang.String getExport()
  {
    return this.export;
  }

  public void setWidth(java.lang.String width)
  {
    this.width = width;
  }

  public java.lang.String getWidth()
  {
    return this.width;
  }

  public void setHeight(java.lang.String height)
  {
    this.height = height;
  }

  public java.lang.String getHeight()
  {
    return this.height;
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
        pageContext.setAttribute("provider", getProvider());
        pageContext.setAttribute("viewUri", getViewUri());
        pageContext.setAttribute("imagesUri", getImagesUri());
        pageContext.setAttribute("beanName", getBeanName());
        pageContext.setAttribute("service", getService());
        pageContext.setAttribute("baseUrl", getBaseUrl());
        pageContext.setAttribute("parentValues", getParentValues());
        pageContext.setAttribute("appendFilters", getAppendFilters());
        pageContext.setAttribute("maxRows", getMaxRows());
        pageContext.setAttribute("format", getFormat());
        pageContext.setAttribute("fileName", getFileName());
        pageContext.setAttribute("export", getExport());
        pageContext.setAttribute("width", getWidth());
        pageContext.setAttribute("height", getHeight());


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n\n");
        out.write("<!--proveedor jasper  --> \n");
        out.write("<!--ruta relativa donde se encuentra la plantilla .jxml y .jasper relativa a WEB-INF\\reports / --> \n");
        out.write("<!--Ruta donde se enuentran las imagenes. -->\n");
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
        
        try {
            //Se asignan valores default
            if(!StringUtils.hasText(baseUrl)) {
                baseUrl = "/util/displayReport.do";
            }
            if(!baseUrl.startsWith("/")) {
                baseUrl = "/" + baseUrl;
            }
            if(!baseUrl.endsWith(".do")) {
                baseUrl = baseUrl + ".do";
            }
        
            final String frameId = viewUri.replaceAll("[^a-zA-Z0-9]", "");
            if(!viewUri.startsWith("/")) {
                viewUri = "/" + viewUri;
            }
        
            imagesUri = imagesUri == null ? "" : imagesUri;
            if(!imagesUri.equals("") && !imagesUri.startsWith("/")) {
                imagesUri = "/" + imagesUri;
            }
        
            boolean append = true;
            if(StringUtils.hasText(appendFilters)) {
                append = Boolean.valueOf(appendFilters);
            }
        
            maxRows = maxRows == null ? "-1"   : maxRows;
            format  = format  == null ? "html" : format;
            width   = width   == null ? "500"  : width;
            height  = height  == null ? "200"  : height;
        
            //Se construye la url del iframe
            final String contextPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+baseUrl+"?";
            final StringBuffer iframeUrl = new StringBuffer(contextPath);
            String exportDS = "";
            if(StringUtils.hasText(beanName)){
                iframeUrl.append("beanName=" + beanName);
                exportDS = "&beanName=" + beanName;
            } 
            if(StringUtils.hasText(service)){
                iframeUrl.append("&service=" + service);
                exportDS = "&service=" + service;
            } 
            if(StringUtils.hasText(imagesUri)) iframeUrl.append("&imagesUri="+imagesUri);
            if(StringUtils.hasText(parentValues)) iframeUrl.append("&parentValues="+parentValues);
            if(StringUtils.hasText(provider)) iframeUrl.append("&provider="+provider);
            if(StringUtils.hasText(viewUri)) iframeUrl.append("&viewUri="+viewUri);
            iframeUrl.append("&appendFilters="+append);      
            iframeUrl.append("&maxRows="+maxRows);
            iframeUrl.append("&format="+format);
            iframeUrl.append("&"+TagUtils.getInputViewParamName()+"="+provider+":"+viewUri); //View tracking
        
            if(StringUtils.hasText(fileName)) {
                fileName = "&fileName=" + fileName;
            } else {
                fileName = "";
            }
        
            //Se verifican los formatos para exportar
            final Map<String, String> supportedFormats = new HashMap<String, String>();  
            supportedFormats.put("pdf", "pdf");
            supportedFormats.put("csv", "csv");
            supportedFormats.put("xls", "xls");
            supportedFormats.put("xlsx", "xlsx");
            supportedFormats.put("rtf", "rtf");
            supportedFormats.put("xml", "xml");
            supportedFormats.put("docx", "docx");
            supportedFormats.put("pptx", "pptx");
            supportedFormats.put("txt", "txt");
        
            final List<String> formats = new ArrayList<String>();
            if(StringUtils.hasText(export)) {
                iframeUrl.append("&export="+export);
                final String[] exportFormats = export.split(",");
                for(int i = 0; i < exportFormats.length; i++) {
                    if(supportedFormats.get(exportFormats[i].toLowerCase()) != null) {
                        formats.add(supportedFormats.get(exportFormats[i].toLowerCase()));
                    }
                }
                request.setAttribute("formats", formats);
            }
        
            //Se concatenan los parametros del reporte
            final StringBuffer exportParams = new StringBuffer();
            if(pageContext.getAttribute(TagUtils.REPORT_PARAMS, PageContext.REQUEST_SCOPE) != null){
                final Properties parameters = (Properties)pageContext.getAttribute(TagUtils.REPORT_PARAMS, PageContext.REQUEST_SCOPE);
                for (Iterator it = parameters.entrySet().iterator(); it.hasNext();) {
                    Map.Entry entry = (Map.Entry) it.next();
                    iframeUrl.append("&"+(String) entry.getKey()+"="+(String) entry.getValue());
                    exportParams.append("&"+(String) entry.getKey()+"="+(String) entry.getValue());
                }
            }         
        
        out.write("\n    <table>\n        <tr>\n            <td>\n                <iframe id=\"reportIFrame");
        out.print(frameId);
        out.write("\" \n                        src=\"");
        out.print(iframeUrl.toString());
        out.write("\" \n                        frameborder=\"0\" \n                        scrolling=\"auto\"\n                        width=\"");
        out.print(width);
        out.write("\" \n                        height=\"");
        out.print(height);
        out.write("\" \n                        style=\"overflow:auto; z-index: -1;\">\n                </iframe>\n            </td>\n        </tr>\n        <tr>\n            <td>\n                <div class=\"exportlinks\">Export:\n                    ");
        {
          org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${formats}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_taghandler_1.setVar("format");
          try {
            __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              do {
                out.write("\n                        ");
                {
                  org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                  __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                  __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${fileName!=null && fileName!=''}",java.lang.Boolean.class, __ojsp_varRes,null)));
                  __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write("                            \n                            <a href=\"");
                      out.print(contextPath);
                      out.write("provider=");
                      out.print(provider);
                      out.write("&viewUri=");
                      out.print(viewUri);
                      out.write("&imagesUri=");
                      out.print(imagesUri);
                      out.write("&format=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                        __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${format}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                      }
                      out.print(exportParams);
                      out.print(exportDS);
                      out.print(fileName);
                      out.write(".");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                        __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${format}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                      }
                      out.write("\">\n                                <span class=\"export ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                        __jsp_taghandler_5.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${format}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                      }
                      out.write("\">");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                        __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${format}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                        if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                      }
                      out.write("</span>\n                            </a>\n                        ");
                    } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
                }
                out.write("\n                        ");
                {
                  org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                  __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                  __jsp_taghandler_7.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${fileName==null || fileName==''}",java.lang.Boolean.class, __ojsp_varRes,null)));
                  __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write("                        \n                            <a href=\"#\" onclick=\"javascript:reloadIFrame");
                      out.print(frameId);
                      out.write("('");
                      out.print(contextPath);
                      out.write("provider=");
                      out.print(provider);
                      out.write("&viewUri=");
                      out.print(viewUri);
                      out.write("&imagesUri=");
                      out.print(imagesUri);
                      out.write("&format=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                        __jsp_taghandler_8.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${format}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
                      }
                      out.print(exportParams);
                      out.print(exportDS);
                      out.write("');\">\n                                <span class=\"export ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_9.setParent(__jsp_taghandler_7);
                        __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${format}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                      }
                      out.write("\">");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_10.setParent(__jsp_taghandler_7);
                        __jsp_taghandler_10.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${format}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
                      }
                      out.write("</span>\n                            </a>                            \n                        ");
                    } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
                }
                out.write("\n                    ");
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
        out.write("    \n                </div>\n            </td>\n        </tr>\n    </table>\n\n    <script type=\"text/javascript\">\n        function reloadIFrame");
        out.print(frameId);
        out.write("(url) {\n            document.getElementById(\"reportIFrame");
        out.print(frameId);
        out.write("\").src = url;\n        }\n    </script>\n");
            
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
        new TagAttributeInfo("provider",true,"java.lang.String",true,false),
        new TagAttributeInfo("viewUri",true,"java.lang.String",true,false),
        new TagAttributeInfo("imagesUri",false,"java.lang.String",true,false),
        new TagAttributeInfo("beanName",false,"java.lang.String",true,false),
        new TagAttributeInfo("service",false,"java.lang.String",true,false),
        new TagAttributeInfo("baseUrl",false,"java.lang.String",true,false),
        new TagAttributeInfo("parentValues",false,"java.lang.String",true,false),
        new TagAttributeInfo("appendFilters",false,"java.lang.String",true,false),
        new TagAttributeInfo("maxRows",false,"java.lang.String",true,false),
        new TagAttributeInfo("format",false,"java.lang.String",true,false),
        new TagAttributeInfo("fileName",false,"java.lang.String",true,false),
        new TagAttributeInfo("export",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false),
        new TagAttributeInfo("height",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("report","_oracle._jsp._tag._report_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
