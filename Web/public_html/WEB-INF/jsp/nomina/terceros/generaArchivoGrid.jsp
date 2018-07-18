<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>




                <div id="dataTable" align="center" style="width: 1000px; overflow: auto;">
                    <fsn:filter property="TN_HISTORICO_PAGO.HP_QNA_PAGO" condition=">=" path="hpQnaPago"/>
                    <fsn:filter property="TN_HISTORICO_PAGO.HP_QNA_PAGO" condition="<=" path="hpQnaPagoFin"/>
                    <fsn:filter property="TN_CAPTURA_PAGO_CANC.CPC_QNA_APLICA" condition=">=" path="hpQnaPago"/>                    
                    <fsn:filter property="TN_CAPTURA_PAGO_CANC.CPC_QNA_APLICA" condition="<=" path="hpQnaPagoFin"/>     
                    <fsn:filter property="TN_MOVTOS_EMP_PLA.ID_MOVTO_PERSONA" condition="IN" path="conceptosList"/>
                    <fsn:filter property="C.ID_TIPO_CPTO" condition="=" path="datTipoCpto"/>    
                    <fsn:filter property="ID_TERCERO" condition="=" path="idTercero"/>                     
                    <fsn:filter property="DAT_TIPO_CPTO" condition="=" path="datTipoCpto"/>    
                    <fsn:filter property="DAT_CONCEPTO" condition="=" path="datConcepto"/>    
                    <fsn:filter property="TN_HISTORICO_PAGO.ID_SIT_PAGO" condition="=" path="estadoPago"/>    
                    <fsn:pagedList beanName="${generaArchivosTercerosDTO.beanlista}"
                                   baseUrl="tercerosNomina/generaTercero.do" 
                                   checkbox="true" 
                                   chkProperty="seleccionConsecNomina" 
                                   appendFilters="false">
                        <display:table name="${generaArchivosTercerosDTO.beanlista}"
                                       form="checkBoxTest"
                                       class="displaytag" 
                                       pagesize="100" 
                                       export="true"
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list"
                                       decorator="checkboxTableDecorator">
                           <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.selecciona"
                                           style="text-align: center" 
                                           property="checkbox" 
                                           media="html"/>                            
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.quincenaPago" 
                                            property="qnaPago" 
                                            sortable="false"/>
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.tipoNomina" 
                                            property="tipoNomina" 
                                            sortable="false"/>             
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.consecutivoNomina" 
                                            property="consecNomina" 
                                            sortable="false"/>
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.complemento" 
                                            property="numComplem" 
                                            sortable="false"/> 
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.grupoPago" 
                                            property="gpoPago" 
                                            sortable="false"/>            
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.registros" 
                                            style="text-align: right" 
                                            property="registros" 
                                            sortable="false"/>
                            <display:column titleKey="sireh.label.nomina.creaArchivoTerceros.montoImporte" 
                                            style="text-align: right" 
                                            property="monto" 
                                            sortable="false"/>            

                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                            <display:setProperty name="export.pdf" value="true"/>
                            <display:setProperty name="basic.msg.empty_list">
                                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                            </display:setProperty>
                        </display:table>
                    </fsn:pagedList>
                </div>
