//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.26 at 12:34:09 PM CDT 
//


package gob.shcp.sireh.model.sat.cfdi.v33;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c_TipoDeComprobante.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="c_TipoDeComprobante">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "c_TipoDeComprobante", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos")
@XmlEnum
public enum CTipoDeComprobante {

    I,
    E,
    T,
    N,
    P;

    public String value() {
        return name();
    }

    public static CTipoDeComprobante fromValue(String v) {
        return valueOf(v);
    }

}
