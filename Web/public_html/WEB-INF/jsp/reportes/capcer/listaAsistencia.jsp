<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
    .anchoInputSmall {
        width: 100px;
    }
</style>

<html:form modelAttribute="reportesCapcerDTO">
    
    <html:hidden path="cicloEjeTematicoBusqueda"/>
    <html:hidden path="idCursoBusqueda"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.reportes.general.listaAsistencia.title"/></h1>
    <p>&nbsp;</p>
    
    <!--FORMULARIO BUSQUEDA-->
    <table align="center" width="40%" border="0">
        <tr>
            <td colspan="3">
                <fieldset>
                    <legend style="font-size:1.2em"><strong>Filtros</strong></legend>
                    <table cellspacing="0" cellpadding="0" border="0" align="center" width="99%">
                        <tr align="left">
                            <td class="label">* <spring:message code="sireh.label.spc.capcer.reportes.general.listaAsistencia.tipoBusqueda"/>:</td>
                            <td align="left">
                                <table align="center" width="100%">
                                    <tr>                        
                                        <td align="center">
                                            <html:radiobutton value="CURSO" path="tipoBusqueda" label=" Por curso"/>
                                        </td>
                                        <td align="center">
                                            <html:radiobutton value="CLAVE" path="tipoBusqueda" label=" Por clave de curso"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr><td>&nbsp;</td></tr>
        <tr>
            <td valign="top" align="left" style="vertical-align: top">
                <fieldset id="fieldsetPorCurso">
                    <legend style="font-size:1.3em"><strong>Por curso</strong></legend>
                    <table width="100%">
                        <tbody>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.reportes.general.listaAsistencia.ciclo"/>:</td>
                                <td colspan="3">                                    
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tnCapCurso-ciclo-reportes"  
                                                    path="cicloEjeTematico"
                                                    style="width: 250px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.reportes.general.listaAsistencia.subprograma"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tnCapCurso-subprograma-reportes"  
                                                    path="idSubprograma"
                                                    progress="true"
                                                    parentPath="cicloEjeTematico" 
                                                    style="width: 250px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.reportes.general.listaAsistencia.ejeTematico"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tnCapCurso-ejeTematico-reportes"  
                                                    path="idEjeTematico"
                                                    progress="true"
                                                    parentPath="idSubprograma" 
                                                    filterPaths="cicloEjeTematico"
                                                    style="width: 250px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.reportes.general.listaAsistencia.modalidad"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tnCapCurso-modalidad-reportes"  
                                                    path="idModalidad"
                                                    parentPath="idEjeTematico" 
                                                    filterPaths="idSubprograma,cicloEjeTematico"
                                                    progress="true"
                                                    style="width: 250px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.reportes.general.listaAsistencia.curso"/>:</td>
                                <td>
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tnCapCurso-curso-reportes"  
                                                    path="idCurso"
                                                    progress="true"
                                                    parentPath="idModalidad" 
                                                    filterPaths="idEjeTematico,idSubprograma,cicloEjeTematico"
                                                    style="width: 250px;"/>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
            <td valign="top" align="left" style="vertical-align: top">
                <fieldset id="fieldsetPorClave">
                    <legend style="font-size:1.3em"><strong>Por clave de curso</strong></legend>
                    <table width="100%">
                        <tbody>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.reportes.general.listaAsistencia.claveCurso"/>:</td>
                                <td>
                                    <fsn:input path="cursoClave"
                                               uppercase="true" 
                                               maxlength="12"
                                               size="60"
                                               css="anchoInputSmall cursoClave"/>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" border="0" width="40%">
        <tr><td width="30%" colspan="2"><b>* Campos requeridos</b></td>
        <tr>
            <td align="right">
                <fsn:submit value="submit.accept" 
                            path="muestraReporte"
                            action="reportesCursoSPC/listaAsistencia.do"/>
            </td>
            <td align="left">
                <fsn:submit value="submit.cancel" 
                            path="cancel" 
                            action="reportesCursoSPC/listaAsistencia.do"/>
            </td>
        </tr>
    </table>
    <!--FORMULARIO BUSQUEDA-->
    
    <script type="text/javascript">
        // Estado inicial
        $j("#fieldsetPorCurso").hide();
        $j("#fieldsetPorClave").hide();
        
        // Por curso
        $j("#tipoBusqueda1").click(function(){
            $j("#fieldsetPorCurso").show();
            $j("#fieldsetPorClave").hide();
        });
        
        // Por clave
        $j("#tipoBusqueda2").click(function(){
            $j("#fieldsetPorCurso").hide();
            $j("#fieldsetPorClave").show();
        });
        
        // Validaciones
        $j(document).ready(function(){            
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.alphanumericEspacios').alphanumeric({allow:" "});
            $j('.cursoClave').alphanumeric({allow:"-"});
            $j('.numeric').numeric();
        });
    </script>
    
    <script type="text/javascript">
        // Pre-selección
        var validacion = "<c:out value='${reportesCapcerDTO.validacion}'/>";
        if (validacion == "true") {
            var idTipoBusqueda1 = $j("input[type='radio']#tipoBusqueda1:checked").val();
            var idTipoBusqueda2 = $j("input[type='radio']#tipoBusqueda2:checked").val();
            if (idTipoBusqueda2 != null && idTipoBusqueda2 == 'CLAVE') {
                $j("#fieldsetPorCurso").hide();
                $j("#fieldsetPorClave").show();
            } else {
                $j("#fieldsetPorCurso").show();
                $j("#fieldsetPorClave").hide();
            }
        }
    </script>
    
    <c:if test="${reportesCapcerDTO.muestraReporte}">
        <table>
            <tr>
                <th align="left"></th>
            </tr>
            <tr>
                <td align="left">
                    <c:if test="${reportesCapcerDTO.sesionesCurso eq 1}">
                        <fsn:reportParam name="PAR_CICLO" value="${reportesCapcerDTO.cicloEjeTematicoBusqueda}"/>
                        <fsn:reportParam name="PAR_CURSO" value="${reportesCapcerDTO.idCursoBusqueda}"/>
                            <fsn:report provider="jasper" 
                                        viewUri="/capcer/listaAsistencia1" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="listaAsistencia1" 
                                        export="xls,pdf,rtf,docx" 
                                        width="1060" 
                                        height="350"/>
                    </c:if>
                    <c:if test="${(reportesCapcerDTO.sesionesCurso > 1) && (reportesCapcerDTO.sesionesCurso <= 5)}">
                        <fsn:reportParam name="PAR_CICLO" value="${reportesCapcerDTO.cicloEjeTematicoBusqueda}"/>
                        <fsn:reportParam name="PAR_CURSO" value="${reportesCapcerDTO.idCursoBusqueda}"/>
                            <fsn:report provider="jasper" 
                                        viewUri="/capcer/listaAsistencia2" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="listaAsistencia2" 
                                        export="xls,pdf,rtf,docx" 
                                        width="1060" 
                                        height="350"/>
                    </c:if>
                    <c:if test="${(reportesCapcerDTO.sesionesCurso > 5) && (reportesCapcerDTO.sesionesCurso <= 7)}">
                        <fsn:reportParam name="PAR_CICLO" value="${reportesCapcerDTO.cicloEjeTematicoBusqueda}"/>
                        <fsn:reportParam name="PAR_CURSO" value="${reportesCapcerDTO.idCursoBusqueda}"/>
                            <fsn:report provider="jasper" 
                                        viewUri="/capcer/listaAsistencia3" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="listaAsistencia3" 
                                        export="xls,pdf,rtf,docx" 
                                        width="1060" 
                                        height="350"/>
                    </c:if>
                    <c:if test="${(reportesCapcerDTO.sesionesCurso > 7) && (reportesCapcerDTO.sesionesCurso <= 10)}">
                        <fsn:reportParam name="PAR_CICLO" value="${reportesCapcerDTO.cicloEjeTematicoBusqueda}"/>
                        <fsn:reportParam name="PAR_CURSO" value="${reportesCapcerDTO.idCursoBusqueda}"/>
                            <fsn:report provider="jasper" 
                                        viewUri="/capcer/listaAsistencia4" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="listaAsistencia4" 
                                        export="xls,pdf,rtf,docx" 
                                        width="1060" 
                                        height="350"/>
                    </c:if>
                    <c:if test="${(reportesCapcerDTO.sesionesCurso > 10) && (reportesCapcerDTO.sesionesCurso <= 12)}">
                        <fsn:reportParam name="PAR_CICLO" value="${reportesCapcerDTO.cicloEjeTematicoBusqueda}"/>
                        <fsn:reportParam name="PAR_CURSO" value="${reportesCapcerDTO.idCursoBusqueda}"/>
                            <fsn:report provider="jasper" 
                                        viewUri="/capcer/listaAsistencia5" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="listaAsistencia5" 
                                        export="xls,pdf,rtf,docx" 
                                        width="1060" 
                                        height="350"/>
                    </c:if>
                    <c:if test="${(reportesCapcerDTO.sesionesCurso > 12)}">
                        <fsn:reportParam name="PAR_CICLO" value="${reportesCapcerDTO.cicloEjeTematicoBusqueda}"/>
                        <fsn:reportParam name="PAR_CURSO" value="${reportesCapcerDTO.idCursoBusqueda}"/>
                            <fsn:report provider="jasper" 
                                        viewUri="/capcer/listaAsistencia6" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="listaAsistencia6" 
                                        export="xls,pdf,rtf,docx" 
                                        width="1060" 
                                        height="350"/>
                    </c:if>
                </td>
            </tr>
        </table>
    </c:if>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
</html:form>