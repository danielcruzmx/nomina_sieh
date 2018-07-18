<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .columnHeader {
        background-color: rgb(109, 109, 109);
        color: rgb(255, 255, 255);
        font-weight: bold;
        text-align: center;
    }
    .columnFoter {
        background-color: rgb(0, 110, 219);
        color: rgb(255, 255, 255);
        font-weight: bold;
        text-align: center;
    }
</style>

<%-- Inicializar la forma --%> 
<html:form modelAttribute="tablaDTO">
    
    <h1>
        <strong>
            <spring:message code="expediente.servicios"/> &#45;&nbsp;
            <spring:message code="sireh.label.servicio.actualizarRegPorTabla"/> &#45;&nbsp;
            <spring:message code="sireh.label.servicio.actualizarRegPorTabla.tnMovtosEmplPlaza"/>
        </strong>
    </h1>
    
    <table width="80%" align="center" border="0">
        <tr>
            <td>
                <fieldset><legend style='font-size:1.2em';>&nbsp;Busqueda&nbsp;</legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td width="25%" align="right" class="label">* <spring:message code="sireh.label.servicio.actualizarRegPorTabla.movtosEmplPlaza"/></td>
                            <td width="15%" align="left">
                                <fsn:input path="idMovtosEmpPla" size="10" maxlength="6" onkeypress="return IsNumber(event);"/>
                            </td>
                            <td width="20%" align="left" colspan="3">
                                <fsn:submit value="submit.search"
                                            path="buscar"
                                            action="servicios/updateTnMovtosEmplPlaza.do"
                                            progressBar="true"/>
                                
                                <c:if test="${tablaDTO.buscar}">
                                    <fsn:submit value="submit.save"
                                                path="salvar"
                                                action="servicios/updateTnMovtosEmplPlaza.do"
                                                progressBar="true"/>
                                </c:if>
                            </td>
                            
                            <td width="40%">
                                <c:if test="${tablaDTO.buscar}"><p><strong><c:out value="${tablaDTO.nombre}"/></strong></p></c:if>
                            </td>
                        </tr>
                        <tr><td colspan="4"><strong>* Campos requeridos.<br/></strong></td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br>
                
    <c:if test="${tablaDTO.buscar}">
        <table width="80%" align="center" border="0">
            <tr>
                <td>
                    <fieldset><legend style='font-size:1.2em';>&nbsp;<spring:message code="sireh.label.servicio.actualizarRegPorTabla.bisel"/>&nbsp;</legend>
                        <table width="95%" align="center" border="0">
                            <tr><td>&nbsp;</td></tr>
                            <tr>
                                <td class="columnHeader"><spring:message code="sireh.label.servicio.tdPlaza.campo"/></td>
                                <td class="columnHeader"><spring:message code="sireh.label.servicio.tdPlaza.valor.actual"/></td>
                                <td class="columnHeader"><spring:message code="sireh.label.servicio.tdPlaza.valor.nuevo"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_MOVTOS_EMP_PLA"/></td>
                                <td align="left"><c:out value="${tablaDTO.idMovtosEmpPla}"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_MOVTO_PERSONA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idMovtoPersona}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcMovsPersonal"
                                                    path="tnMovtosEmpPlaDTO.idMovtoPersona"
                                                    style="width: 200px;"
                                                    appendFilters="false" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_PLAZA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idPlaza}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.idPlaza" size="20" maxlength="22"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_SITUACION_PLAZA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idSituacionPlaza}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcSitPlaza"
                                                    path="tnMovtosEmpPlaDTO.idSituacionPlaza"
                                                    style="width: 200px;" 
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_RFC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepRfc}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepRfc" size="20" maxlength="13"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_PLAZA_RESPALDO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepPlazaRespaldo}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepPlazaRespaldo" size="20" maxlength="22"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_GRUPO_PAGO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idGrupoPago}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcGrupoPago"
                                                    path="tnMovtosEmpPlaDTO.idGrupoPago"
                                                    style="width: 200px;" 
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_UNIDAD_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idUnidadPre}"/></td>
                                <td align="left">
                                    <fsn:filter property="uni_ciclo" condition="=" path="ciclo" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcUnidadByCiclo"
                                                    path="tnMovtosEmpPlaDTO.idUnidadPre"
                                                    style="width: 200px;" 
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_PUESTO_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idPuestoPre}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcPuesto"
                                                    path="tnMovtosEmpPlaDTO.idPuestoPre"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_EDO_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idEdoPre}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcEstado"
                                                    path="tnMovtosEmpPlaDTO.idEdoPre"
                                                    style="width: 200px;"
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_ZONA_ECO_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idZonaEcoPre}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcZonaEcon"
                                                    path="tnMovtosEmpPlaDTO.idZonaEcoPre"
                                                    style="width: 200px;"
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_RANGO_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idRangoPre}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcRangoTabul"
                                                    path="tnMovtosEmpPlaDTO.idRangoPre"
                                                    style="width: 200px;"
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_UNIDAD_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idUnidadNom}"/></td>
                                <td align="left">
                                    <fsn:filter property="uni_ciclo" condition="=" path="ciclo" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcUnidadByCiclo"
                                                    path="tnMovtosEmpPlaDTO.idUnidadNom"
                                                    style="width: 200px;" 
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_PUESTO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idPuestoNom}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcPuesto"
                                                    path="tnMovtosEmpPlaDTO.idPuestoNom"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_NIVEL_PTO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idNivelPtoNom}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcNivelPto"
                                                    path="tnMovtosEmpPlaDTO.idNivelPtoNom"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_NOMBRAMIENTO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idNombramientoNom}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcNombramientoo"
                                                    path="tnMovtosEmpPlaDTO.idNombramientoNom"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_JERARQUIA_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idJerarquiaNom}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcJerarquiaa"
                                                    path="tnMovtosEmpPlaDTO.idJerarquiaNom"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_EDO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idEdoNom}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcEstado"
                                                    path="tnMovtosEmpPlaDTO.idEdoNom"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_MUNI_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idMuniNom}"/></td>
                                <td align="left">
                                    <fsn:filter property="b.ID_EDO" condition="=" path="tnMovtosEmpPlaDTO.idEdoNom" />
                                    <fsn:selectList beanName="tcMuniNom"
                                                path="tnMovtosEmpPlaDTO.idMuniNom"
                                                style="width: 200px;"
                                                appendFilters="false" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_ZONA_ECO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idZonaEcoNom}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcZonaEcon"
                                                    path="tnMovtosEmpPlaDTO.idZonaEcoNom"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_RANGO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idRangoNom}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcRangoTabul"
                                                    path="tnMovtosEmpPlaDTO.idRangoNom"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_ZONA_DIST_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idZonaDistNom}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcZonaDist"
                                                    path="tnMovtosEmpPlaDTO.idZonaDistNom"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_IMPORTE_HONORARIO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepImporteHonorario}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepImporteHonorario" size="20" maxlength="22"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_ULTIMO_MOVTO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepUltimoMovto}"/></td>
                                <td align="left"><fsn:calendar path="mepUltimoMovto" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_INI_CONT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepIniCont}"/></td>
                                <td align="left"><fsn:calendar path="mepIniCont" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_FIN_CONT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepFinCont}"/></td>
                                <td align="left"><fsn:calendar path="mepFinCont" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_INI_LIC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepIniLic}"/></td>
                                <td align="left"><fsn:calendar path="mepIniLic" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_FIN_LIC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepFinLic}"/></td>
                                <td align="left"><fsn:calendar path="mepFinLic" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_QNA_CAPTURA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepQnaCaptura}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepQnaCaptura" size="20" maxlength="22"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_TIPO_PLAZA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idTipoPlaza}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcTipoPlaza"
                                                    path="tnMovtosEmpPlaDTO.idTipoPlaza"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_SERV_PUB"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idServPub}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcTipoServPub"
                                                    path="tnMovtosEmpPlaDTO.idServPub"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_PTO_ESTRATEGICO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idPtoEstrategico}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcPtoEstrategico"
                                                    path="tnMovtosEmpPlaDTO.idPtoEstrategico"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_INMUEBLE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idInmueble}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcInmueble"
                                                    path="tnMovtosEmpPlaDTO.idInmueble"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_EDIF"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepEdif}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepEdif" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_PISO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepPiso}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepPiso" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_ALA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepAla}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepAla" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_OFNA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepOfna}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepOfna" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_TEL_OF1"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepTelOf1}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepTelOf1" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_TEL_OF2"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepTelOf2}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepTelOf2" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_CONMUT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepConmut}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepConmut" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_EXT1"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepExt1}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepExt1" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_EXT2"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepExt2}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepExt2" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_RFC_UNICO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepRfcUnico}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepRfcUnico" size="20" maxlength="13"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_BANCO_SAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idBancoSar}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcBanco"
                                                    path="tnMovtosEmpPlaDTO.idBancoSar"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_TIPO_PAGO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idTipoPago}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcTipoPago"
                                                path="tnMovtosEmpPlaDTO.idTipoPago"
                                                style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_IMSS_ISSSTE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepImssIssste}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepImssIssste" size="20" maxlength="11"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_SISTEMA_REPARTO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepSistemaReparto}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepSistemaReparto" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_CURP"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepCurp}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepCurp" size="20" maxlength="18"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_NOMBRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepNombre}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepNombre" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_PRIMER_APELLIDO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepPrimerApellido}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepPrimerApellido" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_SEGUNDO_APELLIDO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepSegundoApellido}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepSegundoApellido" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_FEC_NACIMIENTO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepFecNacimiento}"/></td>
                                <td align="left"><fsn:calendar path="mepFecNacimiento" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_CLABE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepClabe}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepClabe" size="20" maxlength="18"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_REFERENCIA_OFICIO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepReferenciaOficio}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepReferenciaOficio" size="20" maxlength="19"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_INGRESO_GOB_FED"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepIngresoGobFed}"/></td>
                                <td align="left"><fsn:calendar path="mepIngresoGobFed" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_INGRESO_DEPENDENCIA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepIngresoDependencia}"/></td>
                                <td align="left"><fsn:calendar path="mepIngresoDependencia" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_CASO_MUESTRA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepCasoMuestra}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepCasoMuestra" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_CALLE_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepCalleParticular}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepCalleParticular" size="20" maxlength="120"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_COLONIA_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepColoniaParticular}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepColoniaParticular" size="20" maxlength="50"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_MUNI_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idMuniParticular}"/></td>
                                <td align="left">
                                    <fsn:filter property="b.ID_EDO" condition="=" path="tnMovtosEmpPlaDTO.idEdoParticular" />
                                    <fsn:selectList beanName="tcMuniNom"
                                                    path="tnMovtosEmpPlaDTO.idMuniParticular"
                                                    style="width: 200px;"
                                                    appendFilters="false" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_EDO_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idEdoParticular}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcEstado"
                                                    path="tnMovtosEmpPlaDTO.idEdoParticular"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_CODPOST_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepCodpostParticular}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepCodpostParticular" size="20" maxlength="5"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_TEL_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepTelParticular}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepTelParticular" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_EDO_CIVIL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idEdoCivil}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEstadoCivil"
                                                    path="tnMovtosEmpPlaDTO.idEdoCivil"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_E_MAIL_OFICIAL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepEMailOficial}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepEMailOficial" size="20" maxlength="60"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_E_MAIL_PERSONAL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepEMailPersonal}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepEMailPersonal" size="20" maxlength="60"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_EDO_NAC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idEdoNac}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEstado"
                                                    path="tnMovtosEmpPlaDTO.idEdoNac"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_GENERO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idGenero}"/></td>
                                <td align="left">
                                    <fsn:selectList beanName="tcGenero"
                                                    path="tnMovtosEmpPlaDTO.idGenero"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_NACIONALIDAD"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idNacionalidad}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcNacionalidad"
                                                    path="tnMovtosEmpPlaDTO.idNacionalidad"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_DISCAPACIDAD"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepDiscapacidad}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepDiscapacidad" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_NIVEL_ESCOLAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idNivelEscolar}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcNivelEscolar"
                                                    path="tnMovtosEmpPlaDTO.idNivelEscolar"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_PROFN_CARRERA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idProfnCarrera}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcProfnCarrera"
                                                    path="tnMovtosEmpPlaDTO.idProfnCarrera"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_INST_EDUCATIVA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idInstEducativa}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcInstEducativa"
                                                    path="tnMovtosEmpPlaDTO.idInstEducativa"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_INST_PROTCIVIL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idInstProtcivil}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcIstProtCivil"
                                                    path="tnMovtosEmpPlaDTO.idInstProtcivil"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_ESP_PROTCIVIL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idEspProtcivil}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEspProtCivil"
                                                    path="tnMovtosEmpPlaDTO.idEspProtcivil"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_ESTUDIA_SI_NO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepEstudiaSiNo}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepEstudiaSiNo" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_PADRE_MADRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepPadreMadre}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepPadreMadre" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_TERMINO_CARGO_SIND"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepTerminoCargoSind}"/></td>
                                <td align="left"><fsn:calendar path="mepTerminoCargoSind" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_COMPAT_EMPLEO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepCompatEmpleo}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepCompatEmpleo" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_RUSP"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idRusp}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.idRusp" size="20" maxlength="22"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_FEC_NOT_DEC_PATR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepFecNotDecPatr}"/></td>
                                <td align="left"><fsn:calendar path="mepFecNotDecPatr" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_FEC_INI_DECL_PATR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepFecIniDeclPatr}"/></td>
                                <td align="left"><fsn:calendar path="mepFecIniDeclPatr" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_FEC_ING_SPC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepFecIngSpc}"/></td>
                                <td align="left"><fsn:calendar path="mepFecIngSpc" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_SPC_ANIO_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepSpcAnioAnt}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepSpcAnioAnt" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_UNIDAD_NOM_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idUnidadNomAnt}"/></td>
                                <td align="left">
                                    <fsn:filter property="uni_ciclo" condition="=" path="ciclo" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcUnidadByCiclo"
                                                    path="tnMovtosEmpPlaDTO.idUnidadNomAnt"
                                                    style="width: 200px;" 
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_PUESTO_NOM_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idPuestoNomAnt}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcPuesto"
                                                    path="tnMovtosEmpPlaDTO.idPuestoNomAnt"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_EDO_NOM_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idEdoNomAnt}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEstado"
                                                    path="tnMovtosEmpPlaDTO.idEdoNomAnt"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_MUNI_NOM_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idMuniNomAnt}"/></td>
                                <td align="left">
                                    <fsn:filter property="b.ID_EDO" condition="=" path="tnMovtosEmpPlaDTO.idEdoNomAnt" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcMuniNom"
                                                    path="tnMovtosEmpPlaDTO.idMuniNomAnt"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_ZONA_ECO_NOM_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idZonaEcoNomAnt}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcZonaEcon"
                                                    path="tnMovtosEmpPlaDTO.idZonaEcoNomAnt"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_RANGO_NOM_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idRangoNomAnt}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcRangoTabul"
                                                    path="tnMovtosEmpPlaDTO.idRangoNomAnt"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_NOMBRAMIENTO_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idNombramientoAnt}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcNombramiento"
                                                    path="tnMovtosEmpPlaDTO.idNombramientoAnt"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_PLAZA_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepPlazaAnt}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepPlazaAnt" size="20" maxlength="22"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_NIVEL_PTO_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idNivelPtoAnt}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcNivelPto"
                                                    path="tnMovtosEmpPlaDTO.idNivelPtoAnt"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.ID_JERARQUIA_ANT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.idJerarquiaAnt}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcJerarquia"
                                                    path="tnMovtosEmpPlaDTO.idJerarquiaAnt"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_OBSERVA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepObserva}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepObserva" size="20" maxlength="255"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_OBSERVA_INTERNAS"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepObservaInternas}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepObservaInternas" size="20" maxlength="500"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_QNA_CANCELA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepQnaCancela}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepQnaCancela" size="20" maxlength="22"/></td>
                            </tr>
                           
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_USR_CANCELA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepUsrCancela}"/></td>
                                <td align="left"><fsn:input path="tnMovtosEmpPlaDTO.mepUsrCancela" size="20" maxlength="18"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tnMovtosEmpPla.MEP_FECHA_CANCELA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tnMovtosEmpPlaDTO.mepFechaCancela}"/></td>
                                <td align="left"><fsn:calendar path="mepFechaCancela" size="10"/></td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:if><br>
    
    <c:if test="${tablaDTO.buscar}">
    <table width="80%" align="center" border="0">
        <tr>
            <td>
                <fieldset><legend style='font-size:1.2em';>&nbsp;Causas de la modificaci&oacute;n&nbsp;</legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td align="right" class="label">*<spring:message code="sireh.label.servicio.tdPlaza.motivo"/></td>
                            <td align="left">
                                <html:textarea path="motivoModifica" rows="4" cols="140" /> 
                            </td>
                        </tr>
                        <tr><td colspan="4"><strong>* Campos requeridos.<br/></strong></td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br>
    </c:if>
    
    <script  type="text/javascript">
        $j(document).ready(function(){
            $j('#10002').click(function(){
                var mesaje = 'ADVENTENCIA: El registro sera actualizado. \n ESTE PROCESO ES IRREVERSIBLE! \n \u00BF Desea continuar ?';
                var r = window.confirm(mesaje);
                $j('#salvar').val(r);
            });
        });
    </script>
    
    <script  type="text/javascript">
    var nav4 = window.Event ? true : false;
    function IsNumber(e){
        var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
       return ((tecla > 47 && tecla < 58) || tecla == 46);
    }

 </script>
    
</html:form>