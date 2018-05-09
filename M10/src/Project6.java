import javafx.application.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class Project6 extends Application{
	
	private Pane pane;
	private Line line;
	private boolean lineDrawn;
	
	public void start(Stage primaryStage)
	{//start
		pane = new Pane();
		pane.setOnMouseClicked(this::handleMouseClick);
		pane.setOnMouseMoved(this::handleMouseMvt);
		//make line
		line = new Line(0,0,0,0);
		line.setStrokeWidth(7);
		pane.getChildren().add(line);
		//display everything
		Scene scene = new Scene(pane,700,700,Color.RED);
		primaryStage.setTitle("Project 6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}//end
	
	private void handleMouseClick(MouseEvent event)
	{//start
		if(!lineDrawn)//lineDrawn is false nothing is being drawn
		{
			lineDrawn=true;
			double x=event.getX();
			double y=event.getY();
			
			line.setStartX(x);
			line.setStartY(y);
			line.setEndX(x);
			line.setEndY(y);
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
			Circle circle = new Circle(x,y,5,Color.BLUE);
			pane.getChildren().add(circle);
		}
		
	}//end
	public static void main(String[] args) {
		launch(args);
	}
}
