package br.com.opusnet.projetoapiidoscrias.window;

import br.com.opusnet.projetoapiidoscrias.scene.GameScene;
import javafx.scene.Group;
import javafx.stage.Stage;

public class GameWindow {
    public GameWindow(Stage stage) {
        // Criando a cena primeiro
        Group root = new Group();
        GameScene gameScene = new GameScene(root,stage);

        stage.setScene(gameScene);

        stage.setTitle("Stage demo program uuu");
        stage.setFullScreen(true);
        stage.setMinWidth(stage.getMinWidth());
        stage.setMaximized(true);

        stage.setOnCloseRequest(event -> {
            System.out.println("A janela está sendo fechada...");
            System.exit(0);
        });

        stage.show();
    }
}
