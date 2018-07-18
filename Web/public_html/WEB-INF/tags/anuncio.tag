<%--@Descripcion: Tag para mostrar anuncios en interiores de la aplicacion--%>
<%--@Autor: Oscar Sanchez--%>
<%@ tag import="gob.shcp.fsn.control.view.util.TagUtils" %>
<%@ tag import="org.springframework.util.ClassUtils" %>
<%@ tag import="org.apache.commons.logging.Log" %>
<%@ tag import="org.apache.commons.logging.LogFactory" %>
<%@ tag import="gob.shcp.sireh.service.anuncio.AnuncioService" %>
<%@ tag import="gob.shcp.sireh.model.TnAnuncioDTO" %>
<%
try {
    TnAnuncioDTO anuncio = ((AnuncioService)TagUtils.getService(pageContext, (Class)ClassUtils.forName("gob.shcp.sireh.service.anuncio.AnuncioService"))).getAnuncio();
    Log logger = LogFactory.getLog(getClass());
    
    if (anuncio != null) {
        String msg = anuncio.getMsgAnuncio();
        String titulo = anuncio.getTituloAnuncio();
%>
        <script type="text/javascript">
            //new Messi('<%= msg %>', {title: '<%= titulo %>', modal: true});
            //$j.smkAlert({text:'<%= titulo %>: <%= msg %>', type:'danger', time: 10, permanent: true});
            $j.smkAlert({text:'<%= titulo %>\n<br> <%= msg %>', type:'danger', permanent: true});
        </script>
<%
    } else {
        logger.debug("Error: No se pudo obtener el anuncio");
    }
} catch (gob.shcp.fsn.service.ServiceException se) {
    TagUtils.saveError(pageContext, se);
%>
    <jsp:include page="../layout/message.jsp" />
<%
} catch(Exception e) {
    e.printStackTrace();
}
%>