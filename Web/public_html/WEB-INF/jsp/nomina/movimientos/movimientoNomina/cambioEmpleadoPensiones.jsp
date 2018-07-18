<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<html:form name="checkBoxTest" modelAttribute="cambioEmpleadoPensionesDTO" action="getPensiones.do">
    <h1><spring:message code="sireh.label.nomina.movimiento.cambioEmpleadoPensiones.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="55%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.pensionDTO.datosEmpleado"/></strong></legend>
                    <table align="center" width="100%">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioEmpleadoPensiones.rfcEmpleado"/></td>
                            <td align="left"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${cambioEmpleadoPensionesDTO.rfcEmpleado}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioEmpleadoPensiones.primerApellido"/></td>
                            <td align="left"><fsn:label path="primerApellido"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioEmpleadoPensiones.segundoApellido"/></td>
                            <td align="left"><fsn:label path="segundoApellido"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioEmpleadoPensiones.nombreEmpleado"/></td>
                            <td align="left"><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <p>&nbsp;</p>
    <table align="center" width="55%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.cambioEmpleadoPensiones.pensionesAsignadas.header"/></strong></legend>
                    <c:set var="paramsDetalle" value="rfcEmpleado=${cambioEmpleadoPensionesDTO.rfcEmpleado}&idPension"/>
                    <fsn:filter property="p.rfc_pension" condition="=" path="rfcEmpleado" />
                    <fsn:filter property="p.status_pension" condition="=" path="statusPension" />
                <fsn:pagedList beanName="pensionByRfcAndStatus" checkbox="true"  chkProperty="idPension"  baseUrl="getPensiones">
                    <display:table name="pensionByRfcAndStatus" form="checkBoxTest" class="displaytag" requestURI="${requestURI}" pagesize="10" decorator="checkboxTableDecorator"   export="false" id="row"  sort="list">
                        <display:column property="checkbox" media="html" titleKey="sireh.label.nomina.creaArchivoTerceros.selecciona"/>
                        <display:column href="getPension.do" paramId="${paramsDetalle}" paramProperty="idPension" sortable="true" property="beneficiariaPension"/>
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="false"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </fsn:pagedList>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="50%">
        <tr>
            <td colspan="4">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <fsn:submit value="submit.add" action="movimientoNomina/addPension.do" />
                <fsn:submit value="submit.cancel" path="cancel" action="movimientoNomina/gestionPension.do"/>
                
                    <fsn:submit value="submit.delete" action="movimientoNomina/deletePensiones.do" path="delete" alertCode="confirm.multiple.delete"/>
                
            </td>
        </tr>
    </table>

</html:form>