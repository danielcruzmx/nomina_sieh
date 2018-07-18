<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reporteNotasDeMeritoDTO">
    <h1>
        <strong>
    <spring:message code="sireh.label.merito.reportes.titulo.link"/> &#45;
    <spring:message code="sireh.label.merito.reportes.seccion.titulo.link"/> &#45; 
   <spring:message code="sireh.label.merito.reportes.remesa.detalle.titulo.link"/>
            </strong>
    </h1>

    <html:hidden path="uniCicloRequired"/>
     <html:hidden path="remesaRequired"/>
      <html:hidden path="remesa2Required"/>

<p>&nbsp;</p>
<div align="center">
 <table width="50%">
            <tr>
                <td align="right" class="label">* Ciclo</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadCicloReportes"  path="uniCiclo"/>
                </td>
            </tr>    
             <tr>
                <td align="right" class="label">* Remesa</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tdNMResumenRemesa"  path="remesa" progress="true"  parentPath="uniCiclo"/>
                </td>
            </tr>
             <tr>
                <td align="right" class="label">* Remesa Interna</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tdNMResumenRemesaInterna"  path="remesa2"  progress="true"  parentPath="uniCiclo"/>
                </td>
            </tr>
          
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteNotasMerito/repPagosSoliRemesa.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteNotasMerito/repPagosSoliRemesa.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
           <c:if test="${ (reporteNotasDeMeritoDTO.uniCiclo!='0') &&  (reporteNotasDeMeritoDTO.remesa!='0')  &&  (reporteNotasDeMeritoDTO.remesa2!='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_CICLO" value="${reporteNotasDeMeritoDTO.uniCiclo}"/>
                        <fsn:reportParam name="PAR_REMESA" value="${reporteNotasDeMeritoDTO.remesa}"/>
                            <fsn:reportParam name="PAR_REMESA2" value="${reporteNotasDeMeritoDTO.remesa2}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/merito/repPagosSoliRemesa" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="repPagosSoliRemesa" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
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