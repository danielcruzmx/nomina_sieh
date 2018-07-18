<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form name="checkBoxTest" modelAttribute="archivoIntSARTercerosDTO">

    <h1><spring:message code="sireh.label.nomina.tercero.aportacion.archivoInt.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="100%" border="0">
        <tr>    
            <td colspan="3">
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%" border="0">
<!--                        <tr align="left">
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.tercero.aportacion.archivoInt.bimestre"/></td>
                            <td align="left">
                                <html:select path="bimestre">
                                    <html:option value="" label="SELECCIONE..."/>
                                    <html:options items="${archivoIntSARTercerosDTO.bimestresValores}" 
                                                  itemValue="clave" 
                                                  itemLabel="valor"
                                                  cssStyle="width: 106px;"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.tercero.aportacion.archivoInt.versionArchivo"/></td>
                            <td align="left">
                                <html:select path="versionArchivo" cssClass="uppercase" cssStyle="width: 106px;">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="1" label="Plantilla 1"/>
                                    <html:option value="2" label="Plantilla 2"/>
                                    <html:option value="3" label="Plantilla 3"/>
                                    <html:option value="4" label="Plantilla 4"/>
                                    <html:option value="5" label="Plantilla 5"/>
                                </html:select>
                            </td>
                        </tr>
-->                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.tercero.aportacion.archivoInt.tipoArchivo" /></td>
                            <td align="left">
                                <html:select path="tipoArchivo" cssClass="uppercase" cssStyle="width: 110px;">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="1" label="ALTAS"/>
                                    <html:option value="2" label="BAJAS"/>
                                    <html:option value="3" label="CAMBIOS"/>
                                    <html:option value="4" label="ANEXO"/>
                                    <html:option value="5" label="DETALLE DE PAGO"/>
                                </html:select>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr><td colspan="3" align="left"><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
        <tr>
            <td align="right">
                <fsn:submit value="submit.generate" 
                            path="generaArchivo" 
                            action="sarFovissste/generaArchivoInt.do" 
                            progressIcon="false"/> &nbsp;
            </td>
            <td width="15%">&nbsp;</td>
            <td align="left">
                <fsn:submit value="submit.cancel" 
                            path="cancel" 
                            action="sarFovissste/consultaArchivoInt.do"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
</html:form>