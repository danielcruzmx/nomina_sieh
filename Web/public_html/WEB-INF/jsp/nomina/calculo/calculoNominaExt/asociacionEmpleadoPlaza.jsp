<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="asociaPlazaEmpleadoDTO">
    
    <c:choose>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'EX'}">
            <c:set var="args" value="Sueldos" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'LA'}">
            <c:set var="args" value="Laudos" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'OB'}">
            <c:set var="args" value="Personal de bajas" />
        </c:when>
        <c:when test="$asociaPlazaEmpleadoDTO.idTipoNomina eq 'VE'}">
            <c:set var="args" value="Vivienda" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'CJ'}">
            <c:set var="args" value="Diferencias" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'DJ' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'DE'}">
            <c:set var="args" value="Devoluciones" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'AC'}">
            <c:set var="args" value="Aguinaldo de consejerias" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'VA'}">
            <c:set var="args" value="Vales de despensa" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'OD'}">
            <c:set var="args" value="Ordinaria diferencias" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'DB'}">
            <c:set var="args" value="Diferencias baja" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'AG'}">
            <c:set var="args" value="Aguinaldo" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'FO'}">
            <c:set var="args" value="Fin de ciclo" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'FE'}">
            <c:set var="args" value="Liquidaci&oacute;n anticipada" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'EXR'}">
            <c:set var="args" value="Con reglas" />
        </c:when>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'SA'}">
            <c:set var="args" value="Sar Fovissste" />
        </c:when>
    </c:choose>

    <c:choose>
        <c:when test="${asociaPlazaEmpleadoDTO.idTipoNomina eq 'FO' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'FE'}">
            <h1><spring:message code="sireh.label.nomina.gestion.title.liquidacionFonac" arguments="${args}"/></h1>
        </c:when>
        <c:otherwise>
            <h1><spring:message code="sireh.label.nomina.calculo.extraordinaria.titulo" arguments="${args}"/></h1>
        </c:otherwise>
    </c:choose>
    
    <p>&nbsp;</p>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.datosEmpleado.header"/></strong></legend>
                    <table align="center" width="100%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.fechaInicial"/></td>
                            <td align="left"><fsn:calendar path="fechaInicial" size="10"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.fechaFinal"/></td>
                            <td align="left"><fsn:calendar path="fechaFinal" size="10"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.primerApellido"/></td>
                            <td align="left"><fsn:input maxlength="40" path="primerApellido" size="40" uppercase="true" readonly="true"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.segundoApellido"/></td>
                            <td align="left"><fsn:input maxlength="40" path="segundoApellido" size="40" uppercase="true" readonly="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.nombreEmpleado"/></td>
                            <td align="left"><fsn:input maxlength="40" path="nombreEmpleado" size="40" uppercase="true" readonly="true"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.rfcEmpleado"/></td>
                            <td align="left">
                                <table border="0" >
                                    <tr>
                                        <td width="130px">
                                            <span id="spanEmpleadoExistente" style="width:140px">
                                                <fsn:helpRoutine onClose="notyfyChanges()" path="rfcEmpleado"  maxlength="13" size="18" disabled="true" beanName="empleadoPopUp"  width="650" height="400" fieldMapping="rfcEmpleado,idTipoPago,imssIssste,clabeEmpleado,curpEmpleado,nombreEmpleado,primerApellido,segundoApellido,ingresoGobFed,ingresoDependencia,calleParticular,coloniaParticular,codigoMunicipio,idEdoParticular,codpostParticular,telParticular" title="Seleccione un empleado" maxRows="100" />
                                            </span>
                                            <span id="spanEmpleadoNuevo" style="width:140px">
                                                <fsn:input maxlength="13" path="rfcEmpleadoNuevo" size="18" uppercase="true"/>
                                            </span>
                                        </td>
                                        <td>
                                            <span style="width:100px">
                                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.checkEmpleadoRfc"/>
                                                <html:checkbox value="1" path="checkRfcEmpleado" onclick="renderRfcEmpleado();"/>
                                            </span>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.curpEmpleado"/></td>
                            <td align="left"><fsn:input maxlength="18" path="curpEmpleado" size="40" uppercase="true" readonly="true"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.imssIssste"/></td>
                            <td align="left"><fsn:input maxlength="11" path="imssIssste" size="40" readonly="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.ingresoGobFed"/></td>
                            <td align="left"><fsn:calendar path="ingresoGobFed" size="10" readonly="true"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.ingresoDependencia"/></td>
                            <td align="left"><fsn:calendar path="ingresoDependencia" size="10" readonly="true"/></td>            
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idTipoPago"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcTipoPago" path="idTipoPago" />
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.clabeEmpleado"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList name="idBanco" beanName="descBancos" path="idBanco" onchange="changeIbBank();"/>
                                <fsn:input maxlength="3" readonly="true" path="clabeEmpleado1" size="3"/>
                                <fsn:input maxlength="15" path="clabeEmpleado2" size="20" css="numeric"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.cnqFolio"/></td>
                            <td align="left">
                                <fsn:input maxlength="18" path="cnqFolio" size="40" readonly="${not (asociaPlazaEmpleadoDTO.idTipoNomina eq 'AG' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'AC' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'OD' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'DB' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'FE' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'FO' or asociaPlazaEmpleadoDTO.idTipoNomina eq 'SA')}"/>
                            </td>
                            <td></td>
                            <td></td>
                        </tr>
                        <!-- DATOS DE DOMICILIO -->
                        <tr>
                            <td align="right" class="label" width="40%">* <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.calle"/></td>
                            <td align="left"><fsn:input maxlength="60" path="calleParticular" size="60" uppercase="true" readonly="true"/></td>
                            <td align="right" class="label" width="40%">* <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.colonia"/></td>
                            <td align="left"><fsn:input maxlength="60" path="coloniaParticular" size="60" uppercase="true" readonly="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.telefono"/></td>
                            <td align="left"><fsn:input maxlength="15" path="telParticular" size="15" uppercase="true" readonly="true"/></td>
                            <td align="right" class="label" width="40%">* <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.cp"/></td>
                            <td align="left"><fsn:input maxlength="5" path="codpostParticular" size="10" readonly="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.entidadFederativa"/></td>
                            <td align="left"><fsn:option key="0" value="selectList.nonValue" /><fsn:selectList beanName="tcEstado" path="idEdoParticular"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.delegacion"/></td>
                            <td align="left">
                                <input type="hidden" id="codigoMunicipio"/>
                                <fsn:option key="-1" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcMunicipio" path="idMuniParticular" parentPath="idEdoParticular" progress="true" />
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>

    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.datosPlaza.header"/></strong></legend>
                    <table align="center" width="100%">
                        <tr><td>&nbsp;</td></tr>
                        <!-- DATOS DE PLAZA -->
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descPuesto"/></td>
                            <td align="left"><fsn:input path="descPuesto" readonly="true" size="40" uppercase="true"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idPlaza"/></td>
                            <td align="left">
                                <fsn:helpRoutine path="idPlaza"  maxlength="20" size="20" disabled="true" beanName="${asociaPlazaEmpleadoDTO.helproutineBeanName}"  width="650" height="400" onClose="notyfyChangesUnidad()" fieldMapping="idPlaza, idPuestoNom, descPuesto, idRangoNom, idUnidadNom, idJerarquia, idNombramiento, idNivelPto, idZonaEcoNom, idEdo, descEstado, idMunicipio, descMunicipio, idGrupoPago, descGrupoPago, plazaImpHono, idZonaDistNom, plazaReferencia, plazaIniCont, plazaFinCont" title="Seleccione una plaza" maxRows="100" />
                            </td>
                        </tr>  
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idRangoNom"/></td>
                            <td align="left"><fsn:input path="idRangoNom" readonly="true" size="40" uppercase="true"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idPuestoNom"/></td>
                            <td align="left"><fsn:input path="idPuestoNom" readonly="true" size="40" uppercase="true"/></td>
                        </tr>    
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idNivelPto"/></td>
                            <td align="left"><fsn:input path="idNivelPto" readonly="true" size="40" uppercase="true"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idZonaEcoNom"/></td>
                            <td align="left"><fsn:input path="idZonaEcoNom" readonly="true" size="40" uppercase="true"/></td>
                        </tr>         
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descEstado"/></td>
                            <td align="left"><fsn:input path="descEstado" readonly="true" size="40" uppercase="true"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descMunicipio"/></td>
                            <td align="left"><fsn:input path="descMunicipio" readonly="true" size="40" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.plazaImpHono"/></td>
                            <td align="left"><fsn:input path="plazaImpHono" readonly="true" size="40" uppercase="true"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descGrupoPago"/></td>
                            <td align="left"><fsn:input path="descGrupoPago" readonly="true" size="40" uppercase="true"/></td>
                        </tr>
                         <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idZonaDistNom"/></td>
                            <td align="left"><fsn:input path="idZonaDistNom" readonly="true" size="40" uppercase="true"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.plazaReferencia"/></td>
                            <td align="left"><fsn:input maxlength="40" path="plazaReferencia" size="40" readonly="true" uppercase="true"/></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
		
    <table align="center" width="100%">
        <tr>
            <td colspan="4" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <fsn:submit value="submit.accept" path="aceptar" action="calculoNominaExt/agregarRfcPlaza.do"/>
            </td>
            <td align="center" colspan="2">
                <fsn:submit value="submit.cancel" path="cancel" action="calculoNominaExt/cancelarAsociacion.do"/>
            </td>
        </tr>
    </table>
    <html:hidden path="clabeEmpleado"/>
    <html:hidden path="idUnidadNom"/>
    <html:hidden path="idNomina"/>
    <html:hidden path="idTipoNomina"/>
    <html:hidden path="idGrupoPagoNomina"/>
    <html:hidden path="idGrupoPago"/>
    <html:hidden path="idJerarquia"/>
    <html:hidden path="idNombramiento"/>
    <html:hidden path="inicioQuincenaCaptura"/>
    <html:hidden path="finQuincenaCaptura"/>
    <html:hidden path="finSiguienteQuincenaCaptura"/>
    <html:hidden path="plazaIniCont"/>
    <html:hidden path="plazaFinCont"/>
    <html:hidden path="agVigente"/>
    <html:hidden path="helproutineBeanName"/>
    

    <script type="text/javascript" >

        document.getElementById("idUnidadNom").style.display = 'none';
        var clabeEmpleadoTD = '';
        function notyfyChanges(){
            var selectidEdoParticular = document.getElementById('idEdoParticular');
            if(document.all) { // IE Way
                selectidEdoParticular.fireEvent('onchange');
            } else  { // Firefox Way
                var evtidEdoParticular = document.createEvent('HTMLEvents');
                evtidEdoParticular.initEvent('change', true, true);
                selectidEdoParticular.dispatchEvent(evtidEdoParticular);
            }
            setTimeout(selectMuni, 2000);
            clabeEmpleadoTD = $j('#clabeEmpleado').val();
            var clabeEmpleado1 = clabeEmpleadoTD.substring(0, 3);
            var clabeEmpleado2 = clabeEmpleadoTD.substring(3);
            $j('#clabeEmpleado1').val(clabeEmpleado1);
            $j('#clabeEmpleado2').val(clabeEmpleado2);
            $j('#idBanco').val(clabeEmpleado1);
        }

        function selectMuni(){
            selectIdMuniParticular = document.getElementById('idMuniParticular');
            selectIdMuniParticular.value= document.getElementById('codigoMunicipio').value;
        }

        function notyfyChangesUnidad(){
            var selectidUnidadNom = document.getElementById('idUnidadNom');
            if(document.all) { // IE Way
                selectidUnidadNom.fireEvent('onchange');
            } else  { // Firefox Way
                var evtidUnidadNom = document.createEvent('HTMLEvents');
                evtidUnidadNom.initEvent('change', true, true);
                selectidUnidadNom.dispatchEvent(evtidUnidadNom);
            }
            clabeEmpleadoTD = $j('#clabeEmpleado').val();
        }

        

        var seleccionInicialRfc = <c:out value="${asociaPlazaEmpleadoDTO.checkRfcEmpleado}"/>;
        if (seleccionInicialRfc) {
            document.getElementById("spanEmpleadoExistente").style.display = 'none';
            document.getElementById("spanEmpleadoNuevo").style.display = 'block';
        } else {
            document.getElementById("spanEmpleadoExistente").style.display = 'block';
            document.getElementById("spanEmpleadoNuevo").style.display = 'none';
        }
        
        function renderRfcEmpleado() {
            var seleccion = document.getElementById("checkRfcEmpleado1").checked;
        
            if (seleccion) {
                document.getElementById("spanEmpleadoExistente").style.display = 'none';
                document.getElementById("spanEmpleadoNuevo").style.display = 'block';
            } else {
                document.getElementById("spanEmpleadoExistente").style.display = 'block';
                document.getElementById("spanEmpleadoNuevo").style.display = 'none';
            }
        }
        
        $j(document).ready(function(){
        
            $j('.numeric').numeric();
            if (document.getElementById("checkRfcEmpleado1").checked) {
                habilitarCampos();
            }
            else{
                deshabilitarCampos();
            }
            if( $j('#idTipoPago').val() == 'CH'){
                $j('#idBanco').attr('disabled', 'false');
                $j('#clabeEmpleado2').attr('disabled', 'true');
                $j('#clabeEmpleado2').val('000000000000000');
            }
            
            if( $j('#idTipoPago').val() == 'TD'){
                $j('#idBanco').removeAttr('disabled');
                $j('#clabeEmpleado2').removeAttr('disabled');
            }
            $j('.numeric').numeric();
            
        });
        
        $j('#checkRfcEmpleado1').change(function(){
            limpiarCampos();
            if (document.getElementById("checkRfcEmpleado1").checked) {
                habilitarCampos();
            }
            else{
                deshabilitarCampos();
            }
        });
        
        function changeIbBank(){
            var idBanco = document.getElementsByName("idBanco");
            var clabeEmpleado = document.getElementById("clabeEmpleado1");
            clabeEmpleado.value = idBanco[0].value;
        }
        
        $j('#idTipoPago').change(function(){
            if( $j('#idTipoPago').val() == 'CH'){
                $j('#idBanco').val('000');                
                $j('#idBanco').attr('disabled', 'false');
                $j('#clabeEmpleado1').val('000');
                $j('#clabeEmpleado2').val('000000000000000');
                $j('#clabeEmpleado2').attr('disabled', 'true');
            }
            
            if( $j('#idTipoPago').val() == 'TD'){
                $j('#idBanco').val('0');                
                $j('#idBanco').removeAttr('disabled');
                $j('#clabeEmpleado1').val('');
                $j('#clabeEmpleado2').removeAttr('disabled');
            }
            
            if( $j('#idTipoPago').val() == '0'){
                $j('#idBanco').val('0');                
                $j('#idBanco').attr('disabled', 'disabled');
                $j('#clabeEmpleado1').val('');
                $j('#clabeEmpleado2').val('');
                $j('#clabeEmpleado2').attr('disabled', 'disabled');
            }
        });
        
        function limpiarCampos(){
            $j('#rfcEmpleado').val('');
            $j('#rfcEmpleadoNuevo').val('');
            $j('#primerApellido').val('');
            $j('#segundoApellido').val('');
            $j('#nombreEmpleado').val('');
            $j('#rfcEmpleadoNuevo').val('');
            $j('#curpEmpleado').val('');
            $j('#imssIssste').val('');
            $j('#text_ingresoGobFed').val('');
            $j('#text_ingresoDependencia').val('');
            $j('#idTipoPago').val('0');
            $j('#clabeEmpleado').val('');
            $j('#calleParticular').val('');
            $j('#coloniaParticular').val('')
            $j('#telParticular').val('')
            $j('#codpostParticular').val('')
            $j('#idEdoParticular').val(0);
            $j('#idMuniParticular').val(-1);
        }

        function habilitarCampos(){
            $j('#primerApellido').removeAttr('readonly');
            $j('#segundoApellido').removeAttr('readonly');
            $j('#nombreEmpleado').removeAttr('readonly');
            $j('#rfcEmpleadoNuevo').removeAttr('readonly');
            $j('#curpEmpleado').removeAttr('readonly');
            $j('#imssIssste').removeAttr('readonly');
            $j('#text_ingresoGobFed').removeAttr('readonly');
            $j('#button_ingresoGobFed').show();
            $j('#text_ingresoDependencia').removeAttr('readonly');
            $j('#button_ingresoDependencia').show();
            //$j('#idTipoPago').removeAttr('disabled');
            $j('#clabeEmpleado').removeAttr('readonly');
            $j('#calleParticular').removeAttr('readonly');
            $j('#coloniaParticular').removeAttr('readonly');
            $j('#telParticular').removeAttr('readonly');
            $j('#codpostParticular').removeAttr('readonly');
            $j('#idEdoParticular').removeAttr('disabled');
            $j('#idMuniParticular').removeAttr('disabled');
        }
        
        function deshabilitarCampos(){
            $j('#primerApellido').attr('readonly', 'readonly');
            $j('#segundoApellido').attr('readonly', 'readonly');
            $j('#nombreEmpleado').attr('readonly', 'readonly');
            $j('#rfcEmpleadoNuevo').attr('readonly', 'readonly');
            $j('#curpEmpleado').attr('readonly', 'readonly');
            $j('#imssIssste').attr('readonly', 'readonly');
            $j('#text_ingresoGobFed').attr('readonly', 'readonly');
            $j('#button_ingresoGobFed').hide();
            $j('#text_ingresoDependencia').attr('readonly', 'readonly');
            $j('#button_ingresoDependencia').hide();
            //$j('#idTipoPago').attr('disabled', 'disabled');
            $j('#clabeEmpleado').attr('readonly', 'readonly');
            $j('#calleParticular').attr('readonly', 'readonly');
            $j('#coloniaParticular').attr('readonly', 'readonly');
            $j('#telParticular').attr('readonly', 'readonly');
            $j('#codpostParticular').attr('readonly', 'readonly');
            $j('#idEdoParticular').attr('disabled', 'disabled');
            $j('#idMuniParticular').attr('disabled', 'disabled');
        }

    </script>    
</html:form>