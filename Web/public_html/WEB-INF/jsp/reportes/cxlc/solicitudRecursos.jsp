<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesCxlcDTO">
    <h1>
        <strong>
            <spring:message code="sireh.label.cxlc.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.cxlc.reportes.seccion.titulo.link"/> &#45;     
            <spring:message code="sireh.label.cxlc.reportes.recursos.detalle.titulo.link"/>       
        </strong>
    </h1>
    
    <html:hidden path="uniCicloRequired"/>
    <html:hidden path="complementoRequired"/>
    <html:hidden path="tipoNominaRequired"/>
    <html:hidden path="clcRequired"/>
    <html:hidden path="qnaCapturaRequired"/>
    
    <p>&nbsp;</p>
    <div align="center">
        <table>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.ciclo"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadCicloReportesCLC" 
                                    path="uniCiclo"/>

                </td>
            </tr>        
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.quincena"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="catalogoNumQnaReportesCLC" 
                                    path="qnaCaptura" 
                                    progress="true" 
                                    parentPath="uniCiclo" />
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.tipoNomina"></spring:message></td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcTipoNominaReportesCLC"  
                                    path="tipoNomina" 
                                    progress="true"
                                    parentPath="qnaCaptura"
                                    filterPaths="uniCiclo"/>
                </td>
            </tr>
             <tr>
                <td  align="right" class="label"><spring:message code="sireh.label.reportes.complemento"></spring:message></td>
                <td align="left">
                    <fsn:option key="-1" value="selectList.nonValue"/>
                    <fsn:selectList beanName="catalogoComplementoCLC"
                                    path="complemento" 
                                    progress="true" 
                                    parentPath="qnaCaptura"
                                    filterPaths="uniCiclo,tipoNomina"/>
                </td>
            </tr>
            <tr>
                <td align="right" class="label"><spring:message code="sireh.label.reportes.clc"></spring:message></td>
                <td align="left"> 
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="catalogoClavesCLC"  
                                    path="clc" 
                                    progress="true" 
                                    parentPath="complemento" 
                                    filterPaths="qnaCaptura,tipoNomina" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="right">
                    <fsn:submit value="submit.accept" 
                                path="muestraReporte"
                                action="reporteCxlc/SolRecu.do"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.cancel" 
                                path="cancel" 
                                action="reporteCxlc/SolRecu.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        
        <c:if test="${ (reportesCxlcDTO.uniCiclo!='0')  &&  (reportesCxlcDTO.clc!='0') &&  (reportesCxlcDTO.complemento!='-1')  &&  (reportesCxlcDTO.qnaCaptura!='0') &&  (reportesCxlcDTO.tipoNomina!='0')}">
            <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="PAR_CICLO" value="${reportesCxlcDTO.uniCiclo}"/>
                        <fsn:reportParam name="PAR_COMPLEMENTO" value="${reportesCxlcDTO.complemento}"/>
                        <fsn:reportParam name="PAR_CLC" value="${reportesCxlcDTO.clc}"/>
                        <fsn:reportParam name="PAR_QNA" value="${reportesCxlcDTO.qnaCaptura}"/>
                        <fsn:reportParam name="PAR_TIPO_NOMINA" value="${reportesCxlcDTO.tipoNomina}"/>
                        
                        <fsn:report provider="jasper" 
                                    viewUri="/cxlc/solicitudRecursos" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="solicitudRecursos" 
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