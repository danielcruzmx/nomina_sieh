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

<html:form modelAttribute="promocionPermutaDTO">
    
    <h1>
        <spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
        <spring:message code="sireh.label.plaza.estructura.titulo.link"/> -  
        <spring:message code="sireh.label.plaza.movimientosNomina.titulo.link"/> -  
        <spring:message code="sireh.label.plaza.estructura.promocionPermuta.titulo"/>
    </h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.promocionPermuta.titulo.datosPlazaOrigen"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="20%"/>
                            <col width="80%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.promocionPermuta.plazaOrigen"/></td>
                            <td align="left">
                                <fsn:helpRoutine path="plazaOrigen"  
                                                 maxlength="20" 
                                                 size="20" 
                                                 disabled="true" 
                                                 beanName="promocionPermutaPopUp"  
                                                 width="800" 
                                                 height="400"
                                                 fieldMapping="idPlaza, rfcEmpleado, nombreEmpleado, primerApellido, segundoApellido, idSitPlaza, descSitPlaza, idUnidadNom, descUnidad, idPuestoNom, descPuesto, idEdo, descEstado, idNivelPto, idZonaEcon, descZonaEcon, idZonaDistNom"
                                                 fieldMappingDTO="plazaOrigen, rfcOrigen, empleadoOrigen, primerApellidoOrigen, segundoApellidoOrigen, situacionOrigen, situacionOrigenDesc, unidadOrigen, unidadOrigenDesc, puestoOrigen, puestoOrigenDesc, estadoOrigen, estadoOrigenDesc, nivelOrigen, zonaOrigen, zonaOrigenDesc, distribucionOrigen"
                                                 title="Seleccione la Plaza Origen" 
                                                 maxRows="200" 
                                                 leftPosition="17"
                                                 topPosition="20"/>
                                <fsn:detalleCalculoNomina name="plazaOri" plaza="true" parentPath="plazaOrigen" image="detail.gif" />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.situacion"/>
                            </td>
                            <td align="left">
                                <fsn:input path="situacionOrigen" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="situacionOrigenDesc" readonly="true" size="60" uppercase="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <br/>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.promocionPermuta.titulo.datosEmpleado"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="30%"/>
                            <col width="70%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.rfc"/>
                            </td>
                            <td align="left">
                                <fsn:input path="rfcOrigen" readonly="true" size="60" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.empleado"/>
                            </td>
                            <td align="left">
                                <fsn:input path="empleadoOrigen" readonly="true" size="20" uppercase="true"/>
                                <fsn:input path="primerApellidoOrigen" readonly="true" size="15" uppercase="true"/>
                                <fsn:input path="segundoApellidoOrigen" readonly="true" size="15" uppercase="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <br/>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.promocionPermuta.titulo.datosFisicos"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="30%"/>
                            <col width="70%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.unidad"/>
                            </td>
                            <td align="left">
                                <fsn:input path="unidadOrigen" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="unidadOrigenDesc" readonly="true" size="50" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.puesto"/>
                            </td>
                            <td align="left">
                                <fsn:input path="puestoOrigen" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="puestoOrigenDesc" readonly="true" size="50" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.edo"/>
                            </td>
                            <td align="left">
                                <fsn:input path="estadoOrigen" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="estadoOrigenDesc" readonly="true" size="50" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.nivelFisico"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nivelOrigen" readonly="true" size="60" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.zonaEco"/>
                            </td>
                            <td align="left">
                                <fsn:input path="zonaOrigen" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="zonaOrigenDesc" readonly="true" size="50" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.zonaDist"/>
                            </td>
                            <td align="left">
                                <fsn:input path="distribucionOrigen" readonly="true" size="60" uppercase="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
            <td colspan="2">
                <img src="<spring:theme code="intercambio.gif"/>" border="0" width="20"/>
            </td>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.promocionPermuta.titulo.datosPlazaDestino"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="20%"/>
                            <col width="80%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.promocionPermuta.plazaDestino"/></td>
                            <td align="left">
                                <fsn:helpRoutine path="plazaDestino"  
                                                 maxlength="20" 
                                                 size="20" 
                                                 disabled="true" 
                                                 beanName="promocionPermutaPopUp"  
                                                 width="800" 
                                                 height="400"
                                                 fieldMapping="idPlaza, rfcEmpleado, nombreEmpleado, primerApellido, segundoApellido, idSitPlaza, descSitPlaza, idUnidadNom, descUnidad, idPuestoNom, descPuesto, idEdo, descEstado, idNivelPto, idZonaEcon, descZonaEcon, idZonaDistNom"
                                                 fieldMappingDTO="plazaDestino, rfcDestino, empleadoDestino, primerApellidoDestino, segundoApellidoDestino, situacionDestino, situacionDestinoDesc, unidadDestino, unidadDestinoDesc, puestoDestino, puestoDestinoDesc, estadoDestino, estadoDestinoDesc, nivelDestino, zonaDestino, zonaDestinoDesc, distribucionDestino" 
                                                 title="Seleccione la Plaza Destino" 
                                                 maxRows="200"
                                                 leftPosition="17"
                                                 topPosition="20"/>
                                <fsn:detalleCalculoNomina name="plazaDes" plaza="true" parentPath="plazaDestino" image="detail.gif" />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.situacion"/>
                            </td>
                            <td align="left">
                                <fsn:input path="situacionDestino" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="situacionDestinoDesc" readonly="true" size="60" uppercase="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <br/>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.promocionPermuta.titulo.datosEmpleado"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="30%"/>
                            <col width="70%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.rfc"/>
                            </td>
                            <td align="left">
                                <fsn:input path="rfcDestino" readonly="true" size="60" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.empleado"/>
                            </td>
                            <td align="left">
                                <fsn:input path="empleadoDestino" readonly="true" size="20" uppercase="true"/>
                                <fsn:input path="primerApellidoDestino" readonly="true" size="15" uppercase="true"/>
                                <fsn:input path="segundoApellidoDestino" readonly="true" size="15" uppercase="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <br/>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.promocionPermuta.titulo.datosFisicos"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="30%"/>
                            <col width="70%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.unidad"/>
                            </td>
                            <td align="left">
                                <fsn:input path="unidadDestino" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="unidadDestinoDesc" readonly="true" size="50" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.puesto"/>
                            </td>
                            <td align="left">
                                <fsn:input path="puestoDestino" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="puestoDestinoDesc" readonly="true" size="50" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.edo"/>
                            </td>
                            <td align="left">
                                <fsn:input path="estadoDestino" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="estadoDestinoDesc" readonly="true" size="50" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.nivelFisico"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nivelDestino" readonly="true" size="60" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.zonaEco"/>
                            </td>
                            <td align="left">
                                <fsn:input path="zonaDestino" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="zonaDestinoDesc" readonly="true" size="50" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.promocionPermuta.zonaDist"/>
                            </td>
                            <td align="left">
                                <fsn:input path="distribucionDestino" readonly="true" size="60" uppercase="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td colspan="4" align="left">
                <table border="0">
                    <tr>
                        <td width="155px;" align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.plazaIniCont"/></td>
                        <td width="322px;" align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td colspan="4" align="left">
                <table border="0">
                    <tr>
                        <td width="155px;" align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.liberaPlaza.plazaFinCont"/></td>
                        <td width="322px;" align="left">
                            <table width="100%" border="0" >
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
                </table>
            </td>
        </tr>
        
        <tr>
            <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <fsn:submit value="submit.accept" 
                            onclick="validateFormData();"
                            action="plazaEstructura/updatePromocionPermuta.do"/>
            </td>
            <td colspan="2" align="left">
                <fsn:submit value="submit.cancel" 
                            action="plazaEstructura/promocionPermuta.do"/>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j.event.special.inputchange = {
            setup: function() {
                var self = this, val;
                $j.data(this, 'timer', window.setInterval(function() {
                    val = self.value;
                    if ( $j.data( self, 'cache') != val ) {
                        $j.data( self, 'cache', val );
                        $j( self ).trigger( 'inputchange' );
                    }
                }, 20));
            },
            teardown: function() {
                window.clearInterval( $j.data(this, 'timer') );
            },
            add: function() {
                $j.data(this, 'cache', this.value);
            }
        };
        //$j('input').on('inputchange', function() { console.log(this.value) });

        $j('#plazaOrigen').on('inputchange',function(e){
            //console.log('Plaza Origen Changed!')
            validateFormData();
        });
        
        $j('#plazaDestino').on('inputchange',function(e){
            //console.log('Plaza Destino Changed!')
            validateFormData();
        });
        
        function validateFormData() {
            var plazaOrigen = $j('#plazaOrigen').val();
            var plazaDestino = $j('#plazaDestino').val();
            //console.log (plazaOrigen + " - " + plazaDestino);
            if (plazaOrigen !="" && plazaDestino !="") {
                if (plazaOrigen == plazaDestino) {
                    alert("La Plaza Origen no puede ser la misma que la Plaza Destino");
                    clearFormData();
                    return false;
                }
                return false;
            }
            return true;
        }
        
        function clearFormData() {
            if ( !Array.prototype.forEach ) {
                Array.prototype.forEach = function(fn, scope) {
                    for(var i = 0, len = this.length; i < len; ++i) {
                        fn.call(scope, this[i], i, this);
                    }   
                }
            }
            
            var sufix = ["Origen", "Destino"];
            sufix.forEach(function(suf) {
                //console.log(suf);
                $j('#plaza' + suf).val('');
                $j('#rfc' + suf).val('');
                $j('#empleado' + suf).val('');
                $j('#primerApellido' + suf).val('');
                $j('#segundoApellido' + suf).val('');
                $j('#situacion' + suf).val('');
                $j('#situacion' + suf + 'Desc').val('');
                $j('#unidad' + suf).val('');
                $j('#unidad' + suf + 'Desc').val('');
                $j('#puesto' + suf).val('');
                $j('#puesto' + suf + 'Desc').val('');
                $j('#estado' + suf).val('');
                $j('#estado' + suf + 'Desc').val('');
                $j('#nivel' + suf).val('');
                $j('#zona' + suf).val('');
                $j('#zona' + suf + 'Desc').val('');
                $j('#distribucion' + suf).val('');
            });
        }
    </script>
    
    <script type="text/javascript">
        var seleccionInicial = <c:out value="${promocionPermutaDTO.checkFechaTermino}"/>;
        if (seleccionInicial) {
            document.getElementById("spanFechaTermino").style.display = 'none';
            document.getElementById("spanFechaInfinita").style.display = 'block';
        } else {
            document.getElementById("spanFechaTermino").style.display = 'block';
            document.getElementById("spanFechaInfinita").style.display = 'none';
        }
    </script>
</html:form>