<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form name="checkBoxTest" modelAttribute="reportesCxlcDTO">
        
    <h1>
        <spring:message code="sireh.label.plaza.reportes.titulo.link"/> &#45;
        <spring:message code="sireh.label.cxlc.reportes.seccion.titulo.link"/>&#45;  
        <spring:message code="PrestacionTrime.consultas.clc"/>
    </h1>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="90%">
                        <tr align="left">
                            <td class="label">* <spring:message code="sireh.label.nomina.tercero.aportacion.ciclo"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="cicloUnidadPrestTrim" 
                                                path="uniCiclo"
                                                style="width: 106px;"/>
                            </td>
                         </tr>
                         <tr align="left">
                            <td class="label">* <spring:message code="sireh.label.nomina.tercero.aportacion.bimestre"></spring:message></td>
                            <td>
                                <html:select path="trimestre">
                                    <html:option value="" label="SELECCIONE..."/>
                                    <html:options items="${reportesCxlcDTO.trimestreValores}" 
                                                  itemValue="clave" 
                                                  itemLabel="valor"
                                                  cssStyle="width: 106px;"/>
                                </html:select>
                            </td>
                         </tr>
                    </table>
                    
                    <table width="100%">
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.generate" 
                                            path="muestraRegistros"
                                            action="reporteCxlc/generaExcelTrimestre.do"
                                            progressIcon="false"/> &nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="reporteCxlc/prestacionesT.do"
                                            progressBar="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
</html:form>