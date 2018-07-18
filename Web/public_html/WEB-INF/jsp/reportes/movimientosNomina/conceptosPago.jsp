<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO">
    <html:hidden path="idUnidadRequired"/>
    <html:hidden path="tipoCptoRequired"/>
    <html:hidden path="qnaIniRequired"/>
    <html:hidden path="qnaFinRequired"/>
    <html:hidden path="conceptoRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.pago.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table width="70%">
            <colgroup>
                <col width="30%"/>
                <col width="70%"/>
            </colgroup>
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
                <td align="right" class="label">*Tipo Concepto</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcTipoConcepto"  path="tipoCpto"  />
                </td>
            </tr>
             <tr>
                <td align="right" class="label">* Concepto</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcConceptoPagoByTipoCpto"  path="concepto"  progress="true" parentPath="tipoCpto"/>
                </td>
            </tr>
             <tr>
                <td align="right" class="label">Situaci&oacute;n Concepto</td>
                <td align="left">
                    <fsn:option key="" value="selectList.nonValue"/>
                    <fsn:selectList beanName="catalogoSitCaptura"  path="situacionCaptura" />
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
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteMoviminentos/conceptosPago.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteMoviminentos/conceptosPago.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
               <c:if test="${ (reportesMovtoNominaDTO.idUnidad ne null)  &&  (reportesMovtoNominaDTO.qnaIni!='0') &&  (reportesMovtoNominaDTO.qnaFin!='0') &&  (reportesMovtoNominaDTO.concepto!='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesMovtoNominaDTO.unidades}"/>
                        <fsn:reportParam name="PAR_TIPO_CPTO" value="${reportesMovtoNominaDTO.tipoCpto}"/>
                        <fsn:reportParam name="PAR_QNA_INI" value="${reportesMovtoNominaDTO.qnaIniNumber}"/>
                        <fsn:reportParam name="PAR_QNA_FIN" value="${reportesMovtoNominaDTO.qnaFinNumber}"/>
                        <fsn:reportParam name="PAR_CPTO" value="${reportesMovtoNominaDTO.concepto}"/>
                        <fsn:reportParam name="PAR_SIT_CAP" value="${reportesMovtoNominaDTO.situacionCaptura}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/movimientosNomina/conceptosPago" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="conceptosPago" 
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