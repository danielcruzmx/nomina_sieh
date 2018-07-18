<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="cargaPlantillaSARTercerosDTO" method="post" enctype="multipart/form-data">

    <h1><spring:message code="sireh.label.nomina.tercero.aportacion.plantilla.titulo"/></h1>
    
    <table align="center" width="100%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.tercero.cargaArchivos.textbox"/></td>
                            <td><fsn:option key="0" value="selectList.nonValue" /><fsn:selectList beanName="catalogoTerceros" path="idTercero"  progress="true"/></td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.tercero.aportacion.plantilla.archivo"/></td>
                            <td align="left"> 
                                <input type="file" name="file" id="file" value="file" size="50" />
                                <fsn:submit value="submit.procesar"  action="/sarFovissste/cargaPlantilla.do"/>
                                <html:hidden path="fileName" />
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
</html:form>