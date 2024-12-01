package br.com.opusnet.projetoapiidoscrias;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements Runnable {
    @Override
    public void start(Stage stage) throws Exception {
        // Criando um novo Group para ser usado como raiz
        Group root = new Group();

        // Criando a GameScene com o root
        GameScene gameScene = new GameScene(root);

        // Definindo a cena no Stage
        stage.setScene(gameScene);

        // Configurações do Stage
        stage.setTitle("Stage demo program uuu");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setResizable(false);
        stage.setX(50);
        stage.setY(50);
        stage.show();
    }

    public static void main(String[] args){


        launch(args);
    }

    @Override
    public void run() {

    }
}