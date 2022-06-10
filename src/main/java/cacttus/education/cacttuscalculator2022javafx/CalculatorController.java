package cacttus.education.cacttuscalculator2022javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField txtResult;

    @FXML
    public void thirremPlease() {
        System.out.println("Pse spe qel telefonin!");
        txtResult.setText("Mos um shkruj mo leter!");
    }

    public void btnNumberClick(ActionEvent actionEvent) {
        //System.out.println(actionEvent.getTarget());
        Button btn = (Button) actionEvent.getTarget();
        System.out.println(btn.getText());
        txtResult.setText(txtResult.getText() + btn.getText());

    }
}












