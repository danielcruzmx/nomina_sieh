package _oracle._jsp._tag;

import oracle.jsp.runtime.*;
import oracle.jsp.el.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.el.*;
import gob.shcp.fsn.control.view.util.TagUtils;
import gob.shcp.fsn.service.security.SecurityService;


public class _browserCtrl_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;

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


        out.write("\n");
        out.write("\n\n\n");
        
            try{
        
        out.write("\n    <script type=\"text/javascript\">\n");
        
               final SecurityService securityService = TagUtils.security(pageContext);
               if(securityService.isInterfaceProtected()) {
        
        out.write("\n          // Bloqueo del boton derecho y central del mouse\n          function mouseDown(e) {\n             if (parseInt(navigator.appVersion)>3) {\n                var clickType=1;\n                if (navigator.appName==\"Netscape\") clickType=e.which;\n                else clickType=event.button;\n                if (clickType!=1) {               \n                   alert ('Funcionalidad no permitida!');\n                   return false;\n                }\n             }\n             return true;\n          }\n          \n          // asociacion del evento \"mousedown\" con la funcion mouseDown(e)\n          function disableMouse(){\n             if (parseInt(navigator.appVersion)>3) {\n                document.onmousedown = mouseDown;\n                \n                if (navigator.appName==\"Netscape\") \n                   document.captureEvents(Event.MOUSEDOWN);         \n             }\n          }\n          \n          // liberacion del evento \"mousedown\"\n          function releaseMouse(){\n             if (parseInt(navigator.appVersion)>3) {\n                document.onmousedown = null;\n                \n                if (navigator.appName==\"Netscape\") \n                   document.releaseEvents(Event.MOUSEDOWN);         \n             }\n          }\n");
        
               } else {
        
        out.write("\n          function disableMouse(){}      \n          function releaseMouse(){}\n");
        
               }
        
        out.write("\n    \n          //Inicializacion del manejo del evento mousedown\n          disableMouse();   \n    </script>\n\n");
        
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
      TagAttributeInfo[] tagAttributeInfo = new TagAttributeInfo[0];
      tagInfo = new TagInfo("browserCtrl","_oracle._jsp._tag._browserCtrl_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
