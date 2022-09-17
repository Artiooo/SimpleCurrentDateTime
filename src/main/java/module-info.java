module com.example.dateandtime {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dateandtime to javafx.fxml;
    exports com.example.dateandtime;
}