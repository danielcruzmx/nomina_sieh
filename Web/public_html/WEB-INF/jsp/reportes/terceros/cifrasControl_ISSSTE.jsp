<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<spring:message code="sireh.label.reportes.en.qna" var="enQna"/>
<spring:message code="sireh.label.reportes.no.qna" var="noQna"/>

<spring:message code="sireh.label.reportes.tipo.entero" var="tEntero"/>
<spring:message code="sireh.label.reportes.tipo.cancelado" var="tCancelado"/>
<spring:message code="sireh.label.reportes.tipo.devoluciones" var="tDevoluciones"/>

<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <h1> 
                    <strong> 
                        <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45; 
                        <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45;
                        <spring:message code="sireh.label.terceros.reportes.cifrasControlI.detalle.titulo.link"/>
                    </strong> 
                </h1> 
                <p>&nbsp;</p>
            </td>   
        </tr>
        <tr> <td> </td> </tr>
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.1em' >
                        <strong><spring:message code="sireh.label.nomina.calculo.fin.contrato"/></strong>
                    </legend>
                    <table width="100%" align="center" border="0">
                        <tr> <td>  </td> </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/> <fsn:selectList beanName="listaQuincenasAnteriores"  path="hpQnaPago" progress="true"  style="width: 100px;"/>
                            </td>      
                            <td>  </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.tipoQna"></spring:message></td>
                            <td align="left">
                                <html:select path="tipoQna" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="${enQna}"/>
                                    <html:option value="1" label="${noQna}"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.tipoTercero"></spring:message></td>
                            <td align="left">
                                <html:select path="tipoEntero" cssClass="uppercase">    
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="e" label="${tEntero}"/>
                                    <html:option value="c" label="${tCancelado}"/>
                                    <html:option value="d" label="${tDevoluciones}"/>
                                </html:select>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
            <td>  </td>
        </tr>
        <tr><td>
    
    <c:choose>
            <c:when test="${generaArchivosTercerosDTO.muestraRegistros}">
            <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.search" path="muestraRegistros" action="reporteTercerosNomina/cifrasDeControlReporte.do"/>
                        <fsn:submit value="submit.clean" path="cancel" action="reporteTercerosNomina/cifrasDeControlI.do"/>
                    </td>
                </tr>
            
            </table>
            

            <fsn:filter property="h.hp_qna_pago" condition="=" path="hpQnaPago"/>
            <fsn:filter property="c.cpc_qna_aplica" condition="=" path="hpQnaPago"/>

            <c:if test="${generaArchivosTercerosDTO.tipoQna eq '0'}">
                <fsn:filter property="hp_ini_pago" condition="=" path="hpIniPago"/>    
            </c:if>
            <c:if test="${generaArchivosTercerosDTO.tipoQna eq '1'}">
                <fsn:filter property="hp_ini_pago" condition="<>" path="hpIniPago"/>
            </c:if>
            
            <c:set var="clave" value="" />
            <fsn:pagedList beanName="${generaArchivosTercerosDTO.beanlista}"
                                   baseUrl="reporteTercerosNomina/cifrasDeControlReporteVer.do" 
                                   checkbox="true" 
                                   chkProperty="seleccionConsecNomina" 
                                   appendFilters="false">
                        <display:table name="${generaArchivosTercerosDTO.beanlista}"
                                       form="checkBoxTest"
                                       class="displaytag" 
                                       pagesize="100" 
                                       export="true"
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list"
                                       decorator="checkboxTableDecorator">
                           <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.selecciona"
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
                                <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                            </display:setProperty>
                        </display:table>
                    </fsn:pagedList>

                <table width="100%">
                    <tr align="center">
                        <td>
                            <fsn:submit value="submit.generate" path="generaArchivo" action="reporteTercerosNomina/cifrasDeControlReporteVer.do" progressIcon="false" />
                        </td>
                    </tr>
                </table>
                
            </c:when>
            
           
        <c:otherwise>
            <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.search" action="reporteTercerosNomina/cifrasDeControlReporte.do"/>
                        <fsn:submit value="submit.clean" path="cancel" action="reporteTercerosNomina/cifrasDeControlI.do"/>
                    </td>
                </tr>
            </table>
        </c:otherwise>
    </c:choose>
     </td> </tr>
     <tr><td>
        <c:if test="${generaArchivosTercerosDTO.generaArchivo}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                       
                       <fsn:reportParam name="PAR_QNA" value="${generaArchivosTercerosDTO.hpQnaPago}"/>
                       <fsn:reportParam name="PAR_COMPLEMENTO" value="${generaArchivosTercerosDTO.hpConsecNomina}"/>
                       <fsn:reportParam name="PAR_FECHA" value="${generaArchivosTercerosDTO.hpIniPago}"/>
                       <fsn:reportParam name="PAR_TIPO_REPORTE" value="${generaArchivosTercerosDTO.descTercero}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/terceros/cifrasControl_ISSSTE" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="cifrasControlISSSTE" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
     </td></tr>
    </table>
</html:form>
