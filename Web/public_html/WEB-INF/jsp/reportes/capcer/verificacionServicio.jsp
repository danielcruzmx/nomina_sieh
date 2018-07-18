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
    
    <h1><spring:message code="sireh.label.spc.capcer.reportes.general.verificacionServicio.title"/></h1>
    <p>&nbsp;</p>
    
    <!--FORMULARIO BUSQUEDA-->
        <table cellspacing="0" cellpadding="0" border="0" align="center">
            <tr>
                <td valign="top" align="left" style="vertical-align: top">
                    <fieldset>
                        <legend style="font-size:1.3em"><strong>Filtros de busqueda</strong></legend>
                        <table width="100%">
                            <tbody>
                                <tr align="left">
                                    <td class="label"> * <spring:message code="sireh.label.spc.capcer.reportes.general.verificacionServicio.ciclo"/>:</td>
                                    <td colspan="3">
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tnCapCurso-ciclo-reportes-acuerdoUnidad"  
                                                    path="cicloEjeTematico"
                                                    style="width: 250px;"/>
                                    </td>
                                </tr>
                                <tr align="left">
                                            <td class="label"><spring:message code="sireh.label.spc.capcer.reportes.general.verificacionServicio.trimestre"/>:</td>
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
                   <table align="center" border="0" width="40%">
                       <tr><td width="30%" colspan="2"><b>* Campos requeridos</b></td>
                       <tr>
                           <td align="right">
                               <fsn:submit value="submit.accept" 
                                           path="muestraReporte"
                                          action="reportesCursoSPC/verificacionServicio.do"/>
                           </td>
                           <td align="left">
                               <fsn:submit value="submit.cancel" 
                                           path="cancel" 
                                           action="reportesCursoSPC/verificacionServicio.do"/>
                           </td>
                       </tr>
                   </table>
                </td>
            </tr>
        </table><br/><br/>
        <!--FORMULARIO BUSQUEDA-->
        
        <c:if test="${(reportesCapcerDTO.cicloEjeTematico > 0)}">
        <table>
            <tr>
                <th align="left"></th>
            </tr>
            <tr>
                <td align="left">
                        <fsn:reportParam name="P_CICLO" value="${reportesCapcerDTO.cicloEjeTematicoBusqueda}"/>
                        <fsn:reportParam name="P_FECHA_INI" value="${reportesCapcerDTO.fechaIni}"/>
                        <fsn:reportParam name="P_FECHA_FIN" value="${reportesCapcerDTO.fechaFin}"/>
                        
                        <c:if test="${reportesCapcerDTO.cicloEjeTematicoBusqueda ne null}">
                            <fsn:report provider="jasper" 
                                        viewUri="/capcer/verificacionServicio" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="verificacionServicio" 
                                        export="xls,pdf,rtf,docx" 
                                        width="1060" 
                                      height="350"/>
                        </c:if>
                </td>
            </tr>
        </table>
    </c:if>
</html:form>
