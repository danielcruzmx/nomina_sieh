<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reporteNotasDeMeritoDTO">
    <h1>
        <strong>
            <spring:message code="sireh.label.merito.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.merito.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.merito.reportes.personalactivo.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table width="60%">
            <tr>
                <td  align="right" class="label"><spring:message code="sireh.label.merito.label.rfc"></spring:message></td>
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
                                action="reporteNotasMerito/repNMPersonalAct.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteNotasMerito/repNMPersonalAct.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
           <c:if test="${reporteNotasDeMeritoDTO.muestraReporte}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_RFC" value="${reporteNotasDeMeritoDTO.rfcEmpleado}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/merito/repNMPersonalAct" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="repNMPersonalAct" 
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