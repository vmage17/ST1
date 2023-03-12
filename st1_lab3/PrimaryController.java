package w65479.st1_lab3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {
    @FXML
    private TableColumn col_imie;
    @FXML
    private TableColumn col_nazwisko;
    @FXML
    private TableView tabela;

    @FXML
    private TextField imieToAdd;
    @FXML
    private TextField nazwiskoToAdd;

    @FXML public void initialize(){
        col_imie.setCellValueFactory(
                new PropertyValueFactory<>("imie"));
        col_nazwisko.setCellValueFactory(
                new PropertyValueFactory<>("nazwisko"));

        ObservableList<Osoba> list = FXCollections.observableArrayList();
        list.add(new Osoba("Jan", "Nowak"));
        list.add(new Osoba("Janusz", "Kowalski"));

        tabela.getItems().addAll(list);
    }

    @FXML
    void dodaj(ActionEvent event) {
        ObservableList<Osoba> list = FXCollections.observableArrayList();
        list.add(new Osoba(imieToAdd.getText(), nazwiskoToAdd.getText()));
        tabela.getItems().addAll(list);
    }

}