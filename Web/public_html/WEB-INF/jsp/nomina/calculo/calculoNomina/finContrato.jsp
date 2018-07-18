<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form id="cifrasPagoPorQnas" modelAttribute="datosEmpleadoCptoDTO">

    <h1> <strong> <spring:message code="sireh.label.nomina.calculo.cifras.control.finContrato"/> </strong> </h1> 
    
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style='font-size:1.1em'>
                        <strong><spring:message code="sireh.label.nomina.calculo.fin.contrato"/></strong>
                    </legend>
                    <table width="100%" align="left" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.liqneg.quincena"/></td>
                            <td align="left" colspan="3">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaQuincenas"  path="mcpQnaFinLabel" style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="20%" align="left"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                            <td width="80%" align="center"><fsn:submit value="submit.generar.archivo.fonacot" action="calculoNomina/finContrato.do" progressIcon="false"  /></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
</html:form>