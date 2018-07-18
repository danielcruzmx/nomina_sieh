<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<html:form name="checkBoxTest" modelAttribute="datosBasicosDTO" action="obtieneCurp.do">
    <h1><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="55%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.rusp.movimiento.datosBasicosDTO.datosEmpleado"/></strong></legend>
                    <table align="center" width="100%">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.rfcEmpleado"/></td>
                            <td align="left"><fsn:label path="rfcEmpleado"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.rfcUnico"/></td>
                            <td align="left"><fsn:label path="rfcUnico"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.primerApellido"/></td>
                            <td align="left"><fsn:label path="primerApellido"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.segundoApellido"/></td>
                            <td align="left"><fsn:label path="segundoApellido"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.nombreEmpleado"/></td>
                            <td align="left"><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <p>&nbsp;</p>

    <table align="center" width="55%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.lengua.header"/></strong></legend>
                    <fsn:filter property="rl.trl_rfc" condition="=" path="rfcEmpleado" />
                    <fsn:pagedList beanName="lenguaByRfc" checkbox="true" chkProperty="idLengua" baseUrl="obtieneCurp">
                        <display:table name="lenguaByRfc" form="checkBoxTest" class="displaytag" requestURI="${requestURI}" pagesize="10" decorator="checkboxTableDecorator" export="false" id="row" sort="list">
                            <display:column titleKey="sireh.label.rusp.movimiento.selecciona">   
                                <input name="idLengua"
                                       class="box"
                                       type="checkbox"
                                       value='<c:out value="${row.trlLengua}"/>' />
                            </display:column>
                            <display:column titleKey="sireh.label.rusp.movimiento.lengua" sortable="true" property="trlLengua"/>
                            <display:column titleKey="sireh.label.rusp.movimiento.lengua.descripcion" sortable="true" property="descLengua"/>
                            <display:column titleKey="sireh.label.rusp.movimiento.tipo" sortable="true" property="tipolengua"/>
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="false"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </fsn:pagedList>
                </fieldset>
            </td>
        </tr>
    </table>

    <table align="center" width="50%">
        <tr>
            <td colspan="4">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <fsn:submit value="submit.add" path="addlengua" action="gestionRusp/addLengua.do" />
                <fsn:submit value="submit.delete" path="dellengua" action="gestionRusp/deleteLengua.do"/>
            </td>
        </tr>
    </table>

    <p>&nbsp;</p>

    <table align="center" width="55%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.curpHijos.header"/></strong></legend>
                    <fsn:filter property="rh.trh_rfc" condition="=" path="rfcEmpleado" />
                    <fsn:pagedList beanName="curpHijosByRfc" checkbox="true" chkProperty="idHijos" baseUrl="obtieneCurp">
                        <display:table name="curpHijosByRfc" form="checkBoxTest" class="displaytag" requestURI="${requestURI}" pagesize="10" decorator="checkboxTableDecorator" export="false" id="row" sort="list">
                            <display:column titleKey="sireh.label.rusp.movimiento.selecciona">   
                                <input name="idHijos"
                                       class="box"
                                       type="checkbox"
                                       value='<c:out value="${row.trhCurp}"/>' />
                            </display:column>
                            <display:column titleKey="sireh.label.rusp.movimiento.selecciona" property="trhCurp"/> <!--paramId="idHijos" href="getCurpHijo.do?rfcEmpleado=${datosBasicosDTO.rfcEmpleado}&curpHijo=${idHijos}" -->
                            <display:column titleKey="sireh.label.rusp.movimiento.nombreHijo" property="nombreHijo"/>
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="false"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </fsn:pagedList>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="50%">
        <tr>
            <td colspan="4">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <fsn:submit value="submit.add" path="addcurp" action="gestionRusp/addCurp.do" />
                <fsn:submit value="submit.cancel" path="cancel" action="gestionRusp/gestionDatos.do"/>
                <fsn:submit value="submit.delete" path="delcurp" action="gestionRusp/deleteCurpHijos.do"/>
            </td>
        </tr>
    </table>

</html:form>
