<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form name="checkBoxTest" modelAttribute="clcPatronalesDTO">
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.clcPatronales.titulo"/></h1>
    <p>&nbsp;</p>
    
    <html:hidden path="beanName"/>
    
    <table align="center" width="30%">
        <tr>                        
            <td align="center">
                <html:radiobutton value="QUINCENAL" path="tipoClc" label=" Quincenal"/>
            </td>
            <td align="center">
                <html:radiobutton value="MENSUAL" path="tipoClc" label=" Mensual"/>
            </td>
            <td align="center">
                <html:radiobutton value="BIMESTRAL" path="tipoClc" label=" Bimestral"/>
            </td>
        </tr>
        <tr>
            <td height="10px" colspan="3"> &nbsp; </td>
        </tr>
        <tr>
            <td colspan="3" align="center">
                <fsn:submit value="submit.accept" 
                            path="verificaTipoClc"
                            action="clcProcesoPatronales/verificaTipoClc"
                            progressBar="true"/>
            </td>
        </tr>
        <tr>
            <td height="20px" colspan="3"> &nbsp; </td>
        </tr>
    </table>
        
    <c:if test="${clcPatronalesDTO.verificaTipoClc}">
        <table align="center" width="100%">        
            <tr valign="top">
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em">
                            <strong>&nbsp;&nbsp; Criterios de b&uacute;squeda &nbsp;&nbsp;</strong>
                        </legend>
                        <table>
                            <tr>
                                <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronales.ciclo"/></td>
                                <td width="200px" align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcCicloProcesaPatronales" 
                                                    path="ciclo" 
                                                    progress="true"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <c:if test="${clcPatronalesDTO.tipoClc == 'QUINCENAL' || clcPatronalesDTO.tipoClc == 'BIMESTRAL'}">
                                <tr id="quincenal">
                                    <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronales.quincena"/></td>
                                    <td width="200px" align="left">
                                        <fsn:selectList beanName="tdCxlcQnaPagoProcesaPatronales" 
                                                        path="quincena" 
                                                        progress="true"
                                                        parentPath="ciclo"
                                                        style="width: 200px;"
                                                        multiple="true"/>
                                    </td>
                                </tr>
                            </c:if>
                            <c:if test="${clcPatronalesDTO.tipoClc == 'MENSUAL'}">
                                <tr id="mensual">
                                    <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronales.mes"/></td>
                                    <td width="200px" align="left">
                                        <html:select path="mes">
                                            <html:option value="" label="SELECCIONE..."/>
                                            <html:options items="${clcPatronalesDTO.mesesValores}" 
                                                          itemValue="clave" 
                                                          itemLabel="valor"/>
                                        </html:select>
                                    </td>
                                </tr>
                            </c:if>
                            <tr>
                                <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronales.tipoNominaPatronales"/></td>
                                <td width="200px" align="left" align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="${clcPatronalesDTO.beanNameTipoNomina}" 
                                                    path="tipoNominaPatronales" 
                                                    progress="true"
                                                    style="width: 200px;"/>
                                    
                                </td>
                            </tr>
                            <tr>
                                <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronales.estado"/></td>
                                <td width="200px" align="left" align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEstadoProcesaPatronales" 
                                                    path="estado" 
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
                                            action="clcProcesoPatronales/clcPatronalesGenera"
                                            progressBar="true"/> &nbsp; 
                                <fsn:submit value="submit.cancel" 
                                            path="cancel"
                                            action="clcProcesoPatronales/clcPatronalesGenera"
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
            <c:when test="${clcPatronalesDTO.muestraRegistros}">
                <c:choose>
                    <c:when test="${clcPatronalesDTO.tipoClc == 'MENSUAL'}">
                        <fsn:filter property="H.HP_QNA_PAGO" condition="IN" path="quincenasList"/>
                    </c:when>
                    <c:otherwise>
                        <fsn:filter property="H.HP_QNA_PAGO" condition="IN" path="quincenasList"/>
                    </c:otherwise>
                </c:choose>
                
                <fsn:filter property="C.ID_CPTO_PAGO" condition="IN" path="conceptoPagoList"/>
                
                <c:if test="${clcPatronalesDTO.tipoNominaPatronales == 'N2'}">
                    <fsn:filter property="H.ID_EDO_NOM" condition="=" path="estado"/>
                </c:if>
                
                <table align="center" width="100%">
                    <tr>
                        <td height="20px"> &nbsp; </td>
                    </tr>
                    <tr>
                        <td align="right" height="10px" valign="middle">
                            <b>Seleccione una opci&oacute;n:</b><br/>
                            <a href="javascript:checkAll()">+ Seleccionar Todos</a><br/>
                            <a href="javascript:uncheckAll()">- Ninguno</a>
                        </td>
                    </tr>
                </table>
                <fsn:pagedList beanName="${clcPatronalesDTO.beanName}" 
                               checkbox="true" 
                               chkProperty="nominaGrupo" 
                               baseUrl="clcPatronales"
                               appendFilters="false">
                    <div id="displayTagDiv">                                                               
                        <display:table name="${clcPatronalesDTO.beanName}" 
                                       class="displaytag" 
                                       pagesize="200"
                                       decorator="checkboxTableDecorator"
                                       export="true" 
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list">
                             
                            <display:column titleKey="sireh.label.clc.proceso.clcPatronales.cuentas.nominaGrupo" 
                                            style="text-align: center;">
                                <input name="nominaGrupo" 
                                       class="box"
                                       type="checkbox" 
                                       value="<c:out value="${row.idNomina}|0"/>"/>
                            </display:column>
                            <display:column titleKey="sireh.label.clc.proceso.clcPatronales.cuentas.idNomina" 
                                            property="idNomina" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcPatronales.cuentas.hpQnaPago" 
                                            property="hpQnaPago" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcPatronales.cuentas.idTipoNomina" 
                                            property="idTipoNomina" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcPatronales.cuentas.hpNumComplemento" 
                                            property="hpNumComplem" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.clc.proceso.clcPatronales.cuentas.monto" 
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
                    </div>
                </fsn:pagedList>
                    
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
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronales.quincenaPago"/></td>
                            <td width="200px" align="left">                                    
                                <html:select path="qnaPago">
                                    <html:option value="" label="SELECCIONE..."/>
                                    <html:options items="${clcPatronalesDTO.cicloValoresQnaPago}" 
                                                  itemValue="clave" 
                                                  itemLabel="valor"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronales.complemento"/></td>
                            <td width="200px" align="left">
                                <fsn:input path="complemento" size="2"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.proceso.clcPatronales.reprocesa"/></td>
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
        
    <c:if test="${clcPatronalesDTO.muestraErrores}">
        <br/>
        <fieldset>
            <legend style="font-size:1.3em">
                <strong>&nbsp;&nbsp; Errores &nbsp;&nbsp;</strong>
            </legend>
        
            <fsn:filter property="E.CE_CICLO" condition="=" path="ciclo"/>
            <fsn:filter property="E.CE_QNA_PAGO" condition="=" path="qnaPago"/>
            <fsn:filter property="E.ID_TIPO_NOMINA" condition="=" path="tipoNominaPatronales"/>
            <fsn:filter property="E.CE_COMPLEMENTO" condition="=" path="complemento"/>
            
            <div id="displayTagDiv3">
                <fsn:pagedList beanName="clcPatronalesErrores"
                               baseUrl="clcPatronales"
                               appendFilters="false">
                               
                    <display:table name="clcPatronalesErrores" 
                                   class="displaytag" 
                                   pagesize="10"  
                                   export="true" 
                                   id="row3" 
                                   requestURI="${requestURI}" 
                                   sort="list">
                                       
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.id" 
                                        property="ceSecuencia" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.ciclo" 
                                        property="ceCiclo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.quincenaPago" 
                                        property="ceQnaPago" 
                                        sortable="true"/>          
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.tipoNomina" 
                                        property="idTipoNomina" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.complemento" 
                                        property="ceComplemento" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.descError" 
                                        property="descError" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.folio" 
                                        property="idFolio" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.tipoConcepto" 
                                        property="idTipoCpto" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.conceptoPago" 
                                        property="idCptoPago" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.unidad" 
                                        property="idUnidadNom" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.estado" 
                                        property="idEdo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.monto" 
                                        property="ceMonto" 
                                        format="$ {0,number,#,##0.00}"
                                        style="text-align:right"
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.revisado" 
                                        property="revisado" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.usuario" 
                                        property="usuario" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.errores.fecha" 
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
                            <c:if test="${clcPatronalesDTO.muestraErrores}">
                                <fsn:submit value="submit.revisarErrores" 
                                            action="clcProcesoPatronales/marcaRevisadoExisteErrorPatronales"
                                            alertCode="confirm.clc.proceso.terceros.revisar"
                                            progressBar="true"/> &nbsp; 
                            </c:if>
                            <fsn:submit value="submit.generate" 
                                        path="generar"
                                        action="clcProcesoPatronales/executeProcedureClcPatronales"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        function checkAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('nominaGrupo');
        
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].setAttribute('checked', true);
                }
            }
            // Monto
            getTotal();
        }
        
        function uncheckAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('nominaGrupo');
        
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].removeAttribute('checked');
                }
            }
            // Monto
            $j("#montoTotal").text("Total N\u00f3minas: $ 0.00");
        }
        
        function getTotal() {
            var total = 0;
            
            $j('.box:checked').each(function(){
                // Monto
                var auxMonto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                total+=parseFloat(auxMonto);
            });
            // Monto
            $j("#montoTotal").text("Total N\u00f3minas: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
        }
        
        $j('.box').change(function(){
            var total = 0;
            var tercerosArray = [];
            var tercerosValidos = false;
            
            $j('.box:checked').each(function(){
                // Monto
                var auxMonto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                total+=parseFloat(auxMonto);
            });
            // Monto
            $j("#montoTotal").text("Total N\u00f3minas: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
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