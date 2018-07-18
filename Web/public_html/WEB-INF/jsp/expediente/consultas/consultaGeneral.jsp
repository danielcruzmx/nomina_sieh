<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="expedienteDTO">
    <table width="100%">
        <tr align="left">
            <td> <h1> <spring:message code="sireh.label.expediente.consultaGeneral.titulo"></spring:message> <fsn:label path="nombreEmp"/></h1> </td>
        </tr>
        <tr align="center">
            <td>
                <c:set var="content0">
                    <jsp:include page="../consultas/aviso.jsp" />
                </c:set>    
                <c:set var="content1">
                    <jsp:include page="../consultas/datosGenerales.jsp" />
                </c:set>
                <c:set var="content2">
                    <jsp:include page="../consultas/datosLaboral.jsp" />
                </c:set>    
               <c:set var="content3">
                    <jsp:include page="../consultas/organigrama.jsp" />
                </c:set>
                
                <fsn:container section="init" type="tab" displayTime="10" tabHeight="32"/>
                    <fsn:container name="divContent0" content="${content0}"   title="Leyenda de Confidencialidad" selected="true"/>    
                    <fsn:container name="divContent1" content="${content1}"   title="Datos Generales"/>
                    <fsn:container name="divContent2" content="${content2}"   title="Datos Laborales"/>
                    <fsn:container name="divContent3" content="${content3}"   title="Estructura B&aacute;sica"/>
                <fsn:container section="final"/>
            </td>
        </tr>
        <tr align="center">
            <td align="center">
                <fsn:submit value="submit.cancel" path="cancel" action="expediente/${expedienteDTO.urlOrigen}"/>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">        
        function currentTab(currentDiv) { }
    </script>
</html:form>