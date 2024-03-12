package ru.mts.certmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        WinMan.getInstance().setPrimaryStage(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(CheckApplication.class.getResource("check.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Тестовое приложение");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}