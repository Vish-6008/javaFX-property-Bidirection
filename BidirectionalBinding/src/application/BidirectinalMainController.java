/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Below code initializing the value for the scene-builder operation purpose.
 *   Project:  BidirectinalMainController.
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437
 * ********************************************************************************************/



package application;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class BidirectinalMainController  implements Initializable{
	@FXML
	Slider slider;
	
	@FXML
	TextField field;
	
	private static final double INIT_VALUE = 50;
	

	@Override
	public void initialize(URL Location, ResourceBundle resources) {
	slider.setValue(INIT_VALUE);
	field.setText(new Double(INIT_VALUE).toString());
	field.textProperty().bindBidirectional(slider.valueProperty(),NumberFormat.getNumberInstance());
		// TODO Auto-generated method stub
		
	}

}
