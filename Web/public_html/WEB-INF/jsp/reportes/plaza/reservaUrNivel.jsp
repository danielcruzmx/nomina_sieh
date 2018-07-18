<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportePlazaDTO">
    <html:hidden path="uniCicloRequired"/>
    <html:hidden path="idUnidadRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.plaza.reportes.titulo.link"/> &#45;
            <spring:message code="sireh.label.plaza.reportes.seccion.plazas.titulo.link"/> &#45; 
            <spring:message code="sireh.label.plaza.reportes.reserva.ur.nivel.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table>
            <tr>
                <td align="right" class="label">* Ciclo</td>
                <td align="left">
                    <fsn:option key="" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadCicloReportes" 
                                    path="uniCiclo"/>
                </td>
            </tr>
            
            <tr>
                <td align="right" class="label">* Unidad</td>
                <td align="left">
                    <fsn:option key="" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadSinCiclo" 
                                    path="idUnidad"/>
                </td>
            </tr>
            
            
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reportePlaza/reservaUrNivel.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reportePlaza/reservaUrNivel.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        
        <c:if test="${reportePlazaDTO.muestraReporte}">
            <c:if test="${ (reportePlazaDTO.uniCiclo!=null) && (reportePlazaDTO.idUnidad!=null) }">
                <table>
                    <tr>
                        <th align="left"></th>
                    </tr>
                    <tr>
                        <td align="left">
                            <fsn:reportParam name="PAR_CICLO" value="${reportePlazaDTO.uniCiclo}"/>
                            <fsn:reportParam name="PAR_UNIDAD" value="${reportePlazaDTO.idUnidad}"/>
                            <fsn:report provider="jasper" 
                                        viewUri="/plaza/reservaUrNivel" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="reservaUrNivel" 
                                        export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                        width="1060" 
                                        height="350"/>
                        </td>
                    </tr>
                </table>
            </c:if>
        </c:if>
    </div>
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
</html:form>