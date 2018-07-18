<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
</style>
<html:form modelAttribute="expedienteDatosComplementariosDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" align="center" border="0">
        <tr align="left">
            <td>
                <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.expedientePersonal.title"></spring:message> <fsn:label path="nombreEmpleadoCompleto"/></h1>
            </td>
        </tr>
        <tr>
            <td>
                <table width="100%">
                    <tr>
                        <td align="center">
                            <fieldset>
                                <legend>
                                    <strong><spring:message text="Datos"/></strong>
                                    <img class="fotografia" width="55" src="<spring:theme code="casa.jpg"/>" align="middle"/>       
                                    <strong><spring:message text="personales"/></strong>
                                </legend>
                                <table width="100%">
                                    <tr>
                                        <td align="left">
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>* Datos Complementarios</strong></legend><br/>
                                                <table width="100%">
                                                    <tr>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.telParticular"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="telParticular"
                                                                       uppercase="true" 
                                                                       maxlength="15"
                                                                       size="15" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.celParticular"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="celParticular"
                                                                       uppercase="true" 
                                                                       maxlength="15"
                                                                       size="15" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.emailParticular"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="emailParticular"
                                                                       maxlength="60"
                                                                       size="60" 
                                                                       css="anchoInput"
                                                                       uppercase="false"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.tipoSangre"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcTipoSangre-altaDatosComplementarios"
                                                                            path="tipoSangre"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.genero"></spring:message></td>
                                                        <td align="left">
                                                            <table align="left" width="80%">
                                                                <tr>                        
                                                                    <td align="center">
                                                                        <html:radiobutton value="M" path="genero" label=" Masculino"/>
                                                                    </td>
                                                                    <td align="center">
                                                                        <html:radiobutton value="F" path="genero" label=" Femenino"/>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.padreMadre"></spring:message></td>
                                                        <td align="left">
                                                            <table align="left" width="50%">
                                                                <tr>                        
                                                                    <td align="center">
                                                                        <html:radiobutton value="S" path="padreMadre" label=" SI"/>
                                                                    </td>
                                                                    <td align="center">
                                                                        <html:radiobutton value="N" path="padreMadre" label=" NO"/>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.edoCivil"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcEstadoCivil-altaDatosComplementarios"
                                                                            path="edoCivil"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.tipoDiscapacidad"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcTipoDiscapacidad-altaDatosComplementarios"
                                                                            path="tipoDiscapacidad"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.numRusp"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="numRusp"
                                                                       uppercase="true" 
                                                                       maxlength="7"
                                                                       size="7" 
                                                                       css="anchoInput numeric"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.numSegSoc"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="numSegSoc"
                                                                       uppercase="true" 
                                                                       maxlength="11"
                                                                       size="11" 
                                                                       css="anchoInput numeric"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.hablaIdioma"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcIdioma-altaDatosComplementarios"
                                                                            path="hablaIdioma"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.dominioIdioma"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcDominioIdioma-altaDatosComplementarios"
                                                                            path="dominioIdioma"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.instProtecCivil"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcInstProtCiv-altaDatosComplementarios"
                                                                            path="instProtecCivil"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.espProtecCivil"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcEspProtCiv-altaDatosComplementarios"
                                                                            path="espProtecCivil"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                </table>
                                                <table width="100%">
                                                      <tr align="center">
                                                         <td>&nbsp;</td>
                                                      </tr>
                                                      <tr align="center">
                                                          <td>                                                            
                                                              <c:if test="${expedienteDatosComplementariosDTO.registrar}">
                                                                  <fsn:submit value="submit.save" 
                                                                              path="registrar"
                                                                              action="gestionDocumentos/${expedienteDatosComplementariosDTO.urlDestino}"
                                                                              progressBar="true"
                                                                              alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                              </c:if>
                                                              <fsn:submit value="submit.cancel" 
                                                                          path="cancel" 
                                                                          action="gestionDocumentos/busquedaDocEmpleado.do"
                                                                          progressBar="true"/>
                                                          </td>
                                                      </tr>
                                                 </table>
                                               </fieldset>
                                        </td>
                                    </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                    <tr align="center">
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td align="left" height="20px" valign="middle">
                            <strong>
                                 * Campos requeridos.<br/>
                            </strong>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>
                             <fieldset>
                                <legend style="font-size:1.3em"><strong>Antecedentes de Datos Complementarios</strong></legend>
                                
                                <fsn:filter property="RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                
                                <fsn:pagedList beanName="${expedienteDatosComplementariosDTO.beanName}" 
                                               baseUrl="${expedienteDatosComplementariosDTO.urlOrigen}" 
                                               maxRows="200" 
                                               appendFilters="false">
                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                        <display:table name="${expedienteDatosComplementariosDTO.beanName}" 
                                                       class="displaytag" 
                                                       pagesize="200" 
                                                       export="true" 
                                                       id="row" 
                                                       requestURI="${requestURI}" 
                                                       sort="list">
                                            <c:choose>
                                                <c:when test="${ ((row.idStatus == 'REG' || row.idStatus == 'REC') && (expedienteDatosComplementariosDTO.autorizar || expedienteDatosComplementariosDTO.rechazar)) ||
                                                                  (row.idStatus == 'REG' && expedienteDatosComplementariosDTO.registrar) }">
                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.consulta.docGrupo" 
                                                                    style="text-align: center;">
                                                             <input name="docGrupo" 
                                                                    class="box"
                                                                    type="checkbox" 
                                                                    value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.DoctoRef}"/>"/>
                                                    </display:column>
                                                </c:when>
                                                <c:otherwise>
                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.consulta.docGrupo" 
                                                                    style="text-align: center;">
                                                        - 
                                                    </display:column>
                                                </c:otherwise>
                                            </c:choose>
                                                       
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.telParticular" 
                                                            property="comTelPart" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.celParticular" 
                                                            property="comCelPart" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.emailParticular" 
                                                            property="comEmailPart" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.tipoSangre" 
                                                            property="idTipoSangre" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.genero" 
                                                            property="genero" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.padreMadre" 
                                                            property="comEsPadreMadre" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.edoCivil" 
                                                            property="edoCivil" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.tipoDiscapacidad" 
                                                            property="discapacidad" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.numRusp" 
                                                            property="comNumRusp" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.numSegSoc" 
                                                            property="comNumSegSoc" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.hablaIdioma" 
                                                            property="idioma" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.dominioIdioma" 
                                                            property="dominio" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.instProtecCivil" 
                                                            property="instProt" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.espProtecCivil" 
                                                            property="espProt" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                        </display:table>
                                    </div>
                                </fsn:pagedList>
                            </fieldset>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

    <c:if test="${expedienteCartillaMiliarDTO.autorizar || expedienteCartillaMilitarDTO.rechazar}">
        <script type="text/javascript">
            $j("#telParticular").prop("disabled", true);
            $j("#celParticular").prop("disabled", true);
            $j("#emailParticular").prop("disabled", true);
        </script>
    </c:if>

    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){
            $j('.numeric').numeric();
        });
        
        // Recuperar fila selecccionada
        $j('.box').change(function(){
            disableAutorizaButtons();
            $j('.box:checked').each(function(){
                var auxtelParticular = $j(this).parent().next('td').next('td').text();
                var auxcelParticular = $j(this).parent().next('td').next('td').next('td').text();
                var auxemailParticular = $j(this).parent().next('td').next('td').next('td').text();
                
                $j("#telParticular").val(auxtelParticular);
                $j("#celParticular").val(auxcelParticular);
                $j("#emailParticular").val(auxemailParticular);
                enableAutorizaButtons();
            });
        });

        function disableAutorizaButtons(){
            $j("#10002").attr('disabled','true');
            $j("#10003").attr('disabled','true');
        }
        
        function enableAutorizaButtons(){
            $j("#10002").removeAttr('disabled');
            $j("#10003").removeAttr('disabled');
        }
        
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
    
    <c:if test="${expedienteDatosComplementariosDTO.autorizar || expedienteDatosComplementariosDTO.rechazar}">
        <script type="text/javascript">
            $j(document).ready(function(){
                disableAutorizaButtons();
            });
        </script>
    </c:if>

</html:form>