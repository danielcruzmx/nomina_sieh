<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="padronFonacDTO">
    <table width="100%" align="center" border="0">
        <tr><td><h1> <strong> <spring:message code="sireh.label.nomina.fonac.emisionChequesFonac.titulo"/></strong></h1></td></tr>
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.2em'><strong><spring:message code="sireh.label.nomina.fonac.cargaPadronParticipante.fieldSet"/></strong></legend>
                    <table>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.fonac.emisionChequesFonac.cicloEmision"/></td>
                            <td align="right">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="cicloEmisionFonac"
                                                path="cicloEmision"
                                                style="width:200px;"/>
                            </td>
                            <td align="left" class="label">* <spring:message code="sireh.label.nomina.fonac.emisionChequesFonac.cicloRemesa"/></td>
                            <td align="left"><fsn:input path="cicloRemesa" maxlength="15" size="30" onkeypress="return IsNumber(event);" /></td>
                            <td align="left" class="label">* <spring:message code="sireh.label.nomina.fonac.emisionChequesFonac.remesa"/></td>
                            <td align="left"><fsn:input path="remesa" maxlength="60" size="30" onkeypress="return IsNumber(event);" /></td>
                        </tr>
                    </table>
                    <table align="center">
                        <tr>
                            <td align="right" width="40%">
                                <fsn:submit progressIcon="false" value="submit.generate" path="aceptar" action="fonacNomina/emisionChequesFonac.do"/></td>
                            <td width="20%">&nbsp;</td>
                            <td align="left" width="40%">
                                <fsn:submit progressIcon="false" value="submit.clean" path="cancel" action="fonacNomina/emisionChequesFonac.do"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table width="100%" align="center" border="0">
         <tr><td colspan="4" align="left" ><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
    </table>    

    <script  type="text/javascript">
    var nav4 = window.Event ? true : false;
    function IsNumber(e){
        var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
       return ((tecla > 47 && tecla < 58) || tecla == 46);
    }
 </script>
</html:form>
