package gob.shcp.sireh.service.nomina.terceros.enteros;

import edu.emory.mathcs.backport.java.util.Arrays;

import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.data.jdbc.QueryTnHistoricoPagoDAO;
import gob.shcp.sireh.data.jdbc.support.EnterosDAO;
import gob.shcp.sireh.domain.jdbc.Enteros;
import gob.shcp.sireh.domain.jdbc.TnHistoricoPago;
import gob.shcp.sireh.model.TnHistoricoPagoDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.AtributosLayoutDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.EnterosDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.EnterosResultDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.GenerarEnteroDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.LayoutEnterosDTO;
import gob.shcp.sireh.service.AbstractSirehService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;



public class EnterosNominaBS extends AbstractSirehService implements EnterosNominaService {

    public static final String  diagonal=File.separator;

    /**
     * obtiene los complementos para tipo de nomina ordinarios
     * @param qna quincena de Pago
     * @param tipoNomina tipo de nomina
     * @return List<TnHistoricoPagoDTO> 
     */
    public List<TnHistoricoPagoDTO> getComplemetoOR(String qna, String tipoNomina) {
        //Obteniendo los complementos ordinarios
        List<TnHistoricoPago> listas = super.persistence().get(QueryTnHistoricoPagoDAO.class).findComplOR(tipoNomina,qna);
        List<TnHistoricoPagoDTO> listaDto = super.transformation().map(listas, TnHistoricoPagoDTO.class);
        return listaDto;
    }

    /**
     * obtiene los complementos para tipo de nomina extraordinarios
     * @param qna quincena de Pago
     * @param tipoNomina tipo de nomina
     * @return List<TnHistoricoPagoDTO> 
     */
    public List<TnHistoricoPagoDTO> getComplemetoEX(String qna, String tipoNomina) {
        //Obtener los complementos extraordinarios
        List<TnHistoricoPago> listas = super.persistence().get(QueryTnHistoricoPagoDAO.class).findComplEX(tipoNomina,qna);
        List<TnHistoricoPagoDTO> listaDto = super.transformation().map(listas, TnHistoricoPagoDTO.class);
        return listaDto;
    }

    /**
     * obtiene los registros  y montos de enteros, en este caso solo se obtienen  5 registros 
     * @param qna
     * @param complementos
     * @param tercero
     * @return
     */
    public GenerarEnteroDTO procesoEnteros(String qna, String[] complementos,String tercero) {
        GenerarEnteroDTO generarEnteroDTO=new GenerarEnteroDTO();
        
        // se obtiene los complementos seleccionados
        List<String> listaCompl = Arrays.asList(complementos);
        List<String> listaDeduccion=null;
        List<String> listaPercepcion=null;
        String deducciones="";;
        String percepciones="";;
        
        //valida el tipo de tercero para obtener sus conceptos
        if(tercero.equalsIgnoreCase(super.configuration().getString("terceros", "METLIFE"))){
                 deducciones=super.configuration().getString("enteros", "D_MET_LIFE");
            // METLIFE no tiene concepto de percepciones,solo se indica para efectos de los parametros del query
                 percepciones=super.configuration().getString("enteros", "P_MET_LIFE")==null?"X":super.configuration().getString("enteros", "P_MET_LIFE");
        }
        
        //obtiener la lista de  los conceptos del terceros
        String[] arraydeducciones=deducciones.indexOf(",")==-1?deducciones.split(""):deducciones.split(",");
        String[] arraypercepciones=percepciones.indexOf(",")==-1?percepciones.split(""):percepciones.split(",");
         listaDeduccion = Arrays.asList(arraydeducciones);
        listaPercepcion = Arrays.asList(arraypercepciones);
        
        //se inicia el proceso de recuperacion de enteros
         List<Enteros>  listaEnterosRegDTO =super.persistence().get(EnterosDAO.class).getEnterosReg(qna,listaCompl,listaDeduccion,listaPercepcion);
         List<Enteros>  listaEnterosDeduccionDTO =super.persistence().get(EnterosDAO.class).getEnterosTotalDeduccion(qna,listaCompl,listaDeduccion);
        List<Enteros>  listaEnterosPercepcionDTO =super.persistence().get(EnterosDAO.class).getEnterosTotalPercepcion(qna,listaCompl,listaPercepcion);
         
       
        double ImporteEnteros=0.0;
        double importeRecuperacion=0.0;
        int countEnteros=0;
        int countRecueracion=0;
        
         List<EnterosDTO> listaDto = super.transformation().map(listaEnterosDeduccionDTO, EnterosDTO.class);
        //realiza el calculo de totales de registros e importes  
        for(EnterosDTO enterosDTO:listaDto){
            countEnteros = (int) enterosDTO.getDeducciones();
             ImporteEnteros=enterosDTO.getPercepciones();
        }
        
        //btiene sumatoria de importes
        if(tercero.equalsIgnoreCase(super.configuration().getString("terceros", "METLIFE"))){           
            countRecueracion =0;
            importeRecuperacion=0.0;
        }else{
            listaDto = super.transformation().map(listaEnterosPercepcionDTO, EnterosDTO.class);
            for(EnterosDTO enterosDTO:listaDto){
                countRecueracion = (int) enterosDTO.getDeducciones();
                 importeRecuperacion=enterosDTO.getPercepciones(); 
            } 
        }
        
        //prepaara la informacion para tabla de resultados
     //   List<EnterosDTO> listaEnteros=listaDto.subList(1,5);
      listaDto = super.transformation().map(listaEnterosRegDTO, EnterosDTO.class);
      
        EnterosResultDTO enterosResultDTO=null;
        List listaResult=new ArrayList();
        for(EnterosDTO enterosDTO : listaDto){
            enterosResultDTO=new EnterosResultDTO();
            String nombre =enterosDTO.getPrimerApellido()+" "+enterosDTO.getSegundoApellido()+" "+enterosDTO.getNombre();
            enterosResultDTO.setNombre(nombre);
            enterosResultDTO.setRfc(enterosDTO.getHpRfc());
            enterosResultDTO.setDeduccion(enterosDTO.getDeducciones());   //  CPTODML
            enterosResultDTO.setRecuperacion(enterosDTO.getPercepciones()); 
            enterosResultDTO.setConcepto(super.configuration().getString("enteros", "METLIFE_ML"));
            listaResult.add(enterosResultDTO);
        }
        
        //seteando datos
        DecimalFormat formatterDouble = new DecimalFormat( "#,###,###,##0.00" );
        DecimalFormat formatterInteger = new DecimalFormat( "#,###,###,##0" );
        generarEnteroDTO.setTotalEntero(formatterInteger.format(countEnteros));
        generarEnteroDTO.setImporteEntero( formatterDouble.format(ImporteEnteros));
        generarEnteroDTO.setTotalRecuperacion(formatterInteger.format(countRecueracion));
        generarEnteroDTO.setImporteRecuperacion( formatterDouble.format(importeRecuperacion));
        generarEnteroDTO.setListaProceso(listaResult);
        
        return generarEnteroDTO;
    }



    /**
     * realiza la creacion del archivo de enteros 
     * @param generarEnteroDTO
     */
    public void createFileTxt(GenerarEnteroDTO generarEnteroDTO) {
            List<String> listaCompl = Arrays.asList(generarEnteroDTO.getCheckComplemento());
            List<String> listaDeduccion=null;
            List<String> listaPercepcion=null;
            
            //obteniendo los conceptos del tercero
            String layoutPlantilla="";
            String deducciones="";
            String percepciones="";
            if(generarEnteroDTO.getTercero().equalsIgnoreCase(super.configuration().getString("terceros", "METLIFE"))){  
                    deducciones=super.configuration().getString("enteros", "D_MET_LIFE"); 
                    // METLIFE no tiene concepto de percepciones,solo se indica para efectos de los parametros del query
                     percepciones=super.configuration().getString("enteros", "P_MET_LIFE")==null?"X":super.configuration().getString("enteros", "P_MET_LIFE");
                    layoutPlantilla=super.configuration().getString("enteros", "LAYOUT_METLIFE");
            }
            
        //obteniendo los conceptos correspondientes al tercero
        String[] arraydeducciones=deducciones.indexOf(",")==-1?deducciones.split(""):deducciones.split(",");
        String[] arraypercepciones=percepciones.indexOf(",")==-1?percepciones.split(""):percepciones.split(",");
        listaDeduccion = Arrays.asList(arraydeducciones);
        listaPercepcion = Arrays.asList(arraypercepciones);
            
        //obteniendo informacion de enteros
        List<Map>  listaEnterosDTO =super.persistence().get(EnterosDAO.class).procesoEnteros(generarEnteroDTO.getQnaPago(),listaCompl,listaDeduccion,listaPercepcion);
        
        //leer el layoout de enteros
        LayoutEnterosDTO  layoutEnteros=getLayoutEnteros(layoutPlantilla);
        
        //pasando datos  al  DTO
      /// List<EnterosDTO> listaDto = super.transformation().map(listaEnterosDTO, EnterosDTO.class);
        
        //creando archivo de enteros
        String result="";
         String rutaTemp = super.configuration().getString("local.temp.dir");
        File file=new File(rutaTemp+diagonal+super.configuration().getString("enteros", "ENTEROS_METLIFE_FILE"));
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            //obteniendo el encabezado del archivo
            if(layoutEnteros.getEncabezado()!=null){
                for(AtributosLayoutDTO atributosLayout : layoutEnteros.getEncabezado()) {
                    result+=headerFieldResult(atributosLayout);
                }
                bufferedWriter.write(result+"\n");
                result="";
            }

            //obteniendo los registros de enteros y almacenando en el archivo destino
            for(Map mapa:listaEnterosDTO){ 
               //  for(Enteros enteros:listaEnterosDTO){ 
                     //cargando informacion al archivo
                     for(AtributosLayoutDTO atributosLayout : layoutEnteros.getRecord()) {
                         result+=RecordFieldResult(mapa,atributosLayout);
                     }
                    bufferedWriter.write(result+"\n");
                    result="";
             }
            result="";
             //obteniendo cifras de control ( totales ) de enteros
              if(layoutEnteros.getControl()!=null){
                    for(AtributosLayoutDTO atributosLayout : layoutEnteros.getControl()) {
                        result+=ControlFieldResult(atributosLayout,generarEnteroDTO);
                    }
                    bufferedWriter.write(result+"\n");
              }
            
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch(Exception e){
            throw new ServiceException("enteros.create.file.error",e);
        }
}

    /**
     * obtiene el fragmento de  informacion en base al layout para los registros de enteros
     * @param mapa contiene la informacion de enteros
     * @param atributosLayout contiene la informacion de los atributos de los campos del  layout 
     * @return
     */
    private String RecordFieldResult(Map mapa,AtributosLayoutDTO atributosLayout){
   //     private String RecordFieldResult(Enteros enterosDTO,AtributosLayoutDTO atributosLayout){
    //obteniendo los valores en base al layout  
        
        String cadena=(String)mapa.get(atributosLayout.getDesc());
        if(atributosLayout.getDesc().equalsIgnoreCase("numeroPrestamo")){
                    cadena="999";
        }
        
        //en caso de que se requiera eliminar el punto decimal de la cantidad, sevalida que sea virtual el tipo
        if(atributosLayout.getType().equalsIgnoreCase("virtual")){
            cadena=cadena.replace(".","");
        }
        
        //si se tienen que completar la cadena con ceros o espacios en blanco en base a su longitud 
        cadena=valorCampoLayout(atributosLayout,cadena);
        return cadena;
    }
    
    /**
     *  obtiene el fragmento de  informacion en base al layout para posibles encabezados
     * @param atributosLayout
     * @return
     */
    private String headerFieldResult(AtributosLayoutDTO atributosLayout){
        String cadena="";
        cadena=valorCampoLayout(atributosLayout,cadena);
        return cadena;
    }
    
    /**
     * obtiene el fragmento de  informacion en base al layout para cifras de control
     * @param atributosLayout
     * @param generarEnteroDTO
     * @return
     */
    private String ControlFieldResult(AtributosLayoutDTO atributosLayout,GenerarEnteroDTO generarEnteroDTO){
        String cadena="";
        if(atributosLayout.getDesc().equalsIgnoreCase(super.configuration().getString("enteros", "CASOS"))){
            cadena=generarEnteroDTO.getTotalEntero().replace(",","");
        }else  if(atributosLayout.getDesc().equalsIgnoreCase(super.configuration().getString("enteros", "IMPORTE"))){
            cadena=generarEnteroDTO.getImporteEntero().replace(",","");
            cadena=cadena.replace(".","");
       }
        cadena=valorCampoLayout(atributosLayout,cadena);
        return cadena;
    }

    /**
     * obtiene el valor que esta contenido en el layout  o en la cadena 
     * @param atributosLayout
     * @param paramCadena
     * @return
     */
    private String valorCampoLayout(AtributosLayoutDTO atributosLayout,String paramCadena){
        String cadena=atributosLayout.getValue().equalsIgnoreCase("")?paramCadena:atributosLayout.getValue();
        if(cadena.length()!=Integer.parseInt(atributosLayout.getSize())){
            if(!atributosLayout.getComplemento().equalsIgnoreCase("")){
                    if(atributosLayout.getAlign().equalsIgnoreCase("I")){
                        cadena=agregarIzq(cadena,Integer.parseInt(atributosLayout.getSize()), atributosLayout.getComplemento());
                    }else{
                        cadena=agregarDer(cadena,Integer.parseInt(atributosLayout.getSize()), atributosLayout.getComplemento());
                    }
            }
        }
        return cadena;
    }


    /**
     * crea el archivo de enteros en formato excel
     * @param generarEnteroDTO
     */
    public void createFileExcel(GenerarEnteroDTO generarEnteroDTO) {
    }
    
    
    /**
     * complementa la cadena con caracteres a la izquierda
     * @param string cadena a complementar
     * @param largo longitud de la cadena a complementar
     * @param c caracter que complementara la longitud de la cadena
     * @return
     */
    private  String agregarIzq(String string, int largo,String c) { 
            String ceros = ""; 
            int cantidad = largo - string.length(); 
            if (cantidad >= 1) { 
                    for(int i=0;i<cantidad;i++) { ceros += c; } 
                    return (ceros + string); 
                    } 
            else 
                    return string; 
        }
        
     /**
      * complementa la cadena con caracteres a la derecha
      * @param string cadena a complementar
      * @param largo longitud de la cadena a complementar
      * @param c caracter que complementara la longitud de la cadena
     * @return
     */
        private  String agregarDer(String string, int largo,String c) { 
            String ceros = ""; 
            int cantidad = largo - string.length(); 
            if (cantidad >= 1) { 
                    for(int i=0;i<cantidad;i++) { ceros += c; } 
                    return (string+ceros); 
                    } 
            else 
                    return string; 
        }
        
    /**
     * carga la informacion de la plantilla de layout para un tipo de  tercero
     * @param fileNameTercero nombre de la plantilla un tipo de tercero
     * @return
     */
     private LayoutEnterosDTO getLayoutEnteros(String fileNameTercero){
            LayoutEnterosDTO layoutEnterosDTO =new LayoutEnterosDTO();
            String rutaTemp =  super.configuration().getString("terceros.templates.dir") ;
            String  diagonal=File.separator;
             try {
                    DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder docBuilder = null;
                    docBuilder = docBuilderFactory.newDocumentBuilder();
                    //obteniendo la ruta de la plantilla
                    String ruta=rutaTemp+diagonal+fileNameTercero;
                    Document doc = docBuilder.parse (new File(ruta));
                    doc.getDocumentElement ().normalize ();
                     List listaResult=null;
                     //obteniendo el bloque de encabezado
                     NodeList listaEncabezado = doc.getElementsByTagName(super.configuration().getString("enteros", "ENCABEZADO"));
                     Node nodoEncabezado=listaEncabezado.item(0);
                     Element elementoEncabezado = (Element) nodoEncabezado;
                     //obteniendo la lista de los campo de encabezado 
                     NodeList listaEncabezadoCampo=elementoEncabezado.getElementsByTagName(super.configuration().getString("enteros", "CAMPO"));
                     if(listaEncabezadoCampo.getLength()!=0){
                        layoutEnterosDTO.setEncabezado(getAtributosLayout(listaEncabezadoCampo));
                     }
                    //obteniendo el bloque de record
                    NodeList listaCampos = doc.getElementsByTagName(super.configuration().getString("enteros", "RECORD"));
                    Node nodoCampos=listaCampos.item(0);
                    Element elemento = (Element) nodoCampos;
                    //obteniendo la lista de los campos 
                    NodeList listaRecordCampo=elemento.getElementsByTagName(super.configuration().getString("enteros", "CAMPO"));
                    
                    layoutEnterosDTO.setRecord(getAtributosLayout(listaRecordCampo));
                    //obteniendo el bloque de control
                    NodeList listaControl = doc.getElementsByTagName(super.configuration().getString("enteros", "CONTROL"));
                    Node nodoControl=listaControl.item(0);
                    Element elementoControl = (Element) nodoControl;
                    //obteniendo la lista de los campo de encabezado 
                    NodeList listaControlCampo=elementoControl.getElementsByTagName(super.configuration().getString("enteros", "CAMPO"));
                    if(listaControlCampo.getLength()!=0){
                         layoutEnterosDTO.setControl(getAtributosLayout(listaControlCampo));
                    }
                
            }catch (Exception e) {
                throw new ServiceException("enteros.create.file.error",e);
            }
             return layoutEnterosDTO;
        }    
        
    /**
     * obtiene los valores de los  atributos de los campos del layout 
     * @param paramList lista de campos
     * @return
     */
    private List<AtributosLayoutDTO> getAtributosLayout(NodeList paramList){
    //obteniendo los valores de los atributos de cada campo del layout
            int lengthList = paramList.getLength();
            List lista=new ArrayList<AtributosLayoutDTO>();
            AtributosLayoutDTO atributosLayoutDTO=null;
                    for (int i = 0; i < lengthList ; i ++) {
                            atributosLayoutDTO=new AtributosLayoutDTO();
                            Node campo = paramList.item(i); 
                            NamedNodeMap attributes = campo.getAttributes();
                            atributosLayoutDTO.setDesc(attributes.getNamedItem(super.configuration().getString("enteros", "DESCRIPCION")).getNodeValue());
                            atributosLayoutDTO.setIni(attributes.getNamedItem(super.configuration().getString("enteros", "INICIO")).getNodeValue());
                            atributosLayoutDTO.setFin(attributes.getNamedItem(super.configuration().getString("enteros", "FIN")).getNodeValue());
                            atributosLayoutDTO.setSize(attributes.getNamedItem(super.configuration().getString("enteros", "TAMANIO")).getNodeValue());
                            atributosLayoutDTO.setValue(attributes.getNamedItem(super.configuration().getString("enteros", "VALOR")).getNodeValue());
                            atributosLayoutDTO.setComplemento(attributes.getNamedItem(super.configuration().getString("enteros", "COMPLEMENTO")).getNodeValue());
                            atributosLayoutDTO.setAlign(attributes.getNamedItem(super.configuration().getString("enteros", "ALINEACION")).getNodeValue());
                            atributosLayoutDTO.setType(attributes.getNamedItem(super.configuration().getString("enteros", "TIPO")).getNodeValue());
                            lista.add(atributosLayoutDTO);
                    }
            return lista;
        }
}
