<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="borraClcDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.titulo.link"/> - 
    <spring:message code="sireh.label.clc.herramientas.borraClc.titulo"/></h1>
    <p>&nbsp;</p>

    <table align="center" width="40%">
        <tr valign="top">
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.clc.herramientas.borraClc.busqueda"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.borraClc.anio"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcCicloBusquedaBorraClc" 
                                                path="cicloUnidad" 
                                                progress="true"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.borraClc.quincenaPago"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcQnaPagoBusquedaBorraClc" 
                                                path="qnaPago" 
                                                progress="true"
                                                parentPath="cicloUnidad"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.borraClc.tipoNomina"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcTipoNominaBusquedaBorraClc" 
                                                path="tipoNomina" 
                                                progress="true"
                                                parentPath="qnaPago"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.borraClc.complemento"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcComplementoBusquedaBorraClc" 
                                                path="numComplem"
                                                progress="true"
                                                parentPath="tipoNomina"
                                                filterPaths="qnaPago"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.borraClc.situacion"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcSituacionBusquedaBorraClc" 
                                                path="situacion"
                                                progress="true"
                                                parentPath="numComplem"
                                                filterPaths="tipoNomina,qnaPago"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td>
                <c:if test="${borraClcDTO.muestraRegistros}">
                    <fsn:submit value="submit.delete" 
                                path="borrarCLC" 
                                action="clcHerramientas/executeProcedureBorraClc" 
                                alertCode="confirm.clc.herramientas.borraCLC"
                                progressBar="true"/> &nbsp; 
                </c:if>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="clcHerramientas/${borraClcDTO.urlOrigen}"
                            progressBar="true"/> &nbsp; 
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="clcHerramientas/${borraClcDTO.urlOrigen}"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${borraClcDTO.muestraRegistros}">
            <fsn:filter property="C.CXLC_CICLO" condition="=" path="cicloUnidad" />
            <fsn:filter property="C.CXLC_QNA_PAGO" condition="=" path="qnaPago" />
            <fsn:filter property="C.CXLC_COMPLEMENTO" condition="=" path="numComplem" />
            <fsn:filter property="C.CXLC_SITUACION" condition="=" path="situacion" />
            <fsn:filter property="C.NOMINA_ORIGEN" condition="=" path="tipoNomina" />
            <fsn:filter property="D.ID_TIPO_NOMINA" condition="=" path="tipoNomina" />
            
            
            <fsn:filter property="C1.CXLC_CICLO" condition="=" path="cicloUnidad" />
            <fsn:filter property="C1.CXLC_QNA_PAGO" condition="=" path="qnaPago" />
            <fsn:filter property="C1.CXLC_COMPLEMENTO" condition="=" path="numComplem" />
            <fsn:filter property="C1.CXLC_SITUACION" condition="=" path="situacion" />
            <fsn:filter property="C1.ID_TIPO_NOMINA" condition="=" path="tipoNomina" />
            
            <fsn:pagedList beanName="${borraClcDTO.beanName}" 
                           checkbox="true" 
                           baseUrl="${borraClcDTO.urlOrigen}" 
                           appendFilters="false">
                <div id="displayTagDiv">
                    <display:table name="${borraClcDTO.beanName}" 
                                   class="displaytag" 
                                   pagesize="200" 
                                   decorator="checkboxTableDecorator" 
                                   export="true" 
                                   id="row" 
                                   requestURI="${requestURI}" 
                                   sort="list">
                        <display:column titleKey="sireh.label.clc.herramientas.borraClc.consulta.cxlc" 
                                        property="cxlc"
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.borraClc.consulta.cxlcCiclo" 
                                        property="cxlcCiclo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.borraClc.consulta.cxlcQnaPago" 
                                        property="cxlcQnaPago" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.borraClc.consulta.idTipoNomina" 
                                        property="idTipoNomina" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.borraClc.consulta.cxlcComplemento" 
                                        property="cxlcComplemento" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.borraClc.consulta.cxlcSituacion" 
                                        property="cxlcSituacion" 
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