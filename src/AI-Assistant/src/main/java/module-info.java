module com.example.aiassistant {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aiassistant to javafx.fxml;
    exports com.example.aiassistant;
}