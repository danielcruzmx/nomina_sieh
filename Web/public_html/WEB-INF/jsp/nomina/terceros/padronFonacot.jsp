<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">
<html:hidden path="qnaCapturaRequired"/>

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <h1> <strong> <spring:message code="sireh.label.nomina.terceros.padronFonacot.titulo"/> </strong> </h1> 
                <p>&nbsp;</p>
            </td>   
        </tr>
        <tr> <td> </td> </tr>
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.2em'/>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo3"/></strong>
                    </legend>
                    <table width="100%" align="center" border="0">
                        <tr> <td>  </td> </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/> <fsn:selectList beanName="listaSoloQnasHistorico" 
       								   path="QnaPago" 
								       progress="true" 
									   style="width: 100px;"/>
                            </td>      
                            <td>  </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
            <td>  </td>
        </tr>

            <tr>
                <td colspan="2" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
            </tr>
            <tr>
                <td align="center">
                       <fsn:submit value="submit.generate" 
					               path="generaArchivo" 
								   action="tercerosNomina/generaPadronFonacot.do" progressIcon="false" />
                       <fsn:submit value="submit.clean"
					               path="cancel" 
								   action="tercerosNomina/padronFonacot.do"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" height="20px">&nbsp;</td>
            </tr>
        </table>
        
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
