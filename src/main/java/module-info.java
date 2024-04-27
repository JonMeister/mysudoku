module com.jonathan.mysudoku {
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
    requires annotations;


    opens com.jonathan.mysudoku to javafx.fxml;
    opens com.jonathan.mysudoku.controller to javafx.fxml;
    exports com.jonathan.mysudoku;
}