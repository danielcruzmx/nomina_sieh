<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<spring:message code="selectList.nonValue" var="nonValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCaptura.opcionMultiple"
                var="opcionMultiple"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCaptura.opcionMultiple.value"
                var="opcionMultipleValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCaptura.captura"
                var="captura"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCaptura.captura.value"
                var="capturaValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCaptura.marca"
                var="marca"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCaptura.marca.value"
                var="marcaValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.permanente.quincena"
                var="quincena"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.permanente.quincena.value"
                var="quincenaValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.permanente.periodo"
                var="periodo"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.permanente.periodo.value"
                var="periodoValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.permanente.baja"
                var="baja"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.permanente.baja.value"
                var="bajaValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCalculo.monto"
                var="monto"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCalculo.monto.value"
                var="montoValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCalculo.porcentaje"
                var="porcentaje"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCalculo.porcentaje.value"
                var="porcentajeValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.general"
                var="general"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.general.value"
                var="generalValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.devolucion"
                var="devolucion"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.devolucion.value"
                var="devolucionValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.reintegro"
                var="reintegro"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.reintegro.value"
                var="reintegroValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.tercero"
                var="tercero"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.tercero.value"
                var="terceroValue"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.nulo"
                var="nulo"/>
<spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo.nulo.value"
                var="nuloValue"/>
<script type="text/javascript">
    function cambiaNumOpciones( combo ) {
        
        numOpciones = parseInt( combo.value );
        if( numOpciones < 1 ) {
            document.getElementById( 'headerOpciones' ).style.display = 'none';
            for( var i=0; i<10; i++ ) {
                document.getElementById( 'rowNum'+i ).style.display = 'none';
            }
            return;
        }
        
        document.getElementById( 'headerOpciones' ).style.display = '';
        
        for( var i=0; i<numOpciones; i++ ) {
            document.getElementById( 'rowNum'+i ).style.display = '';
        }
        for( var i=numOpciones; i<10; i++ ) {
            document.getElementById( 'rowNum'+i ).style.display = 'none';
        }
    }
    function cambiaComboCaptura( combo ) {
    
        cambiaNumOpciones( document.getElementById( 'comboNumOpciones' ) );
    
        if( combo.value == 'O' ) {
            document.getElementById( 'divOpciones' ).style.display = '';
        } else {
            document.getElementById( 'divOpciones' ).style.display = 'none';
        }
    }
</script>
<html:form modelAttribute="movimientoConceptoPagoDTO">
  <html:hidden path="tipoMantenimiento"/>
  <html:hidden path="isNew"/>
  <c:if test="${movimientoConceptoPagoDTO.tipoMantenimiento == \'A\'}">
    <h1>
      <spring:message code="sireh.label.configuracion.movimientos.concepto.agregar.titulo"/>
    </h1>
  </c:if>
  <c:if test="${movimientoConceptoPagoDTO.tipoMantenimiento == \'M\'}">
    <h1>
      <spring:message code="sireh.label.configuracion.movimientos.concepto.modificar.titulo"/>
    </h1>
  </c:if>
  <p>&nbsp;</p>
  <table align="center" width="100%" border="0">
    <tr>
      <td>
        <fieldset>
          <legend style="font-size:1.3em">
            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.configuracion.movimientos.concepto.descripcionConcepto"/>&nbsp;&nbsp; </strong>
          </legend>
          <table align="center" width="100%" border="0">
            <colgroup>
              <col width="30%"></col>
              <col width="20%"></col>
              <col width="20%"></col>
              <col width="20%"></col>
              <col width="10%"></col>
            </colgroup>
            <tr>
              <td align="right" class="label">
                *&nbsp;
                <spring:message code="sireh.label.configuracion.movimientos.concepto.nombreConcepto"/>
              </td>
              <td align="left" colspan="2">
                <c:if test="${movimientoConceptoPagoDTO.tipoMantenimiento == \'A\'}">
                  <fsn:option key="" value="selectList.nonValue"/>
                  <fsn:selectList beanName="listaTiposConceptosPagos"
                                  path="idTipoConceptoPago"/>
                </c:if>
                <c:if test="${movimientoConceptoPagoDTO.tipoMantenimiento == \'M\'}">
                  <fsn:input path="descConceptoPago" uppercase="true"
                             maxlength="60" size="60" readonly="true"/>
                  <html:hidden path="idTipoConceptoPago"/>
                </c:if>
              </td>
              <td align="right" class="label">
                <spring:message code="sireh.label.configuracion.movimientos.concepto.bloque"/>
              </td>
              <td align="left">
                <html:checkbox path="bloqueChecked"/>
              </td>
            </tr>
            <tr>
              <td align="right" class="label">
                *&nbsp;
                <spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCapturaConcepto"/>
              </td>
              <td align="left">
                <html:select path="cpcTipoCaptura" cssClass="uppercase"
                             onchange="cambiaComboCaptura(this);">
                  <html:option value="" label="${nonValue}"/>
                  <html:option value="${opcionMultipleValue}"
                               label="${opcionMultiple}"/>
                  <html:option value="${capturaValue}" label="${captura}"/>
                  <html:option value="${marcaValue}" label="${marca}"/>
                </html:select>
              </td>
              <td align="right" class="label">
                *&nbsp;
                <spring:message code="sireh.label.configuracion.movimientos.concepto.tipoCalculo"/>
              </td>
              <td align="left" colspan="2">
                <html:select path="cpcTipoCalculo" cssClass="uppercase">
                  <html:option value="" label="${nonValue}"/>
                  <html:option value="${montoValue}" label="${monto}"/>
                  <html:option value="${porcentajeValue}"
                               label="${porcentaje}"/>
                </html:select>
              </td>
            </tr>
            <tr>
              <td align="right" class="label">
                *&nbsp;
                <spring:message code="sireh.label.configuracion.movimientos.concepto.periodoAplicacion"/>
              </td>
              <td align="left">
                <html:select path="cpcPermanente" cssClass="uppercase">
                  <html:option value="" label="${nonValue}"/>
                  <html:option value="${quincenaValue}" label="${quincena}"/>
                  <html:option value="${periodoValue}" label="${periodo}"/>
                  <html:option value="${bajaValue}" label="${baja}"/>
                </html:select>
              </td>
              <td align="right" class="label">
                <spring:message code="sireh.label.configuracion.movimientos.concepto.subtipo"/>
              </td>
              <td align="left" colspan="2">
                <html:select path="cpcSubtipo" cssClass="uppercase">
                  <html:option value="" label="${nonValue}"/>
                  <html:option value="${generalValue}" label="${general}"/>
                  <html:option value="${devolucionValue}"
                               label="${devolucion}"/>
                  <html:option value="${reintegroValue}" label="${reintegro}"/>
                  <html:option value="${terceroValue}" label="${tercero}"/>
                  <html:option value="${nuloValue}" label="${nulo}"/>
                </html:select>
              </td>
            </tr>
            <tr>
              <td align="right" class="label">
                <spring:message code="sireh.label.configuracion.movimientos.concepto.mensaje"/>
              </td>
              <td align="left" colspan="4">
                <fsn:textarea path="cpcMensaje" rows="3" cols="123"/>
              </td>
            </tr>
          </table>
        </fieldset>
      </td>
    </tr>
    <c:set var="displayDiv"
           value="${movimientoConceptoPagoDTO.cpcTipoCaptura == opcionMultipleValue? \'\': \'none\'}"/>
    <tr id="divOpciones" style='display: <c:out value="${displayDiv}"/>;'>
      <td style="vertical-align:top">
        <fieldset>
          <legend style="font-size:1.3em">
            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.configuracion.movimientos.concepto.opcionesValores"/>&nbsp;&nbsp; </strong>
          </legend>
          <table align="center" width="100%" border="0">
            <tr>
              <td align="right" class="label">
                <spring:message code="sireh.label.configuracion.movimientos.concepto.numOpciones"/>
              </td>
              <td align="left">
                <html:select id="comboNumOpciones" path="numOpciones"
                             cssClass="uppercase"
                             onchange="cambiaNumOpciones(this);">
                  <html:option value="0" label="0"/>
                  <html:option value="1" label="1"/>
                  <html:option value="2" label="2"/>
                  <html:option value="3" label="3"/>
                  <html:option value="4" label="4"/>
                  <html:option value="5" label="5"/>
                  <html:option value="6" label="6"/>
                  <html:option value="7" label="7"/>
                  <html:option value="8" label="8"/>
                  <html:option value="9" label="9"/>
                  <html:option value="10" label="10"/>
                </html:select>
              </td>
            </tr>
            <tr align="center" id="headerOpciones">
              <td class="label" style="text-align:center;">#</td>
              <td class="label" style="text-align:center;">
                <spring:message code="sireh.label.configuracion.movimientos.concepto.opcion"/>
              </td>
              <td class="label" style="text-align:center;">
                <spring:message code="sireh.label.configuracion.movimientos.concepto.valor"/>
              </td>
            </tr>
            <c:forEach var="i" begin="0" end="9" varStatus="itemsRow">
              <c:set var="isTrDisplay"
                     value="${itemsRow.index < movimientoConceptoPagoDTO.numOpciones? \'\': \'none\'}"/>
              <tr id="rowNum<c:out value='${itemsRow.index}'/>" align="left"
                  style="display: <c:out value='${isTrDisplay}'/>;">
                <td align="center"
                    id="colNum<c:out value='${itemsRow.index}'/>">
                  <c:out value="${itemsRow.index + 1}"/>
                </td>
                <td>
                  <html:input path="cpcOpcion${itemsRow.index == 9? \'0\': itemsRow.index+1}"
                              cssStyle="width:95%;"/>
                </td>
                <td>
                  <html:input path="cpcValor${itemsRow.index == 9? \'0\': itemsRow.index+1}"
                              cssStyle="width:95%;"/>
                </td>
              </tr>
            </c:forEach>
          </table>
        </fieldset>
      </td>
    </tr>
    <tr>
      <td style="vertical-align:top">
        <fieldset>
          <legend style="font-size:1.3em">
            <strong>&nbsp;&nbsp;<spring:message code="sireh.label.configuracion.movimientos.concepto.aplica"/>&nbsp;&nbsp; </strong>
          </legend>
          <table align="center" width="100%" border="0"
                 style="text-align:center;">
            <tr>
              <td align="right" class="label" style="width:25%;">
                *&nbsp;
                <spring:message code="sireh.label.configuracion.movimientos.concepto.tipoNombramento"/>
              </td>
              <td align="left" style="width:25%;">
                <html:select path="cpcNombramiento" cssClass="uppercase">
                  <html:option value="" label="${nonValue}"/>
                  <html:option value="B" label="Base"/>
                  <html:option value="C" label="Confianza"/>
                  <html:option value="H" label="Honorarios"/>
                  <html:option value="BC" label="Base y Confianza"/>
                  <html:option value="BCH" label="TODOS"/>
                </html:select>
              </td>
              <td align="right" class="label" style="width:25%;">
                <spring:message code="sireh.label.configuracion.movimientos.concepto.niveles"/>
              </td>
              <td align="center" style="width:50%;">
                <fsn:doubleSelectList beanName="listaNivelesConceptos"
                                      name="idsNivelesPto" appendFilters="false"
                                      path="idsNivelesPto" size="10"/>
              </td>
            </tr>
          </table>
        </fieldset>
      </td>
    </tr>
    <tr>
      <td align="left" height="20px" valign="middle">
        <spring:message code="sireh.form.required.fields"/>
      </td>
    </tr>
    <tr>
      <td>
        <table align="center" width="100%" border="0">
          <tr>
            <td align="right">
              <c:if test="${movimientoConceptoPagoDTO.tipoMantenimiento == \'A\'}">
                <fsn:submit value="submit.add"
                            action="movimientoConceptosPago/insertConceptosPago"/>
              </c:if>
              <c:if test="${movimientoConceptoPagoDTO.tipoMantenimiento == \'M\'}">
                <fsn:submit value="submit.update"
                            action="movimientoConceptosPago/updateConceptosPago"/>
              </c:if>
            </td>
            <td align="left">
              <fsn:submit value="submit.cancel"
                          action="movimientoConceptosPago/cancelarConceptosPago"/>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</html:form>