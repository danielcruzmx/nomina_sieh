<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form  modelAttribute="correoElectronicDTO">
    
    <h2> <strong> <spring:message code="sireh.label.nomina.terceros.previa.envioCFDI.empleado"/> </strong> </h2> 
    <p>&nbsp;</p>
    
    <table width="100%"  align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.2em"><strong> &nbsp;&nbsp;&nbsp;  VISTA PREVIA DEL CORREO &nbsp;&nbsp;&nbsp; </strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td>
                               <c:out value="${correoElectronicDTO.plantillaCorreo}" escapeXml="s"/>
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
</html:form>


