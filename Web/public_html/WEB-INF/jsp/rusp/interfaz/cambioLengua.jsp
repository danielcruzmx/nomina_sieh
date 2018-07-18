<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="datosBasicos1DTO">
    <html:hidden path="rfcEmpleado"/>
    <html:hidden path="rfcUnico"/>
    <h1><spring:message code="sireh.label.rusp.movimiento.cambioLengua.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="75%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.lengua.header"/></strong></legend>
                    <table align="center" width="100%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label"> <spring:message code="sireh.label.rusp.movimiento.datosBasicosDTO.lengua"/></td>
                            <td align="left"><fsn:option key="0" value="selectList.nonValue"/>
                                             <fsn:selectList beanName="listaLengua" path="lengua"/></td>
                            <td align="right" class="label"> <spring:message code="sireh.label.rusp.movimiento.datosBasicosDTO.tipo"/></td>
                            <td align="left"><html:select path="tipo" cssClass="uppercase">
                                                <html:option value="" label="SELECCIONE"/>
                                                <html:option value="0" label="Materna"/>
                                                <html:option value="1" label="Aprendida"/>
                                             </html:select>
                            </td>
                       </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>

    <table align="center" width="50%">    
        <tr>
            <td align="center">
                <fsn:submit value="submit.accept" path="grabalengua1" action="gestionRusp/updateLengua.do"/>
            </td>
            <td align="center">
                <fsn:submit value="submit.cancel" path="canlengua1" action="gestionRusp/cancelar.do"/>
            </td>
        </tr>
    </table>
</html:form>
