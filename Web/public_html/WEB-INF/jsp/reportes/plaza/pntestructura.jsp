<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="reportePlazaDTO">
    
    <h1><strong>
            <spring:message code="sireh.label.plaza.reportes.titulo.link"/> &#45;
            <spring:message code="sireh.label.plaza.reportes.seccion.plazas.titulo.link"/> &#45; 
            <spring:message code="sireh.label.plaza.reportes.pntestructura.titulo.link"/>
    </strong></h1>

    <table width="100%" align="center" border="0">
    
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Parametros de consulta&nbsp;&nbsp; </strong></legend>
                    <table width="90%" align="center">
                        <tr> <td>&nbsp;</td> </tr>
                        <tr> 
                            <td align="right" class="label" width="20%">* Quincena de proceso</td>
                            <td align="left" colspan="2">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaCaptura" progress="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="left" height="20px" valign="middle"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td align="center" colspan="8">
                <fsn:submit value="submit.accept" path="muestraReporte" action="reportePlaza/pntestructura.do" progressIcon="false"/>
                
            </td>
        </tr>
    </table>
    
 </html:form>
