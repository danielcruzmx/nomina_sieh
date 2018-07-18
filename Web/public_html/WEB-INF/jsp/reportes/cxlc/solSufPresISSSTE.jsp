<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
.anchoTextarea {
    width: 600px;
}
</style>
<html:form modelAttribute="reportesCxlcDTO">

    <html:hidden path="uniCicloRequired"/>
    <html:hidden path="complementoRequired"/>
    <html:hidden path="tipoNominaRequired"/>
    <html:hidden path="clcRequired"/>
    <html:hidden path="qnaCapturaRequired"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.cxlc.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.cxlc.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.cxlc.reportes.sufucuencia.detalle.titulo.link"/> &#45; 
            <spring:message code="sireh.label.cxlc.reportes.issste.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    
    <div align="center">
        <table width="100%">
            <tr>
                <td>
                    <c:set var="content0">
                        <table>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.reportes.ciclo"></spring:message></td>
                                <td align="left">
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcUnidadCicloReportesCLC"  
                                                    path="uniCiclo"/>                
                                </td>
                            </tr>        
                           <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.reportes.quincena"></spring:message></td>
                                <td align="left">
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="catalogoNumQnaReportesCLC"  
                                                    path="qnaCaptura" 
                                                    progress="true"  
                                                    parentPath="uniCiclo" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.reportes.tipoNomina"></spring:message></td>
                                <td align="left">
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcTipoNominaReportesISSSTE"  
                                                    path="tipoNomina" 
                                                    progress="true"
                                                    parentPath="qnaCaptura"
                                                    filterPaths="uniCiclo"/>
                                </td>
                            </tr>
                             <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.reportes.complemento"></spring:message></td>
                                <td align="left">
                                    <fsn:option key="-1" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="catalogoComplementoCLC"
                                                    path="complemento" 
                                                    progress="true" 
                                                    parentPath="qnaCaptura"
                                                    filterPaths="uniCiclo,tipoNomina"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.reportes.clc"></spring:message></td>
                                <td align="left"> 
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="catalogoClavesCLC"  
                                                    path="clc" 
                                                    progress="true"  
                                                    parentPath="complemento" 
                                                    filterPaths="qnaCaptura,tipoNomina" />
                                </td>
                            </tr>
                        </table>
                    </c:set>
                    
                    <c:set var="content1">
                        <table border="0" width="100%">
                            <colgroup>
                                <col width="30%"/>
                                <col width="70%"/>
                            </colgroup>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc.suficienciaPresupuestaria"></spring:message></td>
                                <td align="left"><fsn:input path="suficienciaPresupuestaria" maxlength="30" size="30"  /></td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc.documento"></spring:message></td>
                                <td align="left"><fsn:input path="documento" maxlength="30" size="30"  /></td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc.mes"></spring:message></td>
                                <td align="left"><fsn:input path="mes" maxlength="30" size="30"  /></td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc.fechaDepositoBanco"></spring:message></td>
                                <td align="left"><fsn:calendar path="fechaDepositoBanco" size="10"/></td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc.fechaPagoISSSTE"></spring:message></td>
                                <td align="left"><fsn:calendar path="fechaPagoISSSTE" size="10"/></td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc.pagoUnidad"></spring:message></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcUnidadSinCiclo" 
                                                    path="pagoUnidad"
                                                    uppercase="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc.periodo"></spring:message></td>
                                <td align="left"><fsn:input path="periodo" maxlength="30" size="30"  /></td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc.correoElectronico"></spring:message></td>
                                <td align="left"><fsn:input path="correoElectronico" maxlength="30" size="30"  /></td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc.nota"></spring:message></td>
                                <td align="left"><fsn:textarea path="nota" rows="3" cols="123" css="anchoTextarea"/></td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.responsable"></spring:message></td>
                                <td align="left"> 
                                    <fsn:input path="responsable" maxlength="30" size="30"/>
                                </td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.reportes.puestocargo"></spring:message></td>
                                <td align="left"> 
                                    <fsn:input path="puestoCargo" maxlength="30" size="30"/>
                                </td>
                            </tr>
                        </table>
                    </c:set>
                    
                    <fsn:container section="init" type="tab" displayTime="3" tabHeight="25"/>
                    <fsn:container name="divContent0" content="${content0}" title="Datos Requeridos" selected="true"/>
                    <fsn:container name="divContent1" content="${content1}" title="Datos Adicionales"/>
                    <fsn:container section="final"/>
                </td>
            </tr>
            <tr>
                <td>
                    <table width="100%">
                        <tr>
                            <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                        </tr>
                        <tr>
                            <td align="right">
                                <fsn:submit value="submit.accept" 
                                            path="muestraReporte"
                                            action="reporteCxlc/SolIssste.do"/>
                            </td>
                            <td align="left">
                                <fsn:submit value="submit.cancel" 
                                            path="cancel" 
                                            action="reporteCxlc/SolIssste.do"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" height="20px">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        
        <c:if test="${ (reportesCxlcDTO.uniCiclo!='0')  &&  (reportesCxlcDTO.clc!='0') &&  (reportesCxlcDTO.complemento!='-1')  &&  (reportesCxlcDTO.qnaCaptura!='0') &&  (reportesCxlcDTO.tipoNomina!='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_CICLO" value="${reportesCxlcDTO.uniCiclo}"/>
                        <fsn:reportParam name="PAR_COMPLEMENTO" value="${reportesCxlcDTO.complemento}"/>
                        <fsn:reportParam name="PAR_CLC" value="${reportesCxlcDTO.clc}"/>
                        <fsn:reportParam name="PAR_QNA" value="${reportesCxlcDTO.qnaCaptura}"/>
                        <fsn:reportParam name="PAR_TIPO_NOMINA" value="${reportesCxlcDTO.tipoNomina}"/>
                        
                        <fsn:reportParam name="PAR_SUF_PRESU" value="${reportesCxlcDTO.suficienciaPresupuestaria}"/>
                        <fsn:reportParam name="PAR_DOCUMENTO" value="${reportesCxlcDTO.documento}"/>
                        <fsn:reportParam name="PAR_MES" value="${reportesCxlcDTO.mes}"/>
                        <fsn:reportParam name="PAR_FEC_DEPOSITO_BANCO" value="${reportesCxlcDTO.fechaDepositoBancoCad}"/>
                        <fsn:reportParam name="PAR_FEC_PAGO_ISSSTE" value="${reportesCxlcDTO.fechaPagoISSSTECad}"/>
                        <fsn:reportParam name="PAR_PAGO_UNIDAD" value="${reportesCxlcDTO.pagoUnidad}"/>
                        <fsn:reportParam name="PAR_PERIODO" value="${reportesCxlcDTO.periodo}"/>
                        <fsn:reportParam name="PAR_EMAIL" value="${reportesCxlcDTO.correoElectronico}"/>
                        <fsn:reportParam name="PAR_NOTA" value="${reportesCxlcDTO.nota}"/>
                        <fsn:reportParam name="PAR_RESPONSABLE" value="${reportesCxlcDTO.responsable}"/>
                        <fsn:reportParam name="PAR_PUESTO_CARGO" value="${reportesCxlcDTO.puestoCargo}"/>
                        
                        <fsn:report provider="jasper" 
                                    viewUri="/cxlc/solSufPresISSSTE" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="solSufPresISSSTE" 
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