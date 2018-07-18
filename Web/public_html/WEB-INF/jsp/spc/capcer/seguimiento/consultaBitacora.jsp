<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
    .anchoInputSmall {
        width: 100px;
    }
</style>

<html:form name="checkBoxTest" modelAttribute="consultaBitacoraDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.seguimientoControl.consultaBitacora.title"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td class="label">* <spring:message code="sireh.label.spc.capcer.seguimientoControl.consultaBitacora.filtro.tipoBitacora"/>:</td>
                            <td align="left">
                                <table align="center" width="100%">
                                    <tr>                        
                                        <td align="center">
                                            <html:radiobutton value="CURSO-PARTICIPANTE" path="tipoBitacora" label=" Curso - Participante"/>
                                        </td>
                                        <td align="center">
                                            <html:radiobutton value="CONTRATO-FACTURA" path="tipoBitacora" label=" Contrato - Factura"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.consultaBitacora.filtro.idCapMovto"></spring:message>:</td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcCapMovto-consultaBitacora" 
                                                path="idCapMovto"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.consultaBitacora.filtro.fechaInicio"></spring:message>:</td>
                            <td>
                                <fsn:calendar path="cursoFecIni" readonly="true"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.consultaBitacora.filtro.fechaFin"></spring:message>:</td>
                            <td>
                                <fsn:calendar path="cursoFecFin" readonly="true"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.consultaBitacora.filtro.usuario"></spring:message>:</td>
                            <td>
                                <fsn:input path="usuario"
                                           uppercase="false" 
                                           maxlength="30"
                                           size="60"
                                           css="anchoInputSmall"/>
                            </td>
                        </tr>
                        <tr align="center">
                            <td colspan="4">
                                <table width="90%" border="0" align="center">
                                    <tr>
                                        <td align="center">
                                            <fsn:submit value="submit.search" 
                                                        path="muestraRegistros" 
                                                        action="seguimientoCursoSPC/${consultaBitacoraDTO.urlOrigen}"
                                                        progressBar="true" 
                                                        onclick="cambioFechas()"/> &nbsp; 
                                            <fsn:submit value="submit.clean" 
                                                        path="cancel" 
                                                        action="seguimientoCursoSPC/${consultaBitacoraDTO.urlOrigen}"
                                                        progressBar="true"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <c:choose>
                    <c:when test="${consultaBitacoraDTO.muestraRegistros && consultaBitacoraDTO.tipoBitacora != null}">
                        
                        <fsn:filter property="BI.ID_CAP_MOVTO" condition="=" path="idCapMovto"/>
                        <fsn:filter property="BI.USUARIO" condition="contains" path="usuario"/>
                        
                        <fsn:pagedList beanName="${consultaBitacoraDTO.beanName}"
                                       checkbox="true" 
                                       chkProperty="idMovtos" 
                                       baseUrl="${consultaBitacoraDTO.urlOrigen}" 
                                       appendFilters="false">
                            <div id="displayTagDiv" style="width:1000px; min-height:200px;overflow:auto;text-align:center;"> 
                                <display:table name="${consultaBitacoraDTO.beanName}" 
                                               class="displaytag" 
                                               pagesize="20" 
                                               decorator="checkboxTableDecorator" 
                                               export="true" 
                                               id="row" 
                                               requestURI="${requestURI}" 
                                               sort="list">
                                    
                                    <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.consultaBitacora.grid.movimiento" 
                                                    property="descMovto" 
                                                    sortable="true"
                                                    style="text-align: left;"/>
                                    <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.consultaBitacora.grid.usuario" 
                                                    property="usuario" 
                                                    sortable="true"
                                                    style="text-align: left;"/>
                                    <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.consultaBitacora.grid.fecModifico" 
                                                    property="fecModifico" 
                                                    sortable="true"
                                                    style="text-align: left;"/>
                                                    
                                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                                    <display:setProperty name="export.pdf" value="true"/>
                                    <display:setProperty name="basic.msg.empty_list">
                                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                    </display:setProperty>
                                </display:table>
                            </div>
                        </fsn:pagedList>
                    </c:when>
                    <c:otherwise>
                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">        
        // PagedList asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        // Fechas
        function cambioFechas() {
            var onewayIni = $j('#text_cursoFecIni').val();
            var piecesIni = onewayIni.split('/');
            var reversedIni = piecesIni.reverse().join('/');
            $j('#cursoFecIniTxt').val(reversedIni);
            
            var onewayFin = $j('#text_cursoFecFin').val();
            var piecesFin = onewayFin.split('/');
            var reversedFin = piecesFin.reverse().join('/');
            $j('#cursoFecFinTxt').val(reversedFin);
        }
        
        // Curso-Participante
        $j("#tipoBitacora1").click(function(){
            //console.log("tipoBitacora -> curso-participante");
        });
        
        // Contrato-Factura
        $j("#tipoBitacora2").click(function(){
            //console.log("tipoBitacora -> contrato-factura");
        });
    </script>
</html:form>