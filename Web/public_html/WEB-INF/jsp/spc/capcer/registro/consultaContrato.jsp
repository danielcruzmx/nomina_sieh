<%--@Descripcion: Vista encargada de listar contratos. --%>
<%--@Autor: Oscar Sanchez --%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
</style>

<html:form name="checkBoxTest" modelAttribute="consultaContratoDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="urlAltaContrato"/>
    <html:hidden path="urlDeleteContrato"/>
    
    <html:hidden path="rolAdministradorCapacitacion"/>
    <html:hidden path="rolEjecutivoContratacion"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.registro.consultaContrato.title"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.consultaContrato.filtro.ciclo"></spring:message>:</td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tnCapContratoCurso-ciclo-consultaContrato" 
                                                path="contratoCursoCiclo"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.consultaContrato.filtro.tipoContratacion"></spring:message>:</td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcCapTipoContratacion-consultaContrato" 
                                                path="idTipoContratacion"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.consultaContrato.filtro.situacion"></spring:message>:</td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcCapSituacionContrato-consultaContrato" 
                                                path="idSituacionContrato"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td colspan="4">
                <table width="90%" border="0" align="center">
                    <tr>
                        <td align="center">
                            <fsn:submit value="submit.search" 
                                        path="muestraRegistros" 
                                        action="registroCursoSPC/${consultaContratoDTO.urlOrigen}"
                                        progressBar="true"/>&nbsp;
                            <fsn:submit value="submit.clean" 
                                        path="cancel" 
                                        action="registroCursoSPC/${consultaContratoDTO.urlOrigen}"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr align="center">
            <td>&nbsp;</td>
        </tr>
    </table>
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <c:choose>
                    <c:when test="${consultaContratoDTO.muestraRegistros}">
                        
                        <fsn:filter property="CC.ID_CONTRATO_CURSO" condition="=" path="idContratoCurso" />
                        <fsn:filter property="CC.CONTRATO_CURSO_CICLO" condition="=" path="contratoCursoCiclo" />
                        <fsn:filter property="CC.ID_TIPO_CONTRATACION" condition="=" path="idTipoContratacion" />
                        <fsn:filter property="CC.ID_SITUACION_CONTRATO" condition="=" path="idSituacionContrato" />
                        
                        <fsn:pagedList beanName="${consultaContratoDTO.beanName}" 
                                       checkbox="true" 
                                       chkProperty="idContratos" 
                                       baseUrl="${consultaContratoDTO.urlOrigen}" 
                                       appendFilters="false">
                            <div id="displayTagDiv" style="width:1000px; min-height:200px;overflow:auto;text-align:center;"> 
                                <display:table name="${consultaContratoDTO.beanName}" 
                                               class="displaytag" 
                                               pagesize="20" 
                                               decorator="checkboxTableDecorator" 
                                               export="true" 
                                               id="row" 
                                               requestURI="${requestURI}" 
                                               sort="list">
                                    
                                    <c:set var="rojo" value="${row.idSituacionContrato == 13 ? 'color: red;font-weight: bold;' : ''}"/>
                                    
                                    <c:choose>
                                        <c:when test="${consultaContratoDTO.rolAdministradorCapacitacion && row.idSituacionContrato != 13}">
                                            <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.idContratos" 
                                                            style="text-align: center">
                                                <input name="idContratos" 
                                                       class="checkbox"
                                                       type="checkbox" 
                                                       value="<c:out value="${row.idContratos}"/>"/>
                                            </display:column>
                                        </c:when>
                                        <c:otherwise>
                                            <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.idContratos" 
                                                            style="text-align: center;${rojo}"> - </display:column>
                                        </c:otherwise>
                                    </c:choose>
                                    
                                    <c:choose>
                                        <c:when test="${(row.idSituacionContrato != 13)}">
                                            <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.idContrato" 
                                                            sortable="true"
                                                            style="text-align: left;${rojo}">
                                                <a href="editContrato.do?idContrato=<c:out value="${row.idContratoCurso}"/>"
                                                   class="<c:out value="${row.idSituacionContrato == 13 ? 'cancelado' : ''}"/>"
                                                   style="<c:out value="${rojo}"/>" title="<c:out value="${row.idContratoCurso}"/>"><c:out value="${row.contratoCursoNumero}"/></a>
                                            </display:column>
                                        </c:when>
                                        <c:otherwise>
                                            <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.idContrato" 
                                                            sortable="true"
                                                            style="text-align: left;${rojo}"><c:out value="${row.contratoCursoNumero}"/></display:column>
                                        </c:otherwise>
                                    </c:choose>
                                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.idTipoContratacion" 
                                                    property="tipoContratacion" 
                                                    sortable="true"
                                                    maxLength="35"
                                                    style="text-align: left;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.ciclo" 
                                                    property="contratoCursoCiclo" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.representante" 
                                                    property="contratoCursoRepresentante" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.administrador" 
                                                    property="contratoCursoAdministrador" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.monto" 
                                                    property="contratoCursoMonto" 
                                                    sortable="true"
                                                    format=" {0,number,#,##0.00}"
                                                    style="text-align: right;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.fechaAdjud" 
                                                    property="fechaAdjud" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.fechaContr" 
                                                    property="fechaContr" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.usuario" 
                                                    property="usuario" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.fechaModificacion" 
                                                    property="fecModifico" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>      
                                    <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.situacion" 
                                                    property="situacion" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                                    
                                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                                    <display:setProperty name="export.pdf" value="true"/>
                                    <display:setProperty name="basic.msg.empty_list">
                                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                    </display:setProperty>
                                </display:table>
                            </div>
                        </fsn:pagedList>
                    </c:when>
                    <c:otherwise>
                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
        <tr align="center">
            <td>&nbsp;</td>
        </tr>
        <tr align="center">
            <td>
                <table width="100%" border="0" align="center">
                    <tr>
                        <td align="center">
                            <c:if test="${(consultaContratoDTO.rolAdministradorCapacitacion || consultaContratoDTO.rolEjecutivoContratacion)}">
                                <fsn:submit value="submit.registrar" 
                                            action="registroCursoSPC/${consultaContratoDTO.urlAltaContrato}"
                                            progressBar="true"/>&nbsp;
                            </c:if>
                            <c:if test="${consultaContratoDTO.rolAdministradorCapacitacion}">
                                <fsn:submit value="submit.delete" 
                                            path="eliminarContratos"
                                            action="registroCursoSPC/${consultaContratoDTO.urlDeleteContrato}"
                                            alertCode="confirm.spc.capcer.registro.eliminarCurso"/>
                            </c:if>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){            
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.claveCurso').alphanumeric({allow:"-"});
            $j('.numeric').numeric();
        });
        
        // PagedList asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        // Descripciones cortas
        var span = document.getElementsByTagName('span');
        for (i = 0; i < span.length; i++) {
            if (span[i].id == 'descCorta') {
                var text = span[i].innerHTML;
                if (text != null && text != "" && text != "undefined") {
                    span[i].innerHTML = text.substring(0, 35) + "...";
                }
            }
        }
    </script>
</html:form>