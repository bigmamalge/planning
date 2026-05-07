module org.example.planning {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.planning to javafx.fxml;
    exports org.example.planning;
}