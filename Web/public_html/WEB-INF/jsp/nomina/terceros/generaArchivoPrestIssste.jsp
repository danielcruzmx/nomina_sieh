<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!--%@ taglib uri="http://displaytag.sf.net" prefix="display"%-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<spring:message code="sireh.label.reportes.en.qna" var="enQna"/>
<spring:message code="sireh.label.reportes.no.qna" var="noQna"/>
<spring:message code="sireh.label.reportes.tipo.entero" var="tEntero"/>
<spring:message code="sireh.label.reportes.tipo.cancelado" var="tCancelado"/>

<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <h1> <strong> <spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo.issste"/> </strong> </h1>
                <p>&nbsp;</p>
            </td>   
        </tr>
        <tr> <td> </td> </tr>
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.2em'>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo3"/></strong>
                    </legend>
                    <table width="100%" align="center" border="0">
                        <tr> <td>  </td> </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/> <fsn:selectList beanName="listaSoloQnasHistorico"  path="hpQnaPago" progress="true"  style="width: 100px;"/>
                            </td>      
                            <td>  </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.tipoQna"></spring:message></td>
                            <td align="left">
                                <html:select path="tipoQna" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="${enQna}"/>
                                    <html:option value="1" label="${noQna}"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.tipoTercero"></spring:message></td>
                            <td align="left">
                                <html:select path="tipoEntero" cssClass="uppercase">    
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="e" label="${tEntero}"/>
                                    <html:option value="c" label="${tCancelado}"/> 
                                </html:select>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
            <td></td>
        </tr>
        <tr><td>
    
    
    <c:choose>
            <c:when test="${generaArchivosTercerosDTO.muestraRegistros}">
            <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.search" path="muestraRegistros" action="tercerosNomina/generacionArchivoTerceroPrestIssste.do"/>
                        <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/initGeneraArchivoTercerosPrestIssste.do"/>
                    </td>
                </tr>
            </table>
            
                <jsp:include page="generaArchivoPrestIsssteGrid.jsp" />  

            <table width="100%">
                <tr align="center">
                    <td>
                        <fsn:submit value="submit.generate" path="generaArchivo" action="tercerosNomina/generaTerceroPrestIssste.do" progressIcon="false" /> 
                        <h1> <c:out value="${generaArchivosTercerosDTO.leyenda}"/>  </h1>
                    </td>
                </tr>
            </table>
                
            </c:when>
             <c:when test="${generaArchivosTercerosDTO.generaArchivo}">
             <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/initGeneraArchivoTercerosPrestIssste.do"/>
                    </td>
                </tr>
            </table>
            
                <jsp:include page="generaArchivoPrestIsssteGrid.jsp" />  

                <tr> <td align="center">
                    <h1> <c:out value="${generaArchivosTercerosDTO.leyendag}"/>  </h1>
                </td> </tr>

                <c:url value="/tercerosNomina/generaTerceroPrestIssste.do" var="_action" scope="page"/>
                
                <script type="text/javascript" >
                document.forms[0].action="<c:out value='${_action}'/>";
                document.forms[0].submit();
                </script>
             </c:when>
        <c:otherwise>
            <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.search" path="muestraRegistros" action="tercerosNomina/generacionArchivoTerceroPrestIssste.do"/>
                        <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/initGeneraArchivoTercerosPrestIssste.do"/>
                    </td>
                </tr>
            </table>
        </c:otherwise>
    </c:choose>
     </td> </tr>
    </table>
</html:form>
