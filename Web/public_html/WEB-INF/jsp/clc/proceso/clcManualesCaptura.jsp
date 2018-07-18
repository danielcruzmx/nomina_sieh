<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script type="text/javascript">
    function formato_numero(numero, decimales, separador_decimal, separador_miles){
         numero = parseFloat(numero);
         if (isNaN(numero)) {
             return "";
         }
    
         if (decimales !== undefined) {
             // Redondeamos
             numero = numero.toFixed(decimales);
         }
    
         // Convertimos el punto en separador_decimal
         numero = numero.toString().replace(".", separador_decimal!==undefined ? separador_decimal : ",");
    
         if (separador_miles) {
             // Añadimos los separadores de miles
             var miles = new RegExp("(-?[0-9]+)([0-9]{3})");
             while (miles.test(numero)) {
                 numero = numero.replace(miles, "$1" + separador_miles + "$2");
             }
         }
         return numero;
    }
</script>

<html:form name="checkBoxTest" modelAttribute="clcManualesCapturaDTO">
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.titulo"/></h1>
    <p>&nbsp;</p>
    
    <html:hidden path="secuencia"/>
    <html:hidden path="numCxlc"/>
    
    <table align="center" width="100%">        
        <tr valign="top">
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.clc.proceso.clcManualesCaptura.subTitulo"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.ciclo"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcCicloProcesaManuales" 
                                                path="ciclo" 
                                                progress="true"
                                                onchange="getQnaCaptura(false);getConsecutivos(false);"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.proceso.clcManualesCaptura.cxlc"/></td>
                            <td width="200px" align="left">
                                <fsn:input path="cxlc" size="10" disabled="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.tipoNomina"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcTipoNominaProcesaManuales" 
                                                path="tipoNomina" 
                                                progress="true"
                                                onchange="getUnidad(false)"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.importe"/></td>
                            <td width="200px" align="left">
                                <fsn:input path="importe" size="10"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.qnaCaptura"/></td>
                            <td width="200px" align="left">
                                <select name='qnaCaptura' id='qnaCaptura'>
                                    <option value=''>SELECCIONE...</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.unidad"/></td>
                            <td width="200px" align="left">
                                <select name='unidad' id='unidad'>
                                    <option value=''>SELECCIONE...</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.iva"/></td>
                            <td width="200px" align="left">
                                <fsn:input path="iva" size="10" disabled="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.partida"/></td>
                            <td width="200px" align="left">
                                <select name='partida' id='partida'>
                                    <option value=''>SELECCIONE...</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.situacion"/></td>
                            <td width="200px" align="left">CAPTURADA</td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.nota"/></td>
                            <td width="200px" align="left">
                                <fsn:textarea path="nota" rows="4" cols="60"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <table width="100%">
                    <tr>
                        <td align="left" height="20px" valign="middle"> &nbsp; </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <fsn:submit value="submit.generate" 
                                        action="clcProceso/clcManualesCxlcPrevia"
                                        progressBar="true"/> &nbsp; 
                            <fsn:submit value="submit.cancel" 
                                        path="cancel"
                                        action="clcProceso/clcManualesCaptura"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <br/>
    <fieldset>
        <legend style="font-size:1.3em">
            <strong>&nbsp;&nbsp; CXLC &nbsp;&nbsp;</strong>
        </legend>
        <c:choose>
            <c:when test="${clcManualesCapturaDTO.muestraRegistros}">
                <div id="displayTagDiv" style="width:1000px;overflow:auto;">                                                                             
                    <display:table list="${clcManualesCapturaDTO.clcToInsert}" 
                                   class="displaytag" 
                                   pagesize="10"
                                   export="false" 
                                   id="cxlc" 
                                   requestURI="${requestURI}" 
                                   sort="list">
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcCiclo" 
                                        property="cxlcCiclo" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcNumero" 
                                        property="cxlcNumero" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcSecuencia" 
                                        property="cxlcSecuencia" 
                                        sortable="false"/>
                        
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcUnidadResponsable" 
                                        property="cxlcUnidadResponsable" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcUnidadEjecutora" 
                                        property="cxlcUnidadEjecutora" 
                                        sortable="false"/>
                        
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcEstado" 
                                        property="cxlcEstado" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcFuncion" 
                                        property="cxlcFuncion" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcPrograma" 
                                        property="cxlcPrograma" 
                                        sortable="false"/>
                        
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcActInst" 
                                        property="cxlcActInst" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcActInstPri" 
                                        property="cxlcActInstPri" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcActInstEsp" 
                                        property="cxlcActInstEsp" 
                                        sortable="false"/>                       
                        
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcPartida" 
                                        property="cxlcPartida" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcTipoGasto" 
                                        property="cxlcTipoGasto" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcFuente" 
                                        property="cxlcFuente" 
                                        sortable="false"/>                
                        
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcSecuenciaSiaff" 
                                        property="cxlcSecuenciaSiaff" 
                                        sortable="false"/> 
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcMonto" 
                                        sortable="false"
                                        style="text-align: right;"
                                        format="$ {0,number,#,##0.00}">
                            <div id="monto"><c:out value="${cxlc.cxlcMonto}"/></div>
                        </display:column>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcNota" 
                                        property="cxlcNota" 
                                        sortable="false"/> 
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcIva" 
                                        property="cxlcIva" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcUsuario" 
                                        property="cxlcUsuario" 
                                        sortable="false"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcManuales.cxlcFechaModificacion" 
                                        property="cxlcFechaModificacion" 
                                        sortable="false"
                                        format="{0,date,dd-MM-yyyy}"/>
                                        
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="false"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </c:when>
        </c:choose>
    </fieldset>
    
    <table align="center" width="100%">        
        <tr valign="top">
            <td>
                <table width="100%">
                    <tr>
                        <td align="left" height="20px" valign="middle"> &nbsp; </td>
                    </tr>
                    <tr>
                        <td align="center">
                            <fsn:submit value="submit.save" 
                                        action="clcProceso/clcManualesCxlcGuardar"
                                        progressBar="true"
                                        alertCode="confirm.clc.proceso.manual.captura"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        divs = document.getElementsByTagName('div');
        for (i = 0; i < divs.length; i++) {
            if (divs[i].id == 'monto') {
                divs[i].innerHTML = formato_numero(divs[i].innerHTML,2,'.',',');
            }
        }
        
        function getConsecutivos(verify) {
            var ciclo = $j('select[id="ciclo"]').val();
            //console.log(ciclo);
            $j.ajax({
                url: 'getNumCxlcCallback.do',
                type: 'GET',
                data: 'ciclo=' + ciclo,
                success: function(data) {
                    //console.log("success: " + data);
                    $j('#cxlc').val("");
                    $j('#cxlc').val(data);
                    
                    $j('#numCxlc').val("");
                    $j('#numCxlc').val(data);
                }
            });
        }
        
        function getQnaCaptura(verify) {
            var ciclo = $j('select[id="ciclo"]').val();
            //console.log(ciclo);
            $j.ajax({
                url: 'getQnaCapturaCallback.do',
                type: 'GET',
                data: 'ciclo=' + ciclo,
                success: function(data) {
                    //console.log("success");
                    $j('select[id="qnaCaptura"]').find('option').remove().end();
                    $j('select[id="qnaCaptura"]').append(data);
                    
                    if (verify) {
                        verifyQnaCaptura();
                    }
                }
            });
        }
        function getUnidad(verify) {
            var idTipoNomina = $j('select[id="tipoNomina"]').val();
            //console.log(idTipoNomina);
            if (idTipoNomina != null && idTipoNomina != "") {
            
                if (idTipoNomina == 'DH' || idTipoNomina == 'CE') {
                    $j('#iva').prop('disabled', false);
                    $j('#iva').val(0.00);
                } else {
                    $j('#iva').prop('disabled', true);
                    $j('#iva').val(0.00);
                }
                $j.ajax({
                    url: 'getUnidadCallback.do',
                    type: 'GET',
                    data: 'idTipoNomina=' + idTipoNomina,
                    success: function(data) {
                        //console.log("success");
                        $j('select[id="unidad"]').find('option').remove().end();
                        $j('select[id="unidad"]').append(data);
                        
                        if (verify) {
                            verifyUnidad();
                        }
                    }
                });
                $j.ajax({
                    url: 'getPartidaCallback.do',
                    type: 'GET',
                    data: 'idTipoNomina=' + idTipoNomina,
                    success: function(data) {
                        //console.log("success");
                        $j('select[id="partida"]').find('option').remove().end();
                        $j('select[id="partida"]').append(data);
                        
                        if (verify) {
                            verifyPartida();
                        }
                    }
                });
            }            
        }
        
        function verifyTipoNomina() {
            var idTipoNomina = '<c:out value="${clcManualesCapturaDTO.tipoNomina}"/>';
            //console.log(idTipoNomina);
            if (idTipoNomina != null && idTipoNomina != "") {
                $j("#tipoNomina option[value=" + idTipoNomina +"]").attr("selected","selected") ;
            }
        }
        function verifyQnaCaptura() {
            var qnaCaptura = '<c:out value="${clcManualesCapturaDTO.qnaCaptura}"/>';
            //console.log(qnaCaptura);
            if (qnaCaptura != null && qnaCaptura != "") {
                $j("#qnaCaptura option[value=" + qnaCaptura +"]").attr("selected","selected") ;
            }
        }
        function verifyUnidad() {
            var unidad = '<c:out value="${clcManualesCapturaDTO.unidad}"/>';
            //console.log(unidad);
            if (unidad != null && unidad != "") {
                $j("#unidad option[value=" + unidad +"]").attr("selected","selected") ;
            }
        }
        function verifyPartida() {
            var partida = '<c:out value="${clcManualesCapturaDTO.partida}"/>';
            //console.log(partida);
            if (partida != null && partida != "") {
                $j("#partida option[value=" + partida +"]").attr("selected","selected") ;
            }
        }
        
        // Ciclo
        getQnaCaptura(true);
        //getConsecutivos(true);
        
        // Tipo nomina
        verifyTipoNomina();
        
        // Unidad
        getUnidad(true);
    </script>
</html:form>