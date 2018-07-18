package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdDepEco;


/**
 * Data access interface for TdDepEco.
 */
public interface TdDepEcoDAO extends JdbcDataService {
    /**
     * Find TdDepEco entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdDepEco
     */
    @FindById(TdDepEco.class)
    TdDepEco getById(java.lang.Integer id);
    
    /**
     * Get all TdDepEco entities limited by a maximum number of elements.
     *
     * @return Collection of TdDepEco
     */
    @FindAll(TdDepEco.class)
    List<TdDepEco> findAll();
    
    /**
     * Make persistence of TdDepEco entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdDepEco
     */
    @Save
    void save(TdDepEco entity);
    
    /**
     * Remove TdDepEco entities.
     *
     * @param entity TdDepEco
     */
    @Delete
    void delete(TdDepEco entity);


    /**
     * Find the first TdDepEco entity that matches the condition 'where deAgrupador is equals to'.
     *
     * @param deAgrupador java.lang.String
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_AGRUPADOR=?")
    TdDepEco getByDeAgrupador(java.lang.String deAgrupador);

    /**
     * Find all TdDepEco entities that matches the condition 'where deAgrupador is equals to'.
     *
     * @param deAgrupador java.lang.String
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_AGRUPADOR=?")
    List<TdDepEco> findByDeAgrupador(java.lang.String deAgrupador);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deApeMaterno is equals to'.
     *
     * @param deApeMaterno java.lang.String
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_APE_MATERNO=?")
    TdDepEco getByDeApeMaterno(java.lang.String deApeMaterno);

    /**
     * Find all TdDepEco entities that matches the condition 'where deApeMaterno is equals to'.
     *
     * @param deApeMaterno java.lang.String
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_APE_MATERNO=?")
    List<TdDepEco> findByDeApeMaterno(java.lang.String deApeMaterno);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deApePaterno is equals to'.
     *
     * @param deApePaterno java.lang.String
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_APE_PATERNO=?")
    TdDepEco getByDeApePaterno(java.lang.String deApePaterno);

    /**
     * Find all TdDepEco entities that matches the condition 'where deApePaterno is equals to'.
     *
     * @param deApePaterno java.lang.String
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_APE_PATERNO=?")
    List<TdDepEco> findByDeApePaterno(java.lang.String deApePaterno);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deCertificado is equals to'.
     *
     * @param deCertificado java.lang.String
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_CERTIFICADO=?")
    TdDepEco getByDeCertificado(java.lang.String deCertificado);

    /**
     * Find all TdDepEco entities that matches the condition 'where deCertificado is equals to'.
     *
     * @param deCertificado java.lang.String
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_CERTIFICADO=?")
    List<TdDepEco> findByDeCertificado(java.lang.String deCertificado);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deCiclo is equals to'.
     *
     * @param deCiclo java.lang.Integer
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_CICLO=?")
    TdDepEco getByDeCiclo(java.lang.Integer deCiclo);

    /**
     * Find all TdDepEco entities that matches the condition 'where deCiclo is equals to'.
     *
     * @param deCiclo java.lang.Integer
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_CICLO=?")
    List<TdDepEco> findByDeCiclo(java.lang.Integer deCiclo);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deFecIngGmm is equals to'.
     *
     * @param deFecIngGmm java.util.Date
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_FEC_ING_GMM=?")
    TdDepEco getByDeFecIngGmm(java.util.Date deFecIngGmm);

    /**
     * Find all TdDepEco entities that matches the condition 'where deFecIngGmm is equals to'.
     *
     * @param deFecIngGmm java.util.Date
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_FEC_ING_GMM=?")
    List<TdDepEco> findByDeFecIngGmm(java.util.Date deFecIngGmm);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deFecNac is equals to'.
     *
     * @param deFecNac java.util.Date
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_FEC_NAC=?")
    TdDepEco getByDeFecNac(java.util.Date deFecNac);

    /**
     * Find all TdDepEco entities that matches the condition 'where deFecNac is equals to'.
     *
     * @param deFecNac java.util.Date
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_FEC_NAC=?")
    List<TdDepEco> findByDeFecNac(java.util.Date deFecNac);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deGmm is equals to'.
     *
     * @param deGmm java.lang.Integer
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_GMM=?")
    TdDepEco getByDeGmm(java.lang.Integer deGmm);

    /**
     * Find all TdDepEco entities that matches the condition 'where deGmm is equals to'.
     *
     * @param deGmm java.lang.Integer
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_GMM=?")
    List<TdDepEco> findByDeGmm(java.lang.Integer deGmm);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deNombre is equals to'.
     *
     * @param deNombre java.lang.String
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_NOMBRE=?")
    TdDepEco getByDeNombre(java.lang.String deNombre);

    /**
     * Find all TdDepEco entities that matches the condition 'where deNombre is equals to'.
     *
     * @param deNombre java.lang.String
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_NOMBRE=?")
    List<TdDepEco> findByDeNombre(java.lang.String deNombre);

    /**
     * Find the first TdDepEco entity that matches the condition 'where dePromEsc is equals to'.
     *
     * @param dePromEsc java.lang.Float
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_PROM_ESC=?")
    TdDepEco getByDePromEsc(java.lang.Float dePromEsc);

    /**
     * Find all TdDepEco entities that matches the condition 'where dePromEsc is equals to'.
     *
     * @param dePromEsc java.lang.Float
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_PROM_ESC=?")
    List<TdDepEco> findByDePromEsc(java.lang.Float dePromEsc);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deRfc is equals to'.
     *
     * @param deRfc java.lang.String
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_RFC=?")
    TdDepEco getByDeRfc(java.lang.String deRfc);

    /**
     * Find all TdDepEco entities that matches the condition 'where deRfc is equals to'.
     *
     * @param deRfc java.lang.String
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_RFC=?")
    List<TdDepEco> findByDeRfc(java.lang.String deRfc);

    /**
     * Find the first TdDepEco entity that matches the condition 'where deStatus is equals to'.
     *
     * @param deStatus java.lang.String
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_STATUS=?")
    TdDepEco getByDeStatus(java.lang.String deStatus);

    /**
     * Find all TdDepEco entities that matches the condition 'where deStatus is equals to'.
     *
     * @param deStatus java.lang.String
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="DE_STATUS=?")
    List<TdDepEco> findByDeStatus(java.lang.String deStatus);

    /**
     * Find the first TdDepEco entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="FEC_MODIFICO=?")
    TdDepEco getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdDepEco entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="FEC_MODIFICO=?")
    List<TdDepEco> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdDepEco entity that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="ID_GENERO=?")
    TdDepEco getByIdGenero(java.lang.String idGenero);

    /**
     * Find all TdDepEco entities that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="ID_GENERO=?")
    List<TdDepEco> findByIdGenero(java.lang.String idGenero);

    /**
     * Find the first TdDepEco entity that matches the condition 'where idNivEscolar is equals to'.
     *
     * @param idNivEscolar java.lang.Integer
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="ID_NIV_ESCOLAR=?")
    TdDepEco getByIdNivEscolar(java.lang.Integer idNivEscolar);

    /**
     * Find all TdDepEco entities that matches the condition 'where idNivEscolar is equals to'.
     *
     * @param idNivEscolar java.lang.Integer
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="ID_NIV_ESCOLAR=?")
    List<TdDepEco> findByIdNivEscolar(java.lang.Integer idNivEscolar);

    /**
     * Find the first TdDepEco entity that matches the condition 'where idParentesco is equals to'.
     *
     * @param idParentesco java.lang.Boolean
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="ID_PARENTESCO=?")
    TdDepEco getByIdParentesco(java.lang.Boolean idParentesco);

    /**
     * Find all TdDepEco entities that matches the condition 'where idParentesco is equals to'.
     *
     * @param idParentesco java.lang.Boolean
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="ID_PARENTESCO=?")
    List<TdDepEco> findByIdParentesco(java.lang.Boolean idParentesco);

    /**
     * Find the first TdDepEco entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="USUARIO=?")
    TdDepEco getByUsuario(java.lang.String usuario);

    /**
     * Find all TdDepEco entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdDepEco
     */
    @FindByCondition(value=TdDepEco.class, condition="USUARIO=?")
    List<TdDepEco> findByUsuario(java.lang.String usuario);
}