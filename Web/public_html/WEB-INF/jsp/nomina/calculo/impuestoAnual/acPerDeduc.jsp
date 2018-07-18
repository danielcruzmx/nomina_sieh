<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form name="checkBoxTest" modelAttribute="administracionAnualDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1>
        <spring:message code="calculo.menu"/>&#45;
        <spring:message code="calculo.admonanual"/>&#45;
        <spring:message code="gestionanuacuper.gestion.anuacuper"/>
    </h1>
    <p>&nbsp;</p>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="95%" align="center" border="0">
                        <tr><td>&nbsp;</td></tr>
                        <tr align="left">
                            <td class="label">* <spring:message code="sireh.label.nomina.impuesto.anual.parametros.deducciones.ciclo"></spring:message></td>
                            <td>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="cicloRegControl" 
                                                path="ciclo"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%">* TIPO DE CONCEPTO</td>
                            <td align="left" colspan="2">
                                <html:radiobutton value="h" path="origenDep" id="origenSHCP" label="S.H.C.P." />
                                <html:radiobutton value="s" path="origenDep" id="origenSAT"  label="S.A.T." />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%">* Origen</td>
                            <td align="left" colspan="2">
                                <html:radiobutton value="r" path="origen" id="origenRFC" label="R.F.C." onclick="toggle(this); "/>&nbsp;&nbsp;&nbsp;&nbsp;
                                <html:radiobutton value="u" path="origen" id="origennUnidad" label="UNIDAD" onclick="toggle(this); "/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="3">
                                <div id="rfcc" style="display:none">
                                    <table align="center" width="100%" border="0">
                                        <tr>
                                            <td align="right" class="label"  width="20%"> <spring:message code="sireh.label.reportes.unidad.notrequired"></spring:message></td>
                                            <td align="left" colspan="2">
                                            <fsn:option key="0" value="selectList.nonValue"/>
                                            <fsn:selectList beanName="tcUnidadSinCiclo" path="unidad" multiple="true" />
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="unidadd"  style="display:none">
                                    <table align="center" width="100%" border="0">
                                        <tr>
                                            <td  align="right" class="label" width="20%"><spring:message code="sireh.label.reportes.rfc"></spring:message></td>
                                            <td align="left"  colspan="2">
                                                <fsn:helpRoutine path="rfcEmpleado" maxlength="16" size="22"  disabled="false" beanName="EmpleadosDetalle" width="1000" 
                                                height="400"  fieldMapping="rfcEmpleado" title="Seleccione el RFC" maxRows="200" leftPosition="17" topPosition="20"/>
                                            </td> 
                                        </tr>
                                    </table>
                                </div>
                            </td>
                        </tr>
                    </table>
                    <table width="95%" align="center" border="0">
                        <tr><td align="left"><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.accept" 
                                            path="muestraRegistros"
                                            action="impuestoAnual/${administracionAnualDTO.urlOrigen}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="impuestoAnual/${administracionAnualDTO.urlOrigen}"
                                            progressBar="true"/>
                            </td>
                            <tr><td>&nbsp;</td></tr>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        window.onload = enCargaInicial;
        function toggle(elemento){
            if(elemento.value == 'u'){
                //document.forms[0].getElementById("rfcc").style.display = "block";
                document.getElementById("rfcc").style.display = "block";
                document.getElementById("unidadd").style.display = "none";
            }
            else if(elemento.value == 'r'){
                document.getElementById("rfcc").style.display = "none";
                document.getElementById("unidadd").style.display = "block";
            }
        }
        
        function enCargaInicial(){
            if(document.getElementById("origenRFC").checked){
                document.getElementById("rfcc").style.display = "none";
                document.getElementById("unidadd").style.display = "block";
            }
            if(document.getElementById("origennUnidad").checked){
                document.getElementById("rfcc").style.display = "block";
                document.getElementById("unidadd").style.display = "none";
            }
        }
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>