<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<script type="text/javascript">
    function formato_numero(numero, decimales, separador_decimal, separador_miles){
         numero=parseFloat(numero);
         if(isNaN(numero)){
             return "";
         }
    
         if(decimales!==undefined){
             // Redondeamos
             //numero=numero.toFixed(decimales);
             numero=(Math.round(numero * 100) / 100).toFixed(decimales);
         }
    
         // Convertimos el punto en separador_decimal
         numero=numero.toString().replace(".", separador_decimal!==undefined ? separador_decimal : ",");
    
         if(separador_miles){
             // Añadimos los separadores de miles
             var miles=new RegExp("(-?[0-9]+)([0-9]{3})");
             while(miles.test(numero)) {
                 numero=numero.replace(miles, "$1" + separador_miles + "$2");
             }
         }
         return numero;
    }
</script>

<style type="text/css">
    #listaNominasQnaPorQna .pagelinks {
        display:none;
    }
</style>

<html:form modelAttribute="pagoDTO">
    
    <c:if test="${!pagoDTO.rfcNoEncontrado}">
    <h1><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.titulo.detalleCalculo"/>&nbsp;<c:out value="${pagoDTO.numQuincena}"/>&nbsp;del&nbsp;<c:out value="${pagoDTO.numAnio}"/></h1>

    <table align="center" width="100%" border="0">
        <c:if test="${!pagoDTO.busquedaPorPlaza}">
        <tr>
            <td>
                <fieldset>
                    <legend><strong><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.datosDelEmpleado"/></strong></legend>
                    <table align="center" width= "100%" border="0">
                        <tr>
                            <td align="right" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc"/></td>
                            <td style="width:200px;"><fsn:label path="rfcEmpleado"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.curp"/></td>
                            <td style="width:200px;"><fsn:label path="curpEmpleado"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nss"/></td>
                            <td style="width:200px;"><fsn:label path="nssEmpleado"/></td>
                        </tr>                        
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombreEmpleado"/></td>
                            <td style="width:200px;"><fsn:label path="nombreEmpleado"/></td>
                            <td style="width:150px;" align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.primerApellido"/></td>
                            <td style="width:200px;"><fsn:label path="primerApellido"/></td>
                            <td style="width:150px;" align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.segundoApellido"/></td>
                            <td style="width:200px;"><fsn:label path="segundoApellido"/></td>
                        </tr>                        
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.descTipoPago"/></td>
                            <td style="width:200px;"><fsn:label path="descTipoPago"/></td>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.numPension"/></td>
                            <td style="width:200px;"><fsn:label path="numPension"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        </c:if>
        <tr>    
            <td>
                <fieldset>
                    <legend><strong><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.datosDeLaPlaza"/></strong></legend>
                    <table align="center" width= "100%" border="0">
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idUnidad"/></td>
                            <td align="left" style="width:200px;" colspan="5">&nbsp;&nbsp;<fsn:label path="idUnidadNomb"/>&nbsp;-&nbsp;<fsn:label path="descUnidadNomb"/></td>
                        </tr>
                        <tr>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPlaza"/></td>
                            <td><fsn:label path="idPlaza"/></td>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPuestoNom"/></td>
                            <td align="left" colspan="3" >&nbsp;&nbsp;<fsn:label path="idPuestoNom"/>&nbsp;-&nbsp;<fsn:label path="descPuestoNom"/></td>
                        </tr>
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.grupoPago"/></td>
                            <td style="width:200px;"><c:out value="${pagoDTO.descGrupoPago}"/></td>
                            <td style="width:150px;" align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nivelPto"/></td>
                            <td style="width:200px;"><fsn:label path="idNivelPto"/></td>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idZonaDistNom"/></td>
                            <td><fsn:label path="idZonaDistNom"/></td>
                        </tr>
                        <tr>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombramiento"/></td>
                            <td ><c:out value="${pagoDTO.descNombramiento}"/></td>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.jerarquia"/></td>
                            <td ><c:out value="${pagoDTO.descJerarquia}"/></td>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.zonaEconomica"/></td>
                            <td ><c:out value="${pagoDTO.idZonaEcoNom}"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="100%" border="0">
        <tr>    
            <td>
                 <fieldset>
                    <legend><strong><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.detalleConceptosPago"/></strong></legend>
                    <fsn:filter property="tn_historico_pago.HP_RFC" condition="=" path="rfcEmpleado" />
                    <fsn:filter property="tn_historico_pago.HP_CONSEC_NOMINA" condition="=" path="idQna" />
                    
                    <fsn:pagedList name="conceptosPagadosPorRFCTag"
                                   items="${pagoDTO.conceptosPagados}"
                                   baseUrl="${pagoDTO.baseUrl}" 
                                   appendFilters="false">
                        <div id="displayTagDiv">
                            <display:table name="conceptosPagadosPorRFCTag"
                                           class="displaytag" 
                                           pagesize="30" 
                                           export="false" 
                                           id="pago" 
                                           requestURI="${requestURI}" 
                                           sort="list" 
                                           defaultsort="1" 
                                           defaultorder="descending"
                                           style="width: 800px;">
                                           
                                <display:column property="idTipoCpto"
                                                titleKey="sireh.label.nomina.calculo.ordinaria.conceptosPagados.tipo" 
                                                style="text-align: center;" 
                                                sortable="true"/>
                                <display:column property="idCptoPago"
                                                titleKey="sireh.label.nomina.calculo.ordinaria.conceptosPagados.concepto" 
                                                style="text-align: center;" 
                                                sortable="true"/>
                                <display:column property="descConPag"
                                                titleKey="sireh.label.nomina.calculo.ordinaria.conceptosPagados.descTipoPago" 
                                                style="text-align: center;" 
                                                sortable="true"/>
                                <c:choose>
                                    <c:when test="${pago.idTipoCpto == 'P'}">
                                        <display:column titleKey="sireh.label.nomina.calculo.ordinaria.conceptosPagados.montoPercepcion"
                                                        style="text-align: right;">
                                            <div id="monto"><c:out value="${pago.cpMonto}"/></div>
                                        </display:column>
                                        <display:column titleKey="sireh.label.nomina.calculo.ordinaria.conceptosPagados.montoDeduccion"
                                                        style="text-align: right;">
                                            <div id="monto"><c:out value="0.00"/></div>
                                        </display:column>
                                    </c:when>
                                    <c:otherwise>
                                        <display:column titleKey="sireh.label.nomina.calculo.ordinaria.conceptosPagados.montoPercepcion"
                                                        style="text-align: right;">
                                            <div id="monto"><c:out value="0.00"/></div>
                                        </display:column>
                                        <display:column titleKey="sireh.label.nomina.calculo.ordinaria.conceptosPagados.montoDeduccion"
                                                        style="text-align: right;">
                                            <div id="monto"><c:out value="${pago.cpMonto}"/></div>
                                        </display:column>
                                    </c:otherwise>
                                </c:choose>
                                
                                <display:footer>
                                    <tr>
                                        <td colspan="3" align="right"><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.liquido"/></td>
                                        <td align="right">
                                            <div id="monto"><c:out value="${pagoDTO.liquidoString}"/></div>
                                        </td>
                                    <tr>
                                </display:footer>
                                
                                <display:setProperty name="paging.banner.placement" value="bottom"/>
                                <display:setProperty name="export.pdf" value="false"/>
                                <display:setProperty name="basic.msg.empty_list">
                                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                                </display:setProperty>
                            </display:table>
                        </div>
                    </fsn:pagedList>
                </fieldset>            
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        divs = document.getElementsByTagName( 'div' );
        for( i=0; i<divs.length; i++ ) {
            if( divs[i].id == 'monto' ) {
                divs[i].innerHTML = formato_numero(divs[i].innerHTML,2,'.',',');
            }
        }
    </script>
    </c:if>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>