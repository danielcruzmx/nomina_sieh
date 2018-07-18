<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="benefSicopDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.gestionbenef.path.header"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.gestionbenef.path.header1"/></strong></legend>
                    <table align="center" width="75%">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.descrip"/></td>
                            <td align="left" colspan="3"><fsn:label path="descBeneSicop"/></td>
                        </tr
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.bsCtaBancaria"/></td>
                            <td align="left"><fsn:label path="bsCtaBancaria"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.bsLeyenda"/></td>
                            <td align="left"><fsn:label path="bsLeyenda"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.llave"/></td>
                            <td align="left"><fsn:label path="idBeneSicop"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.fechamod"/></td>
                            <td align="left"><fsn:label path="fecModifico"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.origen"/></td>
                            <td align="left"><fsn:label path="bsOrigenPpto"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.rfc"/></td>
                            <td align="left"><fsn:label path="bsRfc"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.ref1"/></td>
                            <td align="left"><fsn:label path="bsRef1"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.ref2"/></td>
                            <td align="left"><fsn:label path="bsRef2"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.opera"/></td>
                            <td align="left"><fsn:label path="bsTipoOper"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.moneda"/></td>
                            <td align="left"><fsn:label path="bsTipoMoneda"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.eroga"/></td>
                            <td align="left"><fsn:label path="bsTipoErog"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.bsTipoPago"/></td>
                            <td align="left"><fsn:label path="bsTipoPago"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.usuario"/></td>
                            <td align="left"><fsn:label path="usuario"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.gestionbenef.tiponom"/></td>
                            <td align="left" colspan="3">
                                <fsn:selectList beanName="tcTipoNominaBeneficiarios" 
                                                path="tipoNomina" 
                                                progress="true"
                                                style="width: 400px; height:150px"
                                                multiple="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td colspan="4" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
    </table>
    <table align="center">
        <tr>
            <td colspan="4">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <fsn:submit value="submit.accept" action="clcInterfazSICOP/updateBeneficiario.do"/>  
            </td>
            <td colspan="2" align="left">
                <fsn:submit value="submit.cancel" path="cancel" action="clcInterfazSICOP/gestionBeneficiarios.do"/>
            </td>
        </tr>
    </table>
</html:form>
