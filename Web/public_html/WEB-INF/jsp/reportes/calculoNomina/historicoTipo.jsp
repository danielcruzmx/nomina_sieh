<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesCalculoNominaDTO" action="historicoTipo.do">
    <html:hidden path="rfcUnicoRequired"/>
    <html:hidden path="qnaIniRequired"/>
    <html:hidden path="qnaFinRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.calculo.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.historicotipo.detalle.titulo.link"/>
       </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
            <tr>
                <td  align="right" class="label"> <spring:message code="sireh.label.reportes.rfc"></spring:message></td>
                <td align="left">
                    <fsn:helpRoutine path="rfcUnico"
                                     maxlength="16"
                                     size="16" 
                                     disabled="true" 
                                     beanName="empleadosDetalleHistorico"
                                     width="1000" 
                                     height="400"  
                                     fieldMapping="rfcUnico" 
                                     title="Seleccione el RFC" 
                                     maxRows="100"
                                     leftPosition="17"
                                     topPosition="20"/>
                </td>
            </tr>    
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
                    <fsn:selectList beanName="listaQuincenasAnterioresFinales"  path="qnaFin"  progress="true"
                                    parentPath="qnaIni"/>
                </td>
            </tr>  
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteCalculo/historicoTipo.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteCalculo/historicoTipo.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
               <c:if test="${ (reportesCalculoNominaDTO.rfcUnico!=null)  && (reportesCalculoNominaDTO.qnaIni!='0') &&  (reportesCalculoNominaDTO.qnaFin!='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_RFC" value="${reportesCalculoNominaDTO.rfcUnico}"/>
                        <fsn:reportParam name="PAR_QNA_INI" value="${reportesCalculoNominaDTO.qnaIni}"/>
                        <fsn:reportParam name="PAR_QNA_FIN" value="${reportesCalculoNominaDTO.qnaFin}"/>
                        <fsn:reportParam name="PAR_MAX_PAG" value="${reportesCalculoNominaDTO.maxPag}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/calculoNomina/historicoTipo" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="historicoTipo" 
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