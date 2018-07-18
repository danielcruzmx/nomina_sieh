<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form name="checkBoxTest" modelAttribute="administracionAnualDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1>
        <spring:message code="calculo.menu"/>&#45;
        <spring:message code="calculo.admonanual"/>&#45;
        <spring:message code="reporte.calculo.nomina.definicion"/>
    </h1>
    <p>&nbsp;</p>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="95%" align="center" border="0">
                        <tr><td>&nbsp;</td></tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.nomina.impuesto.anual.parametros.deducciones.ciclo"></spring:message></td>
                            <td>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="cicloRegControl" 
                                                path="ciclo"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.nomina.gestion.label.numQuincena"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tnNominaQuincena" 
                                                path="quincena"
                                                style="width: 200px;"/>
                            </td>
                         </tr>
                         <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.tipoNomina"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaTiposNomina"
                                                path="tipoNomina"
                                                style="width: 200px;"/>
                            </td>
                         </tr>
                         <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.gpoPago"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaGruposPago"
                                                path="grupoPago"
                                                style="width: 200px;"/>
                            </td>
                         </tr>
                         <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.status"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaEstadosNomina"
                                                path="idEdoNom"
                                                style="width: 200px;"/>
                            </td>
                         </tr>
                    </table>
                    <table width="95%" align="center" border="0">
                        <tr><td align="left"><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.search" 
                                            path="muestraRegistros"
                                            action="impuestoAnual/${administracionAnualDTO.urlOrigen}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="impuestoAnual/${administracionAnualDTO.urlOrigen}"
                                            progressBar="true"/>
                            </td>
                            <tr><td>&nbsp;</td></tr>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <c:if test="${administracionAnualDTO.muestraRegistros}">
        <div id="dataTable" style="width: 1025px; overflow: auto;">
            <fsn:filter property="H.HP_EJER_FISCAL" condition="=" path="ciclo" />
            <fsn:filter property="H.HP_QNA_PAGO" condition="=" path="quincena" />
            <fsn:filter property="H.ID_TIPO_NOMINA" condition="=" path="tipoNomina" />
            <fsn:filter property="H.ID_GRUPOPAGO_NOM" condition="=" path="grupoPago" />
            <fsn:filter property="N.ID_EDO_NOM" condition="=" path="idEdoNom" />
            
            <fsn:pagedList beanName="${administracionAnualDTO.beanName}" 
                           checkbox="true"
                           chkProperty="idGrupo" 
                           baseUrl="${administracionAnualDTO.urlOrigen}" 
                           maxRows="200"
                           appendFilters="false">
                <div id="displayTagDiv">        
                    <display:table name="${administracionAnualDTO.beanName}" 
                                   class="displaytag"
                                   pagesize="15"
                                   decorator="checkboxTableDecorator"
                                   export="true" 
                                   id="row" 
                                   requestURI="${requestURI}"
                                   sort="list">
                        <display:column style="text-align: center;" 
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.idQna"
                                        sortable="true">
                                        <a href="modificacionNomina.do?idQna=<c:out value='${row.idQna}'/>&folio1=<c:out value='${row.folio1}'/>&folio2=<c:out value='${row.folio2}'/>&folio3=<c:out value='${row.folio3}'/>&tcpmonto=<c:out value='${row.tcpmonto}'/>&tcdmonto=<c:out value='${row.tcdmonto}'/>&tcpisrgmonto=<c:out value='${row.tcpisrgmonto}'/>&tcpisremonto=<c:out value='${row.tcpisremonto}'/>&tcdisrgmonto=<c:out value='${row.tcdisrgmonto}'/>&tcdisremonto=<c:out value='${row.tcdisremonto}'/>&ciclo=<c:out value='${administracionAnualDTO.ciclo}'/>">
                                            <c:out value="${row.idQna}"/>
                                        </a>
                        </display:column>
                        <display:column property="qnaCaptura" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.qnaCaptura"
                                        sortable="true"/>
                        <display:column property="numComplem" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.numComplem"
                                        sortable="true"/>
                        <display:column property="descripcion" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.desc"
                                        sortable="true"/>
                        <display:column property="tipoNomina" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.tipoNomina"
                                        sortable="true"/>
                        <display:column property="grupoPago" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.grupoPago"
                                        sortable="true"/>
                        <display:column property="descEstadoNom" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.status"
                                        sortable="true"/>
                        <display:column property="folio1" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.folio1"
                                        sortable="true"/>
                        <display:column property="folio2" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.folio2"
                                        sortable="true"/>
                        <display:column property="folio3" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.folio3"
                                        sortable="true"/>
                        <display:column property="tcpmonto" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.tcpmonto"
                                        sortable="true"
                                        format="{0,number,#,##0.00}"/>
                        <display:column property="tcdmonto" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.tcdmonto"
                                        sortable="true"
                                        format="{0,number,#,##0.00}"/>
                        <display:column property="tcpisrgmonto" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.tcpisrgmonto"
                                        sortable="true"
                                        format="{0,number,#,##0.00}"/>
                        <display:column property="tcpisremonto" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.tcpisremonto"
                                        sortable="true"
                                        format="{0,number,#,##0.00}"/>
                        <display:column property="tcdisrgmonto" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.tcdisrgmonto"
                                        sortable="true"
                                        format="{0,number,#,##0.00}"/>
                        <display:column property="tcdisremonto" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.tcdisremonto"
                                        sortable="true"
                                        format="{0,number,#,##0.00}"/>
                        <display:column property="fcreacion" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.fcreacion"
                                        sortable="true"/>
                        <display:column property="fanexo" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.fanexo"
                                        sortable="true"/>
                        <display:column property="ftimbrado" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.ftimbrado"
                                        sortable="true"/>
                        <display:column property="reftimbrado" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.reftimbrado"
                                        sortable="true"/>
                        <display:column property="fcancelacionsireh" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.fcancelacionsireh"
                                        sortable="true"/>
                        <display:column property="fcansat" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.fcansat"
                                        sortable="true"/>
                        <display:column property="refsat" 
                                        style="text-align: right;"
                                        titleKey="sireh.label.nomina.impuesto.anual.parametros.refsat"
                                        sortable="true"/>
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
        </div>
    </c:if>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>