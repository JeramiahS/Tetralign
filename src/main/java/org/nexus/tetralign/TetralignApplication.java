package org.nexus.tetralign;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TetralignApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tetralign-launch-screen-placeholder.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Tetralign");
        stage.setScene(scene);
        stage.show();
    }
}
