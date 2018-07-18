<%--@Descripcion:Tag para mostrar el detalle de al documentación del expediente personal.--%>
<%--@Autor: Oscar S.--%>
<%@ tag import="org.springframework.web.util.ExpressionEvaluationUtils"%>
<%@ tag import="gob.shcp.fsn.control.view.util.TagUtils" %>

<%@ attribute name="rfc"%> <%--rfc usado para mostrar documentos del expediente personal--%>
<%@ attribute name="tipo"%> <%--tipos de documentos--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%
try {
%>

<table width="100%">
    <tr>
        <td align="center" style="padding: 5px;">
            <br/>
            <div style="width:950px;overflow:auto;">
                <table id="listDocumentosTag"></table>
                <div id="pagerDocumentosTag"></div>
            </div>
            <br/>
        </td>
    </tr>
</table>

<style type="text/css">
    .ui-subtblcell{ background-color: #e6e6e6; }
</style>

<script type="text/javascript">
    var rfcEmpleado = '<%=rfc%>';                    
    var tipo = '<%=tipo%>';
    
    $j("#listDocumentosTag").jqGrid({
        url: '<%=request.getContextPath()%>/expediente/jsonCallbackDocActivos.do?rfcEmpleado=' + rfcEmpleado + '&tipo=' + tipo, 
        datatype: 'json',
        height: 200,
        colNames:['ID', '#',  'Tipo de documento', 'Registro', 'Requerido'],
        colModel:[
            {name:'idDocto',    index:'idDocto',    width:40,  align:'center', sortable:false, hidden:true},
            {name:'num',        index:'num',        width:33,  align:'center', sortable:false, sorttype:'number'},
            {name:'descdocto',  index:'descdocto',  width:460, align:'left',   sortable:false, sorttype:'text'},
            {name:'descstatus', index:'descstatus', width:140, align:'center', sortable:false, sorttype:'text'},
            {name:'requerido',  index:'requerido',  width:200, align:'center', sortable:false, sorttype:'text'},                            
        ],
        loadonce: false,
        rowNum: 200,
        pager: '#pagerDocumentosTag', 
        sortname: 'num',
        viewrecords: true,
        sortorder: 'asc', 
        multiselect: false, 
        subGrid: true,
        subGridUrl: '<%=request.getContextPath()%>/expediente/jsonCallbackDocHistorico.do?rfcEmpleado=' + rfcEmpleado, 
        subGridModel: [{ 
            name: ['Archivo', 'Detalle del documento', 'Estado', 'Rechazo'], 
            width: [35, 450, 100, 300],
            align: ['center', 'left', 'center', 'center'], 
            params:['idDocto'] 
        }]
    });
    $j("#listDocumentosTag").jqGrid('navGrid','#pagerDocumentosTag',{add:false,edit:false,del:false,search:false,refresh:false});
    
    $j(window).resize(function(){
        $j('#listDocumentosTag').jqGrid('setGridHeight', 250);
    });
    
    function actionLinkFormat(cellvalue, options, rowObject) {
        if (rowObject["referenciadocto"] != "SIN") {
            var a = "<a href='<%=request.getContextPath()%>/expediente/downloadFile.do?uuid=" + rowObject["referenciadocto"] + 
            "' class='requestlink' title='Descargar documento' target='_blank'><img width='20' align='middle' src='<spring:theme code='pdf-download.jpg'/>'\/><\/a>";
            return a;
        } else {
            return " ";
        }  
    }
</script>

<%
} catch (gob.shcp.fsn.service.ServiceException se) {
    TagUtils.saveError(pageContext, se);
%>
    <jsp:include page="../layout/message.jsp" />
<%
} catch(Exception e) {
    e.printStackTrace();
}
%>