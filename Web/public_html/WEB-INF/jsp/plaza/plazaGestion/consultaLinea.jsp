<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="consultaLineaDTO">
    <h1 align="left"><spring:message code="sireh.label.plaza.gestion.consultaLinea.titulo"></spring:message></h1>
    
    <c:set var="content1">
        <table width="90%">
            <tr> 
                <td align="left" colspan="2"><h3><spring:message code="sireh.label.plaza.gestion.consultaLinea.tituloPlaza"></spring:message></h3></td>
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.plazaCiclo"></spring:message></td>
                <td align="left"><fsn:label path="plazaCiclo"/></td>     
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descTipoPlaza"></spring:message></td>
                <td align="left"><fsn:label path="descTipoPlaza"/></td>       
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idPlaza"></spring:message></td>
                <td align="left"><fsn:label path="idPlaza"/>&nbsp;<fsn:detalleCalculoNomina name="plaza" plaza="${consultaLineaDTO.idPlaza}" image="detail.gif" /></td>
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descSitPlaza"></spring:message></td>
                <td align="left"><fsn:label path="descSitPlaza"/></td>
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descGrupoPago"></spring:message></td>
                <td align="left"><fsn:label path="descGrupoPago"/></td>
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descVacancia"></spring:message></td>
                <td align="left"><fsn:label path="descVacancia"/></td>     
                <td></td>
                <td></td>
            </tr>            
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.contrato"></spring:message></td>
                <td align="left"><fsn:label path="plazaIniCont"/> - <fsn:label path="plazaFinCont"/>
                </td>
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.licencia"></spring:message></td>
                <td align="left"><fsn:label path="plazaIniLic"/> - <fsn:label path="plazaFinLic"/>
                </td>
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.plazaUltimoMovto"></spring:message></td>
                <td align="left"><fsn:label path="plazaUltimoMovto"/></td>
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.plazaReferencia"></spring:message></td>
                <td align="left"><fsn:label path="plazaReferencia"/></td>
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.plazaRespaldo"></spring:message></td>
                <td align="left">
                    <c:if test="${consultaLineaDTO.plazaRespaldo > '0'}">
                        <fsn:label path="plazaRespaldo"/>&nbsp;<fsn:detalleCalculoNomina name="plaza" plaza="${consultaLineaDTO.plazaRespaldo}" image="detail.gif" />
                    </c:if>
                    <c:if test="${consultaLineaDTO.plazaRespaldo == '0'}">
                        <fsn:label path="plazaRespaldo"/>
                    </c:if>
                </td>            
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.plazaQnaCaptura"></spring:message></td>
                <td align="left"><fsn:label path="plazaQnaCaptura"/></td>
            </tr>
        </table>
    </c:set>
    
    
    <c:set var="content2">
        <table width="90%">
             <tr align="left"> 
                <td align="left" colspan="2"><h3><spring:message code="sireh.label.plaza.gestion.consultaLinea.tituloEmpleado"></spring:message></h3></td>        
            </tr>
            <tr>
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.fotografia"></spring:message></td>
                <td>
                     <img class="fotografia" alt="Fotografia" align="left" width="75" src="/resources/images/empleados/<c:out value="${consultaLineaDTO.plazaRfc}"/>.jpg"/>
                </td>
             </tr>
            <tr align="left">   
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descTipoServPub"></spring:message></td>
                <td align="left"><fsn:label path="descTipoServPub"/></td>                 
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descMovsPersonal"></spring:message></td>
                <td align="left"><fsn:label path="descMovsPersonal"/></td>
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.plazaRfc"></spring:message></td>
                <td align="left"><fsn:label path="plazaRfc"/><fsn:detalleCalculoNomina name="rfc" rfc="${consultaLineaDTO.plazaRfc}" image="detail.gif" /></td>
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.curpEmpleado"></spring:message></td>
                <td align="left"><fsn:label path="curpEmpleado"/></td> 
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.nombreEmp"></spring:message></td>
                <td align="left"><fsn:label path="nombreEmp"/></td>  
            </tr>
        </table>
    </c:set>
    
    
    <c:set var="content3">
        <table width="90%">
            <tr align="left">   
                <td align="left" colspan="4"><h3><spring:message code="sireh.label.plaza.gestion.consultaLinea.tituloPresupuesto"></spring:message></h3></td>        
            </tr>   
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.uniDescPre"></spring:message></td>
                <td align="left"><fsn:label path="uniDescPre"/></td>        
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descPuestoPre"></spring:message></td>
                <td align="left"><fsn:label path="descPuestoPre"/></td> 
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idProyReducePre"></spring:message></td>
                <td align="left"><fsn:label path="idProyReducePre"/></td>        
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idProyAmpliaPre"></spring:message></td>
                <td align="left"><fsn:label path="idProyAmpliaPre"/></td>
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.nivelPtoPre"></spring:message></td>
                <td align="left"><fsn:label path="nivelPtoPre"/></td>
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idRangoPre"></spring:message></td>
                <td align="left"><fsn:label path="idRangoPre"/></td>      
            </tr>
            <tr align="left">   
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descEstadoPre"></spring:message></td>
                <td align="left"><fsn:label path="descEstadoPre"/></td>        
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idZonaEcoPre"></spring:message></td>
                <td align="left"><fsn:label path="idZonaEcoPre"/></td>                    
            </tr>
            <tr align="left">   
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.nombramientoPre"></spring:message></td>
                <td align="left"><fsn:label path="descNombramientoPre"/></td>
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descJerarquiaPre"></spring:message></td>
                <td align="left"><fsn:label path="descJerarquiaPre"/></td>             
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.tabSueldoPre"></spring:message></td>
                <td align="left"><fsn:label path="sueldoPreLabel"/></td>
                
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.tabCompensacionPre"></spring:message></td>
                <td align="left"><fsn:label path="compensacionPreLabel"/></td>   
            </tr>
        </table>
    </c:set>
    
    <c:set var="content4">
        <table width="90%">
            <tr align="left">   
                <td align="left" colspan="4"><h3><spring:message code="sireh.label.plaza.gestion.consultaLinea.tituloNomina"></spring:message></h3></td>        
            </tr>   
            <tr align="left">   
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.uniDescNom"></spring:message></td>
                <td align="left"><fsn:label path="uniDescNom"/></td>
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descPuestoNom"></spring:message></td>
                <td align="left"><fsn:label path="descPuestoNom"/></td>  
            </tr>
            <tr align="left">      
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idNivelPtoNom"></spring:message></td>
                <td align="left"><fsn:label path="idNivelPtoNom"/></td>        
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idRangoNom"></spring:message></td>
                <td align="left"><fsn:label path="idRangoNom"/></td>                
            </tr>        
            <tr align="left">   
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descEstadoNom"></spring:message></td>
                <td align="left"><fsn:label path="descEstadoNom"/></td>
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descMunicipioNom"></spring:message></td>
                <td align="left"><fsn:label path="descMunicipioNom"/></td>                  
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idZonaEcoNom"></spring:message></td>
                <td align="left"><fsn:label path="idZonaEcoNom"/></td>  
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idZonaDistNom"></spring:message></td>
                <td align="left"><fsn:label path="idZonaDistNom"/></td>                    
            </tr>        
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descNombramientoNom"></spring:message></td>
                <td align="left"><fsn:label path="descNombramientoNom"/></td>        
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.descJerarquiaNom"></spring:message></td>
                <td align="left"><fsn:label path="descJerarquiaNom"/></td>               
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.tabSueldoNom"></spring:message></td>
                <td align="left"><fsn:label path="sueldoNomLabel"/></td>                    
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.tabCompensacionNom"></spring:message></td>
                <td align="left"><fsn:label path="compensacionNomLabel"/></td>
            </tr>
            <tr align="left">   
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.importeHonorario"></spring:message></td>
                <td align="left"><fsn:label path="sueldoHonLabel"/></td>        
            </tr>
        </table>
    </c:set>
    
    
    <c:set var="content5">
        <table width="90%">
            <tr align="left">   
                <td align="left" colspan="2"><h3><spring:message code="sireh.label.plaza.gestion.consultaLinea.tituloEstructura"></spring:message></h3></td>        
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idInmueble"></spring:message></td>
                <td align="left"><fsn:label path="descInmueble"/></td> 
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.nombrePuesto"></spring:message></td>
                <td align="left"><fsn:label path="nombrePuesto"/></td> 
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idPtoEstrategico"></spring:message></td>
                <td align="left"><fsn:label path="idPtoEstrategico"/></td>
            </tr>
            <tr align="left">
                <td class="label"><spring:message code="sireh.label.plaza.gestion.consultaLinea.idNodo"></spring:message></td>
                <td align="left"><fsn:label path="idNodo"/></td> 
            </tr>
        </table>
    </c:set>
    
    
    <fsn:container section="init" type="tab" displayTime="3" tabHeight="30"/>
        <fsn:container name="divContent1" content="${content1}" title="Datos plaza" selected="true"/>
        <fsn:container name="divContent2" content="${content2}" title="Datos empleado" tabHeight="250"/>
        <fsn:container name="divContent3" content="${content3}" title="Datos presupuesto"/>
        <fsn:container name="divContent4" content="${content4}" title="Datos n&oacute;mina" tabHeight="200"/>
        <fsn:container name="divContent5" content="${content5}" title="Datos estructura"/>
    <fsn:container section="final"/>
    
    <table width="100%">
        <tr align="center">
            <td><fsn:submit value="submit.back" path="cancel" action="plazaGestion/${consultaLineaDTO.urlRegreso}.do"/></td>
        </tr>
    </table>
    
    <script type="text/javascript">        
        function currentTab(currentDiv) { }
    </script>
</html:form>