<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="cambioPtoFisicoPlazaDTO">

    <html:hidden path="puestoSobrevaluado"/>
    <html:hidden path="datosFisicos"/>
    <html:hidden path="datosPresupuestales"/>
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
    <spring:message code="sireh.label.plaza.eventual.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.consulta.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.titulo.eventual"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <c:if test="${cambioPtoFisicoPlazaDTO.datosFisicos}">
                            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.titulo.datosFisicos"/>&nbsp;&nbsp;</strong>
                        </c:if>
                        <c:if test="${cambioPtoFisicoPlazaDTO.datosPresupuestales}">
                            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.titulo.datosPresupuestales"/>&nbsp;&nbsp;</strong>
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
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idPlaza"/></td>
                            <td align="left"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${cambioPtoFisicoPlazaDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idSitPlaza"/></td>
                            <td align="left"><fsn:label path="idSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${cambioPtoFisicoPlazaDTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${cambioPtoFisicoPlazaDTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idNivelFisico"/></td>
                            <td align="left"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.nombramiento"/></td>
                            <td align="left"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <c:if test="${cambioPtoFisicoPlazaDTO.datosPresupuestales}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.proyecto"/></td>
                                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.proyectoReduccion"/></td>
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
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.titulo.eventual"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idSitPlaza"/></td>
                            <td align="left"><fsn:label path="descSitPlaza"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idPuesto"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcPuestoCambioPtoFisicoPlaza" 
                                                path="idPuesto"
                                                style="width: 250px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idRango"/></td>
                            <td align="left"><fsn:label path="idRango"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.idZonaEco"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="zonaEconomicaCambioPtoFisicoPlaza" 
                                                path="idZonaEco" 
                                                parentPath="idPuesto" 
                                                progress="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.sueldo"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_ZONA_ECON" condition="contains" path="idZonaEco"/>
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:selectList beanName="sueldoCambioPtoFisicoPlaza" 
                                                path="sueldo" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.compensacion"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_ZONA_ECON" condition="contains" path="idZonaEco"/>
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:selectList beanName="compensacionCambioPtoFisicoPlaza" 
                                                path="compensacion" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.cambioPtoFisicoPlaza.plazaReferencia"/></td>
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
                <c:if test="${cambioPtoFisicoPlazaDTO.verificar}">
                    <fsn:submit value="submit.accept" action="plazaEventual/updateCambioPtoFisicoPlaza.do"/>&nbsp;
                </c:if>
                <fsn:submit value="submit.verify" path="verificar" action="plazaEventual/verificaCambioPtoFisicoPlaza.do"/>&nbsp;
                <fsn:submit value="submit.cancel" path="cancel" action="plazaEventual/consCambioPtoFisicoPlaza.do"/>
            </td>
        </tr>
    </table>
</html:form>