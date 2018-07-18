<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="datosEmpleadoCptoDTO">
    <h1>
        <strong>
            <spring:message code="nomina.calculo"/>
            <spring:message code="conceptos.control.nomina"/>
            <spring:message code="conceptos.control.nomina.add"/>
        </strong>
    </h1>
    <table align="center" width="100%" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Concepto&nbsp;&nbsp;</strong></legend>
                    
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.rfc"/></td>
                            <td><fsn:label path="rfcEmpleado"/></td>
                            <td><fsn:label path="primerApellido"/><fsn:label path="segundoApellido"/><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.descripcion" /></td>
                            <td align="left" colspan="2"><fsn:label path="descConPag"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.concepto" /></td>
                            <td align="left"  colspan="2"><fsn:label path="idTipoCpto" id="idTipoCpto"/><fsn:label path="idConcepto" id="idConcepto"/>&nbsp;-&nbsp;<fsn:label path="cpcTipoCaptura"/><fsn:label path="cpcTipoCalculo"/><fsn:label path="cpcPermanente"/><fsn:label path="cpcSubTipo"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.sueldo" /></td>
                            <td align="left" colspan="2"><fsn:label path="tabSueldo" id="tabSueldo"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.compensacion" /></td>
                            <td align="left" colspan="2"><fsn:label path="tabCompensacion" id="tabCompensacion"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel" /></td>
                            <td align="left" colspan="2"><fsn:label path="idNivelPto" id="idNivelPto"/></td>
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
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Captura&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="90%" border="0">
                        <tr>
                            <td>
                                <table align="center" width="100%" border="0">
                                    <tr>
                                        <td align="right" class="label" width="20%"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.monto_bis"/></td>
                                        <td align="left" style="font-size:1.1em" width="80%">
                                            <!--<fsn:label path="mcpMontoLabel" id="mcpMontoLabel"/>-->
                                            <fsn:input path="mcpMontoLabel" size="12" maxlength="7" onkeypress="return IsNumber(event);"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia"/></td>
                                        <td align="left" width="37%"><html:input path="mcpRefCaptura" size="47" maxlength="60" /></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td width="50%">
                                <fieldset>
                                <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Per&iacute;odo de Aplicaci&oacute;n&nbsp;&nbsp;</strong></legend>
                                    <table align="center" width="100%" border="0">
                                        <tr><td colspan="2">&nbsp;</td></tr>
                                        <tr>
                                            <td align="right" class="label" width="20%"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.desde"/></td>
                                            <td align="left" width="80%"><fsn:label path="mcpQnaIniLabel"/></td>
                                        </tr>
                                        <tr>
                                            <td align="right" class="label">
                                                <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.hasta"/>
                                            </td>
                                            <td><strong><fsn:label path="mcpQnaFinLabel"/></strong></td>
                                        </tr>
                                        <tr><td align="center" colspan="2"><strong><fsn:label path="cpcMensaje"/></strong></td></tr>
                                    </table>
                                </fieldset>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <table align="center" width="100%" border="0">
                                    <tr>
                                        <td align="right" class="label" width="20%"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.capturadoPor"/></td>
                                        <td align="left" width="80%"><fsn:label path="usuario"/></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="100%" border="0">
        <tr><td colspan="4" align="left" ><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
        <tr align="center">
            <td width="25%">&nbsp;</td>
            <td width="25%"><fsn:submit value="submit.accept" action="calculoNomina/addrConceptoControl.do"  /></td>
            <td width="25%"><fsn:submit value="submit.cancel" action="calculoNomina/conceptosControl.do"  /></td>
            <td width="25%">&nbsp;</td>
        </tr>
    </table>
    
    <html:hidden path="mcpMonto" id="mcpMonto"/>
    <html:hidden path="mcpQnaIni" id="mcpQnaIni"/>
    <html:hidden path="mcpQnaFin" id="mcpQnaFin"/>
    <html:hidden path="mcpQnaADescontar" id="mcpQnaADescontar"/>
    
    <script  type="text/javascript">
        var nav4 = window.Event ? true : false;
        function IsNumber(e){
            var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
           return ((tecla > 47 && tecla < 58) || tecla == 46);
        }
    </script>
 
</html:form>

 