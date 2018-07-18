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
            <spring:message code="gestion.datosPersonalesRusp"/>
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
                                <fsn:selectList beanName="ruspDatosPersonales-nominas"  
                                                path="quincena"
                                                onchange="geNumRegs();"
                                                progress="true"
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
                        <td align="left" width="20%"><spring:message code="sireh.form.required.fields"/></td>
                        <td align="right" width="30%"><fsn:submit value="submit.accept" path="muestraReporte" action="gestionRusp/pDatosPersonales.do"/></td>
                        <td width="5%">&nbsp;</td>
                        <td align="left" ><fsn:submit value="submit.clean" path="limpiar" action="gestionRusp/pDatosPersonales.do"/></td>
                        <td >&nbsp;</td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script  type="text/javascript">
        $j(document).ready(function(){
            $j('#10001').click(function(){
                if($j('#ciclo').val() != '0' && $j('#quincena').val() != '0'){
                    //http://www.etnassoft.com/2010/12/28/cadenas-de-escape-como-poner-tildes-en-javascript/
                    var mesaje = $j('#numRegistros').val() + '  registros seran afectados en este proceso, \u00BF Desea continuar ?';
                    var r = window.confirm(mesaje);
                    $j('#procesar').val(r);
                }
            });
        });
        
        function geNumRegs(){
            var qna = $j('#quincena').val();
            if($j('#ciclo').val() != '0' && $j('#quincena').val() != '0'){
                $j.ajax({
                    url: 'geNumRegsDatosPerCallback.do',
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
