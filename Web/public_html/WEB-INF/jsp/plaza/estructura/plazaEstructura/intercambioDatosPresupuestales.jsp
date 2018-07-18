<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="modificaDatosPresupuestalesDTO">
    
    <h1>
        <spring:message code="sireh.label.plaza.gestion.titulo.link"/> -
        <spring:message code="sireh.label.plaza.estructura.titulo.link"/> -
        <spring:message code="sireh.label.plaza.movimientosNomina.titulo.link"/> -
        <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo"/>
    </h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo.datosPlazaOrigen"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="20%"/>
                            <col width="80%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.plazaOrigen"/></td>
                            <td align="left">
                                <fsn:helpRoutine path="plazaOrigen"
                                                 maxlength="20" 
                                                 size="20" 
                                                 disabled="true" 
                                                 beanName="modDatPrePlazaPopUp"  
                                                 width="800" 
                                                 height="400"
                                                 fieldMapping="idPlaza, idSitPlaza, descSitPlaza, idUnidadPre, descUnidad, idPuestoPre, descPuesto, idEdo, descEstado, idNivelPto, idZonaEcon, descZonaEcon" 
                                                 fieldMappingDTO="plazaOrigen, situacionOrigen, situacionOrigenDesc, unidadOrigen, unidadOrigenDesc, puestoOrigen, puestoOrigenDesc, estadoOrigen, estadoOrigenDesc, nivelOrigen, zonaOrigen, zonaOrigenDesc"
                                                 orderedColumns="Plaza, Situación, Unidad, Puesto, Estado, Nivel, Zona"
                                                 title="Seleccione la Plaza Origen" 
                                                 maxRows="200"
                                                 leftPosition="17"
                                                 topPosition="20"/>
                                <fsn:detalleCalculoNomina name="plazaOri" plaza="true" parentPath="plazaOrigen" image="detail.gif" />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.situacion"/>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo.datosPresupuestales"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="30%"/>
                            <col width="70%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.unidad"/>
                            </td>
                            <td align="left">
                                <fsn:input path="unidadOrigen" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="unidadOrigenDesc" readonly="true" size="55" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.puesto"/>
                            </td>
                            <td align="left">
                                <fsn:input path="puestoOrigen" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="puestoOrigenDesc" readonly="true" size="55" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.edo"/>
                            </td>
                            <td align="left">
                                <fsn:input path="estadoOrigen" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="estadoOrigenDesc" readonly="true" size="55" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.nivelFisico"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nivelOrigen" readonly="true" size="65" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.zonaEco"/>
                            </td>
                            <td align="left">
                                <fsn:input path="zonaOrigen" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="zonaOrigenDesc" readonly="true" size="55" uppercase="true"/>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo.datosPlazaDestino"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="20%"/>
                            <col width="80%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.plazaDestino"/></td>
                            <td align="left">
                                <fsn:helpRoutine path="plazaDestino"  
                                                 maxlength="20" 
                                                 size="20" 
                                                 disabled="true" 
                                                 beanName="modDatPrePlazaPopUp"  
                                                 width="800" 
                                                 height="400"
                                                 fieldMapping="idPlaza, idSitPlaza, descSitPlaza, idUnidadPre, descUnidad, idPuestoPre, descPuesto, idEdo, descEstado, idNivelPto, idZonaEcon, descZonaEcon" 
                                                 fieldMappingDTO="plazaDestino, situacionDestino, situacionDestinoDesc, unidadDestino, unidadDestinoDesc, puestoDestino, puestoDestinoDesc, estadoDestino, estadoDestinoDesc, nivelDestino, zonaDestino, zonaDestinoDesc" 
                                                 orderedColumns="Plaza, Situación, Unidad, Puesto, Estado, Nivel, Zona"
                                                 title="Seleccione la Plaza Destino" 
                                                 maxRows="200"
                                                 leftPosition="17"
                                                 topPosition="20"/>
                                <fsn:detalleCalculoNomina name="plazaDes" plaza="true" parentPath="plazaDestino" image="detail.gif" />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.situacion"/>
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
                        <strong><spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.titulo.datosPresupuestales"/></strong>
                    </legend>
                    <table width="100%">
                        <colgroup>
                            <col width="30%"/>
                            <col width="70%"/>
                        </colgroup>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.unidad"/>
                            </td>
                            <td align="left">
                                <fsn:input path="unidadDestino" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="unidadDestinoDesc" readonly="true" size="55" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.puesto"/>
                            </td>
                            <td align="left">
                                <fsn:input path="puestoDestino" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="puestoDestinoDesc" readonly="true" size="55" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.edo"/>
                            </td>
                            <td align="left">
                                <fsn:input path="estadoDestino" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="estadoDestinoDesc" readonly="true" size="55" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.nivelFisico"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nivelDestino" readonly="true" size="65" uppercase="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.plaza.estructura.modificaDatosPresupuestales.zonaEco"/>
                            </td>
                            <td align="left">
                                <fsn:input path="zonaDestino" readonly="true" size="5" uppercase="true"/>
                                <fsn:input path="zonaDestinoDesc" readonly="true" size="55" uppercase="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <fsn:submit value="submit.accept" 
                            onclick="validateFormData();"
                            action="plazaEstructura/updateIntercambioDatosPresupuestales.do"/>
            </td>
            <td colspan="2" align="left">
                <fsn:submit value="submit.cancel" 
                            action="plazaEstructura/intercamDatosPresupuestales.do"/>
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
            });
        }
    </script>
</html:form>