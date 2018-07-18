<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'> 
                    <strong>
                        <spring:message text=" Datos "/>
                        <img class="fotografia" width="95" src="<spring:theme code="casa.jpg"/>"  align="middle"/>
                        <spring:message text="Personales "/>
                    </strong> 
                </legend>

                <table width="100%">
                    <tr>
                        <td>
                            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'> 
                                <strong><spring:message text=" Datos de Contacto"/></strong> </legend>
                                <table>
                                    <tr>
                                        <td>
                                            <img class="fotografia" alt="Fotografia" width="85" src='/resources/images/empleados/<c:out value="${expedienteDTO.rfcEmpleado}"/>.jpg'/>
                                        </td>
                                        <td>
                                            <table width="100%">
                                                <tr> <td>&nbsp;</td> </tr>
                                                <tr align="left" >
                                                    <td class="label"> <spring:message code="sireh.label.expediente.domicilio"></spring:message> </td>
                                                    <td align="left" colspan="3"> <fsn:label path="domicilio"/> </td>
                                                </tr>
                                                <tr align="left">
                                                    <td class="label" width="250"> <spring:message code="sireh.label.expediente.telefono"></spring:message> </td>
                                                    <td width="250"> <fsn:label path="telefono"/> </td>
                                                    <td class="label" width="250"> <spring:message code="sireh.label.expediente.emailp"></spring:message> </td>
                                                    <td width="250"> <fsn:label path="emailp"/> </td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr> <tr> <td>&nbsp;</td> </tr>
                    <tr> <td>&nbsp;</td> </tr>
                    <tr>
                        <td>
                            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                                    <strong><spring:message text=" RFC y CURP "/></strong>
                                </legend>
                                <table  width="100%">
                                    <tr> <td>&nbsp;</td> </tr>
                                    <tr>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.rfcEmpleado"></spring:message> </td>
                                        <td align="left" width="250"> <fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina name="rfc" rfc="${expedienteDTO.rfcEmpleado}" image="detail.gif" /></td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.curpEmpleado"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="curpEmpleado"/> </td>
                                    </tr>
                                    <tr> <td>&nbsp;</td> </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr> 
                    <tr>
                        <td>
                            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                                    <strong><spring:message text=" Datos de cuentas bancarias "/></strong>
                                </legend>
                                <table  width="100%">
                                    <tr> <td>&nbsp;</td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.bancoSar"></spring:message> </td>
                                        <td align="left" width="250"> <fsn:label path="bancoSar"/> </td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.bancoEmp"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="bancoEmp"/> </td>
                                    </tr>
                                    <tr> <td>&nbsp;</td> </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                    <tr> <td>&nbsp;</td> </tr>
                    <tr>
                        <td>
                            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                                    <strong><spring:message text=" Fechas de movimiento en la APF "/></strong>
                                </legend>
                                <table  width="100%">
                                    <tr> <td>&nbsp;</td> </tr>
                                    <tr align="left">
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.ingresoGobFed"></spring:message> </td>
                                        <td align="left" width="250"> <fsn:label path="ingresoGobFed"/> </td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.ingresoDependencia"></spring:message> </td>
                                        <td align="left" width="250"> <fsn:label path="ingresoDependencia"/> </td>
                                    </tr>
                                    <tr>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.fecIngSpc"></spring:message> </td>
                                        <td align="left" width="250"> <fsn:label path="fecIngSpc"/> </td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.fecIniDeclPatr"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="fecIniDeclPatr"/> </td>
                                    </tr>
                                    <tr> <td>&nbsp;</td> </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                    <tr> <td>&nbsp;</td> </tr>
                    <tr>
                        <td>
                            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                                    <strong><spring:message text=" Datos personales complementarios "/></strong>
                                </legend>
                                <table  width="100%">
                                    <tr> <td>&nbsp;</td> </tr>
                                    <tr align="left">
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.genero"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="genero"/> </td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.edoCivil"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="edoCivil"/> </td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.padreMadre"></spring:message> </td>
                                        <td align="left" width="250"> <fsn:label path="padreMadre"/> </td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.discapacidad"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="discapacidad"/> </td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.fecNacimiento"></spring:message> </td>
                                        <td align="left" width="250"> <fsn:label path="labelFecNacimiento"/> </td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.edad"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="edad"/> </td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.edoNac"></spring:message> </td>
                                        <td align="left" width="250"> <fsn:label path="edoNac"/> </td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.nacionalidad"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="nacionalidad"/> </td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.numIssste"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="numIssste"/> </td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.imssIssste"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="imssIssste"/> </td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.instProtCivil"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="instProtCivil"/> </td>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.espProtCivil"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="espProtCivil"/> </td>
                                    </tr>
                                    <tr>
                                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.idRusp"></spring:message> </td>
                                        <td align="left" width="250">  <fsn:label path="idRusp"/>
                                        </td>
                                    </tr>
                                    <tr> <td>&nbsp;</td> </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                </table>
            </fieldset>
        </td>
    </tr>
</table>
<br/>