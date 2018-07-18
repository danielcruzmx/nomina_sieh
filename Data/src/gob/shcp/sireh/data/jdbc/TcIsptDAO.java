package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.Delete;
import gob.shcp.fsn.data.annotation.FindAll;
import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindById;
import gob.shcp.fsn.data.annotation.Save;
import gob.shcp.fsn.service.data.orm.JdbcDataService;

import java.util.List;

import gob.shcp.sireh.domain.jdbc.TcIspt;


/**
 * Data access interface for TcIspt.
 */
 public interface TcIsptDAO extends JdbcDataService {
     /**
      * Find TcIspt entity by its identifier or primary key value.
      *
      * @param id identifier or primary key
      * @return TcIspt
      */
     @FindById(TcIspt.class)
     TcIspt getById(gob.shcp.sireh.domain.jdbc.TcIsptPK id);
     
     /**
      * Get all TcIspt entities limited by a maximum number of elements.
      *
      * @return Collection of TcIspt
      */
     @FindAll(TcIspt.class)
     List<TcIspt> findAll();
     
     /**
      * Make persistence of TcIspt entities. If its identifier or primary key is null then create else update.
      *
      * @param entity TcIspt
      */
     @Save
     void save(TcIspt entity);
     
     /**
      * Remove TcIspt entities.
      *
      * @param entity TcIspt
      */
     @Delete
     void delete(TcIspt entity);


     /**
      * Find the first TcIspt entity that matches the condition 'where fecModifico is equals to'.
      *
      * @param fecModifico java.util.Date
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="FEC_MODIFICO=?")
     TcIspt getByFecModifico(java.util.Date fecModifico);

     /**
      * Find all TcIspt entities that matches the condition 'where fecModifico is equals to'.
      *
      * @param fecModifico java.util.Date
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="FEC_MODIFICO=?")
     List<TcIspt> findByFecModifico(java.util.Date fecModifico);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptCreditoSalario is equals to'.
      *
      * @param isptCreditoSalario double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_CREDITO_SALARIO=?")
     TcIspt getByIsptCreditoSalario(double isptCreditoSalario);

     /**
      * Find all TcIspt entities that matches the condition 'where isptCreditoSalario is equals to'.
      *
      * @param isptCreditoSalario double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_CREDITO_SALARIO=?")
     List<TcIspt> findByIsptCreditoSalario(double isptCreditoSalario);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptCuotaFija is equals to'.
      *
      * @param isptCuotaFija double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_CUOTA_FIJA=?")
     TcIspt getByIsptCuotaFija(double isptCuotaFija);

     /**
      * Find all TcIspt entities that matches the condition 'where isptCuotaFija is equals to'.
      *
      * @param isptCuotaFija double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_CUOTA_FIJA=?")
     List<TcIspt> findByIsptCuotaFija(double isptCuotaFija);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptExcedente is equals to'.
      *
      * @param isptExcedente double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_EXCEDENTE=?")
     TcIspt getByIsptExcedente(double isptExcedente);

     /**
      * Find all TcIspt entities that matches the condition 'where isptExcedente is equals to'.
      *
      * @param isptExcedente double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_EXCEDENTE=?")
     List<TcIspt> findByIsptExcedente(double isptExcedente);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptIni is equals to'.
      *
      * @param isptIni java.util.Date
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_INI=?")
     TcIspt getByIsptIni(java.util.Date isptIni);

     /**
      * Find all TcIspt entities that matches the condition 'where isptIni is equals to'.
      *
      * @param isptIni java.util.Date
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_INI=?")
     List<TcIspt> findByIsptIni(java.util.Date isptIni);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptLimInf1 is equals to'.
      *
      * @param isptLimInf1 double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_LIM_INF1=?")
     TcIspt getByIsptLimInf1(double isptLimInf1);

     /**
      * Find all TcIspt entities that matches the condition 'where isptLimInf1 is equals to'.
      *
      * @param isptLimInf1 double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_LIM_INF1=?")
     List<TcIspt> findByIsptLimInf1(double isptLimInf1);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptLimInf2 is equals to'.
      *
      * @param isptLimInf2 double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_LIM_INF2=?")
     TcIspt getByIsptLimInf2(double isptLimInf2);

     /**
      * Find all TcIspt entities that matches the condition 'where isptLimInf2 is equals to'.
      *
      * @param isptLimInf2 double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_LIM_INF2=?")
     List<TcIspt> findByIsptLimInf2(double isptLimInf2);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptLimSuperior is equals to'.
      *
      * @param isptLimSuperior double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_LIM_SUPERIOR=?")
     TcIspt getByIsptLimSuperior(double isptLimSuperior);

     /**
      * Find all TcIspt entities that matches the condition 'where isptLimSuperior is equals to'.
      *
      * @param isptLimSuperior double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_LIM_SUPERIOR=?")
     List<TcIspt> findByIsptLimSuperior(double isptLimSuperior);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptPorcentaje is equals to'.
      *
      * @param isptPorcentaje float
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_PORCENTAJE=?")
     TcIspt getByIsptPorcentaje(float isptPorcentaje);

     /**
      * Find all TcIspt entities that matches the condition 'where isptPorcentaje is equals to'.
      *
      * @param isptPorcentaje float
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_PORCENTAJE=?")
     List<TcIspt> findByIsptPorcentaje(float isptPorcentaje);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptSubsidio is equals to'.
      *
      * @param isptSubsidio double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_SUBSIDIO=?")
     TcIspt getByIsptSubsidio(double isptSubsidio);

     /**
      * Find all TcIspt entities that matches the condition 'where isptSubsidio is equals to'.
      *
      * @param isptSubsidio double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_SUBSIDIO=?")
     List<TcIspt> findByIsptSubsidio(double isptSubsidio);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptSueldoAnual is equals to'.
      *
      * @param isptSueldoAnual double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_SUELDO_ANUAL=?")
     TcIspt getByIsptSueldoAnual(double isptSueldoAnual);

     /**
      * Find all TcIspt entities that matches the condition 'where isptSueldoAnual is equals to'.
      *
      * @param isptSueldoAnual double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_SUELDO_ANUAL=?")
     List<TcIspt> findByIsptSueldoAnual(double isptSueldoAnual);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptSueldoBruto1 is equals to'.
      *
      * @param isptSueldoBruto1 double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_SUELDO_BRUTO1=?")
     TcIspt getByIsptSueldoBruto1(double isptSueldoBruto1);

     /**
      * Find all TcIspt entities that matches the condition 'where isptSueldoBruto1 is equals to'.
      *
      * @param isptSueldoBruto1 double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_SUELDO_BRUTO1=?")
     List<TcIspt> findByIsptSueldoBruto1(double isptSueldoBruto1);

     /**
      * Find the first TcIspt entity that matches the condition 'where isptSueldoBruto2 is equals to'.
      *
      * @param isptSueldoBruto2 double
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_SUELDO_BRUTO2=?")
     TcIspt getByIsptSueldoBruto2(double isptSueldoBruto2);

     /**
      * Find all TcIspt entities that matches the condition 'where isptSueldoBruto2 is equals to'.
      *
      * @param isptSueldoBruto2 double
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ISPT_SUELDO_BRUTO2=?")
     List<TcIspt> findByIsptSueldoBruto2(double isptSueldoBruto2);

     /**
      * Find the first TcIspt entity that matches the condition 'where usuario is equals to'.
      *
      * @param usuario java.lang.String
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="USUARIO=?")
     TcIspt getByUsuario(java.lang.String usuario);

     /**
      * Find all TcIspt entities that matches the condition 'where usuario is equals to'.
      *
      * @param usuario java.lang.String
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="USUARIO=?")
     List<TcIspt> findByUsuario(java.lang.String usuario);

     /**
      * Find the first TcIspt entity that matches the condition 'where idZonaGeo is equals to'.
      *
      * @param idZonaGeo java.lang.String
      * @return TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ID_ZONA_GEO=?")
     TcIspt getByIdZonaGeo(java.lang.String idZonaGeo);

     /**
      * Find all TcIspt entities that matches the condition 'where idZonaGeo is equals to'.
      *
      * @param idZonaGeo java.lang.String
      * @return Collection of TcIspt
      */
     @FindByCondition(value=TcIspt.class, condition="ID_ZONA_GEO=?")
     List<TcIspt> findByIdZonaGeo(java.lang.String idZonaGeo);
 }