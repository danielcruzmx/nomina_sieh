<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form name="checkBoxTest" modelAttribute="pagoDTO">

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <h1> <strong> <spring:message code="sireh.label.nomina.acumulado.por.trabajador.titulo"/> </strong> </h1> 
            </td>   
        </tr>
        
        <tr>
            <td>
                <fieldset>
                    <legend style='font-size:1.1em'>
                        <strong><spring:message code="sireh.label.nomina.acumulado.parametros"/></strong>
                    </legend>
                    <table width="100%"  align="left" border="0">
                        <tr>
                            <td align="right" class="label">*<spring:message code="sireh.label.nomina.acumulado.qnaini"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaSoloQnasHistorico" path="quincenaAnterior" progress="true"  style="width: 200px;"/>
                            </td> 
                        </tr>
                        <tr>
                            <td align="right" class="label">*<spring:message code="sireh.label.nomina.acumulado.qnafin"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaSoloQnasHistorico" path="quincenaPosterior" progress="true"  style="width: 200px;"/>
                            </td>         
                        </tr>
                        <tr>
                            <td class="label">*<spring:message code="sireh.label.nomina.acumulado.tipo"></spring:message></td>
                            <td align="left">
                                <html:select path="idTipoNomina">
                                    <option value="D">Solo conceptos afectados</option>
                                    <option value="T">Todos los conceptos</option>
                                    <option value="C">Conceptos de control</option>
                                    <option value="P">Pension alimenticia</option>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td class="label"><spring:message code="sireh.label.nomina.acumulado.rfc"></spring:message></td>
                            <td >
                                <fsn:helpRoutine path="rfcEmpleado"
                                    maxlength="16" size="16" disabled="true" beanName="EmpleadosDetalle" width="1000" height="400"  
                                    fieldMapping="rfcEmpleado, idPlaza, curpEmpleado, primerApellido, segundoApellido, nombreEmpleado" 
                                    title="Seleccione el RFC" maxRows="200" leftPosition="17" topPosition="20"/>
                            </td>
                        </tr>
                    </table>
                    <table width="100%"  align="left" border="0">
                        <tr>
                            <td align="right" class="label">*<spring:message code="sireh.label.nomina.acumulado.status"/></td>
                            <td align="left" colspan="2">
                                <html:radiobutton value="T" path="status" label="Pagado"/>
                                <html:radiobutton value="C" path="status" label="Cancelado"/>
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
                    <td align="left" width="30"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                    <td align="center" width="35%"><fsn:submit value="submit.export.nomacumrfc" action="calculoNomina/historicoAcumulados.do" progressIcon="false" /></td>
                    <td align="left" width="35%"><fsn:submit value="submit.clean" action="calculoNomina/acumuladoTrabajador.do" progressIcon="false" /></td>
                </tr>
                </table>
            </td>
        </tr>
    </table>
</html:form>