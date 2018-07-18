<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="listaNegativosDTO">


    <h1><spring:message code="sireh.label.nomina.movimiento.liqneg.path.header"></spring:message></h1>
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

                    </table>
                </fieldset>
            </td>
        </tr>
        <%-- Botones --%> 
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="calculoNomina/listaNegativos"                           
                            progressBar="true"/> &nbsp; <%--aqui poner el metodo del controller --%>
                
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="calculoNomina/listaNegativos"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${listaNegativosDTO.muestraRegistros}">
            <fsn:filter property="act_qna.hp_qna_pago" condition="=" path="qnaIni"/>

            <fsn:filter property="act_qna.id_tipo_nomina" condition="=" value="${listaNegativosDTO.tipoNomIni}"/>
            <fsn:filter property="act_qna.id_grupopago_nom" condition="=" value="${listaNegativosDTO.gpoPagoIni}"/>
            <fsn:filter property="act_qna.hp_num_complem" condition="=" value="${listaNegativosDTO.numCompIni}"/>

            <%-- Grid --%> 
            <fsn:pagedList beanName="listaImpNegativos" 
                           baseUrl="listaNegativos" 
                           appendFilters="false">
                           
            <div id="dataTable" style="width: 1025px; overflow: auto;">

                    <display:table name="listaImpNegativos" 
                                   class="displaytag" 
                                   pagesize="10" 
                                   export="true"
                                   id="row" 
                                   requestURI="${requestURI}" 
                                   sort="list">
            
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.quincena"
				    property="quincena" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.comprobante"
				    property="comprobante" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.empleado"
				    property="empleado" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.puestoFuncional"
				    property="puestoFuncional" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.curp"
				    property="curp" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.cveBanco"
				    property="cveBanco" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.plaza"
				    property="plaza" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.nivelHerramienta"
				    property="nivelHerramienta" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.imssIssste"
				    property="imssIssste" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.unidadFisica"
				    property="unidadFisica" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.pcp"
				    property="pcp" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.zonaPagadora"
				    property="zonaPagadora" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.numPension"
				    property="numPension" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.nomina"
				    property="nomina" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.leyendaCancelado"
				    property="leyendaCancelado" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.hpFolio"
				    property="hpFolio" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.hpDifFolio"
				    property="hpDifFolio" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.hpNetoPago"
				    property="hpNetoPago" sortable="true" format="$ {0,number,#,##0.00}"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.deducciones"
				    property="deducciones" sortable="true" format="$ {0,number,#,##0.00}"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.liqneg.percepciones"
				    property="percepciones" sortable="true" format="$ {0,number,#,##0.00}"/>
                        
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