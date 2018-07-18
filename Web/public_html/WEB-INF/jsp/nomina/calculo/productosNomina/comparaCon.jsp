<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="comparaConDTO">


    <h1><spring:message code="sireh.label.nomina.movimiento.comparacon.path.header"></spring:message></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <%-- Filtros --%> 
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.altasybajas.qnaIni"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="sacaQnasPago1" path="qnaIni" style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.altasybajas.nomIni"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="muestraNominaQnasHistorico1" path="nomIni"  progress="true" parentPath="qnaIni" style="width: 700px;"/>
                            </td>
                        </tr>

                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.altasybajas.qnaFin"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="sacaQnasPago1" path="qnaFin" progress="true" style="width: 200px;"/>
                                </td>
                            </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.altasybajas.nomFin"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="muestraNominaQnasHistorico2" path="nomFin"  progress="true" parentPath="qnaFin" style="width: 700px;"/>
                            </td>
                    </table>
                </fieldset>
            </td>
        </tr>
        <%-- Botones --%> 
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="calculoNomina/comparaCon"                           
                            progressBar="true"/> &nbsp; <%--aqui poner el metodo del controller --%>
                
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="calculoNomina/comparaCon"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${comparaConDTO.muestraRegistros}">
            <fsn:filter property="ant_qna.hp_qna_pago" condition="=" path="qnaIni"/>
            <fsn:filter property="act_qna.hp_qna_pago" condition="=" path="qnaFin"/>

            <fsn:filter property="ant_qna.id_tipo_nomina" condition="=" value="${comparaConDTO.tipoNomIni}"/>
            <fsn:filter property="ant_qna.id_grupopago_nom" condition="=" value="${comparaConDTO.gpoPagoIni}"/>
            <fsn:filter property="ant_qna.hp_num_complem" condition="=" value="${comparaConDTO.numCompIni}"/>
            <fsn:filter property="act_qna.id_tipo_nomina" condition="=" value="${comparaConDTO.tipoNomFin}"/>
            <fsn:filter property="act_qna.id_grupopago_nom" condition="=" value="${comparaConDTO.gpoPagoFin}"/>
            <fsn:filter property="act_qna.hp_num_complem" condition="=" value="${comparaConDTO.numCompFin}"/>
            
            
            <fsn:filter property="ant_qna.hp_qna_pago" condition="=" path="qnaIni"/>
            <fsn:filter property="act_qna.hp_qna_pago" condition="=" path="qnaFin"/>

            <fsn:filter property="ant_qna.id_tipo_nomina" condition="=" value="${comparaConDTO.tipoNomIni}"/>
            <fsn:filter property="ant_qna.id_grupopago_nom" condition="=" value="${comparaConDTO.gpoPagoIni}"/>
            <fsn:filter property="ant_qna.hp_num_complem" condition="=" value="${comparaConDTO.numCompIni}"/>
            <fsn:filter property="act_qna.id_tipo_nomina" condition="=" value="${comparaConDTO.tipoNomFin}"/>
            <fsn:filter property="act_qna.id_grupopago_nom" condition="=" value="${comparaConDTO.gpoPagoFin}"/>
            <fsn:filter property="act_qna.hp_num_complem" condition="=" value="${comparaConDTO.numCompFin}"/>

       
            <%-- Grid --%> 
            <fsn:pagedList beanName="comparaConceptos" 
                           baseUrl="comparaCon" 
                           appendFilters="false">
                           
            <div id="dataTable" style="width: 1025px; overflow: auto;">

                    <display:table name="comparaConceptos" 
                                   class="displaytag" 
                                   pagesize="10" 
                                   export="true"
                                   id="row" 
                                   requestURI="${requestURI}" 
                                   sort="list">
            
                    
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.cpFolio"
				    property="cpFolio" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.cpDifFolio"
				    property="cpDifFolio" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.quincenaAnterior"
				    property="quincenaAnterior" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.quincenaReferencia"
				    property="quincenaReferencia" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.comprobante"
				    property="comprobante" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.empleado"
				    property="empleado" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.puestoFuncional"
				    property="puestoFuncional" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.curp"
				    property="curp" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.cveBanco"
				    property="cveBanco" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.plaza"
				    property="plaza" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.nivelHerramienta"
				    property="nivelHerramienta" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.imssIssste"
				    property="imssIssste" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.unidadFisica"
				    property="unidadFisica" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.pcp"
				    property="pcp" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.zonaPagadora"
				    property="zonaPagadora" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.numPension"
				    property="numPension" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.regcontFecPago"
				    property="regcontFecPago" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.nomina"
				    property="nomina" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.leyendaCancelado"
				    property="leyendaCancelado" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.hpFolio"
				    property="hpFolio" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.hpDifFolio"
				    property="hpDifFolio" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.hpNetoPago"
				    property="hpNetoPago" sortable="true" format="$ {0,number,#,##0.00}"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.deducciones"
				    property="deducciones" sortable="true" format="$ {0,number,#,##0.00}"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.percepciones"
				    property="percepciones" sortable="true" format="$ {0,number,#,##0.00}"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.conceptoPagoQnaRef"
				    property="conceptoPagoQnaRef" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.importeQnaRef"
				    property="importeQnaRef" sortable="true" format="$ {0,number,#,##0.00}"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.conceptoPagoQnaAnt"
				    property="conceptoPagoQnaAnt" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.comparacon.importeQnaAnt"
				    property="importeQnaAnt" sortable="true" format="$ {0,number,#,##0.00}"/>

                        
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="export.excel" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                        <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                        
                    </display:table>
                </div>
            </fsn:pagedList>
            
            
        </c:when>
        <c:otherwise>
            <%-- No existen registros --%> 
            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
        </c:otherwise>
    </c:choose>


</html:form>