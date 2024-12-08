package org.aqjs1.tbi;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    final private String VERSION_NUMBER = "v0.0.1";
    final private String TITLE = "TBI";

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image logo = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/logo.png")));
        primaryStage.setTitle(TITLE+" "+VERSION_NUMBER);
        primaryStage.getIcons().add(logo);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}


