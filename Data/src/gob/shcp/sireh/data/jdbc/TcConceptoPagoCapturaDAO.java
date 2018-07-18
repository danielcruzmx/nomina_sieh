package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcConceptoPagoCaptura;


/**
 * Data access interface for TcConceptoPagoCaptura.
 */
public interface TcConceptoPagoCapturaDAO extends JdbcDataService {
    /**
     * Find TcConceptoPagoCaptura entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TcConceptoPagoCaptura
     */
    @FindById(TcConceptoPagoCaptura.class)
    TcConceptoPagoCaptura getById(gob.shcp.sireh.domain.jdbc.TcConceptoPagoCapturaPK id);
    
    /**
     * Get all TcConceptoPagoCaptura entities limited by a maximum number of elements.
     *
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindAll(TcConceptoPagoCaptura.class)
    List<TcConceptoPagoCaptura> findAll();
    
    /**
     * Make persistence of TcConceptoPagoCaptura entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TcConceptoPagoCaptura
     */
    @Save
    void save(TcConceptoPagoCaptura entity);
    
    /**
     * Remove TcConceptoPagoCaptura entities.
     *
     * @param entity TcConceptoPagoCaptura
     */
    @Delete
    void delete(TcConceptoPagoCaptura entity);


    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcBloque is equals to'.
     *
     * @param cpcBloque java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_BLOQUE=?")
    TcConceptoPagoCaptura getByCpcBloque(java.lang.String cpcBloque);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcBloque is equals to'.
     *
     * @param cpcBloque java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_BLOQUE=?")
    List<TcConceptoPagoCaptura> findByCpcBloque(java.lang.String cpcBloque);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcNombramiento is equals to'.
     *
     * @param cpcNombramiento java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_NOMBRAMIENTO=?")
    TcConceptoPagoCaptura getByCpcNombramiento(java.lang.String cpcNombramiento);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcNombramiento is equals to'.
     *
     * @param cpcNombramiento java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_NOMBRAMIENTO=?")
    List<TcConceptoPagoCaptura> findByCpcNombramiento(java.lang.String cpcNombramiento);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcPermanente is equals to'.
     *
     * @param cpcPermanente java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_PERMANENTE=?")
    TcConceptoPagoCaptura getByCpcPermanente(java.lang.String cpcPermanente);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcPermanente is equals to'.
     *
     * @param cpcPermanente java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_PERMANENTE=?")
    List<TcConceptoPagoCaptura> findByCpcPermanente(java.lang.String cpcPermanente);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcTipoCalculo is equals to'.
     *
     * @param cpcTipoCalculo java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_TIPO_CALCULO=?")
    TcConceptoPagoCaptura getByCpcTipoCalculo(java.lang.String cpcTipoCalculo);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcTipoCalculo is equals to'.
     *
     * @param cpcTipoCalculo java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_TIPO_CALCULO=?")
    List<TcConceptoPagoCaptura> findByCpcTipoCalculo(java.lang.String cpcTipoCalculo);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcTipoCaptura is equals to'.
     *
     * @param cpcTipoCaptura java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_TIPO_CAPTURA=?")
    TcConceptoPagoCaptura getByCpcTipoCaptura(java.lang.String cpcTipoCaptura);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcTipoCaptura is equals to'.
     *
     * @param cpcTipoCaptura java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_TIPO_CAPTURA=?")
    List<TcConceptoPagoCaptura> findByCpcTipoCaptura(java.lang.String cpcTipoCaptura);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="FEC_MODIFICO=?")
    TcConceptoPagoCaptura getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="FEC_MODIFICO=?")
    List<TcConceptoPagoCaptura> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="USUARIO=?")
    TcConceptoPagoCaptura getByUsuario(java.lang.String usuario);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="USUARIO=?")
    List<TcConceptoPagoCaptura> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcMensaje is equals to'.
     *
     * @param cpcMensaje java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_MENSAJE=?")
    TcConceptoPagoCaptura getByCpcMensaje(java.lang.String cpcMensaje);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcMensaje is equals to'.
     *
     * @param cpcMensaje java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_MENSAJE=?")
    List<TcConceptoPagoCaptura> findByCpcMensaje(java.lang.String cpcMensaje);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcNivelesPto is equals to'.
     *
     * @param cpcNivelesPto java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_NIVELES_PTO=?")
    TcConceptoPagoCaptura getByCpcNivelesPto(java.lang.String cpcNivelesPto);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcNivelesPto is equals to'.
     *
     * @param cpcNivelesPto java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_NIVELES_PTO=?")
    List<TcConceptoPagoCaptura> findByCpcNivelesPto(java.lang.String cpcNivelesPto);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion0 is equals to'.
     *
     * @param cpcOpcion0 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION0=?")
    TcConceptoPagoCaptura getByCpcOpcion0(java.lang.String cpcOpcion0);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion0 is equals to'.
     *
     * @param cpcOpcion0 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION0=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion0(java.lang.String cpcOpcion0);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion1 is equals to'.
     *
     * @param cpcOpcion1 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION1=?")
    TcConceptoPagoCaptura getByCpcOpcion1(java.lang.String cpcOpcion1);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion1 is equals to'.
     *
     * @param cpcOpcion1 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION1=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion1(java.lang.String cpcOpcion1);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion2 is equals to'.
     *
     * @param cpcOpcion2 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION2=?")
    TcConceptoPagoCaptura getByCpcOpcion2(java.lang.String cpcOpcion2);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion2 is equals to'.
     *
     * @param cpcOpcion2 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION2=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion2(java.lang.String cpcOpcion2);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion3 is equals to'.
     *
     * @param cpcOpcion3 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION3=?")
    TcConceptoPagoCaptura getByCpcOpcion3(java.lang.String cpcOpcion3);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion3 is equals to'.
     *
     * @param cpcOpcion3 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION3=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion3(java.lang.String cpcOpcion3);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion4 is equals to'.
     *
     * @param cpcOpcion4 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION4=?")
    TcConceptoPagoCaptura getByCpcOpcion4(java.lang.String cpcOpcion4);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion4 is equals to'.
     *
     * @param cpcOpcion4 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION4=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion4(java.lang.String cpcOpcion4);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion5 is equals to'.
     *
     * @param cpcOpcion5 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION5=?")
    TcConceptoPagoCaptura getByCpcOpcion5(java.lang.String cpcOpcion5);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion5 is equals to'.
     *
     * @param cpcOpcion5 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION5=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion5(java.lang.String cpcOpcion5);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion6 is equals to'.
     *
     * @param cpcOpcion6 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION6=?")
    TcConceptoPagoCaptura getByCpcOpcion6(java.lang.String cpcOpcion6);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion6 is equals to'.
     *
     * @param cpcOpcion6 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION6=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion6(java.lang.String cpcOpcion6);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion7 is equals to'.
     *
     * @param cpcOpcion7 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION7=?")
    TcConceptoPagoCaptura getByCpcOpcion7(java.lang.String cpcOpcion7);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion7 is equals to'.
     *
     * @param cpcOpcion7 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION7=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion7(java.lang.String cpcOpcion7);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion8 is equals to'.
     *
     * @param cpcOpcion8 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION8=?")
    TcConceptoPagoCaptura getByCpcOpcion8(java.lang.String cpcOpcion8);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion8 is equals to'.
     *
     * @param cpcOpcion8 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION8=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion8(java.lang.String cpcOpcion8);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcOpcion9 is equals to'.
     *
     * @param cpcOpcion9 java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION9=?")
    TcConceptoPagoCaptura getByCpcOpcion9(java.lang.String cpcOpcion9);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcOpcion9 is equals to'.
     *
     * @param cpcOpcion9 java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_OPCION9=?")
    List<TcConceptoPagoCaptura> findByCpcOpcion9(java.lang.String cpcOpcion9);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcSubtipo is equals to'.
     *
     * @param cpcSubtipo java.lang.String
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_SUBTIPO=?")
    TcConceptoPagoCaptura getByCpcSubtipo(java.lang.String cpcSubtipo);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcSubtipo is equals to'.
     *
     * @param cpcSubtipo java.lang.String
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_SUBTIPO=?")
    List<TcConceptoPagoCaptura> findByCpcSubtipo(java.lang.String cpcSubtipo);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor0 is equals to'.
     *
     * @param cpcValor0 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR0=?")
    TcConceptoPagoCaptura getByCpcValor0(java.lang.Double cpcValor0);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor0 is equals to'.
     *
     * @param cpcValor0 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR0=?")
    List<TcConceptoPagoCaptura> findByCpcValor0(java.lang.Double cpcValor0);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor1 is equals to'.
     *
     * @param cpcValor1 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR1=?")
    TcConceptoPagoCaptura getByCpcValor1(java.lang.Double cpcValor1);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor1 is equals to'.
     *
     * @param cpcValor1 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR1=?")
    List<TcConceptoPagoCaptura> findByCpcValor1(java.lang.Double cpcValor1);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor2 is equals to'.
     *
     * @param cpcValor2 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR2=?")
    TcConceptoPagoCaptura getByCpcValor2(java.lang.Double cpcValor2);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor2 is equals to'.
     *
     * @param cpcValor2 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR2=?")
    List<TcConceptoPagoCaptura> findByCpcValor2(java.lang.Double cpcValor2);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor3 is equals to'.
     *
     * @param cpcValor3 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR3=?")
    TcConceptoPagoCaptura getByCpcValor3(java.lang.Double cpcValor3);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor3 is equals to'.
     *
     * @param cpcValor3 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR3=?")
    List<TcConceptoPagoCaptura> findByCpcValor3(java.lang.Double cpcValor3);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor4 is equals to'.
     *
     * @param cpcValor4 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR4=?")
    TcConceptoPagoCaptura getByCpcValor4(java.lang.Double cpcValor4);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor4 is equals to'.
     *
     * @param cpcValor4 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR4=?")
    List<TcConceptoPagoCaptura> findByCpcValor4(java.lang.Double cpcValor4);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor5 is equals to'.
     *
     * @param cpcValor5 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR5=?")
    TcConceptoPagoCaptura getByCpcValor5(java.lang.Double cpcValor5);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor5 is equals to'.
     *
     * @param cpcValor5 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR5=?")
    List<TcConceptoPagoCaptura> findByCpcValor5(java.lang.Double cpcValor5);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor6 is equals to'.
     *
     * @param cpcValor6 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR6=?")
    TcConceptoPagoCaptura getByCpcValor6(java.lang.Double cpcValor6);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor6 is equals to'.
     *
     * @param cpcValor6 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR6=?")
    List<TcConceptoPagoCaptura> findByCpcValor6(java.lang.Double cpcValor6);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor7 is equals to'.
     *
     * @param cpcValor7 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR7=?")
    TcConceptoPagoCaptura getByCpcValor7(java.lang.Double cpcValor7);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor7 is equals to'.
     *
     * @param cpcValor7 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR7=?")
    List<TcConceptoPagoCaptura> findByCpcValor7(java.lang.Double cpcValor7);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor8 is equals to'.
     *
     * @param cpcValor8 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR8=?")
    TcConceptoPagoCaptura getByCpcValor8(java.lang.Double cpcValor8);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor8 is equals to'.
     *
     * @param cpcValor8 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR8=?")
    List<TcConceptoPagoCaptura> findByCpcValor8(java.lang.Double cpcValor8);

    /**
     * Find the first TcConceptoPagoCaptura entity that matches the condition 'where cpcValor9 is equals to'.
     *
     * @param cpcValor9 java.lang.Double
     * @return TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR9=?")
    TcConceptoPagoCaptura getByCpcValor9(java.lang.Double cpcValor9);

    /**
     * Find all TcConceptoPagoCaptura entities that matches the condition 'where cpcValor9 is equals to'.
     *
     * @param cpcValor9 java.lang.Double
     * @return Collection of TcConceptoPagoCaptura
     */
    @FindByCondition(value=TcConceptoPagoCaptura.class, condition="CPC_VALOR9=?")
    List<TcConceptoPagoCaptura> findByCpcValor9(java.lang.Double cpcValor9);
}