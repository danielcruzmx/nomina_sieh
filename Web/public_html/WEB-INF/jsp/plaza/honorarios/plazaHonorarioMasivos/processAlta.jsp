<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html:form name="checkBoxTest" modelAttribute="altaMasivaDTO" action="processAlta.do">

    <h1><spring:message code="sireh.label.plaza.masivas.honorarios.altas.titulo"/></h1>  
    <p>&nbsp;</p>
    <table width="75%" align="center">
        <tr> 
            <td>
                <fieldset>
                <legend>
                    <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.masivas.honorarios.altas.titulo.busqueda"/>&nbsp;&nbsp;</strong>
                </legend>
                    <table width="100%" border="0" align="center">
                        <tr>
                            <td class="label"> * <spring:message code="sireh.label.plaza.masivas.honorarios.altas.usuario"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tnMovtosEmpPlaUsuarioHonorar" path="usuario" />
                            </td>
                        </tr>
                        <tr>
                            <td class="label"> * <spring:message code="sireh.label.plaza.masivas.honorarios.altas.quincena"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tnMovtosEmpPlaQnaCapturaHonorar" path="qnaCaptura" parentPath="usuario" progress="true" />
                            </td>
                        </tr>
                        <tr>
                            <td class="label"> * <spring:message code="sireh.label.plaza.masivas.honorarios.altas.fecha.baja"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tnMovtosEmpPlaMepIniContHonorar" path="plazaFinContString" parentPath="qnaCaptura" filterPaths="usuario" progress="true" />
                            </td>
                        </tr>
                        <tr>
                            <td class="label"><spring:message code="sireh.label.plaza.masivas.honorarios.altas.unidad"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="tnMovtosEmpPlaUnidadesHonorar" path="idUnidadNom"  progress="true" multiple="true" width="560" parentPath="plazaFinContString" filterPaths="qnaCaptura,usuario"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <table width="100%" align="center">
                    <c:if test="${altaMasivaDTO.muestraRegistros}" >
                        <tr>
                            <td align="center"><fsn:submit value="submit.search" action="plazaHonorarioMasiva/${altaMasivaDTO.urlOrigen}" path="buscar"/></td>
                        </tr>
                    </c:if>
                    <c:if test="${not altaMasivaDTO.muestraRegistros}" >
                        <tr>
                            <td colspan="2" align="left" height="20px" valign="middle">
                                <strong>
                                    <spring:message code="sireh.form.required.fields"/>
                                </strong>
                            </td>
                        </tr>
                        <tr>
                            <td align="right"><fsn:submit value="submit.search" action="plazaHonorarioMasiva/${altaMasivaDTO.urlOrigen}" path="buscar"/></td>
                            <td align="left"><fsn:submit value="submit.clean" action="plazaHonorarioMasiva/${altaMasivaDTO.urlOrigen}" path="cancel"/></td>
                        </tr>
                    </c:if>
                </table>
                <c:if test="${altaMasivaDTO.muestraRegistros}" >
                <fieldset>
                        <legend>
                            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.masivas.honorarios.altas.titulo.alta"/>&nbsp;&nbsp;</strong>
                        </legend>
                        <table width="100%" align="center" border="0">
                            <tr>
                                <td class="label"> * <spring:message code="sireh.label.plaza.masivas.honorarios.altas.inicioVigencia"></spring:message></td>
                                <td><fsn:calendar path="fechaInicioVigencia" /></td>            
                            </tr>
                            <tr>   
                                <td class="label"> * <spring:message code="sireh.label.plaza.masivas.honorarios.altas.finVigencia"></spring:message></td>
                                <td><fsn:calendar path="fechaTerminoVigencia" /></td>
                            </tr>
                            <tr>
                                <td class="label"><spring:message code="sireh.label.plaza.masivas.honorarios.altas.observaciones"></spring:message></td>
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
                            <td align="right"><fsn:submit value="submit.alta" action="plazaHonorarioMasiva/${altaMasivaDTO.urlDestino}" path="alta" /></td>
                            <td align="left"><fsn:submit value="submit.clean" action="plazaHonorarioMasiva/${altaMasivaDTO.urlOrigen}" path="cancel"/></td>
                        </tr>
                    </table>
                </c:if>
            </td>
        </tr>
    </table>
    <c:choose>
        <c:when test="${altaMasivaDTO.muestraRegistros}">
            <fsn:filter property="m.usuario" condition="=" path="usuario" />
            <fsn:filter property="to_char(m.mep_fin_cont,'dd/MM/yyyy')" condition="=" path="plazaFinContString" />
            <fsn:filter property="m.mep_qna_captura" condition="=" path="qnaCaptura" />
            <fsn:filter property="m.id_unidad_nom" condition="in" path="idUnidadNomFilter" />
            <fsn:pagedList beanName="tnMovtosEmpPlaAltaHonorar" baseUrl="${altaMasivaDTO.urlOrigen}" maxRows="1000" checkbox="true" chkProperty="idPlaza" appendFilters="true">
                <display:table name="tnMovtosEmpPlaAltaHonorar" form="checkBoxTest" decorator="checkboxTableDecorator" class="displaytag" pagesize="1000" export="true" id="row" requestURI="${requestURI}" sort="list" >
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.altas.excluir" property="checkbox" media="html"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.altas.plaza" property="idPlaza" sortable="true" />
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.altas.rfc" property="mepRfc" sortable="true" />
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.altas.puesto" property="idPuestoNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.altas.zona" property="idZonaEcoNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.altas.unidad" property="idUnidadNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.altas.nombramiento" property="idNombramientoNom" sortable="true"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.altas.inicio" property="mepIniCont" sortable="true" format="{0,date,dd-MM-yyyy}"/>
                    <display:column titleKey="sireh.label.plaza.masivas.honorarios.altas.vigencia" property="mepFinCont" sortable="true" format="{0,date,dd-MM-yyyy}"/>
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
    
    
    <c:forEach items="${altaMasivaDTO.idUnidadNomFilter}" var="listaIdUnidadNomFilter" varStatus="status">
        <input type="hidden" name="idUnidadNomFilter[<c:out value='${status.index}'/>]" value="<c:out value='${altaMasivaDTO.idUnidadNomFilter[status.index]}'/>" />
    </c:forEach>
    
    <html:hidden path="plazaFinContStringHidden" />
    <html:hidden path="urlOrigen" />
    <html:hidden path="urlDestino" />
    <html:hidden path="inicioQuincenaCaptura"/>
    <html:hidden path="finQuincenaCaptura"/>
    <html:hidden path="diasRetroactividad"/>
    <html:hidden path="anio"/>
</html:form>