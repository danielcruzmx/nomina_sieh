<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="expedienteDTO">
    <table width="100%">
        <tr align="left">
            <td> <h1> <spring:message code="sireh.label.expediente.titulo"></spring:message> <fsn:label path="nombreEmp"/></h1> </td>
        </tr>
        <tr align="center">
            <td>
                <c:set var="content1">
                    <jsp:include page="../expediente/aviso.jsp" />
                </c:set>
                <c:set var="content2">
                    <jsp:include page="../expediente/personales.jsp" />
                </c:set>
                <c:set var="content3">
                    <jsp:include page="../expediente/dependientes.jsp" />
                </c:set>
                <c:set var="content4">
                    <jsp:include page="../expediente/academicos.jsp" />
                </c:set>
                <c:set var="content5">
                    <jsp:include page="../expediente/expLaboral.jsp" />
                </c:set>
                <c:set var="content6">
                    <jsp:include page="../expediente/datosLaboral.jsp" />
                </c:set>
                <c:set var="content7">
                    <jsp:include page="../expediente/organigrama.jsp" />
                </c:set>
                <c:set var="content8">
                    <jsp:include page="../expediente/conceptosAdicionales.jsp" />
                </c:set>
                <c:set var="content9">
                    <jsp:include page="../expediente/conceptosAdicionalesHistorico.jsp" />
                </c:set>
                <c:set var="content10">
                    <jsp:include page="../expediente/trayectoriaLaboral.jsp" />
                </c:set>
                <c:set var="content11">
                    <jsp:include page="../expediente/historicoPagos.jsp" />
                </c:set>
                <c:set var="content17">
                    <jsp:include page="../expediente/timbrado.jsp"/>
                </c:set>
                <c:set var="content12">
                    <jsp:include page="../expediente/incidencias.jsp" />
                </c:set>
                <c:set var="content13">
                    <jsp:include page="../expediente/notasMerito.jsp" />
                </c:set>        
                <c:set var="content14">
                    <jsp:include page="../expediente/cursos.jsp" />
                </c:set>    
                <c:set var="content15">
                    <jsp:include page="../expediente/servicioProfCarrera.jsp" />
                </c:set>    
                <c:set var="content16">
                    <jsp:include page="../expediente/docElectronica.jsp" />
                </c:set>
                
                <fsn:container section="init" type="tab" displayTime="10" tabHeight="35"/>
                    <fsn:container name="divContent1" content="${content1}" title="Leyenda de Confidencialidad" selected="true"/>
                    <fsn:container name="divContent2" content="${content2}" title="Datos Personales"/>
                    <fsn:container name="divContent3" content="${content3}" title="Familiares y/o Dependientes"/>
                    <fsn:container name="divContent4" content="${content4}" title="Antecedentes Acad&eacute;micos"/>
                    <fsn:container name="divContent5" content="${content5}" title="Experiencia Laboral"/>
                    <fsn:container name="divContent6" content="${content6}" title="Datos Laborales"/>
                    <fsn:container name="divContent7" content="${content7}" title="Estructura B&aacute;sica"/>
                    <fsn:container name="divContent8" content="${content8}" title="Conceptos de N&oacute;mina Adics Vigentes"/>
                    <fsn:container name="divContent9" content="${content9}" title="Conceptos de N&oacute;mina Adics Hist&oacute;ricos"/>                    
                    <fsn:container name="divContent10" content="${content10}" title="Trayectoria Laboral"/>
                    <fsn:container name="divContent11" content="${content11}" title="Hist&oacute;rico de Pagos"/>
                    <fsn:container name="divContent17" content="${content17}" title="Comprobantes de pago CFDI"/>
                    <fsn:container name="divContent12" content="${content12}" title="Incidencias Laborales"/>   
                    <fsn:container name="divContent13" content="${content13}" title="Notas de M&eacute;rito"/>   
                    <fsn:container name="divContent14" content="${content14}" title="Capacitaci&oacute;n y Cursos"/>
                    <fsn:container name="divContent15" content="${content15}" title="Servicio Profesional de Carrera"/>                                 
                    <fsn:container name="divContent16" content="${content16}" title="Documentaci&oacute;n Electr&oacute;nica"/>                    
                <fsn:container section="final"/>
            </td>
        </tr>
        <tr align="center">
            <td align="center">
                <c:if test="${!expedienteDTO.filtradoPorRfc}">
                    <fsn:submit value="submit.cancel" path="cancel" action="expediente/${expedienteDTO.urlOrigen}"/>
                </c:if>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">        
        function currentTab(currentDiv) { }
    </script>
</html:form>