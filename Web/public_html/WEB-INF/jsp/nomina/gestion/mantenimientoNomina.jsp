<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<spring:message code="selectList.nonValue" var="nonValue"/>

<style type="text/css">
    .anchoInput {
        width: 300px;
    }
</style>
<html:form modelAttribute="nominaDTO">
    
    <html:hidden path="tipoMantenimiento"/>
    <html:hidden path="idNomina"/>
    <html:hidden path="idNextComplemento"/>
    
    <c:if test="${nominaDTO.tipoMantenimiento == \'A\'}">
        <h1>
            <spring:message code="sireh.label.nomina.gestion.agregar.titulo"/>
        </h1>
    </c:if>
    <c:if test="${nominaDTO.tipoMantenimiento == \'M\'}">
        <h1>
            <spring:message code="sireh.label.nomina.gestion.modificar.titulo"/>
        </h1>
    </c:if>
    <p>&nbsp;</p>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.gestion.grupoInfo.detalles"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.numQuincena"/>
                            </td>
                            <td align="left">
                                <c:if test="${nominaDTO.tipoMantenimiento == \'A\'}">
                                    <fsn:option key=""value="selectList.nonValue"/>
                                    <fsn:selectList beanName="listaQuincenas" 
                                                    path="nomQnaCaptura"/>
                                </c:if>
                                <c:if test="${nominaDTO.tipoMantenimiento == \'M\'}">
                                    <fsn:input path="nomQnaCaptura"
                                               uppercase="true" 
                                               maxlength="60"
                                               size="60" 
                                               readonly="true"
                                               css="anchoInput"/>
                                </c:if>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.tipoNomina"/>
                            </td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaTiposNomina"
                                                path="idTipoNomina"
                                                style="width: 200px;"
                                                onchange="getTipoNomina()"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.numComplemento"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomNumComplem" 
                                           uppercase="true"
                                           maxlength="10" 
                                           size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.gpoPago"/>
                            </td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaGruposPago"
                                                path="idGrupoPagoNom"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.nomina.gestion.label.descripcion"/>
                            </td>
                            <td align="left">
                                <fsn:input path="descNomina"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60"
                                           css="anchoInput"/>
                            </td>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.nomina.gestion.label.leyenda"/>
                            </td>
                            <td align="left" colspan="4">
                                <fsn:input path="nomLeyenda" 
                                           uppercase="true"
                                           maxlength="500" 
                                           size="60"
                                           css="anchoInput"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.nomina.gestion.label.reglaCalculo"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomReglaCalculo"
                                           uppercase="true" 
                                           maxlength="100"
                                           size="60"
                                           css="anchoInput"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.fuenteDatos"/>
                            </td>
                            <td align="left" colspan="4">
                                <html:select path="nomFuenteDatos" cssClass="uppercase">
                                    <html:option value="" label="${nonValue}"/>
                                    <html:option value="PLAZAS" label="Plazas"/>
                                    <html:option value="HISTORICO" label="Historico"/>
                                    <html:option value="C" label="SHCP"/>
                                    <html:option value="O" label="G00"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.status"/>
                            </td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaEstadosNomina"
                                                path="idEdoNom"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                    </table>
                </fieldset><br/>
                
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.gestion.grupoInfo.aguinaldo"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.dias"/></td>
                            <td align="left" width="300px;">
                                <html:select path="nomDiasPagar" cssClass="uppercase" cssStyle="width: 200px;">
                                    <html:option value="" label="${nonValue}"/>
                                    <html:option value="20" label="20 - 1ra parte"/>
                                    <html:option value="40" label="40 - 2da parte"/>
                                </html:select>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.exentos"/></td>
                            <td align="left">
                                <table align="left" width="30%">
                                    <tr>                        
                                        <td align="left">
                                            <html:radiobutton value="S" path="nomAplicarExentos" label=" SI"/>
                                        </td>
                                        <td align="left">
                                            <html:radiobutton value="N" path="nomAplicarExentos" label=" NO"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.vigente"/></td>
                            <td align="left">
                                <table align="left">
                                    <tr>                        
                                        <td align="left">
                                            <html:radiobutton value="V" path="nomVigente" label=" Vigente"/>
                                        </td>
                                        <td align="left">
                                            <html:radiobutton value="N" path="nomVigente" label=" No Vigente"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.gratificacion"/></td>
                            <td align="left">
                                <html:select path="nomGratifAgui" cssClass="uppercase" cssStyle="width: 200px;">
                                    <html:option value="" label="${nonValue}"/>
                                    <html:option value="A" label="Nomina de aguinaldo"/>
                                    <html:option value="G" label="Nomina de gratificacion"/>
                                    <html:option value="B" label="Ambos"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.periodo"/></td>
                            <td align="left">
                                <table align="left" width="30%">
                                    <tr>                        
                                        <td align="left">
                                            <html:radiobutton value="S" path="nomCompletarPeriodo" label=" SI"/>
                                        </td>
                                        <td align="left">
                                            <html:radiobutton value="N" path="nomCompletarPeriodo" label=" NO"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset><br/>
            </td>
        </tr>
        <tr id="fonac">
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.gestion.label.fonac"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomGobFed1"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomGobFed1" size="20" maxlength="8" css="decimal"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomGobFed2"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomGobFed2" size="20" maxlength="8" css="decimal"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomGobFed3"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomGobFed3" size="20" maxlength="8" css="decimal"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomGobFed4"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomGobFed4" size="20" maxlength="8" css="decimal"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomFacRen1"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomFacRen1" size="20" maxlength="8" css="decimal"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomFacRen2"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomFacRen2" size="20" maxlength="8" css="decimal"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomImpSin1"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomImpSin1" size="20" maxlength="8" css="decimal"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomImpSin2"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomImpSin2" size="20" maxlength="8" css="decimal"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomCicloFon"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomCicloFon" size="20" maxlength="6" css="numeric"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.nomRemesa"/>
                            </td>
                            <td align="left">
                                <fsn:input path="nomRemesa" size="20" maxlength="2"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;Fechas&nbsp;&nbsp; </strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.inicioPago"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="nomIniPago" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.finPago"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="nomFinPago" size="10"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.fechaPago"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="nomFecPago" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.fechaDeposito"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="nomFecDeposito" size="10"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.fechaApertura"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="nomFecApertura" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.gestion.label.fechaCierre"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="nomFecCierre" size="10"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td align="left" height="20px" valign="middle">
                <spring:message code="sireh.form.required.fields"/>
            </td>
        </tr>
        <tr>
            <td>
                <table align="center" width="90%" border="0">
                    <tr>
                        <td align="right">
                            <c:if test="${nominaDTO.tipoMantenimiento == \'A\'}">
                                <fsn:submit value="submit.add" path="mantenimientoNominaInsertNomina"
                                            action="gestionNomina/insertNomina"/>
                            </c:if>
                            <c:if test="${nominaDTO.tipoMantenimiento == \'M\'}">
                                <fsn:submit value="submit.update" path="mantenimientoNominaUpdateNomina"
                                            action="gestionNomina/updateNomina"/>
                            </c:if>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel"
                                        action="gestionNomina/cancelarNomina"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${nominaDTO.idEdoNom == \'C\'}">
            <script type="text/javascript">
                $j("#10001").prop("disabled",true);
            </script>
        </c:when>
        <c:otherwise>
            <script type="text/javascript">
                $j("#10001").prop("disabled",false);
            </script>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        function getTipoNomina() {
            var idTipoNomina = $j('select[id="idTipoNomina"]').val();
            disabledTipoNomina(idTipoNomina);
        }
        
        function disabledTipoNomina(idTipoNomina) {         
            if (idTipoNomina == 'AG') {
                $j("#nomDiasPagar").prop("disabled",false);
                $j("#nomGratifAgui").prop("disabled",false);
                $j("input[type=radio]").attr("disabled",false);
            } else {
                $j("#nomDiasPagar").prop("disabled",true);
                $j("#nomAplicarExentos").prop("checked",false);
                $j("#nomVigente").prop("checked",false);
                $j("#nomGratifAgui").prop("disabled",true);
                $j("#nomCompletarPeriodo").prop("checked",false);
                $j("input[type=radio]").attr("disabled",true);
            }
            if(idTipoNomina == 'FO' || idTipoNomina == 'FE'){
                $j('#fonac').show();
            } else {
                $j('#fonac').hide();
            }
        }
        
        var idTipoNomina = '<c:out value="${nominaDTO.idTipoNomina}"/>'; 
        disabledTipoNomina(idTipoNomina);
        
        /*$j(document).ready(function(){
            $j('#nomDiasPagar').mask('99');
        });*/
        $j(document).ready(function(){
            getTipoNomina();
            $j('.numeric').numeric();
            $j('.decimal').decimal();
        });
    </script>
    
</html:form>
