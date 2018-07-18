<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="asignaPlazaSoporteDTO">

    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
    <spring:message code="sireh.label.plaza.estructura.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientosNomina.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="85%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.titulo.datosPlaza"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idPlaza"/></td>
                            <td align="left" width="180px"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${asignaPlazaSoporteDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idSitPlaza"/></td>
                            <td align="left" width="200px"><fsn:label path="descSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${asignaPlazaSoporteDTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${asignaPlazaSoporteDTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.plazaIniCont"/></td>
                            <td align="left"><fsn:label path="plazaIniCont"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.plazaFinCont"/></td>
                            <td align="left"><fsn:label path="plazaFinCont"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.titulo.datosPresupuestales"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idNivelFisico"/></td>
                            <td align="left" width="180px"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.nombramiento"/></td>
                            <td align="left" width="200px"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.titulo.datosPlazaSoporte"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label" width="155px"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.plaza"/></td>
                            <td align="left" colspan="3">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="asignaPlazaSoporteDisp" 
                                                path="plazaRespaldo" 
                                                style="width: 338px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.idNivelFisico"/></td>
                            <td align="left">
                                <fsn:selectList beanName="nivelCreacionPlazaSoporte" 
                                                path="nivelFisicoSoporte" 
                                                parentPath="plazaRespaldo" 
                                                progress="true" 
                                                disabled="true"
                                                style="width: 175px;"/>
                            </td>
                            <td align="left" colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="155px"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.nombramiento"/></td>
                            <td align="left" width="180px">
                                <fsn:selectList beanName="nombramientoCreacionPlazaSoporte" 
                                                path="nombramientoSoporte" 
                                                parentPath="plazaRespaldo" 
                                                progress="true" 
                                                disabled="true"
                                                style="width: 175px;"/>
                            </td>
                            <td align="right" class="label" width="155px"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.jerarquia"/></td>
                            <td align="left" width="200px">
                                <fsn:selectList beanName="jerarquiaCreacionPlazaSoporte" 
                                                path="jerarquiaSoporte" 
                                                parentPath="plazaRespaldo" 
                                                progress="true" 
                                                disabled="true" 
                                                style="width: 275px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.sueldo"/></td>
                            <td align="left">
                                <fsn:selectList beanName="sueldoCreacionPlazaSoporte" 
                                                path="sueldoSoporte" 
                                                parentPath="plazaRespaldo" 
                                                progress="true" 
                                                disabled="true" 
                                                style="width: 175px;"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.asignaPlazaSoporte.compensacion"/></td>
                            <td align="left">
                                <fsn:selectList beanName="compensacionCreacionPlazaSoporte" 
                                                path="compensacionSoporte" 
                                                parentPath="plazaRespaldo" 
                                                progress="true" 
                                                disabled="true" 
                                                style="width: 275px;"/>
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
                        <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                    </tr>
                    <tr>
                        <td align="right">
                            <fsn:submit value="submit.accept" action="plazaEstructura/updateAsignaPlazaSoporte.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" path="cancel" action="plazaEstructura/consultaAsignaPlazaSoporte.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>    
</html:form>