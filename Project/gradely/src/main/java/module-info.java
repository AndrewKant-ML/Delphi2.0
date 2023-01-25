module it.uniroma2.dicii.ispw.gradely {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.uniroma2.dicii.ispw.gradely to javafx.fxml;
    exports it.uniroma2.dicii.ispw.gradely;
}