<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO" action="avisoCambio.do">
    
    <html:hidden path="rfcRequired"/>
    <html:hidden path="idMovtoEmpPla"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.aviso.detalle.titulo.link"/>
        </strong>
    </h1>
    
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
            <tr>
                <td  align="right" class="label"> * <spring:message code="sireh.label.merito.label.rfc"></spring:message></td>
                <td align="left">
                    <fsn:helpRoutine path="rfcEmpleado"
                                     maxlength="16"
                                     size="16" 
                                     disabled="true" 
                                     beanName="empleadosAvisoCambio"
                                     width="1000" 
                                     height="400"  
                                     fieldMapping="rfcEmpleado, idPlaza, curpEmpleado, primerApellido, segundoApellido, nombreEmpleado" 
                                     title="Seleccione el RFC"
                                     leftPosition="17"
                                     maxRows="100"
                                     topPosition="20"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td colspan="2" align="left">
                    <fsn:submit value="submit.search" 
                                action="reporteMoviminentos/avisoCambio.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
            
            <c:if test="${ reportesMovtoNominaDTO.rfcEmpleado!=null && reportesMovtoNominaDTO.rfcEmpleado!='' }">
            <tr>
                <td colspan="2" align="left">
                
                    <fsn:filter property="E.RFC_EMPLEADO" condition="=" path="rfcEmpleado" />
                    <fsn:pagedList beanName="listadoMovimientosAviso"
                                   baseUrl="constanciaNombramiento"
                                   appendFilters="false">
                                   
                        <display:table name="listadoMovimientosAviso" 
                                       class="displaytag" 
                                       pagesize="10"
                                       export="false" 
                                       id="row" 
                                       requestURI="${requestURI}"
                                       sort="list">
                            <display:column style="text-align: center;"
                                            titleKey="sireh.label.movimiento.nomina.reportes.constancia.headers.idMovtoEmpPla"
                                            sortable="true">
                                <a href="avisoCambioObservaciones.do?idMovtoEmpPla=<c:out value='${row.idMovtoEmpPla}'/>&rfcEmpleado=<c:out value='${reportesMovtoNominaDTO.rfcEmpleado}'/>">
                                    <c:out value='${row.idMovtoEmpPla}'/>
                                </a>
                            </display:column>
                            <display:column property="qnaCaptura" style="text-align: center;"
                                            titleKey="sireh.label.movimiento.nomina.reportes.constancia.headers.qnaCaptura"
                                            sortable="true"/>
                            <display:column property="idPlaza" style="text-align: center;"
                                            titleKey="sireh.label.movimiento.nomina.reportes.constancia.headers.idPlaza"
                                            sortable="true"/>
                            <display:column property="idUnidad" style="text-align: center;"
                                            titleKey="sireh.label.movimiento.nomina.reportes.constancia.headers.idUnidad"
                                            sortable="true"/>
                            <display:column property="idMovto" style="text-align: center;"
                                            titleKey="sireh.label.movimiento.nomina.reportes.constancia.headers.idMovto"
                                            sortable="true"/>
                            <display:column property="descMovto" style="text-align: center;"
                                            titleKey="sireh.label.movimiento.nomina.reportes.constancia.headers.descMovto"
                                            sortable="true"/>
                            <display:column property="fechaCaptura" style="text-align: center;"
                                            titleKey="sireh.label.movimiento.nomina.reportes.constancia.headers.fechaCaptura"
                                            sortable="true"/>
                            <display:column property="usuario" style="text-align: center;"
                                            titleKey="sireh.label.movimiento.nomina.reportes.constancia.headers.usuario"
                                            sortable="true"/>
                        </display:table>
                    </fsn:pagedList>
                </td>
            </tr>
            
            <c:if test="${ reportesMovtoNominaDTO.idMovtoEmpPla != null }">
            <tr>
                <td colspan="2"><fsn:textarea uppercase="false" path="mepObserva" rows="3" cols="123"/></td>
            </tr>
            </c:if>
            
            <tr>
                <td align="right">
                <c:if test="${ reportesMovtoNominaDTO.idMovtoEmpPla != null }">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteMoviminentos/avisoCambioReporte.do"/>
                </c:if>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteMoviminentos/avisoCambio.do"/>
                </td>
            </tr>
            </c:if>
        </table>
        
        <c:if test="${ reportesMovtoNominaDTO.muestraReporte }">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="P_ID_MOVTO" value="${reportesMovtoNominaDTO.idMovtoEmpPla}"/>
                        <fsn:report provider="jasper"
                                    viewUri="/movimientosNomina/avisoCambioh" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="avisoCambioh" 
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