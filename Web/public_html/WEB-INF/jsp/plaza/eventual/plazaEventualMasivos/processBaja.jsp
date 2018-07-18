<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html:form name="checkBoxTest" modelAttribute="plazaEventualMasivaDTO" action="processBaja.do">

    <h1><spring:message code="sireh.label.plaza.masivas.eventuales.bajas.titulo"/></h1>  
    <p>&nbsp;</p>
    <table width="75%" align="center">
        <tr> 
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.masivas.eventuales.bajas.titulo.busqueda"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table width="100%" border="0" align="center">
                        <tr>   
                            <td class="label"> * <spring:message code="sireh.label.plaza.masivas.eventuales.bajas.fecha.termino.vigencia"></spring:message></td>
                            <td>
                                <fsn:filter property="TO_NUMBER(TO_CHAR(p.plaza_fin_cont,'yyyy'))" condition="<=" path="plazaFinContYearFilter" />
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcBajasEventualesFechaFinCont" path="plazaFinContString" />
                            </td>
                        </tr>
                        <tr>
                            <td class="label"><spring:message code="sireh.label.plaza.masivas.eventuales.bajas.unidad.filtro"></spring:message></td>
                            <td >
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcBajasPlazasEventualesUnidad" path="idUnidadNom"  progress="true" parentPath="plazaFinContString" multiple="true" width="560"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <table width="100%" align="center">
                    <c:if test="${plazaEventualMasivaDTO.muestraRegistros}" >
                    <tr>
                        <td align="center"><fsn:submit value="submit.search" action="plazaEventualMasiva/${plazaEventualMasivaDTO.urlOrigen}" path="buscar"/></td>
                    </tr>
                    </c:if>
                    <c:if test="${not plazaEventualMasivaDTO.muestraRegistros}" >
                        <tr>
                            <td colspan="2" align="left" height="20px" valign="middle">
                                <strong>
                                    <spring:message code="sireh.form.required.fields"/>
                                </strong>
                            </td>
                        </tr>
                        <tr>
                            <td align="right"><fsn:submit value="submit.search" action="plazaEventualMasiva/${plazaEventualMasivaDTO.urlOrigen}" path="buscar"/></td>
                            <td align="left"><fsn:submit value="submit.clean" action="plazaEventualMasiva/${plazaEventualMasivaDTO.urlOrigen}" path="cancel"/></td>
                        </tr>
                    </c:if>
                </table>
                <c:if test="${plazaEventualMasivaDTO.muestraRegistros}" >
                    <fieldset>
                        <legend>
                            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.masivas.eventuales.bajas.titulo.baja"/>&nbsp;&nbsp;</strong>
                        </legend>
                        <table width="100%" align="center" border="0">
                            <tr>   
                                <td class="label"> * <spring:message code="sireh.label.plaza.masivas.eventuales.bajas.fecha.baja"></spring:message></td>
                                <td><fsn:calendar path="fechaBaja" /></td>     
                            </tr>
                            <tr>
                                <td class="label"><spring:message code="sireh.label.plaza.masivas.eventuales.altas.observaciones"></spring:message></td>
                                <td><fsn:textarea rows="5" cols="100" uppercase="false" path="mepObserva" /> </td>
                            </tr>
                        </table>
                    </fieldset>
                    <table width="100%" align="center">
                        <tr>
                            <td colspan="2" align="left" height="20px" valign="middle">
                                <strong>
                                    <spring:message code="sireh.form.required.fields"/>
                                </strong>
                            </td>
                        </tr>
                        <tr>
                            <td align="right"><fsn:submit value="submit.baja" action="plazaEventualMasiva/${plazaEventualMasivaDTO.urlDestino}" path="baja" /></td>
                            <td align="left"><fsn:submit value="submit.clean" action="plazaEventualMasiva/${plazaEventualMasivaDTO.urlOrigen}" path="cancel"/></td>
                        </tr>
                    </table>
                </c:if>
            </td>
        </tr>
    </table>
    <c:choose>
        <c:when test="${plazaEventualMasivaDTO.muestraRegistros}">
            <fsn:filter property="to_char(p.plaza_fin_cont,'dd/MM/yyyy')" condition="=" path="plazaFinContString" />
            <fsn:filter property="p.idUnidadNom" condition="in" path="idUnidadNomFilter" />
            <fsn:pagedList beanName="tcBajasPlazasEventuales" baseUrl="${plazaEventualMasivaDTO.urlOrigen}" maxRows="1000" checkbox="true" chkProperty="idPlaza" appendFilters="true">
                <display:table name="tcBajasPlazasEventuales" form="checkBoxTest" decorator="checkboxTableDecorator" class="displaytag" pagesize="1000" export="true" id="row" requestURI="${requestURI}" sort="list" >
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.excluir" property="checkbox" media="html"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.plaza" property="idPlaza" sortable="true" />
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.puesto" property="idPuestoNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.zona" property="idZonaEcoNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.unidad" property="idUnidadNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.nombramiento" property="idNombramiento" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.jerarquia" property="idJerarquia" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.nivel" property="idNivelPto" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.situacion.plaza" property="idSitPlaza" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.inicio" property="plazaIniCont" sortable="true" format="{0,date,dd-MM-yyyy}"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.bajas.vigencia" property="plazaFinCont" sortable="true" format="{0,date,dd-MM-yyyy}"/>
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="export.excel" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                        </display:setProperty>
                 </display:table>
             
            </fsn:pagedList>
        </c:when>
        <c:otherwise>
            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
        </c:otherwise>
    </c:choose>
    
    
    <c:forEach items="${plazaEventualMasivaDTO.idUnidadNomFilter}" var="listaIdUnidadNomFilter" varStatus="status">
        <input type="hidden" name="idUnidadNomFilter[<c:out value='${status.index}'/>]" value="<c:out value='${plazaEventualMasivaDTO.idUnidadNomFilter[status.index]}'/>" />
    </c:forEach>
    
    <html:hidden path="plazaFinContStringHidden" />
    <html:hidden path="plazaFinContYearFilter" />
    <html:hidden path="urlOrigen" />
    <html:hidden path="urlDestino" />
    <html:hidden path="finQuincenaCaptura"/>
    <html:hidden path="diasRetroactividad"/>
    <html:hidden path="anio"/>
    
</html:form>