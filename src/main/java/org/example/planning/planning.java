package org.example.planning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.PrintWriter;
import java.io.StringWriter;

public class planning extends Application {
    @Override
    public void start(Stage stage) {
        try {
            // Tentative de chargement du fichier FXML
            FXMLLoader fxmlLoader = new FXMLLoader(planning.class.getResource("hello-view.fxml"));

            // On crée la scène (les dimensions seront adaptées par Android)
            Scene scene = new Scene(fxmlLoader.load(), 250, 500);

            stage.setTitle("Mon Planning");
            stage.setScene(scene);
            stage.show();

        } catch (Throwable e) {
            // SI ÇA PLANTE : On affiche l'erreur exacte en rouge sur le téléphone
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));

            Label errorLabel = new Label("ERREUR FXML :\n" + sw.toString());
            errorLabel.setWrapText(true);
            errorLabel.setStyle("-fx-text-fill: red; -fx-font-weight: bold; -fx-padding: 10;");

            ScrollPane scroll = new ScrollPane(errorLabel);
            Scene errorScene = new Scene(scroll, 250, 500);
            stage.setScene(errorScene);
            stage.show();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}