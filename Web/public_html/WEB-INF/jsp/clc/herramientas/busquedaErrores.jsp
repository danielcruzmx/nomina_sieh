<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="busquedaErroresDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.titulo.link"/> - 
    <spring:message code="sireh.label.clc.herramientas.busquedaErrores.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="40%">
        <tr valign="top">
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.clc.herramientas.busquedaErrores.busqueda"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busquedaErrores.anio"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcCicloBusquedaErrores" 
                                                path="cicloUnidad" 
                                                progress="true"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busquedaErrores.quincenaPago"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcQnaPagoBusquedaErrores" 
                                                path="qnaPago" 
                                                progress="true"
                                                parentPath="cicloUnidad"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busquedaErrores.tipoNomina"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcTipoNominaBusquedaErrores" 
                                                path="tipoNomina" 
                                                progress="true"
                                                parentPath="qnaPago"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busquedaErrores.complemento"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcComplementoBusquedaErrores" 
                                                path="numComplem"
                                                progress="true"
                                                parentPath="tipoNomina"
                                                filterPaths="qnaPago"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busquedaErrores.revisado"/></td>
                            <td width="200px" align="left">
                                <html:select path="revisado">
                                    <html:option value="" label="SELECCIONE..."/>
                                    <html:option value="0" label="NO REVISADO"/>
                                    <html:option value="1" label="REVISADO"/>
                                </html:select>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="clcHerramientas/${busquedaErroresDTO.urlOrigen}"
                            progressBar="true"/> &nbsp; 
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="clcHerramientas/${busquedaErroresDTO.urlOrigen}"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${busquedaErroresDTO.muestraRegistros}">
            <fsn:filter property="E.CE_CICLO" condition="=" path="cicloUnidad"/>
            <fsn:filter property="E.CE_QNA_PAGO" condition="=" path="qnaPago"/>
            <fsn:filter property="E.ID_TIPO_NOMINA" condition="=" path="tipoNomina"/>
            <fsn:filter property="E.CE_COMPLEMENTO" condition="=" path="numComplem"/>
            <fsn:filter property="E.CE_REVISADO" condition="=" path="revisado"/>
            
            <fsn:pagedList beanName="${busquedaErroresDTO.beanName}"
                           checkbox="true"
                           baseUrl="${busquedaErroresDTO.urlOrigen}" 
                           appendFilters="false">
                <div id="displayTagDiv">
                    <display:table name="${busquedaErroresDTO.beanName}" 
                                   class="displaytag"
                                   pagesize="10" 
                                   decorator="checkboxTableDecorator" 
                                   export="true" 
                                   id="row"
                                   requestURI="${requestURI}" 
                                   sort="list">
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.id" 
                                        property="ceSecuencia" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.ciclo" 
                                        property="ceCiclo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.quincenaPago" 
                                        property="ceQnaPago" 
                                        sortable="true"/>          
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.tipoNomina" 
                                        property="idTipoNomina" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.complemento" 
                                        property="ceComplemento" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.descError" 
                                        property="descError" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.folio" 
                                        property="idFolio" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.tipoConcepto" 
                                        property="idTipoCpto" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.conceptoPago" 
                                        property="idCptoPago" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.unidad" 
                                        property="idUnidadNom" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.estado" 
                                        property="idEdo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.monto" 
                                        property="ceMonto"
                                        sortable="true"
                                        format="$ {0,number,#,##0.00}"
                                        style="text-align:right"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.revisado" 
                                        property="revisado" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.usuario" 
                                        property="usuario" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.busquedaErrores.columna.fecha" 
                                        property="fecModifico" 
                                        sortable="true"/>
                                        
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
        </c:when>
        <c:otherwise>
            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>