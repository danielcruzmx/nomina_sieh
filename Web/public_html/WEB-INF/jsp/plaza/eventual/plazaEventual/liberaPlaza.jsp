<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="liberaPlazaDTO">

    <html:hidden path="datosFisicos"/>
    <html:hidden path="datosPresupuestales"/>
    
    <html:hidden path="inicioQuincenaCaptura"/>
    <html:hidden path="finQuincenaCaptura"/>
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
    <spring:message code="sireh.label.plaza.eventual.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.eventual.liberaPlaza.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                    <c:if test="${liberaPlazaDTO.datosPresupuestales}">
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.estructura.liberaPlaza.titulo.datosPresupuestales"/>&nbsp;&nbsp;</strong>
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
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idPlaza"/></td>
                            <td align="left"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${liberaPlazaDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idSitPlaza"/></td>
                            <td align="left"><fsn:label path="idSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <td align="left" colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idNivelFisico"/></td>
                            <td align="left"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.nombramiento"/></td>
                            <td align="left"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.proyecto"/></td>
                            <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.proyectoReduccion"/></td>
                            <td align="left"><fsn:label path="idProyReducePre"/></td>
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
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.estructura.liberaPlaza.titulo.eventual"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.idUnidad"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadLibera" 
                                                path="idUnidad"
                                                style="width: 250px;"/>
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.idPuesto"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcPuestoLibera" 
                                                path="idPuesto"
                                                style="width: 250px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.idEdo"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcEstado" 
                                                path="idEdo"
                                                style="width: 250px;"/>
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.idMuni"/></td>
                            <td align="left">
                                <fsn:selectList beanName="tcMunicipio" 
                                                path="idMuni" 
                                                parentPath="idEdo" 
                                                progress="true"
                                                style="width: 250px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.plazaFinCont"/></td>
                            <td align="left"><fsn:calendar path="plazaFinCont" size="10"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.idZonaEco"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="zonaEconomicaLiberaPlaza" 
                                                path="idZonaEco" 
                                                parentPath="idPuesto" 
                                                progress="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idRango"/></td>
                            <td align="left"><fsn:label path="idRango"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.idTipoPlaza"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcTipoPlazaLibera" 
                                                path="idTipoPlaza"
                                                style="width: 250px;"/>
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.idServPub"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcTipoServPubLibera" 
                                                path="idServPub"
                                                style="width: 250px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.idNivelFisico"/></td>
                            <td align="left">
                                <fsn:selectList beanName="nivelLiberaPlaza" 
                                                path="nivelFisico" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.idInmueble"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcInmueble" 
                                                path="idInmueble" 
                                                style="width: 250px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.sueldo"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_ZONA_ECON" condition="contains" path="idZonaEco"/>
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:selectList beanName="sueldoLiberaPlaza" 
                                                path="sueldo" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.compensacion"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_ZONA_ECON" condition="contains" path="idZonaEco"/>
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:selectList beanName="compensacionLiberaPlaza" 
                                                path="compensacion" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                        </tr>
                        <c:if test="${liberaPlazaDTO.idGrupoPago == 'H'}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.importeHonorario"/></td>
                                <td align="left"><c:out value="$"/><fsn:label path="importeHonorario"/></td>
                                <td align="left" colspan="2"></td>
                            </tr>
                        </c:if>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.plazaReferencia"/></td>
                            <td align="left"><fsn:input path="plazaReferencia" size="47" maxlength="60"/></td>
                            <td align="left" colspan="2"></td>
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
                <fsn:submit value="submit.accept" action="plazaEventual/updateLiberaPlaza.do"/>
                <fsn:submit value="submit.cancel" path="cancel" action="plazaEventual/consultaLiberaPlaza.do"/>
            </td>
        </tr>
    </table>
</html:form>