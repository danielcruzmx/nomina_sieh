<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form name="checkBoxTest" modelAttribute="historicoMeritoDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.merito.historico.merito.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table width="80%">
        <tr align="left">
            <td class="label"> * <spring:message code="sireh.label.merito.historico.merito.rfc"></spring:message></td>
            <td><fsn:input path="tdNmhRfcUnico"/></td>
         </tr>
       <tr>
            <td class="label"> * <spring:message code="sireh.label.merito.historico.merito.ciclo"></spring:message></td>
            <td align="left">
                <fsn:option key="" value="selectList.nonValue" />
                <fsn:selectList beanName="tcAnioConsultaMerito" path="tdNmhCiclo"  /></td>
        </tr>         
         <tr align="left">
            <td class="label"> * <spring:message code="sireh.label.merito.historico.merito.causal"></spring:message></td>
            <td align="left"><fsn:option key="" value="selectList.nonValue" />
                <fsn:selectList beanName="tcCausalMerito" path="tdNmhCveCausal"  />
            </td>
        </tr>
        <tr align="left">
            <td class="label"> * <spring:message code="sireh.label.merito.historico.merito.remesa"></spring:message></td>
            <td align="left"><fsn:option key="" value="selectList.nonValue" />
                <fsn:selectList beanName="tcRemesaEmpenoPorCicloYCausalCompleto" path="tdNmhOp"  progress="true"  parentPath="tdNmhCveCausal" filterPaths="tdNmhCiclo" />
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
                            action="notaDeMerito/${historicoMeritoDTO.urlOrigen}"
                            progressBar="true"/>&nbsp; 
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="notaDeMerito/${historicoMeritoDTO.urlOrigen}"
                            progressBar="true"/>
                </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${historicoMeritoDTO.muestraRegistros}">
            <fsn:filter property="h.NMH_RFC_UNICO" condition="like" path="tdNmhRfcUnico" />
            <fsn:filter property="h.NMH_CICLO" condition="=" path="tdNmhCiclo" />
            <fsn:filter property="h.NMH_CAUSAL" condition="=" path="tdNmhCveCausal"  />
            <fsn:filter property="TRIM(h.NMH_OP)" condition="=" path="tdNmhOp" />
        
            <fsn:pagedList beanName="${historicoMeritoDTO.beanName}" 
                           checkbox="true"
                           baseUrl="${historicoMeritoDTO.urlOrigen}"
                           appendFilters="false">
                <div id="displayTagDiv">
                    <display:table name="${historicoMeritoDTO.beanName}" 
                                   class="displaytag" 
                                   pagesize="10" 
                                   decorator="checkboxTableDecorator"
                                   export="true" 
                                   id="row" 
                                   requestURI="${requestURI}" 
                                   sort="list">
                        <display:column titleKey="sireh.label.merito.historico.display.rfc" property="nmhRfcUnico" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.unidad" property="nmhCveUnidad" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.documento" property="nmhNumDocto" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.causal" property="descMhCausal" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.ciclo" property="nmhCiclo" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.remesa" property="nmhOp" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.fecha.registro" property="nmhFechaReg" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.tipo.plaza" property="nmhTipoPlaza" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.genero" property="idGenero" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.qnaPagoValidar" property="hpQnaPagoValidar" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.fecha.agregacion" property="nmhFechaAgre" sortable="true" format="{0,date,dd-MM-yyyy}" />
                        <display:column titleKey="sireh.label.merito.historico.display.usuario" property="usuario" sortable="true"/>
                        <display:column titleKey="sireh.label.merito.historico.display.fecha.modifico" property="fecModifico" sortable="true" format="{0,date,dd-MM-yyyy}" />
                        
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