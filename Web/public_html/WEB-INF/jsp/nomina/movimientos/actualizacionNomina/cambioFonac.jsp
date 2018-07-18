<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="gestionFonacDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.cambioFonac.path.header"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="75%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.cambioFonac.datosEmpleado.header"/></strong></legend>
                    <table align="center" width="100%">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.rfcEmpleado"/></td>
                            <td align="left"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${gestionFonacDTO.rfcEmpleado}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.primerApellido"/></td>
                            <td align="left"><fsn:label path="primerApellido"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.segundoApellido"/></td>
                            <td align="left"><fsn:label path="segundoApellido"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.nombreEmpleado"/></td>
                            <td align="left"><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.idPlaza"/></td>
                            <td align="left"><fsn:label path="idPlaza"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.idPuestoNom"/></td>
                            <td align="left"><fsn:label path="idPuestoNom"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.idNivelPto"/></td>
                            <td align="left"><fsn:label path="idNivelPto"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <p>&nbsp;</p>
    <table align="center" width="75%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.cambioFonac.datosFonac.header"/></strong></legend>
                    <table align="center" width="100%">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.fondoAhorro"/></td>
                            <td align="left"><html:checkbox path="hasFonac" disabled="${gestionFonacDTO.movtoConceptoPagoDTO.idSitCaptura ne 'V' and not gestionFonacDTO.altaEneabled}"/> </td>
                            <c:if test="${gestionFonacDTO.movtoConceptoPagoDTO.idSitCaptura eq 'V'}">
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.idConcepto"/></td>
                                <td>
                                    <spring:message code="sireh.label.nomina.movimiento.cambioFonac.idConcepto.ordinario"/>
                                    <html:radiobutton value="F" path="movtoConceptoPagoDTO.idConcepto" disabled="true"/>
                                    <spring:message code="sireh.label.nomina.movimiento.cambioFonac.idConcepto.extraordinario"/>
                                    <html:radiobutton value="FE" path="movtoConceptoPagoDTO.idConcepto" disabled="true" />
                                </td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.mcpRefCaptura"/></td>
                            <td align="left"><fsn:input path="movtoConceptoPagoDTO.mcpRefCaptura" size="30" maxlength="60"/> </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.mcpQnaADescontar"/></td>
                            <td align="left"><fsn:input path="movtoConceptoPagoDTO.mcpQnaADescontar" size="30" maxlength="4" css="numeric"/> </td>
                        </tr>
                        <c:choose>
                            <c:when test="${gestionFonacDTO.movtoConceptoPagoDTO.idSitCaptura ne 'V'}" >
                                <tr>
                                    <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.montoAdeudo"/></td>
                                    <td align="left"><fsn:input path="movtoConceptoPagoDTO.mcpMontoAdeudo" size="30" maxlength="11" css="decimal"/> </td>
                                    <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.qnasAdeudo"/></td>
                                    <td align="left"><fsn:selectList path="movtoConceptoPagoDTO.mcpQnasAdeudo" items="${gestionFonacDTO.listaQnasAdeudo}"/> </td>
                                </tr>
                                <tr>
                                    <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.fecIniAdeudo"/></td>
                                    <td align="left"><fsn:calendar path="fecIniAdeudo" /> </td>
                                    <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioFonac.fecFinAdeudo"/></td>
                                    <td align="left"><fsn:calendar path="fecFinAdeudo" /> </td>
                                </tr>
                            </c:when>
                                
                            <c:otherwise>
                                <html:hidden path="fecIniAdeudo" />
                                <html:hidden path="fecFinAdeudo" />
                            </c:otherwise>
                        </c:choose>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <p>&nbsp;</p>
    <table align="center">
        <tr>
            <td align="center">
                <fsn:submit value="submit.accept" action="actualizacionNomina/updateFonac.do"/>
            </td>
            <td align="center">
                <fsn:submit value="submit.cancel" path="cancel" action="actualizacionNomina/gestionFonac.do"/>
            </td>
        </tr>
    </table>
    
    <c:forEach items="${gestionFonacDTO.listaQnasAdeudo}" var="selectQnaDTO" varStatus="status">
        <input type="hidden"  name="listaQnasAdeudo[<c:out value='${status.index}'/>].key" value="<c:out value='${selectQnaDTO.key}'/>" />
        <input type="hidden"  name="listaQnasAdeudo[<c:out value='${status.index}'/>].value" value="<c:out value='${selectQnaDTO.value}'/>" />
    </c:forEach>
    
    <html:hidden path="movtoConceptoPagoDTO.idMovtoConceptoPago" />
    <html:hidden path="movtoConceptoPagoDTO.idSitCaptura" />
    
    <script type="text/javascript">

        $j(document).ready(function(){
            $j('.numeric').numeric();
            $j('.decimal').decimal();
        });
    </script>
</html:form>