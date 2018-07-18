package gob.shcp.sireh.model.configuracion.mantenimiento.plantillas;

import java.util.List;

public class RecordDTO {
    private String nomRecord;
     private String recordIdentMax;
     private String recordIdentMin;
     private List<AtributosPlantillaDTO> listaElement;
     
         public String getNomRecord() {
                 return nomRecord;
         }
         public void setNomRecord(String nomRecord) {
                 this.nomRecord = nomRecord;
         }
         public String getRecordIdentMax() {
                 return recordIdentMax;
         }
         public void setRecordIdentMax(String recordIdentMax) {
                 this.recordIdentMax = recordIdentMax;
         }
         public String getRecordIdentMin() {
                 return recordIdentMin;
         }
         public void setRecordIdentMin(String recordIdentMin) {
                 this.recordIdentMin = recordIdentMin;
         }
         public List<AtributosPlantillaDTO> getListaElement() {
                 return listaElement;
         }
         public void setListaElement(List<AtributosPlantillaDTO> listaElement) {
                 this.listaElement = listaElement;
         }
    }
