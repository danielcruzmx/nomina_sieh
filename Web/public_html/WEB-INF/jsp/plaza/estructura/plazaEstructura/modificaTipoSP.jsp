<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="modificaTipoSPDTO">
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
    <spring:message code="sireh.label.plaza.estructura.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientosNomina.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.estructura.modificaTipoSP.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="80%" border="0">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.titulo.datosPlaza"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idPlaza"/></td>
                            <td align="left" width="125px"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${modificaTipoSPDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idSitPlaza"/></td>
                            <td align="left" width="200px"><fsn:label path="descSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <c:if test="${modificaTipoSPDTO.datosFisicos}">
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idMuni"/></td>
                                <td align="left"><fsn:label path="idMuniLabel"/></td>
                            </c:if>
                            <c:if test="${modificaTipoSPDTO.datosPresupuestales}">
                                <td align="left" colspan="2"></td>
                            </c:if>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.modificaTipoSP.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.estructura.modificaTipoSP.plazaFinCont"/></td>
                            <td align="left"><fsn:calendar path="plazaFinCont" size="10"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td height="10px"></td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.titulo.datosFisicos"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="20%"/>
                            <col width="30%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idNivelFisico"/></td>
                            <td align="left" width="125px"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.nombramiento"/></td>
                            <td align="left" width="200px"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <c:if test="${modificaTipoSPDTO.datosPresupuestales}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.proyecto"/></td>
                                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.proyectoReduccion"/></td>
                                <td align="left"><fsn:label path="idProyReducePre"/></td>
                            </tr>
                        </c:if>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td height="10px"></td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.titulo.datosServidorPublico"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0" id="tableDatosServidor">
                        <colgroup>
                            <col width="30%"/>
                            <col width="70%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idTipoPlazaActual"/></td>
                            <td align="left" colspan="3"><fsn:label path="idTipoPlazaLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idServPubActual"/></td>
                            <td align="left" colspan="3"><fsn:label path="idServPubLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" width="155px" class="label">* <spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idTipoPlaza"/></td>
                            <td align="left" colspan="3">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcTipoPlazaModificaTipoSP_PE" 
                                                path="idTipoPlaza" 
                                                style="width: 350px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" width="155px" class="label">* <spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idServPub"/></td>
                            <td align="left" colspan="3">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcModificaTipoSP_PE" 
                                                path="idServPub" 
                                                style="width: 350px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.estructura.modificaTipoSP.modificaPuesto"/></td>
                            <td align="left" colspan="3">
                                <html:checkbox path="modificaPuesto"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" width="155px" class="label">* <spring:message code="sireh.label.plaza.estructura.modificaTipoSP.idPuesto"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="${modificaTipoSPDTO.beanNamePuesto}" 
                                                path="idPuesto"
                                                style="width: 350px;"/>
                                
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <table align="center" width="100%" border="0">
                    <tr>
                        <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                    </tr>
                    <tr>
                        <td align="right">
                            <fsn:submit value="submit.accept" action="plazaEstructura/updateModificaTipoSP.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" path="cancel" action="plazaEstructura/consultaModificaTipoSP.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <html:hidden path="beanNamePuesto"/>
    <script type="text/javascript">
         $j(document).ready(function(){
            verificaEstatus();
            $j("input[name='modificaPuesto']").change(function(){
                verificaEstatus();
            });
        });

        function verificaEstatus(){
            if( $j("input[name='modificaPuesto']:checked").val()){
                $j("#tableDatosServidor tr:nth-child(6)").show();
            } else {
            	$j("#tableDatosServidor tr:nth-child(6)").hide();
            } 
       }
    </script>
</html:form>