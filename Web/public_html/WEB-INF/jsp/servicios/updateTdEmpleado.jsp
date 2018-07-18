<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .columnHeader {
        background-color: rgb(109, 109, 109);
        color: rgb(255, 255, 255);
        font-weight: bold;
        text-align: center;
    }
    .columnFoter {
        background-color: rgb(0, 110, 219);
        color: rgb(255, 255, 255);
        font-weight: bold;
        text-align: center;
    }
</style>

<%-- Inicializar la forma --%> 
<html:form modelAttribute="tablaDTO">
    <html:hidden path="tdEmpleadoDTO.rfcEmpleado" />
    
    <h1>
        <strong>
            <spring:message code="expediente.servicios"/> &#45;&nbsp;
            <spring:message code="sireh.label.servicio.actualizarRegPorTabla"/> &nbsp;&#45;&nbsp;
            <spring:message code="sireh.label.servicio.actualizarRegPorTabla.tdEmpleado"/>
        </strong>
    </h1>
    
    <table width="80%" align="center" border="0">
        <tr>
            <td>
                <fieldset><legend style='font-size:1.2em';>&nbsp;Busqueda&nbsp;</legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td width="15%" align="right" class="label">* <spring:message code="sireh.label.servicio.actualizarRegPorTabla.rfc"/></td>
                            <td width="15%" align="left">
                                <fsn:input path="rfcEmpleado" size="15" maxlength="13"/>
                            </td>
                            <td width="20%" align="left" colspan="3">
                                <fsn:submit value="submit.search"
                                            path="buscar"
                                            action="servicios/updateTdEmpleado.do"
                                            progressBar="true"/>
                                
                                <c:if test="${tablaDTO.buscar}">
                                    <fsn:submit value="submit.save"
                                                path="salvar"
                                                action="servicios/updateTdEmpleado.do"
                                                progressBar="true"/>
                                </c:if>
                            </td>
                            
                            <td width="50%">
                                <c:if test="${tablaDTO.buscar}"><p><strong><c:out value="${tablaDTO.nombre}"/></strong></p></c:if>
                            </td>
                        </tr>
                        <tr><td colspan="4"><strong>* Campos requeridos.<br/></strong></td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br>
                
    <c:if test="${tablaDTO.buscar}">
        <table width="80%" align="center" border="0">
            <tr>
                <td>
                    <fieldset><legend style='font-size:1.2em';>&nbsp;<spring:message code="sireh.label.servicio.actualizarRegPorTabla.bisel"/>&nbsp;</legend>
                        <table width="95%" align="center" border="0">
                            <tr><td>&nbsp;</td></tr>
                            <tr>
                                <td class="columnHeader" width="30%"><spring:message code="sireh.label.servicio.tdPlaza.campo"/></td>
                                <td class="columnHeader" width="35%"><spring:message code="sireh.label.servicio.tdPlaza.valor.actual"/></td>
                                <td class="columnHeader" width="35%"><spring:message code="sireh.label.servicio.tdPlaza.valor.nuevo"/></td>
                            </tr>
                            
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.RFC_EMPLEADO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.rfcEmpleado}"/></td>
                                <td align="left">&nbsp;</td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.RFC_UNICO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.rfcUnico}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.rfcUnico" size="20" maxlength="13"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_ULTIMO_MOVTO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idUltimoMovto}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcMovsPersonal"
                                                    path="tdEmpleadoDTO.idUltimoMovto"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.FEC_ULTIMO_MOVTO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.fecUltimoMovto}"/></td>
                                <td align="left"><fsn:calendar path="fecUltimoMovto" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_BANCO_SAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idBancoSar}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcBanco"
                                                    path="tdEmpleadoDTO.idBancoSar"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_TIPO_PAGO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idTipoPago}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcTipoPago"
                                                    path="tdEmpleadoDTO.idTipoPago"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.IMSS_ISSSTE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.imssIssste}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.imssIssste" size="20" maxlength="11"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.NUM_ISSSTE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.numIssste}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.numIssste" size="20" maxlength="11"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.SISTEMA_REPARTO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.sistemaReparto}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.sistemaReparto" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.CURP_EMPLEADO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.curpEmpleado}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.curpEmpleado" size="20" maxlength="18"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.NOMBRE_EMPLEADO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.nombreEmpleado}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.nombreEmpleado" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.PRIMER_APELLIDO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.primerApellido}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.primerApellido" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.SEGUNDO_APELLIDO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.segundoApellido}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.segundoApellido" size="20" maxlength="40"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.FEC_NACIMIENTO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.fecNacimiento}"/></td>
                                <td align="left"><fsn:calendar path="fecNacimiento" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.CLABE_EMPLEADO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.clabeEmpleado}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.clabeEmpleado" size="20" maxlength="18"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.REFERENCIA_OFICIO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.referenciaOficio}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.referenciaOficio" size="20" maxlength="60"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.EMP_QNA_CAPTURA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.empQnaCaptura}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.empQnaCaptura" size="20" maxlength="6"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.INGRESO_GOB_FED"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.ingresoGobFed}"/></td>
                                <td align="left"><fsn:calendar path="ingresoGobFed" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.INGRESO_DEPENDENCIA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.ingresoDependencia}"/></td>
                                <td align="left"><fsn:calendar path="ingresoDependencia" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_PLAZA_VIGENTE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idPlazaVigente}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.idPlazaVigente" size="20" maxlength="6"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.CASO_MUESTRA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.casoMuestra}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.casoMuestra" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.CALLE_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.calleParticular}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.calleParticular" size="20" maxlength="120"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.COLONIA_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.coloniaParticular}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.coloniaParticular" size="20" maxlength="50"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_MUNI_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idMuniParticular}"/></td>
                                <td align="left">
                                    <fsn:filter property="ID_EDO" condition="=" path="tnMovtosEmpPlaDTO.idEdoParticular" />
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcMunicipioo"
                                                    path="tdEmpleadoDTO.idMuniParticular"
                                                    style="width: 200px;"
                                                    appendFilters="false" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_EDO_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idEdoParticular}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEstado"
                                                    path="tdEmpleadoDTO.idEdoParticular"
                                                    style="width: 200px;" />
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.CODPOST_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.codpostParticular}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.codpostParticular" size="20" maxlength="5"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.TEL_PARTICULAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.telParticular}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.telParticular" size="20" maxlength="15"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_EDO_CIVIL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idEdoCivil}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEstadoCivil"
                                                    path="tdEmpleadoDTO.idEdoCivil"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.E_MAIL_OFICIAL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.EMailOficial}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.EMailOficial" size="20" maxlength="60"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.E_MAIL_PERSONAL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.EMailPersonal}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.EMailPersonal" size="20" maxlength="60"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_EDO_NAC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idEdoNac}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEstado"
                                                    path="tdEmpleadoDTO.idEdoNac"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_GENERO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idGenero}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcGenero"
                                                    path="tdEmpleadoDTO.idGenero"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_NACIONALIDAD"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idNacionalidad}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcNacionalidad"
                                                    path="tdEmpleadoDTO.idNacionalidad"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.DISCAPACIDAD"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.discapacidad}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.discapacidad" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_NIVEL_ESCOLAR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idNivelEscolar}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcNivelEscolar"
                                                    path="tdEmpleadoDTO.idNivelEscolar"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_PROFN_CARRERA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idProfnCarrera}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcProfnCarrera"
                                                    path="tdEmpleadoDTO.idProfnCarrera"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_INST_EDUCATIVA"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idInstEducativa}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcInstEducativa"
                                                    path="tdEmpleadoDTO.idInstEducativa"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_INST_PROTCIVIL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idInstProtcivil}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcIstProtCivil"
                                                    path="tdEmpleadoDTO.idInstProtcivil"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_ESP_PROT_CIVIL"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idEspProtCivil}"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcEspProtCivil"
                                                    path="tdEmpleadoDTO.idEspProtCivil"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ESTUDIA_SI_NO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.estudiaSiNo}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.estudiaSiNo" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.PADRE_MADRE"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.padreMadre}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.padreMadre" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.TERMINO_CARGO_SIND"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.terminoCargoSind}"/></td>
                                <td align="left"><fsn:calendar path="terminoCargoSind" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.COMPAT_EMPLEO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.compatEmpleo}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.compatEmpleo" size="20" maxlength="1"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.ID_RUSP"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.idRusp}"/></td>
                                <td align="left"><fsn:input path="tdEmpleadoDTO.idRusp" size="20" maxlength="7"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.FEC_NOT_DEC_PATR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.fecNotDecPatr}"/></td>
                                <td align="left"><fsn:calendar path="fecNotDecPatr" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.FEC_INI_DECL_PATR"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.fecIniDeclPatr}"/></td>
                                <td align="left"><fsn:calendar path="fecIniDeclPatr" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.FEC_ING_SPC"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.fecIngSpc}"/></td>
                                <td align="left"><fsn:calendar path="fecIngSpc" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.USUARIO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.usuario}"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.servicio.tdEmpleado.FEC_MODIFICO"/></td>
                                <td align="left"><c:out value="${tablaDTO.tdEmpleadoDTO.fecModifico}"/></td>
                            </tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
    </c:if><br>
    
    <c:if test="${tablaDTO.buscar}">
    <table width="80%" align="center" border="0">
        <tr>
            <td>
                <fieldset><legend style='font-size:1.2em';>&nbsp;Causas de la modificaci&oacute;n&nbsp;</legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td align="right" class="label">*<spring:message code="sireh.label.servicio.tdPlaza.motivo"/></td>
                            <td align="left">
                                <html:textarea path="motivoModifica" rows="4" cols="140" /> 
                            </td>
                        </tr>
                        <tr><td colspan="4"><strong>* Campos requeridos.<br/></strong></td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br>
    </c:if>
    
    <script  type="text/javascript">
        $j(document).ready(function(){
            $j('#10002').click(function(){
                var mesaje = 'ADVENTENCIA: El registro sera actualizado. \n ESTE PROCESO ES IRREVERSIBLE! \n \u00BF Desea continuar ?';
                var r = window.confirm(mesaje);
                $j('#salvar').val(r);
            });
        });
    </script>
    
    <script  type="text/javascript">
    var nav4 = window.Event ? true : false;
    function IsNumber(e){
        var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
       return ((tecla > 47 && tecla < 58) || tecla == 46);
    }

 </script>
    
</html:form>