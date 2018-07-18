<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesCalculoNominaDTO" action="conceptoPago.do">
    <html:hidden path="complementoRequired"/>
    <html:hidden path="mesQnaRequired"/>
    <html:hidden path="tipoNominaRequired"/>
    <html:hidden path="conceptoRequired"/>
    <html:hidden path="tipoCptoRequired"/>
    <html:hidden path="idUnidadRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.calculo.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.concepto.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.unidad.notrequired"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadSinCiclo" 
                                    path="idUnidad"
                                    uppercase="false"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.quincena"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores" 
                                    path="mesQna"
                                    uppercase="false"/>
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
                <td  align="right" class="label"><spring:message code="sireh.label.reportes.complemento.notrequired"></spring:message></td>
                <td align="left"><fsn:input path="complemento" maxlength="5" size="6"  /></td>
            </tr>
            <tr>
                <td align="right" class="label">* Tipo concepto</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcTipoConcepto"  path="tipoCpto"  />
                </td>
            </tr>
            <tr>
                <td align="right" class="label">Concepto</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcConceptoPagoByTipoCpto"  path="concepto"  progress="true" parentPath="tipoCpto"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteCalculo/conceptoPago.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteCalculo/conceptoPago.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        <c:if test="${ (reportesCalculoNominaDTO.mesQna!='0') && (reportesCalculoNominaDTO.tipoNomina!='0') && (reportesCalculoNominaDTO.tipoCpto!='0') && (reportesCalculoNominaDTO.concepto!='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_QNA" value="${reportesCalculoNominaDTO.mesQna}"/>
                        <fsn:reportParam name="PAR_COMPLEMENTO" value="${reportesCalculoNominaDTO.complemento}"/>
                        <fsn:reportParam name="PAR_TIPO_NOMINA" value="${reportesCalculoNominaDTO.tipoNomina}"/>
                        <fsn:reportParam name="PAR_CONCEPTO" value="${reportesCalculoNominaDTO.concepto}"/>
                        <fsn:reportParam name="PAR_TIPO_CPTO" value="${reportesCalculoNominaDTO.tipoCpto}"/>
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesCalculoNominaDTO.unidades}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/calculoNomina/conceptoPago" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="conceptoPago" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
        <c:if test="${ (reportesCalculoNominaDTO.mesQna!='0') && (reportesCalculoNominaDTO.tipoNomina!='0') && (reportesCalculoNominaDTO.tipoCpto!='0')  && (reportesCalculoNominaDTO.concepto=='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_QNA" value="${reportesCalculoNominaDTO.mesQna}"/>
                        <fsn:reportParam name="PAR_COMPLEMENTO" value="${reportesCalculoNominaDTO.complemento}"/>
                        <fsn:reportParam name="PAR_TIPO_NOMINA" value="${reportesCalculoNominaDTO.tipoNomina}"/>
                        <fsn:reportParam name="PAR_TIPO_CPTO" value="${reportesCalculoNominaDTO.tipoCpto}"/>
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesCalculoNominaDTO.unidades}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/calculoNomina/conceptoPagot" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="conceptoPagot" 
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