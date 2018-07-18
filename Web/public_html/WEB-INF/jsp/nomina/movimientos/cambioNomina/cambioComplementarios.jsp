<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="cambioComplementariosDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.cambioComplementarios.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Datos personales&nbsp;&nbsp;</strong></legend>
                        <table align="center" width="90%">
                            <tr>
                                <td colspan="6">&nbsp;</td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.primerApellido"/></td>
                                <td align="left"><fsn:label path="primerApellido"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.segundoApellido"/></td>
                                <td align="left"><fsn:label path="segundoApellido"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.nombreEmpleado"/></td>
                                <td align="left"><fsn:label path="nombreEmpleado"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.curpEmpleado"/></td>
                                <td align="left"><fsn:label path="curpEmpleado"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.rfcEmpleado"/></td>
                                <td align="left"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${cambioComplementariosDTO.rfcEmpleado}" image="detail.gif" /></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.EMailPersonal"/></td>
                                <td align="left"><html:input path="EMailPersonal" size="24" maxlength="60"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.nss"/></td>
                                <td align="left"><html:input path="imssIssste" size="15" maxlength="11" onkeypress="return IsNumber(event);"/></td>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.sistemaReparto"/></td>
                                <td align="left">
                                    <html:select path="sistemaReparto"><html:option value="0"><spring:message code="selectList.nonValue"/></html:option>
                                    <html:option value="D">Decimo transitorio</html:option><html:option value="C">Cuenta individual</html:option>
                                    <html:option value="N">No definido</html:option>
                                    </html:select>
                                </td>
                            </tr>
                            
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.idEdoCivil"/></td>
                                <td align="left"><fsn:option key="0" value="selectList.nonValue" /><fsn:selectList beanName="tcEstadoCivil" path="idEdoCivil"/></td>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.idNacionalidad"/></td>
                                <td align="left">
                                <html:select path="idNacionalidad">
                                    <html:option value=""><spring:message code="selectList.nonValue"/></html:option>
                                    <html:option value="M">M - Mexicana</html:option>
                                    <html:option value="E">E - Extranjero</html:option>
                                    <html:option value="N">N - No definido</html:option>
                                </html:select>
                                </td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.padreMadre"/></td>
                                <td align="left"><html:checkbox value="1" path="padreMadre"/></td>
                            <tr>
                                <td colspan="6">&nbsp;</td>
                            </tr>
                        </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Estudios&nbsp;&nbsp; </strong></legend>
                    <table align="center" width="90%">
                        <tr>
                            <td colspan="6">&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.idInstEducativa"/></td>
                            <td align="left"><fsn:option key="-1" value="selectList.nonValue" /><fsn:selectList beanName="tcInstEducativa" path="idInstEducativa"/></td>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.idNivelEscolar"/></td>
                            <td align="left"><fsn:option key="-1" value="selectList.nonValue" /><fsn:selectList beanName="tcNivelEscolar" path="idNivelEscolar"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.idProfnCarrera"/></td>
                            <td align="left"><fsn:option key="-1" value="selectList.nonValue" /><fsn:selectList beanName="tcProfnCarrera" path="idProfnCarrera" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.estudiaSiNo"/></td>
                            <td align="left"><html:checkbox value="1"  path="estudiaSiNo"/></td>
                        </tr>
                        <tr>
                            <td colspan="6">&nbsp;</td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Datos laborales&nbsp;&nbsp; </strong></legend>
                        <table align="center" width="90%">
                            <tr>
                                <td colspan="6">&nbsp;</td>
                            </tr>
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.idRusp"/></td>
                                <td align="left"><html:input path="idRusp" size="9" maxlength="7" onkeypress="return IsNumber(event);"/></td>
                                <td align="right" class="label">&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.fecIngSpc"/></td>
                                <td align="left"><fsn:calendar path="fecIngSpc" size="10" readonly="false"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.ingresoGobFed"/></td>
                                <td align="left"><fsn:calendar path="ingresoGobFed" size="10"  readonly="true"/></td>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.ingresoDependencia"/></td>
                                <td align="left"><fsn:calendar path="ingresoDependencia" size="10"  readonly="true"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.EMailOficial"/></td>
                                <td align="left"><html:input path="EMailOficial" size="24" maxlength="60" /></td>
                                
                            </tr>
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.terminoCargoSind"/></td>
                                <td align="left"><fsn:calendar path="terminoCargoSind" size="10"  readonly="true"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.compatEmpleo"/></td>
                                <td align="left"><html:checkbox value="1" path="compatEmpleo"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.idInstProtcivil"/></td>
                                <td align="left"><fsn:option key="0" value="selectList.nonValue" /><fsn:selectList beanName="tcInstProtCiv" path="idInstProtcivil"/></td>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.idEspProtCivil"/></td>
                                <td align="left"><fsn:option key="0" value="selectList.nonValue" /><fsn:selectList beanName="tcEspProtCivil" path="idEspProtCivil"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.discapacidad"/></td>
                                <td align="left"><html:checkbox value="1" path="discapacidad" /></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.casoMuestra"/></td>
                                <td align="left"><html:checkbox value="1" path="casoMuestra" /></td>
                            <tr>

                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.idInmueble"/></td>
                            <td align="left"><fsn:option key="0" value="selectList.nonValue" /><fsn:selectList beanName="tcInmueble" path="idInmuebleP"/></td>
                                <td align="right" class="label">&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.plazaTelOf1"/></td>
                                <td align="left"><html:input path="plazaTelOfc1" size="15" maxlength="13" onkeypress="return IsNumber(event);"/>
                                    &nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.plazaExt1"/>
                                    <html:input path="plazaExt1" size="8" maxlength="5" onkeypress="return IsNumber(event);"/></td>
                            </tr>
                            <tr>
                                <td colspan="6">&nbsp;</td>
                            </tr>
                        </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Datos Bancarios&nbsp;&nbsp; </strong></legend>
                        <table align="center" width="90%">
                            <tr>
                                <td colspan="6">&nbsp;</td>
                            </tr>
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.complementarios.bancoSar"/></td>
                                <td align="left"><fsn:option key="0" value="selectList.nonValue" /><fsn:selectList beanName="tcBanco" path="idBancoSar"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.clabeEmpleado"/></td>
                                <td align="left"><fsn:label path="clabeEmpleado"/></td>
                            </tr>
                            <tr>
                                <td colspan="6">&nbsp;</td>
                            </tr>
                        </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Declaraciones&nbsp;&nbsp; </strong></legend>
                        <table align="center" width="90%">
                            <tr>
                                <td colspan="6">&nbsp;</td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.fecNotDecPatr"/></td>
                                <td align="left"><fsn:calendar path="fecNotDecPatr" size="10"  readonly="true"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.fecIniDeclPatr"/></td>
                                <td align="left"><fsn:calendar path="fecIniDeclPatr" size="10"  readonly="true"/></td>
                            </tr>
                            <tr>
                                <td colspan="6">&nbsp;</td>
                            </tr>
                        </table>
                </fieldset>
            </td>
        </tr>
    </table><br/>
    <table align="center" width="100%">
        <tr>
           <td colspan="4" align="left" align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
        </tr> 
        <tr>
            <td colspan="3" align="right">
                <fsn:submit value="submit.accept" action="cambioNomina/updateEmpleadoCambioComplementarios.do"/>
            </td>
            <td colspan="3" align="left">
                <fsn:submit value="submit.cancel" path="cancel" action="cambioNomina/consultarComplementarios.do"/>
            </td>
        </tr>
    </table>
    <html:hidden path="idTipoPago" id="idTipoPago" />
</html:form>
<script  type="text/javascript">
    var nav4 = window.Event ? true : false;
    function IsNumber(e){
        var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
        return ((tecla > 47 && tecla < 58) || tecla == 46);
    }
</script>