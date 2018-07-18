<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form modelAttribute="procesoNmDTO" method="post" enctype="multipart/form-data">
<h1><spring:message code="sireh.proceso.nm.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="70%" border="0">
        <tr>
            <td align="center">
                <fieldset>
                    <legend>
                        <strong><spring:message text="Notas "/></strong>
                        <img class="fotografia" width="55" src="<spring:theme code="disco.jpg"/>" align="middle"/>       
                        <strong><spring:message text=" M&eacute;rito"/></strong>
                    </legend>
                    <table width="80%" border="0">
                        <tr>    
                            <td class="label"> * <spring:message code="sireh.proceso.nm.titulo"></spring:message></td>
                            <td align="left"><html:select path="tdNmrCiclo">
                                    <html:option value="" label="${nonValue}"/>
                                    <html:options items="${procesoNmDTO.cicloValores}" itemValue="clave" itemLabel="valor"/>
                                </html:select>
                            </td>
                          </tr>
                          <tr>
                            <td class="label"> * <spring:message code="sireh.proceso.nm.causal"></spring:message></td>
                            <td align="left"><fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcCausalMeritoSinEval" path="tdNmrCveCausal" />
                            </td>
                        </tr>          
                        <tr>
                            <td class="label"> * <spring:message code="sireh.proceso.nm.remesa"></spring:message></td>
                            <td align="left"><fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcRemesaEmpenoPorCicloYCausalCompleto" path="tdNmrOp"  progress="true"  parentPath="tdNmrCveCausal" filterPaths="tdNmrCiclo" /></td>
                         </tr>
                          <tr>
                            <td align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                            <td align="center"><fsn:submit value="submit.accept" action="notaDeMerito/${procesoNmDTO.urlDestino}"  progressBar="true"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
</html:form>