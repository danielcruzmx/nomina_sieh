<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="cambioURFisicaPlazaDTO">
    
    <html:hidden path="datosFisicos"/>
    <html:hidden path="datosPresupuestales"/>
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
    <spring:message code="sireh.label.plaza.eventual.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.consulta.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.titulo.eventual"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="85%" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <c:if test="${cambioURFisicaPlazaDTO.datosFisicos}">
                            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.titulo.datosFisicos"/>&nbsp;&nbsp;</strong>
                        </c:if>
                        <c:if test="${cambioURFisicaPlazaDTO.datosPresupuestales}">
                            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.titulo.datosPresupuestales"/>&nbsp;&nbsp;</strong>
                        </c:if>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idPlaza"/></td>
                            <td align="left"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${cambioURFisicaPlazaDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idSitPlaza"/></td>
                            <td align="left"><fsn:label path="descSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${cambioURFisicaPlazaDTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${cambioURFisicaPlazaDTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idNivelFisico"/></td>
                            <td align="left"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.nombramiento"/></td>
                            <td align="left"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <c:if test="${cambioURFisicaPlazaDTO.datosPresupuestales}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.proyecto"/></td>
                                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.proyectoReduccion"/></td>
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
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.titulo.eventual"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idUnidad"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioURFisicaPlazaDTO.idSitPlaza == 'O'}">
                                        <fsn:option key="0" value="selectList.nonValue"/>
                                        <fsn:selectList beanName="tcUnidadCambioURFisicaSinEspeciales" 
                                                        path="idUnidad"
                                                        style="width: 250px;"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:option key="0" value="selectList.nonValue"/>
                                        <fsn:selectList beanName="tcUnidadCambioURFisica" 
                                                        path="idUnidad"
                                                        style="width: 250px;"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="left" colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idEdo"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcEstado" 
                                                path="idEdo"
                                                style="width: 250px;"/>
                            </td>

                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.idMuni"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcMunicipio" 
                                                path="idMuni"
                                                parentPath="idEdo" 
                                                progress="true"
                                                style="width: 250px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.zonaPagadora"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcDistUnidadCambioUR" 
                                                path="idZonaDistNom"
                                                parentPath="idUnidad" 
                                                progress="true"/>
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioURFisicaPlaza.plazaFinCont"/></td>
                            <td align="left"><fsn:calendar path="plazaFinCont" size="10"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        
        <tr>
            <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td align="center">
                <fsn:submit value="submit.accept" action="plazaEventual/updateCambioURFisicaPlaza.do"/>
                <fsn:submit value="submit.cancel" path="cancel" action="plazaEventual/consultaCambioURFisicaPlaza.do"/>
            </td>
        </tr>
    </table>
    
</html:form>