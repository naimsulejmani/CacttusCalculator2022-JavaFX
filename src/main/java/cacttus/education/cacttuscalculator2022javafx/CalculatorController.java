package cacttus.education.cacttuscalculator2022javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.DoubleBinaryOperator;

public class CalculatorController implements Initializable {
    @FXML
    private TextField txtResult;

    @FXML
    private Button btnClear;

    private double result = 0;
    private String lastOperator = "";
    private String operator = "";

    @FXML
    public void thirremPlease() {
        System.out.println("Pse spe qel telefonin!");
        txtResult.setText("Mos um shkruj mo leter!");
    }

    public void btnNumberClick(ActionEvent actionEvent) {
        if (!operator.isEmpty()) {
            txtResult.setText("0");
            operator = "";
        }
        //System.out.println(actionEvent.getTarget());
        Button btn = (Button) actionEvent.getTarget();
        System.out.println(btn.getText());
        if (txtResult.getText().equals("0"))
            txtResult.setText(btn.getText());
        else
            txtResult.setText(txtResult.getText() + btn.getText());

    }

    public void dotClick(ActionEvent actionEvent) {
        if (!txtResult.getText().contains("."))
            txtResult.setText(txtResult.getText() + ".");
    }

    private void resetForm() {
        txtResult.setText("0");
        lastOperator = operator = "";
        result = 0;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(" U THIRR");
        // me class anonime
//        btnClear.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                resetForm();
//            }
//        });

        //me lambda expression
        btnClear.setOnAction(actionEvent -> resetForm());

        //menyra e trete me Method referencing
        // btnClear.setOnAction(CalculatorController::btnNumberClick);


    }

    public void onOperandClick(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getTarget();

        double vlera = Double.parseDouble(txtResult.getText());

        operator = btn.getText();
        switch (lastOperator) {
            case "+" -> {
                result += vlera;
            }
            case "-" -> {
                result -= vlera;
            }
            case "x" -> {
                result *= vlera;
            }
            case "/" -> {
                if (vlera != 0) {
                    result /= vlera;
                } else {
                    result = result >= 0 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
                }
            }
            default -> {
                result = vlera;
            }
        }
        txtResult.setText(String.valueOf(result));
        lastOperator = operator;
    }
}












