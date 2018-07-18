<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="creacionPlazaMasivaDTO"  method="post" enctype="multipart/form-data">
    <c:choose>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'C'}">
            <h1><spring:message code="sireh.label.plaza.masivas.conversion.titulo"/></h1>  
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'R'}">
            <h1><spring:message code="sireh.label.plaza.masivas.reubicacion.titulo"/></h1>  
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'CR'}">
            <h1><spring:message code="sireh.label.plaza.masivas.creacion.titulo"/></h1>  
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'CA'}">
            <h1><spring:message code="sireh.label.plaza.masivas.cancelacion.titulo"/></h1>  
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'TR'}">
            <h1><spring:message code="sireh.label.plaza.masivas.transferencia.titulo"/></h1>  
        </c:when>
    </c:choose>
    <p>&nbsp;</p>
    <table width="80%">
         <tr>   
            <td class="label"> * <spring:message code="sireh.label.plaza.masivas.creacion.archivoAProcesar"></spring:message></td>
            <td><input type="file" name="file" id="file" /> </td>            
        </tr>
         <tr>
            <td align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
        </tr>
    </table>
    
    <table width="100%">
        <tr align="right">
            <td><fsn:submit value="submit.upload" action="plazaEstructuraMasiva/${creacionPlazaMasivaDTO.urlDestino}" progressBar="true"/></td>
        </tr>
    </table>
     <html:hidden path="inicio"  />
</html:form>