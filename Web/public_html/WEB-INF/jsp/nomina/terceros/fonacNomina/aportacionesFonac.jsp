<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="padronFonacDTO">
    <h1>
        <strong>
            <spring:message code="sireh.label.nomina.fonac.consultas.aportaciones.titulo"/>
       </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
            <tr>
                <td  align="right" class="label"> <spring:message code="sireh.label.reportes.rfc"></spring:message></td>
                <td align="left">
                    <fsn:helpRoutine path="rfcUnico"
                                     maxlength="16"
                                     size="16" 
                                     disabled="false" 
                                     beanName="empleadosDetalleHistorico"
                                     width="1000" 
                                     height="400"  
                                     fieldMapping="rfcUnico" 
                                     title="Seleccione el RFC" 
                                     maxRows="100"
                                     leftPosition="17"
                                     topPosition="20"/>
                </td>
            </tr>    
             <tr>
                <td align="right" class="label"> <spring:message code="sireh.label.reportes.qnaIni"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="terceros-fonac-qna-inicial"
                                        path="qnaInicio"/>
                </td>
            </tr>
             <tr>
                <td align="right" class="label"> <spring:message code="sireh.label.reportes.qnaFin"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="terceros-fonac-qna-final"
                                        path="qnaFinal"
                                        progress="true"
                                        parentPath="qnaInicio"/>

                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.fonac.consultas.aportaciones.participante"></spring:message></td>
                <td align="left">
                    <html:select path="registro" cssClass="uppercase">
                        <html:option value="" label="seleccione"/>
                        <html:option value="0" label="Ordinario Ciclo Anterior"/>
                        <html:option value="1" label="Extraordinario"/>
                        <html:option value="2" label="Ordinario Ciclo Actual"/>
                    </html:select>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.nomina.fonac.consultas.aportaciones.contratacion"></spring:message></td>
                <td align="left">
                    <html:select path="tipo" cssClass="uppercase">
                        <html:option value="" label="seleccione"/>
                        <html:option value="B" label="Base"/>
                        <html:option value="C" label="Confianza"/>
                    </html:select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                progressIcon="false"
                                action="fonacNomina/aportacionesFonac.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                progressIcon="false"
                                action="fonacNomina/aportacionesFonac.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
</div>
<p>&nbsp;</p>
<div align="center">
  
</div>
<p>&nbsp;</p>
<div align="center">
  
</div>
<p>&nbsp;</p>
<div align="center">
  
</div>
</html:form>