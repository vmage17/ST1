package w65479.st1_lab1_zad1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CalculatorController {

    @FXML
    private TextField textFieldOutput;

    @FXML
    private TextField textField_a;

    @FXML
    private TextField textField_b;

    private String operation = "";

    @FXML
    void compute(ActionEvent event) throws IOException {
        try {
            double a = Integer.parseInt(textField_a.getText());
            double b = Integer.parseInt(textField_b.getText());
            String output = "";
            switch(operation) {
                case "+" -> output = a + " + " + b + " = " + (a + b);
                case "-" -> output = a + " - " + b + " = " + (a - b);
                case "*" -> output = a + " * " + b + " = " + a * b;
                case "/" -> output = a + " / " + b + " = " + a / b;
                default -> output = "Nie wybrano działania";
            }
            textFieldOutput.setText(output);
        } catch (Exception e) {
            textFieldOutput.setText("Błędne dane");
        }
    }

    @FXML
    void add(ActionEvent event) {
        operation = "+";
    }

    @FXML
    void divide(ActionEvent event) {
        operation = "/";
    }

    @FXML
    void multiply(ActionEvent event) {
        operation = "*";
    }

    @FXML
    void subtract(ActionEvent event) {
        operation = "-";
    }

}