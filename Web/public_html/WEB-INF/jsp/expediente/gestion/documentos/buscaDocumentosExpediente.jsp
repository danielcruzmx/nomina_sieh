<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<style type="text/css">
    .columnHeader {
        background-color: rgb(109, 109, 109);
        color: rgb(255, 255, 255);
        font-weight: bold;
        text-align: center;
    }
    .columnFoter {
        background-color: rgb(0, 110, 219);
        color: rgb(255, 255, 255);
        font-weight: bold;
        text-align: center;
    }
</style>

<html:form modelAttribute="expedienteEliminaDocumentosDTO">
    <html:hidden path="numDocumentos" id="numDocumentos"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.rechazos" /></h1>
    <p>&nbsp;</p>
    
    <c:if test="${(expedienteEliminaDocumentosDTO.numDocumentos > 0) && !(expedienteEliminaDocumentosDTO.procesar) }">
        <fieldset>
            <legend><strong><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.rechazos.fieldSet"/></strong></legend>
            <table align="center" width="100%" border="0">
                <tr>
                    <td class="columnHeader"><spring:message code="sireh.label.expediente.eliminaRegistros.num"/></td>
                    <td class="columnHeader"><spring:message code="sireh.label.expediente.eliminaRegistros.tabla"/></td>
                    <td class="columnHeader"><spring:message code="sireh.label.expediente.eliminaRegistros.documento"/></td>
                </tr>
                <c:forEach items="${expedienteEliminaDocumentosDTO.listaDocumentos}" var="item">
                    <tr>
                        <td class="label" style="text-align: center;"><c:out value="${item.numero}"/></td>
                        <td class="label" style="text-align: left;"><c:out value="${item.nombreTabla}"/></td>
                        <td class="label" style="text-align: left;"><c:out value="${item.numDocumentos}"/></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td >&nbsp;</td>
                    <td >&nbsp;</td>
                    <td >&nbsp;</td>
                </tr>
                <tr>
                    <td >&nbsp;</td>
                    <td align="center"><fsn:submit value="submit.delete" path="procesar" action="gestionDocumentos/buscaDocumentosExpediente.do"/></td>
                    <td class="columnFoter" style="text-align: left;">TOTAL:&nbsp;&nbsp;&nbsp;<c:out value="${expedienteEliminaDocumentosDTO.numDocumentos}" /> </td>
                </tr>
            </table>
        </fieldset>
    </c:if>
    
    <script  type="text/javascript">
        $j(document).ready(function(){
            var numDocs = $j('#numDocumentos').val();
                $j('#10001').click(function(){
                    if(numDocs == 1){
                        var mesaje = 'ADVENTENCIA:   ' + numDocs + '  documentos sera eliminado. \n ESTE PROCESO ES IRREVERSIBLE! \n \u00BF Desea continuar ?';
                    } else{
                        var mesaje = 'ADVENTENCIA:  Los   ' + numDocs + '  documentos seran eliminados. \n ESTE PROCESO ES IRREVERSIBLE! \n \u00BF Desea continuar ?';
                    }
                    var r = window.confirm(mesaje);
                    $j('#procesar').val(r);
                    if(r){
                        
                    }
                });
            });
    </script>
</html:form>