<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="denominacionFuncionalDTO">
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
    <spring:message code="sireh.label.plaza.estructura.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientosNomina.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.estructura.denominacionFuncional.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%" border="0">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.titulo.datosPlaza"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.idPlaza"/></td>
                            <td align="left" width="125px"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${denominacionFuncionalDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.idSitPlaza"/></td>
                            <td align="left" width="200px"><fsn:label path="descSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${denominacionFuncionalDTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${denominacionFuncionalDTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.denominacionFuncional.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.titulo.datosFisicos"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.idNivelFisico"/></td>
                            <td align="left" width="125px"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.nombramiento"/></td>
                            <td align="left" width="200px"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <c:if test="${denominacionFuncionalDTO.datosPresupuestales}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.proyecto"/></td>
                                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.proyectoReduccion"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.titulo.datosEmpleado"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.rfcEmpleado"/></td>
                            <td align="left" width="125px"><fsn:label path="rfcEmpleadoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.denominacionFuncional.nombreEmpleado"/></td>
                            <td align="left" width="200px">
                                <fsn:label path="primerApellidoLabel"/> <fsn:label path="segundoApellidoLabel"/> <fsn:label path="nombreEmpleadoLabel"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td align="center">
                <fsn:submit value="submit.accept" action="plazaEstructura/updateModificaDenominacionFuncional.do"/>
                <fsn:submit value="submit.cancel" path="cancel" action="plazaEstructura/consMoDenominacionFuncional.do"/>
            </td>
        </tr>
    </table>
</html:form>