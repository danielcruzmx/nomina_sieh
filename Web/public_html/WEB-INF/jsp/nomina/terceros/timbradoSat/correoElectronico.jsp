<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 300px;
    }
</style>

<html:form  modelAttribute="correoElectronicDTO" enctype="multipart/form-data">
    <html:hidden path="dataGrid"/>
    <html:hidden path="panelCorreo"/>
    <html:hidden path="mergedPDF"/>
    <html:hidden path="nameFileZip"/>
    
    <h1> <strong> <spring:message code="sireh.label.nomina.terceros.envioCFDI.empleado"/> </strong> </h1> 
    <p>&nbsp;</p>
    
    <table width="60%"  align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="90%" align="center" border="0">
                        <tr><td colspan="2">&nbsp;</td></tr>
                        <tr>
                            <td  align="right" class="label"> * <spring:message code="sireh.label.merito.label.rfc"></spring:message></td>
                            <td align="left">
                                <fsn:helpRoutine path="rfcEmpleado"
                                                 maxlength="16"
                                                 size="16" 
                                                 disabled="true" 
                                                 beanName="empleadosConstanciaNombramiento"
                                                 width="1000" 
                                                 height="400"  
                                                 fieldMapping="rfcEmpleado, idPlaza, curpEmpleado, primerApellido, segundoApellido, nombreEmpleado" 
                                                 title="Seleccione el RFC"
                                                 leftPosition="17"
                                                 maxRows="150"
                                                 topPosition="20"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.terceros.serica.ciclo"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="ListaCiclosCorreoElectronicoCFDI"
                                                path="ciclo"
                                                style="width: 105px;"/>
                            </td>
                        <tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.desde"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaQuincenasIniCorreoElctronicoCFDI"
                                                path="qnaInicial"
                                                parentPath="ciclo"
                                                progress="true"
                                                style="width: 105px;"/>
                            </td>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.hasta"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listQnasFinCFDIemail"
                                                path="qnaFinal"
                                                progress="true"
                                                parentPath="ciclo"
                                                filterPaths="qnaInicial"
                                                style="width: 105px;"/>
                            </td>
                        </tr>
                        <tr><td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <c:if test="${correoElectronicDTO.panelCorreo}">
            <tr><td>&nbsp;</td></tr>
            <tr>
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em"><strong></strong></legend>
                        <table width="90%"align="center" border="0">
                            <tr>
                                <td class="label"> * <spring:message code="sireh.label.terceros.timbradosat.envioCorreo.correo"></spring:message></td>
                                <td align="left"><html:password path="correoReceptor" size="30" maxlength="360" onchange="validaEmail();"/></td>
                            </tr>
                            <tr>
                                <td class="label"> * <spring:message code="sireh.label.terceros.timbradosat.envioCorreo.correoConfima"></spring:message></td>
                                <td align="left"><html:password path="correoReceptorConfirmar" size="30" maxlength="360" onchange="validaEmailConfirm();" />
                                </td>
                            </tr>
                            <!--<tr>
                                <td colspan="2">
                                    <table width="100%" align="center" border="0">
                                        <tr align="center">
                                            <td class="label"><spring:message code="sireh.label.terceros.timbradosat.envioCorreo.correo.imgAviso"></spring:message></td>
                                            <td align="left">
                                                <input type="file" name="imagen" id="imagen" value="*.*" size="25" class="anchoInput"/>
                                            </td>
                                        
                                            <td class="label"><spring:message code="sireh.label.terceros.timbradosat.envioCorreo.correo.imgAncla"></spring:message></td>
                                            <td align="right"><fsn:input path="ancla" size="25" maxlength="360"/></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>-->
                        </table>
                    </fieldset>
                </td>
            </tr>
        </c:if>
        <tr>
            <td align="center" colspan="2">
                <fsn:submit value="submit.search"
                            path="buscar"
                            action="timbradoSat/correoElectronico.do"
                            progressBar="true"/> &nbsp;
                <fsn:submit value="submit.clean" 
                            path="limpiar" 
                            action="timbradoSat/correoElectronico.do"
                            progressBar="true"/> &nbsp;
                <fsn:submit value="submit.generate" 
                            path="generar" 
                            action="timbradoSat/correoElectronico.do"
                            progressBar="true"/> &nbsp;
                <fsn:submit value="submit.send" 
                            path="enviar"
                            action="timbradoSat/correoElectronico.do"
                            progressBar="true"/> &nbsp;
                <fsn:submit value="submit.download" 
                            path="descargar"
                            action="timbradoSat/descargarZip.do"
                            progressIcon="false"/>
            </td>
        </tr>
    </table>
    
    <c:forEach items="${correoElectronicDTO.adjuntos}" var="itemKeyDTO" varStatus="status">
        <input type="hidden"  name="adjuntos[<c:out value='${status.index}'/>].key" value="<c:out value='${itemKeyDTO.key}'/>" />        
        <input type="hidden"  name="adjuntos[<c:out value='${status.index}'/>].value" value="<c:out value='${itemKeyDTO.value}'/>" />        
     </c:forEach>  
    
    <c:if test="${correoElectronicDTO.dataGrid}">
        <table align="center" width="100%">
            <tr>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td align="center" height="10px" valign="middle">
                    <b>Seleccione una opci&oacute;n:</b><br/>
                    <a href="javascript:checkAll()">+ Seleccionar todas</a><br/>
                    <a href="javascript:uncheckAll()">- Ninguna</a>
                </td>
            </tr>
        </table>
        
        <fsn:filter property="HP.HP_QNA_PAGO>" condition="=" path="qnaInicial"/>
        <fsn:filter property="HP.HP_QNA_PAGO<" condition="=" path="qnaFinal"/>
        <fsn:filter property="CD.CN_RFC" condition="=" path="rfcEmpleado"/>
            
        <fsn:pagedList items="${correoElectronicDTO.listFoliosTnComprobanteDigDTO}"
                       checkbox="true"
                       chkProperty="idGrupo"
                       baseUrl="timbradoSat/correoElectronico"
                       appendFilters="false">
            <div id="displayTagDiv" style="text-align:center;width:auto;height:auto;overflow:auto;">
                <display:table list="${correoElectronicDTO.listFoliosTnComprobanteDigDTO}" 
                               class="displaytag"
                               requestURI="${requestURI}" 
                               pagesize="500"
                               decorator="checkboxTableDecorator"
                               export="true" 
                               id="row"
                               sort="list">
                               
                    <display:column titleKey="sireh.label.nomina.tercero.aportacion.consulta.check"
                                    style="text-align: center">
                        <input name="idGrupo" 
                                class="box"
                                type="checkbox"
                                value='<c:out value="${row.idGrupo}"/>'
                                onclick="javascript:searCheckeds(); "/>
                    </display:column>
                    
                    <display:column property="quincena"
                                    style="text-align: center;"
                                    titleKey="sireh.label.terceros.sat.impresion.cfdi.pdf.quincena" 
                                    sortable="true"/>
                                    
                    <display:column property="cscNomina"
                                    style="text-align: center;"
                                    titleKey="sireh.label.terceros.sat.impresion.cfdi.pdf.cscNomina" 
                                    sortable="true"/>
                                    
                    <display:column property="folio"
                                    style="text-align: center;"
                                    titleKey="sireh.label.terceros.sat.impresion.cfdi.pdf.folio" 
                                    sortable="true"/> 
                                    
                    <display:column property="complemento"
                                    style="text-align: center;"
                                    titleKey="sireh.label.terceros.sat.impresion.cfdi.pdf.complemento" 
                                    sortable="true"/> 
                                    
                    <display:column property="tipoNomina"
                                    style="text-align: center;"
                                    titleKey="sireh.label.terceros.sat.impresion.cfdi.pdf.tipoNomina" 
                                    sortable="true"/>
                                    
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="export.pdf" value="true"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/></span>
                    </display:setProperty>
                </display:table>
            </div>
        </fsn:pagedList>
    </c:if>
    
    <c:if test="${correoElectronicDTO.panelCorreo}" />
    <table width="100%"  align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.2em"><strong> &nbsp;&nbsp;&nbsp;  VISTA PREVIA DEL CORREO &nbsp;&nbsp;&nbsp; </strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td>
                               <c:out value="${correoElectronicDTO.imgTag}" escapeXml="s"/>
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j("#10003").prop("disabled",true);
            $j("#10004").prop("disabled",true);
            $j("#10005").prop("disabled",true);
            
            var value = '<c:out value="${correoElectronicDTO.generar}"/>';
            if(value == 'true'){ $j("#10005").prop("disabled",false); } 
            else if(value == 'false') { $j("#10005").prop("disabled",true); }
            
        function checkAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('idGrupo');
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].setAttribute('checked', true);
                    $j("#10003").prop("disabled",false);
                }
            }
            $j("#10003").prop("disabled",false);
        }
        
        function uncheckAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('idGrupo');
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].removeAttribute('checked');
                }
            }
            $j("#10003").prop("disabled",true);
        }
        
        function searCheckeds(){
            var cont = 0; 
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('idGrupo');
            
            for (var x=0; x < checkboxes.length; x++) {
                if (checkboxes[x].checked) {
                    cont = cont + 1;
                }
            }
            if(cont > 0){
                $j("#10003").prop("disabled",false);
            } 
            else { $j("#10003").prop("disabled",true); }
        }
        
        function validaEmail(){
            var emailRegex = /[\w-\.]{2,}@([\w-]{2,}\.)*([\w-]{2,}\.)[\w-]{2,4}/;
            if (!emailRegex.test($j('#correoReceptor').val())) { 
                alert("El correo proporcionado no tiene un formato valido."); 
                document.getElementById("correoReceptor").focus();
            }
        }
        
        function validaEmailConfirm(){
            var emailRegex = /[\w-\.]{2,}@([\w-]{2,}\.)*([\w-]{2,}\.)[\w-]{2,4}/;
            if (emailRegex.test($j('#correoReceptorConfirmar').val())) {
                $j("#10004").prop("disabled",false);
                $j("#10005").prop("disabled",false);
            } else { 
                alert("El correo proporcionado no tiene un formato valido.");
                document.getElementById("correoReceptorConfirmar").focus();
            }
        }
        
    </script>
    
    
</html:form>
