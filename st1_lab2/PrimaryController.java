package w65479.st1_lab2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.util.Objects;

public class PrimaryController {

    @FXML
    private ImageView image;

    @FXML
    private Label label;

    @FXML
    void set1(ActionEvent event) {
        label.setText("1");
    }

    @FXML
    void set2(ActionEvent event) {
        label.setText("2");
    }

    @FXML
    void set3(ActionEvent event) {
        label.setText("3");
    }

    @FXML
    void setBlue(ActionEvent event) {
        label.setTextFill(Color.BLUE);
    }

    @FXML
    void setGreen(ActionEvent event) {
        label.setTextFill(Color.GREEN);
    }

    @FXML
    void setRed(ActionEvent event) {
        label.setTextFill(Color.RED);
    }

    @FXML
    void showCalendar(ActionEvent event) {
        image.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("Calendar.jpg"))));
    }

    @FXML
    void showContacts(ActionEvent event) {
        image.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("Contacts.jpg"))));
    }

    @FXML
    void setHome(ActionEvent event) {
        image.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("Home.jpg"))));
    }

    @FXML
    void close(ActionEvent event) {
        Platform.exit();
    }

}
