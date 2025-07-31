module dk.easv.librarysystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires MaterialFX;
    requires com.microsoft.sqlserver.jdbc;
    requires java.sql;


    opens dk.easv.librarysystem to javafx.fxml;
    exports dk.easv.librarysystem;
    exports dk.easv.librarysystem.GUI;
    opens dk.easv.librarysystem.GUI to javafx.fxml;
}