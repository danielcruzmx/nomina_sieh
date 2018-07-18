<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO" action="contratoHonorarios.do">

    <html:hidden path="rfcRequired"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.honorarios.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    
    <div align="center">
        <table width="100%">
            <tr>
                <td>
                    <c:set var="content0">
                        <table width="50%">
                            <tr>
                                <td  align="right" class="label"> * <spring:message code="sireh.label.contratoHonorarios.reportes.rfc"></spring:message></td>
                                <td align="left" colspan="5">
                                    <fsn:helpRoutine path="rfcEmpleado"
                                                     maxlength="16"
                                                     size="16" 
                                                     disabled="true" 
                                                     beanName="HonorariosDetalle"
                                                     width="1000" 
                                                     height="400"  
                                                     fieldMapping="rfcEmpleado, chNumDictamen, chNumOficio, chNombreResp, chDescCargo, chConocim, chEstudios, chServsProf" 
                                                     fieldMappingDTO="rfcEmpleado, chNumDictamen, chNumOficio, chNombreResp, chDescCargo, chConocim, chEstudios, chServsProf"
                                                     title="Seleccione el RFC" 
                                                     maxRows="200"
                                                     leftPosition="17"
                                                     topPosition="20"/>
                                </td>
                            </tr>
                        </table>
                    </c:set>
    
                    <c:set var="content1">
                        <table width="71%">
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.contratoHonorarios.reportes.dictamen"></spring:message></td>
                                <td align="left">
                                    <fsn:input path="chNumDictamen" size="18" uppercase="true"/>
                                </td>
                                <td  align="right" class="label"><spring:message code="sireh.label.contratoHonorarios.reportes.contrato"></spring:message></td>
                                <td align="left">
                                    <fsn:input path="chNumOficio" size="18" uppercase="true"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="4" align="left" height="15px" valign="middle">&nbsp;</td>
                            </tr>
                            
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.contratoHonorarios.reportes.informe"></spring:message></td>
                                <td align="left" colspan="3">
                                    <fsn:textarea path="chNombreResp" rows="2" cols="90" uppercase="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.contratoHonorarios.reportes.cargo"></spring:message></td>
                                <td align="left" colspan="3">
                                    <fsn:textarea path="chDescCargo" rows="2" cols="90" uppercase="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="4" align="left" height="15px" valign="middle">&nbsp;</td>
                            </tr>
                        
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.contratoHonorarios.reportes.conocimientos"></spring:message></td>
                                <td align="left" colspan="3">
                                    <fsn:textarea path="chConocim" rows="7" cols="90" uppercase="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.contratoHonorarios.reportes.estudios"></spring:message></td>
                                <td align="left" colspan="3">
                                    <fsn:textarea path="chEstudios" rows="2" cols="90" uppercase="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td  align="right" class="label"><spring:message code="sireh.label.contratoHonorarios.reportes.servicios"></spring:message></td>
                                <td align="left" colspan="3">
                                    <fsn:textarea path="chServsProf" rows="7" cols="90" uppercase="false"/>
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
                                            action="reporteMoviminentos/contratoHonorarios.do"/>
                            </td>
                            <td align="left">
                                <fsn:submit value="submit.cancel" 
                                            path="cancel" 
                                            action="reporteMoviminentos/contratoHonorarios.do"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" height="20px">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    
        <c:if test="${(reportesMovtoNominaDTO.rfcEmpleado != null)}">
            <table>
                <tr>
                    <th align="left">
                        &nbsp;
                    </th>
                </tr>
                <tr>
                    <td align="left" style="z-index: 1;">
                        <fsn:reportParam name="PAR_RFC" value="${reportesMovtoNominaDTO.rfcEmpleado}"/>
                        
                        <fsn:reportParam name="PAR_DICTAMEN" value="${reportesMovtoNominaDTO.chNumDictamen}"/>
                        <fsn:reportParam name="PAR_CONTRATO" value="${reportesMovtoNominaDTO.chNumOficio}"/>
                        
                        <fsn:reportParam name="PAR_INFORME" value="${reportesMovtoNominaDTO.chNombreResp}"/>
                        <fsn:reportParam name="PAR_CARGO" value="${reportesMovtoNominaDTO.chDescCargo}"/>
                        
                        <fsn:reportParam name="PAR_CONOCIMIENTOS" value="${reportesMovtoNominaDTO.chConocim}"/>
                        <fsn:reportParam name="PAR_ESTUDIOS" value="${reportesMovtoNominaDTO.chEstudios}"/>
                        <fsn:reportParam name="PAR_SERVICIOS" value="${reportesMovtoNominaDTO.chServsProf}"/>
                        
                        <fsn:report provider="jasper" 
                                    viewUri="/movimientosNomina/contratoHonorarios" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="contratoHonorarios" 
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