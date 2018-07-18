<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="comparaGralDTO">


    <h1><spring:message code="sireh.label.nomina.movimiento.comparagral.path.header"></spring:message></h1>
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
                            action="calculoNomina/comparaGral"                           
                            progressBar="true"/> &nbsp; <%--aqui poner el metodo del controller --%>
                
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="calculoNomina/comparaGral"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${comparaGralDTO.muestraRegistros}">
            <fsn:filter property="ant_qna.hp_qna_pago" condition="=" path="qnaIni"/>
            <fsn:filter property="act_qna.hp_qna_pago" condition="=" path="qnaFin"/>

            <fsn:filter property="ant_qna.id_tipo_nomina" condition="=" value="${comparaGralDTO.tipoNomIni}"/>
            <fsn:filter property="ant_qna.id_grupopago_nom" condition="=" value="${comparaGralDTO.gpoPagoIni}"/>
            <fsn:filter property="ant_qna.hp_num_complem" condition="=" value="${comparaGralDTO.numCompIni}"/>
            <fsn:filter property="act_qna.id_tipo_nomina" condition="=" value="${comparaGralDTO.tipoNomFin}"/>
            <fsn:filter property="act_qna.id_grupopago_nom" condition="=" value="${comparaGralDTO.gpoPagoFin}"/>
            <fsn:filter property="act_qna.hp_num_complem" condition="=" value="${comparaGralDTO.numCompFin}"/>
            
            <%-- Grid --%> 
            <fsn:pagedList beanName="comparaGenerales" 
                           baseUrl="comparaGral" 
                           appendFilters="false">
                           
            <div id="dataTable" style="width: 1025px; overflow: auto;">

                    <display:table name="comparaGenerales" 
                                   class="displaytag" 
                                   pagesize="10" 
                                   export="true"
                                   id="row" 
                                   requestURI="${requestURI}" 
                                   sort="list">
            
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.quincenaAnterior" 
                                    property="quincenaAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.quincenaReferencia"
                                    property="quincenaReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.comprobanteAnterior" 
                                    property="comprobanteAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.comprobanteReferencia"
                                    property="comprobanteReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.empleadoAnterior" 
                                    property="empleadoAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.empleadoReferencia"
                                    property="empleadoReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.puestoFuncionalAnterior" 
                                    property="puestoFuncionalAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.puestoFuncionalReferencia"
                                    property="puestoFuncionalReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.curpAnterior" 
                                    property="curpAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.curpRefencia"
                                    property="curpRefencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.cveBancoAnterior" 
                                    property="cveBancoAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.cveBancoReferencia"
                                    property="cveBancoReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.plazaAnterior" 
                                    property="plazaAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.plazaReferencia"
                                    property="plazaReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.nivelHerramientaAnterior" 
                                    property="nivelHerramientaAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.nivelHerramientaReferencia"
                                    property="nivelHerramientaReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.imssIsssteAnterior" 
                                    property="imssIsssteAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.imssIsssteReferencia" 
                                    property="imssIsssteReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.unidadFisicaAnterior" 
                                    property="unidadFisicaAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.unidadFisicaReferencia"
                                    property="unidadFisicaReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.pcpAnterior" 
                                    property="pcpAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.pcpReferencia"
                                    property="pcpReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.zonaPagadoraAnterior" 
                                    property="zonaPagadoraAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.zonaPagadoraReferencia"
                                    property="zonaPagadoraReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.numPensionAnterior"
                                    property="numPensionAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.numPensionReferencia"
                                    property="numPensionReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.regcontFecPagoAnterior" 
                                    property="regcontFecPagoAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.regcontFecPagoReferencia"
                                    property="regcontFecPagoReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.nominaAnterior" 
                                    property="nominaAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.nominaReferencia"
                                    property="nominaReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.leyendaCanceladoAnterior" 
                                    property="leyendaCanceladoAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.leyendaCanceladoReferencia"
                                    property="leyendaCanceladoReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.hpFolioAnterior" 
                                    property="hpFolioAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.hpFolioReferencia"
                                    property="hpFolioReferencia" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.hpDifFolioAnterior" 
                                    property="hpDifFolioAnterior" sortable="true"/>
                    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.hpDifFolioReferencia"
                                    property="hpDifFolioReferencia" sortable="true"/>
 		    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.hpNetoPagoAnterior"
				    property="hpNetoPagoAnterior" sortable="true" format="$ {0,number,#,##0.00}"/>
 		    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.hpNetoPagoReferencia"
				    property="hpNetoPagoReferencia" sortable="true" format="$ {0,number,#,##0.00}"/>
 		    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.deduccionesAnterior"
				    property="deduccionesAnterior" sortable="true" format="$ {0,number,#,##0.00}"/>
 		    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.deduccionesReferencia"
				    property="deduccionesReferencia" sortable="true" format="$ {0,number,#,##0.00}"/>
 		    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.percepcionesAnterior"
				    property="percepcionesAnterior" sortable="true" format="$ {0,number,#,##0.00}"/>
 		    <display:column titleKey="sireh.label.nomina.movimiento.comparagral.percepcionesReferencia"
				    property="percepcionesReferencia" sortable="true" format="$ {0,number,#,##0.00}"/>
                        
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