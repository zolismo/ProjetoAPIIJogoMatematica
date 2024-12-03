package br.com.opusnet.projetoapiidoscrias.controlls.screencontrol;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeSceneControl {

    @FXML
    public Button b_newgame = new Button();  // O botão será injetado aqui


    @FXML
    public void initialize() {
        System.out.println("Controlador HomeSceneControl carregado com sucesso!");
    }
}
