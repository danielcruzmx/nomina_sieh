/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.shcp.certificados.nominaservice;

import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author omar_gomez
 */
public class WebServiceFXMLController extends Controller implements Initializable {

    @FXML
    private Label mensajes;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }   

    public String getMensajes() {
        return mensajes.getText();
    }

    public void setMensajes(String texto) {
        this.mensajes.setText(texto);
    }
    
    

    @Override
    protected void limpiarCampo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void disableButtons(boolean ban) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void close(){
        Platform.exit();
    }
}
