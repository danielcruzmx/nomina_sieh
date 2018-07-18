<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="prorrogaContratoDTO">

    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.eventual.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.eventual.prorrogaContrato.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="85%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.titulo.datosPlaza"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.idPlaza"/></td>
                            <td align="left" width="125px"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${prorrogaContratoDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.idSitPlaza"/></td>
                            <td align="left" width="200px"><fsn:label path="descSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${prorrogaContratoDTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${prorrogaContratoDTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.prorrogaContrato.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.prorrogaContrato.plazaFinCont"/></td>
                            <td align="left"><fsn:calendar path="plazaFinCont" size="10"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td height="10px"></td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.titulo.datosPresupuestales"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.idNivelFisico"/></td>
                            <td align="left" width="125px"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.nombramiento"/></td>
                            <td align="left" width="200px"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <c:if test="${prorrogaContratoDTO.datosPresupuestales}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.proyecto"/></td>
                                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.proyectoReduccion"/></td>
                                <td align="left"><fsn:label path="idProyReducePre"/></td>
                            </tr>
                        </c:if>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td height="10px"></td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.titulo.datosEmpleado"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.rfcEmpleado"/></td>
                            <td align="left" width="125px"><fsn:label path="rfcEmpleadoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.nombreEmpleado"/></td>
                            <td align="left" width="200px">
                                <fsn:label path="primerApellidoLabel"/> <fsn:label path="segundoApellidoLabel"/> <fsn:label path="nombreEmpleadoLabel"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td height="10px"></td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.eventual.prorrogaContrato.titulo.movimiento"/></strong>
                    </legend>
                    <table align="left" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="80%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.prorrogaContrato.tipoMovimiento"/></td>
                            <td align="left">
                                <table align="left" width="66%">
                                    <tr>                        
                                        <td align="left">
                                            <html:radiobutton value="PCE" path="tipoMovimiento" label=" 522 Prorroga de contrato eventual"/>
                                        </td>
                                        <td align="left">
                                            <html:radiobutton value="ME" path="tipoMovimiento" label=" 538 Movimiento eventual"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <table align="center" width="100%" border="0">
                    <tr>
                        <td align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                    </tr>
                    <tr>
                        <td align="right">
                            <fsn:submit value="submit.accept" action="plazaEventual/updateProrrogaContrato.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" path="cancel" action="plazaEventual/consultaProrrogaContrato.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</html:form>