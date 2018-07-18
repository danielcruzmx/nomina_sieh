<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="cambioBancariosDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="90%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.datosEmpleado"/></strong></legend>
                    <table align="center" width="85%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.rfcEmpleado"/></td>
                            <td align="left"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${cambioBancariosDTO.rfcEmpleado}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.primerApellido"/></td>
                            <td align="left"><fsn:label path="primerApellido"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.segundoApellido"/></td>
                            <td align="left"><fsn:label path="segundoApellido"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.nombreEmpleado"/></td>
                            <td align="left"><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.curpEmpleado"/></td>
                            <td align="left"><fsn:label path="curpEmpleado"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.imssIssste"/></td>
                            <td align="left"><fsn:label path="imssIssste"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.ingresoGobFed"/></td>
                            <td align="left"><fsn:label path="ingresoGobFed" /></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.ingresoDependencia"/></td>
                            <td align="left"><fsn:label path="ingresoDependencia"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.cambioBancarios.clabeEmpleado"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList name="idBanco" beanName="descBancos" path="idBanco" onchange="changeIbBank();"/>
                                <fsn:input maxlength="3" readonly="true" path="clabeEmpleado1" size="3"/>
                                <fsn:input maxlength="15" path="clabeEmpleado2" size="21" css="numeric"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.idPuestoNom"/></td>
                            <td align="left"><fsn:label path="idPuestoNom"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.idPlazaVigente"/></td>
                            <td align="left"><fsn:label path="idPlazaVigente"/></td>
                        </tr>
                        <tr>
                        <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.cambioBancarios.idTipoPago"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcTipoPago" onchange="cambiarClabe();" path="idTipoPago" />
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.cambioBancarios.zonaPago"/></td>
                            <td align="left">
                                <fsn:selectList beanName="tcDistUnidadIdUnidad" disabled="true" path="idUnidadNom"  />
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcDistUnidadIdDistUnidad" path="idZonaDistNom" progress="true" parentPath="idUnidadNom"/>
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <table >
                    <tr>
                        <td colspan="4" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" width="580px" align="right">
                            <fsn:submit value="submit.accept" action="cambioNomina/updateEmpleadoBancarios.do"/>
                        </td>
                        <td colspan="2" width="655px" align="left">
                            <fsn:submit value="submit.cancel" path="cancel" action="cambioNomina/consultarBancarios.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
    
        $j(document).ready(function(){
             if( $j('#idTipoPago').val() == 'CH'){
                $j('#idBanco').attr('disabled', 'false');
                $j('#clabeEmpleado2').attr('disabled', 'true');
//                $j('#clabeEmpleado2').val('000000000000000');
            }
            
            if( $j('#idTipoPago').val() == 'TD'){
                $j('#idBanco').removeAttr('disabled');
                $j('#clabeEmpleado2').removeAttr('disabled');
            }
            $j('.numeric').numeric();
        });
        function changeIbBank(){
            var idBanco = document.getElementsByName("idBanco");
            var clabeEmpleado = document.getElementById("clabeEmpleado1");
            clabeEmpleado.value = idBanco[0].value;
        }
        
        function cambiarClabe(){
            if( $j('#idTipoPago').val() == 'CH'){
                $j('#idBanco').val('000');                
                $j('#idBanco').attr('disabled', 'false');
                $j('#clabeEmpleado1').val('000');
                $j('#clabeEmpleado2').val('000000000000000');
                $j('#clabeEmpleado2').attr('disabled', 'true');
            }
            
            if( $j('#idTipoPago').val() == 'TD'){
                //$j('#idBanco').val('0');                
                $j('#idBanco').removeAttr('disabled');
                //$j('#clabeEmpleado1').val('');
                $j('#clabeEmpleado2').removeAttr('disabled');
            }
            
            if( $j('#idTipoPago').val() == '0'){
                //$j('#idBanco').val('0');                
                $j('#idBanco').attr('disabled', 'disabled');
                //$j('#clabeEmpleado1').val('');
                //$j('#clabeEmpleado2').val('');
                $j('#clabeEmpleado2').attr('disabled', 'disabled');
            }
        }
    </script>
</html:form>