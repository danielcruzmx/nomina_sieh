package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnPaquete;


/**
 * Data access interface for TnPaquete.
 */
public interface TnPaqueteDAO extends JdbcDataService {
    /**
     * Find TnPaquete entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnPaquete
     */
    @FindById(TnPaquete.class)
    TnPaquete getById(java.lang.Integer id);
    
    /**
     * Get all TnPaquete entities limited by a maximum number of elements.
     *
     * @return Collection of TnPaquete
     */
    @FindAll(TnPaquete.class)
    List<TnPaquete> findAll();
    
    /**
     * Make persistence of TnPaquete entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnPaquete
     */
    @Save
    void save(TnPaquete entity);
    
    /**
     * Remove TnPaquete entities.
     *
     * @param entity TnPaquete
     */
    @Delete
    void delete(TnPaquete entity);


    /**
     * Find the first TnPaquete entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="FEC_MODIFICO=?")
    TnPaquete getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnPaquete entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="FEC_MODIFICO=?")
    List<TnPaquete> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnPaquete entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="USUARIO=?")
    TnPaquete getByUsuario(java.lang.String usuario);

    /**
     * Find all TnPaquete entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="USUARIO=?")
    List<TnPaquete> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnPaquete entity that matches the condition 'where idEstatus is equals to'.
     *
     * @param idEstatus java.lang.Integer
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="ID_ESTATUS=?")
    TnPaquete getByIdEstatus(java.lang.Integer idEstatus);

    /**
     * Find all TnPaquete entities that matches the condition 'where idEstatus is equals to'.
     *
     * @param idEstatus java.lang.Integer
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="ID_ESTATUS=?")
    List<TnPaquete> findByIdEstatus(java.lang.Integer idEstatus);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqConError is equals to'.
     *
     * @param paqConError java.lang.Boolean
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_CON_ERROR=?")
    TnPaquete getByPaqConError(java.lang.Boolean paqConError);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqConError is equals to'.
     *
     * @param paqConError java.lang.Boolean
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_CON_ERROR=?")
    List<TnPaquete> findByPaqConError(java.lang.Boolean paqConError);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqConErrores is equals to'.
     *
     * @param paqConErrores java.lang.Long
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_CON_ERRORES=?")
    TnPaquete getByPaqConErrores(java.lang.Long paqConErrores);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqConErrores is equals to'.
     *
     * @param paqConErrores java.lang.Long
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_CON_ERRORES=?")
    List<TnPaquete> findByPaqConErrores(java.lang.Long paqConErrores);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqDescrip is equals to'.
     *
     * @param paqDescrip java.lang.String
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_DESCRIP=?")
    TnPaquete getByPaqDescrip(java.lang.String paqDescrip);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqDescrip is equals to'.
     *
     * @param paqDescrip java.lang.String
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_DESCRIP=?")
    List<TnPaquete> findByPaqDescrip(java.lang.String paqDescrip);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqFecCarga is equals to'.
     *
     * @param paqFecCarga java.util.Date
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FEC_CARGA=?")
    TnPaquete getByPaqFecCarga(java.util.Date paqFecCarga);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqFecCarga is equals to'.
     *
     * @param paqFecCarga java.util.Date
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FEC_CARGA=?")
    List<TnPaquete> findByPaqFecCarga(java.util.Date paqFecCarga);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqFecModifica is equals to'.
     *
     * @param paqFecModifica java.util.Date
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FEC_MODIFICA=?")
    TnPaquete getByPaqFecModifica(java.util.Date paqFecModifica);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqFecModifica is equals to'.
     *
     * @param paqFecModifica java.util.Date
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FEC_MODIFICA=?")
    List<TnPaquete> findByPaqFecModifica(java.util.Date paqFecModifica);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqFecProceso is equals to'.
     *
     * @param paqFecProceso java.util.Date
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FEC_PROCESO=?")
    TnPaquete getByPaqFecProceso(java.util.Date paqFecProceso);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqFecProceso is equals to'.
     *
     * @param paqFecProceso java.util.Date
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FEC_PROCESO=?")
    List<TnPaquete> findByPaqFecProceso(java.util.Date paqFecProceso);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqFecTimbrado is equals to'.
     *
     * @param paqFecTimbrado java.util.Date
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FEC_TIMBRADO=?")
    TnPaquete getByPaqFecTimbrado(java.util.Date paqFecTimbrado);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqFecTimbrado is equals to'.
     *
     * @param paqFecTimbrado java.util.Date
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FEC_TIMBRADO=?")
    List<TnPaquete> findByPaqFecTimbrado(java.util.Date paqFecTimbrado);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqFolio is equals to'.
     *
     * @param paqFolio java.lang.String
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FOLIO=?")
    TnPaquete getByPaqFolio(java.lang.String paqFolio);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqFolio is equals to'.
     *
     * @param paqFolio java.lang.String
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_FOLIO=?")
    List<TnPaquete> findByPaqFolio(java.lang.String paqFolio);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqProcesados is equals to'.
     *
     * @param paqProcesados java.lang.Long
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_PROCESADOS=?")
    TnPaquete getByPaqProcesados(java.lang.Long paqProcesados);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqProcesados is equals to'.
     *
     * @param paqProcesados java.lang.Long
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_PROCESADOS=?")
    List<TnPaquete> findByPaqProcesados(java.lang.Long paqProcesados);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqSinErrores is equals to'.
     *
     * @param paqSinErrores java.lang.Long
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_SIN_ERRORES=?")
    TnPaquete getByPaqSinErrores(java.lang.Long paqSinErrores);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqSinErrores is equals to'.
     *
     * @param paqSinErrores java.lang.Long
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_SIN_ERRORES=?")
    List<TnPaquete> findByPaqSinErrores(java.lang.Long paqSinErrores);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqTipoCarga is equals to'.
     *
     * @param paqTipoCarga java.lang.String
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_TIPO_CARGA=?")
    TnPaquete getByPaqTipoCarga(java.lang.String paqTipoCarga);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqTipoCarga is equals to'.
     *
     * @param paqTipoCarga java.lang.String
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_TIPO_CARGA=?")
    List<TnPaquete> findByPaqTipoCarga(java.lang.String paqTipoCarga);

    /**
     * Find the first TnPaquete entity that matches the condition 'where paqUsuario is equals to'.
     *
     * @param paqUsuario java.lang.String
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_USUARIO=?")
    TnPaquete getByPaqUsuario(java.lang.String paqUsuario);

    /**
     * Find all TnPaquete entities that matches the condition 'where paqUsuario is equals to'.
     *
     * @param paqUsuario java.lang.String
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="PAQ_USUARIO=?")
    List<TnPaquete> findByPaqUsuario(java.lang.String paqUsuario);

    /**
     * Find the first TnPaquete entity that matches the condition 'where xmlCancelacion is equals to'.
     *
     * @param xmlCancelacion java.sql.Clob
     * @return TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="XML_CANCELACION=?")
    TnPaquete getByXmlCancelacion(java.sql.Clob xmlCancelacion);

    /**
     * Find all TnPaquete entities that matches the condition 'where xmlCancelacion is equals to'.
     *
     * @param xmlCancelacion java.sql.Clob
     * @return Collection of TnPaquete
     */
    @FindByCondition(value=TnPaquete.class, condition="XML_CANCELACION=?")
    List<TnPaquete> findByXmlCancelacion(java.sql.Clob xmlCancelacion);
}