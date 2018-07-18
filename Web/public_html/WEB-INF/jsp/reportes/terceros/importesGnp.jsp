<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="gnpDTO" action="importesGnp.do">
    <html:hidden path="qnaIniRequired"/>
    <html:hidden path="qnaFinRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.terceros.reportes.seguroRetiro.detalle.titulo.link"/> &#45;
            <spring:message code="sireh.label.terceros.reportes.seguroRetiro.gnp.importes"/>
        </strong>
    </h1>
        <table>
            <tr>
                <td align="right" class="label">* Quincena inicial</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaIni" progress="true" />
                </td>
            </tr>
            <tr>
                <td align="right" class="label">* Quincena final</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaFin" progress="true" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <table width="100%" border="0" align="center">
                    <tr>
                            <td colspan="2" align="left" width="34%"><spring:message code="sireh.form.required.fields"/></td>
                            <td align="center" width="33%">
                                <fsn:submit value="submit.accept" path="muestraReporte" action="reporteTercerosNomina/generaRepImpGnp.do" progressIcon="false"/>
                            </td>
                            <td align="left" width="33%">
                                <fsn:submit value="submit.clean" path="cancel" action="reporteTercerosNomina/importesGnp.do" progressIcon="false"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
         </table>
</html:form>
