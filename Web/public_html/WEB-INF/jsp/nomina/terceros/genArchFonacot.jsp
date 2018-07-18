<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!--%@ taglib uri="http://displaytag.sf.net" prefix="display"%-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>


<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <h1>
                    <strong> 
                        <spring:message code="sireh.label.nomina.tercero.generarEntero.titulo"/>
                        <spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo.fonacot"/>
                    </strong>
                </h1>
            </td>   
        </tr>
        <tr> <td> </td> </tr>
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.1em'>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo5"/></strong>
                    </legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcOrdinaria.errores.ciclo"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="fonacotCiclo" path="ciclo" progress="false"/>
                            </td>
                            <td class="label">* <spring:message code="sireh.label.clc.proceso.clcTerceros.mes"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="fonacotMes" path="mes" progress="false"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
            <td></td>
        </tr>
        <tr>
        <td>
        <table width="100%" align="center" border="0">
            <tr>
                <td align="right" width="45%">
                    <fsn:submit value="submit.generar.archivo.fonacot" action="tercerosNomina/generarArchivoFonacot.do"  progressIcon="false"/>
                </td>
                <td width="10%">
                    <fsn:submit value="submit.valida.archivo.fonacot" action="tercerosNomina/validarArchivoFonacot.do"  progressIcon="false"/>
                </td>
                <td align="left" width="45%">
                    <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/fonacot.do"  progressIcon="false"/>
                </td>
            </tr>
        </table>
  
     </td> </tr>
    </table>
</html:form>
