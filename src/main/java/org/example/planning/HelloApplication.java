package org.example.planning;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        // On crée un texte géant directement en Java, sans utiliser le FXML
        Label label = new Label("VICTOIRE !\nL'ÉCRAN N'EST PLUS NOIR !");
        label.setStyle("-fx-font-size: 24px; -fx-text-fill: white; -fx-font-weight: bold; -fx-text-alignment: center;");

        // On met un fond bleu pour être sûr que ça charge
        StackPane root = new StackPane(label);
        root.setStyle("-fx-background-color: blue;");

        Scene scene = new Scene(root, 400, 400); // Ces dimensions seront ignorées par Android !

        stage.setTitle("Test Android");
        stage.setScene(scene);
        stage.show();
    }
}