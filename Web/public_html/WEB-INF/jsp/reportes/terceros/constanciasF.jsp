<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="reportesConstanciasDTO">

    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.nomina.tercero.cargaArchivos.textbox"/> &#45;
            <spring:message code="gestionterfon.gestion.terfon"/>
        </strong>
    </h1>
    
    <table align="center" width="100%" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp; Parametros de consulta &nbsp;</strong></legend>
                            <table align="center" width="100%" border="0">
                            <tr>
                            </tr>
                            
                            <tr>
                                <td align="right" class="label">*<spring:message code="sireh.label.reportes.terceros.constancias.rfcEmpleado"></spring:message></td>
                                <td>
                                    <fsn:helpRoutine path="rfcEmpleado"
                                         maxlength="16"
                                         size="16" 
                                         disabled="true" 
                                         beanName="EmpleadosDetalle"
                                         width="1000" 
                                         height="400"  
                                         fieldMapping="rfcEmpleado, idPlaza, curpEmpleado, primerApellido, segundoApellido, nombreEmpleado" 
                                         title="Seleccione el RFC" 
                                         maxRows="200"
                                         leftPosition="17"
                                         topPosition="20"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label">*<spring:message code="sireh.label.reportes.terceros.constancias.rfcReponsable"></spring:message></td>
                                <td>
                                    <fsn:helpRoutine path="rfcEmpleado2"
                                         maxlength="16"
                                         size="16" 
                                         disabled="true" 
                                         beanName="EmpleadosDetalle"
                                         width="1000" 
                                         height="400"  
                                         fieldMapping="rfcEmpleado2, idPlaza, curpEmpleado, primerApellido, segundoApellido, nombreEmpleado" 
                                         title="Seleccione el RFC" 
                                         maxRows="200"
                                         leftPosition="17"
                                         topPosition="20"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.reportes.quincena"></spring:message></td>
                                <td align="left">
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="listaQuincenasAnteriores" path="qnaIni" progress="false"/>
                                </td>
                            </tr>
                            <tr>
                                 <td align="right" class="label">*<spring:message code="sireh.label.reportes.terceros.constancias.nombreResponsable"></spring:message></td>
                                 <td><fsn:label path="nombreResponsable"/></td>
                                 <!--td><fsn:input path="nombreResponsable" maxlength="5" size="20"  /></td-->
                            </tr>
                            <tr>
                                 <td align="right" class="label">*<spring:message code="sireh.label.reportes.terceros.constancias.cargoResponsable"></spring:message></td>
                                 <td><fsn:label path="cargoResponsable"/></td>
                                 <!--td><fsn:input path="cargoResponsable" maxlength="5" size="20" /></td-->
                            </tr>
                            <tr>
                                 <td align="right" class="label">*<spring:message code="sireh.label.reportes.terceros.constancias.noOficio"></spring:message></td>
                                 <td><fsn:input path="noOficio" maxlength="6" size="12"/></td>
                            </tr>
                        </table>
                </fieldset>
                <table width="100%" align="center" border="0">
                    <tr>
                        <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                        <td align="center"><fsn:submit value="submit.accept" path="muestraReporte" action="reporteTercerosNomina/constanciasF.do"/></td>
                        <td align="left"><fsn:submit value="submit.cancel" path="cancel" action="reporteTercerosNomina/constanciasF.do"/></td>
                    </tr>
                </table>
                
                <br><br>
               
                <table width="100%" align="center" border="0" >
                    <tr><td>
                        <c:if test="${reportesConstanciasDTO.muestraReporte}">
                            <fsn:reportParam name="P_RFC" value="${reportesConstanciasDTO.rfcEmpleado}"/>
                            <fsn:reportParam name="P_QNA_INI" value="${reportesConstanciasDTO.qnaFin}"/>
                            <fsn:reportParam name="P_QNA_FIN" value="${reportesConstanciasDTO.qnaIni}"/>
                            <fsn:reportParam name="P_RESPONSABLE" value="${reportesConstanciasDTO.nombreResponsable}"/>
                            <fsn:reportParam name="P_PUESTO" value="${reportesConstanciasDTO.cargoResponsable}"/>
                            <fsn:reportParam name="P_OFICIO" value="${reportesConstanciasDTO.noOficio}"/>
                            <fsn:report provider="jasper" 
                                        viewUri="/terceros/constanciafonacot"
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="constanciafonacot"
                                        export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                        width="1060" 
                                        height="350"/>
                        </c:if>
                    </td></tr>
                </table>
                
            </td>
        </tr>
    </table>
</html:form>