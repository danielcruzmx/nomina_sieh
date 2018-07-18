<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reporteNotasDeMeritoDTO">
    <html:hidden path="fecInicioRequired"/>
    <html:hidden path="fecFinRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.merito.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.merito.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.merito.reportes.mensual.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
             <tr>
                <td align="right" class="label">* Fecha inicio</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                     <fsn:calendar path="fecInicio" size="10"/>
                    
                </td>
            </tr>
             <tr>
                <td align="right" class="label">* Fecha final</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:calendar path="fecFin" size="10"/>
                </td>
            </tr>
          
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteNotasMerito/repNMMensual.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteNotasMerito/repNMMensual.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
            <c:if test="${ (reporteNotasDeMeritoDTO.fecInicio!=null)  &&  (reporteNotasDeMeritoDTO.fecFin!=null)}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_FECINI" value="${reporteNotasDeMeritoDTO.fecInicio}"/>
                        <fsn:reportParam name="PAR_FECFIN" value="${reporteNotasDeMeritoDTO.fecFin}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/merito/repNMMensual" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="repNMMensual" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
</div>
<p>&nbsp;</p>
<div align="center">
  
</div>
<p>&nbsp;</p>
<div align="center">
  
</div>
<p>&nbsp;</p>
<div align="center">
  
</div>
</html:form>