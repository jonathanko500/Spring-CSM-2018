import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class Project6 extends Application{
	
	private CheckBox drawing;
	private Pane pane,newPane;
	private RadioButton  color1,color2,color3;;
	private Circle circle;
	private boolean lineDrawn;
	private Button clear;
	
	public void start(Stage primaryStage)
	{//start
		pane = new Pane();
		
		//mouse mvt
		pane.setOnMouseClicked(this::handleMouseClick);
		pane.setOnMouseMoved(this::handleMouseMvt);
		
		//clear
		clear=new Button("Clear GUI");
		clear.setOnAction(this::handleClear);
		clear.setAlignment(Pos.BOTTOM_CENTER);
		pane.getChildren().add(clear);
		
		
		//radiobutton
		ToggleGroup group = new ToggleGroup();
		//color1
		color1=new RadioButton("Color 1");
		color1.setToggleGroup(group);
		color1.setOnAction(this::handleRadioButton);
		//color2
		color2=new RadioButton("Color 2");
		color2.setToggleGroup(group);
		color2.setOnAction(this::handleRadioButton);
		//color3
		color3=new RadioButton("Color 3");
		color3.setToggleGroup(group);
		color3.setOnAction(this::handleRadioButton);
		//HBOX
		HBox box = new HBox(color1,color2,color3);
		pane.getChildren().add(box);
		
		//display everything
		Scene scene = new Scene(pane,700,700);
		primaryStage.setTitle("Project 6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}//end
	
	//mouse movement
 	private void handleMouseClick(MouseEvent event)
	{//start
		if(!lineDrawn)//lineDrawn is false nothing is being drawn
		{
			lineDrawn=true;
			double x=event.getX();
			double y=event.getY();
			
		}
		else//lineDrawn is true something is being drawn
		{
			lineDrawn=false;
		}
	}//end
	private void handleMouseMvt(MouseEvent event)
	{//start
		if(lineDrawn)
		{
			double x=event.getX();
			double y=event.getY();
			circle = new Circle(x,y,5);
			pane.getChildren().add(circle);
		}
		
	}//end
	//radio buttons
	private void handleRadioButton(ActionEvent event)
	{//start
		if(color1.isSelected())
		{
			circle = new Circle(5,Color.RED);
			pane.getChildren().add(circle);
		}
		else if(color2.isSelected())
		{
			circle = new Circle(5,Color.BLUE);
			pane.getChildren().add(circle);
		}
		else if(color3.isSelected())
		{
			circle = new Circle(5,Color.GREEN);
			pane.getChildren().add(circle);
		}
	}//end
	//clear
	private void handleClear (ActionEvent button)
	{
		pane.getChildren().clear();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
