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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author TatuEdi
 */
public class TelaLoginController implements Initializable {
    @FXML
    private Button btnEntrar;
    
    @FXML private BorderPane bdPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML private void telaInicial(){
        try{
                URL url = getClass().getResource("/visao/telaInicial.fxml");
                Parent telaInicial = FXMLLoader.load(url);
                bdPane.setCenter(telaInicial);
            } catch (IOException ex) {
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
