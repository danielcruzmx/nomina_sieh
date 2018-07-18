<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<html:form modelAttribute="plantillaDTO" method="post" enctype="multipart/form-data">
    <h1>
        <strong>
                <spring:message code="sireh.label.configuracion.manto.plantilla.clc.titulo"/>
               <spring:message code="sireh.label.configuracion.manto.plantillas.clc.opcion"/> 
        </strong>
    </h1>
    <p>&nbsp;</p>
    <table width="80%">
         <tr>   
            <td class="label"><spring:message code="sireh.label.configuracion.manto.plantillas.clc.mensaje"></spring:message></td>
            <td><fsn:label path="mensaje"/></td>            
        </tr>
    </table>    
</html:form>