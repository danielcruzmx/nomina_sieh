<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html:form>
    <h1>
        <spring:message code="sireh.label.nomina.calculo.perseverancia.periodo.titulo" />
    </h1>
        <table width="75%" align="center" border="0">
        <tr><td></td></tr>
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.calculo.perseverancia.header.candidatos"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="90%" border="0">
                    <tr><td></td></tr>
                    <tr>
                        <td align="center">
                            <spring:message code="sireh.label.nomina.calculo.perseverancia.generar"/>
                        </td>
                    </tr>
                    <tr><td></td></tr>
                    <tr>
                        <td align="center">
                                <fsn:submit value="submit.accept" progressBar="true"
                                            action="calculoNominaExt/perservAceptar"/>
                        </td>
                    </tr>
                    <tr><td></td></tr>
                </table>
                </fieldset>
            </td>
        </tr>
    </table>

</html:form>