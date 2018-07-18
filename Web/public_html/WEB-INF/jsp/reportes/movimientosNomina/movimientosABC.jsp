<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="reportesMovtoNominaDTO" action="movimientosABC.do">
    <html:hidden path="qnaRepRequired"/>
    <html:hidden path="idUnidadRequired"/>
    <h1>
        <strong>
            <spring:message code="sireh.label.movimiento.nomina.reportes.titulo.link"/> &#45; 
            <spring:message code="sireh.label.movimiento.nomina.reportes.seccion.titulo.link"/> &#45; 
            <spring:message code="reporte.movimientos.nomina.movimientos.abc"/>
        </strong>
    </h1>
        <table>
             <tr>
                <td align="right" class="label">Unidad</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="tcUnidadSinCiclo" 
                                    path="idUnidad"  progress="true"
                                    uppercase="false"/>
    
                </td>
            </tr>        
            <tr>
                <td align="right" class="label">* Quincena inicio</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnteriores"  path="qnaIni" progress="true" />
                </td>
            </tr>
            <tr>
                <td align="right" class="label">* Quincena fin</td>
                <td align="left">
                    <fsn:option key="0" value="selectList.nonValue"/>
                    <fsn:selectList beanName="listaQuincenasAnterioresFinales"  path="qnaFin"  progress="true"
                                    parentPath="qnaIni"/>
                </td>
            </tr>  
            <tr>
               <td align="right" class="label">* <spring:message code="sireh.label.movimiento.nomina.reportes.movimientoABC.detalle.titulo.link"></spring:message></td>
               <td align="left">
                   <html:select path="tipoEntero" cssClass="uppercase">    
                       <html:option value="0" label="Seleccione..."/>
                       <html:option value="a" label="altas"/>
                       <html:option value="b" label="bajas"/>
                       <html:option value="m" label="modificacion"/>
                    </html:select>
               </td>
            </tr>
            <tr>
                <td colspan="2">
                    <table width="100%" border="0" align="center">
                    <tr>
                            <td colspan="2" align="left" width="34%"><spring:message code="sireh.form.required.fields"/></td>
                            <td align="center" width="33%">
                                <fsn:submit value="submit.accept" path="muestraReporte" action="reporteMoviminentos/movimientosABC.do" progressIcon="false"/>
                            </td>
                            <td align="left" width="33%">
                                <fsn:submit value="submit.clean" path="cancel" action="reporteMoviminentos/movimientosABC.do" progressIcon="false"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
         </table>
</html:form>