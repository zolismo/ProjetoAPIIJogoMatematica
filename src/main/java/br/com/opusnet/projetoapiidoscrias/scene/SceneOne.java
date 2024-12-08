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

public class SceneOne extends Scene  implements Updatable, ScreemInterface {

    private GameLoop gameLoop;
    private SceneOneController controller;
    private Stage stage;
    double valueEnime = 250;
    String equacionEnime = "xˆ2 -500x + 62500 = 0";
    double respostPerson = 0;

    double[] valueSelected = {0,0};
    int buttonPressed = 0;

   // boolean[] buttonPressed = {false,false,false,false};


    public SceneOne(Parent root, Stage stage, SceneOneController controller) {
        super(root);
        this.stage = stage;
        this.controller = controller;
        setValuesPerson();

        gameLoop = new GameLoop(this);
        new Thread(gameLoop).start();
    }

    public void setValuesPerson(){
        controller.b_char1.setText(" 100");
        controller.b_char2.setText("90");
        controller.b_char3.setText(" 50");
        controller.b_char4.setText("20");
    }

    @Override
    public void update() {


        Platform.runLater(()->{
            if(LifeGame.lifeGame == 0){
                controller.t_level1.setVisible(true);
                controller.t_level1.setText("Você perdeu");
                gameLoop.stop();
            }

            checkAnswer();
        });
    }

    @Override
    public void render() {
        Platform.runLater(()->{
            moveEnime();
            buttonPressed();
            personSelect();
        });
    }



    private void buttonPressed(){
        if(controller.b_sub.isPressed()){
            if(buttonPressed == 0){
                buttonPressed = 1;
            }
        }
        if(controller.b_add.isPressed()){
            if(buttonPressed == 0){
                buttonPressed = 2;
            }
        }
        if(controller.b_mult.isPressed()){
            if(buttonPressed == 0){
                buttonPressed = 3;
            }
        }
        if(controller.b_div.isPressed()){
            if(buttonPressed == 0){
                buttonPressed = 4;
            }
        }
    }

    private void personSelect(){
        if(controller.b_char1.isPressed()){

            if(valueSelected[0] == 0){
                valueSelected[0] = Double.parseDouble(controller.b_char1.getText());
            }else if(valueSelected[1]== 0){
                valueSelected[1] = Double.parseDouble(controller.b_char1.getText());
            }

/*
            if(!buttonPressed[1]){
                buttonPressed[1] = true;
            }else{
                buttonPressed[1] = false;
            }*/
        }
        if(controller.b_char2.isPressed()){

            if(valueSelected[0] == 0){
                valueSelected[0] = Double.parseDouble(controller.b_char2.getText());
            }else if(valueSelected[1]== 0){
                valueSelected[1] = Double.parseDouble(controller.b_char2.getText());
            }

/*
            if(!buttonPressed[2]){
                buttonPressed[2] = true;
            }else{
                buttonPressed[2] = false;
            }
  */
        }

        if(controller.b_char3.isPressed()){


            if(valueSelected[0] == 0){
                valueSelected[0] = Double.parseDouble(controller.b_char3.getText());
            }else if(valueSelected[1]== 0){
                valueSelected[1] = Double.parseDouble(controller.b_char3.getText());
            }
            /*
            if(!buttonPressed[3]){
                buttonPressed[3] = true;
            }else{
                buttonPressed[3] = false;
            }

             */
        }
        if(controller.b_char4.isPressed()){


            if(valueSelected[0] == 0){
                valueSelected[0] = Double.parseDouble(controller.b_char4.getText());
            }else if(valueSelected[1]== 0){
                valueSelected[1] = Double.parseDouble(controller.b_char4.getText());
            }

            /*
            if(!buttonPressed[4]){
                buttonPressed[4] = true;
            }else{
                buttonPressed[4] = false;
            }

             */
        }
    }


    boolean sentinel = true;
    private void moveEnime() {
        double inimiY = controller.iv_enemy1.getY();

        if (sentinel) {

            if (inimiY >= 50) {
                sentinel = false;
            }
            if (inimiY <= 50 || inimiY >= -200) {
                controller.iv_enemy1.setY(inimiY + 8);
            }

        }
        if(sentinel==false) {

            if (inimiY <= -200) {
                sentinel = true;
            }

            if (inimiY <= 50 || inimiY >= -200) {
                controller.iv_enemy1.setY(inimiY - 8);
            }

        }
    }


    public void checkAnswer(){
        if(valueSelected[0] != 0 && valueSelected[1] !=0 && buttonPressed != 0) {
            switch (buttonPressed) {
                case 1:
                       respostPerson =  valueSelected[0] + valueSelected[1];
                    break;
                case 2:
                    respostPerson =  valueSelected[0] - valueSelected[1];
                    break;
                case 3:
                    respostPerson =  valueSelected[0] * valueSelected[1];
                    break;
                case 4:
                    respostPerson =  valueSelected[0] / valueSelected[1];
                    break;
            }

            if(respostPerson != valueEnime){
                LifeGame.lifeGame--;
                respostPerson = 0;
                valueSelected[0] = 0;
                valueSelected[1] = 0;
                buttonPressed = 0;
            }
        }
    }

}