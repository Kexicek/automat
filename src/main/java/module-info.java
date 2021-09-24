module com.example.automat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.automat to javafx.fxml;
    exports com.example.automat;
}