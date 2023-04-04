module com.example.fabricmethod {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fabricmethod to javafx.fxml;
    exports com.example.fabricmethod;
}