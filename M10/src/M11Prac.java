import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class M11Prac extends Application
{
	public void start(Stage primaryStage)
	{
		//pane
		VBox box = new VBox();
		box.setAlignment(Pos.CENTER);
		//picture
		Image pic = new Image("dog2.jpg",300,300,true,true);
		ImageView picView = new ImageView(pic);
		box.getChildren().add(picView);
		//text
		Text write = new Text("My lazy and happy dog.");
		write.setFont(Font.font(30));
		box.getChildren().add(write);
		//scene
		Scene scene = new Scene(box, 350,350);
		//display
		primaryStage.setScene(scene);
		primaryStage.setTitle("M11 Prac");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}
}
