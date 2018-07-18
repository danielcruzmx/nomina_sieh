<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="expedienteDTO">
    <table width="100%">
        <tr align="left">
            <td> <h1> <spring:message code="sireh.label.merito.reportes.seccion.titulo.link">:&nbsp;&nbsp;&nbsp;</spring:message> <fsn:label path="nombreEmp"/></h1> </td>
        </tr>
        <tr align="center">
            <td>
                <table width="100%" align="center">
                    <tr>
                        <td align="center">
                            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                                    <strong><spring:message text="Notas de"/>
                                    <img class="fotografia" width="65" src="<spring:theme code="acierto.jpg"/>" align="middle"/>                                   
                                    <strong><spring:message text="M&eacute;rito "/></strong>
                                </legend>
                                <table width="100%">
                                    <tr> <td align="center">  <fsn:graficaMerito rfc="${expedienteDTO.rfcEmpleado}" /> </td> </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
    </script>
</html:form>