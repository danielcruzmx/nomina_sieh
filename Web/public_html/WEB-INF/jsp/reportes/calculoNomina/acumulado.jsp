<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesCalculoNominaDTO" action="acumulado.do">
    <html:hidden path="rfcRequired"/>
    <html:hidden path="qnaIniRequired"/>
    <html:hidden path="qnaFinRequired"/>
    <html:hidden path="conceptoRequired"/>
    <html:hidden path="tipoCptoRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.calculo.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.acumulado.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.rfc"></spring:message></td>
                <td align="left">
                    <fsn:helpRoutine path="rfcEmpleado"
                                     maxlength="16"
                                     size="16" 
                                     disabled="true" 
                                     beanName="EmpleadosDetalleHistorico"
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
                <td align="right" class="label">* Quincena inicio</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaIni" progress="true" />
                </td>
            </tr>
            <tr>
                <td align="right" class="label">* Quincena fin</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnterioresFinales"  path="qnaFin"  progress="true"
                                    parentPath="qnaIni"/>
                </td>
            </tr>  
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.tipoCpto"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcTipoConcepto"  path="tipoCpto"  />
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.concepto"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcConceptoPagoByTipoCpto"  path="concepto" progress="true" parentPath="tipoCpto" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteCalculo/acumulado.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteCalculo/acumulado.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
               <c:if test="${ (reportesCalculoNominaDTO.rfcEmpleado!=null)  &&  (reportesCalculoNominaDTO.concepto!='0') &&  (reportesCalculoNominaDTO.qnaIni!='0') &&  (reportesCalculoNominaDTO.qnaFin!='0') &&  (reportesCalculoNominaDTO.tipoCpto!='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_RFC" value="${reportesCalculoNominaDTO.rfcEmpleado}"/>
                        <fsn:reportParam name="PAR_QNA_INI" value="${reportesCalculoNominaDTO.qnaIni}"/>
                        <fsn:reportParam name="PAR_QNA_FIN" value="${reportesCalculoNominaDTO.qnaFin}"/>
                        <fsn:reportParam name="PAR_CPTO" value="${reportesCalculoNominaDTO.concepto}"/>
                        <fsn:reportParam name="PAR_TIPO_CPTO" value="${reportesCalculoNominaDTO.tipoCpto}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/calculoNomina/acumulado" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="acumulado" 
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