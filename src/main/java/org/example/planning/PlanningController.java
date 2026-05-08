package org.example.planning;


import com.gluonhq.attach.storage.StorageService;
import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class PlanningController {
    private static final String FILE_NAME = "sauvegarde.json";
    private Gson gson = new Gson();
    private DonneesPlanning data;

    @FXML
    TextArea textArea;


    @FXML
    private void initialize(){
        data = new DonneesPlanning(textArea.getText());


        chargerJson();
    }

    @FXML
    private void sauvegarderJson() {
        StorageService.create().flatMap(StorageService::getPrivateStorage).ifPresent(dossier -> {
            try {
                File fichier = new File(dossier, FILE_NAME);

                data.setData(textArea.getText());

                String texteJson = gson.toJson(data);

                Files.writeString(fichier.toPath(), texteJson);

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }


    @FXML
    private void chargerJson() {
        StorageService.create().flatMap(StorageService::getPrivateStorage).ifPresent(dossier -> {
            File fichier = new File(dossier, FILE_NAME);
            if (fichier.exists()) {
                try {
                    String texteJson = Files.readString(fichier.toPath());

                    data = gson.fromJson(texteJson, DonneesPlanning.class);

                    if (data != null && data.getContenuTexte() != null) {
                        textArea.setText(data.getContenuTexte());
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}