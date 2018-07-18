<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<html:form modelAttribute="plazaEnConcursoDTO">
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="idPlazaConcurso"/>
    <html:hidden path="muestraConcurso"/>
    
    
    <h1>
        <spring:message code="sireh.label.plaza.gestion.titulo.link"/>  -  
        <spring:message code="sireh.label.plaza.estructura.titulo.link"/> -  
        <spring:message code="sireh.label.plaza.movimientosNomina.titulo.link"/> -  
        <spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.titulo"/>
    </h1>
    <p>&nbsp;</p>
    
    <table align="center" width="50%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.titulo.busqueda"/></strong>
                    </legend>
                    <table width="100%">
                        <tr>
                            <td align="right" class="label"> * <spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.idPlaza"/></td>
                            <td align="left"><fsn:input path="idPlazaBusqueda" maxlength="5" onkeypress="return IsNumber(event);" /></td>
                        </tr>
                        <tr>
                            <td><spring:message code="sireh.form.required.fields"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table width="100%">
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" path="buscar"
                            action="plazaEstructura/${plazaEnConcursoDTO.urlOrigen}"/>&nbsp;
                <fsn:submit value="submit.clean" path="limpiar"
                            action="plazaEstructura/${plazaEnConcursoDTO.urlOrigen}"/>
        </tr>
    </table>&nbsp;
    
    <c:if test="${plazaEnConcursoDTO.muestraConcurso}">
    <table align="center" width="75%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.titulo.plaza"/></strong>
                    </legend>
                    <table width="100%">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.idPlaza"/></td>
                            <td align="left"><fsn:input size="40" path="idPlaza" readonly="true" /> </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.rfc"/></td>
                            <td align="left"><fsn:input size="40" path="plazaRfc" readonly="true" uppercase="true"/> </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.nombreEmpleado"/></td>
                            <td align="left"><fsn:input size="40" path="nombreEmpleado" readonly="true" uppercase="true"/> </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.codigoPuesto"/></td>
                            <td align="left"><fsn:input size="40" path="codigoPuesto" readonly="true" uppercase="true"/> </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.nombrePuesto"/></td>
                            <td align="left"><fsn:input size="40" path="nombrePuesto" readonly="true" uppercase="true"/> </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.descUnidad"/></td>
                            <td align="left"><fsn:input size="40" path="descUnidad" readonly="true" uppercase="true"/> </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.idPuestoNom"/></td>
                            <td align="left"><fsn:input size="40" path="idPuestoNom" readonly="true" uppercase="true"/> </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.idNivelPto"/></td>
                            <td align="left"><fsn:input size="40" path="idNivelPto" readonly="true" uppercase="true"/> </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.idRangoNom"/></td>
                            <td align="left"><fsn:input size="40" path="idRangoNom" readonly="true" uppercase="true"/> </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.descSitPlaza"/></td>
                            <td align="left"><fsn:input size="40" path="descSitPlaza" readonly="true" uppercase="true"/> </td>
                        </tr>                                                                        
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    &nbsp;
    
    
        <table align="center" width="75%">
            <tr>    
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em">
                            <strong><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.titulo.concurso"/></strong>
                        </legend>
                        <table width="100%" id="calendar" border="0">
                        <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.enProceso" /></td>
                                <td align="left"><html:radiobutton path="idEstatus" value="1"/> </td>
                                <td align="right" class="label">
                                    <spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.fechaEtapa"/>
                                </td>
                                <td align="left">
                                    <fsn:calendar path="fechaEtapa" />
                                </td>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.etapa" /></td>
                                <td align="left"><fsn:selectList beanName="listTcEtapasPlazaConcurso" path="idEtapa" style="width: 126px;"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.desierto"/></td>
                                <td align="left"><html:radiobutton path="idEstatus" value="2"/> </td>
                                
                                <td align="right" class="label">
                                    <spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.fechaDesierta"/>
                                </td>
                                <td align="left">
                                    <fsn:calendar path="fechaDesierta" />
                                </td>
                            </tr>
                            
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.cancelado"/></td>
                                <td align="left"><html:radiobutton path="idEstatus" value="3"/> </td>
                                
                                <td align="right" class="label">
                                    <spring:message code="sireh.label.plaza.estructura.plazaEnconcurso.fechaCancelado"/>
                                </td>
                                <td align="left">
                                    <fsn:calendar path="fechaCancelado" />
                                </td>
                            </tr>
                            
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>
        
        <table width="100%">
            <tr align="center">
                <td>
                    <fsn:submit value="submit.save" path="guardar" 
                                action="plazaEstructura/${plazaEnConcursoDTO.urlDestino}"/>&nbsp;
                    <fsn:submit value="submit.cancel" path="cancelar"
                                action="plazaEstructura/${plazaEnConcursoDTO.urlOrigen}"/>
            </tr>
        </table>
        
        
        
        </c:if>
    
    <script type="text/javascript">
         $j(document).ready(function(){
            $j("#calendar tr:nth-child(2) td:nth-child(3) ").hide();
            $j("#calendar tr:nth-child(2) td:nth-child(4) ").hide();
            
            $j("#calendar tr:nth-child(3) td:nth-child(3) ").hide();
            $j("#calendar tr:nth-child(3) td:nth-child(4) ").hide();
            
            verificaEstatus();
            $j("input[name='idEstatus']").change(function(){
                verificaEstatus();
            });
        });

        function verificaEstatus(){
            if( $j("input[name='idEstatus']:checked").val() == 1){
                $j("#calendar tr:nth-child(2) td:nth-child(3) ").hide();
                $j("#calendar tr:nth-child(2) td:nth-child(4) ").hide();
                $j("#calendar tr:nth-child(3) td:nth-child(3) ").hide();
                $j("#calendar tr:nth-child(3) td:nth-child(4) ").hide();
                
                
            } else if ($j("input[name='idEstatus']:checked").val() == 2){
                $j("#calendar tr:nth-child(2) td:nth-child(3) ").show();
                $j("#calendar tr:nth-child(2) td:nth-child(4) ").show();
                $j("#calendar tr:nth-child(3) td:nth-child(3) ").hide();
                $j("#calendar tr:nth-child(3) td:nth-child(4) ").hide();
            
            } else if ($j("input[name='idEstatus']:checked").val() == 3){
                $j("#calendar tr:nth-child(2) td:nth-child(3) ").hide();
                $j("#calendar tr:nth-child(2) td:nth-child(4) ").hide();
                $j("#calendar tr:nth-child(3) td:nth-child(3) ").show();
                $j("#calendar tr:nth-child(3) td:nth-child(4) ").show();
            }
        }
    </script>
    <script  type="text/javascript">
    var nav4 = window.Event ? true : false;
    function IsNumber(e){
        var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
       return ((tecla > 47 && tecla < 58) || tecla == 46);
    }

 </script>
</html:form>