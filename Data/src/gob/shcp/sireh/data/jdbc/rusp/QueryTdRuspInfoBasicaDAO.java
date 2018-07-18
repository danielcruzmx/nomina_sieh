package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.rusp.Rusp;
import gob.shcp.sireh.domain.jdbc.rusp.TdRuspInfoBasica;


import java.sql.Types;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public interface QueryTdRuspInfoBasicaDAO extends TdRuspInfoBasicaDAO {
    
    @FindByNamedQuery(name = "XXXMCSXXX", value = CustomOutputFile.class)
    public List<CustomOutputFile> findByCriterios(Integer ciclo, Integer qna, Integer qnaAnt, String email, String usuario, String nomina, String escenario);
    
    @FindByNamedQuery(name = "rusp-Proceso-BajaRUSP-CasosBajas", value = Rusp.class)
    public List<Rusp> numRegPBajas(Integer ciclo);
    
    @FindByNamedQuery(name = "getNumReg_pInfoBasic", value = Rusp.class)
    public List<Rusp> numRegPInfoBasic(Integer ciclo);   
    
    @FindByNamedQuery(name = "getNumReg_pDatosPer", value = Rusp.class)
    public List<Rusp> numRegPDatosPer(Integer ciclo);   
}
