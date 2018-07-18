package gob.shcp.sireh.service.nomina.terceros;


import gob.shcp.fsn.service.AbstractBean;



import gob.shcp.sireh.model.TcTerceroDTO;



import gob.shcp.sireh.model.nomina.terceros.ArchivosTimbrePdfDTO;
import gob.shcp.sireh.model.nomina.terceros.CargaArchivoDTO;
import gob.shcp.sireh.model.nomina.terceros.DatosArchivoDTO;

import gob.shcp.sireh.model.nomina.terceros.ResultadoDTO;


import gob.shcp.sireh.model.nomina.terceros.TnComprobantePdfDTO;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;

import java.sql.Blob;

import java.util.List;

import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Stateless(name="TercerosNomina")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value=TransactionAttributeType.SUPPORTS)
public class TercerosNominaBean extends AbstractBean implements TercerosNominaService {


    public List<DatosArchivoDTO> parseFile(CargaArchivoDTO cargaArchivoDTO) {
        return super.getService(TercerosNominaService.class).parseFile(cargaArchivoDTO);
    }

    public List<TcTerceroDTO> getAll() {
        return super.getService(TercerosNominaService.class).getAll();
    }

    public ResultadoDTO insertMovtoConceptoPago(CargaArchivoDTO cargaArchivoDTO) {
        return super.getService(TercerosNominaService.class).insertMovtoConceptoPago(cargaArchivoDTO);
    }
     
    public ResultadoDTO insertMovtoCptoPagoCtrAsistencia(CargaArchivoDTO cargaArchivoDTO) {
        return super.getService(TercerosNominaService.class).insertMovtoCptoPagoCtrAsistencia(cargaArchivoDTO);
    }
    
    public ResultadoDTO insertMovtoConceptoPagoFonacot(CargaArchivoDTO cargaArchivoDTO) {
        return super.getService(TercerosNominaService.class).insertMovtoConceptoPagoFonacot(cargaArchivoDTO);
    }

    public boolean existsFileXML(String idTercero) {
        return  super.getService(TercerosNominaService.class).existsFileXML(idTercero);
    }

    public TcTerceroDTO  getByIdTercero(String IdTercero) {
       return  super.getService(TercerosNominaService.class).getByIdTercero(IdTercero);
    }

    public boolean isQuincenaNon() {
        return  super.getService(TercerosNominaService.class).isQuincenaNon();
    }


    public Blob getFile(int idNomina, String file) {
        return super.getService(TercerosNominaService.class).getFile(idNomina, file);
    }
    
    public void processSatGenerarPaquteXml(String roothPath, String idQna, Integer hpQnaPago, String version, String usuario){
        super.getService(TercerosNominaService.class).processSatGenerarPaquteXml(roothPath, idQna, hpQnaPago, version, usuario);
    }
    
    
    
    //public void generarPdfDeCfdi(ComprobanteFiscalDTO comprobanteFiscalDTO, HttpServletRequest request, HttpServletResponse response, String patron){
    //    super.getService(TercerosNominaService.class).generarPdfDeCfdi(comprobanteFiscalDTO, request, response, patron);
    //}
    
    public String numeroDePagosByNomina(String idNomina){
        return super.getService(TercerosNominaService.class).numeroDePagosByNomina(idNomina);
    }
    
    public List<String> descargaDescomprimeZipTimbrado(long idNomina, List<byte[]> listaArchivosZip, String localTempDir){
        return super.getService(TercerosNominaService.class).descargaDescomprimeZipTimbrado(idNomina, listaArchivosZip, localTempDir);
    }

    public Map<String,byte[]> processSatPaqueteTimbradoSAT(String archivoPaquete, String archivoReporte, String archivoCancela, Integer idNomina, Integer cnPaquete, Integer cnPaqueteRv, String localTempDir, String usuario){
        return super.getService(TercerosNominaService.class).processSatPaqueteTimbradoSAT(archivoPaquete, archivoReporte, archivoCancela, idNomina, cnPaquete, cnPaqueteRv, localTempDir, usuario);
    }

    public void processSatTnComprobantesPdf(ArchivosTimbrePdfDTO archivosTimbrePdfDTO) {
        super.getService(TercerosNominaService.class).processSatTnComprobantesPdf(archivosTimbrePdfDTO);
    }
    
    public List<TnComprobantePdfDTO> findTnComprobantePdfById(List<Integer> listFolios, Integer cnDfifFolio){
        return super.getService(TercerosNominaService.class).findTnComprobantePdfById(listFolios, cnDfifFolio);
    }
    
    public byte[] generarArchivoCancelacion(Integer idNomina, Integer cnPaquete){
        return super.getService(TercerosNominaService.class).generarArchivoCancelacion(idNomina, cnPaquete);
    }
    

    
    
    

    
}
