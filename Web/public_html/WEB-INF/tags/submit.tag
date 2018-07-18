<%@ tag import="gob.shcp.fsn.control.view.util.TagUtils" %>

<%@ attribute name="path" %>
<%@ attribute name="action" %>
<%@ attribute name="htmlEscape" %>
<%@ attribute name="value" required="true" %>
<%@ attribute name="onclick" %>
<%@ attribute name="progressBar" %>
<%@ attribute name="progressIcon" %>
<%@ attribute name="alertCode" %>
<%@ attribute name="uppercase" %>
<%@ attribute name="image" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%
    try{
%>
<c:if test="${empty htmlEscape}">
    <c:set var="htmlEscape" value="false"/>
</c:if>
<%
    String progressType = "icon";
    if(Boolean.valueOf(progressBar)) {
        progressType = "bar";
    }
    if(progressIcon != null && !Boolean.valueOf(progressIcon)) {
        progressType = "";
    }
    
    boolean upperCased = true;
    if(uppercase != null && !"".equals(uppercase)) {
        upperCased = Boolean.valueOf(uppercase);
    }
    String cssClass = upperCased ? "uppercase" : "";
    boolean showImg = false;
    if(image != null && !"".equals(image)) {
        showImg = Boolean.valueOf(image);
    }
    if(path != null && !"".equals(path)) {
%>
        <input type="hidden" id="<%=path%>" name="<%=path%>" value="false"/>
<%
    }
    if(action != null && !"".equals(action)) {
        action = TagUtils.formatUrl(action);        
%>
        <c:url value="<%=action%>" var="_action" scope="page"/>
<%
        action = (String)pageContext.getAttribute("_action", PageContext.PAGE_SCOPE);
    }
    if(alertCode != null && !"".equals(alertCode)) {
%>
        <spring:message code="<%=alertCode%>" text="<%=alertCode%>" var="_alertCode" scope="page"/>
<%
        alertCode = (String)pageContext.getAttribute("_alertCode", PageContext.PAGE_SCOPE);
    }

    Integer htmlElementUniqueID = TagUtils.getHtmlUniqueId(pageContext);

    if(onclick != null && !"".equals(onclick)) {
        onclick = onclick + ";return doSubmit("+ htmlElementUniqueID +");";
    } else {
        onclick = "return doSubmit("+ htmlElementUniqueID +");";
    }

    progressBar = progressBar != null ? progressBar : "false";
    action = action != null ? action : "";
    path = path != null ? path : "";
    alertCode = alertCode != null ? alertCode : "";

    if(!showImg) {
%>
        <spring:message code="${value}" text="${value}" var="value"/>
        <input id="<%=htmlElementUniqueID%>" type="submit" value="<c:out value='${value}'/>" class="<%=cssClass%>" onclick="<%=onclick%>" progressType="<%=progressType%>" action="<%=action%>" path="<%=path%>" alertCode="<%=alertCode%>"/>        
<%
    } else {
%>
        <input id="<%=htmlElementUniqueID%>" type="image" alt="<%=value%>" onclick="<%=onclick%>" progressType="<%=progressType%>" action="<%=action%>" path="<%=path%>" alertCode="<%=alertCode%>" src="<spring:theme code="submit.tag.gif"/>/<%=value%>.gif"/>
<%
    }

    if(progressType.equals("icon")) {
%>
        <img src="<spring:theme code="loader.gif"/>" id="progressIcon<%=htmlElementUniqueID%>" style="visibility:hidden;"/>
<%
    }
    
    }catch(Exception e){
        e.printStackTrace();
    }
%>