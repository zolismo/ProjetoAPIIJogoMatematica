package br.com.opusnet.projetoapiidoscrias;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

      GameWindow gameWindow = new GameWindow(stage);
    }

    public static void main(String[] args){
        launch(args);
    }

}