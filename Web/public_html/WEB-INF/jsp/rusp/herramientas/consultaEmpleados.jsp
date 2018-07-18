<%--@Descripcion: Vista encargada de consultar empleados para el modulo RUSP.--%>
<%--@Autor: Oscar S.--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInputSmall {
        width: 100px;
    }
    .anchoInput {
        width: 200px;
    }
    a.cancelado:link {
        background-color: transparent;
        color: red;
        text-decoration: none;
    }
</style>

<html:form name="checkBoxTest" modelAttribute="consultaEmpleadoRuspDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <html:hidden path="linkDestino"/>
    <html:hidden path="paramIdDestino"/>
    <html:hidden path="propertyDestino"/>
    <html:hidden path="interior"/>
    
    <h1><spring:message code="sireh.label.rusp.herramientas.general.consultaEmpleadoRusp.title" arguments="${consultaEmpleadoRuspDTO.interior}"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.rusp.herramientas.consultaEmpleadoRusp.filtro.idPlaza"></spring:message></td>
                            <td>
                                <fsn:input path="idPlaza" 
                                           maxlength="6" 
                                           size="20"
                                           css="anchoInputSmall"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.rusp.herramientas.consultaEmpleadoRusp.filtro.rfcEmpleado"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:input path="rfcEmpleado"
                                           uppercase="true" 
                                           maxlength="13"
                                           size="60" 
                                           css="anchoInput"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.rusp.herramientas.consultaEmpleadoRusp.filtro.nombreEmpleado"></spring:message></td>
                            <td align="left">
                                <fsn:input path="nombreEmpleado"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.rusp.herramientas.consultaEmpleadoRusp.filtro.primerApellido"></spring:message></td>
                            <td align="left">
                                <fsn:input path="primerApellido"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.rusp.herramientas.consultaEmpleadoRusp.filtro.segundoApellido"></spring:message></td>
                            <td align="left">
                                <fsn:input path="segundoApellido"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                        </tr>
                        <tr align="center">
                            <td colspan="2">
                                <table width="90%" border="0" align="center">
                                    <tr>
                                        <td align="center">
                                            <fsn:submit value="submit.search" 
                                                        path="muestraRegistros" 
                                                        action="herramientasRusp/${consultaEmpleadoRuspDTO.urlOrigen}"
                                                        progressBar="true"/>&nbsp;
                                            <fsn:submit value="submit.clean" 
                                                        path="cancel" 
                                                        action="herramientasRusp/${consultaEmpleadoRuspDTO.urlOrigen}"
                                                        progressBar="true"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td>&nbsp;</td>
        </tr>
    </table>
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <c:choose>
                    <c:when test="${consultaEmpleadoRuspDTO.muestraRegistros}">
                        
                        <fsn:filter property="P.ID_PLAZA" condition="=" path="idPlaza" />
                        <fsn:filter property="P.PLAZA_RFC" condition="contains" path="rfcEmpleado" />
                        <fsn:filter property="E.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                        <fsn:filter property="E.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                        <fsn:filter property="E.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            
                        <fsn:pagedList beanName="${consultaEmpleadoRuspDTO.beanName}" 
                                       checkbox="true" 
                                       chkProperty="idPlazas" 
                                       baseUrl="${consultaEmpleadoRuspDTO.urlOrigen}" 
                                       appendFilters="false">
                            <div id="displayTagDiv" style="width:1000px; min-height:200px;overflow:auto;text-align:center;"> 
                                <display:table name="${consultaEmpleadoRuspDTO.beanName}" 
                                               class="displaytag" 
                                               pagesize="20" 
                                               decorator="checkboxTableDecorator" 
                                               export="true" 
                                               id="row" 
                                               requestURI="${requestURI}" 
                                               sort="list">
                                    <display:column titleKey="sireh.label.rusp.herramientas.grid.consultaEmpleadoRusp.idPlaza" 
                                                    property="idPlaza" 
                                                    href="${consultaEmpleadoRuspDTO.urlDestino}.do" 
                                                    paramId="idPlaza" 
                                                    sortable="true"
                                                    style="text-align: right;"/>
                                    <display:column titleKey="sireh.label.rusp.herramientas.grid.consultaEmpleadoRusp.plazaRfc" 
                                                    property="plazaRfc" 
                                                    sortable="true"
                                                    style="text-align: left;"/>
                                    <display:column titleKey="sireh.label.rusp.herramientas.grid.consultaEmpleadoRusp.nombreEmpleado" 
                                                    property="nombreEmpleado" 
                                                    sortable="true"
                                                    style="text-align: left;"/>
                                    <display:column titleKey="sireh.label.rusp.herramientas.grid.consultaEmpleadoRusp.primerApellido" 
                                                    property="primerApellido" 
                                                    sortable="true"
                                                    style="text-align: left;"/>
                                    <display:column titleKey="sireh.label.rusp.herramientas.grid.consultaEmpleadoRusp.segundoApellido" 
                                                    property="segundoApellido" 
                                                    sortable="true"
                                                    style="text-align: left;"/>                                    
                                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                                    <display:setProperty name="export.pdf" value="true"/>
                                    <display:setProperty name="basic.msg.empty_list">
                                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                    </display:setProperty>
                                </display:table>
                            </div>
                        </fsn:pagedList>
                    </c:when>
                    <c:otherwise>
                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){
            $j('#idPlaza').mask('999999');
            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
        });
        
        // PagedList asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>