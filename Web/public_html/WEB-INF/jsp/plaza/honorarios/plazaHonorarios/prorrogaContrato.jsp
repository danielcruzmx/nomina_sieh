<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="prorrogaContratoDTO">
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.honorarios.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="85%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.titulo.datosPlaza"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="25%"/>
                            <col width="25%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.idPlaza"/></td>
                            <td align="left" width="125px"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina plaza="${prorrogaContratoDTO.idPlaza}" image="detail.gif" /></td>
                            <td align="right" width="160px" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.idSitPlaza"/></td>
                            <td align="left" width="200px"><fsn:label path="descSitPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.idUnidad"/></td>
                            <td align="left"><fsn:label path="idUnidadLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.idPuesto"/></td>
                            <td align="left"><fsn:label path="idPuestoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.idEdo"/></td>
                            <td align="left"><fsn:label path="idEdoLabel"/></td>
                            <td align="left" colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.ultimoMovto"/></td>
                            <td align="left"><fsn:label path="ultimoMovto"/></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.plazaFinCont"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.titulo.datosNomina"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="25%"/>
                            <col width="25%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.idNivelFisico"/></td>
                            <td align="left" width="125px"><fsn:label path="nivelFisicoLabel"/></td>
                            <td align="right" width="160px" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.nombramiento"/></td>
                            <td align="left" width="200px"><fsn:label path="nombramientoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.idZonaEco"/></td>
                            <td align="left"><fsn:label path="idZonaEcoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.idRango"/></td>
                            <td align="left"><fsn:label path="idRangoLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.sueldo"/></td>
                            <td align="left"><fsn:label path="sueldoLabel"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.compensacion"/></td>
                            <td align="left"><fsn:label path="compensacionLabel"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.importeHonorario"/></td>
                            <td align="left"><c:out value="$"/><html:input path="importeHonorarioString" size="10" onblur="importe()"/></td>
                            <td colspan="2"></td>
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
                        <strong><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.titulo.datosEmpleado"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <colgroup>
                            <col width="20%"/>
                            <col width="30%"/>
                            <col width="25%"/>
                            <col width="25%"/>
                        </colgroup>
                        <tr>
                            <td align="right" width="155px" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.rfcEmpleado"/></td>
                            <td align="left" width="125px"><fsn:label path="rfcEmpleadoLabel"/></td>
                            <td align="right" width="160px" class="label"><spring:message code="sireh.label.plaza.honorarios.prorrogaContrato.nombreEmpleado"/></td>
                            <td align="left" width="200px">
                                <fsn:label path="primerApellidoLabel"/> <fsn:label path="segundoApellidoLabel"/> <fsn:label path="nombreEmpleadoLabel"/>
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
                            <fsn:submit value="submit.accept" action="plazaHonorarios/updateProrrogaContrato.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" path="cancel" action="plazaHonorarios/consultaProrrogaContrato.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">        
        function importe() {
            var importeHonorarioValue = $j("#importeHonorarioString").val();
            
            if (importeHonorarioValue != null) {
                importeHonorarioValue = importeHonorarioValue.replace("$", "");
                importeHonorarioValue = importeHonorarioValue.replace(/\,/g,"");
            } else {
                importeHonorarioValue = 0;
            }
            
            var amount = parseFloat(Math.round(importeHonorarioValue * 100) / 100).toFixed(2);
            $j("#importeHonorarioString").val(amount).digits();
        }
        
        $j.fn.digits = function(){ 
            return this.each(function(){ 
                $j(this).val($j(this).val().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,")); 
            });
        }
        
        importe();
    </script>
</html:form>