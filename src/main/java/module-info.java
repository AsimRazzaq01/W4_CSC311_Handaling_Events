module org.example.w4_csc311_handaling_events {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.w4_csc311_handaling_events to javafx.fxml;
    exports org.example.w4_csc311_handaling_events;
}