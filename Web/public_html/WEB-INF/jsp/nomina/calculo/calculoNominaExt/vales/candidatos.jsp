<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html:form modelAttribute="valesNominaDTO">

<html:hidden path="anio"/>
<html:hidden path="diaHacendario"/>
<html:hidden path="strFecIni"/>
<html:hidden path="strFecFin"/>

    <h1>
        <spring:message code="sireh.label.nomina.calculo.vales.periodo.titulo" />
    </h1>
        <table width="75%" align="center" border="0">
        <tr><td></td></tr>
        <tr>
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.nomina.calculo.vales.header.periodo"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="center" width="100%" border="0">
                        <tr>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.incremento.label.fecIni"/>
                            </td>
                            <td align="left">
                                    <fsn:calendar path="fecIni" size="10"/>
                            </td>
                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.vales.label.fecFin"/>
                            </td>
                            <td align="left">
                                <fsn:calendar path="fecFin" size="10"/>
                            </td>
                        </tr>
                         <tr>
                             <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.vales.label.monto"/>
                            </td>
                            <td align="left">
                                <fsn:input path="monto" size="10"/>
                            </td>

                            <td align="right" class="label">
                                *&nbsp;
                                <spring:message code="sireh.label.nomina.calculo.vales.label.tiponomina"/>
                            </td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList items="${valesNominaDTO.listaTiposNomina}" path="tipoNomina"/>
                            </td>
                            <td align="right">
                            </td>
                            <td align="left">
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td align="left" height="20px" valign="middle">
                <spring:message code="sireh.form.required.fields"/>
            </td>
        </tr>
        <tr>
            <td>
                <table align="center" width="90%" border="0">
                    <tr>
                        <td align="right">
                                <fsn:submit value="submit.accept" progressBar="true"
                                            action="calculoNominaExt/valesAceptar"/>
                        </td>
                        <td align="left">
                            <fsn:submit value="submit.clean" progressBar="true"
                                        action="calculoNominaExt/valesClean"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <c:forEach items="${valesNominaDTO.listaTiposNomina}" var="itemKeyDTO" varStatus="status">
        <input type="hidden"  name="listaTiposNomina[<c:out value='${status.index}'/>].key" value="<c:out value='${itemKeyDTO.key}'/>" />        
        <input type="hidden"  name="listaTiposNomina[<c:out value='${status.index}'/>].value" value="<c:out value='${itemKeyDTO.value}'/>" />        
     </c:forEach>   
     
     <script type="text/javascript">
     var diaHacendario = "<c:out value='${valesNominaDTO.diaHacendario}'/>";
     var strFecIni = "<c:out value='${valesNominaDTO.strFecIni}'/>";
     var strFecFin = "<c:out value='${valesNominaDTO.strFecFin}'/>";

        $j(document).ready(function(){
            if ($j('#tipoNomina').val() == 2) {
                disabeDates();
            } else {
                enableDates();
            }
        });
     
        $j('#tipoNomina').change(function(){
            if ($j('#tipoNomina').val() == 2) {
                disabeDates();
            } else {
                enableDates();
            }
        });
        
        function disabeDates(){
            $j('#text_fecIni').val(diaHacendario.replace(".", "/").replace(".", "/"));
            $j('#text_fecFin').val(diaHacendario.replace(".", "/").replace(".", "/"));
            $j('#fecIni').val(diaHacendario.replace(".", "/").replace(".", "/"));
            $j('#fecFin').val(diaHacendario.replace(".", "/").replace(".", "/"));
            $j('#text_fecIni').attr('readonly', 'readonly')
            $j('#button_fecIni').hide();
            $j('#text_fecFin').attr('readonly', 'readonly')
            $j('#button_fecFin').hide();
        }
        function enableDates(){
            $j('#text_fecIni').removeAttr('readonly');
            $j('#button_fecIni').show();
            $j('#text_fecFin').removeAttr('readonly');
            $j('#button_fecFin').show();
            $j('#text_fecIni').val(strFecIni.replace(".", "/").replace(".", "/"));
            $j('#text_fecFin').val(strFecFin.replace(".", "/").replace(".", "/"));
            $j('#fecIni').val(strFecIni.replace(".", "/").replace(".", "/"));
            $j('#fecFin').val(strFecFin.replace(".", "/").replace(".", "/"));
        }
     </script>
</html:form>