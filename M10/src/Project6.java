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
	private RadioButton  color1,color2,color3,on,off;
	private Circle circle;
	private boolean lineDrawn;
	private Button clear;
	private Group group;
	private Color color;
	private ToggleGroup action,pen;
	public void start(Stage primaryStage)
	{//start
		pane = new Pane();
		
		//mouse mvt
		pane.setOnMouseClicked(this::handleMouseClicks);
		pane.setOnMouseMoved(this::handleMouseMvt);
		
		group= new Group();
		action = new ToggleGroup();
		//drawing or not
		pen=new ToggleGroup();
		
		on=new RadioButton("ON");
		on.setToggleGroup(pen);
		
		off = new RadioButton ("OFF");
		off.setToggleGroup(pen);
		off.setSelected(true);
		
		//colors/clear
		color1= new RadioButton("Color 1");
		color1.setOnAction(this::handleDrawing);
		color1.setToggleGroup(action);
		
		color2= new RadioButton("Color 2");
		color2.setOnAction(this::handleDrawing);
		color2.setToggleGroup(action);
		
		color3= new RadioButton("Color 3");
		color3.setOnAction(this::handleDrawing);
		color3.setToggleGroup(action);
		
		clear=new Button("CLEAR");
		clear.setOnAction(this::handleClear);
		
		//everything
		HBox tools =new HBox(color1,color2,color3,on,off,clear);
		tools.setSpacing(10);
		pane.getChildren().addAll(tools);
		pane.getChildren().add(group);
		
		//display everything
		Scene scene = new Scene(pane,700,700,Color.BLACK);
		primaryStage.setTitle("Project 6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}//end
	
	//mouse mvt
	private void handleMouseClicks(MouseEvent mouse)
	{//start
		if (!lineDrawn)
		{
			lineDrawn = true;
			on.setSelected(true);
			double x = mouse.getX();
			double y = mouse.getY();
			
		}
		else
		{
			lineDrawn = false;
			off.setSelected(true);
		}
	}//end
	private void handleMouseMvt(MouseEvent event)
	{//start
		if(lineDrawn)
		{
			double x=event.getX();
			double y=event.getY();
			circle = new Circle(x,y,5,color);
			pane.getChildren().add(circle);
			group.getChildren().add(circle);
		}
		
	}//end
	
	//colors
	private void handleDrawing(ActionEvent event)
	{
		if(color1.isSelected())
		{
			color = Color.BLUE;

		}
		else if(color2.isSelected())
		{
			color = Color.GREEN;
		}
		else if(color3.isSelected())
		{
			color = Color.RED;
		}
	}
	//clear
	private void handleClear (ActionEvent event)
	{
		group.getChildren().clear();
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
