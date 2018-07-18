<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form name="checkBoxTest" modelAttribute="consultaNominaDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.nomina.gestion.acumuladoCPD.titulo"/></h1>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.1em'>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo3"/></strong>
                    </legend>
                        <table width="100%" align="center" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tnNominaQuincena" path="quincena" style="width: 200px;"/>
                            </td>
                        </tr>
                    </table>
                    <table width="100%" border="0">
                        <tr align="center">
                            <td width="45%" align="right">
                                <fsn:submit value="submit.search" 
                                    path="muestraRegistros" progressBar="true"
                                    action="gestionNomina/${consultaNominaDTO.urlOrigen}"/>
                            </td>
                            <td width="10%">&nbsp;</td>
                            <td width="45%" align="left">
                                <fsn:submit value="submit.clean" 
                                    path="cancel" progressBar="true"
                                    action="gestionNomina/${consultaNominaDTO.urlOrigen}"/>
                                    
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <c:if test="${consultaNominaDTO.muestraRegistros}"> 
        <fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition="=" path="quincena" />
        
        <fsn:pagedList beanName="${consultaNominaDTO.beanName}" 
                       checkbox="true"
                       chkProperty="idGrupo"
                       baseUrl="${consultaNominaDTO.urlOrigen}" 
                       maxRows="200"
                       appendFilters="false">
            <div id="displayTagDiv">        
                <display:table name="${consultaNominaDTO.beanName}" 
                               class="displaytag" 
                               pagesize="15"
                               decorator="checkboxTableDecorator"
                               export="true" 
                               id="row" 
                               requestURI="${requestURI}"
                               sort="list">
                               
                    <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.selecciona"
                                    style="text-align: center">
                        <html:radiobutton path="hpConsecNomina" id="radioBoton"  value="${row.idQna}" onclick="submitSpAcumuladoConcentrado(document.forms[0].radioBoton); "/>
                    </display:column>
                               
                    <display:column property="qnaCaptura"
                                    style="text-align: center;" 
                                    titleKey="sireh.label.nomina.gestion.consulta.parametros.qnaCaptura"
                                    sortable="true">
                    </display:column>
                    
                    <display:column property="numComplem" 
                                    style="text-align: center;"
                                    titleKey="sireh.label.nomina.gestion.consulta.parametros.numComplem"
                                    sortable="true"/>
                    <display:column property="descripcion" 
                                    style="text-align: center;"
                                    titleKey="sireh.label.nomina.gestion.consulta.parametros.desc"
                                    sortable="true"/>
                    <display:column property="tipoNomina" 
                                    style="text-align: center;"
                                    titleKey="sireh.label.nomina.gestion.consulta.parametros.tipoNomina"
                                    sortable="true"/>
                    <display:column property="grupoPago" 
                                    style="text-align: center;"
                                    titleKey="sireh.label.nomina.gestion.consulta.parametros.grupoPago"
                                    sortable="true"/>
                    <display:column property="descEstadoNom" 
                                    style="text-align: center;"
                                    titleKey="sireh.label.nomina.gestion.consulta.parametros.status"
                                    sortable="true"/>
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="export.pdf" value="true"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                    </display:setProperty>
                </display:table>
            </div>
        </fsn:pagedList>
    </c:if>
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        function submitSpAcumuladoConcentrado(ctrl){
            for(i=0;i<ctrl.length;i++){
                if(ctrl[i].checked){
                    idNomina = ctrl[i].value;
                }
            }
            document.forms[0].action="/sireh/gestionNomina/processAcumuConcentrPercepcDeduc.do?idQna=" + idNomina;
            document.forms[0].submit();
        }
    </script>
    
</html:form>