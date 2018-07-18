<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO" action="pensionAlimenticia.do">
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.pensiones.detalle.titulo.link"/>
        </strong>
    </h1>

    <html:hidden path="uniCicloRequired"/>
    <html:hidden path="rfcRequired"/>
    <html:hidden path="idUnidadRequired"/>

    <p>&nbsp;</p>
    <div align="center">
    <table width="50%">
        <tr>
            <td align="right" class="label">Unidad</td>
            <td align="left">
                <fsn:option key="0" value="selectList.nonValue"/>
                <fsn:selectList beanName="tcUnidadSinCiclo" path="idUnidad" uppercase="false"/>

            </td>
        </tr>
        <tr>
            <td colspan="2">
                <table width="100%">
                    <tr>
                        <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                    </tr>
                    <tr>
                        <td align="right">
                            <fsn:submit value="submit.accept" 
                                        path="muestraReporte"
                                        action="reporteMoviminentos/pensionAlimenticia.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" 
                                        path="cancel" 
                                        action="reporteMoviminentos/pensionAlimenticia.do"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" height="20px">&nbsp;</td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

    <c:if test="${reportesMovtoNominaDTO.idUnidad ne null}">
        <table>
            <tr>
                <th align="left">
                    &nbsp;
                </th>
            </tr>
            <tr>
                <td align="left">
                    <fsn:reportParam name="PAR_UNIDAD" value="${reportesMovtoNominaDTO.unidades}"/>
                    <fsn:report provider="jasper" 
                                viewUri="/movimientosNomina/pensionAlimenticia" 
                                imagesUri="/images/reports" 
                                format="pdf" 
                                fileName="pensionAlimenticia" 
                                export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                width="1060" 
                                height="350"/>
                </td>
            </tr>
        </table>
    </c:if>
</div>
<p>&nbsp;</p>
<div align="center">
  
</div>
<p>&nbsp;</p>
<div align="center">
  
</div>
<p>&nbsp;</p>
<div align="center">
  
</div>
</html:form>