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
	
	private Pane pane;
	private RadioButton  color1,color2,color3,draw,erase;
	private Circle circle;
	private boolean lineDrawn;
	private Button clear;
	private Group group;
	
	public void start(Stage primaryStage)
	{//start
		pane = new Pane();
		
		//mouse mvt
		pane.setOnMouseClicked(this::handleMouseClick);
		pane.setOnMouseMoved(this::handleMouseMvt);
		group= new Group();
		
		//erase,draw,clear
		ToggleGroup action = new ToggleGroup();
		draw=new RadioButton("DRAW");
		draw.setToggleGroup(action);
		//draw.setSelected(true);
		draw.setOnAction(this::handleDrawing);
		
		erase=new RadioButton("ERASE");
		erase.setToggleGroup(action);
		
		clear=new Button("CLEAR");
		clear.setOnAction(this::handleClear);
		
		HBox tools =new HBox(draw,erase,clear);
		pane.getChildren().add(tools);
		pane.getChildren().add(group);
		/*
		//colors
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
		*/
		//display everything
		Scene scene = new Scene(pane,700,700);
		primaryStage.setTitle("Project 6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}//end
	
	//draw/clear
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
			group.getChildren().add(circle);
		}
		
	}//end
	private void handleDrawing(ActionEvent event)
	{
		if(draw.isSelected())
		{
			lineDrawn=true;
		}
		else
		{
			
		}
	}
	private void handleClear (ActionEvent event)
	{
		group.getChildren().clear();
	}
	//colors
	private void handleColorButton(ActionEvent event)
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
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
