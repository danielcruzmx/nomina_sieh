package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import org.springframework.web.util.ExpressionEvaluationUtils;
import gob.shcp.fsn.control.view.util.TagUtils;


public class _docElectronica_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String rfc;
  private java.lang.String tipo;

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

  public void setRfc(java.lang.String rfc)
  {
    this.rfc = rfc;
  }

  public java.lang.String getRfc()
  {
    return this.rfc;
  }

  public void setTipo(java.lang.String tipo)
  {
    this.tipo = tipo;
  }

  public java.lang.String getTipo()
  {
    return this.tipo;
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
        pageContext.setAttribute("rfc", getRfc());
        pageContext.setAttribute("tipo", getTipo());


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write(" ");
        out.write("\n");
        out.write(" ");
        out.write("\n\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        
        try {
        
        out.write("\n\n<table width=\"100%\">\n    <tr>\n        <td align=\"center\" style=\"padding: 5px;\">\n            <br/>\n            <div style=\"width:950px;overflow:auto;\">\n                <table id=\"listDocumentosTag\"></table>\n                <div id=\"pagerDocumentosTag\"></div>\n            </div>\n            <br/>\n        </td>\n    </tr>\n</table>\n\n<style type=\"text/css\">\n    .ui-subtblcell{ background-color: #e6e6e6; }\n</style>\n\n<script type=\"text/javascript\">\n    var rfcEmpleado = '");
        out.print(rfc);
        out.write("';                    \n    var tipo = '");
        out.print(tipo);
        out.write("';\n    \n    $j(\"#listDocumentosTag\").jqGrid({\n        url: '");
        out.print(request.getContextPath());
        out.write("/expediente/jsonCallbackDocActivos.do?rfcEmpleado=' + rfcEmpleado + '&tipo=' + tipo, \n        datatype: 'json',\n        height: 200,\n        colNames:['ID', '#',  'Tipo de documento', 'Registro', 'Requerido'],\n        colModel:[\n            {name:'idDocto',    index:'idDocto',    width:40,  align:'center', sortable:false, hidden:true},\n            {name:'num',        index:'num',        width:33,  align:'center', sortable:false, sorttype:'number'},\n            {name:'descdocto',  index:'descdocto',  width:460, align:'left',   sortable:false, sorttype:'text'},\n            {name:'descstatus', index:'descstatus', width:140, align:'center', sortable:false, sorttype:'text'},\n            {name:'requerido',  index:'requerido',  width:200, align:'center', sortable:false, sorttype:'text'},                            \n        ],\n        loadonce: false,\n        rowNum: 200,\n        pager: '#pagerDocumentosTag', \n        sortname: 'num',\n        viewrecords: true,\n        sortorder: 'asc', \n        multiselect: false, \n        subGrid: true,\n        subGridUrl: '");
        out.print(request.getContextPath());
        out.write("/expediente/jsonCallbackDocHistorico.do?rfcEmpleado=' + rfcEmpleado, \n        subGridModel: [{ \n            name: ['Archivo', 'Detalle del documento', 'Estado', 'Rechazo'], \n            width: [35, 450, 100, 300],\n            align: ['center', 'left', 'center', 'center'], \n            params:['idDocto'] \n        }]\n    });\n    $j(\"#listDocumentosTag\").jqGrid('navGrid','#pagerDocumentosTag',{add:false,edit:false,del:false,search:false,refresh:false});\n    \n    $j(window).resize(function(){\n        $j('#listDocumentosTag').jqGrid('setGridHeight', 250);\n    });\n    \n    function actionLinkFormat(cellvalue, options, rowObject) {\n        if (rowObject[\"referenciadocto\"] != \"SIN\") {\n            var a = \"<a href='");
        out.print(request.getContextPath());
        out.write("/expediente/downloadFile.do?uuid=\" + rowObject[\"referenciadocto\"] + \n            \"' class='requestlink' title='Descargar documento' target='_blank'><img width='20' align='middle' src='");
        {
          org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setCode("pdf-download.jpg");
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
        out.write("'\\/><\\/a>\";\n            return a;\n        } else {\n            return \" \";\n        }  \n    }\n</script>\n\n");
        
        } catch (gob.shcp.fsn.service.ServiceException se) {
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
        new TagAttributeInfo("rfc",false,"java.lang.String",true,false),
        new TagAttributeInfo("tipo",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("docElectronica","_oracle._jsp._tag._docElectronica_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
