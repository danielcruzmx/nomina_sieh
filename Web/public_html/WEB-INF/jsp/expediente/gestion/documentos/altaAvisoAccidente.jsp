<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
</style>
<html:form modelAttribute="expedienteAvisoAccidenteDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" align="center" border="0">
        <tr align="left">
            <td>
                <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.expedientePersonal.title"></spring:message> <fsn:label path="nombreEmpleadoCompleto"/></h1>
            </td>
        </tr>
        <tr>
            <td>
                <table width="100%">
                    <tr>
                        <td align="center">
                            <fieldset>
                                <legend>
                                    <strong><spring:message text="Datos"/></strong>
                                    <img class="fotografia" width="55" src="<spring:theme code="casa.jpg"/>" align="middle"/>       
                                    <strong><spring:message text="personales"/></strong>
                                </legend>
                                <table width="100%">
                                    <tr>
                                        <td align="left">
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>* Aviso en caso de accidente</strong></legend><br/>
                                                <table width="100%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.nombre"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="nombre"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="60" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.primerApellido"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="primerApellido"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="60" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.segundoApellido"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="segundoApellido"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="40" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.telefono1"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="telefono1"
                                                                       uppercase="true" 
                                                                       maxlength="15"
                                                                       size="15" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.telefono2"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="telefono2"
                                                                       uppercase="true" 
                                                                       maxlength="15"
                                                                       size="15" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.parentesco"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcParentesco-altaAvisoAccidente"
                                                                            path="parentesco"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                </table>
                                                <table width="100%">
                                                    <tr align="center">
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                    <tr align="center">
                                                        <td>
                                                           <c:if test="${expedienteAvisoAccidenteDTO.registrar}">
                                                                <fsn:submit value="submit.save" 
                                                                            path="registrar"
                                                                            action="gestionDocumentos/${expedienteAvisoAccidenteDTO.urlDestino}"
                                                                            progressBar="true"
                                                                            alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            </c:if>
                                                            <fsn:submit value="submit.cancel" 
                                                                        path="cancel" 
                                                                        action="gestionDocumentos/busquedaDocEmpleado.do"
                                                                        progressBar="true"/>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </fieldset>
                                        </td>
                                    </tr>
                                    <tr align="center">
                                        <td>&nbsp;</td>
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
                                    <tr>
                                        <td>
                                             <fieldset>
                                                <legend style="font-size:1.3em"><strong>Antecedentes de Aviso en caso de accidente</strong></legend>
                                                
                                                <fsn:filter property="EA.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                
                                                <fsn:pagedList beanName="${expedienteAvisoAccidenteDTO.beanName}" 
                                                               baseUrl="${expedienteAvisoAccidenteDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteAvisoAccidenteDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.secuencia" 
                                                                            property="accSecuencia" 
                                                                            sortable="true"
                                                                            style="text-align: center"/> 
                                                           
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.nombre" 
                                                                            property="accNombreEmpleado" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.primerApellido" 
                                                                            property="accPrimerApellido" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.segundoApellido" 
                                                                            property="accSegundoApellido" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.telefono1" 
                                                                            property="accTelefono1" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.telefono2" 
                                                                            property="accTelefono2" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaAvisoAccidente.parentesco" 
                                                                            property="descParentesco" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                                            
                                                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                                                            <display:setProperty name="export.pdf" value="true"/>
                                                            <display:setProperty name="basic.msg.empty_list">
                                                                <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                                            </display:setProperty>
                                                        </display:table>
                                                    </div>
                                                </fsn:pagedList>
                                            </fieldset>
                                        </td>
                                    </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j(document).ready(function(){
            //$j('#telefono1').mask('AAAAAAAAAAAA');
            //$j('#telefono2').mask('AAAAAAAAAAAA');
        });
        
        $j(function(){
           $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>