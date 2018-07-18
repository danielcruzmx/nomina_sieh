<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 400px;
    }
</style>
<html:form modelAttribute="expedienteModDescripcionMasivaDTO">
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>

    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modDescripcionMasiva.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <table width="100%">
                    <tr>
                        <td align="center">
                            <table width="100%">
                                <tr>
                                    <td align="left">
                                        <fieldset>
                                            <legend style="font-size:1.3em"><strong>Datos a modificar</strong></legend><br/>
                                            <table width="100%">
                                                <colgroup>
                                                    <col width="20%"/>
                                                    <col width="80%"/>
                                                </colgroup>
                                                <tr>
                                                    <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modDescripcionMasiva.descripcionDice"></spring:message></td>
                                                    <td align="left">
                                                        <fsn:input path="descripcionDice"
                                                                   maxlength="100"
                                                                   size="100"/>
                                                    </td>
                                                </tr>
                                                <tr align="left">
                                                    <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modDescripcionMasiva.documento"></spring:message></td>
                                                    <td align="left">
                                                        <fsn:option key="" value="selectList.nonValue"/>
                                                        <fsn:selectList beanName="tcTipoDoctosExpediente-altaDocumentosSinCaptura"
                                                                        path="idDocto"
                                                                        style="width:500px;"/>
                                                    </td>
                                                </tr>
                                                <tr align="left">
                                                    <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modDescripcionMasiva.descripcionDebeDecir"></spring:message></td>
                                                    <td align="left">
                                                        <fsn:option key="" value="selectList.nonValue"/>
                                                        <fsn:selectList beanName="tcDescripcionAux-documentosSinDatos"
                                                                        path="dsdDescripDocto"
                                                                        parentPath="idDocto"
                                                                        progress="true"
                                                                        style="width:500px;"/>
                                                    </td>
                                                </tr>
                                                <tr align="left">
                                                    <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modDescripcionMasiva.descripcionDebeDecirComplementaria"></spring:message></td>
                                                    <td align="left">
                                                            <fsn:input path="descripcionComplementaria"
                                                                       maxlength="100"
                                                                       size="81"
                                                                       uppercase="true"/>
                                                    </td>
                                                </tr>
                                            </table>
                                            <table width="100%">
                                                <tr align="center">
                                                    <td>
                                                        <fsn:submit value="submit.save" 
                                                                    path="registrar"
                                                                    action="gestionDocumentos/${expedienteModDescripcionMasivaDTO.urlDestino}"
                                                                    progressBar="true"
                                                                    alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                        <fsn:submit value="submit.cancel" 
                                                                    path="cancel" 
                                                                    action="gestionDocumentos/${expedienteModDescripcionMasivaDTO.urlOrigen}"
                                                                    progressBar="true"/>
                                                    </td>
                                                </tr>
                                            </table>
                                        </fieldset>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="left" height="20px" valign="middle">
                                        <strong>
                                            <spring:message code="sireh.form.required.fields"/>
                                        </strong>
                                    </td>
                                </tr>
                                <tr align="center">
                                    <td>&nbsp;</td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
    </script>
    
</html:form>