package br.com.opusnet.projetoapiidoscrias;

import br.com.opusnet.projetoapiidoscrias.window.GameWindow;
import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
      GameWindow gameWindow = new GameWindow(stage);
    }

    public static void main(String[] args){
        launch(args);
    }

}