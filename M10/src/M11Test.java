import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;

public class M11Test extends Application
{//class
	public void start(Stage primStage)
	{
		VBox pane = new VBox();
		
		Circle circle = new Circle(100, 100, 50);

		circle.setFill(Color.GREEN);

		Rectangle rectangle = new Rectangle(70, 70, 225, 75);

		rectangle.setStroke(Color.BLUE);

		rectangle.setStrokeWidth(2);

		rectangle.setFill(Color.TRANSPARENT);

		pane.getChildren().add(circle);

		pane.getChildren().add(rectangle);
		
		Scene scene = new Scene(pane,400,400,Color.TRANSPARENT);
		primStage.setScene(scene);
		primStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}
}//class
