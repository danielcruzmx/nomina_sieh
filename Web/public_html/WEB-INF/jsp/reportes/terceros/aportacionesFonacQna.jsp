<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">
    
    
    <h1><strong>
        <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45; 
        <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45;
        <spring:message code="sireh.label.terceros.reportes.terfonaportqna"/>
    </strong></h1>

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.1em'>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo6"/></strong>
                    </legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.quincenaPago"></spring:message></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaQuincenasAnteriores" path="qnaIni" progress="false"/>
                            </td>
                        </tr>
                    </table>
                        <table width="100%" align="center" border="0">
                            <tr>
                                <td align="right" width="45%">
                                    <fsn:submit value="submit.accept" action="reporteTercerosNomina/aportacionesFonacQna.do"  progressIcon="false"/>
                                </td>
                                <td width="10%">&nbsp;</td>
                                <td align="left" width="45%">
                                    <fsn:submit value="submit.clean" path="cancel" action="reporteTercerosNomina/aportacionesFonacQna.do"  progressIcon="false"/>
                                </td>
                            </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr><td colspan="3"><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
    </table><br>
    
    <table align="center" width="100%" border="0">
        <tr><td>
            <c:if test="${generaArchivosTercerosDTO.muestraRegistros}">
                <fsn:filter property="h.hp_qna_pago" condition="=" path="qnaIni"/>
                
                <fsn:pagedList beanName="${generaArchivosTercerosDTO.beanName}"
                            baseUrl="aportacionesFonacQna" 
                            checkbox="true" 
                            chkProperty="seleccionConsecNomina" 
                            maxRows="200"
                            appendFilters="false">
                           
                <display:table name="${generaArchivosTercerosDTO.beanName}"
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
                        <fsn:submit value="submit.mostrarReporte" path="muestraReporte" action="reporteTercerosNomina/aportacionesFonacQna.do" progressIcon="false" />
                    </td></tr>
                </table>
            </c:if>
        </td></tr>
    </table>
    
  <table align="center" width="100%" border="0">
        <tr><td>
            <c:if test="${generaArchivosTercerosDTO.muestraReporte}">
                <fsn:reportParam name="P_CONSEC" value="${generaArchivosTercerosDTO.hpConsecNomina}"/>
                <fsn:reportParam name="P_QNA_CANC" value="${generaArchivosTercerosDTO.qnaIni}"/>
                <fsn:report provider="jasper" 
                            viewUri="/terceros/fonacPorQna"
                            imagesUri="/images/reports" 
                            format="pdf" 
                            fileName="fonacPorQna"
                            export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                            width="1060" 
                            height="350"/>
            </c:if>
        </td></tr>
    </table>
    

</html:form>
