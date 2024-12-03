module br.com.opusnet.projetoapiidoscrias {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens br.com.opusnet.projetoapiidoscrias to javafx.fxml;
    exports br.com.opusnet.projetoapiidoscrias;
    exports br.com.opusnet.projetoapiidoscrias.scene;
    opens br.com.opusnet.projetoapiidoscrias.scene to javafx.fxml;
    exports br.com.opusnet.projetoapiidoscrias.controlls;
    opens br.com.opusnet.projetoapiidoscrias.controlls to javafx.fxml;
    exports br.com.opusnet.projetoapiidoscrias.controlls.screencontrol;
    opens br.com.opusnet.projetoapiidoscrias.controlls.screencontrol to javafx.fxml;
}