<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form name="checkBoxTest" modelAttribute="consultaPlazaDTO">

    <html:hidden path="beanName"/>
    <html:hidden path="beanNameSituacion"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.eventual.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/>
    <c:out value="${consultaPlazaDTO.seccion}"/> -
    <spring:message code="sireh.label.plaza.consulta.liberaPlaza.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="80%">
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.consulta.liberaPlaza.idPlaza"></spring:message></td>
                            <td><fsn:input path="idPlaza" maxlength="6" size="20"/></td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.consulta.liberaPlaza.idSituacionPlaza"></spring:message></td>
                            <td>
                                <c:choose>
                                    <c:when test="${consultaPlazaDTO.prorrogaContratoEventual}">
                                        <c:out value="Ocupada"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:option key="" value="selectList.nonValue"/>
                                        <fsn:selectList beanName="${consultaPlazaDTO.beanNameSituacion}" 
                                                        path="idSituacionPlaza"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.consulta.liberaPlaza.idPuestoPre"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcPuestoBusqueda" 
                                                path="idPuestoPre"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.consulta.liberaPlaza.idUnidadPre"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="${consultaPlazaDTO.beanNameUnidad}" 
                                                path="idUnidadPre"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table width="100%">
        <tr align="center">
            <td>
                <c:if test="${consultaPlazaDTO.depura && consultaPlazaDTO.muestraRegistros}">
                <fsn:submit value="submit.delete" 
                            path="depura" 
                            action="plazaEventual/${consultaPlazaDTO.urlOrigenDepura}" 
                            alertCode="confirm.multiple.delete"/>&nbsp;
                </c:if>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="plazaEventual/${consultaPlazaDTO.urlOrigen}"/>&nbsp;
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="plazaEventual/${consultaPlazaDTO.urlOrigen}"/>
            </td>
        </tr>
    </table>
    <c:choose>
        <c:when test="${consultaPlazaDTO.muestraRegistros}">
            <fsn:filter property="P.ID_PLAZA" condition="=" path="idPlaza"/>
            <fsn:filter property="P.ID_SIT_PLAZA" condition="=" path="idSituacionPlaza"/>
            <!--fsn:filter property="P.ID_PUESTO_PRE" condition="=" path="idPuestoPre"-->
             <fsn:filter property="TRIM(AP.ID_ATRIBUTO_PUESTO)" condition="=" path="idPuestoPre"/>
            <fsn:filter property="P.ID_UNIDAD_PRE" condition="=" path="idUnidadPre"/>
    
            <fsn:pagedList beanName="${consultaPlazaDTO.beanName}" 
                           checkbox="true" 
                           chkProperty="idPlazas" 
                           baseUrl="${consultaPlazaDTO.urlOrigen}" 
                           appendFilters="false">
                <display:table name="${consultaPlazaDTO.beanName}" 
                               class="displaytag" 
                               pagesize="10" 
                               decorator="checkboxTableDecorator" 
                               export="true" 
                               id="row" 
                               requestURI="${requestURI}" 
                               sort="list">
                    
                    <c:choose>
                        <c:when test="${consultaPlazaDTO.depura}">
                            <display:column titleKey="sireh.label.plaza.consulta.liberaPlaza.idPlazas" 
                                            style="text-align: center" 
                                            property="checkbox" 
                                            media="html"/>
                            <display:column titleKey="sireh.label.plaza.consulta.liberaPlaza.idPlaza" 
                                            property="idPlaza" 
                                            sortable="true"/>
                        </c:when>
                        <c:otherwise>
                            <display:column titleKey="sireh.label.plaza.consulta.liberaPlaza.idPlaza" 
                                            property="idPlaza" 
                                            href="${consultaPlazaDTO.urlDestino}.do" 
                                            paramId="idPlaza" 
                                            sortable="true"/>
                        </c:otherwise>
                    </c:choose>
                    <display:column titleKey="sireh.label.plaza.consulta.liberaPlaza.idSituacionPlaza" 
                                    property="descSitPlaza" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.consulta.liberaPlaza.idPuestoPre" 
                                    property="idPuestoPre" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.consulta.liberaPlaza.idUnidadPre" 
                                    property="idUnidadPre" 
                                    sortable="true"/>
                    
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="export.pdf" value="true"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                    </display:setProperty>
                 </display:table>
            </fsn:pagedList>
        </c:when>
        <c:otherwise>
            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j("#idPlaza").keypress(function(event) {
            if (event.which == 13) {
                doSubmit(10001);
            }
        });
    </script>
</html:form>