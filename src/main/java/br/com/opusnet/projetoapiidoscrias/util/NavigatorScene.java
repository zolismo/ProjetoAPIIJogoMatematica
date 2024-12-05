package br.com.opusnet.projetoapiidoscrias.util;

import br.com.opusnet.projetoapiidoscrias.controlls.screencontrol.HomeSceneControl;
import br.com.opusnet.projetoapiidoscrias.model.Controll;
import br.com.opusnet.projetoapiidoscrias.model.ScreemInterface;
import br.com.opusnet.projetoapiidoscrias.scene.HomeScene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class NavigatorScene {
    public static void navigatorScene(Stage stage, Class<? extends ScreemInterface> screemInterface, String ScreenName){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(NavigatorScene.class.getResource(ScreenName));
            Parent root = fxmlLoader.load();
            Controll controll = fxmlLoader.getController();

            ScreemInterface instance = screemInterface.getDeclaredConstructor(Parent.class,Stage.class,Controll.class).newInstance(root, stage,controll);

        } catch (InstantiationException | InvocationTargetException |IllegalAccessException|NoSuchMethodException|IOException e) {
            System.out.println(e.getMessage());
        }

    }
}