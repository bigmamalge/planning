module org.example.planning {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.gluonhq.attach.display;
    requires com.gluonhq.attach.lifecycle;
    requires com.gluonhq.attach.statusbar;
    requires com.gluonhq.attach.storage;
    requires com.gluonhq.attach.util;

    requires com.google.gson;

    opens org.example.planning to javafx.fxml, com.google.gson;
    exports org.example.planning;
}