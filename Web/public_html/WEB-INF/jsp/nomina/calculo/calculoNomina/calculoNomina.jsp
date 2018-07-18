<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
             numero=numero.toFixed(decimales);
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
    .columnHeader {
        background-color: rgb(109, 109, 109);
        color: rgb(255, 255, 255);
        font-weight: bold;
        text-align: center;
    }
</style>

<html:form id="formDetalle" modelAttribute="pagoDTO">

    <html:hidden path="idGrupoPago"/>
    <html:hidden path="descGrupoPago"/>
    <html:hidden path="idQna"/>
    
    <h1><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.titulo" arguments="${pagoDTO.descGrupoPago}"/></h1>  
    <p>&nbsp;</p>
    
    <table align="center" width="100%" border="0">
        <tr>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.qnaCaptura"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.numComplem"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.desc"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.tipoNomina"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.grupoPago"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.periodoPago"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.status"/></td>
        </tr>
        <tr>
            <td class="label" style="text-align: center;"><c:out value="${pagoDTO.nominaDTO.nomQnaCaptura}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${pagoDTO.nominaDTO.nomNumComplem}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${pagoDTO.nominaDTO.descNomina}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${pagoDTO.nominaDTO.nomDescTipoNomina}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${pagoDTO.nominaDTO.nomDescGrupoPago}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${pagoDTO.nominaDTO.nomIniPago}"/><br/>-<br/><c:out value="${pagoDTO.nominaDTO.nomFinPago}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${pagoDTO.nominaDTO.idEdoNom}"/></td>
        </tr>
    </table>
    <table align="center" width="100%" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend><strong><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.busquedaPorRFC"/></strong></legend>
                    <table align="center" width= "100%">
                        <tr>
                            <td align="right" class="label" width="150px"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc"/></td>
                            <td align="left" width="200px"><fsn:input path="rfcEmpleado"/></td>
                            <td align="right"><fsn:submit value="submit.search" action="calculoNomina/muestraDetallePorRFC.do"/></td>
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
                    <legend><strong><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.datosDelEmpleado"/></strong></legend>
                    <table align="center" width= "100%" border="0">
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
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend><strong><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.datosDeLaPlaza"/></strong></legend>
                    <table align="center" width= "100%" border="0">
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPlaza"/></td>
                            <td style="width:200px;"><fsn:label path="idPlaza"/></td>
                            <td style="width:150px;" align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPuestoNom"/></td>
                            <td style="width:200px;"><fsn:label path="idPuestoNom"/></td>
                            <td style="width:150px;"align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idZonaDistNom"/></td>
                            <td style="width:200px;"><fsn:label path="idZonaDistNom"/></td>
                        </tr>
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.grupoPago"/></td>
                            <td style="width:200px;"><c:out value="${pagoDTO.descGrupoPago}"/></td>
                            <td style="width:150px;" align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nivelPto"/></td>
                            <td style="width:200px;"><fsn:label path="idNivelPto"/></td>
                        </tr>
                        <tr>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombramiento"/></td>
                            <td ><c:out value="${pagoDTO.descNombramiento}"/></td>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.jerarquia"/></td>
                            <td ><c:out value="${pagoDTO.descJerarquia}"/></td>
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
                    
                    <fsn:filter property="tn_historico_pago.HP_RFC" condition="=" path="rfcEmpleado"/>
                    <fsn:filter property="tn_historico_pago.HP_CONSEC_NOMINA" condition="=" path="idQna"/>
                    
                    <fsn:pagedList beanName="conceptosPagadosPorRFC"
                                   baseUrl="${pagoDTO.viewName}" 
                                   appendFilters="false"
                                   maxRows="200">
                        <display:table name="conceptosPagadosPorRFC"
                                       class="displaytag" 
                                       pagesize="30" 
                                       export="false" 
                                       id="pag" 
                                       requestURI="${requestURI}" 
                                       sort="list" 
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
                            <display:column titleKey="sireh.label.nomina.calculo.ordinaria.conceptosPagados.montoPercepcion"
                                            style="text-align: right;"
                                            sortable="false">
                                <div id="monto"><c:out value="${pag.idTipoCpto == 'P'? pag.cpMonto: 0}"/></div>
                            </display:column>
                            <display:column titleKey="sireh.label.nomina.calculo.ordinaria.conceptosPagados.montoDeduccion"
                                            style="text-align: right;"
                                            sortable="false">
                                <div id="monto"><c:out value="${pag.idTipoCpto == 'D'? pag.cpMonto: 0}"/></div>
                            </display:column>
                            <display:footer>
                                <tr>
                                    <td colspan="3" align="right"><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.liquido"/></td>
                                    <td align="right">
                                        <div id="monto"><c:out value="${pag.liquido}"/></div>
                                    </td>
                                <tr>
                            </display:footer>
                            
                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                            <display:setProperty name="export.pdf" value="false"/>
                            <display:setProperty name="basic.msg.empty_list">
                                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                            </display:setProperty>
                        </display:table>
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
</html:form>