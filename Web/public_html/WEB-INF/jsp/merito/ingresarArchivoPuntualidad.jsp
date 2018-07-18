<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form modelAttribute="notaDeMeritoDTO" method="post" enctype="multipart/form-data">
<h1><spring:message code="sireh.label.merito.archivoPuntualidad.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="70%" border="0">
        <tr>
            <td align="center">
                <fieldset>
                    <legend>
                        <strong><spring:message text="Notas de Merito"/></strong>
                        <img class="fotografia" width="55" src="<spring:theme code="acierto.jpg"/>" align="middle"/>       
                        <strong><spring:message text="Puntualidad"/></strong>
                    </legend>
                    <table width="90%" align="center" border="0">
                        <tr align="left">
                            <td class="label"> * <spring:message code="sireh.label.merito.numeroDocumento"></spring:message></td>
                            <td colspan="2" align="left"><fsn:input path="tdNmhNumDocto" maxlength="12" size="15"/></td>
                        </tr>
                        <tr>    
                            <td class="label"> * <spring:message code="sireh.label.merito.ciclo"></spring:message></td>
                            <td colspan="2" align="left"><html:select path="tdNmhCiclo">
                                    <html:option value="" label="${nonValue}"/>
                                    <html:options items="${notaDeMeritoDTO.cicloValores}" itemValue="clave" itemLabel="valor"/>
                                </html:select>
                            </td>
                          </tr>
                              <tr>
                            <td class="label"> * <spring:message code="sireh.label.merito.remesa"></spring:message></td>
                            <td colspan="2" align="left"><fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcMaxRemesaPuntualidadPorCiclo" path="tdNmhOp"  progress="true" parentPath="tdNmhCiclo"  /></td>
                         </tr>
                        <tr>   
                            <td class="label"> * <spring:message code="sireh.label.merito.quincenaValidacion"></spring:message></td>
                            <td colspan="2" align="left"><fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcQuincenaValidacion" path="hpQnaPago"  progress="true" parentPath="tdNmhCiclo"  />
                            </td>            
                        </tr>
                         <tr>   
                            <td class="label" width="30%"> * <spring:message code="sireh.label.merito.archivoAProcesar"></spring:message></td>
                            <td width="35%" align="left">
                                <input type="file" name="file" id="file" />
                            </td>
                            <td align="center" width="35%"><fsn:submit value="submit.upload" action="notaDeMerito/${notaDeMeritoDTO.urlDestino}" progressBar="true"/></td>
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
    
 
    
    <html:hidden path="tdNmhCveCausal" />
</html:form>