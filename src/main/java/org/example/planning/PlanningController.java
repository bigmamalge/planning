package org.example.planning;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PlanningController {
    @FXML
    TextArea textArea;


    @FXML
    private void initialize(){
        textArea.setText("Hello World!");
    }

    @FXML
    private void btnclick(){
        textArea.setText("salutation");
    }
}