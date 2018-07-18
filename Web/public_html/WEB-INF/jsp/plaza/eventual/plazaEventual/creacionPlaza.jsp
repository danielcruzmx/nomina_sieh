<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="creacionPlazaDTO">
    
    <html:hidden path="inicioQuincenaCaptura"/>
    <html:hidden path="finQuincenaCaptura"/>
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.eventual.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.eventual.creacionPlaza.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="90%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.eventual.creacionPlaza.titulo.datosPlaza"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td width="155px" align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.creacionPlaza.idUnidad"/></td>
                            <td width="255px" align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadCreacion" 
                                                path="idUnidad" 
                                                style="width: 255px;"/>
                            </td>
                            <td width="155px" align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.creacionPlaza.idPuesto"/></td>
                            <td width="290px" align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcPuestoCreacion" 
                                                path="idPuesto" 
                                                style="width: 290px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.creacionPlaza.idEdo"/></td>
                            <td align="left">
                                <fsn:filter property="uniEdoCiclo" condition="contains"/>
                                <fsn:selectList beanName="tcUnidadEdoCreacion" 
                                                path="idEdo" 
                                                parentPath="idUnidad" 
                                                progress="true" 
                                                style="width: 255px;"/>
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.creacionPlaza.idMuni"/></td>
                            <td align="left">
                                <fsn:selectList beanName="tcMunicipio" 
                                                path="idMuni" 
                                                parentPath="idEdo" 
                                                progress="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.creacionPlaza.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.creacionPlaza.plazaFinCont"/></td>
                            <td align="left"><fsn:calendar path="plazaFinCont" size="10"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.creacionPlaza.idZonaEco"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="zonaEconomicaCreacionPlaza"  
                                                path="idZonaEco" 
                                                parentPath="idPuesto" 
                                                progress="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.idRango"/></td>
                            <td align="left"><fsn:label path="idRango"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td height="10px"></td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.eventual.creacionPlaza.titulo.datosEmpleado"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td width="155px" align="right" class="label">* <spring:message code="sireh.label.plaza.eventual.creacionPlaza.idServPub"/></td>
                            <td width="255px" align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcTipoServPubCreacion" 
                                                path="idServPub" 
                                                style="width: 255px;"/>
                            </td>
                            <td width="445px" colspan="2"></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td height="10px"></td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.eventual.creacionPlaza.titulo.datosPresupuesto"/></strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.idNivelFisico"/></td>
                            <td align="left">
                                <fsn:selectList beanName="nivelCreacionPlaza" 
                                                path="nivelFisico" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                            <td align="left" colspan="2"></td>
                        </tr>
                        <tr>
                            <td width="155px" align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.nombramiento"/></td>
                            <td width="255px" align="left">
                                <fsn:selectList beanName="nombramientoCreacionPlaza" 
                                                path="nombramiento" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                            <td width="155px" align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.jerarquia"/></td>
                            <td width="290px" align="left">
                                <fsn:selectList beanName="jerarquiaCreacionPlaza" 
                                                path="jerarquia" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.sueldo"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_ZONA_ECON" condition="contains" path="idZonaEco"/>
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:selectList beanName="sueldoCreacionPlaza" 
                                                path="sueldo" 
                                                parentPath="idPuesto" 
                                                filterPaths="idZonaEco"
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.compensacion"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_ZONA_ECON" condition="contains" path="idZonaEco"/>
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:selectList beanName="compensacionCreacionPlaza" 
                                                path="compensacion" 
                                                parentPath="idPuesto" 
                                                filterPaths="idZonaEco"
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.plazaReferencia"/></td>
                            <td align="left"><fsn:input path="plazaReferencia" size="48" maxlength="60"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.plazaSoporte"/></td>
                            <td align="left"><html:checkbox value="1" path="checkPlazaSoporte" onclick="renderPlazaSoporte();"/></td>
                        </tr>
                        
                        <tr id="spanPlazaSoporte">
                            <td colspan="4" align="left">
                                <table>
                                    <tr>
                                        <td colspan="4"><h3><spring:message code="sireh.label.plaza.eventual.creacionPlaza.titulo.datosPlazaSoporte"/></h3></td>
                                    </tr>
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.plaza"/></td>
                                        <td align="left">
                                            <fsn:option key="0" value="selectList.nonValue"/>
                                            <fsn:selectList beanName="respaldoCreacionPlaza" 
                                                            path="plazaRespaldo" 
                                                            style="width: 255px;"/>
                                        </td>
                                        <td colspan="2"></td>
                                    </tr>
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.idNivelFisico"/></td>
                                        <td align="left">
                                            <fsn:selectList beanName="nivelCreacionPlazaSoporte" 
                                                            path="nivelFisicoSoporte" 
                                                            parentPath="plazaRespaldo" 
                                                            progress="true" 
                                                            disabled="true"/>
                                        </td>
                                        <td align="left" colspan="2"></td>
                                    </tr>
                                    <tr>
                                        <td width="155px" align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.nombramiento"/></td>
                                        <td width="255px" align="left">
                                            <fsn:selectList beanName="nombramientoCreacionPlazaSoporte" 
                                                            path="nombramientoSoporte" 
                                                            parentPath="plazaRespaldo" 
                                                            progress="true" 
                                                            disabled="true"/>
                                        </td>
                                        <td width="155px" align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.jerarquia"/></td>
                                        <td width="290px" align="left">
                                            <fsn:selectList beanName="jerarquiaCreacionPlazaSoporte" 
                                                            path="jerarquiaSoporte" 
                                                            parentPath="plazaRespaldo" 
                                                            progress="true" 
                                                            disabled="true"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.sueldo"/></td>
                                        <td align="left">
                                            <fsn:selectList beanName="sueldoCreacionPlazaSoporte" 
                                                            path="sueldoSoporte" 
                                                            parentPath="plazaRespaldo" 
                                                            progress="true" 
                                                            disabled="true"/>
                                        </td>
                                        <td align="right" class="label"><spring:message code="sireh.label.plaza.eventual.creacionPlaza.compensacion"/></td>
                                        <td align="left">
                                            <fsn:selectList beanName="compensacionCreacionPlazaSoporte" 
                                                            path="compensacionSoporte" 
                                                            parentPath="plazaRespaldo" 
                                                            progress="true" 
                                                            disabled="true"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <table align="center" width="100%" border="0">
                    <tr>
                        <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                    </tr>
                    <tr>
                        <td align="right">
                            <fsn:submit value="submit.accept" action="plazaEventual/saveCreacionPlaza.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" action="plazaEventual/creacionPlaza.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        var seleccionInicial = <c:out value="${creacionPlazaDTO.checkPlazaSoporte}"/>;
        if (seleccionInicial) {
            document.getElementById("spanPlazaSoporte").style.display = 'block';
        } else {
            document.getElementById("spanPlazaSoporte").style.display = 'none';
        }
        
        function renderPlazaSoporte() {
            var seleccion = document.getElementById("checkPlazaSoporte1").checked;
        
            if (seleccion) {
                document.getElementById("spanPlazaSoporte").style.display = 'block';
            } else {
                document.getElementById("spanPlazaSoporte").style.display = 'none';
            }
        }
    </script>
</html:form>