<%--@Descripcion: Vista encargada de actualizar el tipo de discapacidad del empleado.--%>
<%--@Autor: Oscar S.--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
    .anchoInputSmall {
        width: 100px;
    }
</style>

<html:form modelAttribute="tipoDiscapacidadRuspDTO">
    
    <html:hidden path="plaza"/>
    <html:hidden path="rfc"/>
    
    <h1><spring:message code="sireh.label.rusp.herramientas.tipoDiscapacidad.title"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del empleado-plaza</strong></legend>
                    <table width="900">
                        <colgroup>
                            <col width="25%"/>
                            <col width="25%"/>
                            <col width="25%"/>
                            <col width="25%"/>
                        </colgroup>
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.plaza"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.plaza}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.puesto"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.puesto}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.rfc"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.rfc}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.codigoPuesto"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.codigoPuesto}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.nombre"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.nombre}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.unidad"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.unidad}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.primerApellido"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.primerApellido}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.jerarquia"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.jerarquia}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.segundoApellido"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.segundoApellido}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.nombramiento"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.nombramiento}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.emailOficial"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.emailOficial}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.emailPersonal"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.emailPersonal}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.fecGobiernoFederal"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.fecGobiernoFederal}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.fecShcp"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.fecShcp}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.plazaUltimoMovto"/>:</td>
                                <td colspan="2">
                                    <c:out value="${tipoDiscapacidadRuspDTO.plazaUltimoMovto}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.fecIngSpc"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.fecIngSpc}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.fecIniDeclPatr"/>:</td>
                                <td>
                                    <c:out value="${tipoDiscapacidadRuspDTO.fecIniDeclPatr}" />
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td>&nbsp;</td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Actualizaci&oacute;n del personal de la instituci&oacute;n que tiene alguna discapacidad.</strong></legend>
                    <table width="900">
                        <colgroup>
                            <col width="25%"/>
                            <col width="75%"/>
                        </colgroup>
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.tipoDiscapacidad.tipoDiscapacidad"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcTipoDiscapacidad-tipoDiscapacidad" 
                                                    path="idDiscapacidad"
                                                    style="width:200px;"/>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td valign="middle" height="20px" align="left">
                <b>* Campos requeridos</b>
            </td>
        </tr>
        <tr align="center">
            <td>
                <table width="90%" border="0" align="center">
                    <tr>
                        <td align="center">
                            <fsn:submit value="submit.save" 
                                        action="herramientasRusp/saveTipoDiscapacidad.do"
                                        progressBar="true"
                                        alertCode="confirm.rusp.herramientas.tipoDiscapacidad"/> &nbsp;
                            <fsn:submit value="submit.cancel" 
                                        action="herramientasRusp/consultaTipoDiscapacidad.do"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</html:form>