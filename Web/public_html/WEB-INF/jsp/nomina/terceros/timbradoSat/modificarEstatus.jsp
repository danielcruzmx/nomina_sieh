<%--@Descripcion: Vista encargada de actualizar los archivos del sat relacionados con la nómina.--%>
<%--@Autor: Oscar S.--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<spring:message code="selectList.nonValue" var="nonValue"/>

<style type="text/css">
    .anchoInput {
        width: 300px;
    }
    
    .anchoInput200 {
        width: 200px;
    }
    .anchoTextarea {
        width: 300px;
    }
</style>
<html:form modelAttribute="nominaEstatusDTO" method="post" enctype="multipart/form-data">
    
    <h1><spring:message code="sireh.label.nomina.terceros.sattimbrado.actaulizacionEstatus"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.gestion.grupoInfo.detalles"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.idNomina"/></td>
                            <td align="left">
                                <fsn:input path="idNomina"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.numQuincena"/></td>
                            <td align="left">
                                <fsn:input path="nomQnaCaptura"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.tipoNomina"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaTiposNomina"
                                                path="idTipoNomina"
                                                style="width: 200px;"
                                                onchange="getTipoNomina()"
                                                disabled="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.numComplemento"/></td>
                            <td align="left">
                                <fsn:input path="nomNumComplem" 
                                           uppercase="true"
                                           maxlength="10" 
                                           size="10"
                                           readonly="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.gpoPago"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaGruposPago"
                                                path="idGrupoPagoNom"
                                                style="width: 200px;"
                                                disabled="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.descripcion"/></td>
                            <td align="left">
                                <fsn:input path="descNomina"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60"
                                           css="anchoInput"
                                           readonly="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset><br/>
            </td>
        </tr>
        <tr>
            <td>    
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.gestion.grupoInfo.timbrado"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.timbrado.nomRefTimbrado"/></td>
                            <td align="left">
                                <fsn:option key="1" value="selectList.sinEstatus"/>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcEstatusTimbrado"
                                                path="nomRefTimbrado" disabled="true" style="width: 200px;" />
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.timbrado.cnPaquete"/></td>
                            <td align="left"><fsn:input path="cnPaquete" disabled="true" uppercase="true" maxlength="1" css="anchoInput200"/></td>
                        </tr>
                    </table>
                </fieldset><br/>
            </td>
        </tr>
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;Fechas&nbsp;&nbsp; </strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.inicioPago"/></td>
                            <td align="left">
                                <fsn:input path="nomIniPago" size="10" readonly="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.finPago"/></td>
                            <td align="left">
                                <fsn:input path="nomFinPago" size="10" readonly="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.fechaPago"/></td>
                            <td align="left">
                                <fsn:input path="nomFecPago" size="10" readonly="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.fechaDeposito"/></td>
                            <td align="left">
                                <fsn:input path="nomFecDeposito" size="10" readonly="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.fechaApertura"/></td>
                            <td align="left">
                                <fsn:input path="nomFecApertura" size="10" readonly="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.fechaCierre"/></td>
                            <td align="left">
                                <fsn:input path="nomFecCierre" size="10" readonly="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td align="left" height="20px" valign="middle">
                <spring:message code="sireh.form.required.fields"/>
            </td>
        </tr>
        <tr>
            <td>
                <table align="center" width="90%" border="0">
                    <tr>
                        <td align="right">
                            <fsn:submit value="submit.update"
                                        path="update" action="timbradoSat/updateEstatus"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel"
                                        path="cancel" action="timbradoSat/consultarEstatus"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</html:form>
