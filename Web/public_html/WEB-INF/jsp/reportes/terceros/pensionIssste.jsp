<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form name="checkBoxTest" modelAttribute="reportesTercerosDTO">
    
    
    <h1><strong>
        <spring:message code="sireh.label.terceros.reportes.titulo.link"/> &#45; 
        <spring:message code="sireh.label.terceros.reportes.seccion.titulo.link"/> &#45;
        <spring:message code="gestionseguros.terceros.pensionissste"/>
    </strong></h1>
        <table align="center" width="100%" border="0">
            <tr align="left">
              <tr>
                <td align="right" class="label">* Quincena</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaCaptura" progress="true" />
                </td>
              </tr>       
            </tr>
        </table>
            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
           <tr>
        <table width="100%">
            <tr align="center">
              <td>
                <fsn:submit value="submit.generate" 
                            path="generaArchivo" 
                            action="reporteTercerosNomina/generapensionIssste.do" 
                            progressIcon="false"/> &nbsp;
                <fsn:submit value="submit.cancel" 
                            path="cancel" 
                            action="reporteTercerosNomina/pensionIssste.do"
                            progressBar="true"/>
               </td>
            </tr>
        </table>
          
    
</html:form>
