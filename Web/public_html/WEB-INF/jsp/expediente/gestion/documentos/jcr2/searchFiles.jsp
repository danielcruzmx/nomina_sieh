<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>

<html:form modelAttribute="jcrData2DTO">
    
    <h3><spring:message code="jcrDataDTO.search.title"/></h3>
  
    <table align="center" width="200px" class="data">
        <tr>
            <td><spring:message code="jcrData2DTO.name"/>:</td>
            <td><html:input path="name"/></td>
            <td><spring:message code="jcrData2DTO.rfc"/>:</td>
            <td><html:input path="rfc"/></td>
            <td><spring:message code="jcrData2DTO.documento"/>:</td>
            <td><html:input path="documento"/></td>
        </tr>
    </table>
    <table>
        <tr>
            <td colspan="8" align="right"><fsn:submit value="submit.search" action="jcr/search2Files"/></td>
        </tr>
    </table>
    
    <c:if test="${filesList != null}">
        <display:table name="filesList" 
                       class="displaytag" 
                       pagesize="10" 
                       id="row" 
                       sort="list" 
                       requestURI="/jcr/search2Files.do">
            <display:column titleKey="jcrData2DTO.name" 
                            property="name"/>
            <display:column titleKey="jcrData2DTO.description" 
                            property="description"/>
            <display:column titleKey="jcrData2DTO.created" 
                            property="created.time" 
                            format="{0,date,dd-MM-yyyy:hh:mm:ss}"/>
            <display:column titleKey="jcrData2DTO.lastModified" 
                            property="lastModified.time" 
                            format="{0,date,dd-MM-yyyy:hh:mm:ss}"/>
            <display:column value="DESCARGAR"  
                            href="downloadFile.do" 
                            paramId="uuid" 
                            paramProperty="uuid"/>
            <!--
            <display:column value="ACTUALIZAR" 
                            href="initUpdate2File.do" 
                            paramId="uuid" 
                            paramProperty="uuid"/>
            <display:column value="VERSIONES" 
                            href="showVersions2File.do" 
                            paramId="uuid" 
                            paramProperty="uuid"/>
            <display:column value="ELIMINAR" 
                            href="deleteFile.do" 
                            paramId="uuid" 
                            paramProperty="uuid"/>--%>
            
            <display:setProperty name="paging.banner.placement" value="bottom"/>
            <display:setProperty name="export.pdf" value="true"/>
            <display:setProperty name="basic.msg.empty_list">
                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
            </display:setProperty>
        </display:table>
    </c:if>
    
    <c:if test="${versionsList != null}">
        <display:table name="versionsList" 
                       class="displaytag" 
                       pagesize="10" 
                       id="row" sort="list" 
                       requestURI="jcr/search2Files.do">
            <display:column titleKey="jcrData2DTO.version" 
                            property="versionName"/>
            <display:column titleKey="jcrData2DTO.versionDate" 
                            property="versionCreated.time" 
                            format="{0,date,dd-MM-yyyy:hh:mm:ss}"/>
            <display:column titleKey="jcrData2DTO.lastModifiedBy" 
                            property="lastModifiedBy"/>
            <display:column value="DESCARGAR" 
                            href="downloadFile.do" 
                            paramId="uuid" 
                            paramProperty="uuid"/>
            
            <display:setProperty name="paging.banner.placement" value="bottom"/>
            <display:setProperty name="export.pdf" value="true"/>
            <display:setProperty name="basic.msg.empty_list">
                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
            </display:setProperty>
        </display:table>
    </c:if>
</html:form>