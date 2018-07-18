<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>

<html:form modelAttribute="jcrDataDTO" enctype="multipart/form-data">
  <spring:message code="jcrDataDTO.upload.title"/>
  <p>
  <p>
  <table cellspacing="0" cellpadding="5" border="0" align="center" >
      
       <html:hidden path="uuid"/>
      <tr><td align="right"><spring:message code="jcrDataDTO.idArchivo"/>:</td><td align="left"><html:input path="uuid" disabled="true"/><td></tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.name"/>:</td><td align="left"><html:input path="name"/><td></tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.title"/>:</td><td align="left"><html:input path="title"/><td></tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.descripcion"/>:</td><td align="left"><html:input path="descripcion"/></td></tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.cadena"/>:</td><td align="left"><html:input path="cadena"/></td></tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.long"/>:</td><td align="left"><html:input path="long_"/></td></tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.decimal"/>:</td><td align="left"><html:input path="decimal"/></td></tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.booleano"/>:</td><td align="left"><html:input path="booleano"/></td></tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.filePath"/></td><td align="left"><input type="file" name="file" value="*.*" size="50"/></td></tr>
    <tr>
        <td class="normalinput" colspan="2" align="right">
        <blockquote>
          &nbsp;
        </blockquote>
        <fsn:submit value="submit.update" action="jcr/updateFile" />
        &nbsp;
      </td>
    </tr>
  </table>
</html:form>
