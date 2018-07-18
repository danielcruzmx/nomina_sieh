<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesTercerosDTO" action="cifrasDeControl.do">
    <html:hidden path="qnaCapturaRequired"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.calculo.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="gestionterrepcifra.gestion.terrepcifrac"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    
    <div align="center">
        <table>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.quincena"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores" 
                                    path="qnaCaptura"
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
                                action="reporteTercerosNomina/cifrasDeControlC.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteTercerosNomina/cifrasDeControlC.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        <c:if test="${reportesTercerosDTO.qnaCaptura ne '0' and not empty reportesTercerosDTO.qnaCaptura}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_QNA" value="${reportesTercerosDTO.qnaCaptura}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/terceros/cifrasControl_ISSSTEcanc" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="cifrasControl_ISSSTEcanc" 
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

