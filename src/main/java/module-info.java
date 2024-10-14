module org.example.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.studentmanager to javafx.fxml;
    exports org.example.studentmanager;
}