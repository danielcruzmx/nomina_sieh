<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form name="agrCptsO" id="agrCptsO" modelAttribute="datosEmpleadoCptoDTO">
    <script type="text/javascript" src="<spring:theme code="conceptos.js"/>"></script>
    <h1>
        <strong>
            <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.modificaConcepto.titulo"/><fsn:label path="cpcSubTipoDesc"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <table align="center" width="50%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Concepto&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="90%">
                        <tr><td colspan="2">&nbsp;</td></tr>
                        <tr> 
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.rfc"/></td>
                            <td align="left"><fsn:label path="rfcEmpleado"/>&nbsp;<fsn:label path="primerApellido"/><fsn:label path="segundoApellido"/><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.descripcion" /></td>
                            <td align="left"><fsn:label path="descConPag"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.concepto" /></td>
                            <td align="left"><fsn:label path="idTipoCpto" id="idTipoCpto"/><fsn:label path="idConcepto" id="idConcepto"/>&nbsp;&nbsp;&nbsp;&nbsp;<fsn:label path="cpcTipoCaptura"/><fsn:label path="cpcTipoCalculo"/><fsn:label path="cpcPermanente"/><fsn:label path="cpcSubTipo"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.sueldo" /></td>
                            <td align="left"><fsn:label path="tabSueldo" id="tabSueldo"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.compensacion" /></td>
                            <td align="left"><fsn:label path="tabCompensacion" id="tabCompensacion"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel" /></td>
                            <td align="left"><fsn:label path="idNivelPto" id="idNivelPto"/></td>
                        </tr>
                        <tr><td colspan="2">&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/><br/>    
    <table align="center" width="80%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Captura&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="90%">
                        <tr><td colspan="2">&nbsp;</td></tr>
                        <tr>
                            <td>
                                <table align="center" width="100%">
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.porcentaje"/></td>
                                        <td align="left" style="font-size:1.1em">
                                            <c:if test="${datosEmpleadoCptoDTO.cpcTipoCalculo == 'P'}">$
                                                <html:input path="mcpMontoLabel" id="mcpMontoLabel" readonly="true"/> 
                                            </c:if>
                                            <c:if test="${datosEmpleadoCptoDTO.cpcTipoCalculo != 'P'}">$
                                                <html:input path="mcpMontoLabel" id="mcpMontoLabel"/>
                                            </c:if>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia"/></td>
                                        <td align="left" width="37%"><html:input path="mcpRefCaptura" id="mcpRefCaptura" size="47" maxlength="60"/></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td width="50%">
                                <fieldset>
                                <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Periodo de Aplicacion&nbsp;&nbsp;</strong></legend>
                                    <table align="center" width="90%">
                                        <tr><td colspan="2">&nbsp;</td></tr>
                                        <tr>
                                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.desde"/></td>
                                            <td><fsn:label path="qnaIniLabel"/></td>
                                        </tr>
                                            <c:if test="${datosEmpleadoCptoDTO.cpcPermanente == 'NX'}">
                                                <tr>
                                                    <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.qnas"/></td>
                                                    <td align="left"><html:input path="mcpQnaADescontar" id="mcpQnaADescontar" size="6" maxlength="6" readonly="true"/></td>
                                                </tr>
                                            </c:if>
                                        <tr>
                                            <td align="right" class="label">
                                                <c:if test="${datosEmpleadoCptoDTO.cpcPermanente == 'NX'}">*&nbsp;</c:if>
                                                <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.hasta"/></td>
                                            <td align="left">
                                                <c:if test="${datosEmpleadoCptoDTO.cpcPermanente == 'NX'}">
                                                    <fsn:option key="" value="selectList.nonValue"/>
                                                    <fsn:selectList beanName="listaQuincenas" path="mcpQnaFin" onchange="calculaQuincenas();" />
                                                </c:if>
                                                <p style="font-size:1.2em">
                                                    <c:if test="${datosEmpleadoCptoDTO.cpcPermanente != 'NX'}">
                                                        <strong><fsn:label path="mcpQnaFinLabel"/></strong>
                                                    </c:if>
                                                </p>
                                            </td>
                                        </tr>
                                        <tr><td colspan="2">&nbsp;</td></tr>
                                    </table>
                                </fieldset>
                            </td>
                            <td>
                                <table align="center" width="80%">
                                    <tr>
                                        <td width="30%">&nbsp;</td>
                                        <td>
                                            <p align="left">
                                                <c:forEach var="radio" items="${datosEmpleadoCptoDTO.mapaOpcionesRdButtons}">
                                                    <c:if test="${radio.value != null}">
                                                        <html:radiobutton path="opcionRdButton" value="${radio.value}" id="opcionRdButton" onclick="calculaMontoEO(document.agrCptsO.opcionRdButton);"/>
                                                            <c:out value="${radio.key}"/><br/>
                                                    </c:if>
                                                </c:forEach>
                                            </p>
                                        </td>
                                        <td width="30%">&nbsp;</td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <table align="center" width="100%">
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.capturadoPor"/></td>
                                        <td align="left" width="67%"><fsn:label path="usuario"/></td>
                                    </tr>
                                </table>
                            </td>
                            <td align="center"><p style="font-size:1.3em"><strong><fsn:label path="cpcMensaje"/></strong></p></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="80%">
        <tr><td colspan="3" align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
        <tr>
            <td align="right" width="40%">
                <fsn:submit value="submit.accept" action="actualizacionNomina/modificarConceptoDelEmpleado.do" />
            </td>
            <td width="30%">&nbsp;</td>
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
            <td width="40%" align="left"><fsn:submit value="submit.cancel" path="cancel" action="${uri}"/></td>
        </tr>
    </table>
    
    <html:hidden path="mcpMonto" id="mcpMonto"/>
    <html:hidden path="mcpQnaFin" id="mcpQnaFin"/>
    <!--html:hidden path="tabSueldo" id="tabSueldo"/-->
    <html:hidden path="mcpQnaADescontar" id="mcpQnaADescontar"/>
    <html:hidden path="mcpPorcentaje" id="porcentaje"/>
    <html:hidden path="mcpQnaIni" id="mcpQnaIni"/>
    <html:hidden path="qnaQnaInicial" id="qnaQnaInicial"/>
    <html:hidden path="anioQnaInicial" id="anioQnaInicial"/>
    <!--html:hidden path="tabCompensacion" id="tabCompensacion"/-->
    <html:hidden path="valida"          id="valida"/>
    
    <script type="text/javascript">
        window.document.forms[0].valida.value = true;
        window.document.forms[0].mcpRefCaptura.focus();
    </script>
    
</html:form>

 