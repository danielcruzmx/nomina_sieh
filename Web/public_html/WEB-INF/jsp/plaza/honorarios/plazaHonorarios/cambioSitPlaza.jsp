<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="cambioSitPlazaDTO">
 
    <html:hidden path="datosFisicos"/>
    <html:hidden path="datosPresupuestales"/>

    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.honorarios.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.titulo.honorarios"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="85%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.titulo.datosPlaza"/></strong></legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idPlaza"/></td>
                            <td align="left"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${cambioSitPlazaDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idSitPlaza"/></td>
                            <td align="left"><fsn:label path="idSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${cambioSitPlazaDTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${cambioSitPlazaDTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idNivelFisico"/></td>
                            <td align="left"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.nombramiento"/></td>
                            <td align="left"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.compensacion"/></td>
                                <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <c:if test="${cambioSitPlazaDTO.datosPresupuestales}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.proyecto"/></td>
                                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.proyectoReduccion"/></td>
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
                        <strong>
                            <c:if test="${cambioSitPlazaDTO.datosFisicos}">
                                <spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.titulo.datosFisicos"></spring:message>
                            </c:if>
                            <c:if test="${cambioSitPlazaDTO.datosPresupuestales}">
                                <spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.titulo.datosPresupuestales"></spring:message>
                            </c:if>
                        </strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idSitPlazaOrigen"/></td>
                            <td align="left"><fsn:label path="descSitPlaza"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.idSitPlazaDestino"/></td>
                            <td align="left">
                                <fsn:filter property="idSitPlazaOrigen" condition="="/>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcSituacionOk" path="idSitPlazaDestino" />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioSitPlaza.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
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
                <fsn:submit value="submit.accept" action="plazaHonorarios/updateCambioSitPlaza.do"/>
                <fsn:submit value="submit.cancel" path="cancel" action="plazaHonorarios/consultaCambioSitPlaza.do"/>
            </td>
        </tr>
    </table>
    
</html:form>