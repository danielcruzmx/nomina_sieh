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
            <spring:message code="expediente.servicios"/> &nbsp;&#45;&nbsp;
            <spring:message code="sireh.label.servicio.actualizarRegPorTabla"/> &nbsp;&#45;&nbsp;
            <spring:message code="sireh.label.servicio.actualizarRegPorTabla.tdPlaza"/>
        </strong>
    </h1>
    
    <table width="80%" align="center" border="0">
        <tr>
            <td>
                <fieldset><legend style='font-size:1.2em';>&nbsp;Busqueda&nbsp;</legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td width="15%" align="right" class="label">* <spring:message code="sireh.label.servicio.PLAZA"/></td>
                            <td width="15%" align="left">
                                <fsn:input path="idPlaza" size="10" maxlength="6" onkeypress="return IsNumber(event);"/>
                            </td>
                            <td width="20%" align="left" colspan="3">
                                <fsn:submit value="submit.search"
                                            path="buscar"
                                            action="servicios/updateTdPlaza.do"
                                            progressBar="true"/>
                                
                                <c:if test="${tablaDTO.buscar}">
                                    <fsn:submit value="submit.save"
                                                path="salvar"
                                                action="servicios/updateTdPlaza.do"
                                                progressBar="true"/>
                                </c:if>
                            </td>
                            
                            <td width="50%">
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
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_PLAZA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idPlaza}"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_SIT_PLAZA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idSitPlaza}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcSitPlaza"
                                                path="tdPlazaDTO.idSitPlaza"
                                                style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_RFC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaRfc}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaRfc" size="20" maxlength="13"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_CICLO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaCiclo}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaCiclo" size="20" maxlength="4"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_RESPALDO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaRespaldo}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaRespaldo" size="20" maxlength="6"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_GRUPO_PAGO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idGrupoPago}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcGrupoPago"
                                                path="tdPlazaDTO.idGrupoPago"
                                                style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_UNIDAD_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idUnidadPre}"/></td>
                                <td align="left">
                                    <fsn:filter property="tcUnidadByCiclo" condition="=" path="tdPlazaDTO.plazaCiclo" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcUnidadByCiclo"
                                                    path="tdPlazaDTO.idUnidadPre"
                                                    style="width: 200px;"
                                                    appendFilters="false" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_PUESTO_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idPuestoPre}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcPuesto"
                                                path="tdPlazaDTO.idPuestoPre"
                                                style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_EDO_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idEdoPre}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEstado"
                                                    path="tdPlazaDTO.idEdoPre"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_ZONA_ECO_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idZonaEcoPre}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcZonaEcon"
                                                path="tdPlazaDTO.idZonaEcoPre"
                                                style="width: 200px;"
                                                appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_RANGO_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idRangoPre}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcRangoTabul"
                                                    path="tdPlazaDTO.idRangoPre"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_PROY_REDUCE_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idProyReducePre}"/></td>
                                <td align="left">
                                    <fsn:filter property="PR_CICLO" condition="=" path="tdPlazaDTO.plazaCiclo" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcProyRegulariza"
                                                    path="tdPlazaDTO.idProyReducePre"
                                                    style="width: 200px;" 
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_PROY_AMPLIA_PRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idProyAmpliaPre}"/></td>
                                <td align="left">
                                    <fsn:filter property="PR_CICLO" condition="=" path="tdPlazaDTO.plazaCiclo" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcProyRegulariza"
                                                    path="tdPlazaDTO.idProyAmpliaPre"
                                                    style="width: 200px;" 
                                                    appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_UNIDAD_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idUnidadNom}"/></td>
                                <td align="left">
                                    <fsn:filter property="uni_ciclo" condition="=" path="tdPlazaDTO.plazaCiclo" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcUnidadByCiclo"
                                                path="tdPlazaDTO.idUnidadNom"
                                                style="width: 200px;"
                                                appendFilters="false"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_PUESTO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idPuestoNom}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcPuesto"
                                                path="tdPlazaDTO.idPuestoNom"
                                                style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_EDO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idEdoNom}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEstado"
                                                path="tdPlazaDTO.idEdoNom"
                                                style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_MUNI_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idMuniNom}"/></td>
                                <td align="left">
                                    <fsn:filter property="b.ID_EDO" condition="=" path="tdPlazaDTO.idEdoNom" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcMuniNom"
                                                path="tdPlazaDTO.idMuniNom"
                                                style="width: 200px;"
                                                appendFilters="false" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_ZONA_ECO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idZonaEcoNom}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcZonaEcon"
                                                    path="tdPlazaDTO.idZonaEcoNom"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_RANGO_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idRangoNom}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcRangoTabul"
                                                    path="tdPlazaDTO.idRangoNom"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_ZONA_DIST_NOM"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idZonaDistNom}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcZonaDist"
                                                    path="tdPlazaDTO.idZonaDistNom"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_IMP_HONO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaImpHono}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaImpHono" size="20" maxlength="17"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_MOVTO_PERSONA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idMovtoPersona}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcMovsPersonal"
                                                    path="tdPlazaDTO.idMovtoPersona"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_ULTIMO_MOVTO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaUltimoMovto}"/></td>
                                <td align="left"><fsn:calendar path="plazaUltimoMovto" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_INI_CONT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaIniCont}"/></td>
                                <td align="left"><fsn:calendar path="plazaIniCont" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_FIN_CONT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaFinCont}"/></td>
                                <td align="left"><fsn:calendar path="plazaFinCont" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_INI_LIC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaIniLic}"/></td>
                                <td align="left"><fsn:calendar path="plazaIniLic" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_FIN_LIC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaFinLic}"/></td>
                                <td align="left"><fsn:calendar path="plazaFinLic" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_REFERENCIA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaReferencia}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaReferencia" size="20" maxlength="60"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_QNA_CAPTURA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaQnaCaptura}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaQnaCaptura" size="20" maxlength="6"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_TIPO_PLAZA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idTipoPlaza}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcTipoPlaza"
                                                    path="tdPlazaDTO.idTipoPlaza"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_SERV_PUB"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idServPub}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcTipoServPub"
                                                    path="tdPlazaDTO.idServPub"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_PTO_ESTRATEGICO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idPtoEstrategico}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcPtoEstrategico"
                                                    path="tdPlazaDTO.idPtoEstrategico"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_NODO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idNodo}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdArbolUbicacion"
                                                    path="tdPlazaDTO.idNodo"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_INMUEBLE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idInmueble}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcInmueble"
                                                    path="tdPlazaDTO.idInmueble"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_EDIF"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaEdif}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaEdif" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_PISO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaPiso}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaPiso" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_ALA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaAla}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaAla" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_OFNA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaOfna}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaOfna" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_TEL_OF1"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaTelOf1}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaTelOf1" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_TEL_OF2"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaTelOf2}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaTelOf2" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_CONMUT"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaConmut}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaConmut" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_EXT1"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaExt1}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaExt1" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.PLAZA_EXT2"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.plazaExt2}"/></td>
                                <td align="left"><fsn:input path="tdPlazaDTO.plazaExt2" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_OBLIGADO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idObligado}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcObligado"
                                                    path="tdPlazaDTO.idObligado"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_MOTIVO_OBLIGADO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idMotivoObligado}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcMotivoObligado"
                                                    path="tdPlazaDTO.idMotivoObligado"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.ID_VACANCIA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.idVacancia}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcVacancia"
                                                path="tdPlazaDTO.idVacancia"
                                                style="width: 200px;"
                                                appendFilters="false" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.USUARIO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.usuario}"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.FEC_MODIFICO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdPlazaDTO.fecModifico}"/></td>
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
                            <td align="right" class="label">* <spring:message code="sireh.label.servicio.tdPlaza.motivo"/></td>
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