<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="cierreNominaDTO">
    
    <h1><spring:message code="sireh.label.nomina.gestion.cierre.titulo"/></h1><br/>
    
    <table width="100%">
        <tr align="center">
            <td>
                <fsn:submit value="submit.cerrarNomina" 
                            action="gestionNomina/cierreNomina" 
                            progressBar="true" 
                            alertCode="confirm.nomina.cierre"/>
            </td>
        </tr>
    </table>
        
    <fsn:pagedList beanName="listaNominasCierre" 
                   baseUrl="consultaNominasCierre" 
                   maxRows="200">
        <div id="displayTagDiv">        
            <display:table name="listaNominasCierre" 
                           class="displaytag" 
                           pagesize="15"
                           export="true" 
                           id="row" 
                           requestURI="${requestURI}"
                           sort="list">
                
                <display:column property="idQna" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.idQna"
                                sortable="true"/> 
                <display:column property="qnaCaptura" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.qnaCaptura"
                                paramProperty="idQna" 
                                sortable="true"/>
                <display:column property="numComplem" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.numComplem"
                                sortable="true"/>
                <display:column property="descripcion" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.desc"
                                sortable="true"/>
                <display:column property="tipoNomina" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.tipoNomina"
                                sortable="true"/>
                <display:column property="grupoPago" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.grupoPago"
                                sortable="true"/>
                <display:column property="descEstadoNom" 
                                style="text-align: center;"
                                titleKey="sireh.label.nomina.gestion.consulta.parametros.status"
                                sortable="true"/>
                <display:setProperty name="paging.banner.placement" value="bottom"/>
                <display:setProperty name="export.pdf" value="true"/>
                <display:setProperty name="basic.msg.empty_list">
                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                </display:setProperty>
            </display:table>
        </div>
    </fsn:pagedList>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        function getBrowser() {
            var N=navigator.appName, ua=navigator.userAgent, tem;
            var M=ua.match(/(opera|chrome|safari|firefox|msie)\/?\s*(\.?\d+(\.\d+)*)/i);
            if(M && (tem= ua.match(/version\/([\.\d]+)/i))!= null) M[2]= tem[1];
            M=M? [M[1], M[2]]: [N, navigator.appVersion, '-?'];
            return M[0];
        }
        
        //this code handles the F5/Ctrl+F5/Ctrl+R
        document.onkeydown = checkKeycode;
        function checkKeycode(e) {
            var keycode;
            if (window.event)
                keycode = window.event.keyCode;
            else if (e)
                keycode = e.which;
                
            if (getBrowser() == 'MSIE') {
                if (keycode == 116 || (window.event.ctrlKey && keycode == 82)) {
                    window.event.returnValue = false;
                    window.event.keyCode = 0;
                    window.status = "Refresh is disabled";
                }
            } else {
                if (keycode == 116 ||(e.ctrlKey && keycode == 82)) {
                    if (e.preventDefault) {
                        e.preventDefault();
                        e.stopPropagation();
                    }
                }
            }
        }
    </script>
</html:form>