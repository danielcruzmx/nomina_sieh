<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="altasYBajasDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.altasybajas.path.header"></spring:message></h1>
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
                            action="calculoNomina/altasYbajas"                           
                            progressBar="true"/> &nbsp; <%--aqui poner el metodo del controller --%>
                
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="calculoNomina/altasYbajas"
                            progressBar="true"/>
            </td>
        </tr>
    </table>

    <c:choose>
        <c:when test="${altasYBajasDTO.muestraRegistros}">
            <fsn:filter property="ant_qna.hp_qna_pago" condition="=" path="qnaIni"/>
            <fsn:filter property="act_qna.hp_qna_pago" condition="=" path="qnaFin"/>

            <fsn:filter property="ant_qna.id_tipo_nomina" condition="=" path="tipoNomIni"/>
            <fsn:filter property="ant_qna.id_grupopago_nom" condition="=" path="gpoPagoIni"/>
            <fsn:filter property="ant_qna.hp_num_complem" condition="=" path="numCompIni"/>
            <fsn:filter property="act_qna.id_tipo_nomina" condition="=" path="tipoNomFin"/>
            <fsn:filter property="act_qna.id_grupopago_nom" condition="=" path="gpoPagoFin"/>
            <fsn:filter property="act_qna.hp_num_complem" condition="=" path="numCompFin"/>

<!--   <td>
   <c:out value="${altasYBajasDTO.tipoNomIni}"/>
   <c:out value="${altasYBajasDTO.gpoPagoIni}"/>
   <c:out value="${altasYBajasDTO.numCompIni}"/>
   <c:out value="${altasYBajasDTO.tipoNomFin}"/>
   <c:out value="${altasYBajasDTO.gpoPagoFin}"/>
   <c:out value="${altasYBajasDTO.numCompFin}"/>
   </td>            -->
            <%-- Grid --%> 
            <fsn:pagedList beanName="altasBajasQnas" 
                           baseUrl="altasYbajas" 
                           appendFilters="false">
                           
            <div id="dataTable" style="width: 1025px; overflow: auto;">

                    <display:table name="altasBajasQnas" 
                                   class="displaytag" 
                                   pagesize="10" 
                                   export="true"
                                   id="row" 
                                   requestURI="${requestURI}" 
                                   sort="list">
            
                    <%-- Columnas --%>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.quincenaAnterior"
				    property="quincenaAnterior" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.quincenaReferencia"
				    property="quincenaReferencia" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.existeQuincenaAnterior"
				    property="existeQuincenaAnterior" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.existeQuincenaReferencia"
				    property="existeQuincenaReferencia" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.comprobante"
				    property="comprobante" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.empleado"
				    property="empleado" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.puestoFuncional"
				    property="puestoFuncional" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.curp"
				    property="curp" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.cveBanco"
				    property="cveBanco" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.plaza"
				    property="plaza" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.nivelHerramienta"
				    property="nivelHerramienta" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.imssIssste"
				    property="imssIssste" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.unidadFisica"
				    property="unidadFisica" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.pcp"
				    property="pcp" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.zonaPagadora"
				    property="zonaPagadora" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.numPension"
				    property="numPension" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.regcontFecPago"
				    property="regcontFecPago" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.leyendaCancelado"
				    property="leyendaCancelado" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.hpFolio"
				    property="hpFolio" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.hpDifFolio"
				    property="hpDifFolio" sortable="true"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.hpNetoPago"
				    property="hpNetoPago" sortable="true" format="$ {0,number,#,##0.00}"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.deducciones"
				    property="deducciones" sortable="true" format="$ {0,number,#,##0.00}"/>
		    <display:column titleKey="sireh.label.nomina.movimiento.altasybajas.percepciones"
				    property="percepciones" sortable="true" format="$ {0,number,#,##0.00}"/>

                        <%-- Paginador --%> 
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