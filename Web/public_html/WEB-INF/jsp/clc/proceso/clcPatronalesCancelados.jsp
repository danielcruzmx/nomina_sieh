<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form name="checkBoxTest" modelAttribute="clcPatronalesCanceladosDTO">
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.clcPatronalesCancelados.titulo"/></h1>
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
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronalesCancelados.ciclo"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcCicloBusquedaCancelados" 
                                                path="ciclo" 
                                                progress="true"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronalesCancelados.quincenaPago"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcQnaPagoBusquedaCancelados" 
                                                path="quincena"
                                                progress="true"
                                                parentPath="ciclo"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronalesCancelados.complemento"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcComplementoBusquedaCancelados" 
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
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronalesCancelados.tipoNominaPatronales"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcTipoNominaBusquedaPatronalesAjustes" 
                                                path="tipoNominaPatronales"
                                                progress="true"
                                                parentPath="complemento"
                                                filterPaths="ciclo,quincena"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronalesCancelados.clc"/></td>
                            <td width="200px" align="left">
                                <fsn:selectList beanName="tdCxlcBusquedaPatronalesCancelados" 
                                                path="clcCancelacion"
                                                progress="true"
                                                parentPath="tipoNominaPatronales"
                                                filterPaths="ciclo,quincena,complemento"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronales.estado"/></td>
                            <td width="200px" align="left" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcEstadoProcesaPatronalesCancelados" 
                                                path="estado" 
                                                progress="true"
                                                style="width: 200px;"/>
                                
                            </td>
                        </tr>
                        <tr>
                            <td height="10px" colspan="2"></td>
                        </tr>
                        
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcPatronalesCancelados.quincenaCancelacion"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tnCapturaPagoCancBusquedaCancelados" 
                                                path="qnaCancelacion"
                                                progress="true"
                                                style="width: 200px;" />
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
                                        action="clcProcesoPatronales/clcPatronalesCancelados.do"
                                        progressBar="true"/> &nbsp; 
                            <fsn:submit value="submit.cancel" 
                                        path="cancel"
                                        action="clcProcesoPatronales/clcPatronalesCancelados.do"
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
                        <strong>&nbsp;&nbsp; Recuperaciones &nbsp;&nbsp;</strong>
                    </legend>
                    <c:choose>
                        <c:when test="${clcPatronalesCanceladosDTO.busquedaClc}">
                
                            <fsn:filter property="P.CPC_QNA_APLICA" condition="IN" path="quincenasList"/>                           
                            <fsn:filter property="C.ID_CPTO_PAGO" condition="IN" path="conceptoPagoList"/>
                            <c:if test="${clcPatronalesCanceladosDTO.tipoNominaPatronales == 'N2'}">
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
                            <div id="displayTagDiv" style="width:1000px;height:300px;overflow:auto;">
                                <fsn:pagedList beanName="canceladosProcesaTerceros" 
                                               checkbox="true" 
                                               chkProperty="folioGrupo" 
                                               baseUrl="clcPatronalesCancelados"
                                               appendFilters="false">
                                                                                           
                                    <display:table name="canceladosProcesaTerceros" 
                                                   class="displaytag" 
                                                   pagesize="200"
                                                   decorator="checkboxTableDecorator"
                                                   export="true" 
                                                   id="row" 
                                                   requestURI="${requestURI}" 
                                                   sort="list">
                                                        
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.compensadaGrupo" 
                                                        style="text-align: center;">
                                            <c:choose>
                                                <c:when test="${row.aplicado == 2}">
                                                    <input name="compensadaGrupo" 
                                                           class="boxCompensada"
                                                           type="checkbox" 
                                                           value="<c:out value="${clcPatronalesCanceladosDTO.ciclo}|${clcPatronalesCanceladosDTO.clcCancelacion}|${row.hpFolio}|${row.hpDifFolio}|${row.idTipoCpto}|${row.idCptoPago}|2201|${row.monto}|${row.idUnidad}|${row.idGrupopagoNom}|${row.idEdoNom}"/>"
                                                           title="Este cheque ya esta aplicado"
                                                           disabled=""/>
                                                </c:when>
                                                <c:otherwise>
                                                    <input name="compensadaGrupo" 
                                                           class="boxCompensada"
                                                           type="checkbox" 
                                                           value="<c:out value="${clcPatronalesCanceladosDTO.ciclo}|${clcPatronalesCanceladosDTO.clcCancelacion}|${row.hpFolio}|${row.hpDifFolio}|${row.idTipoCpto}|${row.idCptoPago}|2201|${row.monto}|${row.idUnidad}|${row.idGrupopagoNom}|${row.idEdoNom}"/>"/>
                                                </c:otherwise>
                                            </c:choose>
                                            <input name="compensadaGrupoArrayValores" 
                                                   type="checkbox"
                                                   style="display:none"
                                                   value="<c:out value="${row.hpFolio}|${row.hpDifFolio}|2201|${row.idCptoPago}|${row.idTipoCpto}|${row.monto}|${row.idUnidad}|${row.idGrupopagoNom}|${row.idEdoNom}"/>"/>
                                        </display:column>
                                        
                                        <c:set var="rojo" value="${row.aplicado == 2 ? 'color: red;' : ''}"/>
                                        
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.folioGrupo" 
                                                        property="hpFolio" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.hpDifFolio" 
                                                        property="hpDifFolio" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                                        
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.quincenaAplica" 
                                                        property="cpcQnaAplica" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.hpNumComplem" 
                                                        property="hpNumComplem" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.idUnidad" 
                                                        property="idUnidad" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.idEdoNom" 
                                                        property="idEdoNom" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.tipoConcepto" 
                                                        property="idTipoCpto" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.conceptoPago" 
                                                        property="idCptoPago" 
                                                        sortable="true"
                                                        style="${rojo}"/>        
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.guiaContable" 
                                                        sortable="true"
                                                        style="${rojo}" 
                                                        value="2201"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.grupoPago" 
                                                        property="idGrupopagoNom" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.monto" 
                                                        property="monto" 
                                                        class="amount"
                                                        sortable="true"
                                                        format="$ {0,number,#,##0.00}"
                                                        style="text-align: right; ${rojo}"/>
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.atentaNota" 
                                                        property="cpcAtentaNota" 
                                                        sortable="true"
                                                        style="${rojo}"/>
                                        
                                        <display:column titleKey="sireh.label.clc.proceso.clcPatronales.quincenas.aplicado" 
                                                        sortable="true"
                                                        style="text-align: center; ${rojo}">
                                            <c:out value="${row.aplicado == 2 ? 'Aplicado' : 'No Aplicado'}"/>
                                        </display:column>
                                
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
                                        <span id="montoTotalCompensada" style="font-size:2em">Total compensada: $ 0.00</span>
                                    </td>
                                </tr>
                                <%--tr valign="top">
                                    <td align="right">
                                        <span id="montoTotalTrabajador" style="font-size:2em">Total trabajador: $ 0.00</span>
                                    </td>
                                </tr--%>
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
    
    <c:if test="${clcPatronalesCanceladosDTO.muestraErrores}">
        <br/>
        <fieldset>
            <legend style="font-size:1.3em">
                <strong>&nbsp;&nbsp; Errores &nbsp;&nbsp;</strong>
            </legend>
            
            <fsn:filter property="E.CE_CICLO" condition="=" path="ciclo"/>
            <fsn:filter property="E.CE_QNA_PAGO" condition="=" path="qnaCancelacion"/>
            <fsn:filter property="E.ID_TIPO_NOMINA" condition="=" path="tipoNominaPatronales"/>
            <fsn:filter property="E.CE_COMPLEMENTO" condition="=" path="complemento"/>
            
            <div id="displayTagDiv3">
                <fsn:pagedList beanName="clcPatronalesErrores"
                               baseUrl="clcPatronalesCancelados"
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
                            <c:if test="${clcPatronalesCanceladosDTO.muestraErrores}">
                                <fsn:submit value="submit.revisarErrores" 
                                            action="clcProcesoPatronales/marcaRevisadoExisteErrorPatronalesCancelados"
                                            alertCode="confirm.clc.proceso.terceros.revisar"
                                            progressBar="true"/> &nbsp; 
                            </c:if>
                            <fsn:submit value="submit.aplicaCancelados" 
                                        action="clcProcesoPatronales/executeProcedureAplicaCxlcCancelado"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${clcPatronalesCanceladosDTO.busquedaDisabled}">
            <script type="text/javascript">
                $j("#10001").prop("disabled",true);
            </script>
        </c:when>
        <c:otherwise>
            <script type="text/javascript">
                $j("#10001").prop("disabled",false);
            </script>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j('.boxCompensada').change(function(){
            var total = 0;
            var compensadaGrupo = window.document.getElementsByName('compensadaGrupo');
            var compensadaGrupoArrayValores = window.document.getElementsByName('compensadaGrupoArrayValores');
                
            $j('.boxCompensada').each(function(){
                for(var i = 0; i < compensadaGrupo.length; i++) {
                    if (compensadaGrupo[i].checked == true) {
                        compensadaGrupoArrayValores[i].checked = true;
                    } else {
                        compensadaGrupoArrayValores[i].checked = false;
                    }
                }
            });
            
            $j('.boxCompensada:checked').each(function(){
                for(var i = 0; i < compensadaGrupo.length; i++) {
                    if (compensadaGrupo[i].checked == true) {
                        compensadaGrupoArrayValores[i].checked = true;
                    } else {
                        compensadaGrupoArrayValores[i].checked = false;
                    }
                }
                
                var llave = "";
                var auxCiclo = '<c:out value="${clcPatronalesCanceladosDTO.ciclo}"/>';
                var auxCxlc = '<c:out value="${clcPatronalesCanceladosDTO.clcCancelacion}"/>';
        
                // Folio
                var auxFolio    = $j(this).parent().next('td').text();
                var auxDifFolio = $j(this).parent().next('td').next('td').text();
                var auxTipoCpto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxCptoPag  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxGuia     = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                llave = auxCiclo + "|" + auxCxlc + "|" + auxFolio + "|" + auxDifFolio + "|" + auxTipoCpto + "|" + auxCptoPag + "|" + auxGuia;
                
                // Monto
                var auxMonto = $j(this).parent()
                    .next('td').next('td').next('td')
                    .next('td').next('td').next('td')
                    .next('td').next('td').next('td')
                    .next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                //console.log("Folio compensada: " + llave + " Monto: "+ auxMonto);
                
                var checkedList = window.document.getElementsByName('trabajadorGrupo');
                var checkedListArrayValores = window.document.getElementsByName('trabajadorGrupoArrayValores');
                for(var i = 0; i < checkedList.length; i++) {
                    //console.log("List -> " + checkedList[i].value);
                    if (checkedList[i].value != "" && checkedList[i].value == llave && checkedList[i].checked == true) {
                        //console.log("Iguales: " + llave + " - " + checkedList[i].value);
                        checkedList[i].checked = false;
                        checkedListArrayValores[i].checked = false;
                        
                        var montoOriginal = $j("#montoTotalTrabajador").text();
                        montoOriginal = montoOriginal.replace("Total trabajador: $ ", "");
                        montoOriginal = montoOriginal.replace(/,/g, "");
                        //console.log("Monto original: " + montoOriginal);
                        
                        var montoNuevo = parseFloat(montoOriginal) - parseFloat(auxMonto);
                        $j("#montoTotalTrabajador").text("Total trabajador: $ " + parseFloat(Math.round(montoNuevo * 100) / 100).toFixed(2)).digits();
                    }
                }
                total+=parseFloat(auxMonto);
            });
            $j("#montoTotalCompensada").text("Total compensada: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
        });
        
        $j('.boxTrabajador').change(function(){
            var total = 0;
            var trabajadorGrupo = window.document.getElementsByName('trabajadorGrupo');
            var trabajadorGrupoArrayValores = window.document.getElementsByName('trabajadorGrupoArrayValores');
            
            $j('.boxTrabajador').each(function(){
                for(var i = 0; i < trabajadorGrupo.length; i++) {
                    if (trabajadorGrupo[i].checked == true) {
                        trabajadorGrupoArrayValores[i].checked = true;
                    } else {
                        trabajadorGrupoArrayValores[i].checked = false;
                    }
                }
            });
            
            $j('.boxTrabajador:checked').each(function(){
                for(var i = 0; i < trabajadorGrupo.length; i++) {
                    if (trabajadorGrupo[i].checked == true) {
                        trabajadorGrupoArrayValores[i].checked = true;
                    } else {
                        trabajadorGrupoArrayValores[i].checked = false;
                    }
                }
                
                var llave = "";
                var auxCiclo = '<c:out value="${clcPatronalesCanceladosDTO.ciclo}"/>';
                var auxCxlc = '<c:out value="${clcPatronalesCanceladosDTO.clcCancelacion}"/>';
                
                // Folio
                var auxFolio    = $j(this).parent().next('td').text();
                var auxDifFolio = $j(this).parent().next('td').next('td').text();
                var auxTipoCpto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxCptoPag  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxGuia     = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                llave = auxCiclo + "|" + auxCxlc + "|" + auxFolio + "|" + auxDifFolio + "|" + auxTipoCpto + "|" + auxCptoPag + "|" + auxGuia;
                
                // Monto
                var auxMonto = $j(this).parent()
                    .next('td').next('td').next('td')
                    .next('td').next('td').next('td')
                    .next('td').next('td').next('td')
                    .next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                //console.log("Folio trabajador: " + llave + " Monto: "+ auxMonto);
                
                var checkedList = window.document.getElementsByName('compensadaGrupo');
                var checkedListArrayValores = window.document.getElementsByName('compensadaGrupoArrayValores');
                for(var i = 0; i < checkedList.length; i++) {
                    //console.log("List -> " + checkedList[i].value);
                    if (checkedList[i].value != "" && checkedList[i].value == llave && checkedList[i].checked == true) {
                        //console.log("Iguales: " + llave + " - " + checkedList[i].value);
                        checkedList[i].checked = false;
                        checkedListArrayValores[i].checked = false;
                        
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
            $j("#montoTotalTrabajador").text("Total trabajador: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
        });
        
        $j.fn.digits = function(){ 
            return this.each(function(){ 
                $j(this).text($j(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,")); 
            });
        }
        
        function checkAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('compensadaGrupo');
        
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].setAttribute('checked', true);
                } else {
                    checkboxes[i].removeAttribute('checked');
                }
            }
            
            var checkboxes2 = new Array();
            checkboxes2 = document.getElementsByName('compensadaGrupoArrayValores');
            
            for (var i = 0; i < checkboxes2.length; i++) {
                if (checkboxes2[i].type == 'checkbox' && checkboxes2[i].disabled == false) {
                    checkboxes2[i].setAttribute('checked', true);
                } else {
                    checkboxes2[i].removeAttribute('checked');
                }
            }
            // Monto
            getTotal();
        }
        
        function uncheckAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('compensadaGrupo');
        
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].removeAttribute('checked');
                }
            }
            
            var checkboxes2 = new Array();
            checkboxes2 = document.getElementsByName('compensadaGrupoArrayValores');
            
            for (var i = 0; i < checkboxes2.length; i++) {
                if (checkboxes2[i].type == 'checkbox' && checkboxes2[i].disabled == false) {
                    checkboxes2[i].removeAttribute('checked');
                }
            }
            // Monto
            $j("#montoTotalCompensada").text("Total compensada: $ 0.00");
        }
        
        function getTotal() {
            var total = 0;
            
            $j('.boxCompensada:checked').each(function(){
                // Monto
                var auxMonto = $j(this).parent().next('td').next('td').next('td')
                                                .next('td').next('td').next('td')
                                                .next('td').next('td').next('td')
                                                .next('td').next('td').text();
                auxMonto = auxMonto.replace("$ ", "");
                auxMonto = auxMonto.replace(/,/g, "");
                total+=parseFloat(auxMonto);
            });
            // Monto
            $j("#montoTotalCompensada").text("Total compensada: $ " + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();
        }
    </script>
</html:form>