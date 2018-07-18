<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesTercerosDTO">
    <h1>
        <strong>
    <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45; 
    <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45; 
    <spring:message code="sireh.label.terceros.reportes.seguroVidaInstitucional.detalle.titulo.link"/>
            </strong>
    </h1>

    <html:hidden path="qnaCapturaRequired"/>
    
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
            <tr align="left">
            <tr>
                <td align="right" class="label">* Quincena</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaCaptura" progress="true" />
                </td>
            </tr>       
           </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteTercerosNomina/seguroVidaInstitucional.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteTercerosNomina/seguroVidaInstitucional.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        
        <c:if test="${reportesTercerosDTO.muestraReporte}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_QNA" value="${reportesTercerosDTO.qnaCaptura}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/terceros/seguroVida_Institucional" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="seguroVidaInstitucional" 
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