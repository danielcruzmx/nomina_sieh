<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script type="text/javascript">
    function fileBrowse() {
        var browseField = document.getElementById("uploadForm").file;
        browseField.click();
    }
</script>

<html:form id="uploadForm" modelAttribute="reglasCalculoNominaDTO" method="post" enctype="multipart/form-data">
    
    <html:hidden path="directoryName"/>
    
    <h1><spring:message code="sireh.label.nomina.calculo.reglas.titulo"/></h1><br/>
    
    <p style="font-weight: bold; text-align: left;">Proceso de validaci&oacute;n:</p>
    <p style="text-align: left;">Paso 1) Elimine el archivo de definiciones (.dsl)</p>
    <p style="text-align: left;">Paso 2) Elimine el archivo de reglas (.dslr)</p><br />
    <p style="text-align: left;">Paso 3) Cargue el archivo de definiciones (.dsl)</p>
    <p style="text-align: left;">Paso 4) Cargue el archivo de reglas (.dslr)</p><br/>
                    
    <table width="70%" align="center" border="0">
        <c:if test="${reglasCalculoNominaDTO.showUpload}">
            <tr>
                <td align="right"><spring:message code="sireh.label.nomina.calculo.reglas.label.file"/>&nbsp;</td>
                <td><input type="file" name="file" size="80" /></td>
                <td align="center" style="padding-bottom: 4px;"><fsn:submit value="submit.upload" action="reglasNomina/uploadReglas"/></td>
            </tr>
        </c:if>
        <tr>
            <td colspan="2" align="center">
                
                <display:table name="reglasCalculoNominaDTO.files" 
                               class="displaytag" 
                               pagesize="10" 
                               id="file" 
                               requestURI="${requestURI}" 
                               sort="list">
                               
                    <display:caption><h1><c:out value="${reglasCalculoNominaDTO.caption}"/></h1></display:caption>
                    
                    <c:choose>
                        <c:when test="${!file.directory && !file.link}">
                                <display:column media="html"
                                                titleKey="sireh.label.nomina.calculo.reglas.eliminar">
                                    <a href="eliminaRegla.do?filename=<c:out value='${file.name}'/>&dirname=<c:out value='${reglasCalculoNominaDTO.directoryName}'/>&isdirectory=<c:out value='${file.directory}'/>&islink=<c:out value='${file.link}'/>">
                                        <img align="middle" src="<spring:theme code="delete.gif"/>" alt="" title="Eliminar" width="18" height="18"/>
                                    </a>
                                </display:column>
                        </c:when>
                        <c:otherwise>
                                <display:column titleKey="sireh.label.nomina.calculo.reglas.eliminar"/>
                        </c:otherwise>
                    </c:choose>
                    <display:column titleKey="sireh.label.nomina.calculo.reglas.header.filename"
                                    style="text-align: center;" 
                                    sortable="true">
                        <a href="downloadReglas.do?filename=<c:out value='${file.name}'/>&dirname=<c:out value='${reglasCalculoNominaDTO.directoryName}'/>&isdirectory=<c:out value='${file.directory}'/>&islink=<c:out value='${file.link}'/>">
                            <c:out value='${file.name}'/>
                        </a>
                    </display:column>
                    <display:column titleKey="sireh.label.nomina.calculo.reglas.header.ruta"
                                    style="text-align: center;" 
                                    sortable="true">
                            <c:choose>
                                <c:when test="${file.name == '..'}">
                                    <a href="downloadReglas.do?filename=<c:out value='${file.name}'/>&dirname=<c:out value='${reglasCalculoNominaDTO.directoryName}'/>&isdirectory=<c:out value='${file.directory}'/>&islink=<c:out value='${file.link}'/>">
                                        <c:out value='${file.name}'/>
                                    </a>
                                </c:when>
                                <c:otherwise>
                                    <c:out value='${reglasCalculoNominaDTO.ruta}'/><c:if test="${reglasCalculoNominaDTO.directoryName ne null}">/<c:out value='${reglasCalculoNominaDTO.directoryName}'/></c:if><c:if test="${file.name ne null}">/<c:out value='${file.name}'/></c:if>
                                </c:otherwise>
                            </c:choose>
                    </display:column>
                    <display:column property="size"
                                    titleKey="sireh.label.nomina.calculo.reglas.header.filesize"
                                    style="text-align: center;" 
                                    sortable="true"/>
                    <display:column property="lastModified"
                                    titleKey="sireh.label.nomina.calculo.reglas.header.lastmodified"
                                    style="text-align: center;" 
                                    sortable="true"/>
                                    
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="paging.banner.full" value=""/>
                    <display:setProperty name="paging.banner.one_item_found" value=""/>
                    <display:setProperty name="paging.banner.some_items_found" value=""/>
                    <display:setProperty name="paging.banner.all_items_found" value=""/>
                    <display:setProperty name="paging.banner.first" value=""/>
                    <display:setProperty name="paging.banner.last" value=""/>
                    <display:setProperty name="paging.banner.onepage" value=""/>
                </display:table>
            </td>
        </tr>
        <c:if test="${reglasCalculoNominaDTO.showUpload}">
            <tr>
                <td align="center" style="padding-bottom: 4px;" colspan="3">
                    <fsn:submit value="submit.back" action="reglasNomina/mantenimientoReglasCalculo"/>
                </td>
            </tr>
        </c:if>
    </table>
    
    <c:if test="${reglasCalculoNominaDTO.muestraErrores}">
        <h1>Errores</h1>
        <table width="100%" align="center" border="0">
            <tr>
                <td align="left" style="padding-bottom: 4px;" colspan="3">
                    <c:out value="${reglasCalculoNominaDTO.logErrores}" escapeXml="false"/>
                </td>
            </tr>
        </table>
    </c:if>
    
    <script type="text/javascript">
        $('.pagelinks').hide();
    </script>
    
</html:form>