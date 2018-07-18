<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>

<html:form modelAttribute="jcrDataGestionDocumentosDTO" enctype="multipart/form-data">

    <h1><spring:message code="jcrDataGestionDocumentosDTO.upload.title"/></h1>

    <table cellspacing="0" cellpadding="5" border="0" align="center" >
        <tr>
            <td><spring:message code="jcrDataGestionDocumentosDTO.title"/>:    </td>
            <td><html:input path="title"/></td>
            <td><spring:message code="jcrDataGestionDocumentosDTO.encoding"/>: </td>
            <td><html:input path="encoding"/></td>
            <td><spring:message code="jcrDataGestionDocumentosDTO.mimeType"/>: </td>
            <td><html:input path="mimeType"/></td>
        </tr>
        <tr>
            <td><spring:message code="jcrDataGestionDocumentosDTO.descripcion"/>:  </td>
            <td><html:input path="descripcion"/></td>
            <td><spring:message code="jcrDataGestionDocumentosDTO.cadena"/>:       </td>
            <td><html:input path="cadena"/></td>
            <td><spring:message code="jcrDataGestionDocumentosDTO.long"/>:         </td>
            <td><html:input path="long_"/></td>
        </tr>
        <tr>
            <td><spring:message code="jcrDataGestionDocumentosDTO.decimal"/>:</td> <td><html:input path="decimal"/></td>
            <td><spring:message code="jcrDataGestionDocumentosDTO.booleano"/>:</td><td><html:input path="booleano"/></td>
            <td><spring:message code="jcrDataGestionDocumentosDTO.rollback"/>:</td><td><html:input path="rollback"/></td>
        </tr>
        <tr>
            <td align="right"><spring:message code="jcrDataGestionDocumentosDTO.filePath"/></td>
            <td><input type="file" name="file" value="*.*" size="50"/></td>
        </tr>
        <tr>
            <td align="left" class="normalinput" colspan="8" align="right">
                <blockquote>
                    &nbsp;
                </blockquote>
                <fsn:submit value="submit.save" action="gestionDocumentos/saveFileTest" />
                &nbsp;
            </td>
        </tr>
    </table>
</html:form>