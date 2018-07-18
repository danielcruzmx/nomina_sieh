package gob.shcp.sireh.service.nomina.terceros.timbrado;

import gob.shcp.fsn.service.BusinessService;


import gob.shcp.sireh.domain.jdbc.CustomTnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;
import gob.shcp.sireh.model.nomina.terceros.ComponenteXmlDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.ComprobanteFiscalDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CorreoElectronicDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CorreoElectronicoDTO;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.rest.Respuesta;

import java.sql.Blob;

import java.util.List;

import javax.ejb.Local;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Local
public interface TimbradoSatService extends BusinessService {
    public void enviarCorreoElectronico(CorreoElectronicoDTO correoElectronicoDTO);
    public void enviarCorreoElectronicoByEmpleado(CorreoElectronicDTO correoElectronicDTO);
    public void generarPDFdelXML(CorreoElectronicDTO correoElectronicDTO, HttpServletRequest request);
    public void getListaFoliosByRfcAndQnaDesdeHasta(CorreoElectronicDTO correoElectronicDTO);
    public List<TnComprobanteDigDTO> getCadenaOriginalByIdNomina(Integer idNomina);
    public void processSatGenerarCadenas(String rootPathAplication, int idNomina, String usuario);
    public void processSatSelloTnComprobanteDig(int idNomina, List<ComponenteXmlDTO> listaComponenteXmlDTO, boolean valido);
    public void updateCustomTnComprobanteDig(CustomTnComprobanteDig customTnComprobanteDig);
    public void updateTnComprobanteDig(TnComprobanteDigDTO tnComprobanteDigDTO);
    public void processSatIntegrarXmlFirma(String roothPath, int idNomina, String usuario);
    public void updateIntegrarXmlFirmaFolio(int idNomina, int cnFolio, int cnDifFolio, int cnPaquete, String usuario);
    public void processSatRespuestaSatRecepcion(Integer idNomina, Respuesta respuestaSat);
    public void processSatRespuestaSatRecepcionByFolio(Integer idNomina, Respuesta respuestaSat);
    public void processSatRespuestaSatConsulta(Integer idNomina, Respuesta respuestaSat);
    public void processSatRespuestaSatConsultaByFolio(Integer idNomina, Respuesta respuestaSat);
    public void enviarCorreosMasivo(Integer idNomina, String rootPathAplication);
    public void generarPdfDeCfdi(ComprobanteFiscalDTO comprobanteFiscalDTO, HttpServletRequest request, HttpServletResponse response, String patron);
    public void updateEstatus(int idNomina);
    public TnComprobanteDigDTO getTnComprobanteDigById(int cnFolio, int cnDifFolio, int cnPaquete);
    public void previsualizaCorreoByRfc(CorreoElectronicDTO correoElectronicDTO);
    public void updateCadenaOriginal(String roothPath, int idNomina, int cnFolio, int cnDifFolio, int cnPaquete, String usuario);
}
