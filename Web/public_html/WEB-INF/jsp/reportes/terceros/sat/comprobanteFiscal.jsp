<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html:form  modelAttribute="repComprobanteFiscalDTO">

    <h1> <strong> <spring:message code="sireh.label.nomina.reportes.satInpresionCFDI"/> </strong> </h1> 
    <p>&nbsp;</p>
    
    <table width="80%"  align="center" border="0">
        <tr>
            <td>
                <fieldset id="quincenasFieldSetttt">
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <br/>
                    <table width="95%" align="center" border="0">
                        <tr>
                            <td align="right" class="label"> <spring:message code="sireh.label.servicios.unidad"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadSinCiclo"
                                                path="unidad" />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"> <spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena"/></td>
                            <td align="left">
                                <fsn:filter property="hp.hp_qna_pago" condition="<=" path="qnaCaptura" />
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="qnaCapturaCFDI"
                                                path="qnaPago"
                                                progress="true"
                                                appendFilters="false"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"> <spring:message code="sireh.label.clc.proceso.clcOrdinaria.errores.complemento"/></td>
                            <td align="left">
                                <fsn:option key="-1" value="selectList.nonValue" />
                                <fsn:selectList parentPath="qnaPago" 
                                                progress="true" 
                                                path="complemento" 
                                                beanName="complementoCFDI" />
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"> <spring:message code="sireh.label.expediente.idTipoNomina"/></td>
                            <td>
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList parentPath="qnaPago" 
                                                filterPaths="complemento" 
                                                progress="true" 
                                                path="tipoNomina" 
                                                beanName="listaTiposNominaCFDI" /> 
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <table align="center" width="100%" border="0">
                                    <tr>
                                        <td align="left" colspan="2"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                                    </tr>
                                    <tr>
                                    <td align="center">
                                        <fsn:submit value="submit.accept" 
                                                    path="buscar" 
                                                    action="reporteTercerosNomina/repComprobanteFiscalCanc.do"/>
                                   
                                        <fsn:submit value="submit.clean" 
                                                    path="limpiar" 
                                                    action="reporteTercerosNomina/repComprobanteFiscalCanc.do"/>
                                    </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <br>
    <c:if test="${repComprobanteFiscalDTO.muestraReporte}">
        <table>
            <tr>
                <th align="left"></th>
            </tr>
            <tr>
                <td align="left">
                    <fsn:reportParam name="PAR_UNIDAD" value="${repComprobanteFiscalDTO.unidadList}"/>
                    <fsn:reportParam name="PAR_TIPO_NOMINA" value="${repComprobanteFiscalDTO.tipoNominaList}"/>
                    <fsn:reportParam name="PAR_QNA_PAGO" value="${repComprobanteFiscalDTO.qnaPagoList}"/>
                    <fsn:reportParam name="PAR_COMPLEMENTO" value="${repComprobanteFiscalDTO.complementoList}"/>
                    <fsn:report provider="jasper" 
                                viewUri="/terceros/CFDICancelados" 
                                imagesUri="/images/reports" 
                                format="pdf" 
                                fileName="CFDICancelados" 
                                export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                                width="1060" 
                                height="350"/>
                </td>
            </tr>
        </table>
    </c:if>
    
</html:form>
