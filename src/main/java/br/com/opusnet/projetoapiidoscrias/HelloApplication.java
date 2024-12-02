package br.com.opusnet.projetoapiidoscrias;

import br.com.opusnet.projetoapiidoscrias.scene.HomeScene;
import br.com.opusnet.projetoapiidoscrias.util.SizeScreen;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Configurando as dimensões da tela
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        SizeScreen.valueWidth = screenBounds.getWidth();
        SizeScreen.valueHeight = screenBounds.getHeight();

        // Chamando a root que inicia o arquivo .fxml
        try {
            Parent root = FXMLLoader.load(getClass().getResource("start-screen.fxml"));
            // Criando a cena inicial (HomeScene)
            HomeScene homeScene = new HomeScene(root, stage);
            // Configurações do Stage
            stage.setTitle("Valus");
            stage.setScene(homeScene);  // Define HomeScene diretamente no Stage
            stage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
