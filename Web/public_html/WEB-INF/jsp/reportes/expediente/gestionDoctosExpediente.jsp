<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
</style>
<html:form modelAttribute="expedienteDocEmpleadoDTO">
<%--    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>  --%>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.reportes.gestionDocumentos.title"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos de b&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td class="label"> * <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.documento"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcTipoDoctosExpediente-busquedaDocEmpleado"
                                                path="idDocto"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.unidad"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidad-busquedaDocEmpleado"
                                                path="unidad"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.rfcEmpleado"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:input path="rfcEmpleado"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput"/>
                            </td>
                        </tr>
                    </table>
                    <table align="center" border="0" width="40%">
                        <tr><td width="30%" colspan="2"><b>* Campos requeridos</b></td>
                        <tr>
                          <td align="right">
                              <fsn:submit value="submit.accept" 
                                          path="muestraRegistros"
                                          action="oficinaVirtual/gestionDoctosExpediente.do"/>
                          </td>
                          <td align="left">
                              <fsn:submit value="submit.cancel" 
                                          path="cancel" 
                                          action="oficinaVirtual/gestionDoctosExpediente.do"/>
                          </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table>
        <tr align="center">
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>
<%--                <fieldset>
                    <legend style="font-size:1.3em"><strong>Empleados localizados</strong></legend>    --%>
                  <c:if test="${expedienteDocEmpleadoDTO.muestraRegistros}">
                    <c:choose>
                        <c:when test="${expedienteDocEmpleadoDTO.muestraRegistros}">
                          <%-- ACNAC - ACTA DE NACIMIENTO Y/O SUS MODIFICACIONES --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'ACNAC'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctoactnac" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctoactnac" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- CARMI - PRECARTILLA O CARTILLA LIBERADA DEL SERVICIO MILITAR NACIONAL --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'CARMI'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="P_RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="P_UNIDAD" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/CartillaMilitar" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="CartillaMilitar" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- CRRFC - CONSTANCIA DE REGISTRO FEDERAL DE CONTRIBUYENTES --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'CRRFC'}">
                              <%--  <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctorfc" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctorfc" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- COEST - COMPROBANTE DE ESTUDIOS  --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'COEST'}">
                              <%--  <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctoantaca" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctoantaca" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>   

                          <%-- CCURP - CLAVE UNICA DE REGISTRO DE POBLACION --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'CCURP'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctocurp" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctocurp" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- CODOM - COMPROBANTE DE DOMICILIO Y/O FORMATO DE ACTUALIZACION --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'CODOM'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="P_RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="P_UNIDAD" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/domicilio" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="domicilio" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- CTABA - CONTRATO DE DEPOSITO BANCARIO O ESTADO DE CUENTA CON CLABE INTERBANCARIA   --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'CTABA'}">
                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctoctaban" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctoctaban" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>     

                          <%-- AVIAC - AVISO EN CASO DE ACCIDENTE --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'AVIAC'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctoaccidente" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctoaccidente" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- DATCO - DATOS COMPLEMENTARIOS --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'DATCO'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctodatcompl" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctodatcompl" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- CCTDE - CAPACITACION (CURSOS, TALLERES, DIPLOMADOS Y ESPECIALIDADES) --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'CCTDE'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctocapacita" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctocapacita" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- DESBE - DESIGNACION DE BENEFICIARIOS --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'DESBE'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="P_RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="P_UNIDAD" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/beneficiarios" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="beneficiarios" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- DFDBE - DATOS DE FAMILIARES, DEPENDIENTES Y BENEFICIARIOS --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'DFDBE'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctofamilia" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctofamilia" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- FECLA - FECHAS LABORALES --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'FECLA'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="UNI" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/doctofeclab" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="doctofeclab" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <%-- EXPLA - EXPERIENCIA LABORAL --%>
                          <c:if test="${expedienteDocEmpleadoDTO.idDocto eq 'EXPLA'}">
<%--                              <fsn:reportParam name="PAR_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/> --%>
                              <fsn:reportParam name="P_RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="P_UNIDAD" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/experienciaLaboral" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="experienciaLaboral" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                          <c:if test="${expedienteDocEmpleadoDTO.idDocto ne 'EXPLA' && expedienteDocEmpleadoDTO.idDocto ne 'FECLA' &&
                                        expedienteDocEmpleadoDTO.idDocto ne 'DFDBE' && expedienteDocEmpleadoDTO.idDocto ne 'DESBE' &&
                                        expedienteDocEmpleadoDTO.idDocto ne 'CCTDE' && expedienteDocEmpleadoDTO.idDocto ne 'DATCO' &&
                                        expedienteDocEmpleadoDTO.idDocto ne 'AVIAC' && expedienteDocEmpleadoDTO.idDocto ne 'CODOM' &&
                                        expedienteDocEmpleadoDTO.idDocto ne 'CCURP' && expedienteDocEmpleadoDTO.idDocto ne 'CRRFC' &&
                                        expedienteDocEmpleadoDTO.idDocto ne 'CRRFC' && expedienteDocEmpleadoDTO.idDocto ne 'CARMI' &&
                                        expedienteDocEmpleadoDTO.idDocto ne 'ACNAC' && expedienteDocEmpleadoDTO.idDocto ne 'COEST'}">
                              <fsn:reportParam name="P_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/>
                              <fsn:reportParam name="P_RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="P_UNIDAD" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/documento" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="documento" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                          </c:if>

                        </c:when>
<%--                        <c:otherwise>
                           OTROS DOCUMENTOS
                              <fsn:reportParam name="P_DOCTO" value="${expedienteDocEmpleadoDTO.idDocto}"/>
                              <fsn:reportParam name="P_RFC" value="${expedienteDocEmpleadoDTO.rfcEmpleado}"/>
                              <fsn:reportParam name="P_UNIDAD" value="${expedienteDocEmpleadoDTO.unidad}"/>
                                  <fsn:report provider="jasper" 
                                              viewUri="/expediente/documento" 
                                              imagesUri="/images/reports" 
                                              format="pdf" 
                                              fileName="documento" 
                                              export="xls,pdf,rtf,docx" 
                                              width="1060" 
                                              height="350"/>
                        </c:otherwise>   --%>
                    </c:choose>
<%--                </fieldset>    --%>
                  </c:if>
                <br/>
            </td>
        </tr>
    </table>
<%--   
    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){
            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
        });
        
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        function gestorBusquedaDoc(idDocto, rfcEmpleado) {
            location.href = '<c:out value="${expedienteDocEmpleadoDTO.urlDestino}"/>.do?idDocto=' + idDocto + '&idDoctoFiltro=' + $j('select[id="idDocto"]').val() + '&rfcEmpleado=' + rfcEmpleado;
        }
    </script>    --%>
</html:form>