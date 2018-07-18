package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.CustomArmaQueryGeneraterceros;

import gob.shcp.sireh.domain.jdbc.CustomOutputFile;

import java.util.List;

public interface QueryGeneraTercerosDAO extends TdEmpleadoDAO {

    @FindByNamedQuery(name = "camposQueryTerceros", value = CustomArmaQueryGeneraterceros.class)
    List<CustomArmaQueryGeneraterceros> findCamposQueryTerceros(String idTercero);

    @FindByNamedQuery(name = "funcDirectorio", value = CustomArmaQueryGeneraterceros.class)
    List<CustomArmaQueryGeneraterceros> funcDirectorio(String QnaCaptura, String TipoArchivo);

    @FindByNamedQuery(name = "terceroPadronFonacot", value = CustomOutputFile.class)
    public List<CustomOutputFile> getPadronFonacot(Integer ciclo, String quincena);

    @FindByNamedQuery(name = "segInstOrdinario", value = CustomOutputFile.class)
    public List<CustomOutputFile> getSegInstOrdinario(String quincena);

    @FindByNamedQuery(name = "segInstExtraordinario", value = CustomOutputFile.class)
    public List<CustomOutputFile> getSegInstExtraordinario(String quincena);

    @FindByNamedQuery(name = "segInstAnticipado", value = CustomOutputFile.class)
    public List<CustomOutputFile> getSegInstAnticipado(String quincena);
    
}
