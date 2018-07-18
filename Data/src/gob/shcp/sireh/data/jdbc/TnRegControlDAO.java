package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnRegControl;


/**
 * Data access interface for TnRegControl.
 */
public interface TnRegControlDAO extends JdbcDataService {
    /**
     * Find TnRegControl entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnRegControl
     */
    @FindById(TnRegControl.class)
    TnRegControl getById(gob.shcp.sireh.domain.jdbc.TnRegControlPK id);
    
    /**
     * Get all TnRegControl entities limited by a maximum number of elements.
     *
     * @return Collection of TnRegControl
     */
    @FindAll(TnRegControl.class)
    List<TnRegControl> findAll();
    
    /**
     * Make persistence of TnRegControl entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnRegControl
     */
    @Save
    void save(TnRegControl entity);
    
    /**
     * Remove TnRegControl entities.
     *
     * @param entity TnRegControl
     */
    @Delete
    void delete(TnRegControl entity);


    /**
     * Find the first TnRegControl entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="FEC_MODIFICO=?")
    TnRegControl getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnRegControl entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="FEC_MODIFICO=?")
    List<TnRegControl> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnRegControl entity that matches the condition 'where idRegControl is equals to'.
     *
     * @param idRegControl int
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="ID_REG_CONTROL=?")
    TnRegControl getByIdRegControl(int idRegControl);

    /**
     * Find all TnRegControl entities that matches the condition 'where idRegControl is equals to'.
     *
     * @param idRegControl int
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="ID_REG_CONTROL=?")
    List<TnRegControl> findByIdRegControl(int idRegControl);

    /**
     * Find the first TnRegControl entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="USUARIO=?")
    TnRegControl getByUsuario(java.lang.String usuario);

    /**
     * Find all TnRegControl entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="USUARIO=?")
    List<TnRegControl> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnRegControl entity that matches the condition 'where descRegControl is equals to'.
     *
     * @param descRegControl java.lang.String
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="DESC_REG_CONTROL=?")
    TnRegControl getByDescRegControl(java.lang.String descRegControl);

    /**
     * Find all TnRegControl entities that matches the condition 'where descRegControl is equals to'.
     *
     * @param descRegControl java.lang.String
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="DESC_REG_CONTROL=?")
    List<TnRegControl> findByDescRegControl(java.lang.String descRegControl);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcCapturaPermitida is equals to'.
     *
     * @param rcCapturaPermitida java.lang.String
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_CAPTURA_PERMITIDA=?")
    TnRegControl getByRcCapturaPermitida(java.lang.String rcCapturaPermitida);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcCapturaPermitida is equals to'.
     *
     * @param rcCapturaPermitida java.lang.String
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_CAPTURA_PERMITIDA=?")
    List<TnRegControl> findByRcCapturaPermitida(java.lang.String rcCapturaPermitida);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcConsecEmp is equals to'.
     *
     * @param rcConsecEmp java.lang.Integer
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_CONSEC_EMP=?")
    TnRegControl getByRcConsecEmp(java.lang.Integer rcConsecEmp);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcConsecEmp is equals to'.
     *
     * @param rcConsecEmp java.lang.Integer
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_CONSEC_EMP=?")
    List<TnRegControl> findByRcConsecEmp(java.lang.Integer rcConsecEmp);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcFecBaja is equals to'.
     *
     * @param rcFecBaja java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_BAJA=?")
    TnRegControl getByRcFecBaja(java.util.Date rcFecBaja);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcFecBaja is equals to'.
     *
     * @param rcFecBaja java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_BAJA=?")
    List<TnRegControl> findByRcFecBaja(java.util.Date rcFecBaja);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcFecLimCanc1 is equals to'.
     *
     * @param rcFecLimCanc1 java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_LIM_CANC1=?")
    TnRegControl getByRcFecLimCanc1(java.util.Date rcFecLimCanc1);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcFecLimCanc1 is equals to'.
     *
     * @param rcFecLimCanc1 java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_LIM_CANC1=?")
    List<TnRegControl> findByRcFecLimCanc1(java.util.Date rcFecLimCanc1);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcFecLimCanc2 is equals to'.
     *
     * @param rcFecLimCanc2 java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_LIM_CANC2=?")
    TnRegControl getByRcFecLimCanc2(java.util.Date rcFecLimCanc2);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcFecLimCanc2 is equals to'.
     *
     * @param rcFecLimCanc2 java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_LIM_CANC2=?")
    List<TnRegControl> findByRcFecLimCanc2(java.util.Date rcFecLimCanc2);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcFecLimEnter is equals to'.
     *
     * @param rcFecLimEnter java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_LIM_ENTER=?")
    TnRegControl getByRcFecLimEnter(java.util.Date rcFecLimEnter);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcFecLimEnter is equals to'.
     *
     * @param rcFecLimEnter java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_LIM_ENTER=?")
    List<TnRegControl> findByRcFecLimEnter(java.util.Date rcFecLimEnter);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcFecPago is equals to'.
     *
     * @param rcFecPago java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_PAGO=?")
    TnRegControl getByRcFecPago(java.util.Date rcFecPago);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcFecPago is equals to'.
     *
     * @param rcFecPago java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_PAGO=?")
    List<TnRegControl> findByRcFecPago(java.util.Date rcFecPago);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcFecPagoDep is equals to'.
     *
     * @param rcFecPagoDep java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_PAGO_DEP=?")
    TnRegControl getByRcFecPagoDep(java.util.Date rcFecPagoDep);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcFecPagoDep is equals to'.
     *
     * @param rcFecPagoDep java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_PAGO_DEP=?")
    List<TnRegControl> findByRcFecPagoDep(java.util.Date rcFecPagoDep);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcFecRetiro is equals to'.
     *
     * @param rcFecRetiro java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_RETIRO=?")
    TnRegControl getByRcFecRetiro(java.util.Date rcFecRetiro);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcFecRetiro is equals to'.
     *
     * @param rcFecRetiro java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FEC_RETIRO=?")
    List<TnRegControl> findByRcFecRetiro(java.util.Date rcFecRetiro);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcFin is equals to'.
     *
     * @param rcFin java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FIN=?")
    TnRegControl getByRcFin(java.util.Date rcFin);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcFin is equals to'.
     *
     * @param rcFin java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_FIN=?")
    List<TnRegControl> findByRcFin(java.util.Date rcFin);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcIni is equals to'.
     *
     * @param rcIni java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_INI=?")
    TnRegControl getByRcIni(java.util.Date rcIni);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcIni is equals to'.
     *
     * @param rcIni java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_INI=?")
    List<TnRegControl> findByRcIni(java.util.Date rcIni);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcLeyenda is equals to'.
     *
     * @param rcLeyenda java.lang.String
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_LEYENDA=?")
    TnRegControl getByRcLeyenda(java.lang.String rcLeyenda);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcLeyenda is equals to'.
     *
     * @param rcLeyenda java.lang.String
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_LEYENDA=?")
    List<TnRegControl> findByRcLeyenda(java.lang.String rcLeyenda);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcLeyendaEsp is equals to'.
     *
     * @param rcLeyendaEsp java.lang.String
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_LEYENDA_ESP=?")
    TnRegControl getByRcLeyendaEsp(java.lang.String rcLeyendaEsp);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcLeyendaEsp is equals to'.
     *
     * @param rcLeyendaEsp java.lang.String
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_LEYENDA_ESP=?")
    List<TnRegControl> findByRcLeyendaEsp(java.lang.String rcLeyendaEsp);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcReinTesofeDel is equals to'.
     *
     * @param rcReinTesofeDel java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_REIN_TESOFE_DEL=?")
    TnRegControl getByRcReinTesofeDel(java.util.Date rcReinTesofeDel);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcReinTesofeDel is equals to'.
     *
     * @param rcReinTesofeDel java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_REIN_TESOFE_DEL=?")
    List<TnRegControl> findByRcReinTesofeDel(java.util.Date rcReinTesofeDel);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcReinTesofeOfc is equals to'.
     *
     * @param rcReinTesofeOfc java.util.Date
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_REIN_TESOFE_OFC=?")
    TnRegControl getByRcReinTesofeOfc(java.util.Date rcReinTesofeOfc);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcReinTesofeOfc is equals to'.
     *
     * @param rcReinTesofeOfc java.util.Date
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_REIN_TESOFE_OFC=?")
    List<TnRegControl> findByRcReinTesofeOfc(java.util.Date rcReinTesofeOfc);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcTipoCambio is equals to'.
     *
     * @param rcTipoCambio java.lang.Double
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_TIPO_CAMBIO=?")
    TnRegControl getByRcTipoCambio(java.lang.Double rcTipoCambio);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcTipoCambio is equals to'.
     *
     * @param rcTipoCambio java.lang.Double
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_TIPO_CAMBIO=?")
    List<TnRegControl> findByRcTipoCambio(java.lang.Double rcTipoCambio);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcTipoNomina is equals to'.
     *
     * @param rcTipoNomina java.lang.String
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_TIPO_NOMINA=?")
    TnRegControl getByRcTipoNomina(java.lang.String rcTipoNomina);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcTipoNomina is equals to'.
     *
     * @param rcTipoNomina java.lang.String
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_TIPO_NOMINA=?")
    List<TnRegControl> findByRcTipoNomina(java.lang.String rcTipoNomina);

    /**
     * Find the first TnRegControl entity that matches the condition 'where rcVigente is equals to'.
     *
     * @param rcVigente java.lang.String
     * @return TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_VIGENTE=?")
    TnRegControl getByRcVigente(java.lang.String rcVigente);

    /**
     * Find all TnRegControl entities that matches the condition 'where rcVigente is equals to'.
     *
     * @param rcVigente java.lang.String
     * @return Collection of TnRegControl
     */
    @FindByCondition(value=TnRegControl.class, condition="RC_VIGENTE=?")
    List<TnRegControl> findByRcVigente(java.lang.String rcVigente);
}