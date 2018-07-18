<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form modelAttribute="meritoManualDTO">
    <html:hidden path="urlOrigen" id="urlOrigen" />
    <html:hidden path="urlDestino" id="urlDestino" />
    
    <h1><spring:message code="sireh.label.merito.archivoManual.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="70%" border="0">
        <tr>
            <td align="center">
                <fieldset>
                    <legend style="font-size:1.2em">
                        <strong><spring:message text="Notas de Merito"/></strong>
                        <img class="fotografia" width="60" src="<spring:theme code="pluma.jpg"/>" align="middle"/>       
                        <strong><spring:message text="Manualmente"/></strong>
                    </legend>
                    
                    
                    <table width="80%" align="center" border="0">
                        <tr align="left">
                            <td class="label">
                                <spring:message code="sireh.label.merito.archivoManual.rfc"></spring:message>
                            </td>
                            <td align="left">
                                <fsn:input path="tdNmhRfcUnico" maxlength="12" size="15" readonly="true"/> <!-- <fsn:label path="tdNmhRfcUnico"/> -->
                            </td>
                        </tr>
                        <tr>
                            <td class="label">
                                <spring:message code="sireh.label.merito.archivoManual.ciclo"></spring:message>
                            </td>
                            <td align="left">
                                <fsn:input path="tdNmhCiclo" maxlength="12" size="15" readonly="true"/> <!-- <fsn:label path="tdNmhCiclo"/> -->
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label">
                                <spring:message code="sireh.label.merito.archivoManual.quincenaValidacion"></spring:message>
                            </td>
                            <td align="left">
                                <fsn:input path="hpQnaPago" maxlength="12" size="15" readonly="true"/> <!-- <fsn:label path="hpQnaPago"/> -->
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label">
                                <spring:message code="sireh.label.merito.archivoManual.unidad"></spring:message>
                            </td>
                            <td align="left">
                                <fsn:input path="idPuesto" maxlength="12" size="15"  readonly="true"/> <!-- <fsn:label path="idPuesto"/> -->
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label">
                                <spring:message code="sireh.label.merito.archivoManual.tipoPlaza"></spring:message>
                            </td>
                            <td align="left">
                                <fsn:input path="idNombramiento" maxlength="12" size="15" readonly="true"/> <!-- <fsn:label path="idNombramiento"/> -->
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label">
                                <spring:message code="sireh.label.merito.archivoManual.genero"></spring:message>
                            </td>
                            <td align="left">
                                <fsn:input path="idGenero" maxlength="12" size="15" readonly="true"/> <!-- <fsn:label path="idGenero"/> -->
                            </td>
                        </tr>
                        <tr>
                            <td class="label">
                                 * 
                                <spring:message code="sireh.label.merito.archivoManual.causal"></spring:message>
                            </td>
                            <td align="left">
                                <html:select path="tdNmhCveCausal">
                                    <html:option value="0" label="${nonValue}"/>
                                    <html:options items="${meritoManualDTO.causalValores}"
                                                  itemValue="clave" itemLabel="valor"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td class="label">
                                 * 
                                <spring:message code="sireh.label.merito.archivoManual.remesa"></spring:message>
                            </td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcRemesaEmpenoPorCicloYCausalCompleto" path="tdNmhOp"  progress="true"  parentPath="tdNmhCveCausal" filterPaths="tdNmhCiclo" />
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label">
                                 * 
                                <spring:message code="sireh.label.merito.archivoManual.documento"></spring:message>
                            </td>
                            <td align="left">
                                <fsn:input path="tdNmhNumDocto" maxlength="12" size="15"/>
                            </td>
                        </tr>
                         <tr>
                            <td align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                            <td align="center">
                                <fsn:submit path="aceptar" value="submit.accept" action="notaDeMerito/${meritoManualDTO.urlDestino}"/>
                                <fsn:submit value="submit.cancel" action="notaDeMerito/${meritoManualDTO.urlOrigen}"/>
                            </td>
                        </tr>
                        <tr><td colspan="2">&nbsp;</td></tr>
                        <tr><td colspan="2">&nbsp;</td></tr>
                    </table>
                </fieldset>
                </td>
            </tr>
        </table>

</html:form>