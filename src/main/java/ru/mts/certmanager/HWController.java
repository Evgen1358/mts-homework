package ru.mts.certmanager;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class HWController {
    @FXML
    private Label HWText;
    @FXML
    private Label HWText2;
    @FXML
    private ChoiceBox choice;
    String[] ch = {"1","2","3"};
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
            if (choice.getValue().equals("1")) {
                WinMan.getInstance().switchScene("hw1.fxml");
            } else HWText.setText(Thread.currentThread().toString());
        }
    }
    @FXML
    protected void onHW1ButtonClick() {
        HWText2.setText(Thread.currentThread().toString());
    }
}