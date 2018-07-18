<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesConstanciasDTO">

    <h1>
        <strong>
            <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45;
            <spring:message code="sireh.label.terceros.reportes.incidencias.personal"/> &#45;
            <spring:message code="sireh.label.terceros.reportes.incidencias.personal.movsInternos"/>
        </strong>
    </h1>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Tipo de reporte&nbsp;&nbsp; </strong></legend>
                    <table width="100%" align="center" border="0" >
                        <tr>
                            <td align="right" class="label" width="20%">* Origen</td>
                            <td align="left" colspan="2">
                                <html:radiobutton value="r" path="origen" id="origenRFC" label="Rfc" onclick="toggle(this); "/>
                                <html:radiobutton value="u" path="origen" id="origennUnidad" label="Unidad" onclick="toggle(this); "/>
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
                                            <fsn:selectList beanName="tcUnidadSinCiclo" path="unidad" />
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div id="unidadd"  style="display:none">
                                    <table align="center" width="100%" border="0">
                                        <tr>
                                            <td  align="right" class="label"  width="20%"><spring:message code="sireh.label.reportes.rfc"></spring:message></td>
                                            <td align="left"  colspan="2">
                                                <fsn:helpRoutine path="rfcEmpleado" maxlength="16" size="16"  disabled="true" beanName="EmpleadosDetalle" width="1000" 
                                                height="400"  fieldMapping="rfcEmpleado" title="Seleccione el RFC" maxRows="200" leftPosition="17" topPosition="20"/>
                                            </td> 
                                        </tr>
                                    </table>
                                </div>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label" width="20%">* Quincena inicial</td>
                            <td align="left" colspan="2">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaIni" progress="true"/>
                                </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"  width="20%">* Quincena final</td>
                            <td align="left"  colspan="2">
                                 <fsn:option key="0" value="selectList.nonValue"/>
                                 <fsn:selectList beanName="listaQuincenasAnterioresFinales"  path="qnaFin"  progress="true"
                                                 parentPath="qnaIni"/>

                            </td>
                        </tr>
                        <tr>
                            <td align="left"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                            <td align="center"><fsn:submit value="submit.accept" path="muestraReporte" action="reporteCalculo/movsInternosIncidencias.do"/> </td>
                            <td align="left"><fsn:submit value="submit.clean" path="cancel" action="reporteCalculo/movsInternosIncidencias.do"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/><br/>
    
    <c:if test="${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.origen eq 'r') }">
        <table align="center" width="100%" border="0">
            <tr>
                <td>
                    <fsn:reportParam name="P_QNA_INI" value="${reportesConstanciasDTO.qnaIni}"/>
                    <fsn:reportParam name="P_QNA_FIN" value="${reportesConstanciasDTO.qnaFin}"/>
                    <fsn:reportParam name="P_RFC" value="${reportesConstanciasDTO.rfcEmpleado}"/>
                    <fsn:report provider="jasper" 
                            viewUri="/incidenciasPersonal/movimientosinternosrfc" 
                            imagesUri="/images/reports"
                            format="pdf" 
                            fileName="movimientosinternosrfc" 
                            export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                            width="1060" 
                            height="350"/>
                </td>
            </tr>
        </table>
    </c:if>
    
    <c:if test="${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.origen eq 'u') }">
        <table align="center" width="100%" border="0">
            <tr>
                <td>
                    <fsn:reportParam name="P_QNA_INI" value="${reportesConstanciasDTO.qnaIni}"/>
                    <fsn:reportParam name="P_QNA_FIN" value="${reportesConstanciasDTO.qnaFin}"/>
                    <fsn:reportParam name="P_UNIDAD" value="${reportesConstanciasDTO.unidad}"/>
                    <fsn:report provider="jasper" 
                                viewUri="/incidenciasPersonal/movimientosinternosunidad" 
                                imagesUri="/images/reports"
                                format="pdf" 
                                fileName="movimientosinternosunidad"
                                export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                width="1060" 
                                height="350"/>
                </td>
            </tr>
        </table>
    </c:if>
     
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
    </script>
        
</html:form>