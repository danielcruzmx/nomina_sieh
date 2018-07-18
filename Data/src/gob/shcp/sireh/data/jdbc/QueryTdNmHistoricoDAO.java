package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.CustomTdNmHistorico;
import gob.shcp.sireh.domain.jdbc.TdNmHistorico;

import java.util.List;

public interface QueryTdNmHistoricoDAO extends TdNmHistoricoDAO {
    /**
     * Metodo encargado de obtener el máximo de remesa por cilco y causal
     * @author Victor Pérez
     * @param nmh_ciclo Integer
     * @param nmh_causal Integer
     * @return tdNmHistorico TdNmHistorico
     */
    @FindByNamedQuery(name = "selectMaxRemesaPorCicloYCausal", value = TdNmHistorico.class)
    List<TdNmHistorico> getMaxRemesaPorCicloYCausal(Integer nmh_ciclo, Integer nmh_causal);

    /**
     * Metodo encargado de obtener notas de mérito por ciclo
     * @author Victor Pérez
     * @param remesa String
     * @param nmh_causal Integer
     * @param nmh_ciclo Integer
     * @return tdNmHistorico TdNmHistorico
     */
    @FindByNamedQuery(name = "tnTdNmHistoricoFindByCausalCiclo", value = CustomTdNmHistorico.class)
    List<CustomTdNmHistorico> findNotaMeritoHistorico(Integer nmh_causal, Integer nmh_ciclo);
    
    @FindByNamedQuery(name = "tnTdNmHistoricoFindByRfcCiclo", value = CustomTdNmHistorico.class)
    List<CustomTdNmHistorico> findByRfcCicloNotaMeritoHistorico(String nmh_rfc_unico, Integer nmh_ciclo);
    
    @FindByNamedQuery(name = "tnTdNmHistoricoFindByRfcCausalCiclo", value = CustomTdNmHistorico.class)
    List<CustomTdNmHistorico> findByRfcCausalCicloNotaMeritoHistorico(String nmh_rfc_unico, Integer nmh_causal, Integer nmh_ciclo);
    
    /**
     * Metodo encargado de obtener notas de mérito por ciclo, causal y remesa específicada
     * @author Oscar Sánchez
     * @param nmp_op String
     * @param nmh_cve_causal Integer
     * @param nmh_ciclo Integer
     * @return tdNmHistorico TdNmHistorico
     */
    @FindByNamedQuery(name = "tnTdNmHistoricoFindByRemesaCausalCiclo", value = CustomTdNmHistorico.class)
    List<CustomTdNmHistorico> findByRemesaNotaMeritoHistorico(String nmp_op, Integer nmh_cve_causal, Integer nmh_ciclo);

    /**
     * Metodo encargado de obtener los años donde el empleado ha tenido notas de Mérito para conocer su consecutividad
     * @author Victor Pérez
     * @param nmh_rfc_unico String
     * @return customTdNmHistorico CustomTdNmHistorico
     */
    @FindByNamedQuery(name = "tcAnosDeConsecutividad", value = CustomTdNmHistorico.class)
    List<CustomTdNmHistorico> selectAnosConsecutividad(String nmh_rfc_unico);

    /**
     * Metodo encargado de obtener los años donde el empleado ha tenido notas de Mérito para conocer su consecutividad por causal
     * @author Victor Pérez
     * @param nmh_rfc_unico String
     * @return customTdNmHistorico CustomTdNmHistorico
     */
    @FindByNamedQuery(name = "tcAnosDeConsecutividadYCausal", value = CustomTdNmHistorico.class)
    List<CustomTdNmHistorico> selectAnosConsecutividadYCausal(String nmh_rfc_unico);

    /**
     * Metodo encargado de obtener rfc que no esten actualizados de la tabla de Histórico contra la tabla de Empleado
     * @author Victor Pérez
     * @param nmp_id String
     * @return customTdNmHistoricoList List<CustomTdNmHistorico>
     */
    @FindByNamedQuery(name = "selectMeritoActualizaRfcContraHistorico", value = CustomTdNmHistorico.class)
    List<CustomTdNmHistorico> selectMeritoActualizaRfcContraHistorico();

    /**
     * Metodo encargado de obtener rfc que no esten actualizados de la tabla de Histórico contra la tabla de Empleado en el Proceso de cálculo de consecutividad
     * @author Victor Pérez
     * @param nmp_id String
     * @return customTdNmHistoricoList List<CustomTdNmHistorico>
     */
    @FindByNamedQuery(name = "selectMeritoActualizaRfcProcesoNmHistorico", value = CustomTdNmHistorico.class)
    List<CustomTdNmHistorico> selectMeritoActualizaRfcProcesoNmHistorico();
}
