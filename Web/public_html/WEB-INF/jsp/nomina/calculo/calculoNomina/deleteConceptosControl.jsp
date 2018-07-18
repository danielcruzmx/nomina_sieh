<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="datosEmpleadoCptoDTO">
    <h1>
        <strong>
            <spring:message code="nomina.calculo"/>
            <spring:message code="conceptos.control.nomina"/>
            <spring:message code="conceptos.control.nomina.delete"/>
        </strong>
    </h1>
    
    
    <table align="center" width="100%" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Empleado&nbsp;&nbsp;</strong></legend>
                    <table align="center" width= "100%"  border="0">
                        <tr>
                            <td align="right" class="label" width="20%" ><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.rfc"/></td>
                            <td align="left" width="30%"><fsn:label path="rfcEmpleado"/></td>
                            <td align="right" class="label" width="20%" ><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nombre"/></td>
                            <td align="center" width="30%"><fsn:label path="primerApellido"/><fsn:label path="segundoApellido"/><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Datos de la plaza y el puesto&nbsp;&nbsp;</strong></legend>
                    <table align="center" width= "100%" border="0">
                        <tr>
                            <td align="right" class="label" width="20%"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel"/></td>
                            <td align="left" width="80%"><fsn:label path="idNivelPto"/></td>
                        </tr>
                        <tr>
                            <td align="left" class="label" width="20%"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.numeroPlaza"/></td>
                            <td width="80%"><fsn:label path="idPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.unidad"/></td>
                            <td align="left" width="80%"><fsn:label path="idUnidadNom"/>&nbsp;&nbsp;&nbsp;<fsn:label path="descUnidad"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.puesto"/></td>
                            <td align="left" width="80%"><fsn:label path="idPuestoNom"/>&nbsp;&nbsp;&nbsp;&nbsp;<fsn:label path="descPuesto"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="100%" border="0">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Detalle del Concepto&nbsp;&nbsp;</strong></legend>
                    <table align="center" width= "90%" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.tipo"/></td>
                            <td align="left"><fsn:label path="idTipoCpto"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.conceptoPago"/></td>
                            <td align="left"><fsn:label path="idConcepto"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.descripcion"/></td>
                            <td align="left" ><fsn:label path="descConPag"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.monto"/></td>
                            <td align="left" ><fsn:label path="mcpMonto"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia"/></td>
                            <td align="left"><html:input path="mcpRefCancela" size="60" maxlength="60" tabindex="0" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.actualizo"/></td>
                            <td align="left" ><fsn:label path="usuario"/></td>
                        </tr>
                    </table>
                    <html:hidden path="cpcSubTipo"/>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="100%" border="0">
        <tr align="center">
            <td width="25%">&nbsp;</td>
            <td width="25%"><fsn:submit value="submit.delete" action="calculoNomina/deleterConceptoControl.do"  /></td>
            <td width="25%"><fsn:submit value="submit.cancel" action="calculoNomina/conceptosControl.do"  /></td>
            <td width="25%">&nbsp;</td>
        </tr>
    </table>
</html:form>