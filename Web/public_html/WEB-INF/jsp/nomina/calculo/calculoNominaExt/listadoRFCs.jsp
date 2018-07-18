<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<html:form id="formPago" modelAttribute="pagoDTO">

    <html:hidden path="idGrupoPago"/>
    <html:hidden path="descGrupoPago"/>
    <html:hidden path="idQna"/>
    <html:hidden path="status"/>
    <html:hidden id="idPlaza" path="idPlaza"/>
    <html:hidden path="idTipoNomina" />
    <html:hidden path="beanName" />
    <html:hidden path="tipoExtraordinaria" />
    
    <c:choose>
        <c:when test="${pagoDTO.idTipoNomina eq 'LA'}">
            <c:set var="args" value="Laudos" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'OB'}">
            <c:set var="args" value="Personal de bajas" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'VE'}">
            <c:set var="args" value="Vivienda" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'CJ'}">
            <c:set var="args" value="Diferencias" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'DJ' or pagoDTO.idTipoNomina eq 'DE' }">
            <c:set var="args" value="Devoluciones" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'AC'}">
            <c:set var="args" value="Aguinaldo de consejerias" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'VA'}">
            <c:set var="args" value="Vales de despensa" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'OD'}">
            <c:set var="args" value="Ordinaria diferencias" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'DB'}">
            <c:set var="args" value="Diferencias baja" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'IN'}">
            <c:set var="args" value="Incentivo mensual" />
        </c:when>

        
        <c:when test="${pagoDTO.idTipoNomina eq 'AG'}">
            <c:if test="${pagoDTO.agVigente eq 'V'}">
                <c:set var="args" value="Aguinaldo - Vigentes" />
            </c:if>
            <c:if test="${pagoDTO.agVigente eq 'N'}">
                <c:set var="args" value="Aguinaldo - Bajas" />
            </c:if>
        </c:when>
        
        <c:when test="${pagoDTO.idTipoNomina eq 'EX'}">
            <c:if test="${pagoDTO.tipoExtraordinaria eq 'S'}">
                <c:set var="args" value="Sueldos" />
            </c:if>
            <c:if test="${pagoDTO.tipoExtraordinaria eq 'P'}">
                <c:set var="args" value="Perseverancia y Lealtad" />
            </c:if>
            <c:if test="${pagoDTO.tipoExtraordinaria eq 'R'}">
                <c:set var="args" value="Con Reglas" />
            </c:if>
        </c:when>
    </c:choose>
    
    <%--Titulo--%>
    <c:choose>
        <c:when test="${pagoDTO.idTipoNomina eq 'SA'}">
            <h1><spring:message code="sireh.label.nomina.tercero.aportacion.calculo.titulo" arguments="${args}"/></h1>
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'FO'}">
            <h1><spring:message code="sireh.label.nomina.fonac.liquidacionFonac.finDeCiclo.titulo"/></h1>
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'FE'}">
            <h1><spring:message code="sireh.label.nomina.fonac.liquidacionFonac.liquidacionAnticipada.titulo"/></h1>
        </c:when>
        <c:otherwise>
            <h1><spring:message code="sireh.label.nomina.calculo.extraordinaria.titulo" arguments="${args}"/></h1>
        </c:otherwise>
    </c:choose>
    
    <table align="center" border="0" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.grupoInfo.busqueda"/>&nbsp;&nbsp; </strong>
                    </legend>
                    <table align="center" border="0">
                        <tr>
                            <td align="right" class="label" width="10%">
                                <spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc"/>
                            </td>
                            <td align="left" width="20%">
                                <fsn:input path="rfcEmpleado"/>
                            </td>
                            <td align="right" class="label" width="10%">
                                <spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombreEmpleado"/>
                            </td>
                            <td align="left" width="20%">
                                <fsn:input path="nombreEmpleado"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="10%">
                                <spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.primerApellido"/>
                            </td>
                            <td align="left" width="20%">
                                <fsn:input path="primerApellido"/>
                            </td>
                            <td align="right" class="label" width="10%">
                                <spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.segundoApellido"/>
                            </td>
                            <td align="left" width="20%">
                                <fsn:input path="segundoApellido"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="10%">
                                <spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.jerarquia"/>
                            </td>
                            <td align="left" width="20%">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaJerarquias"
                                                path="idJerarquia"
                                                style="width:150px;"/>
                            </td>
                            <td align="right" class="label" width="10%">
                                <spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombramiento"/>
                            </td>
                            <td align="left" width="20%">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaNombramientos"
                                                path="idNombramiento"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="10%">
                                <spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nivelPto"/>
                            </td>
                            <td align="left" width="20%">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaNiveles"
                                                path="idNivelPto"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4" align="center">
                                <fsn:submit value="submit.search"
                                            action="calculoNominaExt/buscaRFCsPorGrupoPago.do"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <fsn:filter property="e.RFC_EMPLEADO" condition="contains" path="rfcEmpleado"/>
    <fsn:filter property="e.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado"/>
    <fsn:filter property="e.PRIMER_APELLIDO" condition="contains" path="primerApellido"/>
    <fsn:filter property="e.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido"/>
    <fsn:filter property="j.ID_JERARQUIA" condition="=" path="idJerarquia"/>
    <fsn:filter property="n.ID_NOMBRAMIENTO" condition="=" path="idNombramiento"/>
    <fsn:filter property="TRIM(ap.ID_NIVEL_PTO)" condition="=" path="idNivelPto"/>
    <fsn:filter property="t.id_nomina" condition="=" path="idQna"/>
    
    <fsn:pagedList beanName="${pagoDTO.beanName}" 
                   baseUrl="${pagoDTO.viewName}"
                   checkbox="true" 
                   chkProperty="casosMuestra"
                   appendFilters="false" 
                   maxRows="200">
        <display:table name="${pagoDTO.beanName}" 
                       class="displaytag"
                       pagesize="10" 
                       export="false" 
                       id="pagoRow"
                       requestURI="${requestURI}" 
                       sort="list"
                       decorator="checkboxTableDecorator">
            <c:if test="${pagoDTO.status eq 'N'}">                       
                <display:column property="checkbox" 
                                titleKey="sireh.label.nomina.creaArchivoTerceros.selecciona"
                                style="text-align: center;" 
                                sortable="true"
                                sortProperty="casosMuestra" 
                                defaultorder="descending" 
                                media="html"/>
            </c:if>
            <display:column titleKey="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc"
                            style="text-align: center;" 
                            sortable="true">
                <c:if test="${pagoDTO.status eq 'N'}">                            
                    <a href="conceptosNominaExt.do?idGrupoPago=<c:out value='${pagoDTO.idGrupoPago}'/>&idQna=<c:out value='${pagoDTO.idQna}'/>&rfcEmpleado=<c:out value='${pagoRow.rfcEmpleado}'/>&idPlaza=<c:out value='${pagoRow.idPlaza}'/>&status=<c:out value='${pagoDTO.status}'/>&cnqinipago=<c:out value='${pagoRow.cnqinipago}'/>">
                        <c:out value="${pagoRow.rfcEmpleado}"/>
                    </a>
                </c:if>
                <c:if test="${pagoDTO.status ne 'N'}">         
                    <c:out value="${pagoRow.rfcEmpleado}"/>
                </c:if>
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
            <display:setProperty name="paging.banner.placement" value="bottom"/>
            <display:setProperty name="export.pdf" value="false"/>
            <display:setProperty name="basic.msg.empty_list">
                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
            </display:setProperty>
        </display:table>
    </fsn:pagedList>
    
    <table align="center" width="50%" border="0">
        <tr>
            <c:if test="${pagoDTO.status eq 'N'}">
                <td align="center">
                    <fsn:submit value="submit.add"
                                action="calculoNominaExt/asociarEmpleadoPlaza.do"
                                progressIcon="false"/>
                </td>
                <td align="center">
                    <fsn:submit value="submit.delete"
                                action="calculoNominaExt/deleteEmpleado.do" path="delete" alertCode="confirm.multiple.delete"
                                progressIcon="false"/>
                </td>
                <td align="center">
                    <fsn:submit value="submit.finalizar"
                                action="calculoNominaExt/finalizar.do"
                                progressIcon="false"/>
                </td>
            </c:if>
            <c:if test="${pagoDTO.status eq 'S'}">
                <td align="center">
                    <fsn:submit value="submit.export.nomcontodoscptos"
                                path="contodosconceptos"
                                action="calculoNomina/historicoRevisionTodos.do"
                                progressIcon="false"/>
                </td>
                <td align="center">
                    <fsn:submit value="submit.export.nomconcptospago"
                                path="conconceptosafectados"
                                action="calculoNomina/historicoRevisionConPago.do"
                                progressIcon="false"/>
                </td>
                <td align="center">
                    <fsn:submit value="submit.export.nomconpapago" 
                                action="calculoNomina/historicoRevisionConPA.do" 
                                progressIcon="false" />
                </td>
            </c:if>
                <td align="center">
                    <fsn:submit value="submit.cancel"
                                action="calculoNominaExt/cancelarCalculoNomina.do"
                                progressIcon="false"/>
                </td>
        </tr>
    </table>
    
</html:form>