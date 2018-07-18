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
import gob.shcp.sireh.model.merito.ResumenMeritoDTO;
import gob.shcp.sireh.service.merito.MeritoService;
import gob.shcp.sireh.model.merito.ResumenMeritoDTO.CausalConsecutividad;
import gob.shcp.sireh.model.merito.ResumenMeritoDTO.PuntoCausalConsecutividad;
import gob.shcp.sireh.model.merito.ResumenMeritoDTO.EncabezadoConsecutividad;


public class _graficaMerito_tag extends javax.servlet.jsp.tagext.SimpleTagSupport  implements oracle.jsp.runtime.OracleTagFile
{


  // ** Begin Declarations


  // ** End Declarations

  private TagInfo tagInfo = null;
  private JspContext jspContext;
  private java.io.Writer _jspFragWriter;
  private java.lang.String rfc;

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


        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n\n");
        out.write("\n");
        out.write("\n \n");
        
            try{
                ResumenMeritoDTO resumenMeritoDTO = new ResumenMeritoDTO();
                resumenMeritoDTO.setTdNmrRfc(rfc);
                resumenMeritoDTO = TagUtils.getService(pageContext, MeritoService.class).getEmpleadoInfoResumenGraficaMerito(resumenMeritoDTO);
                int anio = resumenMeritoDTO.getAnioIni();
                int renglon = 1;
                
        
        out.write("\n        <table width=\"100%\" align=\"center\" border=\"0\">\n            <tr bgcolor=\"#E6D258\"> <!-- TITULO TABLA -->\n                <td colspan=\"");
        out.print(resumenMeritoDTO.getTamanioEncabezadoConsecutividadList()+1 );
        out.write("\" align=\"center\">");
        out.print( TagUtils.getPropertyResourcesValue(pageContext,"sireh.label.merito.resumen.detalle.historico.ano") );
        out.write("</td>\n            </tr>\n            <tr bgcolor=\"#E6D258\">\n                <td>&nbsp;</td>\n");
        
                         for(EncabezadoConsecutividad encabezado : resumenMeritoDTO.getEncabezadoConsecutividadList() ) 
                         {
        
        out.write("\n                <td align=\"center\">");
        out.print( encabezado.getConsecutivo());
        out.write("</td><!-- CONSECUTIVO -->\n");
         
                        } 
        
        out.write("\n            </tr>\n            <tr bgcolor=\"#5E8BC2\">\n                <td>&nbsp;</td>\n");
        
                        for(EncabezadoConsecutividad encabezado : resumenMeritoDTO.getEncabezadoConsecutividadList() ) 
                        {
        
        out.write("\n                 <td align=\"center\">");
        out.print( encabezado.getTdNmhCiclo());
        out.write("</td><!-- AÑO -->\n");
         
                        }
        
        out.write("\n            </tr>       \n");
        
                    for(CausalConsecutividad causal : resumenMeritoDTO.getCausalConsecutividadList()) {
        
        out.write("\n            <tr bgcolor='");
        out.print( causal.getColor() );
        out.write("'>\n                <td align=\"right\">\n                    ");
        out.print( causal.getNombreCausal() );
        out.write(" <!-- NOMBRE CAUSAL -->\n                </td>\n");
        
                        for(PuntoCausalConsecutividad punto : causal.getPuntoCausalConsecutividadList()){
                            if(renglon == 6){ 
                                if(anio >= 2015){
        
        out.write("                        \n                            <td align=\"center\" bgcolor=\"#FFBA00\">\n");
                                    
                                } else { 
        
        out.write("                              <td align=\"center\" bgcolor='");
        out.print( causal.getColor() );
        out.write("'>\n");
                                 }
                            } else {
        
        out.write("\n                        <td align=\"center\" bgcolor='");
        out.print( causal.getColor() );
        out.write("'>\n");
        
                                }
                            if(!punto.isMuestraValor() && punto.getPunto() > 0){
        
        out.write("\n                    X\n");
        
                            }
                            if(!punto.isMuestraValor() && punto.getPunto() == 0){
        
        out.write("\n                    ");
        out.print( new String(" "));
        out.write("\n");
        
                            }
                            if(punto.isMuestraValor()){
        
        out.write("                    \n                      ");
        out.print(punto.getPunto());
        out.write("\n");
                              
                           } 
        
        out.write("\n                </td>\n");
        
                   anio++;  }   
        
        out.write("\n            </tr>\n");
        
                renglon++; 
        anio = resumenMeritoDTO.getAnioIni();
          }
        
        out.write("\n            <tr>\n                <td colspan=\"");
        out.print( resumenMeritoDTO.getTamanioEncabezadoConsecutividadList()+1 );
        out.write("\" align=\"center\">");
        out.print( TagUtils.getPropertyResourcesValue(pageContext,"sireh.label.merito.resumen.detalle.nota") );
        out.write("</td>\n            </tr>  \n        </table>\n");
        
                } catch(Exception e) {   e.printStackTrace();   }
        
        out.write("\n  \n");
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
        new TagAttributeInfo("rfc",true,"java.lang.String",true,false)};

      tagInfo = new TagInfo("graficaMerito","_oracle._jsp._tag._graficaMerito_tag","SCRIPTLESS","null",tlib,null,tagAttributeInfo,"null","null","null",tagVariableInfos,false);
      return tagInfo;
    }

}
