package br.com.opusnet.projetoapiidoscrias;

import br.com.opusnet.projetoapiidoscrias.scene.HomeScene;
import br.com.opusnet.projetoapiidoscrias.util.SizeScreen;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Configurando as dimensões da tela
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        SizeScreen.valueWidth = screenBounds.getWidth();
        SizeScreen.valueHeight = screenBounds.getHeight();

        // Criando a cena inicial (HomeScene)
        HomeScene homeScene = new HomeScene(new Group(), stage);

        // Configurações do Stage
        stage.setFullScreen(true);
        stage.setMinWidth(400);
        stage.setMaximized(true);
        stage.setTitle("Exemplo JavaFX");
        stage.setScene(homeScene);  // Define HomeScene diretamente no Stage
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
