<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="padronFonacDTO" enctype="multipart/form-data">
    <html:hidden path="numRegistros" id="numRegistros"/>

    <table width="100%" align="center" border="0">
        <tr><td><h1> <strong> <spring:message code="sireh.label.nomina.fonac.cargaPadronParticipante.titulo"/></strong></h1></td></tr>
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.2em'><strong><spring:message code="sireh.label.nomina.fonac.cargaPadronParticipante.fieldSet"/></strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr><td colspan="7">&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.fonac.cargaPadronParticipante.periodo"/></td>
                            <td align="right"><html:radiobutton value="O" path="periodo" label=" Ordinario"/></td>
                            <td align="left"><html:radiobutton value="E" path="periodo" label=" Extraordinario"/></td>
                            <td align="left" class="label">* <spring:message code="sireh.label.nomina.fonac.cargaPadronParticipante.importe"/></td>
                            <td align="left"><fsn:input path="importe" uppercase="true" maxlength="15" size="30" onkeypress="return IsNumber(event);" /></td>
                            <td align="left" class="label">* <spring:message code="sireh.label.nomina.fonac.cargaPadronParticipante.referencia"/></td>
                            <td align="left"><fsn:input path="referencia" uppercase="true" maxlength="60" size="30"/></td>
                        </tr>
                        <tr><td colspan="7">&nbsp;</td></tr>
                    </table>
                    <table width="100%" align="center" border="0">
                        <tr align="center">
                            <td>
                                        <fsn:submit value="submit.procesar" 
                                                    path="procesar"
                                                    action="fonacNomina/cargaPadronFonac.do"/>
                                    
                                            &nbsp;
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="fonacNomina/cargaPadronFonac.do"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr><td colspan="3" align="left"><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
    </table>
    <script  type="text/javascript">
        var nav4 = window.Event ? true : false;
        
        function IsNumber(e){
            var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
           return ((tecla > 47 && tecla < 58) || tecla == 46);
        }
        
        $j(document).ready(function(){
            var numRegistros = <c:out value="${padronFonacDTO.numRegistros}"/>
            var mesaje = 'Hay registros cargados se daran de baja, Desea continuar ?';
            var captura = <c:out value="${padronFonacDTO.numRegistros}"/>
            var rb = 'X';
            
            $j('#10001').click(function(){
                rb = $j('input:radio[name=periodo]:checked').val();
                if($j('#importe').val() != '' && $j('#referencia').val() != '' && $j('input[name="periodo"]').is(':checked') && rb.toUpperCase() == 'O' && captura != 0){
                    var r = window.confirm(mesaje);
                    $j('#procesar').val(r);
                }
            });
        });
        
    </script>
</html:form>
