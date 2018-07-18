<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportePlazaDTO">
    <h1>
        <strong>
    <spring:message code="sireh.label.plaza.reportes.titulo.link"/> &#45; 
    <spring:message code="sireh.label.plaza.reportes.seccion.plazas.titulo.link"/> &#45; 
    <spring:message code="sireh.label.plaza.reportes.ac02.nivel.titulo.link"/>
            </strong>
    </h1>
    
    <html:hidden path="uniCicloRequired"/>
    
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
            <tr>
                <td align="right" class="label">* Ciclo</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadCicloReportes" 
                                    path="uniCiclo"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reportePlaza/ac02Nivel.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reportePlaza/ac02Nivel.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        
        <c:if test="${reportePlazaDTO.muestraReporte}">
            <table>
                <tr>
                    <th align="left">
                        &nbsp;
                    </th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_CICLO" value="${reportePlazaDTO.uniCiclo}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/plaza/ac02Nivel" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="ac02Nivel" 
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