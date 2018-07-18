<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form name="agrCptsO" id="agrCptsO" modelAttribute="datosEmpleadoCptoDTO">
    <script type="text/javascript" src="<spring:theme code="conceptos.js"/>"></script>
    <h1>
        <strong>
            <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.AdeudoConcepto.titulo"/><fsn:label path="cpcSubTipoDesc"/>
        </strong>
    </h1>
    <p>&nbsp;</p>   
   <table align="center" width="90%">
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
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.sueldo" /></td>
                            <td align="left"><fsn:label path="tabSueldo"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.compensacion" /></td>
                            <td align="left"><fsn:label path="tabCompensacion"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel" /></td>
                            <td align="left"><fsn:label path="idNivelPto" id="idNivelPto"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.concepto" /></td>
                            <td align="left"><fsn:label path="idTipoCpto"/><fsn:label path="idConcepto"/></td>
                        </tr>
                        <tr><td colspan="2">&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>   
    <table align="center" width="90%">
        <tr>
            <td>
                <fieldset>
                    <legend ></legend>
                    <table align="center" width="90%">
                        <tr><td colspan="2">&nbsp;</td></tr>
                        <tr>
                            <td width="50%">
                                <table align="center" width="100%">
                                   <tr>
                                        <td>
                                            <fieldset>
                                            <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Periodo&nbsp;&nbsp;</strong></legend>
                                                <table align="center" width="90%">
                                                    <tr><td colspan="2">&nbsp;</td></tr>
                                                    <tr>
                                                        <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.periodo.inicial"/></td>
                                                        <td align="left"><fsn:calendar path="mcpFecIniAdeudo" readonly="true"/></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.periodo.final"/></td>
                                                        <td align="left"><fsn:calendar path="mcpFecFinAdeudo"readonly="true"/></td>
                                                    </tr>
                                                    <tr><td colspan="2">&nbsp;</td></tr>
                                                </table>
                                            </fieldset>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                        <fieldset>
                                            <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Periodo de aplicaci&oacute;n&nbsp;&nbsp;</strong></legend>
                                                <table align="center" width="90%">
                                                    <tr><td colspan="2">&nbsp;</td></tr>
                                                    <tr>
                                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.desde"/></td>
                                                        <td align="left"><fsn:label path="qnaIniLabel"/></td>
                                                    </tr>
                                                        <tr>
                                                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.qnas"/></td>
                                                            <td align="left"><html:input path="mcpQnasAdeudo" id="mcpQnasAdeudo" size="6" maxlength="6" readonly="true"/></td> 
                                                        </tr>
                                                    <tr>
                                                        <td align="right" class="label">*&nbsp;
                                                            <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.hasta"/></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="listaQuincenas" path="mcpQnaFin" onchange="calculaQnasAdeudo(); "/>
                                                        </td>
                                                    </tr>
                                                    <tr><td colspan="2">&nbsp;</td></tr>
                                                </table>
                                            </fieldset>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td width="10%">&nbsp;</td>
                            <td width="50%">
                                <table align="center" width="100%" border="0">
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.montoQuincenal"/></td>
                                        <td align="left"><html:input path="mcpMontoQnalAdeudoLabel" id="mcpMontoQnalAdeudoLabel" readonly="true"/></td>
                                        <td colspan="2" align="left"><input type="button" value="Calcular" onclick="calculaMontoQuincenal();"/>
                                    </tr>
                                    <tr><td colspan="2">&nbsp;</td></tr>
                                    <tr>
                                        <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.montoTotal"/></td>
                                        <td align="left"><html:input path="mcpMontoAdeudoLabel" id="mcpMontoAdeudoLabel"/></td>
                                    </tr>
                                    <tr><td colspan="2">&nbsp;</td></tr>
                                    <tr>
                                        <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia"/></td>
                                        <td align="left"><html:input path="mcpRefCaptura" id="mcpRefCaptura"/></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr><td colspan="2">&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="90%">
        <tr><td colspan="5" align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
        <tr>
            <td width="20%">&nbsp;</td>
            <td width="20%" align="center">
                <fsn:submit value="submit.accept" action="actualizacionNomina/adeudoSaveConceptoEmpleado.do" />
            </td>
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
            <td width="20%" align="center"><fsn:submit value="submit.cancel" path="cancel" action="${uri}"/></td>
            <td width="20%">&nbsp;</td>
        </tr>
    </table>
    
    <html:hidden path="idPlaza"         id="idPlaza"/>
    <html:hidden path="idUnidadNom"     id="idUnidadNom"/>
    <html:hidden path="descUnidad"      id="descUnidad"/>
    <html:hidden path="idPuestoNom"     id="idPuestoNom"/>
    <html:hidden path="descPuesto"      id="descPuesto"/>
    <!--html:hidden path="idNivelPto"      id="idNivelPto"/-->
    
    <html:hidden path="mcpQnaIni"       id="mcpQnaIni"/>
    <html:hidden path="mcpMonto"  id="mcpMonto"/>
    
    <html:hidden path="cpcSubTipo"      id="cpcSubTipo"/>
    <html:hidden path="mcpMontoAdeudo"  id="mcpMontoAdeudo"/>
    
    <html:hidden path="valida"          id="valida"/>
    
     <script type="text/javascript">
        window.document.forms[0].mcpMontoAdeudoLabel.focus();
        window.document.forms[0].valida.value = true;
    </script>
</html:form>

 