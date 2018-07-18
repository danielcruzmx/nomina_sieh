<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
</style>

<html:form name="checkBoxTest" modelAttribute="consultaCursoEvaluarDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="urlRegistroCurso"/>
    <html:hidden path="urlDeleteRegistroCurso"/>
    <html:hidden path="linkDestino"/>
    <html:hidden path="paramIdDestino"/>
    <html:hidden path="propertyDestino"/>
    <html:hidden path="interior"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.seguimiento.general.consultaCursos.title" arguments="${consultaCursoEvaluarDTO.interior}"/></h1>
    <p>&nbsp;</p>
                                
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <c:if test="${consultaCursoEvaluarDTO.filtroCoordinacionAdministrativa}">
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
                        
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.subprograma"></spring:message>:</td>
                            <td>                                
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcCapSubprograma-consultaCurso" 
                                                path="idSubprograma"
                                                style="width:200px;"/>
                            </td>  
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.filtro.modalidad"></spring:message>:</td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcCapModalidad-consultaCurso" 
                                                path="idModalidad"
                                                style="width:200px;"/>
                            </td>                            
                        </tr>
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
                        <tr>
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
                                            <fsn:submit value="submit.search" 
                                                        path="muestraRegistros" 
                                                        action="seguimientoCursoSPC/${consultaCursoEvaluarDTO.urlOrigen}"
                                                        progressBar="true"/>&nbsp;
                                            <fsn:submit value="submit.clean" 
                                                        path="cancel" 
                                                        action="seguimientoCursoSPC/${consultaCursoEvaluarDTO.urlOrigen}"
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
                    <c:when test="${consultaCursoEvaluarDTO.muestraRegistros}">
                        
                        <fsn:filter property="C.ID_COORDINACION" condition="=" path="idCoordinacion" />
                        <fsn:filter property="C.ID_SUBPROGRAMA" condition="=" path="idSubprograma" />
                        <fsn:filter property="C.CURSO_CLAVE" condition="contains" path="claveCurso" />
                        <fsn:filter property="C.ID_CONTROL_CURSO" condition="=" path="idControlCurso" />
                        <fsn:filter property="C.CURSO_FEC_INI" condition="=" path="cursoFecIni" />
                        <fsn:filter property="C.CURSO_FEC_FIN" condition="=" path="cursoFecFin" />
                            
                        <fsn:pagedList beanName="${consultaCursoEvaluarDTO.beanName}" 
                                       checkbox="true" 
                                       chkProperty="idCursos" 
                                       baseUrl="${consultaCursoEvaluarDTO.urlOrigen}" 
                                       appendFilters="false">
                            <div id="displayTagDiv" style="width:1000px; min-height:200px;overflow:auto;text-align:center;"> 
                                <display:table name="${consultaCursoEvaluarDTO.beanName}" 
                                               class="displaytag" 
                                               pagesize="20" 
                                               decorator="checkboxTableDecorator" 
                                               export="true" 
                                               id="row" 
                                               requestURI="${requestURI}" 
                                               sort="list">

                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.coordinacion" 
                                                    property="coordinacion" 
                                                    sortable="true"
                                                    style="text-align: left"/>
                                    <c:choose>
                                        <c:when test="${not empty consultaCursoEvaluarDTO.linkDestino}">
                                                <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.curso" 
                                                        property="curso" 
                                                        sortable="true"
                                                        style="text-align: left"
                                                        href="${consultaCursoEvaluarDTO.linkDestino}" paramId="${consultaCursoEvaluarDTO.paramIdDestino}" paramProperty="${consultaCursoEvaluarDTO.propertyDestino}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.curso" 
                                                    property="curso" 
                                                    sortable="true"
                                                    style="text-align: left"/>
                                        </c:otherwise>
                                    </c:choose>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.duracion" 
                                                    property="duracion" 
                                                    sortable="true"
                                                    style="text-align: left"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.fechaInicio" 
                                                    property="fechaInicio" 
                                                    format="{0,date,dd/MM/yyyy}" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.fechaTermino" 
                                                    property="fechaTermino" 
                                                    format="{0,date,dd/MM/yyyy}" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.aula" 
                                                    sortable="true"
                                                    style="text-align: left;${rojo}">
                                                    <span id="descCorta"><c:out value="${row.aula}"/></span>
                                    </display:column>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.horario" 
                                                    property="horario" 
                                                    sortable="true"
                                                    style="text-align: left"/>
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.estatus" 
                                                    property="estatus" 
                                                    sortable="true"
                                                    style="text-align: left"/>
                                                    
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
                            <c:if test="${consultaCursoEvaluarDTO.rolAdministradorCapacitacion || consultaCursoEvaluarDTO.rolOperadorCapacitacion}">
                                <fsn:submit value="submit.registrar" 
                                            action="seguimientoCursoSPC/${consultaCursoEvaluarDTO.urlRegistroCurso}"
                                            progressBar="true"/>&nbsp;
                            </c:if>
                            <c:if test="${consultaCursoEvaluarDTO.rolAdministradorCapacitacion || consultaCursoEvaluarDTO.rolOperadorCapacitacion}">
                                <fsn:submit value="submit.delete" 
                                            path="eliminarCursos"
                                            action="seguimientoCursoSPC/${consultaCursoEvaluarDTO.urlDeleteRegistroCurso}"
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
    </script>
</html:form>