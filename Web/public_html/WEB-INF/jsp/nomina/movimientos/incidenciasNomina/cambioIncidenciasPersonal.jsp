<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>



<html:form modelAttribute="gestionIncidenciasPersonalDTO">
    
    <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'L'}">
        <h1><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.licenciasMedicas.titulo"></spring:message></h1>
    </c:if>
    <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'F'}" >
        <h1><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.faltas.titulo"></spring:message></h1>
    </c:if>
    <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'D'}">
        <h1><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.diasEconomicos.titulo"></spring:message></h1>
    </c:if>
    <p>&nbsp;</p>
    <div style="display: table; border-spacing: 10px; margin-left: auto; margin-right: auto;" >
        <div style="display: table-row; padding:10px;">
            <div style="display: table-cell; vertical-align: top; padding:10px;">
                <table align="center" width="100%">
                    <tr>
                        <td>
                            <fieldset>
                                <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.datosEmpleado.header"/></strong></legend>
                                <table align="center" width="100%">
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.rfcEmpleado"/></td>
                                        <td align="left"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${gestionIncidenciasPersonalDTO.rfcEmpleado}" image="detail.gif" /></td>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.primerApellido"/></td>
                                        <td align="left"><fsn:label path="primerApellido"/></td>
                                    </tr>
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.segundoApellido"/></td>
                                        <td align="left"><fsn:label path="segundoApellido"/></td>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.nombreEmpleado"/></td>
                                        <td align="left"><fsn:label path="nombreEmpleado"/></td>
                                    </tr>
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.idPlaza"/></td>
                                        <td align="left"><fsn:label path="idPlaza"/></td>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.idPuestoNom"/></td>
                                        <td align="left"><fsn:label path="idPuestoNom"/></td>
                                    </tr>
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.idNivelPto"/></td>
                                        <td align="left"><fsn:label path="idNivelPto"/></td>
                                    </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    <div style="display: table; border-spacing: 10px; margin-left: auto; margin-right: auto;" >
        <div style="display: table-row; padding:10px; margin-left: auto; margin-right: auto;">
            <table align="center" width="100%">
                <tr>
                    <td>
                        <fieldset>
                            <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'L'}">
                                <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.header.licenciasMedicas"/></strong></legend>
                            </c:if>
                            <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'F'}" >
                                <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.header.faltas"/></strong></legend>
                            </c:if>
                            <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'D'}" >
                                <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.header.diasEconomicos"/></strong></legend>
                            </c:if>

                            <div style="display: table-cell; vertical-align: top; width:60%; padding:10px;" >
                                <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'L'}">
                                    <h1 align="center"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.header.licenciasMedicasAsignadas"></spring:message></h1>
                                </c:if>
                                <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'F'}" >
                                    <h1 align="center"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.header.faltasAsignadas"></spring:message></h1>
                                </c:if>
                                <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'D'}" >
                                    <h1 align="center"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.header.diasEconomicosAsignados"></spring:message></h1>
                                </c:if>
                                <div style="overflow-y: scroll; overflow-x: hidden; height: 320px; ">
                                    <display:table list="${gestionIncidenciasPersonalDTO.listaIncidenciasPersonal}" class="displaytag" export="false" id="row" requestURI="${requestURI}" sort="list">
                                        <display:column style="width: 5%" >
                                            <html:checkbox path="idMovimientos" value="${row.idMovtoConceptoPago}" disabled="${row.idSitCaptura == 'T'}" />
                                        </display:column>
                                        <display:column sortable="true" titleKey="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.mcpFecIncidencia" format="{0,date,dd/MM/yyyy}" property="mcpFecIncidencia"/>
                                        <display:column sortable="true" titleKey="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.descConcepto" property="descConcepto"/>
                                        <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'L'}">    
                                            <display:column sortable="true" titleKey="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.mcpMonto" format="{0,number,#,###.##}" property="mcpMonto"/>
                                        </c:if>
                                        <display:column sortable="true" titleKey="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.idSitCaptura" property="descSitCaptura"/>
                                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                                        <display:setProperty name="basic.msg.empty_list">
                                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                                        </display:setProperty>
                                    </display:table>
                                </div>
                            </div>
                            <div style="display: table-cell; vertical-align: top; padding:10px; width:40%;">
                                <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'L'}">
                                    <h1 align="center"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.header.capturaLicencias"></spring:message></h1>
                                </c:if>
                                <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'F'}" >
                                    <h1 align="center"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.header.capturaFaltas"></spring:message></h1>
                                </c:if>
                                <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'D'}" >
                                    <h1 align="center"><spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.header.capturaDiasEconomicos"></spring:message></h1>
                                </c:if>
                                <table>
                                     <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'F'}" >
                                        <tr>
                                            <td align="right" class="label">*<spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.tipoIncidencia"></spring:message></td>
                                            <td align="left">
                                                <fsn:filter property="ID_TIPO_CPTO" condition="=" path="idTipoCptoFilter"/>
                                                <fsn:filter property="ID_CONCEPTO" condition="in" path="idConceptoFilter"/>
                                                <fsn:option key="0" value="selectList.nonValue" />
                                                <fsn:selectList beanName="tcConceptoPago" path="idConcepto" />
                                            </td>
                                        </tr>
                                    </c:if>
                                    <tr>
                                        <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'L'}">
                                            <td align="right" class="label">*<spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.fechaIncidenciaSeleccionada"/></td>
                                        </c:if>
                                        <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'F'}" >
                                            <td align="right" class="label">*<spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.fechaIncidenciaSeleccionada"/></td>
                                        </c:if>
                                        <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'D'}" >
                                            <td align="right" class="label">*<spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.fechaIncidenciaSeleccionada"/></td>
                                        </c:if>
                                        <td align="left">
                                            <div class="main-wrapper" style="z-index:0;">
                                                <input id="datepicker-example1" name="fechaIncidenciaSeleccionada" />
                                            </div>
                                         </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">
                                            <div id="container" style="margin: 10px 0 0 0; width: 220px; height: 240px;"></div>
                                        </td>
                                    </tr>
                                    <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'D'}">
                                        <tr>
                                            <td colspan="2">
                                                <spring:message code="sireh.label.nomina.movimiento.cambioIncidenciasPersonal.notaDisabled"></spring:message>    
                                            </td>
                                        </tr>
                                    </c:if>
                                    <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'L'}" >
                                        <tr>
                                            <td colspan="2">
                                                <html:radiobutton value="sinSueldo" path="tipoLicencia" label="Licencia sin sueldo"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2">
                                                <html:radiobutton value="medioSueldo" path="tipoLicencia" label="Licencia medio sueldo"/>
                                            </td>
                                        </tr>
                                    </c:if>
                                </table>
                            </div>
                        </fieldset>
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <table align="center" width="50%">
        <tr>
            <td align="center" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
    </table>
    <table align="center">
        <tr>
            <td>
                <fsn:submit value="submit.add" path="add" action="incidenciasNomina/addIncidencia.do" />
                <c:if test="${gestionIncidenciasPersonalDTO.mostrarEliminar}">
                    <fsn:submit value="submit.delete" action="incidenciasNomina/deleteIncidencias.do" path="delete" alertCode="confirm.multiple.delete"/>
                </c:if>
                <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'L' and gestionIncidenciasPersonalDTO.mostrarCalcular}">
                    <fsn:submit value="submit.calcular" action="incidenciasNomina/calcularIncidencias.do" />
                </c:if>
                <c:if test="${gestionIncidenciasPersonalDTO.mostrarAceptar}">
                    <fsn:submit value="submit.save" action="incidenciasNomina/updateIncidencias.do"/>&nbsp;
                </c:if>
                <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'L'}">
                    <fsn:submit value="submit.cancel" path="cancel" action="incidenciasNomina/gestionLicenciasMedicas.do" />
                </c:if>
                <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'F'}">
                    <fsn:submit value="submit.cancel" path="cancel" action="incidenciasNomina/gestionFaltas.do" />
                </c:if>
                 <c:if test="${gestionIncidenciasPersonalDTO.tipoIncidencia == 'D'}">
                    <fsn:submit value="submit.cancel" path="cancel" action="incidenciasNomina/gestionDiasEconomicos.do" />
                </c:if>
            </td>
        </tr>
    </table>
    
    <html:hidden path="idZonaEcoNom" />
    <html:hidden path="idRangoNom" />
    <html:hidden path="fechaLimiteInferior" />
    <html:hidden path="fechaLimiteSuperior" />
    <html:hidden path="fechasMedioSueldoRegexp" />
    <html:hidden path="fechasSinSueldoRegexp" />
    <html:hidden path="fechasFaltaRegexp" />
    <html:hidden path="fechasDiasEconomicosRegexp" />
    <html:hidden path="fechasDisabled" />
    <html:hidden path="startDate" />
    <html:hidden path="mcpMonto" />
    <html:hidden path="mostrarCalcular" />
    <html:hidden path="mostrarAceptar" />
    <html:hidden path="mostrarEliminar" />
    <html:hidden path="idConceptoFilter" />
    <html:hidden path="idTipoCptoFilter" />
    <html:hidden path="tipoIncidencia" />
    
    
    <c:forEach items="${gestionIncidenciasPersonalDTO.listaIncidenciasPersonal}" var="incidenciaPersonalDTO" varStatus="status">
        <fmt:formatDate value="${incidenciaPersonalDTO.mcpFecIncidencia}" pattern="dd/MM/yyyy" var="newdatevar" />
        <input type="hidden"  name="listaIncidenciasPersonal[<c:out value='${status.index}'/>].idMovtoConceptoPago" value="<c:out value='${incidenciaPersonalDTO.idMovtoConceptoPago}'/>" />
        <input type="hidden" name="listaIncidenciasPersonal[<c:out value='${status.index}'/>].mcpFecIncidencia" value="<c:out value='${newdatevar}'/>" />
        <input type="hidden" name="listaIncidenciasPersonal[<c:out value='${status.index}'/>].idConcepto" value="<c:out value='${incidenciaPersonalDTO.idConcepto}'/>"/>
        <input type="hidden" name="listaIncidenciasPersonal[<c:out value='${status.index}'/>].descConcepto" value="<c:out value='${incidenciaPersonalDTO.descConcepto}'/>"/>
        <input type="hidden" name="listaIncidenciasPersonal[<c:out value='${status.index}'/>].mcpMonto" value="<c:out value='${incidenciaPersonalDTO.mcpMonto}'/>"/>
        <input type="hidden" name="listaIncidenciasPersonal[<c:out value='${status.index}'/>].idSitCaptura" value="<c:out value='${incidenciaPersonalDTO.idSitCaptura}'/>"/>
        <input type="hidden" name="listaIncidenciasPersonal[<c:out value='${status.index}'/>].descSitCaptura" value="<c:out value='${incidenciaPersonalDTO.descSitCaptura}'/>"/>
    </c:forEach>
    
     <c:forEach items="${gestionIncidenciasPersonalDTO.idConceptoFilter}" var="conceptoFilter" varStatus="status">
        <input type="hidden" name="idConceptoFilter[<c:out value='${status.index}'/>]" value="<c:out value='${conceptoFilter}'/>" />
    </c:forEach>
                            
    <script type="text/javascript">
        var $j = jQuery.noConflict();
       
        var fechaLimiteInferior = "<c:out value='${gestionIncidenciasPersonalDTO.fechaLimiteInferior}'/>";
        var fechaLimiteSuperior = "<c:out value='${gestionIncidenciasPersonalDTO.fechaLimiteSuperior}'/>"; 
        var fechasMedioSueldoRegexp = new RegExp("<c:out value='${gestionIncidenciasPersonalDTO.fechasMedioSueldoRegexp}'/>");
        var fechasSinSueldoRegexp = new RegExp("<c:out value='${gestionIncidenciasPersonalDTO.fechasSinSueldoRegexp}'/>");
        var fechasFaltaRegexp = new RegExp("<c:out value='${gestionIncidenciasPersonalDTO.fechasFaltaRegexp}'/>");
        var fechasDiasEconomicosRegexp = new RegExp("<c:out value='${gestionIncidenciasPersonalDTO.fechasDiasEconomicosRegexp}'/>");
        var fechasDisabledString = "<c:out value='${gestionIncidenciasPersonalDTO.fechasDisabled}'/>";
        var fechasDisabledArray = fechasDisabledString.split("|");
        
        var startDate = "<c:out value='${gestionIncidenciasPersonalDTO.startDate}'/>"; 
        

        $j(document).ready(function() {
            $j('#datepicker-example1').Zebra_DatePicker({
                always_visible: $j('#container'),
                direction: [fechaLimiteInferior, fechaLimiteSuperior],
                start_date : startDate,
                format : 'd/m/Y',
                disabled_dates : fechasDisabledArray,
                onChange : function(view, elements) {
                    if (view == 'days') {
                        elements.each(function() {
                        if ($j(this).data('date').match(fechasSinSueldoRegexp))
                            $j(this).css({
                                backgroundColor : '#FF0000',
                                color : '#000'
                                });
                        if ($j(this).data('date').match(fechasMedioSueldoRegexp))
                            $j(this).css({
                                backgroundColor : '#FFFF00',
                                color : '#000'
                            });
                        if ($j(this).data('date').match(fechasFaltaRegexp))
                            $j(this).css({
                                backgroundColor : '#FFFF00',
                                color : '#000'
                            });
                        if ($j(this).data('date').match(fechasDiasEconomicosRegexp))
                            $j(this).css({
                                backgroundColor : '#FF0000',
                                color : '#000'
                            });
                        });
                    }
                }
            });
        });

    </script>
</html:form>