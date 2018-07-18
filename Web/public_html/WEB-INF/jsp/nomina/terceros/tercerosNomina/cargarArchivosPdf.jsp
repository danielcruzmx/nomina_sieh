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
    .anchoTextarea {
        width: 300px;
    }
</style>
<html:form modelAttribute="archivosTimbrePdfDTO" method="post" enctype="multipart/form-data">
    
    
    <html:hidden path="idNomina"/>
    
    <html:hidden path="nomFuenteDatos"/>
    
    <h1><spring:message code="sireh.label.nomina.terceros.cargaArchivosPdf.titulo"/></h1>
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
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.numQuincena"/></td>
                            <td align="left">
                                <fsn:input path="nomQnaCaptura"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.tipoNomina"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaTiposNomina"
                                                path="idTipoNomina"
                                                style="width: 200px;"
                                                onchange="getTipoNomina()"
                                                disabled="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.numComplemento"/></td>
                            <td align="left">
                                <fsn:input path="nomNumComplem" 
                                           uppercase="true"
                                           maxlength="10" 
                                           size="10"
                                           readonly="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.gpoPago"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaGruposPago"
                                                path="idGrupoPagoNom"
                                                style="width: 200px;"
                                                disabled="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.descripcion"/></td>
                            <td align="left">
                                <fsn:input path="descNomina"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60"
                                           css="anchoInput"
                                           readonly="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.leyenda"/></td>
                            <td align="left" colspan="4">
                                <fsn:input path="nomLeyenda" 
                                           uppercase="true"
                                           maxlength="60" 
                                           size="60"
                                           css="anchoInput"
                                           readonly="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.reglaCalculo"/></td>
                            <td align="left">
                                <fsn:input path="nomReglaCalculo"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60"
                                           css="anchoInput"
                                           readonly="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.fuenteDatos"/></td>
                            <td align="left" colspan="4">
                                <html:select path="nomFuenteDatos" cssClass="uppercase" disabled="true">
                                    <html:option value="" label="${nonValue}"/>
                                    <html:option value="PLAZAS" label="Plazas"/>
                                    <html:option value="HISTORICO" label="Historico"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.status"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaEstadosNomina"
                                                path="idEdoNom"
                                                style="width: 200px;"
                                                disabled="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset><br/>
                
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.terceros.cargaArchivosPdf.archivo"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td ></td>
                            <td align="left" width="300px;">
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.gestion.label.timbrado.archCreacion"/></td>
                            <td align="left">
                                <input type="file" name="nomArchPdfsFile" id="nomArchPdfsFile" value="file" size="50" class="anchoInput"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">&nbsp;</td>
                        </tr>
                    </table>
                </fieldset><br/>
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
                                        action="tercerosNomina/updateArchivosPdf" progressBar="true"
                                       />
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel"
                                        action="tercerosNomina/listarNominasCarga" progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${nominaDTO.idEdoNom == \'C\'}">
            <script type="text/javascript">
                // Validacion nominas cerradas
                //$j("#10001").prop("disabled",true);
                $j("#10001").prop("disabled",false);
            </script>
        </c:when>
        <c:otherwise>
            <script type="text/javascript">
                $j("#10001").prop("disabled",false);
            </script>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        // Funcion para validar total de caracteres en textarea
        var characters = 100;
        $j("#nomRefTimbrado").keyup(function(){
            if ($j(this).val().length > characters) {
                $j(this).val($j(this).val().substr(0, characters));
            }
        });
        $j("#nomRefSat").keyup(function(){
            if ($j(this).val().length > characters) {
                $j(this).val($j(this).val().substr(0, characters));
            }
        });
    </script>
</html:form>
