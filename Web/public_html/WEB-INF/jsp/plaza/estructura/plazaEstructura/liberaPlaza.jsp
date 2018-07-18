<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript">
    function renderFechaTermino() {
        var seleccion = document.getElementById("checkFechaTermino1").checked;
    
        if (seleccion) {
            document.getElementById("spanFechaTermino").style.display = 'none';
            document.getElementById("spanFechaInfinita").style.display = 'block';
        } else {
            document.getElementById("spanFechaTermino").style.display = 'block';
            document.getElementById("spanFechaInfinita").style.display = 'none';
        }
    }
</script>

<html:form modelAttribute="liberaPlazaDTO">
    
    <html:hidden path="datosFisicos"/>
    <html:hidden path="datosPresupuestales"/>
    
    <html:hidden path="inicioQuincenaCaptura"/>
    <html:hidden path="finQuincenaCaptura"/>
    <html:hidden path="beanNamePuesto"/>
    <html:hidden path="idPtoOrigen"/>
    <html:hidden path="idSitPlazaDestino"/>
    <html:hidden path="idVacancia"/>
    <html:hidden path="idVacanciaAux"/>
    
    

    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.estructura.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.movimientosNomina.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.estructura.liberaPlaza.titulo"/></h1>
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
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.estructura.liberaPlaza.titulo"/>&nbsp;&nbsp; </strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <c:if test="${liberaPlazaDTO.beanNamePuesto eq 'tcPuestoLiberaVacancia' }">
                            <tr>
                                <td></td>
                                <td></td>
                                     <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.autorizacion"/></td>
                                    <td>
                                            <html:radiobutton path="radioAutorizacion" value="0"/> <spring:message code="sireh.label.plaza.estructura.liberaPlaza.normal"/>
                                            <html:radiobutton path="radioAutorizacion" value="1"/> <spring:message code="sireh.label.plaza.estructura.liberaPlaza.excepcion"/>
                                            <html:radiobutton path="radioAutorizacion" value="2"/> <spring:message code="sireh.label.plaza.estructura.liberaPlaza.administrar"/>
                                    </td>
                            </tr>
                        </c:if>
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
                                
                                <fsn:filter property="PV.ID_PTO_ORIGEN" condition="=" path="idPtoOrigen"/>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="${liberaPlazaDTO.beanNamePuesto}" 
                                                path="idPuesto"
                                                style="width: 220px;"/>
                                
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
                            <td align="left">
                                <table border="0" >
                                    <tr>
                                        <td width="100px">
                                            <span id="spanFechaTermino" style="width:100px">
                                                <fsn:calendar path="plazaFinCont" size="10"/>
                                            </span>
                                            <span id="spanFechaInfinita" style="width:100px">
                                                <spring:message code="sireh.label.plaza.estructura.liberaPlaza.checkFechaTermino.seleccionado"/>
                                            </span>
                                        </td>
                                        <td>
                                            <span style="width:100px">
                                                <spring:message code="sireh.label.plaza.estructura.liberaPlaza.checkFechaTermino"/>
                                                <html:checkbox value="1" path="checkFechaTermino" onclick="renderFechaTermino();"/>
                                            </span>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.idZonaEco"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="zonaEconomicaLiberaPlaza" 
                                                path="idZonaEco" 
                                                parentPath="idPuesto" 
                                                progress="true"
                                                style="width: 250px;"/>
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
                                <!--fsn:helpRoutine path="idTipoPlaza"  
                                                 maxlength="20" 
                                                 size="20" 
                                                 disabled="true" 
                                                 beanName="tcTipoPlazaLiberaPopup"  
                                                 width="800" 
                                                 height="400"
                                                 fieldMapping="idTipoPlaza, descripcion"
                                                 fieldMappingDTO="idTipoPlaza"
                                                 title="Seleccione el Tipo de plaza" 
                                                 maxRows="200" 
                                                 leftPosition="17"
                                                 topPosition="20"-->
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
                            <td align="left" colspan="3"><fsn:input path="plazaReferencia" size="70" maxlength="60"/></td>
                        </tr>
                        <c:if test="${not empty liberaPlazaDTO.idVacanciaLabel}">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.liberaPlaza.sitPlazaDestino"/></td>
                            <td align="left"><fsn:label path="idVacanciaLabel"/></td>
                        </tr>
                        </c:if>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td>
                <table align="center" width="90%" border="0">
                    <tr>
                        <td align="right">
                            <fsn:submit value="submit.accept" action="plazaEstructura/updateLiberaPlaza.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" path="cancel" action="plazaEstructura/consultaLiberaPlaza.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <script type="text/javascript">
        var seleccionInicial = <c:out value="${liberaPlazaDTO.checkFechaTermino}"/>;
        if (seleccionInicial) {
            document.getElementById("spanFechaTermino").style.display = 'none';
            document.getElementById("spanFechaInfinita").style.display = 'block';
        } else {
            document.getElementById("spanFechaTermino").style.display = 'block';
            document.getElementById("spanFechaInfinita").style.display = 'none';
        }
        
        $j(document).ready(function(){
            if($j("#beanNamePuesto").val() == 'tcPuestoLiberaVacancia' ){
                $j("input[name='radioAutorizacion']").change(function(){
                    getTcPuestoVacanciaCallback();
                    getTcVacanciaCallBack();
                });
            getTcPuestoVacanciaCallback();
            getTcVacanciaCallBack();
            }
/*            $j("#radioAutorizacion2").change(function(){
                getTcPuestoVacanciaCallback();
            });
            $j("#radioAutorizacion3").change(function(){
                getTcPuestoVacanciaCallback();
            });
            */
        });
        
        function getTcPuestoVacanciaCallback() {
            var ptoExcepcion = $j("input[name='radioAutorizacion']:checked").val();
            var idPtoOrigen = $j('#idPtoOrigen').val();

            $j.ajax({
                url: 'getTcPuestoVacanciaCallback.do',
                type: 'GET',
                data: 'ptoExcepcion=' + ptoExcepcion + '&idPtoOrigen=' + idPtoOrigen,
                success: function(data) {
                    $j('select[id="idPuesto"]').find('option').remove().end();
                    $j('select[id="idPuesto"]').append(data);
                }
            });
        }
        function getTcVacanciaCallBack() {
            var ptoExcepcion = $j("input[name='radioAutorizacion']:checked").val();
            var idVacancia;
            if(ptoExcepcion == 0){
                idVacancia = $j("#idVacanciaAux").val();
            } else if (ptoExcepcion == 1) {
                idVacancia = 7;
            } else if (ptoExcepcion == 2) {
                idVacancia = 8;
            }
            $j.ajax({
                url: 'getTcVacanciaCallback.do',
                type: 'GET',
                data: 'ptoExcepcion=' + idVacancia,
                success: function(data) {
                    $j("label[for='idVacanciaLabel']").text(data);
                    $j('#idVacancia').val(idVacancia);
                }
            });
        }
    </script>
</html:form>