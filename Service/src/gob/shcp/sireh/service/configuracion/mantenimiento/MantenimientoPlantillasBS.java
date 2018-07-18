package gob.shcp.sireh.service.configuracion.mantenimiento;

import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.model.SelectStringDTO;
import gob.shcp.sireh.model.configuracion.mantenimiento.plantillas.DatosPlantillaDTO;
import gob.shcp.sireh.service.AbstractSirehService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MantenimientoPlantillasBS extends AbstractSirehService implements MantenimientoPlantillasService {
    
    public static final String diagonal = File.separator;

    public List<SelectStringDTO> getListaPlantillas() {
        String rutaTemp = super.configuration().getString("terceros.templates.dir");
        List<SelectStringDTO> lista = null;
        SelectStringDTO selectStringDTO = null;
        File dir = new File(rutaTemp);
        String[] ficheros = dir.list(new Filtro(super.configuration().getString("plantillas", "EXTENSION_XML")));
        
        if (ficheros == null) {
        } else {
            lista = new ArrayList<SelectStringDTO>();
            for (int x = 0; x < ficheros.length; x++) {
                selectStringDTO = new SelectStringDTO();
                selectStringDTO.setValue(ficheros[x]);
                lista.add(selectStringDTO);
            }
        }
        return lista;
    }

    public DatosPlantillaDTO getDatosPlantilla(String plantilla) {
        String record = super.configuration().getString("plantillas", "RECORD");
        String name = super.configuration().getString("plantillas", "NAME");
        String recordElement = super.configuration().getString("plantillas", "RECORD_ELEMENT");
        String guion = super.configuration().getString("plantillas", "GUION");
        String clas = super.configuration().getString("plantillas", "CLAS");
        String beanerf = super.configuration().getString("plantillas", "BEANREF");
        String rfc = super.configuration().getString("plantillas", "RFC");
        String curp = super.configuration().getString("plantillas", "CURP");
        String importe = super.configuration().getString("plantillas", "IMPORTE");
        String tipoMovimiento = super.configuration().getString("plantillas", "TIPO_MOVTO");
        String referencia = super.configuration().getString("plantillas", "REFERENCIA");
        String concepto = super.configuration().getString("plantillas", "CONCEPTO");
        String qna = super.configuration().getString("plantillas", "QNA");
        String qnaFin = super.configuration().getString("plantillas", "QNA_FIN");
        String numQuincenas = super.configuration().getString("plantillas", "NUM_QUINCENAS");
        String porcentaje = super.configuration().getString("plantillas", "PORCENTAJE");
        String fechaIncidencia = super.configuration().getString("plantillas", "FECHA_INCIDENCIA");
        String punto = super.configuration().getString("plantillas", "PUNTO");
        String start = super.configuration().getString("plantillas", "START");
        String end = super.configuration().getString("plantillas", "END");
        String type = super.configuration().getString("plantillas", "TYPE");
        DatosPlantillaDTO datosPlantillaDTO = new DatosPlantillaDTO();
        datosPlantillaDTO.setNomPlantilla(plantilla);
        SelectStringDTO selectStringDTO = null;
        
        List<SelectStringDTO> lista = new ArrayList<SelectStringDTO>();
        String rutaTemplate = super.configuration().getString("terceros.templates.dir");
        
        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = null;
            docBuilder = docBuilderFactory.newDocumentBuilder();

            Document doc = docBuilder.parse(new File(rutaTemplate + diagonal + plantilla));
            doc.getDocumentElement().normalize();

            NodeList listaConverter = doc.getElementsByTagName(super.configuration().getString("plantillas", "CONVERTER"));
            int totalPersonas = listaConverter.getLength();
            
            for (int i = 0; i < totalPersonas; i++) {
                Node converter = listaConverter.item(i);
                NamedNodeMap attributes = converter.getAttributes();
                Node nodoAtributoName = attributes.getNamedItem(name);
                String valorAtributoName = nodoAtributoName.getNodeValue(); //valor del atributo
                Node nodoAtributoClass = attributes.getNamedItem(clas);
                String valorAtributoClass = nodoAtributoClass.getNodeValue(); //valor del atributo
                valorAtributoClass = valorAtributoClass.substring(valorAtributoClass.lastIndexOf(punto) + 1, valorAtributoClass.length());
                selectStringDTO = new SelectStringDTO();
                selectStringDTO.setKey(valorAtributoName);
                selectStringDTO.setValue(valorAtributoName + " -- " + valorAtributoClass);
                lista.add(selectStringDTO);
            }
            datosPlantillaDTO.setListaTipos(lista);
            
            //Lee el archivo XMLy almacena los valores del record y del record-element en el DTO
            NodeList listaRecord = doc.getElementsByTagName(record);
            
            for (int j = 0; j < listaRecord.getLength(); j++) {
                Element campo = (Element)listaRecord.item(j);
                NamedNodeMap attributes = campo.getAttributes();
                String nomReg = attributes.getNamedItem(name).getNodeValue();
                String nomRegAuxi = datosPlantillaDTO.getNomPlantilla();
                nomRegAuxi = nomRegAuxi.substring(0, nomRegAuxi.indexOf(guion));
                
                if (nomReg.equalsIgnoreCase(nomRegAuxi)) {
                    datosPlantillaDTO.setNomReg(nomReg);
                    NodeList listaBean = campo.getElementsByTagName(recordElement);
                    
                    for (int k = 0; k < listaBean.getLength(); k++) {
                        Node bean = listaBean.item(k);
                        attributes = bean.getAttributes();
                        String nodoAtributoName = attributes.getNamedItem(beanerf).getNodeValue();
                        nodoAtributoName = nodoAtributoName.substring(nodoAtributoName.indexOf(punto) + 1, nodoAtributoName.length());
                        
                        if (nodoAtributoName.equalsIgnoreCase(rfc)) {
                            datosPlantillaDTO.getRfc().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getRfc().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getRfc().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getRfc().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(curp)) {
                            datosPlantillaDTO.getCurp().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getCurp().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getCurp().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getCurp().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(importe)) {
                            datosPlantillaDTO.getImporte().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getImporte().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getImporte().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getImporte().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(tipoMovimiento)) {
                            datosPlantillaDTO.getTipoMovto().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getTipoMovto().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getTipoMovto().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getTipoMovto().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(referencia)) {
                            datosPlantillaDTO.getReferencia().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getReferencia().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getReferencia().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getReferencia().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(concepto)) {
                            datosPlantillaDTO.getConcepto().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getConcepto().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getConcepto().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getConcepto().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(qna)) {
                            datosPlantillaDTO.getQna().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getQna().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getQna().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getQna().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(qnaFin)) {
                            datosPlantillaDTO.getQnaFin().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getQnaFin().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getQnaFin().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getQnaFin().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(numQuincenas)) {
                            datosPlantillaDTO.getNumQuincenas().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getNumQuincenas().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getNumQuincenas().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getNumQuincenas().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(porcentaje)) {
                            datosPlantillaDTO.getPorcentaje().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getPorcentaje().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getPorcentaje().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getPorcentaje().setBeanref(nodoAtributoName);
                        } else if (nodoAtributoName.equalsIgnoreCase(fechaIncidencia)) {
                            datosPlantillaDTO.getFechaIncidencia().setStart(attributes.getNamedItem(start).getNodeValue());
                            datosPlantillaDTO.getFechaIncidencia().setEnd(attributes.getNamedItem(end).getNodeValue());
                            datosPlantillaDTO.getFechaIncidencia().setType(attributes.getNamedItem(type).getNodeValue());
                            datosPlantillaDTO.getFechaIncidencia().setBeanref(nodoAtributoName);
                        }
                    }
                }
            }
            //si no manejamos la Exception específica generamos la ServiceException del FSN
            //configurammos su mensaje de error en el archivo message.properties del ConfigDist
            // manejo de exception de sistema.
        } catch (Exception e) {
            throw new ServiceException("service.datosplantilla.error", e);
        }
        return datosPlantillaDTO;
    }

    public List<SelectStringDTO> getListaTipos() {
        String rutaTemplate = super.configuration().getString("terceros.templates.dir");

        List<SelectStringDTO> lista = new ArrayList<SelectStringDTO>();
        SelectStringDTO selectStringDTO = null;
        
        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = null;
            docBuilder = docBuilderFactory.newDocumentBuilder();

            Document doc = docBuilder.parse(new File(rutaTemplate + diagonal + "catalogoTipos.xml"));
            doc.getDocumentElement().normalize();

            NodeList listaConverter = doc.getElementsByTagName(super.configuration().getString("plantillas", "TIPO"));
            int totalPersonas = listaConverter.getLength();
            
            for (int i = 0; i < totalPersonas; i++) {
                Node converter = listaConverter.item(i);    logger.debug("converter: " + converter);
                NamedNodeMap attributes = converter.getAttributes();    logger.debug("attributes: " + attributes);
                Node nodoAtributoName = attributes.getNamedItem(super.configuration().getString("plantillas", "NAME"));  logger.debug("nodoAtributoName" + nodoAtributoName);
                String valorAtributoName = nodoAtributoName.getNodeValue();     logger.debug("valorAtributoName: " + valorAtributoName); //valor del atributo    
                Node nodoAtributoDesc = attributes.getNamedItem(super.configuration().getString("plantillas", 
                                                                            "DESC"));   logger.debug("nodoAtributoDesc: " + nodoAtributoDesc);
                String valorAtributoDesc = nodoAtributoDesc.getNodeValue(); //valor del atributo
                valorAtributoDesc = valorAtributoDesc.substring(valorAtributoDesc.lastIndexOf(".") + 1, valorAtributoDesc.length());
                selectStringDTO = new SelectStringDTO();
                selectStringDTO.setKey(valorAtributoName);
                selectStringDTO.setValue(valorAtributoName + " -- " + valorAtributoDesc);
                lista.add(selectStringDTO);
            }
        } catch (Exception e) {
            throw new ServiceException("service.datosplantilla.catalogoTipos.error", e);
        }
        return lista;
    }

    public void update(DatosPlantillaDTO datosPlantillaDTO) {
        String constRecord = super.configuration().getString("plantillas", "RECORD");
        String constName = super.configuration().getString("plantillas", "NAME");
        String line = super.configuration().getString("plantillas", "LINE");
        String recordElement = super.configuration().getString("plantillas", "RECORD_ELEMENT");
        String datosDTO = super.configuration().getString("plantillas", "DATOS_DTO");
        String rfc = super.configuration().getString("plantillas", "RFC");
        String curp = super.configuration().getString("plantillas", "CURP");
        String importe = super.configuration().getString("plantillas", "IMPORTE");
        String tipoMovimiento = super.configuration().getString("plantillas", "TIPO_MOVTO");
        String referencia = super.configuration().getString("plantillas", "REFERENCIA");
        String concepto = super.configuration().getString("plantillas", "CONCEPTO");
        String qna = super.configuration().getString("plantillas", "QNA");
        String qnaFin = super.configuration().getString("plantillas", "QNA_FIN");
        String numQna = super.configuration().getString("plantillas", "NUM_QNA");
        String porcentaje = super.configuration().getString("plantillas", "PORCENTAJE");
        String fechaIncidencia = super.configuration().getString("plantillas", "FECHA_INCIDENCIA");
        String punto = super.configuration().getString("plantillas", "PUNTO");
        String start = super.configuration().getString("plantillas", "START");
        String end = super.configuration().getString("plantillas", "END");
        String type = super.configuration().getString("plantillas", "TYPE");
        String beanref = super.configuration().getString("plantillas", "BEANREF");

        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = null;
            docBuilder = docBuilderFactory.newDocumentBuilder();
            
            //cargando la plantilla
            String rutaTemplate = super.configuration().getString("terceros.templates.dir");
            String nomPlantilla = rutaTemplate + diagonal + datosPlantillaDTO.getNomPlantilla();
            Document doc = docBuilder.parse(new File(nomPlantilla));
            
            //modifica el nombre del record
            NodeList listaRecord = doc.getElementsByTagName(constRecord);
            int totalRecord = listaRecord.getLength();
            
            for (int i = 0; i < totalRecord; i++) {
                Node record = listaRecord.item(i);
                Element eElement = (Element)record;
                String name = eElement.getAttribute(constName);
                eElement.setAttribute(constName, datosPlantillaDTO.getNomReg());
                name = eElement.getAttribute(constName);
            }

            //borrando los hijos del nodo line los record-element
            NodeList nScene = doc.getElementsByTagName(line);
            NodeList nScene1 = nScene.item(0).getChildNodes();
            
            for (int j = 0; j < nScene1.getLength(); j++) {
                String filter = recordElement;
                Node n = nScene1.item(j);
                // only interested in elements
                if (n.getNodeType() == Node.ELEMENT_NODE) {
                    if (n.getNodeName().equals(filter)) {
                        nScene.item(0).removeChild(n);
                    }
                }
            }
            save(new File(nomPlantilla), doc);

            //cargando nuevemante el xml modificado
            doc = docBuilder.parse(new File(nomPlantilla));

            //  AtributosPlantillaDTO atributosPlantillaDTO=null;
            if (datosPlantillaDTO.getRfc().getStart() != null && datosPlantillaDTO.getRfc().getEnd() != null && 
                datosPlantillaDTO.getRfc().getType() != null && datosPlantillaDTO.getRfc() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + rfc);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getRfc().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getRfc().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getRfc().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getCurp().getStart() != null && datosPlantillaDTO.getCurp().getEnd() != null && 
                datosPlantillaDTO.getCurp().getType() != null && datosPlantillaDTO.getCurp() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + curp);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getCurp().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getCurp().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getCurp().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getImporte().getStart() != null && datosPlantillaDTO.getImporte().getEnd() != null && 
                datosPlantillaDTO.getImporte().getType() != null && datosPlantillaDTO.getImporte() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + importe);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getImporte().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getImporte().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getImporte().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getTipoMovto().getStart() != null && 
                datosPlantillaDTO.getTipoMovto().getEnd() != null && 
                datosPlantillaDTO.getTipoMovto().getType() != null && datosPlantillaDTO.getTipoMovto() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + tipoMovimiento);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getTipoMovto().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getTipoMovto().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getTipoMovto().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getReferencia().getStart() != null && 
                datosPlantillaDTO.getReferencia().getEnd() != null && 
                datosPlantillaDTO.getReferencia().getType() != null && datosPlantillaDTO.getReferencia() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + referencia);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getReferencia().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getReferencia().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getReferencia().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getConcepto().getStart() != null && 
                datosPlantillaDTO.getConcepto().getEnd() != null && 
                datosPlantillaDTO.getConcepto().getType() != null && datosPlantillaDTO.getConcepto() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + concepto);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getConcepto().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getConcepto().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getConcepto().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getQna().getStart() != null && datosPlantillaDTO.getQna().getEnd() != null && 
                datosPlantillaDTO.getQna().getType() != null && datosPlantillaDTO.getQna() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + qna);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getQna().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getQna().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getQna().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getQnaFin().getStart() != null && datosPlantillaDTO.getQnaFin().getEnd() != null && 
                datosPlantillaDTO.getQnaFin().getType() != null && datosPlantillaDTO.getQnaFin() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + qnaFin);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getQnaFin().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getQnaFin().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getQnaFin().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getNumQuincenas().getStart() != null && datosPlantillaDTO.getNumQuincenas().getEnd() != null && 
                datosPlantillaDTO.getNumQuincenas().getType() != null && datosPlantillaDTO.getNumQuincenas() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + qnaFin);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getNumQuincenas().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getNumQuincenas().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getNumQuincenas().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getPorcentaje().getStart() != null && 
                datosPlantillaDTO.getPorcentaje().getEnd() != null && 
                datosPlantillaDTO.getPorcentaje().getType() != null && datosPlantillaDTO.getPorcentaje() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + porcentaje);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getPorcentaje().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getPorcentaje().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getPorcentaje().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }
            //---------------- fechaIncidencia
            if (datosPlantillaDTO.getFechaIncidencia().getStart() != null && 
                datosPlantillaDTO.getFechaIncidencia().getEnd() != null && 
                datosPlantillaDTO.getFechaIncidencia().getType() != null && datosPlantillaDTO.getFechaIncidencia() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + fechaIncidencia);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getFechaIncidencia().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getFechaIncidencia().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getFechaIncidencia().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }
            save(new File(nomPlantilla), doc);

        } catch (Exception e) {
            throw new ServiceException("configuracion.plantillas,update.error", e);
        }
    }

    public void save(File file, Document paramDoc) {
        try {
            TransformerFactory factory1 = TransformerFactory.newInstance();
            Transformer transformer;
            transformer = factory1.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            DOMSource source = new DOMSource(paramDoc);
            transformer.transform(source, result);
            String s = writer.toString();

            FileWriter fileWriter;
            fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(s);

            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            throw new ServiceException("configuracion.plantillas,save.error", e);
        }
    }

    public void delete(DatosPlantillaDTO datosPlantillaDTO) {
        String rutaTemplate = super.configuration().getString("terceros.templates.dir");
        String nomPlantilla = rutaTemplate + diagonal + datosPlantillaDTO.getNomPlantilla();
        File file = new File(nomPlantilla);
        file.delete();
    }

    public void create(DatosPlantillaDTO datosPlantillaDTO) {
        String constRecord = super.configuration().getString("plantillas", "RECORD");
        String constName = super.configuration().getString("plantillas", "NAME");
        String line = super.configuration().getString("plantillas", "LINE");
        String recordElement = super.configuration().getString("plantillas", "RECORD_ELEMENT");
        String datosDTO = super.configuration().getString("plantillas", "DATOS_DTO");
        String rfc = super.configuration().getString("plantillas", "RFC");
        String curp = super.configuration().getString("plantillas", "CURP");
        String importe = super.configuration().getString("plantillas", "IMPORTE");
        String tipoMovimiento = super.configuration().getString("plantillas", "TIPO_MOVTO");
        String referencia = super.configuration().getString("plantillas", "REFERENCIA");
        String concepto = super.configuration().getString("plantillas", "CONCEPTO");
        String qna = super.configuration().getString("plantillas", "QNA");
        String qnaFin = super.configuration().getString("plantillas", "QNA_FIN");
        String numQuincenas = super.configuration().getString("plantillas", "NUM_QUINCENAS");
        String porcentaje = super.configuration().getString("plantillas", "PORCENTAJE");
        String fechaIncidencia = super.configuration().getString("plantillas", "FECHA_INCIDENCIA");
        String punto = super.configuration().getString("plantillas", "PUNTO");
        String start = super.configuration().getString("plantillas", "START");
        String end = super.configuration().getString("plantillas", "END");
        String type = super.configuration().getString("plantillas", "TYPE");
        String beanref = super.configuration().getString("plantillas", "BEANREF");
        String extension = super.configuration().getString("plantillas", "EXTENSION_XML");
        String constPlantilla = super.configuration().getString("plantillas", "PLANTILLA");
        
        try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = null;
            docBuilder = docBuilderFactory.newDocumentBuilder();
            
            //cargando la plantilla
            String rutaTemplate = super.configuration().getString("terceros.templates.dir");
            String nomPlantilla = rutaTemplate + diagonal + datosPlantillaDTO.getNomReg() + extension;
            String plantilla = rutaTemplate + diagonal + constPlantilla;
            Document doc = docBuilder.parse(new File(plantilla));
            
            //modifica el nombre del record
            NodeList listaRecord = doc.getElementsByTagName(constRecord);
            int totalRecord = listaRecord.getLength();
            
            for (int i = 0; i < totalRecord; i++) {
                Node record = listaRecord.item(i);
                Element eElement = (Element)record;
                String name = eElement.getAttribute(constName);
                eElement.setAttribute(constName, datosPlantillaDTO.getNomReg());
                name = eElement.getAttribute(name);
            }
            
            //borrando los hijos del nodo line los record-element
            NodeList nScene = null;

            //cargando nuevemante el xml modificado
            //doc = docBuilder.parse ( new File(nomPlantilla));

            // AtributosPlantillaDTO atributosPlantillaDTO=null;
            if (datosPlantillaDTO.getRfc().getStart() != null && 
                datosPlantillaDTO.getRfc().getEnd() != null && 
                datosPlantillaDTO.getRfc().getType() != null && 
                datosPlantillaDTO.getRfc() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + rfc);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getRfc().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getRfc().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getRfc().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getCurp().getStart() != null && 
                datosPlantillaDTO.getCurp().getEnd() != null && 
                datosPlantillaDTO.getCurp().getType() != null && 
                datosPlantillaDTO.getCurp() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + curp);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getCurp().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getCurp().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getCurp().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getImporte().getStart() != null && 
                datosPlantillaDTO.getImporte().getEnd() != null && 
                datosPlantillaDTO.getImporte().getType() != null && 
                datosPlantillaDTO.getImporte() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + importe);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getImporte().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getImporte().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getImporte().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getTipoMovto().getStart() != null && 
                datosPlantillaDTO.getTipoMovto().getEnd() != null && 
                datosPlantillaDTO.getTipoMovto().getType() != null && 
                datosPlantillaDTO.getTipoMovto() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + tipoMovimiento);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getTipoMovto().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getTipoMovto().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getTipoMovto().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getReferencia().getStart() != null && 
                datosPlantillaDTO.getReferencia().getEnd() != null && 
                datosPlantillaDTO.getReferencia().getType() != null && 
                datosPlantillaDTO.getReferencia() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + referencia);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getReferencia().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getReferencia().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getReferencia().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getConcepto().getStart() != null && 
                datosPlantillaDTO.getConcepto().getEnd() != null && 
                datosPlantillaDTO.getConcepto().getType() != null && 
                datosPlantillaDTO.getConcepto() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + concepto);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getConcepto().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getConcepto().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getConcepto().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getQna().getStart() != null && 
                datosPlantillaDTO.getQna().getEnd() != null && 
                datosPlantillaDTO.getQna().getType() != null && 
                datosPlantillaDTO.getQna() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + qna);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getQna().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getQna().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getQna().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getQnaFin().getStart() != null && 
                datosPlantillaDTO.getQnaFin().getEnd() != null && 
                datosPlantillaDTO.getQnaFin().getType() != null && 
                datosPlantillaDTO.getQnaFin() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + qnaFin);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getQnaFin().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getQnaFin().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getQnaFin().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getNumQuincenas().getStart() != null && 
                datosPlantillaDTO.getNumQuincenas().getEnd() != null && 
                datosPlantillaDTO.getNumQuincenas().getType() != null && 
                datosPlantillaDTO.getNumQuincenas() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
				nodoNombreCampo.setAttribute(beanref, datosDTO + numQuincenas);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getNumQuincenas().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getNumQuincenas().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getNumQuincenas().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }

            if (datosPlantillaDTO.getPorcentaje().getStart() != null && 
                datosPlantillaDTO.getPorcentaje().getEnd() != null && 
                datosPlantillaDTO.getPorcentaje().getType() != null && 
                datosPlantillaDTO.getPorcentaje() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + porcentaje);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getPorcentaje().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getPorcentaje().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getPorcentaje().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }
           // ----------------- fechaIncidencia
            if (datosPlantillaDTO.getFechaIncidencia().getStart() != null && 
                datosPlantillaDTO.getFechaIncidencia().getEnd() != null && 
                datosPlantillaDTO.getFechaIncidencia().getType() != null && 
                datosPlantillaDTO.getFechaIncidencia() != null) {
                nScene = doc.getElementsByTagName(line);
                Node recordElemento = nScene.item(0);
                
                Element nodoNombreCampo = doc.createElement(recordElement);
                nodoNombreCampo.setAttribute(beanref, datosDTO + fechaIncidencia);
                nodoNombreCampo.setAttribute(end, datosPlantillaDTO.getFechaIncidencia().getEnd());
                nodoNombreCampo.setAttribute(start, datosPlantillaDTO.getFechaIncidencia().getStart());
                nodoNombreCampo.setAttribute(type, datosPlantillaDTO.getFechaIncidencia().getType());
                recordElemento.appendChild(nodoNombreCampo);
            }
            save(new File(nomPlantilla), doc);

        } catch (Exception e) {
            throw new ServiceException("configuracion.plantillas,create.error", e);
        }
    }
}
