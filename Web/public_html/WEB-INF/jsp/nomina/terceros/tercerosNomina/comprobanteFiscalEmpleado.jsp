<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="comprobanteFiscalDTO">

    <h1> <strong> <spring:message code="sireh.label.nomina.reportes.satInpresionCFDI.empleado"/> </strong> </h1> 
    <p>&nbsp;</p>
    
    <table width="100%"  align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr><td></td></tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena.inicial"/></td>
                            <td align="left">
                                <fsn:filter property="hp.hp_qna_pago" condition="<=" path="qnaCaptura" />
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="qnaCapturaCFDI"
                                                path="qnaIniEmpl"
                                                progress="true"
                                                appendFilters="false"
                                                style="width: 200px;"/>
                            </td>
                            
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena.final"/></td>
                            <td align="left">
                                <fsn:filter property="hp.hp_qna_pago" condition="<=" path="qnaCaptura" />
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="qnaCapturaCFDIParent"
                                                path="qnaFinEmpl"
                                                parentPath="qnaIniEmpl"
                                                progress="true"
                                                appendFilters="false"
                                                style="width: 150px;"/>
                            </td>
                            
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
                            <td align="left" colspan="6"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                        </tr>
                        <tr>
                            <td align="center" colspan="6">
                                <fsn:submit value="submit.search" 
                                            path="buscar" 
                                            action="tercerosNomina/comprobanteFiscalEmpleado.do"/>
                            
                                <fsn:submit value="submit.clean" 
                                            path="limpiar" 
                                            action="tercerosNomina/comprobanteFiscalEmpleado.do"/>
                            
                                <fsn:submit value="submit.generate" 
                                            path="procesar"
                                            action="tercerosNomina/generarPdfDeCfdi.do"
                                            progressIcon="false" />
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${comprobanteFiscalDTO.muestraRegistros}">
            <table align="center" width="100%">
                <tr>
                    <td height="20px"> &nbsp; </td>
                </tr>
                <tr>
                    <td align="center" height="10px" valign="middle">
                        <b>Seleccione una opci&oacute;n:</b><br/>
                        <a href="javascript:checkAll()">+ Seleccionar todas</a><br/>
                        <a href="javascript:uncheckAll()">- Ninguna</a>
                    </td>
                </tr>
            </table>
            
            <fsn:filter property="C.CN_RFC" condition="=" path="rfcEmpleado" />
            <fsn:filter property="H.HP_QNA_PAGO" condition=">=" path="qnaIniEmpl" />
            <fsn:filter property="H.HP_QNA_PAGO" condition="<=" path="qnaFinEmpl" />
            <fsn:pagedList beanName="${comprobanteFiscalDTO.beanName}"
                           checkbox="true"
                           chkProperty="idGrupo"
                           baseUrl="${comprobanteFiscalDTO.urlOrigen}"
                           appendFilters="false">
                <div id="displayTagDiv" style="text-align:center;width:1000px;height:500px;overflow:auto;">
                    <display:table name="${comprobanteFiscalDTO.beanName}" 
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
                        
                        <display:column property="ID_DESC_UNIDAD"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.unidad" 
                                        sortable="true"/>
                        <display:column property="NOMBRES_EMPLEADO"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.nombreEmpleado" 
                                        sortable="true"/>
                        <display:column property="HP_QNA_PAGO"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.qna" 
                                        sortable="true"/>
                        <display:column property="HP_NUM_COMPLEM"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.complemento" 
                                        sortable="true"/>  
                        <display:column property="CN_FOLIO"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.folio" 
                                        sortable="true"/>
                        <display:column property="CN_DIF_FOLIO"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.diffolio" 
                                        sortable="true"/>
                        <display:column property="CN_PAQUETE"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.idpaquete" 
                                        sortable="true"/>                
                        <display:column property="CN_CONSEC_NOMINA"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.consecnomina" 
                                        sortable="true"/>
                        <display:column property="ID_TIPO_NOMINA"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.tnomina" 
                                        sortable="true"/>
                        <display:column property="DESC_SIT_PAGO"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.situacpago" 
                                        sortable="true"/>
                        <display:column property="HP_NETO_PAGO"
                                        style="text-align: center;"
                                        titleKey="sireh.label.tercero.aportacion.sat.impresion.empleado.netopago" 
                                        sortable="true"/>
                                        
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
        </c:when>
        <c:otherwise>
            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j("#10003").prop("disabled",true);
        
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
            } else { $j("#10003").prop("disabled",true); }
        }
        
    </script>
    
    
</html:form>
