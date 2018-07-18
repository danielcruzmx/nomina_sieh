package gob.shcp.sireh.service.nomina.terceros;

import gob.shcp.fsn.service.BusinessService;



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

import javax.ejb.Local;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Local
public interface TercerosNominaService extends BusinessService {

    public List<DatosArchivoDTO> parseFile(CargaArchivoDTO cargaArchivoDTO) ;
    public List<TcTerceroDTO>  getAll();
    public ResultadoDTO insertMovtoConceptoPago(CargaArchivoDTO cargaArchivoDTO);
    public ResultadoDTO insertMovtoCptoPagoCtrAsistencia(CargaArchivoDTO cargaArchivoDTO);
    public ResultadoDTO insertMovtoConceptoPagoFonacot(CargaArchivoDTO cargaArchivoDTO);
    public boolean existsFileXML(String idTercero);
    public TcTerceroDTO getByIdTercero(String IdTercero);
    public boolean isQuincenaNon();
    public Blob getFile(int idNomina, String file);
    
    public void processSatGenerarPaquteXml(String roothPath, String idQna, Integer hpQnaPago, String version, String usuario);
    

    
    public String numeroDePagosByNomina(String idNomina);


    public List<String> descargaDescomprimeZipTimbrado(long idNomina, List<byte[]> listaArchivosZip, String localTempDir);
    
    public Map<String,byte[]> processSatPaqueteTimbradoSAT(String archivoPaquete, String archivoReporte, String archivoCancela, Integer idNomina, Integer cnPaquete, Integer cnPaqueteRv, String localTempDir, String usuario);
    
    public void processSatTnComprobantesPdf(ArchivosTimbrePdfDTO archivosTimbrePdfDTO);
    
    
    
    public List<TnComprobantePdfDTO> findTnComprobantePdfById(List<Integer> listFolios, Integer cnDifFolio);
    
    public byte[] generarArchivoCancelacion(Integer idNomina, Integer cnPaquete);
    
    
    
    
    

    
    
    
    
}
