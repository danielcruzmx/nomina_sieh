<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form modelAttribute="expLabCVDTO">
    
    <h1>
        <strong>
            <spring:message code="expediente.servicios"/> &#45;&nbsp;
            <spring:message code="sireh.label.servico.experienciaLaboral"/> de
            <fsn:label path="nombreEmpleado"/>
        </strong>
    </h1>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style='font-size:1.2em';>
                        Curriculum vitae
                    </legend>
                    <c:if test="${expLabCVDTO.muestraReporte}">
                        <table width="90%" align="center" border="0">
                            <tr>
                                <td align="center">
                                    <fsn:reportParam name="PR_CICLO" value="${expLabCVDTO.ciclo}"/>
                                    <fsn:reportParam name="PR_RFC" value="${expLabCVDTO.rfcEmpleado}"/>
                                    <fsn:report provider="jasper" 
                                        viewUri="/constanciaSueldos/Trayectoria_Laboral" 
                                        imagesUri="/images/reports"
                                        format="pdf" 
                                        fileName="Trayectoria_Laboral" 
                                        export="pdf"
                                        width="1060" 
                                        height="350"/>
                                </td>
                            </tr>
                        </table>
                    </c:if>
                </fieldset>
            </td>
        </tr>
    </table>
    
</html:form>
