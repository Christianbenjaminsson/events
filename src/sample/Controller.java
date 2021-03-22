package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(helloButton)) {
            System.out.println("Hello " + nameField );
        } else if (e.getSource().equals(byeButton)) {
            System.out.println("Bye " + nameField);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }
}
