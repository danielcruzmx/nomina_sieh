<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<script type="text/javascript">

    function eliminar(valor){
       var action ="/sireh/mantenimientoPlantillaMerito/eliminarPlantilla.do?nameFile="+valor;
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
<html:form modelAttribute="plantillaDTO" method="post">
    <h1>
        <strong>
                <spring:message code="sireh.label.configuracion.manto.plantilla.merito.titulo"/>
               <spring:message code="sireh.label.configuracion.manto.plantillas.merito.opcion"/> 
        </strong>
    </h1>
    <p>&nbsp;</p>
   	<table align="center">
                        <tr>
			<td align="center">
                            <display:table name="plantillaDTO.listaFile"  class="displaytag" pagesize="10" id="row"   requestURI="${requestURI}" sort="list"  >
                                 <display:column href="/sireh/mantenimientoPlantillaMerito/getFilePlantillaMerito.do"  paramId="nameFile"  property="valor"
                                    titleKey="sireh.label.configuracion.manto.plantillas.merito.plantilla" >
                                    <img align="center" src="<spring:theme code="edit.gif"/>" alt="Editar" width="18" height="18"  /><c:out value='${row.valor}'/>
                                </display:column>                              
                                <display:column  titleKey="sireh.label.configuracion.manto.plantillas.merito.plantilla.eliminar">
                                  <a href="#" onclick="javascript:eliminar('<c:out value='${row.valor}'/>')">
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
            <table width="100%">
        <tr align="right">
            <td><fsn:submit value="submit.create" action="mantenimientoPlantillaMerito/altaPlantilla" progressBar="true"/></td>
        </tr>
    </table>
        
</html:form>