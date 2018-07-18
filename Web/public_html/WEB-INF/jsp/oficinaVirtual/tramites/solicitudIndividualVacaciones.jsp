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
<html:form modelAttribute="periodoVacacionalDTO" enctype="multipart/form-data">
    <html:hidden path="urlOrigen"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td width="50%">
                <fieldset>
                    <legend style="font-size:1.1em"><strong>DATOS DEL SERVIDOR P&Uacute;BLICO</strong></legend><br/>
                    <table width="100%" align="center" border="0">
                        <tr align="left">
                            <td class="label" width="25%"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.nombre"></spring:message></td>
                            <td  width="25%"><fsn:label path="nombre"/></td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.unidad"></spring:message></td>
                            <td><fsn:label path="descUnidad"/></td>
                        </tr>
                        <tr align="left">
                            <td class="label"  width="25%"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.rfc"></spring:message></td>
                            <td width="25%"><fsn:label path="rfcEmpleado"/></td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.puesto"></spring:message></td>
                            <td><fsn:label path="descPuesto"/></td>
                        </tr>
                        <tr align="left">
                            <td class="label" width="25%"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.nip"></spring:message></td>
                            <td width="25%"><fsn:label path="nip"/></td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.area"></spring:message></td>
                            <td><fsn:label path="descArea"/></td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.FechaIngreso"></spring:message></td>
                            <td><fsn:label path="ingresoDependencia"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/>
    <table align="center" width="100%" border="0">
        <tr>
            <td>
                <div align="left" style="font-size:1.2em; font-weight: bold;">
                       De conformidad con las fracciones III y XIV del apartado B, del articulo 123 Constitucional y 30 de la 
                       Ley Federal de los Trabajadores al Servicio del Estado, solicito disfrutar de vacaciones en el siguiente:
                </div>      
            </td>
        </tr>
    </table>
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>PER&Iacute;ODO</strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr align="left">
                            <td class="label" width="30%">
                                <spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.periodoInicial"/></td>
                            <td width="70%">
                                <fsn:calendar path="fechaInicial" readonly="true"/>&nbsp;&nbsp;&nbsp;
                                <spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.periodoFinal"/>&nbsp;&nbsp;&nbsp;&nbsp;
                                <fsn:calendar path="fechaFinal" readonly="true"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.periodo"/></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcVacacionesPeriodos"
                                                path="idPeriodo"
                                                style="width:200px;"/>&nbsp;
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="cicloVacaciones" 
                                                style="width:100px;"
                                                path="ciclo"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.tipoVacaciones"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcVacacionesTipos"
                                                path="idTipo"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.movimiento"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcVacacionesMovimientos"
                                                path="movimiento"
                                                onchange="ocultarMostrar();"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.diasSolicitados"/></td>
                            <td>
                                <fsn:label path="diasSolicitados"/>
                                <!--<fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="diasSolicitadosVacaciones"
                                                path="diasSolicitados"
                                                style="width:100px;"/> -->
                            </td>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.diasRestantes"/></td>
                            <td>
                                <fsn:label path="diasRestantes"/>
                            </td>
                        </tr>
                        <tr align="left" id="displayTagDiv">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.motivoModifica"/></td>
                            <td><fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcVacacionesMotivos"
                                                path="idMotivo"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%" border="0">
        <tr>
            <td>
                <fieldset>
                <legend style="font-size:1.1em"><strong>Historial</strong></legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td>
                                <fsn:filter property="V.RFC_EMPLEADO" condition="=" path="rfcEmpleado"/>
                                
                                <fsn:pagedList  beanName="${periodoVacacionalDTO.beanName}" 
                                                chkProperty="idCursos" 
                                                baseUrl="${consultaCursoDTO.urlOrigen}" 
                                                appendFilters="false">
                                    <div id="displayTagDivv" style="width:1000px;height:350px;overflow:auto;">
                                        <display:table name="${periodoVacacionalDTO.beanName}"
                                                       class="displaytag"
                                                       pagesize="20"
                                                       export="true"
                                                       requestURI="${requestURI}"
                                                       sort="list">
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.status" 
                                                        property="descEstatus"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.unidad" 
                                                        property="descUnidad"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.puesto" 
                                                        property="descPuesto"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.tipoVacaciones"
                                                        property="descTipo"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.ciclo" 
                                                        property="ciclo"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.periodoV2" 
                                                        property="descPeriodo"/>
                                        
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.diasSolicitadosV2" 
                                                        property="diasSolicitados"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.diasRestantesV2" 
                                                        property="diasRestantes"/>
                                        
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.fechaInicio" 
                                                        format="{0,date,dd/MM/yyyy}"
                                                        property="fechaInicial"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.fechaFin"
                                                        format="{0,date,dd/MM/yyyy}"
                                                        property="fechaFinal"/>
                                                        
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.fechaCaptura"
                                                        format="{0,date,dd/MM/yyyy}"
                                                        property="fechaCaptura"/>
                                                        
                                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                                        <display:setProperty name="export.pdf" value="true"/>
                                        <display:setProperty name="basic.msg.empty_list">
                                            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                        </display:setProperty>
                                    </display:table>
                                </div>
                                </fsn:pagedList>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <script  type="text/javascript">
        $j("#displayTagDiv").prop("disabled", true);
    
        var nav4 = window.Event ? true : false;
        function IsNumber(e){
            var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
           return ((tecla > 47 && tecla < 58) || tecla == 46);
        }
        
        function ocultarMostrar(){
            var motivo = $j("#movimiento").val();
            if(motivo == 'C' || motivo == 'M'){
                $j("#displayTagDiv").removeAttr('disabled');
            }
            else if(motivo == 'S'){
                $j("#displayTagDiv").prop("disabled", true);
            }
        }
        
        $j(function(){
            $j("#displayTagDivv").displayTagAjax();
        });
 </script>
</html:form>   