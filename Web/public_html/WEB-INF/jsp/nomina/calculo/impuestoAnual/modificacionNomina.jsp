<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<spring:message code="selectList.nonValue" var="nonValue"/>

<style type="text/css">
    .anchoInput {
        width: 300px;
    }
</style>
<html:form modelAttribute="nominaAnualDTO">
    
    <html:hidden path="tipoMantenimiento"/>
<!--    <html:hidden path="idNomina"/>  -->
    <html:hidden path="idNextComplemento"/>
    
    <c:if test="${nominaAnualDTO.tipoMantenimiento == \'A\'}">
        <h1>
            <spring:message code="calculo.menu"/>&#45;
            <spring:message code="calculo.admonanual"/>&#45;
            <spring:message code="reporte.calculo.nomina.definicion"/>&#45;
            <spring:message code="sireh.label.nomina.impuesto.anual"/>
        </h1>
    </c:if>
    <c:if test="${nominaAnualDTO.tipoMantenimiento == \'M\'}">
        <h1>
            <spring:message code="calculo.menu"/>&#45;
            <spring:message code="calculo.admonanual"/>&#45;
            <spring:message code="reporte.calculo.nomina.definicion"/>&#45;
            <spring:message code="sireh.label.nomina.impuesto.anual"/>
        </h1>
    </c:if>
    <p>&nbsp;</p>
    
   
    <fieldset>
        <legend>
            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.gestion.grupoInfo.detalles"/>&nbsp;&nbsp;</strong>
        </legend>
        <table align="center" width="100%" border="0">
            <tr>
                <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.numQuincena"/></td>
                <td width="25%" align="left"><fsn:label path="nomQnaCaptura"/></td>
                <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.tipoNomina"/></td>
                <td width="25%" align="left">
                    <fsn:option key="" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaTiposNomina"
                                    disabled="true"
                                    path="idTipoNomina"
                                    style="width: 250px;"
                                    onchange="getTipoNomina()"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.numComplemento"/></td>
                <td align="left"><fsn:label path="nomNumComplem"/></td>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.gpoPago"/></td>
                <td align="left">
                    <fsn:option key="" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaGruposPago"
                                    path="idGrupoPagoNom"
                                    disabled="true"
                                    style="width: 200px;"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.descripcion"/></td>
                <td align="left"><fsn:label path="descNomina"/></td>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.leyenda"/></td>
                <td align="left" colspan="4"><fsn:label path="nomLeyenda" /></td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.reglaCalculo"/></td>
                <td align="left"><fsn:label path="nomReglaCalculo"/></td>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.fuenteDatos"/></td>
                <td align="left"><fsn:label path="nomFuenteDatos"/></td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.status"/></td>
                <td align="left">
                    <c:if test="${nominaAnualDTO.idEdoNom eq 'S'}"><c:out value="PROCESADA"/></c:if>
                    <c:if test="${nominaAnualDTO.idEdoNom eq 'P'}"><c:out value="PROCESANDO"/></c:if>
                    <c:if test="${nominaAnualDTO.idEdoNom eq 'N'}"><c:out value="SIN PROCESO"/></c:if>
                    <c:if test="${nominaAnualDTO.idEdoNom eq 'C'}"><c:out value="CERRADA"/></c:if>
                </td>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.deducciones.ciclo"/></td>
                <td align="left"><fsn:selectList beanName="cicloRegControl_bis" path="ciclo" style="width: 200px;"/></td>
            </tr>
        </table>
    </fieldset><br/>
    
    <fieldset>
        <legend>
            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.impuesto.anual.parametros.importes"/>&nbsp;&nbsp;</strong>
        </legend>
        <table align="center" width="100%" border="0">
            <tr>
                <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.casos"/></td>
                <td width="25%" align="left" width="300px;">
                    <fsn:label path="casos"/>
                </td>
                <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.trabajadores"/></td>
                <td width="25%" align="left" width="300px;">
                    <fsn:label path="trabajadores"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.pensionados"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="pencionados"/>
                </td>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.percepciones"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="percepcionesLabel" />
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.deducciones"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="deduccionesLabel"/>
                </td>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.percepciones.gravables"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="percepcionesGravablesLabel"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.percepciones.excentas"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="percepcionesExcedentesLabel"/>
                </td>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.deducciones.gravables"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="deduccionesGravablesLabel"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.deducciones.excentas"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="deduccionesExcedentesLabel"/>
                </td>
            </tr>
        </table>
    </fieldset><br/>
    <fieldset>
        <legend>
            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.impuesto.anual.parametros.Timbrado"/>&nbsp;&nbsp;</strong>
        </legend>
        <table align="center" width="100%" border="0">
            <tr>
                <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.refsat"/></td>
                <td width="25%" align="left" width="300px;">
                    <fsn:label path="nomRefSat"/>
                </td>
                <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.reftimbrado"/></td>
                <td width="25%" align="left" width="300px;">
                    <fsn:label path="nomRefTimbrado"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.idNomina"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="idNomina"/>
                </td>
            </tr>
        </table>
    </fieldset><br/>
    
    <fieldset>
        <legend>
            <strong>&nbsp;&nbsp;Fechas&nbsp;&nbsp; </strong>
        </legend>
        <table align="center" width="100%" border="0">
            <tr>
                <td width="25%" align="right" class="label">
                    <spring:message code="sireh.label.nomina.gestion.label.inicioPago"/>
                </td>
                <td width="25%" align="left">
                    <fsn:label path="nomIniPago"/>
                </td>
                <td width="25%" align="right" class="label">
                    <spring:message code="sireh.label.nomina.gestion.label.finPago"/>
                </td>
                <td width="25%" align="left">
                    <fsn:label path="nomFinPago"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label">
                    <spring:message code="sireh.label.nomina.gestion.label.fechaPago"/>
                </td>
                <td align="left">
                    <fsn:label path="nomFecPago"/>
                </td>
                <td align="right" class="label">
                    <spring:message code="sireh.label.nomina.gestion.label.fechaDeposito"/>
                </td>
                <td align="left">
                    <fsn:label path="nomFecDeposito"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label">
                    <spring:message code="sireh.label.nomina.gestion.label.fechaApertura"/>
                </td>
                <td align="left">
                    <fsn:label path="nomFecApertura"/>
                </td>
                <td align="right" class="label">
                    <spring:message code="sireh.label.nomina.gestion.label.fechaCierre"/>
                </td>
                    <td align="left">
                        <fsn:label path="nomFecCierre"/>
                    </td>
                <tr><td >&nbsp;<br/></td></tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.fcansat"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="nomFecCancSat"/>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.fcancelacionsireh"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="nomFecCancSireh"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.ftimbrado"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="nomFecTimbrado"/>
                </td>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.fanexo"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="nomFecAnexo20"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.fcreacion"/></td>
                <td align="left" width="300px;">
                    <fsn:label path="nomFecCreacion"/>
                </td>
            </tr>
        </table>
     </fieldset><br/>
    
    <fieldset>
        <legend>
            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.gestion.grupoInfo.aguinaldo"/>&nbsp;&nbsp;</strong>
        </legend>
        <table align="center" width="100%" border="0">
            <tr>
                <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.dias"/></td>
                <td width="25%" align="left" ><fsn:label path="nomDiasPagar"/></td>
                <td width="25%" align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.exentos"/></td>
                <td width="25%" align="left">
                    <c:if test="${nominaAnualDTO.nomAplicarExentos eq 'S'}"><c:out value="SI"/></c:if>
                    <c:if test="${nominaAnualDTO.nomAplicarExentos eq 'N'}"><c:out value="NO"/></c:if>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.vigente"/></td>
                <td align="left">
                    <c:if test="${nominaAnualDTO.nomVigente eq 'V'}"><c:out value="VIGENTE"/></c:if>
                    <c:if test="${nominaAnualDTO.nomVigente eq 'N'}"><c:out value="NO VIGENTE"/></c:if>
                </td>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.gratificacion"/></td>
                <td align="left">
                    <c:if test="${nominaAnualDTO.nomGratifAgui eq 'G'}"><c:out value="NOMINA DE GRATIFICACION"/></c:if>
                    <c:if test="${nominaAnualDTO.nomGratifAgui eq 'A'}"><c:out value="NOMINA DE AGUINALDO"/></c:if>
                    <c:if test="${nominaAnualDTO.nomGratifAgui eq 'B'}"><c:out value="NOMINA DE GRATIFICACION Y AGUINALDO"/></c:if>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.periodo"/></td>
                <td align="left">
                    <c:if test="${nominaAnualDTO.nomCompletarPeriodo eq 'S'}"><c:out value="SI"/></c:if>
                    <c:if test="${nominaAnualDTO.nomCompletarPeriodo eq 'N'}"><c:out value="NO"/></c:if>
                </td>
            </tr>
        </table>
    </fieldset>
    <table align="center" width="100%" border="0">
        <tr>
            <td align="left" height="20px" valign="middle" colspan="2">
                <spring:message code="sireh.form.required.fields"/>
            </td>
        </tr>
        <tr>
            <td align="right">
                    <fsn:submit value="submit.update" action="impuestoAnual/updateNomina"/>
            </td>
            <td align="left">
                <fsn:submit value="submit.cancel" action="impuestoAnual/definicionNominas"/>
            </td>
        </tr>
    </table>
    
</html:form>
