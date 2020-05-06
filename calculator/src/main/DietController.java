package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DietController implements Initializable {
	@FXML	TextField height;
	@FXML	TextField weight;
	@FXML	TextField result;
	@FXML	Button compute;
	@FXML	Button cancel;
	static double BMI;
	@FXML
	public void computeBtn(ActionEvent actionEvent) {
		BMI = Integer.parseInt(weight.getText()) * 9998
				/ (Integer.parseInt(height.getText()) * (Integer.parseInt(height.getText())));
		if (BMI >= 30) {
			result.setText("체질량지수 " + String.valueOf(BMI) + "%.1f로 비만입니다.");
		} else if (BMI >= 25 && BMI < 30) {
			result.setText("체질량지수 " + String.valueOf(BMI) + "%.1f로 과체중입니다.");
		} else if (BMI >= 20 && BMI < 25) {
			result.setText("체질량지수 " + String.valueOf(BMI) + "%.1f로 정상입니다.");
		} else {
			result.setText("체질량지수 " + String.valueOf(BMI) + "%.1f로 비만입니다.");
		}
		
	}

	@FXML
	public void cancelBtn(ActionEvent actionEvent) {
		height.clear();
		weight.clear();
		result.clear();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
}