package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SalaryController implements Initializable {
	@FXML	TextField Text_hour;
	@FXML	TextField Text_sal;
	@FXML	TextField Text_month;
	@FXML	RadioButton tax_true;
	@FXML	RadioButton tax_false;
	@FXML	TextField result;
	@FXML	Button computeBtn;
	@FXML	Button resetBtn;

	@FXML
	public void computeBtn(ActionEvent actionEvent) {
		double hour = Double.parseDouble(Text_hour.getText());
		int pay = Integer.parseInt(Text_sal.getText());
		int month = Integer.parseInt(Text_month.getText());
		double tax = 0.033;
		if (tax_true.isSelected()) {
			double total = (pay * hour * month) - (pay * hour * month * tax);
			result.setText(String.valueOf((int) total) + "원");
		}
		if (tax_false.isSelected()) {
			double total = (pay * hour * month);
			result.setText(String.valueOf((int) total) + "원");
		}
	}

	@FXML
	public void resetBtn(ActionEvent actionEvent) {
		Text_hour.clear();
		Text_sal.clear();
		Text_month.clear();
		tax_true.setSelected(false);
		tax_false.setSelected(false);
		result.clear();
	}

	@FXML
	public void taxRadio(ActionEvent actionEvent) {
		if (tax_true.isSelected()) {
			tax_false.setSelected(false);
		}
		if (tax_false.isSelected()) {	
			tax_true.setSelected(false);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
}