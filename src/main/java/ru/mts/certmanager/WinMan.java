package ru.mts.certmanager;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class WinMan {
    private static WinMan instance;
    private Stage primaryStage;
    private WinMan () {}

    public static WinMan getInstance() {
        if (instance == null) {
            instance = new WinMan();
        }
        return instance;
    }
    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }
    public void switchScene(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            if (primaryStage != null) {
                primaryStage.close();
            }
            assert primaryStage != null;
            double prevX = primaryStage.getX();
            double prevY = primaryStage.getY();
            primaryStage.setScene(scene);
            primaryStage.setX(prevX);
            primaryStage.setY(prevY);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


