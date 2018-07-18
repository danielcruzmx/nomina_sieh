<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form name="checkBoxTest" modelAttribute="clcTercerosDTO">
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.clcTerceros.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="60%">
        <tr>                        
            <td align="right">
                <html:radiobutton value="QUINCENAL" path="tipoClc" label=" Quincenal"/>
            </td>
            <td align="left">
                <html:radiobutton value="MENSUAL" path="tipoClc" label=" Mensual"/>
            </td>
        </tr>
        <tr>
            <td height="10px" colspan="2"> &nbsp; </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <fsn:submit value="submit.accept" 
                            path="verificaTipoClc"
                            action="clcProceso/verificaTipoClc"
                            progressBar="true"/>
            </td>
        </tr>
        <tr>
            <td height="20px" colspan="2"> &nbsp; </td>
        </tr>
    </table>
        
    <c:if test="${clcTercerosDTO.verificaTipoClc}">
        <table align="center" width="100%">        
            <tr valign="top">
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em">
                            <strong>&nbsp;&nbsp; Criterios de b&uacute;squeda &nbsp;&nbsp;</strong>
                        </legend>
                        <table>
                            <tr>
                                <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.ciclo"/></td>
                                <td width="200px" align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcCicloProcesaTerceros" 
                                                    path="ciclo" 
                                                    progress="true"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <c:if test="${clcTercerosDTO.tipoClc == 'QUINCENAL'}">
                                <tr id="quincenal">
                                    <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.quincena"/></td>
                                    <td width="200px" align="left">
                                        <fsn:selectList beanName="tdCxlcQnaPagoProcesaTerceros" 
                                                        path="quincena" 
                                                        progress="true"
                                                        parentPath="ciclo"
                                                        style="width: 200px;"
                                                        multiple="true"/>
                                    </td>
                                </tr>
                            </c:if>
                            <c:if test="${clcTercerosDTO.tipoClc == 'MENSUAL'}">
                                <tr id="mensual">
                                    <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.mes"/></td>
                                    <td width="200px" align="left">
                                        <html:select path="mes">
                                            <html:option value="" label="SELECCIONE..."/>
                                            <html:options items="${clcTercerosDTO.mesesValores}" 
                                                          itemValue="clave" 
                                                          itemLabel="valor"/>
                                        </html:select>
                                    </td>
                                </tr>
                            </c:if>
                            <tr>
                                <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.tipoNominaTerceros"/></td>
                                <td width="200px" align="left" align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="${clcTercerosDTO.beanNameTipoNomina}" 
                                                    path="tipoNominaTerceros" 
                                                    progress="true"
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
                                            action="clcProceso/clcTercerosGenera"
                                            progressBar="true"/> &nbsp; 
                                <fsn:submit value="submit.cancel" 
                                            path="cancel"
                                            action="clcProceso/clcTercerosGenera"
                                            progressBar="true"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </c:if>
        
    <br/>
    <fieldset>
        <legend style="font-size:1.3em">
            <strong>&nbsp;&nbsp; N&oacute;minas &nbsp;&nbsp;</strong>
        </legend>
        <c:choose>
            <c:when test="${clcTercerosDTO.muestraRegistros}">
                <fsn:filter property="C.CXLC_CICLO" condition="=" path="ciclo"/>
                <c:choose>
                    <c:when test="${clcTercerosDTO.tipoClc == 'MENSUAL'}">
                        <fsn:filter property="C.CXLC_QNA_PAGO" condition="IN" path="quincenasList"/>
                    </c:when>
                    <c:otherwise>
                        <fsn:filter property="C.CXLC_QNA_PAGO" condition="IN" path="quincenasList"/>
                    </c:otherwise>
                </c:choose>
                <c:if test="${clcTercerosDTO.beanName == 'busquedaClcProcesaTerceros_OTROS'}">
                    <fsn:filter property="S.SEC_GUIA_CONTABLE_EJER" condition="IN" path="guiasContablesList"/>
                </c:if>
                
                <div id="displayTagDiv">
                    <fsn:pagedList beanName="${clcTercerosDTO.beanName}" 
                                   checkbox="true" 
                                   chkProperty="cxlcGrupo" 
                                   baseUrl="clcTerceros"
                                   appendFilters="false">
                                                                               
                        <display:table name="${clcTercerosDTO.beanName}" 
                                       class="displaytag" 
                                       pagesize="10"
                                       decorator="checkboxTableDecorator"
                                       export="true" 
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list">
                             
                             <c:choose>
                                <c:when test="${not empty row.secCxlcTerceros}">
                                    <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcGrupo" 
                                                    style="text-align: center;">
                                        <input name="cxlcGrupo" 
                                               class="box"
                                               type="checkbox" 
                                               value="<c:out value="${row.cxlc}|${row.secCxlcTerceros}"/>" 
                                               disabled="" 
                                               title="Esta clc ya ha sido procesada"/>
                                    </display:column>
                                </c:when>
                                <c:otherwise>
                                    <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcGrupo" 
                                                    style="text-align: center;">
                                        <input name="cxlcGrupo" 
                                               class="box"
                                               type="checkbox" 
                                               value="<c:out value="${row.cxlc}|0"/>"/>
                                    </display:column>
                                </c:otherwise>
                            </c:choose>
                                
                            <c:set var="rojo" value="${row.secCxlcTerceros ne null ? 'color: red;' : ''}"/>
                                
                            <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlc" 
                                            property="cxlc" 
                                            sortable="true"
                                            style="${rojo}"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcQnaPago" 
                                            property="cxlcQnaPago" 
                                            sortable="true"
                                            style="${rojo}"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.idTipoNomina" 
                                            property="idTipoNomina" 
                                            sortable="true"
                                            style="${rojo}"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcComplemento" 
                                            property="cxlcComplemento" 
                                            sortable="true"
                                            style="${rojo}"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.secCxlcTerceros" 
                                            property="secCxlcTerceros" 
                                            sortable="true"
                                            style="${rojo} font-weight: bold;"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcCompromiso" 
                                            property="cxlcCompromiso" 
                                            sortable="true"
                                            style="${rojo}"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.cxlcDevengado" 
                                            property="cxlcDevengado" 
                                            sortable="true"
                                            style="${rojo}"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcTerceros.cuentas.monto" 
                                            property="monto"
                                            class="amount"
                                            sortable="true"
                                            format="$ {0,number,#,##0.00}"
                                            style="text-align: right; ${rojo}"/>
                            
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
                            <span id="montoTotal" style="font-size:2em">Total N&oacute;minas: $ 0.00</span>
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
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.quincenaPago"/></td>
                            <td width="200px" align="left">                                    
                                <html:select path="qnaPago">
                                    <html:option value="" label="SELECCIONE..."/>
                                    <html:options items="${clcTercerosDTO.cicloValoresQnaPago}" 
                                                  itemValue="clave" 
                                                  itemLabel="valor"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.complemento"/></td>
                            <td width="200px" align="left">
                                <fsn:input path="complemento" size="2"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.proceso.clcTerceros.reprocesa"/></td>
                            <td width="200px" align="left">
                                <html:radiobutton value="S" path="checkBoxReprocesa" label=" SI"/>
                                <html:radiobutton value="N" path="checkBoxReprocesa" label=" NO"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
        
    <c:if test="${clcTercerosDTO.muestraErrores}">
        <br/>
        <fieldset>
            <legend style="font-size:1.3em">
                <strong>&nbsp;&nbsp; Errores &nbsp;&nbsp;</strong>
            </legend>
        
            <fsn:filter property="E.CE_CICLO" condition="=" path="ciclo"/>
            <fsn:filter property="E.CE_QNA_PAGO" condition="=" path="qnaPago"/>
            <fsn:filter property="E.ID_TIPO_NOMINA" condition="=" path="tipoNominaTerceros"/>
            <fsn:filter property="E.CE_COMPLEMENTO" condition="=" path="complemento"/>
            
            <div id="displayTagDiv3">
                <fsn:pagedList beanName="clcTercerosErrores"
                               baseUrl="clcTerceros"
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
                            <c:if test="${clcTercerosDTO.muestraErrores}">
                                <fsn:submit value="submit.revisarErrores" 
                                            action="clcProceso/marcaRevisadoExisteErrorTerceros"
                                            alertCode="confirm.clc.proceso.terceros.revisar"
                                            progressBar="true"/> &nbsp; 
                            </c:if>
                            <fsn:submit value="submit.generate" 
                                        path="generar"
                                        action="clcProceso/executeProcedureClcTerceros"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j('.box').change(function(){
            var total = 0;
            var tercerosArray = [];
            var tercerosValidos = false;
            
            $j('.box:checked').each(function(){
                // Monto
                var auxMonto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                total+=parseFloat(auxMonto);
                
                // Terceros
                var auxTerceros = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                if (auxTerceros != null && auxTerceros != '') {
                    tercerosArray.push(auxTerceros);
                    //console.log("Terceros: " + auxTerceros);
                }
            });
            // Monto
            $j("#montoTotal").text("Total N\u00f3minas: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
            
            // Terceros
            var sorted_arr = tercerosArray.sort();
            //console.log("Sorted: " + sorted_arr);
            
            var checkBoxReprocesa = "";
            var selected = $j("input:radio[name=checkBoxReprocesa]:checked");
            if (selected.length > 0) {
                checkBoxReprocesa = selected.val();
            }
            //console.log("checkBoxReprocesa: " + checkBoxReprocesa);
            if (checkBoxReprocesa == 'N' && tercerosArray.length == 0) {
                tercerosValidos = true;
            } else if (tercerosArray.length == 1) {
                tercerosValidos = true;
            } else {
                for (var i = 0; i < tercerosArray.length; i++) {
                    //console.log(sorted_arr[i + 1] + " - " + sorted_arr[i]);
                    if (sorted_arr[i + 1] != null) {
                        if (sorted_arr[i + 1] != sorted_arr[i]) {
                            tercerosValidos = false;
                            break;
                        } else {
                            tercerosValidos = true;
                        }
                    }
                }
            }
            
            if (checkBoxReprocesa == 'S' && tercerosArray.length > 0) {
                if (tercerosValidos) {
                    $j("input[id=10004]").removeAttr("disabled");
                } else {
                    alert("No es posible procesar clc de diferentes terceros.");
                    $j("input[id=10004]").attr("disabled", "disabled");
                }
            }
        });
        
        $j.fn.digits = function(){ 
            return this.each(function(){ 
                $j(this).text($j(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,")); 
            });
        }
        
        $j("input:radio[name=checkBoxReprocesa]").click(function() {
            var checkBoxReprocesa = $j(this).val();            
            if (checkBoxReprocesa == 'S') {
                $j('[name="cxlcGrupo"]').prop('disabled', false);
            }
        });
        
        $j(document).ready(function(){
            $j('#complemento').mask('99');
        });
    </script>
</html:form>
