<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form name="checkBoxTest" modelAttribute="consultaClcDTO" action="${consultaClcDTO.urlOrigen}.do">

    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.herramientas.titulo.link"/> - 
    <spring:message code="sireh.label.clc.consulta.titulo.link"/>
    <c:out value="${consultaClcDTO.seccion}"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="50%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.ciclo"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcCicloBusqueda" 
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
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.cxlcTipoNomina"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcTipoNominaBusqueda" 
                                                path="cxlcTipoNomina"
                                                progress="true"
                                                parentPath="cxlcQnaPago"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        
                        <c:if test="${consultaClcDTO.conciliaCLC}">
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.cxlcComplemento"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcComplementoBusqueda" 
                                                path="cxlcComplemento"
                                                progress="true"
                                                parentPath="cxlcTipoNomina"
                                                filterPaths="cxlcQnaPago"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.busqueda.conciliaSICOP"/></td>
                            <td align="left">
                                <html:select path="conciliaSICOP">
                                    <html:option value="0" label="SELECCIONE..."/>
                                    <option value="12">diciembre</option>
                                    <option value="11">noviembre</option>
                                    <option value="10">octubre</option>
                                    <option value="09">septiembre</option>
                                    <option value="08">agosto</option>
                                    <option value="07">julio</option>
                                    <option value="06">junio</option>
                                    <option value="05">mayo</option>
                                    <option value="04">abril</option>
                                    <option value="03">marzo</option>
                                    <option value="02">febrero</option>
                                    <option value="01">enero</option>
                                </html:select>
                            </td>
                        </tr>
                        </c:if>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td>
                <c:if test="${consultaClcDTO.conciliaCLC && consultaClcDTO.muestraRegistros}">
                    <fsn:submit value="submit.concilia" 
                            path="conciliaCLC"
                            action="clcHerramientas/conciliaCLC" 
                            alertCode="confirm.clc.herramientas.conciliaCLC"
                            progressBar="true"/> &nbsp;
                </c:if>
                <c:if test="${consultaClcDTO.registro && consultaClcDTO.muestraRegistros}">
                    <fsn:submit value="submit.verify" 
                                path="registro" 
                                action="clcHerramientas/${consultaClcDTO.urlOrigenRegistro}" 
                                alertCode="confirm.multiple.dependences"
                                progressBar="true"/> &nbsp; 
                </c:if>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="clcHerramientas/${consultaClcDTO.urlOrigen}"
                            progressBar="true"/> &nbsp; 
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="clcHerramientas/${consultaClcDTO.urlOrigen}"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${consultaClcDTO.muestraRegistros}">
            <fsn:filter property="C.CXLC_CICLO" condition="=" path="cxlcCiclo"/>
            <fsn:filter property="C.CXLC_QNA_PAGO" condition="=" path="cxlcQnaPago"/>
            <fsn:filter property="C.ID_TIPO_NOMINA" condition="=" path="cxlcTipoNomina"/>
            
            <c:if test="${consultaClcDTO.conciliaCLC}">
                <fsn:filter property="C.CXLC_COMPLEMENTO" condition="=" path="cxlcComplemento"/>
            </c:if>
            
            <fsn:pagedList beanName="${consultaClcDTO.beanName}" 
                           checkbox="true" 
                           chkProperty="cxlcGrupo" 
                           baseUrl="${consultaClcDTO.urlOrigen}" 
                           appendFilters="false">
                <div id="displayTagDiv">
                    <display:table name="${consultaClcDTO.beanName}" 
                                   form="checkBoxTest" 
                                   class="displaytag"
                                   requestURI="${requestURI}" 
                                   pagesize="10" 
                                   decorator="checkboxTableDecorator" 
                                   export="true" 
                                   id="row"
                                   sort="list">
                        <c:choose>
                            <c:when test="${consultaClcDTO.registraCompromiso || consultaClcDTO.registraSolicitudPago || consultaClcDTO.conciliaCLC}">
                                <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcGrupo" 
                                                style="text-align: center" 
                                                property="checkbox" 
                                                media="html"/>
                                <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlc" 
                                                property="cxlc" 
                                                sortable="true"/>
                            </c:when>
                            <c:otherwise>
                                <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlc" 
                                                property="cxlc" 
                                                href="${consultaClcDTO.urlDestino}.do" 
                                                paramId="cxlc"
                                                sortable="true"/>
                            </c:otherwise>
                        </c:choose>
                            
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcCiclo" 
                                        property="cxlcCiclo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcQnaPago" 
                                        property="cxlcQnaPago" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.idTipoNomina" 
                                        property="idTipoNomina" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcComplemento" 
                                        property="cxlcComplemento" 
                                        sortable="true"/>
                                        
                        <c:if test="${consultaClcDTO.registraCompromiso}">
                            <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcCompromiso" 
                                            property="cxlcCompromiso" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.secCompromiso" 
                                            property="secCompromiso" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcMonto" 
                                            property="cxlcMonto" 
                                            sortable="true"
                                            format="$ {0,number,#,##0.00}"
                                            style="text-align:right"/>
                        </c:if>
                        <c:if test="${consultaClcDTO.registraSolicitudPago || consultaClcDTO.conciliaCLC}">
                            <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcDevengado" 
                                            property="cxlcDevengado" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.secCompromiso" 
                                            property="secCompromiso" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcMonto" 
                                            property="cxlcMonto" 
                                            sortable="true"
                                            format="$ {0,number,#,##0.00}"
                                            style="text-align:right"/>
                        </c:if>
                                        
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
        /*function auto_submit(id) {
            var submit_button = document.getElementById(id);
            if (submit_button) {
                var auto_action = submit_button.getAttribute("action");
                
                hideMessageDiv();
                showLightbox(id);
                
                document.forms[0].action = auto_action;
                document.forms[0].submit();
                return true;
            }
            return false;
        }*/
    </script>
</html:form>