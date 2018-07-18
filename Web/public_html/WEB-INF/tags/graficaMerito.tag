<%@ tag import="org.springframework.web.util.ExpressionEvaluationUtils"%>
<%@ tag import="gob.shcp.fsn.control.view.util.TagUtils" %>
<%@ tag import="gob.shcp.sireh.model.merito.ResumenMeritoDTO" %>
<%@ tag import="gob.shcp.sireh.service.merito.MeritoService" %>
<%@ tag import="gob.shcp.sireh.model.merito.ResumenMeritoDTO.CausalConsecutividad" %>
<%@ tag import="gob.shcp.sireh.model.merito.ResumenMeritoDTO.PuntoCausalConsecutividad" %>
<%@ tag import="gob.shcp.sireh.model.merito.ResumenMeritoDTO.EncabezadoConsecutividad" %>

<%@ attribute name="rfc" required="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<%
    try{
        ResumenMeritoDTO resumenMeritoDTO = new ResumenMeritoDTO();
        resumenMeritoDTO.setTdNmrRfc(rfc);
        resumenMeritoDTO = TagUtils.getService(pageContext, MeritoService.class).getEmpleadoInfoResumenGraficaMerito(resumenMeritoDTO);
        int anio = resumenMeritoDTO.getAnioIni();
        int renglon = 1;
        
%>
        <table width="100%" align="center" border="0">
            <tr bgcolor="#E6D258"> <!-- TITULO TABLA -->
                <td colspan="<%=resumenMeritoDTO.getTamanioEncabezadoConsecutividadList()+1 %>" align="center"><%= TagUtils.getPropertyResourcesValue(pageContext,"sireh.label.merito.resumen.detalle.historico.ano") %></td>
            </tr>
            <tr bgcolor="#E6D258">
                <td>&nbsp;</td>
<%
                 for(EncabezadoConsecutividad encabezado : resumenMeritoDTO.getEncabezadoConsecutividadList() ) 
                 {
%>
                <td align="center"><%= encabezado.getConsecutivo()%></td><!-- CONSECUTIVO -->
<% 
                } 
%>
            </tr>
            <tr bgcolor="#5E8BC2">
                <td>&nbsp;</td>
<%
                for(EncabezadoConsecutividad encabezado : resumenMeritoDTO.getEncabezadoConsecutividadList() ) 
                {
%>
                 <td align="center"><%= encabezado.getTdNmhCiclo()%></td><!-- AÑO -->
<% 
                }
%>
            </tr>       
<%
            for(CausalConsecutividad causal : resumenMeritoDTO.getCausalConsecutividadList()) {
%>
            <tr bgcolor='<%= causal.getColor() %>'>
                <td align="right">
                    <%= causal.getNombreCausal() %> <!-- NOMBRE CAUSAL -->
                </td>
<%
                for(PuntoCausalConsecutividad punto : causal.getPuntoCausalConsecutividadList()){
                    if(renglon == 6){ 
                        if(anio >= 2015){
%>                        
                            <td align="center" bgcolor="#FFBA00">
<%                            
                        } else { 
%>                              <td align="center" bgcolor='<%= causal.getColor() %>'>
<%                         }
                    } else {
%>
                        <td align="center" bgcolor='<%= causal.getColor() %>'>
<%
                        }
                    if(!punto.isMuestraValor() && punto.getPunto() > 0){
%>
                    X
<%
                    }
                    if(!punto.isMuestraValor() && punto.getPunto() == 0){
%>
                    <%= new String(" ")%>
<%
                    }
                    if(punto.isMuestraValor()){
%>                    
                      <%=punto.getPunto()%>
<%                      
                   } 
%>
                </td>
<%
           anio++;  }   
%>
            </tr>
<%
        renglon++; %><%anio = resumenMeritoDTO.getAnioIni();%><%  }
%>
            <tr>
                <td colspan="<%= resumenMeritoDTO.getTamanioEncabezadoConsecutividadList()+1 %>" align="center"><%= TagUtils.getPropertyResourcesValue(pageContext,"sireh.label.merito.resumen.detalle.nota") %></td>
            </tr>  
        </table>
<%
        } catch(Exception e) {   e.printStackTrace();   }
%>
  
