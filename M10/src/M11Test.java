import java.util.*;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class M11Test extends Application
{//class
	
	public void start(Stage primStage)
	{
		TextInputDialog input = new TextInputDialog();
		input.setHeaderText("g to oz");
		input.setTitle("Weight Converter");
		input.setContentText("Enter grams");
		
		Optional<String> userInput=input.showAndWait();
		if(userInput.isPresent())
		{
			String userNumb =userInput.get();
			int gram = Integer.parseInt(userNumb);
			double oz=gram*0.035274;
			Alert resultAlert = new Alert(AlertType.INFORMATION);
			resultAlert.setTitle("Results");
			resultAlert.setHeaderText(null);
			resultAlert.setContentText(gram+" grams is also "+oz+" ounces");
			resultAlert.showAndWait();
		}
		else
		{
			System.out.println("no");
		}
		/*
		VBox pane = new VBox();
		
		Scene scene = new Scene(pane,400,400,Color.TRANSPARENT);
		primStage.setScene(scene);
		primStage.show();
		*/
	}
	/*
	public void handlePurchaseButton(ActionEvent event)
	{
		if(regularShippingSpeedRadioButton.isSelected())
		{//start if for regular
			if(item1Checkbox.isSelected())
			{
				summaryTextField=new Text("You purchaced these items at regular shipping: "+item1Checkbox);
			}
			else if(item1Checkbox.isSelected()&&item2Checkbox.isSelected())
			{
				summaryTextField=new Text("You purchaced these items at regular shipping: "+item1Checkbox+" "+item2Checkbox);

			}
			else if(item1Checkbox.isSelected()&&item2Checkbox.isSelected()&&item3Checkbox.isSelected())
			{
				summaryTextField=new Text("You purchaced these items at regular shipping: "+item1Checkbox+" "+item2Checkbox+" "+item3Checkbox);

			}
			else
			{
				summaryTextField=new Text("You purchaced nothing at regular shipping: ");
			}
		}//end if for regular
		else if(fastShippingSpeedRadioButton.isSelected())
		{//start if for fast
			if(item1Checkbox.isSelected())
			{
				summaryTextField=new Text("You purchaced these items at fast shipping: "+item1Checkbox);
			}
			else if(item1Checkbox.isSelected()&&item2Checkbox.isSelected())
			{
				summaryTextField=new Text("You purchaced these items at fast shipping: "+item1Checkbox+" "+item2Checkbox);

			}
			else if(item1Checkbox.isSelected()&&item2Checkbox.isSelected()&&item3Checkbox.isSelected())
			{
				summaryTextField=new Text("You purchaced these items at fast shipping: "+item1Checkbox+" "+item2Checkbox+" "+item3Checkbox);

			}
			else
			{
				summaryTextField=new Text("You purchaced nothing at fast shipping: ");
			}
		}//end regular for fast
	}
	*/
	public static void main(String[] args) {
		launch(args);

	}
}//class
