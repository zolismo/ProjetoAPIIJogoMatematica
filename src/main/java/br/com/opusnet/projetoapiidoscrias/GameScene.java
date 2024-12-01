package br.com.opusnet.projetoapiidoscrias;

import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene implements Runnable {

    private Thread gameThread;

    public GameScene(Parent root) {
        super(root);
        // Iniciar a thread do jogo no construtor
        gameThread = new Thread(this);  // Criando a thread e passando o próprio objeto como Runnable
        gameThread.start();  // Iniciando a thread
    }

    public GameScene(Parent root, double width, double height) {
        super(root, width, height);
    }

    protected void initializeScene() {
        // Inicialize elementos da cena aqui, se necessário
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
