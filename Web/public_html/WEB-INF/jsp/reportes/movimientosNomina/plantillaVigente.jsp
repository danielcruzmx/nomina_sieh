<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="consultaGeneralDTO">

    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45;
            <spring:message code="reporte.movimientos.nomina.movimientos.plantillavigente"/>
        </strong>
    </h1>
    
    <table align="center" width="100%" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp; Parametros de consulta &nbsp;</strong></legend>
                            <table align="center" width="100%" border="0">
                            <tr> 
                                <td> </td>
                            </tr>
                            <tr> 
                                <td align="right" width="150px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idGrupoPago"></spring:message></td>
                                <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcGrupoPago" 
                                                path="idGrupoPago" 
                                                style="width: 256px;"/>
                                </td>
                            </tr>
                            <tr> 
                                <td> </td>
                            </tr>
                        </table>
                        
                            <tr>
                                <td colspan="2">
                                    <table width="100%" border="0" align="center">
                                    <tr>
                                            <td colspan="2" align="left" width="34%"><spring:message code="sireh.form.required.fields"/></td>
                                            <td align="center" width="33%">
                                                <fsn:submit value="submit.accept" path="muestraReporte" action="reporteMoviminentos/plantillaVigente.do" progressIcon="false"/>
                                            </td>
                                            <td align="left" width="33%">
                                                <fsn:submit value="submit.clean" path="cancel" action="reporteMoviminentos/plantillaVigente.do" progressIcon="false"/>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                </fieldset>
            </td>
        </tr>
    </table>
</html:form>