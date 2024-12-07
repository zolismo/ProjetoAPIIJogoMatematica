package br.com.opusnet.projetoapiidoscrias.controlls.screencontrol;

import br.com.opusnet.projetoapiidoscrias.model.Controll;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeSceneControl implements Controll {
    @FXML
    public Button b_newgame = new Button();

    @FXML
    public Button b_quit = new Button();

    @FXML
    public void initialize() {
        System.out.println("Controlador HomeSceneControl carregado com sucesso!");
    }

    public void trocarScena(Stage stage, Scene scene){
        stage.setScene(scene);
    }

}
