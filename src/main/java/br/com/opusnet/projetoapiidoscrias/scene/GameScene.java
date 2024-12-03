/*package br.com.opusnet.projetoapiidoscrias.scene;

import br.com.opusnet.projetoapiidoscrias.util.Updatable;
import javafx.scene.*;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import br.com.opusnet.projetoapiidoscrias.controlls.*;

import br.com.opusnet.projetoapiidoscrias.util.SizeScreen;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class GameScene extends Scene implements Updatable {

    private Group group;
    private GameLoop gameLoop;
    private Stage stage;
    public GameScene(Parent root, Stage stage) {
        super(root);
        this.group = (Group) root;
        this.stage = stage;
        initializeScene();

        gameLoop = new GameLoop(this);  // Passa a si mesma como o Updatable
        new Thread(gameLoop).start();  // Inicia o game loop em uma thread separada
    }

    private void initializeScene() {
        Button buttonHome = new Button("Voltar para Home");
        buttonHome.setTranslateX(400);
        buttonHome.setTranslateY(300);
        buttonHome.setMinHeight(45);
        buttonHome.setOnAction(event -> {
            goToHomeScreen();
        });

        ((Group) group).getChildren().add(buttonHome);
    }

    private void goToHomeScreen() {

        stage.setScene(new HomeScene(new Group(),stage));

    }

    @Override
    public void update() {
        System.out.println("Atualizando o jogo...");
    }

    @Override
    public void render() {
        System.out.println("Renderizando o jogo...");
    }
}
*/