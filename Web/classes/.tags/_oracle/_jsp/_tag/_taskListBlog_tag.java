package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import gob.shcp.bpm.model.ProcessListItemDTO;
import gob.shcp.bpm.model.TaskListItemDTO;
import gob.shcp.fsn.control.view.util.TagUtils;
import gob.shcp.bpm.service.ProcessInstanceService;
import org.springframework.util.ClassUtils;
import java.util.Iterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class _taskListBlog_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // Begin global declarations

  private static OracleFunctionMapperImpl [] __ojsp_fnmappers = OracleJspRuntime.__init_ojsp_fMappers(1);
  // End global declarations

  // begin functions
  static {
    __ojsp_fnmappers[0].mapFunction("tagutils","createPagedList",gob.shcp.fsn.control.view.util.TagUtils.class,"createPagedList",new Class[] {javax.servlet.jsp.PageContext.class,java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class});
  }
  // end functions

  // ** Begin Declarations


    private String getTitle(PageContext pageContext, String[] tableHeaders, String[] keys, int idx) {
        String title;
        if(idx < tableHeaders.length) {
            title = tableHeaders[idx];
        } else {
            title = keys[idx];
        }
        return TagUtils.getPropertyResourcesValue(pageContext, title);
    }
    
    private String changeQuotes(String comment){
        comment = comment.replaceAll("\"","''");        
        return comment;
    }

  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String headers;
  private java.lang.String columns;
  private java.lang.String dateFormat;
  private java.lang.String showProcessInfo;
  private java.lang.String showTaskInfo;
  private java.lang.String tableWidth;
  private java.lang.String leftPosition;
  private java.lang.String topPosition;
  private java.lang.String heightPopUp;
  private java.lang.String widthPopUp;
  private java.lang.String showPopUp;
  private java.lang.String messageLink;
  private java.lang.String maxLength;

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

  public void setHeaders(java.lang.String headers)
  {
    this.headers = headers;
  }

  public java.lang.String getHeaders()
  {
    return this.headers;
  }

  public void setColumns(java.lang.String columns)
  {
    this.columns = columns;
  }

  public java.lang.String getColumns()
  {
    return this.columns;
  }

  public void setDateFormat(java.lang.String dateFormat)
  {
    this.dateFormat = dateFormat;
  }

  public java.lang.String getDateFormat()
  {
    return this.dateFormat;
  }

  public void setShowProcessInfo(java.lang.String showProcessInfo)
  {
    this.showProcessInfo = showProcessInfo;
  }

  public java.lang.String getShowProcessInfo()
  {
    return this.showProcessInfo;
  }

  public void setShowTaskInfo(java.lang.String showTaskInfo)
  {
    this.showTaskInfo = showTaskInfo;
  }

  public java.lang.String getShowTaskInfo()
  {
    return this.showTaskInfo;
  }

  public void setTableWidth(java.lang.String tableWidth)
  {
    this.tableWidth = tableWidth;
  }

  public java.lang.String getTableWidth()
  {
    return this.tableWidth;
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

  public void setHeightPopUp(java.lang.String heightPopUp)
  {
    this.heightPopUp = heightPopUp;
  }

  public java.lang.String getHeightPopUp()
  {
    return this.heightPopUp;
  }

  public void setWidthPopUp(java.lang.String widthPopUp)
  {
    this.widthPopUp = widthPopUp;
  }

  public java.lang.String getWidthPopUp()
  {
    return this.widthPopUp;
  }

  public void setShowPopUp(java.lang.String showPopUp)
  {
    this.showPopUp = showPopUp;
  }

  public java.lang.String getShowPopUp()
  {
    return this.showPopUp;
  }

  public void setMessageLink(java.lang.String messageLink)
  {
    this.messageLink = messageLink;
  }

  public java.lang.String getMessageLink()
  {
    return this.messageLink;
  }

  public void setMaxLength(java.lang.String maxLength)
  {
    this.maxLength = maxLength;
  }

  public java.lang.String getMaxLength()
  {
    return this.maxLength;
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
        pageContext.setAttribute("headers", getHeaders());
        pageContext.setAttribute("columns", getColumns());
        pageContext.setAttribute("dateFormat", getDateFormat());
        pageContext.setAttribute("showProcessInfo", getShowProcessInfo());
        pageContext.setAttribute("showTaskInfo", getShowTaskInfo());
        pageContext.setAttribute("tableWidth", getTableWidth());
        pageContext.setAttribute("leftPosition", getLeftPosition());
        pageContext.setAttribute("topPosition", getTopPosition());
        pageContext.setAttribute("heightPopUp", getHeightPopUp());
        pageContext.setAttribute("widthPopUp", getWidthPopUp());
        pageContext.setAttribute("showPopUp", getShowPopUp());
        pageContext.setAttribute("messageLink", getMessageLink());
        pageContext.setAttribute("maxLength", getMaxLength());


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
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
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
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        
        try{
        
        out.write("\n    ");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
          __jsp_taghandler_1.setParent(null);
          __jsp_taghandler_1.setVar("idProcessInstance");
          __jsp_taghandler_1.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param['idProcessInstance']}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_taghandler_1.setScope("page");
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
        }
        out.write("\n");
            
            showProcessInfo = showProcessInfo != null ? showProcessInfo : "true";
            showTaskInfo = showTaskInfo != null ? showTaskInfo : "true";
            
            if(!Boolean.valueOf(showProcessInfo) && !Boolean.valueOf(showTaskInfo)){
                showProcessInfo = "true";
                showTaskInfo = "true";
            }
            
            final String idProcessInstance = (String)pageContext.getAttribute("idProcessInstance", PageContext.PAGE_SCOPE);
            /***  llamado al servicio en ProcessInstanceService para recuperar el processInstance por el id ***/
            ProcessListItemDTO processListItemDTO = ((ProcessInstanceService)TagUtils.getService(pageContext, (Class)ClassUtils.forName("gob.shcp.bpm.service.ProcessInstanceService"))).findProcessInstanceById(idProcessInstance);
            String processName = processListItemDTO.getProcessName();
            Map<String,String> errorDTO = gob.shcp.fsn.util.BeanUtils.transform(processListItemDTO.getErrorDTO());
            Map<String,String> processDTO = gob.shcp.fsn.util.BeanUtils.transform(processListItemDTO.getProcessDTO());
            tableWidth = tableWidth != null ? tableWidth : "50";
            messageLink = messageLink != null ? TagUtils.getPropertyResourcesValue(pageContext, messageLink) : "...";
            heightPopUp = heightPopUp != null ? heightPopUp : "600";
            widthPopUp = widthPopUp != null ? widthPopUp : "800";
            leftPosition  = leftPosition != null  ? leftPosition : "15";
            topPosition = topPosition != null ? topPosition : "15";
            maxLength = maxLength != null ? maxLength : "50";
            
            /*  
            *  Posibles valores para las propiedades a mostrar:
            *        "taskName", "actorId",
            *        "taskStart", "taskEnd", "observaciones"   
            */
            
            String[] tableColumns = {"taskName", "actorId", "taskStart", "taskEnd","observaciones"};
            String[] tableHeaders = tableColumns;
            showPopUp = showPopUp != null ? showPopUp : "false";    
            if(columns != null){
                tableColumns = columns.split(",");
                tableHeaders = columns.split(",");
            }
            
            if(headers != null){
                tableHeaders = headers.split(",");
            }
            
            dateFormat = (dateFormat!=null && !"".equals(dateFormat)) ? dateFormat : "dd/MM/yyyy HH:mm";   
            
            List<String> dateKeys = new ArrayList<String>();        
            dateKeys.add("taskEnd");
            dateKeys.add("taskStart"); 
        
        out.write("\n");
        {
          org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
          __jsp_taghandler_2.setParent(null);
          __jsp_taghandler_2.setVar("TAG_CONTENT");
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
          {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
            do {
              out.write("\n\n");
                    
                  /* Tabla con los datos de la Instancia del Proceso */
                  if(Boolean.valueOf(showProcessInfo)){
                      Date pStartDate = processListItemDTO.getProcessStart();
                      Date pEndDate = processListItemDTO.getProcessEnd();
                      String pStartString = null;
                      String pEndString = null;
                      if(pStartDate != null || pEndDate != null){
                          DateFormat df = new SimpleDateFormat(dateFormat);
                          pStartString = pStartDate != null ? df.format(pStartDate) : null;
                          pEndString = pEndDate != null ? df.format(pEndDate) : null;
                      }
                      Iterator it = null;
              
                      /* Div para mostrar los datos del ErrorDTO   */
                      if(!errorDTO.isEmpty()){
                          it = errorDTO.entrySet().iterator();
              
              out.write("\n            <div id=\"ERROR_DTO_CONTENT\" class=\"popup\">\n                <table border=\"0\" width=\"250\" bgcolor=\"#3C3C3C\" cellspacing=\"0\" cellpadding=\"5\">\n                    <tr>\n                        <td width=\"100%\">\n                            <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" height=\"36\">\n                                <tr>\n                                    <td style=\"cursor:move\" width=\"100%\" onmousedown=\"javascript:comienzoMovimiento(event, 'ERROR_DTO_CONTENT');\">\n                                    </td>\n                                    <td style=\"cursor:hand\" valign=\"top\">\n                                        <a href=\"#\" onClick=\"closeDiv('ERROR_DTO_CONTENT');return false\"><font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">X</font></a>\n                                    </td>\n                                </tr>\n                                <tr>\n                                    <td width=\"100%\" bgcolor=\"#FFFFFF\" style=\"padding:4px\" colspan=\"2\">\n                                        <table>\n                                            <th colspan=\"2\">\n                                                ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setCode("processDefinitionDTO.errorDetail");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_3.doCatch(th);
                } finally {
                  __jsp_taghandler_3.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write("\n                                            </th>\n");
              
                                                          while(it.hasNext()){
                                                              Map.Entry pair = (Map.Entry)it.next();
              
              out.write("\n                                                <tr>\n                                                    <td class=\"label\">\n                                                        ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_taghandler_4.setValue(pair.getKey());
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write("\n                                                    </td>\n                                                    <td>\n");
              
                                                                      if(pair.getKey().toString().equals("messageError")){
              
              out.write("\n                                                            <textarea rows=\"20\" cols=\"70\" readonly=\"true\">");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                __jsp_taghandler_5.setValue(pair.getValue());
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write("</textarea>\n");
                                        
                                                                      }else{
              
              out.write("\n                                                            ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                __jsp_taghandler_6.setValue(pair.getValue());
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write("\n");
              
                                                                      }
              
              out.write("                            \n                                                    </td>\n                                                </tr>\n");
              
                                                          }
              
              out.write("\n                                        </table>                \n                                    </td>\n                                </tr>\n                            </table> \n                        </td>\n                    </tr>\n                </table>\n            </div>\n");
                                    
                      }
                      
                      /* Div para mostrar los datos del ProcessDTO   */
                      if(!processDTO.isEmpty()){
                          it = processDTO.entrySet().iterator();
              
              out.write("\n            <div id=\"BUSINESS_DTO_CONTENT\" class=\"popup\">\n                <table border=\"0\" width=\"250\" bgcolor=\"#3C3C3C\" cellspacing=\"0\" cellpadding=\"5\">\n                    <tr>\n                        <td width=\"100%\">\n                            <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" height=\"36\">\n                                <tr>\n                                    <td style=\"cursor:move\" width=\"100%\" onmousedown=\"javascript:comienzoMovimiento(event, 'BUSINESS_DTO_CONTENT');\">\n                                    </td>\n                                    <td style=\"cursor:hand\" valign=\"top\">\n                                        <a href=\"#\" onClick=\"closeDiv('BUSINESS_DTO_CONTENT');return false\"><font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">X</font></a>\n                                    </td>\n                                </tr>\n                                <tr>\n                                    <td width=\"100%\" bgcolor=\"#FFFFFF\" style=\"padding:4px\" colspan=\"2\">\n                                        <div style=\"height:500px;width:300px;background-color: rgb(255,255,255);overflow:auto;\">\n                                        <table align=\"center\">\n                                            <th colspan=\"2\">\n                                                ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                __jsp_taghandler_7.setCode("processDefinitionDTO.data");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                  if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_7.doCatch(th);
                } finally {
                  __jsp_taghandler_7.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write("\n                                            </th>\n");
              
                                                          while(it.hasNext()){
                                                              Map.Entry pair = (Map.Entry)it.next();
              
              out.write("              \n                                                <tr>\n                                                    <td class=\"label\">\n                                                        ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_8.setParent(__jsp_taghandler_2);
                __jsp_taghandler_8.setValue(pair.getKey());
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write("\n                                                  </td>\n                                                  <td>\n                                                        ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                __jsp_taghandler_9.setValue(pair.getValue());
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write("\n                                                  </td>\n                                                </tr>\n");
              
                                                          }
              
              out.write("\n                                        </table>\n                                        </div>\n                                    </td>\n                                </tr>\n                            </table> \n                        </td>\n                    </tr>\n                </table>\n            </div>\n");
                                    
                      }
              
              out.write("        \n        <table align=\"center\">        \n            <tr>\n                <td class=\"label\">\n                    ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_2);
                __jsp_taghandler_10.setCode("processDefinitionDTO.processDefinitionName");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_10.doCatch(th);
                } finally {
                  __jsp_taghandler_10.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write("\n                </td>\n                <td>\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_11.setParent(__jsp_taghandler_2);
                __jsp_taghandler_11.setValue(processName);
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write("\n                </td>\n            </tr>\n            <tr>\n                <td class=\"label\">\n                    ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_2);
                __jsp_taghandler_12.setCode("processDefinitionDTO.version");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_12.doCatch(th);
                } finally {
                  __jsp_taghandler_12.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write("\n                </td>\n                <td>\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_13.setParent(__jsp_taghandler_2);
                __jsp_taghandler_13.setValue(processListItemDTO.getVersion());
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write("\n                </td>\n            </tr>\n            <tr>\n                <td class=\"label\">\n                    ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_2);
                __jsp_taghandler_14.setCode("processDefinitionDTO.key");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                  if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_14.doCatch(th);
                } finally {
                  __jsp_taghandler_14.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
              }
              out.write("\n                </td>\n                <td>\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_15.setParent(__jsp_taghandler_2);
                __jsp_taghandler_15.setValue(processListItemDTO.getKey());
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write("\n                </td>\n            </tr>\n            <tr>\n                <td class=\"label\">\n                    ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_2);
                __jsp_taghandler_16.setCode("processDefinitionDTO.start");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                  if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_16.doCatch(th);
                } finally {
                  __jsp_taghandler_16.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write("\n                </td>\n                <td>\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_17.setParent(__jsp_taghandler_2);
                __jsp_taghandler_17.setValue(pStartString);
                __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
              }
              out.write("\n                </td>\n            </tr>\n            <tr>\n                <td class=\"label\">\n                    ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_18.setParent(__jsp_taghandler_2);
                __jsp_taghandler_18.setCode("processDefinitionDTO.end");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                  if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_18.doCatch(th);
                } finally {
                  __jsp_taghandler_18.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write("\n                </td>\n                <td>\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_19.setParent(__jsp_taghandler_2);
                __jsp_taghandler_19.setValue(pEndString);
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write("\n                </td>\n            </tr>\n            <tr>\n                <td class=\"label\">\n                    ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_2);
                __jsp_taghandler_20.setCode("processDefinitionDTO.folio");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                  if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_20.doCatch(th);
                } finally {
                  __jsp_taghandler_20.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write("\n                </td>\n                <td>\n                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_21.setParent(__jsp_taghandler_2);
                __jsp_taghandler_21.setValue(processListItemDTO.getFolio());
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write("\n                </td>\n            </tr>\n");
              
                          if(!errorDTO.isEmpty()){            
              
              out.write("\n                <tr>\n                    <td class=\"label\">\n                        ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_22.setParent(__jsp_taghandler_2);
                __jsp_taghandler_22.setCode("processDefinitionDTO.error");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                  if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_22.doCatch(th);
                } finally {
                  __jsp_taghandler_22.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
              }
              out.write("\n                    </td>\n                    <td>\n                        <a href=\"javascript:showDivProcessInfo('ERROR_DTO_CONTENT');\">Detalle</a>\n                    </td>\n                </tr>\n");
              
                          }
              
              out.write("\n            <tr>\n                <td class=\"label\">\n                    ");
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_2);
                __jsp_taghandler_23.setCode("processDefinitionDTO.data");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                  if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                     throw new javax.servlet.jsp.SkipPageException();
                } catch (Throwable th) {
                  __jsp_taghandler_23.doCatch(th);
                } finally {
                  __jsp_taghandler_23.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
              }
              out.write("\n                </td>\n                <td>\n                    <a href=\"javascript:showDivProcessInfo('BUSINESS_DTO_CONTENT');\">Detalle</a>\n                </td>\n            </tr> \n        </table>\n");
              
                  }
                  
                  if(Boolean.valueOf(showTaskInfo)){
              
              out.write("\n\n    ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_24.setParent(__jsp_taghandler_2);
                __jsp_taghandler_24.setVar("tableWidth");
                __jsp_taghandler_24.setValue(tableWidth);
                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
              }
              out.write("\n    \n        <!-- Div para el detalle de las tareas -->\n        <div id=\"DETAIL_CONTENT\" class=\"popup\">\n            <table border=\"0\" width=\"250\" bgcolor=\"#3C3C3C\" cellspacing=\"0\" cellpadding=\"5\">\n                <tr>\n                    <td width=\"100%\">\n                        <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" height=\"36\">\n                            <tr>\n                                <td style=\"cursor:move\" width=\"100%\" onmousedown=\"javascript:comienzoMovimiento(event, 'DETAIL_CONTENT');\">\n                                </td>\n                                <td style=\"cursor:hand\" valign=\"top\">\n                                    <a href=\"#\" onClick=\"closeDiv('DETAIL_CONTENT');return false\"><font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">X</font></a>\n                                </td>\n                            </tr>\n                            <tr>\n                                <td width=\"100%\" bgcolor=\"#FFFFFF\" style=\"padding:4px\" colspan=\"2\">\n                                    <table align=\"center\">        \n                                        <th>\n                                            ");
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_25.setParent(__jsp_taghandler_2);
                __jsp_taghandler_25.setValue("Comentarios");
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
              }
              out.write("            \n                                        </th>\n                                        <tr align=\"center\">\n                                            <td>\n                                                <textarea id=\"COMMENT_AREA\" rows=\"12\" cols=\"66\" readonly=\"true\"></textarea>\n                                            </td>\n                                        </tr>\n                                    </table>\n                                </td>\n                            </tr>\n                        </table> \n                    </td>\n                </tr>\n            </table>\n        </div>\n    \n    <!-- Llamado al servicio para la creacion de la lista de tareas -->\n        ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_26.setParent(__jsp_taghandler_2);
                __jsp_taghandler_26.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tagutils:createPagedList(pageContext,'gob.shcp.bpm.service.ProcessTaskService','service','',idProcessInstance)}",java.lang.Boolean.class, __ojsp_varRes, __ojsp_fnmappers[0])));
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\n");
                    
                                    List data = (List)pageContext.getRequest().getAttribute(pageContext.getAttribute("displaySource").toString());
                                    if(!data.isEmpty()) {
                                        TaskListItemDTO currentRow = null;
                                        String format = null;
                                        String propertyHeader = null;
                                        String propertyName = null;            
                    
                    out.write("\n                  <!-- Creacion de la lista de tareas asignadas -->\n                    <table align=\"center\">\n                        <tr>\n                            <td>\n                                ");
                    {
                      org.displaytag.tags.TableTag __jsp_taghandler_27=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name decorator style class id sort");
                      __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_27.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${displaySource}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_27.setDecorator("gob.shcp.fsn.control.view.decorator.PagedListTableDecorator");
                      __jsp_taghandler_27.setStyle((java.lang.String) ("width:"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tableWidth}",java.lang.String.class, __ojsp_varRes, null)+"%;"));
                      __jsp_taghandler_27.setClass("displaytag");
                      __jsp_taghandler_27.setUid("row");
                      __jsp_taghandler_27.setSort("list");
                      java.lang.Object row = null;
                      java.lang.Integer row_rowNum = null;
                      __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_27,__jsp_tag_starteval,out);
                        do {
                          row = (java.lang.Object) pageContext.findAttribute("row");
                          row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
                          out.write("\n");
                          
                                                              for(int i=0; i<tableColumns.length; i++) {
                                                                  currentRow = (TaskListItemDTO)pageContext.getAttribute("row");
                                                                  propertyName = tableColumns[i];
                                                                  if(propertyName!=null && !"".equals(propertyName.trim())) {
                                                                      propertyHeader = getTitle(pageContext, tableHeaders, tableColumns, i);
                                                                      format = "";
                                                                      if(dateKeys.contains(propertyName.trim())) {
                                                                          format = "{0,date," + dateFormat + "}";
                                                                      }                        
                          
                          out.write("\n                                                ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_28=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property title format maxLength");
                            __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_28.setProperty(OracleJspRuntime.toStr( propertyName));
                            __jsp_taghandler_28.setTitle(OracleJspRuntime.toStr( propertyHeader));
                            __jsp_taghandler_28.setFormat(OracleJspRuntime.toStr( format));
                            __jsp_taghandler_28.setMaxLength(OracleJspRuntime.toInt( maxLength));
                            __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                            if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,4);
                          }
                          out.write("\n");
                          
                                                                  }
                                                              }                                
                          
                          out.write("\n                                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_29=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag");
                            __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                            __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
                              do {
                                out.write("\n");
                                
                                                                           if(currentRow.getObservaciones()!=null) {
                                                                                String taskComment = changeQuotes(currentRow.getObservaciones().toString());
                                
                                out.write("\n                                                <input type=\"hidden\" id=\"message");
                                out.write("\" value=\"");
                                out.print(taskComment);
                                out.write("\">\n                                                <a href=\"javascript:showDivComment('DETAIL_CONTENT','message");
                                out.write("');\"><img alt=\"procesar\" src=\"");
                                {
                                  org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                                  __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                                  __jsp_taghandler_30.setCode("detail.gif");
                                  try {
                                    __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                                    if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                  } catch (Throwable th) {
                                    __jsp_taghandler_30.doCatch(th);
                                  } finally {
                                    __jsp_taghandler_30.doFinally();
                                  }
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,5);
                                }
                                out.write("\" height=\"20\" width=\"20\" /></a>\n");
                                
                                                                            }
                                
                                out.write("\n                                    ");
                              } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                            if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,4);
                          }
                          out.write("                        \n                                    ");
                          {
                            org.displaytag.tags.SetPropertyTag __jsp_taghandler_31=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                            __jsp_taghandler_31.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_31.setName("basic.msg.empty_list");
                            __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_31,__jsp_tag_starteval,out);
                              do {
                                out.write("\n                                        <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                                {
                                  org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                                  __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                                  __jsp_taghandler_32.setText("Lista Vacia");
                                  try {
                                    __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                                    if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                  } catch (Throwable th) {
                                    __jsp_taghandler_32.doCatch(th);
                                  } finally {
                                    __jsp_taghandler_32.doFinally();
                                  }
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,5);
                                }
                                out.write("<br><br></span>\n                                    ");
                              } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                            if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,4);
                          }
                          out.write("\n                                ");
                        } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,3);
                    }
                    out.write("\n                            </td>\n                        </tr>\n                    </table>\n");
                    
                                    }else{
                    
                    out.write("\n                    ");
                    {
                      org.displaytag.tags.TableTag __jsp_taghandler_33=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name decorator style class id sort");
                      __jsp_taghandler_33.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_33.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${displaySource}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_33.setDecorator("gob.shcp.fsn.control.view.decorator.PagedListTableDecorator");
                      __jsp_taghandler_33.setStyle((java.lang.String) ("width:"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tableWidth}",java.lang.String.class, __ojsp_varRes, null)+"%;"));
                      __jsp_taghandler_33.setClass("displaytag");
                      __jsp_taghandler_33.setUid("row");
                      __jsp_taghandler_33.setSort("list");
                      java.lang.Object row = null;
                      java.lang.Integer row_rowNum = null;
                      __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_33,__jsp_tag_starteval,out);
                        do {
                          row = (java.lang.Object) pageContext.findAttribute("row");
                          row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
                          out.write("                      \n                        ");
                          {
                            org.displaytag.tags.SetPropertyTag __jsp_taghandler_34=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                            __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                            __jsp_taghandler_34.setName("basic.msg.empty_list");
                            __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_34,__jsp_tag_starteval,out);
                              do {
                                out.write("\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                                {
                                  org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                                  __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                                  __jsp_taghandler_35.setText("Proceso Sin Tareas");
                                  try {
                                    __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                                    if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                  } catch (Throwable th) {
                                    __jsp_taghandler_35.doCatch(th);
                                  } finally {
                                    __jsp_taghandler_35.doFinally();
                                  }
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,5);
                                }
                                out.write("<br><br></span>\n                        ");
                              } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                            if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,4);
                          }
                          out.write("\n                    ");
                        } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                      }
                      if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,3);
                    }
                    out.write("\n");
                    
                                    }
                    
                    out.write("\n        ");
                  } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
              }
              out.write("\n");
              
                  }
              
              out.write("\n");
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
        }
        out.write("\n\n");
            
            if(Boolean.valueOf(showPopUp)){
        
        out.write("      \n        <div id=\"PARENT_DIV\" class=\"popup\">\n            <table border=\"0\" width=\"250\" bgcolor=\"#3C3C3C\" cellspacing=\"0\" cellpadding=\"5\">\n                <tr>\n                    <td width=\"100%\">\n                        <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" height=\"36\">\n                            <tr>\n                                <td style=\"cursor:move\" width=\"100%\" onmousedown=\"javascript:comienzoMovimiento(event, 'PARENT_DIV');\">\n                                </td>\n                                <td style=\"cursor:hand\" valign=\"top\">\n                                    <a href=\"#\" onClick=\"closeDiv('PARENT_DIV');return false\"><font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">X</font></a>\n                                </td>\n                            </tr>\n                            <tr>\n                                <td width=\"100%\" bgcolor=\"#FFFFFF\" style=\"padding:4px\" colspan=\"2\">\n                                    <div style=\"height:");
        out.print(heightPopUp);
        out.write("px;width:");
        out.print(widthPopUp);
        out.write("px;overflow:auto;\">\n                                        ");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
          __jsp_taghandler_36.setParent(null);
          __jsp_taghandler_36.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${TAG_CONTENT}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_taghandler_36.setEscapeXml(false);
          __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
          if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,1);
        }
        out.write("            \n                                    </div>\n                                </td>\n                            </tr>\n                        </table> \n                    </td>\n                </tr>\n            </table>\n        </div>        \n        <a href=\"javascript:showDivProcessInfo('PARENT_DIV');\">");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
          __jsp_taghandler_37.setParent(null);
          __jsp_taghandler_37.setValue(messageLink);
          __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
          if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,1);
        }
        out.write("</a>\n");
        
            }else{
        
        out.write("\n        ");
        {
          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value escapeXml");
          __jsp_taghandler_38.setParent(null);
          __jsp_taghandler_38.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${TAG_CONTENT}",java.lang.Object.class, __ojsp_varRes,null));
          __jsp_taghandler_38.setEscapeXml(false);
          __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
          if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
             throw new javax.servlet.jsp.SkipPageException();
          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,1);
        }
        out.write("\n");
        
            }
        
        out.write("\n\n<script type=\"text/javascript\">\n    \n    function showDivComment(divComment,idHidden) {    \n       if(idHidden == null){\n        idHidden = \"\";\n       }\n       document.getElementById(\"COMMENT_AREA\").value = document.getElementById(idHidden).value;          \n        showDivProcessInfo(divComment);\n    }\n    \n    function showDivProcessInfo(divId) {\n        if (document.getElementById(divId).style.visibility == \"visible\"){\n            closeDiv(divId);\n        } else {            \n            centerInScreen(document.getElementById(divId), '");
        out.print(leftPosition);
        out.write("', '");
        out.print(topPosition);
        out.write("');\n            document.getElementById(divId).style.visibility=\"visible\";\n        }\n    }\n    \n    function closeDiv(divId){                \n        if(divId == \"PARENT_DIV\"){\n            if(document.getElementById(\"ERROR_DTO_CONTENT\")){                \n                document.getElementById(\"ERROR_DTO_CONTENT\").style.visibility=\"hidden\";\n            }\n            if(document.getElementById(\"BUSINESS_DTO_CONTENT\")){                \n                document.getElementById(\"BUSINESS_DTO_CONTENT\").style.visibility=\"hidden\";\n            }\n            if(document.getElementById(\"DETAIL_CONTENT\")){                \n                document.getElementById(\"DETAIL_CONTENT\").style.visibility=\"hidden\";\n            }            \n            if(document.getElementById(\"PARENT_DIV\")){                \n                document.getElementById(\"PARENT_DIV\").style.visibility=\"hidden\";\n            }                                         \n        }else{\n            document.getElementById(divId).style.visibility=\"hidden\";\n        } \n    }\n\n    carga();\n</script>\n\n");
        
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
        new TagAttributeInfo("headers",false,"java.lang.String",true,false),
        new TagAttributeInfo("columns",false,"java.lang.String",true,false),
        new TagAttributeInfo("dateFormat",false,"java.lang.String",true,false),
        new TagAttributeInfo("showProcessInfo",false,"java.lang.String",true,false),
        new TagAttributeInfo("showTaskInfo",false,"java.lang.String",true,false),
        new TagAttributeInfo("tableWidth",false,"java.lang.String",true,false),
        new TagAttributeInfo("leftPosition",false,"java.lang.String",true,false),
        new TagAttributeInfo("topPosition",false,"java.lang.String",true,false),
        new TagAttributeInfo("heightPopUp",false,"java.lang.String",true,false),
        new TagAttributeInfo("widthPopUp",false,"java.lang.String",true,false),
        new TagAttributeInfo("showPopUp",false,"java.lang.String",true,false),
        new TagAttributeInfo("messageLink",false,"java.lang.String",true,false),
        new TagAttributeInfo("maxLength",false,"java.lang.String",true,false)};

      tagInfo = new TagInfo("taskListBlog","_oracle._jsp._tag._taskListBlog_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
