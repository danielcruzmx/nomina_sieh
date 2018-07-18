package gob.shcp.sireh.data.jdbc.servicios;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;
import gob.shcp.sireh.domain.jdbc.servicios.TdBitacoraUpdateTabla;


/**
 * Data access interface for TdBitacoraUpdateTabla.
 */
public interface TdBitacoraUpdateTablaDAO extends JdbcDataService {
    /**
     * Find TdBitacoraUpdateTabla entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdBitacoraUpdateTabla
     */
    @FindById(TdBitacoraUpdateTabla.class)
    TdBitacoraUpdateTabla getById(java.lang.Integer id);
    
    /**
     * Get all TdBitacoraUpdateTabla entities limited by a maximum number of elements.
     *
     * @return Collection of TdBitacoraUpdateTabla
     */
    @FindAll(TdBitacoraUpdateTabla.class)
    List<TdBitacoraUpdateTabla> findAll();
    
    /**
     * Make persistence of TdBitacoraUpdateTabla entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdBitacoraUpdateTabla
     */
    @Save
    void save(TdBitacoraUpdateTabla entity);
    
    /**
     * Remove TdBitacoraUpdateTabla entities.
     *
     * @param entity TdBitacoraUpdateTabla
     */
    @Delete
    void delete(TdBitacoraUpdateTabla entity);


    /**
     * Find the first TdBitacoraUpdateTabla entity that matches the condition 'where debeDecir is equals to'.
     *
     * @param debeDecir java.lang.String
     * @return TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="DEBE_DECIR=?")
    TdBitacoraUpdateTabla getByDebeDecir(java.lang.String debeDecir);

    /**
     * Find all TdBitacoraUpdateTabla entities that matches the condition 'where debeDecir is equals to'.
     *
     * @param debeDecir java.lang.String
     * @return Collection of TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="DEBE_DECIR=?")
    List<TdBitacoraUpdateTabla> findByDebeDecir(java.lang.String debeDecir);

    /**
     * Find the first TdBitacoraUpdateTabla entity that matches the condition 'where dice is equals to'.
     *
     * @param dice java.lang.String
     * @return TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="DICE=?")
    TdBitacoraUpdateTabla getByDice(java.lang.String dice);

    /**
     * Find all TdBitacoraUpdateTabla entities that matches the condition 'where dice is equals to'.
     *
     * @param dice java.lang.String
     * @return Collection of TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="DICE=?")
    List<TdBitacoraUpdateTabla> findByDice(java.lang.String dice);

    /**
     * Find the first TdBitacoraUpdateTabla entity that matches the condition 'where encabezadoTabla is equals to'.
     *
     * @param encabezadoTabla java.lang.String
     * @return TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="ENCABEZADO_TABLA=?")
    TdBitacoraUpdateTabla getByEncabezadoTabla(java.lang.String encabezadoTabla);

    /**
     * Find all TdBitacoraUpdateTabla entities that matches the condition 'where encabezadoTabla is equals to'.
     *
     * @param encabezadoTabla java.lang.String
     * @return Collection of TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="ENCABEZADO_TABLA=?")
    List<TdBitacoraUpdateTabla> findByEncabezadoTabla(java.lang.String encabezadoTabla);

    /**
     * Find the first TdBitacoraUpdateTabla entity that matches the condition 'where ipOrigen is equals to'.
     *
     * @param ipOrigen java.lang.String
     * @return TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="IP_ORIGEN=?")
    TdBitacoraUpdateTabla getByIpOrigen(java.lang.String ipOrigen);

    /**
     * Find all TdBitacoraUpdateTabla entities that matches the condition 'where ipOrigen is equals to'.
     *
     * @param ipOrigen java.lang.String
     * @return Collection of TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="IP_ORIGEN=?")
    List<TdBitacoraUpdateTabla> findByIpOrigen(java.lang.String ipOrigen);

    /**
     * Find the first TdBitacoraUpdateTabla entity that matches the condition 'where motivoModifica is equals to'.
     *
     * @param motivoModifica java.lang.String
     * @return TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="MOTIVO_MODIFICA=?")
    TdBitacoraUpdateTabla getByMotivoModifica(java.lang.String motivoModifica);

    /**
     * Find all TdBitacoraUpdateTabla entities that matches the condition 'where motivoModifica is equals to'.
     *
     * @param motivoModifica java.lang.String
     * @return Collection of TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="MOTIVO_MODIFICA=?")
    List<TdBitacoraUpdateTabla> findByMotivoModifica(java.lang.String motivoModifica);

    /**
     * Find the first TdBitacoraUpdateTabla entity that matches the condition 'where tablaModificada is equals to'.
     *
     * @param tablaModificada java.lang.String
     * @return TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="TABLA_MODIFICADA=?")
    TdBitacoraUpdateTabla getByTablaModificada(java.lang.String tablaModificada);

    /**
     * Find all TdBitacoraUpdateTabla entities that matches the condition 'where tablaModificada is equals to'.
     *
     * @param tablaModificada java.lang.String
     * @return Collection of TdBitacoraUpdateTabla
     */
    @FindByCondition(value=TdBitacoraUpdateTabla.class, condition="TABLA_MODIFICADA=?")
    List<TdBitacoraUpdateTabla> findByTablaModificada(java.lang.String tablaModificada);
}