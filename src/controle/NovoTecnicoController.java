/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author TatuEdi
 */
public class NovoTecnicoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private BorderPane bdPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML private void cancelaNewtTec(){
                bdPane.setVisible(false);
        } 
}
