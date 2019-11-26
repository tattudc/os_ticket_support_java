/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author TatuEdi
 */
public class AbrirChamadoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private BorderPane bdPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML private void cancelaNewCall(){
                bdPane.setVisible(false);
        } 
}
