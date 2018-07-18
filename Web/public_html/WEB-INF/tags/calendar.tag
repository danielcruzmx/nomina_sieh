<%@ tag import="gob.shcp.fsn.control.binder.ControllerWebBindingInitializer" %> 

<%@ attribute name="path" required="true"%>
<%@ attribute name="readonly"%>
<%@ attribute name="size"%>
<%@ attribute name="dateFormat"%>
<%@ attribute name="javaDateFormat"%>
<%@ attribute name="maxlength"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:url var="contextPath" value="/"/>

<%
try {
    if(readonly != null && readonly.equalsIgnoreCase("TRUE")){
        readonly = "readonly";
    }else{
        readonly="";
    }
    
    if(size == null || size.equals("")){
        size = "12";
    }
    if(dateFormat == null || dateFormat.equals("")){
        dateFormat = "%d/%m/%Y";
    }
    if(maxlength == null || maxlength.equals("")){
        maxlength = "10";
    }
%>
    <html:hidden path="<%=path%>" id="<%=path%>"/>
<%
    if(javaDateFormat != null && !javaDateFormat.equals("")){
%>
        <input type="hidden" name="<%=ControllerWebBindingInitializer.DATE_FORMAT_PREFIX%><%=path%>" value="<%=javaDateFormat%>"/>
<%}%>
        <input type="text" maxlength="<%=maxlength%>"  <%=readonly%> name="text_<%=path%>" id="text_<%=path%>" size="<%=size%>" onblur="changeValue_<%=path%>()"/>

    <span class="calendar">
    <a href="javascript:void(0)" id="button_<%=path%>" onblur="changeValue_<%=path%>()">
        <img src="<spring:theme code="background.gif"/>" alt="calendar" width="20" height="20"/>
    </a>
    </span>
    
    <script type="text/javascript">
        Calendar.setup({
            inputField     :    "text_<%=path%>",      
            ifFormat       :    "<%=dateFormat%>",                
            showsTime      :    false,
            button         :    "button_<%=path%>",   
            step           :    1        
        }); 
        
        document.getElementById("text_<%=path%>").value = document.getElementById("<%=path%>").value;        
        
        function changeValue_<%=path%>(){
            document.getElementById("<%=path%>").value = document.getElementById("text_<%=path%>").value;        
        };
    </script>
<%
} catch(Exception e) {
    e.printStackTrace();
}
%>
