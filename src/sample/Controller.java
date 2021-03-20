package sample;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    private TextField nameField;

    @FXML
    public void onButtonClicked(ActionEvent e) {
        System.out.println("Hello, " + nameField.getText());
        System.out.println("The following button was pressed:" + e.getSource());
    }
}
