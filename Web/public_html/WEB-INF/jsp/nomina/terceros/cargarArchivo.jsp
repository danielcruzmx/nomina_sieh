<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="cargaArchivoDTO" method="post" enctype="multipart/form-data">
    
    <h1>
        <strong>
            <c:if test="${cargaArchivoDTO.tipoConcepto == 'P'}" >
                <spring:message code="movimientos.menu"/> &#45;
                <spring:message code="movimientos.cptos"/> &#45;
                <spring:message code="cargaCptosArchivo"/> &#45;
                <spring:message code="cargaarchivos.genera.cargaarchp"/>
            </c:if>
            <c:if test="${cargaArchivoDTO.tipoConcepto == 'D'}" >
                <spring:message code="sireh.label.nomina.tercero.cargaArchivos.titulo"/>
                <spring:message code="sireh.label.nomina.tercero.cargaArchivos.subOpcion"/>
            </c:if>
            <c:if test="${cargaArchivoDTO.tipoConcepto == 'C'}" >
                <spring:message code="movimientos.menu"/> &#45;
                <spring:message code="movimientos.cptos"/> &#45;
                <spring:message code="cargaCptosArchivo"/> &#45;
                <spring:message code="actualizacion.conceptos.control"/>
            </c:if>
            <c:if test="${cargaArchivoDTO.tipoConcepto == 'U'}" >
                <spring:message code="movimientos.menu"/> &#45;
                <spring:message code="movimientos.cptos"/> &#45;
                <spring:message code="cargaCptosArchivo"/> &#45;
                <spring:message code="actualizacion.conceptos.referencias"/>
            </c:if>
        </strong>
    </h1>
    <p>&nbsp;</p>
    <table align="center" width="80%">
        <tr align="left">
            <td>&nbsp;</td>
             <td>&nbsp;</td>
              <td>&nbsp;</td>
        </tr>
        <tr align="left">
            <td>&nbsp;</td>
            <td> 
                <spring:message code="sireh.label.nomina.tercero.cargaArchivos.textbox"/>
                <fsn:option key="0" value="selectList.nonValue" />
                <fsn:selectList beanName="catalogoTerceros" path="idTercero"  progress="true"/>

                <input type="file" name="file" id="file" value="file" size="50" />
                <fsn:submit value="submit.download"  action="/tercerosNomina/parserArchivo.do"/>
                 <html:hidden path="fileName" />
            </td>
            
        </tr>
         <tr align="left">
         <td>&nbsp;</td>
            <td>&nbsp; </td>
            <td>&nbsp;</td>
        </tr>
        <tr align="left">
            <td>&nbsp;</td>
             <td>
               <c:if test="${cargaArchivoDTO.lista ne null}">
                 
                         <display:table name="cargaArchivoDTO.lista" class="displaytag"  >
                            <display:column title="RFC" property="rfc"/>
                            <display:column title="CURP" property="curp" />
                            <display:column title="Importe" property="importe"  style="text-align:right;" />
                            <display:column title="Tipo Mov" property="tipoMovimiento" style="text-align:center;" />
                            <display:column title="Ref" property="referencia" style="text-align:center;" />
                            <display:column title="Concepto" property="concepto" style="text-align:center;" />
                            <display:column title="Id Tercero" property="idTercero"  style="text-align:center;" />
                            <display:column title="Qna Inicio" property="qna" style="text-align:center;" />
                            <display:column title="Qna Fin" property="qnaFin" style="text-align:center;" />
                            <display:column title="Num Qnas" property="numQuincenas" style="text-align:center;" />
                            <display:column title="Dia" property="dia" />
                            <display:column title="fecha Incidencia" property="fechaIncidencia" />
                          </display:table>
                        
            <h3>   Total de Registros:   <fsn:label path="totalRegFlatFile"/> </h3>
                </c:if>
                 <c:if test="${cargaArchivoDTO.resultado ne null}">    
                         <display:table name="cargaArchivoDTO" class="displaytag"  >
                         <display:column title="Total de Registros" property="resultado.totalRegistros" style="text-align:center;" maxLength="50"/>
                            <display:column title="Registros Insertados" property="resultado.totalReg" style="text-align:center;" maxLength="50"/>
                            <display:column title="Registros con Error" property="resultado.totalError"  style="text-align:center;" maxLength="50"/>
                          </display:table>
                
                </c:if>
             </td>
              <td>&nbsp;</td>
        </tr>
        <tr align="left" colspan="3">
            <td> </td>
        </tr>
         <tr align="left" >
         <td>&nbsp;</td>
            <td>
                <c:if test="${cargaArchivoDTO.procesar ne false }">
                    <spring:message code="sireh.label.nomina.tercero.cargaArchivos.procesoArchivo"/>&nbsp;&nbsp;&nbsp;
                    <fsn:submit value="submit.execute" action="/tercerosNomina/procesarArchivo"/>
                 </c:if>
            </td>
            <td>&nbsp;</td>
        </tr>
        
    </table>
    <html:hidden path="tipoConcepto" id="tipoConcepto" />
</html:form>