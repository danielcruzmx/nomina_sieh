<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<html:form modelAttribute="plantillaDTO" method="post" enctype="multipart/form-data">
    <html:hidden path="nameFile"/>
    <h1>
        <strong>
                <spring:message code="sireh.label.configuracion.manto.plantilla.plazas.titulo"/>
               <spring:message code="sireh.label.configuracion.manto.plantillas.plazas.opcion"/> 
        </strong>
    </h1>
    <p>&nbsp;</p>
    <table width="80%">
          <tr>   
            <td class="label"><spring:message code="sireh.label.configuracion.manto.plantillas.plazas.archivo.nombre"></spring:message></td>
            <td><fsn:link action="mantenimientoPlantillaPlazas/downloadFile" parameters="nombreArchivoDescarga=${plantillaDTO.nameFile}" progressIcon="false" >
                      <c:out value="${plantillaDTO.nameFile}" />
                </fsn:link>
            </td>            
        </tr>
         <tr>   
            <td class="label"> * <spring:message code="sireh.label.configuracion.manto.plantillas.plazas.archivo"></spring:message></td>
            <td><input type="file" name="file" id="file" /> </td>            
        </tr>
         <tr>
            <td align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
        </tr>
    </table>
    <html:hidden path="esNuevo" />
    
    <table width="100%">
        <tr align="right">
            <td><fsn:submit value="submit.upload" action="mantenimientoPlantillaPlazas/${plantillaDTO.urlDestino}" progressBar="true"/></td>
        </tr>
    </table>
</html:form>