package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TnNomina;


/**
 * Data access interface for TnNomina.
 */
public interface TnNominaDAO extends JdbcDataService {
    /**
     * Find TnNomina entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TnNomina
     */
    @FindById(TnNomina.class)
    TnNomina getById(java.lang.Integer id);
    
    /**
     * Get all TnNomina entities limited by a maximum number of elements.
     *
     * @return Collection of TnNomina
     */
    @FindAll(TnNomina.class)
    List<TnNomina> findAll();
    
    /**
     * Make persistence of TnNomina entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TnNomina
     */
    @Save
    void save(TnNomina entity);
    
    /**
     * Remove TnNomina entities.
     *
     * @param entity TnNomina
     */
    @Delete
    void delete(TnNomina entity);


    /**
     * Find the first TnNomina entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="FEC_MODIFICO=?")
    TnNomina getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TnNomina entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="FEC_MODIFICO=?")
    List<TnNomina> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TnNomina entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="USUARIO=?")
    TnNomina getByUsuario(java.lang.String usuario);

    /**
     * Find all TnNomina entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="USUARIO=?")
    List<TnNomina> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TnNomina entity that matches the condition 'where cnPaquete is equals to'.
     *
     * @param cnPaquete java.lang.Integer
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="CN_PAQUETE=?")
    TnNomina getByCnPaquete(java.lang.Integer cnPaquete);

    /**
     * Find all TnNomina entities that matches the condition 'where cnPaquete is equals to'.
     *
     * @param cnPaquete java.lang.Integer
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="CN_PAQUETE=?")
    List<TnNomina> findByCnPaquete(java.lang.Integer cnPaquete);

    /**
     * Find the first TnNomina entity that matches the condition 'where descNomina is equals to'.
     *
     * @param descNomina java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="DESC_NOMINA=?")
    TnNomina getByDescNomina(java.lang.String descNomina);

    /**
     * Find all TnNomina entities that matches the condition 'where descNomina is equals to'.
     *
     * @param descNomina java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="DESC_NOMINA=?")
    List<TnNomina> findByDescNomina(java.lang.String descNomina);

    /**
     * Find the first TnNomina entity that matches the condition 'where idTipoNomina is equals to'.
     *
     * @param idTipoNomina java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="ID_TIPO_NOMINA=?")
    TnNomina getByIdTipoNomina(java.lang.String idTipoNomina);

    /**
     * Find all TnNomina entities that matches the condition 'where idTipoNomina is equals to'.
     *
     * @param idTipoNomina java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="ID_TIPO_NOMINA=?")
    List<TnNomina> findByIdTipoNomina(java.lang.String idTipoNomina);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomAplicarExentos is equals to'.
     *
     * @param nomAplicarExentos java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_APLICAR_EXENTOS=?")
    TnNomina getByNomAplicarExentos(java.lang.String nomAplicarExentos);

    /**
     * Find all TnNomina entities that matches the condition 'where nomAplicarExentos is equals to'.
     *
     * @param nomAplicarExentos java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_APLICAR_EXENTOS=?")
    List<TnNomina> findByNomAplicarExentos(java.lang.String nomAplicarExentos);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomArchAnexo20 is equals to'.
     *
     * @param nomArchAnexo20 java.sql.Blob
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ARCH_ANEXO20=?")
    TnNomina getByNomArchAnexo20(java.sql.Blob nomArchAnexo20);

    /**
     * Find all TnNomina entities that matches the condition 'where nomArchAnexo20 is equals to'.
     *
     * @param nomArchAnexo20 java.sql.Blob
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ARCH_ANEXO20=?")
    List<TnNomina> findByNomArchAnexo20(java.sql.Blob nomArchAnexo20);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomArchCanc is equals to'.
     *
     * @param nomArchCanc java.sql.Blob
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ARCH_CANC=?")
    TnNomina getByNomArchCanc(java.sql.Blob nomArchCanc);

    /**
     * Find all TnNomina entities that matches the condition 'where nomArchCanc is equals to'.
     *
     * @param nomArchCanc java.sql.Blob
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ARCH_CANC=?")
    List<TnNomina> findByNomArchCanc(java.sql.Blob nomArchCanc);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomArchCreacion is equals to'.
     *
     * @param nomArchCreacion java.sql.Blob
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ARCH_CREACION=?")
    TnNomina getByNomArchCreacion(java.sql.Blob nomArchCreacion);

    /**
     * Find all TnNomina entities that matches the condition 'where nomArchCreacion is equals to'.
     *
     * @param nomArchCreacion java.sql.Blob
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ARCH_CREACION=?")
    List<TnNomina> findByNomArchCreacion(java.sql.Blob nomArchCreacion);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomArchTimbrado is equals to'.
     *
     * @param nomArchTimbrado java.sql.Blob
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ARCH_TIMBRADO=?")
    TnNomina getByNomArchTimbrado(java.sql.Blob nomArchTimbrado);

    /**
     * Find all TnNomina entities that matches the condition 'where nomArchTimbrado is equals to'.
     *
     * @param nomArchTimbrado java.sql.Blob
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ARCH_TIMBRADO=?")
    List<TnNomina> findByNomArchTimbrado(java.sql.Blob nomArchTimbrado);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomCerrada is equals to'.
     *
     * @param nomCerrada java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_CERRADA=?")
    TnNomina getByNomCerrada(java.lang.String nomCerrada);

    /**
     * Find all TnNomina entities that matches the condition 'where nomCerrada is equals to'.
     *
     * @param nomCerrada java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_CERRADA=?")
    List<TnNomina> findByNomCerrada(java.lang.String nomCerrada);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomCicloFon is equals to'.
     *
     * @param nomCicloFon java.lang.Integer
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_CICLO_FON=?")
    TnNomina getByNomCicloFon(java.lang.Integer nomCicloFon);

    /**
     * Find all TnNomina entities that matches the condition 'where nomCicloFon is equals to'.
     *
     * @param nomCicloFon java.lang.Integer
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_CICLO_FON=?")
    List<TnNomina> findByNomCicloFon(java.lang.Integer nomCicloFon);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomCompletarPeriodo is equals to'.
     *
     * @param nomCompletarPeriodo java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_COMPLETAR_PERIODO=?")
    TnNomina getByNomCompletarPeriodo(java.lang.String nomCompletarPeriodo);

    /**
     * Find all TnNomina entities that matches the condition 'where nomCompletarPeriodo is equals to'.
     *
     * @param nomCompletarPeriodo java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_COMPLETAR_PERIODO=?")
    List<TnNomina> findByNomCompletarPeriodo(java.lang.String nomCompletarPeriodo);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomDiasPagar is equals to'.
     *
     * @param nomDiasPagar java.lang.Integer
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_DIAS_PAGAR=?")
    TnNomina getByNomDiasPagar(java.lang.Integer nomDiasPagar);

    /**
     * Find all TnNomina entities that matches the condition 'where nomDiasPagar is equals to'.
     *
     * @param nomDiasPagar java.lang.Integer
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_DIAS_PAGAR=?")
    List<TnNomina> findByNomDiasPagar(java.lang.Integer nomDiasPagar);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFacRen1 is equals to'.
     *
     * @param nomFacRen1 java.lang.Double
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FAC_REN1=?")
    TnNomina getByNomFacRen1(java.lang.Double nomFacRen1);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFacRen1 is equals to'.
     *
     * @param nomFacRen1 java.lang.Double
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FAC_REN1=?")
    List<TnNomina> findByNomFacRen1(java.lang.Double nomFacRen1);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFacRen2 is equals to'.
     *
     * @param nomFacRen2 java.lang.Double
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FAC_REN2=?")
    TnNomina getByNomFacRen2(java.lang.Double nomFacRen2);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFacRen2 is equals to'.
     *
     * @param nomFacRen2 java.lang.Double
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FAC_REN2=?")
    List<TnNomina> findByNomFacRen2(java.lang.Double nomFacRen2);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecAnexo20 is equals to'.
     *
     * @param nomFecAnexo20 java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_ANEXO20=?")
    TnNomina getByNomFecAnexo20(java.util.Date nomFecAnexo20);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecAnexo20 is equals to'.
     *
     * @param nomFecAnexo20 java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_ANEXO20=?")
    List<TnNomina> findByNomFecAnexo20(java.util.Date nomFecAnexo20);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecApertura is equals to'.
     *
     * @param nomFecApertura java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_APERTURA=?")
    TnNomina getByNomFecApertura(java.util.Date nomFecApertura);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecApertura is equals to'.
     *
     * @param nomFecApertura java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_APERTURA=?")
    List<TnNomina> findByNomFecApertura(java.util.Date nomFecApertura);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecCancA20 is equals to'.
     *
     * @param nomFecCancA20 java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CANC_A20=?")
    TnNomina getByNomFecCancA20(java.util.Date nomFecCancA20);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecCancA20 is equals to'.
     *
     * @param nomFecCancA20 java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CANC_A20=?")
    List<TnNomina> findByNomFecCancA20(java.util.Date nomFecCancA20);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecCancSat is equals to'.
     *
     * @param nomFecCancSat java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CANC_SAT=?")
    TnNomina getByNomFecCancSat(java.util.Date nomFecCancSat);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecCancSat is equals to'.
     *
     * @param nomFecCancSat java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CANC_SAT=?")
    List<TnNomina> findByNomFecCancSat(java.util.Date nomFecCancSat);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecCancSireh is equals to'.
     *
     * @param nomFecCancSireh java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CANC_SIREH=?")
    TnNomina getByNomFecCancSireh(java.util.Date nomFecCancSireh);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecCancSireh is equals to'.
     *
     * @param nomFecCancSireh java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CANC_SIREH=?")
    List<TnNomina> findByNomFecCancSireh(java.util.Date nomFecCancSireh);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecCierre is equals to'.
     *
     * @param nomFecCierre java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CIERRE=?")
    TnNomina getByNomFecCierre(java.util.Date nomFecCierre);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecCierre is equals to'.
     *
     * @param nomFecCierre java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CIERRE=?")
    List<TnNomina> findByNomFecCierre(java.util.Date nomFecCierre);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecCreacion is equals to'.
     *
     * @param nomFecCreacion java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CREACION=?")
    TnNomina getByNomFecCreacion(java.util.Date nomFecCreacion);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecCreacion is equals to'.
     *
     * @param nomFecCreacion java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_CREACION=?")
    List<TnNomina> findByNomFecCreacion(java.util.Date nomFecCreacion);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecDeposito is equals to'.
     *
     * @param nomFecDeposito java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_DEPOSITO=?")
    TnNomina getByNomFecDeposito(java.util.Date nomFecDeposito);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecDeposito is equals to'.
     *
     * @param nomFecDeposito java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_DEPOSITO=?")
    List<TnNomina> findByNomFecDeposito(java.util.Date nomFecDeposito);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecPago is equals to'.
     *
     * @param nomFecPago java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_PAGO=?")
    TnNomina getByNomFecPago(java.util.Date nomFecPago);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecPago is equals to'.
     *
     * @param nomFecPago java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_PAGO=?")
    List<TnNomina> findByNomFecPago(java.util.Date nomFecPago);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFecTimbrado is equals to'.
     *
     * @param nomFecTimbrado java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_TIMBRADO=?")
    TnNomina getByNomFecTimbrado(java.util.Date nomFecTimbrado);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFecTimbrado is equals to'.
     *
     * @param nomFecTimbrado java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FEC_TIMBRADO=?")
    List<TnNomina> findByNomFecTimbrado(java.util.Date nomFecTimbrado);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFinPago is equals to'.
     *
     * @param nomFinPago java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FIN_PAGO=?")
    TnNomina getByNomFinPago(java.util.Date nomFinPago);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFinPago is equals to'.
     *
     * @param nomFinPago java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FIN_PAGO=?")
    List<TnNomina> findByNomFinPago(java.util.Date nomFinPago);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomFuenteDatos is equals to'.
     *
     * @param nomFuenteDatos java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FUENTE_DATOS=?")
    TnNomina getByNomFuenteDatos(java.lang.String nomFuenteDatos);

    /**
     * Find all TnNomina entities that matches the condition 'where nomFuenteDatos is equals to'.
     *
     * @param nomFuenteDatos java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_FUENTE_DATOS=?")
    List<TnNomina> findByNomFuenteDatos(java.lang.String nomFuenteDatos);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomGobFed1 is equals to'.
     *
     * @param nomGobFed1 java.lang.Double
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GOB_FED1=?")
    TnNomina getByNomGobFed1(java.lang.Double nomGobFed1);

    /**
     * Find all TnNomina entities that matches the condition 'where nomGobFed1 is equals to'.
     *
     * @param nomGobFed1 java.lang.Double
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GOB_FED1=?")
    List<TnNomina> findByNomGobFed1(java.lang.Double nomGobFed1);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomGobFed2 is equals to'.
     *
     * @param nomGobFed2 java.lang.Double
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GOB_FED2=?")
    TnNomina getByNomGobFed2(java.lang.Double nomGobFed2);

    /**
     * Find all TnNomina entities that matches the condition 'where nomGobFed2 is equals to'.
     *
     * @param nomGobFed2 java.lang.Double
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GOB_FED2=?")
    List<TnNomina> findByNomGobFed2(java.lang.Double nomGobFed2);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomGobFed3 is equals to'.
     *
     * @param nomGobFed3 java.lang.Double
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GOB_FED3=?")
    TnNomina getByNomGobFed3(java.lang.Double nomGobFed3);

    /**
     * Find all TnNomina entities that matches the condition 'where nomGobFed3 is equals to'.
     *
     * @param nomGobFed3 java.lang.Double
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GOB_FED3=?")
    List<TnNomina> findByNomGobFed3(java.lang.Double nomGobFed3);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomGobFed4 is equals to'.
     *
     * @param nomGobFed4 java.lang.Double
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GOB_FED4=?")
    TnNomina getByNomGobFed4(java.lang.Double nomGobFed4);

    /**
     * Find all TnNomina entities that matches the condition 'where nomGobFed4 is equals to'.
     *
     * @param nomGobFed4 java.lang.Double
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GOB_FED4=?")
    List<TnNomina> findByNomGobFed4(java.lang.Double nomGobFed4);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomGratifAgui is equals to'.
     *
     * @param nomGratifAgui java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GRATIF_AGUI=?")
    TnNomina getByNomGratifAgui(java.lang.String nomGratifAgui);

    /**
     * Find all TnNomina entities that matches the condition 'where nomGratifAgui is equals to'.
     *
     * @param nomGratifAgui java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_GRATIF_AGUI=?")
    List<TnNomina> findByNomGratifAgui(java.lang.String nomGratifAgui);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomIdPaqueteSat is equals to'.
     *
     * @param nomIdPaqueteSat java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ID_PAQUETE_SAT=?")
    TnNomina getByNomIdPaqueteSat(java.lang.String nomIdPaqueteSat);

    /**
     * Find all TnNomina entities that matches the condition 'where nomIdPaqueteSat is equals to'.
     *
     * @param nomIdPaqueteSat java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_ID_PAQUETE_SAT=?")
    List<TnNomina> findByNomIdPaqueteSat(java.lang.String nomIdPaqueteSat);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomImpSin1 is equals to'.
     *
     * @param nomImpSin1 java.lang.Double
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_IMP_SIN1=?")
    TnNomina getByNomImpSin1(java.lang.Double nomImpSin1);

    /**
     * Find all TnNomina entities that matches the condition 'where nomImpSin1 is equals to'.
     *
     * @param nomImpSin1 java.lang.Double
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_IMP_SIN1=?")
    List<TnNomina> findByNomImpSin1(java.lang.Double nomImpSin1);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomImpSin2 is equals to'.
     *
     * @param nomImpSin2 java.lang.Double
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_IMP_SIN2=?")
    TnNomina getByNomImpSin2(java.lang.Double nomImpSin2);

    /**
     * Find all TnNomina entities that matches the condition 'where nomImpSin2 is equals to'.
     *
     * @param nomImpSin2 java.lang.Double
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_IMP_SIN2=?")
    List<TnNomina> findByNomImpSin2(java.lang.Double nomImpSin2);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomIniPago is equals to'.
     *
     * @param nomIniPago java.util.Date
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_INI_PAGO=?")
    TnNomina getByNomIniPago(java.util.Date nomIniPago);

    /**
     * Find all TnNomina entities that matches the condition 'where nomIniPago is equals to'.
     *
     * @param nomIniPago java.util.Date
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_INI_PAGO=?")
    List<TnNomina> findByNomIniPago(java.util.Date nomIniPago);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomLeyenda is equals to'.
     *
     * @param nomLeyenda java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_LEYENDA=?")
    TnNomina getByNomLeyenda(java.lang.String nomLeyenda);

    /**
     * Find all TnNomina entities that matches the condition 'where nomLeyenda is equals to'.
     *
     * @param nomLeyenda java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_LEYENDA=?")
    List<TnNomina> findByNomLeyenda(java.lang.String nomLeyenda);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomNumComplem is equals to'.
     *
     * @param nomNumComplem java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_NUM_COMPLEM=?")
    TnNomina getByNomNumComplem(java.lang.String nomNumComplem);

    /**
     * Find all TnNomina entities that matches the condition 'where nomNumComplem is equals to'.
     *
     * @param nomNumComplem java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_NUM_COMPLEM=?")
    List<TnNomina> findByNomNumComplem(java.lang.String nomNumComplem);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomQnaCaptura is equals to'.
     *
     * @param nomQnaCaptura java.lang.Integer
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_QNA_CAPTURA=?")
    TnNomina getByNomQnaCaptura(java.lang.Integer nomQnaCaptura);

    /**
     * Find all TnNomina entities that matches the condition 'where nomQnaCaptura is equals to'.
     *
     * @param nomQnaCaptura java.lang.Integer
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_QNA_CAPTURA=?")
    List<TnNomina> findByNomQnaCaptura(java.lang.Integer nomQnaCaptura);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomRefSat is equals to'.
     *
     * @param nomRefSat java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_REF_SAT=?")
    TnNomina getByNomRefSat(java.lang.String nomRefSat);

    /**
     * Find all TnNomina entities that matches the condition 'where nomRefSat is equals to'.
     *
     * @param nomRefSat java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_REF_SAT=?")
    List<TnNomina> findByNomRefSat(java.lang.String nomRefSat);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomRefTimbrado is equals to'.
     *
     * @param nomRefTimbrado java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_REF_TIMBRADO=?")
    TnNomina getByNomRefTimbrado(java.lang.String nomRefTimbrado);

    /**
     * Find all TnNomina entities that matches the condition 'where nomRefTimbrado is equals to'.
     *
     * @param nomRefTimbrado java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_REF_TIMBRADO=?")
    List<TnNomina> findByNomRefTimbrado(java.lang.String nomRefTimbrado);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomReglaCalculo is equals to'.
     *
     * @param nomReglaCalculo java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_REGLA_CALCULO=?")
    TnNomina getByNomReglaCalculo(java.lang.String nomReglaCalculo);

    /**
     * Find all TnNomina entities that matches the condition 'where nomReglaCalculo is equals to'.
     *
     * @param nomReglaCalculo java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_REGLA_CALCULO=?")
    List<TnNomina> findByNomReglaCalculo(java.lang.String nomReglaCalculo);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomRemesa is equals to'.
     *
     * @param nomRemesa java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_REMESA=?")
    TnNomina getByNomRemesa(java.lang.String nomRemesa);

    /**
     * Find all TnNomina entities that matches the condition 'where nomRemesa is equals to'.
     *
     * @param nomRemesa java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_REMESA=?")
    List<TnNomina> findByNomRemesa(java.lang.String nomRemesa);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomUriblobCanc is equals to'.
     *
     * @param nomUriblobCanc java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_URIBLOB_CANC=?")
    TnNomina getByNomUriblobCanc(java.lang.String nomUriblobCanc);

    /**
     * Find all TnNomina entities that matches the condition 'where nomUriblobCanc is equals to'.
     *
     * @param nomUriblobCanc java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_URIBLOB_CANC=?")
    List<TnNomina> findByNomUriblobCanc(java.lang.String nomUriblobCanc);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomUriblobTimb is equals to'.
     *
     * @param nomUriblobTimb java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_URIBLOB_TIMB=?")
    TnNomina getByNomUriblobTimb(java.lang.String nomUriblobTimb);

    /**
     * Find all TnNomina entities that matches the condition 'where nomUriblobTimb is equals to'.
     *
     * @param nomUriblobTimb java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_URIBLOB_TIMB=?")
    List<TnNomina> findByNomUriblobTimb(java.lang.String nomUriblobTimb);

    /**
     * Find the first TnNomina entity that matches the condition 'where nomVigente is equals to'.
     *
     * @param nomVigente java.lang.String
     * @return TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_VIGENTE=?")
    TnNomina getByNomVigente(java.lang.String nomVigente);

    /**
     * Find all TnNomina entities that matches the condition 'where nomVigente is equals to'.
     *
     * @param nomVigente java.lang.String
     * @return Collection of TnNomina
     */
    @FindByCondition(value=TnNomina.class, condition="NOM_VIGENTE=?")
    List<TnNomina> findByNomVigente(java.lang.String nomVigente);
}