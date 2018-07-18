<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesCalculoNominaDTO" action="historicoPlaza.do">
    <h1>
        <strong>
    <spring:message code="sireh.label.calculo.reportes.titulo.link"/> &#45; 
    <spring:message code="sireh.label.calculo.reportes.seccion.titulo.link"/> &#45; 
    <spring:message code="sireh.label.calculo.reportes.historicoplaza.detalle.titulo.link"/>
            </strong>
    </h1>

    <html:hidden path="idPlazaOrRfcRequired"/>
    

<p>&nbsp;</p>
    <div align="center">
        <table>
            <tr>
                <td  align="right" class="label">  <spring:message code="sireh.label.reportes.rfc"></spring:message></td>
                <td align="left">
                    <fsn:helpRoutine path="rfcEmpleado"
                                     maxlength="16"
                                     size="16" 
                                     disabled="true" 
                                     beanName="EmpleadosDetalle"
                                     width="1000" 
                                     height="400"  
                                     fieldMapping="rfcEmpleado" 
                                     title="Seleccione el RFC" 
                                     maxRows="100"
                                     leftPosition="17"
                                     topPosition="20"/>
                </td>
            </tr>  
            <tr>
                <td  align="right" class="label">  <spring:message code="sireh.label.reportes.plaza"></spring:message></td>
                <td align="left">
                    <fsn:helpRoutine path="idPlaza"
                                     maxlength="16"
                                     size="16" 
                                     disabled="true" 
                                     beanName="PlazasDetalle"
                                     width="1000" 
                                     height="400"  
                                     fieldMapping="idPlaza" 
                                     title="Seleccione la Plaza" 
                                     maxRows="200"
                                     leftPosition="17"
                                     topPosition="20"/>
                </td>
            </tr>  
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteCalculo/historicoPlaza.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteCalculo/historicoPlaza.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
               <c:if test="${ (reportesCalculoNominaDTO.rfcEmpleado!=null)}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>

                <c:if test="${reportesCalculoNominaDTO.rfcEmpleado ne ''}">
                    <tr>
                    <td align="left">

                        <fsn:reportParam name="PAR_RFC" value="${reportesCalculoNominaDTO.rfcEmpleado}"/>
                        
                        <fsn:report provider="jasper" 
                                    viewUri="/calculoNomina/historicoRfc" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="historicoRfc" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                    </tr>
                </c:if>
                <c:if test="${reportesCalculoNominaDTO.idPlaza ne ''}">
                    <tr>
                    <td align="left">

                        <fsn:reportParam name="PAR_IDPLAZA" value="${reportesCalculoNominaDTO.idPlaza}"/>

                        <fsn:report provider="jasper" 
                                    viewUri="/calculoNomina/historicoPlaza" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="historicoPlaza" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                    </tr>
                </c:if>

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