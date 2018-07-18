<%@ tag import="org.springframework.web.util.TagUtils"%>
<%@ tag import="gob.shcp.fsn.service.parameter.ParameterService" %>
<%@ tag import="org.springframework.web.util.ExpressionEvaluationUtils" %>

<%@ attribute name="parameter"     required="true"%>
<%@ attribute name="parameterType" required="true"%>
<%@ attribute name="contextApp"%>
<%@ attribute name="scope"%>
<%@ attribute name="var"%>
<%@ attribute name="htmlEscape"%>
<%@ attribute name="alt"%>
<%@ attribute name="cssImage"%>
<%@ attribute name="height"%>
<%@ attribute name="width"%>

<%    
    try{
        scope = (scope!=null && !"".equals(scope)) ? scope : "request";
        alt = alt != null && !"".equals(alt) ? alt : "image";
        cssImage = cssImage != null && !"".equals(cssImage) ? cssImage : "";
        contextApp = (contextApp!=null && !"".equals(contextApp)) ? contextApp : request.getContextPath();
        width = (width != null && !"".equals(width)) ? width : "139";
        height = (height != null && !"".equals(height)) ? height : "67";

        if("string".equalsIgnoreCase(parameterType) || "bean".equalsIgnoreCase(parameterType)) {
            final ParameterService parameterService = gob.shcp.fsn.control.view.util.TagUtils.parameter(pageContext);
            final String value = parameterService.getString(parameter);
            final String resolvedVar = ExpressionEvaluationUtils.evaluateString("var", this.var, pageContext);
            if(resolvedVar != null) {        
                String resolvedScope = ExpressionEvaluationUtils.evaluateString("scope", this.scope, pageContext);
                pageContext.setAttribute(resolvedVar, value, TagUtils.getScope(resolvedScope));
            }

        } else if("file".equalsIgnoreCase(parameterType)) {
            String path=request.getRequestURL().toString();
            path = path.substring(0, path.indexOf(request.getContextPath()) + request.getContextPath().length());
%>
            <img class="<%=cssImage%>" src="<%=path%>/resourceServlet?file=<%=parameter%>&contexto=<%=contextApp%>" alt="<%=alt%>" width="<%=width%>" height="<%=height%>">
<%      }     
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
