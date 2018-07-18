<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="generaHusDTO">
    
    <html:hidden path="rfcRequired"/>
    <html:hidden path="hojadRequired"/>
    <html:hidden path="hojahRequired"/>
    <html:hidden path="complementoRequired"/>
    <%-- Titulo --%> 
    <h1><spring:message code="sireh.label.expediente.hus.titulo.movtos"/> </h1>
    <p>&nbsp;</p>
 
    <div align="center">
        <table>
                 <tr>
                 <td  align="right" class="label"> * <spring:message code="sireh.label.expediente.hus.rfc"></spring:message></td>
                     <td align="left">
                     <fsn:helpRoutine path="rfcEmpleado"
                                      maxlength="16"
                                      size="16" 
                                      disabled="true" 
                                      beanName="EmpleadosHus"
                                      width="1000" 
                                      height="400"  
                                      fieldMapping="rfcEmpleado, primerApellido, segundoApellido, nombreEmpleado" 
                                      title="Seleccione el RFC" 
                                      maxRows="200"
                                      leftPosition="17"
                                      topPosition="20"/>
                    </td>
                </tr>
            <tr>
               <td  align="right" class="label"><spring:message code="sireh.label.expediente.hus.hojad"></spring:message></td>
               <td align="left"><fsn:input path="hojad" maxlength="5" size="6"  /></td>
            </tr>
            <tr>
               <td  align="right" class="label"><spring:message code="sireh.label.expediente.hus.hojah"></spring:message></td>
               <td align="left"><fsn:input path="hojah" maxlength="5" size="6"  /></td>
            </tr>
            <tr>
               <td  align="right" class="label"><spring:message code="sireh.label.expediente.hus.complemento"></spring:message></td>
               <td align="left"><fsn:input path="complemento" maxlength="5" size="6"  /></td>
            </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr> 
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="gestionExpediente/husDetalle.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="gestionExpediente/husDetalle.do"/>
                </td>
            </tr>
        </table>
        
        <c:if test="${ (generaHusDTO.rfcEmpleado ne null) && (generaHusDTO.hojad ne null) && (generaHusDTO.hojah ne null) && (generaHusDTO.complemento ne null) }">
                        <fsn:reportParam name="RFC" value="${generaHusDTO.rfcEmpleado}"/>
                        <fsn:reportParam name="HOJAH" value="${generaHusDTO.hojah}"/>
                        <fsn:reportParam name="HOJADESDE" value="${generaHusDTO.hojad}"/>
                        <fsn:reportParam name="FOLIO" value="${generaHusDTO.complemento}"/>
                        
                        <fsn:report provider="jasper" 
                                    viewUri="/hojasUnicas/husmovtos" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="husmovtos" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
        </c:if>
    </div> 
</html:form>
