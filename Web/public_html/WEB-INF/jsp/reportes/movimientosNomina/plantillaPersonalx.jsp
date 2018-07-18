<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO">
    <html:hidden path="uniCicloRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="reporte.movimientos.nomina.plantilla.personalx"/>
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
                                    path="idUnidad"  progress="true"
                                    uppercase="false"/>

                </td>
            </tr>  
            <tr>
                <td align="right" class="label">Situacion plaza</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcSituacionPlaza" 
                                    path="situacionPlaza"
                                    uppercase="false"/>

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
                                            action="reporteMoviminentos/plantillaPersonalx.do"/>
                            </td>
                            <td align="left">
                                <fsn:submit value="submit.cancel" 
                                            path="cancel" 
                                            action="reporteMoviminentos/plantillaPersonalx.do"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" height="20px">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
               <c:if test="${ (reportesMovtoNominaDTO.idUnidad ne null) }">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesMovtoNominaDTO.unidades}"/>
                        <fsn:reportParam name="PAR_SIT_PLAZA" value="${reportesMovtoNominaDTO.situacionPlaza}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/movimientosNomina/plantillaPersonalxlsx" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="plantillaPersonalxlsx" 
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