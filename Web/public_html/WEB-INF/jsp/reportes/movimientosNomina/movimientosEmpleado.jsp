<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO" action="movimientosEmpleado.do">

    <html:hidden path="idUnidadRequired"/>
    <html:hidden path="qnaIniRequired"/>
    <html:hidden path="qnaFinRequired"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.movimiento.detalle.titulo.link"/>
        </strong>
    </h1>

    <p>&nbsp;</p>
    <div align="center">
        <table>
            <tr>
                <td align="right" class="label">Unidad</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadSinCiclo" 
                                    path="idUnidad" 
                                    progress="true" 
                                    uppercase="false"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label">* Fecha Inicial</td>
                <td align="left">
                    <fsn:calendar path="fecInicial" size="10"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label">* Fecha Final</td>
                <td align="left">
                    <fsn:calendar path="fecFinal" size="10"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <table width="100%">
                        <tr>
                            <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                        </tr>
                        <tr>
                            <td align="right">
                                <fsn:submit value="submit.accept" 
                                            path="muestraReporte"
                                            action="reporteMoviminentos/movimientosEmpleado.do"/>
                            </td>
                            <td align="left">
                                <fsn:submit value="submit.cancel" 
                                            path="cancel" 
                                            action="reporteMoviminentos/movimientosEmpleado.do"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" height="20px">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        
        <c:if test="${ reportesMovtoNominaDTO.idUnidad ne null && reportesMovtoNominaDTO.fecInicial!=null && reportesMovtoNominaDTO.fecFinal!=null}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesMovtoNominaDTO.unidades}"/>
                        <fsn:reportParam name="PAR_FECINI" value="${reportesMovtoNominaDTO.fecInicialCad}"/>
                        <fsn:reportParam name="PAR_FECFIN" value="${reportesMovtoNominaDTO.fecFinalCad}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/movimientosNomina/movimientosEmpleado" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="movimientosEmpleado" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
    </div>
    <p>&nbsp;</p>
    <div align="center"></div>
    <p>&nbsp;</p>
    <div align="center"></div>
    <p>&nbsp;</p>
    <div align="center"></div>
</html:form>