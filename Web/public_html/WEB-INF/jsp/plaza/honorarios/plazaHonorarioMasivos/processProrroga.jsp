<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html:form name="checkBoxTest" modelAttribute="prorrogaMasivaDTO" action="processProrroga.do">

    <h1><spring:message code="sireh.label.plaza.masivas.honorarios.prorroga.titulo"/></h1>  
    <p>&nbsp;</p>
    <table width="75%" align="center">
        <tr> 
            <td>
                <fieldset>
                <legend>
                    <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.masivas.honorarios.prorroga.titulo.busqueda"/>&nbsp;&nbsp;</strong>
                </legend>
                    <table width="100%" border="0" align="center">
                        <tr>
                            <td class="label"> * <spring:message code="sireh.label.plaza.masivas.honorarios.prorroga.finVigencia"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tdPlazaFinContHonorariosProrroga" path="plazaFinContString" />
                            </td>
                        </tr>
                        <tr>
                            <td class="label"><spring:message code="sireh.label.plaza.masivas.honorarios.prorroga.unidad"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tdPlazaUnidadesHonorariosProrroga" path="idUnidadNom"  progress="true" multiple="true" width="560" parentPath="plazaFinContString"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <table width="100%" align="center">
                    <c:if test="${prorrogaMasivaDTO.muestraRegistros}" >
                    <tr>
                        <td align="center"><fsn:submit value="submit.search" action="plazaHonorarioMasiva/${prorrogaMasivaDTO.urlOrigen}" path="buscar"/></td>
                        </tr>
                    </c:if>    
                    <c:if test="${not prorrogaMasivaDTO.muestraRegistros}">
                        <tr>
                            <td colspan="2" align="left" height="20px" valign="middle">
                                <strong>
                                    <spring:message code="sireh.form.required.fields"/>
                                </strong>
                            </td>
                        </tr>
                        <tr>
                            <td align="right"><fsn:submit value="submit.search" action="plazaHonorarioMasiva/${prorrogaMasivaDTO.urlOrigen}" path="buscar"/></td>
                            <td align="left"><fsn:submit value="submit.clean" action="plazaHonorarioMasiva/${prorrogaMasivaDTO.urlOrigen}" path="cancel"/></td>
                        </tr>
                    </c:if>
                </table>
        
                <c:if test="${prorrogaMasivaDTO.muestraRegistros}" >
                    <fieldset>
                        <legend>
                            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.masivas.honorarios.prorroga.titulo.prorroga"/>&nbsp;&nbsp;</strong>
                        </legend>
                        <table width="100%" align="center" border="0">
                            <tr>
                                <td class="label"> * <spring:message code="sireh.label.plaza.masivas.honorarios.prorroga.fechaProrroga"></spring:message></td>
                                <td><fsn:calendar path="fechaTerminoVigencia" /></td>            
                            </tr>
                            <tr>
                                <td class="label"><spring:message code="sireh.label.plaza.masivas.honorarios.prorroga.observaciones"></spring:message></td>
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
                            <td align="right"><fsn:submit value="submit.prorroga" action="plazaHonorarioMasiva/${prorrogaMasivaDTO.urlDestino}" progressIcon="true" path="prorroga" /></td>
                            <td align="left"><fsn:submit value="submit.clean" action="plazaHonorarioMasiva/${prorrogaMasivaDTO.urlOrigen}" path="cancel"/></td>
                        </tr>
                    </table>
                </c:if>
            </td>
        </tr>
    </table>
    <c:choose>
        <c:when test="${prorrogaMasivaDTO.muestraRegistros}">
            <fsn:filter property="to_char(p.plaza_fin_cont,'dd/MM/yyyy')" condition="=" path="plazaFinContString" />
            <fsn:filter property="p.id_unidad_nom" condition="in" path="idUnidadNomFilter" />
            <fsn:pagedList beanName="tdPlazaProrrogaHonorarios" baseUrl="${prorrogaMasivaDTO.urlOrigen}" maxRows="500" checkbox="true" chkProperty="idPlaza" appendFilters="true">
                <display:table name="tdPlazaProrrogaHonorarios" form="checkBoxTest" decorator="checkboxTableDecorator" class="displaytag" pagesize="10" export="true" id="row" requestURI="${requestURI}" sort="list" >
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.excluir" property="checkbox" media="html"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.plaza" property="idPlaza" sortable="true" />
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.puesto" property="idPuestoNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.zona" property="idZonaEcoNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.unidad" property="idUnidadNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.nombramiento" property="idNombramiento" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.jerarquia" property="idJerarquia" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.nivel" property="idNivelPto" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.situacion.plaza" property="idSitPlaza" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.inicio" property="plazaIniCont" sortable="true" format="{0,date,dd-MM-yyyy}"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.prorroga.vigencia" property="plazaFinCont" sortable="true" format="{0,date,dd-MM-yyyy}"/>
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
    
    
    <c:forEach items="${prorrogaMasivaDTO.idUnidadNomFilter}" var="listaIdUnidadNomFilter" varStatus="status">
        <input type="hidden" name="idUnidadNomFilter[<c:out value='${status.index}'/>]" value="<c:out value='${prorrogaMasivaDTO.idUnidadNomFilter[status.index]}'/>" />
    </c:forEach>
    
    <html:hidden path="plazaFinContStringHidden" />
    <html:hidden path="inicioQuincenaCaptura" />
    <html:hidden path="urlOrigen" />
    <html:hidden path="urlDestino" />
    <html:hidden path="anio"/>
    
</html:form>