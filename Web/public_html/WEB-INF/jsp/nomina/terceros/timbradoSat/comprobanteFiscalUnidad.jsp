<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="comprobanteFiscalDTO">

    <h1> <strong> <spring:message code="sireh.label.nomina.reportes.satInpresionCFDI.unidad"/> </strong> </h1> 
    <p>&nbsp;</p>
    
    <table width="100%"  align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr><td></td></tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.terceros.sat.impresion.cfdi.pdf.unidad"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadSinCiclo"
                                                path="unidad"
                                                style="width: 600px;" />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.terceros.sat.impresion.cfdi.pdf.quincena"/></td>
                            <td align="left">
                                <fsn:filter property="N.NOM_QNA_CAPTURA" condition="<=" path="qnaCaptura" />
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="impresionCFDIQnaPago"
                                                path="qnaPago"
                                                progress="true"
                                                appendFilters="false"
                                                style="width: 600px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.terceros.sat.impresion.cfdi.pdf.tipoNomina"/></td>
                            <td>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList parentPath="qnaPago" 
                                                progress="true" 
                                                path="tipoNomina" 
                                                beanName="impresionCFDITipoNomina"
                                                style="width: 600px;" /> 
                            </td>
                        </tr>                        
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.terceros.sat.impresion.cfdi.pdf.consecutivoNomina"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList parentPath="qnaPago" 
                                                filterPaths="tipoNomina"
                                                progress="true" 
                                                path="hpConsecNomina" 
                                                beanName="impresionCFDIConsecutivo"
                                                style="width: 600px;" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <table align="center" width="100%" border="0">
                                    <tr>
                                        <td align="left" colspan="2"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                                    </tr>
                                    <tr>
                                        <td align="right">
                                            <fsn:submit value="submit.search" 
                                                        path="buscar" 
                                                        action="timbradoSat/impresionCfdiPorQna.do"/>
                                        </td>
                                        <c:if test="${comprobanteFiscalDTO.muestraRegistros eq false}">
                                            <td align="left">
                                                <fsn:submit value="submit.clean" 
                                                            path="limpiar" 
                                                            action="timbradoSat/impresionCfdiPorQna.do"/>
                                            </td>
                                        </c:if>
                                        <c:if test="${comprobanteFiscalDTO.muestraRegistros}">
                                            <td align="center">
                                                <fsn:submit value="submit.clean" 
                                                            path="limpiar" 
                                                            action="timbradoSat/impresionCfdiPorQna.do"/>
                                            </td>
                                        </c:if>
                                        <c:if test="${comprobanteFiscalDTO.muestraRegistros}">
                                            <td align="left">
                                                <fsn:submit value="submit.generate" 
                                                            path="procesar"
                                                            action="timbradoSat/generarPdfDeCfdi.do"
                                                            progressIcon="false" />
                                            </td>
                                        </c:if>
                                    </tr>
                                </table>
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
            
            <fsn:filter property="HP.HP_CONSEC_NOMINA" condition="=" path="hpConsecNomina" />

            <c:if test="${comprobanteFiscalDTO.unidad != '0'}">
                <fsn:filter property="HP.ID_UNIDAD_NOM" condition="="  path="unidad" />
            </c:if>
            
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
                        
                        <c:if test="${comprobanteFiscalDTO.unidad == '0'}">
                            <display:column property="unidad"
                                            style="text-align: center;"
                                            titleKey="sireh.label.nomina.movimiento.cambioRfc.unidad" 
                                        sortable="true"/>
                        </c:if>
                        
                                        
                        <display:column property="rfc"
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.movimiento.cambioRfc.rfcEmpleado" 
                                        sortable="true"/>
                        <display:column property="nombre"
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.movimiento.cambioRfc.nombreEmpleado"
                                        sortable="true"/>
                        <display:column property="nivel" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.spc.capcer.registro.registrarCurso.nivelCurso"
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
