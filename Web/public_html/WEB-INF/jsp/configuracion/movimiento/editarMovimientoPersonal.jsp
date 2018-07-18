<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<spring:message code="sireh.label.configuracion.movimientos.consulta.parametros.constancia.si.value" var="valueConstanciaSi"/>
<spring:message code="sireh.label.configuracion.movimientos.consulta.parametros.constancia.no.value" var="valueConstanciaNo"/>
<spring:message code="sireh.label.configuracion.movimientos.consulta.parametros.constancia.si" var="constanciaSi"/>
<spring:message code="sireh.label.configuracion.movimientos.consulta.parametros.constancia.no" var="constanciaNo"/>
<spring:message code="selectList.nonValue" var="nonValue"/>
<html:form modelAttribute="movimientoPersonalDTO">
    <h1><spring:message code="sireh.label.configuracion.movimientos.personal.titulo"/>&nbsp;-
        <spring:message code="sireh.label.configuracion.movimientos.personal.modifica.titulo" /></h1>
    <p>&nbsp;</p>
    <table align="center" width="75%">
        <tr>
            <td align="right" class="label"><spring:message code="sireh.label.configuracion.movimientos.personal.alta.clave"/></td>
            <td align="left"><html:input maxlength="10" path="idMovsPersonal" size="10" disabled="true"/></td>
            <td align="right" class="label"> * <spring:message code="sireh.label.configuracion.movimientos.personal.alta.descripcion"/></td>
            <td align="left"><html:input maxlength="40" path="descMovsPersonal" size="40"/></td>
        </tr>
        <tr>
            <td align="right" class="label"> * <spring:message code="sireh.label.configuracion.movimientos.personal.alta.constancia"/></td>
            <td align="left">
                <html:radiobutton path="constancia" value="${valueConstanciaSi}" label="${constanciaSi}" />
                <html:radiobutton path="constancia" value="${valueConstanciaNo}" label="${constanciaNo}" />
            </td>
            <td align="right" class="label"> * <spring:message code="sireh.label.configuracion.movimientos.personal.alta.tipoMovimientoMenu"/></td>
            <td align="left">
                <html:select path="mpTipoMovMenu">
                    <html:option value="" label="${nonValue}"/>
                    <html:options items="${movimientoPersonalDTO.tipoMovimientoMenuValores}" itemValue="clave" itemLabel="valor"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <td align="right" class="label"> * <spring:message code="sireh.label.configuracion.movimientos.personal.alta.estructuraPlazaAntes"/></td>
            <td align="left">
                <fsn:option key="" value="selectList.nonValue"/>
                <fsn:selectList beanName="tcSituacionPlaza" path="idSitPlaAnt" />
            </td>
            <td align="right" class="label"> * <spring:message code="sireh.label.configuracion.movimientos.personal.alta.estructuraPlazaDespues"/></td>
            <td align="left">
                <fsn:option key="" value="selectList.nonValue"/>
                <fsn:selectList beanName="tcSituacionPlaza" path="idSitPlaNva" />
            </td>
        </tr>
        <tr>
            <td colspan="4">&nbsp;</td>
        </tr>
        </table>
        <table align="center" width="75%">
            <tr><td colspan="4" align="left"><h1><spring:message code="sireh.label.configuracion.movimientos.personal.alta.grupoPago"/></h1></td></tr>   
            <tr>
                <td align="center" colspan="4">
                    <fsn:doubleSelectList name="idsGrupoPago" beanName="tcGrupoDePago" appendFilters="false" path="idsGrupoPago" size="15" titleOrgn="Disponibles" titleDest="Seleccionados"/>
                </td>
            </tr>
        </table>
        <table align="center" width="75%">
        <tr><td colspan="4" align="left"><h1><spring:message code="sireh.label.configuracion.movimientos.personal.alta.jerarquia"/></h1></td></tr>   
        <tr>
            <td align="center" colspan="4">
                <fsn:doubleSelectList name="idsJerarquia" beanName="tcJerarquia" appendFilters="false"  path="idsJerarquia" size="15" titleOrgn="Disponibles" titleDest="Seleccionados"/>
            </td>
        </tr>
        </table>
        <table align="center" width="75%">
        <tr><td colspan="4" align="left"><h1><spring:message code="sireh.label.configuracion.movimientos.personal.alta.nombramiento"/></h1></td></tr>   
         <tr>
        <td align="center" colspan="4">
                <fsn:doubleSelectList name="idsNombramiento" beanName="tcNombramiento" appendFilters="false"  path="idsNombramiento" size="15" titleOrgn="Disponibles" titleDest="Seleccionados"/>
            </td>
        </tr>
        </table>
        <tr>
            <td align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <fsn:submit value="submit.accept" action="movimientoPersonal/updateMovimientoPersonal"/>
            </td>
            <td align="center" colspan="2">
                <fsn:submit value="submit.cancel" path="cancel" action="movimientoPersonal/cancelarMovimientoPersonal"/>
            </td>
        </tr>
    </table>
    <html:hidden path="idMovsPersonal" />

</html:form>