<%@ tag import="gob.shcp.fsn.control.binder.ControllerWebBindingInitializer" %> 

<%@ attribute name="path" required="true" %>
<%@ attribute name="disabled" %>
<%@ attribute name="htmlEscape" %>
<%@ attribute name="maxlength" %>
<%@ attribute name="readonly" %>
<%@ attribute name="size" %>
<%@ attribute name="css" %>
<%@ attribute name="title" %>
<%@ attribute name="uppercase" %>
<%@ attribute name="onblur" %>
<%@ attribute name="onkeyup" %>
<%@ attribute name="onkeypress" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    try{
%>
    <c:if test="${empty htmlEscape}">
        <c:set var="htmlEscape" value="false"/>
    </c:if>
<%
        boolean upperCased = true;
        if(uppercase != null && !"".equals(uppercase)) {
            upperCased = Boolean.valueOf(uppercase);
        }
        String cssClass = upperCased ? "uppercase" : "";
        disabled = Boolean.valueOf(disabled).toString();
        maxlength = maxlength==null? "" : maxlength;
        readonly = Boolean.valueOf(readonly).toString();
        size = size==null ? "" : size;
        css = css==null ? "" : css;
        title = title==null ? "" : title;
        onblur = onblur==null ? "" : onblur;
        onkeyup = onkeyup==null ? "" : onkeyup;
        onkeypress = onkeypress==null ? "" : onkeypress;
        
        if(upperCased) {
%>
            <input type="hidden" name="<%=ControllerWebBindingInitializer.UPPER_CASE_PREFIX%><%=path%>" class="<%=css%>" value="true"/>
<%
        }
%>
    
    <html:input path="<%=path%>" maxlength="<%=maxlength%>" size="<%=size%>" title="<%=title%>" disabled="<%=disabled%>" readonly="<%=readonly%>" cssClass="<%=css%>" onblur="<%=onblur%>" onkeyup="<%=onkeyup%>" onkeypress="<%=onkeypress%>"/>

<%
    }catch(Exception e){
        e.printStackTrace();
    }
%>