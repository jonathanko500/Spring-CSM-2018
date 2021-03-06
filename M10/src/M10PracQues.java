import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.*;
public class M10PracQues extends Application
{//start class
	private String num1,num2,num3,num4,num5;
	private RadioButton choice1,choice2,choice3,choice4,choice5;
	private Text option;
	
	public void start(Stage prim)
	{
		VBox primBox= new VBox();
		primBox.setAlignment(Pos.CENTER);
		primBox.setSpacing(70);
		//qutoes
		num1="\"You must pay the penalty\" said by Daffy Duck";
		num2="\"I tawt I taw a puddy tat!\" said by Tweety Bird";
		num3="\"Yosemite Sam's the name.\" said by Yosemite Sam";
		num4="\"What's up Doc\" said by Bugs Bunny";
		num5="\"DUCK SEASON\" said by Daffy Duck";
		//Txt on display
		option=new Text(num1);
		option.setFont(Font.font(50));
		primBox.getChildren().add(option);
		//multiple choice
		ToggleGroup list = new ToggleGroup();
		choice1 = new RadioButton("Quote 1");
		choice1.setToggleGroup(list);
		choice1.setSelected(true);
		choice1.setOnAction(this::handleTxt);
		choice2 = new RadioButton("Quote 2");
		choice2.setToggleGroup(list);
		choice2.setOnAction(this::handleTxt);
		choice3 = new RadioButton("Quote 3");
		choice3.setToggleGroup(list);
		choice3.setSelected(true);
		choice3.setOnAction(this::handleTxt);
		choice4 = new RadioButton("Quote 4");
		choice4.setToggleGroup(list);
		choice4.setSelected(true);
		choice4.setOnAction(this::handleTxt);
		choice5 = new RadioButton("Quote 5");
		choice5.setToggleGroup(list);
		choice5.setSelected(true);
		choice5.setOnAction(this::handleTxt);
		HBox radioButtonBox = new HBox(choice1,choice2,choice3,choice4,choice5);
		radioButtonBox.setAlignment(Pos.CENTER);
		radioButtonBox.setSpacing(20);
		primBox.getChildren().add(radioButtonBox);
		//pic
		Image pic = new Image("dog1.jpg",300,300,true,true);
		ImageView picView = new ImageView(pic);
		primBox.getChildren().add(picView);
		//display background
		Scene scene = new Scene(primBox,750,750,Color.WHITE);
		prim.setTitle("GUI Image");
		prim.setScene(scene);
		prim.show();
	}
	private void handleTxt(ActionEvent event)
	{
		if(choice1.isSelected())
		{
			option.setText(num1);
		}
		else if(choice2.isSelected())
		{
			option.setText(num2);
		}
		else if(choice3.isSelected())
		{
			option.setText(num3);
		}
		else if(choice4.isSelected())
		{
			option.setText(num4);
		}
		else if(choice5.isSelected())
		{
			option.setText(num5);
		}
	}
	
	public static void main(String[] args)
	{
		

	}

}//end class
