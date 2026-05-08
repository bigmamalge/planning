package org.example.planning;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    TextArea textArea;


    @FXML
    private void initialize(){
        textArea.setText("Hello World!");
    }
}