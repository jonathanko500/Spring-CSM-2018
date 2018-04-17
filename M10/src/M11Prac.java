import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class M11Prac extends Application
{
	private CheckBox description;
	private Text write;
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
		write = new Text("My lazy and happy dog.");
		write.setFont(Font.font(30));
		box.getChildren().add(write);
		//scene
		Scene scene = new Scene(box, 350,350);
		//checkbox
		description=new CheckBox("Display Description");
		description.setSelected(true);
		description.setOnAction(this::handleDescription);
		box.getChildren().add(description);
		//display
		primaryStage.setScene(scene);
		primaryStage.setTitle("M11 Prac");
		primaryStage.show();
		
	}
	private void handleDescription(ActionEvent event)
	{
		if(description.isSelected())
		{
			write.setVisible(true);
		}
		else if(!description.isSelected())
		{
			write.setVisible(false);
		}
	}
	public static void main(String[] args) {
		launch(args);

	}
}
