<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>

<html:form modelAttribute="jcrData2DTO" enctype="multipart/form-data">
  <spring:message code="jcrDataDTO.upload.title"/>
  <p>
  <p>

  <table cellspacing="0" cellpadding="5" border="0" align="center" >
    <tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.title"/>:</td><td align="left"><html:input path="title"/><td></tr>
      <tr><td align="right"><spring:message code="jcrDataDTO.descripcion"/>:</td><td align="left"><html:input path="description"/></td></tr>
      <tr><td align="right"><spring:message code="jcrData2DTO.region"/>:</td><td align="left"><html:input path="region"/></td></tr>
      <tr><td align="right"><spring:message code="jcrData2DTO.pais"/>:</td><td align="left"><html:input path="pais"/></td></tr>
    </tr>
    <tr>
       <td align="right"><spring:message code="jcrDataDTO.filePath"/></td>
       <td><input type="file" name="file" value="*.*" size="50"/></td>
    </tr>
    <tr>
        <td align="left" class="normalinput" colspan="8" align="right">
        <blockquote>
          &nbsp;
        </blockquote>
        <fsn:submit value="submit.save" action="jcr/save2File" />
        &nbsp;
      </td>
    </tr>
  </table>
</html:form>
