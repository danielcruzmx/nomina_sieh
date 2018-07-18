<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<html:form modelAttribute="plantillaDTO" method="post" enctype="multipart/form-data">
    <h1>
        <strong>
            <spring:message code="sireh.label.configuracion.manto.plantilla.correo.titulo"/>
            <spring:message code="sireh.label.configuracion.manto.plantillas.correo.opcion"/> 
        </strong>
    </h1>
    <p>&nbsp;</p>
    <table width="80%">
          <tr>   
            <td class="label"><spring:message code="sireh.label.configuracion.manto.plantillas.correo.archivo.nombre"></spring:message></td>
            <td><fsn:label path="nameFile" /></td>            
        </tr>
         <tr>   
            <td class="label"> * <spring:message code="sireh.label.configuracion.manto.plantillas.correo.archivo"></spring:message></td>
            <td><input type="file" name="file" id="file" /> </td>            
        </tr>
         <tr>
            <td align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
        </tr>
    </table>
    <html:hidden path="esNuevo" />
    
    <table width="100%">
        <tr align="right">
            <td><fsn:submit value="submit.upload" action="mantenimientoPlantillaCorreo/${plantillaDTO.urlDestino}" progressBar="true"/></td>
        </tr>
    </table>
</html:form>