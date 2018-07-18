<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:message code="sireh.label.reportes.sin.pension" var="sinPension"/>
<spring:message code="sireh.label.reportes.con.pension" var="conPension"/>

<html:form modelAttribute="reportesCalculoNominaDTO" action="impresion.do">
    
    <html:hidden path="complementoRequired"/>
    <html:hidden path="mesQnaRequired"/>
    <html:hidden path="tipoNominaRequired"/>
    <html:hidden path="idUnidadRequired"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.calculo.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.calculo.reportes.impresion.detalle.titulo.link"/>
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
                <td  align="right" class="label"><spring:message code="sireh.label.reportes.complemento"></spring:message></td>
                <td align="left"><fsn:input path="complemento" maxlength="5" size="6"  /></td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.pension"></spring:message></td>
                <td align="left">
                    <html:select path="pension"
                                 cssClass="uppercase">
                        <html:option value="0" label="${sinPension}"/>
                        <html:option value="1" label="${conPension}"/>
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
                                action="reporteCalculo/impresion.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteCalculo/impresion.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        
        <c:if test="${ (reportesCalculoNominaDTO.complemento!=null)  &&  (reportesCalculoNominaDTO.mesQna!='0') &&  (reportesCalculoNominaDTO.tipoNomina!='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_COMPLEMENTO" value="${reportesCalculoNominaDTO.complemento}"/>
                        <fsn:reportParam name="PAR_MES" value="${reportesCalculoNominaDTO.mesQna}"/>
                        <fsn:reportParam name="PAR_TIPO_NOMINA" value="${reportesCalculoNominaDTO.tipoNomina}"/>
                        <fsn:reportParam name="PAR_UNIDAD" value="${reportesCalculoNominaDTO.unidades}"/>
                        <fsn:reportParam name="PAR_PENSION" value="${reportesCalculoNominaDTO.pension}"/>
                        
                        
                        <c:if test="${reportesCalculoNominaDTO.pension eq '0'}">
                            <fsn:reportParam name="PAR_TIPO_PENSION" value="="/>
                        </c:if>
                        <c:if test="${reportesCalculoNominaDTO.pension eq '1'}">
                            <fsn:reportParam name="PAR_TIPO_PENSION" value=">="/>
                        </c:if>

                            <fsn:report provider="jasper" 
                                    viewUri="/calculoNomina/comprobantePago" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="impresionComprobantes" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
    </div>
    <p>&nbsp;</p>
    <div align="center"></div>
    <p>&nbsp;</p>
    <div align="center"></div>
    <p>&nbsp;</p>
    <div align="center"></div>
</html:form>