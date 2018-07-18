<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<script type="text/javascript">

    function eliminar(valor){
       var action ="/sireh/mantenimientoPlantillas/eliminarPlantillas.do?nomPlantilla="+valor;
     document.forms[0].action=action;
      var r = confirm("Esta seguro de eliminar la plantilla "+valor);
        if (r == true)
          {
         document.forms[0].submit();
          }
        else
          {
         return false;
          }
    }
</script>
<html:form modelAttribute="datosPlantillaDTO" method="post" enctype="multipart/form-data">
    <h1>
        <strong>
                <spring:message code="sireh.label.configuracion.manto.plantilla.titulo"/>
               <spring:message code="sireh.label.configuracion.manto.plantillas.opcion"/> 
        </strong>
    </h1>
    <p>&nbsp;</p>
   	<table align="center">
                        <tr>
			<td colspan="3" align="center">
                         <fsn:submit value="submit.createPlantilla"  action="/mantenimientoPlantillas/crearPlantillas.do"/>
                        </td>
		</tr>
		<tr>
                    <td colspan="3">
                      <c:set var="paramsElimina"   value="plantilla=${plantilla}"/>
                            <display:table name="datosPlantillaDTO.listaPlantillas"  class="displaytag" pagesize="10" id="row"   requestURI="${requestURI}" sort="list">
                                 <display:column href="/sireh/mantenimientoPlantillas/editarPlantillas.do"  property="value" paramId="plantilla"   media="html"  titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.actualizar">
                                    <img align="center" src="<spring:theme code="edit.gif"/>" alt="Editar" width="18" height="18"  />
                                </display:column>                              
                                <display:column  titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.eliminar">
                                  <a href="#" onclick="javascript:eliminar('<c:out value='${row.value}'/>')">
                                    <img align="center" src="<spring:theme code="delete.gif"/>" alt="Delete" width="18" height="18"  />
                                    </a>
                                </display:column>
                                <display:setProperty name="paging.banner.placement" value="bottom"/>
                                <display:setProperty name="export.pdf" value="true"/>
                                <display:setProperty name="basic.msg.empty_list">
                                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                                </display:setProperty>
                            </display:table>
                        </td>
		</tr>

	</table>    
</html:form>