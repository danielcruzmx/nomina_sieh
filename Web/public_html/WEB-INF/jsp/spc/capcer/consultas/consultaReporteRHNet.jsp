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

<html:form modelAttribute="consultaPresupuestoDTO">

    <h1><spring:message code="sireh.label.spc.capcer.reportes.general.consultaReporteRHNet.title"/></h1>
    <p>&nbsp;</p>
                                
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <!--FORMULARIO BUSQUEDA-->
                <table cellspacing="0" cellpadding="0" border="0" align="center">
                                        <tr>
                                            <td valign="top" align="left" style="vertical-align: top">
                                                <fieldset>
                                                    <legend style="font-size:1.3em"><strong>Filtros de b&uacute;squeda</strong></legend>
                                                    <table width="100%">
                                                        <tbody>
                                                            <tr align="left">
                                                                <td class="label">* <spring:message code="sireh.label.spc.capcer.reportes.general.consultaReporteRHNet.ciclo"/>:</td>
                                                                    <td colspan="3">
                                                                    <fsn:option key="0" value="selectList.nonValue"/>
                                                                    <fsn:selectList beanName="tnCapCurso-ciclo-Consulta-Presupuesto"  
                                                                                   path="cicloEjeTematico"
                                                                                  style="width: 200px;"/>
                                                                </td>
                                                            </tr>
                                                            <tr align="left">
                                                                <td class="label"><spring:message code="sireh.label.spc.capcer.reportes.general.consultaReporteRHNet.trimestre"/>:</td>
                                                                <td colspan="3">
                                                                    <select class="uppercase" name="trimestre" id="trimestre" style="width:200px;">
                                                                        <option value="">Seleccione...</option>
                                                                        <option value="1">1er Trimestre</option>
                                                                        <option value="2">2do Trimestre</option>
                                                                        <option value="3">3er Trimestre</option>
                                                                        <option value="4">4to Trimestre</option>
                                                                    </select>
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
                                                    <td colspan="2" valign="middle" height="20px" align="left">
                                                        <b>* Campos requeridos</b>
                                                    </td>
                                                 </tr>
                                                 <tr align="center">
                                                    <td align="center">
                                                        <fsn:submit value="submit.accept" 
                                                                     path="muestraReporte"
                                                                   action="consultaCursoSPC/generaReporteRhNet.do" progressIcon="false"/>
                                                                     &nbsp; 
                                                        <fsn:submit value="submit.cancel" 
                                                                    path="cancel" 
                                                                    action="consultaCursoSPC/consultaReporteRHNet.do"/>
                                                    </td>
                                                 </tr>
                                                </table>
                                            </td>
                                        </tr>
                                    </table>
                <!--FORMULARIO BUSQUEDA-->
            </td>
        </tr>
    </table>
            
</html:form>