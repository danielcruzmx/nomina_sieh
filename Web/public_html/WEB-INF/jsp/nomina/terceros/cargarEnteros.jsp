<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<script>
function cargaComplemento(){
    if(document.getElementById("tipoNomina").value != "0" && document.getElementById("qnaPago").value != "0"){
        document.forms[0].action="cargarComplementos.do";
        document.forms[0].submit();
    }
    return false;
    
}
function muestraOculta(id){
     var el = document.getElementById(id);
    el.style.display =  'none' ;
}


</script>
<html:form  modelAttribute="generarEnteroDTO">
    <h1>
        <strong>
                <spring:message code="sireh.label.nomina.tercero.generarEntero.titulo"/>
               <spring:message code="sireh.label.nomina.tercero.generarEntero.opcion"/> 
        </strong>
    </h1>

<p>&nbsp;</p>
<div align="center">
    <table  border="0">
            <tr>
                <td  align="right" class="label"> 
                    <spring:message code="sireh.label.nomina.tercero.generarEntero.selectQna"/>
                </td> 
                <td align="left">  
                    <fsn:option key="0" value="selectList.nonValue" />
                    <fsn:selectList beanName="catalogoQnaPagoEnteros" path="qnaPago" onchange="cargaComplemento()" />
                </td>   
            </tr>
			<tr>
                <td  align="right" class="label">
                     <spring:message code="sireh.label.nomina.tercero.cargaArchivos.textbox"/>
                </td>
                <td  align="left">
                    <fsn:option key="0" value="selectList.nonValue" />
                    <fsn:selectList beanName="catalogoTercerosEnteros" path="tercero"  onchange="cargaComplemento()" />
                </td>
            </tr>
            <tr>
                <td  align="right" class="label"> 
                    <spring:message code="sireh.label.nomina.tercero.generarEntero.tipoNomina"/>
                </td> 
                <td align="left">  
                        <fsn:option key="0" value="selectList.nonValue" />
                        <fsn:selectList beanName="tiposNominaEnteros" path="tipoNomina" onchange="cargaComplemento()" />
                </td> 
			</tr>
          
<c:if test="${generarEnteroDTO.listaComplemento ne null}">
            <tr>
                <td colspan="2" >
       
           <display:table name="generarEnteroDTO.listaComplemento" class="displaytag"  pagesize="5" id="row" requestURI="${requestURI}" sort="list"   >
                     <display:column style="width: 5" >
                            <html:checkbox path="checkComplemento"  value="${row.hpNumComplem}" onclick="muestraOculta('generar')"/>
                    </display:column>
                    <display:column title="Tipo nomina" value="${row.idTipoNomina}"   />
                    <display:column title="Complemento"  value="${row.hpNumComplem}" />
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                    </display:setProperty>
            </display:table>
                     
                </td>
            </tr>   
  
             
            <tr>
                <td align="center" colspan="5">
                    <fsn:submit value="submit.iniciaProceso" 
                                path="muestraReporte"
                                action="enterosNomina/iniciaProceso.do" progressBar="true"/>
                </td>
            </tr> 
        </c:if>
        </table>
         <c:if test="${generarEnteroDTO.listaProceso ne null}">
         <html:hidden path="listaProceso"/>
        <table>
            <tr>
                <td colspan="2" >
                    <display:table name="generarEnteroDTO.listaProceso" class="displaytag"  >
                                    <display:column title="Nombre " property="nombre" value="nomina" />
                                    <display:column title="RFC" property="rfc" value="rfc" />
                                    <display:column title="Concepto" property="concepto" value="concepto" />
                                    <display:column title="Importe deduccion" property="deduccion" value="deduccion" />
                                     <display:column title="Importe recuperacion" property="recuperacion" value="recuperacion" />
                                </display:table>
                                
                </td>
                <td>
                        <table>
                            <tr>
                                    <td>Enteros<br>
                                    Total de casos<br>
                                        <fsn:input path="totalEntero" maxlength="12" size="15" readonly="true"  />
                                    </td>
                            <//tr>
                            <tr>
                                    <td>
                                     importe total<br>
                                        <fsn:input path="ImporteEntero" maxlength="12" size="15"  readonly="true" />
                                    </td>
                            <//tr>
                            <tr>
                                    <td> Recuperacion<br>
                                    Total de casos<br>
                                        <fsn:input path="totalRecuperacion" maxlength="12" size="15"  readonly="true" />
                                    </td>
                            <//tr>
                            <tr>
                                    <td> importe total<br>
                                        <fsn:input path="importeRecuperacion" maxlength="12" size="15"  readonly="true"/>
                                    </td>
                            <//tr>
                        </table>
                </td>
            </tr>      
            
            <tr>
                <td align="center" colspan="5">
                <div id="generar">
                    <fsn:submit value="submit.generaArchivo" 
                                path="muestraReporte"
                                action="enterosNomina/generaArchivoTexto.do"  progressIcon="false" /> 
                </div>
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
<script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        $j("#checkComplemento").keypress(function(event) {
            if (event.which == 13) {
                doSubmit(10001);
            }
        });
    </script>
</html:form>