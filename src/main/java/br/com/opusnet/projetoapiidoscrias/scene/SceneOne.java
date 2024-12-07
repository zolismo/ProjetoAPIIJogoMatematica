package br.com.opusnet.projetoapiidoscrias.scene;

import br.com.opusnet.projetoapiidoscrias.controlls.GameLoop;
import br.com.opusnet.projetoapiidoscrias.controlls.screencontrol.SceneOneController;
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

public class SceneOne extends Scene  implements Updatable, ScreemInterface {

    private GameLoop gameLoop;
    private SceneOneController controller;
    private Stage stage;


    boolean[] buttonPressed = {false,false,false,false};


    public SceneOne(Parent root, Stage stage, SceneOneController controller) {
        super(root);
        this.controller = controller;



        this.stage = stage;
        gameLoop = new GameLoop(this);
        new Thread(gameLoop).start();
    }

    @Override
    public void update() {
        Platform.runLater(()->{
            if(controller == null)
                System.out.println("bigur3eba rfibobqoqfewdq");

                 buttonSelect();
                 controllPressed();


            System.out.println("Hello, everone");
        });
    }

    @Override
    public void render() {
        Platform.runLater(()->{

            moveEnime();

        });
    }



    private void controllPressed(){
        if(controller.b_sub.isPressed()){

        }
        if(controller.b_add.isPressed()){

        }
        if(controller.b_mult.isPressed()){

        }
        if(controller.b_div.isPressed()){

        }
    }

    private void buttonSelect(){
        if(controller.b_char1.isPressed()){
            if(!buttonPressed[1]){
                buttonPressed[1] = true;
            }else{
                buttonPressed[1] = false;
            }
        }
        if(controller.b_char2.isPressed()){
            if(!buttonPressed[2]){
                buttonPressed[2] = true;
            }else{
                buttonPressed[2] = false;
            }
        }
        if(controller.b_char3.isPressed()){
            if(!buttonPressed[3]){
                buttonPressed[3] = true;
            }else{
                buttonPressed[3] = false;
            }
        }
        if(controller.b_char4.isPressed()){
            if(!buttonPressed[4]){
                buttonPressed[4] = true;
            }else{
                buttonPressed[4] = false;
            }
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
}