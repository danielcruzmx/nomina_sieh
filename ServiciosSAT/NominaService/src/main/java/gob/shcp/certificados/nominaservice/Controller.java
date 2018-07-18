/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gob.shcp.certificados.nominaservice;

import javafx.fxml.FXML;

/**
 *
 * @author omar_gomez
 */
public abstract class Controller {
    
    
    protected MainApp application;
    

    protected abstract void limpiarCampo();
    
    protected abstract void disableButtons(boolean ban);
    
    public void setApp(MainApp application) {
        this.application = application;
    }
    
}
