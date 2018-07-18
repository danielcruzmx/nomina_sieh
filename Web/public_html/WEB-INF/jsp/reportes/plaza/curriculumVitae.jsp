<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="expLabCVDTO">
    
    <h1>
        <strong>
            <spring:message code="sireh.label.plaza.reportes.pnt.experienciLaboral.titulo.dif"/><c:if test="${expLabCVDTO.muestraReporte}"> de <strong><c:out value="${expLabCVDTO.nombreEmpleado}"/></strong></c:if>
        </strong>
    </h1>
    
    <p>&nbsp;</p>
    <div align="center">
        <table width="40%" border="0">
            <tr>
                <td>
                    <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Parametros de consulta&nbsp;&nbsp; </strong></legend>
                        <table align="center" width="90%" border="0">
                            <tr><td colspan="2">&nbsp;</td></tr>
                            <tr>
                                <td  align="right" class="label"> * <spring:message code="sireh.label.merito.label.rfc"></spring:message></td>
                                <td align="left">
                                    <fsn:helpRoutine path="rfcEmpleado"
                                                     maxlength="16"
                                                     size="16" 
                                                     disabled="true" 
                                                     beanName="empleadosConstanciaNombramiento"
                                                     width="1000" 
                                                     height="400"  
                                                     fieldMapping="rfcEmpleado, idPlaza, curpEmpleado, primerApellido, segundoApellido, nombreEmpleado" 
                                                     title="Seleccione el RFC"
                                                     leftPosition="17"
                                                     maxRows="100"
                                                     topPosition="20"
                                                     onClose="habilitar();"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label" width="20%">* Ciclo</td>
                                <td align="left">
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcUnidadCicloReportes"
                                                    path="ciclo"
                                                    style="width: 150px;"
                                                    onchange="habilitar();"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="left" height="20px" valign="middle" colspan="2">
                                    <strong>
                                        <spring:message code="sireh.form.required.fields"/>
                                    </strong>
                                </td>
                            </tr>
                            <tr><td colspan="2">&nbsp;</td></tr>
                            <tr align="center">
                                <td align="center" colspan="2">
                                    <fsn:submit value="submit.consult" 
                                                path="muestraReporte"
                                                action="reportePlaza/expLabCV.do"
                                                progressBar="false"/>
                                    <fsn:submit value="submit.clean" 
                                                path="limpiar"
                                                action="reportePlaza/expLabCV.do"
                                                progressBar="false"/>
                                </td>
                            </tr>
                            <tr><td colspan="2">&nbsp;</td></tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
        
        <c:if test="${expLabCVDTO.muestraReporte}">
            <fsn:reportParam name="PR_CICLO" value="${expLabCVDTO.ciclo}"/>
            <fsn:reportParam name="PR_RFC" value="${expLabCVDTO.rfcEmpleado}"/>
            <fsn:report provider="jasper" 
                viewUri="/constanciaSueldos/Trayectoria_Laboral" 
                imagesUri="/images/reports"
                format="pdf" 
                fileName="Trayectoria_Laboral" 
                export="pdf"
                width="1060" 
                height="350"/>
        </c:if>
    </div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <script type="text/javascript">
        $j(document).ready(function(){
            $j("#10001").prop("disabled", true);
        });
        function habilitar(){
            if(($j('#rfcEmpleado').val() != '') & ($j('#ciclo') != '0')){
                $j("#10001").removeAttr('disabled');
            }
        }
    </script>
</html:form>