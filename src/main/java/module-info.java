module org.example.planning {
    requires javafx.controls;
    requires javafx.fxml;

    // Autorisations pour la création de l'APK
    requires com.gluonhq.attach.display;
    requires com.gluonhq.attach.lifecycle;
    requires com.gluonhq.attach.statusbar;
    requires com.gluonhq.attach.storage;
    requires com.gluonhq.attach.util;

    opens org.example.planning to javafx.fxml;
    exports org.example.planning;
}