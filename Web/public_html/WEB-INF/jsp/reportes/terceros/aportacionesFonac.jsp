<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:message code="sireh.label.reportes.sin.pension" var="sinPension"/>
<spring:message code="sireh.label.reportes.con.pension" var="conPension"/>

<html:form modelAttribute="reportesTercerosDTO">
    <html:hidden path="UniCicloRequired"/>
    <html:hidden path="idUnidadRequired"/>
    <html:hidden path="qnaCapturaRequired"/>

    <h1>
        <strong>
            <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.terceros.reportes.fonacaportaciones.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <div align="center">
        <table>
             <tr>
                <td align="right" class="label">* Quincena</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaSoloQnasHistoricoFinal"  path="uniCiclo" uppercase="false"/>
    
                </td>
            </tr>
            <tr>
                <td  align="right" class="label"><spring:message code="sireh.label.reportes.complemento"></spring:message></td>
                <td align="left"><fsn:input path="complemento" maxlength="5" size="6"  /></td>
            </tr>            
             <tr align="left">
                 <td align="right" class="label"><spring:message code="sireh.label.reportes.tipoLiquidacion"></spring:message></td>
                     <td align="left">
                         <html:radiobutton value="O" path="tipoNom" label="Fin de ciclo"/>
                         <html:radiobutton value="E" path="tipoNom" label="Anticipada"/>
                     </td>
                 </tr>            
                 <tr>
                    <td align="right" class="label"><spring:message code="sireh.label.reportes.unidad.notrequired"></spring:message></td>
                    <td align="left">
                        <fsn:option key="0" value="selectList.nonValue"/>
                        <fsn:selectList beanName="tcUnidadSinCiclo" 
                                    path="idUnidad"
                                    uppercase="false"/>
                    </td>
                </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.pension"></spring:message></td>
                <td align="left">
                    <html:select path="tipoPension"
                                 cssClass="uppercase">
                        <html:option value="0" label="${sinPension}"/>
                        <html:option value="1" label="${conPension}"/>
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
                                action="reporteTercerosNomina/aportacionesFonac.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteTercerosNomina/aportacionesFonac.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr> 
        </table>
               <c:if test="${reportesTercerosDTO.uniCiclo ne '0' and not empty reportesTercerosDTO.uniCiclo}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="P_CICLO" value="${reportesTercerosDTO.uniCiclo}"/>
                        <fsn:reportParam name="P_ESTATUS" value="${reportesTercerosDTO.tipoNom}"/>
                        <fsn:reportParam name="P_UNIDAD" value="${reportesTercerosDTO.unidades}"/>
                        <fsn:reportParam name="P_NUM_PENSION" value="${reportesTercerosDTO.tipoPension}"/>
                        <fsn:reportParam name="P_COMPLE" value="${reportesTercerosDTO.complemento}"/>
                        
                        <c:if test="${reportesTercerosDTO.tipoPension eq '0'}">
                            <fsn:reportParam name="P_TIPO_PENSION" value="="/>
                        </c:if>
                        <c:if test="${reportesTercerosDTO.tipoPension eq '1'}">
                            <fsn:reportParam name="P_TIPO_PENSION" value=">="/>
                        </c:if>

                        <c:if test="${reportesTercerosDTO.tipoNom eq 'O'}">
                            <fsn:report provider="jasper" 
                                        viewUri="/terceros/edoctafonac" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="edoctafonac" 
                                        export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                        width="1060" 
                                        height="350"/>
                        </c:if>
                        <c:if test="${reportesTercerosDTO.tipoNom eq 'E'}">
                            <fsn:report provider="jasper" 
                                        viewUri="/terceros/edoctafonacdinsin" 
                                        imagesUri="/images/reports" 
                                        format="pdf" 
                                        fileName="edoctafonac" 
                                        export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                        width="1060" 
                                        height="350"/>
                        </c:if>
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