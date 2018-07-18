<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>

<fsn:action url="/shcpHome" var="shcpHomePath"/>
<fsn:action url="/singleSignoff" var="signoffPath"/>
<fsn:user var="usuario" scope="request"/>

<!-- HEADER -->
    <table border="0" cellspacing="0" cellpadding="0" align="center">
        <tr> 
          <td>
            <table class="logo" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td><img class="logoheader" src="<spring:theme code="logo.gif"/>" alt="logo"></td>
              </tr>
            </table>
          </td>
          <td>
            <table class="header">
              <tr>
                <td align="left" width="60%">
                  <table border="0" cellpadding="0" cellspacing="0">
                      <tr class="top"> 
                        <td class="appname" colspan="2"><spring:message code="main.header.system.full.name"/>&nbsp;<spring:message code="main.header.application.name"/></td>
                      </tr>
                      <tr class="bottom">
                        <td class="version" width="50%" align="left"><spring:message code="main.header.application.version"/></td>
                        <td class="version" width="50%" align="left"><c:out value="${usuario.operationYear}"/></td>
                      </tr>
                  </table>
                </td>
                <td width="20%" align="right">
                  <table class="logoapp" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                      <td><img src='<spring:theme code="logoapp.gif"/>' alt="logoapp" width="139" height="60" align="top"></td>
                    </tr>
                  </table>
                </td>
                <td width="20%" align="right">
                  <table border="0" cellpadding="0" cellspacing="0">
                      <tr class="top">
                        <td class="home"><a href='<c:out value="${sessionScope['urlHome']}"/>'><img src="<spring:theme code="background.gif"/>" alt="home" width="26" height="26"></a></td>
                        <td class="help"><a href="#"><img src="<spring:theme code="background.gif"/>" alt="help" width="26" height="26"></a></td>
                        <td class="print"><a href="#"><img src="<spring:theme code="background.gif"/>" alt="print" width="26" height="26"></a></td>
                        <td class="logout"><a href="#" onclick="delegateOpener('<c:out value="${shcpHomePath}"/>')"><img src="<spring:theme code="background.gif"/>" alt="Menu Aplicaciones" width="26" height="26"></a></td>
                        <td class="signoff"><a href="#" onclick="delegateOpener('<c:out value="${signoffPath}"/>')"><img src="<spring:theme code="background.gif"/>" alt="Single Sign Off" width="26" height="26"></a></td>
                      </tr>
                      <tr class="bottom">
                        <td colspan="5" class="username"><c:out value="${usuario.userName}"/></td>
                      </tr>
                  </table>
                </td>
              </tr>
            </table>
          </td>
        </tr>
        <tr>
          <td colspan="5">
            <table class="menu">
                <tr>
                  <td>
                    <tiles:insertAttribute name="navigationMenu"/>
                  </td>
                </tr>
            </table>            
          </td>
        </tr>
      </table>
<!-- HEADER END -->
