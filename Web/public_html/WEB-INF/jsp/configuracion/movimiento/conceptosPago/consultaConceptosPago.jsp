<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html:form >
    <h1>
        <spring:message code="sireh.label.configuracion.movimientos.concepto.titulo"/>
    </h1>
    <table width="100%">
        <tr align="center">
            <td>
                <fsn:submit value="submit.add" action="movimientoConceptosPago/altaConceptosPago"/>
            </td>
        </tr>
    </table>
    <fsn:pagedList beanName="listaTiposConceptosPagosConsulta"
                   baseUrl="consultaConceptosPago" maxRows="200">
        <display:table name="listaTiposConceptosPagosConsulta"
                       class="displaytag" pagesize="10" export="true" id="row"
                       requestURI="${requestURI}" sort="list">
            <display:column titleKey="sireh.label.configuracion.movimientos.concepto.consulta.parametros.id"
                            sortable="true">
                <a href="modificacionConceptosPago.do?id=<c:out value='${row.id}'/>&isNew=false">
                    <c:out value="${row.id}"/>
                </a>
            </display:column>
            <display:column titleKey="sireh.label.configuracion.movimientos.concepto.consulta.parametros.desc"
                            sortable="true">
                <c:out value="${row.descripcion}"/>
            </display:column>
            <display:setProperty name="paging.banner.placement" value="bottom"/>
            <display:setProperty name="export.pdf" value="true"/>
            <display:setProperty name="basic.msg.empty_list">
                <br></br>
                <span class="pagebanner">&nbsp;</span>
                <span class="norecords">
                    <spring:message code="pagedList.empty.content"/>
                    <br></br>
                    <br></br>
                </span>
            </display:setProperty>
        </display:table>
    </fsn:pagedList>
</html:form>