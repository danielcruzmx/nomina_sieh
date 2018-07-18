<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO">
    <h1>
        <strong>
    <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
    <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
    <spring:message code="sireh.label.movimiento.nomina.reportes.vacacional.detalle.titulo.link"/>
            </strong>
    </h1>

    <html:hidden path="uniCicloRequired"/>
    <html:hidden path="mesQnaRequired"/>

<p>&nbsp;</p>
<div align="center">
 <table width="50%">
            <tr>
                <td align="right" class="label">* Ciclo</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadCicloReportes"  path="uniCiclo"/>

                </td>
            </tr>        
                        <tr>
                <td align="right" class="label">* Mes</td>
                <td align="left">
                    <html:select path="mesQna">
                        <html:option value="" label="SELECCIONE..."/>
                        <html:option value="Mayo" label="1er Semestre"/>
                        <html:option value="Diciembre" label="2do Semestre"/>
                    </html:select>
                </td>
            </tr>       
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteMoviminentos/primaVacacional.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteMoviminentos/primaVacacional.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
               <c:if test="${ (reportesMovtoNominaDTO.uniCiclo!='0') &&  (reportesMovtoNominaDTO.mesQna!=null)}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesMovtoNominaDTO.unidades}"/>
                        <fsn:reportParam name="PAR_CICLO" value="${reportesMovtoNominaDTO.uniCiclo}"/>
                        <fsn:reportParam name="PAR_MES" value="${reportesMovtoNominaDTO.mesQna}"/>
                        <fsn:reportParam name="PAR_SEMESTRE" value="${reportesMovtoNominaDTO.semestre}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/movimientosNomina/primaVacacional" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="primaVacacional" 
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