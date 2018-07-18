<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form name="checkBoxTest" modelAttribute="clcTercerosAjustesDTO">
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.clcTercerosAjustes.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%">        
        <tr valign="top">
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong>&nbsp;&nbsp; Criterios de b&uacute;squeda &nbsp;&nbsp;</strong>
                    </legend>
                    <table>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTercerosAjustes.nominaOrigen"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcDivideBusquedaAjustes" 
                                                path="nominaOrigen" 
                                                progress="true"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td height="10px" colspan="2"></td>
                        </tr>
                        
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.ciclo"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcCicloBusquedaAjustes" 
                                                path="ciclo" 
                                                progress="true"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTercerosAjustes.quincenaPago"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcQnaPagoBusquedaAjustes" 
                                                path="quincena"
                                                progress="true"
                                                parentPath="ciclo"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTercerosAjustes.complemento"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcComplementoBusquedaAjustes" 
                                                path="complemento"
                                                progress="true"
                                                parentPath="quincena"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td height="10px" colspan="2"></td>
                        </tr>
                        
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.tipoNominaTerceros"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcTipoNominaByNominaOrigenBusquedaAjustes" 
                                                path="tipoNominaTerceros"
                                                progress="true"
                                                parentPath="complemento"
                                                filterPaths="ciclo,quincena,nominaOrigen"
                                                style="width: 200px;"/>
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
                            <fsn:submit value="submit.search" 
                                        path="busquedaClc"
                                        action="clcProceso/clcTercerosAjustes"
                                        progressBar="true"/> &nbsp; 
                            <fsn:submit value="submit.cancel" 
                                        path="cancel"
                                        action="clcProceso/clcTercerosAjustes"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <br/>
    <table align="center" width="100%">        
        <tr valign="top">
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong>&nbsp;&nbsp; CLC &nbsp;&nbsp;</strong>
                    </legend>
                    <c:choose>
                        <c:when test="${clcTercerosAjustesDTO.busquedaClc}">
                            
                            <fsn:filter property="C.CXLC_CICLO" condition="=" path="ciclo"/>
                            <fsn:filter property="C.CXLC_QNA_PAGO" condition="=" path="quincena"/>
                            <fsn:filter property="C.ID_TIPO_NOMINA" condition="=" path="tipoNominaTerceros"/>
                            <fsn:filter property="C.CXLC_COMPLEMENTO" condition="=" path="complemento"/>
                            
                            <div id="displayTagDiv">
                                <fsn:pagedList beanName="busquedaClcProcesaTercerosAjustes" 
                                               checkbox="true" 
                                               chkProperty="cxlcGrupo" 
                                               baseUrl="clcTerceros"
                                               appendFilters="false">
                                                                                       
                                    <display:table name="busquedaClcProcesaTercerosAjustes" 
                                                   class="displaytag" 
                                                   pagesize="200"
                                                   decorator="checkboxTableDecorator"
                                                   export="true" 
                                                   id="row" 
                                                   requestURI="${requestURI}" 
                                                   sort="list">
                                        
                                        <display:column titleKey="sireh.label.clc.proceso.clcTercerosAjustes.ajusteGrupo" 
                                                        style="text-align: center;">
                                            <input name="ajusteGrupo" 
                                                   class="boxAjuste"
                                                   type="checkbox" 
                                                   value="<c:out value="${row.cxlc}"/>"/>  
                                        </display:column>
                                        
                                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.nominaOrigen" 
                                                        property="nominaOrigen" 
                                                        sortable="true"/>   
                                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlc" 
                                                        property="cxlc" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcQnaPago" 
                                                        property="cxlcQnaPago" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.idTipoNomina" 
                                                        property="idTipoNomina" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcComplemento" 
                                                        property="cxlcComplemento" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.secCxlcTerceros" 
                                                        property="secCxlcTerceros" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcCompromiso" 
                                                        property="cxlcCompromiso" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcDevengado" 
                                                        property="cxlcDevengado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.monto" 
                                                        property="monto"
                                                        class="amount"
                                                        sortable="true"
                                                        format="$ {0,number,#,##0.00}"
                                                        style="text-align: right;"/>
                                                        
                                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                                        <display:setProperty name="export.pdf" value="true"/>
                                        <display:setProperty name="basic.msg.empty_list">
                                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                                        </display:setProperty>
                                    </display:table>
                                </fsn:pagedList>
                            </div>
                            
                            <table align="center" width="100%">
                                <tr>
                                    <td align="left" height="10px" valign="middle"> &nbsp; </td>
                                </tr>
                                <tr valign="top">
                                    <td align="right">
                                        <span id="montoTotalAjuste" style="font-size:2em">Total ajuste: $ 0.00</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td height="20px"> &nbsp; </td>
                                </tr>
                            </table>
                        </c:when>
                        <c:otherwise>
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </c:otherwise>
                    </c:choose>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <br/>
    <table align="center" width="100%">        
        <tr valign="top">
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong>&nbsp;&nbsp; Procesar &nbsp;&nbsp;</strong>
                    </legend>
                    <table>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTercerosAjustes.signo"/></td>
                            <td width="200px" align="left">
                                <html:select path="signo">
                                    <html:option value="" label="SELECCIONE..."/>
                                    <html:option value="+" label="+"/>
                                    <html:option value="-" label="-"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTercerosAjustes.importeAjuste"/></td>
                            <td width="200px" align="left">
                                <fsn:input path="importeAjuste" size="10"/> &nbsp; <span style="color: red;">Max.+- $25.00</span>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <c:if test="${clcTercerosAjustesDTO.muestraErrores}">
        <br/>
        <fieldset>
            <legend style="font-size:1.3em">
                <strong>&nbsp;&nbsp; Errores &nbsp;&nbsp;</strong>
            </legend>
            
            <fsn:filter property="E.CE_CICLO" condition="=" path="ciclo"/>
            <fsn:filter property="E.CE_QNA_PAGO" condition="=" path="quincena"/>
            <fsn:filter property="E.ID_TIPO_NOMINA" condition="=" path="tipoNominaTerceros"/>
            <fsn:filter property="E.CE_COMPLEMENTO" condition="=" path="complemento"/>
            
            <div id="displayTagDiv3">
                <fsn:pagedList beanName="clcTercerosErrores"
                               baseUrl="clcTercerosCancelados"
                               appendFilters="false">
                               
                    <display:table name="clcTercerosErrores" 
                                   class="displaytag" 
                                   pagesize="10"  
                                   export="true" 
                                   id="row3" 
                                   requestURI="${requestURI}" 
                                   sort="list">
                           
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.id" 
                                        property="ceSecuencia" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.ciclo" 
                                        property="ceCiclo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.quincenaPago" 
                                        property="ceQnaPago" 
                                        sortable="true"/>          
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.tipoNomina" 
                                        property="idTipoNomina" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.complemento" 
                                        property="ceComplemento" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.descError" 
                                        property="descError" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.folio" 
                                        property="idFolio" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.tipoConcepto" 
                                        property="idTipoCpto" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.conceptoPago" 
                                        property="idCptoPago" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.unidad" 
                                        property="idUnidadNom" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.estado" 
                                        property="idEdo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.monto" 
                                        property="ceMonto" 
                                        format="$ {0,number,#,##0.00}"
                                        style="text-align:right"
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.revisado" 
                                        property="revisado" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.usuario" 
                                        property="usuario" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcTerceros.errores.fecha" 
                                        property="fecModifico" 
                                        sortable="true"/>
                                        
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </fsn:pagedList>
            </div>
        </fieldset>
    </c:if>
    
    <table align="left" width="100%">
        <tr>
            <td align="left" height="20px" valign="middle">
                <strong>
                    <spring:message code="sireh.form.required.fields"/>
                </strong>
            </td>
        </tr>
        <tr>
            <td>
                <table width="100%">
                    <tr>
                        <td align="center">
                            <c:if test="${clcTercerosAjustesDTO.muestraErrores}">
                                <fsn:submit value="submit.revisarErrores" 
                                            action="clcProceso/marcaRevisadoExisteErrorTercerAjustes"
                                            alertCode="confirm.clc.proceso.terceros.revisar"
                                            progressBar="true"/> &nbsp; 
                            </c:if>
                            <fsn:submit value="submit.aplicaAjuste" 
                                        action="clcProceso/executeProcedureAplicaCxlcAjustes"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j('[name="ajusteGrupo"]').addClass('uniqueAjuste');
        var $juniqueAjuste = $j('input.uniqueAjuste');
        $juniqueAjuste.click(function() {
            $juniqueAjuste.filter(':checked').not(this).removeAttr('checked');
        });
        
        $j('.boxAjuste').change(function(){
            var total = 0;
            var ajusteGrupo = window.document.getElementsByName('ajusteGrupo');
            
            $j('.boxAjuste:checked').each(function(){
            
                // Folio
                var auxFolio = $j(this).parent().next('td').text();
                
                // Monto
                var auxMonto = $j(this).parent()
                    .next('td').next('td').next('td')
                    .next('td').next('td').next('td')
                    .next('td').next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                //console.log("Folio ajuste: " + auxFolio + " Monto: "+ auxMonto);
                
                var checkedList = window.document.getElementsByName('compensadaGrupo');
                for(var i = 0; i < checkedList.length; i++) {
                    //console.log("List -> " + checkedList[i].value);
                    if (checkedList[i].value != "" && checkedList[i].value == auxFolio && checkedList[i].checked == true) {
                        //console.log("Iguales: " + auxFolio + " - " + checkedList[i].value);
                        checkedList[i].checked = false;
                        
                        var montoOriginal = $j("#montoTotalCompensada").text();
                        montoOriginal = montoOriginal.replace("Total compensada: $ ", "");
                        montoOriginal = montoOriginal.replace(/,/g, "");
                        //console.log("Monto original: " + montoOriginal);
                        
                        var montoNuevo = parseFloat(montoOriginal) - parseFloat(auxMonto);
                        $j("#montoTotalCompensada").text("Total compensada: $ " + parseFloat(Math.round(montoNuevo * 100) / 100).toFixed(2)).digits();
                    }
                }             
                total+=parseFloat(auxMonto);
            });
            // Monto
            $j("#montoTotalAjuste").text("Total ajuste: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
        });
        
        $j.fn.digits = function(){ 
            return this.each(function(){ 
                $j(this).text($j(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,")); 
            });
        }
    </script>
</html:form>