package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.CustomConsultaLinea;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.CustomTdPlazaEmpleadoMovtos;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TcTabulador;
import gob.shcp.sireh.domain.jdbc.TdPlaza;


import gob.shcp.sireh.domain.jdbc.plaza.estructura.CustomTdPlazaEnConcurso;

import java.util.List;

public interface QueryTdPlazaDAO extends TdPlazaDAO {

    @FindByNamedQuery(name="plazaEmpleadosMovtos", value=CustomTdPlazaEmpleadoMovtos.class)
    List<CustomTdPlazaEmpleadoMovtos> findPlazasEmpleadosMovtosPersonal(Integer idPlaza);
    
    @FindByNamedQuery(name="plazaGestionConsultaLinea", value=CustomConsultaLinea.class)
    List<CustomConsultaLinea> findPlazaGestionConsultaLinea(Integer idPlaza, String upUniciclo, String unUniciclo);
    
    @FindByNamedQuery(name="maximaPlazaEventualByCiclo", value=TdPlaza.class)
    List<TdPlaza> getMaximaPlazaEventualByCiclo(int ciclo);
    
    @FindByNamedQuery(name="maxIdPlazaEventual", value=TdPlaza.class)
    List<TdPlaza> getMaxIdPlazaEventual();
    
    @FindByNamedQuery(name="maxIdPlazaHonorarios", value=TdPlaza.class)
    List<TdPlaza> getMaxIdPlazaHonorarios();
    
    @FindByNamedQuery(name="plazaByRFCTo10", value=TdPlaza.class)
    List<TdPlaza> findRFCTo10(String rfc);
    
    @FindByNamedQuery(name="queryCodigoPuesto", value=TcAtributoPuesto.class)
    List<TcAtributoPuesto> findCodigoPuesto(String idPuesto);
    
    @FindByNamedQuery(name="queryCodigoPuestoConEspacios", value=TcAtributoPuesto.class)
    List<TcAtributoPuesto> findCodigoPuestoConEspacios(String idPuesto);
    
    @FindByNamedQuery(name="queryTabulador", value=TcTabulador.class)
    List<TcTabulador> findTabulador(String idPuesto, Integer idZonaEconomica);
    
    @FindByNamedQuery(name="findBypotEscenario", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypotEscenario(String qnaCaptura);

    @FindByNamedQuery(name="findBypotInmueble", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypotInmueble(String qnaCaptura);
    
    @FindByNamedQuery(name="findBypotAltas", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypotAltas(String qnaCaptura, String qnaCaptura2);
    
    @FindByNamedQuery(name="findBypotBajas", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypotBajas(String qnaCaptura, String qnaCaptura2);

    @FindByNamedQuery(name="findBypotDirectorio", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypotDirectorio(String qnaCaptura, String qnaCaptura2);

    @FindByNamedQuery(name="findBypotRemuneraciones", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypotRemuneraciones(String qnaCaptura, String qnaCaptura2);

    @FindByNamedQuery(name="findBypotFuncion", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypotFuncion(String qnaCaptura);

    @FindByNamedQuery(name="findBypotEstadistico", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypotEstadistico(String qnaCaptura);

    @FindByNamedQuery(name="findBypntEstructura", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypntEstructura(String qnaCaptura, String qnaCaptura2);

    @FindByNamedQuery(name="findBypntDirectorio", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypntDirectorio(String qnaCaptura, String qnaCaptura2);

    @FindByNamedQuery(name="findBypntRemuneracion", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypntRemuneracion(String qnaCaptura, String qnaCaptura2);

    @FindByNamedQuery(name="findBypntFuncion", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypntFuncion(String qnaCaptura);

    @FindByNamedQuery(name="findBypntEstadistico", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypntEstadistico(String qnaCaptura,String qnaCaptura2);

    @FindByNamedQuery(name="findBypntInmueble", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypntInmueble(String qnaCaptura);
    
    @FindByNamedQuery(name="findBypntAltas", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypntAltas(String qnaCaptura, String qnaCaptura2);
    
    @FindByNamedQuery(name="findBypntBajas", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypntBajas(String qnaCaptura, String qnaCaptura2);
    
    @FindByNamedQuery(name="findBypntContratacionHonorarios", value=CustomOutputFile.class)
    List<CustomOutputFile> findBypntContratacionHonorarios(String qnaCaptura);

    @FindByNamedQuery(name="consulta-plazas-Vigentes", value=CustomOutputFile.class)
    List<CustomOutputFile> getConsultaPlazasVigentes();
    
    @FindByNamedQuery(name="consulta-vacancias-plazas-candidatas", value=TdPlaza.class)
    List<TdPlaza> getConsultaVacanciasPlazaCandidata(Integer idPlaza);

    @FindByNamedQuery(name="consulta-plazaEnConcurso", value=CustomTdPlazaEnConcurso.class)
    List<CustomTdPlazaEnConcurso> getConsultaPlazaEnConcursoById(Integer idPlaza);
}