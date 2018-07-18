<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form name="checkBoxTest" modelAttribute="generaArchivosTercerosDTO">

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <h1> <strong> <spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo"/> </strong> </h1> 
                <p>&nbsp;</p>
            </td>   
        </tr>
        <tr>
            <td>
                <fieldset id="tercerosFieldSet">
                    <legend style='font-size:1.2em'/>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo2"/></strong>
                    </legend>
                    <table width="100%" align="center" border="0">
                        <tr> <td>  </td> </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.creaArchivoTerceros.tercero"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="catalogoGenArchTerceros"  path="llaveTercero"  style="width: 400px;" />
                            </td>         
                            
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.creaArchivoTerceros.agrupaVerEmp"/></td>
                            <td align="center" colspan="2">
                               <html:radiobutton value="S" path="agrupaVerEmp" label="SI"/>
                               <html:radiobutton value="N" path="agrupaVerEmp" label="NO"/>
                            </td>
                            
                            <td>  </td>
                         </tr>
                        <tr> <td> </td> </tr>
                    </table>
                </fieldset>
            </td>
            <td>  </td>
        </tr>
        <tr> <td> </td> </tr>
        <tr>
            <td>
                <fieldset id="quincenasFieldSet 2 ">
                    <legend style='font-size:1.2em'/>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.tituloRango"/></strong>
                    </legend>
                    <table width="100%" align="center" border="0">
                        <tr> <td>  </td> </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena.inicial"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/> <fsn:selectList beanName="listaSoloQnasHistorico"  path="hpQnaPago" progress="true"  style="width: 100px;"/>
                            </td>      

                            <td align="right" class="label"><spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena.final"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/> <fsn:selectList beanName="listaSoloQnasHistoricoFinal"  path="hpQnaPagoFin" progress="true"  style="width: 100px;"/>
                            </td>      


                            <td align="right" class="label"><spring:message code="sireh.label.nomina.creaArchivoTerceros.agrupaVerEmp"/></td>
                            <td align="center" colspan="4">
                               <html:radiobutton value="T" path="estadoPago" label="Entero"/>
                               <html:radiobutton value="C" path="estadoPago" label="Cancelado"/>
                            </td>                            
                            
                            <td>  </td>
                        </tr>
                         <tr> <td> </td> </tr>
                    </table>
                </fieldset>
            </td>
            <td>  </td>
        </tr>
        <tr><td>
    
    
    <c:choose>
            <c:when test="${generaArchivosTercerosDTO.muestraRegistros}">
            <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.search" path="muestraRegistros" action="tercerosNomina/generacionArchivoTerceros.do"/>
                        <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/initGeneraArchivoTerceros.do"/>
                    </td>
                </tr>
            
            </table>

                <jsp:include page="generaArchivoGrid.jsp" />  

                <table width="100%">
                    <tr align="center">
                        <td>
                            <fsn:submit value="submit.generate" path="generaArchivo" action="tercerosNomina/initGeneraTercero.do" progressIcon="false" /> 
                            <h1> <c:out value="${generaArchivosTercerosDTO.leyenda}"/>  </h1>
                        </td>
                    </tr>
                </table>
                
            </c:when>
             <c:when test="${generaArchivosTercerosDTO.generaArchivo}">
             <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/initGeneraArchivoTerceros.do"/>
                    </td>
                </tr>
            </table>
               
                <jsp:include page="generaArchivoGrid.jsp" />  

                <tr> <td align="center">
                    <h1> <c:out value="${generaArchivosTercerosDTO.leyendag}"/>  </h1>
                </td> </tr>

                <c:url value="/tercerosNomina/generaTercero.do" var="_action" scope="page"/>
                
                <script type="text/javascript" >
                document.forms[0].action="<c:out value='${_action}'/>";
                document.forms[0].submit();
                </script>
             </c:when>
        <c:otherwise>
            <table width="100%" align="center" border="0">
                <tr>
                    <td align="right">
                        <fsn:submit value="submit.search" path="muestraRegistros" action="tercerosNomina/generacionArchivoTerceros.do"/>
                        <fsn:submit value="submit.clean" path="cancel" action="tercerosNomina/initGeneraArchivoTerceros.do"/>
                    
        
                    </td>
                </tr>
            </table>
        </c:otherwise>
    </c:choose>
     </td> </tr>
    </table>
</html:form>
