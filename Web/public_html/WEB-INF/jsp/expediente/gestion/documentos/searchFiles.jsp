<%@ page import="gob.shcp.jcr.query.JcrCondition"%>
<%@ page import="static gob.shcp.sireh.model.expediente.JcrDataDTO.*"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>

<html:form modelAttribute="jcrDataDTO">
  <h3>
    <spring:message code="jcrDataDTO.search.title"/>
  </h3>
  <table align="center" width="200px" class="data">
    <tr>
      <td><spring:message code="jcrDataDTO.name"/>:     </td>   <td><html:input path="name"/>       </td>
      <td><spring:message code="jcrDataDTO.title"/>:    </td>   <td><html:input path="title"/>          </td>
      <td><spring:message code="jcrDataDTO.descripcion"/>:  </td>   <td><html:input path="descripcion"/></td>
    </tr>
    <tr>
      <td><spring:message code="jcrDataDTO.cadena"/>:       </td>   <td><html:input path="cadena"/>     </td>
      <td><spring:message code="jcrDataDTO.long"/>:         </td>   <td><html:input path="long_"/>      </td>
      <td><spring:message code="jcrDataDTO.decimal"/>:      </td>   <td><html:input path="decimal"/>    </td>
    </tr>
    <tr>
      <td><spring:message code="jcrDataDTO.booleano"/>:     </td>   <td><html:input path="booleano"/>   </td>
    </tr>
    </table>
    <table>
     <tr>
      <td colspan="8" align="right"><fsn:submit value="submit.search" action="jcr/searchFiles"/></td>
    </tr>
    </table>
     <c:if test="${showVersionsId == null}">
     <fsn:jcrFilter propertyName="fsn:fileName" valuePath="jcrDataDTO.fileName" operator="like"/>
     <fsn:jcrFilter propertyName="jcr:title" valuePath="jcrDataDTO.title" operator="like"/>
     <fsn:jcrFilter propertyName="jcr:description" valuePath="jcrDataDTO.descripcion" operator="like"/>
     <fsn:jcrFilter propertyName="fsn:cadena" valuePath="jcrDataDTO.cadena" operator="like"/>
     <fsn:jcrFilter propertyName="fsn:long" valuePath="jcrDataDTO.long_" operator="like"/>
     <fsn:jcrFilter propertyName="fsn:decimal" valuePath="jcrDataDTO.decimal" operator="like"/>
     <fsn:jcrFilter propertyName="fsn:booleano" valuePath="jcrDataDTO.booleano" operator="like"/>
    <fsn:jcrList nodeType="fsn:fsntestResource"/>
    </c:if>
    <c:if test="${items != null}">
    <display:table name="items" class="displaytag" pagesize="10" uid="row" sort="list" requestURI="/jcr/searchFiles.do"   >
            <display:column titleKey="jcrDataDTO.name" property="name"/>
            <display:column titleKey="jcrDataDTO.created" property="created.time" format="{0,date,dd-MM-yyyy:hh:mm:ss}"/>
            <display:column titleKey="jcrDataDTO.lastModified" property="lastModified.time" format="{0,date,dd-MM-yyyy:hh:mm:ss}"/>
            <display:column titleKey="jcrDataDTO.mimeType" property="mimeType"/>
            <%--
                <c:forEach   var="property" items="${row.properties}">
                    <display:column title="${property.key}" value="${property.value}"/>
                </c:forEach>
            --%>
            <display:column title="cadena" property="properties.fsn:cadena"/>
            <display:column title="decimal" property="properties.fsn:decimal"/>
            <display:column  value="DESCARGAR" href="downloadFile.do" paramId="uuid" paramProperty="uuid"/>
            <display:column  value="ACTUALIZAR" href="initUpdateFile.do" paramId="uuid" paramProperty="uuid"/>
            <display:column  value="VERSIONES" href="showVersionsFile.do" paramId="uuid" paramProperty="uuid"/>
            <display:column  value="ELIMINAR" href="deleteFile.do" paramId="uuid" paramProperty="uuid"/>
            <display:setProperty name="paging.banner.placement" value="bottom"/>
            <display:setProperty name="export.pdf" value="true"/>
            <display:setProperty name="basic.msg.empty_list">
                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
            </display:setProperty>
    </display:table>
    </c:if>
    
    <c:if test="${showVersionsId != null}">
    
    <fsn:jcrVersions uuid="${showVersionsId}" name="versionsList" />
    <display:table name="versionsList" class="displaytag" pagesize="10" uid="versionRow" sort="list" requestURI="jcr/searchFiles.do">
            <display:column titleKey="jcrDataDTO.version" property="versionName"/>
            <display:column titleKey="jcrDataDTO.versionDate" property="versionCreated.time" format="{0,date,dd-MM-yyyy:hh:mm:ss}"/>
            <display:column titleKey="jcrDataDTO.lastModifiedBy" property="lastModifiedBy"/>
            <display:column  value="DESCARGAR" href="downloadFile.do" paramId="uuid" paramProperty="uuid"/>
            
            <display:setProperty name="paging.banner.placement" value="bottom"/>
            <display:setProperty name="export.pdf" value="true"/>
            <display:setProperty name="basic.msg.empty_list">
                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
            </display:setProperty>
    </display:table>
    </c:if>
  </table>
</html:form>