package sample;

import javafx.fxml.FXML;

import java.awt.*;

public class Controller {
    @FXML
    private TextField nameField;

    @FXML
    public void onButtonClicked() {
        System.out.println("Hello, " + nameField.getText());
    }
}
