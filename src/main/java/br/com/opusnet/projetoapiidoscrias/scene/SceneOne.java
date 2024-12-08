package br.com.opusnet.projetoapiidoscrias.scene;

import br.com.opusnet.projetoapiidoscrias.controlls.GameLoop;
import br.com.opusnet.projetoapiidoscrias.controlls.screencontrol.SceneOneController;
import br.com.opusnet.projetoapiidoscrias.model.LifeGame;
import br.com.opusnet.projetoapiidoscrias.model.ScreemInterface;
import br.com.opusnet.projetoapiidoscrias.util.Updatable;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.List;
public class SceneOne extends Scene implements Updatable, ScreemInterface {

    private final GameLoop gameLoop;
    private final SceneOneController controller;
    private final Stage stage;
    private double valueEnime = 250;
    private final String equacionEnime = "x² - 500x + 62500 = 0";
    private double respostPerson;

    private double[] valueSelected = {0, 0};
    private int buttonPressed = 0;

    private boolean sentinel = true;

    public SceneOne(Parent root, Stage stage, SceneOneController controller) {
        super(root);
        this.stage = stage;
        this.controller = controller;
        setValuesPerson();

        gameLoop = new GameLoop(this);
        new Thread(gameLoop).start();
    }

    public void setValuesPerson() {
        controller.b_char1.setText("200");
        controller.b_char2.setText("90");
        controller.b_char3.setText("50");
        controller.b_char4.setText("20");
    }

    @Override
    public void update() {
        System.out.println("Value 1: " + valueSelected[0]);
        System.out.println("Value 2: " + valueSelected[1]);
        System.out.println("Button Pressed: " + buttonPressed);
        System.out.println("Resposta calculada: " + respostPerson);
        handleButtonPress();
        handlePersonSelect();

        checkAnswer();

    }

    @Override
    public void render() {
        Platform.runLater(() -> {
            if (LifeGame.lifeGame == 0) {
                controller.t_level1.setVisible(true);
                controller.t_level1.setText("Você perdeu");
                gameLoop.stop();
            }
            moveEnime();

        });
    }

    private void handleButtonPress() {
        if (controller.b_add.isPressed() && buttonPressed == 0) buttonPressed = 1;
        else if (controller.b_sub.isPressed() && buttonPressed == 0) buttonPressed = 2;
        else if (controller.b_mult.isPressed() && buttonPressed == 0) buttonPressed = 3;
        else if (controller.b_div.isPressed() && buttonPressed == 0) buttonPressed = 4;
    }

    private void handlePersonSelect() {
        if (controller.b_char1.isPressed()) setSelection(Double.parseDouble(controller.b_char1.getText()));
        else if (controller.b_char2.isPressed()) setSelection(Double.parseDouble(controller.b_char2.getText()));
        else if (controller.b_char3.isPressed()) setSelection(Double.parseDouble(controller.b_char3.getText()));
        else if (controller.b_char4.isPressed()) setSelection(Double.parseDouble(controller.b_char4.getText()));
    }

    private void setSelection(double value) {
        if (valueSelected[0] == 0) valueSelected[0] = value;
        else if (valueSelected[1] == 0) valueSelected[1] = value;
    }

    private void moveEnime() {
        double enemyY = controller.iv_enemy1.getY();

        if (sentinel && enemyY >= 50) sentinel = false;
        else if (!sentinel && enemyY <= -200) sentinel = true;

        controller.iv_enemy1.setY(enemyY + (sentinel ? 8 : -8));
    }

    public void checkAnswer() {
        if (valueSelected[0] != 0 && valueSelected[1] != 0 && buttonPressed != 0) {
            switch (buttonPressed) {
                case 1 -> respostPerson = valueSelected[0] + valueSelected[1];
                case 2 -> respostPerson = valueSelected[0] - valueSelected[1];
                case 3 -> respostPerson = valueSelected[0] * valueSelected[1];
                case 4 -> respostPerson = valueSelected[0] / valueSelected[1];
            }

            if (respostPerson != valueEnime) {
                System.out.println(respostPerson);
                LifeGame.lifeGame--;
                resetGameState();
            }
        }
    }

    private void resetGameState() {
        respostPerson = 0;
        valueSelected = new double[]{0, 0};
        buttonPressed = 0;
    }
}