<%@ tag import="java.util.Map" %>
<%@ tag import="java.util.List" %>
<%@ tag import="java.util.ArrayList" %>
<%@ tag import="java.util.Arrays" %>
<%@ tag import="gob.shcp.fsn.model.support.DynaDTO" %>
<%@ tag import="gob.shcp.fsn.control.view.util.TagUtils" %>
<%@ tag import="org.springframework.util.StringUtils" %>
<%@ tag import="org.springframework.web.servlet.support.RequestContext" %>

<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tld/fsn/tagutils.tld" prefix="tagutils" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ attribute name="headerList" required="true"%>   <%-- Lista de propiedades, separadas por comas, del archivo application.properties que se utilizaran en los encabezados de la lista paginada. --%>
<%@ attribute name="startRow" required="true"%>     <%-- Variable en el request en donde se encuentran los campos de captura. --%>
<%@ attribute name="pagedUrl" required="true"%>     <%-- Url que se usa para la paginacion --%>

<%@ attribute name="beanName"%>                     <%-- Nombre de la consulta definida en el archivo view-sql-defs.xml --%>
<%@ attribute name="service" %>                     <%-- Nombre completo calificado del servicio que realizara la consulta --%>
<%@ attribute name="searchUrl"%>                    <%-- Url que se ejecuta al momento de realizar una busqueda, si no se necesita realizar ninguan accion en particular se puede especificar la misma que en el atributo "pagedUrl" --%>
<%@ attribute name="deleteUrl"%>                    <%-- Url que ejecuta la accion para eliminar un registro --%>
<%@ attribute name="updateUrl"%>                    <%-- Url que ejecuta la accion para actualizar un registro --%>
<%@ attribute name="saveUrl"%>                      <%-- Url que ejecuta la accion para guardar un registro --%>
<%@ attribute name="selectUrl"%>                    <%-- Url que ejecuta la accion configurada cuando se selecciona un registro --%>

<%@ attribute name="searchPath"%>                   <%-- Bandera que se agrega al request para identificar cuando se ejecuta la Url del atributo "searchUrl", esta bandera puede estar definida en un DTO, el valor por defecto es "searchSubmit"--%>
<%@ attribute name="updatePath"%>                   <%-- Bandera que se agrega al request para identificar cuando se ejecuta la Url del atributo "updateUrl", esta bandera puede estar definida en un DTO, el valor por defecto es "updateSubmit"--%>
<%@ attribute name="savePath"%>                     <%-- Bandera que se agrega al request para identificar cuando se ejecuta la Url del atributo "saveUrl" --%>

<%@ attribute name="paramProperty"%>                <%-- Nombre de la propiedad que sera el identificador unico de los registros, por default se toma la primer propiedad que se recupere de la lista de keys de DynaDTO --%>
<%@ attribute name="paramId"%>                      <%-- Variable que se agrega al request con el identificador unico del registro, cuando se selecciona un registro de la lista paginada, el valor por defecto es "id"  --%>
<%@ attribute name="showParamProperty"%>            <%-- Bandera que indica si se muestra el identificador unico de los registros --%>
<%@ attribute name="editParamProperty"%>            <%-- Bandera que indica si se permite editar el identificador unico al momento de seleccionar un registro para actualizarlo --%>
<%@ attribute name="onClear"%>                      <%-- Funcion javascript que se define del lado del jsp y que debe limpiar los campos de captura --%>
<%@ attribute name="dateFormat"%>                   <%-- Formato de fecha que se le aplicara a los datos de tipo fecha --%>
<%@ attribute name="exportTypes"%>                  <%-- Lista separada por comas de los tipos en los que se podra exportar la informacion de la lista paginada, los valores aceptados son: csv, excel, pdf, xml --%>
<%@ attribute name="emptyContentMessage"%>          <%-- Propiedad definida en el archivo application.properties que contien el mensaje que se mostrara en caso de no encontrar ningun registro que mostrar, por defecto toma la propieda: "pagedList.empty.content" --%>

<%
try {
    String sourceName = "";
    String sourceType = "";
    if((beanName == null || "".equals(beanName)) && (service == null || "".equals(service))) {
        return;
    } else if(beanName != null && !"".equals(beanName)) {
        sourceName = beanName;
        sourceType = "beanName";
    } else if(service != null && !"".equals(service)) {
        sourceName = service;
        sourceType = "service";
    }
    pageContext.setAttribute("sourceName", sourceName);
    pageContext.setAttribute("sourceType", sourceType);

    headerList = headerList != null ? headerList.trim() : "";
    String[] tableHeaders = headerList.split(",");
    String export = exportTypes != null ? "true" : "false";
    exportTypes = exportTypes != null ? exportTypes.trim() : "";
    List<String> exportProps = Arrays.asList(exportTypes.split(","));
    paramId = (paramId!=null && !"".equals(paramId)) ? paramId : "id";
    dateFormat = (dateFormat!=null && !"".equals(dateFormat)) ? dateFormat : "dd/MM/yyyy";
    emptyContentMessage = (emptyContentMessage!=null && !"".equals(emptyContentMessage)) ? emptyContentMessage : "pagedList.empty.content";
    
    pagedUrl  = TagUtils.formatUrl(pagedUrl);
    searchUrl = TagUtils.formatUrl(searchUrl);
    deleteUrl = TagUtils.formatUrl(deleteUrl);
    updateUrl = TagUtils.formatUrl(updateUrl);
    saveUrl   = TagUtils.formatUrl(saveUrl);
    selectUrl = TagUtils.formatUrl(selectUrl);
    
    searchPath = searchPath != null ? searchPath : "searchSubmit";
    updatePath = updatePath != null ? updatePath : "updateSubmit";
    savePath = savePath != null ? savePath : "";
    String selectPath = "selectSubmit";

    if(!"".equals(searchPath)) { %> <input type="hidden" id="<%=searchPath%>" name="<%=searchPath%>" value="false"/> <% }
    if(!"".equals(updatePath)) { %> <input type="hidden" id="<%=updatePath%>" name="<%=updatePath%>" value="false"/> <% }
    if(!"".equals(savePath))   { %> <input type="hidden" id="<%=savePath%>"   name="<%=savePath%>"   value="false"/> <% }
%>
    <c:url value="<%=pagedUrl%>" var="_pagedUrl" scope="page"/>
    <c:url value="<%=searchUrl%>" var="_searchUrl" scope="page"/>
    <c:url value="<%=deleteUrl%>" var="_deleteUrl" scope="page"/>
    <c:url value="<%=updateUrl%>" var="_updateUrl" scope="page"/>
    <c:url value="<%=saveUrl%>" var="_saveUrl" scope="page"/>
    <c:url value="<%=selectUrl%>" var="_selectUrl" scope="page"/>
<%
    pagedUrl  = StringUtils.hasText(pagedUrl)  ? (String)pageContext.getAttribute("_pagedUrl", PageContext.PAGE_SCOPE)  : pagedUrl;
    searchUrl = StringUtils.hasText(searchUrl) ? (String)pageContext.getAttribute("_searchUrl", PageContext.PAGE_SCOPE) : searchUrl;
    deleteUrl = StringUtils.hasText(deleteUrl) ? (String)pageContext.getAttribute("_deleteUrl", PageContext.PAGE_SCOPE) : deleteUrl;
    updateUrl = StringUtils.hasText(updateUrl) ? (String)pageContext.getAttribute("_updateUrl", PageContext.PAGE_SCOPE) : updateUrl;
    saveUrl   = StringUtils.hasText(saveUrl)   ? (String)pageContext.getAttribute("_saveUrl", PageContext.PAGE_SCOPE)   : saveUrl;
    selectUrl = StringUtils.hasText(selectUrl) ? (String)pageContext.getAttribute("_selectUrl", PageContext.PAGE_SCOPE) : selectUrl;
    
    Integer htmlUniqueSaveID   = TagUtils.getHtmlUniqueId(pageContext);
    Integer htmlUniqueSearchID = TagUtils.getHtmlUniqueId(pageContext);            
    Integer htmlUniqueUpdateID = TagUtils.getHtmlUniqueId(pageContext);
%>
    <c:set var="START_ROW_CONTENT">
      <tr>
        <c:out value="${startRow}" escapeXml="false"/>
        <td nowrap>
<%
        //Muestra el boton de busqueda.
        if(StringUtils.hasText(searchUrl)) {
%>
            <input id="<%=htmlUniqueSearchID%>" type="image" alt="buscar" path="<%=searchPath%>" action="<%=searchUrl%>" src="<spring:theme code="help.gif"/>" onclick="return doSubmit(<%=htmlUniqueSearchID%>);"/>
<%
        }
        //Muestra icono para limpiar los campos de captura, se debe configurar una funcion javaScript que limpie los campos de captura del lado del JSP en donde se utilice el tag.
        if(StringUtils.hasText(onClear)) {
%>
            <input type="image" alt="limpiar" src="<spring:theme code="clear.gif"/>" onclick="makeAddVisible();paramPropertyEditable();<%=onClear%>; return false;"/>
<%
        } else {
%>
            <input type="image" alt="limpiar" src="<spring:theme code="clear.gif"/>" onclick="makeAddVisible();paramPropertyEditable(); return false;"/>      
<%
        }
        // Muestra la accion de actualizar o agregar dependiendo de si se ha seleccionado un renglon de la lista paginada
        if((StringUtils.hasText(updateUrl) && Boolean.valueOf(request.getParameter(selectPath)))
            || (Boolean.valueOf(request.getParameter(updatePath)) && TagUtils.hasErrors(pageContext))) {
            if(StringUtils.hasText(saveUrl)) {
%>
                <input id="<%=htmlUniqueSaveID%>" type="image" alt="agregar" style="display:none;" path="<%=savePath%>" action="<%=saveUrl%>" src="<spring:theme code="add.gif"/>" onclick="return doSubmit(<%=htmlUniqueSaveID%>);" />    
<%
            }
%>
            <input type="hidden" id="<%=paramId%>" name="<%=paramId%>" value="<%=request.getParameter(paramId)%>"/>
            <input id="<%=htmlUniqueUpdateID%>" type="image" alt="aceptar" path="<%=updatePath%>" action="<%=updateUrl%>" src="<spring:theme code="acept.gif"/>"  onclick="return doSubmit(<%=htmlUniqueUpdateID%>);"/>
<%
        } else {
            if(StringUtils.hasText(saveUrl)) {
%>
                <input id="<%=htmlUniqueSaveID%>" type="image" alt="agregar" path="<%=savePath%>" action="<%=saveUrl%>" src="<spring:theme code="add.gif"/>" onclick="return doSubmit(<%=htmlUniqueSaveID%>);" />    
<%
            }
            if(StringUtils.hasText(updateUrl)) {
%>
                <input id="<%=htmlUniqueUpdateID%>" type="image" alt="aceptar" style="display:none;" path="<%=updatePath%>" action="<%=updateUrl%>" src="<spring:theme code="acept.gif"/>"  onclick="return doSubmit(<%=htmlUniqueUpdateID%>);"/>
<%
            }
        }
%>
        </td>
      </tr>
    </c:set>
<%
    if(Boolean.valueOf((String)request.getParameter(searchPath)) && !TagUtils.hasErrors(pageContext)) {
        pageContext.setAttribute("applyFilters", "true");
    }
%>
    <c:if test="${tagutils:createPagedList(pageContext,sourceName,sourceType,'','')}">
<%
    List data = (List)pageContext.getRequest().getAttribute(pageContext.getAttribute("displaySource").toString());
    if(!data.isEmpty()) {
        List<String> orderedKeys = ((DynaDTO)data.get(0)).getKeys();

        Map currentRow = null;
        String title = null;
        String property = null;
        String format = "";
        paramProperty = getParamProperty(paramProperty, orderedKeys);

        if(!Boolean.valueOf(showParamProperty)) {
            orderedKeys.remove(0);
        }
%>
        <!-- Define la lista paginada, incluyendo una columna al final de los renglones con la accion de eliminar el renglon seleccionado -->  
        <!-- Utiliza el decorator: gob.shcp.fsn.control.view.decorator.PagedListTableDecorator que incluye al inicio de la tabla el primer renglon definido anteriormente en la variable: START_ROW_CONTENT -->
        <spring:message code="confirm.delete" var="removeMessage"/>
        <c:url value="/.." var="_url" scope="page"/>
<%
        String url = (String)pageContext.getAttribute("_url", PageContext.PAGE_SCOPE);
%>
        <display:table name="${displaySource}" class="displaytag" pagesize="10" id="rows" requestURI="<%=pagedUrl%>" sort="list" export="<%=export%>" decorator="gob.shcp.fsn.control.view.decorator.PagedListTableDecorator">
<%
            currentRow = (Map)pageContext.getAttribute("rows");
            for(int i=0; i<orderedKeys.size(); i++) {
                title = getTitle(pageContext, tableHeaders, orderedKeys, i);
                property = orderedKeys.get(i);

                if(currentRow.get(property) instanceof java.util.Date) {
                    format = "{0,date,"+dateFormat+"}";
                }

                if(i==0) {
                    if(StringUtils.hasText(selectUrl)) {
                        selectUrl = TagUtils.appendUrlParam(selectUrl,selectPath,"true");
%>
                        <display:column sortable="true" title="<%=title%>" property="<%=property%>" href="<%=selectUrl%>" paramId="<%=paramId%>" paramProperty="<%=paramProperty%>" format="<%=format%>"/>
<%
                    } else {
%>
                        <display:column sortable="true" title="<%=title%>" property="<%=property%>" format="<%=format%>"/>
<%
                    }
                } else {
%>
                    <display:column title="<%=title%>" property="<%=property%>" format="<%=format%>"/>
<%
                }
            }
%>
            <display:column href="<%=deleteUrl%>" paramId="<%=paramId%>" paramProperty="<%=paramProperty%>" media="html">
<%
                if(StringUtils.hasText(deleteUrl)) {
%>
                    <img alt="eliminar" src="<spring:theme code="delete.gif"/>" height="20" width="20" onclick="return confirm('<c:out value="${removeMessage}"/>');"/>
<%
                }
%>
            </display:column>
            <display:setProperty name="paging.banner.placement" value="bottom"/>
            <display:setProperty name="url.context_path"><%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+url%></display:setProperty>
            <display:setProperty name="export.csv"><%=exportProps.contains("csv")%></display:setProperty>
            <display:setProperty name="export.excel"><%=exportProps.contains("excel")%></display:setProperty>
            <display:setProperty name="export.xml"><%=exportProps.contains("xml")%></display:setProperty>
            <display:setProperty name="export.pdf"><%=exportProps.contains("pdf")%></display:setProperty>
        </display:table>
<%
        if(Boolean.valueOf(request.getParameter(selectPath)) && StringUtils.hasText(updateUrl) && !Boolean.valueOf(editParamProperty)
            || (Boolean.valueOf(request.getParameter(updatePath)) && TagUtils.hasErrors(pageContext)) && !Boolean.valueOf(editParamProperty)) {
%>
            <script type="text/javascript">
                var inputElement = document.getElementById("<%=paramProperty%>");
                if(inputElement) {
                    inputElement.disabled=true;
                }
            </script>
<%
        }
    } else {
%>
        <table align="center" class="displaytag">
            <tr>
<% 
                for(String header: tableHeaders) {
                    header = TagUtils.getPropertyResourcesValue(pageContext, header);
%>
                   <th width="23%"><c:out value="<%=header%>"/></th>
<%
                }
%>
                <th align="center">&nbsp;</th>        
            </tr>
            <c:out value="${START_ROW_CONTENT}" escapeXml="false"/>
        </table>
        <table width="100%">
            <tr>
                <td colspan="">
                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="<%=emptyContentMessage%>"/><br><br></span>
                </td>
            </tr>
        </table>
<%
    }
%>
    <script type="text/javascript">
        function makeAddVisible() {
            var saveAction = document.getElementById("<%=htmlUniqueSaveID%>");
            var updateAction = document.getElementById("<%=htmlUniqueUpdateID%>");
            if(saveAction != null && updateAction != null) {
                saveAction.style.display = 'inline';
                updateAction.style.display = 'none';
            }
        }
        function paramPropertyEditable() {
            var inputElement = document.getElementById("<%=paramProperty%>");
            if(inputElement) {
                inputElement.disabled=false;
            }
        }
    </script>
    </c:if>
<%
} catch(javax.servlet.jsp.SkipPageException ignore) {
	//Ignore exception due "displayAjax" request parameter equals true when this tag includes body (AjaxDisplayTag.java)
} catch(Exception e) {
    e.printStackTrace();
}
%>

<%!
    private String getParamProperty(String paramProperty, List<String> keys) {
        if(paramProperty != null && !"".equals(paramProperty)) {
            return paramProperty;
        }
        return keys.get(0);    
    }

    private String getTitle(PageContext pageContext, String[] tableHeaders, List<String> keys, int idx) {
        String title;
        if(idx < tableHeaders.length) {
            title = tableHeaders[idx];
        } else {
            title = keys.get(idx);
        }
        return TagUtils.getPropertyResourcesValue(pageContext, title);
    }
%>
