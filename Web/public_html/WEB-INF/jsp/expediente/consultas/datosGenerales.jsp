<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text=" Datos "/>
                        <img class="fotografia" width="40" src='<spring:theme code="persona.jpg"/>' align="middle"/>
                        <spring:message text="Generales "/>
                         </strong>
                </legend>
                <table width="100%">
                    <tr>
                        <td class="label" width="250">
                            <spring:message code="sireh.label.expediente.rfcEmpleado"></spring:message>
                        </td>
                        <td align="left" width="250"> 
                            <fsn:label path="rfcEmpleado"/>
                        </td>
                        <td class="label" width="250">
                            <spring:message code="sireh.label.expediente.curpEmpleado"></spring:message>
                        </td>
                        <td align="left" width="250"> 
                            <fsn:label path="curpEmpleado"/>
                        </td>
                    </tr>
                    <tr align="left">
                        <td class="label" width="250">
                            <spring:message code="sireh.label.expediente.ingresoGobFed"></spring:message>
                        </td>
                        <td align="left" width="250">
                            <fsn:label path="ingresoGobFed"/>
                        </td>
                        <td class="label" width="250">
                            <spring:message code="sireh.label.expediente.ingresoDependencia"></spring:message>
                        </td>
                        <td align="left" width="250">
                            <fsn:label path="ingresoDependencia"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="label" width="250">
                            <spring:message code="sireh.label.expediente.fecIngSpc"></spring:message>
                        </td>
                        <td align="left" width="250">
                            <fsn:label path="fecIngSpc"/>
                        </td>
                        <td class="label" width="250">
                            <spring:message code="sireh.label.expediente.fecIniDeclPatr"></spring:message>
                        </td>
                        <td align="left" width="250">
                            <fsn:label path="fecIniDeclPatr"/>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </fieldset>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
