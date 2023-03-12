package w65479.st1_lab1_zad2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class StringController {

    @FXML
    private Label outputLabel;

    @FXML
    private TextField textField;

    @FXML
    void check(ActionEvent event) {
        int characters = textField.getText().length();
        int words = textField.getText().split(" ").length;
        outputLabel.setText("Liczba znaków to: " + characters + ", a liczba słów to: " + words);
    }
}