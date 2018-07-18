<%@ tag import="gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService"%>
<%@ tag import="gob.shcp.fsn.control.view.util.TagUtils"%>
<%@ tag import="org.springframework.util.ClassUtils" %>
<%@ tag import="gob.shcp.sireh.model.nomina.QnaCapturaDTO"%>

<%@ attribute name="format" required="true"%>

<% 
    QnaCapturaDTO quincena = null;
    try {    
        quincena = ((MovimientoNominaService)TagUtils.getService(pageContext, (Class)ClassUtils.forName("gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService"))).getQuincenaCaptura();
    } catch(Exception e) {
        e.printStackTrace();
    }
%>
<%=quincena.format(format)%>
