<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form name="agrCptsO" id="agrCptsO" modelAttribute="datosEmpleadoCptoDTO">
    <h1>
        <strong>
            <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.detalleConcepto.titulo"/><fsn:label path="cpcSubTipoDesc"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Concepto&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="100%" border="0">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="left" class="label"><fsn:label path="idTipoCpto"   id="idTipoCpto"/><fsn:label path="idConcepto" id="idConcepto"/></td>
                            <td align="left"><fsn:label path="descConPag"/></td>
                            <td width="15%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.monto" /></td>
                            <td align="left"><fmt:formatNumber pattern="###,###.##" value="${datosEmpleadoCptoDTO.mcpMonto}" /></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td width="15%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.sueldo" /></td>
                            <td width="15%" align="left"><fsn:label path="tabSueldo"/></td>
                            <td width="15%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.compensacion" /></td>
                            <td width="15%" align="left"><fsn:label path="tabCompensacion"/></td>
                            <td width="15%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel" /></td>
                            <td width="15%" align="left"><fsn:label path="idNivelPto"/></td>
                        </tr>
                    </table>
                </fieldset>
                <fieldset>
                    <legend></legend>
                    <table align="center" width="100%">
                        <tr>
                            <td width="15%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.sitCaptura" /></td>
                            <td width="15%" align="left"><fsn:label path="descSitCaptura"/></td>
                            <td width="15%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.periodo.diaCaptura"/></td>
                            <td width="15%" align="left"><fsn:label path="mcpFecIncidenciaLabel"/></td>
                            <td width="15%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.porcentaje"/></td>
                            <td width="15%" align="left"><fsn:label path="mcpPorcentaje"/></td>
                        </tr>
                        <tr>
                            <td width="10%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia"/></td>
                            <td width="10%" align="left"><fsn:label path="mcpRefCaptura"/></td>
                            <td width="10%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.periodo.horasDias"/></td>
                            <td width="10%" align="left"><fsn:label path="mcpHorasDias"/></td>
                            <td width="10%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.quincenaCaptura" /></td>
                            <td width="10%" align="left"><fsn:label path="mcpQnaCaptura"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Datos de Aplicaci&oacute;n&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="100%">
                        <tr>
                            <td width="17%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.quincenaInicio" /></td>
                            <td width="16%" align="left"><fsn:label path="mcpQnaIni"/></td>
                            <td width="16%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.quincenaTermino" /></td>
                            <td width="16%" align="left"><fsn:label path="mcpQnaFin"/></td>
                            <td width="16%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.quincenasAplicadas" /></td>
                            <td width="17%" align="left"><fsn:label path="qnaAplicadas"/></td>
                        </tr>
                        <tr>
                            <td width="17%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.quincenaDescontar" /></td>
                            <td width="16%" align="left"><fsn:label path="mcpQnaADescontar"/></td>
                            <td width="16%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.ultimaQuincenaProcesada" /></td>
                            <td width="16%" align="left"><fsn:label path="ultimaQnaProcesa"/></td>
                            <td width="16%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.clave" /></td>
                            <td width="17%" align="left"><fsn:label path="cpcTipoCaptura"/><fsn:label path="cpcTipoCalculo"/><fsn:label path="cpcPermanente"/><fsn:label path="cpcSubTipo"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Cancelaci&oacute;n o Baja&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="100%">
                        <tr>
                            <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia"/></td>
                            <td width="25%" align="left"><fsn:label path="mcpRefCancela"/></td>
                            <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.qna"/></td>
                            <td width="25%" align="left"><fsn:label path="mcpQnaCancelo"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Ultima modificaci&oacute;n&nbsp;</strong></legend>
                    <table align="center" width="100%">
                        <tr>
                            <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.capturadoPor"/></td>
                            <td width="25%" align="left"><fsn:label path="usuario"/></td>
                            <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.fecha"/></td>
                            <td width="25%" align="left"><fsn:label path="fecModificoLabel"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;  Adeudo  &nbsp;&nbsp;</strong></legend>
                    <table align="center" width="100%">
                        <tr>
                            <td>
                                <fieldset>
                                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;  Periodo  &nbsp;&nbsp;</strong></legend>
                                    <table align="center" width="100%">
                                        <tr>
                                            <td width="25%" align="right" class="label">&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.periodo.inicial"/></td>
                                            <td width="25%" align="left"><fsn:label path="mcpFecIniAdeudo"/></td>
                                            <td width="25%" align="right" class="label">&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.periodo.final"/></td>
                                            <td width="25%" align="left"><fsn:label path="mcpFecFinAdeudo"/>
                                        </tr>
                                        
                                    </table>
                               </fieldset>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <fieldset>
                                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;  Periodo de Aplicaci&oacute;n &nbsp;&nbsp;</strong></legend>
                                    <table align="center" width="100%">
                                        <tr>
                                            <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.desde"/>
                                            <td width="25%" align="left"><!--fsn:label path="qnaIniLabelmcpQnaIni"/--><fsn:label path="mcpQnaIni"/></td>
                                            <td width="25%" align="right" class="label">&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.hasta"/></td>
                                            <td width="25%" align="left"><fsn:label path="mcpFecFinAdeudo"/></td>
                                        </tr>
                                        <tr>
                                            <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.qnas"/></td>
                                            <td width="25%" align="left"><fsn:label path="mcpQnasAdeudo"/></td>
                                        </tr>
                                    </table>
                               </fieldset>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <fieldset>
                                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp; Montos &nbsp;&nbsp;</strong></legend>
                                    <table align="center" width="100%">
                                        <tr>
                                            <td width="25%" align="right" class="label">&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.montoTotal"/></td>
                                            <!--td width="25%" align="left"><fsn:label path="mcpMontoAdeudoLabel"/></td-->
                                            <td width="25%" align="left"><fmt:formatNumber pattern="###,###.##" value="${datosEmpleadoCptoDTO.mcpMontoAdeudo}" /></td>
                                            <td width="25%" align="right" class="label">&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia"/></td>
                                            <td width="25%" align="left"><fsn:label path="mcpRefCaptura"/></td>
                                        </tr>
                                    </table>
                               </fieldset>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="100%">
        <tr>
            <td>
                <c:set var="opMenu" value="${datosEmpleadoCptoDTO.cpcSubTipo}"/>
                <c:choose>
                <c:when test="${opMenu == 'G'}">
                    <c:set var="uri" value="actualizacionNomina/datosEmpleadoCptoG.do"/>
                </c:when>
                <c:when test="${opMenu == 'T'}">
                    <c:set var="uri" value="actualizacionNomina/datosEmpleadoCptoT.do"/>
                </c:when>
                <c:when test="${opMenu == 'D'}">
                    <c:set var="uri" value="actualizacionNomina/datosEmpleadoCptoD.do"/>
                </c:when>
                <c:when test="${opMenu == 'R'}">
                    <c:set var="uri" value="actualizacionNomina/datosEmpleadoCptoR.do"/>
                </c:when>
            </c:choose>
            <td align="center"><fsn:submit value="submit.back" path="cancel" action="${uri}"/></td>
            </td>
        </tr>
    </table>
    
    <html:hidden path="rfcEmpleado"/>
    <html:hidden path="fecModifico" id="fecModifico" />
    <html:hidden path="mcpFecIncidencia" id="mcpFecIncidencia" />
    
</html:form>

 