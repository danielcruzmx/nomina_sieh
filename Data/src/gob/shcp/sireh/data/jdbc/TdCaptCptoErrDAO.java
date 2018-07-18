package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdCaptCptoErr;


/**
 * Data access interface for TdCaptCptoErr.
 */
public interface TdCaptCptoErrDAO extends JdbcDataService {
    /**
     * Find TdCaptCptoErr entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdCaptCptoErr
     */
    @FindById(TdCaptCptoErr.class)
    TdCaptCptoErr getById(java.lang.Integer id);
    
    /**
     * Get all TdCaptCptoErr entities limited by a maximum number of elements.
     *
     * @return Collection of TdCaptCptoErr
     */
    @FindAll(TdCaptCptoErr.class)
    List<TdCaptCptoErr> findAll();
    
    /**
     * Make persistence of TdCaptCptoErr entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdCaptCptoErr
     */
    @Save
    void save(TdCaptCptoErr entity);
    
    /**
     * Remove TdCaptCptoErr entities.
     *
     * @param entity TdCaptCptoErr
     */
    @Delete
    void delete(TdCaptCptoErr entity);


    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where cceMonto is equals to'.
     *
     * @param cceMonto java.lang.Double
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_MONTO=?")
    TdCaptCptoErr getByCceMonto(java.lang.Double cceMonto);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where cceMonto is equals to'.
     *
     * @param cceMonto java.lang.Double
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_MONTO=?")
    List<TdCaptCptoErr> findByCceMonto(java.lang.Double cceMonto);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where cceNombre is equals to'.
     *
     * @param cceNombre java.lang.String
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_NOMBRE=?")
    TdCaptCptoErr getByCceNombre(java.lang.String cceNombre);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where cceNombre is equals to'.
     *
     * @param cceNombre java.lang.String
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_NOMBRE=?")
    List<TdCaptCptoErr> findByCceNombre(java.lang.String cceNombre);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where ccePorcen is equals to'.
     *
     * @param ccePorcen java.lang.Float
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_PORCEN=?")
    TdCaptCptoErr getByCcePorcen(java.lang.Float ccePorcen);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where ccePorcen is equals to'.
     *
     * @param ccePorcen java.lang.Float
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_PORCEN=?")
    List<TdCaptCptoErr> findByCcePorcen(java.lang.Float ccePorcen);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where cceQnaCapt is equals to'.
     *
     * @param cceQnaCapt java.lang.Integer
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_QNA_CAPT=?")
    TdCaptCptoErr getByCceQnaCapt(java.lang.Integer cceQnaCapt);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where cceQnaCapt is equals to'.
     *
     * @param cceQnaCapt java.lang.Integer
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_QNA_CAPT=?")
    List<TdCaptCptoErr> findByCceQnaCapt(java.lang.Integer cceQnaCapt);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where cceQnaFin is equals to'.
     *
     * @param cceQnaFin java.lang.Integer
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_QNA_FIN=?")
    TdCaptCptoErr getByCceQnaFin(java.lang.Integer cceQnaFin);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where cceQnaFin is equals to'.
     *
     * @param cceQnaFin java.lang.Integer
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_QNA_FIN=?")
    List<TdCaptCptoErr> findByCceQnaFin(java.lang.Integer cceQnaFin);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where cceQnaIni is equals to'.
     *
     * @param cceQnaIni java.lang.Integer
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_QNA_INI=?")
    TdCaptCptoErr getByCceQnaIni(java.lang.Integer cceQnaIni);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where cceQnaIni is equals to'.
     *
     * @param cceQnaIni java.lang.Integer
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_QNA_INI=?")
    List<TdCaptCptoErr> findByCceQnaIni(java.lang.Integer cceQnaIni);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where cceReferen is equals to'.
     *
     * @param cceReferen java.lang.String
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_REFEREN=?")
    TdCaptCptoErr getByCceReferen(java.lang.String cceReferen);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where cceReferen is equals to'.
     *
     * @param cceReferen java.lang.String
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_REFEREN=?")
    List<TdCaptCptoErr> findByCceReferen(java.lang.String cceReferen);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where cceRfc is equals to'.
     *
     * @param cceRfc java.lang.String
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_RFC=?")
    TdCaptCptoErr getByCceRfc(java.lang.String cceRfc);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where cceRfc is equals to'.
     *
     * @param cceRfc java.lang.String
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="CCE_RFC=?")
    List<TdCaptCptoErr> findByCceRfc(java.lang.String cceRfc);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="FEC_MODIFICO=?")
    TdCaptCptoErr getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="FEC_MODIFICO=?")
    List<TdCaptCptoErr> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where idConcepto is equals to'.
     *
     * @param idConcepto java.lang.String
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="ID_CONCEPTO=?")
    TdCaptCptoErr getByIdConcepto(java.lang.String idConcepto);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where idConcepto is equals to'.
     *
     * @param idConcepto java.lang.String
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="ID_CONCEPTO=?")
    List<TdCaptCptoErr> findByIdConcepto(java.lang.String idConcepto);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where idError is equals to'.
     *
     * @param idError java.lang.Integer
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="ID_ERROR=?")
    TdCaptCptoErr getByIdError(java.lang.Integer idError);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where idError is equals to'.
     *
     * @param idError java.lang.Integer
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="ID_ERROR=?")
    List<TdCaptCptoErr> findByIdError(java.lang.Integer idError);

    /**
     * Find the first TdCaptCptoErr entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="USUARIO=?")
    TdCaptCptoErr getByUsuario(java.lang.String usuario);

    /**
     * Find all TdCaptCptoErr entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdCaptCptoErr
     */
    @FindByCondition(value=TdCaptCptoErr.class, condition="USUARIO=?")
    List<TdCaptCptoErr> findByUsuario(java.lang.String usuario);
}