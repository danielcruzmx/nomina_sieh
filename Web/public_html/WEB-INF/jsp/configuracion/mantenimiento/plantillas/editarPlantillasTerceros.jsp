<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<script  type="text/javascript">
    var nav4 = window.Event ? true : false;
    function IsNumber(e){
        var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
       return ((tecla > 47 && tecla < 58) || tecla == 46);
    }

 </script>

<spring:message code="selectList.nonValue" var="nonValue"/>
<html:form modelAttribute="datosPlantillaDTO" method="post" enctype="multipart/form-data">
    <html:hidden path="nomPlantilla"/>
    <h1>
        <strong>
                <spring:message code="sireh.label.configuracion.manto.plantilla.titulo"/>
               <spring:message code="sireh.label.configuracion.manto.plantillas.opcion"/> 
        </strong>
    </h1>
    <p>&nbsp;</p>

   	<table align="center" border="0">
        <tr>
                <td colspan="4" align="center"><table  width="100%"  border="0" ><tr><td ><b>Actualizar Planilla</b></td></table> </td>
        </tr>
	<tr>
		<td colspan="4">Nombre de registro 
                <fsn:option key="0" value="selectList.nonValue"/>
                <fsn:selectList beanName="catalogoTercerosManto" path="nomReg"  progress="true"/>
                
                </td>
	</tr>
	<tr >
		<td>&nbsp;</td>
		 <td>&nbsp;</td>
		  <td>&nbsp;</td>
		  <td>&nbsp;</td>
	</tr>
	<tr>
		<td></td>
		<td align="center">Posici&oacute;n Inicial</td>
		<td align="center">Posici&oacute;n Final</td>
		<td align="center">Tipo</td>
	</tr>
	<tr>
		<td align="right">RFC : </td>
		<td align="center"><fsn:input path="rfc.start" maxlength="4" size="4" onkeypress="return IsNumber(event);" /></td>
		<td align="center"><fsn:input path="rfc.end" maxlength="4" size="4" onkeypress="return IsNumber(event);" /></td>
		<td align="center">
                    <html:select path="rfc.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>
	</tr>
		<tr>
		<td align="right">CURP : </td>
		<td align="center"><fsn:input path="curp.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="curp.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="curp.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>
	</tr>
		<tr>
		<td align="right">TIPO DE MOVIMIENTO : </td>
		<td align="center"><fsn:input path="tipoMovto.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="tipoMovto.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="tipoMovto.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>
	</tr>
		<tr>
		<td align="right">IMPORTE : </td>
		<td align="center"><fsn:input path="importe.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="importe.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="importe.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>
	</tr>
		<tr>
		<td align="right">REFERENCIA : </td>
		<td align="center"><fsn:input path="referencia.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="referencia.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="referencia.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>

	</tr>
		<tr>
		<td align="right">QUINCENA INICIAL : </td>
		<td align="center"><fsn:input path="qna.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="qna.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="qna.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>

	</tr>
		<tr>
		<td align="right">QUINCENA FINAL : </td>
		<td align="center"><fsn:input path="qnaFin.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="qnaFin.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="qnaFin.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>

	</tr>
		<tr>
		<td align="right">N&Uacute;MERO DE QUINCENAS : </td>
		<td align="center"><fsn:input path="numQuincenas.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="numQuincenas.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="numQuincenas.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>

	</tr>
        <tr>
		<td align="right">PORCENTAJE : </td>
		<td align="center"><fsn:input path="porcentaje.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="porcentaje.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="porcentaje.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>
	</tr>
        <tr>
		<td align="right">CONCEPTO : </td>
		<td align="center"><fsn:input path="concepto.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="concepto.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="concepto.type">
                        <html:option value="0" label="${nonValue}"/>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>
	</tr>
        
        <tr>
		<td align="right">FECHA DE INCIDENCIA : </td>
		<td align="center"><fsn:input path="fechaIncidencia.start"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center"><fsn:input path="fechaIncidencia.end"  maxlength="4" size="4" onkeypress="return IsNumber(event);"/></td>
		<td align="center">
                    <html:select path="fechaIncidencia.type">
                        <html:option value="0" >Seleccione...</html:option>
                        <html:options items="${datosPlantillaDTO.listaTipos}" itemValue="key" itemLabel="value"/>
                     </html:select>
		</td>
	</tr>
        
        <tr>
		<td colspan="4">&nbsp;</td>
	</tr>
                <tr>
			<td colspan="4" align="center">
                         <fsn:submit value="submit.save"  action="/mantenimientoPlantillas/updatePlantillas.do"/>
                          <fsn:submit value="submit.back"  action="/mantenimientoPlantillas/mantoPlantillas.do"/></td>
		</tr>
</table>

</html:form>