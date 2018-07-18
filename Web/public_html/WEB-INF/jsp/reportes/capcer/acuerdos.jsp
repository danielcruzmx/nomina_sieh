<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
</style>

<html:form modelAttribute="reportesCapcerDTO">
    
    <html:hidden path="cicloEjeTematicoBusqueda"/>
    <html:hidden path="idCursoBusqueda"/>
    
    <html:hidden path="rolAdministradorCapacitacion"/>
    <html:hidden path="rolOperadorCapacitacion"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.reportes.general.Acuerdos.title"/></h1>
    <p>&nbsp;</p>
    
    <!--FORMULARIO BUSQUEDA-->
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td valign="top" align="left" style="vertical-align: top">
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Filtros de b&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tbody>
                            <tr align="left">
                                <td class="label"> * <spring:message code="sireh.label.spc.capcer.reportes.general.Acuerdos.ciclo"/>:</td>
                                <td colspan="3">
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tnCapCurso-ciclo-reportes-acuerdoUnidad"  
                                                    path="cicloEjeTematico"
                                                    style="width: 250px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.reportes.general.Acuerdos.Trimestre"/>:</td>
                                <td colspan="3">
                                    <html:select path="trimestre">
                                            <html:option value="0" label="SELECCIONE"/>
                                            <html:option value="1" label="1er Trimestre"/>
                                            <html:option value="2" label="2do Trimestre"/>
                                            <html:option value="3" label="3er Trimestre"/>
                                            <html:option value="4" label="4to Trimestre"/>
                                      </html:select>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="left">
            <td colspan="2"> &nbsp; </td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <table width="90%" border="0" align="center">
                    <tr>
                        <td align="center">
                             <c:if test="${reportesCapcerDTO.rolAdministradorCapacitacion || reportesCapcerDTO.rolOperadorCapacitacion}"> 
                                 <fsn:submit value="submit.accept" 
                                            path="muestraReporte"
                                            action="reportesCursoSPC/generaExcelAcuerdos.do"
                                            progressIcon="false"/> &nbsp; 
                             </c:if>
                            <fsn:submit value="submit.cancel" 
                                        path="cancel" 
                                        action="reportesCursoSPC/acuerdos.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table><br/><br/>
    <!--FORMULARIO BUSQUEDA-->
</html:form>