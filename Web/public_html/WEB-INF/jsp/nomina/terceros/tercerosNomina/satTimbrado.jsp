<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="txtFileName"/>
    <html:hidden path="hpConcecNominaHidden"/>
    
    <h1> <strong> <spring:message code="sireh.label.nomina.terceros.sattimbrado.header"/> </strong> </h1> 
    <p>&nbsp;</p>
    
    <table width="100%"  align="center" border="0">
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.2em'/>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo3"/></strong>
                    </legend>
                    <table width="100%" align="center" border="0">
                        <tr><td></td></tr>
                        <tr><!--
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.version"/></td>
                            <td align="left">
                                <html:select path="version" cssStyle="width: 50px;">
                                    <html:option value="33">3.3</html:option>
                                    <html:option value="32">3.2</html:option>
                                </html:select>
                            </td> -->
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tnNominaQuincena" 
                                                path="hpQnaPago"
                                                style="width: 200px;"/>
                            </td>      
                            <td></td>
                        </tr>
                    </table>
                    <table width="100%">
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.search" 
                                            path="muestraRegistros" 
                                            action="tercerosNomina/${generaArchivosTercerosDTO.urlOrigen}"/>
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="tercerosNomina/${generaArchivosTercerosDTO.urlOrigen}"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
            <td></td>
        </tr>
        <tr>
            <td>
                <c:choose>
                    <c:when test="${generaArchivosTercerosDTO.muestraRegistros}">
                        <fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition="=" path="hpQnaPago"/>
            
                        <fsn:pagedList beanName="${generaArchivosTercerosDTO.beanName}"
                                       checkbox="true"
                                       chkProperty="idGrupo" 
                                       baseUrl="${generaArchivosTercerosDTO.urlOrigen}" 
                                       appendFilters="false"
                                       maxRows="200">
                            <div id="displayTagDiv">
                                <display:table name="${generaArchivosTercerosDTO.beanName}"
                                               class="displaytag" 
                                               pagesize="20" 
                                               decorator="checkboxTableDecorator"
                                               export="true"
                                               id="row" 
                                               requestURI="${requestURI}" 
                                               sort="list">
                                    <%--display:column titleKey="sireh.label.nomina.creaArchivoTerceros.selecciona"
                                                    style="text-align: center">
                                        <html:radiobutton path="hpConsecNomina" value="${row.idQna}" />
                                    </display:column--%>
                                    <%--display:column titleKey="sireh.label.nomina.creaArchivoTerceros.quincenaPago" 
                                                    property="qnaCaptura" 
                                                    sortable="false"/--%>
                                    <display:column titleKey="sireh.label.nomina.gestion.label.status" 
                                                    property="descEstadoNom" 
                                                    sortable="true"/>
                                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.tipoNomina" 
                                                    property="tipoNomina" 
                                                    sortable="true"/>
                                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.consecutivoNomina"
                                                    sortable="true"
                                                    style="text-align: left;">
                                        <c:choose>
                                            <c:when test="${(row.estadoNomina == 'C' || row.estadoNomina == 'S') && row.nomArchAnexo20 == 'F'}">
                                                <a href="generarXml.do?idQna=<c:out value='${row.idQna}'/>&beanName=<c:out value='${generaArchivosTercerosDTO.beanName}'/>&hpQnaPago=<c:out value='${generaArchivosTercerosDTO.hpQnaPago}'/>&version=<c:out value='${generaArchivosTercerosDTO.version}'/>">
                                                    <c:out value="${row.idQna}"/>
                                                </a>
                                            </c:when>
                                            <c:otherwise>
                                                <c:out value="${row.idQna}"/>
                                            </c:otherwise>
                                        </c:choose>
                                    </display:column>
                                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.titulo.anexo20"
                                                    property="estadoAnexo20"
                                                    sortable="false"
                                                    style="text-align: left;"/>
                                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.complemento" 
                                                    property="numComplem" 
                                                    sortable="true"/> 
                                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.grupoPago" 
                                                    property="grupoPago" 
                                                    sortable="true"/>            
         
                                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                                    <display:setProperty name="export.pdf" value="true"/>
                                    <display:setProperty name="basic.msg.empty_list">
                                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                    </display:setProperty>
                                </display:table>
                            </div>
                        </fsn:pagedList>
                        <%--table width="100%">
                            <tr align="center">
                                <td>
                                    <fsn:submit value="submit.generate" path="generar"
                                                action="tercerosNomina/processSatTimbradoV2.do" 
                                                progressBar="true"/> &nbsp; 
                                                
                                    <c:if test="${generaArchivosTercerosDTO.txtFileName ne null and generaArchivosTercerosDTO.txtFileName ne ''}">
                                        <fsn:submit value="submit.download"
                                                    action="tercerosNomina/downloadTxtFileSatTimbrado.do"
                                                    progressIcon="false"/>&nbsp;
                                    </c:if>
                                    
                                    <fsn:submit value="submit.generate.anexo20" path="generarXml"
                                                action="tercerosNomina/generarFilesXMLAnexo20V33.do" 
                                                progressBar="true"/> &nbsp; 
                                    
                                    <h1> <c:out value="${generaArchivosTercerosDTO.leyenda}"/>  </h1>
                                </td>
                            </tr>
                        </table--%>
                    </c:when>
                    <c:otherwise>
                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>
