package br.com.opusnet.projetoapiidoscrias.util;

import java.io.IOException;
import java.net.MalformedURLException;

public interface Updatable {
    void update() throws IOException;
    void render();
}
