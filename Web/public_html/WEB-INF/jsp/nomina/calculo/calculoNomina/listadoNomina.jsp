<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .pagelinks {
        display:none;
    }
</style>

<html:form id="formQna" modelAttribute="pagoDTO">

    <html:hidden path="idGrupoPago" />
    <html:hidden path="descGrupoPago" />
    <html:hidden path="idQna" />
    <html:hidden path="status" />
    <html:hidden path="viewName" />
    <html:hidden path="beanName"/>
    <html:hidden path="urlDestino"/>

    <c:choose>
        <c:when test="${pagoDTO.beanName eq 'listaNominasQnaIncentivo'}">
            <h1><spring:message code="sireh.label.nomina.calculo.ordinaria.incentivo.titulo" arguments="${pagoDTO.descGrupoPago}"/></h1>
        </c:when>
        <c:otherwise>
            <h1><spring:message code="sireh.label.nomina.calculo.ordinaria.titulo" arguments="${pagoDTO.descGrupoPago}"/></h1>
        </c:otherwise>
    </c:choose>
    <fsn:filter property="TN_NOMINA.ID_GRUPO_PAGO_NOM" condition="=" path="idGrupoPago" />
    <fsn:filter property="TN_NOMINA.ID_TIPO_NOMINA" condition="=" path="idTipoNomina" />
    <fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition=">=" path="quincenaProceso" />
    
    <fsn:pagedList beanName="${pagoDTO.beanName}"
                   checkbox="true"
                   baseUrl="${pagoDTO.viewName}"
                   appendFilters="false"
                   maxRows="200">
        <div id="displayTagDiv">             
            <display:table name="${pagoDTO.beanName}" 
                           defaultsort="2" 
                           defaultorder="descending"
                           class="displaytag" 
                           pagesize="10" 
                           decorator="checkboxTableDecorator"
                           export="false" 
                           id="qna" 
                           requestURI="${requestURI}" 
                           sort="list">
                <display:column titleKey="sireh.label.nomina.gestion.consulta.parametros.qnaCaptura" 
                                style="text-align: center;" 
                                sortable="true">
                    <a href="listaRFCsPorGrupoPago.do?idGrupoPago=<c:out value='${pagoDTO.idGrupoPago}'/>&idQna=<c:out value='${qna.idNomina}'/>&status=<c:out value='${qna.idEdoNom}'/>&idTipoNomina=<c:out value='${pagoDTO.idTipoNomina}'/>&nomFuenteDatos=<c:out value='${qna.nomFuenteDatos}'/>">
                        <c:out value="${qna.nomQnaCaptura}"/>
                    </a>
                </display:column>
                <display:column property="nomNumComplem"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.numComplem" 
                                style="text-align: center;" 
                                sortable="true"/>
                <display:column property="nomDescripcion"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.desc" 
                                style="text-align: center;" 
                                sortable="true" />
                <display:column property="nomDescTipoNomina"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.tipoNomina" 
                                style="text-align: center;" 
                                sortable="true" />
                <display:column property="nomDescGrupoPago"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.grupoPago" 
                                style="text-align: center;" 
                                sortable="true" />
                <display:column property="periodoPago"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.periodoPago" 
                                style="text-align: center;" 
                                sortable="true" />
                <display:column property="descEstadoNom"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.status" 
                                style="text-align: center;" 
                                sortable="true" />
                <display:setProperty name="paging.banner.placement" value="bottom"/>
                <display:setProperty name="export.pdf" value="false"/>
                <display:setProperty name="basic.msg.empty_list">
                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                </display:setProperty>
             </display:table>
         </div>
    </fsn:pagedList>
    
    <table width="100%">
        <tr align="center">
            <td><fsn:submit value="submit.update" action="calculoNomina/${pagoDTO.urlDestino}.do"/></td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>