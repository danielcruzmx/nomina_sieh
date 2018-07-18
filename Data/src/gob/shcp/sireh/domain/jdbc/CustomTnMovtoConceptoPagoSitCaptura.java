package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;

import java.io.Serializable;


import java.util.Date;

public class CustomTnMovtoConceptoPagoSitCaptura extends TnMovtoConceptoPago implements Domain, 
                                                                                        Serializable {

    private java.lang.String descSitCaptura;

    public CustomTnMovtoConceptoPagoSitCaptura() {
    }

    public CustomTnMovtoConceptoPagoSitCaptura(java.lang.String descSitCaptura, 
                                               java.lang.Long idMovtoConceptoPago, 
                                               java.lang.String idTercero, 
                                               java.util.Date fecModifico, 
                                               java.lang.String usuario, 
                                               java.lang.String idConcepto, 
                                               java.lang.String idSitCaptura, 
                                               java.lang.String idTipoCpto, 
                                               java.util.Date mcpFecFinAdeudo, 
                                               java.util.Date mcpFecIncidencia, 
                                               java.util.Date mcpFecIniAdeudo, 
                                               java.lang.Integer mcpHorasDias, 
                                               java.lang.Double mcpMonto, 
                                               java.lang.Double mcpMontoAdeudo, 
                                               java.lang.Float mcpPorcentaje, 
                                               java.lang.Integer mcpQnasAdeudo, 
                                               java.lang.Integer mcpQnaAplicadas, 
                                               java.lang.Integer mcpQnaADescontar, 
                                               java.lang.Integer mcpQnaCancelo, 
                                               java.lang.Integer mcpQnaCaptura, 
                                               java.lang.Integer mcpQnaFin, 
                                               java.lang.Integer mcpQnaIni, 
                                               java.lang.String mcpRefCancela, 
                                               java.lang.String mcpRefCaptura, 
                                               java.lang.String mcpRfc, 
                                               java.lang.Integer mcpUltQnaProcesa) {
        super(idMovtoConceptoPago, idTercero, fecModifico, usuario, idConcepto, 
              idSitCaptura, idTipoCpto, mcpFecFinAdeudo, mcpFecIncidencia, 
              mcpFecIniAdeudo, mcpHorasDias, mcpMonto, mcpMontoAdeudo, 
              mcpPorcentaje, mcpQnasAdeudo, mcpQnaAplicadas, mcpQnaADescontar, 
              mcpQnaCancelo, mcpQnaCaptura, mcpQnaFin, mcpQnaIni, 
              mcpRefCancela, mcpRefCaptura, mcpRfc, mcpUltQnaProcesa);

        this.descSitCaptura = descSitCaptura;
    }

    public void setDescSitCaptura(String descSitCaptura) {
        this.descSitCaptura = descSitCaptura;
    }

    public String getDescSitCaptura() {
        return descSitCaptura;
    }


}
