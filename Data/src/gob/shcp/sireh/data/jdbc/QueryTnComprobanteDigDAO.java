package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.CorreoElectronic;

import gob.shcp.sireh.domain.jdbc.CustomTnConceptoPagadoXML;
import gob.shcp.sireh.domain.jdbc.CustomTnHistoricoPagoXML;
import gob.shcp.sireh.domain.jdbc.FolioTnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;


import gob.shcp.sireh.domain.jdbc.TnConceptoPagado;

import java.util.List;

public interface QueryTnComprobanteDigDAO extends TnComprobanteDigDAO {

    @FindByNamedQuery(name = "updateEstatus", value = TnComprobanteDig.class)
    void updateEstatus(Integer cnConsecNomina, Integer cnPaquete, String cnSituacion);
    
    @FindByNamedQuery(name = "foliosByRfcAndQnaDesdeHastaFromTnComprobanteFiscal", value = FolioTnComprobanteDig.class)
    List<FolioTnComprobanteDig> getFoliosByRfcAndQnaDesdeHasta(String rfc, String qnaIni, String qnaFin);
    
    @FindByNamedQuery(name = "foliosByRfcAndQnaDeadeHastaFromTnConceptoPagado_p37", value = TnConceptoPagado.class)
    List<TnConceptoPagado> getFoliosByRfcAndQnaDesdeHastaCptoP37(String folio);
    
    @FindByNamedQuery(name = "foliosByRfcAndQnaDeadeHastaFromTnConceptoPagado_d0a", value = TnConceptoPagado.class)
    List<TnConceptoPagado> getFoliosByRfcAndQnaDesdeHastaCpto0A(String folio);
    
    @FindByNamedQuery(name = "getImagenTag", value = CorreoElectronic.class)
    List<CorreoElectronic> getImagenTagForEnvioCFDIbyRfc();
    
    @FindByNamedQuery(name="findHistoricoPagoAnexo20ByIdNomina", value=CustomTnHistoricoPagoXML.class)
    List<CustomTnHistoricoPagoXML> getHistoricoPagoAnexo20ByIdNomina(Integer idNomina);
    
    @FindByNamedQuery(name="getHistoricoAnexo20ByIdNominaAndFolio", value=CustomTnHistoricoPagoXML.class)
    List<CustomTnHistoricoPagoXML> getHistoricoAnexo20ByIdNominaAndFolio(Integer idNomina, Integer hpFolio);
    
    @FindByNamedQuery(name="findConceptosPagadosAnexo20ByIdNomina", value=CustomTnConceptoPagadoXML.class)
    List<CustomTnConceptoPagadoXML> getConceptosPagadosAnexo20ByIdNomina(Integer idNomina);
    
    @FindByNamedQuery(name="getConceptosAnexo20ByIdNominaAndFolio", value=CustomTnConceptoPagadoXML.class)
    List<CustomTnConceptoPagadoXML> getConceptosAnexo20ByIdNominaAndFolio(Integer idNomina, Integer hpFolio);
    
    @FindByNamedQuery(name="num_pagos_por_nomina", value=CustomTnConceptoPagadoXML.class)
    List<CustomTnConceptoPagadoXML> numeroDePagosByNomina(String idNomina);

}
