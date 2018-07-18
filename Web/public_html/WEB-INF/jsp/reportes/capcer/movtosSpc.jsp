<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>


<html:form modelAttribute="reportesCapcerDTO">
    
    <h1><spring:message code="sireh.label.spc.capcer.reportes.general.movtosSpc.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Filtros de busqueda</strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr> <td colspan="2">&nbsp;</td> </tr>
                        <tr> 
                            <td align="right" class="label" width="20%">* Quincena</td>
                            <td align="left" colspan="2">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="listaQuincenasAnteriores"  
                                                path="quincena"
                                                progress="true"
                                                style="width: 100px;"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.spc.capcer.reportes.movtospc"/>:</td>
                            <td colspan="3">
                                    <html:select path="tipo">
                                       <option value="">Seleccione...</option>
                                       <option value="B">Bajas</option>
                                       <option value="P">Promociones</option>
                                      </html:select>
                            </td>
                        <tr>
                            <td colspan="2" valign="middle" height="20px" align="left">
                            <b>* Campos requeridos</b>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>

    <table width="100%">
          <tr align="center">
              <td>
                  <fsn:submit value="submit.accept" 
                              path="muestraReporte"
                              action="reportesCursoSPC/movtosSpc.do"/>
                  <fsn:submit value="submit.cancel" 
                              path="cancel" 
                              action="reportesCursoSPC/movtosSpc.do"/>
              </td>
          </tr>
    </table>

    <c:if test="${(reportesCapcerDTO.quincena != null && reportesCapcerDTO.tipo == 'B')}">
        <table>
            <tr>
                <th align="left"></th>
            </tr>
            <tr>
                <td align="left">
                <fsn:reportParam name="P_QNA_CAPTURA" value="${reportesCapcerDTO.quincena}"/>
                <fsn:report provider="jasper" 
                            viewUri="/capcer/bajasSpc"
                            imagesUri="/images/reports" 
                            format="pdf" 
                            fileName="bajasSpc"
                            export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                            width="1060" 
                            height="350"/>
                </td>
            </tr>
        </table>
    </c:if>
    <c:if test="${(reportesCapcerDTO.quincena != null && reportesCapcerDTO.tipo == 'P')}">
        <table>
            <tr>
                <th align="left"></th>
            </tr>
            <tr>
                <td align="left">
                <fsn:reportParam name="P_QNA_CAPTURA" value="${reportesCapcerDTO.quincena}"/>
                <fsn:report provider="jasper" 
                            viewUri="/capcer/promocionesSpc"
                            imagesUri="/images/reports" 
                            format="pdf" 
                            fileName="promocionesSpc"
                            export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                            width="1060" 
                            height="350"/>
                </td>
            </tr>
        </table>
    </c:if>
   
 </html:form>
