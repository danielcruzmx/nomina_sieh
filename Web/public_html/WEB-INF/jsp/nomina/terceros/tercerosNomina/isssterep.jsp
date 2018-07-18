<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="isssterepDTO">


    <h1><spring:message code="sireh.label.nomina.terceros.isssterep.header"></spring:message></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <%-- Filtros --%> 
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.terceros.isssterep.qnaIni"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="sacaQnasIssste" path="qnaIni" style="width: 200px;"/>
                            </td>
                        </tr>

                    </table>
                </fieldset>
            </td>
        </tr>
        <%-- Botones --%> 
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="aceptar" 
                            action="/tercerosNomina/isssterep.do"
                            /> &nbsp; <%--aqui poner el metodo del controller --%>
                
                <fsn:submit value="submit.clean" 
                            path="limpiar" 
                            action="/tercerosNomina/isssterep.do"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    <c:choose>
        <c:when test="${isssterepDTO.aceptar}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="P_QNA_PAR" value="${isssterepDTO.qnaIni}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/terceros/cotizaissste" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="cotizaissste" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>

        </c:when>
<%--        <c:otherwise> --%>
            <%-- No existen registros --%> 
<%--            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
        </c:otherwise>   --%>
    </c:choose>
</html:form>

