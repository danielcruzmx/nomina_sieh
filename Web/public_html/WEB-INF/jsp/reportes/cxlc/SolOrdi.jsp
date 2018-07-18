<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
.anchoTextarea {
    width: 600px;
}
</style>
<html:form modelAttribute="reportesCxlcDTO">

    <html:hidden path="uniCicloRequired"/>
    <html:hidden path="complementoRequired"/>
    <html:hidden path="tipoNominaRequired"/>
    <html:hidden path="clcRequired"/>
    <html:hidden path="qnaCapturaRequired"/>
    
    <h1>
        <strong>
            <spring:message code="sireh.label.cxlc.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.cxlc.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="sireh.label.cxlc.reportes.sufucuencia.detalle.titulo.link"/> &#45; 
            <spring:message code="sireh.label.cxlc.reportes.ordinaria.detalle.titulo.link"/>
        </strong>
    </h1>
    <p>&nbsp;</p>

    <c:set var="content0">
        <div align="center">
            <table>
                <tr>
                    <td align="right" class="label"><spring:message code="sireh.label.reportes.ciclo"></spring:message></td>
                    <td align="left">
                        <fsn:option key="0" value="selectList.nonValue"/>
                        <fsn:selectList beanName="tcUnidadCicloReportes"  
                                        path="uniCiclo"/>
                    </td>
                </tr>        
                <tr>
                    <td align="right" class="label"><spring:message code="sireh.label.reportes.tipoNomina"></spring:message></td>
                    <td align="left">
                        <fsn:option key="0" value="selectList.nonValue"/>
                        <fsn:selectList beanName="tcTipoNominaReportes"  
                                        path="tipoNomina" />
                    </td>
                </tr>
               <tr>
                    <td  align="right" class="label"><spring:message code="sireh.label.reportes.complemento"></spring:message></td>
                    <td align="left"><fsn:input path="complemento" maxlength="5" size="6"  /></td>
                </tr>
                <tr>
                    <td  align="right" class="label"><spring:message code="sireh.label.reportes.quincena"></spring:message></td>
                    <td align="left"><fsn:input path="qnaCaptura" maxlength="5" size="6"  /></td>
                </tr>
                <tr>
                    <td  align="right" class="label"><spring:message code="sireh.label.reportes.clc"></spring:message></td>
                    <td align="left"><fsn:input path="clc" maxlength="5" size="6"  /></td>
                </tr>
            </table>
        </div>
    </c:set>
        
    <fsn:container section="init" type="tab" displayTime="3" tabHeight="20"/>
    <fsn:container name="divContent0" content="${content0}" title="Datos Requeridos" selected="true"/>
    <fsn:container name="divContent1" content="${content1}" title="Datos Adicionales"/>
    <fsn:container section="final"/>
        
    <table>
        <tr>
            <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td align="right">
                <fsn:submit value="submit.accept" 
                            path="muestraReporte"
                            action="reporteCxlc/SolOrdi.do"/>
            </td>
            <td align="left">
                    <fsn:submit value="submit.cancel" 
                            path="cancel" 
                            action="reporteCxlc/SolOrdi.do"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" height="20px">&nbsp;</td>
        </tr>
    </table>
        
    <c:if test="${ (reportesCxlcDTO.uniCiclo!='0')  &&  (reportesCxlcDTO.clc!=null) &&  (reportesCxlcDTO.complemento!=null)  &&  (reportesCxlcDTO.qnaCaptura!=null) &&  (reportesCxlcDTO.tipoNomina!='0')}">
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
                                viewUri="/cxlc/SolOrdi" 
                                imagesUri="/images/reports" 
                                format="pdf" 
                                fileName="SolOrdi" 
                                export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                width="1060" 
                                height="350"/>
                </td>
            </tr>
        </table>
    </c:if>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
</html:form>