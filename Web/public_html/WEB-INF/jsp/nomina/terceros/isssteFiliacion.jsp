<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<spring:message code="sireh.label.reportes.en.qna" var="enQna"/>
<spring:message code="sireh.label.reportes.no.qna" var="noQna"/>

<spring:message code="sireh.label.reportes.tipo.entero" var="tEntero"/>
<spring:message code="sireh.label.reportes.tipo.cancelado" var="tCancelado"/>
<spring:message code="sireh.label.reportes.tipo.devoluciones" var="tDevoluciones"/>

<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <h1> <strong> <spring:message code="sireh.label.nomina.isssteFiliacion.titulo"/> </strong> </h1> 
                <p>&nbsp;</p>
            </td>   
        </tr>
        <tr> <td> </td> </tr>
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.2em'/>
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
                                    <html:option value="d" label="${tDevoluciones}"/>
                                </html:select>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
            <td>  </td>
        </tr>
        <tr><td>
    
    
    <c:choose>
            <c:when test="${generaArchivosTercerosDTO.muestraRegistros}">
            <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.search" path="muestraRegistros" action="tercerosNomina/generaIssste.do"/>
                        <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/isssteFiliacion.do"/>
                    </td>
                </tr>
            
            </table>
            

            <fsn:filter property="h.hp_qna_pago" condition="=" path="hpQnaPago"/>
            <fsn:filter property="c.cpc_qna_aplica" condition="=" path="hpQnaPago"/>

            <c:if test="${generaArchivosTercerosDTO.tipoQna eq '0'}">
                <fsn:filter property="hp_ini_pago" condition="=" path="hpIniPago"/>    
            </c:if>
            <c:if test="${generaArchivosTercerosDTO.tipoQna eq '1'}">
                <fsn:filter property="hp_ini_pago" condition="<>" path="hpIniPago"/>
            </c:if>
            
            <fsn:pagedList beanName="${generaArchivosTercerosDTO.beanlista}"
                                   baseUrl="tercerosNomina/generaTercero.do" 
                                   checkbox="true" 
                                   chkProperty="seleccionConsecNomina" 
                                   appendFilters="false">
                        <display:table name="${generaArchivosTercerosDTO.beanlista}"
                                       form="checkBoxTest"
                                       class="displaytag" 
                                       pagesize="100" 
                                       export="true"
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list"
                                       decorator="checkboxTableDecorator">
                           <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.selecciona"
                                           style="text-align: center" 
                                           property="checkbox" 
                                           media="html"/>                            
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.quincenaPago" 
                                            property="qnaPago" 
                                            sortable="false"/>
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.tipoNomina" 
                                            property="tipoNomina" 
                                            sortable="false"/>             
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.consecutivoNomina" 
                                            property="consecNomina" 
                                            sortable="false"/>
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.complemento" 
                                            property="numComplem" 
                                            sortable="false"/> 
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.grupoPago" 
                                            property="gpoPago" 
                                            sortable="false"/>            
     

                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                            <display:setProperty name="export.pdf" value="true"/>
                            <display:setProperty name="basic.msg.empty_list">
                                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                            </display:setProperty>
                        </display:table>
                    </fsn:pagedList>

                <table width="100%">
                    <tr align="center">
                        <td>
                            <fsn:submit value="submit.generate" path="generaArchivo" action="tercerosNomina/generarArchivoIssste.do" progressIcon="false" /> 
                            <h1> <c:out value="${generaArchivosTercerosDTO.leyenda}"/>  </h1>
                        </td>
                    </tr>
                </table>
                
            </c:when>
             <c:when test="${generaArchivosTercerosDTO.generaArchivo}">
             <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/isssteFiliacion.do"/>
                    </td>
                </tr>
            </table>
                
<%--                <c:forEach items="${generaArchivosTercerosDTO.seleccionConsecNomina}" var="idNomina">
                <input type="hidden" name="seleccionConsecNomina" value="<c:out value='${idNomina}'/>"/>
                </c:forEach>
--%>                


                <tr> <td align="center">
                    <h1> <c:out value="${generaArchivosTercerosDTO.leyendag}"/>  </h1>
                </td> </tr>

                <c:url value="/tercerosNomina/generarArchivoIssste.do" var="_action" scope="page"/>
                
                <script type="text/javascript" >
                document.forms[0].action="<c:out value='${_action}'/>";
                document.forms[0].submit();
                </script>
             </c:when>
        <c:otherwise>
            <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.search" action="tercerosNomina/generaIssste.do"/>
                        <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/isssteFiliacion.do"/>
                    </td>
                </tr>
            </table>
        </c:otherwise>
    </c:choose>
     </td> </tr>
    </table>
</html:form>
