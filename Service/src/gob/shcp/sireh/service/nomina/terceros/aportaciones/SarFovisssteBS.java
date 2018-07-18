package gob.shcp.sireh.service.nomina.terceros.aportaciones;

import com.blackbear.flatworm.ConfigurationReader;
import com.blackbear.flatworm.FileFormat;
import com.blackbear.flatworm.errors.FlatwormConfigurationValueException;
import com.blackbear.flatworm.errors.FlatwormUnsetFieldValueException;

import gob.shcp.sireh.data.jdbc.QueryTdSarNvoDAO;
import gob.shcp.sireh.data.jdbc.TdSarNvoDAO;
import gob.shcp.sireh.data.jdbc.support.CustomConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.support.CustomSarFovisssteDAO;

import gob.shcp.sireh.domain.jdbc.CustomOutputFile;

import gob.shcp.sireh.domain.jdbc.TdSarNvo;
import gob.shcp.sireh.model.TdSarNvoDTO;
import gob.shcp.sireh.model.nomina.terceros.DatosArchivoDTO;
import gob.shcp.sireh.model.nomina.terceros.aportaciones.CargaPlantillaSARTercerosDTO;
import gob.shcp.sireh.service.AbstractSirehService;

import gob.shcp.sireh.service.parser.ParserFlatFile;

import java.io.File;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Business Service encargado de atender solicitudes correspondientes al proceso SAR-FOVISSSTE.
 */
public class SarFovisssteBS extends AbstractSirehService implements SarFovisssteService {
    
    /**
     * Metodo encargado de procesar el periodo SAR-FOVISSSTE.
     * @author Oscar S.
     * @param nominas String
     * @param bimestre Integer
     */
    public void procesaSARFOV(String nominas, Integer bimestre) {
        super.persistence().get(CustomSarFovisssteDAO.class).procesaSARFOV(nominas, bimestre);
    }
    
    /**
     * Metodo encargado de obtener String para generar el archivo de intercambio del proceso SAR-FOVISSSTE.
     * @author Oscar S.
     * @param tipoArchivo String
     * @return listaString List<String>
     */
    public List<String> generaArchivoIntercambio(String tipoArchivo) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        
        if (tipoArchivo.equals("1")) {
            items = super.persistence().get(QueryTdSarNvoDAO.class).funcAltasSarFOV();
            logger.debug("***********");
        } else if (tipoArchivo.equals("2")) {
            items = super.persistence().get(QueryTdSarNvoDAO.class).funcBajasSarFOV();
        } else if (tipoArchivo.equals("3")) {
            itemsHeader = super.persistence().get(QueryTdSarNvoDAO.class).funcCambiosSarFOV(1);
            items = super.persistence().get(QueryTdSarNvoDAO.class).funcCambiosSarFOV(2);
        } else  if (tipoArchivo.equals("4")) {
                items = super.persistence().get(QueryTdSarNvoDAO.class).funcAnexoSarFOV();
        } else {
            items = super.persistence().get(QueryTdSarNvoDAO.class).funcDetalleSarFOV();
        }
        
        if (items != null) {
            if (tipoArchivo.equals("3")) {
                for (CustomOutputFile header: itemsHeader) {
                    listaString.add(header.getRegistro());
                }
            }
            for (CustomOutputFile row: items) {
                listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }
    
    public String procesarArchivo(CargaPlantillaSARTercerosDTO cargaPlantillaSARTercerosDTO){
        Long  version     = super.persistence().get(CustomConceptoPagoDAO.class).getSnVersion();
        Long  ciclo       = Long.parseLong(super.getQuincenaCaptura().getAnio());
        Integer     mes         = (Integer.parseInt(super.getQuincenaCaptura().getQuincena()) + 1) / 2;
        String      usuario     = super.identity().get().getUserID();
        Integer     bimestre    = null;
        Integer     registros   = null;
        
        if((mes == 2) || (mes == 3) ){ bimestre = 1; }
        if((mes == 4) || (mes == 5) ){ bimestre = 2; }
        if((mes == 6) || (mes == 7) ){ bimestre = 3; }
        if((mes == 8) || (mes == 9) ){ bimestre = 4; }
        if((mes == 10) || (mes == 11) ){ bimestre = 5; }
        if((mes == 12) ){ bimestre = 6; }
        if((mes == 1) ) { bimestre = 6;  ciclo = ciclo - 1; }
        
        List<DatosArchivoDTO> listaDatosDTO =  null;
        ParserFlatFile parserFlatFile; 
        String rutaTemplate = super.configuration().getString("terceros.templates.dir");
        String extension =  super.configuration().getString("terceros", "EXTENSION_XML") ;
        try {
            String templateFileXml =  rutaTemplate + File.separator + cargaPlantillaSARTercerosDTO.getDescTercero() + extension;
            ConfigurationReader parser = new ConfigurationReader();
            FileFormat ff = parser.loadConfigurationFile(templateFileXml);
            parserFlatFile = new ParserFlatFile();
            parserFlatFile.setFf(ff);
            parserFlatFile.setFormat(cargaPlantillaSARTercerosDTO.getDescTercero());
            listaDatosDTO =   parserFlatFile.parseFile(cargaPlantillaSARTercerosDTO.getFile().getInputStream(), DatosArchivoDTO.class);
        } catch (FlatwormConfigurationValueException e) { return null; } 
          catch (FlatwormUnsetFieldValueException e) { return null; }  
          catch (Exception e) { return null; }
          
        if(listaDatosDTO.size() > 0){
            for(DatosArchivoDTO registro:listaDatosDTO){
                TdSarNvoDTO tdSarNvoDTO = new TdSarNvoDTO();
                tdSarNvoDTO.setFecModifico(new Date());
                tdSarNvoDTO.setUsuario(usuario);
                //tdSarNvoDTO.setIdSarNvo(null);
                tdSarNvoDTO.setSnCiclo(ciclo);
                tdSarNvoDTO.setSnVersion(version);
                tdSarNvoDTO.setSnSarBimestre(bimestre.toString().trim());
                tdSarNvoDTO.setSnTipoMovto(registro.getReferencia().substring(0, 1).trim());
                tdSarNvoDTO.setSnRfc(registro.getReferencia().substring(17, 30).trim());
                tdSarNvoDTO.setSnCurp(registro.getReferencia().substring(30, 48).trim());
                tdSarNvoDTO.setSnNssIssste(registro.getReferencia().substring(48, 59).trim());
                tdSarNvoDTO.setSnPrimerApellido(registro.getReferencia().substring(59, 99).trim());
                tdSarNvoDTO.setSnSegundoApellido(registro.getReferencia().substring(99, 139).trim());
                tdSarNvoDTO.setSnNombre(registro.getReferencia().substring(139, 179).trim());
                tdSarNvoDTO.setSnPagaduria(registro.getReferencia().substring(12, 17).trim());
                tdSarNvoDTO.setSnReparto(registro.getReferencia().substring(179, 199).trim());
                tdSarNvoDTO.setSnFecNac(registro.getReferencia().substring(199, 207).trim());
                tdSarNvoDTO.setIdEdoNac(registro.getReferencia().substring(207, 209).trim());
                tdSarNvoDTO.setIdGenero(registro.getReferencia().substring(209, 210).trim());
                tdSarNvoDTO.setIdEdoCivil(registro.getReferencia().substring(210, 211).trim());
                tdSarNvoDTO.setSnCalleParti(registro.getReferencia().substring(211, 271).trim());
                tdSarNvoDTO.setSnColoniaParti(registro.getReferencia().substring(271, 301).trim());
                tdSarNvoDTO.setIdMunicipio(registro.getReferencia().substring(301, 331).trim());
                tdSarNvoDTO.setSnCodPost(registro.getReferencia().substring(331, 336).trim());
                tdSarNvoDTO.setIdEdoParti(registro.getReferencia().substring(336, 338).trim());
                tdSarNvoDTO.setSnNombramiento(registro.getReferencia().substring(338, 339).trim());
                tdSarNvoDTO.setSnNumEmpleado(registro.getReferencia().substring(339, 349).trim());
                tdSarNvoDTO.setIdEdoReceptora(registro.getReferencia().substring(349, 352).trim());
                tdSarNvoDTO.setSnTrabajadorRegAfore(registro.getReferencia().substring(352, 353).trim());
                tdSarNvoDTO.setSnFecIngrDep(registro.getReferencia().substring(353, 361).trim());
                tdSarNvoDTO.setSnFecCotizaIssste(registro.getReferencia().substring(361, 369).trim());
                tdSarNvoDTO.setSnCredFovissste(registro.getReferencia().substring(369, 370).trim());
                tdSarNvoDTO.setSnDiasCotizadosBim(registro.getReferencia().substring(370, 373).trim());
                tdSarNvoDTO.setSnDiasIncapacidadBim(registro.getReferencia().substring(373, 376).trim());
                tdSarNvoDTO.setSnDiasAusentismoBim(registro.getReferencia().substring(376, 379).trim());
                tdSarNvoDTO.setSnSdoBasicoAmorFovissste(registro.getReferencia().substring(379, 386).trim());
                tdSarNvoDTO.setSnSdoBasicoCotizaRcv(registro.getReferencia().substring(386, 393).trim());
                tdSarNvoDTO.setSnSdoBasicoCotizaFovissste(registro.getReferencia().substring(393, 400).trim());
                // tdSarNvoDTO.setSnImpAhorroSol(registro.getReferencia().substring(389, 390).trim());
                tdSarNvoDTO.setSnAportAhorroSol(registro.getReferencia().substring(400, 401).trim());
                tdSarNvoDTO.setSnImpAhorroSol(registro.getReferencia().substring(401, 408).trim());

                TdSarNvo TdSarNvo = super.transformation().map(tdSarNvoDTO, TdSarNvo.class);
                super.persistence().get(TdSarNvoDAO.class).save(TdSarNvo);
            }
            registros = new Integer(listaDatosDTO.size());
        } else {  registros = new Integer(0);  }
        
        if(listaDatosDTO == null){   cargaPlantillaSARTercerosDTO.setError("  Error en el parseo del archivo: listaDatosDTO = null;  TercerosNominaBS.obtenerListaDatosDTO():125");    }
        return  registros + "-" +  version;
    }
}
