<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesTercerosDTO">
    <h1>
        <strong>
            <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45;
            <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45;
            <spring:message code="sireh.label.terceros.reportes.cifrasControlF.detalle.titulo.link"/>
        </strong>
    </h1>
    
    <html:hidden path="uniCicloRequired"/>
    <html:hidden path="qnaCapturaRequired"/>
    <html:hidden path="tipoNominaRequired"/>
    <html:hidden path="complementoRequired"/>
    
    <p>&nbsp;</p>
    <div align="center">
        <table>
<!--            <tr>
                <td align="right" class="label">* Ciclo</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadCicloReportes"  path="uniCiclo"/>
                </td>
            </tr>
            <tr align="left">
                <td class="label">
                    (*)
                    <spring:message code="sireh.label.nomina.gestion.label.numQuincena"></spring:message>
                </td>
                <td>
                    <fsn:input path="qnaCaptura" maxlength="12" size="15"/>
                </td>
            </tr>  -->
            <tr>
                <td align="right" class="label">* Quincena</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaCaptura" progress="true" />
                </td>
            </tr>       
            <tr align="left">
                <td class="label">
                    (*) Tipo Nomina
                </td>
                <td>
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcTipoNominaReportes"  path="tipoNomina"/>
                </td>
            </tr>
            <tr align="left">
                <td class="label">
                    (*) Complemento
                </td>
                <td>
                    <fsn:input path="complemento" maxlength="12" size="15"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <table width="100%">
                        <tr>
                            <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
                        </tr>
                        <tr>
                            <td align="right">
                                <fsn:submit value="submit.accept" 
                                            path="muestraReporte"
                                            action="reporteTercerosNomina/cifrasDeControlF.do"/>
                            </td>
                            <td align="left">
                                <fsn:submit value="submit.cancel" 
                                            path="cancel" 
                                            action="reporteTercerosNomina/cifrasDeControlF.do"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" height="20px">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        
        <c:if test="${reportesTercerosDTO.muestraReporte}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                    <!--   <fsn:reportParam name="PAR_CICLO" value="${reportesTercerosDTO.uniCiclo}"/> -->
                        <fsn:reportParam name="PAR_QNA" value="${reportesTercerosDTO.qnaCaptura}"/>
                         <fsn:reportParam name="PAR_TIPO_NOMINA" value="${reportesTercerosDTO.tipoNomina}"/>
                          <fsn:reportParam name="PAR_COMPLEMENTO" value="${reportesTercerosDTO.complemento}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/terceros/cifrasControl_FOVISSSTE" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="cifrasControlFOVISSSTE" 
                                    export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
    </div>
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
</html:form>