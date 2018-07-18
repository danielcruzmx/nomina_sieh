<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form modelAttribute="pagoMeritoDTO" method="post">
<h1><spring:message code="sireh.label.merito.generacion.archivo.pago.titulo"/></h1>
    <p>&nbsp;</p> 
    
    <table align="center" width="70%" border="0">
        <tr>
            <td align="center">
                <fieldset>
                    <legend>
                        <strong><spring:message text=" Notas "/></strong>
                        <img class="fotografia" width="55" src="<spring:theme code="pesos.jpg"/>" align="middle"/>       
                        <strong><spring:message text=" de M&eacute;rito "/></strong>
                    </legend>
    
    
                     <table width="90%" align="center" border="0">
                        <tr><td colspan="2">&nbsp;</td></tr>
                        <tr>
                            <td class="label"> * <spring:message code="sireh.label.merito.generacion.archivo.pago.ciclo"></spring:message></td>
                            <td align="left"><html:select path="tdNmhCiclo">
                                    <html:option value="" label="${nonValue}"/>
                                    <html:options items="${pagoMeritoDTO.cicloValores}" itemValue="clave" itemLabel="valor"/>
                                </html:select>
                            </td>
                          </tr>
                              <tr>
                            <td class="label"> * <spring:message code="sireh.label.merito.generacion.archivo.pago.causal"></spring:message></td>
                            <td align="left"><fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcCausalMeritoSinEval" path="tdNmhCveCausal" />
                            </td>
                        </tr>
                              <tr>
                            <td class="label"> * <spring:message code="sireh.label.merito.generacion.archivo.pago.remesa"></spring:message></td>
                            <td align="left"><fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcRemesaEmpenoPorCicloYCausal" path="tdNmhOp"  progress="true"  parentPath="tdNmhCiclo" filterPaths="tdNmhCveCausal" /></td>
                         </tr>
                          <tr>
                            <td align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                            <td align="center"><fsn:submit value="submit.accept" action="notaDeMerito/${pagoMeritoDTO.urlDestino}"  progressBar="true"/></td>
                        </tr>
                        <tr><td colspan="2">&nbsp;</td></tr>
                    </table>
                    
                
                </fieldset>
            </td>
        </tr>
    </table>
    
</html:form>