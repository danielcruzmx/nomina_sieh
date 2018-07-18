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

<html:form modelAttribute="clcManualesArchivoDTO" method="post" enctype="multipart/form-data">
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.clcManualesArchivo.titulo"/></h1>
    <p>&nbsp;</p>
    
    <html:hidden path="secuencia"/>
    <html:hidden path="numCxlc"/>
    <html:hidden path="inicio"/>
    <html:hidden path="nombreArchivoErrores"/>
    
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
                                                onchange="getQnaAplicacion(false);"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.complemento"/></td>
                            <td width="200px" align="left">
                                <fsn:input path="complemento" size="2"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.tipoNomina"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcTipoNominaProcesaManualesArchivo" 
                                                path="tipoNomina" 
                                                progress="true"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr id="trPlurianual">
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.Plurianual"/></td>
                            <td width="200px" align="left">
                               <fsn:input path="plurianual" size="3"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.qnaAplicacion"/></td>
                            <td width="200px" align="left">
                                <select name='qnaAplicacion' id='qnaAplicacion'>
                                    <option value=''>SELECCIONE...</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.partida"/></td>
                            <td width="200px" align="left">
                                <fsn:input path="partidaCaptura" size="5"/>
                            </td>
                        </tr>
                        <tr>   
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcManualesCaptura.archivoAProcesar"></spring:message></td>
                            <td width="200px" align="left"><input type="file" name="file" id="file"/></td>            
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
                            <fsn:submit value="submit.cargarArchivo" 
                                        action="clcProceso/clcManualesCargarArchivo"
                                        progressBar="true"/> &nbsp; 
                            <fsn:submit value="submit.cancel" 
                                        path="cancel"
                                        action="clcProceso/clcManualesArchivo"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <c:if test="${clcManualesArchivoDTO.muestraErrores}">
        <br/>
        <table align="center" width="100%">        
            <tr valign="top">
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em">
                            <strong>&nbsp;&nbsp; Errores &nbsp;&nbsp;</strong>
                        </legend>
                        <table>
                            <tr>
                                <td width="250px" align="right" class="label"><spring:message code="sireh.label.plaza.masivas.cancelacion.mensaje.validacion"></spring:message></td>
                                <td><fsn:label path="mensaje" /></td>
                            </tr>
                            <c:if test="${!clcManualesArchivoDTO.archivoValido && !clcManualesArchivoDTO.plantillaErronea}">
                                <tr>
                                    <td width="250px" align="right" class="label"><spring:message code="sireh.label.plaza.masivas.cancelacion.archivo"></spring:message></td>
                                    <td>
                                        <fsn:link action="notaDeMerito/downloadFile" parameters="nombreArchivoErrores=${clcManualesArchivoDTO.nombreArchivoErrores}" progressIcon="false" >
                                            <c:out value="${clcManualesArchivoDTO.nombreArchivoErrores}" />
                                        </fsn:link>
                                    </td>
                                </tr>
                            </c:if>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:if>
    
    <c:if test="${clcManualesArchivoDTO.muestraRegistros}">
        <%--
        <br/>
        <fieldset>
            <legend style="font-size:1.3em">
                <strong>&nbsp;&nbsp; CXLC &nbsp;&nbsp;</strong>
            </legend>
            <div id="displayTagDiv" style="width:1000px;overflow:auto;">                                                                             
                <display:table list="${clcManualesArchivoDTO.clcToInsert}" 
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
        </fieldset>
        --%>
        
        <br/>
        <fieldset>
            <legend style="font-size:1.3em">
                <strong>&nbsp;&nbsp; Secuencias &nbsp;&nbsp;</strong>
            </legend>
            
                <fsn:pagedList items="${clcManualesArchivoDTO.listaClcManualCorrecta}" 
                               baseUrl="clcManualesPaginadorArchivo"
                               appendFilters="false">
                    <div id="displayTagDiv2" style="width:1000px;height:300px;overflow:auto;">
                        <display:table list="${clcManualesArchivoDTO.listaClcManualCorrecta}" 
                                       class="displaytag" 
                                       pagesize="100"
                                       export="false" 
                                       id="sec_cxlc" 
                                       requestURI="${requestURI}" 
                                       sort="list">
                            <display:column titleKey="sireh.label.clc.proceso.clcManuales.secuencia.unidad" 
                                            property="unidadArchivo" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcManuales.secuencia.estado" 
                                            property="estadoArchivo" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcManuales.secuencia.monto" 
                                            sortable="true"
                                            style="text-align: right;"
                                            format="$ {0,number,#,##0.00}">
                                <div id="monto"><c:out value="${sec_cxlc.montoArchivo}"/></div>
                            </display:column>
                            <display:column titleKey="sireh.label.clc.proceso.clcManuales.secuencia.partida" 
                                            property="partidaArchivo" 
                                            sortable="true"/>
                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                            <display:setProperty name="export.pdf" value="false"/>
                            <display:setProperty name="basic.msg.empty_list">
                                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                            </display:setProperty>
                        </display:table>
                    </div>
                </fsn:pagedList>
            
            <table align="center" width="100%">
                <tr>
                    <td align="left" height="10px" valign="middle"> &nbsp; </td>
                </tr>
                <tr valign="top">
                    <td align="right">
                        <span id="montoTotal" style="font-size:2em">La cxlc actualmente es por un monto de: $ <c:out value='${clcManualesArchivoDTO.montoTotal}'/> </span>
                    </td>
                </tr>
                <tr>
                    <td height="20px"> &nbsp; </td>
                </tr>
            </table>
        </fieldset>
    </c:if>
    
    <c:if test="${clcManualesArchivoDTO.archivoValido}">
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
                                            action="clcProceso/clcManualesGuardarArchivo"
                                            progressBar="true"
                                            alertCode="confirm.clc.proceso.manual.archivo"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </c:if>
    
    <c:forEach items="${clcManualesArchivoDTO.listaClcManualCorrecta}" var="listaClcManualCorrectaDTO" varStatus="status">
        <input type="hidden"  name="secuenciaGrupo[<c:out value='${status.index}'/>]" value="<c:out value="${listaClcManualCorrectaDTO.unidadArchivo}|${listaClcManualCorrectaDTO.estadoArchivo}|${listaClcManualCorrectaDTO.montoArchivo}|${listaClcManualCorrectaDTO.partidaArchivo}|${listaClcManualCorrectaDTO.tipoCptoArchivo}|${listaClcManualCorrectaDTO.tipoMovtoArchivo}"/>" />
    </c:forEach>
    
    <script type="text/javascript">
        function getQnaAplicacion(verify) {
            var ciclo = $j('select[id="ciclo"]').val();
            //console.log(ciclo);
            $j.ajax({
                url: 'getQnaCapturaCallback.do',
                type: 'GET',
                data: 'ciclo=' + ciclo,
                success: function(data) {
                    //console.log("success");
                    $j('select[id="qnaAplicacion"]').find('option').remove().end();
                    $j('select[id="qnaAplicacion"]').append(data);
                    
                    if (verify) {
                        verifyQnaAplicacion();
                    }
                }
            });
        }
        
        function verifyTipoNomina() {
            var idTipoNomina = '<c:out value="${clcManualesArchivoDTO.tipoNomina}"/>';
            //console.log(idTipoNomina);
            if (idTipoNomina != null && idTipoNomina != "") {
                $j("#tipoNomina option[value=" + idTipoNomina +"]").attr("selected","selected") ;
            }
        }
        function verifyQnaAplicacion() {
            var qnaAplicacion = '<c:out value="${clcManualesArchivoDTO.qnaAplicacion}"/>';
            //console.log(qnaAplicacion);
            if (qnaAplicacion != null && qnaAplicacion != "") {
                $j("#qnaAplicacion option[value=" + qnaAplicacion +"]").attr("selected","selected") ;
            }
        }
        
        // Ciclo
        getQnaAplicacion(true);
        
        // Tipo nomina
        verifyTipoNomina();
        
        $j(document).ready(function(){
            $j('#complemento').mask('99');
            $j('#partidaCaptura').mask('99999');
            togglePlurianual();
        });
        
        $j('#tipoNomina').change(function(){
            togglePlurianual();
        });

        function togglePlurianual(){
            if($j('#tipoNomina').val() == 'NS' || $j('#tipoNomina').val() == 'SC' || $j('#tipoNomina').val() == 'GM' || $j('#tipoNomina').val() == 'MD'){
                $j('#trPlurianual').show();
            } else{
                $j('#trPlurianual').hide();
            }
        }        
        divs = document.getElementsByTagName('div');
        for (i = 0; i < divs.length; i++) {
            if (divs[i].id == 'monto') {
                divs[i].innerHTML = formato_numero(divs[i].innerHTML,2,'.',',');
            }
        }
        
        $j('.boxSecuencia').change(function(){
            var total = 0;
            var secuenciaGrupo = window.document.getElementsByName('secuenciaGrupo');
            
            $j('.boxSecuencia:checked').each(function(){
                // Monto
                var auxMonto = $j(this).parent().next('td').next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                total+=parseFloat(auxMonto);
            });
            // Monto
            $j("#montoTotal").text("La cxlc actualmente es por un monto de: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
        });
        
        $j.fn.digits = function(){ 
            return this.each(function(){ 
                $j(this).text($j(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,")); 
            });
        }
        
        $j(function(){
            $j("#displayTagDiv2").displayTagAjax();
        });
    </script>
</html:form>