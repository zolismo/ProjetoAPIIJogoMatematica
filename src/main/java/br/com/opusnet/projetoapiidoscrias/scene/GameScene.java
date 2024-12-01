package br.com.opusnet.projetoapiidoscrias.scene;

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

public class GameScene extends Scene implements Runnable, SizeScreen {

    private Thread gameThread;
    private Parent group;
    private Stage stage;

    public GameScene(Parent root, Stage stage) {
        super(root);
        this.stage = stage;
        if (!(root instanceof Group)) {
            throw new IllegalArgumentException("Algum erro");
        }
        group = (Group) root;
        initializeScene();

        // Iniciar a thread do jogo no construtor
        gameThread = new Thread(this); // Criando a thread e passando o próprio objeto como Runnable
        gameThread.start(); // Iniciando a thread
    }


    protected void initializeScene() {
        Button b = new Button("dsa");
        List<Node> nodeList = new ArrayList<>();
        b.setTranslateX(screenWidth/2);
        b.setTranslateY(screenHeight/2);
        b.setMinHeight(45);
        nodeList.add(b);


        ((Group) group).getChildren().addAll(nodeList);
        render();
    }

    public void render() {
        // Realizar renderização da cena aqui
    }

    public void update() {
        // Atualizar lógica do jogo aqui
    }

    @Override
    public void run() {
        // Game Loop
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000.0 / amountOfTicks;
        double delta = 0;

        while (true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                this.update();  // Atualiza a lógica do jogo
                Platform.runLater(this::render);  // Executa a renderização da UI
                delta--;
                System.out.println("Test");
            }
        }
    }
}
