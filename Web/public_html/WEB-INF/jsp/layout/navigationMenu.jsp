<%@ taglib uri="http://struts-menu.sf.net/tag-el" prefix="menu"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:url var="contextPath" value="/"/>

    <menu:useMenuDisplayer name="CSSIFrameMenu" id="primary-nav" bundle="menuBundle" permissions="rolesAdapter" repository="repository">
        <c:forEach var="menu" items="${repository.topMenus}">
            <menu:displayMenu name="${menu.name}"/>
        </c:forEach>        
    </menu:useMenuDisplayer>
   <c:set var="quincenaFormat">
        <spring:message code="quincena.captura" />
    </c:set>
    <tr class="bottom">
        <td class="username" align="right"><fsn:qnaCaptura format="${quincenaFormat}"/></td>
    </tr>
   
