<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="registraClcDTO">
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.herramientas.titulo.link"/> - 
    <spring:message code="sireh.label.clc.herramientas.registro.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="40%">
        <tr valign="top">
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.clc.herramientas.registro.busqueda"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.registro.cxlcCiclo"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcCicloRegistraClc" 
                                                path="cxlcCiclo"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.registro.cxlcQnaPago"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcQnaPagoRegistraClc" 
                                                path="cxlcQnaPago"
                                                progress="true"
                                                parentPath="cxlcCiclo"
                                                style="width: 106px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.registro.idTipoNomina"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcTipoNominaRegistraClc" 
                                                path="idTipoNomina"
                                                progress="true"
                                                parentPath="cxlcQnaPago"
                                                style="width: 106px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.registro.cxlcComplemento"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcComplementoRegistraClc" 
                                                path="cxlcComplemento"
                                                progress="true"
                                                parentPath="idTipoNomina"
                                                filterPaths="cxlcQnaPago"
                                                style="width: 106px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.registro.cxlc"/></td>
                            <td width="200px" align="left">
                                <fsn:selectList beanName="tdCxlcNumeroRegistraClc" 
                                                path="cxlc"
                                                progress="true"
                                                parentPath="cxlcComplemento"
                                                filterPaths="cxlcQnaPago,idTipoNomina"
                                                style="width: 106px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.registro.cxlcSIAFF"/></td>
                            <td width="200px" align="left">
                                <fsn:input path="cxlcSIAFF" size="11" maxlength="8"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <table>
                    <tr>
                        <td colspan="2" align="left" height="20px" valign="middle">
                            <strong>
                                <spring:message code="sireh.form.required.fields"/>
                            </strong>
                        </td>
                    </tr>
                    <tr>
                        <td width="200px" align="right">
                            <fsn:submit value="submit.marcar" 
                                        action="clcHerramientas/updateRegistraCLC.do"
                                        alertCode="confirm.clc.herramientas.registro"
                                        progressBar="true"/>
                        </td>
                        <td width="200px" align="left">
                            <fsn:submit value="submit.cancel" 
                                        action="clcHerramientas/registraCLC.do"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
</html:form>