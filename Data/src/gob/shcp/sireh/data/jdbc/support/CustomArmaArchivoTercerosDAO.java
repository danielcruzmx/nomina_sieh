package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import gob.shcp.sireh.domain.jdbc.PadronFonac;

import java.util.List;
import java.util.Map;

public interface CustomArmaArchivoTercerosDAO extends DataService {

    /**
     * DAO para obtener la informacion de nómina para armar el archivo de terceros
     * @author Roberto Muñoz
     * @param idTercero, datTipoCpto, datConcepto, hpQnaPago, hpQnaPagoFin, hpConsecNomina, agrupaVerEmp, estadoPago 
     * @return Lista, Datos del archivo
     */
    List<Map<Integer, Object>> getDatosTerceros(String idTercero, String datTipoCpto, String datConcepto, Integer hpQnaPago, Integer hpQnaPagoFin, String hpConsecNomina, String agrupaVerEmp, String estadoPago) throws Exception;
    
    public void exeSpTerceroFonacot(Integer qnaIni, Integer qnaFin, Integer ciclo, Integer mes);
    
    public void exeSpAcumConcentrPercepDeduc(Integer idNomina);
    
    public void bajaPadronFonac(PadronFonac padronFonac);
    
    public void padronFonacOrdinario(PadronFonac padronFonac);
    
    public void padronFonacExtraOrdinario(PadronFonac padronFonac);
    
}
