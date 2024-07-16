package com;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class PrincipalController {
    
    @FXML
    private TextField campoEstoque;
    
    private Galinheiro galinheiro; 
    
    @FXML
    private void initialize(){
        galinheiro = new Galinheiro(); 
        campoEstoque.setText(String.valueOf(galinheiro.getOvos()));
    }
    
    @FXML
    private void botar(){
        galinheiro.botar();
        campoEstoque.setText(String.valueOf(galinheiro.getOvos()));
    }
    
    
    @FXML
    private void retirar(){
        if(galinheiro.getOvos() == 0){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Não há ovos para retirar");
            alert.show();
            return; 
        }
        galinheiro.retirar();
        campoEstoque.setText(String.valueOf(galinheiro.getOvos()));
    }
    
    
    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }
    
}
