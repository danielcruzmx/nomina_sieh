<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form modelAttribute="meritoManualDTO">
    <h1><spring:message code="sireh.label.merito.archivoManual.titulo"/></h1>
    <html:hidden path="manual" />
    <p>&nbsp;</p>

    <table align="center" width="70%" border="0">
        <tr>
            <td align="center">
                <fieldset>
                    <legend style="font-size:1.2em">
                        <strong><spring:message text="Notas de Merito"/></strong>
                        <img class="fotografia" width="60" src="<spring:theme code="pluma.jpg"/>" align="middle"/>       
                        <strong><spring:message text="Manualmente"/></strong>
                    </legend>

                    <table width="90%">
                        <tr align="left">
                            <td class="label"> * <spring:message code="sireh.label.merito.archivoManual.rfc"></spring:message></td>
                            <td><fsn:input path="tdNmhRfcUnico" maxlength="13"/></td>
                         </tr>
                       <tr>
                            <td class="label"> * <spring:message code="sireh.label.merito.archivoManual.ciclo"></spring:message></td>
                            <td align="left">
                                <html:select path="tdNmhCiclo">
                                    <html:option value="" label="${nonValue}"/>
                                    <html:options items="${meritoManualDTO.cicloValores}" itemValue="clave" itemLabel="valor"/>
                                </html:select></td>
                        </tr>         
                         <tr align="left">
                            <td class="label"> * <spring:message code="sireh.label.merito.archivoManual.quincenaValidacion"></spring:message></td>
                            <td align="left"> <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcQuincenaValidacion" path="hpQnaPago"  progress="true" parentPath="tdNmhCiclo"/>
                            </td>
                            <td><fsn:submit path="enviar" value="submit.accept" action="notaDeMerito/${meritoManualDTO.urlDestino}"/></td>
                        </tr>
                        <tr>
                            <td align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                        </tr>
                         <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <script type="text/javascript">
        $j(document).ready(function(){
            $j("#10001").attr('disabled','true');
            
            $j('#tdNmhRfcUnico').blur(function(){
                if($j('#tdNmhRfcUnico').val().match(/[a-zA-Z]{4}[0-9]{6}[A-Z0-9]{3}/)){
                    $j('#10001').removeAttr('disabled');
                } 
                else { 
                    alert('El rfc no tiene el formato correcto: [a-zA-Z]{4}[0-9]{6}[A-Z0-9]{3}');
                    $j('#tdNmhRfcUnico').focus();
                }
            });
            
        });
    </script>
</html:form>