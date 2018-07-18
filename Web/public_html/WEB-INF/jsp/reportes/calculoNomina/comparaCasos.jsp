<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesCalculoNominaDTO" action="comparaCasos.do">
    <html:hidden path="qnaIniRequired"/>
    <html:hidden path="qnaFinRequired"/>
    <html:hidden path="tipoNominaRequired"/>
    <html:hidden path="conceptoRequired"/>
    <html:hidden path="tipoCptoRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.calculo.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.casos.detalle.titulo.link"/>
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
                                    uppercase="false"/>

                </td>
            </tr>
             <tr>
                <td align="right" class="label">* Personal de la quincena</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaIni" />
                </td>
            </tr>
             <tr>
                <td align="right" class="label">* Sin el concepto en la quincena</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaFin" />
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.tipoNomina"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcTipoNominaReportes"  path="tipoNomina" />
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
                    <fsn:selectList beanName="tcConceptoPago"  path="concepto"  />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteCalculo/comparaCasos.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteCalculo/comparaCasos.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
               <c:if test="${ (reportesCalculoNominaDTO.concepto!='0')  &&  (reportesCalculoNominaDTO.tipoCpto!='0') &&  (reportesCalculoNominaDTO.tipoNomina!='0') &&  (reportesCalculoNominaDTO.qnaIni!='0') &&  (reportesCalculoNominaDTO.qnaFin!='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesCalculoNominaDTO.unidades}"/>
                        <fsn:reportParam name="PAR_QNA_INI" value="${reportesCalculoNominaDTO.qnaIni}"/>
                        <fsn:reportParam name="PAR_QNA_FIN" value="${reportesCalculoNominaDTO.qnaFin}"/>
                        <fsn:reportParam name="PAR_TIPO_NOMINA" value="${reportesCalculoNominaDTO.tipoNomina}"/>
                        <fsn:reportParam name="PAR_CPTO" value="${reportesCalculoNominaDTO.concepto}"/>
                        <fsn:reportParam name="PAR_TIPO_CPTO" value="${reportesCalculoNominaDTO.tipoCpto}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/calculoNomina/comparaCasos" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="comparaCasos" 
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