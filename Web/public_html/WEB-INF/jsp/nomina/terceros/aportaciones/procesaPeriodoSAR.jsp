<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form name="checkBoxTest" modelAttribute="procesaPeriodoSARTercerosDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.nomina.tercero.aportacion.titulo"/></h1>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="90%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.nomina.tercero.aportacion.ciclo"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="cicloUnidadSAR-FOV" 
                                                path="ciclo"
                                                style="width: 106px;"/>
                            </td>
                         </tr>
                         <tr align="left">
                            <td class="label"><spring:message code="sireh.label.nomina.tercero.aportacion.bimestre"></spring:message></td>
                            <td>
                                <html:select path="bimestre">
                                    <html:option value="" label="SELECCIONE..."/>
                                    <html:options items="${procesaPeriodoSARTercerosDTO.bimestresValores}" 
                                                  itemValue="clave" 
                                                  itemLabel="valor"
                                                  cssStyle="width: 106px;"/>
                                </html:select>
                            </td>
                         </tr>
                    </table>
                    <table width="100%">
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.search" 
                                            path="muestraRegistros"
                                            action="sarFovissste/${procesaPeriodoSARTercerosDTO.urlOrigen}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="sarFovissste/${procesaPeriodoSARTercerosDTO.urlOrigen}"
                                            progressBar="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${procesaPeriodoSARTercerosDTO.muestraRegistros}">
            
            <table align="center" width="100%">
                <tr>
                    <td height="20px"> &nbsp; </td>
                </tr>
                <tr>
                    <td align="right" height="10px" valign="middle">
                        <b>Seleccione una opci&oacute;n:</b><br/>
                        <a href="javascript:checkAll()">+ Seleccionar todas</a><br/>
                        <a href="javascript:uncheckAll()">- Ninguna</a>
                    </td>
                </tr>
            </table>
            
            <fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition="IN" path="quincenas"/>
            <fsn:pagedList beanName="${procesaPeriodoSARTercerosDTO.beanName}" 
                           checkbox="true" 
                           chkProperty="idGrupo" 
                           baseUrl="${procesaPeriodoSARTercerosDTO.urlOrigen}" 
                           appendFilters="false">
                <div id="displayTagDiv" style="text-align:center;width:1000px;height:500px;overflow:auto;">
                    <display:table name="${procesaPeriodoSARTercerosDTO.beanName}" 
                                   class="displaytag"
                                   requestURI="${requestURI}" 
                                   pagesize="500"
                                   decorator="checkboxTableDecorator" 
                                   export="true" 
                                   id="row"
                                   sort="list">
                        
                        <display:column property="checkbox" 
                                        style="text-align: center" 
                                        titleKey="sireh.label.nomina.tercero.aportacion.consulta.check" 
                                        media="html"/>
                        <display:column property="idQna"
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.tercero.aportacion.consulta.idQna" 
                                        sortable="true"/>
                        <display:column property="qnaCaptura"
                                        style="text-align: center;" 
                                        titleKey="sireh.label.nomina.tercero.aportacion.consulta.qnaCaptura"
                                        sortable="true"/>
                        <display:column property="numComplem" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.tercero.aportacion.consulta.complemento"
                                        sortable="true"/>
                        <display:column property="descripcion" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.tercero.aportacion.consulta.descripcion"
                                        sortable="true"/>
                        <display:column property="tipoNomina" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.tipoNomina"
                                        sortable="true"/>
                        <display:column property="grupoPago" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.tercero.aportacion.consulta.grupoPago"
                                        sortable="true"/>
                        <display:column property="descEstadoNom" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.nomina.tercero.aportacion.consulta.status"
                                        sortable="true"/> 
                        
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
            <table width="100%">
                <tr align="center">
                    <td>
                        <fsn:submit value="submit.procesar" 
                                    path="procesar"
                                    action="sarFovissste/procesaPeriodoSAR.do"
                                    progressBar="true"
                                    alertCode="confirm.sarfovissste.procesar"/>
                    </td>
                </tr>
            </table>
        </c:when>
        <c:otherwise>
            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        function getBimestre(verify) {
            var ciclo = $j('select[id="ciclo"]').val();
            //console.log(ciclo);
            $j.ajax({
                url: 'getBimestreCallback.do',
                type: 'GET',
                data: 'ciclo=' + ciclo,
                success: function(data) {
                    //console.log("success");
                    $j('select[id="bimestre"]').find('option').remove().end();
                    $j('select[id="bimestre"]').append(data);
                    
                    if (verify) {
                        verifyQnaAplicacion();
                    }
                }
            });
        }
    </script>
    
    <script type="text/javascript">
        function checkAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('idGrupo');
        
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].setAttribute('checked', true);
                }
            }
        }
        
        function uncheckAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('idGrupo');
        
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].removeAttribute('checked');
                }
            }
        }
    </script>
</html:form>