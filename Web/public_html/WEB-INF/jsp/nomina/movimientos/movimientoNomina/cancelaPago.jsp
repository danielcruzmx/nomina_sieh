<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="cancelaPagoDTO">
    <p>
        <h1><spring:message code="sireh.label.nomina.movimiento.cancelaPago.titulo"></spring:message></h1>
    </p>
    <p>&nbsp;</p>
    <table align="center" width="70%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Empleado&nbsp;&nbsp; </strong></legend>
                    <table align="center" width="90%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.numeroFolio"/></td>
                            <td align="left"><fsn:input path="hpFolio" size="13" maxlength="10" css="numeric"/></td>
                            <c:if test="${not empty cancelaPagoDTO.nombreEmpleado}">
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cancelaPago.tipoNomina"/></td>
                                <td align="left"><fsn:label path="descTipoNomina"/></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.rfc"/></td>
                            <td align="left"><html:input path="hpRfc" size="19" maxlength="13" /></td>
                            <c:if test="${not empty cancelaPagoDTO.nombreEmpleado}">
                                <td align="right" class="label" colspan="2"><fsn:label path="primerApellido"/><fsn:label path="segundoApellido"/><fsn:label path="nombreEmpleado"/></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.claveDiferenciadora"/></td>
                            <td align="left"><fsn:input path="hpDifFolio" size="6" maxlength="3" css="numeric"/></td>
                            <td colspan="4">&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.liquido"/></td>
                            <td align="left"><fsn:input path="hpNetoPago" size="41" maxlength="38" css="numericpunto"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="left">
                                <c:if test="${empty cancelaPagoDTO.nombreEmpleado}">
                                    <strong><spring:message code="sireh.form.required.fields"/></strong>
                                </c:if>
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/>
    <c:if test="${not empty cancelaPagoDTO.nombreEmpleado}">
        <table align="center" width="100%">
            <tr>
                <td>
                    <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Datos para cancelar el pago &nbsp;&nbsp;</strong></legend>
                        <table align="center" width="90%" border="0">
                            <tr><td colspan="4">&nbsp;</td></tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cancelaPago.qnaPago"/></td>
                                <td align="left"><fsn:label path="hpQnaPago"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cancelaPago.situacionCheque"/></td>
                                <td align="left"><fsn:label path="descSitPago"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.motivoCancelacion"/></td>
                                <td align="left" colspan="3"><fsn:option key="0" value="selectList.nonValue"/><fsn:selectList beanName="tcMotivoCancela" path="idMotivoCancela"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.cpcQnaAplica"/></td>
                                <td align="left"><fsn:option key="0" value="selectList.nonValue"/><fsn:selectList beanName="QRegControl" path="cpcQnaAplica"/></td>
                                <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimiento.cancelaPago.referencia"/></td>
                                <td align="left" class="label"><html:input path="cpcReferencia" maxlength="18" size="29" id="cpcReferencia"/></td>
                            </tr>
                            <tr><td colspan="4">&nbsp;</td></tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:if>
    <table align="center" width="100%" border="0">
        <tr>
            <td colspan="2" align="left" height="20px" valign="middle">
                <c:if test="${not empty cancelaPagoDTO.nombreEmpleado}">
                    <strong><spring:message code="sireh.form.required.fields"/></strong>
                </c:if>
            </td>
        </tr>
        <tr>
            <td align="center">
                <fsn:submit path="cancelaPago" value="submit.validar" action="movimientoNomina/validaCancelaPago.do" />
                <fsn:submit value="submit.corregir" path="cancel" action="movimientoNomina/corrigeCancelaPago.do"/>                
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j(document).ready(function(){
        
            $j('.numeric').numeric();
            $j('.numericpunto').numeric({allow:"."});
            
            $j("#10002").attr('disabled','true');
            
            $j("#cpcReferencia").click(function(){
                $j("#10001").attr('disabled','true');
                $j("#10002").removeAttr('disabled');
            });
            
        });
    </script>
    
</html:form>