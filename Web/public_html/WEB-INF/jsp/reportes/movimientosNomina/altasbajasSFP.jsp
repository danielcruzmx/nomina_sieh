<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="altasBajasSFPDTO" action="altasbajasSFP.do">
    <html:hidden path="qnaRepRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="reporte.movimientos.nomina.movimientos.sfp"/>
        </strong>
    </h1>
        <table>
            <tr>
                <td align="right" class="label">* Quincena </td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaRep" progress="true" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <table width="100%" border="0" align="center">
                    <tr>
                            <td colspan="2" align="left" width="34%"><spring:message code="sireh.form.required.fields"/></td>
                            <td align="center" width="33%">
                                <fsn:submit value="submit.accept" path="muestraReporte" action="reporteMoviminentos/listaaltasbajasSFP.do" progressIcon="false"/>
                            </td>
                            <td align="left" width="33%">
                                <fsn:submit value="submit.clean" path="cancel" action="reporteMoviminentos/altasbajasSFP.do" progressIcon="false"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
         </table>
</html:form>