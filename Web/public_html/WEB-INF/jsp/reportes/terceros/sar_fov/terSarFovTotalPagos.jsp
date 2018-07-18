<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>


<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">
    
    <h1><strong>
        <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45; 
        <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45;
        <spring:message code="sireh.label.terceros.reportes.terceros.sar-fov"/>&#45;
        <spring:message code="gestionsartotalp.gestion.sartotalp"/>
    </strong></h1>

    <table width="100%" align="center">
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.1em'>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo5"/></strong>
                    </legend>
                    <table width="100%" align="center">
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcOrdinaria.errores.ciclo"></spring:message></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="cicloRegControl" path="ciclo" progress="false"/>
                            </td>
                            <td class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.bimestre"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="bimestresAnio" path="bimestre" progress="false"/>
                            </td>
                        </tr>
                    </table>
                        <table width="100%" align="center">
                            <tr><td colspan="3"><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
                            <tr>
                                <td align="right" width="45%">
                                    <fsn:submit value="submit.accept" action="reporteTercerosNomina/terSarFovTotalPagos.do"  progressIcon="false"/>
                                </td>
                                <td width="10%">&nbsp;</td>
                                <td align="left" width="45%">
                                    <fsn:submit value="submit.clean" path="cancel" action="reporteTercerosNomina/terSarFovTotalPagos.do"  progressIcon="false"/>
                                </td>
                            </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="100%" border="0">
        <tr><td>
            <c:if test="${generaArchivosTercerosDTO.muestraRegistros}">
                <fsn:filter property="h.hp_qna_pago" condition="=" path="qnaIni"/>
                <fsn:pagedList beanName="${generaArchivosTercerosDTO.beanName}"
                           baseUrl="reporteCalculo/incidenciasQ.do" 
                           checkbox="true" 
                           chkProperty="seleccionConsecNomina" 
                           appendFilters="false">
                <display:table name="${generaArchivosTercerosDTO.beanName}"
                               form="checkBoxTest"
                               class="displaytag" 
                               pagesize="10" 
                               export="true"
                               id="row" 
                               requestURI="${requestURI}" 
                               sort="list"
                               decorator="checkboxTableDecorator">
                   <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.selecciona.asteriso"
                                   style="text-align: center" 
                                   property="checkbox" 
                                   media="html"/>
                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.quincenaPago" 
                                    property="qnaPago" 
                                    sortable="false"/>
                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.tipoNomina" 
                                    property="tipoNomina" 
                                    sortable="false"/>             
                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.consecutivoNomina" 
                                    property="consecNomina" 
                                    sortable="false"/>
                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.complemento" 
                                    property="numComplem" 
                                    sortable="false"/> 
                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.grupoPago" 
                                    property="gpoPago" 
                                    sortable="false"/>
                                   
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="export.pdf" value="true"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                    </display:setProperty>
                </display:table>
            </fsn:pagedList>
                
                <table align="center" width="25%" border="0">
                    <tr><td align="center">
                        <fsn:submit value="submit.mostrarReporte" path="muestraReporte" action="reporteTercerosNomina/terSarFovTotalPagos.do" progressIcon="false" />
                    </td></tr>
                </table>
            </c:if>
        </td></tr>
    </table>
    
    <table align="center" width="100%" border="0">
        <tr><td>
            <c:if test="${generaArchivosTercerosDTO.muestraReporte}">
                <fsn:reportParam name="P_NOMINAS" value="${generaArchivosTercerosDTO.hpConsecNomina}"/>
                <fsn:report provider="jasper" 
                            viewUri="/terceros/sarFovissteCifras" 
                            imagesUri="/images/reports" 
                            format="pdf" 
                            fileName="sarFovissteCifras"
                            export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                            width="1060" 
                            height="350"/>
            </c:if>
        </td></tr>
    </table>

</html:form>
