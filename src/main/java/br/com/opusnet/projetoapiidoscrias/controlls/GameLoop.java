package br.com.opusnet.projetoapiidoscrias.controlls;

import br.com.opusnet.projetoapiidoscrias.util.Updatable;
import javafx.application.Platform;

import java.io.IOException;

public class GameLoop implements Runnable {
    private static final double FPS = 25.0;
    private static final double NS_PER_UPDATE = 1000000000.0 / FPS;
    private Updatable updatable;
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
                try {
                    updatable.update();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Platform.runLater(updatable::render);
                delta--;
            }
        }
    }

    public void stop() {
        running = false;
    }
}