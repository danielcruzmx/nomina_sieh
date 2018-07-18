<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:message code="sireh.label.plaza.estructura.prorrogaArt34.tipoProrroga.prorroga" var="prorroga"/>
<spring:message code="sireh.label.plaza.estructura.prorrogaArt34.tipoProrroga.ocupacion" var="operacion"/>

<html:form modelAttribute="prorrogaArt34DTO">
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
    <spring:message code="sireh.label.plaza.estructura.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientosNomina.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.estructura.prorrogaArt34.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="85%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.titulo.datosPlaza"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.idPlaza"/></td>
                            <td align="left" width="125px"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${prorrogaArt34DTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.idSitPlaza"/></td>
                            <td align="left" width="200px"><fsn:label path="descSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${prorrogaArt34DTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${prorrogaArt34DTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.prorrogaArt34.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.prorrogaArt34.plazaFinCont"/></td>
                            <td align="left"><fsn:calendar path="plazaFinCont" size="10"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="right">
                                <html:radiobutton value="prorroga" path="tipoProrroga" label="${prorroga}" />
                            </td>
                            <td colspan="2" align="left">
                                <html:radiobutton value="ocupacion" path="tipoProrroga" label="${operacion}"/>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.titulo.datosFisicos"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.idNivelFisico"/></td>
                            <td align="left" width="125px"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.nombramiento"/></td>
                            <td align="left" width="200px"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <c:if test="${prorrogaArt34DTO.datosPresupuestales}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.proyecto"/></td>
                                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.proyectoReduccion"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.titulo.datosEmpleado"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.rfcEmpleado"/></td>
                            <td align="left" width="125px"><fsn:label path="rfcEmpleadoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.prorrogaArt34.nombreEmpleado"/></td>
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
                            <fsn:submit value="submit.accept" action="plazaEstructura/updateProrrogaArt34.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" path="cancel" action="plazaEstructura/consultaProrrogaArt.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</html:form>