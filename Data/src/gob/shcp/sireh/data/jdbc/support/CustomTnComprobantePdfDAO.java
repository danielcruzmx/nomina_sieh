package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;



import gob.shcp.sireh.domain.jdbc.nomina.terceros.TnComprobantePdfBlob;

import java.util.List;


public interface CustomTnComprobantePdfDAO extends DataService{
    List<TnComprobantePdfBlob> getTnComprobantePdfById(List<Integer> listFolios, Integer cnDifFolio);
}
