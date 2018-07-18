<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="repTercerosDTO">

    <h1><spring:message code="sireh.label.reportes.cxlc.header"></spring:message></h1>
    <p>&nbsp;</p>
    
    <table width="100%">
        <tr>
            <td>
                <c:set var="content0">
                <table>
                    <tr>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.ciclo"></spring:message></td>
                                    <td align="left">
                                        <fsn:option key="0" value="selectList.nonValue"/>
                                        <fsn:selectList beanName="sacaciclotdcxlc" 
                                                        path="ciclo"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td  align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.quincena"></spring:message></td>
                                    <td align="left">
                                        <fsn:option key="0" value="selectList.nonValue"/>
                                        <fsn:selectList beanName="sacaqnatdcxlc"  
                                                        path="qnaIni" 
                                                        progress="true"
                                                        parentPath="ciclo" />
                                    </td>
                                </tr>
                                <tr>
                                    <td  align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.complemento"></spring:message></td>
                                    <td align="left">
                                        <fsn:option key="-1" value="selectList.nonValue"/>
                                        <fsn:selectList beanName="sacacomplementotdcxlc"
                                                        path="complemento" 
                                                        progress="true" 
                                                        parentPath="ciclo"
                                                        filterPaths="qnaIni" />
                                    </td>
                                </tr>
                                <tr>
                                    <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.tipoNomina"></spring:message></td>
                                    <td align="left">
                                        <fsn:option key="0" value="selectList.nonValue"/>
                                        <fsn:selectList beanName="sacatipotncxlcdivide"
                                                        path="tiponom" 
                                                        progress="true"/>
                                    </td>
                                </tr>
                                <tr>
                                    <td  align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.clc"></spring:message></td>
                                    <td align="left"> 
                                        <fsn:option key="0" value="selectList.nonValue"/>
                                        <fsn:selectList beanName="sacaorigentdcxlc" 
                                                        path="origen" 
                                                        progress="true" 
                                                        parentPath="ciclo"
                                                        filterPaths="qnaIni,complemento,tiponom" />
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="left" height="20px" valign="middle"><b><spring:message code="sireh.form.required.fields"/></b></td>
                    </tr>
                    <tr>
                        <td align="right">
                            <fsn:submit value="submit.search" 
                                        path="buscar"
                                        action="reporteCxlc/repTerceros.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.clean" 
                                        path="limpiar" 
                                        action="reporteCxlc/repTerceros.do"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" height="20px">&nbsp;</td>
                    </tr>
                </table>

                <div id="displayTagDiv">
                    <c:choose>
                        <c:when test="${(repTercerosDTO.buscar) && (repTercerosDTO.ciclo!=0) && (repTercerosDTO.qnaIni!=0) && (repTercerosDTO.complemento!=null) && (repTercerosDTO.tiponom!=null)}">
                            <table>
                                <tr>
                                    <td>
                                        <b>Seleccione una opci&oacute;n:</b><br/>
                                        <a href="javascript:checkAll()">+ Seleccionar Todos</a><br/>
                                        <a href="javascript:uncheckAll()">- Ninguno</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td> 
                                        <fsn:filter property="ID_TIPO_NOMINA" condition="=" path="tiponom"/>                     
                                        <fsn:pagedList beanName="llenaquincenal" 
                                                       baseUrl="reporteCxlc/repTerceros.do" 
                                                       checkbox="true"
                                                       chkProperty="seleccionQuincenal" 
                                                       appendFilters="false">
                                        </fsn:pagedList>
                                        <div style="overflow: auto;height: 200px; width: 200px;">
                                            <display:table name="llenaquincenal" 
                                                           form="checkBoxTest" 
                                                           class="displaytag" 
                                                           pagesize="50"
                                                           export="false" 
                                                           id="row" 
                                                           requestURI="${requestURI}" 
                                                           sort="list" 
                                                           decorator="checkboxTableDecorator">
                                                <display:column titleKey="sireh.label.reportes.cxlc.vacio" 
                                                                style="text-align: center"
                                                                property="checkbox"
                                                                media="html"/>
                                                <display:column titleKey="sireh.label.reportes.cxlc.periodoq" 
                                                                property="idq" 
                                                                sortable="false"/>
                                                <display:setProperty name="paging.banner.placement" value="false"/>
                                                <display:setProperty name="export.pdf" value="true"/>
                                                <display:setProperty name="basic.msg.empty_list">
                                                    <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                                </display:setProperty>
                                            </display:table>
                                        </div>
                                    </td>
                                    <td>
                                        <fsn:filter property="ID_TIPO_NOMINA" condition="=" path="tiponom"/>                     
                                        <fsn:pagedList beanName="llenamensual" 
                                                       baseUrl="reporteCxlc/repTerceros.do" 
                                                       checkbox="true"
                                                       chkProperty="seleccionMensual" 
                                                       appendFilters="false">
                                        </fsn:pagedList>    
                                        <div style="overflow: auto;height: 200px; width: 200px;">
                                            <display:table name="llenamensual" 
                                                           form="checkBoxTest" 
                                                           class="displaytag" 
                                                           pagesize="50"
                                                           export="false" 
                                                           id="row2" 
                                                           requestURI="${requestURI}" 
                                                           sort="list" 
                                                           decorator="checkboxTableDecorator">
                                                <display:column titleKey="sireh.label.reportes.cxlc.vacio" 
                                                                style="text-align: center"
                                                                property="checkbox" 
                                                                media="html"/>
                                                <display:column titleKey="sireh.label.reportes.cxlc.periodom" 
                                                                property="idm" 
                                                                sortable="false"/>
                                                <display:setProperty name="paging.banner.placement" value="false"/>
                                                <display:setProperty name="export.pdf" value="true"/>
                                                <display:setProperty name="basic.msg.empty_list">
                                                    <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                                </display:setProperty>
                                            </display:table>
                                        </div>
                                    </td>
                                    <td>
                                        <fsn:filter property="ID_TIPO_NOMINA" condition="=" path="tiponom"/>                     
                                        <fsn:pagedList beanName="llenabimestral" 
                                                       baseUrl="reporteCxlc/repTerceros.do" 
                                                       checkbox="true"
                                                       chkProperty="seleccionBimestral" 
                                                       appendFilters="false">
                                        </fsn:pagedList>    
                                    <td>
                                        <div style="overflow: auto;height: 200px; width: 200px;">
                                            <display:table name="llenabimestral" 
                                                           form="checkBoxTest" 
                                                           class="displaytag" 
                                                           pagesize="5"
                                                           export="false" 
                                                           id="row3" 
                                                           requestURI="${requestURI}" 
                                                           sort="list" 
                                                           decorator="checkboxTableDecorator">
                                                <display:column titleKey="sireh.label.reportes.cxlc.vacio" 
                                                                style="text-align: center"
                                                                property="checkbox" 
                                                                media="html"/>
                                                <display:column titleKey="sireh.label.reportes.cxlc.periodob" 
                                                                property="idb" 
                                                                sortable="false"/>
                                                <display:setProperty name="paging.banner.placement" value="false"/>
                                                <display:setProperty name="export.pdf" value="true"/>
                                                <display:setProperty name="basic.msg.empty_list">
                                                    <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                                </display:setProperty>
                                            </display:table>
                                        </div>
                                    </td>
                                </tr>
                            </table>
                        </c:when>
                        <c:otherwise>
                            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                        </c:otherwise>
                    </c:choose>
                </div>
            </c:set>
            
            <c:set var="content1">
                <table border="0" width="87%">
                    <colgroup>
                        <col width="30%"/>
                        <col width="70%"/>
                    </colgroup>
                    <tr>
                        <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.documento"></spring:message></td>
                        <td align="left"><fsn:input path="documento" maxlength="30" size="30"  /></td>
                    </tr>
                    <tr>
                        <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.nombreArchivo"></spring:message></td>
                        <td align="left"><fsn:input path="nombreArchivo" maxlength="30" size="30"  /></td>
                    </tr>
                    <tr>
                        <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.numeroSolicitud"></spring:message></td>
                        <td align="left"><fsn:input path="numeroSolicitud" maxlength="30" size="30"  /></td>
                    </tr>
                    <tr>
                        <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.fechaBanco"></spring:message></td>
                        <td align="left"><fsn:calendar path="fechaBanco" size="10"/></td>
                    </tr>
                    <tr>
                        <td  align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.fechaPago"></spring:message></td>
                        <td align="left"><fsn:calendar path="fechaPago" size="10"/></td>
                    </tr>
                    <tr>
                        <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.mes"></spring:message></td>
                        <td align="left"><fsn:input path="mes" maxlength="30" size="30"  /></td>
                    </tr>
                    <tr>
                        <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.periodo"></spring:message></td>
                        <td align="left"><fsn:input path="periodo" maxlength="30" size="30"  /></td>
                    </tr>
                    <tr>
                        <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.unidad"></spring:message></td>
                        <td align="left"><fsn:input path="unidad" maxlength="30" size="30"/></td>
                    </tr>
                    <tr>
                        <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.responsable"></spring:message></td>
                        <td align="left"> 
                            <fsn:input path="responsable" maxlength="30" size="30"/>
                        </td>
                    </tr>
                    <tr>
                        <td align="right" class="label"><spring:message code="sireh.label.reportes.cxlc.puestocargo"></spring:message></td>
                        <td align="left"> 
                            <fsn:input path="puestoCargo" maxlength="30" size="30"/>
                        </td>
                    </tr>
                </table>
            </c:set>

            <fsn:container section="init" type="tab" displayTime="3" tabHeight="25"/>
            <fsn:container name="divContent0" content="${content0}" title="Datos Requeridos" selected="true"/>
            <fsn:container name="divContent1" content="${content1}" title="Datos Adicionales"/>
            <fsn:container section="final"/>
        </td>
    </tr>
    <tr>
        <td>
            <table width="100%">
                <tr>
                    <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                </tr>
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.accept" 
                                    path="muestraRegistros"
                                    action="reporteCxlc/repTerceros.do"/>
                    </td>
                    <td align="left">
                        <fsn:submit value="submit.cancel" 
                                    path="cancel" 
                                    action="reporteCxlc/repTerceros.do"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" height="20px">&nbsp;</td>
                </tr>
            </table>
        </td>
    </tr>
</table>

<c:if test="${ (repTercerosDTO.parametro1!=null)}">
    <table>
        <tr>
            <th align="left"></th>
        </tr>
        <tr>
            <td align="left">
                <fsn:reportParam name="CICLO" value="${repTercerosDTO.ciclo}"/>
                <fsn:reportParam name="QUINCENA" value="${repTercerosDTO.qnaIni}"/>
                <fsn:reportParam name="COMPLEMENTO" value="${repTercerosDTO.complemento}"/>
                <fsn:reportParam name="NOMINA" value="${repTercerosDTO.tiponom}"/>
                <fsn:reportParam name="CXLC" value="${repTercerosDTO.origen}"/>
                <fsn:reportParam name="DOCUMENTO" value="${repTercerosDTO.documento}"/>
                <fsn:reportParam name="ARCHIVO" value="${repTercerosDTO.nombreArchivo}"/>
                <fsn:reportParam name="SOLICITUD" value="${repTercerosDTO.numeroSolicitud}"/>
                <fsn:reportParam name="FECHA_BANCO" value="${repTercerosDTO.fechaBancoCad}"/>
                <fsn:reportParam name="FECHA_PAGO" value="${repTercerosDTO.fechaPagoCad}"/>
                <fsn:reportParam name="MES" value="${repTercerosDTO.mes}"/>
                <fsn:reportParam name="PERIODO" value="${repTercerosDTO.periodo}"/>
                <fsn:reportParam name="UNIDAD" value="${repTercerosDTO.unidad}"/>
                <fsn:reportParam name="RESPONSABLE" value="${repTercerosDTO.responsable}"/>
                <fsn:reportParam name="CARGO" value="${repTercerosDTO.puestoCargo}"/>
                <fsn:reportParam name="TIPO_NOMINA" value="${repTercerosDTO.parametro1}"/>
                
                <fsn:report provider="jasper" 
                            viewUri="/cxlc/solicitud" 
                            imagesUri="/images/reports" 
                            format="pdf" 
                            fileName="solicitud" 
                            export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                            width="1060" 
                            height="350"/>
            </td>
        </tr>
    </table>
</c:if>

<script type="text/javascript">
    function checkAll() {
        var checkboxes = new Array();
        checkboxes = document.getElementsByTagName('input');
    
        for (var i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].type == 'checkbox') {
                checkboxes[i].setAttribute('checked', true)
            }
        }
    }
    
    function uncheckAll() {
        var checkboxes = new Array();
        checkboxes = document.getElementsByTagName('input');
    
        for (var i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].type == 'checkbox') {
                checkboxes[i].removeAttribute('checked')
            }
        }
    }
</script>
 
</html:form>
