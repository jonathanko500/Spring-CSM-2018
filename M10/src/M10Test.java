
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

 
public class M10Test extends Application {
	
	private Button plusButton,minusButton;
	private Text resultText;
	private TextField inputNumber1TextField, inputNumber2TextField,inputTextField,outputTextField;

	public void start(Stage primaryStage) 
	{
		
		Pane pane = new FlowPane();
		
		//button
		plusButton=new Button("+(add)");
		minusButton=new Button("-(minus)");
		pane.getChildren().add(plusButton);
		pane.getChildren().add(minusButton);
		
		//text field
		
		//display everything
		Scene scene = new Scene(pane,200,200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("M10Test");
		primaryStage.show();
		
	}
	private void handleBothButtons(ActionEvent event)
	{
		int x,y,z=0;
		x=Integer.parseInt(inputNumber1TextField.getText());
		y=Integer.parseInt(inputNumber2TextField.getText());
		if(event.getSource()==plusButton)
		{
			z=x+y;
		}else if(event.getSource()==minusButton)
		{
			z=x-y;
		}
		resultText.setText(Integer.toString(z));
	}
	private void handleAction(ActionEvent event)
	{
		String user=inputTextField.getText();
		inputTextField.clear();
		outputTextField.setText(user);
	}
	public static void main(String[] args) {
        launch(args);
    }
}