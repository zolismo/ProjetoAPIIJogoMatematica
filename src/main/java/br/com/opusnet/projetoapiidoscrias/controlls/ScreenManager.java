
/*
package br.com.opusnet.projetoapiidoscrias.controlls;

import br.com.opusnet.projetoapiidoscrias.scene.HomeScene;
import br.com.opusnet.projetoapiidoscrias.util.SizeScreen;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ScreenManager {

    private Stage stage;
    private Scene currentScene;

    // Construtor que recebe o stage da aplicação
    public ScreenManager(Stage stage) {
        this.stage = stage;
    }

    // Define e exibe uma nova cena
    public void switchToScene(Scene scene) {
        if (currentScene != scene) {
            currentScene = scene;
            stage.setScene(scene); // Muda a cena na tela
        }
    }

    // Método para retornar à tela inicial
    public void goToHomeScreen() {
        // Aqui você cria a sua cena inicial, que é o que você quer mostrar ao usuário
        // Certifique-se de substituir `HomeScene` pelo nome da sua classe de tela inicial
        Scene homeScene = new HomeScene(new Group(), stage);  // Exemplo de tela inicial
        switchToScene(homeScene);
    }
}


 */