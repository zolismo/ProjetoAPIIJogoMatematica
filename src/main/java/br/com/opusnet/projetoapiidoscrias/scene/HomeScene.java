package br.com.opusnet.projetoapiidoscrias.scene;

import br.com.opusnet.projetoapiidoscrias.controlls.screencontrol.HomeSceneControl;
import br.com.opusnet.projetoapiidoscrias.util.SizeScreen;
import br.com.opusnet.projetoapiidoscrias.util.Updatable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeScene extends Scene implements Updatable {

    private HomeSceneControl homeSceneControl;

    public HomeScene(Parent root, Stage stage){
        super(root);
        homeSceneControl = new HomeSceneControl();
        stage.setScene(this);
        stage.setTitle("Valus");
        stage.show();

    }

    @Override
    public void update() {

    }

    @Override
    public void render() {

    }




    /*
    private void initializeScene(Parent root, Stage stage) {
        Button buttonStart = new Button("Iniciar Jogo");
        buttonStart.setTranslateX(SizeScreen.valueWidth/2);
        buttonStart.setTranslateY(SizeScreen.valueHeight/2);
        buttonStart.setMinHeight(45);
        buttonStart.setOnAction(event -> {
            GameScene gameScene = new GameScene(new Group(), stage);
            stage.setScene(gameScene);
            stage.setFullScreen(true);
            stage.setFullScreenExitHint("");
        });


    }

 */
}
