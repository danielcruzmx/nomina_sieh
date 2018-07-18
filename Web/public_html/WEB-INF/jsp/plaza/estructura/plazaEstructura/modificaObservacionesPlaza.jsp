<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="observacionesPlazaDTO">
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
    <spring:message code="sireh.label.plaza.estructura.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientosNomina.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.estructura.observacionesPlaza.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="85%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.titulo.datosPlaza"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.idPlaza"/></td>
                            <td align="left" width="125px"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${observacionesPlazaDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.idSitPlaza"/></td>
                            <td align="left" width="200px"><fsn:label path="descSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${observacionesPlazaDTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${observacionesPlazaDTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.plazaIniCont"/></td>
                            <td align="left"><fsn:label path="plazaIniCont"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.plazaFinCont"/></td>
                            <td align="left"><fsn:label path="plazaFinCont" /></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.observacionesPlaza.plazaReferencia"/></td>
                            <td align="left" colspan="3"><fsn:input path="plazaReferencia" size="60" maxlength="60"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.titulo.datosFisicos"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.idNivelFisico"/></td>
                            <td align="left" width="125px"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.nombramiento"/></td>
                            <td align="left" width="200px"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <c:if test="${observacionesPlazaDTO.datosPresupuestales}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.proyecto"/></td>
                                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.proyectoReduccion"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.titulo.datosEmpleado"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.rfcEmpleado"/></td>
                            <td align="left" width="125px"><fsn:label path="rfcEmpleadoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.observacionesPlaza.nombreEmpleado"/></td>
                            <td align="left" width="200px">
                                <fsn:label path="primerApellidoLabel"/> <fsn:label path="segundoApellidoLabel"/> <fsn:label path="nombreEmpleadoLabel"/>
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
                            <fsn:submit value="submit.accept" action="plazaEstructura/updateObservacionesPlaza.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" path="cancel" action="plazaEstructura/consultaObservacionesPlaza.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</html:form>