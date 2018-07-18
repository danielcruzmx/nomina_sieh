<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form id="cifrasPagoPorQnas" modelAttribute="pagoDTO">

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <h1> <strong> <spring:message code="sireh.label.nomina.cifras.pago.por.qna.titulo"/> </strong> </h1> 
                <p>&nbsp;</p>
            </td>   
        </tr>
        
        <tr>
            <td>
                <fieldset>
                    <legend style='font-size:1.2em'/>
                        <strong><spring:message code="sireh.label.nomina.cifras.pago.por.qna.titulo2"/></strong>
                    </legend>
                    <table width="85%"  align="left" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.cifras.pago.por.qna.qnapago"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/> <fsn:selectList beanName="listaSoloQnasHistorico"  path="quincenaProceso" progress="true"  style="width: 200px;"/>
                            </td>         
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        
        <tr> <td>   <p>&nbsp;</p> </td> </tr>
        
        <tr>
            <td>
                <fieldset>
                    <legend style='font-size:1.2em'/>
                        <strong><spring:message code="sireh.label.nomina.cifras.pago.por.qna.titulo3"/></strong>
                    </legend>
                    <table width="85%" align="left" border="0">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.cifras.pago.por.qna.consec"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/> <fsn:selectList beanName="extraeConsecutivosNominaQnasHistorico"  path="idQna"  progress="true" parentPath="quincenaProceso" style="width: 700px;"/>
                            </td>         
                        </tr>
                    </table>
                </fieldset>
            </td>
            <td>  </td>
        </tr>
        <tr>
            <td>   <p>&nbsp;</p> 

    <table align="center" width="50%" border="0">
        <tr>
            <td align="center">
                <fsn:submit value="submit.export.nomconcepctrol" action="calculoNomina/historicoRevisionControl.do" progressIcon="false" />
            </td>
            <td align="center">
                <fsn:submit value="submit.export.nomcontodoscptos" action="calculoNomina/historicoRevisionTodos.do" progressIcon="false" />
            </td>
            <td align="center">
                <fsn:submit value="submit.export.nomconcptospago" action="calculoNomina/historicoRevisionConPago.do" progressIcon="false" />
            </td>
            <td align="center">
                <fsn:submit value="submit.export.nomconpapago" action="calculoNomina/historicoRevisionConPA.do" progressIcon="false" />
            </td>
            <td align="center">
                <fsn:submit value="submit.clean" action="calculoNomina/cifrasPagoPorQnas.do" progressIcon="false" />
            </td>
        </tr>
    </table>


            </td>
        </tr>
        
        
        <tr><td>
     </td> </tr>
    </table>
</html:form>