<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesTercerosDTO">
    <h1>
       <strong>
       <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45; 
       <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45; 
       <spring:message code="sireh.label.terceros.reportes.seguroVidaInstitucionalAnticipado.detalle.titulo.link"/>
       </strong>
    </h1>
    <html:hidden path="qnaCapturaRequired"/>
    <html:hidden path="tipoNominaRequired"/>
    
    <p>&nbsp;</p>
    <div align="center">
        <table width="50%">
            <tr align="left">
            <tr>
                <td align="right" class="label">* Quincena</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaCaptura" progress="true" />
                </td>
            </tr>
           </tr>
            <tr>
                <td colspan="2" align="leftr" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="center">
                       <fsn:submit value="submit.generate" 
			           path="generaArchivo" 
			 	   action="reporteTercerosNomina/generaArchivoSegInstAnticipa" progressIcon="false" />
                       <fsn:submit value="submit.clean"
				   path="cancel" 
				   action="reporteTercerosNomina/seguroVidaAnticipado.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        
    </div>
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
    
    <p>&nbsp;</p>
    <div align="center"></div>
</html:form>