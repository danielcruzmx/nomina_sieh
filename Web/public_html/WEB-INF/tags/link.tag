<%@ tag import="gob.shcp.fsn.control.view.util.TagUtils" %>

<%@ attribute name="action" required="false" %>
<%@ attribute name="parameters" required="false" %>
<%@ attribute name="htmlEscape" required="false" %>

<%@ attribute name="href" required="false" %>
<%@ attribute name="target" required="false" %>
<%@ attribute name="accesskey" required="false" %>
<%@ attribute name="alt" required="false" %>
<%@ attribute name="cssClass" required="false" %>
<%@ attribute name="cssStyle" required="false" %>
<%@ attribute name="dir" required="false" %>
<%@ attribute name="disabled" required="false" %>
<%@ attribute name="id" required="false" %>
<%@ attribute name="lang" required="false" %>
<%@ attribute name="onblur" required="false" %>
<%@ attribute name="onfocus" required="false" %>
<%@ attribute name="onclick" required="false" %>
<%@ attribute name="ondblclick" required="false" %>
<%@ attribute name="onmousedown" required="false" %>
<%@ attribute name="onmousemove" required="false" %>
<%@ attribute name="onmouseout" required="false" %>
<%@ attribute name="onmouseover" required="false" %>
<%@ attribute name="onmouseup" required="false" %>
<%@ attribute name="tabindex" required="false" %>
<%@ attribute name="title" required="false" %>
<%@ attribute name="progressIcon" required="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%
    try{
%>
        <c:if test="${empty htmlEscape}">
            <c:set var="htmlEscape" value="false"/>
        </c:if>
        <c:set value="<%=href%>" var="_href" scope="page"/>
        <%
        Integer htmlElementUniqueID = TagUtils.getHtmlUniqueId(pageContext);
        
        String progressType = "icon";
        if(progressIcon != null && !Boolean.valueOf(progressIcon)){
            progressType = "";
        }
        
        if(href == null || "".equals(href)) {
            if(action != null && !"".equals(action)) {
                if(!action.startsWith("/")) {
                    action = "/" + action;
                }
                if(!action.endsWith(".do")) {
                    action = action + ".do";
                }
                if(parameters != null && !"".equals(parameters)) {
                    if(!parameters.startsWith("?")) {
                        parameters = "?" + parameters;
                    }
                    action = action + parameters.replace(",", "&");
                }
%>
                <c:url value="<%=action%>" var="_href" scope="page"/>
<%
            } else {
%>
                <c:set value="#" var="_href" scope="page"/>
<%
            }
        }
        
        if(onclick != null && !"".equals(onclick)) {
            onclick = onclick + "showLightbox("+ htmlElementUniqueID +");";
        } else {
            onclick = "showLightbox("+ htmlElementUniqueID +");";
        }
        
        if(disabled != null && "true".equals(disabled)) {
%>
            <jsp:doBody />
<%
        } else {
%>
            <a id="<%=htmlElementUniqueID%>" progressType="<%=progressType%>" href="<c:out value='${_href}'/>" onclick="<%=onclick%>">
                <jsp:doBody />
            </a>
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