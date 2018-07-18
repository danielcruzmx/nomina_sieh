<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




                <div id="dataTable" align="center" style="width: 1000px; overflow: auto;">
                    <fsn:filter property="h.hp_qna_pago" condition="=" path="hpQnaPago"/>
                    <fsn:filter property="c.cpc_qna_aplica" condition="=" path="hpQnaPago"/>
                    <c:if test="${generaArchivosTercerosDTO.tipoQna eq '0'}">
                        <fsn:filter property="hp_ini_pago" condition="=" path="hpIniPago"/>    
                    </c:if>
                    <c:if test="${generaArchivosTercerosDTO.tipoQna eq '1'}">
                        <fsn:filter property="hp_ini_pago" condition="<>" path="hpIniPago"/>
                    </c:if>
                    <fsn:pagedList beanName="${generaArchivosTercerosDTO.beanlista}"
                                   baseUrl="tercerosNomina/generaTerceroPrestIssste.do" 
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
                                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                            </display:setProperty>
                        </display:table>
                    </fsn:pagedList>
                </div>
