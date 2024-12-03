package br.com.opusnet.projetoapiidoscrias.controlls.screencontrol;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeSceneControl {

    @FXML
<<<<<<< HEAD
    public Button b_newgame;
=======
    public Button b_newgame = new Button();  // O botão será injetado aqui

>>>>>>> c125292102031e823f22528726c29f376ebfb352

    @FXML
    public void initialize() {
        System.out.println("Controlador HomeSceneControl carregado com sucesso!");
    }
}
