<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>


<html:form modelAttribute="ruspBajaDTO">
    
    <h1><strong>
            <spring:message code="gestion.rusp"/> &#45;
            <spring:message code="gestion.interfaz"/> &#45; 
            <spring:message code="gestion.informacionBasicaRusp"/>
    </strong></h1>

    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Parametros de consulta&nbsp;&nbsp; </strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr> <td colspan="2">&nbsp;</td> </tr>
                        <tr> 
                            <td align="right" class="label" width="20%">* Ciclo</td>
                            <td align="left" colspan="2">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCiclos-Basica-Rusp"
                                                path="rbCiclo"/>
                            </td>
                        </tr>
                        <tr> 
                            <td align="right" class="label" width="20%">* Quincena</td>
                            <td align="left" colspan="2">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdQuincenas-Basica-Rusp"  
                                                path="rbQnaPago"
                                                progress="true"
                                                parentPath="rbCiclo"
                                                style="width: 100px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" valign="middle" height="20px" align="left">
                            <b>* Campos requeridos</b>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>

    <table width="100%">
          <tr align="center">
              <td>
                  <fsn:submit value="submit.accept" 
                              path="muestraReporte"
                              action="gestionRusp/interfazInfoBasica.do"
                              progressIcon="false"/>
                  <fsn:submit value="submit.cancel" 
                              path="cancel" 
                              progressIcon="false"
                              action="gestionRusp/interfazInfoBasica.do"/>
              </td>
          </tr>
    </table>

    <c:if test="${(ruspBajaDTO.rbQnaPago != 0 && ruspBajaDTO.rbQnaPago != null)}">
        <table>
            <tr>
                <th align="left"></th>
            </tr>
            <tr>
                <td align="left">
                <fsn:reportParam name="P_QNA" value="${ruspBajaDTO.rbQnaPago}"/>
                <fsn:report provider="jasper" 
                            viewUri="/rusp/informacionBasica"
                            imagesUri="/images/reports" 
                            format="pdf" 
                            fileName="informacionBasica"
                            export="xls,pdf,csv,rtf,xml,docx,pptx,txt" 
                            width="1060" 
                            height="350"/>
                </td>
            </tr>
        </table>
    </c:if>
    <c:if test="${(ruspBajaDTO.rbQnaPago != 0 && ruspBajaDTO.rbQnaPago != null)}">
        <table align="center" width="100%" border="0">
             <tr>
                 <td align="center" width="60%">
                   <fsn:submit value="genera" 
                               path="genera"
                               action="gestionRusp/generaInfoBasica.do"
                               progressIcon="false"/>
                 </td>
             </tr>
        </table>
    </c:if>
   
 </html:form>
