<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO">
    <html:hidden path="qnaCapturaRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.contrato.detalle.titulo.link"/>
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
                <td align="right" class="label">* Quincena</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaCaptura" progress="true" />
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
                                            action="reporteMoviminentos/terminosContrato.do"/>
                            </td>
                            <td align="left">
                                <fsn:submit value="submit.cancel" 
                                            path="cancel" 
                                            action="reporteMoviminentos/terminosContrato.do"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" height="20px">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        
        <c:if test="${ reportesMovtoNominaDTO.idUnidad ne null or reportesMovtoNominaDTO.qnaCaptura!='0' }">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesMovtoNominaDTO.unidades}"/>
                        <fsn:reportParam name="PAR_QNA" value="${reportesMovtoNominaDTO.qnaCaptura}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/movimientosNomina/terminosContrato" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="terminosContrato" 
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