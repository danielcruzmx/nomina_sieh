<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<html:form modelAttribute="cancelaPagoDTO">
    <p>
        <h1><spring:message code="sireh.label.nomina.movimiento.bloqueoDeposito.titulo"></spring:message></h1>
    </p>
    <p>&nbsp;</p>
    <table align="center" width="70%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Empleado&nbsp;&nbsp; </strong></legend>
                    <table align="center" width="90%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.numeroFolio"/></td>
                            <td align="left"><html:input path="hpFolio" size="13" maxlength="10" /></td>
                                <c:if test="${not empty cancelaPagoDTO.nombreEmpleado}">
                                    <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cancelaPago.tipoNomina"/></td>
                                    <td align="left"><fsn:label path="descTipoNomina"/></td>
                                </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.rfc"/></td>
                            <td align="left"><html:input path="hpRfc" size="19" maxlength="13" /></td>
                                <c:if test="${not empty cancelaPagoDTO.nombreEmpleado}">
                                    <td align="left" class="label" colspan="2"><fsn:label path="primerApellido"/><fsn:label path="segundoApellido"/><fsn:label path="nombreEmpleado"/></td>
                                </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.claveDiferenciadora"/></td>
                            <td align="left"><html:input path="hpDifFolio" size="6" maxlength="3" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.bloqueoDepto.CtaClave"/></td>
                            <td align="left"><fsn:label path="hpClabe"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.liquido"/></td>
                            <td align="left"><html:input path="hpNetoPago" size="41" maxlength="38" /></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/>
    <c:if test="${not empty cancelaPagoDTO.nombreEmpleado}">
        <table align="center" width="100%">
            <tr>
                <td>
                    <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Datos para bloquear el deposito &nbsp;&nbsp;</strong></legend>
                        <table align="center" width="90%">
                            <tr><td>&nbsp;</td></tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cancelaPago.qnaPago"/></td>
                                <td align="left"><fsn:label path="hpQnaPago"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cancelaPago.situacionCheque"/></td>
                                <td align="left"><fsn:label path="descSitPago"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.bloqueoDepto.envio"/></td>
                                <td align="left">
                                    <html:select path="seleccionado" >
                                        <html:option value="-1"><spring:message code="selectList.nonValue"/></html:option>
                                        <html:option value="1"> a la cuenta de la DGRH </html:option>
                                    </html:select>
                                </td>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.referencia"/></td>
                                <td align="left" ><html:input path="cpcReferencia"/></td>
                            </tr>
                            <tr>
                                <!--td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.cpcQnaAplica"/></td-->
                                <!--td align="left"><fsn:option key="0" value="selectList.nonValue"/><fsn:selectList beanName="QRegControl" path="cpcQnaAplica"/></td-->
                            </tr>
                            <tr><td>&nbsp;</td></tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:if>
    <c:if test="${empty cancelaPagoDTO.nombreEmpleado}">
        <table align="center" width="70%">
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
            </tr>
        </table>
    </c:if>
    <table align="center" width="70%">
            <tr>
                <td colspan="2" align="center"><c:if test="${empty cancelaPagoDTO.nombreEmpleado}"><fsn:submit value="submit.validar" action="movimientoNomina/validaBloqueoDeposito.do" /></c:if></td>
                <td colspan="2" align="center"><c:if test="${not empty cancelaPagoDTO.nombreEmpleado}"><fsn:submit value="submit.corregir" path="cancel" action="movimientoNomina/corrigeBloqueoDeposito.do"/></c:if></td>
                <td colspan="2" align="center"><fsn:submit value="submit.cancel" path="cancel" action="sireh/home.do"/></td>
            </tr>
        </table>
        <html:hidden path="hpDepositoSN" id="hpDepositoSN"/>
</html:form>