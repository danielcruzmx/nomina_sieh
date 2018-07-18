<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="customTdPensionDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.pensionDTO.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="75%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.datosPension.header"/></strong></legend>
                    <table align="center" width="100%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.pensionDTO.rfcPension"/></td>
                            <td align="left"><fsn:label path="rfcPension"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.pensionDTO.numPension"/></td>
                            <td align="left"><fsn:label path="numPension"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.pensionDTO.beneficiariaPension"/></td>
                            <td align="left"><fsn:input maxlength="40" path="beneficiariaPension" size="40" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.pensionDTO.idZonaDist"/></td>
                            <td align="left">
                                <fsn:filter property="plaza_rfc" condition="="/>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="idDistUnidades" path="idZonaDist" /> </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.pensionDTO.referenciaPension"/></td>
                            <td align="left"><fsn:input maxlength="18" path="referenciaPension" uppercase="true" size="20"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.pensionDTO.cuotaPorcentaje"/></td>
                            <td>
                                <html:radiobutton path="cuotaPorcentaje" value="cuotaFija" label="Cuota fija" />
                                <html:radiobutton path="cuotaPorcentaje" value="porcentaje" label="Porcentaje" />
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.pensionDTO.montoPension"/></td>
                            <td align="left"><fsn:input maxlength="8" path="montoPension" size="10" uppercase="true" css="numericpunto"/></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="75%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.pensionDTO.header.adeudoPension"/></strong></legend>
                    <table align="center" width="100%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.pensionDTO.montoAdeudo"/></td>
                            <td align="left"><fsn:input maxlength="17" path="montoAdeudo" size="20" uppercase="true" css="numericpunto"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.pensionDTO.qnaDescAdeudo"/></td>
                            <td align="left"><fsn:input maxlength="3" path="qnaDescAdeudo" size="20" uppercase="true" css="numeric"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.pensionDTO.refAdeudoPension"/></td>
                            <td align="left"><fsn:input maxlength="20" path="refAdeudoPension" size="20" uppercase="true" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.pensionDTO.qnaCapturaAdeudo"/></td>
                            <td align="left"><fsn:input maxlength="6" path="qnaCapturaAdeudo" size="20" readonly="true" uppercase="true" /></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.pensionDTO.qnaAplicaAdeudo"/></td>
                            <td align="left"><fsn:label path="qnaAplicaAdeudo" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.pensionDTO.ultQnaProcesaAdeudo"/></td>
                            <td align="left"><fsn:label path="ultQnaProcesaAdeudo" /></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td colspan="4" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
    </table>

    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.pensionDTO.header.conceptosPorcentaje"/></strong></legend>
                    <table align="center" width="90%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td>
                                <table align="center" width="90%">
                                    <tr><td><h1><spring:message code="sireh.label.nomina.movimiento.pensionDTO.header.percepciones"/></h1></td></tr>   
                                    <tr>
                                        <td align="center">
                                            <fsn:doubleSelectList name="idsConceptosPorcentajePercepciones" beanName="tcConceptoPagoPercepcion" appendFilters="false" path="idsConceptosPorcentajePercepciones" size="15" />
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <table align="center" width="90%">
                                    <tr><td><h1><spring:message code="sireh.label.nomina.movimiento.pensionDTO.header.deducciones"/></h1></td></tr>   
                                    <tr>
                                        <td align="center">
                                            <fsn:doubleSelectList name="idsConceptosPorcentajeDeducciones" beanName="tcConceptoPagoDeduccion" appendFilters="false"  path="idsConceptosPorcentajeDeducciones" size="15" />
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="50%">    
        <tr>
            <td align="center">
                <fsn:submit value="submit.accept" action="movimientoNomina/updatePension.do"/>
            </td>
            <td align="center">
                <fsn:submit value="submit.cancel" path="cancel" action="movimientoNomina/getPensiones.do?rfcEmpleado=${customTdPensionDTO.rfcPension}"/>
            </td>
        </tr>
    </table>
    <html:hidden path="idPension" />
    <html:hidden path="clabePension" />
    <html:hidden path="cptosPorcentaje" />
    <html:hidden path="statusPension" />
    <html:hidden path="plaza_rfc" />

    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){
            $j('.numeric').numeric();
            $j('.numericpunto').numeric({allow:"."});
        });
        
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>

</html:form>