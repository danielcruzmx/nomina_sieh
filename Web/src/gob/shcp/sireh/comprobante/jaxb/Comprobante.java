package gob.shcp.sireh.comprobante.jaxb;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Emisor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DomicilioFiscal" type="{http://www.sat.gob.mx/cfd/3}t_UbicacionFiscal" minOccurs="0"/>
 *                   &lt;element name="ExpedidoEn" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
 *                   &lt;sequence>
 *                     &lt;element name="RegimenFiscal" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="Regimen" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;whiteSpace value="collapse"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/cfd/3}t_RFC" />
 *                 &lt;attribute name="nombre">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;whiteSpace value="collapse"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Receptor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Domicilio" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/cfd/3}t_RFC" />
 *                 &lt;attribute name="nombre">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;whiteSpace value="collapse"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Conceptos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Concepto" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice minOccurs="0">
 *                             &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="CuentaPredial" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="numero" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;whiteSpace value="collapse"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ComplementoConcepto" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Parte" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="cantidad" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;whiteSpace value="collapse"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="unidad">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;whiteSpace value="collapse"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="noIdentificacion">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;whiteSpace value="collapse"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="descripcion" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;whiteSpace value="collapse"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *                                     &lt;attribute name="importe" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                           &lt;attribute name="cantidad" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;whiteSpace value="collapse"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="unidad" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;whiteSpace value="collapse"/>
 *                                 &lt;minLength value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="noIdentificacion">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;whiteSpace value="collapse"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="descripcion" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;whiteSpace value="collapse"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="valorUnitario" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *                           &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Impuestos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Retenciones" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Retencion" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="impuesto" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;whiteSpace value="collapse"/>
 *                                           &lt;enumeration value="ISR"/>
 *                                           &lt;enumeration value="IVA"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Traslados" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Traslado" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="impuesto" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;whiteSpace value="collapse"/>
 *                                           &lt;enumeration value="IVA"/>
 *                                           &lt;enumeration value="IEPS"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="tasa" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *                                     &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="totalImpuestosRetenidos" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *                 &lt;attribute name="totalImpuestosTrasladados" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Complemento" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Addenda" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" fixed="3.2">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="serie">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="25"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="folio">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="20"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fecha" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sello" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="formaDePago" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="noCertificado" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="20"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="certificado" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="condicionesDePago">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="subTotal" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *       &lt;attribute name="descuento" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *       &lt;attribute name="motivoDescuento">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TipoCambio">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Moneda">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="total" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *       &lt;attribute name="tipoDeComprobante" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ingreso"/>
 *             &lt;enumeration value="egreso"/>
 *             &lt;enumeration value="traslado"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="metodoDePago" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LugarExpedicion" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NumCtaPago">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="4"/>
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FolioFiscalOrig">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SerieFolioFiscalOrig">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FechaFolioFiscalOrig">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             &lt;whiteSpace value="collapse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MontoFolioFiscalOrig" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "emisor", "receptor", "conceptos", "impuestos", "complemento", "addenda" })
@XmlRootElement(name = "Comprobante")
public class Comprobante {

    @XmlElement(name = "Emisor", required = true)
    protected Comprobante.Emisor emisor;
    @XmlElement(name = "Receptor", required = true)
    protected Comprobante.Receptor receptor;
    @XmlElement(name = "Conceptos", required = true)
    protected Comprobante.Conceptos conceptos;
    @XmlElement(name = "Impuestos", required = true)
    protected Comprobante.Impuestos impuestos;
    @XmlElement(name = "Complemento")
    protected Comprobante.Complemento complemento;
    @XmlElement(name = "Addenda")
    protected Comprobante.Addenda addenda;
    @XmlAttribute(required = true)
    protected String version;
    @XmlAttribute
    protected String serie;
    @XmlAttribute
    protected String folio;
    @XmlAttribute(required = true)
    protected XMLGregorianCalendar fecha;
    @XmlAttribute(required = true)
    protected String sello;
    @XmlAttribute(required = true)
    protected String formaDePago;
    @XmlAttribute(required = true)
    protected String noCertificado;
    @XmlAttribute(required = true)
    protected String certificado;
    @XmlAttribute
    protected String condicionesDePago;
    @XmlAttribute(required = true)
    protected BigDecimal subTotal;
    @XmlAttribute
    protected BigDecimal descuento;
    @XmlAttribute
    protected String motivoDescuento;
    @XmlAttribute(name = "TipoCambio")
    protected String tipoCambio;
    @XmlAttribute(name = "Moneda")
    protected String moneda;
    @XmlAttribute(required = true)
    protected BigDecimal total;
    @XmlAttribute(required = true)
    protected String tipoDeComprobante;
    @XmlAttribute(required = true)
    protected String metodoDePago;
    @XmlAttribute(name = "LugarExpedicion", required = true)
    protected String lugarExpedicion;
    @XmlAttribute(name = "NumCtaPago")
    protected String numCtaPago;
    @XmlAttribute(name = "FolioFiscalOrig")
    protected String folioFiscalOrig;
    @XmlAttribute(name = "SerieFolioFiscalOrig")
    protected String serieFolioFiscalOrig;
    @XmlAttribute(name = "FechaFolioFiscalOrig")
    protected XMLGregorianCalendar fechaFolioFiscalOrig;
    @XmlAttribute(name = "MontoFolioFiscalOrig")
    protected BigDecimal montoFolioFiscalOrig;

    /**
     * Gets the value of the emisor property.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Emisor }
     *     
     */
    public Comprobante.Emisor getEmisor() {
        return emisor;
    }

    /**
     * Sets the value of the emisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Emisor }
     *     
     */
    public void setEmisor(Comprobante.Emisor value) {
        this.emisor = value;
    }

    /**
     * Gets the value of the receptor property.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Receptor }
     *     
     */
    public Comprobante.Receptor getReceptor() {
        return receptor;
    }

    /**
     * Sets the value of the receptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Receptor }
     *     
     */
    public void setReceptor(Comprobante.Receptor value) {
        this.receptor = value;
    }

    /**
     * Gets the value of the conceptos property.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Conceptos }
     *     
     */
    public Comprobante.Conceptos getConceptos() {
        return conceptos;
    }

    /**
     * Sets the value of the conceptos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Conceptos }
     *     
     */
    public void setConceptos(Comprobante.Conceptos value) {
        this.conceptos = value;
    }

    /**
     * Gets the value of the impuestos property.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Impuestos }
     *     
     */
    public Comprobante.Impuestos getImpuestos() {
        return impuestos;
    }

    /**
     * Sets the value of the impuestos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Impuestos }
     *     
     */
    public void setImpuestos(Comprobante.Impuestos value) {
        this.impuestos = value;
    }

    /**
     * Gets the value of the complemento property.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Complemento }
     *     
     */
    public Comprobante.Complemento getComplemento() {
        return complemento;
    }

    /**
     * Sets the value of the complemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Complemento }
     *     
     */
    public void setComplemento(Comprobante.Complemento value) {
        this.complemento = value;
    }

    /**
     * Gets the value of the addenda property.
     * 
     * @return
     *     possible object is
     *     {@link Comprobante.Addenda }
     *     
     */
    public Comprobante.Addenda getAddenda() {
        return addenda;
    }

    /**
     * Sets the value of the addenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comprobante.Addenda }
     *     
     */
    public void setAddenda(Comprobante.Addenda value) {
        this.addenda = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "3.2";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the sello property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSello() {
        return sello;
    }

    /**
     * Sets the value of the sello property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSello(String value) {
        this.sello = value;
    }

    /**
     * Gets the value of the formaDePago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaDePago() {
        return formaDePago;
    }

    /**
     * Sets the value of the formaDePago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaDePago(String value) {
        this.formaDePago = value;
    }

    /**
     * Gets the value of the noCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificado() {
        return noCertificado;
    }

    /**
     * Sets the value of the noCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCertificado(String value) {
        this.noCertificado = value;
    }

    /**
     * Gets the value of the certificado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Sets the value of the certificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Gets the value of the condicionesDePago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionesDePago() {
        return condicionesDePago;
    }

    /**
     * Sets the value of the condicionesDePago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionesDePago(String value) {
        this.condicionesDePago = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the descuento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuento() {
        return descuento;
    }

    /**
     * Sets the value of the descuento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuento(BigDecimal value) {
        this.descuento = value;
    }

    /**
     * Gets the value of the motivoDescuento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    /**
     * Sets the value of the motivoDescuento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoDescuento(String value) {
        this.motivoDescuento = value;
    }

    /**
     * Gets the value of the tipoCambio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Sets the value of the tipoCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCambio(String value) {
        this.tipoCambio = value;
    }

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the tipoDeComprobante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * Sets the value of the tipoDeComprobante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeComprobante(String value) {
        this.tipoDeComprobante = value;
    }

    /**
     * Gets the value of the metodoDePago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * Sets the value of the metodoDePago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoDePago(String value) {
        this.metodoDePago = value;
    }

    /**
     * Gets the value of the lugarExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Sets the value of the lugarExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
    }

    /**
     * Gets the value of the numCtaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCtaPago() {
        return numCtaPago;
    }

    /**
     * Sets the value of the numCtaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCtaPago(String value) {
        this.numCtaPago = value;
    }

    /**
     * Gets the value of the folioFiscalOrig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioFiscalOrig() {
        return folioFiscalOrig;
    }

    /**
     * Sets the value of the folioFiscalOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioFiscalOrig(String value) {
        this.folioFiscalOrig = value;
    }

    /**
     * Gets the value of the serieFolioFiscalOrig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieFolioFiscalOrig() {
        return serieFolioFiscalOrig;
    }

    /**
     * Sets the value of the serieFolioFiscalOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieFolioFiscalOrig(String value) {
        this.serieFolioFiscalOrig = value;
    }

    /**
     * Gets the value of the fechaFolioFiscalOrig property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFolioFiscalOrig() {
        return fechaFolioFiscalOrig;
    }

    /**
     * Sets the value of the fechaFolioFiscalOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFolioFiscalOrig(XMLGregorianCalendar value) {
        this.fechaFolioFiscalOrig = value;
    }

    /**
     * Gets the value of the montoFolioFiscalOrig property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoFolioFiscalOrig() {
        return montoFolioFiscalOrig;
    }

    /**
     * Sets the value of the montoFolioFiscalOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoFolioFiscalOrig(BigDecimal value) {
        this.montoFolioFiscalOrig = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "any" })
    public static class Addenda {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "any" })
    public static class Complemento {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Concepto" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice minOccurs="0">
     *                   &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="CuentaPredial" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="numero" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;whiteSpace value="collapse"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ComplementoConcepto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Parte" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="cantidad" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;whiteSpace value="collapse"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="unidad">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;whiteSpace value="collapse"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="noIdentificacion">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;whiteSpace value="collapse"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="descripcion" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;whiteSpace value="collapse"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                           &lt;attribute name="importe" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *                 &lt;attribute name="cantidad" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;whiteSpace value="collapse"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="unidad" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;whiteSpace value="collapse"/>
     *                       &lt;minLength value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="noIdentificacion">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;whiteSpace value="collapse"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="descripcion" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;whiteSpace value="collapse"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="valorUnitario" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                 &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "concepto" })
    public static class Conceptos {

        @XmlElement(name = "Concepto", required = true)
        protected List<Comprobante.Conceptos.Concepto> concepto;

        /**
         * Gets the value of the concepto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the concepto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConcepto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Comprobante.Conceptos.Concepto }
         * 
         * 
         */
        public List<Comprobante.Conceptos.Concepto> getConcepto() {
            if (concepto == null) {
                concepto = new ArrayList<Comprobante.Conceptos.Concepto>();
            }
            return this.concepto;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice minOccurs="0">
         *         &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="CuentaPredial" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="numero" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="collapse"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ComplementoConcepto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;any maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Parte" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="cantidad" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;whiteSpace value="collapse"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="unidad">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="collapse"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="noIdentificacion">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;whiteSpace value="collapse"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="descripcion" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;whiteSpace value="collapse"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *                 &lt;attribute name="importe" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/choice>
         *       &lt;attribute name="cantidad" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="unidad" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;whiteSpace value="collapse"/>
         *             &lt;minLength value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="noIdentificacion">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="descripcion" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="valorUnitario" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *       &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "informacionAduanera", "cuentaPredial", "complementoConcepto", "parte" })
        public static class Concepto {

            @XmlElement(name = "InformacionAduanera")
            protected List<TInformacionAduanera> informacionAduanera;
            @XmlElement(name = "CuentaPredial")
            protected Comprobante.Conceptos.Concepto.CuentaPredial cuentaPredial;
            @XmlElement(name = "ComplementoConcepto")
            protected Comprobante.Conceptos.Concepto.ComplementoConcepto complementoConcepto;
            @XmlElement(name = "Parte")
            protected List<Comprobante.Conceptos.Concepto.Parte> parte;
            @XmlAttribute(required = true)
            protected BigDecimal cantidad;
            @XmlAttribute(required = true)
            protected String unidad;
            @XmlAttribute
            protected String noIdentificacion;
            @XmlAttribute(required = true)
            protected String descripcion;
            @XmlAttribute(required = true)
            protected BigDecimal valorUnitario;
            @XmlAttribute(required = true)
            protected BigDecimal importe;

            /**
             * Gets the value of the informacionAduanera property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the informacionAduanera property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInformacionAduanera().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TInformacionAduanera }
             * 
             * 
             */
            public List<TInformacionAduanera> getInformacionAduanera() {
                if (informacionAduanera == null) {
                    informacionAduanera = new ArrayList<TInformacionAduanera>();
                }
                return this.informacionAduanera;
            }

            /**
             * Gets the value of the cuentaPredial property.
             * 
             * @return
             *     possible object is
             *     {@link Comprobante.Conceptos.Concepto.CuentaPredial }
             *     
             */
            public Comprobante.Conceptos.Concepto.CuentaPredial getCuentaPredial() {
                return cuentaPredial;
            }

            /**
             * Sets the value of the cuentaPredial property.
             * 
             * @param value
             *     allowed object is
             *     {@link Comprobante.Conceptos.Concepto.CuentaPredial }
             *     
             */
            public void setCuentaPredial(Comprobante.Conceptos.Concepto.CuentaPredial value) {
                this.cuentaPredial = value;
            }

            /**
             * Gets the value of the complementoConcepto property.
             * 
             * @return
             *     possible object is
             *     {@link Comprobante.Conceptos.Concepto.ComplementoConcepto }
             *     
             */
            public Comprobante.Conceptos.Concepto.ComplementoConcepto getComplementoConcepto() {
                return complementoConcepto;
            }

            /**
             * Sets the value of the complementoConcepto property.
             * 
             * @param value
             *     allowed object is
             *     {@link Comprobante.Conceptos.Concepto.ComplementoConcepto }
             *     
             */
            public void setComplementoConcepto(Comprobante.Conceptos.Concepto.ComplementoConcepto value) {
                this.complementoConcepto = value;
            }

            /**
             * Gets the value of the parte property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parte property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParte().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Conceptos.Concepto.Parte }
             * 
             * 
             */
            public List<Comprobante.Conceptos.Concepto.Parte> getParte() {
                if (parte == null) {
                    parte = new ArrayList<Comprobante.Conceptos.Concepto.Parte>();
                }
                return this.parte;
            }

            /**
             * Gets the value of the cantidad property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * Sets the value of the cantidad property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidad(BigDecimal value) {
                this.cantidad = value;
            }

            /**
             * Gets the value of the unidad property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidad() {
                return unidad;
            }

            /**
             * Sets the value of the unidad property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidad(String value) {
                this.unidad = value;
            }

            /**
             * Gets the value of the noIdentificacion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoIdentificacion() {
                return noIdentificacion;
            }

            /**
             * Sets the value of the noIdentificacion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoIdentificacion(String value) {
                this.noIdentificacion = value;
            }

            /**
             * Gets the value of the descripcion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Sets the value of the descripcion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcion(String value) {
                this.descripcion = value;
            }

            /**
             * Gets the value of the valorUnitario property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorUnitario() {
                return valorUnitario;
            }

            /**
             * Sets the value of the valorUnitario property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorUnitario(BigDecimal value) {
                this.valorUnitario = value;
            }

            /**
             * Gets the value of the importe property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImporte() {
                return importe;
            }

            /**
             * Sets the value of the importe property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImporte(BigDecimal value) {
                this.importe = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = { "any" })
            public static class ComplementoConcepto {

                @XmlAnyElement(lax = true)
                protected List<Object> any;

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="numero" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="collapse"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CuentaPredial {

                @XmlAttribute(required = true)
                protected String numero;

                /**
                 * Gets the value of the numero property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumero() {
                    return numero;
                }

                /**
                 * Sets the value of the numero property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumero(String value) {
                    this.numero = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="cantidad" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;whiteSpace value="collapse"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="unidad">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="collapse"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="noIdentificacion">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;whiteSpace value="collapse"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="descripcion" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;whiteSpace value="collapse"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *       &lt;attribute name="importe" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = { "informacionAduanera" })
            public static class Parte {

                @XmlElement(name = "InformacionAduanera")
                protected List<TInformacionAduanera> informacionAduanera;
                @XmlAttribute(required = true)
                protected BigDecimal cantidad;
                @XmlAttribute
                protected String unidad;
                @XmlAttribute
                protected String noIdentificacion;
                @XmlAttribute(required = true)
                protected String descripcion;
                @XmlAttribute
                protected BigDecimal valorUnitario;
                @XmlAttribute
                protected BigDecimal importe;

                /**
                 * Gets the value of the informacionAduanera property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the informacionAduanera property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInformacionAduanera().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TInformacionAduanera }
                 * 
                 * 
                 */
                public List<TInformacionAduanera> getInformacionAduanera() {
                    if (informacionAduanera == null) {
                        informacionAduanera = new ArrayList<TInformacionAduanera>();
                    }
                    return this.informacionAduanera;
                }

                /**
                 * Gets the value of the cantidad property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCantidad() {
                    return cantidad;
                }

                /**
                 * Sets the value of the cantidad property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCantidad(BigDecimal value) {
                    this.cantidad = value;
                }

                /**
                 * Gets the value of the unidad property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnidad() {
                    return unidad;
                }

                /**
                 * Sets the value of the unidad property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnidad(String value) {
                    this.unidad = value;
                }

                /**
                 * Gets the value of the noIdentificacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNoIdentificacion() {
                    return noIdentificacion;
                }

                /**
                 * Sets the value of the noIdentificacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNoIdentificacion(String value) {
                    this.noIdentificacion = value;
                }

                /**
                 * Gets the value of the descripcion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescripcion() {
                    return descripcion;
                }

                /**
                 * Sets the value of the descripcion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescripcion(String value) {
                    this.descripcion = value;
                }

                /**
                 * Gets the value of the valorUnitario property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorUnitario() {
                    return valorUnitario;
                }

                /**
                 * Sets the value of the valorUnitario property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorUnitario(BigDecimal value) {
                    this.valorUnitario = value;
                }

                /**
                 * Gets the value of the importe property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getImporte() {
                    return importe;
                }

                /**
                 * Sets the value of the importe property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setImporte(BigDecimal value) {
                    this.importe = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DomicilioFiscal" type="{http://www.sat.gob.mx/cfd/3}t_UbicacionFiscal" minOccurs="0"/>
     *         &lt;element name="ExpedidoEn" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
     *         &lt;sequence>
     *           &lt;element name="RegimenFiscal" maxOccurs="unbounded">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="Regimen" use="required">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;whiteSpace value="collapse"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/cfd/3}t_RFC" />
     *       &lt;attribute name="nombre">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;whiteSpace value="collapse"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "domicilioFiscal", "expedidoEn", "regimenFiscal" })
    public static class Emisor {

        @XmlElement(name = "DomicilioFiscal")
        protected TUbicacionFiscal domicilioFiscal;
        @XmlElement(name = "ExpedidoEn")
        protected TUbicacion expedidoEn;
        @XmlElement(name = "RegimenFiscal", required = true)
        protected List<Comprobante.Emisor.RegimenFiscal> regimenFiscal;
        @XmlAttribute(required = true)
        protected String rfc;
        @XmlAttribute
        protected String nombre;

        /**
         * Gets the value of the domicilioFiscal property.
         * 
         * @return
         *     possible object is
         *     {@link TUbicacionFiscal }
         *     
         */
        public TUbicacionFiscal getDomicilioFiscal() {
            return domicilioFiscal;
        }

        /**
         * Sets the value of the domicilioFiscal property.
         * 
         * @param value
         *     allowed object is
         *     {@link TUbicacionFiscal }
         *     
         */
        public void setDomicilioFiscal(TUbicacionFiscal value) {
            this.domicilioFiscal = value;
        }

        /**
         * Gets the value of the expedidoEn property.
         * 
         * @return
         *     possible object is
         *     {@link TUbicacion }
         *     
         */
        public TUbicacion getExpedidoEn() {
            return expedidoEn;
        }

        /**
         * Sets the value of the expedidoEn property.
         * 
         * @param value
         *     allowed object is
         *     {@link TUbicacion }
         *     
         */
        public void setExpedidoEn(TUbicacion value) {
            this.expedidoEn = value;
        }

        /**
         * Gets the value of the regimenFiscal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the regimenFiscal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegimenFiscal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Comprobante.Emisor.RegimenFiscal }
         * 
         * 
         */
        public List<Comprobante.Emisor.RegimenFiscal> getRegimenFiscal() {
            if (regimenFiscal == null) {
                regimenFiscal = new ArrayList<Comprobante.Emisor.RegimenFiscal>();
            }
            return this.regimenFiscal;
        }

        /**
         * Gets the value of the rfc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRfc() {
            return rfc;
        }

        /**
         * Sets the value of the rfc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRfc(String value) {
            this.rfc = value;
        }

        /**
         * Gets the value of the nombre property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Sets the value of the nombre property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Regimen" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RegimenFiscal {

            @XmlAttribute(name = "Regimen", required = true)
            protected String regimen;

            /**
             * Gets the value of the regimen property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegimen() {
                return regimen;
            }

            /**
             * Sets the value of the regimen property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegimen(String value) {
                this.regimen = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Retenciones" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Retencion" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="impuesto" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;whiteSpace value="collapse"/>
     *                                 &lt;enumeration value="ISR"/>
     *                                 &lt;enumeration value="IVA"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Traslados" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Traslado" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="impuesto" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;whiteSpace value="collapse"/>
     *                                 &lt;enumeration value="IVA"/>
     *                                 &lt;enumeration value="IEPS"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="tasa" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                           &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="totalImpuestosRetenidos" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *       &lt;attribute name="totalImpuestosTrasladados" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "retenciones", "traslados" })
    public static class Impuestos {

        @XmlElement(name = "Retenciones")
        protected Comprobante.Impuestos.Retenciones retenciones;
        @XmlElement(name = "Traslados")
        protected Comprobante.Impuestos.Traslados traslados;
        @XmlAttribute
        protected BigDecimal totalImpuestosRetenidos;
        @XmlAttribute
        protected BigDecimal totalImpuestosTrasladados;

        /**
         * Gets the value of the retenciones property.
         * 
         * @return
         *     possible object is
         *     {@link Comprobante.Impuestos.Retenciones }
         *     
         */
        public Comprobante.Impuestos.Retenciones getRetenciones() {
            return retenciones;
        }

        /**
         * Sets the value of the retenciones property.
         * 
         * @param value
         *     allowed object is
         *     {@link Comprobante.Impuestos.Retenciones }
         *     
         */
        public void setRetenciones(Comprobante.Impuestos.Retenciones value) {
            this.retenciones = value;
        }

        /**
         * Gets the value of the traslados property.
         * 
         * @return
         *     possible object is
         *     {@link Comprobante.Impuestos.Traslados }
         *     
         */
        public Comprobante.Impuestos.Traslados getTraslados() {
            return traslados;
        }

        /**
         * Sets the value of the traslados property.
         * 
         * @param value
         *     allowed object is
         *     {@link Comprobante.Impuestos.Traslados }
         *     
         */
        public void setTraslados(Comprobante.Impuestos.Traslados value) {
            this.traslados = value;
        }

        /**
         * Gets the value of the totalImpuestosRetenidos property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalImpuestosRetenidos() {
            return totalImpuestosRetenidos;
        }

        /**
         * Sets the value of the totalImpuestosRetenidos property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalImpuestosRetenidos(BigDecimal value) {
            this.totalImpuestosRetenidos = value;
        }

        /**
         * Gets the value of the totalImpuestosTrasladados property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalImpuestosTrasladados() {
            return totalImpuestosTrasladados;
        }

        /**
         * Sets the value of the totalImpuestosTrasladados property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalImpuestosTrasladados(BigDecimal value) {
            this.totalImpuestosTrasladados = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Retencion" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="impuesto" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="collapse"/>
         *                       &lt;enumeration value="ISR"/>
         *                       &lt;enumeration value="IVA"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "retencion" })
        public static class Retenciones {

            @XmlElement(name = "Retencion", required = true)
            protected List<Comprobante.Impuestos.Retenciones.Retencion> retencion;

            /**
             * Gets the value of the retencion property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the retencion property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRetencion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Impuestos.Retenciones.Retencion }
             * 
             * 
             */
            public List<Comprobante.Impuestos.Retenciones.Retencion> getRetencion() {
                if (retencion == null) {
                    retencion = new ArrayList<Comprobante.Impuestos.Retenciones.Retencion>();
                }
                return this.retencion;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="impuesto" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="collapse"/>
             *             &lt;enumeration value="ISR"/>
             *             &lt;enumeration value="IVA"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Retencion {

                @XmlAttribute(required = true)
                protected String impuesto;
                @XmlAttribute(required = true)
                protected BigDecimal importe;

                /**
                 * Gets the value of the impuesto property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImpuesto() {
                    return impuesto;
                }

                /**
                 * Sets the value of the impuesto property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImpuesto(String value) {
                    this.impuesto = value;
                }

                /**
                 * Gets the value of the importe property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getImporte() {
                    return importe;
                }

                /**
                 * Sets the value of the importe property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setImporte(BigDecimal value) {
                    this.importe = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Traslado" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="impuesto" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="collapse"/>
         *                       &lt;enumeration value="IVA"/>
         *                       &lt;enumeration value="IEPS"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="tasa" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *                 &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "traslado" })
        public static class Traslados {

            @XmlElement(name = "Traslado", required = true)
            protected List<Comprobante.Impuestos.Traslados.Traslado> traslado;

            /**
             * Gets the value of the traslado property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the traslado property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTraslado().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Impuestos.Traslados.Traslado }
             * 
             * 
             */
            public List<Comprobante.Impuestos.Traslados.Traslado> getTraslado() {
                if (traslado == null) {
                    traslado = new ArrayList<Comprobante.Impuestos.Traslados.Traslado>();
                }
                return this.traslado;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="impuesto" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="collapse"/>
             *             &lt;enumeration value="IVA"/>
             *             &lt;enumeration value="IEPS"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="tasa" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *       &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Traslado {

                @XmlAttribute(required = true)
                protected String impuesto;
                @XmlAttribute(required = true)
                protected BigDecimal tasa;
                @XmlAttribute(required = true)
                protected BigDecimal importe;

                /**
                 * Gets the value of the impuesto property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImpuesto() {
                    return impuesto;
                }

                /**
                 * Sets the value of the impuesto property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImpuesto(String value) {
                    this.impuesto = value;
                }

                /**
                 * Gets the value of the tasa property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTasa() {
                    return tasa;
                }

                /**
                 * Sets the value of the tasa property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTasa(BigDecimal value) {
                    this.tasa = value;
                }

                /**
                 * Gets the value of the importe property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getImporte() {
                    return importe;
                }

                /**
                 * Sets the value of the importe property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setImporte(BigDecimal value) {
                    this.importe = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Domicilio" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/cfd/3}t_RFC" />
     *       &lt;attribute name="nombre">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;whiteSpace value="collapse"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "domicilio" })
    public static class Receptor {

        @XmlElement(name = "Domicilio")
        protected TUbicacion domicilio;
        @XmlAttribute(required = true)
        protected String rfc;
        @XmlAttribute
        protected String nombre;

        /**
         * Gets the value of the domicilio property.
         * 
         * @return
         *     possible object is
         *     {@link TUbicacion }
         *     
         */
        public TUbicacion getDomicilio() {
            return domicilio;
        }

        /**
         * Sets the value of the domicilio property.
         * 
         * @param value
         *     allowed object is
         *     {@link TUbicacion }
         *     
         */
        public void setDomicilio(TUbicacion value) {
            this.domicilio = value;
        }

        /**
         * Gets the value of the rfc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRfc() {
            return rfc;
        }

        /**
         * Sets the value of the rfc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRfc(String value) {
            this.rfc = value;
        }

        /**
         * Gets the value of the nombre property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Sets the value of the nombre property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

    }

}
