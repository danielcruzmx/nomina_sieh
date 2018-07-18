<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="cambioAdscripcionMasivoDTO">
    <h1><spring:message code="sireh.label.plaza.masivas.honorarios.cambio.adscripcion.titulo"/></h1>  
    <p>&nbsp;</p>
    <table width="80%">
         <tr>   
            <td class="label"><spring:message code="sireh.label.plaza.masivas.honorarios.cambio.adscripcion.archivo.procesados"></spring:message></td>
            <td><fsn:link action="plazaHonorarioMasiva/downloadFile" parameters="nombreArchivoErrores=${cambioAdscripcionMasivoDTO.nombreArchivoResultados}" progressIcon="false" >
                  <c:out value="${cambioAdscripcionMasivoDTO.nombreArchivoResultados}" />
                </fsn:link></td>            
        </tr>        

    </table>
</html:form>