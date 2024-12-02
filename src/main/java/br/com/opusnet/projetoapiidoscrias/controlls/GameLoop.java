package br.com.opusnet.projetoapiidoscrias.controlls;

import br.com.opusnet.projetoapiidoscrias.util.Updatable;
import javafx.application.Platform;


public class GameLoop implements Runnable {

    private static final double FPS = 60.0;  // Frames por segundo
    private static final double NS_PER_UPDATE = 1000000000.0 / FPS;  // Convertendo FPS para nanosegundos

    private Updatable updatable;  // Objeto que será atualizado e renderizado
    private boolean running = true;

    public GameLoop(Updatable updatable) {
        this.updatable = updatable;
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double delta = 0;

        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / NS_PER_UPDATE;
            lastTime = now;

            if (delta >= 1) {
                updatable.update();  // Atualiza a lógica do jogo
                Platform.runLater(updatable::render);  // Executa a renderização da UI
                delta--;
            }
        }
    }

    public void stop() {
        running = false;
    }
}
