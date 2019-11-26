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
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author TatuEdi
 */
public class TelaInicialController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private MenuItem newCliente;
    
    @FXML private BorderPane borderInicial;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
        @FXML private void novoUser(){
        try{
                URL url = getClass().getResource("/visao/novoUser.fxml");
                Parent novoUser = FXMLLoader.load(url);
                borderInicial.setCenter(novoUser);
            } catch (IOException ex) {
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        @FXML private void editarUser(){
        try{
                URL url = getClass().getResource("/visao/editarUser.fxml");
                Parent editarUser = FXMLLoader.load(url);
                borderInicial.setCenter(editarUser);
            } catch (IOException ex) {
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        @FXML private void novoTecnico(){
        try{
                URL url = getClass().getResource("/visao/NovoTecnico.fxml");
                Parent NovoTecnico = FXMLLoader.load(url);
                borderInicial.setCenter(NovoTecnico);
            } catch (IOException ex) {
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        @FXML private void editarTecnico(){
        try{
                URL url = getClass().getResource("/visao/EditarTecnico.fxml");
                Parent editarTecnico = FXMLLoader.load(url);
                borderInicial.setCenter(editarTecnico);
            } catch (IOException ex) {
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        @FXML private void newCall(){
        try{
                URL url = getClass().getResource("/visao/abrirChamado.fxml");
                Parent abrirChamado = FXMLLoader.load(url);
                borderInicial.setCenter(abrirChamado);
            } catch (IOException ex) {
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
