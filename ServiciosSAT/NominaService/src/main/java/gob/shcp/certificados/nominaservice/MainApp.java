package gob.shcp.certificados.nominaservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gob.shcp.certificados.nominaservice.model.Respuesta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage stage;
    private String service;

    private static final String SERVICIO_RECEPCION = "RECEPCION";
    private static final String SERVICIO_CONSULTA = "CONSULTA";
    private static final String SERVICIO_CANCELACION = "CANCELACION";

    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        stage.setTitle("Servicio de Nomina - SHCP");

        Parameters p = this.getParameters();
        service = p.getNamed().get("service");

        if (service != null) {
            WebServiceFXMLController fxmlController = gotoWebService();
            //stage.show();
            System.out.println("Procesando informacion");
            processWebService(fxmlController, p, service);
        } else{
            System.out.println("NO HAY SERVICIO");
            //showAlert("Error", "Servicio no identificado.", "/fxml/AlertFXML.fxml");
        }
        Platform.exit();
    }

    private void processWebService(WebServiceFXMLController fxmlController, Parameters p, String service) {
        Respuesta respuesta = null;
        fxmlController.setMensajes("Procesando El servicio " + service + "...");
        
        try {
            if (SERVICIO_RECEPCION.equalsIgnoreCase(service)) {
                /*
                String ubicacion = p.getNamed().get("file");
                File file = new File(ubicacion);
                System.out.println("archivo existe: "+file.exists());
                InputStream targetStream = new FileInputStream(file);
                byte[] f = new byte[(int)file.length()];
                targetStream.read(f);
                String archivoBase64 =Base64.getEncoder().encodeToString(f);
                respuesta = ServiciosWeb.procesoNominaRecepcion(p.getNamed().get("rfc"),p.getNamed().get("fileName"), archivoBase64);
                */

                respuesta = ServiciosWeb.procesoNominaRecepcion(p.getNamed().get("rfc"),p.getNamed().get("fileName"), p.getNamed().get("file"));
                respuesta.setIdNomina(Integer.valueOf( p.getNamed().get("idNomina")));
                String response = sendRequest(p.getNamed().get("urlRequest"),toJson(respuesta),p.getNamed().get("cookies"));
                System.out.println(response);
                //showDialog(respuesta,"/fxml/AvisoFXML.fxml");
            } else if (SERVICIO_CONSULTA.equalsIgnoreCase(service)) {
                respuesta = ServiciosWeb.procesoNominaConsulta(p.getNamed().get("rfc"), p.getNamed().get("idPaquete"));
                respuesta.setIdNomina(Integer.valueOf( p.getNamed().get("idNomina")));
                System.out.println("idNomina " + respuesta.getIdNomina() );
                String response = sendRequest(p.getNamed().get("urlRequest"),toJson(respuesta),p.getNamed().get("cookies"));
                System.out.println(response);
                
                //showDialog(respuesta,"/fxml/AvisoConsultaFXML.fxml");
            } else if (SERVICIO_CANCELACION.equalsIgnoreCase(service)) {
                /*
                String ubicacion = p.getNamed().get("file");
                String fileName = p.getNamed().get("fileName");
                File file = new File(ubicacion);
                System.out.println(file.exists());
                InputStream targetStream = new FileInputStream(file);
                byte[] f = new byte[(int)file.length()];
                targetStream.read(f);
                String archivoBase64 =Base64.getEncoder().encodeToString(f);
                respuesta = ServiciosWeb.procesoNominaCancelacion(p.getNamed().get("rfc"),fileName, archivoBase64);
                */
                respuesta = ServiciosWeb.procesoNominaCancelacion(p.getNamed().get("rfc"),p.getNamed().get("fileName"), p.getNamed().get("file"));
                respuesta.setIdNomina(Integer.valueOf( p.getNamed().get("idNomina")));
                //"http://localhost:7001/TestNominaWeb/rest/service/respuesta"
                String response = sendRequest(p.getNamed().get("urlRequest"),toJson(respuesta),p.getNamed().get("cookies"));
                System.out.println(response);
                //showDialog(respuesta, "/fxml/AvisoCancelacionFXML.fxml");
            }else{
                //showAlert("Error", "Servicio no identificado.", "/fxml/AlertFXML.fxml");
            }


        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
            //showAlert("Error", "Error al enviar el servicio, favor de comunicarse con el administrador del sistema.\n"+ex.getMessage(), "/fxml/AlertFXML.fxml");
        }

        
        fxmlController.setMensajes("Finaliando  servicio...");
        fxmlController.close();

    }

    private String toJson(Respuesta respuesta) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        String json =  mapper.writeValueAsString(respuesta);
        
        System.out.println(json);
        return json;
    }
    
protected String sendRequest(String requestUrl, String jSonParams, String cookies) throws MalformedURLException, IOException{
        StringBuffer response = new StringBuffer(); 
        //String requestUrl = getRequestURL()+target;
        //String cookies= getCookies();
        //Create connection
        System.out.println("RequestUrl: "+requestUrl);
        URL url = new URL(requestUrl);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type","application/json;charset=UTF-8");
        connection.setRequestProperty("Cookie",cookies);
        if(jSonParams!=null){
            connection.setDoOutput(true);
            OutputStream os = connection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
            osw.write(jSonParams);
            osw.flush();
            osw.close();
        }

        System.out.println("peticion en curso.....::::");
        //Get Response	
        InputStream is = connection.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is,StandardCharsets.UTF_8));
        String line;
        while((line = rd.readLine()) != null) {
          response.append(line);
        }
        rd.close();
        System.out.println("peticion realizada");
        System.out.println(connection.getResponseCode());
        System.out.println(connection.getResponseMessage());
        return response.toString();
    }
    
    public boolean showDialog(Respuesta respuesta, String fxml) {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(fxml));
            AnchorPane page = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Respuesta");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(stage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Set the person into the controller.
            AvisoFXMLController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setRespuesta(respuesta);

            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean showAlert(String title, String message, String fxml) {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(fxml));
            AnchorPane page = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Alert");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(stage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Set the person into the controller.
            AlertFXMLController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setMessage(title, message);

            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    

    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = MainApp.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(MainApp.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }

        // Store the stage width and height in case the user has resized the window
        double stageWidth = stage.getWidth();
        if (!Double.isNaN(stageWidth)) {
            stageWidth -= (stage.getWidth() - stage.getScene().getWidth());
        }

        double stageHeight = stage.getHeight();
        if (!Double.isNaN(stageHeight)) {
            stageHeight -= (stage.getHeight() - stage.getScene().getHeight());
        }

        Scene scene = new Scene(page);
        if (!Double.isNaN(stageWidth)) {
            page.setPrefWidth(stageWidth);
        }
        if (!Double.isNaN(stageHeight)) {
            page.setPrefHeight(stageHeight);
        }

        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }

    public Stage getStage() {
        return stage;
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private WebServiceFXMLController gotoWebService() {
        WebServiceFXMLController fxmlController = null;
        try {
            fxmlController = (WebServiceFXMLController) replaceSceneContent("/fxml/WebServiceFXML.fxml");
            fxmlController.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fxmlController;
    }

}
