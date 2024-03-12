package ru.mts.certmanager;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import ru.mts.certmanager.HW.CreateAnimalService;
import java.util.regex.*;
import java.lang.System;

public class HWController {
    @FXML
    private Label HWText;
    @FXML
    private Label HWText2;
    @FXML
    private ChoiceBox choice;

    String[] ch = {"1. Работа с классами, создание животных","2. Классы + Тесты Junit","3. Другая домашка, неизв."};
    ObservableList<String> lists = FXCollections.observableArrayList(ch);
    @FXML
    protected void onMouseMoved() {
        choice.setItems(lists);
        choice.setOnAction(event -> HWText.setText(choice.getValue().toString()));
    }
    @FXML
    protected void onHWButtonClick() {
        if (choice.getValue() == null) {
            HWText.setText("Нужно сделать выбор");
        } else {
            if (choice.getValue().toString().matches("1(.*)")) {
                WinMan.getInstance().switchScene("hw1.fxml");
            } else HWText.setText("ДЗ еще не готово..");
                //HWText.setText(Thread.currentThread().toString());
        }
    }
    @FXML
    protected void onHW1ButtonClick() {
        CreateAnimalService createAnimalService = new CreateAnimalService();
        HWText2.setText(createAnimalService.create10Animals());
    }
    @FXML
    protected void onHW1BackButtonClick() {
        WinMan.getInstance().switchScene("hmwork.fxml");
    }
    @FXML
    protected void onHW1ExitButtonClick() {
        System.exit(0);
    }
}