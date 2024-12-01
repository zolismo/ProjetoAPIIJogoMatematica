package br.com.opusnet.projetoapiidoscrias;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameWindow {
    private Group group;
    private Scene scene;

    public  GameWindow(Stage stage){

        Group root = new Group();

        GameScene gameScene = new GameScene(root);

        stage.setScene(gameScene);
        stage.setTitle("Stage demo program uuu");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setResizable(false);
        stage.setX(50);
        stage.setY(50);
        stage.show();
    }



}
