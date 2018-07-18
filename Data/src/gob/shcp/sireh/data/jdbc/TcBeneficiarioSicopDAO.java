package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicop;


/**
 * Data access interface for TcBeneficiarioSicop.
 */
public interface TcBeneficiarioSicopDAO extends JdbcDataService {
    /**
     * Find TcBeneficiarioSicop entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcBeneficiarioSicop
     */
    @FindById(TcBeneficiarioSicop.class)
    TcBeneficiarioSicop getById(gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicopPK id);
    
    /**
     * Get all TcBeneficiarioSicop entities limited by a maximum number of elements.
     *
     * @return Collection of TcBeneficiarioSicop
     */
    @FindAll(TcBeneficiarioSicop.class)
    List<TcBeneficiarioSicop> findAll();
    
    /**
     * Make persistence of TcBeneficiarioSicop entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcBeneficiarioSicop
     */
    @Save
    void save(TcBeneficiarioSicop entity);
    
    /**
     * Remove TcBeneficiarioSicop entities.
     *
     * @param entity TcBeneficiarioSicop
     */
    @Delete
    void delete(TcBeneficiarioSicop entity);


    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="FEC_MODIFICO=?")
    TcBeneficiarioSicop getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="FEC_MODIFICO=?")
    List<TcBeneficiarioSicop> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="USUARIO=?")
    TcBeneficiarioSicop getByUsuario(java.lang.String usuario);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="USUARIO=?")
    List<TcBeneficiarioSicop> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where bsOrigenPpto is equals to'.
     *
     * @param bsOrigenPpto java.lang.Integer
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_ORIGEN_PPTO=?")
    TcBeneficiarioSicop getByBsOrigenPpto(java.lang.Integer bsOrigenPpto);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where bsOrigenPpto is equals to'.
     *
     * @param bsOrigenPpto java.lang.Integer
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_ORIGEN_PPTO=?")
    List<TcBeneficiarioSicop> findByBsOrigenPpto(java.lang.Integer bsOrigenPpto);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where bsRef1 is equals to'.
     *
     * @param bsRef1 java.lang.String
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_REF_1=?")
    TcBeneficiarioSicop getByBsRef1(java.lang.String bsRef1);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where bsRef1 is equals to'.
     *
     * @param bsRef1 java.lang.String
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_REF_1=?")
    List<TcBeneficiarioSicop> findByBsRef1(java.lang.String bsRef1);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where bsRef2 is equals to'.
     *
     * @param bsRef2 java.lang.String
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_REF_2=?")
    TcBeneficiarioSicop getByBsRef2(java.lang.String bsRef2);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where bsRef2 is equals to'.
     *
     * @param bsRef2 java.lang.String
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_REF_2=?")
    List<TcBeneficiarioSicop> findByBsRef2(java.lang.String bsRef2);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where bsRfc is equals to'.
     *
     * @param bsRfc java.lang.String
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_RFC=?")
    TcBeneficiarioSicop getByBsRfc(java.lang.String bsRfc);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where bsRfc is equals to'.
     *
     * @param bsRfc java.lang.String
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_RFC=?")
    List<TcBeneficiarioSicop> findByBsRfc(java.lang.String bsRfc);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where bsTipoErog is equals to'.
     *
     * @param bsTipoErog java.lang.Integer
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_TIPO_EROG=?")
    TcBeneficiarioSicop getByBsTipoErog(java.lang.Integer bsTipoErog);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where bsTipoErog is equals to'.
     *
     * @param bsTipoErog java.lang.Integer
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_TIPO_EROG=?")
    List<TcBeneficiarioSicop> findByBsTipoErog(java.lang.Integer bsTipoErog);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where bsTipoMoneda is equals to'.
     *
     * @param bsTipoMoneda java.lang.String
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_TIPO_MONEDA=?")
    TcBeneficiarioSicop getByBsTipoMoneda(java.lang.String bsTipoMoneda);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where bsTipoMoneda is equals to'.
     *
     * @param bsTipoMoneda java.lang.String
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_TIPO_MONEDA=?")
    List<TcBeneficiarioSicop> findByBsTipoMoneda(java.lang.String bsTipoMoneda);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where bsTipoNom is equals to'.
     *
     * @param bsTipoNom java.lang.String
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_TIPO_NOM=?")
    TcBeneficiarioSicop getByBsTipoNom(java.lang.String bsTipoNom);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where bsTipoNom is equals to'.
     *
     * @param bsTipoNom java.lang.String
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_TIPO_NOM=?")
    List<TcBeneficiarioSicop> findByBsTipoNom(java.lang.String bsTipoNom);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where bsTipoOper is equals to'.
     *
     * @param bsTipoOper java.lang.Integer
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_TIPO_OPER=?")
    TcBeneficiarioSicop getByBsTipoOper(java.lang.Integer bsTipoOper);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where bsTipoOper is equals to'.
     *
     * @param bsTipoOper java.lang.Integer
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="BS_TIPO_OPER=?")
    List<TcBeneficiarioSicop> findByBsTipoOper(java.lang.Integer bsTipoOper);

    /**
     * Find the first TcBeneficiarioSicop entity that matches the condition 'where descBeneSicop is equals to'.
     *
     * @param descBeneSicop java.lang.String
     * @return TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="DESC_BENE_SICOP=?")
    TcBeneficiarioSicop getByDescBeneSicop(java.lang.String descBeneSicop);

    /**
     * Find all TcBeneficiarioSicop entities that matches the condition 'where descBeneSicop is equals to'.
     *
     * @param descBeneSicop java.lang.String
     * @return Collection of TcBeneficiarioSicop
     */
    @FindByCondition(value=TcBeneficiarioSicop.class, condition="DESC_BENE_SICOP=?")
    List<TcBeneficiarioSicop> findByDescBeneSicop(java.lang.String descBeneSicop);
}