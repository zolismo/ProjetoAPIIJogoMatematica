package br.com.opusnet.projetoapiidoscrias.util;

import javafx.stage.Screen;

public interface SizeScreen {
     double screenWidth = Screen.getPrimary().getBounds().getWidth();
     double screenHeight = Screen.getPrimary().getBounds().getHeight();

}
