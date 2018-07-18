<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<c:set var="context" value="<%=request.getContextPath()%>"/>

<html:form modelAttribute="ruspDTO">
    <html:hidden path="numRegistros" id="numRegistros"/>
    <html:hidden path="procesar" id="procesar"/>
    
    <h1><strong>
            <spring:message code="gestion.rusp"/> &#45;
            <spring:message code="gestion.proceso"/> &#45; 
            <spring:message code="gestion.informacionBasicaRusp"/>
    </strong></h1>

    <table width="100%" align="center" border="0">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Parametros de consulta&nbsp;&nbsp; </strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr> <td colspan="2">&nbsp;</td> </tr>
                        <tr> 
                            <td align="right" class="label" width="20%">* Ciclo</td>
                            <td align="left" colspan="2">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadCicloReportes"
                                                path="ciclo"
                                                style="width: 150px;"/>
                            </td>
                        </tr>
                        <tr> 
                            <td align="right" class="label" width="20%">* Quincena</td>
                            <td align="left" colspan="2">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaQuincenasCicloPBajas"  
                                                path="quincena"
                                                parentPath="ciclo"
                                                onchange="geNumRegs();"
                                                progress="true"
                                                style="width: 150px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* Email</td>
                            <td align="left"><html:input path="email" maxlength="60" size="37" id="email"/></td>
                        </tr>
                        <tr>
                            <td align="rigth" class="label">* Escenario</td>
                            <td align="left"> <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="ruspInformacionBasica-escenario"
                                                onchange="geNumRegs();"
                                                path="escenario"
                                                style="width: 150px;"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td align="center">
                <table align="center" width="100%" border="0">
                    <tr>
                        <td align="left" width="45%">
                            <spring:message code="sireh.form.required.fields"/>
                        </td>
                        <td align="right" width="30%">
                            <fsn:submit value="submit.search" path="muestraNominas" action="gestionRusp/pInformacionBasica.do"/>
                            <fsn:submit value="submit.clean" path="limpiar" action="gestionRusp/pInformacionBasica.do"/>
                            <c:if test="${ruspDTO.muestraNominas}">
                                <fsn:submit value="submit.generate" path="generaArchivo" action="gestionRusp/pInformacionBasica.do"/>
                            </c:if>
                        </td>
                        <td >&nbsp;</td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <c:if test="${ruspDTO.muestraNominas}">
        <fsn:filter property="h.hp_qna_pago" condition="=" path="quincena"/>
        <fsn:filter property="h1.hp_qna_pago" condition="=" path="quincenaAnterior"/>
                
        <fsn:pagedList beanName="${ruspDTO.beanlista}"
                       baseUrl="tercerosNomina/pInformacionBasica.do"
                       checkbox="true" 
                       chkProperty="seleccionConsecNomina" 
                       appendFilters="false">
                       
            <display:table name="${ruspDTO.beanlista}"
                           form="checkBoxTest"
                           class="displaytag"
                           pagesize="10"
                           export="true"
                           id="row"
                           requestURI="${requestURI}"
                           sort="list"
                           decorator="checkboxTableDecorator">
               <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.selecciona"
                               style="text-align: center"
                               property="checkbox"
                               media="html"/>
                <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.quincenaPago"
                                property="qnaPago"
                                sortable="false"/>
                <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.tipoNomina"
                                property="tipoNomina"
                                sortable="false"/>
                <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.consecutivoNomina"
                                property="consecNomina" 
                                sortable="false"/>
                <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.complemento"
                                property="numComplem"
                                sortable="false"/>
                <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.grupoPago"
                                property="gpoPago"
                                sortable="false"/>
                <display:setProperty name="paging.banner.placement" value="bottom"/>
                <display:setProperty name="export.pdf" value="true"/>
                <display:setProperty name="basic.msg.empty_list">
                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                </display:setProperty>
            </display:table>
        </fsn:pagedList>
    </c:if>
    
    <script  type="text/javascript">
        $j(document).ready(function(){
            $j("#email").blur(function(){
                // Expresion regular para validar el correo
                var regex = /[\w-\.]{2,}@([\w-]{2,}\.)*([\w-]{2,}\.)[\w-]{2,4}/;
                
                // Se utiliza la funcion test() nativa de JavaScript
                if (!regex.test($j('#email').val())) {
                    alert('La direccion de correo electronico no es valida');
                    $j('#email').val('');
                }
            });
        });
        
        $j(document).ready(function(){
            $j('#10003').click(function(){
                if($j('#ciclo').val() != '0' && $j('#quincena').val() != '0'){
                    //http://www.etnassoft.com/2010/12/28/cadenas-de-escape-como-poner-tildes-en-javascript/
                    var mesaje = $j('#numRegistros').val() + '  registros seran afectados en este proceso, \u00BF Desea continuar ?';
                    var r = window.confirm(mesaje);
                    $j('#generaArchivo').val(r);
                }
            });
        });
        
        function geNumRegs(){
            var qna = $j('#quincena').val();
            if($j('#ciclo').val() != '0' && $j('#quincena').val() != '0'){
                $j.ajax({
                    url: 'geNumRegsInfoBasicCallback.do',
                    type: 'GET',
                    data: 'qna=' + qna,
                    //async: false,
                    success: function(data) {
                        $j('#numRegistros').val(data);
                    }
                });
            }
        }
    </script>
    
 </html:form>
