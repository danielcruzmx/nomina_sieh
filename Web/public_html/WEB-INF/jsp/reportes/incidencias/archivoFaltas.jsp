<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesCalculoNominaDTO" action="archivofaltas.do">
    <html:hidden path="qnaIniRequired"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.calculo.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.nomina.reportes.archivofaltas.header"/>
        </strong>
    </h1>
    
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
             <tr>
                <td align="right" class="label"> <spring:message code="sireh.label.reportes.cxlc.quincena"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaIni" progress="true"/>
                </td>
             </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteCalculo/archivofaltas.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteCalculo/archivofaltas.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        
        <c:if test="${ (reportesCalculoNominaDTO.qnaIni!='0' && reportesCalculoNominaDTO.qnaIni!=null) }">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="P_QNA" value="${reportesCalculoNominaDTO.qnaIni}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/incidenciasPersonal/faltas" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="faltas" 
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