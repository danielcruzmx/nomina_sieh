<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="generacionCecobanDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.generacionCecoban.path.header"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.generacionCecoban.datosArchivo.header"/></strong></legend>
                    <table align="center" width="95%">
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.generacionCecoban.rcQnaCaptura"/></td>
                            <td align="left">
                                <fsn:filter property="hp.hp_qna_pago" condition="<=" path="filterRcQnaCaptura" />
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList appendFilters="false" path="rcQnaCaptura" beanName="hpQnaPagoHistoricoPago" disabled="${generacionCecobanDTO.nombreArchivo ne null and generacionCecobanDTO.nombreArchivo ne ''}"/>
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.generacionCecoban.hpNumComplem"/></td>
                            <td align="left">
                                <fsn:option key="-1" value="selectList.nonValue" />
                                <fsn:selectList parentPath="rcQnaCaptura" progress="true" path="hpNumComplem" beanName="complementoTnHistoricoPago" disabled="${generacionCecobanDTO.nombreArchivo ne null and generacionCecobanDTO.nombreArchivo ne ''}"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.generacionCecoban.numArchivo"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList path="numArchivo" items="${generacionCecobanDTO.listaNumArchivo}" disabled="${generacionCecobanDTO.nombreArchivo ne null and generacionCecobanDTO.nombreArchivo ne ''}"/> 
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.generacionCecoban.idTipoNomina"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList parentPath="rcQnaCaptura" filterPaths="hpNumComplem" progress="true" path="idTipoNomina" beanName="idTipoNominaTnHistoricoPago" disabled="${generacionCecobanDTO.nombreArchivo ne null and generacionCecobanDTO.nombreArchivo ne ''}"/> 
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.generacionCecoban.fecPresentacion" /></td>
                            <td align="left"><fsn:calendar path="fecPresentacion" readonly="${generacionCecobanDTO.nombreArchivo ne null and generacionCecobanDTO.nombreArchivo ne ''}"/> </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.generacionCecoban.fecTransferencia" /></td>
                            <td align="left"><fsn:calendar path="fecTransferencia" readonly="${generacionCecobanDTO.nombreArchivo ne null and generacionCecobanDTO.nombreArchivo ne ''}"/> </td>
                        </tr>
                        <c:if test="${generacionCecobanDTO.nombreArchivo ne null and generacionCecobanDTO.nombreArchivo ne ''}">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.generacionCecoban.archivo"></spring:message></td>
                                <td align="left"><fsn:label path="nombreArchivoUser"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.generacionCecoban.casos"/></td>
                                <td align="left"><fsn:input path="numeroCasos" readonly="true"/> </td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.generacionCecoban.monto"/></td>
                                <td align="left"><fsn:input path="monto" readonly="true"/> </td>
                            </tr>
                        </c:if>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td><spring:message code="sireh.form.required.fields"/></td>
        </tr>
    </table>
    
        <p>&nbsp;</p>
    <table align="center">
        <tr>
            <td align="center">
                <c:if test="${generacionCecobanDTO.nombreArchivo ne null and generacionCecobanDTO.nombreArchivo ne ''}">
                    <fsn:submit value="submit.download" action="calculoNomina/downloadFile.do" progressIcon="false"/>
                </c:if>
            </td>
            <td align="center">
                <c:if test="${generacionCecobanDTO.nombreArchivo eq null or generacionCecobanDTO.nombreArchivo eq ''}">
                    <fsn:submit value="submit.generate" action="calculoNomina/generarArchivoCecoban.do" progressIcon="false"/>
                </c:if>
            </td>
            <td align="center">
                <fsn:submit value="submit.cancel" path="cancel" action="calculoNomina/generacionCecoban.do" progressIcon="false" />
            </td>
        </tr>
    </table>

    <c:forEach items="${generacionCecobanDTO.listaQuincenas}" var="selectQnaDTO" varStatus="status">
        <input type="hidden"  name="listaQuincenas[<c:out value='${status.index}'/>].key" value="<c:out value='${selectQnaDTO.key}'/>" />
        <input type="hidden"  name="listaQuincenas[<c:out value='${status.index}'/>].value" value="<c:out value='${selectQnaDTO.value}'/>" />
    </c:forEach>

    <c:forEach items="${generacionCecobanDTO.listaNumArchivo}" var="selectQnaDTO" varStatus="status">
        <input type="hidden"  name="listaNumArchivo[<c:out value='${status.index}'/>].key" value="<c:out value='${selectQnaDTO.key}'/>" />
        <input type="hidden"  name="listaNumArchivo[<c:out value='${status.index}'/>].value" value="<c:out value='${selectQnaDTO.value}'/>" />
    </c:forEach>
    
    <html:hidden path="nombreArchivo" />
    <html:hidden path="isGenerar" />




</html:form>