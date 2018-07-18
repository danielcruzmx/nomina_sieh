<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form modelAttribute="fonacFstseSindiDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <%-- Titulo --%> 
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.consulta.generica.Consulta"/>
    <c:out value="${fonacFstseSindiDTO.seccion}"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="50%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <%-- Filtros --%> 
                         <tr align="left">
                             <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.ciclo"/></td>
                              <td align="left">
                                 <fsn:option key="" value="selectList.nonValue"/>
                                 <fsn:selectList beanName="fonacFstseSindic" 
                                                 path="cxlcCiclo"
                                                 style="width: 200px;"/>
                              </td>
                            </tr>
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.cxlcQnaPago"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcQnaPagoBusqueda" 
                                                    path="cxlcQnaPago"
                                                    progress="true"
                                                    parentPath="cxlcCiclo"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <%-- Botones --%> 
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="clcConsultas/${fonacFstseSindiDTO.urlOrigen}"                           
                            progressBar="true"/> &nbsp; <%--aqui poner el metodo del controller --%>
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="clcConsultas/${fonacFstseSindiDTO.urlOrigen}"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${fonacFstseSindiDTO.muestraRegistros}">
            <fsn:filter property="c0.CXLC_CICLO" condition="=" path="cxlcCiclo"/>
            <fsn:filter property="c0.CXLC_QNA_PAGO" condition="=" path="cxlcQnaPago"/>
            <fsn:filter property="p0.CPC_QNA_APLICA" condition="=" path="cxlcQnaPago"/>
            
            <fsn:filter property="c2.CXLC_CICLO" condition="=" path="cxlcCiclo"/>
            <fsn:filter property="c2.CXLC_QNA_PAGO" condition="=" path="cxlcQnaPago"/>
            <fsn:filter property="p2.CPC_QNA_APLICA" condition="=" path="cxlcQnaPago"/>
            
            <fsn:filter property="c3.CXLC_CICLO" condition="=" path="cxlcCiclo"/>
            <fsn:filter property="c3.CXLC_QNA_PAGO" condition="=" path="cxlcQnaPago"/>
            <fsn:filter property="p3.CPC_QNA_APLICA" condition="=" path="cxlcQnaPago"/>
            
            <%-- Grid --%> 
            <fsn:pagedList beanName="${fonacFstseSindiDTO.beanName}" 
                           baseUrl="${fonacFstseSindiDTO.urlOrigen}" 
                           appendFilters="false">
                <div id="displayTagDiv" style="width: 1025px; overflow: auto;">
                    <display:table name="${fonacFstseSindiDTO.beanName}" 
                                   class="displaytag" 
                                   pagesize="50"
                                   export="true"
                                   id="row" 
                                   requestURI="${requestURI}" 
                                   sort="list">
                        <%-- Columnas --%>
                        <display:column titleKey="sireh.label.clc.consulta.generica.cxlcQnaPago" 
                                        property="cxlcQnaPago" 
                                        sortable="true" style="text-align: center"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.descrip" 
                                        property="titulo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.idNomina" 
                                        property="nomina" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.complem" 
                                        property="complemento" 
                                        sortable="true" style="text-align: center"/>
			<display:column titleKey="sireh.label.clc.consulta.generica.cpto" 
                                        property="cptopago" 
                                        sortable="true" style="text-align: center"/>
			<display:column titleKey="sireh.label.clc.consulta.generica.tipo" 
                                        property="grupopago" 
                                        sortable="true" style="text-align: center"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.importe" 
                                        property="monto" 
                                        sortable="true"
                                        format="$ {0,number,#,##0.00}"
                                        style="text-align:right"/> 
			<display:column titleKey="sireh.label.clc.consulta.generica.filiacion" 
                                        property="rfc" 
                                        sortable="true" style="text-align: center"/>
			<display:column titleKey="sireh.label.clc.consulta.generica.qnaaplica" 
                                        property="qnaaplica" 
                                        sortable="true" style="text-align: center"/>
                        <%-- Paginador --%> 
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
    