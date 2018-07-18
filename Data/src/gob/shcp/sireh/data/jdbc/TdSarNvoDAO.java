package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TdSarNvo;


/**
 * Data access interface for TdSarNvo.
 */
public interface TdSarNvoDAO extends JdbcDataService {
    /**
     * Find TdSarNvo entity by its identifier or primary key value.
     *
     * @param id identifier or primary key
     * @return TdSarNvo
     */
    @FindById(TdSarNvo.class)
    TdSarNvo getById(java.lang.Long id);
    
    /**
     * Get all TdSarNvo entities limited by a maximum number of elements.
     *
     * @return Collection of TdSarNvo
     */
    @FindAll(TdSarNvo.class)
    List<TdSarNvo> findAll();
    
    /**
     * Make persistence of TdSarNvo entities. If its identifier or primary key is null then create else update.
     *
     * @param entity TdSarNvo
     */
    @Save
    void save(TdSarNvo entity);
    
    /**
     * Remove TdSarNvo entities.
     *
     * @param entity TdSarNvo
     */
    @Delete
    void delete(TdSarNvo entity);


    /**
     * Find the first TdSarNvo entity that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="FEC_MODIFICO=?")
    TdSarNvo getByFecModifico(java.util.Date fecModifico);

    /**
     * Find all TdSarNvo entities that matches the condition 'where fecModifico is equals to'.
     *
     * @param fecModifico java.util.Date
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="FEC_MODIFICO=?")
    List<TdSarNvo> findByFecModifico(java.util.Date fecModifico);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="USUARIO=?")
    TdSarNvo getByUsuario(java.lang.String usuario);

    /**
     * Find all TdSarNvo entities that matches the condition 'where usuario is equals to'.
     *
     * @param usuario java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="USUARIO=?")
    List<TdSarNvo> findByUsuario(java.lang.String usuario);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where idEdoCivil is equals to'.
     *
     * @param idEdoCivil java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_EDO_CIVIL=?")
    TdSarNvo getByIdEdoCivil(java.lang.String idEdoCivil);

    /**
     * Find all TdSarNvo entities that matches the condition 'where idEdoCivil is equals to'.
     *
     * @param idEdoCivil java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_EDO_CIVIL=?")
    List<TdSarNvo> findByIdEdoCivil(java.lang.String idEdoCivil);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where idEdoNac is equals to'.
     *
     * @param idEdoNac java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_EDO_NAC=?")
    TdSarNvo getByIdEdoNac(java.lang.String idEdoNac);

    /**
     * Find all TdSarNvo entities that matches the condition 'where idEdoNac is equals to'.
     *
     * @param idEdoNac java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_EDO_NAC=?")
    List<TdSarNvo> findByIdEdoNac(java.lang.String idEdoNac);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where idEdoParti is equals to'.
     *
     * @param idEdoParti java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_EDO_PARTI=?")
    TdSarNvo getByIdEdoParti(java.lang.String idEdoParti);

    /**
     * Find all TdSarNvo entities that matches the condition 'where idEdoParti is equals to'.
     *
     * @param idEdoParti java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_EDO_PARTI=?")
    List<TdSarNvo> findByIdEdoParti(java.lang.String idEdoParti);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where idEdoReceptora is equals to'.
     *
     * @param idEdoReceptora java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_EDO_RECEPTORA=?")
    TdSarNvo getByIdEdoReceptora(java.lang.String idEdoReceptora);

    /**
     * Find all TdSarNvo entities that matches the condition 'where idEdoReceptora is equals to'.
     *
     * @param idEdoReceptora java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_EDO_RECEPTORA=?")
    List<TdSarNvo> findByIdEdoReceptora(java.lang.String idEdoReceptora);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_GENERO=?")
    TdSarNvo getByIdGenero(java.lang.String idGenero);

    /**
     * Find all TdSarNvo entities that matches the condition 'where idGenero is equals to'.
     *
     * @param idGenero java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_GENERO=?")
    List<TdSarNvo> findByIdGenero(java.lang.String idGenero);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where idMunicipio is equals to'.
     *
     * @param idMunicipio java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_MUNICIPIO=?")
    TdSarNvo getByIdMunicipio(java.lang.String idMunicipio);

    /**
     * Find all TdSarNvo entities that matches the condition 'where idMunicipio is equals to'.
     *
     * @param idMunicipio java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="ID_MUNICIPIO=?")
    List<TdSarNvo> findByIdMunicipio(java.lang.String idMunicipio);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snAportAhorroSol is equals to'.
     *
     * @param snAportAhorroSol java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_APORT_AHORRO_SOL=?")
    TdSarNvo getBySnAportAhorroSol(java.lang.String snAportAhorroSol);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snAportAhorroSol is equals to'.
     *
     * @param snAportAhorroSol java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_APORT_AHORRO_SOL=?")
    List<TdSarNvo> findBySnAportAhorroSol(java.lang.String snAportAhorroSol);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snCalleParti is equals to'.
     *
     * @param snCalleParti java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_CALLE_PARTI=?")
    TdSarNvo getBySnCalleParti(java.lang.String snCalleParti);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snCalleParti is equals to'.
     *
     * @param snCalleParti java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_CALLE_PARTI=?")
    List<TdSarNvo> findBySnCalleParti(java.lang.String snCalleParti);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snCiclo is equals to'.
     *
     * @param snCiclo java.lang.Integer
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_CICLO=?")
    TdSarNvo getBySnCiclo(java.lang.Integer snCiclo);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snCiclo is equals to'.
     *
     * @param snCiclo java.lang.Integer
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_CICLO=?")
    List<TdSarNvo> findBySnCiclo(java.lang.Integer snCiclo);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snCodPost is equals to'.
     *
     * @param snCodPost java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_COD_POST=?")
    TdSarNvo getBySnCodPost(java.lang.String snCodPost);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snCodPost is equals to'.
     *
     * @param snCodPost java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_COD_POST=?")
    List<TdSarNvo> findBySnCodPost(java.lang.String snCodPost);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snColoniaParti is equals to'.
     *
     * @param snColoniaParti java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_COLONIA_PARTI=?")
    TdSarNvo getBySnColoniaParti(java.lang.String snColoniaParti);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snColoniaParti is equals to'.
     *
     * @param snColoniaParti java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_COLONIA_PARTI=?")
    List<TdSarNvo> findBySnColoniaParti(java.lang.String snColoniaParti);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snCredFovissste is equals to'.
     *
     * @param snCredFovissste java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_CRED_FOVISSSTE=?")
    TdSarNvo getBySnCredFovissste(java.lang.String snCredFovissste);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snCredFovissste is equals to'.
     *
     * @param snCredFovissste java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_CRED_FOVISSSTE=?")
    List<TdSarNvo> findBySnCredFovissste(java.lang.String snCredFovissste);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snCurp is equals to'.
     *
     * @param snCurp java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_CURP=?")
    TdSarNvo getBySnCurp(java.lang.String snCurp);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snCurp is equals to'.
     *
     * @param snCurp java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_CURP=?")
    List<TdSarNvo> findBySnCurp(java.lang.String snCurp);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snDiasAusentismoBim is equals to'.
     *
     * @param snDiasAusentismoBim java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_DIAS_AUSENTISMO_BIM=?")
    TdSarNvo getBySnDiasAusentismoBim(java.lang.String snDiasAusentismoBim);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snDiasAusentismoBim is equals to'.
     *
     * @param snDiasAusentismoBim java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_DIAS_AUSENTISMO_BIM=?")
    List<TdSarNvo> findBySnDiasAusentismoBim(java.lang.String snDiasAusentismoBim);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snDiasCotizadosBim is equals to'.
     *
     * @param snDiasCotizadosBim java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_DIAS_COTIZADOS_BIM=?")
    TdSarNvo getBySnDiasCotizadosBim(java.lang.String snDiasCotizadosBim);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snDiasCotizadosBim is equals to'.
     *
     * @param snDiasCotizadosBim java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_DIAS_COTIZADOS_BIM=?")
    List<TdSarNvo> findBySnDiasCotizadosBim(java.lang.String snDiasCotizadosBim);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snDiasIncapacidadBim is equals to'.
     *
     * @param snDiasIncapacidadBim java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_DIAS_INCAPACIDAD_BIM=?")
    TdSarNvo getBySnDiasIncapacidadBim(java.lang.String snDiasIncapacidadBim);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snDiasIncapacidadBim is equals to'.
     *
     * @param snDiasIncapacidadBim java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_DIAS_INCAPACIDAD_BIM=?")
    List<TdSarNvo> findBySnDiasIncapacidadBim(java.lang.String snDiasIncapacidadBim);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snFecCotizaIssste is equals to'.
     *
     * @param snFecCotizaIssste java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_FEC_COTIZA_ISSSTE=?")
    TdSarNvo getBySnFecCotizaIssste(java.lang.String snFecCotizaIssste);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snFecCotizaIssste is equals to'.
     *
     * @param snFecCotizaIssste java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_FEC_COTIZA_ISSSTE=?")
    List<TdSarNvo> findBySnFecCotizaIssste(java.lang.String snFecCotizaIssste);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snFecIngrDep is equals to'.
     *
     * @param snFecIngrDep java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_FEC_INGR_DEP=?")
    TdSarNvo getBySnFecIngrDep(java.lang.String snFecIngrDep);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snFecIngrDep is equals to'.
     *
     * @param snFecIngrDep java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_FEC_INGR_DEP=?")
    List<TdSarNvo> findBySnFecIngrDep(java.lang.String snFecIngrDep);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snFecNac is equals to'.
     *
     * @param snFecNac java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_FEC_NAC=?")
    TdSarNvo getBySnFecNac(java.lang.String snFecNac);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snFecNac is equals to'.
     *
     * @param snFecNac java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_FEC_NAC=?")
    List<TdSarNvo> findBySnFecNac(java.lang.String snFecNac);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snImpAhorroSol is equals to'.
     *
     * @param snImpAhorroSol java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_IMP_AHORRO_SOL=?")
    TdSarNvo getBySnImpAhorroSol(java.lang.String snImpAhorroSol);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snImpAhorroSol is equals to'.
     *
     * @param snImpAhorroSol java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_IMP_AHORRO_SOL=?")
    List<TdSarNvo> findBySnImpAhorroSol(java.lang.String snImpAhorroSol);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snNombramiento is equals to'.
     *
     * @param snNombramiento java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_NOMBRAMIENTO=?")
    TdSarNvo getBySnNombramiento(java.lang.String snNombramiento);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snNombramiento is equals to'.
     *
     * @param snNombramiento java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_NOMBRAMIENTO=?")
    List<TdSarNvo> findBySnNombramiento(java.lang.String snNombramiento);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snNombre is equals to'.
     *
     * @param snNombre java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_NOMBRE=?")
    TdSarNvo getBySnNombre(java.lang.String snNombre);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snNombre is equals to'.
     *
     * @param snNombre java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_NOMBRE=?")
    List<TdSarNvo> findBySnNombre(java.lang.String snNombre);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snNssIssste is equals to'.
     *
     * @param snNssIssste java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_NSS_ISSSTE=?")
    TdSarNvo getBySnNssIssste(java.lang.String snNssIssste);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snNssIssste is equals to'.
     *
     * @param snNssIssste java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_NSS_ISSSTE=?")
    List<TdSarNvo> findBySnNssIssste(java.lang.String snNssIssste);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snNumEmpleado is equals to'.
     *
     * @param snNumEmpleado java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_NUM_EMPLEADO=?")
    TdSarNvo getBySnNumEmpleado(java.lang.String snNumEmpleado);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snNumEmpleado is equals to'.
     *
     * @param snNumEmpleado java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_NUM_EMPLEADO=?")
    List<TdSarNvo> findBySnNumEmpleado(java.lang.String snNumEmpleado);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snPagaduria is equals to'.
     *
     * @param snPagaduria java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_PAGADURIA=?")
    TdSarNvo getBySnPagaduria(java.lang.String snPagaduria);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snPagaduria is equals to'.
     *
     * @param snPagaduria java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_PAGADURIA=?")
    List<TdSarNvo> findBySnPagaduria(java.lang.String snPagaduria);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snPrimerApellido is equals to'.
     *
     * @param snPrimerApellido java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_PRIMER_APELLIDO=?")
    TdSarNvo getBySnPrimerApellido(java.lang.String snPrimerApellido);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snPrimerApellido is equals to'.
     *
     * @param snPrimerApellido java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_PRIMER_APELLIDO=?")
    List<TdSarNvo> findBySnPrimerApellido(java.lang.String snPrimerApellido);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snReparto is equals to'.
     *
     * @param snReparto java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_REPARTO=?")
    TdSarNvo getBySnReparto(java.lang.String snReparto);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snReparto is equals to'.
     *
     * @param snReparto java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_REPARTO=?")
    List<TdSarNvo> findBySnReparto(java.lang.String snReparto);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snRfc is equals to'.
     *
     * @param snRfc java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_RFC=?")
    TdSarNvo getBySnRfc(java.lang.String snRfc);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snRfc is equals to'.
     *
     * @param snRfc java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_RFC=?")
    List<TdSarNvo> findBySnRfc(java.lang.String snRfc);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snSarBimestre is equals to'.
     *
     * @param snSarBimestre java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SAR_BIMESTRE=?")
    TdSarNvo getBySnSarBimestre(java.lang.String snSarBimestre);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snSarBimestre is equals to'.
     *
     * @param snSarBimestre java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SAR_BIMESTRE=?")
    List<TdSarNvo> findBySnSarBimestre(java.lang.String snSarBimestre);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snSdoBasicoAmorFovissste is equals to'.
     *
     * @param snSdoBasicoAmorFovissste java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SDO_BASICO_AMOR_FOVISSSTE=?")
    TdSarNvo getBySnSdoBasicoAmorFovissste(java.lang.String snSdoBasicoAmorFovissste);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snSdoBasicoAmorFovissste is equals to'.
     *
     * @param snSdoBasicoAmorFovissste java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SDO_BASICO_AMOR_FOVISSSTE=?")
    List<TdSarNvo> findBySnSdoBasicoAmorFovissste(java.lang.String snSdoBasicoAmorFovissste);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snSdoBasicoCotizaFovissste is equals to'.
     *
     * @param snSdoBasicoCotizaFovissste java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SDO_BASICO_COTIZA_FOVISSSTE=?")
    TdSarNvo getBySnSdoBasicoCotizaFovissste(java.lang.String snSdoBasicoCotizaFovissste);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snSdoBasicoCotizaFovissste is equals to'.
     *
     * @param snSdoBasicoCotizaFovissste java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SDO_BASICO_COTIZA_FOVISSSTE=?")
    List<TdSarNvo> findBySnSdoBasicoCotizaFovissste(java.lang.String snSdoBasicoCotizaFovissste);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snSdoBasicoCotizaRcv is equals to'.
     *
     * @param snSdoBasicoCotizaRcv java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SDO_BASICO_COTIZA_RCV=?")
    TdSarNvo getBySnSdoBasicoCotizaRcv(java.lang.String snSdoBasicoCotizaRcv);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snSdoBasicoCotizaRcv is equals to'.
     *
     * @param snSdoBasicoCotizaRcv java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SDO_BASICO_COTIZA_RCV=?")
    List<TdSarNvo> findBySnSdoBasicoCotizaRcv(java.lang.String snSdoBasicoCotizaRcv);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snSegundoApellido is equals to'.
     *
     * @param snSegundoApellido java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SEGUNDO_APELLIDO=?")
    TdSarNvo getBySnSegundoApellido(java.lang.String snSegundoApellido);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snSegundoApellido is equals to'.
     *
     * @param snSegundoApellido java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_SEGUNDO_APELLIDO=?")
    List<TdSarNvo> findBySnSegundoApellido(java.lang.String snSegundoApellido);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snTipoMovto is equals to'.
     *
     * @param snTipoMovto java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_TIPO_MOVTO=?")
    TdSarNvo getBySnTipoMovto(java.lang.String snTipoMovto);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snTipoMovto is equals to'.
     *
     * @param snTipoMovto java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_TIPO_MOVTO=?")
    List<TdSarNvo> findBySnTipoMovto(java.lang.String snTipoMovto);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snTrabajadorRegAfore is equals to'.
     *
     * @param snTrabajadorRegAfore java.lang.String
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_TRABAJADOR_REG_AFORE=?")
    TdSarNvo getBySnTrabajadorRegAfore(java.lang.String snTrabajadorRegAfore);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snTrabajadorRegAfore is equals to'.
     *
     * @param snTrabajadorRegAfore java.lang.String
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_TRABAJADOR_REG_AFORE=?")
    List<TdSarNvo> findBySnTrabajadorRegAfore(java.lang.String snTrabajadorRegAfore);

    /**
     * Find the first TdSarNvo entity that matches the condition 'where snVersion is equals to'.
     *
     * @param snVersion java.lang.Long
     * @return TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_VERSION=?")
    TdSarNvo getBySnVersion(java.lang.Long snVersion);

    /**
     * Find all TdSarNvo entities that matches the condition 'where snVersion is equals to'.
     *
     * @param snVersion java.lang.Long
     * @return Collection of TdSarNvo
     */
    @FindByCondition(value=TdSarNvo.class, condition="SN_VERSION=?")
    List<TdSarNvo> findBySnVersion(java.lang.Long snVersion);
}