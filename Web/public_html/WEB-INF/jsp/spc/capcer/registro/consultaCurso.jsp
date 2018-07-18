<%--@Descripcion: Vista encargada de consultar cursos.--%>
<%--@Autor: Oscar S.--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
    a.cancelado:link {
        background-color: transparent;
        color: red;
        text-decoration: none;
    }
</style>

<html:form name="checkBoxTest" modelAttribute="consultaCursoDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="urlRegistroCurso"/>
    <html:hidden path="urlDeleteRegistroCurso"/>
    
    <html:hidden path="linkDestino"/>
    <html:hidden path="paramIdDestino"/>
    <html:hidden path="propertyDestino"/>
    <html:hidden path="interior"/>
    <html:hidden path="control"/>
    
    <html:hidden path="rolAdministradorCapacitacion"/>
    <html:hidden path="rolOperadorCapacitacion"/>
    
    <html:hidden path="cursoFecIniTxt"/>
    <html:hidden path="cursoFecFinTxt"/>
    
    <c:choose>
        <c:when test="${consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR'}">
            <h1><spring:message code="sireh.label.spc.capcer.registro.general.consultaCursos.title" arguments="${consultaCursoDTO.interior}"/></h1>
        </c:when>
        <c:otherwise>
            <h1><spring:message code="sireh.label.spc.capcer.registro.general.consultaCursos.title" arguments="${consultaCursoDTO.interior}"/></h1>
        </c:otherwise>
    </c:choose>
    
    <p>&nbsp;</p>
                                
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <c:if test="${consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolAdministradorCertificacion}">
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.coordinacion"></spring:message>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapCoordinacion-consultaCurso" 
                                                    path="idCoordinacion"
                                                    style="width:200px;"/>
                                </td>
                            </tr>
                        </c:if>
                        
                        <c:if test="${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolOperadorCapacitacion) and (consultaCursoDTO.control eq 'REG_CURSO' || consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR') }">
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.proveedor"></spring:message>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapProveedor-consultaCurso" 
                                                    path="idProveedor"
                                                    style="width:200px;"/>
                                </td>
                                <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.operadorDGRH"></spring:message>:</td>
                                <td>                                
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapOperDgrh-consultaCurso" 
                                                    path="rfcOperDgrh"
                                                    style="width:200px;"/>
                                </td>  
                            </tr>
                        </c:if>
                        
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.subprograma"></spring:message>:</td>
                            <td>                                
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcCapSubprograma-consultaCurso" 
                                                path="idSubprograma"
                                                style="width:200px;"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.ejeTematico"></spring:message>:</td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcCapEjeTematico-consultaCurso" 
                                                path="idEjeTematico"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.modalidad"></spring:message>:</td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcCapModalidad-consultaCurso" 
                                                path="idModalidad"
                                                style="width:200px;"/>
                            </td>
                            <c:if test="${(consultaCursoDTO.rolEjecutivoContratacion) and consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO'}">
                                <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.finalidad"></spring:message>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapFinalidad-consultaCurso" 
                                                    path="idFinalidad"
                                                    style="width:200px;"/>
                                </td>
                            </c:if>
                        </tr>
                        
                        <c:if test="${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa || consultaCursoDTO.rolOperadorCapacitacion) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' or consultaCursoDTO.control == 'ASIGNAR_INSTRUCTOR')}">
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.fechaInicio"></spring:message>:</td>
                                <td>
                                    <fsn:calendar path="cursoFecIni" readonly="true"/>
                                </td>
                                <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.fechaFin"></spring:message>:</td>
                                <td>
                                    <fsn:calendar path="cursoFecFin" readonly="true"/>
                                </td>
                            </tr>
                        </c:if>
                        
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.claveCurso"></spring:message>:</td>
                            <td>                                
                                <fsn:input path="claveCurso"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput claveCurso"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.estatus"></spring:message>:</td>
                            <td>
                                <fsn:filter property="ID_CONTROL_CURSO" condition="IN" path="estatusCursos"/>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcCapControlCurso-consultaCurso" 
                                                path="idControlCurso"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="center">
                            <td colspan="4">
                                <table width="90%" border="0" align="center">
                                    <tr>
                                        <td align="center">
                                            <c:choose>
                                                <c:when test="${consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' || consultaCursoDTO.control eq 'ASIGNAR_PARTICIPANTE' || consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR'}">
                                                    <fsn:submit value="submit.search" 
                                                                path="muestraRegistros" 
                                                                action="registroCursoSPC/${consultaCursoDTO.urlOrigen}"
                                                                progressBar="true" onclick="cambioFechas()"/>&nbsp;
                                                </c:when>
                                                <c:otherwise>
                                                    <fsn:submit value="submit.search" 
                                                                path="muestraRegistros" 
                                                                action="registroCursoSPC/${consultaCursoDTO.urlOrigen}"
                                                                progressBar="true"/>&nbsp;
                                                </c:otherwise>
                                            </c:choose>
                                            <fsn:submit value="submit.clean" 
                                                        path="cancel" 
                                                        action="registroCursoSPC/${consultaCursoDTO.urlOrigen}"
                                                        progressBar="true"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
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
                    <c:when test="${consultaCursoDTO.muestraRegistros}">
                        
                        <fsn:filter property="C.ID_COORDINACION" condition="=" path="idCoordinacion" />
                        <fsn:filter property="C.ID_PROVEEDOR" condition="=" path="idProveedor" />
                        <fsn:filter property="C.RFC_OPER_DGRH" condition="=" path="rfcOperDgrh" />
                        <fsn:filter property="C.ID_SUBPROGRAMA" condition="=" path="idSubprograma" />
                        <fsn:filter property="C.ID_EJE_TEMATICO" condition="=" path="idEjeTematico" />
                        <fsn:filter property="CP.ID_MODALIDAD" condition="=" path="idModalidad" />
                        <fsn:filter property="C.CURSO_CLAVE" condition="contains" path="claveCurso" />
                        <fsn:filter property="C.ID_CONTROL_CURSO" condition="=" path="idControlCurso" />
                        
                        <c:if test="${consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' || consultaCursoDTO.control eq 'ASIGNAR_PARTICIPANTE' || consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR'}">                            
                            <fsn:filter property="to_char(C.CURSO_FEC_INI, 'yyyy/mm/dd') >" condition="=" path="cursoFecIniTxt" type="string" />
                            <fsn:filter property="to_char(C.CURSO_FEC_FIN, 'yyyy/mm/dd') <" condition="=" path="cursoFecFinTxt" type="string" />
                        </c:if>
                        
                        <fsn:pagedList beanName="${consultaCursoDTO.beanName}" 
                                       checkbox="true" 
                                       chkProperty="idCursos" 
                                       baseUrl="${consultaCursoDTO.urlOrigen}" 
                                       appendFilters="false">
                            <div id="displayTagDiv" style="width:1000px; min-height:200px;overflow:auto;text-align:center;"> 
                                <display:table name="${consultaCursoDTO.beanName}" 
                                               class="displaytag" 
                                               pagesize="20" 
                                               decorator="checkboxTableDecorator" 
                                               export="true" 
                                               id="row" 
                                               requestURI="${requestURI}" 
                                               sort="list">
                                    
                                    <c:set var="rojo" value="${row.idControlCurso == 'CAN' ? 'color: red;font-weight: bold;' : ''}"/>
                                    
                                    <c:if test="${consultaCursoDTO.control eq 'REG_CURSO'}">
                                        <c:choose>
                                            <c:when test="${consultaCursoDTO.rolAdministradorCapacitacion and (row.idControlCurso == 'REG' || row.idControlCurso == 'PRO' || row.idControlCurso == 'CON')}">
                                                <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.idCursos" 
                                                                style="text-align: center">
                                                    <input name="idCursos" 
                                                           class="checkbox"
                                                           type="checkbox" 
                                                           value="<c:out value="${row.idCursos}"/>"/>
                                                </display:column>
                                            </c:when>
                                            <c:otherwise>
                                                <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.idCursos" 
                                                                style="text-align: center;${rojo}"> - </display:column>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:if>
                                    
                                    <c:if test="${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO'}">
                                        <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.coordinacion" 
                                                        property="coordinacion"
                                                        sortable="true"
                                                        style="text-align: left;${rojo}"/>
                                    </c:if>
                                    
                                    <c:choose>
                                        <c:when test="${not empty consultaCursoDTO.linkDestino}">
                                            <c:choose>
                                                <c:when test="${(row.idControlCurso != 'CAN' && row.idControlCurso != 'CON') || consultaCursoDTO.control ne 'ASIGNAR_PANTICIPANTE'}">
                                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.curso" 
                                                                    sortable="true"
                                                                    style="text-align: left;${rojo}">
                                                        <a href="<c:out value="${consultaCursoDTO.linkDestino}"/>?<c:out value="${consultaCursoDTO.paramIdDestino}"/>=<c:out value="${row.idCursos}"/>"
                                                           class="<c:out value="${row.idControlCurso == 'CAN' ? 'cancelado' : ''}"/>"
                                                           style="<c:out value="${rojo}"/>" title="<c:out value="${row.curso}"/>"><span id="descCorta"><c:out value="${row.curso}"/></span></a>
                                                    </display:column>
                                                </c:when>
                                                <c:otherwise>
                                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.curso" 
                                                                    maxLength="35" 
                                                                    sortable="true"
                                                                    style="text-align: left;${rojo}"><c:out value="${row.curso}"/></display:column>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:when>
                                        <c:otherwise>
                                            <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.curso" 
                                                            maxLength="35" 
                                                            sortable="true"
                                                            style="text-align: left;${rojo}"><c:out value="${row.curso}"/></display:column>
                                        </c:otherwise>
                                    </c:choose>
                                    
                                    <c:if test="${consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO' && consultaCursoDTO.control ne 'REG_CURSO' && consultaCursoDTO.control ne 'ASIGNAR_PARTICIPANTE' && consultaCursoDTO.control ne 'ASIGNAR_INSTRUCTOR'}">
                                        <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.ejeTematico" 
                                                        property="ejeTematico" 
                                                        sortable="true"
                                                        style="text-align: left;${rojo}"/>
                                    </c:if>
                                    
                                    <c:if test="${consultaCursoDTO.control eq 'REG_CURSO'}">
                                        <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.instEducat" 
                                                        maxLength="35" 
                                                        property="instEducat" 
                                                        sortable="true"
                                                        style="text-align: left;${rojo}"/>
                                    </c:if>
                                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.subprograma" 
                                                    property="subprograma" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.duracion" 
                                                    property="duracion" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                    
                                    <c:if test="${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' or consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR')}">
                                        <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.fechaInicio" 
                                                        property="fechaInicio" 
                                                        format="{0,date,dd/MM/yyyy}" 
                                                        sortable="true"
                                                        style="text-align: left;${rojo}"/>
                                    </c:if>
                                    <c:if test="${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' or consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR')}">
                                        <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.fechaTermino" 
                                                        property="fechaTermino" 
                                                        format="{0,date,dd/MM/yyyy}" 
                                                        sortable="true"
                                                        style="text-align: left;${rojo}"/>
                                    </c:if>
                                    
                                    <c:if test="${consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO' && consultaCursoDTO.control ne 'REG_CURSO'}">
	                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.modalidad" 
	                                                    property="modalidad" 
	                                                    sortable="true"
	                                                    style="text-align: left;${rojo}"/>
                                    </c:if>
                                    
                                    <c:if test="${consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO' && consultaCursoDTO.control ne 'REG_CURSO' && consultaCursoDTO.control ne 'ASIGNAR_PARTICIPANTE' && consultaCursoDTO.control ne 'ASIGNAR_INSTRUCTOR'}">
                                        <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.finalidad" 
                                                        property="finalidad" 
                                                        sortable="true"
                                                        style="text-align: left;${rojo}"/>
                                    </c:if>
                                    
                                    <c:if test="${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO'}">
                                        <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.aula" 
                                                        sortable="true"
                                                        style="text-align: left;${rojo}">
                                                        <span id="descCorta"><c:out value="${row.aula}"/></span>
                                        </display:column>
                                    </c:if>
                                    
                                    <c:if test="${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' or consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR')}">
                                        <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.horario" 
                                                        property="horario" 
                                                        sortable="true"
                                                        style="text-align: left"/>
                                    </c:if>
                                    
                                    <c:if test="${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR')}">
                                        <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.participantes" 
                                                        property="participantes" 
                                                        sortable="true"
                                                        style="text-align: left;${rojo}"/>
                                    </c:if>
                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.estatus" 
                                                    property="estatus" 
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
                            <c:if test="${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolOperadorCapacitacion) && consultaCursoDTO.control eq 'REG_CURSO'}">
                                <fsn:submit value="submit.registrar" 
                                            action="registroCursoSPC/${consultaCursoDTO.urlRegistroCurso}"
                                            progressBar="true"/>&nbsp;
                            </c:if>
                            <c:if test="${consultaCursoDTO.rolAdministradorCapacitacion && consultaCursoDTO.control eq 'REG_CURSO'}">
                                <fsn:submit value="submit.delete" 
                                            path="eliminarCursos"
                                            action="registroCursoSPC/${consultaCursoDTO.urlDeleteRegistroCurso}"
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
        
        // Fechas
        function cambioFechas() {
            var onewayIni = $j('#text_cursoFecIni').val();
            var piecesIni = onewayIni.split('/');
            var reversedIni = piecesIni.reverse().join('/');
            $j('#cursoFecIniTxt').val(reversedIni);
            
            var onewayFin = $j('#text_cursoFecFin').val();
            var piecesFin = onewayFin.split('/');
            var reversedFin = piecesFin.reverse().join('/');
            $j('#cursoFecFinTxt').val(reversedFin);
        }
    </script>
</html:form>