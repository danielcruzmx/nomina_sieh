<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO" action="pagosCancelados.do">
    <html:hidden path="mesQnaRequired"/>
    <html:hidden path="tipoNominaRequired"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.cancelados.detalle.titulo.link"/>
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
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="mesQna" progress="true" />
                </td>
            </tr>    
             <tr>
                <td align="right" class="label">* Tipo Nomina</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcTipoNominaReportes"  path="tipoNomina" />
                </td>
            </tr>
            <tr align="left">
                <td class="label">Complemento</td>
                <td>
                    <fsn:input path="complemento" maxlength="12" size="15"/>
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
                                            action="reporteMoviminentos/pagosCancelados.do"/>
                            </td>
                            <td align="left">
                                <fsn:submit value="submit.cancel" 
                                            path="cancel" 
                                            action="reporteMoviminentos/pagosCancelados.do"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" height="20px">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        
        <c:if test="${ (reportesMovtoNominaDTO.tipoNomina!='0') &&  (reportesMovtoNominaDTO.mesQna!='0') }">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesMovtoNominaDTO.unidades}"/>
                        <fsn:reportParam name="PAR_TIPO_NOMINA" value="${reportesMovtoNominaDTO.tipoNomina}"/>
                        <fsn:reportParam name="PAR_MES" value="${reportesMovtoNominaDTO.mesQna}"/>
                        <fsn:reportParam name="PAR_COMPLEMENTO" value="${reportesMovtoNominaDTO.complemento}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/movimientosNomina/pagosCancelados" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="pagosCancelados" 
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