package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.rusp.TdRuspDatosper;

/**
 * Data access interface for TdRuspDatosper.
 */
public interface TdRuspDatosperDAO extends JdbcDataService {
    
    /**
     * Find TdRuspDatosper entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdRuspDatosper
     */
    @FindById(TdRuspDatosper.class)
    TdRuspDatosper getById(gob.shcp.sireh.domain.jdbc.rusp.TdRuspDatosperPK id);

    /**
     * Get all TdRuspDatosper entities limited by a maximum number of elements.
     *
     * @return Collection of TdRuspDatosper
     */
    @FindAll(TdRuspDatosper.class)
    List<TdRuspDatosper> findAll();

    /**
     * Make persistence of TdRuspDatosper entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdRuspDatosper
     */
    @Save
    void save(TdRuspDatosper entity);

    /**
     * Remove TdRuspDatosper entities.
     *
     * @param entity TdRuspDatosper
     */
    @Delete
    void delete(TdRuspDatosper entity);


    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "FEC_MODIFICO=?")
    TdRuspDatosper getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "FEC_MODIFICO=?")
    List<TdRuspDatosper> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "USUARIO=?")
    TdRuspDatosper getByUsuario(java.lang.String usuario);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "USUARIO=?")
    List<TdRuspDatosper> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "ID_UNIDAD=?")
    TdRuspDatosper getByIdUnidad(java.lang.String idUnidad);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where idUnidad is equals to'.
     *
     * @param idUnidad java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "ID_UNIDAD=?")
    List<TdRuspDatosper> findByIdUnidad(java.lang.String idUnidad);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdCurp is equals to'.
     *
     * @param rdCurp java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_CURP=?")
    TdRuspDatosper getByRdCurp(java.lang.String rdCurp);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdCurp is equals to'.
     *
     * @param rdCurp java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_CURP=?")
    List<TdRuspDatosper> findByRdCurp(java.lang.String rdCurp);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdNombre is equals to'.
     *
     * @param rdNombre java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_NOMBRE=?")
    TdRuspDatosper getByRdNombre(java.lang.String rdNombre);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdNombre is equals to'.
     *
     * @param rdNombre java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_NOMBRE=?")
    List<TdRuspDatosper> findByRdNombre(java.lang.String rdNombre);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdPrimerApellido is equals to'.
     *
     * @param rdPrimerApellido java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_PRIMER_APELLIDO=?")
    TdRuspDatosper getByRdPrimerApellido(java.lang.String rdPrimerApellido);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdPrimerApellido is equals to'.
     *
     * @param rdPrimerApellido java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_PRIMER_APELLIDO=?")
    List<TdRuspDatosper> findByRdPrimerApellido(java.lang.String rdPrimerApellido);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdRamo is equals to'.
     *
     * @param rdRamo java.lang.Integer
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_RAMO=?")
    TdRuspDatosper getByRdRamo(java.lang.Integer rdRamo);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdRamo is equals to'.
     *
     * @param rdRamo java.lang.Integer
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_RAMO=?")
    List<TdRuspDatosper> findByRdRamo(java.lang.Integer rdRamo);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdSegundoApellido is equals to'.
     *
     * @param rdSegundoApellido java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SEGUNDO_APELLIDO=?")
    TdRuspDatosper getByRdSegundoApellido(java.lang.String rdSegundoApellido);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdSegundoApellido is equals to'.
     *
     * @param rdSegundoApellido java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SEGUNDO_APELLIDO=?")
    List<TdRuspDatosper> findByRdSegundoApellido(java.lang.String rdSegundoApellido);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdSpAa is equals to'.
     *
     * @param rdSpAa java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_AA=?")
    TdRuspDatosper getByRdSpAa(java.lang.String rdSpAa);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdSpAa is equals to'.
     *
     * @param rdSpAa java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_AA=?")
    List<TdRuspDatosper> findByRdSpAa(java.lang.String rdSpAa);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdSpCalle is equals to'.
     *
     * @param rdSpCalle java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_CALLE=?")
    TdRuspDatosper getByRdSpCalle(java.lang.String rdSpCalle);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdSpCalle is equals to'.
     *
     * @param rdSpCalle java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_CALLE=?")
    List<TdRuspDatosper> findByRdSpCalle(java.lang.String rdSpCalle);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdSpColonia is equals to'.
     *
     * @param rdSpColonia java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_COLONIA=?")
    TdRuspDatosper getByRdSpColonia(java.lang.String rdSpColonia);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdSpColonia is equals to'.
     *
     * @param rdSpColonia java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_COLONIA=?")
    List<TdRuspDatosper> findByRdSpColonia(java.lang.String rdSpColonia);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdSpCp is equals to'.
     *
     * @param rdSpCp java.lang.Integer
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_CP=?")
    TdRuspDatosper getByRdSpCp(java.lang.Integer rdSpCp);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdSpCp is equals to'.
     *
     * @param rdSpCp java.lang.Integer
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_CP=?")
    List<TdRuspDatosper> findByRdSpCp(java.lang.Integer rdSpCp);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdSpEntfed is equals to'.
     *
     * @param rdSpEntfed java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_ENTFED=?")
    TdRuspDatosper getByRdSpEntfed(java.lang.String rdSpEntfed);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdSpEntfed is equals to'.
     *
     * @param rdSpEntfed java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_ENTFED=?")
    List<TdRuspDatosper> findByRdSpEntfed(java.lang.String rdSpEntfed);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdSpMuDel is equals to'.
     *
     * @param rdSpMuDel java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_MU_DEL=?")
    TdRuspDatosper getByRdSpMuDel(java.lang.String rdSpMuDel);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdSpMuDel is equals to'.
     *
     * @param rdSpMuDel java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_MU_DEL=?")
    List<TdRuspDatosper> findByRdSpMuDel(java.lang.String rdSpMuDel);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdSpNumEmp is equals to'.
     *
     * @param rdSpNumEmp java.lang.String
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_NUM_EMP=?")
    TdRuspDatosper getByRdSpNumEmp(java.lang.String rdSpNumEmp);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdSpNumEmp is equals to'.
     *
     * @param rdSpNumEmp java.lang.String
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_NUM_EMP=?")
    List<TdRuspDatosper> findByRdSpNumEmp(java.lang.String rdSpNumEmp);

    /**
     * Find the first TdRuspDatosper entity that matches the condition 'where rdSpPais is equals to'.
     *
     * @param rdSpPais java.lang.Integer
     * @return TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_PAIS=?")
    TdRuspDatosper getByRdSpPais(java.lang.Integer rdSpPais);

    /**
     * Find all TdRuspDatosper entities that matches the condition 'where rdSpPais is equals to'.
     *
     * @param rdSpPais java.lang.Integer
     * @return Collection of TdRuspDatosper
     */
    @FindByCondition(value = TdRuspDatosper.class, condition = "RD_SP_PAIS=?")
    List<TdRuspDatosper> findByRdSpPais(java.lang.Integer rdSpPais);
}
