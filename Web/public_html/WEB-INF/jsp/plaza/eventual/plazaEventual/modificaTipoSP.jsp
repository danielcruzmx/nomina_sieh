<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="modificaTipoSPDTO">
 
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.eventual.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.eventual.modificaTipoSP.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="85%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.titulo.datosPlaza"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idPlaza"/></td>
                            <td align="left" width="125px"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${modificaTipoSPDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idSitPlaza"/></td>
                            <td align="left" width="200px"><fsn:label path="descSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${modificaTipoSPDTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${modificaTipoSPDTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.modificaTipoSP.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.modificaTipoSP.plazaFinCont"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.titulo.datosPresupuestales"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idNivelFisico"/></td>
                            <td align="left" width="125px"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.nombramiento"/></td>
                            <td align="left" width="200px"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <c:if test="${modificaTipoSPDTO.datosPresupuestales}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.proyecto"/></td>
                                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.proyectoReduccion"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.titulo.datosServidorPublico"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="30%"/>
                            <col width="70%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idTipoPlazaActual"/></td>
                            <td align="left" colspan="3"><fsn:label path="idTipoPlazaLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idServPubActual"/></td>
                            <td align="left" colspan="3"><fsn:label path="idServPubLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" width="155px" class="label">* <spring:message code="sireh.label.plaza.eventual.modificaTipoSP.idServPub"/></td>
                            <td align="left" colspan="3">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcModificaTipoSP" 
                                                path="idServPub" 
                                                style="width: 350px;"/>
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
                            <fsn:submit value="submit.accept" action="plazaEventual/updateModificaTipoSP.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" path="cancel" action="plazaEventual/consultaModificaTipoSP.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</html:form>