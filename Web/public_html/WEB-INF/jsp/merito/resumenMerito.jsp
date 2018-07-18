<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form name="checkBoxTest" modelAttribute="resumenMeritoDTO">

    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.merito.resumen.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table width="80%">
        <tr align="left">
            <td class="label"> * <spring:message code="sireh.label.merito.resumen.rfc"></spring:message></td>
            <td align="left"><fsn:input path="tdNmrRfcUnico"/></td>
         </tr>
       <tr>
            <td class="label"> * <spring:message code="sireh.label.merito.resumen.ciclo"></spring:message></td>
            <td align="left"><fsn:option key="" value="selectList.nonValue" />
                <fsn:selectList beanName="tcAnioConsultaMerito" path="tdNmrCiclo"  /></td>
        </tr>         
         <tr align="left">
            <td class="label"> * <spring:message code="sireh.label.merito.resumen.causal"></spring:message></td>
            <td align="left"><fsn:option key="" value="selectList.nonValue" />
                <fsn:selectList beanName="tcCausalMerito" path="tdNmrCveCausal"  />
            </td>
        </tr>
        <tr align="left">
            <td class="label"> * <spring:message code="sireh.label.merito.resumen.remesa"></spring:message></td>
            <td align="left"><fsn:option key="" value="selectList.nonValue" />
                <fsn:selectList beanName="tcRemesaEmpenoPorCicloYCausalCompleto" path="tdNmrOp"  progress="true"  parentPath="tdNmrCveCausal" filterPaths="tdNmrCiclo" />
            </td>
        </tr> 
        <tr align="left">
            <td class="label"> * <spring:message code="sireh.label.merito.resumen.remesa.interna"></spring:message></td>
            <td align="left"><fsn:option key="" value="selectList.nonValue" />
                <fsn:selectList beanName="tcRemesaInternaMerito" path="tdNmrRemesaInterna"  progress="true"  parentPath="tdNmrCiclo"  />
            </td>
        </tr> 
         <tr>
            <td align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
        </tr>
    </table>
    
     <table width="100%">
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="notaDeMerito/${resumenMeritoDTO.urlOrigen}"
                            progressBar="true"/>&nbsp; 
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="notaDeMerito/${resumenMeritoDTO.urlOrigen}"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${resumenMeritoDTO.muestraRegistros}">
            <fsn:filter property="n.NMR_RFC" condition="like" path="tdNmrRfcUnico" />
            <fsn:filter property="n.NMR_CICLO_PAGO" condition="=" path="tdNmrCiclo" />
            <fsn:filter property="n.NMR_CAUSAL" condition="=" path="tdNmrCveCausal"  />
            <fsn:filter property="TRIM(n.NMR_OP)" condition="=" path="tdNmrOp" />
            <fsn:filter property="TRIM(n.NMR_REMESA_INTERNA)" condition="=" path="tdNmrRemesaInterna" />
            
            <fsn:pagedList beanName="${resumenMeritoDTO.beanName}" 
                           checkbox="true"
                           baseUrl="${resumenMeritoDTO.urlOrigen}" 
                           appendFilters="false">
                <div id="displayTagDiv">
                    <display:table name="${resumenMeritoDTO.beanName}" 
                                   class="displaytag" 
                                   pagesize="10" 
                                   decorator="checkboxTableDecorator"
                                   export="true"
                                   id="row" 
                                   requestURI="${requestURI}"
                                   sort="list">
                        <display:column titleKey="sireh.label.merito.resumen.display.rfc" 
                                        property="nmrRfc" 
                                        href="${resumenMeritoDTO.urlDestino}.do" 
                                        paramId="tdNmrRfc" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.merito.resumen.display.ciclo" 
                                        property="nmrCicloPago" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.merito.resumen.display.causal" 
                                        property="descNmCausal" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.merito.resumen.display.ciclo.inicial" property="nmrCicloInicial" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.resumen.display.ciclo.final" property="nmrCicloFinal" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.resumen.display.dias.pagados" property="nmrDiasPagados" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.resumen.display.remesa" property="nmrOp" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.resumen.display.remesa.interna" property="nmrRemesaInterna" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.resumen.display.ofic.envio" property="nmrOficEnvio" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.resumen.display.fec.envio" property="nmrFecEnvio" sortable="true" format="{0,date,dd-MM-yyyy}" nulls="false" />
                        <display:column titleKey="sireh.label.merito.resumen.display.importe.bruto" property="nmrImpteBruto" sortable="true" format="{0,number,$#,##0.00}"  />
                        <display:column titleKey="sireh.label.merito.resumen.display.importe.neto" 
                                        property="nmrImpteNeto" 
                                        sortable="true" 
                                        format="{0,number,$#,##0.00}" />
                        <display:column titleKey="sireh.label.merito.resumen.display.importe.pension" 
                                        property="nmrImptePension" 
                                        sortable="true" 
                                        format="{0,number,$#,##0.00}" />
                        <display:column titleKey="sireh.label.merito.resumen.display.importe.isr" 
                                        property="nmrImpteIsr" 
                                        sortable="true" 
                                        format="{0,number,$#,##0.00}" />
                        
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                            <display:setProperty name="export.pdf" value="true"/>
                            <display:setProperty name="basic.msg.empty_list">
                                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                            </display:setProperty>
                     </display:table>
                </div>
            </fsn:pagedList>
        </c:when>
        <c:otherwise>
            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>