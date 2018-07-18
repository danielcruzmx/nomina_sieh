<%--@Descripcion: Vista encargada de mostrar el listado de nóminas para su posterior carga de archivos del sat.--%>
<%--@Autor: Oscar S.--%>

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

<html:form id="formQna" modelAttribute="consultaNominaDTO">

    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.nomina.terceros.satListadoNominas.header"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="90%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.nomina.gestion.label.numQuincena"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tnNominaQuincena" 
                                                path="quincena"
                                                style="width: 200px;"/>
                            </td>
                         </tr>
                         <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.tipoNomina"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaTiposNomina"
                                                path="tipoNomina"
                                                style="width: 200px;"/>
                            </td>
                         </tr>
                         <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.gpoPago"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaGruposPago"
                                                path="grupoPago"
                                                style="width: 200px;"/>
                            </td>
                         </tr>
                         <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.status"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaEstadosNomina"
                                                path="idEdoNom"
                                                style="width: 200px;"/>
                            </td>
                         </tr>
                    </table>
                    <table width="100%">
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.search" 
                                            path="muestraRegistros"
                                            action="tercerosNomina/${consultaNominaDTO.urlOrigen}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="tercerosNomina/${consultaNominaDTO.urlOrigen}"
                                            progressBar="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition="=" path="quincena" />
    <fsn:filter property="TN_NOMINA.ID_TIPO_NOMINA" condition="=" path="tipoNomina" />
    <fsn:filter property="TN_NOMINA.ID_GRUPO_PAGO_NOM" condition="=" path="grupoPago" />
    <fsn:filter property="TN_NOMINA.ID_EDO_NOM" condition="=" path="idEdoNom" />
    
    <fsn:pagedList beanName="${consultaNominaDTO.beanName}" 
                   checkbox="true"
                   chkProperty="idGrupo" 
                   baseUrl="${consultaNominaDTO.urlOrigen}" 
                   maxRows="200"
                   appendFilters="false">
        <div id="displayTagDiv">        
            <display:table name="${consultaNominaDTO.beanName}" 
                           class="displaytag" 
                           pagesize="15"
                           decorator="checkboxTableDecorator"
                           export="true" 
                           id="row" 
                           requestURI="${requestURI}"
                           sort="list">
                
                <display:column style="text-align: center;" 
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.idQna"
                                sortable="true">
                    <%--<c:if test="${row.estadoNomina == 'C'}">
                        <c:out value="${row.idQna}"/>
                    </c:if>
                    <c:if test="${row.estadoNomina != 'C'}">
                        <a href="satModificacionNomina.do?idQna=<c:out value='${row.idQna}'/>"><c:out value="${row.idQna}"/></a>
                    </c:if>--%>
                    <a href="cargarArchivosPdf.do?idQna=<c:out value='${row.idQna}'/>"><c:out value="${row.idQna}"/></a>
                </display:column>
                <display:column property="qnaCaptura" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.qnaCaptura"
                                sortable="true"/>
                <display:column property="numComplem" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.numComplem"
                                sortable="true"/>
                <display:column property="descripcion" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.desc"
                                sortable="true"/>
                <display:column property="tipoNomina" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.tipoNomina"
                                sortable="true"/>
                <display:column property="grupoPago" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.grupoPago"
                                sortable="true"/>
                <display:column property="descEstadoNom" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.status"
                                sortable="true"/>
                <display:setProperty name="paging.banner.placement" value="bottom"/>
                <display:setProperty name="export.pdf" value="true"/>
                <display:setProperty name="basic.msg.empty_list">
                    <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                </display:setProperty>
            </display:table>
        </div>
    </fsn:pagedList>
    
    <table width="100%">
        <tr align="center">
            <td>
                <fsn:submit value="submit.add" action="gestionNomina/altaNomina"/>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>