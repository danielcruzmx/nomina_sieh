package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

public class ComponenteXmlDTO implements java.io.Serializable, Model{

    private Long cnFolio; 
    private Integer cnDifFolio; 
    private String cnCadenaOriginal;    
    private String cnCadenaSello;    
    private String xml;


    public ComponenteXmlDTO(){}

    public ComponenteXmlDTO(Long cnFolio, String xml ){
        this.cnFolio=cnFolio;
        this.xml = xml;
    }

    public ComponenteXmlDTO(Long cnFolio, Integer cnDifFolio, String xml, String cnCadenaOriginal, String cnCadenaSello ){
        this.cnFolio=cnFolio;
        this.cnDifFolio = cnDifFolio;
        this.cnCadenaOriginal = cnCadenaOriginal;
        this.cnCadenaSello = cnCadenaSello;
        this.xml = xml;
    }



    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getXml() {
        return xml;
    }



    public void setCnFolio(Long cnFolio) {
        this.cnFolio = cnFolio;
    }

    public Long getCnFolio() {
        return cnFolio;
    }

    public void setCnCadenaOriginal(String cnCadenaOriginal) {
        this.cnCadenaOriginal = cnCadenaOriginal;
    }

    public String getCnCadenaOriginal() {
        return cnCadenaOriginal;
    }

    public void setCnCadenaSello(String cnCadenaSello) {
        this.cnCadenaSello = cnCadenaSello;
    }

    public String getCnCadenaSello() {
        return cnCadenaSello;
    }

    public void setCnDifFolio(Integer cnDifFolio) {
        this.cnDifFolio = cnDifFolio;
    }

    public Integer getCnDifFolio() {
        return cnDifFolio;
    }
}
