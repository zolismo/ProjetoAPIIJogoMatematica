package br.com.opusnet.projetoapiidoscrias.scene;

import br.com.opusnet.projetoapiidoscrias.controlls.GameLoop;
import br.com.opusnet.projetoapiidoscrias.controlls.screencontrol.HomeSceneControl;
import br.com.opusnet.projetoapiidoscrias.model.ScreemInterface;
import br.com.opusnet.projetoapiidoscrias.util.Updatable;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.*;

public class HomeScene extends Scene implements Updatable, ScreemInterface {
    private HomeSceneControl homeSceneControl;
    private GameLoop gameLoop;

    public HomeScene(Parent root, Stage stage,HomeSceneControl homeSceneControl) throws FileNotFoundException {
        super(root);
        this.homeSceneControl = homeSceneControl;

        //Adiciona um icon pro jogo
        InputStream stream = new FileInputStream("src/main/resources/br/com/opusnet/projetoapiidoscrias/Char_Quadrado.png");
        Image icon = new Image(stream);
        stage.getIcons().add(icon);

        stage.setScene(this);
        stage.setTitle("Valus");
        stage.show();
        gameLoop = new GameLoop(this);  // Passa a si mesma como o Updatable
        new Thread(gameLoop).start();  // Inicia o game loop em uma thread separada
    }

    @Override
    public void update() {
        if (homeSceneControl.b_newgame.isPressed()) {

        }

        if (homeSceneControl.b_quit.isPressed()) {
            System.exit(0);
        }

    }

    @Override
    public void render() {
        //Aqui é setado as operações visuais
        Platform.runLater(() -> {
            if (homeSceneControl.b_newgame.isPressed()) {
                homeSceneControl.b_newgame.setText("Iniciando Jogo...");
             }
        });
        System.out.println(homeSceneControl.b_newgame.getText());
        System.out.println("Renderizando HomeScene");
    }
}