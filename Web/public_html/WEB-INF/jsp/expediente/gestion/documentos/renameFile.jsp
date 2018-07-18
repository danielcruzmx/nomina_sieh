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
      <tr><td align="right"><spring:message code="jcrDataDTO.name"/>:</td><td align="left"><html:input path="fileName" /><td></tr>
    <tr>
        <td class="normalinput" colspan="2" align="right">
        <blockquote>
          &nbsp;
        </blockquote>
        <fsn:submit value="submit.update" action="jcr/renameFile" />
        &nbsp;
      </td>
    </tr>
  </table>
</html:form>
