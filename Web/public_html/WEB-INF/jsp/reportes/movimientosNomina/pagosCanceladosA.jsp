<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesConstanciasDTO" >
   
    <h1>
        <strong>
            <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45;
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.pagosCanceladosA.detalle.titulo.link"/>
       </strong>
    </h1>
    <table width="50%">
         <tr>
            <td align="right" class="label"> <spring:message code="sireh.label.reportes.qnaIni"></spring:message></td>
            <td align="left">
                <fsn:option key="0" value="selectList.nonValue"/>
                <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaIni" progress="true"/>
            </td>
        </tr>
         <tr>
            <td align="right" class="label"> <spring:message code="sireh.label.reportes.qnaFin"></spring:message></td>
            <td align="left">
                <fsn:option key="0" value="selectList.nonValue"/>
                <fsn:selectList beanName="listaQuincenasAnterioresFinales"  path="qnaFin"  progress="true" parentPath="qnaIni"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td align="right">
                <fsn:submit value="submit.accept" 
                            path="muestraReporte"
                            action="reporteMoviminentos/pagosCanceladosA.do"/>
            </td>
            <td align="left">
                <fsn:submit value="submit.cancel" 
                            path="clean" 
                            action="reporteMoviminentos/pagosCanceladosA.do"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" height="20px">&nbsp;</td>
        </tr>
    </table>
    <c:if test="${reportesConstanciasDTO.muestraReporte}">
        <table>
            <tr>
                <th align="left"></th>
            </tr>
            <tr>
                <td align="left">
                    <fsn:reportParam name="PAR_QNA_INI" value="${reportesConstanciasDTO.qnaIni}"/>
                    <fsn:reportParam name="PAR_QNA_FIN" value="${reportesConstanciasDTO.qnaFin}"/>
                    <fsn:report provider="jasper" 
                                viewUri="/movimientosNomina/pagosCanceladosPeriodoArch" 
                                imagesUri="/images/reports" 
                                format="pdf" 
                                fileName="historico" 
                                export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                width="1060" 
                                height="350"/>
                </td>
            </tr>
        </table>
    </c:if>

</html:form>