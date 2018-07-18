package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.view.tree.TreeRepository;
import java.util.List;
import java.util.ArrayList;
import gob.shcp.fsn.model.support.FilterDTO;
import gob.shcp.fsn.service.support.DynaContentService;
import java.util.HashSet;
import java.util.Set;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _tree_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String name;
  private java.lang.String parentValues;
  private java.lang.String pattern;
  private java.lang.String titleArgs;
  private java.lang.String width;
  private java.lang.String height;
  private java.lang.String frame;
  private java.lang.String frameWidth;
  private java.lang.String frameParams;
  private java.lang.String appendFilters;
  private java.lang.String filterId;

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

  public void setParentValues(java.lang.String parentValues)
  {
    this.parentValues = parentValues;
  }

  public java.lang.String getParentValues()
  {
    return this.parentValues;
  }

  public void setPattern(java.lang.String pattern)
  {
    this.pattern = pattern;
  }

  public java.lang.String getPattern()
  {
    return this.pattern;
  }

  public void setTitleArgs(java.lang.String titleArgs)
  {
    this.titleArgs = titleArgs;
  }

  public java.lang.String getTitleArgs()
  {
    return this.titleArgs;
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

  public void setFrame(java.lang.String frame)
  {
    this.frame = frame;
  }

  public java.lang.String getFrame()
  {
    return this.frame;
  }

  public void setFrameWidth(java.lang.String frameWidth)
  {
    this.frameWidth = frameWidth;
  }

  public java.lang.String getFrameWidth()
  {
    return this.frameWidth;
  }

  public void setFrameParams(java.lang.String frameParams)
  {
    this.frameParams = frameParams;
  }

  public java.lang.String getFrameParams()
  {
    return this.frameParams;
  }

  public void setAppendFilters(java.lang.String appendFilters)
  {
    this.appendFilters = appendFilters;
  }

  public java.lang.String getAppendFilters()
  {
    return this.appendFilters;
  }

  public void setFilterId(java.lang.String filterId)
  {
    this.filterId = filterId;
  }

  public java.lang.String getFilterId()
  {
    return this.filterId;
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
        pageContext.setAttribute("parentValues", getParentValues());
        pageContext.setAttribute("pattern", getPattern());
        pageContext.setAttribute("titleArgs", getTitleArgs());
        pageContext.setAttribute("width", getWidth());
        pageContext.setAttribute("height", getHeight());
        pageContext.setAttribute("frame", getFrame());
        pageContext.setAttribute("frameWidth", getFrameWidth());
        pageContext.setAttribute("frameParams", getFrameParams());
        pageContext.setAttribute("appendFilters", getAppendFilters());
        pageContext.setAttribute("filterId", getFilterId());


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write(" ");
        out.write("\n");
        out.write("\n\n");
        
        try {
            width = width==null? "250" : width;
            frameWidth = frameWidth==null? "600" : frameWidth;
            height = height==null? "500" : height;
            parentValues = parentValues==null? "" : parentValues;
            pattern = pattern==null? "" : pattern;
            boolean useFrames = Boolean.valueOf(frame);
            if (filterId==null || "".equals(filterId) ){
                    filterId = DynaContentService.PAGED_LIST_FILTER;
            }
        
        
            boolean dynaQuery = true;
            if(appendFilters != null && !"".equals(appendFilters)) {
                dynaQuery = Boolean.valueOf(appendFilters);
            }
        
            if(useFrames) {
                final FilterDTO filterDTO = (FilterDTO)pageContext.getAttribute(filterId, PageContext.REQUEST_SCOPE);  
                final List filters = filterDTO == null ? null : filterDTO.get();
                final StringBuffer filterParams = new StringBuffer();     
                if(filters!=null) {
                    Object[] filter = null;
                    final int size = filters.size();
                    for(int i = 0; i < size; i++) {
                        filter = (Object[])filters.get(i);
                        filterParams.append("&").append("filter_value").append("_").append(filter[0]).append("=").append(filter[2]);
                        filterParams.append("&").append("filter_condition").append("_").append(filter[0]).append("=").append(filter[1]);
                    }
                }
        
        out.write("\n        <input type=\"hidden\" id=\"treeBreadCrumb\" name=\"treeBreadCrumb\"/>\n        <table align=\"center\">\n            <tr>\n                <td>    \n");
        
                            if(frameParams != null){
        
        out.write("        \n                        <input type=\"hidden\" id=\"frameParams\" name=\"frameParams\" value=\"");
        out.print(frameParams );
        out.write("\" />\n");
                    
                            }
        
        out.write("\n                    <!-- Se agrega hidden con pagina en blanco para usarla como tracking en caso de error, se obtiene en el xtree.js para enviarla como parametro -->\n                    <input type=\"hidden\" id=\"blankPage\" name=\"blankPage\" value=\"tframe:/layout/empty\" />\n                    <iframe src=\"\" frameborder=\"0\"  style=\"width: ");
        out.print(width);
        out.write("px; height: ");
        out.print(height);
        out.write("px; overflow: auto; padding: 5px;\" id=\"treeFrame\" name=\"treeFrame\"></iframe>\n                </td>\n                <td>\n                    <iframe src=\"\" frameborder=\"0\" style=\"width: ");
        out.print(frameWidth);
        out.write("px; height: ");
        out.print(height);
        out.write("px; overflow: auto; padding: 5px;\" id=\"treeBody\" name=\"treeBody\"></iframe>\n                </td>\n            </tr>\n        </table>\n        ");
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
        out.write("\n        <script language=\"javascript\" >\n            var frame = document.getElementById(\"treeFrame\");            \n            frame.src=\"");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${contextPath}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("util/displayTree.do?name=");
        out.print(name);
        out.write("&parentValues=");
        out.print(parentValues);
        out.write("&appendFilters=");
        out.print(dynaQuery);
        out.write("&pattern=");
        out.print(pattern);
        out.write("&titleArgs=");
        out.print(titleArgs);
        out.write("&width=");
        out.print(width);
        out.write("&height=");
        out.print(height);
        out.print(filterParams);
        out.write("\";            \n        </script>\n");
        
            } else {
                Object[] argsTitle = null;
                if(titleArgs!=null && !"".equals(titleArgs)) {
                     argsTitle = titleArgs.split(",");
                }
                pageContext.setAttribute("argsTitle", argsTitle);
        
                List<String> initParams = new ArrayList<String>();
                if(parentValues != null && !"".equals(parentValues)) {
                    String[] array =  parentValues.split(",");
                    for(String value: array) {
                        initParams.add(value.trim());
                    }
                }
        
                final String repositoryKey = TreeRepository.TREE_REPOSITORY_KEY+"."+name;
                final FilterDTO filters = (FilterDTO)pageContext.getAttribute(filterId, PageContext.REQUEST_SCOPE);
        
                TreeRepository treeRepository = (TreeRepository) request.getSession().getServletContext().getAttribute(TreeRepository.TREE_REPOSITORY_KEY);
                if(dynaQuery) {
                    if(filters != null && filters.get() != null && !filters.get().isEmpty()) {
                        treeRepository = treeRepository.build(name, repositoryKey, initParams, pattern, TagUtils.getConditions(filters));
                    } else {
                        treeRepository = treeRepository.build(name, repositoryKey, initParams, pattern, TagUtils.getConditions(request));
                    }
                } else {
                    if(filters != null && filters.get() != null && !filters.get().isEmpty()) {
                        treeRepository = treeRepository.build(name, repositoryKey, initParams, pattern, TagUtils.getConditions(filters), dynaQuery);
                    } else {
                        treeRepository = treeRepository.build(name, repositoryKey, initParams, pattern, TagUtils.getConditions(request), dynaQuery);
                    }             
                }
        
        out.write("\n        <div style=\"width: ");
        out.print(width);
        out.write("px; height: ");
        out.print(height);
        out.write("px; overflow: auto; padding: 5px;\" onmouseover=\"releaseMouse()\" onmouseout=\"disableMouse()\">\n            ");
        {
          net.sf.navigator.taglib.el.UseMenuDisplayerTag __jsp_taghandler_3=(net.sf.navigator.taglib.el.UseMenuDisplayerTag)OracleJspRuntime.getTagHandler(pageContext,net.sf.navigator.taglib.el.UseMenuDisplayerTag.class,"net.sf.navigator.taglib.el.UseMenuDisplayerTag name permissions repository");
          __jsp_taghandler_3.setParent(null);
          __jsp_taghandler_3.setName(OracleJspRuntime.toStr( treeRepository.TREE_DISPLAYER_KEY));
          __jsp_taghandler_3.setPermissions("rolesAdapter");
          __jsp_taghandler_3.setRepository(OracleJspRuntime.toStr( repositoryKey));
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n                ");
              {
                net.sf.navigator.taglib.el.DisplayMenuTag __jsp_taghandler_4=(net.sf.navigator.taglib.el.DisplayMenuTag)OracleJspRuntime.getTagHandler(pageContext,net.sf.navigator.taglib.el.DisplayMenuTag.class,"net.sf.navigator.taglib.el.DisplayMenuTag name");
                __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                __jsp_taghandler_4.setName(OracleJspRuntime.toStr( name));
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
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
        }
        out.write("\n\n            ");
        {
          net.sf.navigator.taglib.el.UseMenuDisplayerTag __jsp_taghandler_5=(net.sf.navigator.taglib.el.UseMenuDisplayerTag)OracleJspRuntime.getTagHandler(pageContext,net.sf.navigator.taglib.el.UseMenuDisplayerTag.class,"net.sf.navigator.taglib.el.UseMenuDisplayerTag name permissions repository");
          __jsp_taghandler_5.setParent(null);
          __jsp_taghandler_5.setName(OracleJspRuntime.toStr( treeRepository.CONTEXT_DISPLAYER_KEY));
          __jsp_taghandler_5.setPermissions("rolesAdapter");
          __jsp_taghandler_5.setRepository(OracleJspRuntime.toStr( repositoryKey));
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write("\n                ");
              {
                org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
                __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                __jsp_taghandler_6.setItems(treeRepository.getTopMenus());
                __jsp_taghandler_6.setVar("menu");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write("\n                    ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                        __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                        __jsp_taghandler_7.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${menu.name != name}",java.lang.Boolean.class, __ojsp_varRes,null)));
                        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\n                        ");
                            {
                              net.sf.navigator.taglib.el.DisplayMenuTag __jsp_taghandler_8=(net.sf.navigator.taglib.el.DisplayMenuTag)OracleJspRuntime.getTagHandler(pageContext,net.sf.navigator.taglib.el.DisplayMenuTag.class,"net.sf.navigator.taglib.el.DisplayMenuTag name");
                              __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                              __jsp_taghandler_8.setName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${menu.name}",java.lang.String.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,4);
                            }
                            out.write("\n                    ");
                          } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                      }
                      out.write("            \n                ");
                    } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_6.doCatch(th);
                } finally {
                  __jsp_taghandler_6.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write("\n            ");
            } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
        }
        out.write("\n        </div>\n");
        
                pageContext.removeAttribute(filterId, PageContext.REQUEST_SCOPE);
                pageContext.removeAttribute("argsTitle");    
            }
        
        out.write("\n\n<script type=\"text/javascript\"> \n    function getBreadCrumb() {\n        var tree = eval(");
        out.print(name);
        out.write(");\n        var child = tree.getSelected();\n        var rute = \"\";\n        if(child!=null){            \n            while(child!=null){\n                rute = child.text+\">>\"+rute;\n                child = child.parentNode\t\t\n            }\n            rute = \">>\"+rute.substring(0,rute.length-2);\n        }else{\n            rute = window.top.document.getElementById(\"treeBreadCrumb\").value;\n        }        \n        window.top.document.getElementById(\"treeBreadCrumb\").value = rute;\n        return rute;\n    }\n</script>\n\n");
        
        } catch(Exception e) {
            e.printStackTrace();
        }finally {
            pageContext.removeAttribute(filterId, PageContext.REQUEST_SCOPE);
             pageContext.removeAttribute("argsTitle");
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
        new TagAttributeInfo("name",true,"java.lang.String",true,false),
        new TagAttributeInfo("parentValues",false,"java.lang.String",true,false),
        new TagAttributeInfo("pattern",false,"java.lang.String",true,false),
        new TagAttributeInfo("titleArgs",false,"java.lang.String",true,false),
        new TagAttributeInfo("width",false,"java.lang.String",true,false),
        new TagAttributeInfo("height",false,"java.lang.String",true,false),
        new TagAttributeInfo("frame",false,"java.lang.String",true,false),
        new TagAttributeInfo("frameWidth",false,"java.lang.String",true,false),
        new TagAttributeInfo("frameParams",false,"java.lang.String",true,false),
        new TagAttributeInfo("appendFilters",false,"java.lang.String",true,false),
        new TagAttributeInfo("filterId",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("tree","_oracle._jsp._tag._tree_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
