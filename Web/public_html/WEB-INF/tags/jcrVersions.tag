<%@ tag import="java.util.List" %>
<%@ tag import="java.util.ArrayList" %>
<%@ tag import="gob.shcp.fsn.control.view.util.TagUtils" %>
<%@ tag import="gob.shcp.jcr.service.JcrService" %>
<%@ tag import="gob.shcp.fsn.service.ServiceException"%>

<%@ attribute name="uuid"%>
<%@ attribute name="uuidPath"%>
<%@ attribute name="name"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    try{
        if(uuid==null){
            pageContext.setAttribute("uuidPath", uuidPath, PageContext.PAGE_SCOPE);
%>
            <spring:bind path="${uuidPath}">
                <c:set var="requestValue" value="${status.value}"/>
            </spring:bind>
<%
            String obj =(String)pageContext.getAttribute("requestValue");
            if (obj!=null){
                uuid = obj;
            }
        }
        if (uuid!=null && !uuid.equals("")){
            
            
        List data = ((JcrService)TagUtils.getService(pageContext,JcrService.class )).getVersions(uuid);

    if(name == null || "".equals(name)) {
    name = "items";
    }
    request.setAttribute(name, data);
        }
    }catch(Exception e){
        e.printStackTrace();
    }
%>
