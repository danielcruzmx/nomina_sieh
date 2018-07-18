<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<table width="100%">
    <tr>
        <td align="center">    
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text=" Protecci&oacute;n de"/>
                        <img class="fotografia" width="85" src="<spring:theme code="logoinai2.jpg"/>"  align="middle"/>     
                        <spring:message text="Datos Personales "/>
                    </strong>
                </legend>
                <table width="100%">
                    <tr> 
                        <td>&nbsp;</td> <td>&nbsp;</td>
                        <td align="center" style="color: darkblue; font-size: 1.2em;">
                            <i>Los datos personales recabados ser&aacute;n protegidos, e incorporados y tratados en el Sistema de datos personales denominado Sistema de Informaci&oacute;n  y  Administraci&oacute;n de Recursos Humanos, con fundamento en la Ley Federal de Transparencia y Acceso a la Informaci&oacute;n P&uacute;blica Gubernamental, su Reglamento as&iacute; como en los Lineamientos de Protecci&oacute;n de Datos Personales, y cuya finalidad es contar con la informaci&oacute;n necesaria de los servidores p&uacute;blicos que laboran o han laborado en la Secretar&iacute;a de Hacienda y Cr&eacute;dito P&uacute;blico, para otorgar de manera correcta y oportuna, los servicios a los que tienen derecho as&iacute; como el pago de n&oacute;mina correspondiente. </br> </br>
                            Dicho sistema  fue registrado en el Listado de sistemas de datos personales ante el Instituto Nacional de Transparencia, Acceso a la Informaci&oacute;n y Protecci&oacute;n de Datos Personales y los datos personales contenidos, podr&aacute;n ser transmitidos a las Unidades Administrativas de la Dependencia y a las Instituciones relacionadas con las prestaciones y derechos de los trabajadores, a fin de que se encuentren en posibilidad de cumplir con sus obligaciones, conforme a lo establecido en las leyes y normatividad correspondiente, adem&aacute;s de otras transmisiones previstas en la Ley. </br> </br>
                            La Unidad Administrativa responsable del sistema de datos personales es la Direcci&oacute;n General de Recursos Humanos y el domicilio donde el interesado podr&aacute; ejercer los derechos de acceso y correcci&oacute;n ante la misma, es en Calzada de la Virgen N&uacute;m. 2799, Edificio 'B', Planta Baja, Colonia CTM Culhuac&aacute;n, Delegaci&oacute;n Coyoac&aacute;n, CP 04480, M&eacute;xico, DF.  </br> </br>
                            Lo anterior se informa en cumplimiento del Decimo s&eacute;ptimo de los Lineamientos de Protecci&oacute;n de Datos Personales, publicados en el Diario Oficial de  la Federaci&oacute;n del 30 de septiembre del 2005. </i>
                        </td>
                    </tr>
                    <tr> <td>&nbsp;</td> </tr>
                </table>
            </fieldset>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<br/>