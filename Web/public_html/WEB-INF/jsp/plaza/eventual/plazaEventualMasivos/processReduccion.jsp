<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html:form name="checkBoxTest" modelAttribute="reduccionContratoMasivaDTO" action="processReduccion.do">

    <h1><spring:message code="sireh.label.plaza.masivas.eventuales.reduccion.titulo"/></h1>  
    <p>&nbsp;</p>
    <table width="75%" align="center">
        <tr> 
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.masivas.eventuales.prorroga.titulo.busqueda"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table width="100%" border="0" align="center">
                        <tr>
                            <td class="label"> * <spring:message code="sireh.label.plaza.masivas.eventuales.prorroga.finVigencia"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tdPlazaFinContEventualProrroga" path="plazaFinContString" />
                            </td>
                        </tr>
                        <tr>
                            <td class="label"><spring:message code="sireh.label.plaza.masivas.eventuales.prorroga.unidad"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tdPlazaUnidadesEventualesProrroga" path="idUnidadNom"  progress="true" multiple="true" width="560" parentPath="plazaFinContString"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <table width="100%" align="center">
                    <c:if test="${reduccionContratoMasivaDTO.muestraRegistros}" >
                        <tr>
                            <td align="center"><fsn:submit value="submit.search" action="plazaEventualMasiva/${reduccionContratoMasivaDTO.urlOrigen}" path="buscar"/></td>
                        </tr>
                    </c:if>
                    <c:if test="${not reduccionContratoMasivaDTO.muestraRegistros}">
                        <tr>
                            <td colspan="2" align="left" height="20px" valign="middle">
                                <strong>
                                    <spring:message code="sireh.form.required.fields"/>
                                </strong>
                            </td>
                        </tr>
                       <tr>
                           <td align="right"><fsn:submit value="submit.search" action="plazaEventualMasiva/${reduccionContratoMasivaDTO.urlOrigen}" path="buscar"/></td>
                           <td align="left"><fsn:submit value="submit.clean" action="plazaEventualMasiva/${reduccionContratoMasivaDTO.urlOrigen}" path="cancel"/></td>
                        </tr>
                    </c:if>
                </table>
                <c:if test="${reduccionContratoMasivaDTO.muestraRegistros}" >
                    <fieldset>
                        <legend>
                            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.masivas.eventuales.reduccion.titulo.reduccion"/>&nbsp;&nbsp;</strong>
                        </legend>
                        <table width="100%" align="center" border="0">
                            <tr>   
                                <td class="label"> * <spring:message code="sireh.label.plaza.masivas.eventuales.reduccion.fechaReduccion"></spring:message></td>
                                <td><fsn:calendar path="fechaTerminoVigencia" /></td>            
                            </tr>
                            <tr>
                                <td class="label"><spring:message code="sireh.label.plaza.masivas.eventuales.reduccion.observaciones"></spring:message></td>
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
                            <td align="right"><fsn:submit value="submit.reducir" action="plazaEventualMasiva/${reduccionContratoMasivaDTO.urlDestino}" path="reduccion" /></td>
                            <td align="left"><fsn:submit value="submit.clean" action="plazaEventualMasiva/${reduccionContratoMasivaDTO.urlOrigen}" path="cancel"/></td>
                        </tr>
                    </table>
                </c:if>
            </td>
        </tr>
    </table>
        
    <c:choose>
        <c:when test="${reduccionContratoMasivaDTO.muestraRegistros}">
            <fsn:filter property="to_char(p.plaza_fin_cont,'dd/MM/yyyy')" condition="=" path="plazaFinContString" />
            <fsn:filter property="p.id_unidad_nom" condition="in" path="idUnidadNomFilter" />
            <fsn:pagedList beanName="tdPlazaProrrogaEventuales" baseUrl="${reduccionContratoMasivaDTO.urlOrigen}" maxRows="500" checkbox="true" chkProperty="idPlaza" appendFilters="true">
                <display:table name="tdPlazaProrrogaEventuales" form="checkBoxTest" decorator="checkboxTableDecorator" class="displaytag" pagesize="10" export="true" id="row" requestURI="${requestURI}" sort="list" >
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.excluir" property="checkbox" media="html"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.plaza" property="idPlaza" sortable="true" />
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.puesto" property="idPuestoNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.zona" property="idZonaEcoNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.unidad" property="idUnidadNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.nombramiento" property="idNombramiento" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.jerarquia" property="idJerarquia" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.nivel" property="idNivelPto" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.situacion.plaza" property="idSitPlaza" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.inicio" property="plazaIniCont" sortable="true" format="{0,date,dd-MM-yyyy}"/>
                    <display:column titleKey="sireh.label.plaza.masivas.eventuales.prorroga.vigencia" property="plazaFinCont" sortable="true" format="{0,date,dd-MM-yyyy}"/>
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

    <c:forEach items="${reduccionContratoMasivaDTO.idUnidadNomFilter}" var="listaIdUnidadNomFilter" varStatus="status">
        <input type="hidden" name="idUnidadNomFilter[<c:out value='${status.index}'/>]" value="<c:out value='${reduccionContratoMasivaDTO.idUnidadNomFilter[status.index]}'/>" />
    </c:forEach>
    
    <html:hidden path="plazaFinContStringHidden" />
    <html:hidden path="inicioQuincenaCaptura" />
    <html:hidden path="urlOrigen" />
    <html:hidden path="urlDestino" />
    <html:hidden path="anio"/>
</html:form>