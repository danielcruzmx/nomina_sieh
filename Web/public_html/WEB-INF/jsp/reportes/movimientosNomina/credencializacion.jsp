<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesConstanciasDTO">

    <h1>
        <strong>
            <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45;
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.terceros.reportes.credencializacion"/>
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
                                <td align="left" colspan="3">
                                    <html:radiobutton value="r" path="origen" id="origenQna" label="Rfc" onclick="toggle(this); "/>
                                    <html:radiobutton value="m" path="origen" id="origenQna" label="Movimientos" onclick="toggle(this); "/>
                                    <html:radiobutton value="b" path="origen" id="origenQna" label="Bajas" onclick="toggle(this); "/>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="3">
                                    <div id="rfcc" style="display:none">
                                        <table align="center" width="100%" border="0">
                                            <tr>
                                                <td align="right" class="label"><spring:message code="sireh.label.reportes.quincena"></spring:message></td>
                                                <td align="left">
                                                    <fsn:option key="0" value="selectList.nonValue"/>
                                                    <fsn:selectList beanName="listaQuincenasAnteriores" 
                                                                    path="qnaIni"
                                                                    uppercase="false"/>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                    <div id="qna"  style="display:none">
                                        <table align="center" width="100%" border="0">
                                            <tr>
                                                <td  align="right" class="label"  width="20%"><spring:message code="sireh.label.reportes.rfc"></spring:message></td>
                                                <td align="left"  colspan="2">
                                                    <fsn:helpRoutine path="rfcEmpleado" maxlength="20" size="20"  disabled="true" beanName="EmpleadosDetalle" width="1000" onClose="message()"
                                                    height="400"  fieldMapping="rfcEmpleado" title="Seleccione el RFC" maxRows="200" leftPosition="17" topPosition="20" multiple="true"/>
                                                </td> 
                                            </tr>
                                        </table>
                                    </div>

                                    <div id="baja"  style="display:none">
                                        <table align="center" width="100%" border="0">
                                            <tr>
                                                <td align="right" class="label"><spring:message code="sireh.label.reportes.quincena"></spring:message></td>
                                                <td align="left">
                                                    <fsn:option key="0" value="selectList.nonValue"/>
                                                    <fsn:selectList beanName="listaQuincenasAnteriores" 
                                                                    path="qnaFin"
                                                                    uppercase="false"/>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>


                                </td>
                            </tr>
                            <tr>
                                <td align="left"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                                <td align="left"><fsn:submit value="submit.accept" path="muestraReporte" action="reporteMoviminentos/credencializacion.do" progressIcon="false"/> </td>
                                <td align="center"><fsn:submit value="submit.clean" path="cancel" action="reporteMoviminentos/credencializacion.do" progressIcon="false"/></td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table><br/><br/>
        
        <c:if test="${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'RCF') }">
            <table align="center" width="100%" border="0">
                <tr>
                    <td>
                        <fsn:reportParam name="P_CICLO" value="${reportesConstanciasDTO.ciclo}"/>
                    <fsn:reportParam name="P_RFC" value="${reportesConstanciasDTO.rfcEmpleado}"/>
                    <fsn:report provider="jasper" 
                                viewUri="/nomina/constanciaSueldoCFirmaCicloRFC" 
                                imagesUri="/images/reports"
                                format="pdf" 
                                fileName="constanciaSueldoCFirmaCicloRFC" 
                                export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                width="1060" 
                                height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
        
        <c:if test="${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'RSF') }">
            <table align="center" width="100%" border="0">
                <tr>
                    <td>
                        <fsn:reportParam name="P_CICLO" value="${reportesConstanciasDTO.ciclo}"/>
                        <fsn:reportParam name="P_RFC" value="${reportesConstanciasDTO.rfcEmpleado}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/nomina/constanciaSueldoSFirmaCicloRFC" 
                                    imagesUri="/images/reports"
                                    format="pdf" 
                                    fileName="constanciaSueldoSFirmaCicloRFC" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
        
        <c:if test="${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'UCF') }">
            <table align="center" width="100%" border="0">
                <tr>
                    <td>
                        <fsn:reportParam name="P_CICLO" value="${reportesConstanciasDTO.ciclo}"/>
                        <fsn:reportParam name="P_UNIDAD" value="${reportesConstanciasDTO.unidad}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/nomina/constanciaSueldoCFirmaCicloUnidad" 
                                    imagesUri="/images/reports"
                                    format="pdf" 
                                    fileName="constanciaSueldoCFirmaCicloUnidad"
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
        
        <c:if test="${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'USF') }">
            <table align="center" width="100%" border="0">
                <tr>
                    <td>
                        <fsn:reportParam name="P_CICLO" value="${reportesConstanciasDTO.ciclo}"/>
                        <fsn:reportParam name="P_UNIDAD" value="${reportesConstanciasDTO.unidad}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/nomina/constanciaSueldoSFirmaCicloUnidad" 
                                    imagesUri="/images/reports"
                                    format="pdf" 
                                    fileName="constanciaSueldoSFirmaCicloUnidad" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
        
        
        
        <script type="text/javascript">
            
            function toggle(elemento){
                
                if(elemento.value == 'r'){
                    document.getElementById("rfcc").style.display = "none";
                    document.getElementById("qna").style.display = "block";
                    document.getElementById("baja").style.display = "none";
                }
                else if(elemento.value == 'm'){
                    document.getElementById("rfcc").style.display = "block";
                    document.getElementById("qna").style.display = "none";
                    document.getElementById("baja").style.display = "none";
                }
                else if (elemento.value == 'b'){
                    document.getElementById("rfcc").style.display = "none";
                    document.getElementById("qna").style.display = "none";
                    document.getElementById("baja").style.display = "block";
                }
            }

            function message(){
                alert("Los RFC han sido seleccionados, presione ACEPTAR para generar el reporte");
            }
            
      </script>
        
</html:form>