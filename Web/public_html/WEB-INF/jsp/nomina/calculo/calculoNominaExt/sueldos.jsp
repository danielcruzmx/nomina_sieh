<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html:form modelAttribute="incrementoNominaDTO">

<html:hidden path="subtitle" />

    <h1>
        <spring:message code="sireh.label.nomina.calculo.incremento.periodo.titulo" arguments="${incrementoNominaDTO.subtitle}"/>
    </h1>
    <table width="75%" align="center" border="0">
        <tr><td></td></tr>
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.calculo.incremento.header.periodo"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.fecIni"/>
                            </td>
                            <td align="left">
                                    <fsn:calendar path="fecIni" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.fecFin"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="fecFin" size="10"/>
                            </td>
                        </tr>
                         <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.qnaIni"/>
                            </td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="quincenasByRange" path="qnaIni" appendFilters="false"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.qnaFin"/>
                            </td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="quincenasByRange" path="qnaFin" appendFilters="false"/>
                            </td>
                        </tr>
                         <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.qnaProceso"/>
                            </td>
                            <td align="left">
                                <fsn:filter property="n" condition=">=" path="filterQnaInferior"/>
                                <fsn:filter property="n" condition="<="  path="filterQnaSuperior"/>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="quincenasByRange" path="qnaProceso" appendFilters="false"/>
                            </td>
                            <td align="right">
                            </td>
                            <td align="left">
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.calculo.incremento.header.tabuladores"/>&nbsp;&nbsp; </strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.tabAnt"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="tabAnt" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.tabNvo"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="tabNvo" size="10"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.calculo.incremento.header.prestaciones.anteriores"/>&nbsp;&nbsp; </strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.compensacionAnt"/>
                            </td>
                            <td align="left">
                                <fsn:input path="compensacionAnt" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.despensaAnt"/>
                            </td>
                            <td align="left">
                                <fsn:input path="despensaAnt" size="10"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.previsionAnt"/>
                            </td>
                            <td align="left">
                                <fsn:input path="previsionAnt" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.serviciosAnt"/>
                            </td>
                            <td align="left">
                                <fsn:input path="serviciosAnt" size="10"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.transporteAnt"/>
                            </td>
                            <td align="left">
                                <fsn:input path="transporteAnt" size="10"/>
                            </td>
                            <td align="right" >
                                
                            </td>
                            <td align="left">
                                
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
                <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.calculo.incremento.header.prestaciones.actuales"/>&nbsp;&nbsp; </strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                       <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.compensacionNva"/>
                            </td>
                            <td align="left">
                                <fsn:input path="compensacionNva" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.despensaNva"/>
                            </td>
                            <td align="left">
                                <fsn:input path="despensaNva" size="10"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.previsionNva"/>
                            </td>
                            <td align="left">
                                <fsn:input path="previsionNva" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.serviciosNva"/>
                            </td>
                            <td align="left">
                                <fsn:input path="serviciosNva" size="10"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.transporteNva"/>
                            </td>
                            <td align="left">
                                <fsn:input path="transporteNva" size="10"/>
                            </td>
                            <td align="right" >
                                
                            </td>
                            <td align="left">
                                
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td align="left" height="20px" valign="middle">
                <spring:message code="sireh.form.required.fields"/>
            </td>
        </tr>
        <tr>
            <td>
                <table align="center" width="90%" border="0">
                    <tr>
                        <td align="right">
                                <fsn:submit value="submit.accept" progressBar="true"
                                            action="calculoNominaExt/sueldosAceptar"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.clean" progressBar="true"
                                        action="calculoNominaExt/sueldosClean"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</html:form>