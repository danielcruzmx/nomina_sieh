<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="creacionPlazaDTO">
    
    <html:hidden path="inicioQuincenaCaptura"/>
    <html:hidden path="finQuincenaCaptura"/>
    
    <h1><spring:message code="sireh.label.plaza.gestion.titulo.link"/> - 
    <spring:message code="sireh.label.plaza.honorarios.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.movimientos.titulo.link"/> -  
    <spring:message code="sireh.label.plaza.honorarios.creacionPlaza.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="90%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.honorarios.creacionPlaza.titulo.datosPlaza"/></strong>
                    </legend>
                    <table>
                        <tr>
                            <td width="155px" align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.creacionPlaza.idUnidad"/></td>
                            <td width="255px" align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadCreacion" 
                                                path="idUnidad" 
                                                style="width: 255px;"/>
                            </td>
                            <td width="155px" align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.creacionPlaza.idPuesto"/></td>
                            <td width="290px" align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcPuestoBusqueda" 
                                                path="idPuesto" 
                                                style="width: 290px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.creacionPlaza.idEdo"/></td>
                            <td align="left">
                                <fsn:filter property="uniEdoCiclo" condition="contains"/>
                                <fsn:selectList beanName="tcUnidadEdoCreacion" 
                                                path="idEdo" 
                                                parentPath="idUnidad" 
                                                progress="true" 
                                                style="width: 255px;"/>
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.creacionPlaza.idMuni"/></td>
                            <td align="left">
                                <fsn:selectList beanName="tcMunicipio" 
                                                path="idMuni" 
                                                parentPath="idEdo" 
                                                progress="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.creacionPlaza.plazaIniCont"/></td>
                            <td align="left"><fsn:calendar path="plazaIniCont" size="10"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.creacionPlaza.plazaFinCont"/></td>
                            <td align="left"><fsn:calendar path="plazaFinCont" size="10"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.creacionPlaza.idZonaEco"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="zonaEconomicaCreacionPlaza" 
                                                path="idZonaEco" 
                                                parentPath="idPuesto" 
                                                progress="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.creacionPlaza.idRango"/></td>
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
                        <strong><spring:message code="sireh.label.plaza.honorarios.creacionPlaza.titulo.datosPresupuesto"/></strong>
                    </legend>
                    <table>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.creacionPlaza.idNivelFisico"/></td>
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
                            <td width="155px" align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.creacionPlaza.nombramiento"/></td>
                            <td width="255px" align="left">
                                <fsn:selectList beanName="nombramientoCreacionPlaza" 
                                                path="nombramiento" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                            <td width="155px" align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.creacionPlaza.jerarquia"/></td>
                            <td width="290px" align="left">
                                <fsn:selectList beanName="jerarquiaCreacionPlaza" 
                                                path="jerarquia" 
                                                parentPath="idPuesto" 
                                                progress="true" 
                                                disabled="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.creacionPlaza.sueldo"/></td>
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
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.creacionPlaza.compensacion"/></td>
                            <td align="left">
                                <fsn:filter property="TAB.ID_ZONA_ECON" condition="contains" path="idZonaEco"/>
                                <fsn:filter property="TAB.ID_RANGO" condition="contains" path="idRango"/>
                                <fsn:selectList beanName="compensacionCreacionPlaza" 
                                                path="compensacion" 
                                                parentPath="idPuesto" 
                                                filterPaths="idZonaEco"
                                                progress="true" 
                                                disabled="true" 
                                                onchange="importe()"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="155px" align="right" class="label">* <spring:message code="sireh.label.plaza.honorarios.creacionPlaza.importeHonorario"/></td>
                            <td width="255px" align="left"><c:out value="$"/><html:input path="importeHonorarioString"/></td>
                            <td width="445px" colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.honorarios.creacionPlaza.plazaReferencia"/></td>
                            <td align="left" colspan="3"><fsn:input path="plazaReferencia" size="60" maxlength="60"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <table align="center" width="100%" border="0">
                    <tr>
                        <td align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                    </tr>
                    <tr>
                        <td align="right">
                            <fsn:submit value="submit.accept" action="plazaHonorarios/saveCreacionPlaza.do"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.cancel" action="plazaHonorarios/creacionPlaza.do"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">        
        function importe() {
            $j("#importeHonorarioString").val("");
            
            var sueldo = 0;
            var compensacion = 0;
            var importeHonorarioValue = 0;
            
            sueldo = $j("#sueldo option:selected" ).text();
            if (sueldo != null) {
                sueldo = sueldo.replace("$", "");
                sueldo = sueldo.replace(/\,/g,"");
            }
            compensacion = $j("#compensacion option:selected" ).text();
            if (compensacion != null) {
                compensacion = compensacion.replace("$", "");
                compensacion = compensacion.replace(/\,/g,"");
            }
            if (sueldo != null && compensacion != null) {
                importeHonorarioValue = parseFloat(sueldo) + parseFloat(compensacion);
            }
            var amount = parseFloat(Math.round(importeHonorarioValue * 100) / 100).toFixed(2);
            $j("#importeHonorarioString").val(amount).digits();
        }
        
        $j.fn.digits = function(){ 
            return this.each(function(){ 
                $j(this).val($j(this).val().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,")); 
            });
        }
    </script>
</html:form>