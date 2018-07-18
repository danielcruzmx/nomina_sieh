<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="clcOrdinariaDTO">
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.titulo.link"/> - 
    <spring:message code="sireh.label.clc.proceso.clcOrdinaria.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="40%">
        <tr valign="top">
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.clc.proceso.clcOrdinaria.busqueda"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcOrdinaria.anio"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="clcCiclo" 
                                                path="cicloUnidad" 
                                                progress="true"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcOrdinaria.quincenaPago"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="clcQnaPago" 
                                                path="qnaPago" 
                                                progress="true"
                                                parentPath="cicloUnidad"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcOrdinaria.tipoNomina"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="clcTipoNomina" 
                                                path="tipoNomina" 
                                                progress="true"
                                                parentPath="qnaPago"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">* <spring:message code="sireh.label.clc.proceso.clcOrdinaria.complemento"/></td>
                            <td width="200px" align="left">
                                <fsn:option key="" value="selectList.nonValue" />
                                <fsn:selectList beanName="clcComplemento" 
                                                path="numComplem"
                                                progress="true"
                                                parentPath="tipoNomina"
                                                filterPaths="qnaPago"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                <br>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.clc.proceso.clcOrdinaria.calculo"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table>
                   
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.proceso.clcOrdinaria.liquido"/></td>
                            <td width="200px" align="left">
                                <fsn:selectList beanName="clcLiquido" 
                                                path="liquido" 
                                                progress="true"
                                                parentPath="numComplem"
                                                filterPaths="qnaPago,tipoNomina"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.proceso.clcOrdinaria.deducciones"/></td>
                            <td width="200px" align="left">
                                <fsn:selectList beanName="clcDeducciones" 
                                                path="deducciones" 
                                                progress="true"
                                                parentPath="numComplem"
                                                filterPaths="qnaPago,tipoNomina"
                                                style="width: 200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label"><spring:message code="sireh.label.clc.proceso.clcOrdinaria.devoluciones"/></td>
                            <td width="200px" align="left">
                                <fsn:selectList beanName="clcDevoluciones" 
                                                path="devoluciones" 
                                                progress="true"
                                                parentPath="numComplem"
                                                filterPaths="qnaPago,tipoNomina"
                                                style="width: 200px;"
                                                onchange="subtractionCurrency()"/>
                            </td>
                        </tr>
                        <tr>
                            <td width="200px" align="right" class="label">Deducciones - Devoluciones</td>
                            <td width="200px" align="left">
                                <div id="resta"></div>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td>
                <table width="100%">
                    <tr>
                        <td align="left" height="20px" valign="middle">
                            <strong>
                                <spring:message code="sireh.form.required.fields"/>
                            </strong>
                        </td>
                    </tr>
                    <tr>
                        <td align="center">
                        <c:if test="${clcOrdinariaDTO.muestraErrores}">
                            <fsn:submit value="submit.revisar" 
                                        action="clcProceso/marcaRevisadoExisteError"
                                        alertCode="confirm.clc.proceso.ordinaria.marcar"
                                        progressBar="true"/> &nbsp; 
                        </c:if>
                            <fsn:submit value="submit.generate" 
                                        path="muestraErrores"
                                        action="clcProceso/executeProcedureClcOrdinaria"
                                        progressBar="true"/> &nbsp; 
                            <fsn:submit value="submit.cancel" 
                                        action="clcProceso/clcOrdinaria"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <c:if test="${clcOrdinariaDTO.muestraErrores}">
        <h1>Errores</h1>
        <fsn:filter property="E.CE_CICLO" condition="=" path="cicloUnidad"/>
        <fsn:filter property="E.CE_QNA_PAGO" condition="=" path="qnaPago"/>
        <fsn:filter property="E.ID_TIPO_NOMINA" condition="=" path="tipoNomina"/>
        <fsn:filter property="E.CE_COMPLEMENTO" condition="=" path="numComplem"/>
        
        <div id="displayTagDiv">
            <fsn:pagedList beanName="clcQuincenalErrores"
                           baseUrl="clcOrdinaria"
                           appendFilters="false">
                           
                <display:table name="clcQuincenalErrores" 
                               class="displaytag" 
                               pagesize="10"  
                               export="true" 
                               id="row" 
                               requestURI="${requestURI}" 
                               sort="list">
                               
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.id" 
                                    property="ceSecuencia" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.ciclo" 
                                    property="ceCiclo" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.quincenaPago" 
                                    property="ceQnaPago" 
                                    sortable="true"/>          
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.tipoNomina" 
                                    property="idTipoNomina" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.complemento" 
                                    property="ceComplemento" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.descError" 
                                    property="descError" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.folio" 
                                    property="idFolio" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.tipoConcepto" 
                                    property="idTipoCpto" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.conceptoPago" 
                                    property="idCptoPago" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.unidad" 
                                    property="idUnidadNom" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.estado" 
                                    property="idEdo" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.monto" 
                                    property="ceMonto" 
                                    format="$ {0,number,#,##0.00}"
                                    style="text-align:right"
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.revisado" 
                                    property="revisado" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.usuario" 
                                    property="usuario" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.proceso.clcOrdinaria.errores.fecha" 
                                    property="fecModifico" 
                                    sortable="true"/>
                                    
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="export.pdf" value="true"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                    </display:setProperty>
                </display:table>
                    
            </fsn:pagedList>
        </div>
    </c:if>

    <script type="text/javascript">
        function subtractionCurrency() {
            $j("#resta").empty();
            
            var deducciones = 0;
            var devoluciones = 0;
            var resta = 0;
            
            deducciones = $j("#deducciones option:selected").text();
            if (deducciones != null) {
                deducciones = deducciones.replace("$", "");
                deducciones = deducciones.replace(/\,/g,"");
            }
            devoluciones = $j("#devoluciones option:selected" ).text();
            if (devoluciones != null) {
                devoluciones = devoluciones.replace("$", "");
                devoluciones = devoluciones.replace(/\,/g,"");
            }
            if (deducciones != null && deducciones > 0 && devoluciones != null) {
                resta = parseFloat(deducciones) - parseFloat(devoluciones);
            }
            $j("#resta").text("$" + parseFloat(Math.round(resta * 100) / 100).toFixed(2)).digits();
        }
        
        $j.fn.digits = function(){ 
            return this.each(function(){ 
                $j(this).text($j(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,")); 
            });
        }
        
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
    
</html:form>