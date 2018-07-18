<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<fsn:configuration var="PKI_WEB_RESOURCES_URL"/>
<html:form modelAttribute="muestraFirmaElectronicaDTO">
    
    <p style="text-align: left; font-weight: bold;">Ingrese los siguientes datos: </p>
    &nbsp;
    
    <table align="center">        
        <tr>
            <td>               
                <script type="text/javascript">
                    var params = new Array(1);
                    params[0] = "opcType";
                    params[1] = "showRfc";
                    params[2] = "showCurp";
                    
                    var values = new Array(1); 
                    values[0] = "0";
                    values[1] = "true";
                    values[2] = "false";
                    
                    var appletTags = getDefaultAppletTag("PKI", "<c:out value="${PKI_WEB_RESOURCES_URL}"/>", 620, 350, params, values);
                    document.writeln("<br/>" + appletTags);
                </script>
            </td>
        </tr>
        <tr>
            <td>
                <html:hidden path="signatureData" id="signatureData"/>
                <textarea id="areaSignatureData" cols="45" rows="20" disabled="true" style="display:none;"><c:out value="${muestraFirmaElectronicaDTO.contentSignatureData[0]}"/></textarea>
                
                <html:hidden path="certificateData" id="certificateData"/>
                <textarea id="areaCertificateData" cols="45" rows="20" disabled="true" style="display:none;"><c:out value="${muestraFirmaElectronicaDTO.certificateData}"/></textarea>
                
                <html:hidden path="outData" id="outData"/>
                <textarea id="signers" cols="45" rows="20" disabled="true" style="display:none;"></textarea>
            </td>
        </tr>
        <%--tr>
            <td>
                Firma:
                <html:hidden path="signatureData" id="signatureData"/>
                <textarea id="areaSignatureData" cols="45" rows="20"><c:out value="${muestraFirmaElectronicaDTO.contentSignatureData[0]}"/></textarea>
                
                Certificado:
                <html:hidden path="certificateData" id="certificateData"/>
                <textarea id="areaCertificateData" cols="45" rows="20" disabled="true"><c:out value="${muestraFirmaElectronicaDTO.certificateData}"/></textarea>
                
                Respuesta:
                <html:hidden path="outData" id="outData"/>
                <textarea id="signers" cols="45" rows="20" readonly="readonly"></textarea>
            </td>
        </tr--%>
    </table>
    
    <script type="text/javascript">
        function getResult() {
            var certificateCURP = document.getElementById("PKI").getCertificateCURP(0);
            var certificateRFC = document.getElementById("PKI").getCertificateRFC(0);
            var certificateSN = document.getElementById("PKI").getCertificateSerialNumber(0);
            var certificateExpireDate = document.getElementById("PKI").getCertificateExpireDate(0);
            var sizeCertificates = certificateCURP.length;
            
            if (certificateCURP!=null && certificateCURP!="" && certificateRFC!=null && certificateRFC!="" && certificateSN!=null && certificateSN!="" && certificateExpireDate!=null && certificateExpireDate!="") {
                document.getElementById("signatureData").value = document.getElementById("PKI").getContent()[0];
                document.getElementById("areaSignatureData").value = document.getElementById("signatureData").value;
                
                var certData = document.getElementById("certificateData");
                certData.value = document.getElementById("PKI").getCertificate();
                document.getElementById("areaCertificateData").value = certData.value;
                document.getElementById("signers").value = certificateCURP[0] + "-" + certificateRFC[0] + "-" + certificateSN[0] + "-" + certificateExpireDate[0] + "\n";
                
                var idComprobante = '<c:out value="${muestraFirmaElectronicaDTO.idComprobante}"/>';
                var rfcEmpleado = '<c:out value="${muestraFirmaElectronicaDTO.rfcEmpleado}"/>';
                var idPaquete = '<c:out value="${muestraFirmaElectronicaDTO.idPaquete}"/>';
                window.location.href = 'getComprobantePDFCallback.do?idComprobante=' + idComprobante + '&rfcEmpleado=' + rfcEmpleado + '&idPaquete=' + idPaquete;
                
                closeDivFirma();
            }
        }
        
        function clearForm() {
            var certTxt = document.getElementById("areaCertificateData");
            var signTxt = document.getElementById("areaSignatureData");
            var signHid = document.getElementById("signatureData");
            var certHid = document.getElementById("certificateData");
            
            document.getElementById("areaSignatureData").value = "";
            document.forms[0].signatureData.value = "";
            document.getElementById("areaCertificateData").value = "";
            document.getElementById("outData0").value = "";
            document.forms[0].outData.value = "";
            document.getElementById("signers").value = "";
            
            document.forms[0].certificateData.value = "";
        }
        
        function closeDivFirma() {
            var onCloseFunction = "";
            if (onCloseFunction.length > 0) {
                window.parent.eval(onCloseFunction);
            }
            
            $j("#frameFirma").load(function() {
                $j(this).contents().find("#listTimbrado").trigger("reloadGrid");
            });

            window.parent.document.getElementById('divFirma').style.visibility = "hidden";
        }
    </script>
</html:form>