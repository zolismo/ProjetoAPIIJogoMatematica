package br.com.opusnet.projetoapiidoscrias.scene;

import br.com.opusnet.projetoapiidoscrias.controlls.GameLoop;
import br.com.opusnet.projetoapiidoscrias.controlls.screencontrol.SceneOneController;
import br.com.opusnet.projetoapiidoscrias.model.ScreemInterface;
import br.com.opusnet.projetoapiidoscrias.util.Updatable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneOne extends Scene  implements Updatable, ScreemInterface {

    private GameLoop gameLoop;

    public SceneOne(Parent root, Stage stage, SceneOneController controler) {
        super(root);
        //stage.setScene(this);

        gameLoop = new GameLoop(this);
        new Thread(gameLoop).start();
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {

    }
}