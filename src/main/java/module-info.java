module cacttus.education.cacttuscalculator2022javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens cacttus.education.cacttuscalculator2022javafx to javafx.fxml;
    exports cacttus.education.cacttuscalculator2022javafx;
}