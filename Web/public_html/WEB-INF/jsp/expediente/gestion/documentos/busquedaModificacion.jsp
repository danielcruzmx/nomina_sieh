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
<html:form modelAttribute="expedienteBusquedaModificacionDTO">
    
    <html:hidden path="interior"/>
    <html:hidden path="beanName"/>
    <html:hidden path="beanNameTipoDocto"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaModificacion.title" arguments="${expedienteBusquedaModificacionDTO.interior}"/></h1>
    <p>&nbsp;</p>
        <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos de b&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.documento"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="${expedienteBusquedaModificacionDTO.beanNameTipoDocto}"
                                                path="idDocto"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.unidad"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidad-busquedaDocEmpleado"
                                                path="unidad"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.status"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcEstadoRegistro-busquedaDocEmpleado"
                                                path="status"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.rfcEmpleado"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:input path="rfcEmpleado"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.nombreEmpleado"></spring:message></td>
                            <td align="left">
                                <fsn:input path="nombreEmpleado"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.primerApellido"></spring:message></td>
                            <td align="left">
                                <fsn:input path="primerApellido"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.segundoApellido"></spring:message></td>
                            <td align="left">
                                <fsn:input path="segundoApellido"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                        </tr>
                    </table>
                    <table width="100%">
                        <tr align="center">
                            <td>&nbsp;</td>
                        </tr>
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.search" 
                                            path="muestraRegistros"
                                            action="gestionDocumentos/${expedienteBusquedaModificacionDTO.urlOrigen}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="gestionDocumentos/${expedienteBusquedaModificacionDTO.urlOrigen}"
                                            progressBar="true"/>
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
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Empleados localizados</strong></legend>
                    <c:choose>
                        <c:when test="${expedienteBusquedaModificacionDTO.muestraRegistros}">
                            
                            
                            <%--DATOS SIN CAPTURA--%>
                            <fsn:filter property="ED.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="ED.ID_STATUS" condition="=" path="status" />
                            <fsn:filter property="EMPD.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPD.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPD.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPD.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UD.ID_UNIDAD" condition="=" path="unidad" /> 
                            
                            <%--CAPACITACION Y CURSOS--%>
                            <fsn:filter property="CAP.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="CAP.ID_STATUS" condition="=" path="status" />
                            <fsn:filter property="EMPCAP.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPCAP.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPCAP.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPCAP.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UCAP.ID_UNIDAD" condition="=" path="unidad" />
                            
                            <%--DATOS NACIMIENTO--%>
                            <fsn:filter property="EMPDN.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPDN.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPDN.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPDN.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UDN.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="DN.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="DN.ID_STATUS" condition="=" path="status" />
                            
                             <%--CARTILLA MILITAR--%>
                            <fsn:filter property="EMPCM.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPCM.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPCM.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPCM.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UCM.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="CM.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="CM.ID_STATUS" condition="=" path="status" />
                            
                            <%--ANTECEDENTES ACADEMICOS--%>
                            <fsn:filter property="EMPAC.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPAC.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPAC.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPAC.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="ULAC.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="AA.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="AA.ID_STATUS" condition="=" path="status" />
                            
                            <%--CURP--%>
                            <fsn:filter property="EMPC.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPC.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPC.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPC.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UC.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="EC.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="EC.ID_STATUS" condition="=" path="status" />
                            
                            <%--CUENTAS BANCARIAS--%>
                            <fsn:filter property="EMPCTA.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPCTA.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPCTA.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPCTA.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UCTA.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="CTA.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="CTA.ID_STATUS" condition="=" path="status" />
                            
                            <%--DOMICILIO PARTICULAR--%>
                            <fsn:filter property="EMPDOM.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPDOM.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPDOM.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPDOM.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UDOM.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="EDOM.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="EDOM.ID_STATUS" condition="=" path="status" />
                            
                            <%--EXPERIENCIA LABORAL--%>
                            <fsn:filter property="EMPL.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPL.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPL.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPL.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UL.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="EL.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="EL.ID_STATUS" condition="=" path="status" />
                            
                            <%--DEPENDIENTES Y BENEFICIARIOS--%>
                            <fsn:filter property="EMPB.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPB.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPB.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPB.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UB.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="EB.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="EB.ID_STATUS" condition="=" path="status" />
                            
                            <%--FECHAS LABORALES--%>
                            <fsn:filter property="EMPLAB.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPLAB.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPLAB.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPLAB.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="ULAB.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="ELAB.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="ELAB.ID_STATUS" condition="=" path="status" />
                            
                            <%--RFC SAT--%>
                            <fsn:filter property="EMPR.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPR.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPR.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPR.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UR.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="ER.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="ER.ID_STATUS" condition="=" path="status" />
                            
                            <%--DESIGNACION DE BENEFICIARIOS--%>
                            <fsn:filter property="EMPF.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="EMPF.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="EMPF.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="EMPF.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="UF.ID_UNIDAD" condition="=" path="unidad" />
                            <fsn:filter property="EF.ID_DOCTO" condition="=" path="idDocto" />
                            <fsn:filter property="EF.ID_STATUS" condition="=" path="status" />
                            
                            <fsn:pagedList beanName="${expedienteBusquedaModificacionDTO.beanName}" 
                                           baseUrl="${expedienteBusquedaModificacionDTO.urlOrigen}" 
                                           maxRows="200" 
                                           appendFilters="false">
                                <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;text-align:center;"> 
                                    <display:table name="${expedienteBusquedaModificacionDTO.beanName}" 
                                                   class="displaytag" 
                                                   pagesize="200" 
                                                   export="true" 
                                                   id="row" 
                                                   requestURI="${requestURI}" 
                                                   sort="list">
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.rfcEmpleado" 
                                                        sortable="true"
                                                        style="text-align: left">

                                            <a href="javascript:gestorBusquedaDoc('<c:out value="${expedienteBusquedaModificacionDTO.idDocto}"/>','<c:out value="${row.rfcEmpleado}"/>')" title="Modificación de documento">
                                                <c:out value="${row.rfcEmpleado}"/>
                                            </a>
                                        </display:column>
                                                            
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.nombreEmpleado" 
                                                        property="nombreEmpleado" 
                                                        sortable="true"
                                                        style="text-align: left"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.primerApellido" 
                                                        property="primerApellido" 
                                                        sortable="true"
                                                        style="text-align: left"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.segundoApellido" 
                                                        property="segundoApellido" 
                                                        sortable="true"
                                                        style="text-align: left"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.documento" 
                                                        property="documento" 
                                                        sortable="true"
                                                        style="text-align: left"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.status" 
                                                        property="desStatus" 
                                                        sortable="true"
                                                        style="text-align: center"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.unidad" 
                                                        property="descUnidad" 
                                                        sortable="true"
                                                        style="text-align: left"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.descPuesto" 
                                                        property="descPuesto" 
                                                        sortable="true"
                                                        style="text-align: left"/>
                                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                                            <display:setProperty name="export.pdf" value="true"/>
                                            <display:setProperty name="basic.msg.empty_list">
                                                <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                            </display:setProperty>
                                     </display:table>
                                </div>
                            </fsn:pagedList>
                        </c:when>
                        <c:otherwise>
                            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                        </c:otherwise>
                    </c:choose>
                </fieldset>
                <br/>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){
            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
        });
        
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        function gestorBusquedaDoc(idDocto, rfcEmpleado) {
            location.href = '<c:out value="${expedienteBusquedaModificacionDTO.urlDestino}"/>.do?idTipoDocto=' + $j('select[id="idDocto"]').val() + '&rfcEmpleado=' + rfcEmpleado;
        }
    </script>
</html:form>