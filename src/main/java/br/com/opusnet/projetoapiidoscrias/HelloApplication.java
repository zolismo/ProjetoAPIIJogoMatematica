package br.com.opusnet.projetoapiidoscrias;

import br.com.opusnet.projetoapiidoscrias.scene.HomeScene;
import br.com.opusnet.projetoapiidoscrias.util.SizeScreen;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        SizeScreen.valueWidth = screenBounds.getWidth();
        SizeScreen.valueHeight = screenBounds.getHeight();

        HomeScene homeScene = new HomeScene(new Group(), stage);

        stage.setFullScreen(true);
        stage.setMinWidth(400);
        stage.setMaximized(true);
        stage.setTitle("Exemplo JavaFX");
        stage.setScene(homeScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
