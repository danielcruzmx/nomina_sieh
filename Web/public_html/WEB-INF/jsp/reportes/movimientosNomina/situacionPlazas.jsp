<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO" action="situacionPlazas.do">
    <html:hidden path="idPlazaRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.plaza.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
            <tr>
                    <td  align="right" class="label"> * <spring:message code="sireh.label.merito.label.plaza"></spring:message></td>
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
                                action="reporteMoviminentos/situacionPlazas.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteMoviminentos/situacionPlazas.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        <c:if test="${ (reportesMovtoNominaDTO.idPlaza!=null)}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left" style="z-index: 1;">
                        <fsn:reportParam name="PAR_PLAZA" value="${reportesMovtoNominaDTO.idPlaza}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/movimientosNomina/situacionPlazas" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="situacionPlazas" 
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