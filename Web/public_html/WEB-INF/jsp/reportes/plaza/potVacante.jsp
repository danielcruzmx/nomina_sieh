<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportePlazaDTO">
<%--    <html:hidden path="uniCicloRequired"/> --%>
<html:hidden path="mesQnaRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.plaza.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.plaza.reportes.seccion.plazas.titulo.link"/> &#45; 
            <spring:message code="sireh.label.plaza.reportes.potVacante.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
<!--            <tr>
                <td align="right" class="label">* Ciclo</td>
                <td align="left">
                    <fsn:option key="" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadCicloReportes" 
                                    path="uniCiclo"/>
                </td>
            </tr>     -->
            <tr>
                <td align="right" class="label">* Quincena</td>
                <td align="left">
                    <fsn:option key="" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores" 
                                    path="mesQna"
                                    uppercase="false"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reportePlaza/potVacante.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reportePlaza/potVacante.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        
        <c:if test="${reportePlazaDTO.muestraReporte}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
<!--                    <h1><c:out value='QNAPAR: '/> <c:out value="${reportePlazaDTO.mesQna}"/></h1>
                    <h1><c:out value='QNANON: '/> <c:out value="${reportePlazaDTO.qnaCaptura2}"/></h1>
                        <fsn:reportParam name="PAR_CICLO" value="${reportePlazaDTO.uniCiclo}"/>   -->
                        <fsn:reportParam name="PAR_QNAPAR" value="${reportePlazaDTO.mesQna}"/>
                        <fsn:reportParam name="PAR_QNANON" value="${reportePlazaDTO.qnaCaptura2}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/plaza/potVacante" 
                                    imagesUri="/images/reports"  
                                    format="pdf" 
                                    fileName="potVacante" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
    </div>
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
</html:form>