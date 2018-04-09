import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class M10Prac extends Application
{//start class
	private CheckBox check;
	private Text animalTxt;
	private RadioButton pic1,pic2;
	private Image first,second;
	private ImageView animalPicView;
	private String pic1Txt,pic2Txt;
	public void start(Stage primaryStage)
	{
		VBox primaryBox = new VBox();
		
		primaryBox.setAlignment(Pos.CENTER);
		primaryBox.setSpacing(70);
		//pic
		first = new Image("dog1.jpg",400,300,true,true);
		second = new Image("dog2.jpg",400,300,true,true);
		animalPicView = new ImageView(first);
		animalPicView.setRotate(90);
		primaryBox.getChildren().add(animalPicView);
		
		//text
		pic1Txt="LAZY DOG";
		pic2Txt="STILL A LAZY DOG";
		animalTxt = new Text(pic1Txt);
		animalTxt.setFont(Font.font(50));
		primaryBox.getChildren().add(animalTxt);
		
		//check box
		check= new CheckBox("Display text");
		check.setSelected(true);
		check.setOnAction(this::handleTxt);
		primaryBox.getChildren().add(check);
		
		//multiple choices
		ToggleGroup picGroup = new ToggleGroup();//must have to only choose one option
		pic1 = new RadioButton("Pic 1");
		pic1.setToggleGroup(picGroup);
		pic1.setSelected(true);
		pic1.setOnAction(this::handlePic);
		pic2 = new RadioButton("Pic 2");
		pic2.setToggleGroup(picGroup);
		pic2.setOnAction(this::handlePic);
		HBox radioButtonBox = new HBox(pic1,pic2);
		radioButtonBox.setAlignment(Pos.CENTER);
		radioButtonBox.setSpacing(20);
		primaryBox.getChildren().add(radioButtonBox);
		
		//display background
		Scene scene = new Scene(primaryBox,750,750,Color.WHITE);
		primaryStage.setTitle("GUI Image");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	//change between two pic
	private void handlePic(ActionEvent event)
	{
		if(pic1.isSelected())
		{
			animalPicView.setImage(first);
			animalPicView.setRotate(90);
			animalTxt.setText(pic1Txt);
		}
		else if(pic2.isSelected())
		{
			animalPicView.setImage(second);
			animalPicView.setRotate(0);
			animalTxt.setText(pic2Txt);
		}
	}
	//put text on or not
	private void handleTxt(ActionEvent event)
	{
		if(check.isSelected())
		{
			animalTxt.setVisible(true);
		}
		else if(!check.isSelected())
		{
			animalTxt.setVisible(false);
		}
	}
	
	
	public static void main(String[] args)
	{
		launch(args);
	}
}//end class
