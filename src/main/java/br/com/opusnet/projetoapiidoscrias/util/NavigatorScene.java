package br.com.opusnet.projetoapiidoscrias.util;

import br.com.opusnet.projetoapiidoscrias.controlls.screencontrol.HomeSceneControl;
import br.com.opusnet.projetoapiidoscrias.model.Controll;
import br.com.opusnet.projetoapiidoscrias.model.ScreemInterface;
import br.com.opusnet.projetoapiidoscrias.scene.HomeScene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

public class NavigatorScene {
    public static void navigatorScene(Stage stage, Class<? extends ScreemInterface> screemInterface, String screenName){

        try {

            URL url = new File("src/main/resources/br/com/opusnet/projetoapiidoscrias/"+screenName).toURI().toURL();


            /*
            FXMLLoader fxmlLoader = new FXMLLoader(NavigatorScene.class.getResource(ScreenName));
            Parent root = FXMLLoader.load(url);
            Controll controll = FXMLLoader;
            */

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(url);
            Controll controll = fxmlLoader.getController();

            ScreemInterface instance = screemInterface.getDeclaredConstructor(Parent.class,Stage.class,Controll.class).newInstance(fxmlLoader.load(), stage, controll);

        } catch (InstantiationException | InvocationTargetException |IllegalAccessException|NoSuchMethodException|IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
