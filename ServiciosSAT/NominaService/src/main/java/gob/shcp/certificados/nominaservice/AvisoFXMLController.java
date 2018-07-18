package gob.shcp.certificados.nominaservice;

import gob.shcp.certificados.nominaservice.model.Respuesta;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author omar_gomez
 */
public class AvisoFXMLController implements Initializable {

    @FXML
    private TextField codRespuesta;
    
    @FXML
    private TextField idPaquete;
    
    @FXML
    private TextArea respuesta;
    
    @FXML   TextArea urlSalida;

    private Stage dialogStage;
    private boolean okClicked = false;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    } 
    
    public void setRespuesta(Respuesta r){
        codRespuesta.setText(String.valueOf(r.getCodRespuesta()));
        if(idPaquete!=null)
            idPaquete.setText((r.getIdPaquete()!=null)?r.getIdPaquete():"");
        if(respuesta != null)
            respuesta.setText((r.getRespuesta()!=null)?r.getRespuesta():"");
        if(urlSalida!=null)
            urlSalida.setText((r.getUriSalida()!=null)?r.getUriSalida():"");
    }
    
   public boolean isOkClicked() {
        return okClicked;
    }
    
    @FXML
    private void handleOk() {
        okClicked = true;
        dialogStage.close();
    }
    
}
