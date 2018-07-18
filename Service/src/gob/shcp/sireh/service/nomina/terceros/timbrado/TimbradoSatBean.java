package gob.shcp.sireh.service.nomina.terceros.timbrado;

import gob.shcp.fsn.service.AbstractBean;


import gob.shcp.sireh.domain.jdbc.CustomTnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;
import gob.shcp.sireh.model.nomina.terceros.ComponenteXmlDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.ComprobanteFiscalDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CorreoElectronicDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CorreoElectronicoDTO;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.rest.Respuesta;


import java.sql.Blob;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Stateless(name="TimbradoSat")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value=TransactionAttributeType.SUPPORTS)
public class TimbradoSatBean extends AbstractBean implements TimbradoSatService {

    public void enviarCorreoElectronico(CorreoElectronicoDTO correoElectronicoDTO){
        super.getService(TimbradoSatService.class).enviarCorreoElectronico(correoElectronicoDTO);
    }
    
    public void enviarCorreoElectronicoByEmpleado(CorreoElectronicDTO correoElectronicDTO){
        super.getService(TimbradoSatService.class).enviarCorreoElectronicoByEmpleado(correoElectronicDTO);
    }
    
    public void generarPDFdelXML(CorreoElectronicDTO correoElectronicDTO, HttpServletRequest request){
        super.getService(TimbradoSatService.class).generarPDFdelXML(correoElectronicDTO, request);
    }
    
    public void getListaFoliosByRfcAndQnaDesdeHasta(CorreoElectronicDTO correoElectronicDTO){
        super.getService(TimbradoSatService.class).getListaFoliosByRfcAndQnaDesdeHasta(correoElectronicDTO);
    }

	public List<TnComprobanteDigDTO> getCadenaOriginalByIdNomina(Integer idNomina) {
        return super.getService(TimbradoSatService.class).getCadenaOriginalByIdNomina(idNomina); 
    }
    
    public TnComprobanteDigDTO getTnComprobanteDigById(Integer cnFolio, Integer cnDifFolio, Integer cnPaqute) {
        return super.getService(TimbradoSatService.class).getTnComprobanteDigById( cnFolio, cnDifFolio, cnPaqute);
    }
    
    public void processSatGenerarCadenas(String rootPathAplication, int idNomina, String usuario){
        super.getService(TimbradoSatService.class).processSatGenerarCadenas(rootPathAplication, idNomina, usuario);
    }
    
    public void processSatSelloTnComprobanteDig(int idNomina, List<ComponenteXmlDTO> listaComponenteXmlDTO, boolean valido){
        super.getService(TimbradoSatService.class).processSatSelloTnComprobanteDig(idNomina, listaComponenteXmlDTO, valido); 
    }

    public void processSatIntegrarXmlFirma(String roothPath, int idNomina, String usuario) {
        super.getService(TimbradoSatService.class).processSatIntegrarXmlFirma(roothPath, idNomina, usuario); 
    }
    
    public void updateIntegrarXmlFirmaFolio(int idNomina, int cnFolio, int cnDifFolio, int cnPaquete, String usuario){
        super.getService(TimbradoSatService.class).updateIntegrarXmlFirmaFolio( idNomina,  cnFolio,  cnDifFolio,  cnPaquete,  usuario);
    }
    
    public void processSatRespuestaSatRecepcion(Integer idNomina, Respuesta respuestaSat){
        super.getService(TimbradoSatService.class).processSatRespuestaSatRecepcion(idNomina, respuestaSat);
    }
    
    public void processSatRespuestaSatRecepcionByFolio(Integer idNomina, Respuesta respuestaSat){
        super.getService(TimbradoSatService.class).processSatRespuestaSatRecepcionByFolio(idNomina, respuestaSat);
    }
    public void processSatRespuestaSatConsulta(Integer idNomina, Respuesta respuestaSat){
        super.getService(TimbradoSatService.class).processSatRespuestaSatConsulta(idNomina, respuestaSat);
    }
    
    public void processSatRespuestaSatConsultaByFolio(Integer idNomina, Respuesta respuestaSat){
        super.getService(TimbradoSatService.class).processSatRespuestaSatConsultaByFolio(idNomina, respuestaSat);
    }
    public void enviarCorreosMasivo(Integer idNomina, String rootPathAplication){
        super.getService(TimbradoSatService.class).enviarCorreosMasivo(idNomina, rootPathAplication);
    }
    
    public void generarPdfDeCfdi(ComprobanteFiscalDTO comprobanteFiscalDTO, HttpServletRequest request, HttpServletResponse response, String patron){
        super.getService(TimbradoSatService.class).generarPdfDeCfdi(comprobanteFiscalDTO, request, response, patron);
    }

    public TnComprobanteDigDTO getTnComprobanteDigById(int cnFolio, int cnDifFolio, int cnPaquete){
        return super.getService(TimbradoSatService.class).getTnComprobanteDigById( cnFolio, cnDifFolio, cnPaquete);
    }
    
    public void updateEstatus(int idNomina) {
        super.getService(TimbradoSatService.class).updateEstatus(idNomina);
    }
    
    public void previsualizaCorreoByRfc(CorreoElectronicDTO correoElectronicDTO){
        super.getService(TimbradoSatService.class).previsualizaCorreoByRfc(correoElectronicDTO);
    }
    
    public void updateCadenaOriginal(String roothPath, int idNomina, int cnFolio, int cnDifFolio, int cnPaquete, String usuario) {
        super.getService(TimbradoSatService.class).updateCadenaOriginal(roothPath, idNomina, cnFolio, cnDifFolio, cnPaquete, usuario);
    }


    public void updateTnComprobanteDig(TnComprobanteDigDTO tnComprobanteDigDTO) {
        super.getService(TimbradoSatService.class).updateTnComprobanteDig(tnComprobanteDigDTO);
    }

    public void updateCustomTnComprobanteDig(CustomTnComprobanteDig customTnComprobanteDig) {
        super.getService(TimbradoSatService.class).updateCustomTnComprobanteDig(customTnComprobanteDig);
    }
    
    
}
