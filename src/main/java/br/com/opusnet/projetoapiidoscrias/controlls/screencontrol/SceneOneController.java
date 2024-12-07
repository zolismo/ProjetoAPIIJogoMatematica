package br.com.opusnet.projetoapiidoscrias.controlls.screencontrol;

import br.com.opusnet.projetoapiidoscrias.model.Controll;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class SceneOneController implements Controll {

    @FXML
    public Button b_add = new Button();

    @FXML
    public Button b_sub = new Button();

    @FXML
    public Button b_mult = new Button();

    @FXML
    public Button b_div = new Button();

    @FXML
    public Button b_char1 = new Button();

    @FXML
    public Button b_char2 = new Button();

    @FXML
    public Button b_char3 = new Button();

    @FXML
    public Button b_char4 = new Button();

    @FXML
    public ImageView iv_enemy1 = new ImageView();

}
