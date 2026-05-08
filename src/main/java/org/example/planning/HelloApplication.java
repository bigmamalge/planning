package org.example.planning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.PrintWriter;
import java.io.StringWriter;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            // On essaie de charger ton interface
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 300, 600);
            stage.setTitle("Application");
            stage.setScene(scene);
            stage.show();
        } catch (Throwable e) {
            // SI ÇA PLANTE : ON AFFICHE L'ERREUR DIRECTEMENT SUR LE TÉLÉPHONE
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));

            Label errorLabel = new Label("CRASH DÉTECTÉ :\n" + sw.toString());
            errorLabel.setWrapText(true);
            errorLabel.setStyle("-fx-text-fill: red; -fx-font-weight: bold; -fx-font-size: 12px;");

            ScrollPane scroll = new ScrollPane(errorLabel);
            Scene errorScene = new Scene(scroll, 300, 600);
            stage.setScene(errorScene);
            stage.show();
        }
    }
}