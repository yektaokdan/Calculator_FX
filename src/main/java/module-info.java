module com.example.koduygulamalari {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.koduygulamalari to javafx.fxml;
    exports com.example.koduygulamalari;
}