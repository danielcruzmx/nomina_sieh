<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="curricPubDTO">
    <h1><spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.consulta.title"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="60%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Datos del Empleado&nbsp;&nbsp; </strong></legend>
                    <table align="left" width="40%">
  <!--                      <tr>
                            <td colspan="4">&nbsp;</td>
                        </tr>    -->
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.rfcEmpleado"/></td>
                            <td align="left"><fsn:label path="rfcEmpleado"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.nombreEmpleado"/></td>
                            <td align="left"><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.primerApellido"/></td>
                            <td align="left"><fsn:label path="primerApellido"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.complementarios.segundoApellido"/></td>
                            <td align="left"><fsn:label path="segundoApellido"/></td>
                        </tr>
<!--                            <td colspan="4">&nbsp;</td>
                        </tr> -->
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/><br/>
    <table align="center" width="60%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Escolaridad del Empleado&nbsp;&nbsp;</strong></legend>
                    <table align="left" width="50%">
<!--                        <tr><td colspan="4">&nbsp;</td></tr>  -->
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.escolaridad"/></td>
<!--                            <td align="left" width="60%"><fsn:input path="escolaridad" size="20" uppercase="true"/></td> -->
                            <td align="left">
                                <html:select path="escolaridad" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="NINGUNO"/>
                                    <html:option value="1" label="PREESCOLAR O KINDER"/>
                                    <html:option value="2" label="PRIMARIA"/>
                                    <html:option value="3" label="SECUNDARIA"/>
                                    <html:option value="4" label="PREPARATORIA O BACHILLERATO"/>
                                    <html:option value="5" label="BACHILLERATO TECNICO O ESPECIALIZADO"/>
                                    <html:option value="6" label="CARRERA TECNICA O COMERCIAL"/>
                                    <html:option value="7" label="TECNICO SUPERIOR UNIVERSITARIO"/>
                                    <html:option value="8" label="LICENCIATURA O PROFESIONAL"/>
                                    <html:option value="9" label="POSGRADO"/>
                                    <html:option value="10" label="MAESTRIA"/>
                                    <html:option value="11" label="DOCTORADO"/>
                                    <html:option value="12" label="POSDOCTORADO"/>
                                </html:select>
                            </td>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.gradoavance"/></td>
<!--                            <td align="left" width="60%"><fsn:input path="gradoAvancee" size="20" uppercase="true"/></td> -->
                            <td align="left">
                                <html:select path="gradoAvancee" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="CONCLUIDO"/>
                                    <html:option value="1" label="EN CURSO"/>
                                    <html:option value="2" label="PASANTE"/>
                                    <html:option value="3" label="TRUNCO"/>
                                </html:select>
                            </td>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.doctoesc"/></td>
<!--                            <td align="left" width="60%"><fsn:input path="doctoEsc" size="20" uppercase="true"/></td> -->
                            <td align="left">
                                <html:select path="doctoEsc" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="CERTIFICADO"/>
                                    <html:option value="1" label="COMPROBANTE"/>
                                    <html:option value="2" label="EN CURSO"/>
                                    <html:option value="3" label="TITULO"/>
                                </html:select>
                            </td>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.inseduc"/></td>
                            <td align="left" width="60%"><fsn:input path="instEduc" size="100" maxlength="100" uppercase="true"/></td>
<!--                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/> <fsn:selectList beanName="tcInstEducativa" path="instEduc" progress="true"  style="width: 100px;"/>
                            </td>      -->
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.carrera"/></td>
<!--                            <td align="left" width="60%"><fsn:input path="instEduc" size="100" uppercase="true"/></td> -->
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/> <fsn:selectList beanName="tcProfnCarreraCurriculo" path="carrera" progress="true"  style="width: 350px;"/>
                            </td>      
                        </tr>
                        <tr>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="60%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Cursos Tomados por el Empleado&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="50%">
 <!--                       <tr><td colspan="4">&nbsp;</td></tr>    -->
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.curso"/></td>
                            <td align="left" width="60%"><fsn:input path="curso1" maxlength="150" size="100" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.instituto"/></td>
                            <td align="left" width="60%"><fsn:input path="instituto1" size="100" maxlength="100" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="50%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.duracion"/></td>
                            <td align="left" width="50%"><fsn:input path="duracion1" size="25" maxlength="25" uppercase="true"/></td>
                            <td align="right" class="label" width="25%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.gradoavance"/></td>
<!--                            <td align="left" width="25%"><fsn:input path="gradoAvancec1" size="25" uppercase="true"/></td> -->
                            <td align="left">
                                <html:select path="gradoAvancec1" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="CONCLUIDO"/>
                                    <html:option value="1" label="EN CURSO"/>
                                    <html:option value="2" label="TRUNCO"/>
                                </html:select>
                            </td>
                            <td align="right" class="label" width="25%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.doctoesc"/></td>
<!--                            <td align="left" width="25%"><fsn:input path="doctoCur1" size="20" uppercase="true"/></td> -->
                            <td align="left">
                                <html:select path="doctoCur1" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="CERTIFICADO"/>
                                    <html:option value="1" label="COMPROBANTE"/>
                                    <html:option value="2" label="EN CURSO"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.curso"/></td>
                            <td align="left" width="60%"><fsn:input path="curso2" maxlength="150" size="100" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.instituto"/></td>
                            <td align="left" width="60%"><fsn:input path="instituto2" size="100" maxlength="100" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="50%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.duracion"/></td>
                            <td align="left" width="50%"><fsn:input path="duracion2" size="25" maxlength="25" uppercase="true"/></td>
                            <td align="right" class="label" width="25%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.gradoavance"/></td>
<!--                            <td align="left" width="25%"><fsn:input path="gradoAvancec2" size="25" uppercase="true"/></td> -->
                            <td align="left">
                                <html:select path="gradoAvancec2" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="CONCLUIDO"/>
                                    <html:option value="1" label="EN CURSO"/>
                                    <html:option value="2" label="TRUNCO"/>
                                </html:select>
                            </td>
                            <td align="right" class="label" width="25%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.doctoesc"/></td>
<!--                            <td align="left" width="25%"><fsn:input path="doctoCur2" size="20" uppercase="true"/></td> -->
                            <td align="left">
                                <html:select path="doctoCur2" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="CERTIFICADO"/>
                                    <html:option value="1" label="COMPROBANTE"/>
                                    <html:option value="2" label="EN CURSO"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.curso"/></td>
                            <td align="left" width="60%"><fsn:input path="curso3" maxlength="150" size="100" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.instituto"/></td>
                            <td align="left" width="60%"><fsn:input path="instituto3" size="100" maxlength="100" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="50%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.duracion"/></td>
                            <td align="left" width="50%"><fsn:input path="duracion3" size="25" maxlength="25" uppercase="true"/></td>
                            <td align="right" class="label" width="25%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.gradoavance"/></td>
<!--                            <td align="left" width="25%"><fsn:input path="gradoAvancec3" size="25" uppercase="true"/></td> -->
                            <td align="left">
                                <html:select path="gradoAvancec3" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="CONCLUIDO"/>
                                    <html:option value="1" label="EN CURSO"/>
                                    <html:option value="2" label="TRUNCO"/>
                                </html:select>
                            </td>
                            <td align="right" class="label" width="25%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.doctoesc"/></td>
<!--                            <td align="left" width="25%"><fsn:input path="doctoCur3" size="20" uppercase="true"/></td>  -->
                            <td align="left">
                                <html:select path="doctoCur3" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="CERTIFICADO"/>
                                    <html:option value="1" label="COMPROBANTE"/>
                                    <html:option value="2" label="EN CURSO"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="60%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Experiencia Laboral del Empleado&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="50%">
<!--                        <tr><td colspan="4">&nbsp;</td></tr>   -->
                        <tr>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.sector"/></td>
                            <td align="left">
                                <html:select path="sector1" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="PUBLICO"/>
                                    <html:option value="1" label="PRIVADO"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.puesto"/></td>
                            <td align="left" width="20%"><fsn:input path="puesto1" size="50" maxlength="50" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.lugar"/></td>
                            <td align="left" width="40%"><fsn:input path="lugar1" size="100" maxlength="200" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.area"/></td>
                            <td align="left" width="60%"><fsn:input path="area1" size="100" maxlength="200" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.funcion"/></td>
                            <td align="left" width="60%"><fsn:input path="funcion1" size="100" maxlength="100" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.fecini"/></td>
                            <td align="left" width="20%"><fsn:input path="fecIni1" size="10" maxlength="10"/></td>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.fecfin"/></td>
                            <td align="left" width="20%"><fsn:input path="fecFin1" size="10" maxlength="10"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="30%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.sector"/></td>
                            <td align="left">
                                <html:select path="sector2" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="PUBLICO"/>
                                    <html:option value="1" label="PRIVADO"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.puesto"/></td>
                            <td align="left" width="20%"><fsn:input path="puesto2" size="50" maxlength="50" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.lugar"/></td>
                            <td align="left" width="40%"><fsn:input path="lugar2" size="100" maxlength="200" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.area"/></td>
                            <td align="left" width="60%"><fsn:input path="area2" size="100" maxlength="200" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.funcion"/></td>
                            <td align="left" width="60%"><fsn:input path="funcion2" size="100" maxlength="100" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.fecini"/></td>
                            <td align="left" width="20%"><fsn:input path="fecIni2" size="10" maxlength="10"/></td>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.fecfin"/></td>
                            <td align="left" width="20%"><fsn:input path="fecFin2" size="10" maxlength="10"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="30%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.sector"/></td>
                            <td align="left">
                                <html:select path="sector3" cssClass="uppercase">
                                    <html:option value="" label="SELECCIONE"/>
                                    <html:option value="0" label="PUBLICO"/>
                                    <html:option value="1" label="PRIVADO"/>
                                </html:select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.puesto"/></td>
                            <td align="left" width="20%"><fsn:input path="puesto3" size="50" maxlength="50" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.lugar"/></td>
                            <td align="left" width="40%"><fsn:input path="lugar3" size="100" maxlength="200" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.area"/></td>
                            <td align="left" width="60%"><fsn:input path="area3" size="100" maxlength="200" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="40%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.funcion"/></td>
                            <td align="left" width="60%"><fsn:input path="funcion3" size="100" maxlength="100" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.fecini"/></td>
                            <td align="left" width="20%"><fsn:input path="fecIni3" size="10" maxlength="10"/></td>
                            <td align="right" class="label" width="20%">&nbsp;<spring:message code="sireh.label.oficinaVirtual.expediente.curriculum.fecfin"/></td>
                            <td align="left" width="20%"><fsn:input path="fecFin3" size="10" maxlength="10"/></td>
                        </tr>
                        <tr>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
         <table align="center" width="100%">
            <tr>
                <td align="center"><fsn:submit value="submit.accept" action="expediente/updateCurriculumPublico.do"/></td>
                <td align="left"><fsn:submit value="submit.cancel" path="cancel" action="expediente/curriculumPublico.do"/></td>
            </tr>
        </table>
</html:form>
