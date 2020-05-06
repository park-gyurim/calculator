package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SaleController implements Initializable {
	@FXML	TextField	price;
	@FXML	TextField	sale_percent;
	@FXML	TextField	saled_price;
	@FXML	TextField	total_price;
	@FXML	Button compute;
	@FXML	Button reset;
	
	@FXML
	public void computeBtn(ActionEvent actionEvent) {
		double M3 = Integer.parseInt(sale_percent.getText()) * 0.01; // M3는 %를 소수점으로 변환한 값이다 즉 20%를 0.2로 변환한다
		double yourmoney = Integer.parseInt(price.getText()) * M3; // 할인되는 가격
		double actually = Integer.parseInt(price.getText()) - yourmoney; // 실제 가격
		saled_price.setText(String.valueOf((int) yourmoney) + "원");
		total_price.setText(String.valueOf((int) actually)+ "원");
	}
	@FXML
	public void resetBtn(ActionEvent actionEvent) {
		price.clear();
		sale_percent.clear();
		saled_price.clear();
		total_price.clear();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
