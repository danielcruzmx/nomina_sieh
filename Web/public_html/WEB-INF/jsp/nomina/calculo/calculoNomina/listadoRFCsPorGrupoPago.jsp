<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    #listaNominasQnaPorQna {
        display:none;
    }
    
    .pagelinks {
        display:none;
    }
</style>

<html:form id="formPago" modelAttribute="pagoDTO">

    <html:hidden path="idGrupoPago" />
    <html:hidden path="descGrupoPago" />
    <html:hidden path="idQna" />
    <html:hidden path="idTipoNomina" />
    <html:hidden path="status" />
    <html:hidden path="casoMuestraOld"/>
    <html:hidden id="idPlaza" path="idPlaza" />
    
    <h1><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.titulo" arguments="${pagoDTO.descGrupoPago}"/></h1>

    <fsn:filter property="TN_NOMINA.ID_NOMINA" condition="=" path="idQna" />
    <fsn:pagedList beanName="listaNominasQnaPorQna"
                   baseUrl="${pagoDTO.viewName}"
                   appendFilters="false"
                   maxRows="200" >
        
        <display:table name="listaNominasQnaPorQna" 
                       defaultsort="2" 
                       defaultorder="descending"
                       export="false"
                       class="displaytag" 
                       pagesize="10" 
                       id="qna" 
                       requestURI="${requestURI}" 
                       sort="list">
                       
            <display:setProperty name="paging.banner.no_items_found" value=""/>
            <display:setProperty name="paging.banner.one_item_found" value=""/>
            <display:setProperty name="paging.banner.all_items_found" value=""/>
            <display:setProperty name="paging.banner.some_items_found" value=""/>
            <display:setProperty name="paging.banner.page.selected" value=""/>
            
            <display:column property="nomQnaCaptura"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.qnaCaptura"
                            style="text-align: center;" 
                            sortable="true" />
            <display:column property="nomNumComplem"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.numComplem"
                            style="text-align: center;" 
                            sortable="true" />
            <display:column property="nomDescripcion"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.desc"
                            style="text-align: center;" 
                            sortable="true" />
            <display:column property="nomDescTipoNomina"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.tipoNomina"
                            style="text-align: center;" 
                            sortable="true" />
            <display:column property="nomDescGrupoPago"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.grupoPago"
                            style="text-align: center;" 
                            sortable="true" />
            <display:column property="status"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.status"
                            style="text-align: center;" 
                            sortable="true" />
         </display:table>
    </fsn:pagedList>

    <table align="center" border="0" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.grupoInfo.busqueda"/>&nbsp;&nbsp; </strong>
                    </legend>
                    <table align="center" border="0">
                        <tr>
                            <td align="right" class="label" width="10%"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc"/></td>
                            <td align="left" width="20%"><fsn:input path="rfcEmpleado"/></td>
                            <td align="right" class="label" width="10%"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombreEmpleado"/></td>
                            <td align="left" width="20%"><fsn:input path="nombreEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="10%"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.primerApellido"/></td>
                            <td align="left" width="20%"><fsn:input path="primerApellido"/></td>
                            <td align="right" class="label" width="10%"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.segundoApellido"/></td>
                            <td align="left" width="20%"><fsn:input path="segundoApellido"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="10%"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.jerarquia"/></td>
                            <td align="left" width="20%">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaJerarquias" path="idJerarquia" style="width:117px;" />
                            </td>
                            <td align="right" class="label" width="10%"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombramiento"/></td>
                            <td align="left" width="20%">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaNombramientos" path="idNombramiento" style="width:117px;" />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="10%"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nivelPto"/></td>
                            <td align="left" colspan="3">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaNiveles" path="idNivelPto" style="width:117px;" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4" align="center"><fsn:submit value="submit.search" action="calculoNomina/buscaRFCsPorGrupoPago.do"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>

    <fsn:filter property="td_empleado.RFC_EMPLEADO" condition="contains" path="rfcEmpleado" />  
    <fsn:filter property="td_empleado.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
    <fsn:filter property="td_empleado.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
    <fsn:filter property="td_empleado.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
    <fsn:filter property="tc_jerarquia.ID_JERARQUIA" condition="=" path="idJerarquia" />
    <fsn:filter property="tc_nombramiento.ID_NOMBRAMIENTO" condition="=" path="idNombramiento" />
    <fsn:filter property="TRIM(tc_atributo_puesto.ID_NIVEL_PTO)" condition="=" path="idNivelPto" />
    <fsn:filter property="td_empleado.CASO_MUESTRA" condition="=" path="casoMuestra" />
    <fsn:filter property="p.ID_GRUPO_PAGO" condition="=" path="idGrupoPago" />
    <fsn:filter property="p.HP_CONSEC_NOMINA" condition="=" path="idQna" />
    
    <fsn:pagedList beanName="listaPagosPorGrupo"
                   baseUrl="${pagoDTO.viewName}"
                   checkbox="true" 
                   chkProperty="casosMuestra"
                   appendFilters="false"
                   maxRows="200">
                   
        <display:table name="listaPagosPorGrupo"
                       class="displaytag" 
                       pagesize="10" 
                       export="false" 
                       id="pagoRow" 
                       requestURI="${requestURI}" 
                       sort="list"
                       decorator="checkboxTableDecorator">
                       
            <display:column titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc" 
                            style="text-align: center;" 
                            sortable="true">
                <a href="muestraDetallePorRFC.do?idGrupoPago=<c:out value='${pagoDTO.idGrupoPago}'/>&idQna=<c:out value='${pagoDTO.idQna}'/>&rfcEmpleado=<c:out value='${pagoRow.casosMuestra}'/>&idPlaza=<c:out value='${pagoRow.idPlaza}'/>&idTipoNomina=<c:out value='${param.idTipoNomina}'/>">
                    <c:out value="${pagoRow.casosMuestra}"/>
                </a>
            </display:column>
            <display:column property="nombreEmpleado"
                            titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombreEmpleado" 
                            style="text-align: center;" 
                            sortable="true"/>
            <display:column property="primerApellido"
                            titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.primerApellido" 
                            style="text-align: center;" 
                            sortable="true"/>
            <display:column property="segundoApellido"
                            titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.segundoApellido" 
                            style="text-align: center;" 
                            sortable="true"/>
            <display:column property="idPuestoNom"
                            titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPuestoNom" 
                            style="text-align: center;" 
                            sortable="true"/>
            <display:column property="idNivelPto"
                            titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nivelPto" 
                            style="text-align: center;" 
                            sortable="true"/>
            <display:column property="descJerarquia"
                            titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.jerarquia" 
                            style="text-align: center;" 
                            sortable="true"/>
            <display:column property="descNombramiento"
                            titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombramiento" 
                            style="text-align: center;" 
                            sortable="true"/>
            <%--display:column property="checkbox"
                            titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.casoMuestra" style="text-align: center;" sortable="true"
                            sortProperty="casoMuestra" defaultorder="descending" media="html"
                            --%>
            <c:if test="${pagoDTO.idTipoNomina != 'IN'}">
                <display:column titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.calculo" 
                                style="text-align: center;" 
                                sortable="true">
                    <a href="calculaNominaPorRFC.do?idGrupoPago=<c:out value='${pagoDTO.idGrupoPago}'/>&idQna=<c:out value='${pagoDTO.idQna}'/>&rfcEmpleado=<c:out value="${pagoRow.casosMuestra}"/>&idPlaza=<c:out value="${pagoRow.idPlaza}"/>">
                        <spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.calculoField"/>
                    </a>
                </display:column>
            </c:if>
            
            <display:setProperty name="paging.banner.placement" value="bottom"/>
            <display:setProperty name="export.pdf" value="false"/>
            <display:setProperty name="basic.msg.empty_list">
                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
            </display:setProperty>
            
         </display:table>
         
    </fsn:pagedList>
    
    <table align="center" width="50%" border="0">
        <tr>
            <td align="center">
                <fsn:submit value="submit.export.nomcontodoscptos" action="calculoNomina/historicoRevisionTodos.do" progressIcon="false" />
            </td>
            <td align="center">
                <fsn:submit value="submit.export.nomconcptospago" action="calculoNomina/historicoRevisionConPago.do" progressIcon="false" />
            </td>
            <td align="center">
                <fsn:submit value="submit.export.nomconpapago" action="calculoNomina/historicoRevisionConPA.do" progressIcon="false" />
            </td>
            <td align="center">
                <fsn:submit value="submit.clean" action="calculoNomina/cancelarCalculoNomina.do" progressIcon="false" />
            </td>
        </tr>
    </table>
    
</html:form>
