<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="cambioNombreCurpDTO">
    
    <h1><spring:message code="sireh.label.nomina.movimiento.cambioNombreCurp.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="70%">
        <tr>
            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioNombreCurp.rfcEmpleado"/></td>
            <td align="left"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${cambioNombreCurpDTO.rfcEmpleado}" image="detail.gif" /></td>
            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioNombreCurp.primerApellido"/></td>
            <td align="left"><fsn:input maxlength="20" path="primerApellido" size="20" uppercase="true"/></td>
        </tr>
        <tr>
            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioNombreCurp.segundoApellido"/></td>
            <td align="left"><fsn:input maxlength="20" path="segundoApellido" size="20" uppercase="true"/></td>
            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioNombreCurp.nombreEmpleado"/></td>
            <td align="left"><fsn:input maxlength="20" path="nombreEmpleado" size="20" uppercase="true"/></td>
        </tr>
         <tr>
            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioNombreCurp.idGenero"/></td>
            <td align="left">
                <fsn:option key="0" value="selectList.nonValue" />
                <fsn:selectList beanName="tcGenero" path="idGenero"/>
            </td>
            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioNombreCurp.idEdoNac"/></td>
            <td align="left">
                <fsn:option key="0" value="selectList.nonValue" />
                <fsn:selectList beanName="tcEstado" path="idEdoNac"/>
            </td>
        </tr>
         <tr>
            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioNombreCurp.fecNacimiento"/></td>
            <td align="left"><fsn:calendar path="fecNacimiento" size="10"/></td>
            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioNombreCurp.curpEmpleado"/></td>
            <td align="left"><fsn:input maxlength="18" path="curpEmpleado" size="25" uppercase="true"/></td>
        </tr>
        
        <tr>
            <td colspan="4">&nbsp;</td>
        </tr>
         <tr>
            <td colspan="4" align="center">
                <c:if test="${cambioNombreCurpDTO.curpVerificado == true}">
                    <fsn:submit value="submit.accept" action="cambioNomina/updateEmpleadoNombreCurp.do"/>&nbsp;
                </c:if>
                <fsn:submit value="submit.verify" action="cambioNomina/verificarCurp.do" path="verificar"/>&nbsp;
                <fsn:submit value="submit.cancel" path="cancel" action="cambioNomina/consultarCurp.do"/>
            </td>
        </tr>
    </table>
</html:form>