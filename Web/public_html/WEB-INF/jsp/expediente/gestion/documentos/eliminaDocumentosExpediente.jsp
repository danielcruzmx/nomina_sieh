<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>


<html:form modelAttribute="expedienteEliminaDocumentosDTO">
    <html:hidden path="numDocumentos" id="numDocumentos"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.rechazos" /></h1>
    <p>&nbsp;</p>
    
    elimina documentos Expediente
</html:form>