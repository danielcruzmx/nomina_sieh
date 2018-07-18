<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:message code="selectList.nonValue" var="nonValue"/>

<style type="text/css">
    .pagelinks {
        display:none;
    }
</style>

<html:form id="formQna" modelAttribute="pagoDTO">

    <html:hidden path="idGrupoPago" />
    <html:hidden path="descGrupoPago" />
    <html:hidden path="idQna" />
    <html:hidden path="status" />
    <html:hidden path="viewName" />
    <html:hidden path="idTipoNomina" />
    <html:hidden path="agVigente" />
    <html:hidden path="tipoExtraordinaria" />
    
    
    <c:choose>
        <c:when test="${pagoDTO.idTipoNomina eq 'LA'}">
            <c:set var="args" value="Laudos" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'OB'}">
            <c:set var="args" value="Personal de bajas" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'IN'}">
            <c:set var="args" value="Incentivo mensual" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'VE'}">
            <c:set var="args" value="Vivienda" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'CJ'}">
            <c:set var="args" value="Diferencias" />
        </c:when>
        <c:when test="${pagoDTO.idTipoNomina eq 'DJ'}">
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
        
        <c:when test="${pagoDTO.idTipoNomina eq 'AG'}">
            <c:if test="${pagoDTO.agVigente eq 'V'}">
                <c:set var="args" value="Aguinaldo - Vigentes" />
            </c:if>
            <c:if test="${pagoDTO.agVigente eq 'N'}">
                <c:set var="args" value="Aguinaldo - Bajas" />
            </c:if>
        </c:when>
    </c:choose>
    
    <%--Titulo--%>
    <c:choose>
        <c:when test="${pagoDTO.idTipoNomina eq 'SA'}">
            <h1><spring:message code="sireh.label.nomina.tercero.aportacion.calculo.titulo"/></h1>
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
    
    <%--Busqueda aguinaldo--%>
    <c:if test="${pagoDTO.idTipoNomina eq 'AG'}">
        <table align="center" border="0">
            <tr>
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                        <table width="90%">
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.dias"></spring:message></td>
                                <td>
                                    <html:select path="nomDiasPagar" cssClass="uppercase" cssStyle="width: 200px;">
                                        <html:option value="" label="${nonValue}"/>
                                        <html:option value="20" label="20 - 1ra parte"/>
                                        <html:option value="40" label="40 - 2da parte"/>
                                    </html:select>
                                </td>
                             </tr>
                             <tr align="left">
                                <td class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.exentos"></spring:message></td>
                                <td>
                                    <table align="left" width="50%">
                                        <tr>                        
                                            <td align="left">
                                                <html:radiobutton value="S" path="nomAplicarExentos" label=" SI"/>
                                            </td>
                                            <td align="left">
                                                <html:radiobutton value="N" path="nomAplicarExentos" label=" NO"/>
                                            </td>
                                        </tr>
                                </table>
                                </td>
                             </tr>
                             <tr align="left">
                                <td class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.gratificacion"></spring:message></td>
                                <td>
                                    <html:select path="nomGratifAgui" cssClass="uppercase" cssStyle="width: 200px;">
                                        <html:option value="" label="${nonValue}"/>
                                        <html:option value="A" label="Nomina de aguinaldo"/>
                                        <html:option value="G" label="Nomina de gratificacion"/>
                                        <html:option value="B" label="Ambos"/>
                                    </html:select>
                                </td>
                             </tr>
                             <tr align="left">
                                <td class="label"><spring:message code="sireh.label.nomina.gestion.label.aguinaldo.periodo"></spring:message></td>
                                <td>
                                    <table align="left" width="50%">
                                        <tr>                        
                                            <td align="left">
                                                <html:radiobutton value="S" path="nomCompletarPeriodo" label=" SI"/>
                                            </td>
                                            <td align="left">
                                                <html:radiobutton value="N" path="nomCompletarPeriodo" label=" NO"/>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                             </tr>
                             <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.status"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="listaEstadosNominaAg"
                                                    path="idEdoNom"
                                                    style="width: 200px;"/>
                                </td>
                             </tr>
                        </table>
                        <table width="100%">
                            <tr align="center">
                                <td>
                                    <fsn:submit value="submit.search" 
                                                action="calculoNominaExt/consultaNominasAguinaldo.do"
                                                progressBar="true"/>&nbsp; 
                                    <fsn:submit value="submit.clean" 
                                                path="cancel" 
                                                action="calculoNominaExt/consultaNominasAguinaldo.do"
                                                progressBar="true"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:if>
    
    <%--Filtros aguinaldo--%>
    <c:if test="${pagoDTO.idTipoNomina eq 'AG'}">
        <fsn:filter property="TN_NOMINA.NOM_DIAS_PAGAR" condition="=" path="nomDiasPagar" />
        <fsn:filter property="TN_NOMINA.NOM_APLICAR_EXENTOS" condition="=" path="nomAplicarExentos" />
        <fsn:filter property="TN_NOMINA.NOM_GRATIF_AGUI" condition="=" path="nomGratifAgui" />
        <fsn:filter property="TN_NOMINA.NOM_COMPLETAR_PERIODO" condition="=" path="nomCompletarPeriodo" />
        <fsn:filter property="TN_NOMINA.ID_EDO_NOM" condition="=" path="idEdoNom" />
    </c:if>
    
    <%--Filtros--%>
    <fsn:filter property="TN_NOMINA.ID_TIPO_NOMINA" condition="IN" path="listIdTipoNomina" />
    <fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition=">=" path="quincenaProceso" />
    <fsn:filter property="TN_NOMINA.ID_GRUPO_PAGO_NOM" condition="=" path="idGrupoPago" />
    <c:choose>
        <c:when test="${pagoDTO.idTipoNomina eq 'SA'}">
            <%--<fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition="=" path="quincenaPosterior" />--%>
            <fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition=">=" path="quincenaAnterior" />
        </c:when>
        <c:otherwise>
            <fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition=">=" path="quincenaAnterior" />
        </c:otherwise>
    </c:choose>
    
    <c:if test="${pagoDTO.idTipoNomina eq 'AG'}">
        <fsn:filter property="TN_NOMINA.NOM_VIGENTE" condition="=" path="agVigente" />
    </c:if>
    
    <c:if test="${pagoDTO.idTipoNomina eq 'EX'}">
        <c:choose>
            <c:when test="${pagoDTO.tipoExtraordinaria eq 'P'}">
                <fsn:filter property="TN_NOMINA.DESC_NOMINA" condition="=" path="descPerseverancia" />
            </c:when>
            <c:when test="${pagoDTO.tipoExtraordinaria eq 'R'}">
                <fsn:filter property="TN_NOMINA.NOM_REGLA_CALCULO" condition="starts" value="PKG" />
            </c:when>
            <c:otherwise>
                <fsn:filter property="TN_NOMINA.DESC_NOMINA" condition="<>" path="descPerseverancia" />
            </c:otherwise>
        </c:choose>
    </c:if>
    
    <%--Paginador--%>
    <fsn:pagedList beanName="listaNominasPorTipoNomina"
                   baseUrl="${pagoDTO.viewName}"
                   appendFilters="false"
                   maxRows="200" >
        <display:table name="listaNominasPorTipoNomina" 
                       defaultsort="2" 
                       defaultorder="descending"
                       class="displaytag" 
                       pagesize="10" 
                       export="false" 
                       id="qna" 
                       requestURI="${requestURI}" 
                       sort="list">
            <c:choose>
                <c:when test="${pagoDTO.idTipoNomina eq 'AG' or pagoDTO.idTipoNomina eq 'IN' or pagoDTO.idTipoNomina eq 'FO' or pagoDTO.idTipoNomina eq 'FE' or pagoDTO.tipoExtraordinaria eq 'R'}">
                    <display:column titleKey="sireh.label.nomina.gestion.consulta.parametros.calcular" 
                                    style="text-align: center;" 
                                    sortable="true">
                        <c:choose>
                            <c:when test="${qna.descEstadoNom ne 'Sin proceso'}">
                                <c:out value="${qna.descEstadoNom}"/>
                            </c:when>
                            <c:otherwise>
                                <a onclick='return confirm("Desea procesar la n\u00f3mina? \n\nSi presiona ACEPTAR se borrar\u00e1n los registros previamente procesados!");' href="listaRFCsPorGrupoPagoReproceso.do?idGrupoPago=<c:out value='${qna.idgrupopagonom}' />&amp;idQna=<c:out value='${qna.idNomina}'/>&amp;status=<c:out value='${qna.idEdoNom}'/>&amp;idTipoNomina=<c:out value='${qna.idTipoNomina}'/>&amp;nomFuenteDatos=<c:out value='${qna.nomFuenteDatos}'/>'" title="Recalculo">
                                    <img src="<spring:theme code="procesar.png"/>" border="0" width="20"/>
                                </a>
                            </c:otherwise>
                        </c:choose>
                    </display:column>
                    <display:column titleKey="sireh.label.nomina.gestion.consulta.parametros.idQna" 
                                    style="text-align: center;" 
                                    sortable="true">
                        <c:choose>
                            <c:when test="${qna.descEstadoNom eq 'Procesando'}">
                                <c:out value="${qna.idNomina}"/>
                            </c:when>
                            <c:otherwise>
                                <a href="listaRFCsPorGrupoPago.do?idGrupoPago=<c:out value='${qna.idgrupopagonom}' />&amp;idQna=<c:out value='${qna.idNomina}'/>&amp;status=<c:out value='${qna.idEdoNom}'/>&amp;idTipoNomina=<c:out value='${qna.idTipoNomina}'/>&amp;nomFuenteDatos=<c:out value='${qna.nomFuenteDatos}'/>'">
                                    <c:out value="${qna.idNomina}"/>
                                </a>
                            </c:otherwise>
                        </c:choose>
                    </display:column>
                </c:when>
                <c:otherwise>
                    <display:column titleKey="sireh.label.nomina.gestion.consulta.parametros.idQna" 
                                    style="text-align: center;" 
                                    sortable="true">
                        <a href="listaRFCsPorGrupoPago.do?idGrupoPago=<c:out value='${qna.idgrupopagonom}'/>&idQna=<c:out value='${qna.idNomina}'/>&status=<c:out value='${qna.idEdoNom}'/>&idTipoNomina=<c:out value='${qna.idTipoNomina}'/>">
                            <c:out value="${qna.idNomina}"/>
                        </a>
                    </display:column>
                </c:otherwise>
            </c:choose>
            
            <display:column property="nomQnaCaptura"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.qnaCaptura" 
                            style="text-align: center;" 
                            sortable="true"/>
            <display:column property="nomNumComplem"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.numComplem" 
                            style="text-align: center;" 
                            sortable="true"/>
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
            <display:column property="periodoPago"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.periodoPago" 
                            style="text-align: center;" 
                            sortable="true" />                            
            <display:column property="descEstadoNom"
                            titleKey="sireh.label.nomina.gestion.consulta.parametros.status" 
                            style="text-align: center;" 
                            sortable="true" />
                            
            <c:if test="${qna.idTipoNomina eq 'AG'}">
                <display:column property="nomVigente"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.nomvigente" 
                                style="text-align: center;" 
                                sortable="true" />                            
                <display:column property="nomDiasPagar"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.diaspagar" 
                                style="text-align: center;" 
                                sortable="true" />
                <display:column property="nomAplicarExentos"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.nomAplicarExentos" 
                                style="text-align: center;" 
                                sortable="true" />                            
                <display:column property="nomGratifAgui"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.nomGratifAgui" 
                                style="text-align: center;" 
                                sortable="true" />                            
                <display:column property="nomCompletarperiodo"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.nomCompletarperiodo" 
                                style="text-align: center;" 
                                sortable="true" />                            
            </c:if>
            
            <display:setProperty name="paging.banner.placement" value="bottom"/>
            <display:setProperty name="export.pdf" value="false"/>
            <display:setProperty name="basic.msg.empty_list">
                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
            </display:setProperty>
         </display:table>
    </fsn:pagedList>
    
    <table width="100%">
        <tr align="center">
            <td>
                <fsn:submit value="submit.update" 
                            action="calculoNominaExt/${pagoDTO.viewName}.do"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        function confirmaReproceso(url) {
            var txt;
            var r = confirm("Desea procesar la n\u00f3mina? \n\nSi presiona ACEPTAR se borrar\u00e1n los registros previamente procesados. \nCANCELAR conserva los registros capturados.");
            if (r == true) {
                window.location.href = 'listaRFCsPorGrupoPagoReproceso.do?' + url;
            } else {
                window.location.href = 'listaRFCsPorGrupoPago.do?' + url;
            }
        }
        
    </script>
</html:form>