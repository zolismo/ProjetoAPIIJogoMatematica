package br.com.opusnet.projetoapiidoscrias.scene;

import br.com.opusnet.projetoapiidoscrias.controlls.screencontrol.SceneOneController;
import br.com.opusnet.projetoapiidoscrias.model.ScreemInterface;
import br.com.opusnet.projetoapiidoscrias.util.Updatable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneOne extends Scene  implements Updatable, ScreemInterface {

    public SceneOne(Parent root, Stage stage, SceneOneController control) {
        super(root);
        String css = this.getClass().getResource("styles/teste.css").toExternalForm();
        this.getStylesheets().add(css);
        stage.setScene(this);
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {

    }
}