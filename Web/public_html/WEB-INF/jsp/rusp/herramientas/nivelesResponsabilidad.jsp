<%--@Descripcion: Vista encargada de actualizar el nivel de responsabilidad del empleado.--%>
<%--@Autor: Oscar S.--%>

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

<html:form modelAttribute="nivelesRespRuspDTO">
    
    <html:hidden path="plaza"/>
    
    <h1><spring:message code="sireh.label.rusp.herramientas.nivelesResp.title"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del empleado-plaza</strong></legend>
                    <table width="900">
                        <colgroup>
                            <col width="25%"/>
                            <col width="25%"/>
                            <col width="25%"/>
                            <col width="25%"/>
                        </colgroup>
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.plaza"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.plaza}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.puesto"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.puesto}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.rfc"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.rfc}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.codigoPuesto"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.codigoPuesto}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.nombre"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.nombre}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.unidad"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.unidad}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.primerApellido"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.primerApellido}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.jerarquia"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.jerarquia}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.segundoApellido"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.segundoApellido}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.nombramiento"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.nombramiento}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.emailOficial"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.emailOficial}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.emailPersonal"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.emailPersonal}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.fecGobiernoFederal"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.fecGobiernoFederal}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.fecShcp"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.fecShcp}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.plazaUltimoMovto"/>:</td>
                                <td colspan="2">
                                    <c:out value="${nivelesRespRuspDTO.plazaUltimoMovto}" />
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.fecIngSpc"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.fecIngSpc}" />
                                </td>
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.empleadoPlaza.fecIniDeclPatr"/>:</td>
                                <td>
                                    <c:out value="${nivelesRespRuspDTO.fecIniDeclPatr}" />
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td>&nbsp;</td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del padr&oacute;n</strong></legend>
                    <table width="100%">
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.rusp.herramientas.nivelesResp.nivelesResp"/>:</td>
                                <td>
                                    <table align="center" width="20%">
                                        <tr>                        
                                            <td align="center">
                                                <html:radiobutton value="S" path="nivelesResp" label=" SI"/>
                                            </td>
                                            <td align="center">
                                                <html:radiobutton value="N" path="nivelesResp" label=" NO"/>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td valign="middle" height="20px" align="left">
                <b>* Campos requeridos</b>
            </td>
        </tr>
        <tr align="center">
            <td>
                <table width="90%" border="0" align="center">
                    <tr>
                        <td align="center">
                            <fsn:submit value="submit.save" 
                                        action="herramientasRusp/saveNivelesResp.do"
                                        progressBar="true"
                                        alertCode="confirm.rusp.herramientas.nivelesResp"/> &nbsp;
                            <fsn:submit value="submit.cancel" 
                                        action="herramientasRusp/consultaNivelesResp.do"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</html:form>