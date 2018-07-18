<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportePlazaDTO">
    
    <html:hidden path="mesQnaRequired"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.plaza.reportes.titulo.link"/> &#45;
            <spring:message code="sireh.label.cxlc.reportes.seccion.titulo.link"/>&#45;  
            <spring:message code="FonacFstseSindi.consultas.clc"/>
        </strong>
    </h1>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td align="right" class="label">* Quincena</td>
            <td align="left" colspan="3">
                <fsn:option key="0" value="selectList.nonValue"/>
                <fsn:selectList beanName="listaQuincenasAnteriores" 
                                path="mesQna"
                                uppercase="false"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            <td align="right">
                <fsn:submit value="submit.accept" 
                            path="muestraReporte"
                            action="reporteCxlc/fonacFSTSE.do"/>
            </td>
            <td  align="left">
                <fsn:submit value="submit.cancel" 
                            path="cancel" 
                            action="reporteCxlc/fonacFSTSE.do"/>
            </td>
        </tr>
    </table>
        
    <c:if test="${reportePlazaDTO.muestraReporte}">
        <table width="100%" align="center" border="0">
            <tr>
                <th align="left"></th>
            </tr>
            <tr>
                <td align="left">
                    <c:if test="${reportePlazaDTO.muestraReporte}">
                        <fsn:reportParam name="P_QNA" value="${reportePlazaDTO.mesQna}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/cxlc/fonac" 
                                    imagesUri="/images/reports"
                                    format="pdf" 
                                    fileName="fonac"
                                    export="xls,pdf" 
                                    width="1060" 
                                    height="350"/>
                    </c:if>                                    
                </td>
            </tr>
        </table>
    </c:if>
            
</html:form>