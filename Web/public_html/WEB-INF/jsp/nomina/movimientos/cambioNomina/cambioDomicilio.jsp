<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="cambioDomicilioDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="70%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Datos del Empleado&nbsp;&nbsp; </strong></legend>
                    <table align="center" width="90%">
                        <tr>
                            <td colspan="4">&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.rfcEmpleado"/></td>
                            <td align="left"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${cambioDomicilioDTO.rfcEmpleado}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.primerApellido"/></td>
                            <td align="left"><fsn:label path="primerApellido"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.segundoApellido"/></td>
                            <td align="left"><fsn:label path="segundoApellido"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.nombreEmpleado"/></td>
                            <td align="left"><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.curpEmpleado"/></td>
                            <td align="left"><fsn:label path="curpEmpleado"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.imssIssste"/></td>
                            <td align="left"><fsn:label path="imssIssste"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.ingresoGobFed"/></td>
                            <td align="left"><fsn:label path="ingresoGobFed" /></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.ingresoDependencia"/></td>
                            <td align="left"><fsn:label path="ingresoDependencia"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.clabeEmpleado"/></td>
                            <td align="left"><fsn:label path="clabeEmpleado"/></td>
                        </tr>
                        <tr>
                            <td colspan="4">&nbsp;</td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/><br/>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Domicilio del Empleado&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="90%">
                        <tr><td colspan="4">&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label" width="40%">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.calle"/></td>
                            <td align="left" width="60%"><html:input path="calleParticular" size="50"/></td>
                            <td align="right" class="label" width="40%">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.colonia"/></td>
                            <td align="left" width="60%"><html:input path="coloniaParticular" size="50" /></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.telefono"/></td>
                            <td align="left" width="60%"><html:input path="telParticular" size="15" maxlength="15" /></td>
                            <td align="right" class="label" width="40%">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.cp"/></td>
                            <td align="left" width="60%"><html:input path="codpostParticular" size="5" maxlength="5"/></td>
                        </tr>
                            <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.entidadFederativa"/></td>
                            <td align="left">
                            <fsn:option key="0" value="selectList.nonValue" /><fsn:selectList beanName="tcEstado" path="idEdoParticular"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.delegacion"/></td>
                            <td align="left">
                                <fsn:option key="-1" value="selectList.nonValue" />
                                <!--fsn:option key="0" value="selectList.nonValue" /--> <!-- porque la lista esta iniciando con 0 -->
                                <fsn:selectList beanName="tcMunicipio" path="idMuniParticular" parentPath="idEdoParticular" progress="true"/>
                            </td>
                        </tr>
                        <tr>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
         <table align="center" width="100%">
            <tr>
                <td colspan="4" align="left" align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                <td align="center"><fsn:submit value="submit.accept" action="cambioNomina/updateEmpleadoCambioDomicilio.do"/></td>
                <td align="left"><fsn:submit value="submit.cancel" path="cancel" action="cambioNomina/consultarDomicilio.do"/></td>
            </tr>
        </table>
</html:form>