<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>

<html:form modelAttribute="jcrDataDTO" enctype="multipart/form-data">
  <spring:message code="jcrDataDTO.upload.title"/>
  <p>
  <p>

  <table  cellspacing="0" cellpadding="5" border="0" align="center"  >
    <tr>
      <td><spring:message code="jcrDataDTO.title"/>:    </td><td><html:input path="title"/>     </td>
      <td><spring:message code="jcrDataDTO.encoding"/>: </td><td><html:input path="encoding"/>  </td>
      <td><spring:message code="jcrDataDTO.mimeType"/>:     </td><td><html:input path="mimeType"/>      </td>
    </tr>
    <tr>
      
      <td><spring:message code="jcrDataDTO.descripcion"/>:  </td><td><html:input path="descripcion"/>   </td>
      <td><spring:message code="jcrDataDTO.cadena"/>:       </td><td><html:input path="cadena"/>        </td>
      <td><spring:message code="jcrDataDTO.long"/>:         </td><td><html:input path="long_"/>         </td>
    </tr>
    <tr>
      <td><spring:message code="jcrDataDTO.decimal"/>:  </td>   <td><html:input path="decimal"/>    </td>
      <td><spring:message code="jcrDataDTO.booleano"/>: </td>   <td><html:input path="booleano"/>   </td>
      <td>: </td>   <td>   </td>
    </tr>
    <tr>
       <td align="right"><spring:message code="jcrDataDTO.filePath"/>   </td>
       <td><input type="file" name="files" value="*.*" size="50"/>      </td>
    </tr>
        <tr>
       <td align="right"><spring:message code="jcrDataDTO.filePath"/>   </td>
       <td><input type="file" name="files" value="*.*" size="50"/>      </td>
    </tr>
    <tr>
       <td align="right"><spring:message code="jcrDataDTO.filePath"/>   </td>
       <td><input type="file" name="files" value="*.*" size="50"/>      </td>
    </tr>
    <tr>
       <td align="right"><spring:message code="jcrDataDTO.filePath"/>   </td>
       <td><input type="file" name="files" value="*.*" size="50"/>      </td>
    </tr>
    <tr>
       <td align="right"><spring:message code="jcrDataDTO.filePath"/>   </td>
       <td><input type="file" name="files" value="*.*" size="50"/>      </td>
    </tr>
    <tr>
       <td align="right"><spring:message code="jcrDataDTO.filePath"/>   </td>
       <td><input type="file" name="files" value="*.*" size="50"/>      </td>
    </tr>


    <tr>
        <td align="left" class="normalinput" colspan="8" align="right">
        <blockquote>
          &nbsp;
        </blockquote>
        <fsn:submit value="submit.save" action="jcr/saveMultipleFiles" />
        &nbsp;
      </td>
    </tr>
  </table>
</html:form>
