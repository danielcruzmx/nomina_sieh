package gob.shcp.sireh.data.jdbc;


import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindByNamedQuery;


import gob.shcp.sireh.domain.jdbc.TnNomina;

import java.util.List;

public interface QueryTnNominaDAO extends TnNominaDAO{
    @FindByCondition( value=TnNomina.class, condition="NOM_QNA_CAPTURA = ? AND ID_TIPO_NOMINA = ?")
    List<TnNomina> findByQnaCapturaSinTipoNomina(Integer nom_qna_captura, String id_tipo_nomina);
    
    @FindByCondition( value=TnNomina.class, condition="NOM_QNA_CAPTURA = ? AND NOM_NUM_COMPLEM = ? AND ID_TIPO_NOMINA = ?")
    List<TnNomina> findByQnaCapturaComplementoTipo(Integer nom_qna_captura, String nom_num_complem, String id_tipo_nomina);
}
