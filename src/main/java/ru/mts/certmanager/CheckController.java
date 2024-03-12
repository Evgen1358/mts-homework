package ru.mts.certmanager;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class CheckController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText(LocalDateTime.now().toString());
        //welcomeText.setText(Thread.currentThread().toString());
        WinMan.getInstance().switchScene("hmwork.fxml");
    }
}