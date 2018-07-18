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
                        <td align="left" style="color: darkblue; font-size: 1.2em;">
                            <i>La informaci&oacute;n contenida en este m&oacute;dulo, es de uso exclusivamente oficial y se deber&aacute;n  adoptar las medidades necesarias para garantizar su protecci&oacute;n.</br> </br>
                            LEY FEDERAL DE TRANSPARENCIA Y ACCESO A LA INFORMACION PUBLICA GUBERNAMENTAL </br> </br>
                            Art&iacute;culo 21. Los sujetos obligados no podr&aacute;n difundir, distribuir o comercializar los datos personales contenidos en los sistemas de informaci&oacute;n, desarrollados en el ejercicio de sus funciones, salvo que haya mediado el consentimiento expreso, por escrito o por un medio de autenticaci&oacute;n similar, de los individuos a que haga referencia la informaci&oacute;n.  </br> </br>
                        </td>
                    </tr>
                    <tr> <td>&nbsp;</td> </tr>
                </table>
            </fieldset>
        </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<br/>