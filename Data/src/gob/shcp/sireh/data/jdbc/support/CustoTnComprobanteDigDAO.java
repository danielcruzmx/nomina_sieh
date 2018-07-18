package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import gob.shcp.sireh.domain.jdbc.CustomTnComprobanteDig;


import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;

import gob.shcp.sireh.domain.jdbc.nomina.terceros.TnComprobanteDigCorreo;

import java.util.List;


public interface CustoTnComprobanteDigDAO extends DataService {
    
    public TnComprobanteDig getTnComprobanteDigById(int cnFolio, int cnDifFolio, int cnPaquete);
    public void insertTnComprobanteDig(List<CustomTnComprobanteDig> listaCustomTnComprobanteDig);
    
    public List<TnComprobanteDig> getTnComprobanteDigByUuid(String uuid, int cnPaquete);
    
     public List<TnComprobanteDigCorreo> getComprobantesByIdNomina(Integer idNomina);
    public void updateTimbradoTnComprobanteDig(final List<CustomTnComprobanteDig> list);
    public void updateTnComprobanteDig(final CustomTnComprobanteDig customTnComprobanteDig);
    public void updateXmlGeneradoTnComprobanteDig(final List<CustomTnComprobanteDig> list);
    public void updateSituacionTnComprobanteDig(final List<TnComprobanteDig> list, final String estatusActual);
    public void updateSituacionAndPaqueteRv(final List<TnComprobanteDig> list, final String estatusActual);
    public void updateEnviadoTnComprobanteDig(final List<TnComprobanteDig> list);
    public List<TnComprobanteDig> getCadenaOriginalByIdNomina(Integer idNomina);
    public List<TnComprobanteDig> getFoliosByIdNomina(Integer idNomina);
    public void updateSelloTnComprobanteDig(final int idNomina, final List<TnComprobanteDig> list);
    public List<TnComprobanteDig> getXmlSelloByIdNomina(Integer idNomina) ;
    public void deleteByCnConsecNomina(int idNomina, int cnPaquete);
}
