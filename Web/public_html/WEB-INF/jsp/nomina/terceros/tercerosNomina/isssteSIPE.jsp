<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<spring:message code="sireh.label.reportes.en.aqna" var="aQna"/>
<spring:message code="sireh.label.reportes.en.bqna" var="bQna"/>
<spring:message code="sireh.label.reportes.en.cqna" var="cQna"/>
<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">
<html:hidden path="qnaCapturaIRequired"/>

    <h1><spring:message code="sireh.label.nomina.terceros.isssteSIPE.header"></spring:message></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <%-- Filtros --%> 
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.terceros.isssteSIPE.qnaIni"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="sacaQnasPago1" path="qnaIni" style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.isssteSIPE.tipoArc" /></td>
                            <td align="left">
                                <html:select path="tipoArc" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="${aQna}"/>
                                    <html:option value="1" label="${bQna}"/>
                                    <html:option value="2" label="${cQna}"/>
                                </html:select>
                            </td>
                        </tr>

                    </table>
                </fieldset>
            </td>
        </tr>
        <%-- Botones --%> 
        <tr align="center">
            <td>
                <fsn:submit value="submit.generate" path="generaArchivo" action="/tercerosNomina/generaArchivoisssteSIPE.do" progressIcon="false" /> 
                
                <fsn:submit value="submit.cancel" 
                            path="cancel" 
                            action="/tercerosNomina/isssteSIPE.do"
                            progressBar="true"/>
               <h1> <c:out value="${generaArchivosTercerosDTO.leyenda}"/>  </h1>
            </td>
        </tr>
    </table>
<%--    <c:choose>
        <c:when test="${generaArchivosTercerosDTO.muestraRegistros}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <c:if test="${generaArchivosTercerosDTO.tipoQna eq '0'}">
                        <c:url value="/tercerosNomina/generaArchivoSerica.do" var="_action" scope="page"/>
                        <script type="text/javascript" >
                            document.forms[0].action="<c:out value='${_action}'/>";
                            document.forms[0].submit();
                        </script>
                    </c:if>
                    <c:if test="${generaArchivosTercerosDTO.tipoQna eq '1'}">
                        <fsn:filter property="hp_ini_pago" condition="<>" path="hpIniPago"/>
                    </c:if>
                </tr>
            </table>

        </c:when>
        <c:otherwise> 
             No existen registros  
            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
        </c:otherwise>   
    </c:choose> --%>
</html:form>

